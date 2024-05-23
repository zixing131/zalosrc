package p292k8;

import androidx.appcompat.widget.AbstractC1158c0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import p292k8.AbstractC21569b0;
import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;
import p540u8.InterfaceC27097a;
import p540u8.InterfaceC27098b;

/* renamed from: k8.a */
/* loaded from: classes.dex */
public final class C21566a implements InterfaceC27097a {

    /* renamed from: a */
    public static final InterfaceC27097a f104596a = new C21566a();

    /* renamed from: k8.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC26584c {

        /* renamed from: a */
        static final a f104597a = new a();

        /* renamed from: b */
        private static final C26583b f104598b = C26583b.m136510d("arch");

        /* renamed from: c */
        private static final C26583b f104599c = C26583b.m136510d("libraryName");

        /* renamed from: d */
        private static final C26583b f104600d = C26583b.m136510d("buildId");

        private a() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.a.AbstractC32854a abstractC32854a, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104598b, abstractC32854a.mo111274b());
            interfaceC26585d.mo671a(f104599c, abstractC32854a.mo111276d());
            interfaceC26585d.mo671a(f104600d, abstractC32854a.mo111275c());
        }
    }

    /* renamed from: k8.a$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC26584c {

        /* renamed from: a */
        static final b f104601a = new b();

        /* renamed from: b */
        private static final C26583b f104602b = C26583b.m136510d("pid");

        /* renamed from: c */
        private static final C26583b f104603c = C26583b.m136510d("processName");

        /* renamed from: d */
        private static final C26583b f104604d = C26583b.m136510d("reasonCode");

        /* renamed from: e */
        private static final C26583b f104605e = C26583b.m136510d("importance");

        /* renamed from: f */
        private static final C26583b f104606f = C26583b.m136510d("pss");

        /* renamed from: g */
        private static final C26583b f104607g = C26583b.m136510d("rss");

        /* renamed from: h */
        private static final C26583b f104608h = C26583b.m136510d("timestamp");

        /* renamed from: i */
        private static final C26583b f104609i = C26583b.m136510d("traceFile");

        /* renamed from: j */
        private static final C26583b f104610j = C26583b.m136510d("buildIdMappingForArch");

        private b() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.a aVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo675e(f104602b, aVar.mo111266d());
            interfaceC26585d.mo671a(f104603c, aVar.mo111267e());
            interfaceC26585d.mo675e(f104604d, aVar.mo111269g());
            interfaceC26585d.mo675e(f104605e, aVar.mo111265c());
            interfaceC26585d.mo672b(f104606f, aVar.mo111268f());
            interfaceC26585d.mo672b(f104607g, aVar.mo111270h());
            interfaceC26585d.mo672b(f104608h, aVar.mo111271i());
            interfaceC26585d.mo671a(f104609i, aVar.mo111272j());
            interfaceC26585d.mo671a(f104610j, aVar.mo111264b());
        }
    }

    /* renamed from: k8.a$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC26584c {

        /* renamed from: a */
        static final c f104611a = new c();

        /* renamed from: b */
        private static final C26583b f104612b = C26583b.m136510d("key");

        /* renamed from: c */
        private static final C26583b f104613c = C26583b.m136510d("value");

        private c() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.c cVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104612b, cVar.mo111292b());
            interfaceC26585d.mo671a(f104613c, cVar.mo111293c());
        }
    }

    /* renamed from: k8.a$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC26584c {

        /* renamed from: a */
        static final d f104614a = new d();

        /* renamed from: b */
        private static final C26583b f104615b = C26583b.m136510d("sdkVersion");

        /* renamed from: c */
        private static final C26583b f104616c = C26583b.m136510d("gmpAppId");

        /* renamed from: d */
        private static final C26583b f104617d = C26583b.m136510d("platform");

        /* renamed from: e */
        private static final C26583b f104618e = C26583b.m136510d("installationUuid");

        /* renamed from: f */
        private static final C26583b f104619f = C26583b.m136510d("buildVersion");

        /* renamed from: g */
        private static final C26583b f104620g = C26583b.m136510d("displayVersion");

        /* renamed from: h */
        private static final C26583b f104621h = C26583b.m136510d("session");

        /* renamed from: i */
        private static final C26583b f104622i = C26583b.m136510d("ndkPayload");

        /* renamed from: j */
        private static final C26583b f104623j = C26583b.m136510d("appExitInfo");

        private d() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0 abstractC21569b0, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104615b, abstractC21569b0.mo111244j());
            interfaceC26585d.mo671a(f104616c, abstractC21569b0.mo111240f());
            interfaceC26585d.mo675e(f104617d, abstractC21569b0.mo111243i());
            interfaceC26585d.mo671a(f104618e, abstractC21569b0.mo111241g());
            interfaceC26585d.mo671a(f104619f, abstractC21569b0.mo111238d());
            interfaceC26585d.mo671a(f104620g, abstractC21569b0.mo111239e());
            interfaceC26585d.mo671a(f104621h, abstractC21569b0.mo111245k());
            interfaceC26585d.mo671a(f104622i, abstractC21569b0.mo111242h());
            interfaceC26585d.mo671a(f104623j, abstractC21569b0.mo111237c());
        }
    }

    /* renamed from: k8.a$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC26584c {

        /* renamed from: a */
        static final e f104624a = new e();

        /* renamed from: b */
        private static final C26583b f104625b = C26583b.m136510d("files");

        /* renamed from: c */
        private static final C26583b f104626c = C26583b.m136510d("orgId");

        private e() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.d dVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104625b, dVar.mo111298b());
            interfaceC26585d.mo671a(f104626c, dVar.mo111299c());
        }
    }

    /* renamed from: k8.a$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC26584c {

        /* renamed from: a */
        static final f f104627a = new f();

        /* renamed from: b */
        private static final C26583b f104628b = C26583b.m136510d("filename");

        /* renamed from: c */
        private static final C26583b f104629c = C26583b.m136510d("contents");

        private f() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.d.b bVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104628b, bVar.mo111305c());
            interfaceC26585d.mo671a(f104629c, bVar.mo111304b());
        }
    }

    /* renamed from: k8.a$g */
    /* loaded from: classes.dex */
    private static final class g implements InterfaceC26584c {

        /* renamed from: a */
        static final g f104630a = new g();

        /* renamed from: b */
        private static final C26583b f104631b = C26583b.m136510d("identifier");

        /* renamed from: c */
        private static final C26583b f104632c = C26583b.m136510d("version");

        /* renamed from: d */
        private static final C26583b f104633d = C26583b.m136510d("displayVersion");

        /* renamed from: e */
        private static final C26583b f104634e = C26583b.m136510d("organization");

        /* renamed from: f */
        private static final C26583b f104635f = C26583b.m136510d("installationUuid");

        /* renamed from: g */
        private static final C26583b f104636g = C26583b.m136510d("developmentPlatform");

        /* renamed from: h */
        private static final C26583b f104637h = C26583b.m136510d("developmentPlatformVersion");

        private g() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.a aVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104631b, aVar.mo111329e());
            interfaceC26585d.mo671a(f104632c, aVar.mo111332h());
            interfaceC26585d.mo671a(f104633d, aVar.mo111328d());
            C26583b c26583b = f104634e;
            aVar.mo111331g();
            interfaceC26585d.mo671a(c26583b, null);
            interfaceC26585d.mo671a(f104635f, aVar.mo111330f());
            interfaceC26585d.mo671a(f104636g, aVar.mo111326b());
            interfaceC26585d.mo671a(f104637h, aVar.mo111327c());
        }
    }

    /* renamed from: k8.a$h */
    /* loaded from: classes.dex */
    private static final class h implements InterfaceC26584c {

        /* renamed from: a */
        static final h f104638a = new h();

        /* renamed from: b */
        private static final C26583b f104639b = C26583b.m136510d("clsId");

        private h() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
            AbstractC1158c0.m5500a(obj);
            m111219b(null, (InterfaceC26585d) obj2);
        }

        /* renamed from: b */
        public void m111219b(AbstractC21569b0.e.a.b bVar, InterfaceC26585d interfaceC26585d) {
            throw null;
        }
    }

    /* renamed from: k8.a$i */
    /* loaded from: classes.dex */
    private static final class i implements InterfaceC26584c {

        /* renamed from: a */
        static final i f104640a = new i();

        /* renamed from: b */
        private static final C26583b f104641b = C26583b.m136510d("arch");

        /* renamed from: c */
        private static final C26583b f104642c = C26583b.m136510d("model");

        /* renamed from: d */
        private static final C26583b f104643d = C26583b.m136510d("cores");

        /* renamed from: e */
        private static final C26583b f104644e = C26583b.m136510d("ram");

        /* renamed from: f */
        private static final C26583b f104645f = C26583b.m136510d("diskSpace");

        /* renamed from: g */
        private static final C26583b f104646g = C26583b.m136510d("simulator");

        /* renamed from: h */
        private static final C26583b f104647h = C26583b.m136510d("state");

        /* renamed from: i */
        private static final C26583b f104648i = C26583b.m136510d("manufacturer");

        /* renamed from: j */
        private static final C26583b f104649j = C26583b.m136510d("modelClass");

        private i() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.c cVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo675e(f104641b, cVar.mo111354b());
            interfaceC26585d.mo671a(f104642c, cVar.mo111358f());
            interfaceC26585d.mo675e(f104643d, cVar.mo111355c());
            interfaceC26585d.mo672b(f104644e, cVar.mo111360h());
            interfaceC26585d.mo672b(f104645f, cVar.mo111356d());
            interfaceC26585d.mo673c(f104646g, cVar.mo111362j());
            interfaceC26585d.mo675e(f104647h, cVar.mo111361i());
            interfaceC26585d.mo671a(f104648i, cVar.mo111357e());
            interfaceC26585d.mo671a(f104649j, cVar.mo111359g());
        }
    }

    /* renamed from: k8.a$j */
    /* loaded from: classes.dex */
    private static final class j implements InterfaceC26584c {

        /* renamed from: a */
        static final j f104650a = new j();

        /* renamed from: b */
        private static final C26583b f104651b = C26583b.m136510d("generator");

        /* renamed from: c */
        private static final C26583b f104652c = C26583b.m136510d("identifier");

        /* renamed from: d */
        private static final C26583b f104653d = C26583b.m136510d("startedAt");

        /* renamed from: e */
        private static final C26583b f104654e = C26583b.m136510d("endedAt");

        /* renamed from: f */
        private static final C26583b f104655f = C26583b.m136510d("crashed");

        /* renamed from: g */
        private static final C26583b f104656g = C26583b.m136510d("app");

        /* renamed from: h */
        private static final C26583b f104657h = C26583b.m136510d("user");

        /* renamed from: i */
        private static final C26583b f104658i = C26583b.m136510d("os");

        /* renamed from: j */
        private static final C26583b f104659j = C26583b.m136510d("device");

        /* renamed from: k */
        private static final C26583b f104660k = C26583b.m136510d("events");

        /* renamed from: l */
        private static final C26583b f104661l = C26583b.m136510d("generatorType");

        private j() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e eVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104651b, eVar.mo111314f());
            interfaceC26585d.mo671a(f104652c, eVar.m111317i());
            interfaceC26585d.mo672b(f104653d, eVar.mo111319k());
            interfaceC26585d.mo671a(f104654e, eVar.mo111312d());
            interfaceC26585d.mo673c(f104655f, eVar.mo111321m());
            interfaceC26585d.mo671a(f104656g, eVar.mo111310b());
            interfaceC26585d.mo671a(f104657h, eVar.mo111320l());
            interfaceC26585d.mo671a(f104658i, eVar.mo111318j());
            interfaceC26585d.mo671a(f104659j, eVar.mo111311c());
            interfaceC26585d.mo671a(f104660k, eVar.mo111313e());
            interfaceC26585d.mo675e(f104661l, eVar.mo111315g());
        }
    }

    /* renamed from: k8.a$k */
    /* loaded from: classes.dex */
    private static final class k implements InterfaceC26584c {

        /* renamed from: a */
        static final k f104662a = new k();

        /* renamed from: b */
        private static final C26583b f104663b = C26583b.m136510d("execution");

        /* renamed from: c */
        private static final C26583b f104664c = C26583b.m136510d("customAttributes");

        /* renamed from: d */
        private static final C26583b f104665d = C26583b.m136510d("internalKeys");

        /* renamed from: e */
        private static final C26583b f104666e = C26583b.m136510d("background");

        /* renamed from: f */
        private static final C26583b f104667f = C26583b.m136510d("uiOrientation");

        private k() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.d.a aVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104663b, aVar.mo111383d());
            interfaceC26585d.mo671a(f104664c, aVar.mo111382c());
            interfaceC26585d.mo671a(f104665d, aVar.mo111384e());
            interfaceC26585d.mo671a(f104666e, aVar.mo111381b());
            interfaceC26585d.mo675e(f104667f, aVar.mo111385f());
        }
    }

    /* renamed from: k8.a$l */
    /* loaded from: classes.dex */
    private static final class l implements InterfaceC26584c {

        /* renamed from: a */
        static final l f104668a = new l();

        /* renamed from: b */
        private static final C26583b f104669b = C26583b.m136510d("baseAddress");

        /* renamed from: c */
        private static final C26583b f104670c = C26583b.m136510d("size");

        /* renamed from: d */
        private static final C26583b f104671d = C26583b.m136510d("name");

        /* renamed from: e */
        private static final C26583b f104672e = C26583b.m136510d("uuid");

        private l() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.d.a.b.AbstractC32858a abstractC32858a, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo672b(f104669b, abstractC32858a.mo111400b());
            interfaceC26585d.mo672b(f104670c, abstractC32858a.mo111402d());
            interfaceC26585d.mo671a(f104671d, abstractC32858a.mo111401c());
            interfaceC26585d.mo671a(f104672e, abstractC32858a.m111404f());
        }
    }

    /* renamed from: k8.a$m */
    /* loaded from: classes.dex */
    private static final class m implements InterfaceC26584c {

        /* renamed from: a */
        static final m f104673a = new m();

        /* renamed from: b */
        private static final C26583b f104674b = C26583b.m136510d("threads");

        /* renamed from: c */
        private static final C26583b f104675c = C26583b.m136510d("exception");

        /* renamed from: d */
        private static final C26583b f104676d = C26583b.m136510d("appExitInfo");

        /* renamed from: e */
        private static final C26583b f104677e = C26583b.m136510d("signal");

        /* renamed from: f */
        private static final C26583b f104678f = C26583b.m136510d("binaries");

        private m() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.d.a.b bVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104674b, bVar.mo111398f());
            interfaceC26585d.mo671a(f104675c, bVar.mo111396d());
            interfaceC26585d.mo671a(f104676d, bVar.mo111394b());
            interfaceC26585d.mo671a(f104677e, bVar.mo111397e());
            interfaceC26585d.mo671a(f104678f, bVar.mo111395c());
        }
    }

    /* renamed from: k8.a$n */
    /* loaded from: classes.dex */
    private static final class n implements InterfaceC26584c {

        /* renamed from: a */
        static final n f104679a = new n();

        /* renamed from: b */
        private static final C26583b f104680b = C26583b.m136510d(ZinstantMetaConstant.IMPRESSION_META_TYPE);

        /* renamed from: c */
        private static final C26583b f104681c = C26583b.m136510d("reason");

        /* renamed from: d */
        private static final C26583b f104682d = C26583b.m136510d("frames");

        /* renamed from: e */
        private static final C26583b f104683e = C26583b.m136510d("causedBy");

        /* renamed from: f */
        private static final C26583b f104684f = C26583b.m136510d("overflowCount");

        private n() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.d.a.b.c cVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104680b, cVar.mo111422f());
            interfaceC26585d.mo671a(f104681c, cVar.mo111421e());
            interfaceC26585d.mo671a(f104682d, cVar.mo111419c());
            interfaceC26585d.mo671a(f104683e, cVar.mo111418b());
            interfaceC26585d.mo675e(f104684f, cVar.mo111420d());
        }
    }

    /* renamed from: k8.a$o */
    /* loaded from: classes.dex */
    private static final class o implements InterfaceC26584c {

        /* renamed from: a */
        static final o f104685a = new o();

        /* renamed from: b */
        private static final C26583b f104686b = C26583b.m136510d("name");

        /* renamed from: c */
        private static final C26583b f104687c = C26583b.m136510d("code");

        /* renamed from: d */
        private static final C26583b f104688d = C26583b.m136510d("address");

        private o() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.d.a.b.AbstractC32862d abstractC32862d, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104686b, abstractC32862d.mo111432d());
            interfaceC26585d.mo671a(f104687c, abstractC32862d.mo111431c());
            interfaceC26585d.mo672b(f104688d, abstractC32862d.mo111430b());
        }
    }

    /* renamed from: k8.a$p */
    /* loaded from: classes.dex */
    private static final class p implements InterfaceC26584c {

        /* renamed from: a */
        static final p f104689a = new p();

        /* renamed from: b */
        private static final C26583b f104690b = C26583b.m136510d("name");

        /* renamed from: c */
        private static final C26583b f104691c = C26583b.m136510d("importance");

        /* renamed from: d */
        private static final C26583b f104692d = C26583b.m136510d("frames");

        private p() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.d.a.b.AbstractC32864e abstractC32864e, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104690b, abstractC32864e.mo111440d());
            interfaceC26585d.mo675e(f104691c, abstractC32864e.mo111439c());
            interfaceC26585d.mo671a(f104692d, abstractC32864e.mo111438b());
        }
    }

    /* renamed from: k8.a$q */
    /* loaded from: classes.dex */
    private static final class q implements InterfaceC26584c {

        /* renamed from: a */
        static final q f104693a = new q();

        /* renamed from: b */
        private static final C26583b f104694b = C26583b.m136510d("pc");

        /* renamed from: c */
        private static final C26583b f104695c = C26583b.m136510d("symbol");

        /* renamed from: d */
        private static final C26583b f104696d = C26583b.m136510d("file");

        /* renamed from: e */
        private static final C26583b f104697e = C26583b.m136510d("offset");

        /* renamed from: f */
        private static final C26583b f104698f = C26583b.m136510d("importance");

        private q() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b abstractC32866b, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo672b(f104694b, abstractC32866b.mo111449e());
            interfaceC26585d.mo671a(f104695c, abstractC32866b.mo111450f());
            interfaceC26585d.mo671a(f104696d, abstractC32866b.mo111446b());
            interfaceC26585d.mo672b(f104697e, abstractC32866b.mo111448d());
            interfaceC26585d.mo675e(f104698f, abstractC32866b.mo111447c());
        }
    }

    /* renamed from: k8.a$r */
    /* loaded from: classes.dex */
    private static final class r implements InterfaceC26584c {

        /* renamed from: a */
        static final r f104699a = new r();

        /* renamed from: b */
        private static final C26583b f104700b = C26583b.m136510d("batteryLevel");

        /* renamed from: c */
        private static final C26583b f104701c = C26583b.m136510d("batteryVelocity");

        /* renamed from: d */
        private static final C26583b f104702d = C26583b.m136510d("proximityOn");

        /* renamed from: e */
        private static final C26583b f104703e = C26583b.m136510d("orientation");

        /* renamed from: f */
        private static final C26583b f104704f = C26583b.m136510d("ramUsed");

        /* renamed from: g */
        private static final C26583b f104705g = C26583b.m136510d("diskUsed");

        private r() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.d.c cVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104700b, cVar.mo111464b());
            interfaceC26585d.mo675e(f104701c, cVar.mo111465c());
            interfaceC26585d.mo673c(f104702d, cVar.mo111469g());
            interfaceC26585d.mo675e(f104703e, cVar.mo111467e());
            interfaceC26585d.mo672b(f104704f, cVar.mo111468f());
            interfaceC26585d.mo672b(f104705g, cVar.mo111466d());
        }
    }

    /* renamed from: k8.a$s */
    /* loaded from: classes.dex */
    private static final class s implements InterfaceC26584c {

        /* renamed from: a */
        static final s f104706a = new s();

        /* renamed from: b */
        private static final C26583b f104707b = C26583b.m136510d("timestamp");

        /* renamed from: c */
        private static final C26583b f104708c = C26583b.m136510d(ZinstantMetaConstant.IMPRESSION_META_TYPE);

        /* renamed from: d */
        private static final C26583b f104709d = C26583b.m136510d("app");

        /* renamed from: e */
        private static final C26583b f104710e = C26583b.m136510d("device");

        /* renamed from: f */
        private static final C26583b f104711f = C26583b.m136510d("log");

        private s() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.d dVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo672b(f104707b, dVar.mo111377e());
            interfaceC26585d.mo671a(f104708c, dVar.mo111378f());
            interfaceC26585d.mo671a(f104709d, dVar.mo111374b());
            interfaceC26585d.mo671a(f104710e, dVar.mo111375c());
            interfaceC26585d.mo671a(f104711f, dVar.mo111376d());
        }
    }

    /* renamed from: k8.a$t */
    /* loaded from: classes.dex */
    private static final class t implements InterfaceC26584c {

        /* renamed from: a */
        static final t f104712a = new t();

        /* renamed from: b */
        private static final C26583b f104713b = C26583b.m136510d("content");

        private t() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.d.AbstractC32868d abstractC32868d, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104713b, abstractC32868d.mo111478b());
        }
    }

    /* renamed from: k8.a$u */
    /* loaded from: classes.dex */
    private static final class u implements InterfaceC26584c {

        /* renamed from: a */
        static final u f104714a = new u();

        /* renamed from: b */
        private static final C26583b f104715b = C26583b.m136510d("platform");

        /* renamed from: c */
        private static final C26583b f104716c = C26583b.m136510d("version");

        /* renamed from: d */
        private static final C26583b f104717d = C26583b.m136510d("buildVersion");

        /* renamed from: e */
        private static final C26583b f104718e = C26583b.m136510d("jailbroken");

        private u() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.AbstractC32869e abstractC32869e, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo675e(f104715b, abstractC32869e.mo111483c());
            interfaceC26585d.mo671a(f104716c, abstractC32869e.mo111484d());
            interfaceC26585d.mo671a(f104717d, abstractC32869e.mo111482b());
            interfaceC26585d.mo673c(f104718e, abstractC32869e.mo111485e());
        }
    }

    /* renamed from: k8.a$v */
    /* loaded from: classes.dex */
    private static final class v implements InterfaceC26584c {

        /* renamed from: a */
        static final v f104719a = new v();

        /* renamed from: b */
        private static final C26583b f104720b = C26583b.m136510d("identifier");

        private v() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(AbstractC21569b0.e.f fVar, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f104720b, fVar.mo111492b());
        }
    }

    private C21566a() {
    }

    @Override // p540u8.InterfaceC27097a
    /* renamed from: a */
    public void mo479a(InterfaceC27098b interfaceC27098b) {
        d dVar = d.f104614a;
        interfaceC27098b.mo725a(AbstractC21569b0.class, dVar);
        interfaceC27098b.mo725a(C21568b.class, dVar);
        j jVar = j.f104650a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.class, jVar);
        interfaceC27098b.mo725a(C21577h.class, jVar);
        g gVar = g.f104630a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.a.class, gVar);
        interfaceC27098b.mo725a(C21578i.class, gVar);
        h hVar = h.f104638a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.a.b.class, hVar);
        interfaceC27098b.mo725a(AbstractC21579j.class, hVar);
        v vVar = v.f104719a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.f.class, vVar);
        interfaceC27098b.mo725a(C21592w.class, vVar);
        u uVar = u.f104714a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.AbstractC32869e.class, uVar);
        interfaceC27098b.mo725a(C21591v.class, uVar);
        i iVar = i.f104640a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.c.class, iVar);
        interfaceC27098b.mo725a(C21580k.class, iVar);
        s sVar = s.f104706a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.d.class, sVar);
        interfaceC27098b.mo725a(C21581l.class, sVar);
        k kVar = k.f104662a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.d.a.class, kVar);
        interfaceC27098b.mo725a(C21582m.class, kVar);
        m mVar = m.f104673a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.d.a.b.class, mVar);
        interfaceC27098b.mo725a(C21583n.class, mVar);
        p pVar = p.f104689a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.d.a.b.AbstractC32864e.class, pVar);
        interfaceC27098b.mo725a(C21587r.class, pVar);
        q qVar = q.f104693a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.class, qVar);
        interfaceC27098b.mo725a(C21588s.class, qVar);
        n nVar = n.f104679a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.d.a.b.c.class, nVar);
        interfaceC27098b.mo725a(C21585p.class, nVar);
        b bVar = b.f104601a;
        interfaceC27098b.mo725a(AbstractC21569b0.a.class, bVar);
        interfaceC27098b.mo725a(C21570c.class, bVar);
        a aVar = a.f104597a;
        interfaceC27098b.mo725a(AbstractC21569b0.a.AbstractC32854a.class, aVar);
        interfaceC27098b.mo725a(C21572d.class, aVar);
        o oVar = o.f104685a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.d.a.b.AbstractC32862d.class, oVar);
        interfaceC27098b.mo725a(C21586q.class, oVar);
        l lVar = l.f104668a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.d.a.b.AbstractC32858a.class, lVar);
        interfaceC27098b.mo725a(C21584o.class, lVar);
        c cVar = c.f104611a;
        interfaceC27098b.mo725a(AbstractC21569b0.c.class, cVar);
        interfaceC27098b.mo725a(C21574e.class, cVar);
        r rVar = r.f104699a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.d.c.class, rVar);
        interfaceC27098b.mo725a(C21589t.class, rVar);
        t tVar = t.f104712a;
        interfaceC27098b.mo725a(AbstractC21569b0.e.d.AbstractC32868d.class, tVar);
        interfaceC27098b.mo725a(C21590u.class, tVar);
        e eVar = e.f104624a;
        interfaceC27098b.mo725a(AbstractC21569b0.d.class, eVar);
        interfaceC27098b.mo725a(C21575f.class, eVar);
        f fVar = f.f104627a;
        interfaceC27098b.mo725a(AbstractC21569b0.d.b.class, fVar);
        interfaceC27098b.mo725a(C21576g.class, fVar);
    }
}
