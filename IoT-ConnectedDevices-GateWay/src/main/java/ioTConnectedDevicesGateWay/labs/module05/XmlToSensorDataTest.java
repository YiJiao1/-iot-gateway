package ioTConnectedDevicesGateWay.labs.module05;
import ioTConnectedDevicesGateWay.labs.common.SensorData;

public class XmlToSensorDataTest {


	public static SensorData xmlToSensorData(String xmlString)
	{
		SensorData sensorData=new SensorData();
		
		sensorData.fromXmlString(xmlString);
	
		 return sensorData;
	}
	
	
}
