package in;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Build;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.NativeHttpDownload;
import com.zing.zalocore.connection.socket.RequestDownloadListener;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import in.AbstractC20631e;
import in.C20627a;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me0.AbstractC23009a3;
import me0.AbstractC23041d2;
import me0.AbstractC23170p;
import me0.AbstractC23227u1;
import me0.AbstractC23228u2;
import me0.AbstractC23238v2;
import me0.AbstractC23258x2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import p248iy.AbstractC20887g;
import p296kc.C21654a;
import p406ow.C24574j;
import p716zh.C31944h6;
import pm0.C24860q;
import su.AbstractC26389c;

/* renamed from: in.a */
/* loaded from: classes3.dex */
public class C20627a extends AbstractC20631e {

    /* renamed from: A */
    private boolean f101458A;

    /* renamed from: B */
    private boolean f101459B;

    /* renamed from: C */
    private boolean f101460C;

    /* renamed from: D */
    private boolean f101461D;

    /* renamed from: E */
    private boolean f101462E;

    /* renamed from: F */
    private boolean f101463F;

    /* renamed from: G */
    private boolean f101464G;

    /* renamed from: H */
    private int f101465H;

    /* renamed from: I */
    private int f101466I;

    /* renamed from: J */
    private boolean f101467J;

    /* renamed from: K */
    private a f101468K;

    /* renamed from: L */
    private String f101469L;

    /* renamed from: M */
    private InterfaceC20630d f101470M;

    /* renamed from: N */
    private String f101471N;

    /* renamed from: p */
    String f101472p;

    /* renamed from: q */
    String f101473q;

    /* renamed from: r */
    String f101474r;

    /* renamed from: s */
    String f101475s;

    /* renamed from: t */
    private int f101476t;

    /* renamed from: u */
    private int f101477u;

    /* renamed from: v */
    public int f101478v;

    /* renamed from: w */
    private int f101479w;

    /* renamed from: x */
    public Map f101480x;

    /* renamed from: y */
    public boolean f101481y;

    /* renamed from: z */
    private boolean f101482z;

    /* renamed from: in.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        boolean mo95516a(int i11);
    }

    /* renamed from: in.a$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private static final NativeHttpDownload f101483a = NativeHttpDownload.m93195d(new NativeHttpDownload.InterfaceC17518a() { // from class: in.b
            @Override // com.zing.zalocore.connection.socket.NativeHttpDownload.InterfaceC17518a
            /* renamed from: a */
            public final void mo93201a(boolean z11, boolean z12, int i11, int i12, int i13, long j11, long j12, long j13, byte[] bArr) {
                C20627a.b.m107437k(z11, z12, i11, i12, i13, j11, j12, j13, bArr);
            }
        });

        /* renamed from: in.a$b$a */
        /* loaded from: classes3.dex */
        public class a extends RequestDownloadListener {
            a(C20627a c20627a) {
                super(c20627a);
            }

            @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
            public void onDownloadBufferComplete(int i11, int i12, byte[] bArr, int i13) {
            }

            @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
            public void onDownloadHttpComplete(int i11, int i12, byte[] bArr, int i13, boolean z11) {
                C20627a c20627a = (C20627a) m93268a();
                if (c20627a == null) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Download complete: TS=");
                sb2.append(System.currentTimeMillis());
                sb2.append(", url=");
                sb2.append(c20627a.f101473q);
                sb2.append(", curlcode=");
                sb2.append(i11);
                sb2.append(", httpcode=");
                sb2.append(i12);
                sb2.append(", pathOut=");
                sb2.append(c20627a.f101472p);
                File file = new File(c20627a.f101472p);
                try {
                    if (c20627a.f101461D) {
                        if (AbstractC19646n0.m102927R0(c20627a.f101475s) != 3) {
                            if (AbstractC19646n0.m102927R0(c20627a.f101475s) == 2) {
                            }
                        }
                        if (file.exists()) {
                            C20627a.m107407U(c20627a.f101473q, file);
                        }
                    }
                    b.m107438l(c20627a, i11, i12, i13, c20627a.f101481y);
                    if (AbstractC23238v2.m119727l()) {
                        if (c20627a.m107496y()) {
                            if (file.exists()) {
                                file.delete();
                            }
                        } else if ((i11 != 0 || (i12 != 200 && i12 != 206)) && file.exists() && (i12 != 404 || c20627a.m107410X() == null || !c20627a.m107410X().mo95516a(c20627a.f101465H))) {
                            file.delete();
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DownloadFileAsync", e11);
                    e11.toString();
                }
                if (c20627a.m107496y()) {
                    c20627a.m107497z();
                } else {
                    c20627a.mo1197A(null, z11);
                }
                c20627a.m107487j(true);
            }

            @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
            public void onProgressUpdate(int i11) {
                try {
                    C20627a c20627a = (C20627a) m93268a();
                    if (c20627a == null) {
                        return;
                    }
                    c20627a.f101471N = i11 + "%";
                    c20627a.m107483F("" + i11);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DownloadFileAsync", e11);
                }
            }
        }

        /* renamed from: f */
        public static void m107432f(String str) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Update Priority: ");
            sb2.append(str);
            f101483a.m93200f(str);
        }

        /* renamed from: g */
        public static void m107433g(String str, int i11) {
            AbstractC23350e.m122772b("Cancel Download: fileId=" + i11 + ", url=" + str, new Object[0]);
            f101483a.m93197a(str, i11);
        }

        /* renamed from: h */
        private static RequestDownloadListener m107434h(C20627a c20627a) {
            return new a(c20627a);
        }

        /* renamed from: i */
        public static void m107435i(C20627a c20627a) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Download start: QoS=");
                sb2.append(c20627a.f101478v);
                sb2.append(", url=");
                sb2.append(c20627a.f101473q);
                sb2.append(", path=");
                sb2.append(c20627a.f101472p);
                boolean startsWith = c20627a.f101473q.startsWith("https");
                HashMap hashMap = new HashMap();
                if (startsWith && c20627a.f101467J) {
                    hashMap.putAll(AbstractC23228u2.m119703b());
                    Map map = c20627a.f101480x;
                    if (map != null && !map.isEmpty()) {
                        hashMap.putAll(c20627a.f101480x);
                    }
                    AbstractC20631e.c cVar = c20627a.f101518j;
                    if (cVar != null) {
                        cVar.mo95335e(hashMap, c20627a.m107492t().m107526d());
                    }
                }
                RequestDownloadListener m107434h = m107434h(c20627a);
                if (c20627a.f101466I > 0) {
                    m107434h.m93269b(c20627a.f101466I);
                }
                f101483a.m93198b(c20627a.f101473q, c20627a.f101478v, c20627a.f101472p, c20627a.hashCode(), c20627a.f101464G, false, true, startsWith, m107434h, hashMap);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DownloadFileAsync", e11);
            }
        }

        /* renamed from: j */
        private static boolean m107436j(int i11) {
            return i11 == 429 || i11 == 502 || i11 == 503 || i11 == 504;
        }

        /* renamed from: k */
        public static /* synthetic */ void m107437k(boolean z11, boolean z12, int i11, int i12, int i13, long j11, long j12, long j13, byte[] bArr) {
            AbstractC20887g.m109221H(z11, z12, i11, i12, i13, j11, new String(bArr), j12, j13);
            if (bArr.length > 0 && i12 > 0) {
                AbstractC20887g.m109231i(CoreUtility.f89233i, i11, new String(bArr), 0L, i12, CoreUtility.f89236l);
            }
        }

        /* renamed from: l */
        public static void m107438l(C20627a c20627a, int i11, int i12, int i13, boolean z11) {
            c20627a.f101476t = i11;
            c20627a.f101477u = i12;
            if (!z11) {
                c20627a.f101465H = i11;
                if (c20627a.f101482z) {
                    c20627a.f101465H = 1;
                    c20627a.m107422i0(0);
                    return;
                }
                if (i11 == 0) {
                    if (i12 == 404) {
                        c20627a.f101465H = 7;
                    } else if (m107436j(i12)) {
                        c20627a.f101465H = 8;
                        AbstractC20631e.c cVar = c20627a.f101518j;
                        if (cVar != null && cVar.mo95336f(c20627a.m107492t().m107526d())) {
                            C21654a.m111586q(i12, c20627a.m107492t().m107525c());
                        }
                    } else if (i12 != 200 && i12 != 206 && i13 <= 0) {
                        c20627a.f101465H = 2;
                    }
                    c20627a.m107422i0(0);
                    return;
                }
                if (i11 != 0) {
                    if (!AbstractC23238v2.m119726k()) {
                        c20627a.f101465H = 5;
                    } else if (i12 == -6) {
                        c20627a.f101465H = -6;
                    } else {
                        c20627a.f101465H = 3;
                    }
                    c20627a.m107422i0(0);
                    return;
                }
                return;
            }
            if (i11 != 0 || i12 == 200 || i12 == 206) {
                c20627a.f101465H = i11;
            } else {
                c20627a.f101465H = i12;
            }
        }
    }

    public C20627a(boolean z11) {
        this.f101474r = "";
        this.f101476t = 0;
        this.f101477u = 0;
        this.f101478v = 0;
        this.f101479w = 0;
        this.f101481y = false;
        this.f101482z = false;
        this.f101458A = false;
        this.f101460C = false;
        this.f101461D = true;
        this.f101462E = false;
        this.f101463F = false;
        this.f101465H = 0;
        this.f101466I = -1;
        this.f101467J = true;
        this.f101468K = null;
        this.f101469L = "";
        this.f101471N = "";
        this.f101515g = 2;
        this.f101459B = z11;
    }

    /* renamed from: T */
    private void m107406T() {
        if (!this.f101458A) {
            if (this.f101459B) {
                this.f101472p = AbstractC20130d.m104905y() + AbstractC23352g.m122788d(this.f101473q);
                return;
            }
            if (AbstractC19646n0.m102927R0(this.f101473q) == 2) {
                this.f101472p = AbstractC20130d.m104871f0() + AbstractC23352g.m122788d(this.f101473q) + AbstractC23041d2.m118220s(this.f101473q);
                return;
            }
            if (AbstractC19646n0.m102927R0(this.f101473q) == 3) {
                this.f101472p = AbstractC20130d.m104874i0() + AbstractC23352g.m122788d(this.f101473q) + AbstractC23041d2.m118220s(this.f101473q);
                return;
            }
            this.f101472p = AbstractC20130d.m104823C() + AbstractC23352g.m122788d(this.f101473q) + AbstractC23041d2.m118220s(this.f101473q);
        }
    }

    /* renamed from: U */
    public static void m107407U(String str, File file) {
        if (!AbstractC23258x2.m119956o(file)) {
            if (AbstractC23170p.m119365w(AbstractC23009a3.m117964o(file.getPath(), 400))) {
                AbstractC20887g.m109245w(21103);
                return;
            }
            try {
                AbstractC20887g.m109240r(21102, C31944h6.m153552r(str));
                file.delete();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DownloadFileAsync", e11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:            if (r11.f101460C != false) goto L122;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:            p406ow.C24574j.m127992c().m128000j();     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01c9, code lost:            return null;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c5, code lost:            if (r11.f101460C == false) goto L177;     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // in.AbstractC20631e
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24860q mo1204l(String... strArr) {
        Network activeNetwork;
        LinkProperties linkProperties;
        String str = "Error Download file : ";
        String str2 = "Download file : ";
        if (!AbstractC23238v2.m119727l()) {
            this.f101465H = 4;
            AbstractC20887g.m109245w(21104);
            return null;
        }
        String str3 = strArr[0];
        AbstractC20631e.c cVar = this.f101518j;
        if (cVar != null) {
            str3 = cVar.mo95332b(str3, m107492t().m107526d());
            this.f101478v = this.f101518j.mo95337g(this.f101478v, m107492t().m107526d());
        }
        m107486I(AbstractC23352g.m122788d(str3));
        m107485H(C31944h6.m153552r(str3));
        AbstractC20110a.m104543l("DownloadFileAsync").mo104556o(8, "doInBackground(): " + m107491s() + " " + m107490r(), new Object[0]);
        try {
            try {
                this.f101473q = str3;
                this.f101475s = str3;
                m107406T();
                File file = new File(this.f101472p);
                if (file.exists()) {
                    file.deleteOnExit();
                }
                b.m107435i(this);
            } catch (Throwable th2) {
                if (this.f101460C) {
                    C24574j.m127992c().m128000j();
                }
                throw th2;
            }
        } catch (Exception e11) {
            int i11 = 5;
            i11 = 5;
            int i12 = 1;
            int i13 = 1;
            i12 = 1;
            int i14 = 1;
            try {
                try {
                    new File(this.f101472p).delete();
                    if (this.f101482z) {
                        this.f101465H = 1;
                        this.f101482z = false;
                        m107422i0(0);
                    } else {
                        boolean m119701a = AbstractC23227u1.m119701a(e11);
                        int i15 = m119701a;
                        if (m119701a == 0) {
                            boolean z11 = e11 instanceof IOException;
                            int i16 = z11;
                            if (z11 != 0) {
                                boolean m119726k = AbstractC23238v2.m119726k();
                                i16 = m119726k;
                                if (m119726k == 0) {
                                    i15 = m119726k;
                                }
                            }
                            this.f101465H = 3;
                            m107422i0(0);
                            i13 = i16;
                        }
                        this.f101465H = 5;
                        m107422i0(0);
                        i13 = i15;
                    }
                    AbstractC23350e.m122776f("DownloadFileAsync", e11);
                    Object[] objArr = new Object[0];
                    AbstractC20110a.m104542k(3, "Download file : " + m107491s() + " " + m107490r(), objArr);
                    str = "Error Download file : " + e11;
                    Object[] objArr2 = new Object[0];
                    AbstractC20110a.m104542k(3, str, objArr2);
                    str2 = objArr2;
                    i11 = objArr;
                    i12 = i13;
                } catch (Exception e12) {
                    e12.toString();
                    if (this.f101482z) {
                        this.f101465H = 1;
                        this.f101482z = false;
                        m107422i0(0);
                    } else {
                        boolean m119701a2 = AbstractC23227u1.m119701a(e11);
                        int i17 = m119701a2;
                        if (m119701a2 == 0) {
                            boolean z12 = e11 instanceof IOException;
                            int i18 = z12;
                            if (z12 != 0) {
                                boolean m119726k2 = AbstractC23238v2.m119726k();
                                i18 = m119726k2;
                                if (m119726k2 == 0) {
                                    i17 = m119726k2;
                                }
                            }
                            this.f101465H = 3;
                            m107422i0(0);
                            i14 = i18;
                        }
                        this.f101465H = 5;
                        m107422i0(0);
                        i14 = i17;
                    }
                    AbstractC23350e.m122776f("DownloadFileAsync", e11);
                    Object[] objArr3 = new Object[0];
                    AbstractC20110a.m104542k(3, "Download file : " + m107491s() + " " + m107490r(), objArr3);
                    str = "Error Download file : " + e11;
                    Object[] objArr4 = new Object[0];
                    AbstractC20110a.m104542k(3, str, objArr4);
                    str2 = objArr4;
                    i11 = objArr3;
                    i12 = i14;
                }
                e11.toString();
                try {
                    if ((e11 instanceof UnknownHostException) && Build.VERSION.SDK_INT >= 23) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) CoreUtility.getAppContext().getSystemService("connectivity");
                        activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            linkProperties.getInterfaceName();
                            List<InetAddress> dnsServers = linkProperties.getDnsServers();
                            if (!dnsServers.isEmpty()) {
                                Iterator<InetAddress> it = dnsServers.iterator();
                                while (it.hasNext()) {
                                    Objects.toString(it.next());
                                }
                            }
                        }
                    }
                } catch (Exception e13) {
                    AbstractC23350e.m122776f("DownloadFileAsync", e13);
                }
            } catch (Throwable th3) {
                if (!this.f101482z) {
                    if (!AbstractC23227u1.m119701a(e11) && (!(e11 instanceof IOException) || AbstractC23238v2.m119726k())) {
                        this.f101465H = 3;
                        m107422i0(0);
                    }
                    this.f101465H = i11;
                    m107422i0(0);
                } else {
                    this.f101465H = i12;
                    this.f101482z = false;
                    m107422i0(0);
                }
                AbstractC23350e.m122776f("DownloadFileAsync", e11);
                AbstractC20110a.m104542k(3, str2 + m107491s() + " " + m107490r(), new Object[0]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(e11);
                AbstractC20110a.m104542k(3, sb2.toString(), new Object[0]);
                throw th3;
            }
        }
    }

    /* renamed from: W */
    public int m107409W() {
        return this.f101476t;
    }

    /* renamed from: X */
    public a m107410X() {
        return this.f101468K;
    }

    /* renamed from: Y */
    public int m107411Y() {
        return this.f101477u;
    }

    /* renamed from: Z */
    public int m107412Z() {
        return this.f101466I;
    }

    /* renamed from: a0 */
    public void m107413a0(String str) {
        if (NativeHttpDownload.m93196e()) {
            b.m107432f(str);
        }
    }

    @Override // in.AbstractC20631e
    /* renamed from: b0 */
    public void mo1197A(String str, boolean z11) {
        File file;
        if (this.f101470M == null) {
            return;
        }
        if (this.f101472p != null) {
            file = new File(this.f101472p);
        } else {
            file = null;
        }
        int i11 = this.f101465H;
        if (i11 != 0) {
            this.f101470M.mo91784b(i11, z11);
            m107422i0(0);
            return;
        }
        m107422i0(100);
        if (file != null && file.exists()) {
            if (!this.f101469L.isEmpty() && !AbstractC26389c.m135985a(this.f101472p, this.f101469L)) {
                AbstractC23041d2.m118208g(this.f101472p);
                this.f101470M.mo91784b(3, z11);
                return;
            }
            if (this.f101518j != null) {
                C21654a.m111579f("DownloadFileAsync", "Download done: " + m107491s() + " " + m107490r(), C21654a.a.f105047p, true);
            }
            this.f101470M.mo91783a(this.f101472p, z11);
            return;
        }
        this.f101470M.mo91784b(6, z11);
    }

    @Override // in.AbstractC20631e
    /* renamed from: c0 */
    public void mo1198C(String... strArr) {
        InterfaceC20630d interfaceC20630d = this.f101470M;
        if (interfaceC20630d != null) {
            interfaceC20630d.mo91785c(Integer.parseInt(strArr[0]), this.f101471N);
        }
        m107422i0(Integer.parseInt(strArr[0]));
    }

    /* renamed from: d0 */
    public void m107416d0(boolean z11) {
    }

    /* renamed from: e0 */
    public void m107417e0(String str) {
        if (str.isEmpty()) {
            return;
        }
        this.f101469L = str;
    }

    /* renamed from: f0 */
    public void m107418f0(a aVar) {
        this.f101468K = aVar;
    }

    /* renamed from: g0 */
    public void m107419g0(InterfaceC20630d interfaceC20630d) {
        this.f101470M = interfaceC20630d;
    }

    /* renamed from: h0 */
    public void m107420h0(String str) {
        this.f101458A = true;
        this.f101472p = str;
    }

    @Override // in.AbstractC20631e
    /* renamed from: i */
    public boolean mo107421i(boolean z11) {
        b.m107433g(this.f101473q, hashCode());
        return super.mo107421i(z11);
    }

    /* renamed from: i0 */
    public void m107422i0(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 > 100) {
            i11 %= 100;
        }
        this.f101479w = i11;
    }

    /* renamed from: j0 */
    public void m107423j0(int i11) {
        this.f101466I = i11;
    }

    /* renamed from: k0 */
    public void m107424k0() {
        this.f101467J = false;
    }

    /* renamed from: l0 */
    public void m107425l0(boolean z11) {
        this.f101461D = z11;
    }

    @Override // in.AbstractC20631e
    /* renamed from: w */
    protected boolean mo107426w() {
        return true;
    }

    public C20627a() {
        this.f101474r = "";
        this.f101476t = 0;
        this.f101477u = 0;
        this.f101478v = 0;
        this.f101479w = 0;
        this.f101481y = false;
        this.f101482z = false;
        this.f101458A = false;
        this.f101459B = false;
        this.f101460C = false;
        this.f101461D = true;
        this.f101462E = false;
        this.f101463F = false;
        this.f101465H = 0;
        this.f101466I = -1;
        this.f101467J = true;
        this.f101468K = null;
        this.f101469L = "";
        this.f101471N = "";
        this.f101515g = 2;
    }
}
