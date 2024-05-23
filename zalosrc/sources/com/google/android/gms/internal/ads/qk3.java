package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class qk3 implements oe3 {

    /* renamed from: a */
    private final ze3 f26830a;

    /* renamed from: b */
    private final vk3 f26831b;

    /* renamed from: c */
    private final vk3 f26832c;

    public /* synthetic */ qk3(ze3 ze3Var, pk3 pk3Var) {
        vk3 vk3Var;
        this.f26830a = ze3Var;
        if (ze3Var.m28492f()) {
            wk3 m22030b = fj3.m22029a().m22030b();
            bl3 m20910a = cj3.m20910a(ze3Var);
            this.f26831b = m22030b.mo21731a(m20910a, "mac", "compute");
            vk3Var = m22030b.mo21731a(m20910a, "mac", "verify");
        } else {
            vk3Var = cj3.f18452a;
            this.f26831b = vk3Var;
        }
        this.f26832c = vk3Var;
    }

    @Override // com.google.android.gms.internal.ads.oe3
    /* renamed from: a */
    public final void mo24026a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        Logger logger;
        byte[] bArr4;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (te3 te3Var : this.f26830a.m28491e(copyOf)) {
                if (te3Var.m26606f() == 4) {
                    bArr4 = rk3.f27292b;
                    bArr3 = jr3.m23728c(bArr2, bArr4);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((oe3) te3Var.m26603c()).mo24026a(copyOfRange, bArr3);
                    te3Var.m26601a();
                    return;
                } catch (GeneralSecurityException e11) {
                    logger = rk3.f27291a;
                    logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e11.toString()));
                }
            }
            for (te3 te3Var2 : this.f26830a.m28491e(ud3.f28839a)) {
                try {
                    ((oe3) te3Var2.m26603c()).mo24026a(bArr, bArr2);
                    te3Var2.m26601a();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    @Override // com.google.android.gms.internal.ads.oe3
    /* renamed from: b */
    public final byte[] mo24027b(byte[] bArr) {
        byte[] bArr2;
        if (this.f26830a.m28487a().m26606f() == 4) {
            bArr2 = rk3.f27292b;
            bArr = jr3.m23728c(bArr, bArr2);
        }
        byte[] m23728c = jr3.m23728c(this.f26830a.m28487a().m26604d(), ((oe3) this.f26830a.m28487a().m26603c()).mo24027b(bArr));
        this.f26830a.m28487a().m26601a();
        return m23728c;
    }
}
