
public class Cfkj{
	public static void main(String[] args){
		int i;
		int j;
		for (i = 1; i <= 9; i++){
			for (j = 1; j <= i; j++){
				System.out.printf("%d*%d=%d ", i, j, i*j);
			}
			System.out.printf("\n");
		}
	}
}