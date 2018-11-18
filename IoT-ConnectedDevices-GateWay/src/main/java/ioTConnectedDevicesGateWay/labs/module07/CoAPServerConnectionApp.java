/**
 * 
 */
package ioTConnectedDevicesGateWay.labs.module07;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CoAPServerConnectionApp {

	private static final Logger _Logger = Logger.getLogger(CoAPServerConnectionApp.class.getName());
	private static CoAPServerConnectionApp _App;

	public CoAPServerConnectionApp() {
		super();
	}

	/**
	 * @param args
	 */
	// main function to run server
	public static void main(String[] args) {
		CoAPServerConnectionApp._App = new CoAPServerConnectionApp();
		try {
			CoapServerConnector serverConn = new CoapServerConnector();
			serverConn.start();
		} catch (Exception e) {
			_Logger.log(Level.SEVERE, "Bad staff ", e);
			System.exit(1);
		}

	}

}
