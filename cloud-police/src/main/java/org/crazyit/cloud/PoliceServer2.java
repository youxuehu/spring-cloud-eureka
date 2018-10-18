package org.crazyit.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
public class PoliceServer2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 读取控制台的端口输入
		String port = scan.nextLine();
		new SpringApplicationBuilder(PoliceServer2.class).properties("server.port=" + port).run(args);
	}

}
