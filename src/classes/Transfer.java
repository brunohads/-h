
package classes;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 */
public class Transfer {
    private String transfer="";
    private int valor;
    
    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return   transfer  + "Valor R$: "+valor;
    }

    
}
