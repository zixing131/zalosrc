package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class io3 {

    /* renamed from: a */
    private static final wu3 f22252a = new ho3();

    /* renamed from: a */
    public static int m23311a(int i11) {
        if (i11 != 1) {
            return i11 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m23312b(int i11) {
        if (i11 == 0) {
            return 2;
        }
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 2) {
            return 4;
        }
        if (i11 == 3) {
            return 5;
        }
        if (i11 != 4) {
            return i11 != 5 ? 0 : 7;
        }
        return 6;
    }
}
