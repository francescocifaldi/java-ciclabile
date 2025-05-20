package org.lessons.java.ciclabile;

public class Ciclabile {
    int arrayDiInt[];
    int i = 0;

    public Ciclabile(int array[]) {
        int i = 0;
        arrayDiInt = new int[array.length];
        for (int num : array) {
            arrayDiInt[i] = num;
            i++;
        }
    }

    public Ciclabile() {
        arrayDiInt = new int[2];
        for (int i = 0; i < arrayDiInt.length; i++) {
            arrayDiInt[i] = i + 10;
        }
    }

    public int getElementoSuccessivo() {
        return arrayDiInt[i++];
    }

    public boolean haAncoraElementi() {
        if (i < arrayDiInt.length) {
            return true;
        } else {
            return false;
        }
    }

    public void addElemento(int num) {

        int[] nuovoArray = new int[arrayDiInt.length + 1];
        for (int i = 0; i < arrayDiInt.length; i++) {
            nuovoArray[i] = arrayDiInt[i];
        }
        nuovoArray[nuovoArray.length - 1] = num;
        arrayDiInt = nuovoArray;
    }
}
