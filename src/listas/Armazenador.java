package listas;

import java.util.ArrayList;
import java.util.Date;
import classes.Dados;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 */
public class Armazenador {
    
    private ArrayList<Dados> servico = new ArrayList();
    private ArrayList<Dados> aberto = new ArrayList();
    private ArrayList<Dados> fechado = new ArrayList();
    
    public ArrayList<Dados> retornarLista() {
        return aberto;
    }
    
    public ArrayList<Dados> retornarListaFechado() {
        return fechado;
    }
    
    public boolean addCliente(Dados c) {
        if (aberto.add(c)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean addClienteTodos(Dados c) {
        if (servico.add(c)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void EditarContratos(int p, String nome, char sexo, String cpf, String cartao, String endereco, String in, String out, Date checkin, Date checkout, String tel, String tarifacao, double taxa, int dias, String codigo, int mes, int ano, String nomecartao) {

        aberto.get(p).getContrato().getCliente().setNome(nome);
        aberto.get(p).getContrato().getCliente().setEndereco(endereco);
        aberto.get(p).getContrato().getCliente().setCpf(cpf);
        aberto.get(p).getContrato().getCliente().setCartao(cartao);
        aberto.get(p).getContrato().getCliente().setData1(in);
        aberto.get(p).getContrato().getCliente().setData2(out);
        aberto.get(p).getContrato().getCliente().setTel(tel);
        aberto.get(p).getContrato().getCliente().setTarifacao(tarifacao);
        aberto.get(p).getContrato().getCliente().setTaxa(taxa);
        aberto.get(p).getContrato().getCliente().setCheckin(checkin);
        aberto.get(p).getContrato().getCliente().setCheckout(checkout);
        aberto.get(p).getContrato().getCliente().setDias(dias);
        aberto.get(p).getContrato().getCliente().setCodigo(codigo);
        aberto.get(p).getContrato().getCliente().setMes(mes);
        aberto.get(p).getContrato().getCliente().setAno(ano);
        aberto.get(p).getContrato().getCliente().setNomecartao(nomecartao);
    }
    
    public ArrayList<Dados> getServico() {
        return servico;
    }
    
    public void setServico(ArrayList<Dados> servico) {
        this.servico = servico;
    }
    
    public ArrayList<Dados> getAberto() {
        return aberto;
    }
    
    public void setAberto(ArrayList<Dados> aberto) {
        this.aberto = aberto;
    }
    
    public ArrayList<Dados> getFechado() {
        return fechado;
    }
    
    public void setFechado(ArrayList<Dados> fechado) {
        this.fechado = fechado;
    }
    
}
