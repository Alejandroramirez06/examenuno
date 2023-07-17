package org.example.validacion;

import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    protected Util util=new Util();

    public UsuarioValidacion() {
    }

    //metodos ordinarios para validar datos
    public Boolean validarNombre(String nombres) throws Exception {
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!util.bucarCoincidencia(expresionRegular,nombres)){
            throw new Exception("Señor usuario su nombre solo puede tener letras ");
        } else if (nombres.length() < 10) {
            throw new Exception("Señor usuario revise la cantidad de caracteres es muy pequeña");
        } else {
            return true;
        }

    }

    public Boolean validarCorreo(String correoElectronico) throws Exception {
        String expresionRegular = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!util.bucarCoincidencia(expresionRegular,correoElectronico)) { // si no hay coincidencia
            throw new Exception("Señor usuario el correo ingresado no es valido");
        } else {
            return true;
        }

    }

    public Boolean validarUbicacion(Integer ubicacion) throws Exception{
        if (ubicacion.equals(1)||ubicacion.equals(2)||ubicacion.equals(3)||ubicacion.equals(4)){
            return true;
        } else{
            return false;
        }

    }
}
