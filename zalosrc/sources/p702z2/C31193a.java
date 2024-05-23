package p702z2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.adtima.Adtima;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p178g3.AbstractC19207b;
import p227i3.AbstractC20202f;
import p313l3.AbstractC22011d;

/* renamed from: z2.a */
/* loaded from: classes2.dex */
public class C31193a {

    /* renamed from: b */
    private static final String f144039b = "a";

    /* renamed from: a */
    private WeakReference f144040a;

    /* renamed from: z2.a$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ e f144041p;

        /* renamed from: q */
        final /* synthetic */ d f144042q;

        /* renamed from: z2.a$a$a */
        /* loaded from: classes2.dex */
        public class C33060a extends AbstractRunnableC0008c {

            /* renamed from: z2.a$a$a$a */
            /* loaded from: classes2.dex */
            public class C33061a implements c {
                C33061a() {
                }

                @Override // p702z2.C31193a.c
                /* renamed from: a */
                public void mo151995a(boolean z11, e eVar) {
                    d dVar = a.this.f144042q;
                    if (dVar != null) {
                        dVar.mo105348a(z11, eVar);
                    }
                }
            }

            C33060a() {
            }

            @Override // p001a.p005d.AbstractRunnableC0008c
            public Void doInBackground() {
                try {
                    a aVar = a.this;
                    C31193a.this.m151984d(aVar.f144041p, new C33061a());
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        a(e eVar, d dVar) {
            this.f144041p = eVar;
            this.f144042q = dVar;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: a */
        public Boolean doInBackground() {
            boolean z11;
            try {
                z11 = C31193a.this.m151992h(this.f144041p);
            } catch (Exception unused) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    d dVar = this.f144042q;
                    if (dVar != null) {
                        dVar.mo105348a(bool.booleanValue(), this.f144041p);
                    }
                } else {
                    C0009d.m11g(new C33060a());
                }
            } catch (Exception e11) {
                Adtima.m18329e(C31193a.f144039b, "onPostExecute", e11);
            }
        }
    }

    /* renamed from: z2.a$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ e f144046p;

        /* renamed from: q */
        final /* synthetic */ c f144047q;

        /* renamed from: r */
        final /* synthetic */ Handler f144048r;

        /* renamed from: z2.a$b$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:            if (r2 != null) goto L36;     */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                c cVar;
                b bVar;
                c cVar2;
                try {
                    C31193a c31193a = C31193a.this;
                    if (!c31193a.m151986f((Context) c31193a.f144040a.get(), b.this.f144046p.f144052b)) {
                        C31193a c31193a2 = C31193a.this;
                        if (c31193a2.m151986f((Context) c31193a2.f144040a.get(), "8.8.8.8")) {
                            b bVar2 = b.this;
                            e eVar = bVar2.f144046p;
                            eVar.f144051a = f.BY_PING;
                            c cVar3 = bVar2.f144047q;
                            if (cVar3 != null) {
                                cVar3.mo151995a(true, eVar);
                            }
                        } else {
                            bVar = b.this;
                            cVar2 = bVar.f144047q;
                            if (cVar2 != null) {
                                cVar2.mo151995a(false, bVar.f144046p);
                            }
                        }
                        return;
                    }
                    bVar = b.this;
                    cVar2 = bVar.f144047q;
                } catch (Exception e11) {
                    Adtima.m18329e(C31193a.f144039b, "isBlockByVPN e3", e11);
                    b bVar3 = b.this;
                    cVar = bVar3.f144047q;
                    if (cVar == null) {
                    }
                }
                Adtima.m18329e(C31193a.f144039b, "isBlockByVPN e3", e11);
                b bVar32 = b.this;
                cVar = bVar32.f144047q;
                if (cVar == null) {
                    cVar.mo151995a(false, bVar32.f144046p);
                }
            }
        }

        b(e eVar, c cVar, Handler handler) {
            this.f144046p = eVar;
            this.f144047q = cVar;
            this.f144048r = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C31193a c31193a = C31193a.this;
                if (c31193a.m151986f((Context) c31193a.f144040a.get(), this.f144046p.f144052b)) {
                    c cVar = this.f144047q;
                    if (cVar != null) {
                        cVar.mo151995a(false, this.f144046p);
                    }
                } else {
                    this.f144048r.postDelayed(new a(), AbstractC20202f.f99838t0);
                }
            } catch (Exception e11) {
                Adtima.m18329e(C31193a.f144039b, "isBlockByVPN e2", e11);
                c cVar2 = this.f144047q;
                if (cVar2 != null) {
                    cVar2.mo151995a(false, this.f144046p);
                }
            }
        }
    }

    /* renamed from: z2.a$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        void mo151995a(boolean z11, e eVar);
    }

    /* renamed from: z2.a$d */
    /* loaded from: classes2.dex */
    public interface d {
        /* renamed from: a */
        void mo105348a(boolean z11, e eVar);
    }

    /* renamed from: z2.a$e */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a */
        public f f144051a;

        /* renamed from: b */
        public String f144052b;

        /* renamed from: c */
        public String f144053c;
    }

    /* renamed from: z2.a$f */
    /* loaded from: classes2.dex */
    public enum f {
        NONE,
        BY_HOSTS_FILE,
        BY_APP_NAME,
        BY_PING,
        BY_LOCAL_DNS,
        BY_LOCAL_PROXY
    }

    public C31193a(Context context) {
        this.f144040a = new WeakReference(context);
    }

    /* renamed from: d */
    public void m151984d(e eVar, c cVar) {
        try {
            if (eVar.f144052b != null) {
                try {
                    if (!m151986f((Context) this.f144040a.get(), eVar.f144052b)) {
                        HandlerThread handlerThread = new HandlerThread("HandlerThread");
                        handlerThread.start();
                        Handler handler = new Handler(handlerThread.getLooper());
                        handler.postDelayed(new b(eVar, cVar, handler), AbstractC20202f.f99838t0);
                    } else if (cVar != null) {
                        cVar.mo151995a(false, eVar);
                    }
                } catch (Exception e11) {
                    Adtima.m18328e(f144039b, "isBlockByVPN e1 = " + e11.getMessage());
                    if (cVar != null) {
                        cVar.mo151995a(false, eVar);
                    }
                }
            }
        } catch (Exception e12) {
            Adtima.m18329e(f144039b, "isBlockByVPN", e12);
            if (cVar != null) {
                cVar.mo151995a(false, eVar);
            }
        }
    }

    /* renamed from: f */
    public boolean m151986f(Context context, String str) {
        boolean z11;
        HttpURLConnection httpURLConnection;
        boolean z12 = false;
        try {
            String str2 = f144039b;
            Adtima.m18326d(str2, "PingDomain = " + str);
            if (!AbstractC19207b.m100801g(context)) {
                return false;
            }
            try {
                if (!str.startsWith("http")) {
                    str = "https://" + str;
                }
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                httpURLConnection.setRequestProperty("User-Agent", "Android");
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.connect();
                z11 = true;
            } catch (Exception e11) {
                e = e11;
                z11 = false;
            }
            try {
                Adtima.m18328e(str2, Process.myPid() + " | " + httpURLConnection.getURL() + " : " + httpURLConnection.getResponseCode() + " : " + httpURLConnection.getContentLength());
                return true;
            } catch (Exception e12) {
                e = e12;
                try {
                    e.printStackTrace();
                    return false;
                } catch (Exception e13) {
                    e = e13;
                    z12 = z11;
                    Adtima.m18329e(f144039b, "canPingDomain", e);
                    return z12;
                }
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    /* renamed from: g */
    private boolean m151987g(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            int responseCode = httpURLConnection.getResponseCode();
            if (200 <= responseCode && responseCode <= 399) {
                InputStream inputStream = httpURLConnection.getInputStream();
                boolean z11 = inputStream.read(new byte[8]) < 4;
                inputStream.close();
                return z11;
            }
        } catch (Exception e11) {
            Adtima.m18329e(f144039b, "httpAlmostNoContent", e11);
        }
        return false;
    }

    /* renamed from: j */
    private boolean m151989j(e eVar) {
        InetAddress byName;
        try {
            String str = f144039b;
            Adtima.m18326d(str, "detectLocalDNS");
            String m114916q = AbstractC22011d.m114916q(eVar.f144052b);
            if (m114916q != null && (byName = InetAddress.getByName(m114916q)) != null && (byName.isAnyLocalAddress() || byName.isLinkLocalAddress() || byName.isLoopbackAddress())) {
                Adtima.m18326d(str, "isBlockByLocalDNS: " + m114916q + " | addr: " + byName.getHostAddress());
                eVar.f144051a = f.BY_LOCAL_DNS;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: k */
    private boolean m151990k(e eVar) {
        String str;
        boolean z11;
        List<Proxy> select;
        InetAddress address;
        try {
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector != null && eVar != null && (select = proxySelector.select(URI.create(eVar.f144052b))) != null) {
                for (Proxy proxy : select) {
                    if (proxy == Proxy.NO_PROXY || proxy.type() != Proxy.Type.HTTP || !(proxy.address() instanceof InetSocketAddress) || (address = ((InetSocketAddress) proxy.address()).getAddress()) == null || (!address.isLoopbackAddress() && !address.isAnyLocalAddress())) {
                    }
                    str = address.toString();
                    z11 = true;
                }
            }
            str = "";
            z11 = false;
            if (!z11 || !m151987g(eVar.f144052b)) {
                return false;
            }
            eVar.f144051a = f.BY_LOCAL_PROXY;
            eVar.f144053c = str;
            return true;
        } catch (Exception e11) {
            Adtima.m18329e(f144039b, "isBlockByProxy", e11);
            return false;
        }
    }

    /* renamed from: c */
    public void m151991c(String str, d dVar) {
        try {
            e eVar = new e();
            eVar.f144052b = str;
            C0009d.m11g(new a(eVar, dVar));
        } catch (Exception e11) {
            Adtima.m18329e(f144039b, "detectTask", e11);
        }
    }

    /* renamed from: h */
    public boolean m151992h(e eVar) {
        try {
        } catch (Exception e11) {
            Adtima.m18329e(f144039b, "detectAdBlockers", e11);
        }
        if (!m151990k(eVar)) {
            if (!m151989j(eVar)) {
                return false;
            }
        }
        return true;
    }
}
