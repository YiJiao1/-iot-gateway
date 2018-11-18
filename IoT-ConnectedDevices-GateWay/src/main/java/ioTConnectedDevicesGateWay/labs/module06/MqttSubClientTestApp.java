package ioTConnectedDevicesGateWay.labs.module06;

public class MqttSubClientTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MqttClientConnector _mqttClient= new MqttClientConnector("tcp", "iot.eclipse.org", 1883);
		_mqttClient.connect();
		_mqttClient.subscribeTopic("ILoveCoding",2);
//        _mqttClient.subscribeToAll();
		
	}

}
