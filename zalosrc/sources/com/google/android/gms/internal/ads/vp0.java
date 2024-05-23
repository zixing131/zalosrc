package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
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

/* loaded from: classes2.dex */
final class vp0 extends kd2 implements n63 {

    /* renamed from: u */
    private static final Pattern f29425u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v */
    private static final AtomicReference f29426v = new AtomicReference();

    /* renamed from: e */
    private final SSLSocketFactory f29427e;

    /* renamed from: f */
    private final int f29428f;

    /* renamed from: g */
    private final int f29429g;

    /* renamed from: h */
    private final String f29430h;

    /* renamed from: i */
    private final m53 f29431i;

    /* renamed from: j */
    private wo2 f29432j;

    /* renamed from: k */
    private HttpURLConnection f29433k;

    /* renamed from: l */
    private InputStream f29434l;

    /* renamed from: m */
    private boolean f29435m;

    /* renamed from: n */
    private int f29436n;

    /* renamed from: o */
    private long f29437o;

    /* renamed from: p */
    private long f29438p;

    /* renamed from: q */
    private long f29439q;

    /* renamed from: r */
    private long f29440r;

    /* renamed from: s */
    private int f29441s;

    /* renamed from: t */
    private final Set f29442t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vp0(String str, dc3 dc3Var, int i11, int i12, int i13) {
        super(true);
        this.f29427e = new up0(this);
        this.f29442t = new HashSet();
        v71.m27172c(str);
        this.f29430h = str;
        this.f29431i = new m53();
        this.f29428f = i11;
        this.f29429g = i12;
        this.f29441s = i13;
        if (dc3Var != null) {
            mo20854g(dc3Var);
        }
    }

    /* renamed from: r */
    private final void m27326r() {
        HttpURLConnection httpURLConnection = this.f29433k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e11) {
                yk0.zzh("Unexpected error while disconnecting", e11);
            }
            this.f29433k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        try {
            if (this.f29439q != this.f29437o) {
                byte[] bArr2 = (byte[]) f29426v.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j11 = this.f29439q;
                    long j12 = this.f29437o;
                    if (j11 != j12) {
                        int read = this.f29434l.read(bArr2, 0, (int) Math.min(j12 - j11, bArr2.length));
                        if (!Thread.interrupted()) {
                            if (read != -1) {
                                this.f29439q += read;
                                m23893b(read);
                            } else {
                                throw new EOFException();
                            }
                        } else {
                            throw new InterruptedIOException();
                        }
                    } else {
                        f29426v.set(bArr2);
                        break;
                    }
                }
            }
            if (i12 == 0) {
                return 0;
            }
            long j13 = this.f29438p;
            if (j13 != -1) {
                long j14 = j13 - this.f29440r;
                if (j14 != 0) {
                    i12 = (int) Math.min(i12, j14);
                }
                return -1;
            }
            int read2 = this.f29434l.read(bArr, i11, i12);
            if (read2 == -1) {
                if (this.f29438p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f29440r += read2;
            m23893b(read2);
            return read2;
        } catch (IOException e11) {
            throw new zzfq(e11, this.f29432j, ZAbstractBase.ZVU_PROCESS_FLUSH, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:            if (r2 != 0) goto L53;     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0245 A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x0040, B:10:0x0058, B:12:0x005e, B:19:0x0082, B:21:0x009c, B:22:0x00ae, B:23:0x00b3, B:25:0x00bc, B:26:0x00c3, B:39:0x00ee, B:100:0x023a, B:102:0x0245, B:104:0x0256, B:110:0x025f, B:111:0x026e, B:114:0x0276, B:115:0x027d, B:118:0x027e, B:119:0x0294), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x0040, B:10:0x0058, B:12:0x005e, B:19:0x0082, B:21:0x009c, B:22:0x00ae, B:23:0x00b3, B:25:0x00bc, B:26:0x00c3, B:39:0x00ee, B:100:0x023a, B:102:0x0245, B:104:0x0256, B:110:0x025f, B:111:0x026e, B:114:0x0276, B:115:0x027d, B:118:0x027e, B:119:0x0294), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo19943d(wo2 wo2Var) {
        int responseCode;
        String headerField;
        long j11;
        long parseLong;
        String headerField2;
        this.f29432j = wo2Var;
        long j12 = 0;
        this.f29440r = 0L;
        this.f29439q = 0L;
        try {
            URL url = new URL(wo2Var.f30043a.toString());
            long j13 = wo2Var.f30048f;
            long j14 = wo2Var.f30049g;
            boolean m27670b = wo2Var.m27670b(1);
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 <= 20) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f29427e);
                    }
                    httpURLConnection.setConnectTimeout(this.f29428f);
                    httpURLConnection.setReadTimeout(this.f29429g);
                    for (Map.Entry entry : this.f29431i.m24472a().entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    long j15 = -1;
                    if (j13 == j12) {
                        if (j14 != -1) {
                        }
                        httpURLConnection.setRequestProperty("User-Agent", this.f29430h);
                        if (!m27670b) {
                            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                        }
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoOutput(false);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            this.f29433k = httpURLConnection;
                            try {
                                int responseCode2 = httpURLConnection.getResponseCode();
                                this.f29436n = responseCode2;
                                if (responseCode2 >= 200 && responseCode2 <= 299) {
                                    if (responseCode2 == 200) {
                                        j11 = wo2Var.f30048f;
                                    }
                                    j11 = 0;
                                    this.f29437o = j11;
                                    if (!wo2Var.m27670b(1)) {
                                        long j16 = wo2Var.f30049g;
                                        if (j16 != -1) {
                                            this.f29438p = j16;
                                        } else {
                                            HttpURLConnection httpURLConnection2 = this.f29433k;
                                            String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                            if (!TextUtils.isEmpty(headerField3)) {
                                                try {
                                                    parseLong = Long.parseLong(headerField3);
                                                } catch (NumberFormatException unused) {
                                                    yk0.zzg("Unexpected Content-Length [" + headerField3 + "]");
                                                }
                                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                                if (!TextUtils.isEmpty(headerField2)) {
                                                    Matcher matcher = f29425u.matcher(headerField2);
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
                                                    j15 = parseLong - this.f29437o;
                                                }
                                                this.f29438p = j15;
                                            }
                                            parseLong = -1;
                                            headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                            if (!TextUtils.isEmpty(headerField2)) {
                                            }
                                            if (parseLong != -1) {
                                            }
                                            this.f29438p = j15;
                                        }
                                    } else {
                                        this.f29438p = wo2Var.f30049g;
                                    }
                                    try {
                                        this.f29434l = this.f29433k.getInputStream();
                                        this.f29435m = true;
                                        m23896m(wo2Var);
                                        return this.f29438p;
                                    } catch (IOException e11) {
                                        m27326r();
                                        throw new zzfq(e11, wo2Var, ZAbstractBase.ZVU_PROCESS_FLUSH, 1);
                                    }
                                }
                                Map<String, List<String>> headerFields = this.f29433k.getHeaderFields();
                                m27326r();
                                zzfs zzfsVar = new zzfs(this.f29436n, null, null, headerFields, wo2Var, g92.f20479f);
                                if (this.f29436n == 416) {
                                    zzfsVar.initCause(new zzey(2008));
                                    throw zzfsVar;
                                }
                                throw zzfsVar;
                            } catch (IOException e12) {
                                m27326r();
                                throw new zzfq("Unable to connect to ".concat(String.valueOf(wo2Var.f30043a.toString())), e12, wo2Var, ZAbstractBase.ZVU_PROCESS_FLUSH, 1);
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
                    httpURLConnection.setRequestProperty("User-Agent", this.f29430h);
                    if (!m27670b) {
                    }
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
            throw new zzfq("Unable to connect to ".concat(String.valueOf(wo2Var.f30043a.toString())), e13, wo2Var, ZAbstractBase.ZVU_PROCESS_FLUSH, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final void m27327q(int i11) {
        this.f29441s = i11;
        for (Socket socket : this.f29442t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f29441s);
                } catch (SocketException e11) {
                    yk0.zzk("Failed to update receive buffer size.", e11);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f29433k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        try {
            if (this.f29434l != null) {
                HttpURLConnection httpURLConnection = this.f29433k;
                long j11 = this.f29438p;
                if (j11 != -1) {
                    j11 -= this.f29440r;
                }
                int i11 = g92.f20474a;
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
                    this.f29434l.close();
                } catch (IOException e11) {
                    throw new zzfq(e11, this.f29432j, ZAbstractBase.ZVU_PROCESS_FLUSH, 3);
                }
            }
            this.f29434l = null;
            m27326r();
            if (this.f29435m) {
                this.f29435m = false;
                m23894k();
            }
            this.f29442t.clear();
        } catch (Throwable th2) {
            this.f29434l = null;
            m27326r();
            if (this.f29435m) {
                this.f29435m = false;
                m23894k();
            }
            this.f29442t.clear();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2, com.google.android.gms.internal.ads.qj2, com.google.android.gms.internal.ads.n63
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f29433k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
