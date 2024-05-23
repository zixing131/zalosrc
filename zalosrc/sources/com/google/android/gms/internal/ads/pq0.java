package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
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

/* loaded from: classes2.dex */
final class pq0 extends kd2 implements n63 {

    /* renamed from: v */
    private static final Pattern f26292v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e */
    private final int f26293e;

    /* renamed from: f */
    private final int f26294f;

    /* renamed from: g */
    private final String f26295g;

    /* renamed from: h */
    private final m53 f26296h;

    /* renamed from: i */
    private wo2 f26297i;

    /* renamed from: j */
    private HttpURLConnection f26298j;

    /* renamed from: k */
    private final Queue f26299k;

    /* renamed from: l */
    private InputStream f26300l;

    /* renamed from: m */
    private boolean f26301m;

    /* renamed from: n */
    private int f26302n;

    /* renamed from: o */
    private long f26303o;

    /* renamed from: p */
    private long f26304p;

    /* renamed from: q */
    private long f26305q;

    /* renamed from: r */
    private long f26306r;

    /* renamed from: s */
    private long f26307s;

    /* renamed from: t */
    private final long f26308t;

    /* renamed from: u */
    private final long f26309u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pq0(String str, dc3 dc3Var, int i11, int i12, long j11, long j12) {
        super(true);
        v71.m27172c(str);
        this.f26295g = str;
        this.f26296h = new m53();
        this.f26293e = i11;
        this.f26294f = i12;
        this.f26299k = new ArrayDeque();
        this.f26308t = j11;
        this.f26309u = j12;
        if (dc3Var != null) {
            mo20854g(dc3Var);
        }
    }

    /* renamed from: p */
    private final void m25521p() {
        while (!this.f26299k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f26299k.remove()).disconnect();
            } catch (Exception e11) {
                yk0.zzh("Unexpected error while disconnecting", e11);
            }
        }
        this.f26298j = null;
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        try {
            long j11 = this.f26303o;
            long j12 = this.f26304p;
            if (j11 - j12 == 0) {
                return -1;
            }
            long j13 = i12;
            long j14 = this.f26305q + j12 + j13 + this.f26309u;
            long j15 = this.f26307s;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.f26306r;
                if (j15 < j17) {
                    long min = Math.min(j17, Math.max(((this.f26308t + j16) - r3) - 1, (-1) + j16 + j13));
                    m25522o(j16, min, 2);
                    this.f26307s = min;
                    j15 = min;
                }
            }
            int read = this.f26300l.read(bArr, i11, (int) Math.min(j13, ((j15 + 1) - this.f26305q) - this.f26304p));
            if (read != -1) {
                this.f26304p += read;
                m23893b(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e11) {
            throw new zzfq(e11, this.f26297i, ZAbstractBase.ZVU_PROCESS_FLUSH, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    public final long mo19943d(wo2 wo2Var) {
        long min;
        this.f26297i = wo2Var;
        this.f26304p = 0L;
        long j11 = wo2Var.f30048f;
        long j12 = wo2Var.f30049g;
        if (j12 == -1) {
            min = this.f26308t;
        } else {
            min = Math.min(this.f26308t, j12);
        }
        this.f26305q = j11;
        HttpURLConnection m25522o = m25522o(j11, (min + j11) - 1, 1);
        this.f26298j = m25522o;
        String headerField = m25522o.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f26292v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j13 = wo2Var.f30049g;
                    if (j13 != -1) {
                        this.f26303o = j13;
                        this.f26306r = Math.max(parseLong, (this.f26305q + j13) - 1);
                    } else {
                        this.f26303o = parseLong2 - this.f26305q;
                        this.f26306r = parseLong2 - 1;
                    }
                    this.f26307s = parseLong;
                    this.f26301m = true;
                    m23896m(wo2Var);
                    return this.f26303o;
                } catch (NumberFormatException unused) {
                    yk0.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new nq0(headerField, wo2Var);
    }

    /* renamed from: o */
    final HttpURLConnection m25522o(long j11, long j12, int i11) {
        String uri = this.f26297i.f30043a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f26293e);
            httpURLConnection.setReadTimeout(this.f26294f);
            for (Map.Entry entry : this.f26296h.m24472a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j11 + "-" + j12);
            httpURLConnection.setRequestProperty("User-Agent", this.f26295g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f26299k.add(httpURLConnection);
            String uri2 = this.f26297i.f30043a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f26302n = responseCode;
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.f26300l != null) {
                            inputStream = new SequenceInputStream(this.f26300l, inputStream);
                        }
                        this.f26300l = inputStream;
                        return httpURLConnection;
                    } catch (IOException e11) {
                        m25521p();
                        throw new zzfq(e11, this.f26297i, ZAbstractBase.ZVU_PROCESS_FLUSH, i11);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                m25521p();
                throw new oq0(this.f26302n, headerFields, this.f26297i, i11);
            } catch (IOException e12) {
                m25521p();
                throw new zzfq("Unable to connect to ".concat(String.valueOf(uri2)), e12, this.f26297i, ZAbstractBase.ZVU_PROCESS_FLUSH, i11);
            }
        } catch (IOException e13) {
            throw new zzfq("Unable to connect to ".concat(String.valueOf(uri)), e13, this.f26297i, ZAbstractBase.ZVU_PROCESS_FLUSH, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f26298j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        try {
            InputStream inputStream = this.f26300l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    throw new zzfq(e11, this.f26297i, ZAbstractBase.ZVU_PROCESS_FLUSH, 3);
                }
            }
        } finally {
            this.f26300l = null;
            m25521p();
            if (this.f26301m) {
                this.f26301m = false;
                m23894k();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2, com.google.android.gms.internal.ads.qj2, com.google.android.gms.internal.ads.n63
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f26298j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
