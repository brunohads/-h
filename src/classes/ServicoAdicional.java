package classes;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 */
public class ServicoAdicional {

    private double valortotal;

    AluguelDeCarro ac = new AluguelDeCarro();
    BabySitter bs = new BabySitter();
    Massagem mas = new Massagem();
    ConteudoExclusivo ce = new ConteudoExclusivo();
    Restaurante r = new Restaurante();
    PlayGround pg = new PlayGround();
    Transfer trans = new Transfer();

    public AluguelDeCarro getAc() {
        return ac;
    }

    public void setAc(AluguelDeCarro ac) {
        this.ac = ac;
    }

    public BabySitter getBs() {
        return bs;
    }

    public void setBs(BabySitter bs) {
        this.bs = bs;
    }

    public Massagem getMas() {
        return mas;
    }

    public void setMas(Massagem mas) {
        this.mas = mas;
    }

    public ConteudoExclusivo getCe() {
        return ce;
    }

    public void setCe(ConteudoExclusivo ce) {
        this.ce = ce;
    }

    public Restaurante getR() {
        return r;
    }

    public void setR(Restaurante r) {
        this.r = r;
    }

    public PlayGround getPg() {
        return pg;
    }

    public void setPg(PlayGround pg) {
        this.pg = pg;
    }

    public Transfer getTrans() {
        return trans;
    }

    public void setTrans(Transfer trans) {
        this.trans = trans;
    }

    public double getValortotal() {
        valortotal = ac.getValor() + bs.getValorbaba() + r.getValortotal() + mas.getValormas() + ce.getValorce() + pg.getValorpg() + trans.getValor();
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

}
