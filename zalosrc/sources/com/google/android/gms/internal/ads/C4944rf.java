package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rf */
/* loaded from: classes2.dex */
public final class C4944rf extends AbstractCallableC4316ag {

    /* renamed from: i */
    private final boolean f27181i;

    public C4944rf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "RjfRn/7K/Mx2/M8Fl6a7u1D5niklht4X0VG1cOixOa4SuaPG6Qd7la4v6f0IM/MO", "cZ2qwY2ZIJRch325gepGJtH7dQ9IcqmfWvaHdfiFi6Y=", c4939ra, i11, 61);
        this.f27181i = c4719le.m24254s();
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        long longValue = ((Long) this.f17025f.invoke(null, this.f17021b.m24240b(), Boolean.valueOf(this.f27181i))).longValue();
        synchronized (this.f17024e) {
            this.f17024e.m26046v(longValue);
        }
    }
}
