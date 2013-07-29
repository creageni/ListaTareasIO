
package listatareasio;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListaTareasIO extends javax.swing.JFrame {
 //Declaramos a datos de tipo HashMap, en cual definimos la clase clave String y la clase valor Actividad
    HashMap<String,Actividad> datos;
    //Clase que nos permite escribir y leer objetos (revisar Clase ActividadIO)
    ActividadIO actividadIO;
    
    //Constructor
    public ListaTareasIO() {
        //Inicializamos a HashMap
        datos= new HashMap();
        //Inicializamos a actividadIO
        actividadIO= new ActividadIO();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fecha = new javax.swing.JTextField();
        actividades = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lugar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nombreA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        direccionA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        notificacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datosA.setColumns(20);
        datosA.setRows(5);
        jScrollPane1.setViewportView(datosA);

        jLabel1.setText("Fecha");

        jLabel2.setText("Actividades");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Leer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Leer Todos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Lugar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Ejercicio XVI");

        jLabel5.setText("Nombre");

        jLabel3.setText("Direccion");

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Abrir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        notificacion.setText("Notificacion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lugar, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(actividades, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(direccionA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(79, 79, 79))))
                    .addComponent(notificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //Metodo que se llama al dar click al boton agregar
      //Obtenemos los campos de los TextField    
        String fString= fecha.getText();
        String aString=actividades.getText();
        String lString= lugar.getText();
        
        //Para Separar la cadena de textode actividades, utilizamos el metodo split el cual me separa el texto y forma un arreglo
        //segun un caracter
        String[] vActividades= aString.split(",");
        //Declaramos el objeto act de la Clase Actividad y la instanciamos con el constructor
        //enviamos los parametros lugar y actividades
        Actividad act= new Actividad(lString, vActividades);
        
        //agregamos la pareja en el HashMap con la clave fString y con el objeto act
       datos.put(fString, act);
       
       //Limpiamos los TextField
       
       fecha.setText("");
       actividades.setText("");
       lugar.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     //Metodo que se llama al dar click al boton leer
     //Obtenemos el campo del TextField fecha  
        
     String fString= fecha.getText();
    
    //Obtenemos el objeto de tipo Actividad con el objeto clave fString y se lo asignamos al objeto a de tipo Actividad
     Actividad a=datos.get(fString);
     
     //Declaramos el String rta y le asignamos la fecha concatenada con el lugar y un salto de linea
     // para obtener el lugar llamamos el metodo getLugar del objeto a de la clase Actividad
     String rta=fString+"->"+a.getLugar()+"\n";
     //Ciclo for para concatenar las Actividades
     //Desde i igual a cero, hasta i menor que el tamaño del arreglo de actividades 
     for(int i=0;i<a.getActividades().length;i++){
         //concatenamos a rta la actividad en la posicion i y le concatenamos un salto de linea
         rta+=a.getActividades()[i]+"\n";
     }
     //Imprimimos en el t}TextArea rta
     datosA.setText(rta);
     
      //Limpiamos elTextField
       
       fecha.setText("");
     
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Metodo que se llama al dar click al boton leer todos
        //Obtenemos el iterador del HashMap datos y lo asignamos al objeto i de la Clase Iterator
        //El iterador nos permitira recorrer las claves del HashMap
        Iterator i= datos.keySet().iterator();
        //Declaramos rta de tipo String para concatenar la informacion de todo le HashMap datos
        String rta="";
        //Preguntamos si existe un elemento siguente al actual en el iterador
        //El ciclo while realizara las iteraciones necesarias hasta que no exista un elemento siguiente
        while(i.hasNext()){
        
            //Obtenemos la clave siguiente y se la asignamos a f
            String f= (String) i.next();
            //Obtenemos el objeto valor del hashmap con la clave f
            Actividad a= datos.get(f);
            
            //Concatenamos la fecha y ele lugar del par de objetos
            rta+=f+"->"+a.getLugar()+"\n";
            //Ciclo For para concatenar todas las actividades en el arreglo para el objeto a de la Clase Actividad
            //Desde j igual a cero hasta j menor al tamaño del arreglo de actividades del objeto a
            //incrementamos j una unidad en cada iteracion
            for(int j=0;j<a.getActividades().length;j++){
                //Concatenamos la actividad en la posicion j y concatenamos un salto de linea
                rta+=a.getActividades()[j]+"\n";
            }
            //Concatenamos al fina un salto de linea para separar cada objeto par
            rta+="\n";
        }
        //Imprimimos rta en el TextField datosA
        datosA.setText(rta);
        
       //Limpiamos los TextField
       
       fecha.setText("");
       actividades.setText("");
       lugar.setText("");
                
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   
        //Metodo que se llama al dar click al boton Guardar
        //Obtenemos los campos de los TextField  direccionA y nombreA  
        String nombre=nombreA.getText();
        String direccion=direccionA.getText();
        try {
              //Guardamos los datos con el objeto de la ActividadIO
              actividadIO.escribirObjeto(datos, direccion, nombre);
              
              //Escibirmos en el label notificacion se guardo correctamente el objeto
              notificacion.setText("Se ha Guardado con Exito !");
        } catch (IOException ex) {
             //Escibirmos en el label notificacion que existio un error al guardar el objeto
             notificacion.setText("Error al Guardar el Objeto");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         //Metodo que se llama al dar click al boton Abrir
        //Obtenemos los campos de los TextField  direccionA y nombreA  
        String nombre=nombreA.getText();
        String direccion=direccionA.getText();
        try {
              //Asignamos a datos el objeto abierto con la clase actividadIO
              datos=actividadIO.leerObjeto(direccion, nombre);
              
              //Escibirmos en el label notificacion se guardo correctamente el objeto
              notificacion.setText("El objeto se ha abierto con Exito !");
        } catch (ClassNotFoundException ex) {
            //Escibirmos en el label notificacion que no existe el archivo
             notificacion.setText("No existe el Archivo");
        } catch (IOException ex) {
             //Escibirmos en el label notificacion que existio un error al guardar el objeto
             notificacion.setText("Error al Abrir el Objeto");
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaTareasIO().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actividades;
    private javax.swing.JTextArea datosA;
    private javax.swing.JTextField direccionA;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lugar;
    private javax.swing.JTextField nombreA;
    private javax.swing.JLabel notificacion;
    // End of variables declaration//GEN-END:variables
}
