public class Encriptar {

    static Autenticacion autenticacion;

    public static void datosEncriptados(String usuario, String contrasena, String rol) {        

        if (rol.equals("administrador")) {
            usuario = "A" + usuario;        
            autenticacion = new Autenticacion(usuario, contrasena, rol);
            
        } else if (rol.equals("usuario")) {
            usuario = "U" + usuario;        
            autenticacion = new Autenticacion(usuario, contrasena, rol);           

        }
    }
        

}
