package bl0;

import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: bl0.a */
/* loaded from: classes7.dex */
public final class C2835a {

    /* renamed from: a */
    private final InterfaceC24854k f11326a;

    /* renamed from: bl0.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f11327q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2836b mo12V4() {
            return new C2836b(0L, 0L, 3, null);
        }
    }

    public C2835a() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f11327q);
        this.f11326a = m129210a;
    }

    /* renamed from: a */
    public final C2836b m13690a() {
        return (C2836b) this.f11326a.getValue();
    }
}
