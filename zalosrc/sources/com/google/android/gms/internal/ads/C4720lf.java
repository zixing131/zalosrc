package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lf */
/* loaded from: classes2.dex */
public final class C4720lf extends AbstractCallableC4316ag {

    /* renamed from: i */
    private final C4942rd f23898i;

    /* renamed from: j */
    private final long f23899j;

    /* renamed from: k */
    private final long f23900k;

    public C4720lf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12, C4942rd c4942rd, long j11, long j12) {
        super(c4719le, "X9PgbTHLX0FFxbl3gdPDuVwcglfXy5CDrzo8siaVNaH+OIJ6JI34Wu3QK5rLega4", "JLulXGPEHVwHK+0FG96HP9my+NvwpTQbwIaIZrjn9OU=", c4939ra, i11, 11);
        this.f23898i = c4942rd;
        this.f23899j = j11;
        this.f23900k = j12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        C4942rd c4942rd = this.f23898i;
        if (c4942rd != null) {
            C4868pd c4868pd = new C4868pd((String) this.f17025f.invoke(null, c4942rd.m26071b(), Long.valueOf(this.f23899j), Long.valueOf(this.f23900k)));
            synchronized (this.f17024e) {
                try {
                    this.f17024e.m26007E0(c4868pd.f26166a.longValue());
                    if (c4868pd.f26167b.longValue() >= 0) {
                        this.f17024e.m26010I(c4868pd.f26167b.longValue());
                    }
                    if (c4868pd.f26168c.longValue() >= 0) {
                        this.f17024e.m26031j0(c4868pd.f26168c.longValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
