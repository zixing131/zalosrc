package androidx.fragment.app;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p534u1.AbstractC26941a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.i */
/* loaded from: classes2.dex */
public class C1735i extends AbstractC1796t0 {

    /* renamed from: y */
    private static final C1802w0.b f7114y = new a();

    /* renamed from: v */
    private final boolean f7118v;

    /* renamed from: s */
    private final HashSet f7115s = new HashSet();

    /* renamed from: t */
    private final HashMap f7116t = new HashMap();

    /* renamed from: u */
    private final HashMap f7117u = new HashMap();

    /* renamed from: w */
    private boolean f7119w = false;

    /* renamed from: x */
    private boolean f7120x = false;

    /* renamed from: androidx.fragment.app.i$a */
    /* loaded from: classes2.dex */
    static class a implements C1802w0.b {
        a() {
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            return new C1735i(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1735i(boolean z11) {
        this.f7118v = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static C1735i m9129P(C1808z0 c1808z0) {
        return (C1735i) new C1802w0(c1808z0, f7114y).m9378a(C1735i.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1796t0
    /* renamed from: J */
    public void mo9130J() {
        if (LayoutInflaterFactory2C1734h.f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCleared called for ");
            sb2.append(this);
        }
        this.f7119w = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean m9131M(Fragment fragment) {
        return this.f7115s.add(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m9132N(Fragment fragment) {
        if (LayoutInflaterFactory2C1734h.f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Clearing non-config state for ");
            sb2.append(fragment);
        }
        C1735i c1735i = (C1735i) this.f7116t.get(fragment.f6959t);
        if (c1735i != null) {
            c1735i.mo9130J();
            this.f7116t.remove(fragment.f6959t);
        }
        C1808z0 c1808z0 = (C1808z0) this.f7117u.get(fragment.f6959t);
        if (c1808z0 != null) {
            c1808z0.m9414a();
            this.f7117u.remove(fragment.f6959t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public C1735i m9133O(Fragment fragment) {
        C1735i c1735i = (C1735i) this.f7116t.get(fragment.f6959t);
        if (c1735i == null) {
            C1735i c1735i2 = new C1735i(this.f7118v);
            this.f7116t.put(fragment.f6959t, c1735i2);
            return c1735i2;
        }
        return c1735i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public Collection m9134Q() {
        return this.f7115s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public C1808z0 m9135R(Fragment fragment) {
        C1808z0 c1808z0 = (C1808z0) this.f7117u.get(fragment.f6959t);
        if (c1808z0 == null) {
            C1808z0 c1808z02 = new C1808z0();
            this.f7117u.put(fragment.f6959t, c1808z02);
            return c1808z02;
        }
        return c1808z0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public boolean m9136S() {
        return this.f7119w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean m9137T(Fragment fragment) {
        return this.f7115s.remove(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public boolean m9138U(Fragment fragment) {
        if (!this.f7115s.contains(fragment)) {
            return true;
        }
        if (this.f7118v) {
            return this.f7119w;
        }
        return !this.f7120x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1735i c1735i = (C1735i) obj;
        if (this.f7115s.equals(c1735i.f7115s) && this.f7116t.equals(c1735i.f7116t) && this.f7117u.equals(c1735i.f7117u)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f7115s.hashCode() * 31) + this.f7116t.hashCode()) * 31) + this.f7117u.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f7115s.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f7116t.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f7117u.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
