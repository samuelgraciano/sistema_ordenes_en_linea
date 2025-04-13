public class Usuario {   

    public static void login(String usuario, String contrasena, String rol) {
        Encriptar.datosEncriptados(usuario,contrasena,rol); 
        Autenticacion.validarUsuario();      
    }

}
