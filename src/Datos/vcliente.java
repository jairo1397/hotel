

package Datos;

public class Vcliente extends Vpersona{
    private String codigo_cliente;

    public Vcliente() {
    }

    public Vcliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String GetCodigo_cliente() {
        return codigo_cliente;
    }

    public void SetCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
  
}
