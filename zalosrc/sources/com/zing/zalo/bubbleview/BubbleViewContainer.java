package com.zing.zalo.bubbleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.bubbleview.BubbleViewContainer;
import com.zing.zalo.bubbleview.IconBubbleEditText;
import gg0.AbstractC19444a;

/* loaded from: classes3.dex */
public class BubbleViewContainer extends ScrollView implements IconBubbleEditText.InterfaceC7393c {

    /* renamed from: p */
    IconBubbleEditText f40194p;

    /* renamed from: q */
    float f40195q;

    /* renamed from: r */
    boolean f40196r;

    public BubbleViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40196r = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.BubbleViewContainer);
        try {
            this.f40195q = obtainStyledAttributes.getFloat(AbstractC8923h0.BubbleViewContainer_maxRows, -1.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m37526c() {
        fullScroll(130);
    }

    @Override // com.zing.zalo.bubbleview.IconBubbleEditText.InterfaceC7393c
    /* renamed from: a */
    public void mo37527a(Object obj) {
        this.f40196r = true;
        requestLayout();
    }

    protected void finalize() {
        this.f40194p.m37549s(this);
        super.finalize();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        IconBubbleEditText iconBubbleEditText = (IconBubbleEditText) getChildAt(0);
        this.f40194p = iconBubbleEditText;
        iconBubbleEditText.m37543j(this);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.f40196r) {
            this.f40196r = false;
            AbstractC19444a.m101695c(new Runnable() { // from class: zd.a
                @Override // java.lang.Runnable
                public final void run() {
                    BubbleViewContainer.this.m37526c();
                }
            });
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f40194p == null) {
            return;
        }
        float f11 = this.f40195q;
        int i13 = (int) f11;
        if (f11 == -1.0f || r8.getRowHeights().length < this.f40195q) {
            i13 = this.f40194p.getRowHeights().length;
            f11 = i13;
        }
        int length = this.f40194p.getRowHeights().length;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 += this.f40194p.getRowHeights()[(length - 1) - i15].intValue();
        }
        float f12 = f11 - i13;
        if (f12 > 0.0f) {
            i14 = (int) (i14 + (this.f40194p.getRowHeights()[length - 1].intValue() * f12));
        }
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i11), i14 + this.f40194p.getPaddingTop() + this.f40194p.getPaddingBottom() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        IconBubbleEditText.InterfaceC7396f interfaceC7396f;
        super.onSizeChanged(i11, i12, i13, i14);
        if (i14 != i12 && (interfaceC7396f = this.f40194p.f40212w) != null) {
            interfaceC7396f.mo37555a(i12 - i14);
        }
    }
}
