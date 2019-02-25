package xyz;

import javax.swing.*;

public class filesix {
    public static void main(String[] args) {
        String num ;
        Integer numConverted;
        String[] voters;
        num = JOptionPane.showInputDialog("how many voters?");
        numConverted= Integer.parseInt(num);
        voters= new String[numConverted];
        for (int i=0; i<numConverted; i++){
            voters[i]= JOptionPane.showInputDialog("enter voter" + (i+1));
        }
        for ( int i=0; i < numConverted; i++){
            System.out.println((i=1)+ " "+ voters[i]);
        }
    }
}
