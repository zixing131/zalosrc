package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.mo */
/* loaded from: classes2.dex */
public final class C4767mo implements InterfaceC4508fo {

    /* renamed from: a */
    private boolean f24677a;

    /* renamed from: b */
    private long f24678b;

    /* renamed from: c */
    private long f24679c;

    /* renamed from: d */
    private C4722lh f24680d = C4722lh.f23914d;

    /* renamed from: a */
    public final void m24650a(long j11) {
        this.f24678b = j11;
        if (this.f24677a) {
            this.f24679c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void m24651b() {
        if (!this.f24677a) {
            this.f24679c = SystemClock.elapsedRealtime();
            this.f24677a = true;
        }
    }

    /* renamed from: c */
    public final void m24652c() {
        if (this.f24677a) {
            m24650a(mo22104m());
            this.f24677a = false;
        }
    }

    /* renamed from: d */
    public final void m24653d(InterfaceC4508fo interfaceC4508fo) {
        m24650a(interfaceC4508fo.mo22104m());
        this.f24680d = interfaceC4508fo.mo22103h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4508fo
    /* renamed from: h */
    public final C4722lh mo22103h() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4508fo
    /* renamed from: m */
    public final long mo22104m() {
        long m24289a;
        long j11 = this.f24678b;
        if (this.f24677a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f24679c;
            C4722lh c4722lh = this.f24680d;
            if (c4722lh.f23915a == 1.0f) {
                m24289a = AbstractC5093vg.m27218a(elapsedRealtime);
            } else {
                m24289a = c4722lh.m24289a(elapsedRealtime);
            }
            return j11 + m24289a;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4508fo
    /* renamed from: q */
    public final C4722lh mo22105q(C4722lh c4722lh) {
        if (this.f24677a) {
            m24650a(mo22104m());
        }
        this.f24680d = c4722lh;
        return c4722lh;
    }
}
