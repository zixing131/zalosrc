package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class qi3 {

    /* renamed from: a */
    private final pd3 f26795a;

    /* renamed from: b */
    private final vd3 f26796b;

    public qi3(pd3 pd3Var) {
        this.f26795a = pd3Var;
        this.f26796b = null;
    }

    /* renamed from: a */
    public final byte[] m25717a(byte[] bArr, byte[] bArr2) {
        pd3 pd3Var = this.f26795a;
        if (pd3Var != null) {
            return pd3Var.mo22154b(bArr, bArr2);
        }
        return this.f26796b.mo21715a(bArr, bArr2);
    }

    public qi3(vd3 vd3Var) {
        this.f26795a = null;
        this.f26796b = vd3Var;
    }
}
