package ch5;

public class ArrayEx3 {
	public static void main(String[] args) {
		//[] : 1차원 배열
		//[][]: 2차원 배열(행, 열)
		//int[] score;  == 대괄호위치는 타입뒤와도 상관x
		int score[]= {100,88,100,100,90};
		
		//배열 총합과 평균
		int sum=0;
		float average=0f;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = (float)sum/score.length; 
		//average = sum/(float)5;
		System.out.println("총합 :"+sum);
		System.out.println("총합 :"+average);
		
	}
}