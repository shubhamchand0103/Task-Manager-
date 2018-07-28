package edu.training.taskManager.client.ui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class Controls extends Composite {
	
	HorizontalPanel hPanel = new HorizontalPanel();
	Button btnAdd, btnEdit, btnDelete;
	public Controls() {
		initWidget(hPanel);
		btnAdd = new Button(" Add ");
		btnEdit = new Button(" Edit ");
		btnDelete = new Button(" Delete ");
		
		btnAdd.addClickHandler(new addButton());
		btnEdit.addClickHandler(new editButton());
		btnDelete.addClickHandler(new deleteButton());
		
		hPanel.add(btnAdd);
		hPanel.add(btnEdit);
		hPanel.add(btnDelete);
		
	}
	
	private class addButton implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			
		}
		
	}
	
	private class editButton implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			
		}
	}
	
	private class deleteButton implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			
		}
	}

}
