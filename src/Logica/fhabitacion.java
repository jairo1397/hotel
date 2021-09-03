package logica;
import datos.Vhabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Fhabitacion {
    
   private Conexion mysql=new Conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Número","Piso","Descripción","Caracteristicas","Precio","Estado","Tipo habitación"};
       
       String [] registro =new String [8];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from habitacion where piso like '%"+ buscar + "%' order by idhabitacion";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idhabitacion");
               registro [1]=rs.getString("numero");
               registro [2]=rs.getString("piso");
               registro [3]=rs.getString("descripcion");
               registro [4]=rs.getString("caracteristicas");
               registro [5]=rs.getString("preciodiario");
               registro [6]=rs.getString("estado");
               registro [7]=rs.getString("tipohabitacion");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
     } 
   
   
   public DefaultTableModel mostrarvista(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Número","Piso","Descripción","Caracteristicas","Precio","Estado","Tipo habitación"};
       
       String [] registro =new String [8];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from habitacion where piso like '%"+ buscar + "%' and estado='Disponible' order by idhabitacion";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idhabitacion");
               registro [1]=rs.getString("numero");
               registro [2]=rs.getString("piso");
               registro [3]=rs.getString("descripcion");
               registro [4]=rs.getString("caracteristicas");
               registro [5]=rs.getString("preciodiario");
               registro [6]=rs.getString("estado");
               registro [7]=rs.getString("tipohabitacion");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
     } 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public boolean insertar (Vhabitacion dts){
       sSQL="insert into habitacion (numero,piso,descripcion,caracteristicas,preciodiario,estado,tipohabitacion)" +
               "values (?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNumero());
           pst.setString(2, dts.getPiso());
           pst.setString(3, dts.getDescripcion());
           pst.setString(4, dts.getCaracteristicas());
           pst.setDouble(5, dts.getPreciodiario());
           pst.setString(6, dts.getEstado());
           pst.setString(7, dts.getTipohabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }

               return false;

           
           
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   public boolean editar (Vhabitacion dts){
       sSQL="update habitacion set numero=?,piso=?,descripcion=?,caracteristicas=?,preciodiario=?,estado=?,tipohabitacion=?"+
               " where idhabitacion=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNumero());
           pst.setString(2, dts.getPiso());
           pst.setString(3, dts.getDescripcion());
           pst.setString(4, dts.getCaracteristicas());
           pst.setDouble(5, dts.getPreciodiario());
           pst.setString(6, dts.getEstado());
           pst.setString(7, dts.getTipohabitacion());
           pst.setInt(8, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }

               return false;

           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  
   public boolean desocupar (Vhabitacion dts){
       sSQL="update habitacion set estado='Disponible'"+
               " where idhabitacion=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }

               return false;

           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  
   
   public boolean ocupar (Vhabitacion dts){
       sSQL="update habitacion set estado='Ocupado'"+
               " where idhabitacion=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }

               return false;

           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  
   
   
   
   public boolean eliminar (Vhabitacion dts){
       sSQL="delete from habitacion where idhabitacion=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }

               return false;

           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
  
   
   
  
   
    
    
}
