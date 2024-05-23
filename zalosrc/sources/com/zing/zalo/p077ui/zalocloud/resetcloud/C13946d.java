package com.zing.zalo.p077ui.zalocloud.resetcloud;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import ch0.AbstractC3489d;
import com.zing.zalo.p077ui.zalocloud.resetcloud.AbstractC13945c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import og0.C24252c;
import og0.EnumC24251b;
import p205hc.C19964c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import si.C26263i;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.d */
/* loaded from: classes6.dex */
public final class C13946d extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C1761c0 f71894s = new C1761c0();

    /* renamed from: t */
    private final C1761c0 f71895t = new C1761c0();

    /* renamed from: u */
    private final InterfaceC24854k f71896u;

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.d$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.d$b */
    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f71897p = new b("EMPTY_DATA", 0);

        /* renamed from: q */
        public static final b f71898q = new b("NORMAL", 1);

        /* renamed from: r */
        private static final /* synthetic */ b[] f71899r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f71900s;

        static {
            b[] m77680b = m77680b();
            f71899r = m77680b;
            f71900s = AbstractC30166b.m148796a(m77680b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m77680b() {
            return new b[]{f71897p, f71898q};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f71899r.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.d$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f71901q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            boolean z11;
            boolean m135012E = C26263i.m135012E();
            if (AbstractC3489d.m17508p() && m135012E) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    public C13946d() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(c.f71901q);
        this.f71896u = m129210a;
    }

    /* renamed from: P */
    private final boolean m77675P() {
        return ((Boolean) this.f71896u.getValue()).booleanValue();
    }

    /* renamed from: M */
    public final b m77676M() {
        if (!m77675P() && !C24252c.f117152a.m126600f(EnumC24251b.f117146q)) {
            return b.f71897p;
        }
        return b.f71898q;
    }

    /* renamed from: N */
    public final void m77677N(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("ARG_IS_INIT")) {
            this.f71895t.mo9221n(new C19964c(AbstractC13945c.a.f71893a));
        }
    }

    /* renamed from: O */
    public final LiveData m77678O() {
        return this.f71895t;
    }

    /* renamed from: Q */
    public final void m77679Q(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        bundle.putBoolean("ARG_IS_INIT", true);
    }
}
