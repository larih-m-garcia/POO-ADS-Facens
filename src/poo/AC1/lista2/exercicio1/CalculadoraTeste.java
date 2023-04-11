package poo.AC1.lista2.exercicio1;

import javax.swing.*;

public class CalculadoraTeste {

    public static void main(String[] args) {

        Object[] operacao = { "Somar", "Subtrair", "Multiplicar", "Dividir" };
        int continua = 0;
        String num1Str = " ";
        String num2Str = " ";
        Number resultado = 0;
        Object operacSelecionada;

        while(continua == 0){
            operacSelecionada = JOptionPane.showInputDialog(null, "Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null,operacao, operacao[0]);

            if(operacSelecionada == null){
                break;
            }

            do {
                num1Str = JOptionPane.showInputDialog("Insira o primeiro operador");
                if(!(num1Str.matches("[+-]?\\d*(\\.\\d+)?")) || (num1Str.isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Insira um valor numérico!", "alerta", JOptionPane.ERROR_MESSAGE);
                }
            } while (!(num1Str.matches("[+-]?\\d*(\\.\\d+)?")) || (num1Str.isEmpty()));

            do {
                num2Str = JOptionPane.showInputDialog("Insira o segundo operador");
                if(!(num2Str.matches("[+-]?\\d*(\\.\\d+)?")) || (num2Str.isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Insira um valor numérico!", "alerta", JOptionPane.ERROR_MESSAGE);
                }
            } while (!(num2Str.matches("[+-]?\\d*(\\.\\d+)?")) || (num2Str.isEmpty()));


            switch(operacSelecionada.toString()) {
                case("Somar"):
                    if(num1Str.matches("[0-9]*") && num2Str.matches("[0-9]*")){
                        resultado = Calculadora.soma(Integer.parseInt(num1Str), Integer.parseInt(num2Str));
                    }else{
                        resultado = Calculadora.soma(Double.parseDouble(num1Str), Double.parseDouble(num2Str));
                    }
                    break;
                case("Subtrair"):
                    if(num1Str.matches("[0-9]*") && num2Str.matches("[0-9]*")){
                        resultado = Calculadora.subtracao(Integer.parseInt(num1Str), Integer.parseInt(num2Str));
                    }else{
                        resultado = Calculadora.subtracao(Double.parseDouble(num1Str), Double.parseDouble(num2Str));
                    }
                    break;
                case("Multiplicar"):
                    if(num1Str.matches("[0-9]*") && num2Str.matches("[0-9]*")){
                        resultado = Calculadora.multiplicacao(Integer.parseInt(num1Str), Integer.parseInt(num2Str));
                    }else{
                        resultado = Calculadora.multiplicacao(Double.parseDouble(num1Str), Double.parseDouble(num2Str));
                    }
                    break;
                case("Dividir"):
                    if(num1Str.matches("[0-9]*") && num2Str.matches("[0-9]*")){
                        resultado = Calculadora.divisao(Integer.parseInt(num1Str), Integer.parseInt(num2Str));
                    }else{
                        resultado = Calculadora.divisao(Double.parseDouble(num1Str), Double.parseDouble(num2Str));
                    }break;
                default:
                    break;
            }
            continua = JOptionPane.showConfirmDialog(null,"Resultado: " + resultado + "\nDeseja fazer outra operação?","Resultado",JOptionPane.YES_NO_OPTION);
        }
    }
}
