package p362nd;

import am.AbstractC0924m0;
import dj0.InterfaceC18016a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: nd.a */
/* loaded from: classes.dex */
public final class C23728a implements InterfaceC18016a {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f114803a;

    /* renamed from: nd.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f114804q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23728a mo12V4() {
            return c.f114805a.m124067a();
        }
    }

    /* renamed from: nd.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC18016a m124066a() {
            return (InterfaceC18016a) C23728a.f114803a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nd.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f114805a = new c();

        /* renamed from: b */
        private static final C23728a f114806b = new C23728a();

        private c() {
        }

        /* renamed from: a */
        public final C23728a m124067a() {
            return f114806b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f114804q);
        f114803a = m129210a;
    }

    @Override // dj0.InterfaceC18016a
    /* renamed from: a */
    public void mo95801a(boolean z11) {
        AbstractC0924m0.m3810fe(z11);
    }

    @Override // dj0.InterfaceC18016a
    /* renamed from: b */
    public boolean mo95802b() {
        return AbstractC0924m0.m3306O8();
    }
}
