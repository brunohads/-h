package classes;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 */
public class Dados extends Calcular {

    private Contrato contrato;
    private Quarto quarto;
    private ServicoAdicional servicoadd;
    private double valor;

    public Dados(Contrato contrato, Quarto quarto, ServicoAdicional servicoadd) {
        this.contrato = contrato;
        this.quarto = quarto;
        this.servicoadd = servicoadd;
    }

    @Override
    public void ValorTotal() {
        valor = ((((quarto.getValortotal()) * contrato.getCliente().getDias()) + servicoadd.getValortotal())) * contrato.getCliente().getTaxa();
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public ServicoAdicional getServicoadd() {
        return servicoadd;
    }

    public double getValor() {
        ValorTotal();
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
