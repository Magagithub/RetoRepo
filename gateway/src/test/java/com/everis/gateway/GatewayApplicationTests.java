package com.everis.gateway;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GatewayApplicationTests implements HealthCheckHandler {
	private int counter=-1;
	@Override
	public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus instanceStatus) {
		counter ++;
		switch (counter){
			case 0:
				return InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
			case 1:
				return InstanceInfo.InstanceStatus.DOWN;
			case 2:
				return InstanceInfo.InstanceStatus.STARTING;
			case 3:
				return InstanceInfo.InstanceStatus.UNKNOWN;
			default:
				return InstanceInfo.InstanceStatus.UP;
		}
	}

	@Test
	void contextLoads() {
	}

}
