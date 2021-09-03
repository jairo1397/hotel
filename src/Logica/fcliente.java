package Logica;
import Datos.Vcliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Fcliente {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "Apaterno", "Amaterno", "Doc", "Númeo Documento", "Dirección", "Teléfono", "Email", "Código"};

        String[] registro = new String[10];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idpersona,p.nombre,p.apaterno,p.amaterno,p.tipo_documento,p.num_documento,"
                + "p.direccion,p.telefono,p.email,c.codigo_cliente from persona p inner join cliente c "
                + "on p.idpersona=c.idpersona where num_documento like '%"
                + buscar + "%' order by idpersona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apaterno");
                registro[3] = rs.getString("amaterno");
                registro[4] = rs.getString("tipo_documento");
                registro[5] = rs.getString("num_documento");
                registro[6] = rs.getString("direccion");
                registro[7] = rs.getString("telefono");
                registro[8] = rs.getString("email");
                registro[9] = rs.getString("codigo_cliente");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Vcliente dts) {
        sSQL = "insert into persona (nombre,apaterno,amaterno,tipo_documento,num_documento,direccion,telefono,email)"
                + "values (?,?,?,?,?,?,?,?)";
        sSQL2 = "insert into cliente (idpersona,codigo_cliente)"
                + "values ((select idpersona from persona order by idpersona desc limit 1),?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.GetNombre());
            pst.setString(2, dts.GetApaterno());
            pst.setString(3, dts.GetAmaterno());
            pst.setString(4, dts.GetTipo_documento());
            pst.setString(5, dts.GetNum_documento());
            pst.setString(6, dts.GetDireccion());
            pst.setString(7, dts.GetTelefono());
            pst.setString(8, dts.GetEmail());

            pst2.setString(1, dts.GetCodigo_cliente());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Vcliente dts) {
        sSQL = "update persona set nombre=?,apaterno=?,amaterno=?,tipo_documento=?,num_documento=?,"
                + " direccion=?,telefono=?,email=? where idpersona=?";
        
        sSQL2 = "update cliente set codigo_cliente=?"
                + " where idpersona=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.GetNombre());
            pst.setString(2, dts.GetApaterno());
            pst.setString(3, dts.GetAmaterno());
            pst.setString(4, dts.GetTipo_documento());
            pst.setString(5, dts.GetNum_documento());
            pst.setString(6, dts.GetDireccion());
            pst.setString(7, dts.GetTelefono());
            pst.setString(8, dts.GetEmail());
            pst.setInt(9, dts.GetIdpersona());

            pst2.setString(1, dts.GetCodigo_cliente());
            pst2.setInt(2, dts.GetIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Vcliente dts) {
        sSQL = "delete from cliente where idpersona=?";
        sSQL2 = "delete from persona where idpersona=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            
            pst.setInt(1, dts.GetIdpersona());

            
            pst2.setInt(1, dts.GetIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } 
                    return false;
                

            } 
                return false;
            

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
