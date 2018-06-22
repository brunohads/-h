package classes;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 */
public class Restaurante extends Calcular {

    private double valortotal;

    SelfService selfService = new SelfService();
    LaCarte laCarte = new LaCarte();
    Drink drink = new Drink();

    @Override
    public void ValorTotal() {
        valortotal = laCarte.getValorRefeicao() + drink.getValorBebida() + selfService.getValorService();
    }

    public double getValortotal() {
        ValorTotal();
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public SelfService getSelfService() {
        return selfService;
    }

    public void setSelfService(SelfService selfService) {
        this.selfService = selfService;
    }

    public LaCarte getLaCarte() {
        return laCarte;
    }

    public void setLaCarte(LaCarte laCarte) {
        this.laCarte = laCarte;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

}
