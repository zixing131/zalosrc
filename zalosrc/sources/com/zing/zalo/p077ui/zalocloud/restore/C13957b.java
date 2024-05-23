package com.zing.zalo.p077ui.zalocloud.restore;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.p077ui.zalocloud.restore.AbstractC13956a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.C19964c;

/* renamed from: com.zing.zalo.ui.zalocloud.restore.b */
/* loaded from: classes6.dex */
public final class C13957b extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C1761c0 f71920s = new C1761c0();

    /* renamed from: t */
    private final C1761c0 f71921t = new C1761c0();

    /* renamed from: u */
    private C13958c f71922u;

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.b$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: M */
    public final void m77710M() {
        this.f71921t.mo9221n(new C19964c(AbstractC13956a.a.f71917a));
    }

    /* renamed from: N */
    public final void m77711N(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("ARG_IS_INIT")) {
            this.f71921t.mo9221n(new C19964c(AbstractC13956a.b.f71918a));
        }
    }

    /* renamed from: O */
    public final C13958c m77712O() {
        return this.f71922u;
    }

    /* renamed from: P */
    public final LiveData m77713P() {
        return this.f71921t;
    }

    /* renamed from: Q */
    public final LiveData m77714Q() {
        return this.f71920s;
    }

    /* renamed from: R */
    public final void m77715R(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        bundle.putBoolean("ARG_IS_INIT", true);
    }

    /* renamed from: S */
    public final void m77716S(C13958c c13958c) {
        this.f71922u = c13958c;
    }

    /* renamed from: T */
    public final void m77717T() {
        this.f71921t.mo9221n(new C19964c(AbstractC13956a.c.f71919a));
    }
}
