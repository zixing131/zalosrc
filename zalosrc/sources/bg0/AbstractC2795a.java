package bg0;

import ag0.AbstractRunnableC0823i0;
import ag0.InterfaceC0806b1;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;

/* renamed from: bg0.a */
/* loaded from: classes.dex */
public abstract class AbstractC2795a implements InterfaceC2798d {

    /* renamed from: a */
    private InterfaceC18509p f11151a;

    /* renamed from: b */
    private final InterfaceC0806b1 f11152b;

    /* renamed from: bg0.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final a f11153q = new a();

        a() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractRunnableC0823i0 mo240pC(Runnable runnable, InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(runnable, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(interfaceC18494a, "processBlock");
            return AbstractRunnableC0823i0.Companion.m2151a(interfaceC18494a);
        }
    }

    public AbstractC2795a(InterfaceC0806b1 interfaceC0806b1) {
        AbstractC19074t.m100208f(interfaceC0806b1, "executor");
        this.f11152b = interfaceC0806b1;
        this.f11151a = a.f11153q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final InterfaceC0806b1 m13467b() {
        return this.f11152b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final InterfaceC18509p m13468c() {
        return this.f11151a;
    }

    /* renamed from: d */
    public final void m13469d(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "creator");
        this.f11151a = interfaceC18509p;
    }
}
