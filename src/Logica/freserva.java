package logica;
import datos.Vreserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Freserva {
    
   private Conexion mysql=new Conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Idhabitacion","Numero","idcliente","Cliente","idtrabajador","Trabajador","Tipo Reserva","Fecha Reserva","Fecha Ingreso","Fecha Salida","Costo","Estado"};
       
       String [] registro =new String [13];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select r.idreserva,r.idhabitacion,h.numero,r.idcliente,"+
               "(select nombre from persona where idpersona=r.idcliente)as clienten,"+
               "(select apaterno from persona where idpersona=r.idcliente)as clienteap,"+
               "r.idtrabajador,(select nombre from persona where idpersona=r.idtrabajador)as trabajadorn,"+
               "(select apaterno from persona where idpersona=r.idtrabajador)as trabajadorap,"+
               "r.tiporeserva,r.fechareserva,r.fec"
               + "ha_ingresa,r.fechasalida,"+
               "r.costoalojamiento,r.estado from reserva r inner join habitacion h on r.idhabitacion=h.idhabitacion where r.fechareserva like '%"+ buscar + "%' order by idreserva desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idreserva");
               registro [1]=rs.getString("idhabitacion");
               registro [2]=rs.getString("numero");
               registro [3]=rs.getString("idcliente");
               registro [4]=rs.getString("clienten") + " " + rs.getString("clienteap") ;
               registro [5]=rs.getString("idtrabajador");
               registro [6]=rs.getString("trabajadorn") + " " + rs.getString("trabajadorap");
               registro [7]=rs.getString("tiporeserva");
               registro [8]=rs.getString("fechareserva");
               registro [9]=rs.getString("fechaingresa");
               registro [10]=rs.getString("fechasalida");
               registro [11]=rs.getString("costoalojamiento");
               registro [12]=rs.getString("estado");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean insertar (Vreserva dts){
       sSQL="insert into reserva (idhabitacion,idcliente,idtrabajador,tiporeserva,fechareserva,fechaingresa,fechasalida,costoalojamiento,estado)" +
               "values (?,?,?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdhabitacion());
           pst.setInt(2, dts.getIdcliente());
           pst.setInt(3, dts.getIdtrabajador());
           pst.setString(4, dts.getTiporeserva());
           pst.setDate(5, dts.getFechareserva());
           pst.setDate(6, dts.getFechaingresa());
           pst.setDate(7, dts.getFechasalida());
           pst.setDouble(8, dts.getCostoalojamiento());
           pst.setString(9, dts.getEstado());
           
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
   
   public boolean editar (Vreserva dts){
       sSQL="update reserva set idhabitacion=?,idcliente=?,idtrabajador=?,tiporeserva=?,fechareserva=?,fechaingresa=?,fechasalida=?,costoalojamiento=?,estado=?"+
               " where idreserva=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
             pst.setInt(1, dts.getIdhabitacion());
           pst.setInt(2, dts.getIdcliente());
           pst.setInt(3, dts.getIdtrabajador());
           pst.setString(4, dts.getTiporeserva());
           pst.setDate(5, dts.getFechareserva());
           pst.setDate(6, dts.getFechaingresa());
           pst.setDate(7, dts.getFechasalida());
           pst.setDouble(8, dts.getCostoalojamiento());
           pst.setString(9, dts.getEstado());
           
           pst.setInt(10, dts.getIdreserva());
           
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
   
   public boolean pagar (Vreserva dts){
       sSQL="update reserva set estado='Pagada'"+
               " where idreserva=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
             
           
           pst.setInt(1, dts.getIdreserva());
           
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
   
   
   
   
   
  
   public boolean eliminar (Vreserva dts){
       sSQL="delete from reserva where idreserva=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdreserva());
           
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
