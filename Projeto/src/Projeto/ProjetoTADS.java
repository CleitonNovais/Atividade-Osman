package Projeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class Modelo {
    private ArrayList<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }
}

public class ProjetoTADS {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro (0 para sair):"));
            if (numero != 0) {
                modelo.adicionarNumero(numero);
            }
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "Os números incluídos foram:\n" + modelo.getNumeros());
    }
}
