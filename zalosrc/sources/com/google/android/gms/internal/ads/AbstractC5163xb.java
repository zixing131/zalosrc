package com.google.android.gms.internal.ads;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.ads.xb */
/* loaded from: classes2.dex */
public abstract class AbstractC5163xb {
    /* renamed from: a */
    public static String m27875a(byte[] bArr, boolean z11) {
        int i11;
        if (true != z11) {
            i11 = 2;
        } else {
            i11 = 11;
        }
        return Base64.encodeToString(bArr, i11);
    }

    /* renamed from: b */
    public static byte[] m27876b(String str, boolean z11) {
        int i11;
        if (true != z11) {
            i11 = 2;
        } else {
            i11 = 11;
        }
        byte[] decode = Base64.decode(str, i11);
        if (decode.length == 0 && str.length() > 0) {
            throw new IllegalArgumentException("Unable to decode ".concat(str));
        }
        return decode;
    }
}
