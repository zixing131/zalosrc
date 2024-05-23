package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;

/* renamed from: com.google.android.material.progressindicator.h */
/* loaded from: classes3.dex */
public final class C6385h extends AbstractC6382e {

    /* renamed from: E */
    private AbstractC6383f f35764E;

    /* renamed from: F */
    private AbstractC6384g f35765F;

    C6385h(Context context, AbstractC6378a abstractC6378a, AbstractC6383f abstractC6383f, AbstractC6384g abstractC6384g) {
        super(context, abstractC6378a);
        m32812x(abstractC6383f);
        m32811w(abstractC6384g);
    }

    /* renamed from: s */
    public static C6385h m32807s(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new C6385h(context, circularProgressIndicatorSpec, new C6379b(circularProgressIndicatorSpec), new C6380c(circularProgressIndicatorSpec));
    }

    /* renamed from: t */
    public static C6385h m32808t(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        AbstractC6384g c6388k;
        C6386i c6386i = new C6386i(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.f35708g == 0) {
            c6388k = new C6387j(linearProgressIndicatorSpec);
        } else {
            c6388k = new C6388k(context, linearProgressIndicatorSpec);
        }
        return new C6385h(context, linearProgressIndicatorSpec, c6386i, c6388k);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e, androidx.vectordrawable.graphics.drawable.InterfaceC2038b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo11040a(InterfaceC2038b.a aVar) {
        super.mo11040a(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f35764E.m32804g(canvas, m32799h());
            this.f35764E.mo32744c(canvas, this.f35744B);
            int i11 = 0;
            while (true) {
                AbstractC6384g abstractC6384g = this.f35765F;
                int[] iArr = abstractC6384g.f35763c;
                if (i11 < iArr.length) {
                    AbstractC6383f abstractC6383f = this.f35764E;
                    Paint paint = this.f35744B;
                    float[] fArr = abstractC6384g.f35762b;
                    int i12 = i11 * 2;
                    abstractC6383f.mo32743b(canvas, paint, fArr[i12], fArr[i12 + 1], iArr[i11]);
                    i11++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f35764E.mo32745d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f35764E.mo32746e();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo32778i() {
        return super.mo32778i();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo32779j() {
        return super.mo32779j();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e
    /* renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo32780k() {
        return super.mo32780k();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e
    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo32781p(boolean z11, boolean z12, boolean z13) {
        return super.mo32781p(z11, z12, z13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC6382e
    /* renamed from: q */
    public boolean mo32782q(boolean z11, boolean z12, boolean z13) {
        boolean mo32782q = super.mo32782q(z11, z12, z13);
        if (!isRunning()) {
            this.f35765F.mo32759a();
        }
        float m140783a = this.f35748r.m140783a(this.f35746p.getContentResolver());
        if (z11 && (z13 || (Build.VERSION.SDK_INT <= 21 && m140783a > 0.0f))) {
            this.f35765F.mo32763g();
        }
        return mo32782q;
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e
    /* renamed from: r */
    public /* bridge */ /* synthetic */ boolean mo32783r(InterfaceC2038b.a aVar) {
        return super.mo32783r(aVar);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i11) {
        super.setAlpha(i11);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z11, boolean z12) {
        return super.setVisible(z11, z12);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public AbstractC6384g m32809u() {
        return this.f35765F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public AbstractC6383f m32810v() {
        return this.f35764E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m32811w(AbstractC6384g abstractC6384g) {
        this.f35765F = abstractC6384g;
        abstractC6384g.m32806e(this);
    }

    /* renamed from: x */
    void m32812x(AbstractC6383f abstractC6383f) {
        this.f35764E = abstractC6383f;
        abstractC6383f.m32803f(this);
    }
}
