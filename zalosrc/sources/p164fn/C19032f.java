package p164fn;

import ag0.AbstractC0837p0;
import ag0.AbstractC0857z0;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import bf0.C2793a;
import c30.InterfaceC3253m;
import com.androidquery.util.AbstractC3972e;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.AbstractC17526e;
import ho0.AbstractC20110a;
import hu.C20131e;
import in.InterfaceC20630d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import lu.C22652b;
import me0.AbstractC23041d2;
import me0.AbstractC23126l;
import me0.AbstractC23228u2;
import p248iy.AbstractC20887g;
import p645xh.AbstractC29633j;

/* renamed from: fn.f */
/* loaded from: classes3.dex */
public class C19032f {

    /* renamed from: a */
    String f94865a;

    /* renamed from: d */
    int f94868d;

    /* renamed from: f */
    b f94870f;

    /* renamed from: g */
    InterfaceC20630d f94871g;

    /* renamed from: h */
    InterfaceC3253m f94872h;

    /* renamed from: i */
    InterfaceC19039m f94873i;

    /* renamed from: b */
    String f94866b = "";

    /* renamed from: c */
    String f94867c = "";

    /* renamed from: e */
    HashMap f94869e = new HashMap();

    /* renamed from: j */
    private final Handler f94874j = new Handler(C2793a.f11144a.m13457b());

    /* renamed from: k */
    boolean f94875k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fn.f$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20630d {
        a() {
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            C19032f c19032f = C19032f.this;
            int i11 = c19032f.f94868d;
            if (i11 == 2) {
                c19032f.m100106c(0, "");
                return;
            }
            if (i11 != 0 && i11 == 1) {
                c19032f.m100106c(0, "");
            }
            C19032f.this.f94875k = false;
            C19027a.m100086c().m100089d(C19032f.this.f94865a);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            try {
                C19032f c19032f = C19032f.this;
                int i12 = c19032f.f94868d;
                if (i12 == 2) {
                    if (i11 == 1) {
                        i11 = 78102;
                    }
                    c19032f.m100106c(i11, "");
                    C19032f.this.f94875k = false;
                    return;
                }
                if (i12 != 0 && i12 == 1) {
                    c19032f.m100106c(-1, "");
                }
                C19032f.this.f94875k = false;
                C19027a.m100086c().m100089d(C19032f.this.f94865a);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
            InterfaceC19039m interfaceC19039m;
            C19032f c19032f = C19032f.this;
            if (c19032f.f94868d == 1 && (interfaceC19039m = c19032f.f94873i) != null) {
                interfaceC19039m.mo87593c(j11, str);
            }
        }
    }

    /* renamed from: fn.f$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC0857z0 {

        /* renamed from: f */
        String f94877f;

        /* renamed from: g */
        String f94878g = "";

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public String mo2432g(String... strArr) {
            if (C19032f.this.f94868d == 2) {
                return m100113v(strArr[0]);
            }
            return m100112u(strArr[0]);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(6:2|3|(1:5)|6|(3:10|(4:13|(2:15|16)(2:18|19)|17|11)|20)|21)|(9:23|24|25|26|(2:27|(2:29|(1:52)(7:31|32|33|34|35|36|37))(2:84|85))|53|54|55|(2:57|(2:59|(7:75|76|77|(2:70|71)|64|65|66)(1:61))(1:81))(1:82))(1:89)|62|(0)|64|65|66|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01de, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01df, code lost:            r0.printStackTrace();     */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        String m100112u(String str) {
            boolean z11;
            boolean z12;
            URLConnection uRLConnection;
            int contentLength;
            FileOutputStream fileOutputStream;
            Throwable th2;
            BufferedInputStream bufferedInputStream;
            String str2;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                this.f94877f = str;
                File file = new File(C19032f.this.f94866b);
                if (file.exists()) {
                    file.deleteOnExit();
                }
                HashMap hashMap = C19032f.this.f94869e;
                z11 = true;
                if (hashMap != null && hashMap.size() > 0) {
                    boolean z13 = true;
                    for (String str3 : C19032f.this.f94869e.keySet()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f94877f);
                        if (z13) {
                            str2 = "?";
                        } else {
                            str2 = "&";
                        }
                        sb2.append(str2);
                        sb2.append(str3);
                        sb2.append("=");
                        sb2.append(Uri.encode((String) C19032f.this.f94869e.get(str3)));
                        this.f94877f = sb2.toString();
                        z13 = false;
                    }
                }
                URL url = new URL(AbstractC3972e.m18759P(this.f94877f));
                C22652b.m117234a(url.toString());
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                AbstractC23228u2.m119706e(uRLConnection);
                uRLConnection.connect();
                contentLength = uRLConnection.getContentLength();
            } catch (Exception e11) {
                e = e11;
                z11 = false;
            }
            if (contentLength > 0) {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(uRLConnection.getInputStream());
                FileOutputStream fileOutputStream2 = new FileOutputStream(C19032f.this.f94866b);
                try {
                    byte[] bArr = new byte[1024];
                    long j11 = 0;
                    while (true) {
                        int read = bufferedInputStream2.read(bArr);
                        if (read != -1) {
                            bufferedInputStream = bufferedInputStream2;
                            j11 += read;
                            if (m2435k()) {
                                break;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            long j12 = 100 * j11;
                            long j13 = contentLength;
                            FileOutputStream fileOutputStream3 = fileOutputStream2;
                            try {
                                sb3.append((int) (j12 / j13));
                                sb3.append("%");
                                this.f94878g = sb3.toString();
                                m2441s("" + ((int) (j12 / j13)));
                                fileOutputStream = fileOutputStream3;
                                try {
                                    fileOutputStream.write(bArr, 0, read);
                                    fileOutputStream2 = fileOutputStream;
                                    bufferedInputStream2 = bufferedInputStream;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th2 = th;
                                    try {
                                        fileOutputStream.close();
                                        throw th2;
                                    } catch (Throwable th4) {
                                        th2.addSuppressed(th4);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fileOutputStream = fileOutputStream3;
                                th2 = th;
                                fileOutputStream.close();
                                throw th2;
                            }
                        } else {
                            bufferedInputStream = bufferedInputStream2;
                            break;
                        }
                    }
                    fileOutputStream = fileOutputStream2;
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    if (!TextUtils.isEmpty(C19032f.this.f94866b)) {
                        if (!m2435k()) {
                            if (new File(C19032f.this.f94866b).exists()) {
                                try {
                                    C19032f c19032f = C19032f.this;
                                    c19032f.f94871g.mo91783a(c19032f.f94866b, false);
                                    z12 = true;
                                } catch (Exception e12) {
                                    e = e12;
                                    C19032f.this.f94871g.mo91784b(3, false);
                                    e.printStackTrace();
                                    AbstractC23126l.m118627a("Download file : " + this.f94877f);
                                    AbstractC23126l.m118627a("Error Download file : " + e);
                                    z12 = z11;
                                    if (!z12) {
                                    }
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    AbstractC20887g.m109221H(false, z12, 0, 10119, 0, currentTimeMillis2 - currentTimeMillis, "", currentTimeMillis, currentTimeMillis2);
                                    return "";
                                }
                                if (!z12) {
                                    try {
                                        new File(C19032f.this.f94866b).delete();
                                    } catch (Exception e13) {
                                        AbstractC20110a.m104539h(e13);
                                    }
                                }
                                long currentTimeMillis22 = System.currentTimeMillis();
                                AbstractC20887g.m109221H(false, z12, 0, 10119, 0, currentTimeMillis22 - currentTimeMillis, "", currentTimeMillis, currentTimeMillis22);
                                return "";
                            }
                            C19032f.this.f94871g.mo91784b(3, false);
                        } else {
                            C19032f.this.f94871g.mo91784b(1, false);
                        }
                    } else {
                        C19032f.this.f94871g.mo91784b(2, false);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    fileOutputStream = fileOutputStream2;
                }
            } else {
                C19032f.this.f94871g.mo91784b(2, false);
            }
            z12 = false;
            if (!z12) {
            }
            long currentTimeMillis222 = System.currentTimeMillis();
            AbstractC20887g.m109221H(false, z12, 0, 10119, 0, currentTimeMillis222 - currentTimeMillis, "", currentTimeMillis, currentTimeMillis222);
            return "";
        }

        /* renamed from: v */
        String m100113v(String str) {
            String str2;
            long j11;
            int i11;
            boolean z11;
            boolean z12;
            boolean z13;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                this.f94877f = str;
                C22652b.m117234a(str);
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(AbstractC3972e.m18759P(this.f94877f)).openConnection());
                AbstractC23228u2.m119706e(uRLConnection);
                uRLConnection.connect();
                int contentLength = uRLConnection.getContentLength();
                if ("application/vnd.android.package-archive".equalsIgnoreCase(uRLConnection.getContentType())) {
                    String str3 = "Wrong content type in Downloader: uid=" + CoreUtility.f89233i + "url=" + uRLConnection.getURL();
                    AbstractC20887g.m109240r(19008, str3);
                    AbstractC20110a.m104539h(new IllegalStateException(str3));
                }
                if (contentLength > 0) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(uRLConnection.getInputStream());
                    byte[] bArr = new byte[1024];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedInputStream.close();
                    byteArrayOutputStream.close();
                    if (byteArray != null && byteArray.length > 0) {
                        int m93349l = AbstractC17522a.m93349l(byteArray, 0);
                        if (m93349l == 20000) {
                            int m93349l2 = AbstractC17522a.m93349l(byteArray, 4);
                            int m93349l3 = AbstractC17522a.m93349l(byteArray, 8);
                            int m93349l4 = AbstractC17522a.m93349l(byteArray, 12);
                            int m93349l5 = AbstractC17522a.m93349l(byteArray, 16);
                            String m104942a0 = C20131e.f99303a.m104942a0();
                            try {
                                String str4 = m93349l2 + "";
                                String str5 = m104942a0 + "temp/" + m93349l3 + ".amr";
                                if (AbstractC23041d2.m118194A(str5)) {
                                    AbstractC23041d2.m118208g(str5);
                                }
                                File file = new File(m104942a0 + str4);
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                m104942a0 = file + "/" + m93349l3 + AbstractC17526e.f89367y[m93349l4];
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(m104942a0);
                            try {
                                fileOutputStream.write(byteArray, 20, m93349l5);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                C19032f.this.f94867c = AbstractC29633j.m147361j(m104942a0, m93349l3 + "", m93349l2 + "", m93349l4 + "", "0");
                                C19032f c19032f = C19032f.this;
                                InterfaceC20630d interfaceC20630d = c19032f.f94871g;
                                if (interfaceC20630d != null) {
                                    interfaceC20630d.mo91783a(c19032f.f94867c, false);
                                }
                                z13 = true;
                                z12 = z13;
                            } finally {
                            }
                        } else if (m93349l == 20001) {
                            C19032f.this.f94867c = AbstractC29633j.m147359h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, "missing param");
                        } else if (m93349l == 20002) {
                            C19032f.this.f94867c = AbstractC29633j.m147359h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, "item not found");
                        }
                    } else {
                        InterfaceC20630d interfaceC20630d2 = C19032f.this.f94871g;
                        if (interfaceC20630d2 != null) {
                            interfaceC20630d2.mo91784b(2, false);
                        }
                    }
                    z13 = false;
                    z12 = z13;
                } else {
                    InterfaceC20630d interfaceC20630d3 = C19032f.this.f94871g;
                    if (interfaceC20630d3 != null) {
                        interfaceC20630d3.mo91784b(2, false);
                    }
                    z12 = false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                long j12 = currentTimeMillis2 - currentTimeMillis;
                str2 = "";
                j11 = currentTimeMillis;
                i11 = 2;
                z11 = false;
                try {
                    AbstractC20887g.m109221H(false, z12, 0, 10118, 0, j12, "", currentTimeMillis, currentTimeMillis2);
                } catch (Exception e12) {
                    e = e12;
                    e.printStackTrace();
                    InterfaceC20630d interfaceC20630d4 = C19032f.this.f94871g;
                    if (interfaceC20630d4 != null) {
                        interfaceC20630d4.mo91784b(i11, z11);
                    }
                    long currentTimeMillis3 = System.currentTimeMillis();
                    long j13 = currentTimeMillis3 - j11;
                    AbstractC20887g.m109221H(false, false, 0, 10118, 0, j13, "", j11, currentTimeMillis3);
                    AbstractC20887g.m109232j(CoreUtility.f89233i, 9025, e.getMessage(), j13, 10118, CoreUtility.f89236l);
                    return str2;
                }
            } catch (Exception e13) {
                e = e13;
                str2 = "";
                j11 = currentTimeMillis;
                i11 = 2;
                z11 = false;
            }
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public void mo2440p(String... strArr) {
            InterfaceC20630d interfaceC20630d = C19032f.this.f94871g;
            if (interfaceC20630d != null) {
                interfaceC20630d.mo91785c(Integer.parseInt(strArr[0]), this.f94878g);
            }
        }
    }

    public C19032f(String str, int i11) {
        this.f94865a = "";
        this.f94868d = 0;
        this.f94865a = str;
        this.f94868d = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m100104d(int i11, String str) {
        InterfaceC19039m interfaceC19039m;
        try {
            int i12 = this.f94868d;
            if (i12 == 2) {
                InterfaceC3253m interfaceC3253m = this.f94872h;
                if (interfaceC3253m != null) {
                    if (i11 == 0) {
                        interfaceC3253m.mo16525c(this.f94867c);
                    } else {
                        interfaceC3253m.mo16524b(i11, str);
                    }
                }
            } else if (i12 == 1 && (interfaceC19039m = this.f94873i) != null) {
                if (i11 == 0) {
                    interfaceC19039m.mo87594d();
                } else {
                    interfaceC19039m.mo87592b(str);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m100105b() {
        InterfaceC19039m interfaceC19039m;
        try {
            this.f94870f.m2431f(true);
            int i11 = this.f94868d;
            if (i11 == 2) {
                InterfaceC3253m interfaceC3253m = this.f94872h;
                if (interfaceC3253m != null) {
                    interfaceC3253m.mo16523a();
                    return;
                }
                return;
            }
            if (i11 == 1 && (interfaceC19039m = this.f94873i) != null) {
                interfaceC19039m.mo87591a();
            }
            this.f94875k = false;
            C19027a.m100086c().m100089d(this.f94865a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    void m100106c(final int i11, final String str) {
        try {
            this.f94874j.post(new Runnable() { // from class: fn.e
                @Override // java.lang.Runnable
                public final void run() {
                    C19032f.this.m100104d(i11, str);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m100107e(String str) {
        this.f94866b = str;
    }

    /* renamed from: f */
    public void m100108f(InterfaceC3253m interfaceC3253m) {
        this.f94872h = interfaceC3253m;
    }

    /* renamed from: g */
    public void m100109g(InterfaceC19039m interfaceC19039m) {
        this.f94873i = interfaceC19039m;
    }

    /* renamed from: h */
    public void m100110h() {
        this.f94870f = new b();
        this.f94871g = new a();
        String str = this.f94865a;
        if (str != null && str.length() > 0) {
            this.f94875k = true;
            this.f94870f.m2434i(AbstractC0837p0.m2225f(), this.f94865a);
        }
    }
}
