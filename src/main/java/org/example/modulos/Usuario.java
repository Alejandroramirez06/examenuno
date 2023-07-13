package org.example.modulos;

import org.example.validacion.UsuarioValidacion;

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
    private UsuarioValidacion validacion= new UsuarioValidacion();


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
        try{
            this.validacion.validarNombre(nombres);
            this.nombres= nombres;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        try {
            this.validacion.validarCorreo(correoElectronico);
            this.correoElectronico= correoElectronico;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try {
            this.validacion.validarUbicacion(ubicacion); //si se cumplen las validaciones son ok
            this.ubicacion= ubicacion;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
