package com.java.test;

public class Test2 {

	public static void main(String[] args) {
//		int a = 7;
//		System.out.println(Math.sqrt(a));
//		System.out.println(Math.ceil(Math.sqrt(a)));
//		System.out.println(Math.floor(Math.sqrt(a)));
//		System.out.println(Math.round(Math.sqrt(a)));
		//findPrime(50,300);
		
		Test2 t = new Test2();

	}

	public void Test2() {//���캯��û�з���ֵ����Ȼ���ֺ͹��캯��һ����ȴ���ǹ��캯��
		System.out.println("Test2���캯��");
		// TODO Auto-generated constructor stub
		return;
	}
	public static void findPrime(int min,int max){
		//int flag = 0;
		int i,j;
		for(i=min;i<=max;i++){
			for(j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					break;
				}
			}
			if(j==(int)Math.ceil(Math.sqrt(i))){
				System.out.println(i+","+j+"======="+(int)Math.ceil(Math.sqrt(i)));
				System.out.println(i+" :������");
			}else{
				//System.out.println(i+" :��������");
			}

		}
	}

}
