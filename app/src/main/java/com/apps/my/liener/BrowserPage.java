package com.apps.my.liener;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.graphics.Point;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.text.LoginFilter;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by RAHUL on 5/12/2016.
 */
public class BrowserPage {
    WebView browser;
    ImageView bubbleHead;

    public void setBrowserPage(Context context) {

        browser = new WebView(context);
        browser.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
        browser.setBackgroundColor(Color.WHITE);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        browser.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            }
        });

        bubbleHead = new ImageView(context);
        bubbleHead.setImageResource(R.mipmap.bubblesmall);
    }
}