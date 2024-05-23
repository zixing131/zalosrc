package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
final class jk3 extends nj3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public jk3(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.nj3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20120a(zv3 zv3Var) {
        mo3 mo3Var = (mo3) zv3Var;
        int m26383K = mo3Var.m24662K().m26383K();
        SecretKeySpec secretKeySpec = new SecretKeySpec(mo3Var.m24663L().m24738k(), "HMAC");
        int m26382F = mo3Var.m24662K().m26382F();
        int i11 = m26383K - 2;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return new ks3(new js3("HMACSHA224", secretKeySpec), m26382F);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new ks3(new js3("HMACSHA512", secretKeySpec), m26382F);
                }
                return new ks3(new js3("HMACSHA256", secretKeySpec), m26382F);
            }
            return new ks3(new js3("HMACSHA384", secretKeySpec), m26382F);
        }
        return new ks3(new js3("HMACSHA1", secretKeySpec), m26382F);
    }
}
