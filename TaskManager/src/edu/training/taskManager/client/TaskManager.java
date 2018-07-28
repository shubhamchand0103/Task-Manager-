package edu.training.taskManager.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

import edu.training.taskManager.client.service.ManagerClientImpl;

public class TaskManager implements EntryPoint {

	String url = "";
	private ManagerClientImpl client;

	public void onModuleLoad() {
		url = GWT.getModuleBaseURL()+"managerService";
		client = new ManagerClientImpl(url);
	}
}
