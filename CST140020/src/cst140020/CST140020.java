/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst140020;

/**
 *
 * @author cst140020
 */
public class CST140020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [] Display = new String[16];
        Display[0] ="0000";
        Display[1] ="0001";
        Display[2] ="0010";
        Display[3] ="0011";
        Display[4] ="0100";
        Display[5] ="0101";
        Display[6] ="0110";
        Display[7] ="0111";
        Display[8] ="1000";
        Display[9] ="1001";
        Display[10] ="1010";
        Display[11] ="1011";
        Display[12] ="1100";
        
        Display[13] ="1101";
        Display[14] ="1110";
        Display[15] ="1111";
       


        
        
        
        
        for(int i=0;i<16;i++){
            
            
    Neuron2 NE = new Neuron2(10.3);
        
        NE.insert(12, Character.getNumericValue(Display[i].charAt(0)));
        NE.insert(2, Character.getNumericValue(Display[i].charAt(1)));
        NE.insert(6, Character.getNumericValue(Display[i].charAt(2)));
        NE.insert(1, Character.getNumericValue(Display[i].charAt(3)));
       
       
        
        System.out.println("input " + Display[i] + " Out put " +NE.calculate());
    }
    }
}
