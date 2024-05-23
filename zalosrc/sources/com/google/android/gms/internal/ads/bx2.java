package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes2.dex */
public final class bx2 extends kd2 implements n63 {

    /* renamed from: e */
    private final boolean f18029e;

    /* renamed from: f */
    private final int f18030f;

    /* renamed from: g */
    private final int f18031g;

    /* renamed from: h */
    private final String f18032h;

    /* renamed from: i */
    private final m53 f18033i;

    /* renamed from: j */
    private final m53 f18034j;

    /* renamed from: k */
    private wo2 f18035k;

    /* renamed from: l */
    private HttpURLConnection f18036l;

    /* renamed from: m */
    private InputStream f18037m;

    /* renamed from: n */
    private boolean f18038n;

    /* renamed from: o */
    private int f18039o;

    /* renamed from: p */
    private long f18040p;

    /* renamed from: q */
    private long f18041q;

    public /* synthetic */ bx2(String str, int i11, int i12, boolean z11, m53 m53Var, k53 k53Var, boolean z12, aw2 aw2Var) {
        this(str, i11, i12, z11, m53Var, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection m20767o(URL url, int i11, byte[] bArr, long j11, long j12, boolean z11, boolean z12, Map map) {
        String sb2;
        String str;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f18030f);
        httpURLConnection.setReadTimeout(this.f18031g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f18033i.m24472a());
        hashMap.putAll(this.f18034j.m24472a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j11 == 0) {
            if (j12 == -1) {
                sb2 = null;
                if (sb2 != null) {
                    httpURLConnection.setRequestProperty("Range", sb2);
                }
                str = this.f18032h;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                if (true == z11) {
                    str2 = "identity";
                } else {
                    str2 = "gzip";
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", str2);
                httpURLConnection.setInstanceFollowRedirects(z12);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod(wo2.m27669a(1));
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j11 = 0;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("bytes=");
        sb3.append(j11);
        sb3.append("-");
        if (j12 != -1) {
            sb3.append((j11 + j12) - 1);
        }
        sb2 = sb3.toString();
        if (sb2 != null) {
        }
        str = this.f18032h;
        if (str != null) {
        }
        if (true == z11) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str2);
        httpURLConnection.setInstanceFollowRedirects(z12);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(wo2.m27669a(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* renamed from: p */
    private final URL m20768p(URL url, String str, wo2 wo2Var) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new zzfq("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), wo2Var, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, 1);
                }
                if (!this.f18029e && !protocol.equals(url.getProtocol())) {
                    throw new zzfq("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", wo2Var, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, 1);
                }
                return url2;
            } catch (MalformedURLException e11) {
                throw new zzfq(e11, wo2Var, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, 1);
            }
        }
        throw new zzfq("Null location redirect", wo2Var, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, 1);
    }

    /* renamed from: q */
    private final void m20769q() {
        HttpURLConnection httpURLConnection = this.f18036l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e11) {
                lr1.m24354c("DefaultHttpDataSource", "Unexpected error while disconnecting", e11);
            }
            this.f18036l = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        try {
            long j11 = this.f18040p;
            if (j11 != -1) {
                long j12 = j11 - this.f18041q;
                if (j12 != 0) {
                    i12 = (int) Math.min(i12, j12);
                }
                return -1;
            }
            InputStream inputStream = this.f18037m;
            int i13 = g92.f20474a;
            int read = inputStream.read(bArr, i11, i12);
            if (read == -1) {
                return -1;
            }
            this.f18041q += read;
            m23893b(read);
            return read;
        } catch (IOException e11) {
            wo2 wo2Var = this.f18035k;
            int i14 = g92.f20474a;
            throw zzfq.m28815a(e11, wo2Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d3, code lost:            r5 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f5, code lost:            throw new com.google.android.gms.internal.ads.zzfq(new java.net.NoRouteToHostException("Too many redirects: " + r6), r25, com.zing.zalo.zvideoutil.ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, 1);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b7, code lost:            if (r8 != 0) goto L163;     */
    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo19943d(wo2 wo2Var) {
        int i11;
        URL url;
        long j11;
        long j12;
        boolean m27670b;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        zzey zzeyVar;
        long j13;
        this.f18035k = wo2Var;
        this.f18041q = 0L;
        this.f18040p = 0L;
        m23895l(wo2Var);
        try {
            url = new URL(wo2Var.f30043a.toString());
            j11 = wo2Var.f30048f;
            j12 = wo2Var.f30049g;
            m27670b = wo2Var.m27670b(1);
        } catch (IOException e11) {
            e = e11;
            i11 = 1;
        }
        if (!this.f18029e) {
            httpURLConnection = m20767o(url, 1, null, j11, j12, m27670b, true, wo2Var.f30046d);
        } else {
            URL url2 = url;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 > 20) {
                    break;
                }
                long j14 = j12;
                long j15 = j11;
                URL url3 = url2;
                HttpURLConnection m20767o = m20767o(url2, 1, null, j11, j12, m27670b, false, wo2Var.f30046d);
                int responseCode = m20767o.getResponseCode();
                String headerField = m20767o.getHeaderField("Location");
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308) {
                    i11 = 1;
                    try {
                        m20767o.disconnect();
                        url2 = m20768p(url3, headerField, wo2Var);
                        i12 = i13;
                        j12 = j14;
                        j11 = j15;
                    } catch (IOException e12) {
                        e = e12;
                    }
                } else {
                    httpURLConnection = m20767o;
                    break;
                }
                e = e12;
                m20769q();
                throw zzfq.m28815a(e, wo2Var, i11);
            }
        }
        this.f18036l = httpURLConnection;
        this.f18039o = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        int i14 = this.f18039o;
        long j16 = -1;
        if (i14 >= 200 && i14 <= 299) {
            httpURLConnection.getContentType();
            if (this.f18039o == 200) {
                j13 = wo2Var.f30048f;
            }
            j13 = 0;
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
            if (!equalsIgnoreCase) {
                long j17 = wo2Var.f30049g;
                if (j17 != -1) {
                    this.f18040p = j17;
                } else {
                    long m25094a = o73.m25094a(httpURLConnection.getHeaderField("Content-Length"), httpURLConnection.getHeaderField("Content-Range"));
                    if (m25094a != -1) {
                        j16 = m25094a - j13;
                    }
                    this.f18040p = j16;
                }
            } else {
                this.f18040p = wo2Var.f30049g;
            }
            try {
                this.f18037m = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.f18037m = new GZIPInputStream(this.f18037m);
                }
                this.f18038n = true;
                m23896m(wo2Var);
                if (j13 != 0) {
                    try {
                        byte[] bArr2 = new byte[4096];
                        while (j13 > 0) {
                            int min = (int) Math.min(j13, 4096L);
                            InputStream inputStream = this.f18037m;
                            int i15 = g92.f20474a;
                            int read = inputStream.read(bArr2, 0, min);
                            if (!Thread.currentThread().isInterrupted()) {
                                if (read != -1) {
                                    j13 -= read;
                                    m23893b(read);
                                } else {
                                    throw new zzfq(wo2Var, 2008, 1);
                                }
                            } else {
                                throw new zzfq(new InterruptedIOException(), wo2Var, ZAbstractBase.ZVU_PROCESS_FLUSH, 1);
                            }
                        }
                    } catch (IOException e13) {
                        m20769q();
                        if (e13 instanceof zzfq) {
                            throw ((zzfq) e13);
                        }
                        throw new zzfq(e13, wo2Var, ZAbstractBase.ZVU_PROCESS_FLUSH, 1);
                    }
                }
                return this.f18040p;
            } catch (IOException e14) {
                m20769q();
                throw new zzfq(e14, wo2Var, ZAbstractBase.ZVU_PROCESS_FLUSH, 1);
            }
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (this.f18039o == 416) {
            str = responseMessage;
            if (wo2Var.f30048f == o73.m25095b(httpURLConnection.getHeaderField("Content-Range"))) {
                this.f18038n = true;
                m23896m(wo2Var);
                long j18 = wo2Var.f30049g;
                if (j18 == -1) {
                    return 0L;
                }
                return j18;
            }
        } else {
            str = responseMessage;
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        try {
            if (errorStream != null) {
                bArr = g92.m22309C(errorStream);
            } else {
                bArr = g92.f20479f;
            }
        } catch (IOException unused) {
            bArr = g92.f20479f;
        }
        byte[] bArr3 = bArr;
        m20769q();
        if (this.f18039o == 416) {
            zzeyVar = new zzey(2008);
        } else {
            zzeyVar = null;
        }
        throw new zzfs(this.f18039o, str, zzeyVar, headerFields, wo2Var, bArr3);
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f18036l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        long j11;
        try {
            InputStream inputStream = this.f18037m;
            if (inputStream != null) {
                long j12 = this.f18040p;
                if (j12 == -1) {
                    j11 = -1;
                } else {
                    j11 = j12 - this.f18041q;
                }
                HttpURLConnection httpURLConnection = this.f18036l;
                try {
                    if (httpURLConnection != null) {
                        if (g92.f20474a <= 20) {
                            try {
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                if (j11 == -1) {
                                    if (inputStream2.read() != -1) {
                                    }
                                } else if (j11 <= 2048) {
                                }
                                String name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    superclass.getClass();
                                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream2, new Object[0]);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        inputStream.close();
                    }
                    inputStream.close();
                } catch (IOException e11) {
                    wo2 wo2Var = this.f18035k;
                    int i11 = g92.f20474a;
                    throw new zzfq(e11, wo2Var, ZAbstractBase.ZVU_PROCESS_FLUSH, 3);
                }
            }
            this.f18037m = null;
            m20769q();
            if (this.f18038n) {
                this.f18038n = false;
                m23894k();
            }
        } catch (Throwable th2) {
            this.f18037m = null;
            m20769q();
            if (this.f18038n) {
                this.f18038n = false;
                m23894k();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2, com.google.android.gms.internal.ads.qj2, com.google.android.gms.internal.ads.n63
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f18036l;
        if (httpURLConnection == null) {
            return f83.m21967d();
        }
        return new zu2(httpURLConnection.getHeaderFields());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bx2(String str, int i11, int i12, boolean z11, m53 m53Var, k53 k53Var, boolean z12) {
        super(true);
        this.f18032h = str;
        this.f18030f = i11;
        this.f18031g = i12;
        this.f18029e = z11;
        this.f18033i = m53Var;
        this.f18034j = new m53();
    }
}
