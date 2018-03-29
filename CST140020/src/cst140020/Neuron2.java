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
public class Neuron2 {
     double threshould;
    double [] weight= new double[4];
    double [] input =new double[4];
    int inputcounter,output;
    
    public Neuron2(double threshould){
    
    this.threshould = threshould;
    this.inputcounter = 0;
    
    }
          public int insert(double inputs ,double weights){
          
          input [inputcounter] = inputs;
          weight [inputcounter] = weights;
          inputcounter ++;
              if(inputcounter==4){
              
              calculate();
              }
              
              
          
         return output; 
          } 
            
    
          
    public int calculate(){
    
    int i;
    double sum=0 ;
        for(i=0;i<inputcounter;i++){
        
        sum+= input[i]*weight[i];
        
        
        }
        
        if(sum>threshould){
        output =1;
        }
        else
        {
        output =0;
        }
    
    return output;
    }
    
    
}
