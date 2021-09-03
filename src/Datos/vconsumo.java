
package Datos;

public class Vconsumo {
    private int idconsumo;
    private int idreserva;
    private int idproducto;
    private Double cantidad;
    private Double precio_venta;
    private String estado;



    public Vconsumo(int idconsumo, int idreserva, int idproducto, Double cantidad, Double precio_venta, String estado) {
        this.idconsumo = idconsumo;
        this.idreserva = idreserva;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
        this.estado = estado;
    }

    public Vconsumo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int GetIdconsumo() {
        return idconsumo;
    }

    public void SetIdconsumo(int idconsumo) {
        this.idconsumo = idconsumo;
    }

    public int GetIdreserva() {
        return idreserva;
    }

    public void SetIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int GetIdproducto() {
        return idproducto;
    }

    public void SetIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public Double GetCantidad() {
        return cantidad;
    }

    public void SetCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double GetPrecio_venta() {
        return precio_venta;
    }

    public void SetPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String GetEstado() {
        return estado;
    }

    public void SetEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
