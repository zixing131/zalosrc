package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class wr3 implements ds3 {
    @Override // com.google.android.gms.internal.ads.ds3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20232a(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
