package com.coderising.ood.ocp;

/**
 * Created by yrs on 2017/6/19.
 */
public class RawLogWithDateType implements LogType {

    @Override
    public String formatMsg(String msg) {
        String txtDate = DateUtil.getCurrentDateAsString();
        String logMsg = txtDate + ": " + msg;
        return logMsg;
    }
}
                