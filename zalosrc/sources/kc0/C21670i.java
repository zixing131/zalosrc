package kc0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Map;
import ke0.C21699a;
import og0.EnumC24251b;
import p487rl.C25826g;
import pm0.C24848g0;

/* renamed from: kc0.i */
/* loaded from: classes6.dex */
public final class C21670i extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C21699a f105135s;

    /* renamed from: t */
    private final C1761c0 f105136t;

    /* renamed from: u */
    private final C1761c0 f105137u;

    /* renamed from: v */
    private final HashMap f105138v;

    /* renamed from: kc0.i$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C21670i(C21699a c21699a) {
        AbstractC19074t.m100208f(c21699a, "zCloudOptInUseCase");
        this.f105135s = c21699a;
        this.f105136t = new C1761c0();
        this.f105137u = new C1761c0();
        this.f105138v = new HashMap();
        for (EnumC24251b enumC24251b : EnumC24251b.values()) {
            this.f105138v.put(enumC24251b, new C25826g(true));
        }
    }

    /* renamed from: M */
    public final HashMap m111683M() {
        return this.f105138v;
    }

    /* renamed from: N */
    public final void m111684N(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "savedInstanceState");
        for (Map.Entry entry : this.f105138v.entrySet()) {
            EnumC24251b enumC24251b = (EnumC24251b) entry.getKey();
            C25826g c25826g = (C25826g) entry.getValue();
            Bundle bundle2 = bundle.getBundle(enumC24251b.name());
            if (bundle2 != null) {
                AbstractC19074t.m100205c(bundle2);
                c25826g.m133201b(bundle2.getBoolean("is_checked"));
            }
        }
    }

    /* renamed from: O */
    public final LiveData m111685O() {
        return this.f105137u;
    }

    /* renamed from: P */
    public final LiveData m111686P() {
        return this.f105136t;
    }

    /* renamed from: Q */
    public final void m111687Q(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        for (Map.Entry entry : this.f105138v.entrySet()) {
            EnumC24251b enumC24251b = (EnumC24251b) entry.getKey();
            C25826g c25826g = (C25826g) entry.getValue();
            String name = enumC24251b.name();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("is_checked", c25826g.m133200a());
            C24848g0 c24848g0 = C24848g0.f119245a;
            bundle.putBundle(name, bundle2);
        }
    }
}
