package jm0;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.AbstractC17527f;
import com.zing.zalocore.connection.socket.NativeHttp;
import com.zing.zalocore.connection.socket.RequestDownloadListener;
import com.zing.zalocore.connection.socket.RequestPacket;
import com.zing.zalocore.utils.cryptology.CoreUtils;
import hm0.AbstractC20095b;
import hm0.C20096c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import me0.AbstractC23228u2;
import mm0.AbstractC23347b;
import mm0.AbstractC23356k;
import org.json.JSONException;
import org.json.JSONObject;
import p227i3.C20218v;

/* renamed from: jm0.h */
/* loaded from: classes.dex */
public abstract class AbstractC21298h implements InterfaceC21292b {

    /* renamed from: H */
    private static boolean f103750H = false;

    /* renamed from: A */
    protected String f103751A;

    /* renamed from: C */
    protected String f103753C;

    /* renamed from: D */
    protected String[] f103754D;

    /* renamed from: E */
    protected String[] f103755E;

    /* renamed from: G */
    public InterfaceC21299i f103757G;

    /* renamed from: j */
    public long f103767j;

    /* renamed from: m */
    public RequestPacket f103770m;

    /* renamed from: n */
    private ArrayList f103771n;

    /* renamed from: o */
    public String f103772o;

    /* renamed from: q */
    private Hashtable f103774q;

    /* renamed from: s */
    protected int f103776s;

    /* renamed from: x */
    private List f103781x;

    /* renamed from: y */
    private AbstractC21293c f103782y;

    /* renamed from: a */
    private String f103758a = "multipart/form-data; boundary=ZiNgMeEmAiL";

    /* renamed from: b */
    private int f103759b = 16;

    /* renamed from: c */
    private boolean f103760c = false;

    /* renamed from: d */
    public boolean f103761d = false;

    /* renamed from: e */
    private int f103762e = 0;

    /* renamed from: f */
    public int f103763f = 3;

    /* renamed from: g */
    public int f103764g = 0;

    /* renamed from: h */
    private boolean f103765h = false;

    /* renamed from: i */
    public int f103766i = 0;

    /* renamed from: k */
    private long f103768k = 0;

    /* renamed from: l */
    private boolean f103769l = false;

    /* renamed from: p */
    public int f103773p = 0;

    /* renamed from: r */
    public int f103775r = 0;

    /* renamed from: t */
    private long f103777t = 0;

    /* renamed from: u */
    private boolean f103778u = false;

    /* renamed from: v */
    private long f103779v = 0;

    /* renamed from: w */
    private long f103780w = 0;

    /* renamed from: z */
    private EnumC21297g f103783z = EnumC21297g.DEFAULT;

    /* renamed from: B */
    Hashtable f103752B = new Hashtable();

    /* renamed from: F */
    public int f103756F = -1;

    /* renamed from: jm0.h$a */
    /* loaded from: classes.dex */
    public class a extends RequestDownloadListener {
        a(AbstractC21298h abstractC21298h) {
            super(abstractC21298h);
        }

        @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
        public void onDownloadBufferComplete(int i11, int i12, byte[] bArr, int i13) {
            AbstractC21298h abstractC21298h = (AbstractC21298h) m93268a();
            if (abstractC21298h == null) {
                return;
            }
            if (i11 == 0 && i12 == 200) {
                abstractC21298h.mo110296L(i11, i12, bArr, i13);
            } else {
                if (i12 == 206) {
                    abstractC21298h.m110295K(bArr, i13);
                    return;
                }
                if (i11 == 0) {
                    i11 = i12;
                }
                abstractC21298h.m110292H(i11, bArr, i13);
            }
        }

        @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
        public void onDownloadFail(C20096c c20096c) {
            InterfaceC21299i interfaceC21299i;
            AbstractC21298h abstractC21298h = (AbstractC21298h) m93268a();
            if (abstractC21298h != null && (interfaceC21299i = abstractC21298h.f103757G) != null) {
                interfaceC21299i.mo1342c(c20096c);
            }
        }

        @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
        public void onDownloadHttpComplete(int i11, int i12, byte[] bArr, int i13, boolean z11) {
        }

        @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
        public void onProgressUpdate(int i11) {
        }
    }

    /* renamed from: jm0.h$b */
    /* loaded from: classes7.dex */
    public class b implements InterfaceC21303m {
        b() {
        }

        @Override // jm0.InterfaceC21303m
        /* renamed from: a */
        public void mo51590a(int i11) {
            InterfaceC21299i interfaceC21299i = AbstractC21298h.this.f103757G;
            if (interfaceC21299i instanceof InterfaceC21303m) {
                try {
                    ((InterfaceC21303m) interfaceC21299i).mo51590a(i11);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }

        @Override // jm0.InterfaceC21303m
        /* renamed from: b */
        public void mo51591b(JSONObject jSONObject, boolean z11) {
            try {
                AbstractC21298h.this.mo110302W(jSONObject);
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
                InterfaceC21299i interfaceC21299i = AbstractC21298h.this.f103757G;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1342c(new C20096c(50001, AbstractC20095b.f98829a));
                }
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            InterfaceC21299i interfaceC21299i = AbstractC21298h.this.f103757G;
            if (interfaceC21299i != null) {
                interfaceC21299i.mo1342c(c20096c);
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public /* synthetic */ void mo1343f(JSONObject jSONObject) {
            AbstractC21302l.m110331a(this, jSONObject);
        }
    }

    /* renamed from: jm0.h$c */
    /* loaded from: classes7.dex */
    public class c implements InterfaceC21303m {
        c() {
        }

        @Override // jm0.InterfaceC21303m
        /* renamed from: a */
        public void mo51590a(int i11) {
            InterfaceC21299i interfaceC21299i = AbstractC21298h.this.f103757G;
            if ((interfaceC21299i instanceof InterfaceC21303m) && interfaceC21299i != null) {
                try {
                    ((InterfaceC21303m) interfaceC21299i).mo51590a(i11);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }

        @Override // jm0.InterfaceC21303m
        /* renamed from: b */
        public void mo51591b(JSONObject jSONObject, boolean z11) {
            try {
                AbstractC21298h.this.mo110302W(jSONObject);
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
                InterfaceC21299i interfaceC21299i = AbstractC21298h.this.f103757G;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1342c(new C20096c(50001, AbstractC20095b.f98829a));
                }
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            InterfaceC21299i interfaceC21299i = AbstractC21298h.this.f103757G;
            if (interfaceC21299i != null) {
                interfaceC21299i.mo1342c(c20096c);
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public /* synthetic */ void mo1343f(JSONObject jSONObject) {
            AbstractC21302l.m110331a(this, jSONObject);
        }
    }

    /* renamed from: jm0.h$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private static final NativeHttp f103786a = NativeHttp.m93188g();

        /* renamed from: f */
        public static void m110324f(int i11) {
            f103786a.m93191e(i11);
        }

        /* renamed from: g */
        public static void m110325g(String str, int i11) {
            f103786a.m93190d(str, i11);
        }

        /* renamed from: h */
        public static void m110326h(String str, int i11, Object obj, byte[] bArr, int i12, long j11, int i13, boolean z11, int i14, RequestDownloadListener requestDownloadListener) {
            f103786a.m93189c(str, i11, obj, bArr, i12, j11, i13, z11, i14, requestDownloadListener);
        }

        /* renamed from: i */
        public static void m110327i(String str, int i11, String str2, int i12, String str3, String str4, String str5, int i13, boolean z11, int i14, long j11, boolean z12, String str6, String str7, String str8, Object obj, Object obj2, InterfaceC21299i interfaceC21299i) {
            f103786a.m93193h(str, i11, str2, i12, str3, str4, str5, i13, z11, i14, j11, z12, str6, str7, str8, obj, obj2, interfaceC21299i);
        }

        /* renamed from: j */
        public static void m110328j(String str, int i11, byte[] bArr, String str2, String str3, String str4, String str5, boolean z11, boolean z12, Object obj, Object obj2, InterfaceC21299i interfaceC21299i) {
            f103786a.m93194i(str, i11, bArr, str2, str3, str4, str5, z11, z12, obj, obj2, interfaceC21299i);
        }
    }

    public AbstractC21298h(InterfaceC21299i interfaceC21299i) {
        this.f103767j = 0L;
        this.f103757G = interfaceC21299i;
        this.f103767j = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d7 A[Catch: all -> 0x015f, Exception -> 0x0164, IOException -> 0x016a, UnknownHostException -> 0x0170, JSONException -> 0x0176, TryCatch #20 {all -> 0x015f, blocks: (B:11:0x010e, B:13:0x0140, B:16:0x014a, B:19:0x015b, B:22:0x017e, B:23:0x0190, B:26:0x01a1, B:28:0x01a9, B:30:0x01bb, B:32:0x01c6, B:34:0x01c9, B:38:0x01cd, B:40:0x01d7, B:41:0x01de, B:44:0x01ea, B:46:0x01f2, B:48:0x0217, B:50:0x023a, B:52:0x0244, B:54:0x0247, B:72:0x024a, B:74:0x0267, B:90:0x0275, B:91:0x0288, B:79:0x0290, B:88:0x0294, B:95:0x0285), top: B:10:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0267 A[Catch: all -> 0x015f, Exception -> 0x0164, IOException -> 0x016a, UnknownHostException -> 0x0170, JSONException -> 0x0176, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x015f, blocks: (B:11:0x010e, B:13:0x0140, B:16:0x014a, B:19:0x015b, B:22:0x017e, B:23:0x0190, B:26:0x01a1, B:28:0x01a9, B:30:0x01bb, B:32:0x01c6, B:34:0x01c9, B:38:0x01cd, B:40:0x01d7, B:41:0x01de, B:44:0x01ea, B:46:0x01f2, B:48:0x0217, B:50:0x023a, B:52:0x0244, B:54:0x0247, B:72:0x024a, B:74:0x0267, B:90:0x0275, B:91:0x0288, B:79:0x0290, B:88:0x0294, B:95:0x0285), top: B:10:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r26v0, types: [jm0.b, jm0.h] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m110273G() {
        String str;
        String str2;
        Throwable th2;
        Exception exc;
        HttpURLConnection httpURLConnection;
        JSONException jSONException;
        HttpURLConnection httpURLConnection2;
        IOException iOException;
        HttpURLConnection httpURLConnection3;
        UnknownHostException unknownHostException;
        HttpURLConnection httpURLConnection4;
        StringBuilder sb2;
        HttpURLConnection httpURLConnection5;
        int i11;
        byte[] bytes;
        long j11;
        boolean mo51547Q = mo51547Q();
        Hashtable hashtable = new Hashtable();
        this.f103774q = hashtable;
        if (this.f103783z == EnumC21297g.WITHOUT_AUTHENTICATION_INFO) {
            this.f103772o = AbstractC21309s.m110343g(this.f103751A, this.f103753C, this.f103754D, this.f103755E, hashtable);
        } else {
            str = this.f103751A;
            this.f103772o = AbstractC21309s.m110342f(str, this.f103753C, this.f103754D, this.f103755E, mo51546E(), CoreUtility.f89226b, CoreUtility.f89232h, mo51561z(), this.f103774q);
            if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
                String m110281l = m110281l(this.f103774q);
                this.f103774q.clear();
                this.f103772o = AbstractC21309s.m110344h(this.f103751A, CoreUtility.f89226b, m110281l, this.f103774q);
            }
        }
        String m110339c = AbstractC21309s.m110339c(this.f103774q);
        String str3 = "";
        if (!mo51547Q) {
            this.f103774q.put("sig", m110339c);
            str2 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("session_key=" + CoreUtility.f89232h);
            arrayList.add("api_key=" + CoreUtility.f89226b);
            arrayList.add("sig=" + m110339c);
            str2 = AbstractC23356k.m122796b(arrayList, "; ") + ";";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Start request ");
        sb3.append(this.f103776s);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("URL = ");
        sb4.append(this.f103772o);
        ?? r7 = 0;
        try {
            try {
                httpURLConnection5 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f103772o).openConnection()));
            } catch (UnknownHostException e11) {
                unknownHostException = e11;
                httpURLConnection4 = null;
            } catch (IOException e12) {
                iOException = e12;
                httpURLConnection3 = null;
            } catch (JSONException e13) {
                jSONException = e13;
                httpURLConnection2 = null;
            } catch (Exception e14) {
                exc = e14;
                httpURLConnection = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                try {
                    httpURLConnection5.setRequestProperty("Accept-Encoding", "gzip");
                    httpURLConnection5.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent"));
                    i11 = 1;
                    httpURLConnection5.setDoInput(true);
                    httpURLConnection5.setDoOutput(true);
                    httpURLConnection5.setRequestMethod("POST");
                    httpURLConnection5.setRequestProperty("Content-Type", "multipart/form-data; boundary=ZiNgMeMoBiLe");
                    m110279f(httpURLConnection5);
                    if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
                        String m93451f = CoreUtils.m93451f();
                        if (m93451f == null) {
                            m93451f = "";
                        }
                        httpURLConnection5.setRequestProperty("zcid", m93451f);
                        httpURLConnection5.setRequestProperty(C20218v.f100059b, "v2");
                        String str4 = CoreUtility.f89232h;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        httpURLConnection5.setRequestProperty("session_key", str3);
                    }
                    if (mo51547Q) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Cookie = ");
                        sb5.append(str2);
                        httpURLConnection5.setRequestProperty("Cookie", str2);
                    }
                    mo82640T(httpURLConnection5);
                    bytes = "\r\n".getBytes("UTF-8");
                } catch (UnknownHostException e15) {
                    unknownHostException = e15;
                    httpURLConnection4 = httpURLConnection5;
                    mo51556q(unknownHostException);
                    AbstractC20110a.m104539h(unknownHostException);
                    String str5 = "url: " + this.f103772o + "error: " + unknownHostException.toString();
                    long currentTimeMillis = System.currentTimeMillis();
                    long j12 = this.f103779v;
                    long j13 = currentTimeMillis - j12;
                    mo51553m0(false, false, 0, this.f103756F, 0, j13, "", j12, currentTimeMillis);
                    mo51548R(CoreUtility.f89233i, 9001, str5, j13, this.f103756F, CoreUtility.f89236l);
                    if (httpURLConnection4 != null) {
                        try {
                            httpURLConnection4.disconnect();
                        } catch (Exception e16) {
                            AbstractC20110a.m104539h(e16);
                        }
                    }
                    sb2 = new StringBuilder();
                    sb2.append(this.f103753C);
                    sb2.append(" API END");
                    return;
                } catch (IOException e17) {
                    iOException = e17;
                    httpURLConnection3 = httpURLConnection5;
                    if (iOException instanceof SSLPeerUnverifiedException) {
                        AbstractC23347b.m122760b();
                    }
                    if (iOException.getMessage() != null && iOException.getMessage().trim().equalsIgnoreCase("No peer certificate")) {
                        InterfaceC21299i interfaceC21299i = this.f103757G;
                        if (interfaceC21299i != null) {
                            interfaceC21299i.mo1342c(new C20096c(515, AbstractC20095b.f98834f));
                        }
                    } else if (iOException.getMessage() != null && iOException.getMessage().trim().equalsIgnoreCase("Skip bytes failed.")) {
                        InterfaceC21299i interfaceC21299i2 = this.f103757G;
                        if (interfaceC21299i2 != null) {
                            interfaceC21299i2.mo1342c(new C20096c(78103, AbstractC20095b.f98835g));
                        }
                    } else {
                        mo51556q(iOException);
                    }
                    AbstractC20110a.m104539h(iOException);
                    String str6 = "url: " + this.f103772o + "error: " + iOException.toString();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j14 = this.f103779v;
                    long j15 = currentTimeMillis2 - j14;
                    mo51553m0(false, false, 0, this.f103756F, 0, j15, "", j14, currentTimeMillis2);
                    mo51548R(CoreUtility.f89233i, 9002, str6, j15, this.f103756F, CoreUtility.f89236l);
                    if (httpURLConnection3 != null) {
                        try {
                            httpURLConnection3.disconnect();
                        } catch (Exception e18) {
                            AbstractC20110a.m104539h(e18);
                        }
                    }
                    sb2 = new StringBuilder();
                    sb2.append(this.f103753C);
                    sb2.append(" API END");
                    return;
                } catch (JSONException e19) {
                    jSONException = e19;
                    httpURLConnection2 = httpURLConnection5;
                    mo51556q(jSONException);
                    AbstractC20110a.m104539h(jSONException);
                    String str7 = "url: " + this.f103772o + "error: " + jSONException.toString();
                    long currentTimeMillis3 = System.currentTimeMillis();
                    long j16 = this.f103779v;
                    long j17 = currentTimeMillis3 - j16;
                    mo51553m0(false, false, 0, this.f103756F, 0, j17, "", j16, currentTimeMillis3);
                    mo51548R(CoreUtility.f89233i, 9006, str7, j17, this.f103756F, CoreUtility.f89236l);
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception e21) {
                            AbstractC20110a.m104539h(e21);
                        }
                    }
                    sb2 = new StringBuilder();
                    sb2.append(this.f103753C);
                    sb2.append(" API END");
                    return;
                } catch (Exception e22) {
                    exc = e22;
                    httpURLConnection = httpURLConnection5;
                    mo51556q(exc);
                    AbstractC20110a.m104539h(exc);
                    String str8 = "url: " + this.f103772o + "error: " + exc.toString();
                    long currentTimeMillis4 = System.currentTimeMillis();
                    long j18 = this.f103779v;
                    long j19 = currentTimeMillis4 - j18;
                    mo51553m0(false, false, 0, this.f103756F, 0, j19, "", j18, currentTimeMillis4);
                    mo51548R(CoreUtility.f89233i, 9003, str8, j19, this.f103756F, CoreUtility.f89236l);
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e23) {
                            AbstractC20110a.m104539h(e23);
                        }
                    }
                    sb2 = new StringBuilder();
                    sb2.append(this.f103753C);
                    sb2.append(" API END");
                    return;
                }
                if (this.f103781x != null) {
                    j11 = 0;
                    int i12 = 0;
                    while (i12 < this.f103781x.size()) {
                        long mo110259c = ((AbstractC21293c) this.f103781x.get(i12)).mo110259c();
                        if (mo110259c >= 0) {
                            j11 += mo110259c;
                            if (i12 < this.f103781x.size() - i11) {
                                j11 += bytes.length;
                            }
                            i12++;
                            i11 = 1;
                        }
                    }
                    byte[] bytes2 = "\r\n--ZiNgMeMoBiLe--\r\n".getBytes("UTF-8");
                    if (j11 > 0) {
                        httpURLConnection5.setFixedLengthStreamingMode((int) (j11 + bytes2.length));
                    }
                    httpURLConnection5.connect();
                    OutputStream outputStream = httpURLConnection5.getOutputStream();
                    if (this.f103781x != null) {
                        for (int i13 = 0; i13 < this.f103781x.size(); i13++) {
                            AbstractC21293c abstractC21293c = (AbstractC21293c) this.f103781x.get(i13);
                            if (mo110257a()) {
                                try {
                                    httpURLConnection5.disconnect();
                                } catch (Exception e24) {
                                    AbstractC20110a.m104539h(e24);
                                }
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(this.f103753C);
                                sb6.append(" API END");
                                return;
                            }
                            abstractC21293c.m110261e(this);
                            abstractC21293c.m110263g(outputStream);
                            if (mo110257a()) {
                                try {
                                    httpURLConnection5.disconnect();
                                } catch (Exception e25) {
                                    AbstractC20110a.m104539h(e25);
                                }
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(this.f103753C);
                                sb7.append(" API END");
                                return;
                            }
                            if (i13 < this.f103781x.size() - 1) {
                                outputStream.write(bytes);
                            }
                        }
                    }
                    if (!mo110257a()) {
                        try {
                            httpURLConnection5.disconnect();
                        } catch (Exception e26) {
                            AbstractC20110a.m104539h(e26);
                        }
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(this.f103753C);
                        sb8.append(" API END");
                        return;
                    }
                    outputStream.write(bytes2);
                    outputStream.close();
                    int responseCode = httpURLConnection5.getResponseCode();
                    if (responseCode == 200) {
                        try {
                            AbstractC23347b.m122759a(httpURLConnection5.getContentType(), httpURLConnection5.getHeaderField(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION));
                        } catch (Exception e27) {
                            AbstractC20110a.m104539h(e27);
                        }
                        mo110297M(httpURLConnection5);
                    } else if (responseCode == 206) {
                        mo110294J(httpURLConnection5);
                    } else {
                        mo110293I(httpURLConnection5, responseCode);
                    }
                    try {
                        httpURLConnection5.disconnect();
                    } catch (Exception e28) {
                        AbstractC20110a.m104539h(e28);
                    }
                    sb2 = new StringBuilder();
                    sb2.append(this.f103753C);
                    sb2.append(" API END");
                    return;
                }
                j11 = 0;
                byte[] bytes22 = "\r\n--ZiNgMeMoBiLe--\r\n".getBytes("UTF-8");
                if (j11 > 0) {
                }
                httpURLConnection5.connect();
                OutputStream outputStream2 = httpURLConnection5.getOutputStream();
                if (this.f103781x != null) {
                }
                if (!mo110257a()) {
                }
            } catch (Throwable th4) {
                th2 = th4;
                r7 = httpURLConnection5;
                if (r7 != 0) {
                    try {
                        r7.disconnect();
                    } catch (Exception e29) {
                        AbstractC20110a.m104539h(e29);
                    }
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(this.f103753C);
                sb9.append(" API END");
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
            r7 = str;
        }
    }

    /* renamed from: N */
    private void m110274N() {
        if (this.f103777t <= 0) {
            this.f103777t = AbstractC20626a.m107385a(1);
        }
    }

    /* renamed from: c */
    private static RequestDownloadListener m110275c(AbstractC21298h abstractC21298h) {
        return new a(abstractC21298h);
    }

    /* renamed from: d */
    private String m110276d(Map map, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        String str2 = (String) map.get(str);
                        sb2.append("--ZiNgMeMoBiLe\r\n");
                        sb2.append("Content-Disposition: form-data; name=\"");
                        sb2.append(str);
                        sb2.append("\"\r\n\r\n");
                        sb2.append(str2);
                        sb2.append("\r\n");
                    }
                    if (z11) {
                        sb2.append("--ZiNgMeMoBiLe--\r\n");
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return sb2.toString();
    }

    /* renamed from: d0 */
    public static void m110277d0(boolean z11) {
        f103750H = z11;
    }

    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0247: MOVE (r5 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]) (LINE:584), block:B:110:0x0246 */
    /* renamed from: e */
    private void m110278e() {
        String str;
        Throwable th2;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3;
        HttpURLConnection httpURLConnection4;
        HttpURLConnection httpURLConnection5;
        StringBuilder sb2;
        boolean mo51547Q = mo51547Q();
        Hashtable hashtable = new Hashtable();
        if (this.f103783z == EnumC21297g.WITHOUT_AUTHENTICATION_INFO) {
            this.f103772o = AbstractC21309s.m110343g(this.f103751A, this.f103753C, this.f103754D, this.f103755E, hashtable);
        } else {
            this.f103772o = AbstractC21309s.m110342f(this.f103751A, this.f103753C, this.f103754D, this.f103755E, mo51546E(), CoreUtility.f89226b, CoreUtility.f89232h, mo51561z(), hashtable);
            if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
                String m110281l = m110281l(hashtable);
                hashtable.clear();
                this.f103772o = AbstractC21309s.m110344h(this.f103751A, CoreUtility.f89226b, m110281l, hashtable);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[WARNING]: PLEASE USE NATIVE GET:  ");
        sb3.append(this.f103772o);
        String m110339c = AbstractC21309s.m110339c(hashtable);
        String str2 = "";
        if (!mo51547Q) {
            if (m110339c != null) {
                this.f103772o += "&sig=" + m110339c;
            }
            str = "";
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("session_key=" + CoreUtility.f89232h);
            arrayList.add("api_key=" + CoreUtility.f89226b);
            arrayList.add("sig=" + m110339c);
            str = AbstractC23356k.m122796b(arrayList, "; ") + ";";
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f103753C);
        sb4.append(" API START method GET: \n");
        sb4.append(this.f103772o);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Start request ");
        sb5.append(this.f103776s);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("URL = ");
        sb6.append(this.f103772o);
        HttpURLConnection httpURLConnection6 = null;
        try {
            try {
                HttpURLConnection httpURLConnection7 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f103772o).openConnection()));
                if (mo51547Q) {
                    try {
                        try {
                            httpURLConnection7.setRequestProperty("Cookie", str);
                        } catch (UnknownHostException e11) {
                            e = e11;
                            httpURLConnection4 = httpURLConnection7;
                            mo51556q(e);
                            AbstractC20110a.m104539h(e);
                            String str3 = "url: " + this.f103772o + "error: " + e.toString();
                            long currentTimeMillis = System.currentTimeMillis();
                            long j11 = this.f103779v;
                            long j12 = currentTimeMillis - j11;
                            mo51553m0(false, false, 0, this.f103756F, 0, j12, "", j11, currentTimeMillis);
                            mo51548R(CoreUtility.f89233i, 9001, str3, j12, this.f103756F, CoreUtility.f89236l);
                            if (httpURLConnection4 != null) {
                                try {
                                    httpURLConnection4.disconnect();
                                } catch (Exception e12) {
                                    AbstractC20110a.m104539h(e12);
                                }
                            }
                            sb2 = new StringBuilder();
                            sb2.append(this.f103753C);
                            sb2.append(" API END");
                        } catch (IOException e13) {
                            e = e13;
                            httpURLConnection3 = httpURLConnection7;
                            if (e instanceof SSLPeerUnverifiedException) {
                                AbstractC23347b.m122760b();
                            }
                            if (e.getMessage() != null && e.getMessage().trim().equalsIgnoreCase("No peer certificate")) {
                                InterfaceC21299i interfaceC21299i = this.f103757G;
                                if (interfaceC21299i != null) {
                                    interfaceC21299i.mo1342c(new C20096c(515, AbstractC20095b.f98834f));
                                }
                            } else {
                                mo51556q(e);
                            }
                            AbstractC20110a.m104539h(e);
                            String str4 = "url: " + this.f103772o + "error: " + e.toString();
                            long currentTimeMillis2 = System.currentTimeMillis();
                            long j13 = this.f103779v;
                            long j14 = currentTimeMillis2 - j13;
                            mo51553m0(false, false, 0, this.f103756F, 0, j14, "", j13, currentTimeMillis2);
                            mo51548R(CoreUtility.f89233i, 9002, str4, j14, this.f103756F, CoreUtility.f89236l);
                            if (httpURLConnection3 != null) {
                                try {
                                    httpURLConnection3.disconnect();
                                } catch (Exception e14) {
                                    AbstractC20110a.m104539h(e14);
                                }
                            }
                            sb2 = new StringBuilder();
                            sb2.append(this.f103753C);
                            sb2.append(" API END");
                        } catch (JSONException e15) {
                            e = e15;
                            httpURLConnection2 = httpURLConnection7;
                            mo51556q(e);
                            AbstractC20110a.m104539h(e);
                            String str5 = "url: " + this.f103772o + "error: " + e.toString();
                            long currentTimeMillis3 = System.currentTimeMillis();
                            long j15 = this.f103779v;
                            long j16 = currentTimeMillis3 - j15;
                            mo51553m0(false, false, 0, this.f103756F, 0, j16, "", j15, currentTimeMillis3);
                            mo51548R(CoreUtility.f89233i, 9006, str5, j16, this.f103756F, CoreUtility.f89236l);
                            if (httpURLConnection2 != null) {
                                try {
                                    httpURLConnection2.disconnect();
                                } catch (Exception e16) {
                                    AbstractC20110a.m104539h(e16);
                                }
                            }
                            sb2 = new StringBuilder();
                            sb2.append(this.f103753C);
                            sb2.append(" API END");
                        } catch (Exception e17) {
                            e = e17;
                            httpURLConnection = httpURLConnection7;
                            mo51556q(e);
                            AbstractC20110a.m104539h(e);
                            String str6 = "url: " + this.f103772o + "error: " + e.toString();
                            long currentTimeMillis4 = System.currentTimeMillis();
                            long j17 = this.f103779v;
                            long j18 = currentTimeMillis4 - j17;
                            mo51553m0(false, false, 0, this.f103756F, 0, j18, "", j17, currentTimeMillis4);
                            mo51548R(CoreUtility.f89233i, 9003, str6, j18, this.f103756F, CoreUtility.f89236l);
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception e18) {
                                    AbstractC20110a.m104539h(e18);
                                }
                            }
                            sb2 = new StringBuilder();
                            sb2.append(this.f103753C);
                            sb2.append(" API END");
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        httpURLConnection6 = httpURLConnection7;
                        if (httpURLConnection6 != null) {
                            try {
                                httpURLConnection6.disconnect();
                            } catch (Exception e19) {
                                AbstractC20110a.m104539h(e19);
                            }
                        }
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(this.f103753C);
                        sb7.append(" API END");
                        throw th2;
                    }
                }
                httpURLConnection7.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection7.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent"));
                if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
                    String m93451f = CoreUtils.m93451f();
                    if (m93451f == null) {
                        m93451f = "";
                    }
                    httpURLConnection7.setRequestProperty("zcid", m93451f);
                    httpURLConnection7.setRequestProperty(C20218v.f100059b, "v2");
                    String str7 = CoreUtility.f89232h;
                    if (str7 != null) {
                        str2 = str7;
                    }
                    httpURLConnection7.setRequestProperty("session_key", str2);
                }
                httpURLConnection7.setRequestProperty("nretry", String.valueOf(m110289C()));
                m110279f(httpURLConnection7);
                mo82640T(httpURLConnection7);
                int responseCode = httpURLConnection7.getResponseCode();
                if (responseCode == 200) {
                    try {
                        AbstractC23347b.m122759a(httpURLConnection7.getContentType(), httpURLConnection7.getHeaderField(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION));
                    } catch (Exception e21) {
                        AbstractC20110a.m104539h(e21);
                    }
                    mo110297M(httpURLConnection7);
                } else if (responseCode == 206) {
                    mo110294J(httpURLConnection7);
                } else {
                    mo110293I(httpURLConnection7, responseCode);
                }
                try {
                    httpURLConnection7.disconnect();
                } catch (Exception e22) {
                    AbstractC20110a.m104539h(e22);
                }
                sb2 = new StringBuilder();
            } catch (UnknownHostException e23) {
                e = e23;
                httpURLConnection4 = null;
            } catch (IOException e24) {
                e = e24;
                httpURLConnection3 = null;
            } catch (JSONException e25) {
                e = e25;
                httpURLConnection2 = null;
            } catch (Exception e26) {
                e = e26;
                httpURLConnection = null;
            } catch (Throwable th4) {
                th2 = th4;
            }
            sb2.append(this.f103753C);
            sb2.append(" API END");
        } catch (Throwable th5) {
            th2 = th5;
            httpURLConnection6 = httpURLConnection5;
        }
    }

    /* renamed from: f */
    private void m110279f(URLConnection uRLConnection) {
        long m110288B = m110288B();
        if (m110288B <= 0) {
            m110288B = AbstractC20626a.m107385a(1);
        }
        int i11 = (int) m110288B;
        uRLConnection.setConnectTimeout(i11);
        uRLConnection.setReadTimeout(i11);
    }

    /* renamed from: k */
    private void m110280k() {
        String str;
        if (this.f103751A.startsWith("https://")) {
            mo110301U();
        }
        boolean mo51547Q = mo51547Q();
        Hashtable hashtable = new Hashtable();
        if (this.f103783z == EnumC21297g.WITHOUT_AUTHENTICATION_INFO) {
            this.f103772o = AbstractC21309s.m110343g(this.f103751A, this.f103753C, this.f103754D, this.f103755E, hashtable);
        } else {
            this.f103772o = AbstractC21309s.m110342f(this.f103751A, this.f103753C, this.f103754D, this.f103755E, mo51546E(), CoreUtility.f89226b, CoreUtility.f89232h, mo51561z(), hashtable);
            if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
                String m110281l = m110281l(hashtable);
                hashtable.clear();
                this.f103772o = AbstractC21309s.m110344h(this.f103751A, CoreUtility.f89226b, m110281l, hashtable);
            }
        }
        String m110339c = AbstractC21309s.m110339c(hashtable);
        String str2 = "";
        if (!mo51547Q) {
            if (m110339c != null) {
                this.f103772o += "&sig=" + m110339c;
            }
            str = "";
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("session_key=" + CoreUtility.f89232h);
            arrayList.add("api_key=" + CoreUtility.f89226b);
            arrayList.add("sig=" + m110339c);
            str = AbstractC23356k.m122796b(arrayList, "; ") + ";";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f103753C);
        sb2.append(" API START method GET: \n");
        sb2.append(this.f103772o);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Start request ");
        sb3.append(this.f103776s);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("URL = ");
        sb4.append(this.f103772o);
        if (mo51547Q) {
            this.f103752B.put("Cookie", str);
        }
        this.f103752B.put("User-Agent", System.getProperties().getProperty("http.agent"));
        if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
            String m93451f = CoreUtils.m93451f();
            Hashtable hashtable2 = this.f103752B;
            if (m93451f == null) {
                m93451f = "";
            }
            hashtable2.put("zcid", m93451f);
            this.f103752B.put(C20218v.f100059b, "v2");
            Hashtable hashtable3 = this.f103752B;
            String str3 = CoreUtility.f89232h;
            if (str3 != null) {
                str2 = str3;
            }
            hashtable3.put("session_key", str2);
        }
        m110274N();
        d.m110326h(this.f103772o, this.f103756F, this.f103752B, null, 0, this.f103777t, this.f103763f, this.f103778u, this.f103773p, m110275c(this));
    }

    /* renamed from: l */
    public static String m110281l(Map map) {
        Map.Entry entry;
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator it = map.entrySet().iterator();
            while (it.hasNext() && (entry = (Map.Entry) it.next()) != null) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return CoreUtils.m93447b(jSONObject.toString());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: m */
    private void m110282m() {
        String str;
        if (TextUtils.isEmpty(this.f103772o)) {
            this.f103772o = this.f103751A;
        }
        if (this.f103751A.startsWith("https://")) {
            mo110301U();
        }
        boolean mo51547Q = mo51547Q();
        if (this.f103783z == EnumC21297g.WITHOUT_AUTHENTICATION_INFO) {
            this.f103774q = AbstractC21309s.m110340d(this.f103751A, this.f103753C, this.f103754D, this.f103755E);
        } else {
            Hashtable m110341e = AbstractC21309s.m110341e(this.f103751A, this.f103753C, this.f103754D, this.f103755E, mo51546E(), CoreUtility.f89226b, CoreUtility.f89232h, mo51561z());
            this.f103774q = m110341e;
            if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
                String m110281l = m110281l(m110341e);
                this.f103774q.clear();
                AbstractC21309s.m110344h(this.f103751A, CoreUtility.f89226b, m110281l, this.f103774q);
            }
        }
        String m110339c = AbstractC21309s.m110339c(this.f103774q);
        if (!mo51547Q) {
            this.f103774q.put("sig", m110339c);
            str = "";
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("session_key=" + CoreUtility.f89232h);
            arrayList.add("api_key=" + CoreUtility.f89226b);
            arrayList.add("sig=" + m110339c);
            str = AbstractC23356k.m122796b(arrayList, "; ") + ";";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Start request ");
        sb2.append(this.f103776s);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("URL = ");
        sb3.append(this.f103772o);
        this.f103752B.put("User-Agent", System.getProperties().getProperty("http.agent"));
        this.f103752B.put("Content-Type", "application/x-www-form-urlencoded");
        if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
            String m93451f = CoreUtils.m93451f();
            Hashtable hashtable = this.f103752B;
            if (m93451f == null) {
                m93451f = "";
            }
            hashtable.put("zcid", m93451f);
            this.f103752B.put(C20218v.f100059b, "v2");
            Hashtable hashtable2 = this.f103752B;
            String str2 = CoreUtility.f89232h;
            if (str2 == null) {
                str2 = "";
            }
            hashtable2.put("session_key", str2);
        }
        if (mo51547Q()) {
            this.f103752B.put("Cookie", str);
        }
        try {
            byte[] bytes = AbstractC21305o.m110333b(this.f103774q, "UTF-8").getBytes("UTF-8");
            m110274N();
            d.m110326h(this.f103772o, this.f103756F, this.f103752B, bytes, 1, this.f103777t, this.f103763f, this.f103778u, this.f103773p, m110275c(this));
        } catch (Exception unused) {
            InterfaceC21299i interfaceC21299i = this.f103757G;
            if (interfaceC21299i != null) {
                interfaceC21299i.mo1342c(new C20096c(502, ""));
            }
        }
    }

    /* renamed from: p */
    private void m110283p() {
        String str;
        if (this.f103751A.startsWith("https://")) {
            mo110301U();
        }
        boolean mo51547Q = mo51547Q();
        Hashtable hashtable = new Hashtable();
        this.f103774q = hashtable;
        if (this.f103783z == EnumC21297g.WITHOUT_AUTHENTICATION_INFO) {
            this.f103772o = AbstractC21309s.m110343g(this.f103751A, this.f103753C, this.f103754D, this.f103755E, hashtable);
        } else {
            this.f103772o = AbstractC21309s.m110342f(this.f103751A, this.f103753C, this.f103754D, this.f103755E, mo51546E(), CoreUtility.f89226b, CoreUtility.f89232h, mo51561z(), this.f103774q);
        }
        String m93451f = CoreUtils.m93451f();
        if (mo51547Q) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("session_key=" + CoreUtility.f89232h);
            arrayList.add("api_key=" + CoreUtility.f89226b);
            this.f103752B.put("Cookie", AbstractC23356k.m122796b(arrayList, "; ") + ";");
        }
        this.f103752B.put("User-Agent", System.getProperties().getProperty("http.agent"));
        EnumC21297g enumC21297g = this.f103783z;
        EnumC21297g enumC21297g2 = EnumC21297g.ENCRYPT_PARAMETER;
        if (enumC21297g == enumC21297g2) {
            Hashtable hashtable2 = this.f103752B;
            if (m93451f == null) {
                str = "";
            } else {
                str = m93451f;
            }
            hashtable2.put("zcid", str);
            this.f103752B.put(C20218v.f100059b, "v2");
            Hashtable hashtable3 = this.f103752B;
            String str2 = CoreUtility.f89232h;
            if (str2 == null) {
                str2 = "";
            }
            hashtable3.put("session_key", str2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Start request ");
        sb2.append(this.f103776s);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("URL = ");
        sb3.append(this.f103772o);
        m110274N();
        if (this.f103782y != null) {
            if (mo110257a()) {
                return;
            }
            AbstractC21293c abstractC21293c = this.f103782y;
            if (abstractC21293c instanceof C21296f) {
                C21296f c21296f = (C21296f) abstractC21293c;
                int i11 = c21296f.f103742j;
                if (i11 != 0) {
                    if (i11 != 1) {
                        InterfaceC21299i interfaceC21299i = this.f103757G;
                        if (interfaceC21299i != null) {
                            interfaceC21299i.mo1342c(new C20096c(50001, AbstractC20095b.f98829a));
                            return;
                        }
                        return;
                    }
                    String str3 = this.f103772o;
                    if (this.f103783z == enumC21297g2) {
                        String m110281l = m110281l(this.f103774q);
                        this.f103774q.clear();
                        str3 = AbstractC21309s.m110344h(this.f103751A, CoreUtility.f89226b, m110281l, this.f103774q);
                    }
                    String str4 = str3;
                    int i12 = this.f103756F;
                    byte[] m110266i = ((C21296f) this.f103782y).m110266i();
                    AbstractC21293c abstractC21293c2 = this.f103782y;
                    d.m110328j(str4, i12, m110266i, abstractC21293c2.f103727a, abstractC21293c2.f103728b, abstractC21293c2.f103729c, CoreUtility.f89227c, mo51547Q, ((C21296f) abstractC21293c2).m110268k(), this.f103752B, ((C21296f) this.f103782y).m110269l(), new c());
                    return;
                }
                String str5 = this.f103772o;
                int i13 = this.f103756F;
                String str6 = c21296f.f103740h;
                int i14 = this.f103773p;
                String str7 = CoreUtility.f89226b;
                String str8 = CoreUtility.f89227c;
                if (m93451f == null) {
                    m93451f = "";
                }
                int m93192f = NativeHttp.m93188g().m93192f(this.f103783z);
                int m110267j = ((C21296f) this.f103782y).m110267j();
                long m110288B = m110288B();
                boolean m110268k = ((C21296f) this.f103782y).m110268k();
                AbstractC21293c abstractC21293c3 = this.f103782y;
                d.m110327i(str5, i13, str6, i14, str7, str8, m93451f, m93192f, mo51547Q, m110267j, m110288B, m110268k, abstractC21293c3.f103727a, abstractC21293c3.f103728b, abstractC21293c3.f103729c, this.f103752B, ((C21296f) abstractC21293c3).m110269l(), new b());
                return;
            }
            return;
        }
        InterfaceC21299i interfaceC21299i2 = this.f103757G;
        if (interfaceC21299i2 != null) {
            interfaceC21299i2.mo1342c(new C20096c(50001, AbstractC20095b.f98829a));
        }
    }

    /* JADX WARN: Not initialized variable reg: 16, insn: 0x025c: MOVE (r4 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]) (LINE:605), block:B:112:0x025b */
    /* renamed from: r */
    private void m110284r() {
        String str;
        Throwable th2;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3;
        HttpURLConnection httpURLConnection4;
        HttpURLConnection httpURLConnection5;
        StringBuilder sb2;
        HttpURLConnection httpURLConnection6;
        if (TextUtils.isEmpty(this.f103772o)) {
            this.f103772o = this.f103751A;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[WARNING]: PLEASE USE NATIVE POST:  ");
        sb3.append(this.f103772o);
        boolean mo51547Q = mo51547Q();
        if (this.f103783z == EnumC21297g.WITHOUT_AUTHENTICATION_INFO) {
            this.f103774q = AbstractC21309s.m110340d(this.f103751A, this.f103753C, this.f103754D, this.f103755E);
        } else {
            Hashtable m110341e = AbstractC21309s.m110341e(this.f103751A, this.f103753C, this.f103754D, this.f103755E, mo51546E(), CoreUtility.f89226b, CoreUtility.f89232h, mo51561z());
            this.f103774q = m110341e;
            if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
                String m110281l = m110281l(m110341e);
                this.f103774q.clear();
                AbstractC21309s.m110344h(this.f103751A, CoreUtility.f89226b, m110281l, this.f103774q);
            }
        }
        String m110339c = AbstractC21309s.m110339c(this.f103774q);
        String str2 = "";
        if (!mo51547Q) {
            this.f103774q.put("sig", m110339c);
            str = "";
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("session_key=" + CoreUtility.f89232h);
            arrayList.add("api_key=" + CoreUtility.f89226b);
            arrayList.add("sig=" + m110339c);
            str = AbstractC23356k.m122796b(arrayList, "; ") + ";";
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Start request ");
        sb4.append(this.f103776s);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("URL = ");
        sb5.append(this.f103772o);
        HttpURLConnection httpURLConnection7 = null;
        try {
            try {
                httpURLConnection6 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f103772o).openConnection()));
            } catch (UnknownHostException e11) {
                e = e11;
                httpURLConnection4 = null;
            } catch (IOException e12) {
                e = e12;
                httpURLConnection3 = null;
            } catch (JSONException e13) {
                e = e13;
                httpURLConnection2 = null;
            } catch (Exception e14) {
                e = e14;
                httpURLConnection = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                try {
                    httpURLConnection6.setRequestProperty("Accept-Encoding", "gzip");
                    httpURLConnection6.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent"));
                    httpURLConnection6.setDoInput(true);
                    httpURLConnection6.setRequestMethod("POST");
                    httpURLConnection6.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    m110279f(httpURLConnection6);
                    if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
                        String m93451f = CoreUtils.m93451f();
                        if (m93451f == null) {
                            m93451f = "";
                        }
                        httpURLConnection6.setRequestProperty("zcid", m93451f);
                        httpURLConnection6.setRequestProperty(C20218v.f100059b, "v2");
                        String str3 = CoreUtility.f89232h;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        httpURLConnection6.setRequestProperty("session_key", str2);
                    }
                    httpURLConnection6.setRequestProperty("nretry", String.valueOf(m110289C()));
                    if (mo51547Q()) {
                        httpURLConnection6.setRequestProperty("Cookie", str);
                    }
                    mo82640T(httpURLConnection6);
                    byte[] bytes = AbstractC21305o.m110333b(this.f103774q, "UTF-8").getBytes("UTF-8");
                    httpURLConnection6.setFixedLengthStreamingMode(bytes.length);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection6.getOutputStream());
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.close();
                    int responseCode = httpURLConnection6.getResponseCode();
                    if (responseCode == 200) {
                        try {
                            AbstractC23347b.m122759a(httpURLConnection6.getContentType(), httpURLConnection6.getHeaderField(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION));
                        } catch (Exception e15) {
                            AbstractC20110a.m104539h(e15);
                        }
                        mo110297M(httpURLConnection6);
                    } else if (responseCode == 206) {
                        mo110294J(httpURLConnection6);
                    } else {
                        mo110293I(httpURLConnection6, responseCode);
                    }
                    try {
                        httpURLConnection6.disconnect();
                    } catch (Exception e16) {
                        AbstractC20110a.m104539h(e16);
                    }
                    sb2 = new StringBuilder();
                } catch (UnknownHostException e17) {
                    e = e17;
                    httpURLConnection4 = httpURLConnection6;
                    mo51556q(e);
                    AbstractC20110a.m104539h(e);
                    String str4 = "url: " + this.f103772o + "error: " + e.toString();
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = this.f103779v;
                    long j12 = currentTimeMillis - j11;
                    mo51553m0(false, false, 0, this.f103756F, 0, j12, "", j11, currentTimeMillis);
                    mo51548R(CoreUtility.f89233i, 9001, str4, j12, this.f103756F, CoreUtility.f89236l);
                    if (httpURLConnection4 != null) {
                        try {
                            httpURLConnection4.disconnect();
                        } catch (Exception e18) {
                            AbstractC20110a.m104539h(e18);
                        }
                    }
                    sb2 = new StringBuilder();
                    sb2.append(this.f103753C);
                    sb2.append(" API END");
                } catch (IOException e19) {
                    e = e19;
                    httpURLConnection3 = httpURLConnection6;
                    if (e instanceof SSLPeerUnverifiedException) {
                        AbstractC23347b.m122760b();
                    }
                    if (e.getMessage() != null && e.getMessage().trim().equalsIgnoreCase("No peer certificate")) {
                        InterfaceC21299i interfaceC21299i = this.f103757G;
                        if (interfaceC21299i != null) {
                            interfaceC21299i.mo1342c(new C20096c(515, AbstractC20095b.f98834f));
                        }
                    } else {
                        mo51556q(e);
                    }
                    AbstractC20110a.m104539h(e);
                    String str5 = "url: " + this.f103772o + "error: " + e.toString();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j13 = this.f103779v;
                    long j14 = currentTimeMillis2 - j13;
                    mo51553m0(false, false, 0, this.f103756F, 0, j14, "", j13, currentTimeMillis2);
                    mo51548R(CoreUtility.f89233i, 9002, str5, j14, this.f103756F, CoreUtility.f89236l);
                    if (httpURLConnection3 != null) {
                        try {
                            httpURLConnection3.disconnect();
                        } catch (Exception e21) {
                            AbstractC20110a.m104539h(e21);
                        }
                    }
                    sb2 = new StringBuilder();
                    sb2.append(this.f103753C);
                    sb2.append(" API END");
                } catch (JSONException e22) {
                    e = e22;
                    httpURLConnection2 = httpURLConnection6;
                    mo51556q(e);
                    AbstractC20110a.m104539h(e);
                    String str6 = "url: " + this.f103772o + "error: " + e.toString();
                    long currentTimeMillis3 = System.currentTimeMillis();
                    long j15 = this.f103779v;
                    long j16 = currentTimeMillis3 - j15;
                    mo51553m0(false, false, 0, this.f103756F, 0, j16, "", j15, currentTimeMillis3);
                    mo51548R(CoreUtility.f89233i, 9006, str6, j16, this.f103756F, CoreUtility.f89236l);
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception e23) {
                            AbstractC20110a.m104539h(e23);
                        }
                    }
                    sb2 = new StringBuilder();
                    sb2.append(this.f103753C);
                    sb2.append(" API END");
                } catch (Exception e24) {
                    e = e24;
                    httpURLConnection = httpURLConnection6;
                    mo51556q(e);
                    AbstractC20110a.m104539h(e);
                    String str7 = "url: " + this.f103772o + "error: " + e.toString();
                    long currentTimeMillis4 = System.currentTimeMillis();
                    long j17 = this.f103779v;
                    long j18 = currentTimeMillis4 - j17;
                    mo51553m0(false, false, 0, this.f103756F, 0, j18, "", j17, currentTimeMillis4);
                    mo51548R(CoreUtility.f89233i, 9003, str7, j18, this.f103756F, CoreUtility.f89236l);
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e25) {
                            AbstractC20110a.m104539h(e25);
                        }
                    }
                    sb2 = new StringBuilder();
                    sb2.append(this.f103753C);
                    sb2.append(" API END");
                }
                sb2.append(this.f103753C);
                sb2.append(" API END");
            } catch (Throwable th4) {
                th2 = th4;
                httpURLConnection7 = httpURLConnection6;
                if (httpURLConnection7 != null) {
                    try {
                        httpURLConnection7.disconnect();
                    } catch (Exception e26) {
                        AbstractC20110a.m104539h(e26);
                    }
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append(this.f103753C);
                sb6.append(" API END");
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
            httpURLConnection7 = httpURLConnection5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x03e0 A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:94:0x020d, B:95:0x0255, B:97:0x0259, B:98:0x025c, B:13:0x03d4, B:15:0x03e0, B:16:0x041b, B:18:0x0432, B:19:0x0440, B:27:0x03f1, B:29:0x03f9, B:100:0x022b, B:102:0x0233, B:108:0x0272, B:110:0x0282, B:111:0x02c1, B:113:0x02d5, B:115:0x0297, B:117:0x029f, B:120:0x02e7, B:121:0x02ea, B:123:0x02fa, B:124:0x0339, B:126:0x034d, B:128:0x030f, B:130:0x0317, B:71:0x035d, B:73:0x036d, B:74:0x03a6, B:76:0x03ba, B:79:0x03be, B:83:0x037e, B:85:0x0386), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0432 A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:94:0x020d, B:95:0x0255, B:97:0x0259, B:98:0x025c, B:13:0x03d4, B:15:0x03e0, B:16:0x041b, B:18:0x0432, B:19:0x0440, B:27:0x03f1, B:29:0x03f9, B:100:0x022b, B:102:0x0233, B:108:0x0272, B:110:0x0282, B:111:0x02c1, B:113:0x02d5, B:115:0x0297, B:117:0x029f, B:120:0x02e7, B:121:0x02ea, B:123:0x02fa, B:124:0x0339, B:126:0x034d, B:128:0x030f, B:130:0x0317, B:71:0x035d, B:73:0x036d, B:74:0x03a6, B:76:0x03ba, B:79:0x03be, B:83:0x037e, B:85:0x0386), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x044c  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m110285v() {
        HttpURLConnection httpURLConnection;
        int i11;
        InterfaceC21299i interfaceC21299i;
        String str;
        String str2;
        JSONObject jSONObject;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                try {
                    mo51551Y();
                    int i12 = 0;
                    for (int i13 = 0; i13 < this.f103771n.size(); i13++) {
                        try {
                            i12 += ((RequestPacket) this.f103771n.get(i13)).m93286h().length;
                        } catch (Exception e11) {
                            e = e11;
                            httpURLConnection = null;
                            long currentTimeMillis = System.currentTimeMillis();
                            long j11 = this.f103779v;
                            long j12 = currentTimeMillis - j11;
                            i11 = this.f103756F;
                            if (i11 <= 0) {
                            }
                            mo51548R(CoreUtility.f89233i, 9003, e.getMessage(), j12, this.f103756F, CoreUtility.f89236l);
                            interfaceC21299i = this.f103757G;
                            if (interfaceC21299i != null) {
                            }
                            AbstractC20110a.m104539h(e);
                            if (httpURLConnection == null) {
                            }
                            httpURLConnection.disconnect();
                        }
                    }
                    String str3 = this.f103772o + "api_key=" + CoreUtility.f89226b + "&token=" + Uri.encode(AbstractC17527f.m93441e(CoreUtility.f89233i + ";" + i12 + ";" + this.f103776s, CoreUtility.f89226b)) + "&reqid=" + this.f103776s;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("postBinary(): ");
                    sb2.append(str3);
                    HttpURLConnection httpURLConnection3 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str3).openConnection()));
                    try {
                        try {
                            httpURLConnection3.setConnectTimeout(AbstractC20626a.m107385a(1));
                            httpURLConnection3.setDefaultUseCaches(false);
                            httpURLConnection3.setUseCaches(false);
                            httpURLConnection3.setDoInput(true);
                            httpURLConnection3.setDoOutput(true);
                            httpURLConnection3.setRequestMethod("POST");
                            httpURLConnection3.setRequestProperty("Connection", "Keep-Alive");
                            httpURLConnection3.setRequestProperty("ENCTYPE", "multipart/form-data");
                            httpURLConnection3.setRequestProperty("Content-Type", this.f103758a);
                            httpURLConnection3.setRequestProperty("MIME-version", "1.0");
                            httpURLConnection3.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent"));
                            httpURLConnection3.setRequestProperty("X-Data", AbstractC20626a.m107389e());
                            httpURLConnection3.setRequestProperty("X-Oper", AbstractC20626a.m107386b());
                            httpURLConnection3.connect();
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection3.getOutputStream());
                            for (int i14 = 0; i14 < this.f103771n.size(); i14++) {
                                try {
                                    RequestPacket requestPacket = (RequestPacket) this.f103771n.get(i14);
                                    requestPacket.m93277H((byte) 2);
                                    int length = this.f103759b + requestPacket.m93286h().length;
                                    bufferedOutputStream.write(AbstractC17522a.m93344g(length));
                                    bufferedOutputStream.write(2);
                                    bufferedOutputStream.write(AbstractC17522a.m93344g(m110318x(new long[]{Integer.parseInt(CoreUtility.f89233i), requestPacket.m93278a(), requestPacket.m93293o()})));
                                    bufferedOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt(CoreUtility.f89233i)));
                                    bufferedOutputStream.write(AbstractC17522a.m93345h(requestPacket.m93278a()));
                                    bufferedOutputStream.write(requestPacket.m93293o());
                                    if (requestPacket.m93286h() != null && requestPacket.m93286h().length > 0) {
                                        if (requestPacket.m93294p() == 2) {
                                            mo51555o();
                                            bufferedOutputStream.write(AbstractC17527f.m93443g(requestPacket.m93286h(), CoreUtility.f89230f.getBytes(), length, requestPacket.m93291m()));
                                        } else {
                                            bufferedOutputStream.write(requestPacket.m93286h());
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    httpURLConnection2 = httpURLConnection3;
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    throw th;
                                }
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            StringBuilder sb3 = new StringBuilder();
                            InputStream inputStream = httpURLConnection3.getInputStream();
                            if (inputStream != null) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    } else {
                                        sb3.append(readLine);
                                    }
                                }
                                bufferedReader.close();
                            }
                            inputStream.close();
                            String sb4 = sb3.toString();
                            try {
                                if (sb4 != null) {
                                    try {
                                        JSONObject jSONObject2 = new JSONObject(sb4);
                                        int i15 = jSONObject2.getInt("error_code");
                                        if (i15 == 0) {
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            long j13 = this.f103779v;
                                            long j14 = currentTimeMillis2 - j13;
                                            int i16 = this.f103756F;
                                            if (i16 > 0) {
                                                httpURLConnection = httpURLConnection3;
                                                jSONObject = jSONObject2;
                                                mo51553m0(false, true, 0, i16, 0, j14, "", j13, currentTimeMillis2);
                                            } else {
                                                httpURLConnection = httpURLConnection3;
                                                jSONObject = jSONObject2;
                                                for (int i17 = 0; i17 < this.f103771n.size(); i17++) {
                                                    mo51553m0(false, true, 0, ((RequestPacket) this.f103771n.get(i17)).m93278a(), 0, j14, "", this.f103779v, currentTimeMillis2);
                                                }
                                            }
                                            InterfaceC21299i interfaceC21299i2 = this.f103757G;
                                            if (interfaceC21299i2 != null) {
                                                interfaceC21299i2.mo1343f(jSONObject);
                                            }
                                            mo51549V(jSONObject);
                                        } else {
                                            httpURLConnection = httpURLConnection3;
                                            if (i15 != 324 && i15 != 102) {
                                                String string = jSONObject2.getString("error_message");
                                                long currentTimeMillis3 = System.currentTimeMillis();
                                                long j15 = this.f103779v;
                                                long j16 = currentTimeMillis3 - j15;
                                                int i18 = this.f103756F;
                                                if (i18 > 0) {
                                                    str2 = string;
                                                    mo51553m0(false, false, i15, i18, 0, j16, "", j15, currentTimeMillis3);
                                                } else {
                                                    str2 = string;
                                                    for (int i19 = 0; i19 < this.f103771n.size(); i19++) {
                                                        mo51553m0(false, false, i15, ((RequestPacket) this.f103771n.get(i19)).m93278a(), 0, j16, "", this.f103779v, currentTimeMillis3);
                                                    }
                                                }
                                                mo51548R(CoreUtility.f89233i, i15, str2, j16, this.f103756F, CoreUtility.f89236l);
                                                InterfaceC21299i interfaceC21299i3 = this.f103757G;
                                                if (interfaceC21299i3 != null) {
                                                    interfaceC21299i3.mo1342c(new C20096c(i15, mo51560y(i15, str2)));
                                                }
                                            } else {
                                                if (i15 == 102) {
                                                    mo51552a0();
                                                }
                                                String string2 = jSONObject2.getString("error_message");
                                                long currentTimeMillis4 = System.currentTimeMillis();
                                                long j17 = this.f103779v;
                                                long j18 = currentTimeMillis4 - j17;
                                                int i21 = this.f103756F;
                                                if (i21 > 0) {
                                                    str = string2;
                                                    mo51553m0(false, false, i15, i21, 0, j18, "", j17, currentTimeMillis4);
                                                } else {
                                                    str = string2;
                                                    for (int i22 = 0; i22 < this.f103771n.size(); i22++) {
                                                        mo51553m0(false, false, i15, ((RequestPacket) this.f103771n.get(i22)).m93278a(), 0, j18, "", this.f103779v, currentTimeMillis4);
                                                    }
                                                }
                                                mo51548R(CoreUtility.f89233i, i15, str, j18, this.f103756F, CoreUtility.f89236l);
                                                InterfaceC21299i interfaceC21299i4 = this.f103757G;
                                                if (interfaceC21299i4 != null) {
                                                    interfaceC21299i4.mo1342c(new C20096c(i15, mo51560y(i15, str)));
                                                }
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        httpURLConnection = httpURLConnection3;
                                        long currentTimeMillis5 = System.currentTimeMillis();
                                        long j112 = this.f103779v;
                                        long j122 = currentTimeMillis5 - j112;
                                        i11 = this.f103756F;
                                        if (i11 <= 0) {
                                            mo51553m0(false, false, 0, i11, 0, j122, "", j112, currentTimeMillis5);
                                        } else {
                                            for (int i23 = 0; i23 < this.f103771n.size(); i23++) {
                                                mo51553m0(false, false, 0, ((RequestPacket) this.f103771n.get(i23)).m93278a(), 0, j122, "", this.f103779v, currentTimeMillis5);
                                            }
                                        }
                                        mo51548R(CoreUtility.f89233i, 9003, e.getMessage(), j122, this.f103756F, CoreUtility.f89236l);
                                        interfaceC21299i = this.f103757G;
                                        if (interfaceC21299i != null) {
                                            interfaceC21299i.mo1342c(new C20096c(502, mo51560y(502, "")));
                                        }
                                        AbstractC20110a.m104539h(e);
                                        if (httpURLConnection == null) {
                                            return;
                                        }
                                        httpURLConnection.disconnect();
                                    }
                                } else {
                                    httpURLConnection = httpURLConnection3;
                                    long currentTimeMillis6 = System.currentTimeMillis();
                                    long j19 = this.f103779v;
                                    long j21 = currentTimeMillis6 - j19;
                                    int i24 = this.f103756F;
                                    if (i24 > 0) {
                                        mo51553m0(false, false, 0, i24, 0, j21, "", j19, currentTimeMillis6);
                                    } else {
                                        for (int i25 = 0; i25 < this.f103771n.size(); i25++) {
                                            mo51553m0(false, false, -1, ((RequestPacket) this.f103771n.get(i25)).m93278a(), 0, j21, "", this.f103779v, currentTimeMillis6);
                                        }
                                    }
                                    mo51548R(CoreUtility.f89233i, -1, "null response data", j21, this.f103756F, CoreUtility.f89236l);
                                    InterfaceC21299i interfaceC21299i5 = this.f103757G;
                                    if (interfaceC21299i5 != null) {
                                        try {
                                            interfaceC21299i5.mo1342c(new C20096c(502, mo51560y(502, "")));
                                        } catch (Exception e13) {
                                            e = e13;
                                            long currentTimeMillis52 = System.currentTimeMillis();
                                            long j1122 = this.f103779v;
                                            long j1222 = currentTimeMillis52 - j1122;
                                            i11 = this.f103756F;
                                            if (i11 <= 0) {
                                            }
                                            mo51548R(CoreUtility.f89233i, 9003, e.getMessage(), j1222, this.f103756F, CoreUtility.f89236l);
                                            interfaceC21299i = this.f103757G;
                                            if (interfaceC21299i != null) {
                                            }
                                            AbstractC20110a.m104539h(e);
                                            if (httpURLConnection == null) {
                                            }
                                            httpURLConnection.disconnect();
                                        }
                                    }
                                }
                            } catch (Exception e14) {
                                e = e14;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            httpURLConnection2 = httpURLConnection3;
                            if (httpURLConnection2 != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        httpURLConnection = httpURLConnection3;
                        long currentTimeMillis522 = System.currentTimeMillis();
                        long j11222 = this.f103779v;
                        long j12222 = currentTimeMillis522 - j11222;
                        i11 = this.f103756F;
                        if (i11 <= 0) {
                        }
                        mo51548R(CoreUtility.f89233i, 9003, e.getMessage(), j12222, this.f103756F, CoreUtility.f89236l);
                        interfaceC21299i = this.f103757G;
                        if (interfaceC21299i != null) {
                        }
                        AbstractC20110a.m104539h(e);
                        if (httpURLConnection == null) {
                        }
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Exception e16) {
                e = e16;
                httpURLConnection = null;
            }
            httpURLConnection.disconnect();
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Not initialized variable reg: 16, insn: 0x027e: MOVE (r6 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]) (LINE:639), block:B:123:0x027d */
    /* renamed from: w */
    private void m110286w() {
        String str;
        Throwable th2;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3;
        HttpURLConnection httpURLConnection4;
        HttpURLConnection httpURLConnection5;
        StringBuilder sb2;
        HttpURLConnection httpURLConnection6;
        if (TextUtils.isEmpty(this.f103772o)) {
            this.f103772o = this.f103751A;
        }
        boolean mo51547Q = mo51547Q();
        if (this.f103783z == EnumC21297g.WITHOUT_AUTHENTICATION_INFO) {
            this.f103774q = AbstractC21309s.m110340d(this.f103751A, this.f103753C, this.f103754D, this.f103755E);
        } else {
            Hashtable m110341e = AbstractC21309s.m110341e(this.f103751A, this.f103753C, this.f103754D, this.f103755E, mo51546E(), CoreUtility.f89226b, CoreUtility.f89232h, mo51561z());
            this.f103774q = m110341e;
            if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
                String m110281l = m110281l(m110341e);
                this.f103774q.clear();
                this.f103772o = AbstractC21309s.m110344h(this.f103751A, CoreUtility.f89226b, m110281l, this.f103774q);
            }
        }
        String m110339c = AbstractC21309s.m110339c(this.f103774q);
        String str2 = "";
        if (!mo51547Q) {
            this.f103774q.put("sig", m110339c);
            str = "";
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("session_key=" + CoreUtility.f89232h);
            arrayList.add("api_key=" + CoreUtility.f89226b);
            arrayList.add("sig=" + m110339c);
            str = AbstractC23356k.m122796b(arrayList, "; ") + ";";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Start request ");
        sb3.append(this.f103776s);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("URL = ");
        sb4.append(this.f103772o);
        HttpURLConnection httpURLConnection7 = null;
        try {
            try {
                httpURLConnection6 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f103772o).openConnection()));
            } catch (UnknownHostException e11) {
                e = e11;
                httpURLConnection4 = null;
            } catch (IOException e12) {
                e = e12;
                httpURLConnection3 = null;
            } catch (JSONException e13) {
                e = e13;
                httpURLConnection2 = null;
            } catch (Exception e14) {
                e = e14;
                httpURLConnection = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            th2 = th4;
            httpURLConnection7 = httpURLConnection5;
        }
        try {
            try {
                httpURLConnection6.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection6.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent"));
                httpURLConnection6.setDoInput(true);
                httpURLConnection6.setRequestMethod("POST");
                httpURLConnection6.setRequestProperty("Content-Type", "multipart/form-data; boundary=ZiNgMeMoBiLe");
                m110279f(httpURLConnection6);
                if (this.f103783z == EnumC21297g.ENCRYPT_PARAMETER) {
                    String m93451f = CoreUtils.m93451f();
                    if (m93451f == null) {
                        m93451f = "";
                    }
                    httpURLConnection6.setRequestProperty("zcid", m93451f);
                    httpURLConnection6.setRequestProperty(C20218v.f100059b, "v2");
                    String str3 = CoreUtility.f89232h;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    httpURLConnection6.setRequestProperty("session_key", str2);
                }
                httpURLConnection6.setRequestProperty("nretry", String.valueOf(m110289C()));
                if (mo51547Q) {
                    httpURLConnection6.setRequestProperty("Cookie", str);
                }
                mo82640T(httpURLConnection6);
                byte[] bytes = m110276d(this.f103774q, false).getBytes("UTF-8");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection6.getOutputStream());
                bufferedOutputStream.write(bytes);
                if (this.f103781x != null) {
                    for (int i11 = 0; i11 < this.f103781x.size(); i11++) {
                        ((AbstractC21293c) this.f103781x.get(i11)).m110263g(bufferedOutputStream);
                        if (i11 < this.f103781x.size() - 1) {
                            bufferedOutputStream.write("\r\n".getBytes("UTF-8"));
                        }
                    }
                }
                bufferedOutputStream.write("\r\n--ZiNgMeMoBiLe--\r\n".getBytes("UTF-8"));
                bufferedOutputStream.close();
                int responseCode = httpURLConnection6.getResponseCode();
                if (responseCode == 200) {
                    try {
                        AbstractC23347b.m122759a(httpURLConnection6.getContentType(), httpURLConnection6.getHeaderField(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION));
                    } catch (Exception e15) {
                        AbstractC20110a.m104539h(e15);
                    }
                    mo110297M(httpURLConnection6);
                } else if (responseCode == 206) {
                    mo110294J(httpURLConnection6);
                } else {
                    mo110293I(httpURLConnection6, responseCode);
                }
                try {
                    httpURLConnection6.disconnect();
                } catch (Exception e16) {
                    AbstractC20110a.m104539h(e16);
                }
                sb2 = new StringBuilder();
            } catch (UnknownHostException e17) {
                e = e17;
                httpURLConnection4 = httpURLConnection6;
                mo51556q(e);
                AbstractC20110a.m104539h(e);
                String str4 = "url: " + this.f103772o + "error: " + e.toString();
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = this.f103779v;
                long j12 = currentTimeMillis - j11;
                mo51553m0(false, false, 0, this.f103756F, 0, j12, "", j11, currentTimeMillis);
                mo51548R(CoreUtility.f89233i, 9001, str4, j12, this.f103756F, CoreUtility.f89236l);
                if (httpURLConnection4 != null) {
                    try {
                        httpURLConnection4.disconnect();
                    } catch (Exception e18) {
                        AbstractC20110a.m104539h(e18);
                    }
                }
                sb2 = new StringBuilder();
                sb2.append(this.f103753C);
                sb2.append(" API END");
            } catch (IOException e19) {
                e = e19;
                httpURLConnection3 = httpURLConnection6;
                if (e instanceof SSLPeerUnverifiedException) {
                    AbstractC23347b.m122760b();
                }
                if (e.getMessage() != null && e.getMessage().trim().equalsIgnoreCase("No peer certificate")) {
                    InterfaceC21299i interfaceC21299i = this.f103757G;
                    if (interfaceC21299i != null) {
                        interfaceC21299i.mo1342c(new C20096c(515, AbstractC20095b.f98834f));
                    }
                } else {
                    mo51556q(e);
                }
                AbstractC20110a.m104539h(e);
                String str5 = "url: " + this.f103772o + "error: " + e.toString();
                long currentTimeMillis2 = System.currentTimeMillis();
                long j13 = this.f103779v;
                long j14 = currentTimeMillis2 - j13;
                mo51553m0(false, false, 0, this.f103756F, 0, j14, "", j13, currentTimeMillis2);
                mo51548R(CoreUtility.f89233i, 9002, str5, j14, this.f103756F, CoreUtility.f89236l);
                if (httpURLConnection3 != null) {
                    try {
                        httpURLConnection3.disconnect();
                    } catch (Exception e21) {
                        AbstractC20110a.m104539h(e21);
                    }
                }
                sb2 = new StringBuilder();
                sb2.append(this.f103753C);
                sb2.append(" API END");
            } catch (JSONException e22) {
                e = e22;
                httpURLConnection2 = httpURLConnection6;
                mo51556q(e);
                AbstractC20110a.m104539h(e);
                String str6 = "url: " + this.f103772o + "error: " + e.toString();
                long currentTimeMillis3 = System.currentTimeMillis();
                long j15 = this.f103779v;
                long j16 = currentTimeMillis3 - j15;
                mo51553m0(false, false, 0, this.f103756F, 0, j16, "", j15, currentTimeMillis3);
                mo51548R(CoreUtility.f89233i, 9006, str6, j16, this.f103756F, CoreUtility.f89236l);
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception e23) {
                        AbstractC20110a.m104539h(e23);
                    }
                }
                sb2 = new StringBuilder();
                sb2.append(this.f103753C);
                sb2.append(" API END");
            } catch (Exception e24) {
                e = e24;
                httpURLConnection = httpURLConnection6;
                mo51556q(e);
                AbstractC20110a.m104539h(e);
                String str7 = "url: " + this.f103772o + "error: " + e.toString();
                long currentTimeMillis4 = System.currentTimeMillis();
                long j17 = this.f103779v;
                long j18 = currentTimeMillis4 - j17;
                mo51553m0(false, false, 0, this.f103756F, 0, j18, "", j17, currentTimeMillis4);
                mo51548R(CoreUtility.f89233i, 9003, str7, j18, this.f103756F, CoreUtility.f89236l);
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception e25) {
                        AbstractC20110a.m104539h(e25);
                    }
                }
                sb2 = new StringBuilder();
                sb2.append(this.f103753C);
                sb2.append(" API END");
            }
            sb2.append(this.f103753C);
            sb2.append(" API END");
        } catch (Throwable th5) {
            th2 = th5;
            httpURLConnection7 = httpURLConnection6;
            if (httpURLConnection7 != null) {
                try {
                    httpURLConnection7.disconnect();
                } catch (Exception e26) {
                    AbstractC20110a.m104539h(e26);
                }
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f103753C);
            sb5.append(" API END");
            throw th2;
        }
    }

    /* renamed from: A */
    public RequestPacket m110287A() {
        return this.f103770m;
    }

    /* renamed from: B */
    public long m110288B() {
        return this.f103777t;
    }

    /* renamed from: C */
    public int m110289C() {
        return this.f103766i;
    }

    /* renamed from: D */
    public String m110290D() {
        return this.f103751A;
    }

    /* renamed from: E */
    public abstract String mo51546E();

    /* renamed from: F */
    public long m110291F() {
        return this.f103768k;
    }

    /* renamed from: H */
    protected void m110292H(int i11, byte[] bArr, int i12) {
        AbstractC20110a.m104538g("url: " + this.f103772o + "error httpCode: " + i11, new Object[0]);
        InterfaceC21299i interfaceC21299i = this.f103757G;
        if (interfaceC21299i != null) {
            interfaceC21299i.mo1342c(new C20096c(502, mo51560y(502, ""), i11));
        }
    }

    /* renamed from: I */
    public void mo110293I(HttpURLConnection httpURLConnection, int i11) {
        String str = "url: " + this.f103772o + "error httpCode: " + i11;
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f103779v;
        long j12 = currentTimeMillis - j11;
        mo51553m0(false, false, 0, this.f103756F, 0, j12, "", j11, currentTimeMillis);
        mo51548R(CoreUtility.f89233i, 9001, str, j12, this.f103756F, CoreUtility.f89236l);
        AbstractC20110a.m104538g(str, new Object[0]);
        InterfaceC21299i interfaceC21299i = this.f103757G;
        if (interfaceC21299i != null) {
            interfaceC21299i.mo1342c(new C20096c(502, mo51560y(502, ""), i11));
        }
    }

    /* renamed from: J */
    protected void mo110294J(HttpURLConnection httpURLConnection) {
        mo110293I(httpURLConnection, 206);
    }

    /* renamed from: K */
    protected void m110295K(byte[] bArr, int i11) {
        m110292H(206, bArr, i11);
    }

    /* renamed from: L */
    protected void mo110296L(int i11, int i12, byte[] bArr, int i13) {
        try {
            String str = new String(bArr);
            AbstractC20110a.m104544m("onRequestComplete http Buffer: %d-%d json: %s", Integer.valueOf(i11), Integer.valueOf(i12), str);
            if (str.isEmpty()) {
                str = "{}";
            }
            mo110302W(new JSONObject(str));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            try {
                InterfaceC21299i interfaceC21299i = this.f103757G;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1342c(new C20096c(502, ""));
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
        }
    }

    /* renamed from: M */
    protected void mo110297M(HttpURLConnection httpURLConnection) {
        String m110256a = AbstractC21291a.m110256a(httpURLConnection.getInputStream(), "gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Response JSON of request ");
        sb2.append(this.f103776s);
        sb2.append(" = ");
        sb2.append(m110256a);
        mo110302W(new JSONObject(m110256a));
    }

    /* renamed from: O */
    public boolean m110298O() {
        if (System.currentTimeMillis() - this.f103767j > 45000) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public boolean m110299P() {
        return this.f103765h;
    }

    /* renamed from: Q */
    protected boolean mo51547Q() {
        return false;
    }

    /* renamed from: R */
    public abstract void mo51548R(String str, int i11, String str2, long j11, int i12, int i13);

    /* renamed from: S */
    public void m110300S() {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f103779v;
        mo51553m0(false, true, 0, this.f103756F, 0, currentTimeMillis - j11, "", j11, currentTimeMillis);
    }

    /* renamed from: T */
    public void mo82640T(HttpURLConnection httpURLConnection) {
    }

    /* renamed from: U */
    public void mo110301U() {
        this.f103752B.putAll(AbstractC23228u2.m119703b());
    }

    /* renamed from: V */
    public abstract void mo51549V(JSONObject jSONObject);

    /* renamed from: W */
    public void mo110302W(JSONObject jSONObject) {
        String str;
        int optInt = jSONObject.optInt("error_code") + jSONObject.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        if (!jSONObject.isNull("error_message")) {
            str = jSONObject.getString("error_message");
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("error code = ");
        sb2.append(optInt);
        if (optInt != 0) {
            mo51550X(optInt, str, jSONObject.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f103753C);
            sb3.append(" processChatApiReponse processErrorCode: ");
            sb3.append(optInt);
        } else {
            InterfaceC21299i interfaceC21299i = this.f103757G;
            if (interfaceC21299i != null) {
                interfaceC21299i.mo1343f(jSONObject);
            }
            if (!jSONObject.toString().equalsIgnoreCase("null") && jSONObject.toString().length() != 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f103753C);
                sb4.append(" processChatApiReponse onRequestComplete");
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.f103753C);
                sb5.append(" processChatApiReponse onRequestComplete with data NULL");
            }
        }
        int i11 = this.f103775r;
        if (i11 != 10 && i11 != 9 && i11 != 11) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = this.f103779v;
            mo51553m0(false, true, 0, this.f103756F, 0, currentTimeMillis - j11, "", j11, currentTimeMillis);
        }
    }

    /* renamed from: X */
    public abstract void mo51550X(int i11, String str, String str2);

    /* renamed from: Y */
    public abstract void mo51551Y();

    /* renamed from: Z */
    public void mo110303Z() {
        if (f103750H && !this.f103760c) {
            mo51554n();
            return;
        }
        int i11 = this.f103762e + 1;
        this.f103762e = i11;
        this.f103776s = i11;
        this.f103779v = System.currentTimeMillis();
        this.f103780w = SystemClock.elapsedRealtime();
        switch (this.f103775r) {
            case 0:
                m110278e();
                return;
            case 1:
                m110284r();
                return;
            case 2:
                mo51557s();
                return;
            case 3:
            default:
                return;
            case 4:
                mo51558t();
                return;
            case 5:
                m110285v();
                return;
            case 6:
                m110286w();
                return;
            case 7:
                m110273G();
                return;
            case 8:
                mo51559u();
                return;
            case 9:
                m110283p();
                return;
            case 10:
                m110280k();
                return;
            case 11:
                m110282m();
                return;
        }
    }

    @Override // jm0.InterfaceC21292b
    /* renamed from: a */
    public boolean mo110257a() {
        if (mo110258b() && this.f103769l) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public abstract void mo51552a0();

    @Override // jm0.InterfaceC21292b
    /* renamed from: b */
    public boolean mo110258b() {
        switch (this.f103775r) {
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                return true;
            case 8:
            default:
                return false;
        }
    }

    /* renamed from: b0 */
    public void m110304b0(boolean z11) {
        this.f103761d = z11;
    }

    /* renamed from: c0 */
    public void m110305c0(int i11) {
        this.f103756F = i11;
    }

    /* renamed from: e0 */
    public void m110306e0(boolean z11) {
        this.f103760c = z11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC21298h) {
            return this.f103772o.equals(((AbstractC21298h) obj).f103772o);
        }
        return false;
    }

    /* renamed from: f0 */
    public void m110307f0(boolean z11) {
        this.f103778u = z11;
    }

    /* renamed from: g */
    public void m110308g(String str, String str2) {
        this.f103752B.put(str, str2);
    }

    /* renamed from: g0 */
    public void m110309g0(AbstractC21293c abstractC21293c) {
        this.f103782y = abstractC21293c;
    }

    /* renamed from: h */
    public synchronized void m110310h(AbstractC21293c abstractC21293c) {
        if (abstractC21293c == null) {
            return;
        }
        try {
            if (this.f103781x == null) {
                this.f103781x = new ArrayList();
            }
            this.f103781x.add(abstractC21293c);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: h0 */
    public void m110311h0(EnumC21297g enumC21297g) {
        if (enumC21297g == null) {
            enumC21297g = EnumC21297g.DEFAULT;
        }
        this.f103783z = enumC21297g;
    }

    /* renamed from: i */
    public void m110312i(String str, String str2) {
        this.f103751A = str;
        this.f103753C = str2;
        this.f103754D = new String[0];
        this.f103755E = new String[0];
    }

    /* renamed from: i0 */
    public void m110313i0(RequestPacket requestPacket) {
        this.f103770m = requestPacket;
    }

    /* renamed from: j */
    public void m110314j(String str, String str2, String[] strArr, String[] strArr2) {
        this.f103751A = str;
        this.f103753C = str2;
        this.f103754D = strArr;
        this.f103755E = strArr2;
    }

    /* renamed from: j0 */
    public void m110315j0(ArrayList arrayList) {
        this.f103771n = arrayList;
    }

    /* renamed from: k0 */
    public void m110316k0(long j11) {
        this.f103777t = j11;
    }

    /* renamed from: l0 */
    public void m110317l0(boolean z11) {
        this.f103765h = z11;
    }

    /* renamed from: m0 */
    public abstract void mo51553m0(boolean z11, boolean z12, int i11, int i12, int i13, long j11, String str, long j12, long j13);

    /* renamed from: n */
    public void mo51554n() {
        this.f103769l = true;
        InterfaceC21299i interfaceC21299i = this.f103757G;
        if (interfaceC21299i != null) {
            interfaceC21299i.mo1342c(new C20096c(502, AbstractC20095b.f98832d));
        }
        switch (this.f103775r) {
            case 9:
                d.m110324f(this.f103773p);
                return;
            case 10:
            case 11:
                d.m110325g(this.f103772o, this.f103773p);
                return;
            default:
                return;
        }
    }

    /* renamed from: o */
    public abstract void mo51555o();

    /* renamed from: q */
    public abstract void mo51556q(Exception exc);

    /* renamed from: s */
    public abstract void mo51557s();

    /* renamed from: t */
    public abstract void mo51558t();

    /* renamed from: u */
    public abstract void mo51559u();

    /* renamed from: x */
    public int m110318x(long[] jArr) {
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        return ((int) j11) ^ 1827134112;
    }

    /* renamed from: y */
    public abstract String mo51560y(int i11, String str);

    /* renamed from: z */
    public abstract long mo51561z();
}
