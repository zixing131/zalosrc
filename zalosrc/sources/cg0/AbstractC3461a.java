package cg0;

import ag0.InterfaceC0806b1;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hg0.AbstractC20056d;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: cg0.a */
/* loaded from: classes.dex */
public abstract class AbstractC3461a implements InterfaceC0806b1 {

    /* renamed from: a */
    private final InterfaceC24854k f14555a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cg0.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AbstractC20056d mo12V4() {
            return AbstractC3461a.this.mo17453b();
        }
    }

    public AbstractC3461a() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new a());
        this.f14555a = m129210a;
    }

    /* renamed from: b */
    public abstract AbstractC20056d mo17453b();

    @Override // ag0.InterfaceC0806b1
    /* renamed from: c */
    public void mo2040a(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "task");
        m17455d().m104178a(runnable);
    }

    /* renamed from: d */
    protected final AbstractC20056d m17455d() {
        return (AbstractC20056d) this.f14555a.getValue();
    }
}
