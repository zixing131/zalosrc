package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
final class wg3 extends ThreadLocal {
    /* renamed from: a */
    protected static final Cipher m27607a() {
        try {
            return (Cipher) vr3.f29467e.m27341a("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return m27607a();
    }
}
