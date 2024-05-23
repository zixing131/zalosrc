package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.C6576e;
import com.google.firebase.installations.AbstractC6587f;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p035b9.InterfaceC2661e;
import p229i5.AbstractC20280a;
import p229i5.AbstractC20290k;
import p229i5.C20288i;
import p229i5.InterfaceC20285f;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22886i;
import p541u9.AbstractC27194b;
import p541u9.InterfaceC27195c;

/* renamed from: com.google.firebase.remoteconfig.internal.s */
/* loaded from: classes3.dex */
public class C6735s {

    /* renamed from: q */
    static final int[] f37061q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: r */
    private static final Pattern f37062r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    private final Set f37063a;

    /* renamed from: c */
    private int f37065c;

    /* renamed from: g */
    private final ScheduledExecutorService f37069g;

    /* renamed from: h */
    private final C6729m f37070h;

    /* renamed from: i */
    private final C6576e f37071i;

    /* renamed from: j */
    private final InterfaceC2661e f37072j;

    /* renamed from: k */
    C6722f f37073k;

    /* renamed from: l */
    private final Context f37074l;

    /* renamed from: m */
    private final String f37075m;

    /* renamed from: p */
    private final C6732p f37078p;

    /* renamed from: f */
    private final int f37068f = 8;

    /* renamed from: b */
    private boolean f37064b = false;

    /* renamed from: n */
    private final Random f37076n = new Random();

    /* renamed from: o */
    private final InterfaceC20285f f37077o = C20288i.m105926d();

    /* renamed from: d */
    private boolean f37066d = false;

    /* renamed from: e */
    private boolean f37067e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.remoteconfig.internal.s$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6735s.this.m34487d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.remoteconfig.internal.s$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC27195c {
        b() {
        }

        @Override // p541u9.InterfaceC27195c
        /* renamed from: a */
        public void mo34492a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            C6735s.this.m34469i();
            C6735s.this.m34480t(firebaseRemoteConfigException);
        }

        @Override // p541u9.InterfaceC27195c
        /* renamed from: b */
        public void mo34493b(AbstractC27194b abstractC27194b) {
        }
    }

    public C6735s(C6576e c6576e, InterfaceC2661e interfaceC2661e, C6729m c6729m, C6722f c6722f, Context context, String str, Set set, C6732p c6732p, ScheduledExecutorService scheduledExecutorService) {
        this.f37063a = set;
        this.f37069g = scheduledExecutorService;
        this.f37065c = Math.max(8 - c6732p.m34447h().m34460b(), 1);
        this.f37071i = c6576e;
        this.f37070h = c6729m;
        this.f37072j = interfaceC2661e;
        this.f37073k = c6722f;
        this.f37074l = context;
        this.f37075m = str;
        this.f37078p = c6732p;
    }

    /* renamed from: C */
    private void m34463C(Date date) {
        int m34460b = this.f37078p.m34447h().m34460b() + 1;
        this.f37078p.m34453n(m34460b, new Date(date.getTime() + m34473m(m34460b)));
    }

    /* renamed from: e */
    private synchronized boolean m34467e() {
        boolean z11;
        if (!this.f37063a.isEmpty() && !this.f37064b && !this.f37066d) {
            if (!this.f37067e) {
                z11 = true;
            }
        }
        z11 = false;
        return z11;
    }

    /* renamed from: h */
    private JSONObject m34468h() {
        HashMap hashMap = new HashMap();
        hashMap.put("project", m34470j(this.f37071i.m33614m().m33680c()));
        hashMap.put("namespace", this.f37075m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f37070h.m34422r()));
        hashMap.put("appId", this.f37071i.m33614m().m33680c());
        hashMap.put("sdkVersion", "21.3.0");
        return new JSONObject(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m34469i() {
        this.f37066d = true;
    }

    /* renamed from: j */
    private static String m34470j(String str) {
        Matcher matcher = f37062r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: k */
    private String m34471k() {
        try {
            Context context = this.f37074l;
            byte[] m105897a = AbstractC20280a.m105897a(context, context.getPackageName());
            if (m105897a == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not get fingerprint hash for package: ");
                sb2.append(this.f37074l.getPackageName());
                return null;
            }
            return AbstractC20290k.m105937b(m105897a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No such package: ");
            sb3.append(this.f37074l.getPackageName());
            return null;
        }
    }

    /* renamed from: l */
    private void m34472l(final HttpURLConnection httpURLConnection) {
        this.f37072j.mo13076a(false).mo117589r(this.f37069g, new InterfaceC22886i() { // from class: com.google.firebase.remoteconfig.internal.r
            @Override // p342m6.InterfaceC22886i
            /* renamed from: a */
            public final AbstractC22888j mo33968a(Object obj) {
                AbstractC22888j m34477q;
                m34477q = C6735s.m34477q(httpURLConnection, (AbstractC6587f) obj);
                return m34477q;
            }
        });
    }

    /* renamed from: m */
    private long m34473m(int i11) {
        int length = f37061q.length;
        if (i11 >= length) {
            i11 = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i11 - 1]) / 2) + this.f37076n.nextInt((int) r0);
    }

    /* renamed from: n */
    private String m34474n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", m34470j(this.f37071i.m33614m().m33680c()), str);
    }

    /* renamed from: o */
    private URL m34475o() {
        try {
            return new URL(m34474n(this.f37075m));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private boolean m34476p(int i11) {
        return i11 == 408 || i11 == 429 || i11 == 502 || i11 == 503 || i11 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ AbstractC22888j m34477q(HttpURLConnection httpURLConnection, AbstractC6587f abstractC6587f) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", abstractC6587f.mo33627b());
        return AbstractC22894m.m117604f(null);
    }

    /* renamed from: r */
    private synchronized void m34478r(long j11) {
        try {
            if (!m34467e()) {
                return;
            }
            int i11 = this.f37065c;
            if (i11 > 0) {
                this.f37065c = i11 - 1;
                this.f37069g.schedule(new a(), j11, TimeUnit.MILLISECONDS);
            } else if (!this.f37067e) {
                m34480t(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.EnumC6713a.CONFIG_UPDATE_STREAM_ERROR));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: s */
    private String m34479s(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public synchronized void m34480t(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f37063a.iterator();
        while (it.hasNext()) {
            ((InterfaceC27195c) it.next()).mo34492a(firebaseRemoteConfigException);
        }
    }

    /* renamed from: u */
    private synchronized void m34481u() {
        this.f37065c = 8;
    }

    /* renamed from: w */
    private void m34482w(HttpURLConnection httpURLConnection) {
        m34472l(httpURLConnection);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f37071i.m33614m().m33679b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f37074l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m34471k());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: x */
    private synchronized void m34483x(boolean z11) {
        this.f37064b = z11;
    }

    /* renamed from: z */
    private void m34484z(HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestMethod("POST");
        byte[] bytes = m34468h().toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: A */
    public synchronized C6718b m34485A(HttpURLConnection httpURLConnection) {
        return new C6718b(httpURLConnection, this.f37070h, this.f37073k, this.f37063a, new b(), this.f37069g);
    }

    /* renamed from: B */
    public void m34486B() {
        m34478r(0L);
    }

    /* renamed from: d */
    public void m34487d() {
        Integer num;
        Integer num2;
        boolean z11;
        boolean z12;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        HttpURLConnection m34489g;
        boolean m34476p;
        if (!m34467e()) {
            return;
        }
        if (new Date(this.f37077o.mo105913a()).before(this.f37078p.m34447h().m34459a())) {
            m34490v();
            return;
        }
        m34483x(true);
        HttpURLConnection httpURLConnection = null;
        r2 = null;
        Integer num3 = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            m34489g = m34489g();
        } catch (IOException unused) {
            num2 = null;
        } catch (Throwable th2) {
            th = th2;
            num = null;
        }
        try {
            num3 = Integer.valueOf(m34489g.getResponseCode());
            if (num3.intValue() == 200) {
                m34481u();
                this.f37078p.m34449j();
                m34485A(m34489g).m34362i();
            }
            m34488f(m34489g);
            m34483x(false);
            m34476p = m34476p(num3.intValue());
            if (m34476p) {
                m34463C(new Date(this.f37077o.mo105913a()));
            }
        } catch (IOException unused2) {
            num2 = num3;
            httpURLConnection2 = m34489g;
            m34488f(httpURLConnection2);
            m34483x(false);
            if (num2 != null && !m34476p(num2.intValue())) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                m34463C(new Date(this.f37077o.mo105913a()));
            }
            if (!z12 && num2.intValue() != 200) {
                String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                if (num2.intValue() == 403) {
                    format = m34479s(httpURLConnection2.getErrorStream());
                }
                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(num2.intValue(), format, FirebaseRemoteConfigException.EnumC6713a.CONFIG_UPDATE_STREAM_ERROR);
                m34480t(firebaseRemoteConfigServerException);
                return;
            }
            m34490v();
        } catch (Throwable th3) {
            th = th3;
            num = num3;
            httpURLConnection = m34489g;
            m34488f(httpURLConnection);
            m34483x(false);
            if (num != null && !m34476p(num.intValue())) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                m34463C(new Date(this.f37077o.mo105913a()));
            }
            if (!z11 && num.intValue() != 200) {
                String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                if (num.intValue() == 403) {
                    format2 = m34479s(httpURLConnection.getErrorStream());
                }
                m34480t(new FirebaseRemoteConfigServerException(num.intValue(), format2, FirebaseRemoteConfigException.EnumC6713a.CONFIG_UPDATE_STREAM_ERROR));
            } else {
                m34490v();
            }
            throw th;
        }
        if (!m34476p && num3.intValue() != 200) {
            String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num3);
            if (num3.intValue() == 403) {
                format3 = m34479s(m34489g.getErrorStream());
            }
            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(num3.intValue(), format3, FirebaseRemoteConfigException.EnumC6713a.CONFIG_UPDATE_STREAM_ERROR);
            m34480t(firebaseRemoteConfigServerException);
            return;
        }
        m34490v();
    }

    /* renamed from: f */
    public void m34488f(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: g */
    public HttpURLConnection m34489g() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) m34475o().openConnection();
        m34482w(httpURLConnection);
        m34484z(httpURLConnection);
        return httpURLConnection;
    }

    /* renamed from: v */
    public synchronized void m34490v() {
        m34478r(Math.max(0L, this.f37078p.m34447h().m34459a().getTime() - new Date(this.f37077o.mo105913a()).getTime()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m34491y(boolean z11) {
        this.f37067e = z11;
    }
}
