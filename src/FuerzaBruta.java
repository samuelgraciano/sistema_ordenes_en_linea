public class FuerzaBruta implements Verificacion {

    private Integer intentosFallidos = 0;
    private static final int MAX_INTENTOS = 3;

    @Override
    public void verificarDatos(String usuario, String contrasena, String rol) {
        System.out.println("Verificando datos en fuerza bruta..." + " " + usuario + " " + contrasena + " " + rol);
        intentosFallidos++;
        if (intentosFallidos > MAX_INTENTOS) {
            System.out.println("Se han alcanzado el número máximo de intentos fallidos. Bloqueando acceso.");
            // Aquí puedes agregar lógica para bloquear el acceso o tomar otras acciones necesarias.
        } else {
            System.out.println("Intento fallido: " + intentosFallidos + "/" + MAX_INTENTOS);
        }
    }

}
