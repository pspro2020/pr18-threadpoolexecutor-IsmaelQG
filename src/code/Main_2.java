package code;

public class Main_2 {
	
	public static void main(String[] args) {
		
		Executor2 exec = new Executor2();
		
		for(int i=1; i<=10; i++) {
			Potencia potencia = new Potencia(i);
			exec.execute(potencia);
			
		}
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            return;
        }
		System.out.println(exec.fixedThreadPool.getPoolSize());
	}

}
