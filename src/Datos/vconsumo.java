
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

    public void setIdconsumo(int idconsumo) {
        this.idconsumo = idconsumo;
    }

    public int GetIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int GetIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public Double GetCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double GetPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
