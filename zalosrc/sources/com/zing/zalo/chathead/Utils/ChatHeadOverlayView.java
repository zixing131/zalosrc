package com.zing.zalo.chathead.Utils;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import p266jg.AbstractC21244b;

/* loaded from: classes3.dex */
public class ChatHeadOverlayView extends View {

    /* renamed from: p */
    private float f42090p;

    /* renamed from: q */
    private float f42091q;

    /* renamed from: r */
    private Path f42092r;

    /* renamed from: s */
    private final Paint f42093s;

    /* renamed from: t */
    private ObjectAnimator f42094t;

    /* renamed from: u */
    private PathEffect f42095u;

    public ChatHeadOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42093s = new Paint();
        m39863a(context);
    }

    /* renamed from: a */
    private void m39863a(Context context) {
        this.f42091q = AbstractC21244b.m110052b(context, 20);
        this.f42090p = AbstractC21244b.m110052b(context, 3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phase", 0.0f, -this.f42091q);
        this.f42094t = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f42094t.setRepeatMode(1);
        this.f42094t.setRepeatCount(-1);
        this.f42094t.setDuration(600L);
    }

    /* renamed from: b */
    private Path m39864b(float f11) {
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f11, Path.Direction.CCW);
        return path;
    }

    private void setPhase(float f11) {
        this.f42095u = new PathDashPathEffect(m39864b(this.f42090p), this.f42091q, f11, PathDashPathEffect.Style.ROTATE);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f42092r != null) {
            this.f42093s.setPathEffect(this.f42095u);
            canvas.drawPath(this.f42092r, this.f42093s);
        }
    }

    public ChatHeadOverlayView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f42093s = new Paint();
        m39863a(context);
    }
}
