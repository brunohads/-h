
package classes;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 */
public class AluguelDeCarro {
       
       private String carro="";
       private int valor=0;
  
    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " " + carro+ " " + "  " + valor;
    }

    
    
    
    
}
