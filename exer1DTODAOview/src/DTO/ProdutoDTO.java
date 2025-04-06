package DTO;

import javax.swing.JOptionPane;

public class ProdutoDTO {
    private String nome;
    private double preco;
    private int qtd;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public ProdutoDTO(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "ProdutoDTO{" + "nome = " + nome + ", preco = " + preco + ", quantidade = " + qtd + '}';
    }
    
    public void listarProdutos(){
        
        JOptionPane.showMessageDialog(null, toString());
    }
    
}
