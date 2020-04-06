package cn.luo.on.firstpointexperiment.entry;

/**
 * 任务请求实体类
 */
import java.util.List;

public class Request {
   
	private long delay; //任务的延时约束
	private long data; //任务的数据量
	private long comResource; //任务完成所需要的计算资源量
	private int requestId; //任务请求号
	private static Integer requestIdCount = 0;
	private List<Integer> edgeNode; //收到任务请求的边缘节点集合  以边缘节点的编号代替 
	private int finalEdgeNode; //任务最终发送的边缘节点（最终在执行的任务任务节点）
	private int userId; //终端号，来自哪个终端，这样才知道能广播到哪些边缘节点上去           
	public Request() {
		synchronized (requestIdCount) { //synchronized锁住的是对象
			requestIdCount++;
			requestId = requestIdCount;
		}
	}
	public Request(long delay, long data, long comResource) {
		synchronized (requestIdCount) {
			requestIdCount++;
			requestId = requestIdCount;
		}
		this.delay = delay;
		this.data = data;
		this.comResource = comResource;
	}
	
	public long getDelay() {
		return delay;
	}
	public void setDelay(long delay) {
		this.delay = delay;
	}
	public long getData() {
		return data;
	}
	public void setData(long data) {
		this.data = data;
	}
	public long getComResource() {
		return comResource;
	}
	public void setComResource(long comResource) {
		this.comResource = comResource;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public List<Integer> getEdgeNode() {
		return edgeNode;
	}
	public void setEdgeNode(List<Integer> edgeNode) {
		this.edgeNode = edgeNode;
	}
	public int getFinalEdgeNode() {
		return finalEdgeNode;
	}
	public void setFinalEdgeNode(int finalEdgeNode) {
		this.finalEdgeNode = finalEdgeNode;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}

