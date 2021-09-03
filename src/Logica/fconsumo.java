package logica;
import datos.Vconsumo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Fconsumo {
    
   private Conexion mysql=new Conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   public Double totalconsumo;
   
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","idreserva","idproducto","producto","cantidad","Precio Venta","Estado"};
       
       String [] registro =new String [7];
       
       totalregistros=0;
       totalconsumo=0.0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select c.idconsumo,c.idreserva,c.idproducto,p.nombre,c.cantidad,c.precioventa "
               + ",c.estado from consumo c inner join producto p on c.idproducto=p.idproducto"
               + " where c.idreserva ="+ buscar + " order by c.idconsumo desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idconsumo");
               registro [1]=rs.getString("idreserva");
               registro [2]=rs.getString("idproducto");
               registro [3]=rs.getString("nombre");
               registro [4]=rs.getString("cantidad");
               registro [5]=rs.getString("precioventa");
               registro [6]=rs.getString("estado");
               
               totalregistros=totalregistros+1;
               totalconsumo=totalconsumo + (rs.getDouble("cantidad") * rs.getDouble("precioventa") );
               
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean insertar (Vconsumo dts){
       sSQL="insert into consumo (idreserva,idproducto,cantidad,precioventa,estado)" +
               "values (?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdreserva());
           pst.setInt(2, dts.getIdproducto());
           pst.setDouble(3, dts.getCantidad());
           pst.setDouble(4, dts.getPrecioventa());
           pst.setString(5, dts.getEstado());
           
           
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
   
   public boolean editar (Vconsumo dts){
       sSQL="update consumo set idreserva=?,idproducto=?,cantidad=?,precioventa=?,estado=?"+
               " where idconsumo=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdreserva());
           pst.setInt(2, dts.getIdproducto());
           pst.setDouble(3, dts.getCantidad());
           pst.setDouble(4, dts.getPrecioventa());
           pst.setString(5, dts.getEstado());
           
           pst.setInt(6, dts.getIdconsumo());
           
           int n=pst.executeUpdate();
           
           return  n!=0;


           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
  
   public boolean eliminar (Vconsumo dts){
       sSQL="delete from consumo where idconsumo=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdconsumo());
           
           int n=pst.executeUpdate();
           
           return  n!=0;

           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
    
    
    
    
    
}
