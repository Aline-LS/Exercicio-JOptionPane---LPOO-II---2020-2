/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadecnh;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class IdadeCNH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  String name;
  int idade;
  
        name  = JOptionPane.showInputDialog(null,"Qual o seu nome?");
    
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade: "));
   
    
    if (idade >= 18){
     
        JOptionPane.showMessageDialog(null, name+ "\n"+  " Você já pode tirar CNH!");
    } else{
        JOptionPane.showMessageDialog(null, name + "\n"+ " Você ainda não pode tirar CNH, você tem apenas " + idade + " anos!");
    }
    
      
    }
    
}
