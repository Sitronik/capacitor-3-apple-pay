package com.getcapacitor.applepay;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin
public class ApplePay extends Plugin {

    @PluginMethod
    public void canMakePayments(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("isPayment", false);
        call.success(ret);
    }
}
