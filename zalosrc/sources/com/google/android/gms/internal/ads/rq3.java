package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class rq3 {

    /* renamed from: a */
    private static final wu3 f27349a = new qq3();

    /* renamed from: a */
    public static int m26153a(int i11) {
        if (i11 != 1) {
            return i11 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m26154b(int i11) {
        if (i11 == 0) {
            return 2;
        }
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 2) {
            return 4;
        }
        if (i11 != 3) {
            return i11 != 4 ? 0 : 6;
        }
        return 5;
    }
}
