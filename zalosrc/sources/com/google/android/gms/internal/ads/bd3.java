package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class bd3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20479a(Throwable th2) {
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
