/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ESTACION
 */
@WebService(serviceName = "Login")
public class Login {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "VerificacionLogueo")
    public boolean VerificacionLogueo(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrasena") String Contrasena) {
        HashMap<String, String> Usuarios = new HashMap<String, String>();
        Usuarios.put("Loucas", "123456");
        Usuarios.put("Erick", "789456");
        if (Usuarios.containsKey(Usuario)) {
            if ((Usuarios.get(Usuario).compareTo(Contrasena) == 0)) {
                return true;
            }
        }
        return false;
    }
}
