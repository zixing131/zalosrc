package p192h;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.p002a.p003f.p004a.C0002f;
import p192h.C19687b;

/* renamed from: h.e */
/* loaded from: classes2.dex */
public class C19690e {

    /* renamed from: h */
    static String f97689h;

    /* renamed from: a */
    Boolean f97693a;

    /* renamed from: b */
    String f97694b;

    /* renamed from: c */
    Map f97695c;

    /* renamed from: d */
    SSLSocketFactory f97696d;

    /* renamed from: e */
    HostnameVerifier f97697e;

    /* renamed from: f */
    C19689d f97698f;

    /* renamed from: g */
    static final Map f97688g = new LinkedHashMap();

    /* renamed from: i */
    static Integer f97690i = 10000;

    /* renamed from: j */
    static Integer f97691j = 180000;

    /* renamed from: k */
    static int f97692k = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h.e$a */
    /* loaded from: classes2.dex */
    public static class a extends FilterInputStream {

        /* renamed from: p */
        private final HttpURLConnection f97699p;

        protected a(HttpURLConnection httpURLConnection, InputStream inputStream) {
            super(inputStream);
            this.f97699p = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                super.close();
            } finally {
                this.f97699p.disconnect();
            }
        }
    }

    protected C19690e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C19688c m103303a(C19687b c19687b, Class cls) {
        HttpURLConnection httpURLConnection;
        Exception e11;
        HttpURLConnection httpURLConnection2;
        C19687b.a aVar;
        HttpURLConnection httpURLConnection3;
        Map map;
        ?? r02 = "?";
        C19688c c19688c = new C19688c(c19687b);
        InputStream inputStream = null;
        try {
            try {
                String str = c19687b.f97662c;
                C19687b.a aVar2 = c19687b.f97661b;
                aVar = C19687b.a.GET;
                if (aVar2 == aVar && !str.contains("?") && (map = c19687b.f97663d) != null && !map.isEmpty()) {
                    str = str + "?" + AbstractC19691f.m103317c(c19687b.f97663d);
                }
                httpURLConnection3 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            } catch (C0002f e12) {
                e = e12;
            } catch (Exception e13) {
                e = e13;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = null;
            }
            try {
                m103307g(httpURLConnection3);
                httpURLConnection3.setRequestMethod(c19687b.f97661b.name());
                Boolean bool = c19687b.f97672m;
                if (bool != null) {
                    httpURLConnection3.setInstanceFollowRedirects(bool.booleanValue());
                }
                httpURLConnection3.setUseCaches(c19687b.f97668i);
                m103306e(c19687b, httpURLConnection3);
                Long l11 = c19687b.f97671l;
                if (l11 != null) {
                    httpURLConnection3.setIfModifiedSince(l11.longValue());
                }
                AbstractC19691f.m103324j(httpURLConnection3, m103310d(c19687b.f97665f));
                if (cls == JSONObject.class || cls == JSONArray.class) {
                    AbstractC19691f.m103330p(httpURLConnection3, "Accept", "application/json");
                }
                C19687b.a aVar3 = c19687b.f97661b;
                if (aVar3 == aVar || aVar3 == C19687b.a.DELETE) {
                    httpURLConnection3.connect();
                } else if (c19687b.f97667h) {
                    AbstractC19691f.m103322h(httpURLConnection3, c19687b, c19687b.f97674o);
                    httpURLConnection3.setDoOutput(true);
                    m103308h(httpURLConnection3, c19687b.f97666g, c19687b.f97674o);
                } else {
                    byte[] m103326l = AbstractC19691f.m103326l(httpURLConnection3, c19687b, c19687b.f97674o, f97692k);
                    if (m103326l != null) {
                        httpURLConnection3.setDoOutput(true);
                        m103309i(httpURLConnection3, m103326l);
                    }
                }
                c19688c.f97685e = httpURLConnection3;
                c19688c.f97681a = httpURLConnection3.getResponseCode();
                c19688c.f97682b = httpURLConnection3.getResponseMessage();
                InputStream inputStream2 = c19688c.m103299e() ? httpURLConnection3.getInputStream() : httpURLConnection3.getErrorStream();
                try {
                    InputStream m103315a = AbstractC19691f.m103315a(httpURLConnection3.getContentEncoding(), inputStream2);
                    if (cls == InputStream.class) {
                        m103315a = new a(httpURLConnection3, m103315a);
                    }
                    if (c19688c.m103299e()) {
                        AbstractC19691f.m103329o(cls, c19688c, m103315a);
                    } else {
                        AbstractC19691f.m103320f(cls, c19688c, m103315a);
                    }
                    if (cls != InputStream.class) {
                        if (m103315a != null) {
                            try {
                                m103315a.close();
                            } catch (Exception unused) {
                            }
                        }
                        try {
                            httpURLConnection3.disconnect();
                        } catch (Exception unused2) {
                        }
                    }
                    return c19688c;
                } catch (C0002f e14) {
                    throw e14;
                } catch (Exception e15) {
                    e11 = e15;
                    throw new C0002f(e11);
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = inputStream2;
                    httpURLConnection2 = httpURLConnection3;
                    if (inputStream != null) {
                    }
                    if (httpURLConnection2 != null) {
                    }
                }
            } catch (C0002f e16) {
                e = e16;
                throw e;
            } catch (Exception e17) {
                e = e17;
                e11 = e;
                throw new C0002f(e11);
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = httpURLConnection3;
                th = th;
                httpURLConnection2 = httpURLConnection;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                if (httpURLConnection2 != null) {
                    throw th;
                }
                try {
                    httpURLConnection2.disconnect();
                    throw th;
                } catch (Exception unused4) {
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection2 = r02;
        }
    }

    /* renamed from: b */
    public static C19690e m103304b() {
        return new C19690e();
    }

    /* renamed from: c */
    private String m103305c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("pathOrUri must not be null");
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return str;
        }
        String str2 = this.f97694b;
        if (str2 == null) {
            str2 = f97689h;
        }
        if (str2 == null) {
            return str;
        }
        return str2 + str;
    }

    /* renamed from: e */
    private void m103306e(C19687b c19687b, HttpURLConnection httpURLConnection) {
        Integer num = c19687b.f97669j;
        if (num != null || f97690i != null) {
            if (num == null) {
                num = f97690i;
            }
            httpURLConnection.setConnectTimeout(num.intValue());
        }
        Integer num2 = c19687b.f97670k;
        if (num2 == null && f97691j == null) {
            return;
        }
        if (num2 == null) {
            num2 = f97691j;
        }
        httpURLConnection.setReadTimeout(num2.intValue());
    }

    /* renamed from: g */
    private void m103307g(HttpURLConnection httpURLConnection) {
        HostnameVerifier hostnameVerifier = this.f97697e;
        if (!(hostnameVerifier == null && this.f97696d == null) && (httpURLConnection instanceof HttpsURLConnection)) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            if (hostnameVerifier != null) {
                httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            }
            SSLSocketFactory sSLSocketFactory = this.f97696d;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
        }
    }

    /* renamed from: h */
    private void m103308h(HttpURLConnection httpURLConnection, Object obj, boolean z11) {
        InputStream inputStream;
        boolean z12;
        OutputStream outputStream;
        if (obj instanceof File) {
            inputStream = new FileInputStream((File) obj);
            z12 = true;
        } else {
            inputStream = (InputStream) obj;
            z12 = false;
        }
        try {
            outputStream = httpURLConnection.getOutputStream();
            if (z11) {
                try {
                    outputStream = new GZIPOutputStream(outputStream);
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    if (!z12) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (Exception unused2) {
                        throw th;
                    }
                }
            }
            AbstractC19691f.m103319e(inputStream, outputStream);
            outputStream.flush();
            try {
                outputStream.close();
            } catch (Exception unused3) {
            }
            if (inputStream == null || !z12) {
                return;
            }
            try {
                inputStream.close();
            } catch (Exception unused4) {
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    /* renamed from: i */
    private void m103309i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream;
        try {
            outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bArr);
                outputStream.flush();
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    /* renamed from: d */
    Map m103310d(Map map) {
        LinkedHashMap linkedHashMap;
        Map map2 = f97688g;
        if (map2.isEmpty()) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map2);
        }
        if (this.f97695c != null) {
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.putAll(this.f97695c);
        }
        if (map != null) {
            if (linkedHashMap == null) {
                return map;
            }
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    public void m103311f(String str, Object obj) {
        if (this.f97695c == null) {
            this.f97695c = new HashMap();
        }
        if (obj == null) {
            this.f97695c.remove(str);
        } else {
            this.f97695c.put(str, obj);
        }
    }

    /* renamed from: j */
    public C19687b m103312j(String str) {
        return new C19687b(this, C19687b.a.GET, m103305c(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C19688c m103313k(C19687b c19687b, Class cls) {
        C19688c c19688c;
        if (c19687b.f97675p == 0) {
            c19688c = m103303a(c19687b, cls);
        } else {
            if (this.f97698f == null) {
                this.f97698f = C19689d.f97687b;
            }
            C19688c c19688c2 = null;
            for (int i11 = 0; i11 <= c19687b.f97675p; i11++) {
                try {
                    c19688c2 = m103303a(c19687b, cls);
                } catch (C0002f e11) {
                    if (i11 >= c19687b.f97675p || !this.f97698f.m103301b(e11)) {
                        throw e11;
                    }
                }
                if (i11 >= c19687b.f97675p) {
                    break;
                }
                if (!this.f97698f.m103302c(c19688c2)) {
                    break;
                }
                if (c19687b.f97676q) {
                    this.f97698f.m103300a(i11);
                }
            }
            c19688c = c19688c2;
        }
        if (c19688c == null) {
            throw new IllegalStateException();
        }
        if (c19687b.f97673n) {
            c19688c.m103295a();
        }
        return c19688c;
    }

    /* renamed from: l */
    public C19687b m103314l(String str) {
        return new C19687b(this, C19687b.a.POST, m103305c(str));
    }
}
