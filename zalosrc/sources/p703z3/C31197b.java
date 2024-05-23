package p703z3;

import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;
import p540u8.InterfaceC27097a;
import p540u8.InterfaceC27098b;

/* renamed from: z3.b */
/* loaded from: classes.dex */
public final class C31197b implements InterfaceC27097a {

    /* renamed from: a */
    public static final InterfaceC27097a f144061a = new C31197b();

    /* renamed from: z3.b$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC26584c {

        /* renamed from: a */
        static final a f144062a = new a();

        /* renamed from: b */
        private static final C26583b f144063b = C26583b.m136510d("sdkVersion");

        /* renamed from: c */
        private static final C26583b f144064c = C26583b.m136510d("model");

        /* renamed from: d */
        private static final C26583b f144065d = C26583b.m136510d("hardware");

        /* renamed from: e */
        private static final C26583b f144066e = C26583b.m136510d("device");

        /* renamed from: f */
        private static final C26583b f144067f = C26583b.m136510d("product");

        /* renamed from: g */
        private static final C26583b f144068g = C26583b.m136510d("osBuild");

        /* renamed from: h */
        private static final C26583b f144069h = C26583b.m136510d("manufacturer");

        /* renamed from: i */
        private static final C26583b f144070i = C26583b.m136510d("fingerprint");

        /* renamed from: j */
        private static final C26583b f144071j = C26583b.m136510d("locale");

        /* renamed from: k */
        private static final C26583b f144072k = C26583b.m136510d("country");

        /* renamed from: l */
        private static final C26583b f144073l = C26583b.m136510d("mccMnc");

        /* renamed from: m */
        private static final C26583b f144074m = C26583b.m136510d("applicationBuild");

        private a() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b */
        public void mo480a(AbstractC31196a abstractC31196a, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f144063b, abstractC31196a.mo152015m());
            interfaceC26585d.mo671a(f144064c, abstractC31196a.mo152012j());
            interfaceC26585d.mo671a(f144065d, abstractC31196a.mo152008f());
            interfaceC26585d.mo671a(f144066e, abstractC31196a.mo152006d());
            interfaceC26585d.mo671a(f144067f, abstractC31196a.mo152014l());
            interfaceC26585d.mo671a(f144068g, abstractC31196a.mo152013k());
            interfaceC26585d.mo671a(f144069h, abstractC31196a.mo152010h());
            interfaceC26585d.mo671a(f144070i, abstractC31196a.mo152007e());
            interfaceC26585d.mo671a(f144071j, abstractC31196a.mo152009g());
            interfaceC26585d.mo671a(f144072k, abstractC31196a.mo152005c());
            interfaceC26585d.mo671a(f144073l, abstractC31196a.mo152011i());
            interfaceC26585d.mo671a(f144074m, abstractC31196a.mo152004b());
        }
    }

    /* renamed from: z3.b$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC26584c {

        /* renamed from: a */
        static final b f144075a = new b();

        /* renamed from: b */
        private static final C26583b f144076b = C26583b.m136510d("logRequest");

        private b() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b */
        public void mo480a(AbstractC31205j abstractC31205j, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f144076b, abstractC31205j.mo152035c());
        }
    }

    /* renamed from: z3.b$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC26584c {

        /* renamed from: a */
        static final c f144077a = new c();

        /* renamed from: b */
        private static final C26583b f144078b = C26583b.m136510d("clientType");

        /* renamed from: c */
        private static final C26583b f144079c = C26583b.m136510d("androidClientInfo");

        private c() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b */
        public void mo480a(AbstractC31206k abstractC31206k, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f144078b, abstractC31206k.mo152037c());
            interfaceC26585d.mo671a(f144079c, abstractC31206k.mo152036b());
        }
    }

    /* renamed from: z3.b$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC26584c {

        /* renamed from: a */
        static final d f144080a = new d();

        /* renamed from: b */
        private static final C26583b f144081b = C26583b.m136510d("eventTimeMs");

        /* renamed from: c */
        private static final C26583b f144082c = C26583b.m136510d("eventCode");

        /* renamed from: d */
        private static final C26583b f144083d = C26583b.m136510d("eventUptimeMs");

        /* renamed from: e */
        private static final C26583b f144084e = C26583b.m136510d("sourceExtension");

        /* renamed from: f */
        private static final C26583b f144085f = C26583b.m136510d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C26583b f144086g = C26583b.m136510d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C26583b f144087h = C26583b.m136510d("networkConnectionInfo");

        private d() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b */
        public void mo480a(AbstractC31207l abstractC31207l, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo672b(f144081b, abstractC31207l.mo152042c());
            interfaceC26585d.mo671a(f144082c, abstractC31207l.mo152041b());
            interfaceC26585d.mo672b(f144083d, abstractC31207l.mo152043d());
            interfaceC26585d.mo671a(f144084e, abstractC31207l.mo152045f());
            interfaceC26585d.mo671a(f144085f, abstractC31207l.mo152046g());
            interfaceC26585d.mo672b(f144086g, abstractC31207l.mo152047h());
            interfaceC26585d.mo671a(f144087h, abstractC31207l.mo152044e());
        }
    }

    /* renamed from: z3.b$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC26584c {

        /* renamed from: a */
        static final e f144088a = new e();

        /* renamed from: b */
        private static final C26583b f144089b = C26583b.m136510d("requestTimeMs");

        /* renamed from: c */
        private static final C26583b f144090c = C26583b.m136510d("requestUptimeMs");

        /* renamed from: d */
        private static final C26583b f144091d = C26583b.m136510d("clientInfo");

        /* renamed from: e */
        private static final C26583b f144092e = C26583b.m136510d("logSource");

        /* renamed from: f */
        private static final C26583b f144093f = C26583b.m136510d("logSourceName");

        /* renamed from: g */
        private static final C26583b f144094g = C26583b.m136510d("logEvent");

        /* renamed from: h */
        private static final C26583b f144095h = C26583b.m136510d("qosTier");

        private e() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b */
        public void mo480a(AbstractC31208m abstractC31208m, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo672b(f144089b, abstractC31208m.mo152061g());
            interfaceC26585d.mo672b(f144090c, abstractC31208m.mo152062h());
            interfaceC26585d.mo671a(f144091d, abstractC31208m.mo152056b());
            interfaceC26585d.mo671a(f144092e, abstractC31208m.mo152058d());
            interfaceC26585d.mo671a(f144093f, abstractC31208m.mo152059e());
            interfaceC26585d.mo671a(f144094g, abstractC31208m.mo152057c());
            interfaceC26585d.mo671a(f144095h, abstractC31208m.mo152060f());
        }
    }

    /* renamed from: z3.b$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC26584c {

        /* renamed from: a */
        static final f f144096a = new f();

        /* renamed from: b */
        private static final C26583b f144097b = C26583b.m136510d("networkType");

        /* renamed from: c */
        private static final C26583b f144098c = C26583b.m136510d("mobileSubtype");

        private f() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b */
        public void mo480a(AbstractC31210o abstractC31210o, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f144097b, abstractC31210o.mo152073c());
            interfaceC26585d.mo671a(f144098c, abstractC31210o.mo152072b());
        }
    }

    private C31197b() {
    }

    @Override // p540u8.InterfaceC27097a
    /* renamed from: a */
    public void mo479a(InterfaceC27098b interfaceC27098b) {
        b bVar = b.f144075a;
        interfaceC27098b.mo725a(AbstractC31205j.class, bVar);
        interfaceC27098b.mo725a(C31199d.class, bVar);
        e eVar = e.f144088a;
        interfaceC27098b.mo725a(AbstractC31208m.class, eVar);
        interfaceC27098b.mo725a(C31202g.class, eVar);
        c cVar = c.f144077a;
        interfaceC27098b.mo725a(AbstractC31206k.class, cVar);
        interfaceC27098b.mo725a(C31200e.class, cVar);
        a aVar = a.f144062a;
        interfaceC27098b.mo725a(AbstractC31196a.class, aVar);
        interfaceC27098b.mo725a(C31198c.class, aVar);
        d dVar = d.f144080a;
        interfaceC27098b.mo725a(AbstractC31207l.class, dVar);
        interfaceC27098b.mo725a(C31201f.class, dVar);
        f fVar = f.f144096a;
        interfaceC27098b.mo725a(AbstractC31210o.class, fVar);
        interfaceC27098b.mo725a(C31204i.class, fVar);
    }
}
