package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.ag */
/* loaded from: classes2.dex */
public abstract class AbstractCallableC4316ag implements Callable {

    /* renamed from: a */
    protected final String f17020a = getClass().getSimpleName();

    /* renamed from: b */
    protected final C4719le f17021b;

    /* renamed from: c */
    protected final String f17022c;

    /* renamed from: d */
    protected final String f17023d;

    /* renamed from: e */
    protected final C4939ra f17024e;

    /* renamed from: f */
    protected Method f17025f;

    /* renamed from: g */
    protected final int f17026g;

    /* renamed from: h */
    protected final int f17027h;

    public AbstractCallableC4316ag(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        this.f17021b = c4719le;
        this.f17022c = str;
        this.f17023d = str2;
        this.f17024e = c4939ra;
        this.f17026g = i11;
        this.f17027h = i12;
    }

    /* renamed from: a */
    protected abstract void mo20111a();

    /* renamed from: b */
    public Void mo20112b() {
        long nanoTime;
        Method m24247j;
        int i11;
        try {
            nanoTime = System.nanoTime();
            m24247j = this.f17021b.m24247j(this.f17022c, this.f17023d);
            this.f17025f = m24247j;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (m24247j == null) {
            return null;
        }
        mo20111a();
        C4608id m24242d = this.f17021b.m24242d();
        if (m24242d != null && (i11 = this.f17026g) != Integer.MIN_VALUE) {
            m24242d.m23227c(this.f17027h, i11, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        mo20112b();
        return null;
    }
}
