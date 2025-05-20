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

}
