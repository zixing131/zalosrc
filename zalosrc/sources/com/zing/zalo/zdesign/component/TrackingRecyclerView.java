package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2815i;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import p667y2.C30268e;
import ri0.C25808b;

/* loaded from: classes7.dex */
public class TrackingRecyclerView extends RecyclerView implements InterfaceC16976f1 {

    /* renamed from: V0 */
    private C25808b f86470V0;

    /* renamed from: W0 */
    private int f86471W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f86471W0 = -1;
        this.f86470V0 = new C25808b(new WeakReference(this));
        m90750b2(this, context, attributeSet, 0, 0, 8, null);
    }

    /* renamed from: a2 */
    private final void m90749a2(Context context, AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2815i.TrackingRecyclerView, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…defStyleRes\n            )");
        String string = obtainStyledAttributes.getString(AbstractC2815i.TrackingRecyclerView_trackingId);
        if (string != null && string.length() != 0) {
            setIdTracking(string);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b2 */
    static /* synthetic */ void m90750b2(TrackingRecyclerView trackingRecyclerView, Context context, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 4) != 0) {
                i11 = 0;
            }
            if ((i13 & 8) != 0) {
                i12 = 0;
            }
            trackingRecyclerView.m90749a2(context, attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13 = this.f86471W0;
        if (i13 >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86470V0;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    public final void setMaxHeight(int i11) {
        this.f86471W0 = i11;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86470V0;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86471W0 = -1;
        this.f86470V0 = new C25808b(new WeakReference(this));
        m90750b2(this, context, attributeSet, i11, 0, 8, null);
    }
}
