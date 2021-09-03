

package Datos;

public class Vtrabajador extends Vpersona{
     Double sueldo;
     String acceso;
     String login;
     String password;
     String estado;



    public Vtrabajador(Double sueldo, String acceso, String login, String password, String estado) {
        this.sueldo = sueldo;
        this.acceso = acceso;
        this.login = login;
        this.password = password;
        this.estado = estado;
    }

    public Vtrabajador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Double GetSueldo() {
        return sueldo;
    }

    public void SetSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String GetAcceso() {
        return acceso;
    }

    public void SetAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String GetLogin() {
        return login;
    }

    public void SetLogin(String login) {
        this.login = login;
    }

    public String GetPassword() {
        return password;
    }

    public void SetPassword(String password) {
        this.password = password;
    }

    public String GetEstado() {
        return estado;
    }

    public void SetEstado(String estado) {
        this.estado = estado;
    }
     
     
     
}
