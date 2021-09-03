
package Datos;

public class Vpersona {
    private int idpersona;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String telefono;
    private String email;

    public Vpersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Vpersona(int idpersona, String nombre, String apaterno, String amaterno, String tipo_documento, String num_documento, String direccion, String telefono, String email) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int GetIdpersona() {
        return idpersona;
    }

    public void SetIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String GetNombre() {
        return nombre;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String GetApaterno() {
        return apaterno;
    }

    public void SetApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String GetAmaterno() {
        return amaterno;
    }

    public void SetAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String GetTipo_documento() {
        return tipo_documento;
    }

    public void SetTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String GetNum_documento() {
        return num_documento;
    }

    public void SetNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String GetDireccion() {
        return direccion;
    }

    public void SetDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String GetTelefono() {
        return telefono;
    }

    public void SetTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String GetEmail() {
        return email;
    }

    public void SetEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
