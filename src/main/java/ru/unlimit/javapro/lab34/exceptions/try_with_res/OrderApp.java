package ru.unlimit.javapro.lab34.exceptions.try_with_res;


public class OrderApp {

	public static void main(String[] args) throws Exception {
		
		
		//Исключение в конструкторе Ресурса
		//Исключение в методе Close
		//Исключение в блоке try и Close

		try(	Resource res0 = new Resource("Хороший Ресурс 0");
				BadCloseResource res1 = new BadCloseResource("Плохой Ресурс 1");
				BadCloseResource res2 = new BadCloseResource("Плохой Ресурс 2");
				BadCloseResource res3 = new BadCloseResource("Плохой Ресурс 3")){
			//System.out.println("Блок Try");
			throw new RuntimeException("Исключение в блоке try");
		}
		catch(Exception e){
			
			Exception bigEx = new Exception("Big Exeption");
			bigEx.addSuppressed(e);
			throw bigEx;
		}
		
	}
}

class Resource implements AutoCloseable{

	private final String name;
	
	public Resource(String name) {
		this.name = name;
		System.out.println("Создание ресурса [" + name+"]");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Закрытие ресурса [" + name+"]");
		
	}
}
class BadConstructorResource implements AutoCloseable{

	private final String name;
	
	public BadConstructorResource(String name) {
		this.name = name;
		throw new RuntimeException("Ошибка создания ресурса[" + name+"]");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Закрытие ресурса [" + name+"]");
		
	}
}
class BadCloseResource implements AutoCloseable{

	private final String name;
	
	public BadCloseResource(String name) {
		this.name = name;
		System.out.println("Создание ресурса [" + name+"]");
	}

	@Override
	public void close() throws Exception {
		throw new RuntimeException("Ошибка закрытия ресурса[" + name+"]");
	}
}