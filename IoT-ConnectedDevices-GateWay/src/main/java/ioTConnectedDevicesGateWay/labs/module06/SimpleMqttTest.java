package ioTConnectedDevicesGateWay.labs.module06;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

// all part is a main test, ignore it. This class could not using in Mqtt conncetion

public class SimpleMqttTest {

	private String topic = "MqttTest";
	private String content = "TestContent";
//	private String broker = "tcp://192.168.0.8:1883";
	private String broker       = "tcp://iot.eclipse.org:1883";
	private MqttClient mqttClient;
	private MemoryPersistence persistence = new MemoryPersistence();
	private MqttConnectOptions option = new MqttConnectOptions();
	private MqttMessage message = new MqttMessage();

	public void subscriberTest() {

		try {

			mqttClient = new MqttClient(broker, MqttClient.generateClientId(), new MemoryPersistence());
			option.setCleanSession(true);
			System.out.println("Connect to Broker");
			mqttClient.connect(option);
			System.out.println("Connected");
			mqttClient.subscribe(topic, 1);

		} catch (MqttException e) {
			System.out.println(e.getMessage() + " " + e.toString());

		}

	}

	public void publisherTest() {

		try {

			mqttClient = new MqttClient(broker, MqttClient.generateClientId(), persistence);
			option.setCleanSession(true);
			System.out.println("Connect to Broker:" + broker);
			mqttClient.connect(option);
			System.out.println("Connected!");
			System.out.println("Publish message: " + content);
			message.setPayload(content.getBytes());
			message.setQos(2);
			mqttClient.publish(topic, message);
			System.out.println("Topic published!");
			mqttClient.disconnect();
			System.out.println("Disconnect!");

		} catch (MqttException e) {

			System.out.print(e.toString() + " " + e.getMessage());
		}

	}

	public static void main(String[] args) {
	SimpleMqttTest hello = new SimpleMqttTest();
	hello.subscriberTest();

	hello.publisherTest();
		
/*
		String topic = "MQTT Examples";
		String content = "Message from MqttPublishSample";
		int qos = 2;
		String broker = "tcp://iot.eclipse.org:1883";
		String clientId = "JavaSample";
		MemoryPersistence persistence = new MemoryPersistence();

		try {
			MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);
			System.out.println("Connecting to broker: " + broker);
			sampleClient.connect(connOpts);
			System.out.println("Connected");
			System.out.println("Publishing message: " + content);
			MqttMessage message = new MqttMessage(content.getBytes());
			message.setQos(qos);
			sampleClient.publish(topic, message);
			System.out.println("Message published");
			sampleClient.disconnect();
			System.out.println("Disconnected");
			System.exit(0);
		} catch (MqttException me) {
			System.out.println("reason " + me.getReasonCode());
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
		}
*/

	}

}
