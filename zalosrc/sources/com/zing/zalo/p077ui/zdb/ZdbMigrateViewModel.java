package com.zing.zalo.p077ui.zdb;

import ag0.AbstractC0837p0;
import ag0.InterfaceC0806b1;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1766e0;
import androidx.lifecycle.InterfaceC1799v;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p077ui.zdb.ZdbMigrateViewModel;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import nh0.InterfaceC23792b;
import p205hc.AbstractC19963b;
import p205hc.InterfaceC19969h;
import p348mi.AbstractC23306f;
import p363nh.C23744a;

/* loaded from: classes6.dex */
public final class ZdbMigrateViewModel extends AbstractC19963b implements InterfaceC1799v, C23744a.c {
    public static final C14017a Companion = new C14017a(null);

    /* renamed from: A */
    private final DecelerateInterpolator f72058A;

    /* renamed from: B */
    private long f72059B;

    /* renamed from: t */
    private final InterfaceC23792b f72060t;

    /* renamed from: u */
    private final C1761c0 f72061u;

    /* renamed from: v */
    private final C1761c0 f72062v;

    /* renamed from: w */
    private C1761c0 f72063w;

    /* renamed from: x */
    private final C1761c0 f72064x;

    /* renamed from: y */
    private final C1761c0 f72065y;

    /* renamed from: z */
    private boolean f72066z;

    /* renamed from: com.zing.zalo.ui.zdb.ZdbMigrateViewModel$a */
    /* loaded from: classes6.dex */
    public static final class C14017a {
        private C14017a() {
        }

        public /* synthetic */ C14017a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C14018b m77967a(Bundle bundle) {
            if (bundle != null) {
                return new C14018b(bundle.getLong("START_SHOW_TIME", 0L));
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zdb.ZdbMigrateViewModel$b */
    /* loaded from: classes6.dex */
    public static final class C14018b implements InterfaceC19969h {

        /* renamed from: a */
        private final long f72067a;

        public C14018b(long j11) {
            this.f72067a = j11;
        }

        /* renamed from: a */
        public final long m77968a() {
            return this.f72067a;
        }
    }

    public ZdbMigrateViewModel() {
        InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
        AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
        this.f72060t = m120579F1;
        this.f72061u = new C1761c0();
        this.f72062v = new C1761c0();
        this.f72063w = new C1761c0();
        this.f72064x = new C1761c0();
        this.f72065y = new C1761c0();
        this.f72058A = new DecelerateInterpolator(2.0f);
    }

    /* renamed from: Y */
    private final void m77955Y(final int i11) {
        int i12;
        if (!this.f72066z) {
            if (this.f72059B <= 0) {
                this.f72059B = this.f72060t.mo124319c();
            }
            if (i11 > 0) {
                i12 = i11;
            } else {
                i12 = 45000;
            }
            final float f11 = i12;
            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: lc0.a
                @Override // java.lang.Runnable
                public final void run() {
                    ZdbMigrateViewModel.m77956Z(ZdbMigrateViewModel.this, f11, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0005 A[SYNTHETIC] */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m77956Z(final ZdbMigrateViewModel zdbMigrateViewModel, float f11, int i11) {
        long mo124319c;
        int interpolation;
        boolean z11;
        long j11;
        AbstractC19074t.m100208f(zdbMigrateViewModel, "this$0");
        while (true) {
            try {
                Thread.sleep(150L);
                mo124319c = zdbMigrateViewModel.f72060t.mo124319c() - zdbMigrateViewModel.f72059B;
                interpolation = (int) (99 * zdbMigrateViewModel.f72058A.getInterpolation(((float) mo124319c) / f11));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            if (C7967l.Companion.m42748b().m42734K() && mo124319c < i11) {
                z11 = false;
                C1761c0 c1761c0 = zdbMigrateViewModel.f72065y;
                if (z11) {
                    interpolation = 100;
                }
                c1761c0.mo9221n(Integer.valueOf(interpolation));
                if (!z11) {
                    Runnable runnable = new Runnable() { // from class: lc0.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            ZdbMigrateViewModel.m77957a0(ZdbMigrateViewModel.this);
                        }
                    };
                    if (z11) {
                        j11 = 400;
                    } else {
                        j11 = 0;
                    }
                    AbstractC19444a.m101694b(runnable, j11);
                    return;
                }
                continue;
            }
            z11 = true;
            C1761c0 c1761c02 = zdbMigrateViewModel.f72065y;
            if (z11) {
            }
            c1761c02.mo9221n(Integer.valueOf(interpolation));
            if (!z11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m77957a0(ZdbMigrateViewModel zdbMigrateViewModel) {
        AbstractC19074t.m100208f(zdbMigrateViewModel, "this$0");
        AbstractC0924m0.m3286Nh(true);
        zdbMigrateViewModel.f72064x.mo9221n(Boolean.TRUE);
    }

    /* renamed from: b0 */
    private final void m77958b0() {
        C7967l.d dVar = C7967l.Companion;
        boolean m42742y = dVar.m42748b().m42742y();
        boolean m42731F = dVar.m42748b().m42731F();
        this.f72062v.mo9221n(Boolean.valueOf(m42731F));
        if (!m42731F) {
            this.f72061u.mo9221n(Boolean.valueOf(!m42742y));
            if (m42742y) {
                if (dVar.m42748b().m42733H()) {
                    m77955Y(45000);
                    return;
                } else {
                    if (!this.f72066z) {
                        this.f72064x.mo9221n(Boolean.TRUE);
                        return;
                    }
                    return;
                }
            }
            this.f72063w.mo9221n(Integer.valueOf((int) (dVar.m42748b().m42729B() / 1048576)));
        }
    }

    /* renamed from: Q */
    public final C1761c0 m77959Q() {
        return this.f72064x;
    }

    /* renamed from: R */
    public final C1761c0 m77960R() {
        return this.f72065y;
    }

    /* renamed from: S */
    public final C1761c0 m77961S() {
        return this.f72063w;
    }

    /* renamed from: T */
    public final C1761c0 m77962T() {
        return this.f72062v;
    }

    /* renamed from: U */
    public final C1761c0 m77963U() {
        return this.f72061u;
    }

    /* renamed from: V */
    public final void m77964V() {
        InterfaceC0806b1 m2237f = AbstractC0837p0.Companion.m2237f();
        final C7967l m42748b = C7967l.Companion.m42748b();
        m2237f.mo2040a(new Runnable() { // from class: lc0.b
            @Override // java.lang.Runnable
            public final void run() {
                C7967l.this.m42738q();
            }
        });
    }

    /* renamed from: W */
    public void m77965W(C14018b c14018b) {
        long j11;
        super.m103748N(c14018b);
        if (c14018b != null) {
            j11 = c14018b.m77968a();
        } else {
            j11 = 0;
        }
        this.f72059B = j11;
    }

    /* renamed from: X */
    public final void m77966X(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "out");
        bundle.putLong("START_SHOW_TIME", this.f72059B);
    }

    @InterfaceC1766e0(AbstractC1785o.a.ON_PAUSE)
    public final void onPause() {
        C23744a.Companion.m124119a().m124117e(this, 6044);
    }

    @InterfaceC1766e0(AbstractC1785o.a.ON_RESUME)
    public final void onResume() {
        m77958b0();
        C23744a.Companion.m124119a().m124115b(this, 6044);
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 6044) {
            m77958b0();
        }
    }
}
