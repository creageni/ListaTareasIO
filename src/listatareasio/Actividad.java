
package listatareasio;

//Clase Actividad
public class Actividad {
    //Atributos
    String lugar;
    String[] actividades;
    //Constructor sin argumentos
    public Actividad() {
    }
    //Constructor con argumentos, que instancia cada atributo con los argumentos de entrada
    public Actividad(String lugar, String[] actividades) {
        this.lugar = lugar;
        this.actividades = actividades;
    }
    //Getters, Metodos para obtener los Atributos
    public String getLugar() {
        return lugar;
    }

    public String[] getActividades() {
        return actividades;
    }
    //Setters, Metodos para configurar-modificar los Atributos
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setActividades(String[] actividades) {
        this.actividades = actividades;
    }

    
    
    
}
