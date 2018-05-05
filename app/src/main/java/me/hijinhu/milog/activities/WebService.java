package me.hijinhu.milog.activities;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by fabrizio on 24/12/17.
 */

public class WebService {
    Activity mContext;

    WebService(Activity c) {
        mContext = c;
    }

    // Adding javascript interface as done from
    // https://github.com/tamcgoey/dasher-app-android/blob/master/src/main/java/com/usedashnow/dasher/DashWebService.java
    // and https://stackoverflow.com/questions/21749425/android-webview-addjavascriptinterface-does-not-work-if-the-webview-is-created-i
    // It creates and interface between the Java Android App and then Javascript Webview

    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_LONG).show();
    }
}
