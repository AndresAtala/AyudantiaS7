public class cliente {
    private String nombre;
    private String direccion;
    private int edad;
    private int presupuestoEnDolares;

    public cliente(String nombre, String direccion, int edad, int presupuestoEnDolares) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int GetPresupuestoEnDolares(){
        return presupuestoEnDolares;
    }
    public void setPresupuestoEnDolares(int presupuestoEnDolares){
        this.presupuestoEnDolares = presupuestoEnDolares;
    }
}
