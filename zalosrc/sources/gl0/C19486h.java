package gl0;

import al0.C0894a;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ik0.AbstractC20601x;
import ik0.InterfaceC20585h;
import p667y2.C30268e;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import zk0.InterfaceC32222a;

/* renamed from: gl0.h */
/* loaded from: classes7.dex */
public final class C19486h implements InterfaceC20585h {

    /* renamed from: a */
    private final InterfaceC20585h f96700a;

    /* renamed from: b */
    private final InterfaceC24854k f96701b;

    /* renamed from: gl0.h$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f96702q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC32222a mo12V4() {
            return C0894a.f3359a.m2758i();
        }
    }

    public C19486h(InterfaceC20585h interfaceC20585h) {
        InterfaceC24854k m129210a;
        this.f96700a = interfaceC20585h;
        m129210a = AbstractC24856m.m129210a(a.f96702q);
        this.f96701b = m129210a;
    }

    /* renamed from: e */
    private final InterfaceC32222a m101902e() {
        return (InterfaceC32222a) this.f96701b.getValue();
    }

    @Override // ik0.InterfaceC20585h
    /* renamed from: a */
    public void mo91700a(AbstractC20601x abstractC20601x, Exception exc) {
        AbstractC19074t.m100208f(abstractC20601x, "request");
        AbstractC19074t.m100208f(exc, C30268e.f140632a);
        InterfaceC32222a m101902e = m101902e();
        if (m101902e != null) {
            m101902e.mo2759a("Error Skeleton - " + abstractC20601x + " - " + exc);
        }
        InterfaceC20585h interfaceC20585h = this.f96700a;
        if (interfaceC20585h != null) {
            interfaceC20585h.mo91700a(abstractC20601x, exc);
        }
    }

    @Override // ik0.InterfaceC20585h
    /* renamed from: b */
    public void mo91701b(AbstractC20601x abstractC20601x, Exception exc) {
        AbstractC19074t.m100208f(abstractC20601x, "request");
        AbstractC19074t.m100208f(exc, C30268e.f140632a);
        InterfaceC32222a m101902e = m101902e();
        if (m101902e != null) {
            m101902e.mo2759a("Error - " + abstractC20601x + " - " + exc);
        }
        InterfaceC20585h interfaceC20585h = this.f96700a;
        if (interfaceC20585h != null) {
            interfaceC20585h.mo91701b(abstractC20601x, exc);
        }
    }

    @Override // ik0.InterfaceC20585h
    /* renamed from: c */
    public void mo91702c(AbstractC20601x abstractC20601x, long j11, long j12) {
        AbstractC19074t.m100208f(abstractC20601x, "request");
        InterfaceC32222a m101902e = m101902e();
        if (m101902e != null) {
            m101902e.mo2759a("Success - " + abstractC20601x);
        }
        InterfaceC20585h interfaceC20585h = this.f96700a;
        if (interfaceC20585h != null) {
            interfaceC20585h.mo91702c(abstractC20601x, j11, j12);
        }
    }

    @Override // ik0.InterfaceC20585h
    /* renamed from: d */
    public void mo91703d(AbstractC20601x abstractC20601x) {
        AbstractC19074t.m100208f(abstractC20601x, "request");
        InterfaceC32222a m101902e = m101902e();
        if (m101902e != null) {
            m101902e.mo2759a("Success Skeleton - " + abstractC20601x);
        }
        InterfaceC20585h interfaceC20585h = this.f96700a;
        if (interfaceC20585h != null) {
            interfaceC20585h.mo91703d(abstractC20601x);
        }
    }
}
