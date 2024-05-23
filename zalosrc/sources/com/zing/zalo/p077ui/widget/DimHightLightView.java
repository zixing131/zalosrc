package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16781w;
import me0.C23212s8;

/* loaded from: classes6.dex */
public class DimHightLightView extends View {

    /* renamed from: p */
    private Rect f69172p;

    /* renamed from: q */
    private Rect f69173q;

    /* renamed from: r */
    private Paint f69174r;

    /* renamed from: s */
    boolean f69175s;

    public DimHightLightView(Context context) {
        super(context);
        this.f69175s = false;
        m75678d();
    }

    /* renamed from: d */
    private void m75678d() {
        Paint paint = new Paint();
        this.f69174r = paint;
        paint.setAntiAlias(true);
        this.f69174r.setColor(C23212s8.m119607o(getContext(), AbstractC16781w.OverlayBackgroundColor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m75679e() {
        setAlpha(1.0f);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m75680f() {
        if (!this.f69175s) {
            return;
        }
        this.f69173q = null;
        if (this.f69172p != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Rect rect = new Rect(this.f69172p);
            this.f69173q = rect;
            rect.offset(-iArr[0], -iArr[1]);
        }
        invalidate();
    }

    /* renamed from: c */
    public void m75681c() {
        if (!this.f69175s) {
            return;
        }
        this.f69175s = false;
        animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: com.zing.zalo.ui.widget.y
            @Override // java.lang.Runnable
            public final void run() {
                DimHightLightView.this.m75679e();
            }
        }).start();
    }

    /* renamed from: g */
    void m75682g() {
        postOnAnimation(new Runnable() { // from class: com.zing.zalo.ui.widget.x
            @Override // java.lang.Runnable
            public final void run() {
                DimHightLightView.this.m75680f();
            }
        });
    }

    public int getDimColor() {
        return this.f69174r.getColor();
    }

    /* renamed from: h */
    public void m75683h(Rect rect) {
        if (rect != null) {
            try {
                this.f69172p = rect;
                this.f69175s = true;
                m75682g();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: i */
    public void m75684i(Rect rect, long j11) {
        this.f69175s = true;
        m75683h(rect);
        postDelayed(new Runnable() { // from class: com.zing.zalo.ui.widget.z
            @Override // java.lang.Runnable
            public final void run() {
                DimHightLightView.this.m75681c();
            }
        }, j11);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f69173q != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.f69173q.top, this.f69174r);
            canvas.drawRect(0.0f, this.f69173q.bottom, getWidth(), getHeight(), this.f69174r);
            Rect rect = this.f69173q;
            canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom, this.f69174r);
            Rect rect2 = this.f69173q;
            canvas.drawRect(rect2.right, rect2.top, getWidth(), this.f69173q.bottom, this.f69174r);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        m75682g();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m75682g();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m75681c();
        return false;
    }

    public void setDimColor(int i11) {
        this.f69174r.setColor(i11);
        invalidate();
    }

    public DimHightLightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69175s = false;
        m75678d();
    }
}
