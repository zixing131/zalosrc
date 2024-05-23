package com.zing.zalo.media.download;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import me0.AbstractC23227u1;
import me0.AbstractC23228u2;
import me0.AbstractC23238v2;
import mm0.AbstractC23347b;
import mm0.AbstractC23350e;

/* renamed from: com.zing.zalo.media.download.e */
/* loaded from: classes4.dex */
public abstract class AbstractC9007e {

    /* renamed from: r */
    protected static boolean f48190r = true;

    /* renamed from: s */
    static final String f48191s = "e";

    /* renamed from: t */
    static final AtomicInteger f48192t = new AtomicInteger(0);

    /* renamed from: b */
    protected File f48194b;

    /* renamed from: e */
    protected InputStream f48197e;

    /* renamed from: f */
    String f48198f;

    /* renamed from: g */
    boolean f48199g;

    /* renamed from: h */
    String f48200h;

    /* renamed from: i */
    String f48201i;

    /* renamed from: j */
    InterfaceC9009g f48202j;

    /* renamed from: k */
    int f48203k;

    /* renamed from: l */
    String f48204l;

    /* renamed from: m */
    boolean f48205m;

    /* renamed from: n */
    int f48206n;

    /* renamed from: a */
    protected boolean f48193a = false;

    /* renamed from: c */
    protected int f48195c = f48192t.incrementAndGet();

    /* renamed from: d */
    int f48196d = 1;

    /* renamed from: o */
    int f48207o = 0;

    /* renamed from: p */
    final Handler f48208p = new Handler(Looper.getMainLooper());

    /* renamed from: q */
    final Runnable f48209q = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.media.download.e$a */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC9009g interfaceC9009g = AbstractC9007e.this.f48202j;
            if (interfaceC9009g != null) {
                interfaceC9009g.mo48147b((int) ((r0.f48207o * 100.0f) / r0.f48206n));
            }
        }
    }

    /* renamed from: com.zing.zalo.media.download.e$b */
    /* loaded from: classes4.dex */
    public static class b extends Exception {
        static final long serialVersionUID = 1;

        /* renamed from: p */
        a f48211p;

        /* renamed from: com.zing.zalo.media.download.e$b$a */
        /* loaded from: classes4.dex */
        public enum a {
            REDIRECT,
            TOO_MANY_REDIRECTS,
            INTERRUPTED,
            INCOMPLETE,
            FORBIDDEN,
            UNKNOWN
        }

        public b(a aVar) {
            super(aVar.toString());
            this.f48211p = aVar;
        }

        public b(a aVar, Throwable th2) {
            super(aVar.toString() + ":" + th2.getMessage(), th2);
            this.f48211p = aVar;
        }

        public b(Throwable th2) {
            this(a.UNKNOWN, th2);
        }
    }

    /* renamed from: com.zing.zalo.media.download.e$c */
    /* loaded from: classes4.dex */
    public class c extends b {
        static final long serialVersionUID = 1;

        /* renamed from: q */
        String f48219q;

        public c(String str) {
            super(b.a.REDIRECT);
            this.f48219q = str;
        }

        /* renamed from: a */
        public String m48144a() {
            return this.f48219q;
        }
    }

    public AbstractC9007e(String str, String str2, String str3) {
        this.f48201i = str;
        this.f48204l = str2;
        this.f48200h = str3;
    }

    /* renamed from: a */
    public void m48128a() {
        this.f48198f = this.f48201i;
        while (!this.f48205m) {
            if (this.f48203k <= 2) {
                try {
                    m48129b(new URL(this.f48198f));
                    return;
                } catch (c e11) {
                    String m48144a = e11.m48144a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Redirected to ");
                    sb2.append(m48144a);
                    this.f48196d = 1;
                    this.f48198f = m48144a;
                } catch (b e12) {
                    AbstractC23350e.m122776f(f48191s, e12);
                    throw e12;
                } catch (MalformedURLException e13) {
                    AbstractC23350e.m122776f(f48191s, e13);
                    throw new b(e13);
                } catch (IOException e14) {
                    AbstractC23350e.m122776f(f48191s, e14);
                    this.f48196d++;
                    if (!AbstractC23227u1.m119701a(e14) && AbstractC23238v2.m119726k()) {
                        if (this.f48196d > 3) {
                            throw new b(e14);
                        }
                    } else {
                        throw e14;
                    }
                } catch (Exception unused) {
                }
            } else {
                throw new b(b.a.TOO_MANY_REDIRECTS);
            }
        }
        throw new b(b.a.INTERRUPTED);
    }

    /* renamed from: b */
    protected void m48129b(URL url) {
        m48140m(url);
        File file = this.f48194b;
        if (file == null) {
            return;
        }
        m48141n(this.f48197e, m48135h(file));
        this.f48197e = null;
        m48132e(this.f48194b);
        if (!f48190r) {
            this.f48194b.delete();
        }
    }

    /* renamed from: c */
    void m48130c(HttpURLConnection httpURLConnection) {
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            for (String str2 : headerFields.get(str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HEADER ");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
            }
        }
    }

    /* renamed from: d */
    protected void m48131d(HttpURLConnection httpURLConnection) {
        AbstractC23228u2.m119706e(httpURLConnection);
    }

    /* renamed from: e */
    protected void m48132e(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Moving temp file");
        sb2.append(file.getAbsolutePath());
        sb2.append(" to ");
        sb2.append(this.f48204l);
        sb2.append(",delete downloadFile:");
        sb2.append(m48138k(file));
        if (m48138k(file)) {
            file.renameTo(new File(this.f48204l));
        } else {
            try {
                File m104888p0 = AbstractC20130d.m104888p0();
                AbstractC23238v2.m119717b(file, m104888p0);
                m104888p0.renameTo(new File(this.f48204l));
            } catch (IOException e11) {
                AbstractC23350e.m122776f(f48191s, e11);
            }
        }
        this.f48199g = true;
    }

    /* renamed from: f */
    public int m48133f() {
        return this.f48195c;
    }

    /* renamed from: g */
    public String m48134g() {
        return this.f48201i;
    }

    /* renamed from: h */
    protected OutputStream m48135h(File file) {
        if (this.f48193a) {
            return new FileOutputStream(file, true);
        }
        return new FileOutputStream(file, false);
    }

    /* renamed from: i */
    public void m48136i() {
        this.f48205m = true;
        InputStream inputStream = this.f48197e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                AbstractC20110a.m104539h(e11);
            }
            this.f48197e = null;
        }
    }

    /* renamed from: j */
    public boolean m48137j() {
        return this.f48205m;
    }

    /* renamed from: k */
    protected boolean m48138k(File file) {
        return true;
    }

    /* renamed from: l */
    protected abstract void mo48139l(int i11);

    /* renamed from: m */
    protected void m48140m(URL url) {
        int i11;
        File file = new File(this.f48200h);
        this.f48194b = file;
        this.f48193a = false;
        if (f48190r && file.exists() && this.f48194b.length() > 0) {
            i11 = (int) this.f48194b.length();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Continuing download, current size:");
            sb2.append(i11);
            this.f48193a = true;
        } else {
            i11 = 0;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(30000);
        if (this.f48193a) {
            httpURLConnection.setRequestProperty("Range", "bytes=" + i11 + "-");
        }
        m48131d(httpURLConnection);
        int responseCode = httpURLConnection.getResponseCode();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Response code : ");
        sb3.append(responseCode);
        m48130c(httpURLConnection);
        if (responseCode != 200) {
            if (responseCode != 206) {
                if (responseCode != 307) {
                    if (responseCode != 403) {
                        if (responseCode != 416) {
                            switch (responseCode) {
                                case 301:
                                case 302:
                                case 303:
                                    break;
                                default:
                                    throw new IOException(String.format("Wrong server response: %d for URL = %s", Integer.valueOf(responseCode), url));
                            }
                        } else {
                            m48132e(this.f48194b);
                            return;
                        }
                    } else {
                        throw new b(b.a.FORBIDDEN);
                    }
                }
                this.f48203k++;
                throw new c(httpURLConnection.getHeaderField(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION));
            }
        } else {
            if (this.f48193a && i11 > 0) {
                throw new b(b.a.UNKNOWN);
            }
            if (AbstractC23347b.m122759a(httpURLConnection.getContentType(), httpURLConnection.getHeaderField(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION))) {
                throw new b(b.a.UNKNOWN);
            }
        }
        this.f48197e = httpURLConnection.getInputStream();
        if (this.f48193a) {
            String headerField = httpURLConnection.getHeaderField("Content-Range");
            if (headerField == null) {
                this.f48193a = false;
                this.f48206n = httpURLConnection.getContentLength();
            } else {
                AbstractC23228u2.a m119705d = AbstractC23228u2.m119705d(headerField);
                if (m119705d != null && m119705d.m119707a() == i11) {
                    this.f48206n = m119705d.m119708b();
                    this.f48207o = i11;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Continuing download, ");
                    sb4.append(m119705d.toString());
                } else {
                    throw new IOException("Invalid range header: " + headerField);
                }
            }
        } else {
            this.f48206n = httpURLConnection.getContentLength();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Starting download, totalFileSize: ");
            sb5.append(this.f48206n);
        }
        mo48139l(this.f48206n);
    }

    /* renamed from: n */
    void m48141n(InputStream inputStream, OutputStream outputStream) {
        int i11;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            byte[] bArr = new byte[65536];
            loop0: while (true) {
                i11 = 0;
                while (true) {
                    int i12 = this.f48207o;
                    int i13 = this.f48206n;
                    if ((i12 == i13 && i13 != 0) || i12 > Integer.MAX_VALUE) {
                        break loop0;
                    }
                    if (!this.f48205m) {
                        if (i13 - i12 <= 0) {
                            break loop0;
                        }
                        int i14 = 8192;
                        if (8192 > i13 - i12) {
                            i14 = i13 - i12;
                        }
                        int i15 = 65536 - i11;
                        if (i14 > i15) {
                            i14 = i15;
                        }
                        int read = inputStream.read(bArr, i11, i14);
                        if (read == -1) {
                            break loop0;
                        }
                        i11 += read;
                        this.f48207o += read;
                        if (this.f48202j != null) {
                            this.f48208p.removeCallbacks(this.f48209q);
                            this.f48208p.postDelayed(this.f48209q, 50L);
                        }
                        if (i11 <= 0 || i11 != 65536) {
                        }
                    } else {
                        throw new b(b.a.INTERRUPTED);
                    }
                }
                outputStream.write(bArr, 0, i11);
            }
            if (i11 > 0) {
                outputStream.write(bArr, 0, i11);
                this.f48207o += i11;
            }
            this.f48208p.removeCallbacks(this.f48209q);
            outputStream.flush();
            outputStream.close();
            inputStream.close();
            return;
        }
        throw new IOException("sdcard unmounted");
    }

    /* renamed from: o */
    public void m48142o(InterfaceC9009g interfaceC9009g) {
        this.f48202j = interfaceC9009g;
    }
}
