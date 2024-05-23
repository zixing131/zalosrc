package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class pe3 {
    /* renamed from: a */
    public static final ke3 m25426a(byte[] bArr) {
        try {
            xp3 m27969K = xp3.m27969K(bArr, gu3.m22615a());
            for (wp3 wp3Var : m27969K.m27974L()) {
                if (wp3Var.m27684G().m23719M() == 2 || wp3Var.m27684G().m23719M() == 3 || wp3Var.m27684G().m23719M() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return ke3.m23930a(m27969K);
        } catch (zzgrq unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
