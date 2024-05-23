package p264jd;

import android.net.TrafficStats;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gd.AbstractC19393b;
import gd.InterfaceC19394c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import ln0.AbstractC22543l;
import on0.AbstractC24342w;
import p128ed.C18390e;
import p543uc.C27225c;
import p620wt.AbstractC29237l;

/* renamed from: jd.c */
/* loaded from: classes3.dex */
public final class C21224c extends AbstractC19393b {
    public static final a Companion = new a(null);

    /* renamed from: jd.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: jd.c$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC19394c {

        /* renamed from: a */
        private final String f103471a;

        /* renamed from: b */
        private final long f103472b;

        /* renamed from: c */
        private final String f103473c;

        /* renamed from: d */
        private final long f103474d;

        /* renamed from: e */
        private final long f103475e;

        /* renamed from: f */
        private final int f103476f;

        /* renamed from: g */
        private final File f103477g;

        /* renamed from: h */
        private final boolean f103478h;

        /* renamed from: i */
        private final long f103479i;

        public b(String str, long j11, String str2, long j12, long j13, int i11, File file, boolean z11, long j14) {
            AbstractC19074t.m100208f(str, "uploadUrl");
            AbstractC19074t.m100208f(str2, "chunkId");
            AbstractC19074t.m100208f(file, "fileUpload");
            this.f103471a = str;
            this.f103472b = j11;
            this.f103473c = str2;
            this.f103474d = j12;
            this.f103475e = j13;
            this.f103476f = i11;
            this.f103477g = file;
            this.f103478h = z11;
            this.f103479i = j14;
        }

        @Override // gd.InterfaceC19394c
        /* renamed from: a */
        public String mo101516a() {
            return "SMLUpChunkFile";
        }

        /* renamed from: b */
        public final long m109980b() {
            return this.f103475e;
        }

        /* renamed from: c */
        public final String m109981c() {
            return this.f103473c;
        }

        /* renamed from: d */
        public final long m109982d() {
            return this.f103474d;
        }

        /* renamed from: e */
        public final int m109983e() {
            return this.f103476f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f103471a, bVar.f103471a) && this.f103472b == bVar.f103472b && AbstractC19074t.m100204b(this.f103473c, bVar.f103473c) && this.f103474d == bVar.f103474d && this.f103475e == bVar.f103475e && this.f103476f == bVar.f103476f && AbstractC19074t.m100204b(this.f103477g, bVar.f103477g) && this.f103478h == bVar.f103478h && this.f103479i == bVar.f103479i;
        }

        @Override // gd.InterfaceC19394c
        /* renamed from: f */
        public String mo101517f() {
            return this.f103473c;
        }

        /* renamed from: g */
        public final File m109984g() {
            return this.f103477g;
        }

        /* renamed from: h */
        public final long m109985h() {
            return this.f103472b;
        }

        public int hashCode() {
            return (((((((((((((((this.f103471a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f103472b)) * 31) + this.f103473c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f103474d)) * 31) + AbstractC2147g0.m11521a(this.f103475e)) * 31) + this.f103476f) * 31) + this.f103477g.hashCode()) * 31) + AbstractC2144f.m11520a(this.f103478h)) * 31) + AbstractC2147g0.m11521a(this.f103479i);
        }

        /* renamed from: i */
        public final String m109986i() {
            return this.f103471a;
        }

        /* renamed from: j */
        public final boolean m109987j() {
            return this.f103478h;
        }

        public String toString() {
            return "Params(uploadUrl=" + this.f103471a + ", totalBytes=" + this.f103472b + ", chunkId=" + this.f103473c + ", chunkStartByte=" + this.f103474d + ", chunkEndByte=" + this.f103475e + ", chunkTotalBytes=" + this.f103476f + ", fileUpload=" + this.f103477g + ", isRequestUploadStatus=" + this.f103478h + ", totalBytesServerReceived=" + this.f103479i + ")";
        }
    }

    /* renamed from: jd.c$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final boolean f103480a;

        /* renamed from: b */
        private final String f103481b;

        /* renamed from: c */
        private final long f103482c;

        /* renamed from: d */
        private final boolean f103483d;

        /* renamed from: e */
        private final String f103484e;

        /* renamed from: f */
        private final boolean f103485f;

        public c(boolean z11, String str, long j11, boolean z12, String str2, boolean z13) {
            this.f103480a = z11;
            this.f103481b = str;
            this.f103482c = j11;
            this.f103483d = z12;
            this.f103484e = str2;
            this.f103485f = z13;
        }

        /* renamed from: a */
        public final long m109988a() {
            return this.f103482c;
        }

        /* renamed from: b */
        public final String m109989b() {
            return this.f103484e;
        }

        /* renamed from: c */
        public final String m109990c() {
            return this.f103481b;
        }

        /* renamed from: d */
        public final boolean m109991d() {
            return this.f103485f;
        }

        /* renamed from: e */
        public final boolean m109992e() {
            return this.f103483d;
        }

        public /* synthetic */ c(boolean z11, String str, long j11, boolean z12, String str2, boolean z13, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? false : z12, (i11 & 16) == 0 ? str2 : null, (i11 & 32) != 0 ? false : z13);
        }
    }

    /* renamed from: g */
    private final long m109977g(String str) {
        int m127172a0;
        if (str != null && str.length() != 0) {
            m127172a0 = AbstractC24342w.m127172a0(str, '-', 0, false, 6, null);
            String substring = str.substring(m127172a0 + 1);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return Long.parseLong(substring) + 1;
        }
        return 0L;
    }

    /* renamed from: h */
    private final boolean m109978h(int i11) {
        return i11 == 308;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(11:87|(4:89|(2:94|95)|108|95)(2:109|(1:111)(9:112|97|98|(1:100)|101|(1:103)|104|33|34))|96|97|98|(0)|101|(0)|104|33|34) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(4:115|116|117|(4:118|119|(1:121)(1:147)|(1:123)(1:124)))|125|126|(11:128|(1:130)|131|132|133|134|(1:136)|137|(1:139)|140|141)|146|131|132|133|134|(0)|137|(0)|140|141) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x022d, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02b3, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c1, code lost:            ho0.AbstractC20110a.f98889a.mo104552e(r0);     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0166: MOVE (r12 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:359), block:B:225:0x0165 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0229 A[Catch: Exception -> 0x022d, TryCatch #0 {Exception -> 0x022d, blocks: (B:98:0x021e, B:100:0x0229, B:101:0x022f, B:103:0x0234, B:104:0x0237), top: B:97:0x021e }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0234 A[Catch: Exception -> 0x022d, TryCatch #0 {Exception -> 0x022d, blocks: (B:98:0x021e, B:100:0x0229, B:101:0x022f, B:103:0x0234, B:104:0x0237), top: B:97:0x021e }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284 A[Catch: all -> 0x0164, Exception -> 0x01d4, TryCatch #2 {all -> 0x0164, blocks: (B:68:0x0132, B:69:0x0140, B:71:0x0147, B:73:0x0157, B:76:0x016e, B:79:0x0189, B:82:0x01af, B:87:0x01bc, B:89:0x01c2, B:91:0x01ca, B:95:0x01da, B:111:0x0202, B:112:0x021a, B:125:0x026b, B:126:0x027e, B:128:0x0284, B:132:0x0291, B:153:0x02c7, B:154:0x02ca, B:24:0x02fc), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02af A[Catch: Exception -> 0x02b3, TryCatch #8 {Exception -> 0x02b3, blocks: (B:134:0x02a4, B:136:0x02af, B:137:0x02b5, B:139:0x02ba, B:140:0x02bd), top: B:133:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ba A[Catch: Exception -> 0x02b3, TryCatch #8 {Exception -> 0x02b3, blocks: (B:134:0x02a4, B:136:0x02af, B:137:0x02b5, B:139:0x02ba, B:140:0x02bd), top: B:133:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0051 A[Catch: all -> 0x0032, Exception -> 0x0042, TryCatch #12 {all -> 0x0032, blocks: (B:210:0x002d, B:204:0x0051, B:205:0x0058, B:215:0x003c), top: B:198:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0310 A[Catch: Exception -> 0x0305, TryCatch #26 {Exception -> 0x0305, blocks: (B:41:0x0301, B:26:0x0308, B:28:0x0310, B:29:0x0313, B:31:0x0318, B:32:0x031b), top: B:40:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0318 A[Catch: Exception -> 0x0305, TryCatch #26 {Exception -> 0x0305, blocks: (B:41:0x0301, B:26:0x0308, B:28:0x0310, B:29:0x0313, B:31:0x0318, B:32:0x031b), top: B:40:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0301 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0331 A[Catch: Exception -> 0x0327, TryCatch #15 {Exception -> 0x0327, blocks: (B:61:0x0323, B:47:0x0329, B:49:0x0331, B:50:0x0334, B:52:0x0339, B:53:0x033c), top: B:60:0x0323 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0339 A[Catch: Exception -> 0x0327, TryCatch #15 {Exception -> 0x0327, blocks: (B:61:0x0323, B:47:0x0329, B:49:0x0331, B:50:0x0334, B:52:0x0339, B:53:0x033c), top: B:60:0x0323 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0323 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.OutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.io.BufferedInputStream] */
    @Override // p185gc.AbstractC19384h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c mo13388b(b bVar) {
        Closeable closeable;
        Throwable th2;
        DataOutputStream dataOutputStream;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream;
        c cVar;
        OutputStream outputStream;
        HttpsURLConnection httpsURLConnection2;
        DataOutputStream dataOutputStream2;
        InputStream inputStream2;
        Closeable closeable2;
        int i11;
        InputStream inputStream3;
        DataOutputStream dataOutputStream3;
        OutputStream outputStream2;
        OutputStream outputStream3;
        InputStream inputStream4;
        OutputStream outputStream4;
        DataOutputStream dataOutputStream4;
        InputStream inputStream5;
        ?? fileInputStream;
        long skip;
        OutputStream outputStream5;
        InputStream inputStream6;
        OutputStream outputStream6;
        InputStream inputStream7;
        OutputStream outputStream7;
        int responseCode;
        BufferedReader bufferedReader;
        StringBuilder sb2;
        String str;
        c cVar2;
        String str2;
        ?? bufferedInputStream;
        int m116584g;
        AbstractC19074t.m100208f(bVar, "params");
        TrafficStats.setThreadStatsTag(1001);
        ?? r42 = 4;
        C27225c.m139327b(4);
        ?? m109982d = bVar.m109982d();
        try {
            try {
                if (!bVar.m109987j()) {
                    try {
                        fileInputStream = new FileInputStream(bVar.m109984g());
                    } catch (Exception e11) {
                        e = e11;
                        i11 = 4;
                        outputStream4 = null;
                        httpsURLConnection2 = null;
                        dataOutputStream = null;
                        dataOutputStream4 = null;
                        inputStream5 = null;
                        cVar = null;
                        outputStream2 = outputStream4;
                        dataOutputStream3 = dataOutputStream4;
                        inputStream3 = inputStream5;
                        C27225c.m139330e("SMLUpChunkFile", i11, e);
                        if (httpsURLConnection2 != null) {
                        }
                        AbstractC29237l.m145996a(dataOutputStream3);
                        AbstractC29237l.m145996a(inputStream3);
                        if (dataOutputStream != null) {
                        }
                        AbstractC29237l.m145996a(dataOutputStream);
                        if (outputStream2 != null) {
                        }
                        AbstractC29237l.m145996a(outputStream2);
                        return cVar;
                    } catch (Throwable th3) {
                        th2 = th3;
                        outputStream3 = null;
                        dataOutputStream = null;
                        httpsURLConnection = null;
                        inputStream4 = null;
                    }
                    try {
                        if (m109982d > 0) {
                            try {
                                skip = fileInputStream.skip(m109982d);
                            } catch (Exception e12) {
                                try {
                                    AbstractC20110a.f98889a.mo104552e(e12);
                                } catch (Exception e13) {
                                    e = e13;
                                    i11 = 4;
                                    outputStream5 = null;
                                    httpsURLConnection2 = null;
                                    inputStream7 = fileInputStream;
                                    dataOutputStream = null;
                                    outputStream6 = outputStream5;
                                    inputStream6 = inputStream7;
                                    dataOutputStream4 = null;
                                    outputStream4 = outputStream6;
                                    inputStream5 = inputStream6;
                                    cVar = null;
                                    outputStream2 = outputStream4;
                                    dataOutputStream3 = dataOutputStream4;
                                    inputStream3 = inputStream5;
                                    C27225c.m139330e("SMLUpChunkFile", i11, e);
                                    if (httpsURLConnection2 != null) {
                                    }
                                    AbstractC29237l.m145996a(dataOutputStream3);
                                    AbstractC29237l.m145996a(inputStream3);
                                    if (dataOutputStream != null) {
                                    }
                                    AbstractC29237l.m145996a(dataOutputStream);
                                    if (outputStream2 != null) {
                                    }
                                    AbstractC29237l.m145996a(outputStream2);
                                    return cVar;
                                }
                            }
                            if (skip == m109982d) {
                                throw new IOException("Skip bytes failed");
                            }
                            inputStream2 = fileInputStream;
                        }
                        skip = 0;
                        if (skip == m109982d) {
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        outputStream3 = null;
                        dataOutputStream = null;
                        httpsURLConnection = null;
                        inputStream4 = fileInputStream;
                        closeable = null;
                        r42 = outputStream3;
                        inputStream = inputStream4;
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.disconnect();
                            } catch (Exception e14) {
                                AbstractC20110a.f98889a.mo104552e(e14);
                                throw th2;
                            }
                        }
                        AbstractC29237l.m145996a(closeable);
                        AbstractC29237l.m145996a(inputStream);
                        if (dataOutputStream != null) {
                            dataOutputStream.flush();
                        }
                        AbstractC29237l.m145996a(dataOutputStream);
                        if (r42 != 0) {
                            r42.flush();
                        }
                        AbstractC29237l.m145996a(r42);
                        throw th2;
                    }
                } else {
                    inputStream2 = null;
                }
                try {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(bVar.m109986i()).openConnection());
                    AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    httpsURLConnection2 = (HttpsURLConnection) uRLConnection;
                    try {
                        int m107385a = AbstractC20626a.m107385a(3);
                        httpsURLConnection2.setDoInput(true);
                        httpsURLConnection2.setDoOutput(true);
                        httpsURLConnection2.setUseCaches(false);
                        httpsURLConnection2.setConnectTimeout(m107385a);
                        httpsURLConnection2.setReadTimeout(m107385a);
                        httpsURLConnection2.setRequestMethod("PUT");
                        httpsURLConnection2.setRequestProperty("Connection", "Keep-Alive");
                        httpsURLConnection2.setRequestProperty("Authorization", "Bearer " + m101513d());
                        if (bVar.m109987j()) {
                            try {
                                httpsURLConnection2.setRequestProperty("Content-Length", "0");
                                httpsURLConnection2.setRequestProperty("Content-Range", "bytes */*");
                            } catch (Exception e15) {
                                e = e15;
                                i11 = 4;
                                outputStream5 = null;
                                inputStream7 = inputStream2;
                                dataOutputStream = null;
                                outputStream6 = outputStream5;
                                inputStream6 = inputStream7;
                                dataOutputStream4 = null;
                                outputStream4 = outputStream6;
                                inputStream5 = inputStream6;
                                cVar = null;
                                outputStream2 = outputStream4;
                                dataOutputStream3 = dataOutputStream4;
                                inputStream3 = inputStream5;
                                C27225c.m139330e("SMLUpChunkFile", i11, e);
                                if (httpsURLConnection2 != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream3);
                                AbstractC29237l.m145996a(inputStream3);
                                if (dataOutputStream != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (outputStream2 != null) {
                                }
                                AbstractC29237l.m145996a(outputStream2);
                                return cVar;
                            } catch (Throwable th5) {
                                th2 = th5;
                                httpsURLConnection = httpsURLConnection2;
                                outputStream7 = null;
                                dataOutputStream = null;
                                outputStream3 = outputStream7;
                                inputStream4 = inputStream2;
                                closeable = null;
                                r42 = outputStream3;
                                inputStream = inputStream4;
                                if (httpsURLConnection != null) {
                                }
                                AbstractC29237l.m145996a(closeable);
                                AbstractC29237l.m145996a(inputStream);
                                if (dataOutputStream != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (r42 != 0) {
                                }
                                AbstractC29237l.m145996a(r42);
                                throw th2;
                            }
                        } else {
                            httpsURLConnection2.setRequestProperty("Content-Range", "bytes " + bVar.m109982d() + "-" + bVar.m109980b() + "/" + bVar.m109985h());
                            httpsURLConnection2.setRequestProperty("Content-Length", String.valueOf(bVar.m109983e()));
                        }
                        if (!bVar.m109987j()) {
                            OutputStream outputStream8 = httpsURLConnection2.getOutputStream();
                            try {
                                dataOutputStream = new DataOutputStream(outputStream8);
                            } catch (Exception e16) {
                                e = e16;
                                i11 = 4;
                                outputStream5 = outputStream8;
                                inputStream7 = inputStream2;
                                dataOutputStream = null;
                                outputStream6 = outputStream5;
                                inputStream6 = inputStream7;
                                dataOutputStream4 = null;
                                outputStream4 = outputStream6;
                                inputStream5 = inputStream6;
                                cVar = null;
                                outputStream2 = outputStream4;
                                dataOutputStream3 = dataOutputStream4;
                                inputStream3 = inputStream5;
                                C27225c.m139330e("SMLUpChunkFile", i11, e);
                                if (httpsURLConnection2 != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream3);
                                AbstractC29237l.m145996a(inputStream3);
                                if (dataOutputStream != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (outputStream2 != null) {
                                }
                                AbstractC29237l.m145996a(outputStream2);
                                return cVar;
                            } catch (Throwable th6) {
                                th2 = th6;
                                httpsURLConnection = httpsURLConnection2;
                                outputStream7 = outputStream8;
                                dataOutputStream = null;
                                outputStream3 = outputStream7;
                                inputStream4 = inputStream2;
                                closeable = null;
                                r42 = outputStream3;
                                inputStream = inputStream4;
                                if (httpsURLConnection != null) {
                                }
                                AbstractC29237l.m145996a(closeable);
                                AbstractC29237l.m145996a(inputStream);
                                if (dataOutputStream != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (r42 != 0) {
                                }
                                AbstractC29237l.m145996a(r42);
                                throw th2;
                            }
                            try {
                                bufferedInputStream = new BufferedInputStream(inputStream2);
                            } catch (Exception e17) {
                                e = e17;
                                i11 = 4;
                                outputStream6 = outputStream8;
                                inputStream6 = inputStream2;
                                dataOutputStream4 = null;
                                outputStream4 = outputStream6;
                                inputStream5 = inputStream6;
                                cVar = null;
                                outputStream2 = outputStream4;
                                dataOutputStream3 = dataOutputStream4;
                                inputStream3 = inputStream5;
                                C27225c.m139330e("SMLUpChunkFile", i11, e);
                                if (httpsURLConnection2 != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream3);
                                AbstractC29237l.m145996a(inputStream3);
                                if (dataOutputStream != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (outputStream2 != null) {
                                }
                                AbstractC29237l.m145996a(outputStream2);
                                return cVar;
                            } catch (Throwable th7) {
                                th2 = th7;
                                httpsURLConnection = httpsURLConnection2;
                                outputStream3 = outputStream8;
                                inputStream4 = inputStream2;
                                closeable = null;
                                r42 = outputStream3;
                                inputStream = inputStream4;
                                if (httpsURLConnection != null) {
                                }
                                AbstractC29237l.m145996a(closeable);
                                AbstractC29237l.m145996a(inputStream);
                                if (dataOutputStream != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (r42 != 0) {
                                }
                                AbstractC29237l.m145996a(r42);
                                throw th2;
                            }
                            try {
                                byte[] bArr = new byte[8192];
                                m116584g = AbstractC22543l.m116584g(8192, bVar.m109983e());
                                long j11 = 0;
                                while (true) {
                                    int read = bufferedInputStream.read(bArr, 0, m116584g);
                                    if (read == -1) {
                                        break;
                                    }
                                    dataOutputStream.write(bArr, 0, read);
                                    j11 += read;
                                    if (j11 >= bVar.m109983e()) {
                                        break;
                                    }
                                    m116584g = AbstractC22543l.m116584g(8192, (int) (bVar.m109983e() - j11));
                                }
                                dataOutputStream.flush();
                                outputStream = outputStream8;
                                dataOutputStream2 = bufferedInputStream;
                            } catch (Exception e18) {
                                e = e18;
                                i11 = 4;
                                outputStream4 = outputStream8;
                                dataOutputStream4 = bufferedInputStream;
                                inputStream5 = inputStream2;
                                cVar = null;
                                outputStream2 = outputStream4;
                                dataOutputStream3 = dataOutputStream4;
                                inputStream3 = inputStream5;
                                C27225c.m139330e("SMLUpChunkFile", i11, e);
                                if (httpsURLConnection2 != null) {
                                    try {
                                        httpsURLConnection2.disconnect();
                                    } catch (Exception e19) {
                                        Exception e21 = e19;
                                        AbstractC20110a.f98889a.mo104552e(e21);
                                        return cVar;
                                    }
                                }
                                AbstractC29237l.m145996a(dataOutputStream3);
                                AbstractC29237l.m145996a(inputStream3);
                                if (dataOutputStream != null) {
                                    dataOutputStream.flush();
                                }
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (outputStream2 != null) {
                                    outputStream2.flush();
                                }
                                AbstractC29237l.m145996a(outputStream2);
                                return cVar;
                            }
                        } else {
                            outputStream = null;
                            dataOutputStream = null;
                            dataOutputStream2 = null;
                        }
                        try {
                            C27225c.m139327b(4);
                            responseCode = httpsURLConnection2.getResponseCode();
                            cVar = null;
                            try {
                                C18390e.m97413u("Result upload chunk " + bVar.m109981c() + ": Res code=" + responseCode, false, 2, null);
                            } catch (Exception e22) {
                                e = e22;
                                i11 = 4;
                                outputStream2 = outputStream;
                                dataOutputStream3 = dataOutputStream2;
                                inputStream3 = inputStream2;
                                C27225c.m139330e("SMLUpChunkFile", i11, e);
                                if (httpsURLConnection2 != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream3);
                                AbstractC29237l.m145996a(inputStream3);
                                if (dataOutputStream != null) {
                                }
                                AbstractC29237l.m145996a(dataOutputStream);
                                if (outputStream2 != null) {
                                }
                                AbstractC29237l.m145996a(outputStream2);
                                return cVar;
                            }
                        } catch (Exception e23) {
                            e = e23;
                            cVar = null;
                        }
                    } catch (Exception e24) {
                        e = e24;
                        cVar = null;
                        outputStream = null;
                        dataOutputStream = null;
                        dataOutputStream2 = dataOutputStream;
                        i11 = 4;
                        outputStream2 = outputStream;
                        dataOutputStream3 = dataOutputStream2;
                        inputStream3 = inputStream2;
                        C27225c.m139330e("SMLUpChunkFile", i11, e);
                        if (httpsURLConnection2 != null) {
                        }
                        AbstractC29237l.m145996a(dataOutputStream3);
                        AbstractC29237l.m145996a(inputStream3);
                        if (dataOutputStream != null) {
                        }
                        AbstractC29237l.m145996a(dataOutputStream);
                        if (outputStream2 != null) {
                        }
                        AbstractC29237l.m145996a(outputStream2);
                        return cVar;
                    } catch (Throwable th8) {
                        closeable = null;
                        th2 = th8;
                        httpsURLConnection = httpsURLConnection2;
                        r42 = 0;
                        dataOutputStream = null;
                        inputStream = inputStream2;
                        if (httpsURLConnection != null) {
                        }
                        AbstractC29237l.m145996a(closeable);
                        AbstractC29237l.m145996a(inputStream);
                        if (dataOutputStream != null) {
                        }
                        AbstractC29237l.m145996a(dataOutputStream);
                        if (r42 != 0) {
                        }
                        AbstractC29237l.m145996a(r42);
                        throw th2;
                    }
                } catch (Exception e25) {
                    e = e25;
                    cVar = null;
                    outputStream = null;
                    httpsURLConnection2 = null;
                    dataOutputStream = null;
                } catch (Throwable th9) {
                    closeable = null;
                    th2 = th9;
                    r42 = 0;
                    dataOutputStream = null;
                    httpsURLConnection = null;
                    inputStream = inputStream2;
                }
            } catch (Exception e26) {
                e = e26;
                cVar = null;
                outputStream = null;
                httpsURLConnection2 = null;
                dataOutputStream = null;
                dataOutputStream2 = null;
                inputStream2 = null;
            } catch (Throwable th10) {
                closeable = null;
                th2 = th10;
                r42 = 0;
                dataOutputStream = null;
                httpsURLConnection = null;
                inputStream = null;
            }
            if (responseCode != 200 && responseCode != 201) {
                if (m109978h(responseCode)) {
                    String headerField = httpsURLConnection2.getHeaderField("Location");
                    if (headerField != null && headerField.length() != 0) {
                        str2 = headerField;
                        cVar2 = new c(!bVar.m109987j(), str2, m109977g(httpsURLConnection2.getHeaderField("Range")), false, null, false, 56, null);
                    }
                    str2 = null;
                    cVar2 = new c(!bVar.m109987j(), str2, m109977g(httpsURLConnection2.getHeaderField("Range")), false, null, false, 56, null);
                } else if (responseCode == 404) {
                    cVar2 = new c(false, null, 0L, false, null, true, 31, null);
                } else {
                    C27225c.m139331f("SMLUpChunkFile", 4, responseCode, httpsURLConnection2);
                    httpsURLConnection2.disconnect();
                    AbstractC29237l.m145996a(dataOutputStream2);
                    AbstractC29237l.m145996a(inputStream2);
                    if (dataOutputStream != null) {
                        dataOutputStream.flush();
                    }
                    AbstractC29237l.m145996a(dataOutputStream);
                    if (outputStream != null) {
                        outputStream.flush();
                    }
                    AbstractC29237l.m145996a(outputStream);
                    return cVar;
                }
                cVar = cVar2;
                httpsURLConnection2.disconnect();
                AbstractC29237l.m145996a(dataOutputStream2);
                AbstractC29237l.m145996a(inputStream2);
                if (dataOutputStream != null) {
                }
                AbstractC29237l.m145996a(dataOutputStream);
                if (outputStream != null) {
                }
                AbstractC29237l.m145996a(outputStream);
                return cVar;
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection2.getInputStream()));
            } catch (IOException e27) {
                e = e27;
                bufferedReader = null;
                sb2 = null;
            } catch (Throwable th11) {
                th = th11;
                bufferedReader = null;
            }
            try {
                try {
                    sb2 = new StringBuilder();
                    String str3 = null;
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                str3 = readLine;
                            } else {
                                readLine = null;
                            }
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(str3);
                        } catch (IOException e28) {
                            e = e28;
                            AbstractC20110a.f98889a.mo104552e(e);
                            AbstractC29237l.m145996a(bufferedReader);
                            long m109985h = bVar.m109985h();
                            if (sb2 != null) {
                            }
                            str = "";
                            c cVar3 = new c(true, null, m109985h, true, str, false, 32, null);
                            httpsURLConnection2.disconnect();
                            AbstractC29237l.m145996a(dataOutputStream2);
                            AbstractC29237l.m145996a(inputStream2);
                            if (dataOutputStream != null) {
                            }
                            AbstractC29237l.m145996a(dataOutputStream);
                            if (outputStream != null) {
                            }
                            AbstractC29237l.m145996a(outputStream);
                            return cVar3;
                        }
                    }
                } catch (IOException e29) {
                    e = e29;
                    sb2 = null;
                }
                AbstractC29237l.m145996a(bufferedReader);
                long m109985h2 = bVar.m109985h();
                if (sb2 != null) {
                    str = sb2.toString();
                    if (str != null) {
                    }
                    c cVar32 = new c(true, null, m109985h2, true, str, false, 32, null);
                    httpsURLConnection2.disconnect();
                    AbstractC29237l.m145996a(dataOutputStream2);
                    AbstractC29237l.m145996a(inputStream2);
                    if (dataOutputStream != null) {
                        dataOutputStream.flush();
                    }
                    AbstractC29237l.m145996a(dataOutputStream);
                    if (outputStream != null) {
                        outputStream.flush();
                    }
                    AbstractC29237l.m145996a(outputStream);
                    return cVar32;
                }
                str = "";
                c cVar322 = new c(true, null, m109985h2, true, str, false, 32, null);
                httpsURLConnection2.disconnect();
                AbstractC29237l.m145996a(dataOutputStream2);
                AbstractC29237l.m145996a(inputStream2);
                if (dataOutputStream != null) {
                }
                AbstractC29237l.m145996a(dataOutputStream);
                if (outputStream != null) {
                }
                AbstractC29237l.m145996a(outputStream);
                return cVar322;
            } catch (Throwable th12) {
                th = th12;
                AbstractC29237l.m145996a(bufferedReader);
                throw th;
            }
        } catch (Throwable th13) {
            th2 = th13;
            closeable = closeable2;
            httpsURLConnection = m109982d;
        }
    }
}
