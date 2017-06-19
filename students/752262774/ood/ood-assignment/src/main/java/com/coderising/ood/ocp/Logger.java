package com.coderising.ood.ocp;

public class Logger {
	LogType type;
	LogMethod method;
			
	public Logger(LogType logType, LogMethod logMethod){
		this.type = logType;
		this.method = logMethod;		
	}
	public void log(String msg){
		String logMsg = type.formatMsg(msg);
		method.handleLogMsg(logMsg);
	}
}

