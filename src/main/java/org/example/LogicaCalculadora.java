package org.example;

public class LogicaCalculadora {
    private Double operandoUno, operandoDos = 0.0;
    private String operacion;

    public void setOperandoUno(Double operandoUno) {
        this.operandoUno = operandoUno;
    }

    public void setOperandoDos(Double operandoDos) {
        this.operandoDos = operandoDos;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Double realizarOperacion() {
        return operacion.equals("+") ? operandoUno + operandoDos : operandoUno + - operandoDos;
    }

    public void getResultados() {
        System.out.println(realizarOperacion());
    }
}
