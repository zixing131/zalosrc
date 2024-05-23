package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.s */
/* loaded from: classes3.dex */
public abstract class AbstractC6830s {

    /* renamed from: a */
    static final Charset f37474a = Charset.forName("UTF-8");

    /* renamed from: b */
    static final Charset f37475b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f37476c;

    /* renamed from: d */
    public static final ByteBuffer f37477d;

    /* renamed from: e */
    public static final AbstractC6802g f37478e;

    /* renamed from: com.google.protobuf.s$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        int mo35139a();
    }

    /* renamed from: com.google.protobuf.s$b */
    /* loaded from: classes3.dex */
    public interface b {
    }

    /* renamed from: com.google.protobuf.s$c */
    /* loaded from: classes3.dex */
    public interface c {
    }

    /* renamed from: com.google.protobuf.s$d */
    /* loaded from: classes3.dex */
    public interface d extends e {
        /* renamed from: T */
        void mo35121T(int i11);

        int getInt(int i11);

        /* renamed from: h */
        d mo35124h(int i11);
    }

    /* renamed from: com.google.protobuf.s$e */
    /* loaded from: classes3.dex */
    public interface e extends List, RandomAccess {
        /* renamed from: O */
        boolean mo34738O();

        /* renamed from: h */
        e mo35124h(int i11);

        /* renamed from: o */
        void mo34740o();
    }

    static {
        byte[] bArr = new byte[0];
        f37476c = bArr;
        f37477d = ByteBuffer.wrap(bArr);
        f37478e = AbstractC6802g.m34829a(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m35129a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Object m35130b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m35131c(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m35132d(byte[] bArr) {
        return m35133e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m35133e(byte[] bArr, int i11, int i12) {
        int m35137i = m35137i(i12, bArr, i11, i12);
        if (m35137i == 0) {
            return 1;
        }
        return m35137i;
    }

    /* renamed from: f */
    public static int m35134f(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    /* renamed from: g */
    public static boolean m35135g(byte[] bArr) {
        return AbstractC6807h1.m34963l(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Object m35136h(Object obj, Object obj2) {
        return ((InterfaceC6809i0) obj).mo34977b().mo34719F((InterfaceC6809i0) obj2).mo34980J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m35137i(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    /* renamed from: j */
    public static String m35138j(byte[] bArr) {
        return new String(bArr, f37474a);
    }
}
