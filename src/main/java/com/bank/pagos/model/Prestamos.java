package com.bank.pagos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "prestamos")
@IdClass(PrestamosIds.class)
@Where(clause = "estado = 'Pendiente'")
public class Prestamos implements Serializable {

    @Id
    @Column(name = "cliente")
    private Integer cliente;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "monto")
    private Double monto;
    @Column(name = "estado")
    private String estado;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente", referencedColumnName = "cliente", insertable = false, updatable = false)
    private CuentasDebito cuentasDebito;
}
