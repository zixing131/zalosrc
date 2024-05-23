package p227i3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import com.adtima.AbstractC3876g;
import com.adtima.Adtima;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import p009a3.C0098c;
import p250j.C20894a;
import p313l3.AbstractC22011d;
import p410p.AbstractC24587a;
import p410p.AbstractC24588b;
import p467r.AbstractC25579b;
import p467r.C25578a;
import p467r.C25580c;
import p467r.C25581d;
import p467r.C25587j;
import p467r.C25588k;
import p467r.EnumC25583f;
import p467r.EnumC25584g;
import p467r.EnumC25585h;
import p467r.EnumC25586i;
import p498s.C26055a;
import p498s.C26057c;
import p498s.EnumC26056b;

/* renamed from: i3.m */
/* loaded from: classes2.dex */
public class C20209m {

    /* renamed from: f */
    private static C20209m f99905f;

    /* renamed from: a */
    private Context f99906a;

    /* renamed from: b */
    private C25587j f99907b = null;

    /* renamed from: c */
    private Handler f99908c = null;

    /* renamed from: d */
    private String f99909d = "vng";

    /* renamed from: e */
    private String f99910e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.m$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C20209m c20209m = C20209m.this;
            c20209m.f99910e = c20209m.m105419l();
        }
    }

    /* renamed from: i3.m$b */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a */
        private AbstractC25579b f99912a = null;

        /* renamed from: b */
        private C26055a f99913b = null;

        /* renamed from: c */
        private List f99914c;

        /* renamed from: d */
        private boolean f99915d;

        /* renamed from: e */
        private boolean f99916e;

        /* renamed from: f */
        private float f99917f;

        /* renamed from: i3.m$b$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ View f99919p;

            a(View view) {
                this.f99919p = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    ArrayList arrayList = new ArrayList();
                    if (b.this.f99914c == null || b.this.f99914c.size() == 0) {
                        return;
                    }
                    for (C20894a c20894a : b.this.f99914c) {
                        arrayList.add(C25588k.m132156b(c20894a.f102687a, new URL(c20894a.f102688b), c20894a.f102689c));
                    }
                    C25581d m132144b = C25581d.m132144b(C20209m.this.f99907b, C20209m.this.f99910e, arrayList, "", "");
                    EnumC25585h enumC25585h = EnumC25585h.BEGIN_TO_RENDER;
                    EnumC25583f enumC25583f = EnumC25583f.AUDIO;
                    EnumC25586i enumC25586i = EnumC25586i.NATIVE;
                    b.this.f99912a = AbstractC25579b.m132133a(C25580c.m132139a(enumC25583f, enumC25585h, enumC25586i, enumC25586i, false), m132144b);
                    if (this.f99919p != null) {
                        b.this.f99912a.mo132135c(this.f99919p);
                    }
                    C25578a m132129a = C25578a.m132129a(b.this.f99912a);
                    b bVar = b.this;
                    bVar.f99913b = C26055a.m134148a(bVar.f99912a);
                    C26057c m134160b = b.this.f99916e ? C26057c.m134160b(b.this.f99917f, b.this.f99915d, EnumC26056b.STANDALONE) : C26057c.m134161c(b.this.f99915d, EnumC26056b.STANDALONE);
                    b.this.f99912a.mo132138f();
                    m132129a.m132131c(m134160b);
                    m132129a.m132130b();
                } catch (Exception e11) {
                    Adtima.m18329e("OM-SDK", "startSession", e11);
                }
            }
        }

        /* renamed from: i3.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC32839b implements Runnable {

            /* renamed from: p */
            final /* synthetic */ float f99921p;

            /* renamed from: q */
            final /* synthetic */ float f99922q;

            RunnableC32839b(float f11, float f12) {
                this.f99921p = f11;
                this.f99922q = f12;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    b.this.f99913b.m134152d(this.f99921p, this.f99922q);
                } catch (Exception e11) {
                    Adtima.m18329e("OM-SDK", "audioStart", e11);
                }
            }
        }

        /* renamed from: i3.m$b$c */
        /* loaded from: classes2.dex */
        class c implements Runnable {

            /* renamed from: p */
            final /* synthetic */ int f99924p;

            c(int i11) {
                this.f99924p = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    switch (this.f99924p) {
                        case 1:
                            b.this.f99913b.m134153e();
                            break;
                        case 2:
                            b.this.f99913b.m134154g();
                            break;
                        case 3:
                            b.this.f99913b.m134159l();
                            break;
                        case 4:
                            b.this.f99913b.m134151b();
                            break;
                        case 5:
                            b.this.f99913b.m134156i();
                            break;
                        case 6:
                            b.this.f99913b.m134157j();
                            break;
                        case 7:
                            b.this.f99913b.m134158k();
                            break;
                        case 8:
                            b.this.f99913b.m134155h(0.0f);
                            break;
                        case 9:
                            b.this.f99913b.m134155h(1.0f);
                            break;
                    }
                } catch (Exception e11) {
                    Adtima.m18329e("OM-SDK", "audioEvent", e11);
                }
            }
        }

        public b(List list, boolean z11, boolean z12, float f11) {
            try {
                this.f99914c = list;
                this.f99915d = z11;
                this.f99916e = z12;
                this.f99917f = f11;
                C20209m.this.f99908c = new Handler(Looper.getMainLooper());
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "ZAdsAudioOMSession", e11);
            }
        }

        /* renamed from: d */
        public void m105430d() {
            try {
                AbstractC25579b abstractC25579b = this.f99912a;
                if (abstractC25579b != null) {
                    abstractC25579b.mo132137e();
                    this.f99912a.mo132134b();
                    this.f99912a = null;
                }
                this.f99913b = null;
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "destroyVideoAd", e11);
            }
        }

        /* renamed from: e */
        public void m105431e(float f11, float f12) {
            try {
                if (C20209m.this.f99908c == null) {
                    C20209m.this.f99908c = new Handler(Looper.getMainLooper());
                }
                C20209m.this.f99908c.post(new RunnableC32839b(f11, f12));
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "audioStart", e11);
            }
        }

        /* renamed from: f */
        public void m105432f(int i11) {
            try {
                if (C20209m.this.f99908c == null) {
                    C20209m.this.f99908c = new Handler(Looper.getMainLooper());
                }
                C20209m.this.f99908c.post(new c(i11));
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "audioEvent", e11);
            }
        }

        /* renamed from: g */
        public void m105433g(View view) {
            try {
                if (C20209m.this.f99908c == null) {
                    C20209m.this.f99908c = new Handler(Looper.getMainLooper());
                }
                C20209m.this.f99908c.post(new a(view));
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "startSession", e11);
            }
        }
    }

    /* renamed from: i3.m$c */
    /* loaded from: classes2.dex */
    public class c {

        /* renamed from: a */
        private AbstractC25579b f99926a = null;

        public c() {
        }

        /* renamed from: a */
        public String m105434a(String str) {
            try {
                return (C20209m.this.f99910e == null || C20209m.this.f99910e.length() == 0) ? str : AbstractC24588b.m128057a(C20209m.this.f99910e, str);
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "getHTMLAfterInjected", e11);
                return str;
            }
        }

        /* renamed from: b */
        public void m105435b() {
            try {
                AbstractC25579b abstractC25579b = this.f99926a;
                if (abstractC25579b != null) {
                    abstractC25579b.mo132137e();
                    this.f99926a.mo132134b();
                    this.f99926a = null;
                }
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "destroyHTMLAd", e11);
            }
        }

        /* renamed from: c */
        public void m105436c(WebView webView) {
            try {
                AbstractC25579b m132133a = AbstractC25579b.m132133a(C25580c.m132139a(EnumC25583f.HTML_DISPLAY, EnumC25585h.BEGIN_TO_RENDER, EnumC25586i.NATIVE, EnumC25586i.NONE, false), C25581d.m132143a(C20209m.this.f99907b, webView, null, null));
                this.f99926a = m132133a;
                m132133a.mo132135c(webView);
                this.f99926a.mo132138f();
                C25578a m132129a = C25578a.m132129a(this.f99926a);
                m132129a.m132132d();
                m132129a.m132130b();
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "startSessionHTML", e11);
            }
        }

        /* renamed from: d */
        public void m105437d(WebView webView, View view) {
            try {
                AbstractC25579b m132133a = AbstractC25579b.m132133a(C25580c.m132139a(EnumC25583f.HTML_DISPLAY, EnumC25585h.BEGIN_TO_RENDER, EnumC25586i.NATIVE, EnumC25586i.NONE, false), C25581d.m132143a(C20209m.this.f99907b, webView, null, null));
                this.f99926a = m132133a;
                m132133a.mo132136d(view, EnumC25584g.NOT_VISIBLE, null);
                this.f99926a.mo132135c(webView);
                this.f99926a.mo132138f();
                C25578a m132129a = C25578a.m132129a(this.f99926a);
                m132129a.m132132d();
                m132129a.m132130b();
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "startSessionHTML", e11);
            }
        }
    }

    /* renamed from: i3.m$d */
    /* loaded from: classes2.dex */
    public class d {

        /* renamed from: a */
        private AbstractC25579b f99928a = null;

        public d() {
        }

        /* renamed from: a */
        public String m105438a(String str) {
            try {
                return (C20209m.this.f99910e == null || C20209m.this.f99910e.length() == 0) ? str : AbstractC24588b.m128057a(C20209m.this.f99910e, str);
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "getAdInjected", e11);
                return str;
            }
        }

        /* renamed from: b */
        public void m105439b() {
            try {
                AbstractC25579b abstractC25579b = this.f99928a;
                if (abstractC25579b != null) {
                    abstractC25579b.mo132137e();
                    this.f99928a.mo132134b();
                    this.f99928a = null;
                }
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "destroyNativeAd", e11);
            }
        }

        /* renamed from: c */
        public void m105440c(WebView webView, C0098c c0098c) {
            if (c0098c != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C25588k.m132156b(c0098c.f536u0, new URL(c0098c.f538v0), c0098c.f534t0));
                    AbstractC25579b m132133a = AbstractC25579b.m132133a(C25580c.m132139a(EnumC25583f.NATIVE_DISPLAY, EnumC25585h.BEGIN_TO_RENDER, EnumC25586i.NATIVE, EnumC25586i.NONE, false), C25581d.m132144b(C20209m.this.f99907b, C20209m.this.f99910e, arrayList, "", ""));
                    this.f99928a = m132133a;
                    m132133a.mo132135c(webView);
                    this.f99928a.mo132138f();
                    C25578a m132129a = C25578a.m132129a(this.f99928a);
                    m132129a.m132132d();
                    m132129a.m132130b();
                } catch (Exception e11) {
                    Adtima.m18329e("OM-SDK", "startSession", e11);
                }
            }
        }
    }

    /* renamed from: i3.m$e */
    /* loaded from: classes2.dex */
    public class e {

        /* renamed from: a */
        private AbstractC25579b f99930a = null;

        /* renamed from: b */
        private C26055a f99931b = null;

        /* renamed from: c */
        private List f99932c;

        /* renamed from: d */
        private boolean f99933d;

        /* renamed from: e */
        private boolean f99934e;

        /* renamed from: f */
        private float f99935f;

        /* renamed from: i3.m$e$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ View f99937p;

            a(View view) {
                this.f99937p = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    ArrayList arrayList = new ArrayList();
                    if (e.this.f99932c == null || e.this.f99932c.size() == 0) {
                        return;
                    }
                    for (C20894a c20894a : e.this.f99932c) {
                        arrayList.add(C25588k.m132156b(c20894a.f102687a, new URL(c20894a.f102688b), c20894a.f102689c));
                    }
                    C25581d m132144b = C25581d.m132144b(C20209m.this.f99907b, C20209m.this.f99910e, arrayList, "", "");
                    EnumC25585h enumC25585h = EnumC25585h.BEGIN_TO_RENDER;
                    EnumC25583f enumC25583f = EnumC25583f.VIDEO;
                    EnumC25586i enumC25586i = EnumC25586i.NATIVE;
                    e.this.f99930a = AbstractC25579b.m132133a(C25580c.m132139a(enumC25583f, enumC25585h, enumC25586i, enumC25586i, false), m132144b);
                    if (this.f99937p != null) {
                        e.this.f99930a.mo132135c(this.f99937p);
                    }
                    C25578a m132129a = C25578a.m132129a(e.this.f99930a);
                    e eVar = e.this;
                    eVar.f99931b = C26055a.m134148a(eVar.f99930a);
                    C26057c m134160b = e.this.f99934e ? C26057c.m134160b(e.this.f99935f, e.this.f99933d, EnumC26056b.STANDALONE) : C26057c.m134161c(e.this.f99933d, EnumC26056b.STANDALONE);
                    e.this.f99930a.mo132138f();
                    m132129a.m132131c(m134160b);
                    m132129a.m132130b();
                } catch (Exception e11) {
                    Adtima.m18329e("OM-SDK", "startSession", e11);
                }
            }
        }

        /* renamed from: i3.m$e$b */
        /* loaded from: classes2.dex */
        class b implements Runnable {

            /* renamed from: p */
            final /* synthetic */ float f99939p;

            /* renamed from: q */
            final /* synthetic */ float f99940q;

            b(float f11, float f12) {
                this.f99939p = f11;
                this.f99940q = f12;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    e.this.f99931b.m134152d(this.f99939p, this.f99940q);
                } catch (Exception e11) {
                    Adtima.m18329e("OM-SDK", "videoStart", e11);
                }
            }
        }

        /* renamed from: i3.m$e$c */
        /* loaded from: classes2.dex */
        class c implements Runnable {

            /* renamed from: p */
            final /* synthetic */ int f99942p;

            c(int i11) {
                this.f99942p = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    switch (this.f99942p) {
                        case 1:
                            e.this.f99931b.m134153e();
                            break;
                        case 2:
                            e.this.f99931b.m134154g();
                            break;
                        case 3:
                            e.this.f99931b.m134159l();
                            break;
                        case 4:
                            e.this.f99931b.m134151b();
                            break;
                        case 5:
                            e.this.f99931b.m134156i();
                            break;
                        case 6:
                            e.this.f99931b.m134157j();
                            break;
                        case 7:
                            e.this.f99931b.m134158k();
                            break;
                        case 8:
                            e.this.f99931b.m134155h(0.0f);
                            break;
                        case 9:
                            e.this.f99931b.m134155h(1.0f);
                            break;
                    }
                } catch (Exception e11) {
                    Adtima.m18329e("OM-SDK", "videoEvent", e11);
                }
            }
        }

        public e(List list, boolean z11, boolean z12, float f11) {
            try {
                this.f99932c = list;
                this.f99933d = z11;
                this.f99934e = z12;
                this.f99935f = f11;
                C20209m.this.f99908c = new Handler(Looper.getMainLooper());
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "ZAdsVideoOMSession", e11);
            }
        }

        /* renamed from: d */
        public void m105449d() {
            try {
                AbstractC25579b abstractC25579b = this.f99930a;
                if (abstractC25579b != null) {
                    abstractC25579b.mo132137e();
                    this.f99930a.mo132134b();
                    this.f99930a = null;
                }
                this.f99931b = null;
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "destroyVideoAd", e11);
            }
        }

        /* renamed from: e */
        public void m105450e(float f11, float f12) {
            try {
                if (C20209m.this.f99908c == null) {
                    C20209m.this.f99908c = new Handler(Looper.getMainLooper());
                }
                C20209m.this.f99908c.post(new b(f11, f12));
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "videoStart", e11);
            }
        }

        /* renamed from: f */
        public void m105451f(int i11) {
            try {
                if (C20209m.this.f99908c == null) {
                    C20209m.this.f99908c = new Handler(Looper.getMainLooper());
                }
                C20209m.this.f99908c.post(new c(i11));
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "videoEvent", e11);
            }
        }

        /* renamed from: g */
        public void m105452g(View view) {
            try {
                if (C20209m.this.f99908c == null) {
                    C20209m.this.f99908c = new Handler(Looper.getMainLooper());
                }
                C20209m.this.f99908c.post(new a(view));
            } catch (Exception e11) {
                Adtima.m18329e("OM-SDK", "startSession", e11);
            }
        }
    }

    private C20209m(Context context) {
        try {
            this.f99906a = context;
        } catch (Exception e11) {
            Adtima.m18329e("OM-SDK", "ZAdsOMModel", e11);
        }
    }

    /* renamed from: c */
    public static C20209m m105408c(Context context) {
        if (f99905f == null) {
            f99905f = new C20209m(context);
        }
        return f99905f;
    }

    /* renamed from: i */
    private void m105412i() {
        try {
            new Handler().post(new a());
        } catch (Exception e11) {
            Adtima.m18329e("OM-SDK", "fetchJSContentAsync", e11);
        }
    }

    /* renamed from: n */
    private void m105414n() {
        try {
            String str = AbstractC20202f.f99837t;
            if (str != null) {
                this.f99909d = str;
            }
            this.f99907b = C25587j.m132153b(this.f99909d, AbstractC22011d.m114905f(this.f99906a));
        } catch (IllegalArgumentException e11) {
            Adtima.m18329e("OM-SDK", "identify", e11);
        }
    }

    /* renamed from: b */
    public b m105415b(List list, boolean z11, boolean z12, float f11) {
        try {
            return new b(list, z11, z12, f11);
        } catch (Exception e11) {
            Adtima.m18329e("OM-SDK", "getAudioSession", e11);
            return null;
        }
    }

    /* renamed from: f */
    public void m105416f() {
        try {
            AbstractC24587a.m128055a(this.f99906a);
        } catch (Exception e11) {
            Adtima.m18329e("OM-SDK", "activate", e11);
        }
    }

    /* renamed from: h */
    public e m105417h(List list, boolean z11, boolean z12, float f11) {
        try {
            return new e(list, z11, z12, f11);
        } catch (Exception e11) {
            Adtima.m18329e("OM-SDK", "getVideoSession", e11);
            return null;
        }
    }

    /* renamed from: j */
    public c m105418j() {
        try {
            return new c();
        } catch (Exception e11) {
            Adtima.m18329e("OM-SDK", "getSession", e11);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|2|3|4|(4:5|6|(2:7|(1:9)(1:10))|11)|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:            r3 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:            com.adtima.Adtima.m18329e("OM-SDK", "getOmidJs", r3);     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m105419l() {
        InputStream inputStream;
        Throwable th2;
        String str = null;
        try {
            inputStream = this.f99906a.getResources().openRawResource(AbstractC3876g.omsdk_v1);
        } catch (Exception e11) {
            e = e11;
            inputStream = null;
        } catch (Throwable th3) {
            inputStream = null;
            th2 = th3;
            try {
                inputStream.close();
            } catch (Exception e12) {
                Adtima.m18329e("OM-SDK", "getOmidJs", e12);
            }
            throw th2;
        }
        try {
            try {
                byte[] bArr = new byte[1024];
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    sb2.append(new String(bArr, 0, read, "UTF-8"));
                }
                str = sb2.toString();
            } catch (Throwable th4) {
                th2 = th4;
                inputStream.close();
                throw th2;
            }
        } catch (Exception e13) {
            e = e13;
            Adtima.m18329e("OM-SDK", "getOmidJs", e);
            inputStream.close();
            return str;
        }
        inputStream.close();
        return str;
    }

    /* renamed from: m */
    public d m105420m() {
        try {
            return new d();
        } catch (Exception e11) {
            Adtima.m18329e("OM-SDK", "getSession", e11);
            return null;
        }
    }

    /* renamed from: o */
    public void m105421o() {
        try {
            m105416f();
            m105414n();
            m105412i();
        } catch (Exception e11) {
            Adtima.m18329e("OM-SDK", "init", e11);
        }
    }
}
