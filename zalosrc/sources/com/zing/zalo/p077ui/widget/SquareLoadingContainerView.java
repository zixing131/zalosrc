package com.zing.zalo.p077ui.widget;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes6.dex */
public class SquareLoadingContainerView extends View {

    /* renamed from: p */
    private C13656j2 f69654p;

    /* renamed from: q */
    protected boolean f69655q;

    /* renamed from: r */
    private C13666l2 f69656r;

    /* renamed from: s */
    protected boolean f69657s;

    public SquareLoadingContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69655q = false;
        this.f69657s = false;
        m75901a();
    }

    /* renamed from: a */
    private void m75901a() {
        this.f69656r = new C13666l2(this);
        this.f69654p = new C13656j2(this);
    }

    /* renamed from: b */
    public void mo75902b() {
        this.f69657s = false;
        this.f69655q = false;
        this.f69656r.m76367r();
        this.f69654p.m76320n();
    }

    public Animator getProgressAnim() {
        mo75902b();
        this.f69657s = true;
        this.f69655q = false;
        return this.f69656r.m76360j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f69657s) {
            this.f69656r.m76353c(canvas);
        }
        if (this.f69655q) {
            this.f69654p.m76316j(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f69656r.m76366q(getMeasuredWidth() - (this.f69656r.m76361k() * 2), getMeasuredHeight() - (this.f69656r.m76361k() * 2));
        this.f69654p.m76319m(getMeasuredWidth(), getMeasuredHeight());
        this.f69656r.m76365p(this.f69656r.m76361k(), this.f69656r.m76361k());
        this.f69654p.m76318l(0, 0);
    }

    public void setIntialProgress(int i11) {
        mo75902b();
        this.f69657s = true;
        this.f69655q = false;
        this.f69656r.f70581k = i11;
        invalidate();
    }
}
