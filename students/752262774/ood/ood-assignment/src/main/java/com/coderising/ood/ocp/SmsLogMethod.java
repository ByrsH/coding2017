package com.coderising.ood.ocp;

/**
 * Created by yrs on 2017/6/19.
 */
public class SmsLogMethod implements LogMethod {

    @Override
    public void handleLogMsg(String logMsg) {
        SMSUtil.send(logMsg);
    }
}
                