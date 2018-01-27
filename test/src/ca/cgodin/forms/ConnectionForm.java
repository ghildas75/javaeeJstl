package ca.cgodin.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
private String result;


public void validLogin(HttpServletRequest request) {
	
	String user= request.getParameter("user");
	String pass=request.getParameter("pass");
	if(user.equalsIgnoreCase("user1")&& (pass.equals("pass"))) {
		result="yes are ok the login is valid";
	}
	else {
		
		result=" the login is  not valid, try again!!!";
	}
	
}
public String getResult() {
	return result;
}

public void setResult(String result) {
	this.result = result;
}

}
