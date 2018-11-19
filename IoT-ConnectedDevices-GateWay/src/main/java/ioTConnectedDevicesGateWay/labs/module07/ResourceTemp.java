package ioTConnectedDevicesGateWay.labs.module07;

import java.util.logging.Logger;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.server.resources.CoapExchange;


// this class handle all request to client, the generic is ResourceTemp form
public class ResourceTemp extends CoapResource {
	private static final Logger _Logger = Logger.getLogger(ResourceTemp.class.getName());
	// static

	// constructors

	/**
	 * @param name
	 */
	public ResourceTemp(String name) {
		super(name);
	}

	/**
	 * @param name
	 * @param visible
	 */
	public ResourceTemp(String name, boolean visible) {
		super(name, visible);
	}

	// public methods
	// handle get request from client, and return response to client
	@Override
	public void handleGET(CoapExchange ce) {
		String responseMsg = "here is my response to - " + super.getName();
		ce.respond(ResponseCode.VALID, responseMsg);
		_Logger.info("Handling GET:" + responseMsg);
	}

	@Override
	// handle POST request from client, and return response to client
	public void handlePOST(CoapExchange exchange) {
		// response by CONTECT
		exchange.respond(ResponseCode.CREATED, "POST successfully!!!");
		_Logger.info("Receive post request：" + exchange.getRequestText());
	}

	// handle POST request from client, and return response to client
	@Override
	public void handlePUT(CoapExchange exchange) {
		// response by CREATED
		exchange.respond(ResponseCode.CHANGED, "PUT successfully!!!");
		_Logger.info("Receive post request：" + exchange.getRequestText());
	}

	public void handleDELETE(CoapExchange exchange) {
		// response by DELETED
		String responseMsg = super.getName();
		exchange.respond(ResponseCode.DELETED, "DELETE successfully!!!");
		_Logger.info("Receive DELETE request：" + responseMsg);
	}

}
