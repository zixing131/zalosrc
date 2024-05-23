package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.google.android.material.progressindicator.f */
/* loaded from: classes3.dex */
abstract class AbstractC6383f {

    /* renamed from: a */
    AbstractC6378a f35759a;

    /* renamed from: b */
    protected AbstractC6382e f35760b;

    public AbstractC6383f(AbstractC6378a abstractC6378a) {
        this.f35759a = abstractC6378a;
    }

    /* renamed from: a */
    abstract void mo32742a(Canvas canvas, float f11);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo32743b(Canvas canvas, Paint paint, float f11, float f12, int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo32744c(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo32745d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo32746e();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m32803f(AbstractC6382e abstractC6382e) {
        this.f35760b = abstractC6382e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m32804g(Canvas canvas, float f11) {
        this.f35759a.mo32733e();
        mo32742a(canvas, f11);
    }
}
