package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.df */
/* loaded from: classes2.dex */
public final class C4425df extends AbstractCallableC4316ag {

    /* renamed from: i */
    private static volatile Long f19201i;

    /* renamed from: j */
    private static final Object f19202j = new Object();

    public C4425df(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "XFxH1z0dBuMDP7aWA+P/3WKwW9qr8sC2ASjEfciaKHfSLryjCNl4cmJgfsh2Tylb", "r0MNv9zqwvoUwASL1pBJjOA1OkDa8Kcs5NaA6VOkJEI=", c4939ra, i11, 44);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        if (f19201i == null) {
            synchronized (f19202j) {
                try {
                    if (f19201i == null) {
                        f19201i = (Long) this.f17025f.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f17024e) {
            this.f17024e.m26043t0(f19201i.longValue());
        }
    }
}
