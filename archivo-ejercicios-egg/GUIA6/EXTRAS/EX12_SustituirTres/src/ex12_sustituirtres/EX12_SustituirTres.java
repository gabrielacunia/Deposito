/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12_sustituirtres;

/**
 *
 * @author GACUNA
 */
public class EX12_SustituirTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String I;
        String J;
        String K;
        for(int i =0; i <10; i++){
            int j = 0;
           for(j =0; j <10; j++){
                int k = 0;
            for(k =0; k <10; k++){
                I = Integer.toString(i);
                J = Integer.toString(j);
                K = Integer.toString(k);
                if(I.equals("3")){
                 I = "E";
                }
                if(J.equals("3")){
                 J = "E";
                }
                if(K.equals("3")){
                 K = "E";
                }
                System.out.println(I + "-" + J + "-" + K);
        } 
        }  
        }    
    }
    
}
