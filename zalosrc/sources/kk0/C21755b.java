package kk0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import java.lang.ref.WeakReference;
import kk0.InterfaceC21754a;
import lk0.C22503a;
import nk0.C23833j;
import ok0.InterfaceC24290g;
import pj0.InterfaceC24775a;

/* renamed from: kk0.b */
/* loaded from: classes.dex */
public final class C21755b {
    public static final a Companion = new a(null);

    /* renamed from: e */
    private static C21755b f105634e;

    /* renamed from: a */
    private final InterfaceC21756c f105635a;

    /* renamed from: b */
    private final InterfaceC24290g f105636b;

    /* renamed from: c */
    private WeakReference f105637c;

    /* renamed from: d */
    private C22503a f105638d;

    /* renamed from: kk0.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21755b m112232a() {
            C21755b c21755b = C21755b.f105634e;
            if (c21755b != null) {
                return c21755b;
            }
            throw new Exception("ZinstantAudioManager must call init() first");
        }

        /* renamed from: b */
        public final void m112233b(InterfaceC21756c interfaceC21756c, InterfaceC24290g interfaceC24290g) {
            AbstractC19074t.m100208f(interfaceC21756c, "zinstantAudioRequest");
            AbstractC19074t.m100208f(interfaceC24290g, "resourceLoader");
            C21755b.f105634e = new C21755b(interfaceC21756c, interfaceC24290g);
        }
    }

    /* renamed from: kk0.b$b */
    /* loaded from: classes7.dex */
    public static final class b implements InterfaceC21754a {

        /* renamed from: b */
        final /* synthetic */ String f105640b;

        b(String str) {
            this.f105640b = str;
        }

        @Override // kk0.InterfaceC21754a
        /* renamed from: a */
        public void mo112210a(int i11, int i12) {
            C23833j c23833j;
            C21755b c21755b = C21755b.this;
            String str = this.f105640b;
            WeakReference weakReference = c21755b.f105637c;
            if (weakReference != null) {
                c23833j = (C23833j) weakReference.get();
            } else {
                c23833j = null;
            }
            C22503a c22503a = c21755b.f105638d;
            if (c23833j != null && c22503a != null && AbstractC19074t.m100204b(c22503a.m116348a(), str)) {
                c23833j.m124584w2(i11, i12);
            }
        }

        @Override // kk0.InterfaceC21754a
        /* renamed from: b */
        public void mo112211b() {
            C23833j c23833j;
            C21755b c21755b = C21755b.this;
            String str = this.f105640b;
            WeakReference weakReference = c21755b.f105637c;
            if (weakReference != null) {
                c23833j = (C23833j) weakReference.get();
            } else {
                c23833j = null;
            }
            C22503a c22503a = c21755b.f105638d;
            if (c23833j != null && c22503a != null && AbstractC19074t.m100204b(c22503a.m116348a(), str)) {
                c23833j.m124581o2();
                c21755b.m112228o();
            }
        }

        @Override // kk0.InterfaceC21754a
        /* renamed from: c */
        public void mo112212c(Exception exc) {
            C23833j c23833j;
            AbstractC19074t.m100208f(exc, "exception");
            C21755b c21755b = C21755b.this;
            String str = this.f105640b;
            WeakReference weakReference = c21755b.f105637c;
            if (weakReference != null) {
                c23833j = (C23833j) weakReference.get();
            } else {
                c23833j = null;
            }
            C22503a c22503a = c21755b.f105638d;
            if (c23833j != null && c22503a != null && AbstractC19074t.m100204b(c22503a.m116348a(), str)) {
                c21755b.m112225k(c23833j, 300, exc.getMessage());
                c21755b.m112228o();
            }
        }

        @Override // kk0.InterfaceC21754a
        /* renamed from: d */
        public void mo112213d(int i11) {
            C23833j c23833j;
            C21755b c21755b = C21755b.this;
            String str = this.f105640b;
            WeakReference weakReference = c21755b.f105637c;
            if (weakReference != null) {
                c23833j = (C23833j) weakReference.get();
            } else {
                c23833j = null;
            }
            C22503a c22503a = c21755b.f105638d;
            if (c23833j != null && c22503a != null && AbstractC19074t.m100204b(c22503a.m116348a(), str)) {
                c23833j.m124585y2(i11);
                c23833j.m124583t2();
            }
        }

        @Override // kk0.InterfaceC21754a
        public void onPause() {
            C23833j c23833j;
            C21755b c21755b = C21755b.this;
            String str = this.f105640b;
            WeakReference weakReference = c21755b.f105637c;
            if (weakReference != null) {
                c23833j = (C23833j) weakReference.get();
            } else {
                c23833j = null;
            }
            C22503a c22503a = c21755b.f105638d;
            if (c23833j != null && c22503a != null && AbstractC19074t.m100204b(c22503a.m116348a(), str)) {
                c23833j.onPause();
            }
        }

        @Override // kk0.InterfaceC21754a
        public void onProgressChanged(int i11) {
            InterfaceC21754a.a.m112214a(this, i11);
        }
    }

    /* renamed from: kk0.b$c */
    /* loaded from: classes7.dex */
    public static final class c implements InterfaceC24775a {

        /* renamed from: b */
        final /* synthetic */ C23833j f105642b;

        /* renamed from: c */
        final /* synthetic */ String f105643c;

        /* renamed from: d */
        final /* synthetic */ C22503a f105644d;

        /* renamed from: e */
        final /* synthetic */ int f105645e;

        /* renamed from: f */
        final /* synthetic */ boolean f105646f;

        c(C23833j c23833j, String str, C22503a c22503a, int i11, boolean z11) {
            this.f105642b = c23833j;
            this.f105643c = str;
            this.f105644d = c22503a;
            this.f105645e = i11;
            this.f105646f = z11;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a */
        public void onSuccess(File file) {
            AbstractC19074t.m100208f(file, "result");
            C21755b c21755b = C21755b.this;
            C23833j c23833j = this.f105642b;
            String str = this.f105643c;
            C22503a c22503a = this.f105644d;
            int i11 = this.f105645e;
            boolean z11 = this.f105646f;
            C23833j m112224j = c21755b.m112224j();
            C22503a c22503a2 = c21755b.f105638d;
            if (AbstractC19074t.m100204b(m112224j, c23833j) && c22503a2 != null && AbstractC19074t.m100204b(c22503a2.m116348a(), str)) {
                String path = file.getPath();
                AbstractC19074t.m100207e(path, "result.path");
                c22503a.m116349b(path);
                String path2 = file.getPath();
                AbstractC19074t.m100207e(path2, "result.path");
                c21755b.m112227m(path2, i11, z11);
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            C21755b c21755b = C21755b.this;
            C23833j c23833j = this.f105642b;
            String str = this.f105643c;
            C23833j m112224j = c21755b.m112224j();
            C22503a c22503a = c21755b.f105638d;
            if (AbstractC19074t.m100204b(m112224j, c23833j) && c22503a != null && AbstractC19074t.m100204b(c22503a.m116348a(), str)) {
                String message = exc.getMessage();
                if (message == null) {
                    message = "Download Audio resource error!";
                }
                c21755b.m112225k(c23833j, 200, message);
                c21755b.m112228o();
            }
            exc.printStackTrace();
        }
    }

    public C21755b(InterfaceC21756c interfaceC21756c, InterfaceC24290g interfaceC24290g) {
        AbstractC19074t.m100208f(interfaceC21756c, "zinstantAudioRequest");
        AbstractC19074t.m100208f(interfaceC24290g, "resourceLoader");
        this.f105635a = interfaceC21756c;
        this.f105636b = interfaceC24290g;
    }

    /* renamed from: i */
    private final void m112223i(String str, int i11, boolean z11) {
        this.f105635a.mo91758e(str, i11, z11, new b(str));
    }

    /* renamed from: j */
    public final C23833j m112224j() {
        WeakReference weakReference = this.f105637c;
        if (weakReference != null) {
            return (C23833j) weakReference.get();
        }
        return null;
    }

    /* renamed from: k */
    public final void m112225k(C23833j c23833j, int i11, String str) {
        if (str == null) {
            str = "";
        }
        c23833j.m124582q2(i11 + ": " + str);
    }

    /* renamed from: l */
    static /* synthetic */ void m112226l(C21755b c21755b, C23833j c23833j, int i11, String str, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str = null;
        }
        c21755b.m112225k(c23833j, i11, str);
    }

    /* renamed from: m */
    public final void m112227m(String str, int i11, boolean z11) {
        C23833j c23833j;
        C23833j m112224j = m112224j();
        if (m112224j != null && !m112224j.m131014X()) {
            WeakReference weakReference = this.f105637c;
            if (weakReference != null) {
                c23833j = (C23833j) weakReference.get();
            } else {
                c23833j = null;
            }
            C23833j c23833j2 = c23833j;
            C22503a c22503a = this.f105638d;
            if (c23833j2 != null && c22503a != null && AbstractC19074t.m100204b(c22503a.m116348a(), str)) {
                m112226l(this, c23833j2, 100, null, 4, null);
            }
            m112228o();
            return;
        }
        m112223i(str, i11, z11);
    }

    /* renamed from: o */
    public final void m112228o() {
        this.f105637c = null;
        this.f105638d = null;
    }

    /* renamed from: n */
    public final void m112229n(C23833j c23833j, String str, int i11, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(c23833j, "zinstantAudio");
        AbstractC19074t.m100208f(str, "src");
        C23833j m112224j = m112224j();
        if (m112224j != null) {
            m112231q(m112224j);
        }
        if (str.length() == 0) {
            c23833j.m124582q2("102");
            m112228o();
            return;
        }
        C22503a c22503a = new C22503a(str, i11, 0, z11);
        this.f105638d = c22503a;
        this.f105637c = new WeakReference(c23833j);
        if (z11) {
            m112227m(str, i11, z12);
        } else {
            this.f105636b.mo91897a(str, new c(c23833j, str, c22503a, i11, z12));
        }
    }

    /* renamed from: p */
    public final void m112230p(C23833j c23833j, int i11) {
        AbstractC19074t.m100208f(c23833j, "zinstantAudio");
        C22503a c22503a = this.f105638d;
        if (AbstractC19074t.m100204b(m112224j(), c23833j) && c22503a != null) {
            this.f105635a.mo91757d(c22503a.m116348a(), i11);
        }
    }

    /* renamed from: q */
    public final void m112231q(C23833j c23833j) {
        AbstractC19074t.m100208f(c23833j, "zinstantAudio");
        C22503a c22503a = this.f105638d;
        if (AbstractC19074t.m100204b(m112224j(), c23833j) && c22503a != null) {
            this.f105635a.mo91759f(c22503a.m116348a());
        }
    }
}
