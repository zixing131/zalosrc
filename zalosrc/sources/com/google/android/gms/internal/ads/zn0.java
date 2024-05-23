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
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zn0 implements InterfaceC5026tn {

    /* renamed from: q */
    private static final Pattern f31598q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r */
    private static final AtomicReference f31599r = new AtomicReference();

    /* renamed from: b */
    private final int f31601b;

    /* renamed from: c */
    private final int f31602c;

    /* renamed from: d */
    private final String f31603d;

    /* renamed from: e */
    private final C4989sn f31604e;

    /* renamed from: f */
    private final InterfaceC4324ao f31605f;

    /* renamed from: g */
    private C4878pn f31606g;

    /* renamed from: h */
    private HttpURLConnection f31607h;

    /* renamed from: i */
    private InputStream f31608i;

    /* renamed from: j */
    private boolean f31609j;

    /* renamed from: k */
    private long f31610k;

    /* renamed from: l */
    private long f31611l;

    /* renamed from: m */
    private long f31612m;

    /* renamed from: n */
    private long f31613n;

    /* renamed from: o */
    private int f31614o;

    /* renamed from: a */
    private final SSLSocketFactory f31600a = new yn0(this);

    /* renamed from: p */
    private final Set f31615p = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zn0(String str, InterfaceC4324ao interfaceC4324ao, int i11, int i12, int i13) {
        AbstractC4361bo.m20610b(str);
        this.f31603d = str;
        this.f31605f = interfaceC4324ao;
        this.f31604e = new C4989sn();
        this.f31601b = i11;
        this.f31602c = i12;
        this.f31614o = i13;
    }

    /* renamed from: f */
    private final void m28564f() {
        HttpURLConnection httpURLConnection = this.f31607h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e11) {
                yk0.zzh("Unexpected error while disconnecting", e11);
            }
            this.f31607h = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: a */
    public final int mo20617a(byte[] bArr, int i11, int i12) {
        try {
            if (this.f31612m != this.f31610k) {
                byte[] bArr2 = (byte[]) f31599r.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j11 = this.f31612m;
                    long j12 = this.f31610k;
                    if (j11 != j12) {
                        int read = this.f31608i.read(bArr2, 0, (int) Math.min(j12 - j11, bArr2.length));
                        if (!Thread.interrupted()) {
                            if (read != -1) {
                                this.f31612m += read;
                                InterfaceC4324ao interfaceC4324ao = this.f31605f;
                                if (interfaceC4324ao != null) {
                                    ((oo0) interfaceC4324ao).m25232j0(this, read);
                                }
                            } else {
                                throw new EOFException();
                            }
                        } else {
                            throw new InterruptedIOException();
                        }
                    } else {
                        f31599r.set(bArr2);
                        break;
                    }
                }
            }
            if (i12 == 0) {
                return 0;
            }
            long j13 = this.f31611l;
            if (j13 != -1) {
                long j14 = j13 - this.f31613n;
                if (j14 != 0) {
                    i12 = (int) Math.min(i12, j14);
                }
                return -1;
            }
            int read2 = this.f31608i.read(bArr, i11, i12);
            if (read2 == -1) {
                if (this.f31611l == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f31613n += read2;
            InterfaceC4324ao interfaceC4324ao2 = this.f31605f;
            if (interfaceC4324ao2 != null) {
                ((oo0) interfaceC4324ao2).m25232j0(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e11) {
            throw new zzazs(e11, this.f31606g, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:            if (r3 != 0) goto L50;     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021d A[Catch: IOException -> 0x0037, TryCatch #0 {IOException -> 0x0037, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:8:0x002e, B:9:0x003a, B:10:0x0052, B:12:0x0058, B:19:0x007c, B:21:0x0096, B:22:0x00a7, B:23:0x00ac, B:36:0x00e5, B:97:0x0212, B:99:0x021d, B:101:0x022e, B:107:0x0237, B:108:0x0246, B:111:0x024d, B:112:0x0254, B:115:0x0255, B:116:0x026b), top: B:2:0x000e }] */
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
        this.f31606g = c4878pn;
        long j12 = 0;
        this.f31613n = 0L;
        this.f31612m = 0L;
        try {
            URL url = new URL(c4878pn.f26256a.toString());
            long j13 = c4878pn.f26258c;
            long j14 = c4878pn.f26259d;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 <= 20) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f31600a);
                    }
                    httpURLConnection.setConnectTimeout(this.f31601b);
                    httpURLConnection.setReadTimeout(this.f31602c);
                    for (Map.Entry entry : this.f31604e.m26369a().entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    long j15 = -1;
                    if (j13 == j12) {
                        if (j14 != -1) {
                        }
                        httpURLConnection.setRequestProperty("User-Agent", this.f31603d);
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoOutput(false);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            this.f31607h = httpURLConnection;
                            try {
                                int responseCode2 = httpURLConnection.getResponseCode();
                                if (responseCode2 >= 200 && responseCode2 <= 299) {
                                    if (responseCode2 == 200) {
                                        j11 = c4878pn.f26258c;
                                    }
                                    j11 = 0;
                                    this.f31610k = j11;
                                    long j16 = c4878pn.f26259d;
                                    if (j16 != -1) {
                                        this.f31611l = j16;
                                    } else {
                                        HttpURLConnection httpURLConnection2 = this.f31607h;
                                        String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                        if (!TextUtils.isEmpty(headerField3)) {
                                            try {
                                                parseLong = Long.parseLong(headerField3);
                                            } catch (NumberFormatException unused) {
                                                yk0.zzg("Unexpected Content-Length [" + headerField3 + "]");
                                            }
                                            headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                            if (!TextUtils.isEmpty(headerField2)) {
                                                Matcher matcher = f31598q.matcher(headerField2);
                                                if (matcher.find()) {
                                                    try {
                                                        long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                        if (parseLong < 0) {
                                                            parseLong = parseLong2;
                                                        } else if (parseLong != parseLong2) {
                                                            yk0.zzj("Inconsistent headers [" + headerField3 + "] [" + headerField2 + "]");
                                                            parseLong = Math.max(parseLong, parseLong2);
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                        yk0.zzg("Unexpected Content-Range [" + headerField2 + "]");
                                                    }
                                                }
                                            }
                                            if (parseLong != -1) {
                                                j15 = parseLong - this.f31610k;
                                            }
                                            this.f31611l = j15;
                                        }
                                        parseLong = -1;
                                        headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                        if (!TextUtils.isEmpty(headerField2)) {
                                        }
                                        if (parseLong != -1) {
                                        }
                                        this.f31611l = j15;
                                    }
                                    try {
                                        this.f31608i = this.f31607h.getInputStream();
                                        this.f31609j = true;
                                        InterfaceC4324ao interfaceC4324ao = this.f31605f;
                                        if (interfaceC4324ao != null) {
                                            ((oo0) interfaceC4324ao).mo20196e(this, c4878pn);
                                        }
                                        return this.f31611l;
                                    } catch (IOException e11) {
                                        m28564f();
                                        throw new zzazs(e11, c4878pn, 1);
                                    }
                                }
                                Map<String, List<String>> headerFields = this.f31607h.getHeaderFields();
                                m28564f();
                                zzazt zzaztVar = new zzazt(responseCode2, headerFields, c4878pn);
                                if (responseCode2 == 416) {
                                    zzaztVar.initCause(new zzazn(0));
                                    throw zzaztVar;
                                }
                                throw zzaztVar;
                            } catch (IOException e12) {
                                m28564f();
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
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append((j12 + j14) - 1);
                        str = sb2.toString();
                    }
                    httpURLConnection.setRequestProperty("Range", str);
                    httpURLConnection.setRequestProperty("User-Agent", this.f31603d);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m28565e(int i11) {
        this.f31614o = i11;
        for (Socket socket : this.f31615p) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f31614o);
                } catch (SocketException e11) {
                    yk0.zzk("Failed to update receive buffer size.", e11);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f31607h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final void zzd() {
        try {
            if (this.f31608i != null) {
                HttpURLConnection httpURLConnection = this.f31607h;
                long j11 = this.f31611l;
                if (j11 != -1) {
                    j11 -= this.f31613n;
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
                    this.f31608i.close();
                } catch (IOException e11) {
                    throw new zzazs(e11, this.f31606g, 3);
                }
            }
            this.f31608i = null;
            m28564f();
            if (this.f31609j) {
                this.f31609j = false;
            }
            this.f31615p.clear();
        } catch (Throwable th2) {
            this.f31608i = null;
            m28564f();
            if (this.f31609j) {
                this.f31609j = false;
            }
            this.f31615p.clear();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5026tn
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f31607h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
