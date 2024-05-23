package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzasi extends Exception {
    private zzasi(int i11, String str, Throwable th2, int i12) {
        super(null, th2);
    }

    /* renamed from: a */
    public static zzasi m28676a(Exception exc, int i11) {
        return new zzasi(1, null, exc, i11);
    }

    /* renamed from: b */
    public static zzasi m28677b(IOException iOException) {
        return new zzasi(0, null, iOException, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static zzasi m28678c(RuntimeException runtimeException) {
        return new zzasi(2, null, runtimeException, -1);
    }
}
