/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradesafio;
import javax.swing.JOptionPane;  
        
        
/**
 *
 * @author pauca
 */
public class CalculadoraDesafio {

    static Double Soma(Double v1, Double v2){
        return (v1 + v2);
    }
    
    static Double Subtrai(Double v1, Double v2){
        return (v1 - v2);
    }
    
    static Double Multiplica(Double v1, Double v2){
        return (v1 * v2);
    }
    
    static Double Divide(Double v1, Double v2){
        return (v1 / v2);
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Double v1, v2, result;
        String tipo;
        
        try{
            v1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um primeiro valor: "));
          
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Primeiro valor será 0");
            v1 = 0.0;
        }
        
        try{
            v2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um segundo valor: "));
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Segundo valor será 0");
            v2 = 0.0;
            
        }
        
        tipo = JOptionPane.showInputDialog("Operação desejada: \n"
                     + "1. Adição\n"
                + "2. Subtração\n"
                + "3. Multiplicação\n"
                + "4. Divisão\n"
                + "0. Sair");
        
        switch(tipo){
            case "1":
                result = Soma(v1, v2);
                break;
                
            case "2":
                result = Subtrai(v1, v2);
                break;
                
            case "3":
                result = Multiplica(v1, v2);
                break;
                
            case "4":
                result = Divide(v1, v2);
                break;
                
            default:
                result = 0.0;
                break;
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + result);
    }
    
}
