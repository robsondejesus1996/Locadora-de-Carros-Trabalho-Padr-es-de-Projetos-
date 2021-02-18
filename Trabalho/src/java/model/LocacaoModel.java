/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Robson de Jesus
 */
public class LocacaoModel {
    
    
    private int codigolocacao;
    private int quilometragem_saida;
    private int quilometragem_retorno;
    private Date data_locacao;
    private Date data_devolucao;
    private String status;
    private int codigocliente;
    private int codigocarro;

    public LocacaoModel() {
    }

    public LocacaoModel(int codigolocacao, int quilometragem_saida, int quilometragem_retorno, Date data_locacao, Date data_devolucao, String status, int codigocliente, int codigocarro) {
        this.codigolocacao = codigolocacao;
        this.quilometragem_saida = quilometragem_saida;
        this.quilometragem_retorno = quilometragem_retorno;
        this.data_locacao = data_locacao;
        this.data_devolucao = data_devolucao;
        this.status = status;
        this.codigocliente = codigocliente;
        this.codigocarro = codigocarro;
    }

    @Override
    public String toString() {
        return "LocacaoModel{" + "codigolocacao=" + codigolocacao + ", quilometragem_saida=" + quilometragem_saida + ", quilometragem_retorno=" + quilometragem_retorno + ", data_locacao=" + data_locacao + ", data_devolucao=" + data_devolucao + ", status=" + status + ", codigocliente=" + codigocliente + ", codigocarro=" + codigocarro + '}';
    }

    public int getCodigolocacao() {
        return codigolocacao;
    }

    public void setCodigolocacao(int codigolocacao) {
        this.codigolocacao = codigolocacao;
    }

    public int getQuilometragem_saida() {
        return quilometragem_saida;
    }

    public void setQuilometragem_saida(int quilometragem_saida) {
        this.quilometragem_saida = quilometragem_saida;
    }

    public int getQuilometragem_retorno() {
        return quilometragem_retorno;
    }

    public void setQuilometragem_retorno(int quilometragem_retorno) {
        this.quilometragem_retorno = quilometragem_retorno;
    }

    public Date getData_locacao() {
        return data_locacao;
    }

    public void setData_locacao(Date data_locacao) {
        this.data_locacao = data_locacao;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(int codigocliente) {
        this.codigocliente = codigocliente;
    }

    public int getCodigocarro() {
        return codigocarro;
    }

    public void setCodigocarro(int codigocarro) {
        this.codigocarro = codigocarro;
    }
    
    
    

    
    
    
    
    
    
}
