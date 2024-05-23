package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p439q6.AbstractC25136a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.i */
/* loaded from: classes3.dex */
public final class C6386i extends AbstractC6383f {

    /* renamed from: c */
    private float f35766c;

    /* renamed from: d */
    private float f35767d;

    /* renamed from: e */
    private float f35768e;

    public C6386i(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f35766c = 300.0f;
    }

    /* renamed from: h */
    private static void m32813h(Canvas canvas, Paint paint, float f11, float f12, float f13, boolean z11, RectF rectF) {
        canvas.save();
        canvas.translate(f13, 0.0f);
        if (!z11) {
            canvas.rotate(180.0f);
        }
        float f14 = ((-f11) / 2.0f) + f12;
        float f15 = (f11 / 2.0f) - f12;
        canvas.drawRect(-f12, f14, 0.0f, f15, paint);
        canvas.save();
        canvas.translate(0.0f, f14);
        canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
        canvas.restore();
        canvas.translate(0.0f, f15);
        canvas.drawArc(rectF, 180.0f, -90.0f, true, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6383f
    /* renamed from: a */
    public void mo32742a(Canvas canvas, float f11) {
        Rect clipBounds = canvas.getClipBounds();
        this.f35766c = clipBounds.width();
        float f12 = ((LinearProgressIndicatorSpec) this.f35759a).f35711a;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((LinearProgressIndicatorSpec) this.f35759a).f35711a) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f35759a).f35710i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f35760b.mo32780k() && ((LinearProgressIndicatorSpec) this.f35759a).f35715e == 1) || (this.f35760b.mo32779j() && ((LinearProgressIndicatorSpec) this.f35759a).f35716f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f35760b.mo32780k() || this.f35760b.mo32779j()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f35759a).f35711a * (f11 - 1.0f)) / 2.0f);
        }
        float f13 = this.f35766c;
        canvas.clipRect((-f13) / 2.0f, (-f12) / 2.0f, f13 / 2.0f, f12 / 2.0f);
        AbstractC6378a abstractC6378a = this.f35759a;
        this.f35767d = ((LinearProgressIndicatorSpec) abstractC6378a).f35711a * f11;
        this.f35768e = ((LinearProgressIndicatorSpec) abstractC6378a).f35712b * f11;
    }

    @Override // com.google.android.material.progressindicator.AbstractC6383f
    /* renamed from: b */
    public void mo32743b(Canvas canvas, Paint paint, float f11, float f12, int i11) {
        if (f11 == f12) {
            return;
        }
        float f13 = this.f35766c;
        float f14 = this.f35768e;
        float f15 = ((-f13) / 2.0f) + f14 + ((f13 - (f14 * 2.0f)) * f11);
        float f16 = ((-f13) / 2.0f) + f14 + ((f13 - (f14 * 2.0f)) * f12);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i11);
        float f17 = this.f35767d;
        canvas.drawRect(f15, (-f17) / 2.0f, f16, f17 / 2.0f, paint);
        float f18 = this.f35768e;
        RectF rectF = new RectF(-f18, -f18, f18, f18);
        m32813h(canvas, paint, this.f35767d, this.f35768e, f15, true, rectF);
        m32813h(canvas, paint, this.f35767d, this.f35768e, f16, false, rectF);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6383f
    /* renamed from: c */
    public void mo32744c(Canvas canvas, Paint paint) {
        int m130291a = AbstractC25136a.m130291a(((LinearProgressIndicatorSpec) this.f35759a).f35714d, this.f35760b.getAlpha());
        float f11 = ((-this.f35766c) / 2.0f) + this.f35768e;
        float f12 = -f11;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(m130291a);
        float f13 = this.f35767d;
        canvas.drawRect(f11, (-f13) / 2.0f, f12, f13 / 2.0f, paint);
        float f14 = this.f35768e;
        RectF rectF = new RectF(-f14, -f14, f14, f14);
        m32813h(canvas, paint, this.f35767d, this.f35768e, f11, true, rectF);
        m32813h(canvas, paint, this.f35767d, this.f35768e, f12, false, rectF);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6383f
    /* renamed from: d */
    public int mo32745d() {
        return ((LinearProgressIndicatorSpec) this.f35759a).f35711a;
    }

    @Override // com.google.android.material.progressindicator.AbstractC6383f
    /* renamed from: e */
    public int mo32746e() {
        return -1;
    }
}
