package code;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Executor2 {
	
	protected final ThreadPoolExecutor fixedThreadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
	
	public void execute(Potencia potencia) {
		try {
			fixedThreadPool.execute(potencia);
		}
		catch(Exception e) {
			
		}
	}
	
	public void shutdown() {
		fixedThreadPool.shutdown();
	}

	public void shutdownNow() {
		fixedThreadPool.shutdownNow();
	}
}
