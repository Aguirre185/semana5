package edu.ilp.sisgail.entity;
    import javax.persistence.Column;
    import javax.persistence.Entity;
    import javax.persistence.PrimaryKeyJoinColumn;
    import javax.persistence.Table;
    import java.util.Date;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn (referencedColumnName = "IDPERSONA")

public class Docente extends Persona{
    @Column (name = "iddocente")
    private String codigo;

    @Column(name = "cargo")
    private String cargo;

    public Docente() {
    }

    public Docente(String codigo, String cargo) {
        this.codigo = codigo;
        this.cargo = cargo;
    }

    public Docente(Long idpersona, String codigo, String cargo) {
        super(idpersona);
        this.codigo = codigo;
        this.cargo = cargo;
    }

    public Docente(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codigo, String cargo) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigo = codigo;
        this.cargo = cargo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
