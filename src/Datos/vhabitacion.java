

package Datos;

public class Vhabitacion {
    private int idhabitacion;
    private String numero;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private Double precio_diario;
    private String estado;
    private String tipo_habitacion;

    public Vhabitacion(int idhabitacion, String numero, String piso, String descripcion, String caracteristicas, Double precio_diario, String estado, String tipo_habitacion) {
        this.idhabitacion = idhabitacion;
        this.numero = numero;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precio_diario = precio_diario;
        this.estado = estado;
        this.tipo_habitacion = tipo_habitacion;
    }

    public Vhabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public int GetIdhabitacion() {
        return idhabitacion;
    }

    public void SetIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String GetNumero() {
        return numero;
    }

    public void SetNumero(String numero) {
        this.numero = numero;
    }

    public String GetPiso() {
        return piso;
    }

    public void SetPiso(String piso) {
        this.piso = piso;
    }

    public String GetDescripcion() {
        return descripcion;
    }

    public void SetDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String GetCaracteristicas() {
        return caracteristicas;
    }

    public void SetCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double GetPrecio_diario() {
        return precio_diario;
    }

    public void SetPrecio_diario(Double precio_diario) {
        this.precio_diario = precio_diario;
    }

    public String GetEstado() {
        return estado;
    }

    public void SetEstado(String estado) {
        this.estado = estado;
    }

    public String GetTipo_habitacion() {
        return tipo_habitacion;
    }

    public void SetTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }
    
    
    
    
}
