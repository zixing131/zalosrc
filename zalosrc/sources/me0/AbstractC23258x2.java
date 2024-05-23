package me0;

import ag0.AbstractC0837p0;
import android.os.Build;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import me0.AbstractC23258x2;
import p239ih.C20556f;

/* renamed from: me0.x2 */
/* loaded from: classes.dex */
public abstract class AbstractC23258x2 {

    /* renamed from: a */
    public static boolean f112740a;

    /* renamed from: b */
    private static final byte[] f112741b;

    /* renamed from: c */
    private static final byte[] f112742c;

    /* renamed from: d */
    private static final byte[] f112743d;

    /* renamed from: e */
    private static final byte[] f112744e;

    /* renamed from: f */
    private static final byte[] f112745f;

    /* renamed from: g */
    private static final byte[] f112746g;

    /* renamed from: h */
    private static final byte[] f112747h;

    /* renamed from: i */
    private static final byte[] f112748i;

    /* renamed from: j */
    private static final byte[] f112749j;

    /* renamed from: k */
    private static final byte[][] f112750k;

    /* renamed from: me0.x2$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo39096a(boolean z11, boolean z12);
    }

    static {
        boolean z11;
        if (Build.VERSION.SDK_INT >= 28) {
            z11 = true;
        } else {
            z11 = false;
        }
        f112740a = z11;
        f112741b = new byte[]{-1, -40, -1};
        f112742c = new byte[]{-1, 10};
        f112743d = new byte[]{0, 0, 0, 12, 74, 88, 76, 32, 13, 10, -121, 10};
        f112744e = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f112745f = m119943b("BM");
        f112746g = m119943b("GIF87a");
        f112747h = m119943b("GIF89a");
        f112748i = new byte[]{82, 73, 70, 70, 0, 0, 0, 0, 87, 69, 66, 80};
        f112749j = m119943b("ftyp");
        f112750k = new byte[][]{m119943b("heic"), m119943b("heix"), m119943b("hevc"), m119943b("hevx"), m119943b("mif1"), m119943b("msf1")};
    }

    /* renamed from: b */
    private static byte[] m119943b(String str) {
        str.getClass();
        return str.getBytes(StandardCharsets.US_ASCII);
    }

    /* renamed from: c */
    public static byte[] m119944c(InputStream inputStream) {
        byte[] bArr = new byte[50];
        if (inputStream != null) {
            int i11 = 0;
            while (i11 < 50) {
                try {
                    int read = inputStream.read(bArr, i11, 50 - i11);
                    if (read <= 0) {
                        break;
                    }
                    i11 += read;
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            inputStream.close();
        }
        return bArr;
    }

    /* renamed from: d */
    private static boolean m119945d(byte[] bArr, byte[] bArr2, int i11) {
        if (bArr == null || bArr2.length + i11 > bArr.length) {
            return false;
        }
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            byte b11 = bArr2[i12];
            if (b11 != 0 && bArr[i11 + i12] != b11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m119946e(int i11) {
        if (i11 < 0 || i11 > 2) {
            i11 = 2;
        }
        if (i11 == 0) {
            return false;
        }
        if (i11 == 1) {
            return true;
        }
        return !C23147m9.m118826a();
    }

    /* renamed from: f */
    public static boolean m119947f(byte[] bArr) {
        if (!m119963v(bArr, f112746g) && !m119963v(bArr, f112747h)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m119948g(byte[] bArr) {
        boolean z11;
        int length = bArr.length;
        byte b11 = bArr[3];
        m119945d(bArr, f112749j, 4);
        byte[][] bArr2 = f112750k;
        int length2 = bArr2.length;
        int i11 = 0;
        while (true) {
            if (i11 < length2) {
                if (m119945d(bArr, bArr2[i11], 8)) {
                    z11 = true;
                    break;
                }
                i11++;
            } else {
                z11 = false;
                break;
            }
        }
        if (!z11) {
            try {
                return C23257x1.m119903z(bArr);
            } catch (IOException e11) {
                AbstractC20110a.m104539h(e11);
                return false;
            }
        }
        return z11;
    }

    /* renamed from: h */
    public static boolean m119949h(byte[] bArr) {
        int i11;
        if (bArr != null) {
            i11 = bArr.length;
        } else {
            i11 = 0;
        }
        byte[] bArr2 = f112741b;
        if (i11 < bArr2.length || !m119963v(bArr, bArr2)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m119950i(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length < 2 || bArr[0] != -1 || bArr[1] != -40) {
            return false;
        }
        if (bArr2 == null || bArr2.length < 2) {
            return true;
        }
        for (int length = bArr2.length - 1; length > 0; length--) {
            if (bArr2[length] == -39 && bArr2[length - 1] == -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m119951j(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return false;
        }
        int length = bArr.length;
        if (bArr[0] != -1 || bArr[1] != -40) {
            return false;
        }
        if ((bArr[length - 2] != -1 || bArr[length - 1] != -39) && ((bArr[length - 4] != -1 || bArr[length - 3] != -39) && (bArr[length - 6] != -1 || bArr[length - 5] != -39))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m119952k(byte[] bArr) {
        if (!m119963v(bArr, f112742c) && !m119963v(bArr, f112743d)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m119953l(byte[] bArr) {
        return m119963v(bArr, f112744e);
    }

    /* renamed from: m */
    private static boolean m119954m(byte[] bArr, byte[] bArr2) {
        if (!m119950i(bArr, bArr2) && !m119953l(bArr) && !m119947f(bArr) && !m119960s(bArr) && !m119952k(bArr)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:29|(6:31|(1:33)|36|37|(2:40|41)|39)|48|36|37|(0)|39) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0034, code lost:            if (m119948g(m119944c(r8)) != false) goto L124;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0041, code lost:            r1 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0042, code lost:            ho0.AbstractC20110a.m104539h(r1);     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m119955n(C20556f c20556f) {
        InputStream inputStream;
        InputStream inputStream2;
        Exception e11;
        boolean z11 = false;
        InputStream inputStream3 = null;
        try {
            if (c20556f.m106845r() < 24) {
                return false;
            }
            byte[] bArr = new byte[16];
            inputStream2 = c20556f.m106838k();
            try {
                inputStream = c20556f.m106838k();
                if (inputStream2 != null) {
                    try {
                        try {
                            if (inputStream2.read(bArr, 0, 16) == 16) {
                                if (!m119954m(bArr, null)) {
                                    if (f112740a) {
                                    }
                                    inputStream2.close();
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception e12) {
                                            AbstractC20110a.m104539h(e12);
                                        }
                                    }
                                    return z11;
                                }
                                z11 = true;
                                inputStream2.close();
                                if (inputStream != null) {
                                }
                                return z11;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream3 = inputStream2;
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (Exception e13) {
                                    AbstractC20110a.m104539h(e13);
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                    throw th;
                                } catch (Exception e14) {
                                    AbstractC20110a.m104539h(e14);
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e15) {
                        e11 = e15;
                        AbstractC20110a.m104539h(e11);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception e16) {
                                AbstractC20110a.m104539h(e16);
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e17) {
                                AbstractC20110a.m104539h(e17);
                            }
                        }
                        return false;
                    }
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception e18) {
                        AbstractC20110a.m104539h(e18);
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e19) {
                        AbstractC20110a.m104539h(e19);
                    }
                }
                return false;
            } catch (Exception e21) {
                e11 = e21;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                inputStream3 = inputStream2;
                if (inputStream3 != null) {
                }
                if (inputStream != null) {
                }
            }
        } catch (Exception e22) {
            inputStream2 = null;
            e11 = e22;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            if (inputStream3 != null) {
            }
            if (inputStream != null) {
            }
        }
    }

    /* renamed from: o */
    public static boolean m119956o(File file) {
        try {
            byte[] m119962u = m119962u(file);
            if (m119962u == null) {
                return false;
            }
            return m119959r(m119962u);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(4:14|15|16|(5:31|32|34|35|36)(2:18|(5:20|21|23|24|25)))|42|(7:44|(1:46)|49|50|52|53|54)|60|49|50|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:            if (m119948g(m119944c(r7)) != false) goto L184;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0094, code lost:            r10 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0095, code lost:            ho0.AbstractC20110a.m104539h(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008c, code lost:            r10 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008d, code lost:            ho0.AbstractC20110a.m104539h(r10);     */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m119957p(File file, boolean z11) {
        FileInputStream fileInputStream;
        boolean z12 = false;
        FileInputStream fileInputStream2 = null;
        byte[] bArr = null;
        fileInputStream2 = null;
        try {
            if (file.length() < 24) {
                return false;
            }
            byte[] bArr2 = new byte[16];
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            try {
                if (fileInputStream3.read(bArr2, 0, 16) != 16) {
                    try {
                        fileInputStream3.close();
                    } catch (Exception e12) {
                        AbstractC20110a.m104539h(e12);
                    }
                    try {
                        fileInputStream.close();
                    } catch (Exception e13) {
                        AbstractC20110a.m104539h(e13);
                    }
                    return false;
                }
                if (z11) {
                    bArr = new byte[8];
                    long length = file.length() - 24;
                    if (fileInputStream3.skip(length) != length) {
                        try {
                            fileInputStream3.close();
                        } catch (Exception e14) {
                            AbstractC20110a.m104539h(e14);
                        }
                        try {
                            fileInputStream.close();
                        } catch (Exception e15) {
                            AbstractC20110a.m104539h(e15);
                        }
                        return false;
                    }
                    if (fileInputStream3.read(bArr, 0, 8) != 8) {
                        try {
                            fileInputStream3.close();
                        } catch (Exception e16) {
                            AbstractC20110a.m104539h(e16);
                        }
                        try {
                            fileInputStream.close();
                        } catch (Exception e17) {
                            AbstractC20110a.m104539h(e17);
                        }
                        return false;
                    }
                }
                if (!m119954m(bArr2, bArr)) {
                    if (f112740a) {
                    }
                    fileInputStream3.close();
                    fileInputStream.close();
                    return z12;
                }
                z12 = true;
                fileInputStream3.close();
                fileInputStream.close();
                return z12;
            } catch (Exception e18) {
                e = e18;
                fileInputStream2 = fileInputStream3;
                try {
                    AbstractC20110a.m104539h(e);
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Exception e19) {
                            AbstractC20110a.m104539h(e19);
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e21) {
                            AbstractC20110a.m104539h(e21);
                        }
                    }
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Exception e22) {
                            AbstractC20110a.m104539h(e22);
                        }
                    }
                    if (fileInputStream == null) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (Exception e23) {
                            AbstractC20110a.m104539h(e23);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream2 = fileInputStream3;
                if (fileInputStream2 != null) {
                }
                if (fileInputStream == null) {
                }
            }
        } catch (Exception e24) {
            e = e24;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
        }
    }

    /* renamed from: q */
    public static boolean m119958q(String str) {
        try {
            C20556f c20556f = new C20556f(str);
            if (c20556f.m106830b()) {
                return m119955n(c20556f);
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: r */
    private static boolean m119959r(byte[] bArr) {
        if (!m119953l(bArr) && !m119949h(bArr) && !m119952k(bArr)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static boolean m119960s(byte[] bArr) {
        return m119963v(bArr, f112748i);
    }

    /* renamed from: t */
    public static /* synthetic */ void m119961t(String str, a aVar) {
        boolean z11;
        boolean z12;
        try {
            C20556f c20556f = new C20556f(str);
            if (c20556f.m106830b()) {
                z11 = m119955n(c20556f);
                z12 = true;
            } else {
                z11 = false;
                z12 = false;
            }
            if (aVar != null) {
                aVar.mo39096a(z12, z11);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            if (aVar != null) {
                aVar.mo39096a(false, false);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:50), block:B:29:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] m119962u(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        try {
            try {
                if (file.length() < 14) {
                    return null;
                }
                byte[] bArr = new byte[14];
                fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr, 0, 8);
                    fileInputStream.skip(file.length() - 14);
                    fileInputStream.read(bArr, 8, 6);
                    try {
                        fileInputStream.close();
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    return bArr;
                } catch (Exception e12) {
                    e = e12;
                    AbstractC20110a.m104539h(e);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e13) {
                            AbstractC20110a.m104539h(e13);
                        }
                    }
                    return null;
                }
            } catch (Exception e14) {
                e = e14;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream3 != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream3 = fileInputStream2;
            if (fileInputStream3 != null) {
                try {
                    fileInputStream3.close();
                } catch (Exception e15) {
                    AbstractC20110a.m104539h(e15);
                }
            }
            throw th;
        }
    }

    /* renamed from: v */
    private static boolean m119963v(byte[] bArr, byte[] bArr2) {
        return m119945d(bArr, bArr2, 0);
    }

    /* renamed from: w */
    public static void m119964w(String str, a aVar) {
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: me0.w2

            /* renamed from: p */
            public final /* synthetic */ String f112642p;

            /* renamed from: q */
            public final /* synthetic */ AbstractC23258x2.a f112643q;

            public /* synthetic */ RunnableC23248w2(String str2, AbstractC23258x2.a aVar2) {
                r1 = str2;
                r2 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23258x2.m119961t(r1, r2);
            }
        });
    }
}
