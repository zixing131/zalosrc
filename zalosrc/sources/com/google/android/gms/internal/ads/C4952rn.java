package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.rn */
/* loaded from: classes2.dex */
public final class C4952rn implements InterfaceC5026tn {

    /* renamed from: n */
    private static final Pattern f27302n = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: o */
    private static final AtomicReference f27303o = new AtomicReference();

    /* renamed from: a */
    private final int f27304a;

    /* renamed from: b */
    private final int f27305b;

    /* renamed from: c */
    private final String f27306c;

    /* renamed from: d */
    private final C4989sn f27307d;

    /* renamed from: e */
    private final InterfaceC4324ao f27308e;

    /* renamed from: f */
    private C4878pn f27309f;

    /* renamed from: g */
    private HttpURLConnection f27310g;

    /* renamed from: h */
    private InputStream f27311h;

    /* renamed from: i */
    private boolean f27312i;

    /* renamed from: j */
    private long f27313j;

    /* renamed from: k */
    private long f27314k;

    /* renamed from: l */
    private long f27315l;

    /* renamed from: m */
    private long f27316m;

    public C4952rn(String str, InterfaceC4729lo interfaceC4729lo, InterfaceC4324ao interfaceC4324ao, int i11, int i12, boolean z11, C4989sn c4989sn) {
        AbstractC4361bo.m20610b(str);
        this.f27306c = str;
        this.f27308e = interfaceC4324ao;
        this.f27307d = new C4989sn();
        this.f27304a = i11;
        this.f27305b = i12;
    }

    /* renamed from: c */
    private final void m26135c() {
        HttpURLConnection httpURLConnection = this.f27310g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            this.f27310g = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: a */
    public final int mo20617a(byte[] bArr, int i11, int i12) {
        try {
            if (this.f27315l != this.f27313j) {
                byte[] bArr2 = (byte[]) f27303o.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j11 = this.f27315l;
                    long j12 = this.f27313j;
                    if (j11 != j12) {
                        int read = this.f27311h.read(bArr2, 0, (int) Math.min(j12 - j11, bArr2.length));
                        if (!Thread.interrupted()) {
                            if (read != -1) {
                                this.f27315l += read;
                                InterfaceC4324ao interfaceC4324ao = this.f27308e;
                                if (interfaceC4324ao != null) {
                                    interfaceC4324ao.mo20195d(this, read);
                                }
                            } else {
                                throw new EOFException();
                            }
                        } else {
                            throw new InterruptedIOException();
                        }
                    } else {
                        f27303o.set(bArr2);
                        break;
                    }
                }
            }
            if (i12 == 0) {
                return 0;
            }
            long j13 = this.f27314k;
            if (j13 != -1) {
                long j14 = j13 - this.f27316m;
                if (j14 != 0) {
                    i12 = (int) Math.min(i12, j14);
                }
                return -1;
            }
            int read2 = this.f27311h.read(bArr, i11, i12);
            if (read2 == -1) {
                if (this.f27314k == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f27316m += read2;
            InterfaceC4324ao interfaceC4324ao2 = this.f27308e;
            if (interfaceC4324ao2 != null) {
                interfaceC4324ao2.mo20195d(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e11) {
            throw new zzazs(e11, this.f27309f, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:            if (r3 != 0) goto L48;     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fe A[Catch: IOException -> 0x0060, TryCatch #3 {IOException -> 0x0060, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:7:0x0042, B:9:0x0048, B:16:0x006f, B:18:0x0089, B:19:0x009a, B:20:0x009f, B:33:0x00d8, B:95:0x01f3, B:97:0x01fe, B:99:0x020f, B:105:0x0218, B:106:0x0227, B:109:0x022e, B:110:0x0235, B:113:0x0236, B:114:0x024c), top: B:2:0x000e }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo20618b(C4878pn c4878pn) {
        int responseCode;
        String headerField;
        long j11;
        long parseLong;
        String headerField2;
        this.f27309f = c4878pn;
        long j12 = 0;
        this.f27316m = 0L;
        this.f27315l = 0L;
        try {
            URL url = new URL(c4878pn.f26256a.toString());
            long j13 = c4878pn.f26258c;
            long j14 = c4878pn.f26259d;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 <= 20) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(this.f27304a);
                    httpURLConnection.setReadTimeout(this.f27305b);
                    for (Map.Entry entry : this.f27307d.m26369a().entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    long j15 = -1;
                    if (j13 == j12) {
                        if (j14 != -1) {
                        }
                        httpURLConnection.setRequestProperty("User-Agent", this.f27306c);
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoOutput(false);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            this.f27310g = httpURLConnection;
                            try {
                                int responseCode2 = httpURLConnection.getResponseCode();
                                if (responseCode2 >= 200 && responseCode2 <= 299) {
                                    this.f27310g.getContentType();
                                    if (responseCode2 == 200) {
                                        j11 = c4878pn.f26258c;
                                    }
                                    j11 = 0;
                                    this.f27313j = j11;
                                    long j16 = c4878pn.f26259d;
                                    if (j16 != -1) {
                                        this.f27314k = j16;
                                    } else {
                                        HttpURLConnection httpURLConnection2 = this.f27310g;
                                        String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                        if (!TextUtils.isEmpty(headerField3)) {
                                            try {
                                                parseLong = Long.parseLong(headerField3);
                                            } catch (NumberFormatException unused) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("Unexpected Content-Length [");
                                                sb2.append(headerField3);
                                                sb2.append("]");
                                            }
                                            headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                            if (!TextUtils.isEmpty(headerField2)) {
                                                Matcher matcher = f27302n.matcher(headerField2);
                                                if (matcher.find()) {
                                                    try {
                                                        long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                        if (parseLong < 0) {
                                                            parseLong = parseLong2;
                                                        } else if (parseLong != parseLong2) {
                                                            StringBuilder sb3 = new StringBuilder();
                                                            sb3.append("Inconsistent headers [");
                                                            sb3.append(headerField3);
                                                            sb3.append("] [");
                                                            sb3.append(headerField2);
                                                            sb3.append("]");
                                                            parseLong = Math.max(parseLong, parseLong2);
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                        StringBuilder sb4 = new StringBuilder();
                                                        sb4.append("Unexpected Content-Range [");
                                                        sb4.append(headerField2);
                                                        sb4.append("]");
                                                    }
                                                }
                                            }
                                            if (parseLong != -1) {
                                                j15 = parseLong - this.f27313j;
                                            }
                                            this.f27314k = j15;
                                        }
                                        parseLong = -1;
                                        headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                        if (!TextUtils.isEmpty(headerField2)) {
                                        }
                                        if (parseLong != -1) {
                                        }
                                        this.f27314k = j15;
                                    }
                                    try {
                                        this.f27311h = this.f27310g.getInputStream();
                                        this.f27312i = true;
                                        InterfaceC4324ao interfaceC4324ao = this.f27308e;
                                        if (interfaceC4324ao != null) {
                                            interfaceC4324ao.mo20196e(this, c4878pn);
                                        }
                                        return this.f27314k;
                                    } catch (IOException e11) {
                                        m26135c();
                                        throw new zzazs(e11, c4878pn, 1);
                                    }
                                }
                                Map<String, List<String>> headerFields = this.f27310g.getHeaderFields();
                                m26135c();
                                zzazt zzaztVar = new zzazt(responseCode2, headerFields, c4878pn);
                                if (responseCode2 == 416) {
                                    zzaztVar.initCause(new zzazn(0));
                                    throw zzaztVar;
                                }
                                throw zzaztVar;
                            } catch (IOException e12) {
                                m26135c();
                                throw new zzazs("Unable to connect to ".concat(String.valueOf(c4878pn.f26256a.toString())), e12, c4878pn, 1);
                            }
                        }
                        headerField = httpURLConnection.getHeaderField("Location");
                        httpURLConnection.disconnect();
                        if (headerField == null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                                throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                            }
                            url = url2;
                            i11 = i12;
                            j12 = 0;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        j12 = j13;
                    }
                    String str = "bytes=" + j12 + "-";
                    if (j14 != -1) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str);
                        sb5.append((j12 + j14) - 1);
                        str = sb5.toString();
                    }
                    httpURLConnection.setRequestProperty("Range", str);
                    httpURLConnection.setRequestProperty("User-Agent", this.f27306c);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300) {
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField == null) {
                    }
                } else {
                    throw new NoRouteToHostException("Too many redirects: " + i12);
                }
            }
        } catch (IOException e13) {
            throw new zzazs("Unable to connect to ".concat(String.valueOf(c4878pn.f26256a.toString())), e13, c4878pn, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f27310g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final void zzd() {
        try {
            if (this.f27311h != null) {
                HttpURLConnection httpURLConnection = this.f27310g;
                long j11 = this.f27314k;
                if (j11 != -1) {
                    j11 -= this.f27316m;
                }
                int i11 = AbstractC4916qo.f26898a;
                if (i11 == 19 || i11 == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j11 == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j11 <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.f27311h.close();
                } catch (IOException e11) {
                    throw new zzazs(e11, this.f27309f, 3);
                }
            }
            this.f27311h = null;
            m26135c();
            if (this.f27312i) {
                this.f27312i = false;
            }
        } catch (Throwable th2) {
            this.f27311h = null;
            m26135c();
            if (this.f27312i) {
                this.f27312i = false;
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5026tn
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f27310g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
