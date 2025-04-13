import java.util.ArrayList;

public class Autenticacion {

    private static String usuario;
    private static String contrasena;
    private static String rol;
    private static ArrayList<String> administrador1 =new ArrayList<>();
    private ArrayList<String> administrador2 =new ArrayList<>();
    private ArrayList<String> usuario1 =new ArrayList<>();
    private ArrayList<String> usuario2 =new ArrayList<>();
    private static Verificacion datosCache = new Cache();
    private static Verificacion fuerzaBruta = new FuerzaBruta();

    public Autenticacion(String usuario, String contrasena, String rol) {
        Autenticacion.usuario = usuario;
        Autenticacion.contrasena = contrasena;
        Autenticacion.rol = rol;
        administrador1.add("Asamuel");
        administrador1.add("12345");
        administrador2.add("Amono");
        administrador2.add("123");
        usuario1.add("Ualeja");
        usuario1.add("abcde");
        usuario2.add("Uroberto");
        usuario2.add("abc");
    }

    public static void validarUsuario() {
        
        datosCache.verificarDatos(usuario,contrasena,rol);

        if (rol.equals("administrador")) {
            if (usuario.equals(administrador1.get(0)) && contrasena.equals(administrador1.get(1))) {
                System.out.println("Bienvenido Administrador Asamuel");
            } else if (usuario.equals("Amono") && contrasena.equals("123")) {
                System.out.println("Bienvenido Administrador Amono");
            } else {
                fuerzaBruta.verificarDatos(usuario,contrasena,rol);
                System.out.println("Usuario o contraseña incorrectos para administrador.");
            }
        } else if (rol.equals("usuario")) {
            if (usuario.equals("Ualeja") && contrasena.equals("abcde")) {
                System.out.println("Bienvenido Usuario Ualeja");
            } else if (usuario.equals("Uroberto") && contrasena.equals("abc")) {
                System.out.println("Bienvenido Usuario Uroberto");
            } else {
                fuerzaBruta.verificarDatos(usuario,contrasena,rol);
                System.out.println("Usuario o contraseña incorrectos para usuario.");
            }
        } else {
            System.out.println("Rol no reconocido.");
        }
        
    }

}
