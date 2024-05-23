package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class if3 implements pd3 {

    /* renamed from: a */
    private final ze3 f22168a;

    /* renamed from: b */
    private final vk3 f22169b;

    /* renamed from: c */
    private final vk3 f22170c;

    public /* synthetic */ if3(ze3 ze3Var, hf3 hf3Var) {
        vk3 vk3Var;
        this.f22168a = ze3Var;
        if (ze3Var.m28492f()) {
            wk3 m22030b = fj3.m22029a().m22030b();
            bl3 m20910a = cj3.m20910a(ze3Var);
            this.f22169b = m22030b.mo21731a(m20910a, "aead", "encrypt");
            vk3Var = m22030b.mo21731a(m20910a, "aead", "decrypt");
        } else {
            vk3Var = cj3.f18452a;
            this.f22169b = vk3Var;
        }
        this.f22170c = vk3Var;
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: a */
    public final byte[] mo22153a(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (te3 te3Var : this.f22168a.m28491e(copyOf)) {
                try {
                    byte[] mo22153a = ((pd3) te3Var.m26603c()).mo22153a(copyOfRange, bArr2);
                    te3Var.m26601a();
                    int length2 = copyOfRange.length;
                    return mo22153a;
                } catch (GeneralSecurityException e11) {
                    logger = jf3.f22801a;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e11.toString()));
                }
            }
        }
        for (te3 te3Var2 : this.f22168a.m28491e(ud3.f28839a)) {
            try {
                byte[] mo22153a2 = ((pd3) te3Var2.m26603c()).mo22153a(bArr, bArr2);
                te3Var2.m26601a();
                return mo22153a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: b */
    public final byte[] mo22154b(byte[] bArr, byte[] bArr2) {
        byte[] m23728c = jr3.m23728c(this.f22168a.m28487a().m26604d(), ((pd3) this.f22168a.m28487a().m26603c()).mo22154b(bArr, bArr2));
        this.f22168a.m28487a().m26601a();
        int length = bArr.length;
        return m23728c;
    }
}
