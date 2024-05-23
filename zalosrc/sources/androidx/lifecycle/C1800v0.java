package androidx.lifecycle;

import androidx.lifecycle.C1802w0;
import dn0.AbstractC18031a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mn0.InterfaceC23364b;
import p534u1.AbstractC26941a;
import pm0.InterfaceC24854k;

/* renamed from: androidx.lifecycle.v0 */
/* loaded from: classes2.dex */
public final class C1800v0 implements InterfaceC24854k {

    /* renamed from: p */
    private final InterfaceC23364b f7403p;

    /* renamed from: q */
    private final InterfaceC18494a f7404q;

    /* renamed from: r */
    private final InterfaceC18494a f7405r;

    /* renamed from: s */
    private final InterfaceC18494a f7406s;

    /* renamed from: t */
    private AbstractC1796t0 f7407t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.v0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f7408q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC26941a.a mo12V4() {
            return AbstractC26941a.a.f127383b;
        }
    }

    public C1800v0(InterfaceC23364b interfaceC23364b, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, InterfaceC18494a interfaceC18494a3) {
        AbstractC19074t.m100208f(interfaceC23364b, "viewModelClass");
        AbstractC19074t.m100208f(interfaceC18494a, "storeProducer");
        AbstractC19074t.m100208f(interfaceC18494a2, "factoryProducer");
        AbstractC19074t.m100208f(interfaceC18494a3, "extrasProducer");
        this.f7403p = interfaceC23364b;
        this.f7404q = interfaceC18494a;
        this.f7405r = interfaceC18494a2;
        this.f7406s = interfaceC18494a3;
    }

    @Override // pm0.InterfaceC24854k
    /* renamed from: b */
    public boolean mo9375b() {
        return this.f7407t != null;
    }

    @Override // pm0.InterfaceC24854k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1796t0 getValue() {
        AbstractC1796t0 abstractC1796t0 = this.f7407t;
        if (abstractC1796t0 == null) {
            AbstractC1796t0 m9378a = new C1802w0((C1808z0) this.f7404q.mo12V4(), (C1802w0.b) this.f7405r.mo12V4(), (AbstractC26941a) this.f7406s.mo12V4()).m9378a(AbstractC18031a.m95868a(this.f7403p));
            this.f7407t = m9378a;
            return m9378a;
        }
        return abstractC1796t0;
    }

    public /* synthetic */ C1800v0(InterfaceC23364b interfaceC23364b, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, InterfaceC18494a interfaceC18494a3, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC23364b, interfaceC18494a, interfaceC18494a2, (i11 & 8) != 0 ? a.f7408q : interfaceC18494a3);
    }
}
