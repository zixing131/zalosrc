package th0;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.zing.zalo.zbrowser.cache.C16897a;
import com.zing.zalo.zbrowser.cache.C16898b;
import com.zing.zalo.zbrowser.cache.C16899c;
import com.zing.zalo.zbrowser.cache.C16900d;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import th0.C26699e;
import uh0.C27264c;
import uh0.C27266e;
import uh0.C27267f;
import uh0.C27269h;
import vh0.AbstractC28254a;

/* renamed from: th0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC26698d {

    /* renamed from: z */
    private static final Map f126500z;

    /* renamed from: a */
    private final C27269h f126501a = new C27269h();

    /* renamed from: b */
    private C16900d f126502b;

    /* renamed from: c */
    private C16900d f126503c;

    /* renamed from: d */
    private C16900d f126504d;

    /* renamed from: e */
    private C16900d f126505e;

    /* renamed from: f */
    private C16899c f126506f;

    /* renamed from: g */
    private C16899c f126507g;

    /* renamed from: h */
    private C16899c f126508h;

    /* renamed from: i */
    private C16899c f126509i;

    /* renamed from: j */
    private C16900d f126510j;

    /* renamed from: k */
    private C16899c f126511k;

    /* renamed from: l */
    private final Map f126512l;

    /* renamed from: m */
    private final Map f126513m;

    /* renamed from: n */
    private final Map f126514n;

    /* renamed from: o */
    private final Map f126515o;

    /* renamed from: p */
    protected final Map f126516p;

    /* renamed from: q */
    protected C16898b f126517q;

    /* renamed from: r */
    protected h f126518r;

    /* renamed from: s */
    private h f126519s;

    /* renamed from: t */
    protected f f126520t;

    /* renamed from: u */
    protected C26699e.g f126521u;

    /* renamed from: v */
    private Toast f126522v;

    /* renamed from: w */
    private final AtomicInteger f126523w;

    /* renamed from: x */
    public final WebViewClient f126524x;

    /* renamed from: y */
    public final WebChromeClient f126525y;

    /* renamed from: th0.d$b */
    /* loaded from: classes7.dex */
    class b extends WebChromeClient {

        /* renamed from: th0.d$b$a */
        /* loaded from: classes7.dex */
        class a implements ValueCallback {
            a() {
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }

        b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            AbstractC26698d abstractC26698d = AbstractC26698d.this;
            if (abstractC26698d.f126517q.f86047B) {
                abstractC26698d.m137210l();
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i11) {
            if (AbstractC26698d.this.f126517q.m90369h(webView.getUrl()) && i11 >= 100) {
                AbstractC26698d.this.f126518r.f126543b = System.currentTimeMillis();
                String str = AbstractC26698d.this.f126517q.f86048C;
                if (str != null && str.startsWith("http")) {
                    webView.evaluateJavascript(String.format("(function(){var o=document.createElement('script');o.defer='true';o.src='%s';document.body.appendChild(o);})();", AbstractC26698d.this.f126517q.f86048C), new a());
                }
            }
        }
    }

    /* renamed from: th0.d$c */
    /* loaded from: classes7.dex */
    class c implements C27266e.a {

        /* renamed from: a */
        final /* synthetic */ e f126529a;

        /* renamed from: b */
        final /* synthetic */ String f126530b;

        /* renamed from: c */
        final /* synthetic */ String f126531c;

        /* renamed from: d */
        final /* synthetic */ ByteArrayOutputStream f126532d;

        /* renamed from: e */
        final /* synthetic */ Context f126533e;

        c(e eVar, String str, String str2, ByteArrayOutputStream byteArrayOutputStream, Context context) {
            this.f126529a = eVar;
            this.f126530b = str;
            this.f126531c = str2;
            this.f126532d = byteArrayOutputStream;
            this.f126533e = context;
        }

        @Override // uh0.C27266e.a
        /* renamed from: a */
        public void mo137221a(String str, int i11, C27264c c27264c) {
            AbstractC26698d.this.f126523w.incrementAndGet();
            AbstractC26698d.this.f126514n.remove(this.f126531c);
            AbstractC26698d.this.f126514n.remove(str);
            try {
                byte[] m137201r = AbstractC26698d.this.m137201r(str, i11, this.f126532d, c27264c);
                int currentTimeMillis = (int) ((System.currentTimeMillis() / 1000) + AbstractC26698d.this.f126517q.f86050b);
                String m139555b = c27264c.m139555b("etag");
                if (m139555b == null) {
                    m139555b = "";
                }
                String m139555b2 = c27264c.m139555b("preload");
                if (m139555b2 != null) {
                    f fVar = AbstractC26698d.this.f126520t;
                    if (fVar != null) {
                        fVar.mo137228a(String.format("Preload resources of html: %s", m139555b2));
                    }
                    for (String str2 : m139555b2.split(";")) {
                        String trim = str2.trim();
                        if (trim.startsWith("http")) {
                            AbstractC26698d.this.m137203z(trim, this.f126533e);
                        }
                    }
                }
                C16897a c16897a = new C16897a(currentTimeMillis, "text/html", m137201r, m139555b);
                if (AbstractC26698d.this.f126502b != null) {
                    AbstractC26698d.this.f126502b.m90432k(str, c16897a);
                }
                if (AbstractC26698d.this.f126507g != null) {
                    AbstractC26698d abstractC26698d = AbstractC26698d.this;
                    abstractC26698d.m137205F(abstractC26698d.f126507g, str, c16897a);
                }
                e eVar = this.f126529a;
                if (eVar != null) {
                    eVar.mo137227c(this.f126530b, 100, true);
                }
                f fVar2 = AbstractC26698d.this.f126520t;
                if (fVar2 != null) {
                    fVar2.mo137228a(String.format("PRELOAD - DONE (downloaded): %s", str));
                }
            } catch (Exception e11) {
                mo137224d(str, e11.getMessage());
            }
        }

        @Override // uh0.C27266e.a
        /* renamed from: b */
        public void mo137222b(String str, int i11, C27264c c27264c) {
            if (300 <= i11 && i11 < 400 && c27264c.m139557d(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) {
                String m139555b = c27264c.m139555b(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                String str2 = "";
                C16897a c16897a = new C16897a((int) ((System.currentTimeMillis() / 1000) + AbstractC26698d.this.f126517q.f86050b), "", m139555b.getBytes(), "");
                String str3 = "NA";
                try {
                    str3 = C27267f.m139581a(m139555b).f128233c;
                    str2 = C27267f.m139581a(str).f128233c;
                } catch (MalformedURLException e11) {
                    e11.printStackTrace();
                }
                if (str3.equals(str2)) {
                    String m142265d = AbstractC28254a.m142265d(str, AbstractC26698d.this.m137214s());
                    AbstractC26698d.this.f126510j.m90432k(m142265d, c16897a);
                    AbstractC26698d abstractC26698d = AbstractC26698d.this;
                    abstractC26698d.m137205F(abstractC26698d.f126511k, m142265d, c16897a);
                } else {
                    e eVar = this.f126529a;
                    if (eVar != null) {
                        eVar.mo137225a(this.f126530b);
                    }
                }
            }
            if (i11 >= 400) {
                try {
                    String str4 = this.f126531c;
                    String m137185B = AbstractC26698d.m137185B(str4);
                    AbstractC26698d.this.f126510j.m149141f(str4);
                    AbstractC26698d.this.f126511k.m90397Q(m137185B);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
        @Override // uh0.C27266e.a
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo137223c(String str, byte[] bArr, C27264c c27264c) {
            long j11;
            int size;
            try {
                this.f126532d.write(bArr);
                if (this.f126529a != null) {
                    if (c27264c.m139557d("content-length")) {
                        try {
                            j11 = Long.parseLong(c27264c.m139555b("content-length"));
                        } catch (Exception unused) {
                        }
                        size = (int) ((this.f126532d.size() * 100.0f) / ((float) j11));
                        if (size > 94) {
                            size = 94;
                        }
                        this.f126529a.mo137227c(str, size, false);
                    }
                    j11 = 100000;
                    size = (int) ((this.f126532d.size() * 100.0f) / ((float) j11));
                    if (size > 94) {
                    }
                    this.f126529a.mo137227c(str, size, false);
                }
            } catch (Exception unused2) {
            }
        }

        @Override // uh0.C27266e.a
        /* renamed from: d */
        public void mo137224d(String str, String str2) {
            AbstractC26698d.this.f126514n.remove(this.f126531c);
            AbstractC26698d.this.f126514n.remove(str);
            e eVar = this.f126529a;
            if (eVar != null) {
                eVar.mo137225a(str);
            }
            f fVar = AbstractC26698d.this.f126520t;
            if (fVar != null) {
                fVar.mo137228a(String.format("PRELOAD - ERROR (onResponseError): %s \n Msg: %s", str, str2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th0.d$d */
    /* loaded from: classes7.dex */
    public class d implements C27266e.a {

        /* renamed from: a */
        final /* synthetic */ C16900d f126535a;

        /* renamed from: b */
        final /* synthetic */ C16899c f126536b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f126537c;

        /* renamed from: d */
        final /* synthetic */ String f126538d;

        /* renamed from: e */
        final /* synthetic */ ByteArrayOutputStream f126539e;

        /* renamed from: f */
        final /* synthetic */ int f126540f;

        d(C16900d c16900d, C16899c c16899c, ArrayList arrayList, String str, ByteArrayOutputStream byteArrayOutputStream, int i11) {
            this.f126535a = c16900d;
            this.f126536b = c16899c;
            this.f126537c = arrayList;
            this.f126538d = str;
            this.f126539e = byteArrayOutputStream;
            this.f126540f = i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:28:0x0071, B:30:0x008d, B:33:0x0094, B:34:0x00a1, B:37:0x00ab, B:39:0x00b4, B:40:0x00b7, B:42:0x00bb, B:43:0x00c0), top: B:27:0x0071 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:28:0x0071, B:30:0x008d, B:33:0x0094, B:34:0x00a1, B:37:0x00ab, B:39:0x00b4, B:40:0x00b7, B:42:0x00bb, B:43:0x00c0), top: B:27:0x0071 }] */
        @Override // uh0.C27266e.a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo137221a(String str, int i11, C27264c c27264c) {
            String str2;
            String m139555b;
            C16900d c16900d;
            C16899c c16899c;
            C16897a c16897a;
            AbstractC26698d.this.f126514n.remove(this.f126538d);
            if (this.f126537c.size() != 0) {
                AbstractC26698d.this.m137184A(String.format("Download file error: difference domain - Url: %s - Redirect Url: %s", str, this.f126537c.get(0)));
                return;
            }
            if (i11 != 304) {
                try {
                    byte[] m137201r = AbstractC26698d.this.m137201r(this.f126538d, i11, this.f126539e, c27264c);
                    int currentTimeMillis = (int) ((System.currentTimeMillis() / 1000) + this.f126540f);
                    String m139555b2 = c27264c.m139555b("content-type");
                    if (m139555b2 != null && !m139555b2.isEmpty()) {
                        str2 = m139555b2.split(";")[0];
                        m139555b = c27264c.m139555b("etag");
                        if (m139555b == null) {
                            m139555b = "";
                        }
                        C16897a c16897a2 = new C16897a(currentTimeMillis, str2, m137201r, m139555b);
                        c16900d = this.f126535a;
                        if (c16900d != null) {
                            c16900d.m90432k(str, c16897a2);
                        }
                        c16899c = this.f126536b;
                        if (c16899c != null) {
                            AbstractC26698d.this.m137205F(c16899c, str, c16897a2);
                        }
                        AbstractC26698d.this.f126514n.remove(str);
                        AbstractC26698d.this.m137184A(String.format("Download file done - Url: %s", str));
                        return;
                    }
                    str2 = "text/plain";
                    m139555b = c27264c.m139555b("etag");
                    if (m139555b == null) {
                    }
                    C16897a c16897a22 = new C16897a(currentTimeMillis, str2, m137201r, m139555b);
                    c16900d = this.f126535a;
                    if (c16900d != null) {
                    }
                    c16899c = this.f126536b;
                    if (c16899c != null) {
                    }
                    AbstractC26698d.this.f126514n.remove(str);
                    AbstractC26698d.this.m137184A(String.format("Download file done - Url: %s", str));
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    mo137224d(str, e11.getMessage());
                    return;
                }
            }
            f fVar = AbstractC26698d.this.f126520t;
            if (fVar != null) {
                fVar.mo137228a(String.format("Not modified: %s", str));
            }
            C16900d c16900d2 = this.f126535a;
            if (c16900d2 != null) {
                c16897a = (C16897a) c16900d2.m149139d(str);
                if (c16897a != null) {
                    c16897a.f86041a = (int) ((System.currentTimeMillis() / 1000) + this.f126540f);
                }
            } else {
                c16897a = null;
            }
            C16899c c16899c2 = this.f126536b;
            if (c16899c2 != null) {
                if (c16897a == null) {
                    c16897a = AbstractC26698d.this.m137215u(c16899c2, str);
                }
                if (c16897a != null) {
                    c16897a.f86041a = (int) ((System.currentTimeMillis() / 1000) + this.f126540f);
                    C16900d c16900d3 = this.f126535a;
                    if (c16900d3 != null) {
                        c16900d3.m90432k(str, c16897a);
                    }
                    AbstractC26698d.this.m137205F(this.f126536b, str, c16897a);
                }
            }
        }

        @Override // uh0.C27266e.a
        /* renamed from: b */
        public void mo137222b(String str, int i11, C27264c c27264c) {
            if (this.f126535a != AbstractC26698d.this.f126502b && this.f126536b != AbstractC26698d.this.f126507g) {
                return;
            }
            if (i11 != 304 && 300 <= i11 && i11 < 400 && c27264c.m139557d(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) {
                String m139555b = c27264c.m139555b(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                String str2 = "";
                C16897a c16897a = new C16897a((int) ((System.currentTimeMillis() / 1000) + AbstractC26698d.this.f126517q.f86050b), "", m139555b.getBytes(), "");
                String m142265d = AbstractC28254a.m142265d(str, AbstractC26698d.this.m137214s());
                String str3 = "NA";
                try {
                    str3 = C27267f.m139581a(m139555b).f128233c;
                    str2 = C27267f.m139581a(str).f128233c;
                } catch (MalformedURLException e11) {
                    e11.printStackTrace();
                }
                if (!str3.equals(str2)) {
                    AbstractC26698d.this.m137184A(String.format("Download file error: difference domain - Url: %s - Redirect Url: %s", str, m139555b));
                } else {
                    this.f126537c.add(str3);
                    AbstractC26698d.this.f126510j.m90432k(m142265d, c16897a);
                    AbstractC26698d abstractC26698d = AbstractC26698d.this;
                    abstractC26698d.m137205F(abstractC26698d.f126511k, m142265d, c16897a);
                }
            }
            if (i11 >= 400) {
                try {
                    String str4 = this.f126538d;
                    String m137185B = AbstractC26698d.m137185B(str4);
                    AbstractC26698d.this.f126510j.m149141f(str4);
                    AbstractC26698d.this.f126511k.m90397Q(m137185B);
                } catch (Exception unused) {
                }
            }
        }

        @Override // uh0.C27266e.a
        /* renamed from: c */
        public void mo137223c(String str, byte[] bArr, C27264c c27264c) {
            try {
                this.f126539e.write(bArr);
            } catch (Exception unused) {
                AbstractC26698d.this.m137184A(String.format("Download file error: downloadBuffer write data - Url: %s", str));
            }
        }

        @Override // uh0.C27266e.a
        /* renamed from: d */
        public void mo137224d(String str, String str2) {
            AbstractC26698d.this.f126514n.remove(this.f126538d);
            f fVar = AbstractC26698d.this.f126520t;
            if (fVar != null) {
                fVar.mo137228a(String.format("Download file error:  %s - Url: %s", str2, str));
            }
        }
    }

    /* renamed from: th0.d$e */
    /* loaded from: classes7.dex */
    public interface e {
        /* renamed from: a */
        void mo137225a(String str);

        /* renamed from: b */
        void mo137226b(String str);

        /* renamed from: c */
        void mo137227c(String str, int i11, boolean z11);
    }

    /* renamed from: th0.d$f */
    /* loaded from: classes7.dex */
    public interface f {
        /* renamed from: a */
        void mo137228a(String str);
    }

    /* renamed from: th0.d$g */
    /* loaded from: classes7.dex */
    public interface g {
    }

    /* renamed from: th0.d$h */
    /* loaded from: classes7.dex */
    public static class h {

        /* renamed from: a */
        public long f126542a;

        /* renamed from: d */
        public int f126545d;

        /* renamed from: e */
        public int f126546e;

        /* renamed from: f */
        public int f126547f;

        /* renamed from: g */
        public int f126548g;

        /* renamed from: h */
        public long f126549h = 0;

        /* renamed from: i */
        public long f126550i = 0;

        /* renamed from: b */
        public long f126543b = -1;

        /* renamed from: c */
        public long f126544c = -1;

        /* renamed from: j */
        public String f126551j = "";

        /* renamed from: k */
        public boolean f126552k = false;

        /* renamed from: l */
        public AtomicInteger f126553l = null;

        /* renamed from: m */
        public AtomicInteger f126554m = new AtomicInteger();

        /* renamed from: n */
        public long f126555n = -1;

        /* renamed from: o */
        public long f126556o = -1;

        /* renamed from: p */
        public long f126557p = -1;

        /* renamed from: q */
        public long f126558q = -1;

        /* renamed from: r */
        public long f126559r = -1;

        /* renamed from: s */
        public long f126560s = -1;

        private h(long j11, int i11, int i12, int i13, int i14) {
            this.f126542a = j11;
            this.f126545d = i11;
            this.f126546e = i12;
            this.f126547f = i13;
            this.f126548g = i14;
        }

        /* renamed from: a */
        static /* synthetic */ h m137229a() {
            return m137230b();
        }

        /* renamed from: b */
        private static h m137230b() {
            return new h(System.currentTimeMillis(), 0, 0, 0, 0);
        }

        /* renamed from: c */
        public JSONObject m137231c() {
            int i11;
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.f126543b < 0) {
                    this.f126543b = System.currentTimeMillis();
                }
                if (this.f126544c < 0) {
                    this.f126544c = System.currentTimeMillis();
                }
                jSONObject.put("pageFinish", this.f126543b - this.f126542a);
                jSONObject.put("pageVisible", this.f126544c - this.f126542a);
                jSONObject.put("memCacheHit", this.f126545d);
                jSONObject.put("memCacheMiss", this.f126546e);
                jSONObject.put("diskCacheHit", this.f126547f);
                jSONObject.put("diskCacheMiss", this.f126548g);
                jSONObject.put("currentMemCacheSize", this.f126549h);
                jSONObject.put("currentDiskCacheSize", this.f126550i);
                jSONObject.put("preloadedUrlHit", this.f126552k ? 1 : 0);
                AtomicInteger atomicInteger = this.f126553l;
                if (atomicInteger == null) {
                    i11 = 0;
                } else {
                    i11 = atomicInteger.get();
                }
                jSONObject.put("preloadedUrlCount", i11);
                jSONObject.put("totalByteFromCache", this.f126554m.get());
                AtomicInteger atomicInteger2 = this.f126553l;
                if (atomicInteger2 != null) {
                    atomicInteger2.set(0);
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public String toString() {
            return m137231c().toString();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f126500z = hashMap;
        hashMap.put("Access-Control-Allow-Origin", "*");
    }

    public AbstractC26698d(C16898b c16898b, String str, Context context) {
        this.f126502b = null;
        this.f126503c = null;
        this.f126504d = null;
        this.f126505e = null;
        this.f126506f = null;
        this.f126507g = null;
        this.f126508h = null;
        this.f126509i = null;
        this.f126510j = null;
        this.f126511k = null;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f126512l = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.f126513m = concurrentHashMap2;
        this.f126514n = new ConcurrentHashMap();
        this.f126515o = new ConcurrentHashMap();
        this.f126516p = new HashMap();
        this.f126518r = h.m137229a();
        this.f126519s = h.m137229a();
        this.f126522v = null;
        this.f126523w = new AtomicInteger();
        this.f126524x = new a();
        this.f126525y = new b();
        m137207H(c16898b, context);
        int i11 = c16898b.f86059k;
        if (i11 > 0) {
            this.f126502b = new C16900d(i11, concurrentHashMap);
        }
        int i12 = c16898b.f86060l;
        if (i12 > 0) {
            this.f126503c = new C16900d(i12, concurrentHashMap);
        }
        int i13 = c16898b.f86065q;
        if (i13 > 0) {
            this.f126505e = new C16900d(i13, concurrentHashMap);
        }
        int i14 = c16898b.f86063o;
        if (i14 > 0) {
            this.f126504d = new C16900d(i14, concurrentHashMap);
        }
        if (c16898b.f86061m > 0) {
            try {
                this.f126507g = C16899c.m90373L(new File(str, "html"), 1, 1, c16898b.f86061m, concurrentHashMap2, true);
            } catch (Exception unused) {
            }
        }
        if (c16898b.f86066r > 0) {
            try {
                this.f126506f = C16899c.m90373L(new File(str, "h5static"), 1, 1, c16898b.f86066r, this.f126513m, true);
            } catch (Exception unused2) {
            }
        }
        if (c16898b.f86062n > 0) {
            try {
                this.f126508h = C16899c.m90373L(new File(str, "static"), 1, 1, c16898b.f86062n, this.f126513m, true);
            } catch (Exception unused3) {
            }
        }
        if (c16898b.f86064p > 0) {
            try {
                this.f126509i = C16899c.m90373L(new File(str, "photo"), 1, 1, c16898b.f86064p, this.f126513m, false);
            } catch (Exception unused4) {
            }
        }
        int i15 = c16898b.f86059k;
        this.f126510j = new C16900d(i15 <= 0 ? C16898b.f86045D.f86059k : i15, null);
        try {
            this.f126511k = C16899c.m90373L(new File(str, "redirect"), 1, 1, c16898b.f86061m <= 0 ? C16898b.f86045D.f86061m : r10, null, false);
        } catch (Exception unused5) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m137184A(String str) {
        f fVar = this.f126520t;
        if (fVar != null) {
            fVar.mo137228a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static String m137185B(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            String str2 = "";
            for (byte b11 : messageDigest.digest()) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    str2 = str2 + "0" + hexString;
                } else {
                    str2 = str2 + hexString;
                }
            }
            return str2;
        } catch (Exception unused) {
            return String.valueOf(str.hashCode());
        }
    }

    /* renamed from: C */
    private C16900d m137186C(C16899c c16899c) {
        if (c16899c == this.f126507g) {
            return this.f126502b;
        }
        if (c16899c == this.f126508h) {
            return this.f126503c;
        }
        if (c16899c == this.f126506f) {
            return this.f126505e;
        }
        if (c16899c == this.f126509i) {
            return this.f126504d;
        }
        return null;
    }

    /* renamed from: E */
    private Map m137187E(String str) {
        Map m137199o = m137199o();
        try {
            m137199o.remove("cookie");
            String m137198k = m137198k(C27267f.m139581a(str).f128233c);
            if (!m137198k.isEmpty()) {
                m137199o.put("cookie", m137198k);
            }
        } catch (Exception unused) {
        }
        return m137199o;
    }

    /* renamed from: k */
    private String m137198k(String str) {
        if (str != null && !str.isEmpty()) {
            String format = String.format(".%s", str);
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry : this.f126515o.entrySet()) {
                String str2 = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                if (format.endsWith(str2)) {
                    for (Map.Entry entry2 : map.entrySet()) {
                        String str3 = (String) entry2.getKey();
                        String str4 = (String) entry2.getValue();
                        sb2.append(str3);
                        sb2.append("=");
                        sb2.append(str4);
                        sb2.append("; ");
                    }
                }
            }
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: o */
    private Map m137199o() {
        HashMap hashMap = new HashMap();
        Map map = this.f126516p;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    /* renamed from: q */
    private void m137200q(String str, C16900d c16900d, C16899c c16899c, String str2, int i11) {
        if (c16900d == null && c16899c == null) {
            return;
        }
        try {
            this.f126514n.put(str, Boolean.TRUE);
            Map m137187E = m137187E(str);
            if (str2 != null && !str2.isEmpty()) {
                m137187E.put("if-none-match", str2);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f126501a.m139597h(str, m137187E, new d(c16900d, c16899c, new ArrayList(), str, byteArrayOutputStream, i11));
        } catch (Exception e11) {
            this.f126514n.remove(str);
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public byte[] m137201r(String str, int i11, ByteArrayOutputStream byteArrayOutputStream, C27264c c27264c) {
        if (i11 == 200) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            GZIPInputStream gZIPInputStream = null;
            try {
                try {
                    if ("gzip".equalsIgnoreCase(c27264c.m139555b("content-encoding"))) {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(byteArray));
                        try {
                            byte[] bArr = new byte[65536];
                            while (true) {
                                int read = gZIPInputStream2.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr, 0, read);
                            }
                            byteArray = byteArrayOutputStream2.toByteArray();
                            gZIPInputStream = gZIPInputStream2;
                        } catch (Exception e11) {
                            e = e11;
                            f fVar = this.f126520t;
                            if (fVar != null) {
                                fVar.mo137228a(String.format("Error while handling downloaded data: %s - Exception: %s", str, e.toString()));
                            }
                            throw new IOException(e);
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPInputStream = gZIPInputStream2;
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            throw th;
                        }
                    }
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    return byteArray;
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IOException("Status code != 200: " + i11 + "! Url: " + str);
        }
    }

    /* renamed from: t */
    private int m137202t(String str) {
        String str2;
        try {
            str2 = C27267f.m139581a(str).f128233c;
        } catch (Exception unused) {
            str2 = "";
        }
        if (this.f126517q.f86054f.contains(str2)) {
            return this.f126517q.f86050b;
        }
        if (!this.f126517q.f86056h.contains(str2) && !this.f126517q.f86057i.contains(str2)) {
            return 0;
        }
        return this.f126517q.f86051c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public boolean m137203z(String str, Context context) {
        String str2;
        C16900d c16900d;
        C16899c c16899c;
        String m142265d = AbstractC28254a.m142265d(str, m137214s());
        try {
            str2 = C27267f.m139581a(m142265d).f128233c;
        } catch (Exception unused) {
            str2 = "";
        }
        C16898b c16898b = this.f126517q;
        int i11 = c16898b.f86051c;
        if (c16898b.f86056h.contains(str2)) {
            if (this.f126517q.f86068t.contains(str2)) {
                c16900d = this.f126505e;
                c16899c = this.f126506f;
            } else {
                c16900d = this.f126503c;
                c16899c = this.f126508h;
            }
        } else if (this.f126517q.f86057i.contains(str2)) {
            c16900d = this.f126504d;
            c16899c = this.f126509i;
        } else {
            if (this.f126517q.f86054f.contains(str2)) {
                c16900d = this.f126502b;
                c16899c = this.f126507g;
                i11 = this.f126517q.f86050b;
            }
            return false;
        }
        C16899c c16899c2 = c16899c;
        int i12 = i11;
        if ((c16900d != null || c16899c2 != null) && !this.f126514n.containsKey(m142265d) && !this.f126512l.containsKey(Integer.valueOf(m142265d.hashCode())) && !this.f126513m.containsKey(Integer.valueOf(m137185B(m142265d).hashCode()))) {
            if (this.f126517q.f86058j && !AbstractC28254a.m142264c(context)) {
                return false;
            }
            m137200q(m142265d, c16900d, c16899c2, null, i12);
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public void m137204D(String str) {
        h m137229a = h.m137229a();
        this.f126518r = m137229a;
        m137229a.f126551j = str;
        m137229a.f126553l = this.f126523w;
        m137229a.f126560s = System.currentTimeMillis();
        h hVar = this.f126518r;
        hVar.f126555n = hVar.f126560s;
        h hVar2 = this.f126519s;
        long j11 = hVar2.f126555n;
        if (j11 != -1) {
            hVar.f126555n = j11;
        }
        hVar.f126556o = hVar2.f126556o;
        hVar.f126557p = hVar2.f126557p;
        hVar.f126558q = hVar2.f126558q;
        hVar.f126559r = hVar2.f126559r;
        this.f126519s = h.m137229a();
    }

    /* renamed from: F */
    protected void m137205F(C16899c c16899c, String str, C16897a c16897a) {
        OutputStream m90407f;
        if (c16899c != null && !c16899c.isClosed() && str != null && c16897a != null) {
            try {
                String m137185B = m137185B(str);
                C16899c.c m90394A = c16899c.m90394A(m137185B);
                if (c16899c.m90396G()) {
                    m90407f = new GZIPOutputStream(m90394A.m90407f(0));
                } else {
                    m90407f = m90394A.m90407f(0);
                }
                m90407f.write(c16897a.m90361b().array());
                m90407f.close();
                m90394A.m90406e();
                this.f126513m.put(Integer.valueOf(m137185B.hashCode()), c16899c);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: G */
    public void m137206G(String str) {
        try {
            String m142265d = AbstractC28254a.m142265d(str, m137214s());
            String m137185B = m137185B(m142265d);
            C16900d c16900d = (C16900d) this.f126512l.get(Integer.valueOf(m142265d.hashCode()));
            C16899c c16899c = (C16899c) this.f126513m.get(Integer.valueOf(m137185B.hashCode()));
            this.f126512l.remove(Integer.valueOf(m142265d.hashCode()));
            this.f126513m.remove(Integer.valueOf(m137185B.hashCode()));
            if (c16900d != null) {
                c16900d.m149141f(m142265d);
            }
            if (c16899c != null) {
                c16899c.m90397Q(m137185B);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: H */
    public boolean m137207H(C16898b c16898b, Context context) {
        boolean z11;
        if (c16898b == null) {
            c16898b = C16898b.f86045D;
        }
        if (!c16898b.equals(this.f126517q)) {
            this.f126517q = c16898b;
            Iterator it = c16898b.f86055g.iterator();
            while (it.hasNext()) {
                m137203z((String) it.next(), context);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        this.f126501a.m139598p(c16898b.f86052d);
        return z11;
    }

    /* renamed from: I */
    public void m137208I(f fVar) {
        this.f126520t = fVar;
    }

    /* renamed from: J */
    public void m137209J(C26699e.g gVar) {
        this.f126521u = gVar;
    }

    protected void finalize() {
        m137213p();
        super.finalize();
    }

    /* renamed from: l */
    public void m137210l() {
        Toast toast = this.f126522v;
        if (toast != null) {
            toast.cancel();
            this.f126522v = null;
        }
    }

    /* renamed from: m */
    public boolean m137211m(String str) {
        C16897a m137215u;
        try {
            String m142265d = AbstractC28254a.m142265d(str, m137214s());
            String m137185B = m137185B(m142265d);
            C16900d c16900d = (C16900d) this.f126512l.get(Integer.valueOf(m142265d.hashCode()));
            C16899c c16899c = (C16899c) this.f126513m.get(Integer.valueOf(m137185B.hashCode()));
            if (c16900d == null || c16899c == null || ((C16897a) c16900d.m149139d(m142265d)) != null || (m137215u = m137215u(c16899c, m142265d)) == null) {
                return false;
            }
            if (m137215u.f86041a < System.currentTimeMillis() / 1000) {
                m137206G(str);
                return false;
            }
            c16900d.m90432k(m142265d, m137215u);
            return true;
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: n */
    public String m137212n(String str) {
        while (true) {
            String m142265d = AbstractC28254a.m142265d(str, m137214s());
            C16897a c16897a = (C16897a) this.f126510j.m149139d(m142265d);
            if (c16897a == null) {
                c16897a = m137215u(this.f126511k, m142265d);
                if (c16897a == null) {
                    return str;
                }
                this.f126510j.m90432k(m142265d, c16897a);
            }
            str = new String(c16897a.f86043c);
            if (c16897a.f86041a < System.currentTimeMillis() / 1000) {
                this.f126510j.m149141f(m142265d);
                C16899c c16899c = this.f126511k;
                if (c16899c != null) {
                    try {
                        c16899c.m90397Q(m137185B(m142265d));
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public void m137213p() {
        try {
            this.f126501a.m139599q();
            C16900d c16900d = this.f126502b;
            if (c16900d != null) {
                c16900d.m149138c();
                this.f126502b = null;
            }
            C16900d c16900d2 = this.f126503c;
            if (c16900d2 != null) {
                c16900d2.m149138c();
                this.f126503c = null;
            }
            C16900d c16900d3 = this.f126505e;
            if (c16900d3 != null) {
                c16900d3.m149138c();
                this.f126505e = null;
            }
            C16900d c16900d4 = this.f126504d;
            if (c16900d4 != null) {
                c16900d4.m149138c();
                this.f126504d = null;
            }
            C16899c c16899c = this.f126507g;
            if (c16899c != null) {
                c16899c.close();
                this.f126507g = null;
            }
            C16899c c16899c2 = this.f126508h;
            if (c16899c2 != null) {
                c16899c2.close();
                this.f126508h = null;
            }
            C16899c c16899c3 = this.f126506f;
            if (c16899c3 != null) {
                c16899c3.close();
                this.f126506f = null;
            }
            C16899c c16899c4 = this.f126509i;
            if (c16899c4 != null) {
                c16899c4.close();
                this.f126509i = null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: s */
    public C16898b m137214s() {
        C16898b c16898b = this.f126517q;
        if (c16898b == null) {
            return C16898b.f86045D;
        }
        return c16898b;
    }

    /* renamed from: u */
    public C16897a m137215u(C16899c c16899c, String str) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c16899c != null && !c16899c.isClosed()) {
            try {
                C16899c.e m90395F = c16899c.m90395F(m137185B(str));
                if (m90395F == null) {
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) m90395F.m90423b(0));
                if (c16899c.m90396G()) {
                    inputStream = new GZIPInputStream(m90395F.m90422a(0));
                } else {
                    inputStream = m90395F.m90422a(0);
                }
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    C16897a m90360a = C16897a.m90360a(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                    try {
                        inputStream.close();
                    } catch (Exception unused) {
                    }
                    return m90360a;
                } catch (Exception unused2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    inputStream2 = inputStream;
                    th = th2;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    /* renamed from: v */
    public h m137216v() {
        long j11;
        C16900d c16900d = this.f126502b;
        long j12 = 0;
        if (c16900d != null) {
            j11 = c16900d.m90434m();
        } else {
            j11 = 0;
        }
        C16900d c16900d2 = this.f126503c;
        if (c16900d2 != null) {
            j11 += c16900d2.m90434m();
        }
        C16900d c16900d3 = this.f126505e;
        if (c16900d3 != null) {
            j11 += c16900d3.m90434m();
        }
        C16900d c16900d4 = this.f126504d;
        if (c16900d4 != null) {
            j11 += c16900d4.m90434m();
        }
        C16899c c16899c = this.f126507g;
        if (c16899c != null) {
            j12 = c16899c.m90398T();
        }
        C16899c c16899c2 = this.f126508h;
        if (c16899c2 != null) {
            j12 += c16899c2.m90398T();
        }
        C16899c c16899c3 = this.f126506f;
        if (c16899c3 != null) {
            j12 += c16899c3.m90398T();
        }
        C16899c c16899c4 = this.f126509i;
        if (c16899c4 != null) {
            j12 += c16899c4.m90398T();
        }
        h hVar = this.f126518r;
        hVar.f126549h = j11;
        hVar.f126550i = j12;
        return hVar;
    }

    /* renamed from: w */
    public WebResourceResponse m137217w(WebResourceRequest webResourceRequest, Context context) {
        if ("GET".equalsIgnoreCase(webResourceRequest.getMethod())) {
            return m137218x(webResourceRequest.getUrl().toString(), context);
        }
        f fVar = this.f126520t;
        if (fVar != null) {
            fVar.mo137228a("IGNORE - WebResourceResponse: " + webResourceRequest.getUrl());
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c2 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:3:0x0001, B:5:0x001f, B:8:0x003e, B:11:0x00c2, B:13:0x00d0, B:15:0x00d6, B:17:0x00da, B:18:0x00f8, B:19:0x00ff, B:20:0x011d, B:22:0x0123, B:24:0x012b, B:25:0x012f, B:27:0x014f, B:28:0x0154, B:30:0x0160, B:33:0x0175, B:37:0x0181, B:38:0x0196, B:40:0x0047, B:42:0x0056, B:43:0x005d, B:45:0x0071, B:47:0x0087, B:49:0x0090, B:51:0x0096, B:53:0x009d, B:55:0x00ac, B:57:0x00b6), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0175 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:3:0x0001, B:5:0x001f, B:8:0x003e, B:11:0x00c2, B:13:0x00d0, B:15:0x00d6, B:17:0x00da, B:18:0x00f8, B:19:0x00ff, B:20:0x011d, B:22:0x0123, B:24:0x012b, B:25:0x012f, B:27:0x014f, B:28:0x0154, B:30:0x0160, B:33:0x0175, B:37:0x0181, B:38:0x0196, B:40:0x0047, B:42:0x0056, B:43:0x005d, B:45:0x0071, B:47:0x0087, B:49:0x0090, B:51:0x0096, B:53:0x009d, B:55:0x00ac, B:57:0x00b6), top: B:2:0x0001 }] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebResourceResponse m137218x(String str, Context context) {
        boolean m90368g;
        String m142265d;
        C16900d c16900d;
        C16897a c16897a;
        C16900d c16900d2;
        C16897a c16897a2;
        C16899c c16899c;
        try {
            m90368g = this.f126517q.m90368g(str);
            m142265d = AbstractC28254a.m142265d(str, m137214s());
            if (this.f126512l.containsKey(Integer.valueOf(m142265d.hashCode()))) {
                c16900d = (C16900d) this.f126512l.get(Integer.valueOf(m142265d.hashCode()));
                c16897a = (C16897a) c16900d.m149139d(m142265d);
            } else {
                c16900d = null;
                c16897a = null;
            }
        } catch (Exception unused) {
            f fVar = this.f126520t;
            if (fVar != null) {
                fVar.mo137228a("GET - FALSE (exception): " + str);
            }
        }
        if (c16897a != null) {
            this.f126518r.f126545d++;
        } else {
            this.f126512l.remove(Integer.valueOf(m142265d.hashCode()));
            if (m90368g) {
                this.f126518r.f126546e++;
            }
            String m137185B = m137185B(m142265d);
            if (this.f126513m.containsKey(Integer.valueOf(m137185B.hashCode()))) {
                C16899c c16899c2 = (C16899c) this.f126513m.get(Integer.valueOf(m137185B.hashCode()));
                C16897a m137215u = m137215u(c16899c2, m142265d);
                if (m137215u != null) {
                    this.f126518r.f126547f++;
                    if (c16900d == null) {
                        c16900d = m137186C(c16899c2);
                    }
                    if (c16900d != null) {
                        c16900d.m90432k(m142265d, m137215u);
                    }
                } else {
                    this.f126513m.remove(Integer.valueOf(m137185B.hashCode()));
                    if (m90368g) {
                        this.f126518r.f126548g++;
                    }
                }
                c16900d2 = c16900d;
                c16897a2 = m137215u;
                c16899c = c16899c2;
                if (c16897a2 == null) {
                    if (c16897a2.f86041a < System.currentTimeMillis() / 1000) {
                        int m137202t = m137202t(m142265d);
                        if (m137202t > 0) {
                            f fVar2 = this.f126520t;
                            if (fVar2 != null) {
                                fVar2.mo137228a("Revalidate: " + m142265d + " - " + c16897a2.f86041a);
                            }
                            m137200q(m142265d, c16900d2, c16899c, c16897a2.f86044d, m137202t);
                        } else {
                            this.f126512l.remove(Integer.valueOf(m142265d.hashCode()));
                            this.f126513m.remove(Integer.valueOf(m137185B(m142265d).hashCode()));
                        }
                    }
                    h hVar = this.f126518r;
                    if (!hVar.f126552k && str.equals(hVar.f126551j)) {
                        this.f126518r.f126552k = true;
                    }
                    this.f126518r.f126554m.addAndGet(c16897a2.f86043c.length);
                    WebResourceResponse webResourceResponse = new WebResourceResponse(c16897a2.f86042b, "UTF-8", new ByteArrayInputStream(c16897a2.f86043c));
                    Map<String, String> responseHeaders = webResourceResponse.getResponseHeaders();
                    if (responseHeaders == null) {
                        responseHeaders = new HashMap<>();
                    }
                    responseHeaders.putAll(f126500z);
                    webResourceResponse.setResponseHeaders(responseHeaders);
                    f fVar3 = this.f126520t;
                    if (fVar3 != null) {
                        fVar3.mo137228a("GET - DONE: " + str);
                    }
                    return webResourceResponse;
                }
                boolean m137203z = m137203z(m142265d, context);
                f fVar4 = this.f126520t;
                if (fVar4 != null && m137203z) {
                    if (m137203z) {
                        fVar4.mo137228a("GET - FALSE (downloading):  " + m142265d);
                    } else {
                        fVar4.mo137228a("GET - FALSE: " + m142265d);
                    }
                }
                return null;
            }
            if (m90368g) {
                this.f126518r.f126548g++;
            }
        }
        c16899c = null;
        c16900d2 = c16900d;
        c16897a2 = c16897a;
        if (c16897a2 == null) {
        }
    }

    /* renamed from: y */
    public void m137219y(String str, e eVar, AbstractC26695a abstractC26695a, Context context) {
        String m142265d = AbstractC28254a.m142265d(str, m137214s());
        if (this.f126502b == null && this.f126507g == null) {
            f fVar = this.f126520t;
            if (fVar != null) {
                fVar.mo137228a(String.format("PRELOAD - IGNORE (env): %s", m142265d));
                return;
            }
            return;
        }
        if (!m137214s().m90369h(m142265d)) {
            f fVar2 = this.f126520t;
            if (fVar2 != null) {
                fVar2.mo137228a(String.format("PRELOAD - IGNORE (config): %s", m142265d));
                return;
            }
            return;
        }
        if (this.f126514n.containsKey(m142265d)) {
            f fVar3 = this.f126520t;
            if (fVar3 != null) {
                fVar3.mo137228a(String.format("PRELOAD - DONE (downloading): %s", m142265d));
                return;
            }
            return;
        }
        if (!this.f126512l.containsKey(Integer.valueOf(m142265d.hashCode())) && !this.f126513m.containsKey(Integer.valueOf(m137185B(m142265d).hashCode()))) {
            String m142265d2 = AbstractC28254a.m142265d(m137212n(m142265d), m137214s());
            if (!m142265d2.equals(m142265d) && (this.f126512l.containsKey(Integer.valueOf(m142265d2.hashCode())) || this.f126513m.containsKey(Integer.valueOf(m137185B(m142265d2).hashCode())))) {
                f fVar4 = this.f126520t;
                if (fVar4 != null) {
                    fVar4.mo137228a(String.format("PRELOAD - DONE (cached - redirected): %s", m142265d));
                }
                if (eVar != null) {
                    eVar.mo137227c(str, 100, true);
                    return;
                }
                return;
            }
            f fVar5 = this.f126520t;
            if (fVar5 != null) {
                fVar5.mo137228a(String.format("Start download: %s", m142265d));
            }
            if (eVar != null) {
                eVar.mo137226b(str);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                this.f126514n.put(m142265d, Boolean.TRUE);
                this.f126501a.m139597h(m142265d, m137187E(m142265d), new c(eVar, str, m142265d, byteArrayOutputStream, context));
                return;
            } catch (Exception e11) {
                this.f126514n.remove(m142265d);
                if (eVar != null) {
                    eVar.mo137225a(m142265d);
                }
                f fVar6 = this.f126520t;
                if (fVar6 != null) {
                    fVar6.mo137228a(String.format("PRELOAD - ERROR: %s \n Msg: %s", m142265d, e11.toString()));
                    return;
                }
                return;
            }
        }
        f fVar7 = this.f126520t;
        if (fVar7 != null) {
            fVar7.mo137228a(String.format("PRELOAD - DONE (cached): %s", m142265d));
        }
        if (eVar != null) {
            eVar.mo137227c(str, 100, true);
        }
    }

    /* renamed from: th0.d$a */
    /* loaded from: classes7.dex */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            AbstractC26698d.this.f126518r.f126544c = System.currentTimeMillis();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            AbstractC26698d.this.f126518r.f126542a = System.currentTimeMillis();
            webView.setTag(Boolean.FALSE);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            AbstractC26698d abstractC26698d = AbstractC26698d.this;
            if (abstractC26698d.f126517q.m90369h(abstractC26698d.f126518r.f126551j)) {
                return AbstractC26698d.this.m137217w(webResourceRequest, webView.getContext());
            }
            return null;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            AbstractC26698d.this.m137204D(str);
            AbstractC26698d abstractC26698d = AbstractC26698d.this;
            if (abstractC26698d.f126517q.f86047B) {
                abstractC26698d.m137210l();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            AbstractC26698d abstractC26698d = AbstractC26698d.this;
            if (abstractC26698d.f126517q.m90369h(abstractC26698d.f126518r.f126551j)) {
                return AbstractC26698d.this.m137218x(str, webView.getContext());
            }
            return null;
        }
    }
}
