package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.play_billing.n1 */
/* loaded from: classes2.dex */
public abstract class AbstractC5804n1 {

    /* renamed from: a */
    static final Charset f33375a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f33376b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f33377c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f33378d;

    /* renamed from: e */
    public static final ByteBuffer f33379e;

    /* renamed from: f */
    public static final AbstractC5827r0 f33380f;

    static {
        byte[] bArr = new byte[0];
        f33378d = bArr;
        f33379e = ByteBuffer.wrap(bArr);
        int i11 = AbstractC5827r0.f33417a;
        C5815p0 c5815p0 = new C5815p0(bArr, 0, 0, false, null);
        try {
            c5815p0.m30425c(0);
            f33380f = c5815p0;
        } catch (zzff e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* renamed from: a */
    public static int m30375a(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m30376b(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    /* renamed from: c */
    public static Object m30377c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    /* renamed from: d */
    public static String m30378d(byte[] bArr) {
        return new String(bArr, f33376b);
    }
}
