package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;
import p434q1.AbstractC24980c;
import p434q1.C24981d;
import p434q1.C24982e;
import p439q6.AbstractC25136a;

/* renamed from: com.google.android.material.progressindicator.d */
/* loaded from: classes3.dex */
public final class C6381d extends AbstractC6382e {

    /* renamed from: J */
    private static final AbstractC24980c f35736J = new a("indicatorLevel");

    /* renamed from: E */
    private AbstractC6383f f35737E;

    /* renamed from: F */
    private final C24982e f35738F;

    /* renamed from: G */
    private final C24981d f35739G;

    /* renamed from: H */
    private float f35740H;

    /* renamed from: I */
    private boolean f35741I;

    /* renamed from: com.google.android.material.progressindicator.d$a */
    /* loaded from: classes3.dex */
    static class a extends AbstractC24980c {
        a(String str) {
            super(str);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c */
        public float mo32786a(C6381d c6381d) {
            return c6381d.m32775x() * 10000.0f;
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d */
        public void mo32787b(C6381d c6381d, float f11) {
            c6381d.m32776z(f11 / 10000.0f);
        }
    }

    C6381d(Context context, AbstractC6378a abstractC6378a, AbstractC6383f abstractC6383f) {
        super(context, abstractC6378a);
        this.f35741I = false;
        m32785y(abstractC6383f);
        C24982e c24982e = new C24982e();
        this.f35738F = c24982e;
        c24982e.m129742d(1.0f);
        c24982e.m129744f(50.0f);
        C24981d c24981d = new C24981d(this, f35736J);
        this.f35739G = c24981d;
        c24981d.m129738p(c24982e);
        m32800m(1.0f);
    }

    /* renamed from: u */
    public static C6381d m32773u(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new C6381d(context, circularProgressIndicatorSpec, new C6379b(circularProgressIndicatorSpec));
    }

    /* renamed from: v */
    public static C6381d m32774v(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new C6381d(context, linearProgressIndicatorSpec, new C6386i(linearProgressIndicatorSpec));
    }

    /* renamed from: x */
    public float m32775x() {
        return this.f35740H;
    }

    /* renamed from: z */
    public void m32776z(float f11) {
        this.f35740H = f11;
        invalidateSelf();
    }

    /* renamed from: A */
    public void m32777A(float f11) {
        setLevel((int) (f11 * 10000.0f));
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
            this.f35737E.m32804g(canvas, m32799h());
            this.f35737E.mo32744c(canvas, this.f35744B);
            this.f35737E.mo32743b(canvas, this.f35744B, 0.0f, m32775x(), AbstractC25136a.m130291a(this.f35747q.f35713c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f35737E.mo32745d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f35737E.mo32746e();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f35739G.m129700b();
        m32776z(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e
    /* renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo32780k() {
        return super.mo32780k();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        if (this.f35741I) {
            this.f35739G.m129700b();
            m32776z(i11 / 10000.0f);
            return true;
        }
        this.f35739G.m129704i(m32775x() * 10000.0f);
        this.f35739G.m129736m(i11);
        return true;
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e
    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo32781p(boolean z11, boolean z12, boolean z13) {
        return super.mo32781p(z11, z12, z13);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6382e
    /* renamed from: q */
    public boolean mo32782q(boolean z11, boolean z12, boolean z13) {
        boolean mo32782q = super.mo32782q(z11, z12, z13);
        float m140783a = this.f35748r.m140783a(this.f35746p.getContentResolver());
        if (m140783a == 0.0f) {
            this.f35741I = true;
        } else {
            this.f35741I = false;
            this.f35738F.m129744f(50.0f / m140783a);
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

    /* renamed from: w */
    public AbstractC6383f m32784w() {
        return this.f35737E;
    }

    /* renamed from: y */
    void m32785y(AbstractC6383f abstractC6383f) {
        this.f35737E = abstractC6383f;
        abstractC6383f.m32803f(this);
    }
}
