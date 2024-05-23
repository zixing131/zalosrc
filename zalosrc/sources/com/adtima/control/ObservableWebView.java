package com.adtima.control;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public class ObservableWebView extends WebView {

    /* renamed from: p */
    private int f15342p;

    /* renamed from: q */
    private long f15343q;

    /* renamed from: r */
    private double f15344r;

    /* renamed from: com.adtima.control.ObservableWebView$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3851a {
    }

    public ObservableWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15342p = 0;
        this.f15343q = 0L;
        this.f15344r = 0.0d;
    }

    public InterfaceC3851a getOnScrollChangedCallback() {
        return null;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        if (this.f15342p != i12) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f15344r = (1.0d / (currentTimeMillis - this.f15343q)) * 1000.0d;
            this.f15342p = i12;
            this.f15343q = currentTimeMillis;
        }
    }

    public void setOnScrollChangedCallback(InterfaceC3851a interfaceC3851a) {
    }

    public ObservableWebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15342p = 0;
        this.f15343q = 0L;
        this.f15344r = 0.0d;
    }
}
