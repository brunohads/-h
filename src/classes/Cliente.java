package classes;

import java.util.Date;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 */
public class Cliente {

    private String nome, data1, data2;
    private String endereco, cpf, cartao, tarifacao;
    private Date checkin;
    private Date checkout;
    private String tel, status, codigo, nomecartao;
    private char sexo;
    private double taxa;
    private int dias, mes, ano;
    private int contp, contls, contld, contlt, contes, conted, contet;

    public int getContp() {
        return contp;
    }

    public void setContp(int contp) {
        this.contp = contp;
    }

    public int getContls() {
        return contls;
    }

    public void setContls(int contls) {
        this.contls = contls;
    }

    public int getContld() {
        return contld;
    }

    public void setContld(int contld) {
        this.contld = contld;
    }

    public int getContlt() {
        return contlt;
    }

    public void setContlt(int contlt) {
        this.contlt = contlt;
    }

    public int getContes() {
        return contes;
    }

    public void setContes(int contes) {
        this.contes = contes;
    }

    public int getConted() {
        return conted;
    }

    public void setConted(int conted) {
        this.conted = conted;
    }

    public int getContet() {
        return contet;
    }

    public void setContet(int contet) {
        this.contet = contet;
    }

 
    
    public String getNomecartao() {
        return nomecartao;
    }

    public void setNomecartao(String nomecartao) {
        this.nomecartao = nomecartao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String getTarifacao() {
        return tarifacao;
    }

    public void setTarifacao(String tarifacao) {
        this.tarifacao = tarifacao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
