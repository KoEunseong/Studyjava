package exception;

public class TryWithResourceEx {
	public static void main(String[] args) {
		
	}
	class CloseableResource implements AutoCloseable {
		public void exceptionWork(boolean exception) throws WorkException{
			System.out.println("exceptionWork("+exception + ")가 호출됨");
		
			if(exception) {
				throw new WorkException("WorkException 발생!");
			}
		}

		public void close() throws CloseException {
			System.out.println("close가 호출됨");
			throw new CloseException("closeException 발생!");
		}
	}
	
	class WorkException extends Exception {
		WorkException (String msg){ super(msg); }
	}
	class CloseException extends Exception{
		CloseException(String msg){ super(msg); }
	}
}
