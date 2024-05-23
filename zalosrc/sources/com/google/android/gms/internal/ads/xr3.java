package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes2.dex */
public final class xr3 implements ds3 {
    @Override // com.google.android.gms.internal.ads.ds3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20232a(String str, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
