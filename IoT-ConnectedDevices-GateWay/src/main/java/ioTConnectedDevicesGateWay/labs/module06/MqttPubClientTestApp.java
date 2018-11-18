package ioTConnectedDevicesGateWay.labs.module06;

//import ioTConnectedDevicesGateWay.labs.common.*;

public class MqttPubClientTestApp {

	public static void main(String[] args) {
//		SensorData sensorData = new SensorData("Temperature");
//		sensorData.addNewValue(21);	

		String payload = "This is a test payload";
		MqttClientConnector mqttPubConnector = new MqttClientConnector("tcp", "iot.eclipse.org", 1883);
		mqttPubConnector.connect();
		mqttPubConnector.publishMessage("ILoveCoding", 2, payload.getBytes());
		mqttPubConnector.publishMessage("ILoveCoding", 2, payload.getBytes());
		mqttPubConnector.disconnect();


	}

}
