package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p342m6.InterfaceC22874c;

/* loaded from: classes2.dex */
public final class xz2 {

    /* renamed from: e */
    private static volatile int f30700e = 1;

    /* renamed from: f */
    public static final /* synthetic */ int f30701f = 0;

    /* renamed from: a */
    private final Context f30702a;

    /* renamed from: b */
    private final Executor f30703b;

    /* renamed from: c */
    private final AbstractC22888j f30704c;

    /* renamed from: d */
    private final boolean f30705d;

    xz2(Context context, Executor executor, AbstractC22888j abstractC22888j, boolean z11) {
        this.f30702a = context;
        this.f30703b = executor;
        this.f30704c = abstractC22888j;
        this.f30705d = z11;
    }

    /* renamed from: a */
    public static xz2 m28090a(final Context context, Executor executor, boolean z11) {
        final C22890k c22890k = new C22890k();
        if (z11) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tz2
                @Override // java.lang.Runnable
                public final void run() {
                    c22890k.m117596c(t13.m26534b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uz2
                @Override // java.lang.Runnable
                public final void run() {
                    C22890k.this.m117596c(t13.m26535c());
                }
            });
        }
        return new xz2(context, executor, c22890k.m117594a(), z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m28091g(int i11) {
        f30700e = i11;
    }

    /* renamed from: h */
    private final AbstractC22888j m28092h(final int i11, long j11, Exception exc, String str, Map map, String str2) {
        if (!this.f30705d) {
            return this.f30704c.mo117579h(this.f30703b, new InterfaceC22874c() { // from class: com.google.android.gms.internal.ads.vz2
                @Override // p342m6.InterfaceC22874c
                /* renamed from: a */
                public final Object mo27439a(AbstractC22888j abstractC22888j) {
                    return Boolean.valueOf(abstractC22888j.mo117588q());
                }
            });
        }
        final C4383ca m22747F = C4568ha.m22747F();
        m22747F.m20843q(this.f30702a.getPackageName());
        m22747F.m20847v(j11);
        m22747F.m20849x(f30700e);
        if (exc != null) {
            m22747F.m20848w(b63.m20413a(exc));
            m22747F.m20846u(exc.getClass().getName());
        }
        if (str2 != null) {
            m22747F.m20844r(str2);
        }
        if (str != null) {
            m22747F.m20845s(str);
        }
        return this.f30704c.mo117579h(this.f30703b, new InterfaceC22874c() { // from class: com.google.android.gms.internal.ads.wz2
            @Override // p342m6.InterfaceC22874c
            /* renamed from: a */
            public final Object mo27439a(AbstractC22888j abstractC22888j) {
                C4383ca c4383ca = C4383ca.this;
                int i12 = i11;
                int i13 = xz2.f30701f;
                if (abstractC22888j.mo117588q()) {
                    s13 m26536a = ((t13) abstractC22888j.mo117584m()).m26536a(((C4568ha) c4383ca.m25898n()).mo27346a());
                    m26536a.m26221a(i12);
                    m26536a.m26223c();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });
    }

    /* renamed from: b */
    public final AbstractC22888j m28093b(int i11, String str) {
        return m28092h(i11, 0L, null, null, null, str);
    }

    /* renamed from: c */
    public final AbstractC22888j m28094c(int i11, long j11, Exception exc) {
        return m28092h(i11, j11, exc, null, null, null);
    }

    /* renamed from: d */
    public final AbstractC22888j m28095d(int i11, long j11) {
        return m28092h(i11, j11, null, null, null, null);
    }

    /* renamed from: e */
    public final AbstractC22888j m28096e(int i11, long j11, String str) {
        return m28092h(i11, j11, null, null, null, str);
    }

    /* renamed from: f */
    public final AbstractC22888j m28097f(int i11, long j11, String str, Map map) {
        return m28092h(i11, j11, null, str, null, null);
    }
}
