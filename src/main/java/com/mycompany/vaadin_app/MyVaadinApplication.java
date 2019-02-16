package com.mycompany.vaadin_app;



import com.vaadin.addon.touchkit.ui.TouchKitApplication;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")

public class MyVaadinApplication extends TouchKitApplication
{
	private Employee mehdi=new Employee();
	private int clickNumber=0;
    
    @Override
    public void onBrowserDetailsReady() {
    	Label label= new Label("Please Login");
    	TextField username=new TextField("Username");
    	PasswordField password=new PasswordField("Password");
        Button button = new Button("Login");
               button.addListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
            	if(username.getValue()==""||password.getValue()=="") {
            		
            		event.getButton().getWindow().showNotification("Password is required",500);}
            	
            	else {
            		++clickNumber;
            		String message="You clicked" + clickNumber +"time(s) on login button!";
            		mehdi.setNumber(clickNumber);
            		mehdi.setPassword(password.getValue().toString());
            		mehdi.setUsername(username.getValue().toString());
            		event.getButton().getWindow().showNotification(message,500);
            	}
            	
            		
            }
        });
       
        
        getMainWindow().addComponent(label);
        getMainWindow().addComponent(username);
        getMainWindow().addComponent(password);
        getMainWindow().addComponent(button);
       }

    
}
