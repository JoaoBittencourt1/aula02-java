package br.com.aula02;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class primeiroprojeto {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);


        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));

        double kg = Double.parseDouble(JOptionPane.showInputDialog("digite seu peso: "));

        double imc = kg/(altura * altura);



        JOptionPane.showMessageDialog(null,"seu imc ideal:"+imc);

        if (imc < 17.0){
            JOptionPane.showMessageDialog(null, "muito abaixo do peso.");
        }
        if (imc > 17 && imc < 18.49){
            JOptionPane.showMessageDialog(null, "abaixo do peso.");
        }
        if (imc >18.50 && imc < 24.99){
            JOptionPane.showMessageDialog(null, "peso normal");
        }
        if (imc > 25 && imc < 29.99){
            JOptionPane.showMessageDialog(null, "acima do peso");
        }
        if (imc > 29.99){
            JOptionPane.showMessageDialog(null, "obesidade");
        }




    }
}
