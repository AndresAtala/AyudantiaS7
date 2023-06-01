public class agenteDeViajes {
    private String nombre;
    private String especialidad;
    private int experiencia;

    public agenteDeViajes(String nombre, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }
}
