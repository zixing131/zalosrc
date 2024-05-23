package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a52 implements di1 {

    /* renamed from: b */
    private static final List f16937b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f16938a;

    public a52(Handler handler) {
        this.f16938a = handler;
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ void m19999i(z32 z32Var) {
        List list = f16937b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(z32Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    private static z32 m20000j() {
        z32 z32Var;
        List list = f16937b;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    z32Var = new z32(null);
                } else {
                    z32Var = (z32) list.remove(list.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z32Var;
    }

    @Override // com.google.android.gms.internal.ads.di1
    /* renamed from: a */
    public final dh1 mo20001a(int i11) {
        z32 m20000j = m20000j();
        m20000j.m28429a(this.f16938a.obtainMessage(i11), this);
        return m20000j;
    }

    @Override // com.google.android.gms.internal.ads.di1
    /* renamed from: b */
    public final dh1 mo20002b(int i11, Object obj) {
        z32 m20000j = m20000j();
        m20000j.m28429a(this.f16938a.obtainMessage(i11, obj), this);
        return m20000j;
    }

    @Override // com.google.android.gms.internal.ads.di1
    /* renamed from: c */
    public final void mo20003c(Object obj) {
        this.f16938a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.di1
    /* renamed from: d */
    public final boolean mo20004d(dh1 dh1Var) {
        return ((z32) dh1Var).m28430b(this.f16938a);
    }

    @Override // com.google.android.gms.internal.ads.di1
    /* renamed from: e */
    public final boolean mo20005e(Runnable runnable) {
        return this.f16938a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.di1
    /* renamed from: f */
    public final boolean mo20006f(int i11) {
        return this.f16938a.sendEmptyMessage(i11);
    }

    @Override // com.google.android.gms.internal.ads.di1
    /* renamed from: g */
    public final dh1 mo20007g(int i11, int i12, int i13) {
        z32 m20000j = m20000j();
        m20000j.m28429a(this.f16938a.obtainMessage(1, i12, i13), this);
        return m20000j;
    }

    @Override // com.google.android.gms.internal.ads.di1
    /* renamed from: h */
    public final boolean mo20008h(int i11, long j11) {
        return this.f16938a.sendEmptyMessageAtTime(2, j11);
    }

    @Override // com.google.android.gms.internal.ads.di1
    public final void zze(int i11) {
        this.f16938a.removeMessages(2);
    }

    @Override // com.google.android.gms.internal.ads.di1
    public final boolean zzf(int i11) {
        return this.f16938a.hasMessages(0);
    }
}
