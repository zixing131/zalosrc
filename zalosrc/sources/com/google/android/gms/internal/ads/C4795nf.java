package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nf */
/* loaded from: classes2.dex */
public final class C4795nf extends AbstractCallableC4316ag {

    /* renamed from: i */
    private static volatile String f25168i;

    /* renamed from: j */
    private static final Object f25169j = new Object();

    public C4795nf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "Cv0JAL9ptzpRvgIi9AFTFGn0l5MhpPgpRN4VfZybymKMuiqBn9AG0bgJaX/QotAk", "/xONYRXeBwNZknPQ1yARx5KZSPQPbfL2mKAb1nbkf2s=", c4939ra, i11, 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        this.f17024e.m26039r("E");
        if (f25168i == null) {
            synchronized (f25169j) {
                try {
                    if (f25168i == null) {
                        f25168i = (String) this.f17025f.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f17024e) {
            this.f17024e.m26039r(f25168i);
        }
    }
}
