
package Datos;


public class Vproducto {
    
    
    private int idproducto;
    private String nombre;
    private String descripcion;
    private String unidad_medida;
    private Double precio_venta;


    public Vproducto(int idproducto, String nombre, String descripcion, String unidad_medida, Double precio_venta) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidad_medida = unidad_medida;
        this.precio_venta = precio_venta;
    }

    public Vproducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int GetIdproducto() {
        return idproducto;
    }

    public void SetIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String GetNombre() {
        return nombre;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String GetDescripcion() {
        return descripcion;
    }

    public void SetDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String GetUnidad_medida() {
        return unidad_medida;
    }

    public void SetUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public Double GetPrecio_venta() {
        return precio_venta;
    }

    public void SetPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }
    
    
    
    
    
    
}
