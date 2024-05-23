package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C1938a;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Map;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: androidx.lifecycle.n0 */
/* loaded from: classes.dex */
public final class C1784n0 implements C1938a.c {

    /* renamed from: a */
    private final C1938a f7356a;

    /* renamed from: b */
    private boolean f7357b;

    /* renamed from: c */
    private Bundle f7358c;

    /* renamed from: d */
    private final InterfaceC24854k f7359d;

    /* renamed from: androidx.lifecycle.n0$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC1756a1 f7360q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1756a1 interfaceC1756a1) {
            super(0);
            this.f7360q = interfaceC1756a1;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1786o0 mo12V4() {
            return AbstractC1782m0.m9329e(this.f7360q);
        }
    }

    public C1784n0(C1938a c1938a, InterfaceC1756a1 interfaceC1756a1) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c1938a, "savedStateRegistry");
        AbstractC19074t.m100208f(interfaceC1756a1, "viewModelStoreOwner");
        this.f7356a = c1938a;
        m129210a = AbstractC24856m.m129210a(new a(interfaceC1756a1));
        this.f7359d = m129210a;
    }

    /* renamed from: c */
    private final C1786o0 m9331c() {
        return (C1786o0) this.f7359d.getValue();
    }

    @Override // androidx.savedstate.C1938a.c
    /* renamed from: a */
    public Bundle mo4659a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f7358c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : m9331c().m9346M().entrySet()) {
            String str = (String) entry.getKey();
            Bundle mo4659a = ((C1780l0) entry.getValue()).m9320e().mo4659a();
            if (!AbstractC19074t.m100204b(mo4659a, Bundle.EMPTY)) {
                bundle.putBundle(str, mo4659a);
            }
        }
        this.f7357b = false;
        return bundle;
    }

    /* renamed from: b */
    public final Bundle m9332b(String str) {
        Bundle bundle;
        AbstractC19074t.m100208f(str, "key");
        m9333d();
        Bundle bundle2 = this.f7358c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.f7358c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f7358c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f7358c = null;
        }
        return bundle;
    }

    /* renamed from: d */
    public final void m9333d() {
        if (!this.f7357b) {
            this.f7358c = this.f7356a.m10704b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f7357b = true;
            m9331c();
        }
    }
}
