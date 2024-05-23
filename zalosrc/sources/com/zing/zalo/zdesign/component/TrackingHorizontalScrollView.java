package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import bi0.AbstractC2815i;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25808b;

/* loaded from: classes7.dex */
public class TrackingHorizontalScrollView extends HorizontalScrollView implements InterfaceC16976f1 {

    /* renamed from: p */
    private C25808b f86467p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackingHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m90743a(Context context, AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2815i.TrackingHorizontalScrollView, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…defStyleRes\n            )");
        String string = obtainStyledAttributes.getString(AbstractC2815i.TrackingHorizontalScrollView_trackingId);
        if (string != null && string.length() != 0) {
            setIdTracking(string);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    static /* synthetic */ void m90744b(TrackingHorizontalScrollView trackingHorizontalScrollView, Context context, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 4) != 0) {
                i11 = 0;
            }
            if ((i13 & 8) != 0) {
                i12 = 0;
            }
            trackingHorizontalScrollView.m90743a(context, attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86467p;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86467p;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86467p;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingHorizontalScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86467p = new C25808b(new WeakReference(this));
        m90744b(this, context, attributeSet, i11, 0, 8, null);
    }
}
