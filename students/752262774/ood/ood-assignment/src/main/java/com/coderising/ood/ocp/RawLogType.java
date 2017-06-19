package com.coderising.ood.ocp;

/**
 * Created by yrs on 2017/6/19.
 */
public class RawLogType implements LogType {

    @Override
    public String formatMsg(String msg) {
        return msg;
    }
}
                