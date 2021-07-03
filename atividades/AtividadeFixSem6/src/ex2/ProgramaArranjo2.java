package ex2;

import java.util.Arrays;

public class ProgramaArranjo2 {

public static void main(String[] args) {
	
int[] vetorData1 = {1,2,3,4,5};
int[] vetorData2 = {6,7,8};
int[] vetorData3 = concatenar1(vetorData1, vetorData2);

 System.out.println(Arrays.toString(vetorData3));
}

private static int[] concatenar1 (int[] vetorData1,int[] vetorData2){

int[]vetorData3 = new int[vetorData1.length + vetorData2.length];

	int k = 0;

for (int i = 0; i < vetorData1.length; i++) 
	
	vetorData3[k++]= vetorData1[i];
	
	for (int j = 0; j < vetorData2.length; j++) 
	
		vetorData3[k++]= vetorData2[j];
		
		return vetorData3;
	}

private static int[] concatenar(int[] vetorData1, int[] vetorData2) {
	// TODO Auto-generated method stub
	return null;
}
}