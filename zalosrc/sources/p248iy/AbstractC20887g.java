package p248iy;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.IPPort;
import fn0.AbstractC19074t;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import lm0.InterfaceC22529a;
import mm0.AbstractC23350e;
import mm0.AbstractC23354i;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24321d;
import p248iy.C20885e;

/* renamed from: iy.g */
/* loaded from: classes.dex */
public abstract class AbstractC20887g {

    /* renamed from: a */
    public static final InterfaceC22529a f102632a = new a();

    /* renamed from: iy.g$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC22529a {
        a() {
        }

        @Override // lm0.InterfaceC22529a
        /* renamed from: a */
        public void mo109249a(int i11, String str) {
            if (!AbstractC23354i.m122791a()) {
                return;
            }
            AbstractC20887g.m109236n(i11, str, null, 0, 0L, 0, 60, null);
        }

        @Override // lm0.InterfaceC22529a
        /* renamed from: b */
        public void mo109250b(int i11) {
            if (!AbstractC23354i.m122791a()) {
                return;
            }
            AbstractC20887g.m109244v(i11, null, 2, null);
        }

        @Override // lm0.InterfaceC22529a
        /* renamed from: c */
        public void mo109251c(int i11) {
            if (!AbstractC23354i.m122791a()) {
                return;
            }
            AbstractC20887g.m109217D(i11, null, 2, null);
        }
    }

    /* renamed from: A */
    public static final void m109214A(int i11, String str, long j11) {
        m109215B(i11, str, j11, System.currentTimeMillis());
    }

    /* renamed from: B */
    public static final void m109215B(int i11, String str, long j11, long j12) {
        if (j12 <= j11) {
            j12 = 1 + j11;
        }
        long j13 = j12;
        m109216C(i11, str, j11, j13, j13 - j11);
    }

    /* renamed from: C */
    public static final void m109216C(int i11, String str, long j11, long j12, long j13) {
        long j14;
        String str2;
        boolean m127128x;
        if (j12 <= j11) {
            j14 = 1 + j11;
        } else {
            j14 = j12;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        m109221H(false, true, 0, i11, 0, j13, str2, j11, j14);
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                m109230h(i11, str);
            }
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m109217D(int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        m109248z(i11, str);
    }

    /* renamed from: E */
    public static final void m109218E(IPPort iPPort, int i11, String str, int i12, int i13) {
        AbstractC19074t.m100208f(iPPort, "ip");
        AbstractC19074t.m100208f(str, "exception");
        try {
            String str2 = iPPort.m93162d() + "Exception: " + str;
            C20885e.a aVar = C20885e.Companion;
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            C20882b.Companion.m109144b().m109140m(aVar.m109199b(str3, i12, i13, i11, 0L, str2, CoreUtility.f89236l));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: F */
    public static final void m109219F(SparseArray sparseArray, List list, int i11, int i12) {
        AbstractC19074t.m100208f(sparseArray, "<this>");
        AbstractC19074t.m100208f(list, "destList");
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            sparseArray.keyAt(i13);
            C20883c c20883c = (C20883c) sparseArray.valueAt(i13);
            list.add(C20885e.Companion.m109200c(c20883c.m109157k(), c20883c.m109149c(), i11, String.valueOf(c20883c.m109155i()), c20883c.m109151e(), c20883c.m109148b(), c20883c.m109158l(), c20883c.m109152f(), c20883c.m109153g(), c20883c.m109147a(), c20883c.m109150d(), i12));
        }
        sparseArray.clear();
    }

    /* renamed from: G */
    public static final boolean m109220G(String str) {
        boolean m127149O;
        boolean m127149O2;
        boolean m127149O3;
        if (str != null) {
            m127149O = AbstractC24342w.m127149O(str, "Host is unresolved", false, 2, null);
            if (!m127149O) {
                m127149O2 = AbstractC24342w.m127149O(str, "Network is unreachable", false, 2, null);
                if (!m127149O2) {
                    m127149O3 = AbstractC24342w.m127149O(str, "No route to host", false, 2, null);
                    if (m127149O3) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public static final void m109221H(boolean z11, boolean z12, int i11, int i12, int i13, long j11, String str, long j12, long j13) {
        C20882b.Companion.m109144b().m109139l(z12, i11, i12, i13, j11, str, j12, j13);
    }

    /* renamed from: I */
    public static final void m109222I(String str, String str2) {
        int length;
        if (str == null) {
            return;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
            File[] listFiles = new File(str).listFiles();
            if (listFiles != null && listFiles.length - 1 >= 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    byte[] bArr = new byte[1024];
                    FileInputStream fileInputStream = new FileInputStream(listFiles[i11]);
                    zipOutputStream.putNextEntry(new ZipEntry(listFiles[i11].getName()));
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, read);
                        }
                    }
                    zipOutputStream.closeEntry();
                    fileInputStream.close();
                    if (i12 > length) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            zipOutputStream.close();
        } catch (IOException e11) {
            AbstractC23350e.m122774d("", e11.getMessage());
        }
    }

    /* renamed from: a */
    public static final byte[] m109223a(String str) {
        AbstractC19074t.m100208f(str, "string");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        byte[] bytes = str.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "this as java.lang.String).getBytes(charset)");
        gZIPOutputStream.write(bytes);
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        AbstractC19074t.m100207e(byteArray, "compressed");
        return byteArray;
    }

    /* renamed from: b */
    public static final int m109224b() {
        try {
            Object systemService = CoreUtility.getAppContext().getSystemService("phone");
            if (systemService != null) {
                String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
                if (networkOperator == null || networkOperator.length() <= 0) {
                    return -1;
                }
                try {
                    return Integer.parseInt(networkOperator);
                } catch (Exception unused) {
                    return -1;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused2) {
            return -1;
        }
    }

    /* renamed from: c */
    public static final int m109225c() {
        Object systemService;
        try {
            systemService = CoreUtility.getAppContext().getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (systemService != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 5;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1 && type != 6) {
                    return 5;
                }
                return 0;
            }
            return m109226d();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: d */
    public static final int m109226d() {
        try {
            Object systemService = CoreUtility.getAppContext().getSystemService("phone");
            if (systemService != null) {
                int networkType = ((TelephonyManager) systemService).getNetworkType();
                if (networkType == 0) {
                    return 5;
                }
                return networkType;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
            return 5;
        }
    }

    /* renamed from: e */
    public static final void m109227e(String str, String str2) {
        if (str2 == null) {
            return;
        }
        byte[] bArr = new byte[1024];
        try {
            File file = new File(str2);
            file.delete();
            file.createNewFile();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(str2));
            FileInputStream fileInputStream = new FileInputStream(str);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    gZIPOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    gZIPOutputStream.finish();
                    gZIPOutputStream.close();
                    return;
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: f */
    public static final void m109228f(IPPort iPPort, int i11, String str) {
        AbstractC19074t.m100208f(iPPort, "ip");
        AbstractC19074t.m100208f(str, "exception");
        try {
            String str2 = iPPort.m93162d() + "Exception: " + str;
            C20885e.a aVar = C20885e.Companion;
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            C20882b.Companion.m109144b().m109140m(aVar.m109199b(str3, 0, 0, i11, 0L, str2, CoreUtility.f89236l));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static final void m109229g(int i11, int i12, String str) {
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        m109231i(str2, i12, str, 0L, i11, CoreUtility.f89236l);
    }

    /* renamed from: h */
    public static final void m109230h(int i11, String str) {
        if (!AbstractC23354i.m122791a()) {
            return;
        }
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        m109231i(str2, 0, str, 0L, i11, CoreUtility.f89236l);
    }

    /* renamed from: i */
    public static final void m109231i(String str, int i11, String str2, long j11, int i12, int i13) {
        AbstractC19074t.m100208f(str, "uid");
        m109235m(i12, str2, str, i11, j11, i13);
    }

    /* renamed from: j */
    public static final void m109232j(String str, int i11, String str2, long j11, int i12, int i13) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "exception");
        try {
            C20882b.Companion.m109144b().m109140m(C20885e.Companion.m109199b(str, i12, 0, i11, j11, AbstractC19074t.m100216n("HttpRequestException: ", str2), i13));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public static final void m109233k(String str, int i11, String str2, long j11, int i12, int i13) {
        AbstractC19074t.m100208f(str, "uid");
        if (!AbstractC23354i.m122791a()) {
            return;
        }
        m109235m(i12, str2, str, i11, j11, i13);
    }

    /* renamed from: l */
    public static final void m109234l(int i11, String str) {
        m109236n(i11, str, null, 0, 0L, 0, 60, null);
    }

    /* renamed from: m */
    public static final void m109235m(int i11, String str, String str2, int i12, long j11, int i13) {
        AbstractC19074t.m100208f(str2, "uid");
        try {
            C20882b.Companion.m109144b().m109140m(C20885e.Companion.m109199b(str2, i11, 0, i12, j11, str, i13));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m109236n(int i11, String str, String str2, int i12, long j11, int i13, int i14, Object obj) {
        int i15;
        if ((i14 & 4) != 0) {
            str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
        }
        String str3 = str2;
        if ((i14 & 8) != 0) {
            i15 = 0;
        } else {
            i15 = i12;
        }
        if ((i14 & 16) != 0) {
            j11 = 0;
        }
        long j12 = j11;
        if ((i14 & 32) != 0) {
            i13 = CoreUtility.f89236l;
        }
        m109235m(i11, str, str3, i15, j12, i13);
    }

    /* renamed from: o */
    public static final void m109237o(int i11) {
        m109244v(i11, null, 2, null);
    }

    /* renamed from: p */
    public static final void m109238p(int i11, long j11) {
        m109241s(i11, null, j11);
    }

    /* renamed from: q */
    public static final void m109239q(int i11, long j11, long j12, long j13) {
        m109243u(i11, null, j11, j12, j13);
    }

    /* renamed from: r */
    public static final void m109240r(int i11, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        m109242t(i11, str, currentTimeMillis, currentTimeMillis);
    }

    /* renamed from: s */
    public static final void m109241s(int i11, String str, long j11) {
        m109242t(i11, str, j11, System.currentTimeMillis());
    }

    /* renamed from: t */
    public static final void m109242t(int i11, String str, long j11, long j12) {
        if (j12 <= j11) {
            j12 = 1 + j11;
        }
        long j13 = j12;
        m109243u(i11, str, j11, j13, j13 - j11);
    }

    /* renamed from: u */
    public static final void m109243u(int i11, String str, long j11, long j12, long j13) {
        long j14;
        String str2;
        boolean m127128x;
        if (j12 <= j11) {
            j14 = 1 + j11;
        } else {
            j14 = j12;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        m109221H(false, false, 0, i11, 0, j13, str2, j11, j14);
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                m109230h(i11, str);
            }
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m109244v(int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        m109240r(i11, str);
    }

    /* renamed from: w */
    public static final void m109245w(int i11) {
        m109217D(i11, null, 2, null);
    }

    /* renamed from: x */
    public static final void m109246x(int i11, long j11) {
        m109214A(i11, null, j11);
    }

    /* renamed from: y */
    public static final void m109247y(int i11, long j11, long j12, long j13) {
        m109216C(i11, null, j11, j12, j13);
    }

    /* renamed from: z */
    public static final void m109248z(int i11, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        m109215B(i11, str, currentTimeMillis, currentTimeMillis);
    }
}
