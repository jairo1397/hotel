
package Datos;

import java.sql.Date;

public class Vpago {
    private int idpago;
    private int idreserva;
    private String tipo_comprobante;
    private String num_comprobante;
    private Double igv;
    private Double total_pago;
    private Date fecha_emision;
    private Date fecha_pago;


    public Vpago(int idpago, int idreserva, String tipo_comprobante, String num_comprobante, Double igv, Double total_pago, Date fecha_emision, Date fecha_pago) {
        this.idpago = idpago;
        this.idreserva = idreserva;
        this.tipo_comprobante = tipo_comprobante;
        this.num_comprobante = num_comprobante;
        this.igv = igv;
        this.total_pago = total_pago;
        this.fecha_emision = fecha_emision;
        this.fecha_pago = fecha_pago;
    }

    public Vpago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public int GetIdpago() {
        return idpago;
    }

    public void SetIdpago(int idpago) {
        this.idpago = idpago;
    }

    public int GetIdreserva() {
        return idreserva;
    }

    public void SetIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public String GetTipo_comprobante() {
        return tipo_comprobante;
    }

    public void SetTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String GetNum_comprobante() {
        return num_comprobante;
    }

    public void SetNum_comprobante(String num_comprobante) {
        this.num_comprobante = num_comprobante;
    }

    public Double GetIgv() {
        return igv;
    }

    public void SetIgv(Double igv) {
        this.igv = igv;
    }

    public Double GetTotal_pago() {
        return total_pago;
    }

    public void SetTotal_pago(Double total_pago) {
        this.total_pago = total_pago;
    }

    public Date GetFecha_emision() {
        return fecha_emision;
    }

    public void SetFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date GetFecha_pago() {
        return fecha_pago;
    }

    public void SetFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
    
    
    
    
    
}
