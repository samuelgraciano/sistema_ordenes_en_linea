public class Cache implements Verificacion {

    @Override
    public void verificarDatos(String usuario, String contrasena, String rol) {
        System.out.println("Verificando datos en caché..."+" "+usuario+" "+contrasena+" "+rol);
    }

}
