package com.bank.pagos.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author FireCode16
 */
@NoArgsConstructor
@AllArgsConstructor

@EqualsAndHashCode
public class PrestamosIds implements Serializable {

    private static final long serialVersionUID = -1L;

    private Integer cliente;
    private Integer id;
}
