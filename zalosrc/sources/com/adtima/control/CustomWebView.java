package com.adtima.control;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.adtima.Adtima;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public class CustomWebView extends WebView {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.CustomWebView$a */
    /* loaded from: classes2.dex */
    public class ViewOnTouchListenerC3849a implements View.OnTouchListener {
        ViewOnTouchListenerC3849a(CustomWebView customWebView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent.getAction() == 2;
        }
    }

    public CustomWebView(Context context) {
        super(context);
        m18377a();
    }

    /* renamed from: a */
    private void m18377a() {
        try {
            setScrollContainer(false);
            getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
            setBackgroundColor(0);
            getSettings().setCacheMode(2);
            setBackgroundColor(-1);
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setOnTouchListener(new ViewOnTouchListenerC3849a(this));
        } catch (Exception e11) {
            Adtima.m18328e("CustomWebView", e11.toString());
        }
    }

    public CustomWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18377a();
    }

    public CustomWebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m18377a();
    }
}
