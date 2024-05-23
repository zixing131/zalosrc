package ga0;

import ag0.AbstractC0837p0;
import ag0.InterfaceC0806b1;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;

/* renamed from: ga0.q1 */
/* loaded from: classes6.dex */
public abstract class AbstractRunnableC19355q1 implements Runnable, InterfaceC19305a, InterfaceC18319c {

    /* renamed from: p */
    private InterfaceC0806b1 f96144p;

    /* renamed from: q */
    private boolean f96145q;

    /* renamed from: r */
    private final WeakReference f96146r;

    public AbstractRunnableC19355q1(InterfaceC18319c interfaceC18319c) {
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        this.f96144p = AbstractC0837p0.Companion.m2237f();
        this.f96146r = new WeakReference(interfaceC18319c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m101434h(AbstractRunnableC19355q1 abstractRunnableC19355q1, C18316b c18316b) {
        AbstractC19074t.m100208f(abstractRunnableC19355q1, "this$0");
        AbstractC19074t.m100208f(c18316b, "$action");
        abstractRunnableC19355q1.mo205i9(c18316b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m101435k(AbstractRunnableC19355q1 abstractRunnableC19355q1) {
        AbstractC19074t.m100208f(abstractRunnableC19355q1, "this$0");
        abstractRunnableC19355q1.m101441i();
    }

    /* renamed from: c */
    public void m101436c() {
        this.f96145q = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public InterfaceC0806b1 m101437d() {
        return this.f96144p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final InterfaceC18319c m101438e() {
        return (InterfaceC18319c) this.f96146r.get();
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        InterfaceC18319c m101438e = m101438e();
        if (m101438e != null) {
            return (C18316b) m101438e.mo205i9(c18316b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m101440g(final C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        AbstractC19444a.m101695c(new Runnable() { // from class: ga0.p1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractRunnableC19355q1.m101434h(AbstractRunnableC19355q1.this, c18316b);
            }
        });
    }

    /* renamed from: i */
    public final void m101441i() {
        Object m129218b;
        try {
            C24861r.a aVar = C24861r.f119264q;
            run();
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // ga0.InterfaceC19305a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isCancelled() {
        boolean z11;
        InterfaceC19305a interfaceC19305a;
        if (this.f96145q) {
            return true;
        }
        InterfaceC18319c m101438e = m101438e();
        if (m101438e != null) {
            if (m101438e instanceof InterfaceC19305a) {
                interfaceC19305a = (InterfaceC19305a) m101438e;
            } else {
                interfaceC19305a = null;
            }
            if (interfaceC19305a == null || !interfaceC19305a.isCancelled()) {
                z11 = false;
                if (z11) {
                    this.f96145q = true;
                }
                if (!z11) {
                    return true;
                }
                return false;
            }
        }
        z11 = true;
        if (z11) {
        }
        if (!z11) {
        }
    }

    /* renamed from: j */
    public final void m101442j() {
        m101437d().mo2040a(new Runnable() { // from class: ga0.o1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractRunnableC19355q1.m101435k(AbstractRunnableC19355q1.this);
            }
        });
    }

    @Override // java.lang.Runnable
    public abstract void run();
}
