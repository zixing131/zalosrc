package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import p230i6.C20323o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u6 */
/* loaded from: classes2.dex */
public final class RunnableC6151u6 implements Runnable {

    /* renamed from: p */
    private final URL f34510p;

    /* renamed from: q */
    private final String f34511q;

    /* renamed from: r */
    final /* synthetic */ C6162v6 f34512r;

    /* renamed from: s */
    private final C20323o f34513s;

    public RunnableC6151u6(C6162v6 c6162v6, String str, URL url, byte[] bArr, Map map, C20323o c20323o) {
        this.f34512r = c6162v6;
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19722k(url);
        AbstractC4205o.m19722k(c20323o);
        this.f34510p = url;
        this.f34513s = c20323o;
        this.f34511q = str;
    }

    /* renamed from: b */
    private final void m31459b(final int i11, final Exception exc, final byte[] bArr, final Map map) {
        this.f34512r.f34158a.mo31037v().m31296z(new Runnable() { // from class: com.google.android.gms.measurement.internal.t6
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC6151u6.this.m31460a(i11, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m31460a(int i11, Exception exc, byte[] bArr, Map map) {
        C20323o c20323o = this.f34513s;
        c20323o.f100294a.m31387g(this.f34511q, i11, exc, bArr, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.measurement.internal.u6] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        ?? r42;
        ?? r43;
        Throwable th2;
        int i11;
        IOException e11;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        this.f34512r.mo31034e();
        try {
            C6162v6 c6162v6 = this.f34512r;
            URLConnection openConnection = this.f34510p.openConnection();
            if (openConnection instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setDefaultUseCaches(false);
                c6162v6.f34158a.m31401z();
                r42 = 60000;
                r43 = 60000;
                httpURLConnection.setConnectTimeout(60000);
                c6162v6.f34158a.m31401z();
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    i11 = httpURLConnection.getResponseCode();
                } catch (IOException e12) {
                    e = e12;
                    r43 = 0;
                    e11 = e;
                    i11 = 0;
                    if (httpURLConnection != null) {
                    }
                    m31459b(i11, e11, null, r43);
                } catch (Throwable th3) {
                    th = th3;
                    r42 = 0;
                    th2 = th;
                    i11 = 0;
                    if (httpURLConnection != null) {
                    }
                    m31459b(i11, null, null, r42);
                    throw th2;
                }
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                } else {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    inputStream.close();
                                    httpURLConnection.disconnect();
                                    m31459b(i11, null, byteArray, headerFields);
                                    return;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (IOException e13) {
                        e11 = e13;
                        if (httpURLConnection != null) {
                        }
                        m31459b(i11, e11, null, r43);
                    } catch (Throwable th6) {
                        th2 = th6;
                        if (httpURLConnection != null) {
                        }
                        m31459b(i11, null, null, r42);
                        throw th2;
                    }
                } catch (IOException e14) {
                    e11 = e14;
                    r43 = 0;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m31459b(i11, e11, null, r43);
                } catch (Throwable th7) {
                    th2 = th7;
                    r42 = 0;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m31459b(i11, null, null, r42);
                    throw th2;
                }
            } else {
                throw new IOException("Failed to obtain HTTP connection");
            }
        } catch (IOException e15) {
            e = e15;
            httpURLConnection = null;
            r43 = 0;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            r42 = 0;
        }
    }
}
