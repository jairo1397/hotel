
package Datos;

import java.sql.Date;

public class Vreserva {
    private int idreserva;
    private int idhabitacion;
    private int idcliente;
    private int idtrabajador;
    private String tipo_reserva;
    private Date fecha_reserva;
    private Date fecha_ingresa;
    private Date fecha_salida;
    private Double costo_alojamiento;
    private String estado;


    public Vreserva(int idreserva, int idhabitacion, int idcliente, int idtrabajador, String tipo_reserva, Date fecha_reserva, Date fecha_ingresa, Date fecha_salida, Double costo_alojamiento, String estado) {
        this.idreserva = idreserva;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.idtrabajador = idtrabajador;
        this.tipo_reserva = tipo_reserva;
        this.fecha_reserva = fecha_reserva;
        this.fecha_ingresa = fecha_ingresa;
        this.fecha_salida = fecha_salida;
        this.costo_alojamiento = costo_alojamiento;
        this.estado = estado;
    }

    public Vreserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int GetIdreserva() {
        return idreserva;
    }

    public void SetIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int GetIdhabitacion() {
        return idhabitacion;
    }

    public void SetIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public int GetIdcliente() {
        return idcliente;
    }

    public void SetIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int GetIdtrabajador() {
        return idtrabajador;
    }

    public void SetIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String GetTipo_reserva() {
        return tipo_reserva;
    }

    public void SetTipo_reserva(String tipo_reserva) {
        this.tipo_reserva = tipo_reserva;
    }

    public Date GetFecha_reserva() {
        return fecha_reserva;
    }

    public void SetFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public Date GetFecha_ingresa() {
        return fecha_ingresa;
    }

    public void SetFecha_ingresa(Date fecha_ingresa) {
        this.fecha_ingresa = fecha_ingresa;
    }

    public Date GetFecha_salida() {
        return fecha_salida;
    }

    public void SetFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Double GetCosto_alojamiento() {
        return costo_alojamiento;
    }

    public void SetCosto_alojamiento(Double costo_alojamiento) {
        this.costo_alojamiento = costo_alojamiento;
    }

    public String GetEstado() {
        return estado;
    }

    public void SetEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
