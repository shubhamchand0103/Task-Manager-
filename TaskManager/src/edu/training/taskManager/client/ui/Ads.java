package edu.training.taskManager.client.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Ads extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	
	public Ads() {
		initWidget(vPanel);
		
		HTML html = new HTML("<b> &nbsp &nbsp Task Manager</b>"
				+ "</br>"+"<i>&nbsp &nbsp &nbsp &nbsp -Shubham Chand</i>");
		
		Image image = new Image("/images/taskManager.jpg");
		
		vPanel.add(html);
		vPanel.add(image);
	}

}
