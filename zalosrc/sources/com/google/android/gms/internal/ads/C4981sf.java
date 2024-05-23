package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sf */
/* loaded from: classes2.dex */
public final class C4981sf extends AbstractCallableC4316ag {

    /* renamed from: i */
    private final StackTraceElement[] f27660i;

    public C4981sf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12, StackTraceElement[] stackTraceElementArr) {
        super(c4719le, "d2tnKFzXPwiZyQGi+81r0jKuUmc/wF2bs8mf3rZLUgisIeswnimQDm/skPYjpEo4", "e/DvqiTz4SkFtBEBn/3V8Pr2h2slHO4xuLOBAItCJ4w=", c4939ra, i11, 45);
        this.f27660i = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        StackTraceElement[] stackTraceElementArr = this.f27660i;
        if (stackTraceElementArr != null) {
            int i11 = 1;
            C4424de c4424de = new C4424de((String) this.f17025f.invoke(null, stackTraceElementArr));
            synchronized (this.f17024e) {
                try {
                    this.f17024e.m26048w(c4424de.f19187a.longValue());
                    if (c4424de.f19188b.booleanValue()) {
                        C4939ra c4939ra = this.f17024e;
                        if (true != c4424de.f19189c.booleanValue()) {
                            i11 = 2;
                        }
                        c4939ra.m26023a0(i11);
                    } else {
                        this.f17024e.m26023a0(3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
