/*
program: multiplication table
describe: out multiplication table
author: Feng
date: 2019/9/20
*/
public class Jjcfb{
	public static void main(String[] args){
		int i,j;
		for (i = 1; i <= 9; i++){
			for (j = 1; j <= i; j++){
				System.out.printf("%d*%d=%d ", i, j, i*j);
			}
			System.out.printf("\n");
		}
	}
}