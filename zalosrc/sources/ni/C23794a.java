package ni;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import p296kc.C21654a;
import p393oi.C24269b;
import p393oi.InterfaceC24268a;
import p449qi.C25291c;
import p449qi.InterfaceC25289a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ni.a */
/* loaded from: classes.dex */
public final class C23794a {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f114996c;

    /* renamed from: a */
    private final InterfaceC24268a f114997a;

    /* renamed from: b */
    private final InterfaceC25289a f114998b;

    /* renamed from: ni.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f114999q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23794a mo12V4() {
            return c.f115000a.m124333a();
        }
    }

    /* renamed from: ni.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23794a m124332a() {
            return (C23794a) C23794a.f114996c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ni.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f115000a = new c();

        /* renamed from: b */
        private static final C23794a f115001b = new C23794a(new C24269b(), new C25291c());

        private c() {
        }

        /* renamed from: a */
        public final C23794a m124333a() {
            return f115001b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f114999q);
        f114996c = m129210a;
    }

    public C23794a(InterfaceC24268a interfaceC24268a, InterfaceC25289a interfaceC25289a) {
        AbstractC19074t.m100208f(interfaceC24268a, "localDataSource");
        AbstractC19074t.m100208f(interfaceC25289a, "apiHelper");
        this.f114997a = interfaceC24268a;
        this.f114998b = interfaceC25289a;
    }

    /* renamed from: b */
    public static final C23794a m124324b() {
        return Companion.m124332a();
    }

    /* renamed from: c */
    public final long m124325c() {
        return this.f114997a.mo126727d();
    }

    /* renamed from: d */
    public final boolean m124326d() {
        return this.f114997a.mo126724a();
    }

    /* renamed from: e */
    public final void m124327e(long j11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f114998b.mo130864b(j11, interfaceC18505l, interfaceC18509p);
    }

    /* renamed from: f */
    public final void m124328f(boolean z11) {
        C21654a.m111581h("AutoDownloadRepository", "setEnableUserSettingLocal(): enabled=" + z11, null, false, 12, null);
        this.f114997a.mo126726c(z11);
    }

    /* renamed from: g */
    public final void m124329g(long j11) {
        this.f114997a.mo126725b(j11);
    }

    /* renamed from: h */
    public final void m124330h(List list, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(list, "items");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f114998b.mo130863a(list, interfaceC18505l, interfaceC18509p);
    }
}
