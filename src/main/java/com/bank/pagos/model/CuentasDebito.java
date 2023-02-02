package com.bank.pagos.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

/**
 *
 * @author FireCode16
 */
@Getter
@Setter
@Entity
@Table(name = "cuentas_debito")
@Where(clause = "estado = 'Activa'")
public class CuentasDebito implements Serializable {

    @Id
    @Column(name = "cliente")
    private Integer cliente;
    @Column(name = "monto")
    private Double monto;
    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "cuentasDebito", cascade = CascadeType.MERGE)
    private List<Prestamos> arrPrestamos;
}
