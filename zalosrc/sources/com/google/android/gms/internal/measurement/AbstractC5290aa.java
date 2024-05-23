package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.aa */
/* loaded from: classes.dex */
public abstract class AbstractC5290aa {

    /* renamed from: a */
    static final Charset f32256a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f32257b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f32258c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f32259d;

    /* renamed from: e */
    public static final ByteBuffer f32260e;

    /* renamed from: f */
    public static final AbstractC5306b9 f32261f;

    static {
        byte[] bArr = new byte[0];
        f32259d = bArr;
        f32260e = ByteBuffer.wrap(bArr);
        int i11 = AbstractC5306b9.f32277a;
        C5713z8 c5713z8 = new C5713z8(bArr, 0, 0, false, null);
        try {
            c5713z8.m30108c(0);
            f32261f = c5713z8;
        } catch (zzll e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* renamed from: a */
    public static int m28882a(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m28883b(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    /* renamed from: c */
    public static Object m28884c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static String m28885d(byte[] bArr) {
        return new String(bArr, f32257b);
    }
}
