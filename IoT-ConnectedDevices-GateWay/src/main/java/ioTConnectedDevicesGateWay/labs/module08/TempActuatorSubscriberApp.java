package ioTConnectedDevicesGateWay.labs.module08;

public class TempActuatorSubscriberApp {

	public static void main(String[] args) {

		String path = "/Users/heychris/Downloads/IoT-Project-master/IoTGatewayJava/IoT-ConnectedDevices-GateWay/data/ubidots_cert.pem";
		MqttClientConnector test = new MqttClientConnector("things.ubidots.com", "{authtoken}",
				path);

		test.connect();
		String topicname = "/v1.6/devices/iot-device/tempactuator/lv";
		test.subscribeTopic(topicname, 0);

	}
}
