package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes2.dex */
public abstract class nm4 {
    /* renamed from: a */
    public static int m24963a(km4 km4Var, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int mo23964h = km4Var.mo23964h(bArr, i11 + i13, i12 - i13);
            if (mo23964h == -1) {
                break;
            }
            i13 += mo23964h;
        }
        return i13;
    }

    /* renamed from: b */
    public static void m24964b(boolean z11, String str) {
        if (z11) {
        } else {
            throw zzbu.m28711a(str, null);
        }
    }

    /* renamed from: c */
    public static boolean m24965c(km4 km4Var, byte[] bArr, int i11, int i12, boolean z11) {
        try {
            return km4Var.mo23963f(bArr, 0, i12, z11);
        } catch (EOFException e11) {
            if (z11) {
                return false;
            }
            throw e11;
        }
    }

    /* renamed from: d */
    public static boolean m24966d(km4 km4Var, byte[] bArr, int i11, int i12) {
        try {
            ((yl4) km4Var).mo23962e(bArr, i11, i12, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m24967e(km4 km4Var, int i11) {
        try {
            ((yl4) km4Var).m28248l(i11, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
