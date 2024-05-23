package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.play_billing.y */
/* loaded from: classes2.dex */
public abstract class AbstractC5868y implements InterfaceC5775i2 {
    protected int zza = 0;

    /* renamed from: b */
    public abstract int mo30283b(InterfaceC5835s2 interfaceC5835s2);

    /* renamed from: c */
    public final byte[] m30565c() {
        try {
            int zze = zze();
            byte[] bArr = new byte[zze];
            AbstractC5845u0 m30482A = AbstractC5845u0.m30482A(bArr, 0, zze);
            mo30282a(m30482A);
            m30482A.m30490a();
            return bArr;
        } catch (IOException e11) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e11);
        }
    }
}
