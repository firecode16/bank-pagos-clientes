package com.bank.pagos.service;

import com.bank.pagos.model.CuentasDebito;
import com.bank.pagos.repository.PagosRepository;
import static com.bank.pagos.util.Util.PAGADO;
import java.text.DecimalFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author FireCode16
 */
@Service
public class PagosService {

    @Autowired
    private PagosRepository pagosRepository;

    private Double operationPago = 0D;

    @Transactional
    public Double getAplicarPagosPendies() {
        List<CuentasDebito> arrCuentas = (List<CuentasDebito>) pagosRepository.findAll();

        arrCuentas.stream().forEach(modelCuentas -> {
            if (!modelCuentas.getArrPrestamos().isEmpty()) {
                modelCuentas.getArrPrestamos().stream().forEach(modelPrestamos -> {
                    Long plazo = pagosRepository.getPlazo(modelPrestamos.getFecha());
                    Double interes = pagosRepository.getInteres(modelPrestamos.getMonto(), plazo);
                    Double iva = pagosRepository.getIVA(interes);
                    Double pago = pagosRepository.getPago(modelPrestamos.getMonto(), interes, iva);

                    if (modelCuentas.getMonto() > pago) {
                        modelPrestamos.setEstado(PAGADO);

                        operationPago = (modelCuentas.getMonto() - pago);
                        DecimalFormat format = new DecimalFormat("####0.00");
                        Double precision = Double.valueOf(format.format(operationPago));
                        modelCuentas.setMonto(precision);
                    }
                });
            }
        });
        return arrCuentas.stream().map(CuentasDebito::getMonto).findFirst().orElse(Double.NaN);
    }
}
