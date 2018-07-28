package edu.training.taskManager.client.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class Content extends Composite {
	HorizontalPanel hPanel = new HorizontalPanel();
	
	public Content() {
		initWidget(hPanel);
		Ads ads = new Ads();
		TaskTable taskTable = new TaskTable();
		hPanel.add(ads);
		hPanel.add(taskTable);
	}
}
