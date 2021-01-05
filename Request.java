import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Request extends ClientSocket implements Runnable {

	// 1 2 3 4
	private final int mark;

	public Request(SocketChannel socket,int mark) {
		super(socket);
		this.mark = mark;

		if (mark > 4 && mark < 1)
			throw new IllegalArgumentException(mark + " Non valid");
	}

	@Override
	public void run() {
		// Send request mark on which server will base the response(message)
		
		

		try {
			socket.write(ByteBuffer.wrap(new String("novak je").getBytes()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
