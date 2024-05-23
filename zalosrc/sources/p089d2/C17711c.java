package p089d2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1785o;
import androidx.savedstate.C1938a;
import androidx.savedstate.Recreator;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: d2.c */
/* loaded from: classes.dex */
public final class C17711c {

    /* renamed from: d */
    public static final a f89794d = new a(null);

    /* renamed from: a */
    private final InterfaceC17712d f89795a;

    /* renamed from: b */
    private final C1938a f89796b;

    /* renamed from: c */
    private boolean f89797c;

    /* renamed from: d2.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C17711c m93787a(InterfaceC17712d interfaceC17712d) {
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
            return new C17711c(interfaceC17712d, null);
        }
    }

    public /* synthetic */ C17711c(InterfaceC17712d interfaceC17712d, AbstractC19060k abstractC19060k) {
        this(interfaceC17712d);
    }

    /* renamed from: a */
    public static final C17711c m93782a(InterfaceC17712d interfaceC17712d) {
        return f89794d.m93787a(interfaceC17712d);
    }

    /* renamed from: b */
    public final C1938a m93783b() {
        return this.f89796b;
    }

    /* renamed from: c */
    public final void m93784c() {
        AbstractC1785o lifecycle = this.f89795a.getLifecycle();
        if (lifecycle.mo9336b() == AbstractC1785o.b.INITIALIZED) {
            lifecycle.mo9335a(new Recreator(this.f89795a));
            this.f89796b.m10706e(lifecycle);
            this.f89797c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    /* renamed from: d */
    public final void m93785d(Bundle bundle) {
        if (!this.f89797c) {
            m93784c();
        }
        AbstractC1785o lifecycle = this.f89795a.getLifecycle();
        if (!lifecycle.mo9336b().m9345c(AbstractC1785o.b.STARTED)) {
            this.f89796b.m10707f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo9336b()).toString());
    }

    /* renamed from: e */
    public final void m93786e(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outBundle");
        this.f89796b.m10708g(bundle);
    }

    private C17711c(InterfaceC17712d interfaceC17712d) {
        this.f89795a = interfaceC17712d;
        this.f89796b = new C1938a();
    }
}
