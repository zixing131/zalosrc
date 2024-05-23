package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes2.dex */
public final class yr3 implements ds3 {
    @Override // com.google.android.gms.internal.ads.ds3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20232a(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
