package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class eh3 implements vd3 {

    /* renamed from: a */
    private final ze3 f19635a;

    /* renamed from: b */
    private final vk3 f19636b;

    /* renamed from: c */
    private final vk3 f19637c;

    public eh3(ze3 ze3Var) {
        vk3 vk3Var;
        this.f19635a = ze3Var;
        if (ze3Var.m28492f()) {
            wk3 m22030b = fj3.m22029a().m22030b();
            bl3 m20910a = cj3.m20910a(ze3Var);
            this.f19636b = m22030b.mo21731a(m20910a, "daead", "encrypt");
            vk3Var = m22030b.mo21731a(m20910a, "daead", "decrypt");
        } else {
            vk3Var = cj3.f18452a;
            this.f19636b = vk3Var;
        }
        this.f19637c = vk3Var;
    }

    @Override // com.google.android.gms.internal.ads.vd3
    /* renamed from: a */
    public final byte[] mo21715a(byte[] bArr, byte[] bArr2) {
        byte[] m23728c = jr3.m23728c(this.f19635a.m28487a().m26604d(), ((vd3) this.f19635a.m28487a().m26603c()).mo21715a(bArr, bArr2));
        this.f19635a.m28487a().m26601a();
        int length = bArr.length;
        return m23728c;
    }
}
