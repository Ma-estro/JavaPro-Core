package ru.unlimit.javapro.lab18;

public class Multiply {

//	public int mult(int val){
//		return val;
//	}
	public int mult(int val1, int val2){
		return val1*val2;
	}
	public int mult(int val1, int val2, int val3){
		return val1*val2*val3;
	}
	public int mult(String str){
		return -1;
	}
	public int mult(double d){
		System.out.println("вызываем mult(double)");
		return (int)d;
	}
	public int mult(int  ...  val){
		if(val.length>0){
			int tmp=1;
			for(int i=0; i<val.length; i++){
				tmp*=val[i];
			}
			return tmp;
		}

		return -999;
	}
}
