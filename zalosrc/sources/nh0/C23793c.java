package nh0;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import oh0.C24267b;
import oh0.InterfaceC24266a;
import on0.AbstractC24341v;
import ph0.C24758b;
import ph0.InterfaceC24757a;
import pm0.AbstractC24855l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: nh0.c */
/* loaded from: classes.dex */
public final class C23793c implements InterfaceC23792b {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f114990c = AbstractC24855l.m129208a(a.f114993q);

    /* renamed from: a */
    private final InterfaceC24757a f114991a;

    /* renamed from: b */
    private final InterfaceC24266a f114992b;

    /* renamed from: nh0.c$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f114993q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23793c mo12V4() {
            return c.f114995b.m124322a();
        }
    }

    /* renamed from: nh0.c$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC23792b m124321a() {
            return (InterfaceC23792b) C23793c.f114990c.getValue();
        }
    }

    /* renamed from: nh0.c$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b */
        public static final c f114995b = new c();

        /* renamed from: a */
        private static final C23793c f114994a = new C23793c(new C24758b(), C24267b.Companion.m126722a());

        private c() {
        }

        /* renamed from: a */
        public final C23793c m124322a() {
            return f114994a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f114993q);
        f114990c = m129210a;
    }

    public C23793c(InterfaceC24757a interfaceC24757a, InterfaceC24266a interfaceC24266a) {
        AbstractC19074t.m100208f(interfaceC24757a, "deviceTimeProvider");
        AbstractC19074t.m100208f(interfaceC24266a, "preferencesProvider");
        this.f114991a = interfaceC24757a;
        this.f114992b = interfaceC24266a;
    }

    /* renamed from: k */
    public static final InterfaceC23792b m124316k() {
        return Companion.m124321a();
    }

    /* renamed from: l */
    private final boolean m124317l(long j11) {
        return 0 <= j11 && 1000 >= j11;
    }

    @Override // nh0.InterfaceC23792b
    /* renamed from: a */
    public long mo124308a() {
        long mo126715f = this.f114992b.mo126715f();
        if (mo126715f <= 0) {
            mo126715f = mo124311f() - this.f114991a.mo124319c();
            this.f114992b.mo126713d(mo126715f);
        }
        return this.f114991a.mo124319c() + mo126715f;
    }

    @Override // ph0.InterfaceC24757a
    /* renamed from: b */
    public long mo124318b() {
        return this.f114991a.mo124318b();
    }

    @Override // ph0.InterfaceC24757a
    /* renamed from: c */
    public long mo124319c() {
        return this.f114991a.mo124319c();
    }

    @Override // nh0.InterfaceC23792b
    /* renamed from: d */
    public void mo124309d() {
        String m127130z;
        String m127130z2;
        StringBuilder sb2 = new StringBuilder();
        m127130z = AbstractC24341v.m127130z("─", 91);
        sb2.append(m127130z);
        sb2.append('\n');
        sb2.append("Last server: ");
        sb2.append(this.f114992b.mo126716g());
        sb2.append(", Last local: ");
        sb2.append(this.f114992b.mo126712c());
        sb2.append(", Last CPU: ");
        sb2.append(this.f114992b.mo126714e());
        sb2.append("\n");
        sb2.append("Local: ");
        sb2.append(this.f114991a.mo124318b());
        sb2.append(", CPU: ");
        sb2.append(this.f114991a.mo124319c());
        sb2.append("\n");
        sb2.append("Server mixed: ");
        sb2.append(mo124314i());
        sb2.append(", Server local: ");
        sb2.append(mo124311f());
        sb2.append(", Server CPU: ");
        sb2.append(mo124310e());
        sb2.append("\n");
        m127130z2 = AbstractC24341v.m127130z("─", 100);
        sb2.append(m127130z2);
        AbstractC20110a.m104543l("ZaloTime").mo104556o(8, sb2.toString(), new Object[0]);
    }

    @Override // nh0.InterfaceC23792b
    /* renamed from: e */
    public long mo124310e() {
        return (this.f114991a.mo124319c() - this.f114992b.mo126714e()) + this.f114992b.mo126716g();
    }

    @Override // nh0.InterfaceC23792b
    /* renamed from: f */
    public long mo124311f() {
        return this.f114991a.mo124318b() + (this.f114992b.mo126716g() - this.f114992b.mo126712c());
    }

    @Override // nh0.InterfaceC23792b
    /* renamed from: g */
    public void mo124312g() {
        AbstractC20110a.m104543l("ZaloTime").mo104556o(8, "Reset server time!", new Object[0]);
        this.f114992b.mo126717h(0L);
        this.f114992b.mo126710a(0L);
        this.f114992b.mo126711b(0L);
    }

    @Override // nh0.InterfaceC23792b
    /* renamed from: h */
    public boolean mo124313h(long j11, long j12) {
        long mo124319c = this.f114991a.mo124319c();
        long j13 = mo124319c - j12;
        if (!m124317l(j13) && this.f114992b.mo126716g() != 0) {
            AbstractC20110a.m104543l("ZaloTime").mo104556o(8, "Ignore renew server time! RTT=" + j13 + ", time=" + j11, new Object[0]);
            return false;
        }
        long j14 = j11 + (j13 / 2);
        this.f114992b.mo126710a(this.f114991a.mo124318b());
        this.f114992b.mo126711b(mo124319c);
        this.f114992b.mo126717h(j14);
        this.f114992b.mo126713d(j14 - mo124319c);
        return true;
    }

    @Override // nh0.InterfaceC23792b
    /* renamed from: i */
    public long mo124314i() {
        long mo124319c = this.f114991a.mo124319c();
        long mo126714e = this.f114992b.mo126714e();
        if (mo126714e <= 0) {
            return 0L;
        }
        if (mo124319c >= mo126714e) {
            return (mo124319c - mo126714e) + this.f114992b.mo126716g();
        }
        return mo124311f();
    }
}
