package code;

import java.util.concurrent.TimeUnit;

public class Potencia implements Runnable{

	private final double number;
	
	Potencia(int number){
		this.number=number;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
				System.out.printf("%s %.0f elevado a %d = %.0f\n",Thread.currentThread().getName(), number, i, Math.pow(number, i));
			
		}
	}

}
