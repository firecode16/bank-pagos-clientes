package com.bank.pagos.repository;

import com.bank.pagos.model.CuentasDebito;
import com.bank.pagos.util.Util;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FireCode16
 */
@Repository
public interface PagosRepository extends CrudRepository<CuentasDebito, Object> {

    default Long getPlazo(String fecha) {
        LocalDate currentlyDate = LocalDate.parse(Util.FECHA_ACTUAL, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate evalDate = LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);
        return ChronoUnit.DAYS.between(evalDate, currentlyDate);
    }

    default Double getInteres(Double monto, Long plazo) {
        Double result = (monto * plazo * Util.TASA_INTERES / Util.DIAS_YEAR_COMERCIAL);
        DecimalFormat format = new DecimalFormat("####0.00");
        Double precision = Double.valueOf(format.format(result));
        return precision;
    }

    default Double getIVA(Double interes) {
        Double result = interes * Util.TASA_IVA;
        DecimalFormat format = new DecimalFormat("####0.00");
        Double precision = Double.valueOf(format.format(result));
        return precision;
    }

    default Double getPago(Double monto, Double interes, Double iva) {
        Double result = monto + interes + iva;
        DecimalFormat format = new DecimalFormat("####0.00");
        Double precision = Double.valueOf(format.format(result));
        return precision;
    }
}
