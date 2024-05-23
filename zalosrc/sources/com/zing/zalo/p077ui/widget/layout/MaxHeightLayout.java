package com.zing.zalo.p077ui.widget.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import h40.AbstractC19849s1;
import me0.AbstractC23136l9;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public class MaxHeightLayout extends FrameLayout {

    /* renamed from: p */
    private int f70607p;

    /* renamed from: q */
    private int f70608q;

    /* renamed from: r */
    public boolean f70609r;

    public MaxHeightLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70607p = 0;
        this.f70608q = 0;
        this.f70609r = false;
        this.f70608q = getScreenHeight();
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.widget.layout.e
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                MaxHeightLayout.this.m76381e(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m76380d() {
        this.f70607p = 0;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m76381e(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        m76382c();
    }

    /* renamed from: c */
    void m76382c() {
        int screenHeight = getScreenHeight();
        if (screenHeight != this.f70608q) {
            this.f70608q = screenHeight;
            post(new Runnable() { // from class: com.zing.zalo.ui.widget.layout.f
                @Override // java.lang.Runnable
                public final void run() {
                    MaxHeightLayout.this.m76380d();
                }
            });
        }
    }

    int getScreenHeight() {
        return AbstractC32232i.m155456d(this).y;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m76382c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        try {
            int size = View.MeasureSpec.getSize(i12);
            if (size > this.f70607p) {
                if (!this.f70609r && size > (i13 = this.f70608q)) {
                    this.f70607p = i13;
                } else {
                    this.f70607p = size;
                }
            }
            if (this.f70607p > 0) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f70607p, 1073741824));
            } else {
                super.onMeasure(i11, i12);
            }
        } catch (Exception unused) {
            super.onMeasure(i11, i12);
        }
    }

    public void setUseRealScreenHeight(boolean z11) {
        if (z11) {
            this.f70608q = AbstractC19849s1.m103552d().y;
        } else {
            this.f70608q = AbstractC23136l9.m118713h0();
        }
        requestLayout();
    }
}
