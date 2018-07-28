package edu.training.taskManager.client.ui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.ScrollPanel;

public class TaskTable extends Composite {
	private ScrollPanel scrollPanel = new ScrollPanel();
	
	public TaskTable() {
		initWidget(scrollPanel);
		FlexTable flexTable = new FlexTable();
		
		flexTable.addClickHandler(new handler());
		scrollPanel.add(flexTable);
	}
	
	private class handler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
