package com.bank.pagos.controller;

import com.bank.pagos.response.PagosResponse;
import com.bank.pagos.service.PagosService;
import static com.bank.pagos.util.Util.OK_RESPONSE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author FireCode16
 */
@RestController
@CrossOrigin
public class PagosController {

    @Autowired
    private PagosService pagosService;

    @GetMapping(value = "/getPagar")
    public PagosResponse getAplicarPagosPendies() {
        return new PagosResponse(OK_RESPONSE, pagosService.getAplicarPagosPendies());
    }
}
