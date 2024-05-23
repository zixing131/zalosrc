package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p706z6.C31689h;
import p706z6.C31694m;

/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes3.dex */
class C6430c extends C31689h {

    /* renamed from: M */
    private final Paint f36093M;

    /* renamed from: N */
    private final RectF f36094N;

    /* renamed from: O */
    private int f36095O;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6430c(C31694m c31694m) {
        super(c31694m == null ? new C31694m() : c31694m);
        this.f36093M = new Paint(1);
        m33153y0();
        this.f36094N = new RectF();
    }

    /* renamed from: s0 */
    private void m33150s0(Canvas canvas) {
        if (!m33154z0(getCallback())) {
            canvas.restoreToCount(this.f36095O);
        }
    }

    /* renamed from: t0 */
    private void m33151t0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m33154z0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        m33152v0(canvas);
    }

    /* renamed from: v0 */
    private void m33152v0(Canvas canvas) {
        this.f36095O = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    /* renamed from: y0 */
    private void m33153y0() {
        this.f36093M.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f36093M.setColor(-1);
        this.f36093M.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: z0 */
    private boolean m33154z0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m33151t0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f36094N, this.f36093M);
        m33150s0(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean m33155r0() {
        return !this.f36094N.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void m33156u0() {
        m33157w0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: w0 */
    void m33157w0(float f11, float f12, float f13, float f14) {
        RectF rectF = this.f36094N;
        if (f11 != rectF.left || f12 != rectF.top || f13 != rectF.right || f14 != rectF.bottom) {
            rectF.set(f11, f12, f13, f14);
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void m33158x0(RectF rectF) {
        m33157w0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
