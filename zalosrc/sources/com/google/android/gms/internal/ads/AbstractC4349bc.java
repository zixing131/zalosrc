package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.bc */
/* loaded from: classes2.dex */
public abstract class AbstractC4349bc {

    /* renamed from: a */
    static boolean f17689a = false;

    /* renamed from: b */
    private static MessageDigest f17690b;

    /* renamed from: c */
    private static final Object f17691c = new Object();

    /* renamed from: d */
    private static final Object f17692d = new Object();

    /* renamed from: e */
    static final CountDownLatch f17693e = new CountDownLatch(1);

    /* renamed from: a */
    public static String m20471a(C4606ib c4606ib, String str) {
        byte[] m20477g;
        byte[] bArr;
        byte[] mo27346a = c4606ib.mo27346a();
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21409w2)).booleanValue()) {
            if (AbstractC4757me.f24481a != null) {
                if (str != null) {
                    bArr = str.getBytes();
                } else {
                    bArr = new byte[0];
                }
                byte[] mo20126a = AbstractC4757me.f24481a.mo20126a(mo27346a, bArr);
                C5051ub m27195F = C5088vb.m27195F();
                m27195F.m26909q(mt3.m24726I(mo20126a));
                m27195F.m26911s(3);
                m20477g = ((C5088vb) m27195F.m25898n()).mo27346a();
            } else {
                throw new GeneralSecurityException();
            }
        } else {
            Vector m20472b = m20472b(mo27346a, 255);
            if (m20472b != null && m20472b.size() != 0) {
                C5051ub m27195F2 = C5088vb.m27195F();
                int size = m20472b.size();
                for (int i11 = 0; i11 < size; i11++) {
                    m27195F2.m26909q(mt3.m24726I(m20477g((byte[]) m20472b.get(i11), str, false)));
                }
                m27195F2.m26910r(mt3.m24726I(m20475e(mo27346a)));
                m20477g = ((C5088vb) m27195F2.m25898n()).mo27346a();
            } else {
                m20477g = m20477g(m20476f(4096).mo27346a(), str, true);
            }
        }
        return AbstractC5163xb.m27875a(m20477g, true);
    }

    /* renamed from: b */
    static Vector m20472b(byte[] bArr, int i11) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i12 = (length + 254) / 255;
        Vector vector = new Vector();
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i13 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i14 > 255) {
                    length2 = i14 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i14, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: d */
    public static void m20474d() {
        synchronized (f17692d) {
            try {
                if (!f17689a) {
                    f17689a = true;
                    new Thread(new RunnableC4312ac(null)).start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:            r1.reset();        r1.update(r6);        r6 = com.google.android.gms.internal.ads.AbstractC4349bc.f17690b.digest();     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m20475e(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (f17691c) {
            try {
                m20474d();
                MessageDigest messageDigest2 = null;
                try {
                    if (f17693e.await(2L, TimeUnit.SECONDS) && (messageDigest = f17690b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                throw new NoSuchAlgorithmException("Cannot compute hash");
            } finally {
            }
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    /* renamed from: f */
    static C4606ib m20476f(int i11) {
        C4939ra m23199g0 = C4606ib.m23199g0();
        m23199g0.m26044u(4096L);
        return (C4606ib) m23199g0.m25898n();
    }

    /* renamed from: g */
    private static byte[] m20477g(byte[] bArr, String str, boolean z11) {
        int i11;
        byte[] array;
        if (true != z11) {
            i11 = 255;
        } else {
            i11 = 239;
        }
        if (bArr.length > i11) {
            bArr = m20476f(4096).mo27346a();
        }
        int length = bArr.length;
        if (length < i11) {
            byte[] bArr2 = new byte[i11 - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i11 + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i11 + 1).put((byte) length).put(bArr).array();
        }
        if (z11) {
            array = ByteBuffer.allocate(256).put(m20475e(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        InterfaceC4385cc[] interfaceC4385ccArr = new C4386cd().f18209G2;
        int length2 = interfaceC4385ccArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            interfaceC4385ccArr[i12].mo20478a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new ts3(str.getBytes("UTF-8")).m26735a(bArr3);
        }
        return bArr3;
    }
}
