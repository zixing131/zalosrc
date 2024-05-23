package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p439q6.AbstractC25136a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.b */
/* loaded from: classes3.dex */
public final class C6379b extends AbstractC6383f {

    /* renamed from: c */
    private int f35717c;

    /* renamed from: d */
    private float f35718d;

    /* renamed from: e */
    private float f35719e;

    /* renamed from: f */
    private float f35720f;

    public C6379b(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f35717c = 1;
    }

    /* renamed from: h */
    private void m32740h(Canvas canvas, Paint paint, float f11, float f12, float f13, boolean z11, RectF rectF) {
        float f14;
        if (z11) {
            f14 = -1.0f;
        } else {
            f14 = 1.0f;
        }
        canvas.save();
        canvas.rotate(f13);
        float f15 = f11 / 2.0f;
        float f16 = f14 * f12;
        canvas.drawRect((this.f35720f - f15) + f12, Math.min(0.0f, this.f35717c * f16), (this.f35720f + f15) - f12, Math.max(0.0f, f16 * this.f35717c), paint);
        canvas.translate((this.f35720f - f15) + f12, 0.0f);
        canvas.drawArc(rectF, 180.0f, (-f14) * 90.0f * this.f35717c, true, paint);
        canvas.translate(f11 - (f12 * 2.0f), 0.0f);
        canvas.drawArc(rectF, 0.0f, f14 * 90.0f * this.f35717c, true, paint);
        canvas.restore();
    }

    /* renamed from: i */
    private int m32741i() {
        AbstractC6378a abstractC6378a = this.f35759a;
        return ((CircularProgressIndicatorSpec) abstractC6378a).f35704g + (((CircularProgressIndicatorSpec) abstractC6378a).f35705h * 2);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6383f
    /* renamed from: a */
    public void mo32742a(Canvas canvas, float f11) {
        int i11;
        AbstractC6378a abstractC6378a = this.f35759a;
        float f12 = (((CircularProgressIndicatorSpec) abstractC6378a).f35704g / 2.0f) + ((CircularProgressIndicatorSpec) abstractC6378a).f35705h;
        canvas.translate(f12, f12);
        canvas.rotate(-90.0f);
        float f13 = -f12;
        canvas.clipRect(f13, f13, f12, f12);
        if (((CircularProgressIndicatorSpec) this.f35759a).f35706i == 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        this.f35717c = i11;
        this.f35718d = ((CircularProgressIndicatorSpec) r5).f35711a * f11;
        this.f35719e = ((CircularProgressIndicatorSpec) r5).f35712b * f11;
        this.f35720f = (((CircularProgressIndicatorSpec) r5).f35704g - ((CircularProgressIndicatorSpec) r5).f35711a) / 2.0f;
        if ((this.f35760b.mo32780k() && ((CircularProgressIndicatorSpec) this.f35759a).f35715e == 2) || (this.f35760b.mo32779j() && ((CircularProgressIndicatorSpec) this.f35759a).f35716f == 1)) {
            this.f35720f += ((1.0f - f11) * ((CircularProgressIndicatorSpec) this.f35759a).f35711a) / 2.0f;
        } else if ((this.f35760b.mo32780k() && ((CircularProgressIndicatorSpec) this.f35759a).f35715e == 1) || (this.f35760b.mo32779j() && ((CircularProgressIndicatorSpec) this.f35759a).f35716f == 2)) {
            this.f35720f -= ((1.0f - f11) * ((CircularProgressIndicatorSpec) this.f35759a).f35711a) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC6383f
    /* renamed from: b */
    public void mo32743b(Canvas canvas, Paint paint, float f11, float f12, int i11) {
        float f13;
        if (f11 == f12) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i11);
        paint.setStrokeWidth(this.f35718d);
        int i12 = this.f35717c;
        float f14 = f11 * 360.0f * i12;
        if (f12 >= f11) {
            f13 = f12 - f11;
        } else {
            f13 = (f12 + 1.0f) - f11;
        }
        float f15 = f13 * 360.0f * i12;
        float f16 = this.f35720f;
        canvas.drawArc(new RectF(-f16, -f16, f16, f16), f14, f15, false, paint);
        if (this.f35719e > 0.0f && Math.abs(f15) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            float f17 = this.f35719e;
            RectF rectF = new RectF(-f17, -f17, f17, f17);
            m32740h(canvas, paint, this.f35718d, this.f35719e, f14, true, rectF);
            m32740h(canvas, paint, this.f35718d, this.f35719e, f14 + f15, false, rectF);
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC6383f
    /* renamed from: c */
    public void mo32744c(Canvas canvas, Paint paint) {
        int m130291a = AbstractC25136a.m130291a(((CircularProgressIndicatorSpec) this.f35759a).f35714d, this.f35760b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(m130291a);
        paint.setStrokeWidth(this.f35718d);
        float f11 = this.f35720f;
        canvas.drawArc(new RectF(-f11, -f11, f11, f11), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6383f
    /* renamed from: d */
    public int mo32745d() {
        return m32741i();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6383f
    /* renamed from: e */
    public int mo32746e() {
        return m32741i();
    }
}
