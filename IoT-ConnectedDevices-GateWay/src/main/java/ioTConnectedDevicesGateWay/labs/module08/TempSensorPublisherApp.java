package ioTConnectedDevicesGateWay.labs.module08;

public class TempSensorPublisherApp {
	public static void main(String[] args) {
		String path = "/Users/heychris/Downloads/IoT-Project-master/IoTGatewayJava/IoT-ConnectedDevices-GateWay/data/ubidots_cert.pem";
		MqttClientConnector test = new MqttClientConnector("things.ubidots.com", "{authtoken}",
				path);
		test.connect();
		// publish from the sensor
		String topicname = "/v1.6/devices/iot-device/tempsensor";
//		int temp = 20 + 12;
//		String payload = String.valueOf(temp);
//		test.publishMessage(topicname, 0, payload.getBytes());

		for (int i = 0; i < 5; i++) {
			int temp = 28 + i;
			String payload = String.valueOf(temp);
			test.publishMessage(topicname, 0, payload.getBytes());
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
