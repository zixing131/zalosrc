package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class so0 implements InterfaceC5026tn {

    /* renamed from: r */
    private static final Pattern f27793r = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: a */
    private final int f27794a;

    /* renamed from: b */
    private final int f27795b;

    /* renamed from: c */
    private final String f27796c;

    /* renamed from: d */
    private final C4989sn f27797d;

    /* renamed from: e */
    private final InterfaceC4324ao f27798e;

    /* renamed from: f */
    private C4878pn f27799f;

    /* renamed from: g */
    private HttpURLConnection f27800g;

    /* renamed from: h */
    private final Queue f27801h;

    /* renamed from: i */
    private InputStream f27802i;

    /* renamed from: j */
    private boolean f27803j;

    /* renamed from: k */
    private long f27804k;

    /* renamed from: l */
    private long f27805l;

    /* renamed from: m */
    private long f27806m;

    /* renamed from: n */
    private long f27807n;

    /* renamed from: o */
    private long f27808o;

    /* renamed from: p */
    private final long f27809p;

    /* renamed from: q */
    private final long f27810q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public so0(String str, InterfaceC4324ao interfaceC4324ao, int i11, int i12, long j11, long j12) {
        AbstractC4361bo.m20610b(str);
        this.f27796c = str;
        this.f27798e = interfaceC4324ao;
        this.f27797d = new C4989sn();
        this.f27794a = i11;
        this.f27795b = i12;
        this.f27801h = new ArrayDeque();
        this.f27809p = j11;
        this.f27810q = j12;
    }

    /* renamed from: d */
    private final void m26375d() {
        while (!this.f27801h.isEmpty()) {
            try {
                ((HttpURLConnection) this.f27801h.remove()).disconnect();
            } catch (Exception e11) {
                yk0.zzh("Unexpected error while disconnecting", e11);
            }
        }
        this.f27800g = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: a */
    public final int mo20617a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        try {
            long j11 = this.f27804k;
            long j12 = this.f27805l;
            if (j11 - j12 == 0) {
                return -1;
            }
            long j13 = i12;
            long j14 = this.f27806m + j12 + j13 + this.f27810q;
            long j15 = this.f27808o;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.f27807n;
                if (j15 < j17) {
                    long min = Math.min(j17, Math.max(((this.f27809p + j16) - r3) - 1, (-1) + j16 + j13));
                    m26376c(j16, min, 2);
                    this.f27808o = min;
                    j15 = min;
                }
            }
            int read = this.f27802i.read(bArr, i11, (int) Math.min(j13, ((j15 + 1) - this.f27806m) - this.f27805l));
            if (read != -1) {
                this.f27805l += read;
                InterfaceC4324ao interfaceC4324ao = this.f27798e;
                if (interfaceC4324ao != null) {
                    ((oo0) interfaceC4324ao).m25232j0(this, read);
                    return read;
                }
                return read;
            }
            throw new EOFException();
        } catch (IOException e11) {
            throw new zzazs(e11, this.f27799f, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: b */
    public final long mo20618b(C4878pn c4878pn) {
        long min;
        this.f27799f = c4878pn;
        this.f27805l = 0L;
        long j11 = c4878pn.f26258c;
        long j12 = c4878pn.f26259d;
        if (j12 == -1) {
            min = this.f27809p;
        } else {
            min = Math.min(this.f27809p, j12);
        }
        this.f27806m = j11;
        HttpURLConnection m26376c = m26376c(j11, (min + j11) - 1, 1);
        this.f27800g = m26376c;
        String headerField = m26376c.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f27793r.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j13 = c4878pn.f26259d;
                    if (j13 != -1) {
                        this.f27804k = j13;
                        this.f27807n = Math.max(parseLong, (this.f27806m + j13) - 1);
                    } else {
                        this.f27804k = parseLong2 - this.f27806m;
                        this.f27807n = parseLong2 - 1;
                    }
                    this.f27808o = parseLong;
                    this.f27803j = true;
                    InterfaceC4324ao interfaceC4324ao = this.f27798e;
                    if (interfaceC4324ao != null) {
                        ((oo0) interfaceC4324ao).mo20196e(this, c4878pn);
                    }
                    return this.f27804k;
                } catch (NumberFormatException unused) {
                    yk0.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new qo0(headerField, c4878pn);
    }

    /* renamed from: c */
    final HttpURLConnection m26376c(long j11, long j12, int i11) {
        String uri = this.f27799f.f26256a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f27794a);
            httpURLConnection.setReadTimeout(this.f27795b);
            for (Map.Entry entry : this.f27797d.m26369a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j11 + "-" + j12);
            httpURLConnection.setRequestProperty("User-Agent", this.f27796c);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f27801h.add(httpURLConnection);
            String uri2 = this.f27799f.f26256a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.f27802i != null) {
                            inputStream = new SequenceInputStream(this.f27802i, inputStream);
                        }
                        this.f27802i = inputStream;
                        return httpURLConnection;
                    } catch (IOException e11) {
                        m26375d();
                        throw new zzazs(e11, this.f27799f, i11);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                m26375d();
                throw new ro0(responseCode, headerFields, this.f27799f, i11);
            } catch (IOException e12) {
                m26375d();
                throw new zzazs("Unable to connect to ".concat(String.valueOf(uri2)), e12, this.f27799f, i11);
            }
        } catch (IOException e13) {
            throw new zzazs("Unable to connect to ".concat(String.valueOf(uri)), e13, this.f27799f, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f27800g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final void zzd() {
        try {
            InputStream inputStream = this.f27802i;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    throw new zzazs(e11, this.f27799f, 3);
                }
            }
        } finally {
            this.f27802i = null;
            m26375d();
            if (this.f27803j) {
                this.f27803j = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5026tn
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f27800g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
