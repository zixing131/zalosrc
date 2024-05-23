package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ef */
/* loaded from: classes2.dex */
public final class C4462ef extends AbstractCallableC4316ag {

    /* renamed from: i */
    private final long f19616i;

    public C4462ef(C4719le c4719le, String str, String str2, C4939ra c4939ra, long j11, int i11, int i12) {
        super(c4719le, "zwwnNjW/9dn+p0q/2u+mmA6XQB8+gtknmtJMKP3tBmoncBehPCILsKxRnck9yFjA", "vpqgk7W2OO4+emKKnTSxckIsP1c64LGVSWcdsnDvr3w=", c4939ra, i11, 25);
        this.f19616i = j11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        long longValue = ((Long) this.f17025f.invoke(null, new Object[0])).longValue();
        synchronized (this.f17024e) {
            try {
                this.f17024e.m26053y0(longValue);
                long j11 = this.f19616i;
                if (j11 != 0) {
                    this.f17024e.m26013O(longValue - j11);
                    this.f17024e.m26014P(this.f19616i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
