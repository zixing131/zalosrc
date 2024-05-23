package ag0;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ag0.i0 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0823i0 implements Runnable {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private final InterfaceC18494a f2891p;

    /* renamed from: ag0.i0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: ag0.i0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C32618a extends AbstractRunnableC0823i0 {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18494a f2892q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32618a(InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2) {
                super(interfaceC18494a2);
                this.f2892q = interfaceC18494a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AbstractRunnableC0823i0 m2151a(InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(interfaceC18494a, "processBlock");
            return new C32618a(interfaceC18494a, interfaceC18494a);
        }
    }

    public AbstractRunnableC0823i0(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "processBlock");
        this.f2891p = interfaceC18494a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2891p.mo12V4();
    }
}
