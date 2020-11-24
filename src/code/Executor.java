package code;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Executor {
	
	protected final ThreadPoolExecutor cachedThreadPool = (ThreadPoolExecutor) Executors.newCachedThreadPool();
	
	public void execute(Potencia potencia) {
		try {
			cachedThreadPool.execute(potencia);
		}
		catch(Exception e) {
			
		}
	}
	
	public void shutdown() {
		cachedThreadPool.shutdown();
	}

	public void shutdownNow() {
		cachedThreadPool.shutdownNow();
	}
}
