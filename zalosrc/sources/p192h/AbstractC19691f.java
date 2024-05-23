package p192h;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.p002a.p003f.p004a.C0002f;

/* renamed from: h.f */
/* loaded from: classes2.dex */
public abstract class AbstractC19691f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InputStream m103315a(String str, InputStream inputStream) {
        if (str == null || "identity".equalsIgnoreCase(str)) {
            return inputStream;
        }
        if ("gzip".equalsIgnoreCase(str)) {
            return new GZIPInputStream(inputStream);
        }
        if ("deflate".equalsIgnoreCase(str)) {
            return new InflaterInputStream(inputStream, new Inflater(false), 512);
        }
        throw new C0002f("unsupported content-encoding: " + str);
    }

    /* renamed from: b */
    static String m103316b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: c */
    public static String m103317c(Map map) {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                Object[] objArr = (Object[]) value;
                int length = objArr.length;
                int i11 = 0;
                while (i11 < length) {
                    m103321g(sb2, str, (String) entry.getKey(), objArr[i11]);
                    i11++;
                    str = "&";
                }
            } else if (value instanceof Iterable) {
                Iterator it = ((Iterable) value).iterator();
                while (it.hasNext()) {
                    m103321g(sb2, str, (String) entry.getKey(), it.next());
                    str = "&";
                }
            } else {
                m103321g(sb2, str, (String) entry.getKey(), value);
                str = "&";
            }
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static DateFormat m103318d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    /* renamed from: e */
    public static void m103319e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m103320f(Class cls, C19688c c19688c, InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        if (cls == InputStream.class) {
            c19688c.f97684d = inputStream;
            return;
        }
        byte[] m103325k = m103325k(inputStream);
        String contentType = c19688c.f97685e.getContentType();
        if (contentType == null || contentType.startsWith("application/octet-stream") || cls == AbstractC19686a.f97659a) {
            c19688c.f97684d = m103325k;
            return;
        }
        if (contentType.startsWith("application/json") && cls == JSONObject.class) {
            try {
                c19688c.f97684d = m103331q(m103325k);
                return;
            } catch (Exception unused) {
            }
        }
        try {
            c19688c.f97684d = new String(m103325k, "utf-8");
        } catch (Exception unused2) {
            c19688c.f97684d = m103325k;
        }
    }

    /* renamed from: g */
    private static void m103321g(StringBuilder sb2, String str, String str2, Object obj) {
        String valueOf = obj == null ? "" : String.valueOf(obj);
        sb2.append(str);
        sb2.append(m103316b(str2));
        sb2.append('=');
        sb2.append(m103316b(valueOf));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m103322h(HttpURLConnection httpURLConnection, C19687b c19687b, boolean z11) {
        long j11;
        long j12;
        Object obj = c19687b.f97666g;
        if (obj instanceof File) {
            if (!z11) {
                j11 = ((File) obj).length();
                j12 = j11 <= 2147483647L ? j11 : -1L;
                m103330p(httpURLConnection, "Content-Type", "application/octet-stream");
                if (j12 < 0) {
                    httpURLConnection.setFixedLengthStreamingMode((int) j12);
                    return;
                }
                httpURLConnection.setChunkedStreamingMode(-1);
                if (z11) {
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    return;
                }
                return;
            }
        } else if (!(obj instanceof InputStream)) {
            throw new IllegalStateException();
        }
        j11 = -1;
        if (j11 <= 2147483647L) {
        }
        m103330p(httpURLConnection, "Content-Type", "application/octet-stream");
        if (j12 < 0) {
        }
    }

    /* renamed from: i */
    static void m103323i(HttpURLConnection httpURLConnection, String str, Object obj) {
        String obj2;
        DateFormat m103318d;
        Date time;
        if (str == null || str.length() == 0 || obj == null) {
            throw new IllegalArgumentException("name and value must not be empty");
        }
        if (obj instanceof Date) {
            m103318d = m103318d();
            time = (Date) obj;
        } else if (!(obj instanceof Calendar)) {
            obj2 = obj.toString();
            httpURLConnection.addRequestProperty(str, obj2);
        } else {
            m103318d = m103318d();
            time = ((Calendar) obj).getTime();
        }
        obj2 = m103318d.format(time);
        httpURLConnection.addRequestProperty(str, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m103324j(HttpURLConnection httpURLConnection, Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            m103323i(httpURLConnection, (String) entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: k */
    public static byte[] m103325k(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m103319e(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m103326l(HttpURLConnection httpURLConnection, C19687b c19687b, boolean z11, int i11) {
        byte[] bArr;
        String jSONArray;
        String str = null;
        if (c19687b.f97663d != null) {
            m103330p(httpURLConnection, "Content-Type", "application/x-www-form-urlencoded");
            jSONArray = m103317c(c19687b.f97663d);
        } else {
            Object obj = c19687b.f97666g;
            if (obj == null) {
                return null;
            }
            if (obj instanceof JSONObject) {
                m103330p(httpURLConnection, "Content-Type", "application/json");
                if (i11 >= 0) {
                    jSONArray = ((JSONObject) c19687b.f97666g).toString(i11);
                }
                jSONArray = c19687b.f97666g.toString();
            } else {
                if (obj instanceof JSONArray) {
                    m103330p(httpURLConnection, "Content-Type", "application/json");
                    if (i11 >= 0) {
                        jSONArray = ((JSONArray) c19687b.f97666g).toString(i11);
                    }
                } else {
                    if (obj instanceof byte[]) {
                        m103330p(httpURLConnection, "Content-Type", "application/octet-stream");
                        bArr = (byte[]) c19687b.f97666g;
                        if (str != null) {
                            bArr = str.getBytes("utf-8");
                        }
                        if (bArr != null) {
                            throw new IllegalStateException();
                        }
                        if (z11 && bArr.length > 80) {
                            byte[] m103327m = m103327m(bArr);
                            if (bArr.length - m103327m.length > 80) {
                                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                                bArr = m103327m;
                            }
                        }
                        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                        return bArr;
                    }
                    m103330p(httpURLConnection, "Content-Type", "text/plain");
                }
                jSONArray = c19687b.f97666g.toString();
            }
        }
        str = jSONArray;
        bArr = null;
        if (str != null) {
        }
        if (bArr != null) {
        }
    }

    /* renamed from: m */
    static byte[] m103327m(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.flush();
                    gZIPOutputStream2.close();
                    return byteArrayOutputStream.toByteArray();
                } catch (Exception e11) {
                    e = e11;
                    throw new C0002f(e);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: n */
    public static JSONArray m103328n(byte[] bArr) {
        try {
            return new JSONArray(new String(bArr, "utf-8"));
        } catch (UnsupportedEncodingException e11) {
            throw new C0002f(e11);
        } catch (JSONException e12) {
            throw new C0002f("payload is not a valid JSON array", e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static void m103329o(Class cls, C19688c c19688c, InputStream inputStream) {
        Object m103328n;
        if (inputStream == null || cls == Void.class) {
            return;
        }
        if (cls == InputStream.class) {
            c19688c.m103296b(inputStream);
            return;
        }
        byte[] m103325k = m103325k(inputStream);
        if (cls == String.class) {
            m103328n = new String(m103325k, "utf-8");
        } else if (cls == AbstractC19686a.f97659a) {
            c19688c.m103296b(m103325k);
            return;
        } else if (cls == JSONObject.class) {
            m103328n = m103331q(m103325k);
        } else if (cls != JSONArray.class) {
            return;
        } else {
            m103328n = m103328n(m103325k);
        }
        c19688c.m103296b(m103328n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static void m103330p(HttpURLConnection httpURLConnection, String str, Object obj) {
        if (httpURLConnection.getRequestProperties().containsKey(str)) {
            return;
        }
        m103323i(httpURLConnection, str, obj);
    }

    /* renamed from: q */
    public static JSONObject m103331q(byte[] bArr) {
        try {
            return new JSONObject(new String(bArr, "utf-8"));
        } catch (UnsupportedEncodingException e11) {
            throw new C0002f(e11);
        } catch (JSONException e12) {
            throw new C0002f("payload is not a valid JSON object", e12);
        }
    }
}
