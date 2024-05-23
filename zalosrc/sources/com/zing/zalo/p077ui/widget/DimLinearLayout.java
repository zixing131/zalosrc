package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes6.dex */
public class DimLinearLayout extends LinearLayout {

    /* renamed from: p */
    int f69176p;

    /* renamed from: q */
    boolean f69177q;

    /* renamed from: r */
    View.OnClickListener f69178r;

    public DimLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69176p = 0;
        this.f69177q = false;
    }

    /* renamed from: a */
    public void m75685a(boolean z11) {
        this.f69177q = z11;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f69177q) {
            canvas.drawColor(this.f69176p);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        if (this.f69177q) {
            if (motionEvent.getAction() == 0 && (onClickListener = this.f69178r) != null) {
                onClickListener.onClick(this);
                return true;
            }
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setDimClickListener(View.OnClickListener onClickListener) {
        this.f69178r = onClickListener;
    }

    public void setDimColor(int i11) {
        this.f69176p = i11;
    }

    public DimLinearLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f69176p = 0;
        this.f69177q = false;
    }
}
