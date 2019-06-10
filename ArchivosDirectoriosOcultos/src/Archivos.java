
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author one
 */
public class Archivos extends javax.swing.JFrame {

    /**
     * Creates new form Archivos
     */
    private File[] archivos;
    
    DefaultListModel modelo;
    DefaultListModel modelo1;
    DefaultListModel modelo2;
    public Archivos() {
        initComponents();
        modelo=new DefaultListModel();
        modelo1=new DefaultListModel();
        modelo2=new DefaultListModel();
        listaDirectorios.setModel(modelo);
        listaArchivos.setModel(modelo1);
        listaOcultos.setModel(modelo2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblRuta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaOcultos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDirectorios = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaArchivos = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rutaAbsoluta = new javax.swing.JTextField();
        ultimaModificacion = new javax.swing.JTextField();
        tamañoKb = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemCrearArchivo = new javax.swing.JMenuItem();
        itemRenombrar = new javax.swing.JMenuItem();
        itemNuevaCarpeta = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemEliminarRecursividad = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ruta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("RUTA:");

        lblRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRutaActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Archivos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("ARCHIVOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("DIRECTORIOS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("OCULTOS");

        listaOcultos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaOcultosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaOcultos);

        listaDirectorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDirectoriosMouseClicked(evt);
            }
        });
        listaDirectorios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaDirectoriosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaDirectorios);

        listaArchivos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaArchivosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaArchivos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("RUTA ABSOLUTA:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("ULTIMA MODIFICACION:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("TAMAÑO EN Kb:");

        rutaAbsoluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaAbsolutaActionPerformed(evt);
            }
        });

        tamañoKb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoKbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rutaAbsoluta)
                    .addComponent(ultimaModificacion)
                    .addComponent(tamañoKb, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rutaAbsoluta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(ultimaModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tamañoKb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu1.setText("Archivo");

        itemCrearArchivo.setText("Crear Archivo");
        itemCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(itemCrearArchivo);

        itemRenombrar.setText("Renombrar ");
        itemRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRenombrarActionPerformed(evt);
            }
        });
        jMenu1.add(itemRenombrar);

        itemNuevaCarpeta.setText("Carpeta Nueva");
        itemNuevaCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevaCarpetaActionPerformed(evt);
            }
        });
        jMenu1.add(itemNuevaCarpeta);

        itemEliminar.setText("Eliminar");
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(itemEliminar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Recursividad");

        itemEliminarRecursividad.setText("EliminarR");
        itemEliminarRecursividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarRecursividadActionPerformed(evt);
            }
        });
        jMenu2.add(itemEliminarRecursividad);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblRutaActionPerformed
        
    }//GEN-LAST:event_lblRutaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        modelo.clear();
        modelo1.clear();
        modelo2.clear();
        File ruta = new File(lblRuta.getText());
        File[] archivos = ruta.listFiles();
        for(File directorio : archivos){
            if(directorio.isDirectory()){
               modelo.addElement(directorio.getName());
                
            } 
            if(directorio.isFile()){
                modelo1.addElement(directorio.getName());
            }
            if(directorio.isHidden()){
                modelo2.addElement(directorio.getName());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rutaAbsolutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaAbsolutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaAbsolutaActionPerformed

    private void tamañoKbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoKbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañoKbActionPerformed

    private void listaArchivosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaArchivosValueChanged
        listaDirectorios.clearSelection();
        listaOcultos.clearSelection();
        
        String seleccion= listaArchivos.getSelectedValue();
        String ruta=lblRuta.getText().trim()+"\\"+seleccion;
        llenaraInformacion(ruta);
        
    }//GEN-LAST:event_listaArchivosValueChanged

    private void listaDirectoriosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaDirectoriosValueChanged
        listaArchivos.clearSelection();
        listaOcultos.clearSelection();
        String seleccion= listaDirectorios.getSelectedValue();
        String ruta=lblRuta.getText().trim()+"\\"+seleccion;
        llenaraInformacion(ruta);
    }//GEN-LAST:event_listaDirectoriosValueChanged

    private void listaOcultosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaOcultosValueChanged
        listaArchivos.clearSelection();
        listaDirectorios.clearSelection();
        String seleccion= listaOcultos.getSelectedValue();
        String ruta=lblRuta.getText().trim()+"\\"+seleccion;
        llenaraInformacion(ruta);
    }//GEN-LAST:event_listaOcultosValueChanged

    private void itemNuevaCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevaCarpetaActionPerformed
        String nombre =JOptionPane.showInputDialog("crear carpeta nueva");
        String carpeta = lblRuta.getText().trim()+"\\"+nombre;
        File carpetaNueva= new File(carpeta);
        if(!carpetaNueva.exists()){
            carpetaNueva.mkdir();
            }else{
                JOptionPane.showMessageDialog(this, "nose pudo crear la carpeta");
            
        }
        btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_itemNuevaCarpetaActionPerformed

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
       boolean archivo=false;
       String seleccionado= null;
       if(!listaArchivos.isSelectionEmpty()){
           seleccionado= listaArchivos.getSelectedValue();
       }else if(!listaDirectorios.isSelectionEmpty()){
           seleccionado= listaDirectorios.getSelectedValue();
       }else if(!listaOcultos.isSelectionEmpty()){
           seleccionado= listaOcultos.getSelectedValue();
       }else{
           JOptionPane.showMessageDialog(this, "no a selecionado ningun archivo");
           archivo= true;
       }
       if(archivo==false){
       String nombre = lblRuta.getText().trim()+"\\"+seleccionado;
       File eliminar= new File(nombre);
       eliminar.delete();
       }
       btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_itemEliminarActionPerformed

    private void itemCrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearArchivoActionPerformed
        String nombre=JOptionPane.showInputDialog("ngrese el nombre del archivo");
        String archivo =lblRuta.getText().trim()+"\\"+nombre;
        File archivoNuevo= new File(archivo);
        if(!archivoNuevo.exists()){
            try{
            archivoNuevo.createNewFile();
            }catch(IOException ex){
                JOptionPane.showMessageDialog(this, "nose pudo crear e archivo");
            }
        }
        btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_itemCrearArchivoActionPerformed

    private void itemRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRenombrarActionPerformed
        String itemSeleccionado = null;
        boolean n=false;
        if(!listaArchivos.isSelectionEmpty()){
            itemSeleccionado= listaArchivos.getSelectedValue();
        }else if(!listaDirectorios.isSelectionEmpty()){
            itemSeleccionado= listaDirectorios.getSelectedValue();
        }else if(!listaOcultos.isSelectionEmpty()){
            itemSeleccionado=listaOcultos.getSelectedValue();
        }else{
            JOptionPane.showMessageDialog(this, "no a selecionado un ningun archivo ");
            n=true;
        }
        
        if(n==false){
        String archivoAntiguo=lblRuta.getText().trim()+"\\"+itemSeleccionado;
        File antiguo= new File(archivoAntiguo);
        String renombrar=JOptionPane.showInputDialog("editar nombre del archivo");
        String ruta= lblRuta.getText().trim()+"\\"+renombrar;
        File renombrarArchivo = new File(ruta);
        
        antiguo.renameTo(renombrarArchivo);
        }
        btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_itemRenombrarActionPerformed

    private void listaDirectoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDirectoriosMouseClicked
        int n= evt.getClickCount();
        if(n==2){
           String nombre= listaDirectorios.getSelectedValue();
           String nuevaRuta= lblRuta.getText().trim()+"\\"+nombre;
           lblRuta.setText(nuevaRuta);
           java.awt.event.ActionEvent evt1;
           evt1=null;
           btnBuscarActionPerformed(evt1);
        }
    }//GEN-LAST:event_listaDirectoriosMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    String nombre= lblRuta.getText().trim();
    for(int i=nombre.length()-1; i>1;i--){
        if((int)nombre.charAt(i)==92){
            String ruta =nombre.substring(0,i);
            lblRuta.setText(ruta);
            btnBuscarActionPerformed(evt);
            break;
        }
    }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void itemEliminarRecursividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarRecursividadActionPerformed
        boolean archivo=false;
       String seleccionado= null;
       if(!listaDirectorios.isSelectionEmpty()){
           seleccionado= listaDirectorios.getSelectedValue();
       }else{
           JOptionPane.showMessageDialog(this, "no a selecionado ningun archivo");
           archivo= true;
       }
       if(archivo==false){
       String nombre = lblRuta.getText().trim()+"\\"+seleccionado;
       File eliminar= new File(nombre);
       eliminar.delete();
       }
       btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_itemEliminarRecursividadActionPerformed
    public String eliminar(String ruta) {
        if (ruta != null) {
            eliminar(hayCarpetas(ruta));
            File folder = new File(ruta);
            for (File file : folder.listFiles()) {
                if (file.isFile())
                    file.delete();
            }
            while (hayCarpetas(ruta) != null) 
                eliminar(hayCarpetas(ruta));
            folder.delete();
            return ruta;
        }
        return ruta;
    }
    public String hayCarpetas(String ruta) {
        File folder = new File(ruta);
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) 
                return file.getPath();
        }
        return null;
    }
     
    public void llenaraInformacion(String ruta){
        File informacion= new File (ruta);
        rutaAbsoluta.setText(ruta);
        
        long ml=informacion.lastModified();
        Date result=new Date(ml);
        SimpleDateFormat simple= new SimpleDateFormat("dd/MM/yyyy");
        String fecha=simple.format(result);        
        
        long tamaño=informacion.length();
        tamaño=tamaño/1024;
        
        ultimaModificacion.setText(fecha);
        tamañoKb.setText(String.valueOf(tamaño)+" KB");  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JMenuItem itemCrearArchivo;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JMenuItem itemEliminarRecursividad;
    private javax.swing.JMenuItem itemNuevaCarpeta;
    private javax.swing.JMenuItem itemRenombrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lblRuta;
    private javax.swing.JList<String> listaArchivos;
    private javax.swing.JList<String> listaDirectorios;
    private javax.swing.JList<String> listaOcultos;
    private javax.swing.JTextField rutaAbsoluta;
    private javax.swing.JTextField tamañoKb;
    private javax.swing.JTextField ultimaModificacion;
    // End of variables declaration//GEN-END:variables
}
