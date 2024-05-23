package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s3 */
/* loaded from: classes.dex */
public final class RunnableC6126s3 implements Runnable {

    /* renamed from: p */
    private final URL f34414p;

    /* renamed from: q */
    private final byte[] f34415q;

    /* renamed from: r */
    private final InterfaceC6104q3 f34416r;

    /* renamed from: s */
    private final String f34417s;

    /* renamed from: t */
    private final Map f34418t;

    /* renamed from: u */
    final /* synthetic */ C6137t3 f34419u;

    public RunnableC6126s3(C6137t3 c6137t3, String str, URL url, byte[] bArr, Map map, InterfaceC6104q3 interfaceC6104q3) {
        this.f34419u = c6137t3;
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19722k(url);
        AbstractC4205o.m19722k(interfaceC6104q3);
        this.f34414p = url;
        this.f34415q = bArr;
        this.f34416r = interfaceC6104q3;
        this.f34417s = str;
        this.f34418t = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0109: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:266), block:B:83:0x0108 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x010d: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:270), block:B:80:0x010b */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e11;
        Map map2;
        int i11;
        RunnableC6115r3 runnableC6115r3;
        C6105q4 c6105q4;
        IOException iOException;
        int i12;
        C6137t3 c6137t3;
        URLConnection openConnection;
        int responseCode;
        Map map3;
        Map map4;
        Map<String, List<String>> headerFields;
        InputStream inputStream;
        this.f34419u.mo31034e();
        OutputStream outputStream = null;
        try {
            c6137t3 = this.f34419u;
            openConnection = this.f34414p.openConnection();
        } catch (IOException e12) {
            e11 = e12;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            httpURLConnection = null;
            map = null;
        }
        if (openConnection instanceof HttpURLConnection) {
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            c6137t3.f34158a.m31401z();
            httpURLConnection.setConnectTimeout(60000);
            c6137t3.f34158a.m31401z();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.f34418t;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.f34415q != null) {
                    byte[] m31177O = this.f34419u.f34628b.m31085g0().m31177O(this.f34415q);
                    C6060m3 m31201u = this.f34419u.f34158a.mo31033c().m31201u();
                    int length = m31177O.length;
                    m31201u.m31109b("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(m31177O);
                        outputStream2.close();
                    } catch (IOException e13) {
                        e11 = e13;
                        map2 = null;
                        outputStream = outputStream2;
                        iOException = e11;
                        i12 = 0;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        c6105q4 = this.f34419u.f34158a.mo31037v();
                        runnableC6115r3 = new RunnableC6115r3(this.f34417s, this.f34416r, i12, iOException, null, map2, null);
                        c6105q4.m31296z(runnableC6115r3);
                    } catch (Throwable th4) {
                        th2 = th4;
                        map = null;
                        outputStream = outputStream2;
                        i11 = 0;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.f34419u.f34158a.mo31037v().m31296z(new RunnableC6115r3(this.f34417s, this.f34416r, i11, null, null, map, null));
                        throw th2;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
            } catch (IOException e14) {
                map2 = null;
                iOException = e14;
                i12 = 0;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                c6105q4 = this.f34419u.f34158a.mo31037v();
                runnableC6115r3 = new RunnableC6115r3(this.f34417s, this.f34416r, i12, iOException, null, map2, null);
                c6105q4.m31296z(runnableC6115r3);
            } catch (Throwable th5) {
                map = null;
                th2 = th5;
            }
            try {
                try {
                    headerFields = httpURLConnection.getHeaderFields();
                } catch (IOException e15) {
                    iOException = e15;
                    i12 = responseCode;
                    map2 = map4;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    c6105q4 = this.f34419u.f34158a.mo31037v();
                    runnableC6115r3 = new RunnableC6115r3(this.f34417s, this.f34416r, i12, iOException, null, map2, null);
                    c6105q4.m31296z(runnableC6115r3);
                } catch (Throwable th6) {
                    th2 = th6;
                    i11 = responseCode;
                    map = map3;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f34419u.f34158a.mo31037v().m31296z(new RunnableC6115r3(this.f34417s, this.f34416r, i11, null, null, map, null));
                    throw th2;
                }
            } catch (IOException e16) {
                map2 = null;
                iOException = e16;
                i12 = responseCode;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e17) {
                        this.f34419u.f34158a.mo31033c().m31197q().m31110c("Error closing HTTP compressed POST connection output stream. appId", C6082o3.m31193z(this.f34417s), e17);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                c6105q4 = this.f34419u.f34158a.mo31037v();
                runnableC6115r3 = new RunnableC6115r3(this.f34417s, this.f34416r, i12, iOException, null, map2, null);
                c6105q4.m31296z(runnableC6115r3);
            } catch (Throwable th7) {
                th2 = th7;
                map = null;
                i11 = responseCode;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e18) {
                        this.f34419u.f34158a.mo31033c().m31197q().m31110c("Error closing HTTP compressed POST connection output stream. appId", C6082o3.m31193z(this.f34417s), e18);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                this.f34419u.f34158a.mo31037v().m31296z(new RunnableC6115r3(this.f34417s, this.f34416r, i11, null, null, map, null));
                throw th2;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    c6105q4 = this.f34419u.f34158a.mo31037v();
                    runnableC6115r3 = new RunnableC6115r3(this.f34417s, this.f34416r, responseCode, null, byteArray, headerFields, null);
                    c6105q4.m31296z(runnableC6115r3);
                } catch (Throwable th8) {
                    th = th8;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                inputStream = null;
            }
        } else {
            throw new IOException("Failed to obtain HTTP connection");
        }
    }
}
