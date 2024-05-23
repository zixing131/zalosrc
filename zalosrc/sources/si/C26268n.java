package si;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: si.n */
/* loaded from: classes.dex */
public final class C26268n {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f124707a;

    /* renamed from: si.n$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f124708q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26268n mo12V4() {
            return c.f124709a.m135102a();
        }
    }

    /* renamed from: si.n$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C26268n m135101a() {
            return (C26268n) C26268n.f124707a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: si.n$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f124709a = new c();

        /* renamed from: b */
        private static final C26268n f124710b = new C26268n();

        private c() {
        }

        /* renamed from: a */
        public final C26268n m135102a() {
            return f124710b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f124708q);
        f124707a = m129210a;
    }

    /* renamed from: b */
    public static final C26268n m135099b() {
        return Companion.m135101a();
    }
}
