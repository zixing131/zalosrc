package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class dv3 {

    /* renamed from: a */
    static final Charset f19425a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f19426b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f19427c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f19428d;

    /* renamed from: e */
    public static final ByteBuffer f19429e;

    /* renamed from: f */
    public static final vt3 f19430f;

    static {
        byte[] bArr = new byte[0];
        f19428d = bArr;
        f19429e = ByteBuffer.wrap(bArr);
        f19430f = vt3.m27355h(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m21546a(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m21547b(byte[] bArr) {
        int length = bArr.length;
        int m21549d = m21549d(length, bArr, 0, length);
        if (m21549d == 0) {
            return 1;
        }
        return m21549d;
    }

    /* renamed from: c */
    public static int m21548c(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    /* renamed from: d */
    public static int m21549d(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    /* renamed from: e */
    public static Object m21550e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: f */
    public static Object m21551f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static Object m21552g(Object obj, Object obj2) {
        return ((zv3) obj).mo26775e().mo27049Q((zv3) obj2).mo25894i0();
    }

    /* renamed from: h */
    public static String m21553h(byte[] bArr) {
        return new String(bArr, f19426b);
    }

    /* renamed from: i */
    public static boolean m21554i(byte[] bArr) {
        return nx3.m25039i(bArr);
    }
}
