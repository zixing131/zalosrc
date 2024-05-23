package al0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import il0.C20605a;
import il0.C20607c;
import il0.C20609e;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.CoroutineScopeKt;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vk0.C28289k;
import vk0.InterfaceC28286h;
import zk0.InterfaceC32222a;

/* renamed from: al0.a */
/* loaded from: classes7.dex */
public final class C0894a {

    /* renamed from: a */
    public static final C0894a f3359a = new C0894a();

    /* renamed from: b */
    private static boolean f3360b;

    /* renamed from: c */
    private static final InterfaceC24854k f3361c;

    /* renamed from: d */
    private static final InterfaceC24854k f3362d;

    /* renamed from: e */
    private static final InterfaceC24854k f3363e;

    /* renamed from: f */
    private static final InterfaceC24854k f3364f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: al0.a$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC32222a {

        /* renamed from: a */
        private final String f3365a;

        /* renamed from: b */
        private final ConcurrentHashMap f3366b;

        public a(String str) {
            AbstractC19074t.m100208f(str, "TAG");
            this.f3365a = str;
            this.f3366b = new ConcurrentHashMap();
        }

        @Override // zk0.InterfaceC32222a
        /* renamed from: a */
        public void mo2759a(String str) {
            AbstractC19074t.m100208f(str, "msg");
            if (C0894a.f3360b) {
                AbstractC20110a.f98889a.m104564x(this.f3365a).mo104548a(str, new Object[0]);
            }
        }

        @Override // zk0.InterfaceC32222a
        /* renamed from: b */
        public void mo2760b(InterfaceC28286h interfaceC28286h) {
            AbstractC19074t.m100208f(interfaceC28286h, "info");
            if (C0894a.f3360b) {
                this.f3366b.put(interfaceC28286h, Long.valueOf(System.currentTimeMillis()));
                AbstractC20110a.f98889a.m104564x(this.f3365a).mo104548a("Start - " + interfaceC28286h.getClass().getSimpleName(), new Object[0]);
            }
        }

        @Override // zk0.InterfaceC32222a
        /* renamed from: c */
        public void mo2761c(InterfaceC28286h interfaceC28286h) {
            AbstractC19074t.m100208f(interfaceC28286h, "info");
            if (C0894a.f3360b) {
                Long l11 = (Long) this.f3366b.get(interfaceC28286h);
                if (l11 == null) {
                    l11 = 0L;
                }
                long currentTimeMillis = System.currentTimeMillis() - l11.longValue();
                AbstractC20110a.f98889a.m104564x(this.f3365a).mo104548a("Stop - time(" + currentTimeMillis + ") - " + interfaceC28286h.getClass().getSimpleName(), new Object[0]);
                this.f3366b.remove(interfaceC28286h);
            }
        }
    }

    /* renamed from: al0.a$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f3367q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a("Zinstant - Watcher - Skeleton");
        }
    }

    /* renamed from: al0.a$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f3368q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20609e mo12V4() {
            return new C20609e(new C20605a(C0895b.m2767b()), new C20607c(C0895b.m2766a()));
        }
    }

    /* renamed from: al0.a$d */
    /* loaded from: classes7.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f3369q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28289k mo12V4() {
            return new C28289k(CoroutineScopeKt.m112637a(C0894a.f3359a.m2753d()), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: al0.a$e */
    /* loaded from: classes7.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f3370q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a("Zinstant - Watcher");
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(e.f3370q);
        f3361c = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f3367q);
        f3362d = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(c.f3368q);
        f3363e = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(d.f3369q);
        f3364f = m129210a4;
    }

    private C0894a() {
    }

    /* renamed from: c */
    private final InterfaceC32222a m2752c() {
        return (InterfaceC32222a) f3362d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final C20609e m2753d() {
        return (C20609e) f3363e.getValue();
    }

    /* renamed from: e */
    private final C28289k m2754e() {
        return (C28289k) f3364f.getValue();
    }

    /* renamed from: f */
    private final InterfaceC32222a m2755f() {
        return (InterfaceC32222a) f3361c.getValue();
    }

    /* renamed from: g */
    public final InterfaceC32222a m2756g() {
        return m2752c();
    }

    /* renamed from: h */
    public final C28289k m2757h() {
        return m2754e();
    }

    /* renamed from: i */
    public final InterfaceC32222a m2758i() {
        return m2755f();
    }
}
