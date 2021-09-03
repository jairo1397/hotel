package logica;
import datos.Vpago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Fpago {
    
   private Conexion mysql=new Conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Idreserva","Comprobante","Número","Igv","Total","Fecha Emisión","Fecha Pago"};
       
       String [] registro =new String [8];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from pago where idreserva="+ buscar + " order by idpago desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idpago");
               registro [1]=rs.getString("idreserva");
               registro [2]=rs.getString("tipocomprobante");
               registro [3]=rs.getString("numcomprobante");
               registro [4]=rs.getString("igv");
               registro [5]=rs.getString("totalpago");
               registro [6]=rs.getString("fechaemision");
               registro [7]=rs.getString("fechapago");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean insertar (Vpago dts){
       sSQL="insert into pago (idreserva,tipocomprobante,numcomprobante,igv,totalpago,fechaemision,fechapago)" +
               "values (?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdreserva());
           pst.setString(2, dts.getTipocomprobante());
           pst.setString(3, dts.getNumcomprobante());
           pst.setDouble(4, dts.getIgv());
           pst.setDouble(5, dts.getTotalpago());
           pst.setDate(6, dts.getFechaemision());
           pst.setDate(7, dts.getFechapago());
           
           
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
   
   public boolean editar (Vpago dts){
       sSQL="update pago set idreserva=?,tipocomprobante=?,numcomprobante=?,igv=?,totalpago=?,fechaemision=?,fechapago=?"+
               " where idpago=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdreserva());
           pst.setString(2, dts.getTipocomprobante());
           pst.setString(3, dts.getNumcomprobante());
           pst.setDouble(4, dts.getIgv());
           pst.setDouble(5, dts.getTotalpago());
           pst.setDate(6, dts.getFechaemision());
           pst.setDate(7, dts.getFechapago());
           
           pst.setInt(8, dts.getIdpago());
           
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
  
   public boolean eliminar (Vpago dts){
       sSQL="delete from pago where idpago=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdpago());
           
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
