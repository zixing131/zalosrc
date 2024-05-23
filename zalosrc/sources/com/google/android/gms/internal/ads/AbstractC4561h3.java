package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h3 */
/* loaded from: classes2.dex */
abstract class AbstractC4561h3 {

    /* renamed from: a */
    public final int f21515a;

    public AbstractC4561h3(int i11) {
        this.f21515a = i11;
    }

    /* renamed from: a */
    public static int m22689a(int i11) {
        return (i11 >> 24) & 255;
    }

    /* renamed from: b */
    public static String m22690b(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) ((i11 >> 24) & 255));
        sb2.append((char) ((i11 >> 16) & 255));
        sb2.append((char) ((i11 >> 8) & 255));
        sb2.append((char) (i11 & 255));
        return sb2.toString();
    }

    public String toString() {
        return m22690b(this.f21515a);
    }
}
