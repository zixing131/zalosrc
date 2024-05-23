package pm0;

import androidx.concurrent.futures.AbstractC1246b;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pm0.t */
/* loaded from: classes.dex */
public final class C24863t implements InterfaceC24854k, Serializable {

    /* renamed from: s */
    public static final a f119267s = new a(null);

    /* renamed from: t */
    private static final AtomicReferenceFieldUpdater f119268t = AtomicReferenceFieldUpdater.newUpdater(C24863t.class, Object.class, "q");

    /* renamed from: p */
    private volatile InterfaceC18494a f119269p;

    /* renamed from: q */
    private volatile Object f119270q;

    /* renamed from: r */
    private final Object f119271r;

    /* renamed from: pm0.t$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24863t(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "initializer");
        this.f119269p = interfaceC18494a;
        C24842d0 c24842d0 = C24842d0.f119239a;
        this.f119270q = c24842d0;
        this.f119271r = c24842d0;
    }

    private final Object writeReplace() {
        return new C24849h(getValue());
    }

    @Override // pm0.InterfaceC24854k
    /* renamed from: b */
    public boolean mo9375b() {
        if (this.f119270q != C24842d0.f119239a) {
            return true;
        }
        return false;
    }

    @Override // pm0.InterfaceC24854k
    public Object getValue() {
        Object obj = this.f119270q;
        C24842d0 c24842d0 = C24842d0.f119239a;
        if (obj != c24842d0) {
            return obj;
        }
        InterfaceC18494a interfaceC18494a = this.f119269p;
        if (interfaceC18494a != null) {
            Object mo12V4 = interfaceC18494a.mo12V4();
            if (AbstractC1246b.m5921a(f119268t, this, c24842d0, mo12V4)) {
                this.f119269p = null;
                return mo12V4;
            }
        }
        return this.f119270q;
    }

    public String toString() {
        if (mo9375b()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
