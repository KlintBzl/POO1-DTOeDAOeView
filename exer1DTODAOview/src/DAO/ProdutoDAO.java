package DAO;

import DTO.ProdutoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
     ArrayList<Object> listaProdutos = new ArrayList();

    public void adicionarProduto(ProdutoDTO p){
            listaProdutos.add(p);
            
    }
    
}