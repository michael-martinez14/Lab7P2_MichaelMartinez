/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_michaelmartinez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michael Martínez
 */
public class adminPrograma {
    private ArrayList<Producto> listaProductos=new ArrayList();
    private File archivo=null;

    
    public adminPrograma(String path) {
        archivo = new File(path);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminPrograma{" + "listaProductos=" + listaProductos + ", archivo=" + archivo + '}';
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Producto p : listaProductos) {
                bw.write(p.getId() + ","); 
                bw.write(p.getNombre() + ",");
                bw.write(p.getCategory() + ",");
                bw.write(p.getPrecio() + ",");
                bw.write(p.getAisle()+ ",");
                bw.write(p.getBin()+ ",");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() throws IOException {
        //Scanner sc = null;
        FileReader fr=null;
        BufferedReader br=null;
        if (archivo.exists()) {
            try {
                fr=new FileReader(archivo);
                br=new BufferedReader(fr);
                String linea="";
                while ((linea=br.readLine()) !=null) {
                    String []token =linea.split(",");
                    listaProductos.add(new Producto(Integer.parseInt(token[0]),Integer.parseInt(token[1]),
                            Integer.parseInt(token[2]),Integer.parseInt(token[3]),token[4],Double.parseDouble(token[5])));
                }
                
//                sc = new Scanner(archivo);
//                sc.useDelimiter(",");
//                while (sc.hasNext()) {
//                    listaProductos.add(new Producto(sc.nextInt(),
//                                    sc.nextInt(),
//                                    sc.nextInt(),sc.nextInt(),sc.next(),sc.nextDouble()
//                                 )
//                    );
//                    
//                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            //sc.close();
            br.close();
            fr.close();
        }else{
            System.out.println("El archivo no existe");
        }
            
    }
    
            
}
