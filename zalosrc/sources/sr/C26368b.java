package sr;

import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: sr.b */
/* loaded from: classes4.dex */
public final class C26368b {

    /* renamed from: a */
    public static final C26368b f125264a = new C26368b();

    /* renamed from: b */
    private static final InterfaceC24854k f125265b;

    /* renamed from: sr.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f125266q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26367a mo12V4() {
            return new C26367a();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f125266q);
        f125265b = m129210a;
    }

    private C26368b() {
    }

    /* renamed from: a */
    public final C26367a m135774a() {
        return (C26367a) f125265b.getValue();
    }
}
