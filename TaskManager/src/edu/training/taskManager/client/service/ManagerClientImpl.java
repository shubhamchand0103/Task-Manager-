package edu.training.taskManager.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

import edu.training.taskManager.client.ui.MainView;

public class ManagerClientImpl implements ManagerClientInt{
	private ManagerServiceAsync service;
	private MainView mainView;
	
	public ManagerClientImpl(String url) {
		
		service = GWT.create(ManagerService.class);
		ServiceDefTarget endPoint = (ServiceDefTarget) service;
		endPoint.setServiceEntryPoint(url);
		
		mainView = new MainView();
	}
	
}