package edu.training.taskManager.client.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	
	public MainView() {
		initWidget(vPanel);
		Content content = new Content();
		Controls controls = new Controls();
		vPanel.add(content);
		vPanel.add(controls);
	}
	
}
