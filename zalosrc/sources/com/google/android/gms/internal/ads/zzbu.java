package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzbu extends IOException {

    /* renamed from: p */
    public final boolean f31925p;

    /* renamed from: q */
    public final int f31926q;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbu(String str, Throwable th2, boolean z11, int i11) {
        super(str, th2);
        this.f31925p = z11;
        this.f31926q = i11;
    }

    /* renamed from: a */
    public static zzbu m28711a(String str, Throwable th2) {
        return new zzbu(str, th2, true, 1);
    }

    /* renamed from: b */
    public static zzbu m28712b(String str, Throwable th2) {
        return new zzbu(str, th2, true, 0);
    }

    /* renamed from: c */
    public static zzbu m28713c(String str) {
        return new zzbu(str, null, false, 1);
    }
}
