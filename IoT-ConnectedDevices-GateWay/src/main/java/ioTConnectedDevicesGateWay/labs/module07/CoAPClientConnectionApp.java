/**
 * 
 */
package ioTConnectedDevicesGateWay.labs.module07;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CoAPClientConnectionApp {

	private static final Logger _Logger = Logger.getLogger(CoAPClientConnectionApp.class.getName());

	private static CoAPClientConnectionApp _App = null;

	public CoAPClientConnectionApp() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			_App = new CoAPClientConnectionApp();
			_App.start();
		} catch (Exception e) {
			_Logger.log(Level.SEVERE, "Bad staff ", e);
			System.exit(1);
		}

	}

	// public methods, run GET/PUT/POST/DELETE in start function
	public void start() {
		String payload = "Sample payload.";
		String payload2 = "Sample update.";

		CoapClientConnector clientConn = new CoapClientConnector();
		clientConn.runTests();
		clientConn.sendGetRequest("test1");
		clientConn.sendPostRequest("test1", payload, true);
		clientConn.sendPutRequest("test1", payload2, true);
		clientConn.sendDeleteRequest("test1");
		

	}

	// private CoAPCommClient = new CoAPClientConnection()

}
