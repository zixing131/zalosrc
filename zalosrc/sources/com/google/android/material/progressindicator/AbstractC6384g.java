package com.google.android.material.progressindicator;

import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;

/* renamed from: com.google.android.material.progressindicator.g */
/* loaded from: classes3.dex */
public abstract class AbstractC6384g {

    /* renamed from: a */
    protected C6385h f35761a;

    /* renamed from: b */
    protected final float[] f35762b;

    /* renamed from: c */
    protected final int[] f35763c;

    public AbstractC6384g(int i11) {
        this.f35762b = new float[i11 * 2];
        this.f35763c = new int[i11];
    }

    /* renamed from: a */
    public abstract void mo32759a();

    /* renamed from: b */
    public float m32805b(int i11, int i12, int i13) {
        return (i11 - i12) / i13;
    }

    /* renamed from: c */
    public abstract void mo32760c();

    /* renamed from: d */
    public abstract void mo32761d(InterfaceC2038b.a aVar);

    /* renamed from: e */
    public void m32806e(C6385h c6385h) {
        this.f35761a = c6385h;
    }

    /* renamed from: f */
    public abstract void mo32762f();

    /* renamed from: g */
    public abstract void mo32763g();

    /* renamed from: h */
    public abstract void mo32764h();
}
