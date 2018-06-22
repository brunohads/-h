package classes;

import java.util.ArrayList;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 */
public class Contrato {

    private Cliente cliente;

    public Contrato(Cliente cliente) {
        this.cliente = cliente;

    }

    public Cliente getCliente() {
        return cliente;
    }

}
