
package listatareasio;

import java.io.*;
import java.util.HashMap;

//Clase para escribir y leer objetos de tipo HashMap<String, Actividad>
public class ActividadIO {
    //Constructor vacio
    public ActividadIO(){
    
    }
   //Metodo para escribir un Objeto
    //Visibilidad public, Retorno: void(no retorno), Nombre:escribirObjetos
    //Argumetos_
    //  datos de tipo HashMap<String, Actividad>, objeto a escribir
    //  direccion de tipo String, direccion o patch del archvio
    //  nombre de tipo String, nombre del archivo
   //El metodo Lanza(throws) la excepcion IOExeception, necesaria para instanciar los OutputStream 
    public void escribirObjeto(HashMap<String, Actividad> datos, String direccion, String nombre) throws IOException{
        
        //Objeto file de tipo File que describe el archivo
        File file=new File(direccion, nombre); 
        //Creamos un FileOutputStream con el objeto file
        FileOutputStream fileOutputStream= new FileOutputStream(file);
       //Creamos e isntanciamos un objeto de tipo ObjectOutoutStream con fileOutputStream
        //El objeto nos permitira escribir el objetgo en el disco con la direccion y nombre establecidos en el objeto file
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        //Escribimos el Objeto     
        objectOutputStream.writeObject(datos);
        //Cerramos el objectOutputStream
        objectOutputStream.close();
        
       
        
    }
    //Metodo para Leer un Objeto
    //Visibilidad public, Retorno: HashMap<String, Actividad> , Nombre:leerObjetos
    //Argumetos_
    //  direccion de tipo String, direccion o patch del archvio
    //  nombre de tipo String, nombre del archivo
   //El metodo Lanza(throws) la excepcion IOExeception, necesaria para declarar e instanciar los OutputStream 
    // y la excepcion ClassNotFoundException para cuando no se puede realizar el cast o no se encuentra el objeto
    public HashMap<String, Actividad> leerObjeto(String direccion, String nombre) throws IOException, ClassNotFoundException{
        //Declaramos un objeto de tipo HashMap<String,Actividad> para asignarle el objeto que leeamos
        HashMap<String,Actividad> datos;
        //Objeto file de tipo File que describe el archivo
        File file=new File(direccion, nombre); 
        //Creamos un FileInputStream con el objeto file
        FileInputStream fileInputStream= new FileInputStream(file);
        //Creamos e isntanciamos un objeto de tipo ObjectInputStream con fileInputStream
        //El objeto nos permitira leerel objetgo en el disco con la direccion y nombre establecidos en el objeto file
        ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
        //Leemos el objeto y realizamos el cast para asignarselo a datos     
        datos=(HashMap<String, Actividad>) objectInputStream.readObject();
        //Cerramos el objectInputStream
        objectInputStream.close();
        //retornamos el objeto
        return datos;
    }
    
    
}
