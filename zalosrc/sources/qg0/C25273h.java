package qg0;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.ConcurrentHashMap;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: qg0.h */
/* loaded from: classes7.dex */
public final class C25273h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC24854k f121230a;

    /* renamed from: b */
    private final ConcurrentHashMap f121231b;

    /* renamed from: qg0.h$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25273h m130815a() {
            return b.f121232a.m130816a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qg0.h$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f121232a = new b();

        /* renamed from: b */
        private static final C25273h f121233b = new C25273h(null);

        private b() {
        }

        /* renamed from: a */
        public final C25273h m130816a() {
            return f121233b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.h$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f121234q;

        /* renamed from: r */
        final /* synthetic */ int f121235r;

        /* renamed from: s */
        final /* synthetic */ C25273h f121236s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12, C25273h c25273h) {
            super(0);
            this.f121234q = i11;
            this.f121235r = i12;
            this.f121236s = c25273h;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC25272g mo12V4() {
            int i11 = this.f121234q;
            if (i11 != 1) {
                if (i11 == 2) {
                    return new C25275j(this.f121235r, this.f121236s.m130811c());
                }
                throw new IllegalArgumentException("Could not create media key wrapper for algoVersion=" + this.f121234q);
            }
            return new C25274i(this.f121235r, this.f121236s.m130811c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg0.h$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f121237q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap mo12V4() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: qg0.h$e */
    /* loaded from: classes7.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f121238q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25268c mo12V4() {
            C25268c m120647b2 = AbstractC23306f.m120647b2();
            AbstractC19074t.m100207e(m120647b2, "provideZaloCloudKeyManager(...)");
            return m120647b2;
        }
    }

    public /* synthetic */ C25273h(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: b */
    public static final C25273h m130810b() {
        return Companion.m130815a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final C25268c m130811c() {
        return (C25268c) this.f121230a.getValue();
    }

    /* renamed from: d */
    public final AbstractC25272g m130812d(int i11) {
        return m130813e(m130811c().m130765r(), i11);
    }

    /* renamed from: e */
    public final AbstractC25272g m130813e(int i11, int i12) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        ConcurrentHashMap concurrentHashMap;
        AbstractC25272g abstractC25272g;
        m129210a = AbstractC24856m.m129210a(d.f121237q);
        m129210a2 = AbstractC24856m.m129210a(new c(i12, i11, this));
        InterfaceC24854k interfaceC24854k = (InterfaceC24854k) this.f121231b.putIfAbsent(Integer.valueOf(i12), m129210a);
        if (interfaceC24854k == null || (concurrentHashMap = (ConcurrentHashMap) interfaceC24854k.getValue()) == null) {
            concurrentHashMap = (ConcurrentHashMap) m129210a.getValue();
        }
        InterfaceC24854k interfaceC24854k2 = (InterfaceC24854k) concurrentHashMap.putIfAbsent(Integer.valueOf(i11), m129210a2);
        if (interfaceC24854k2 == null || (abstractC25272g = (AbstractC25272g) interfaceC24854k2.getValue()) == null) {
            return (AbstractC25272g) m129210a2.getValue();
        }
        return abstractC25272g;
    }

    /* renamed from: f */
    public final void m130814f() {
        this.f121231b.clear();
    }

    private C25273h() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(e.f121238q);
        this.f121230a = m129210a;
        this.f121231b = new ConcurrentHashMap();
    }
}
