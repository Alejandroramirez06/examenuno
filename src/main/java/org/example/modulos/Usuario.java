package org.example.modulos;

public class Usuario {
    private Integer id;
    private String documento;
    private String nombres;
    private String correoElectronico;
    private Integer ubicacion;

    public Usuario() {
    }

    public Usuario(Integer id, String documento, String nombres, String correoelectronico, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correoElectronico = correoelectronico;
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }
}
