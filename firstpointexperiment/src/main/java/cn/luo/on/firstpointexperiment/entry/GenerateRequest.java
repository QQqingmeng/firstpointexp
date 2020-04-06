package cn.luo.on.firstpointexperiment.entry;

import java.util.Random;

public class GenerateRequest {
	
   
	public Request generationRequest() {
		Random ran = new Random();
		////请求参数瞎设置的，需要看一下任务的数据集
		long delay = (long)(ran.nextInt(400)+100);
		long data = (long)(ran.nextInt(9000)+1000);
		long comResource = (long)(ran.nextInt(900)+100); 
		
		Request request = new Request(delay, data, comResource);
		return request;
	}
}
