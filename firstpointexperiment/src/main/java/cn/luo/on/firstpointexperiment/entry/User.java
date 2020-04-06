package cn.luo.on.firstpointexperiment.entry;

import java.util.Queue;
import java.util.Set;

/**
 * 终端类
 * @author cs
 *
 */
public class User {
	private int userId;//终端id
	private int broadcastDistance;//广播距离
	private Set<EdgeNode> inRangeNodeSet = null;//距离内的边缘节点集合
	private int requestNum;//请求数量
	private int requestCycle = 0;//请求周期
	/*
	 * 和你师兄的队列不同，他是只有一个队列，这个是每个终端都有一个队列，所以写法不同
	 * 到底是哪种队列呢
	 * */
	private Queue<Request> userRequestQueue = null;//当前终端的请求任务队列
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBroadcastDistance() {
		return broadcastDistance;
	}
	public void setBroadcastDistance(int broadcastDistance) {
		this.broadcastDistance = broadcastDistance;
	}
	public Set<EdgeNode> getInRangeNodeSet() {
		return inRangeNodeSet;
	}
	public void setInRangeNodeSet(Set<EdgeNode> inRangeNodeSet) {
		this.inRangeNodeSet = inRangeNodeSet;
	}
	public int getRequestNum() {
		return requestNum;
	}
	public void setRequestNum(int requestNum) {
		this.requestNum = requestNum;
	}
	public int getRequestCycle() {
		return requestCycle;
	}
	public void setRequestCycle(int requestCycle) {
		this.requestCycle = requestCycle;
	}
	public Queue<Request> getRequestQueue() {
		return userRequestQueue;
	}
	public void setRequestQueue(Queue<Request> requestQueue) {
		this.userRequestQueue = requestQueue;
	}
}
