package edu.ilp.sisgail.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "administrativo")
@PrimaryKeyJoinColumn (referencedColumnName = "IDPERSONA")

public class Administrativo extends Persona {

    @Column (name = "codigoadmin")
    private String codigoadmin;

    @Column (name = "cargo")
    private String cargo;

    public Administrativo() {
    }

    public Administrativo(String codigoadmin, String cargo) {
        this.codigoadmin = codigoadmin;
        this.cargo = cargo;
    }

    public Administrativo(Long idpersona, String codigoadmin, String cargo) {
        super(idpersona);
        this.codigoadmin = codigoadmin;
        this.cargo = cargo;
    }

    public Administrativo(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codigoadmin, String cargo) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigoadmin = codigoadmin;
        this.cargo = cargo;
    }

    public String getCodigoadmin() {
        return codigoadmin;
    }

    public void setCodigoadmin(String codigoadmin) {
        this.codigoadmin = codigoadmin;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
