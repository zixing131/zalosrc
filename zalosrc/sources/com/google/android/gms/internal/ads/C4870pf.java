package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.pf */
/* loaded from: classes2.dex */
public final class C4870pf extends AbstractCallableC4316ag {
    public C4870pf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "WepZYnT/MXyJE28LKN26NT6D3mAA2J2spDFApE1ixrQxTNXRg7wshW7BC/EU90LT", "sjYkfzJTuYKxh1jvZaP9n5dx9JGmzJotOUC/vdvgi4M=", c4939ra, i11, 73);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        try {
            int i11 = 1;
            boolean booleanValue = ((Boolean) this.f17025f.invoke(null, this.f17021b.m24240b())).booleanValue();
            C4939ra c4939ra = this.f17024e;
            if (true == booleanValue) {
                i11 = 2;
            }
            c4939ra.m26025c0(i11);
        } catch (InvocationTargetException unused) {
            this.f17024e.m26025c0(3);
        }
    }
}
