
package datos;

import java.sql.Date;

public class Vreserva {
    private int idreserva;
    private int idhabitacion;
    private int idcliente;
    private int idtrabajador;
    private String tiporeserva;
    private Date fechareserva;
    private Date fechaingresa;
    private Date fechasalida;
    private Double costoalojamiento;
    private String estado;


    public Vreserva(int idreserva, int idhabitacion, int idcliente, int idtrabajador, String tiporeserva, Date fechareserva, Date fechaingresa, Date fechasalida, Double costoalojamiento, String estado) {
        this.idreserva = idreserva;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.idtrabajador = idtrabajador;
        this.tiporeserva = tiporeserva;
        this.fechareserva = fechareserva;
        this.fechaingresa = fechaingresa;
        this.fechasalida = fechasalida;
        this.costoalojamiento = costoalojamiento;
        this.estado = estado;
    }

    public Vreserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getTiporeserva() {
        return tiporeserva;
    }

    public void setTiporeserva(String tiporeserva) {
        this.tiporeserva = tiporeserva;
    }

    public Date getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(Date fechareserva) {
        this.fechareserva = fechareserva;
    }

    public Date getFechaingresa() {
        return fechaingresa;
    }

    public void setFechaingresa(Date fechaingresa) {
        this.fechaingresa = fechaingresa;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public Double getCostoalojamiento() {
        return costoalojamiento;
    }

    public void setCostoalojamiento(Double costoalojamiento) {
        this.costoalojamiento = costoalojamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
