

package datos;

public class Vcliente extends Vpersona{
    private String codigocliente;

    public Vcliente() {
    }

    public Vcliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }
  
}
