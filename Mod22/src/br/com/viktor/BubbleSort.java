package br.com.viktor;

import java.util.List;
import java.util.ArrayList;

public class BubbleSort {

	public static int[] sort(int[] lista) {
		int aux = 0;
		for (int i = 0; i < lista.length; i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i] > lista[j]) {
					aux = lista[j];
					lista[j] = lista[i];
					lista[i] = aux;
				}
			}
		}
		for (int i : lista) {
			System.out.println(lista[i-1]);
		}
		return null;
	}

	public static void main(String[] args) {
		int[] vet = {8,4,6,2,5,1};
		sort(vet);
	}

}
