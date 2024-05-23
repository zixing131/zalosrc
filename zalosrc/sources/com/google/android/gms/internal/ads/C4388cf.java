package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cf */
/* loaded from: classes2.dex */
public final class C4388cf extends AbstractCallableC4316ag {
    public C4388cf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "C6OPKdOx6rUdfDdOmaUimt8yM1FrOv7bKCITdJ0Uo74WwXDfvXouJ4oz4kHBjTSk", "dTWRHHPyYq/fNXOTAS/wjayGzv2SlrSwyDcB+vX+h5Q=", c4939ra, i11, 5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        this.f17024e.m26040r0(-1L);
        this.f17024e.m26038q0(-1L);
        int[] iArr = (int[]) this.f17025f.invoke(null, this.f17021b.m24240b());
        synchronized (this.f17024e) {
            try {
                this.f17024e.m26040r0(iArr[0]);
                this.f17024e.m26038q0(iArr[1]);
                int i11 = iArr[2];
                if (i11 != Integer.MIN_VALUE) {
                    this.f17024e.m26036p0(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
