package classes;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 */
public class Quarto extends Calcular{


    private int valortotal;
    private String tipo;
 
    
    Presidencial p = new Presidencial();
    LuxoDuplo ld = new LuxoDuplo();
    LuxoTriplo lt = new LuxoTriplo();
    LuxoSimples ls = new LuxoSimples();
    ExecutivoSimples es = new ExecutivoSimples();
    ExecutivoDuplo ed = new ExecutivoDuplo();
    ExecutivoTriplo et = new ExecutivoTriplo();
    
    @Override
    public void ValorTotal(){
        valortotal = p.getValorp()+ls.getValorls()+ld.getValorld()+lt.getValorlt()+es.getValores()+ed.getValored()+et.getValoret();
    }
 
    public String getTipo() {
       tipo = p.getQuartoz()+ls.getQuartoz()+ld.getQuartoz()+lt.getQuartoz()+es.getQuartoz()+ed.getQuartoz()+et.getQuartoz();
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getValortotal() {
        ValorTotal();
        return valortotal;
    }

    public void setValortotal(int valortotal) {
        this.valortotal = valortotal;
    }

    public Presidencial getP() {
        return p;
    }

    public void setP(Presidencial p) {
        this.p = p;
    }

    public LuxoDuplo getLd() {
        return ld;
    }

    public void setLd(LuxoDuplo ld) {
        this.ld = ld;
    }

    public LuxoTriplo getLt() {
        return lt;
    }

    public void setLt(LuxoTriplo lt) {
        this.lt = lt;
    }

    public LuxoSimples getLs() {
        return ls;
    }

    public void setLs(LuxoSimples ls) {
        this.ls = ls;
    }

    public ExecutivoSimples getEs() {
        return es;
    }

    public void setEs(ExecutivoSimples es) {
        this.es = es;
    }

    public ExecutivoDuplo getEd() {
        return ed;
    }

    public void setEd(ExecutivoDuplo ed) {
        this.ed = ed;
    }

    public ExecutivoTriplo getEt() {
        return et;
    }

    public void setEt(ExecutivoTriplo et) {
        this.et = et;
    }

    @Override
    public String toString() {
        return  getTipo() + "  \n" +"Valor Total R$: " + getValortotal();
    }

    

    
    
}
