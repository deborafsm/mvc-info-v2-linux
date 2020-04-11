/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.InfoPie.model.beans;



/**
 *
 * @author DeboraDev
 */
public class OrdemServico extends Equipamentos{
    private int idOrdemServico;
    private String equipamento;
    private String defeito;
    private String servico;
    private String situacao;
    private String tecnico;
    private double valor ;
    private Cliente cliente;
    private Equipamentos equipamentos;

    public OrdemServico() {
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public OrdemServico(int id_equipamento, String marca, String modelo, String numeroSerie, String sistemaOp, String ano, String defeito, String observacao, Cliente cliente, OrdemServico os, String tipo) {
        super(id_equipamento, marca, modelo, numeroSerie, sistemaOp, ano, defeito, observacao, cliente, os, tipo);
    }

    public OrdemServico(int idOrdemServico, String equipamento, String defeito, String servico, String situacao, String tecnico, double valor, Cliente cliente, Equipamentos equipamentos) {
        this.idOrdemServico = idOrdemServico;
        this.equipamento = equipamento;
        this.defeito = defeito;
        this.servico = servico;
        this.situacao = situacao;
        this.tecnico = tecnico;
        this.valor = valor;
        this.cliente = cliente;
        this.equipamentos = equipamentos;
    }

   
    
    
    public Equipamentos getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(Equipamentos equipamentos) {
        this.equipamentos = equipamentos;
    }

    
    
    
    public int getIdOrdemServico() {
        return idOrdemServico;
    }

    public void setIdOrdemServico(int idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEquipamento(Equipamentos eq) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
         
}
