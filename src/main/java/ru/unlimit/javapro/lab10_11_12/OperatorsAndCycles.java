package ru.unlimit.javapro.lab10_11_12;
public class OperatorsAndCycles {
	public static void display(int value){
		System.out.println("Binary="+Integer.toBinaryString(value)+" Decimal="+value);
	}
	private static int abs(int value){
		return value<0 ? -value : value;		//<выражение1> ? <выражение2> : <выражение3>
	}

	public static void main(String[] args) {	
		/**********Битовые (поразрядные) операторы Java**********/
		// ~ Унарное отрицание (NOT)
		
//		int b1=0b010101010101010101010101010101;
//		int b2=~b1;

		// & Поразрядное И (AND)
		
//		b1=0b101010;
//		b2=0b111001;
//		int b3=b1&b2;
		
		// | Поразрядное ИЛИ (OR)
//		int b3=b1|b2;

		// ^ Поразрядное исключающее ИЛИ (XOR)
//		int b3=b1^b2;

		// << Сдвиг битов влево
//		b1=11;
//		display(b1);
//		display(b1<<1);
		
		// >> Сдвиг битов вправо
//		display(b1);
//		display(b1>>1);

		// >>> Сдвиг битов вправо с заполнением старшего бита нулем
//		b1=-576389;
//		display(b1);
//		for(int i=1;i<=32;i++)
//			display(b1>>>i);
		
		// &=, | =, ^=, <<=, >>=, >>>= Присвоение с аналогичной операцией
		
		//b1 >>=b2   b1=b1>>b2
		
//		int b=0b101;
//		display(b);
//		b&=0b110;
//		display(b);
		
		/**********Арифметические операторы Java**********/
		// +,-,*,/,%
		// ++ инкремент
		//int i=5;
		//System.out.println(++i);

		// -- декремент
//		int j=10;
//		System.out.println(j--);
		
		// += присваивание со сложением
//		int i=0;
//		i+=5;	//i=i+5
//		System.out.println(i);
		// -= присваивание с вычитанием
//		i-=5;	//i=i-5
//		System.out.println(i);
		
		// *= присваивание с умножением
//		int j=7;
//		j*=3;
//		System.out.println(j);
		
		// /= присваивание с делением
//		int k=14;
//		k/=6;
//		System.out.println(k);
		
		//%= присвоение с вычислением остатка
		
//		int p=9;
//		p%=7;
//		System.out.println(p);
		
		
		
		
		/**********Операторы сравнения Java**********/
		// == равно
//		boolean b = 3==3;
		//System.out.println(b);
		// != не равно
//		b = 3!=4;
		//System.out.println(b);
		
		// >  больше
		//System.out.println(2>3);
		// <  меньше
		//System.out.println(5<3);
		// >= больше или равно
		//System.out.println(2>=3);
		// <= меньше или равно		
//		System.out.println(20<=10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/**********Булевские логические операторы**********/
		// & Логическое И (AND)
//		boolean b= false&false;
//		System.out.println(b);
		
		// | Логическое ИЛИ (OR)
//		b= true|false;
//		System.out.println(b);
		// ^ Логическое XOR (исключающее ИЛИ)
//		b= true^false;
//		System.out.println(b);
		// ! Логическое унарное NOT (НЕ)
//		b=true;
//		boolean c=!b;
//		System.out.println(c);
		// &= AND с присваиванием
//		b=false;
//		b&=false;	//b= b&true
//		System.out.println(b);
		// |= OR с присваиванием
//		b=false;
//		b|=false;	//b= b|false
//		System.out.println(b);
		// ^= XOR с присваиванием
//		b=false;
//		b^=true;	// b= b^true
//		System.out.println(b);
		// == равно
//		b=false;
//		c=false;
//		boolean d= b==c;
//		System.out.println(d);
		// != не равно
//		b=true;
//		c=false;
//		d= b!=c;
//		System.out.println(d);
		
		
		// || Замыкающее ИЛИ (OR)
//		int i=0;
//		if(i==0 | i++==0)
//		{
//			System.out.println("ДА");
//		}
//		System.out.println(i);
		
		// && Замыкающее И (AND)		
//		b=true;
//		c=true;
//		d= b&&c;
//		System.out.println(d);
		
//		i=5;
//		if(i==5 && i++==0)
//		{
//			System.out.println("ДА");
//		}
//		System.out.println(i);		
		
		
		/**********Тернарный оператор ?:**********/
		// ?: тернарный оператор
//		System.out.println(abs(-99));
		
		
		
		
		/**********Оператор присваивания**********/
		// =	

//		int x = 5;
//		
//		System.out.println(x);
//		
//		int y,z;
//		
//		y=z=x;
//		
//		System.out.println(y);
//		System.out.println(z);
//
//
//		boolean b=false;
//		
//		if(b=true)
//			System.out.println(true);
//		else
//			System.out.println(false);
//		
//		System.out.println(b);
		
		
		/**********Циклы и операторы ветвления Java**********/
		
		//Операторы выбора
		//if-else
		//1
//		int value=1;
//		if(value<0)
//			System.out.println("Отрицательное");
//		else
//			System.out.println("Неотрицательное");

		//2
//		if(value<0){
//			System.out.println("Отрицательное");
//		}
//		
//		//3
//		if(value<0){
//			System.out.println("Отрицательное");
//		}
//		else if(value==0){
//			System.out.println("0");
//		}
//		else{// if(value>0){
//			System.out.println("Положительное");
//		}
//		else{
//			
//		}
		
		
		
		//switch
//		String day="ЫЫЫЫЫ";
//		
//		switch(day){
//			case "ПН":
//			case "ВТ":
//			case "СР":
//			case "ЧТ":
//			case "ПТ":
//				System.out.println("1-5: Будни");
//				break;
//			case "СБ":
//			case "ВС":
//				System.out.println("6-7: Выходные");
//				break;
//			default:
//				System.out.println("X: Не определен");
//		}
		//Циклические операторы
		//for
//		for(int i=0, j=10; i<10 && j>0; i++, j--){
//			System.out.println("i="+i+" j="+j);
//		}
		//while
//		int i=0;
//		while(i<100)
//			//i+=2;
//			System.out.println(i+=2);
		
		//do-while
//		String s="";
//		int i=0;
//		do{
//			s+=i;
//			System.out.println(s);
//			i++;
//		}while(i<10);
		
		//for-each-loop
//		int arr[]={2,5,3,4,8,22,1,-4};
//		
//		for(int val: arr)
//			System.out.println(val);
		
		
		//continue-break (операторы перехода)
		
//		for(int i=5; i<10; i++){
//			if(i<5)
//				continue;
//			System.out.println("i="+i);
//		}

		
		//return
//		System.out.println(increment(7));
		
//		int i=0;
//		for(;i<10;){//while(i<10)
//			System.out.println(i);
//			i++;
//		}
		
//		int i=0;
//		while(true){
//			i++;
//			System.out.println(i);
//			if(i==10)
//				break;
//		}
//		for(int i=0; i<10;i++){
//			for(int j=0;j<5;j++)
//				System.out.println("i="+i+" j="+j);
//		}
		
	}
//	public static int increment(int a){
//		return a+1;
//	}
}



