package org.example;

public class Calculadora {
    public static void main(String[] args) {
        LogicaCalculadora casio = new LogicaCalculadora();

        casio.setOperandoUno(1.5);
        casio.setOperandoDos(3.5);
        casio.setOperacion("Estamosasumiendoquesiemprepondranoperacionvalidacomodiceelejercicio");
        casio.realizarOperacion();
        casio.getResultados();
    }
}
