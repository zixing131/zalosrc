package com.zing.zalo.p077ui.zalocloud.lock;

import ac.C0732w;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.lock.ZCloudLockedVerificationView;
import com.zing.zalo.p077ui.zalocloud.resetcloud.ZaloCloudResetContainerView;
import com.zing.zalo.p077ui.zalocloud.restore.ZCloudRestoreContainerView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import java.util.Arrays;
import me0.AbstractC23152n3;
import nl.C23870a;
import o70.C24099q0;
import p348mi.AbstractC23306f;
import p645xh.C29628e;
import p649xl.AbstractC29718ag;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class ZCloudLockedVerificationView extends BaseZCloudView<AbstractC29718ag> {

    /* renamed from: X0 */
    private static long f71832X0;

    /* renamed from: R0 */
    private boolean f71834R0;

    /* renamed from: S0 */
    private boolean f71835S0;

    /* renamed from: T0 */
    private boolean f71836T0;

    /* renamed from: U0 */
    private boolean f71837U0;

    /* renamed from: V0 */
    private final Handler f71838V0 = new Handler(Looper.getMainLooper());

    /* renamed from: W0 */
    private final Runnable f71839W0 = new Runnable() { // from class: cc0.d
        @Override // java.lang.Runnable
        public final void run() {
            ZCloudLockedVerificationView.m77580KM(ZCloudLockedVerificationView.this);
        }
    };
    public static final C13926a Companion = new C13926a(null);

    /* renamed from: Y0 */
    private static EnumC13927b f71833Y0 = EnumC13927b.f71840p;

    /* renamed from: com.zing.zalo.ui.zalocloud.lock.ZCloudLockedVerificationView$a */
    /* loaded from: classes6.dex */
    public static final class C13926a {
        private C13926a() {
        }

        public /* synthetic */ C13926a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m77597e(Bundle bundle) {
            if (bundle != null) {
                ZCloudLockedVerificationView.Companion.m77601f(bundle.getLong("KEY_TIME_UNLOCKED_INFO", 0L));
                String string = bundle.getString("KEY_TRACKING_FLOW", "UNDEFINED");
                AbstractC19074t.m100207e(string, "getString(...)");
                ZCloudLockedVerificationView.f71833Y0 = EnumC13927b.valueOf(string);
            }
        }

        /* renamed from: b */
        public final Bundle m77598b(long j11, EnumC13927b enumC13927b) {
            AbstractC19074t.m100208f(enumC13927b, "trackingFlow");
            Bundle bundle = new Bundle();
            bundle.putLong("KEY_TIME_UNLOCKED_INFO", j11);
            bundle.putString("KEY_TRACKING_FLOW", enumC13927b.name());
            return bundle;
        }

        /* renamed from: c */
        public final long m77599c() {
            return ZCloudLockedVerificationView.f71832X0;
        }

        /* renamed from: d */
        public final boolean m77600d() {
            if ((m77599c() - AbstractC23306f.m120579F1().mo124314i()) / 1000 > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final void m77601f(long j11) {
            ZCloudLockedVerificationView.f71832X0 = j11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.zalocloud.lock.ZCloudLockedVerificationView$b */
    /* loaded from: classes6.dex */
    public static final class EnumC13927b {

        /* renamed from: p */
        public static final EnumC13927b f71840p = new EnumC13927b("UNDEFINED", 0);

        /* renamed from: q */
        public static final EnumC13927b f71841q = new EnumC13927b("CLOUD_RESTORE", 1);

        /* renamed from: r */
        public static final EnumC13927b f71842r = new EnumC13927b("TAB_ME", 2);

        /* renamed from: s */
        public static final EnumC13927b f71843s = new EnumC13927b("MAIN_TAB_ME", 3);

        /* renamed from: t */
        public static final EnumC13927b f71844t = new EnumC13927b("CLOUD_RESTORE_FROM_TAB_ME", 4);

        /* renamed from: u */
        private static final /* synthetic */ EnumC13927b[] f71845u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f71846v;

        static {
            EnumC13927b[] m77602b = m77602b();
            f71845u = m77602b;
            f71846v = AbstractC30166b.m148796a(m77602b);
        }

        private EnumC13927b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC13927b[] m77602b() {
            return new EnumC13927b[]{f71840p, f71841q, f71842r, f71843s, f71844t};
        }

        public static EnumC13927b valueOf(String str) {
            return (EnumC13927b) Enum.valueOf(EnumC13927b.class, str);
        }

        public static EnumC13927b[] values() {
            return (EnumC13927b[]) f71845u.clone();
        }
    }

    /* renamed from: AM */
    private final String m77570AM(long j11) {
        long mo124314i = j11 - AbstractC23306f.m120579F1().mo124314i();
        if (mo124314i <= 0) {
            m77583NM();
            m77572CM();
            finish();
        }
        long j12 = mo124314i / 1000;
        long j13 = 3600;
        long j14 = j12 / j13;
        long j15 = 60;
        long j16 = (j12 % j13) / j15;
        StringBuilder sb2 = new StringBuilder();
        if (j14 < 1) {
            sb2.append(m92651WI().getQuantityString(AbstractC7921d0.str_lock_time_in_minutes, (int) j16, Long.valueOf(j16)));
            sb2.append(" ");
            long j17 = j12 - (j16 * j15);
            sb2.append(m92651WI().getQuantityString(AbstractC7921d0.str_lock_time_in_seconds, (int) j17, Long.valueOf(j17)));
        } else {
            sb2.append(m92651WI().getQuantityString(AbstractC7921d0.str_lock_time_in_hours, (int) j14, Long.valueOf(j14)));
            sb2.append(" ");
            sb2.append(m92651WI().getQuantityString(AbstractC7921d0.str_lock_time_in_minutes, (int) j16, Long.valueOf(j16)));
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: BM */
    private final void m77571BM() {
        boolean z11;
        boolean z12;
        Companion.m77597e(m92642L3());
        boolean z13 = false;
        if (f71833Y0 == EnumC13927b.f71841q) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f71836T0 = z11;
        if (f71833Y0 == EnumC13927b.f71842r) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f71835S0 = z12;
        if (f71833Y0 == EnumC13927b.f71844t) {
            z13 = true;
        }
        this.f71837U0 = z13;
        m77595zM();
    }

    /* renamed from: CM */
    private final void m77572CM() {
        AbstractC23306f.m120636Y1().m128515G(true);
        C29628e.m147249E0().m147293v1();
        AbstractC23306f.m120679j2().m124813i1(true);
    }

    /* renamed from: DM */
    private final void m77573DM() {
        int i11;
        ZdsActionBar zdsActionBar = ((AbstractC29718ag) m77756kM()).f137275T;
        if (this.f71835S0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        zdsActionBar.setVisibility(i11);
        View divider = zdsActionBar.getDivider();
        if (divider != null) {
            divider.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }
    }

    /* renamed from: EM */
    private final void m77574EM() {
        ((AbstractC29718ag) m77756kM()).f137272Q.setOnClickListener(new View.OnClickListener() { // from class: cc0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudLockedVerificationView.m77575FM(ZCloudLockedVerificationView.this, view);
            }
        });
        ((AbstractC29718ag) m77756kM()).f137271P.setOnClickListener(new View.OnClickListener() { // from class: cc0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudLockedVerificationView.m77576GM(ZCloudLockedVerificationView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m77575FM(ZCloudLockedVerificationView zCloudLockedVerificationView, View view) {
        AbstractC19074t.m100208f(zCloudLockedVerificationView, "this$0");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_locked_help", null, null, null, 14, null);
        zCloudLockedVerificationView.m77579JM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m77576GM(ZCloudLockedVerificationView zCloudLockedVerificationView, View view) {
        AbstractC19074t.m100208f(zCloudLockedVerificationView, "this$0");
        if (zCloudLockedVerificationView.f71835S0) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_lock_home_reset_cloud", null, null, null, 14, null);
        } else {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_lock_understood", null, null, null, 14, null);
        }
        zCloudLockedVerificationView.m77583NM();
        if (zCloudLockedVerificationView.f71835S0) {
            zCloudLockedVerificationView.m77582MM();
            return;
        }
        zCloudLockedVerificationView.m77572CM();
        zCloudLockedVerificationView.m77581LM();
        if (zCloudLockedVerificationView.f71837U0) {
            zCloudLockedVerificationView.m77584OM();
        }
    }

    /* renamed from: HM */
    private final void m77577HM() {
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        int m124841x0 = m120679j2.m124841x0();
        RobotoTextView robotoTextView = ((AbstractC29718ag) m77756kM()).f137274S;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(m92651WI().getQuantityText(AbstractC7921d0.str_title_zcloud_overtimes_retry_max_attempt, m124841x0).toString(), Arrays.copyOf(new Object[]{Integer.valueOf(m124841x0)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
    }

    /* renamed from: IM */
    private final void m77578IM() {
        m77586QM(0L);
        if (this.f71835S0) {
            ((AbstractC29718ag) m77756kM()).f137271P.setText(m92652XI(AbstractC8020f0.str_title_cannot_connect_zcloud));
        }
    }

    /* renamed from: JM */
    private final void m77579JM() {
        AbstractC23152n3.m119050j0(m92689tK(), AbstractC23306f.m120583H().m110204g().m116312d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m77580KM(ZCloudLockedVerificationView zCloudLockedVerificationView) {
        AbstractC19074t.m100208f(zCloudLockedVerificationView, "this$0");
        if (zCloudLockedVerificationView.f71834R0) {
            return;
        }
        zCloudLockedVerificationView.m77595zM();
        zCloudLockedVerificationView.m77587RM();
        if (!zCloudLockedVerificationView.f71834R0) {
            zCloudLockedVerificationView.m77586QM(1000L);
        }
    }

    /* renamed from: LM */
    private final void m77581LM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        if (m92650VI() instanceof ZCloudRestoreContainerView) {
            C17487o0 m92662fJ = m92690uK().m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(MainTabView.class, bundle, 1, true);
                return;
            }
            return;
        }
        m92693xK().m93069k2(MainTabView.class, bundle, 1, true);
    }

    /* renamed from: MM */
    private final void m77582MM() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(ZaloCloudResetContainerView.class, new Bundle(), 1, true);
        }
    }

    /* renamed from: NM */
    private final void m77583NM() {
        this.f71834R0 = true;
        this.f71838V0.removeCallbacks(this.f71839W0);
    }

    /* renamed from: OM */
    private final void m77584OM() {
        AbstractC19444a.m101695c(new Runnable() { // from class: cc0.a
            @Override // java.lang.Runnable
            public final void run() {
                ZCloudLockedVerificationView.m77585PM();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m77585PM() {
        MainTabView m67645lM = MainTabView.m67645lM();
        if (m67645lM != null) {
            m67645lM.m67674JN(C24099q0.Companion.m125984a().m125969m());
        }
    }

    /* renamed from: QM */
    private final void m77586QM(long j11) {
        this.f71838V0.postDelayed(this.f71839W0, j11);
    }

    /* renamed from: RM */
    private final void m77587RM() {
        ((AbstractC29718ag) m77756kM()).f137273R.setText(m77570AM(f71832X0));
    }

    /* renamed from: zM */
    private final void m77595zM() {
        if (!Companion.m77600d()) {
            m77583NM();
            m77572CM();
            if (this.f71837U0) {
                m77581LM();
                m77584OM();
            } else if (this.f71836T0) {
                m77581LM();
            } else {
                finish();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return this.f71835S0;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        AbstractC2379w.m12430d(((AbstractC29718ag) m77756kM()).getRoot());
        m77571BM();
        m77573DM();
        m77577HM();
        m77578IM();
        m77574EM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (!Companion.m77600d() || this.f71835S0) {
            super.finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudRestoreLocked";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.zcloud_locked_verification_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        if (this.f71835S0) {
            finish();
        }
    }
}
