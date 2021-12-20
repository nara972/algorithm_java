package greedy;

import java.util.Scanner;

public class Main {
	
	public static int n,m;
	//1부터 10까지의 무게를 담을 수 있는 배열
	public static int[] arr=new int[11];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int x=sc.nextInt();
			arr[x]+=1;
		}
		
		int result=0;
		//1부터 m까지의 각 무게에 대하여 처리
		for(int i=1;i<=m;i++) {
			n-=arr[i];
			result+=arr[i]*n;
		}
		System.out.println(result);
	}

}
