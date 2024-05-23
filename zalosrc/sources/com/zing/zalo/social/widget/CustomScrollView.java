package com.zing.zalo.social.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ScrollView;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class CustomScrollView extends ScrollView {

    /* renamed from: com.zing.zalo.social.widget.CustomScrollView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10889a {
    }

    /* renamed from: com.zing.zalo.social.widget.CustomScrollView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC10890b {
    }

    public CustomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView
    public void fling(int i11) {
        super.fling(i11);
    }

    @Override // android.view.View
    public ArrayList getFocusables(int i11) {
        return new ArrayList();
    }

    public InterfaceC10889a getOnFlingListener() {
        return null;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        return true;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
    }

    public void setOnFlingListener(InterfaceC10889a interfaceC10889a) {
    }

    public void setScrollViewListener(InterfaceC10890b interfaceC10890b) {
    }
}
