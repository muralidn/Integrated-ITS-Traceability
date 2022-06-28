package eclipse;

public class ITSCore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TracConnector tracConnector = new TracConnector();
		int status = tracConnector.trac_Connect(".\\..\\Trac");
		System.out.println(status);
	}

}
