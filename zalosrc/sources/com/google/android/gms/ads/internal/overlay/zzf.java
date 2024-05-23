package com.google.android.gms.ads.internal.overlay;

/* loaded from: classes2.dex */
final class zzf extends Exception {
    public zzf(String str) {
        super(str);
    }

    public zzf(String str, Throwable th2) {
        super("Could not obtain webview for the overlay.", th2);
    }
}
