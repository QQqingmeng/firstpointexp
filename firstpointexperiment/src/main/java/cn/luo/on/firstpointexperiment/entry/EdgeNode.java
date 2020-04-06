package cn.luo.on.firstpointexperiment.entry;

import java.util.Queue;

/**
 * 边缘节点
 * @author cs
 *
 */
public class EdgeNode {
	private int edgeNodeId;//节点id
	private int remainResources;//剩余资源
	private Queue<Request> edgeNodeRequestQueue;//边缘节点请求队列
	private int transDelay;//传输时延
	private int computeDelay;//计算时延
	private int allEnergyConsumption;//总能耗
	private int transEnergyConsumption;//传输能耗
	private int computeEnergyConsumption;//计算能耗
	public int getEdgeNodeId() {
		return edgeNodeId;
	}
	public void setEdgeNodeId(int edgeNodeId) {
		this.edgeNodeId = edgeNodeId;
	}
	public int getRemainResources() {
		return remainResources;
	}
	public void setRemainResources(int remainResources) {
		this.remainResources = remainResources;
	}
	public Queue<Request> getEdgeNodeRequestQueue() {
		return edgeNodeRequestQueue;
	}
	public void setEdgeNodeRequestQueue(Queue<Request> edgeNodeRequestQueue) {
		this.edgeNodeRequestQueue = edgeNodeRequestQueue;
	}
	public int getTransDelay() {
		return transDelay;
	}
	public void setTransDelay(int transDelay) {
		this.transDelay = transDelay;
	}
	public int getComputeDelay() {
		return computeDelay;
	}
	public void setComputeDelay(int computeDelay) {
		this.computeDelay = computeDelay;
	}
	public int getAllEnergyConsumption() {
		return allEnergyConsumption;
	}
	public void setAllEnergyConsumption(int allEnergyConsumption) {
		this.allEnergyConsumption = allEnergyConsumption;
	}
	public int getTransEnergyConsumption() {
		return transEnergyConsumption;
	}
	public void setTransEnergyConsumption(int transEnergyConsumption) {
		this.transEnergyConsumption = transEnergyConsumption;
	}
	public int getComputeEnergyConsumption() {
		return computeEnergyConsumption;
	}
	public void setComputeEnergyConsumption(int computeEnergyConsumption) {
		this.computeEnergyConsumption = computeEnergyConsumption;
	}
}
