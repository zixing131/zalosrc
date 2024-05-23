package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1802w0;
import androidx.savedstate.C1938a;
import en0.InterfaceC18505l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p089d2.InterfaceC17712d;
import p534u1.AbstractC26941a;
import p534u1.C26943c;

/* renamed from: androidx.lifecycle.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC1782m0 {

    /* renamed from: a */
    public static final AbstractC26941a.b f7352a = new b();

    /* renamed from: b */
    public static final AbstractC26941a.b f7353b = new c();

    /* renamed from: c */
    public static final AbstractC26941a.b f7354c = new a();

    /* renamed from: androidx.lifecycle.m0$a */
    /* loaded from: classes.dex */
    public static final class a implements AbstractC26941a.b {
        a() {
        }
    }

    /* renamed from: androidx.lifecycle.m0$b */
    /* loaded from: classes.dex */
    public static final class b implements AbstractC26941a.b {
        b() {
        }
    }

    /* renamed from: androidx.lifecycle.m0$c */
    /* loaded from: classes.dex */
    public static final class c implements AbstractC26941a.b {
        c() {
        }
    }

    /* renamed from: androidx.lifecycle.m0$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f7355q = new d();

        d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final C1786o0 mo205i9(AbstractC26941a abstractC26941a) {
            AbstractC19074t.m100208f(abstractC26941a, "$this$initializer");
            return new C1786o0();
        }
    }

    /* renamed from: a */
    private static final C1780l0 m9325a(InterfaceC17712d interfaceC17712d, InterfaceC1756a1 interfaceC1756a1, String str, Bundle bundle) {
        C1784n0 m9328d = m9328d(interfaceC17712d);
        C1786o0 m9329e = m9329e(interfaceC1756a1);
        C1780l0 c1780l0 = (C1780l0) m9329e.m9346M().get(str);
        if (c1780l0 == null) {
            C1780l0 m9322a = C1780l0.f7345f.m9322a(m9328d.m9332b(str), bundle);
            m9329e.m9346M().put(str, m9322a);
            return m9322a;
        }
        return c1780l0;
    }

    /* renamed from: b */
    public static final C1780l0 m9326b(AbstractC26941a abstractC26941a) {
        AbstractC19074t.m100208f(abstractC26941a, "<this>");
        InterfaceC17712d interfaceC17712d = (InterfaceC17712d) abstractC26941a.mo138786a(f7352a);
        if (interfaceC17712d != null) {
            InterfaceC1756a1 interfaceC1756a1 = (InterfaceC1756a1) abstractC26941a.mo138786a(f7353b);
            if (interfaceC1756a1 != null) {
                Bundle bundle = (Bundle) abstractC26941a.mo138786a(f7354c);
                String str = (String) abstractC26941a.mo138786a(C1802w0.c.f7418b);
                if (str != null) {
                    return m9325a(interfaceC17712d, interfaceC1756a1, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* renamed from: c */
    public static final void m9327c(InterfaceC17712d interfaceC17712d) {
        AbstractC19074t.m100208f(interfaceC17712d, "<this>");
        AbstractC1785o.b mo9336b = interfaceC17712d.getLifecycle().mo9336b();
        if (mo9336b != AbstractC1785o.b.INITIALIZED && mo9336b != AbstractC1785o.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (interfaceC17712d.mo4648jf().m10705c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C1784n0 c1784n0 = new C1784n0(interfaceC17712d.mo4648jf(), (InterfaceC1756a1) interfaceC17712d);
            interfaceC17712d.mo4648jf().m10709h("androidx.lifecycle.internal.SavedStateHandlesProvider", c1784n0);
            interfaceC17712d.getLifecycle().mo9335a(new SavedStateHandleAttacher(c1784n0));
        }
    }

    /* renamed from: d */
    public static final C1784n0 m9328d(InterfaceC17712d interfaceC17712d) {
        C1784n0 c1784n0;
        AbstractC19074t.m100208f(interfaceC17712d, "<this>");
        C1938a.c m10705c = interfaceC17712d.mo4648jf().m10705c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (m10705c instanceof C1784n0) {
            c1784n0 = (C1784n0) m10705c;
        } else {
            c1784n0 = null;
        }
        if (c1784n0 != null) {
            return c1784n0;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* renamed from: e */
    public static final C1786o0 m9329e(InterfaceC1756a1 interfaceC1756a1) {
        AbstractC19074t.m100208f(interfaceC1756a1, "<this>");
        C26943c c26943c = new C26943c();
        c26943c.m138788a(AbstractC19061k0.m100169b(C1786o0.class), d.f7355q);
        return (C1786o0) new C1802w0(interfaceC1756a1, c26943c.m138789b()).m9379b("androidx.lifecycle.internal.SavedStateHandlesVM", C1786o0.class);
    }
}
