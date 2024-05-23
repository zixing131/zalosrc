package com.zing.zalo.p077ui.zviews;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.settingreminder.SettingReminderZinstantBanner;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zview.ZaloView;
import la0.C22340u;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import p716zh.C31877d;
import qi0.C25297f;
import qi0.EnumC25293b;
import qi0.EnumC25294c;
import s00.AbstractC26072g;
import s00.AbstractC26084s;
import s00.C26071f;
import s00.C26076k;

/* loaded from: classes6.dex */
public class sh0 {

    /* renamed from: a */
    ScrollViewVisibleChildViewDetector f81937a;

    /* renamed from: b */
    SettingReminderZinstantBanner f81938b;

    /* renamed from: c */
    AbstractC26072g f81939c;

    /* renamed from: d */
    ZaloView f81940d;

    /* renamed from: e */
    public long f81941e = 0;

    /* renamed from: f */
    public long f81942f = 0;

    /* renamed from: g */
    public boolean f81943g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.sh0$a */
    /* loaded from: classes6.dex */
    public class RunnableC16132a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f81944p;

        /* renamed from: q */
        final /* synthetic */ int f81945q;

        /* renamed from: r */
        final /* synthetic */ long f81946r;

        /* renamed from: s */
        final /* synthetic */ Drawable f81947s;

        RunnableC16132a(View view, int i11, long j11, Drawable drawable) {
            this.f81944p = view;
            this.f81945q = i11;
            this.f81946r = j11;
            this.f81947s = drawable;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC23136l9.m118648E0(this.f81944p, this.f81945q, this.f81946r, false, this.f81947s, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.sh0$b */
    /* loaded from: classes6.dex */
    public class C16133b extends AbstractC26072g {
        C16133b() {
        }

        @Override // s00.AbstractC26072g
        /* renamed from: a */
        public long mo87416a(View view) {
            try {
                if (sh0.this.m87412n() && sh0.m87400o(sh0.this.f81942f)) {
                    return Math.max(0L, Math.min(sh0.this.f81942f - SystemClock.elapsedRealtime(), 1380L));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return 0L;
        }

        @Override // s00.AbstractC26072g
        /* renamed from: c */
        public void mo87417c(View view) {
            try {
                if (!sh0.this.m87412n()) {
                    return;
                }
                if (sh0.this.m87399m(view)) {
                    sh0.this.f81937a.m50490p(view.getHeight());
                } else {
                    sh0 sh0Var = sh0.this;
                    sh0Var.f81941e = 0L;
                    sh0Var.f81943g = false;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // s00.AbstractC26072g
        /* renamed from: d */
        public boolean mo87418d(View view) {
            try {
                if (sh0.this.m87412n() && sh0.this.f81937a.getScrollY() < 200) {
                    sh0.this.f81941e = SystemClock.elapsedRealtime() + 550;
                    sh0.this.f81937a.m50489n();
                    sh0.this.f81943g = true;
                    return true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return false;
        }

        @Override // s00.AbstractC26072g
        /* renamed from: e */
        public void mo87419e(C26071f c26071f, String str, String str2) {
            super.mo87419e(c26071f, str, str2);
            try {
                ZaloView zaloView = sh0.this.f81940d;
                if ((zaloView instanceof SlidableZaloView) && zaloView.m92674mJ() && !sh0.this.f81940d.m92681pJ()) {
                    ((SlidableZaloView) sh0.this.f81940d).m78959pL(str, str2, 4, new C31877d());
                }
                if (c26071f != null) {
                    AbstractC26084s.m134269q(0, c26071f.f124227b);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    private void m87398f() {
        this.f81938b = null;
        this.f81939c = null;
        this.f81940d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public boolean m87399m(View view) {
        if (m87400o(this.f81941e) && view != null && view.getHeight() > 0 && this.f81937a.getScrollY() < 200) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m87400o(long j11) {
        if (j11 != 0 && j11 > SystemClock.elapsedRealtime()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m87401p(boolean z11, View view, int i11, long j11, Drawable drawable, HightLightSettingView hightLightSettingView) {
        if (z11) {
            AbstractC23136l9.m118648E0(view, i11, j11, false, drawable, null);
        } else {
            hightLightSettingView.m75743b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m87402q(View view, HightLightSettingView hightLightSettingView, C22340u c22340u, long j11, C13306b c13306b) {
        try {
            m87406g(view, hightLightSettingView, c22340u, j11, c13306b);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    private TooltipView m87404v(View view, C13306b c13306b, C22340u c22340u, final Runnable runnable) {
        int i11;
        if (view == null || c13306b == null || c22340u == null || TextUtils.isEmpty(c22340u.m115792e())) {
            return null;
        }
        if (c22340u.m115789b() == 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        C25297f m130959a = C25297f.Companion.m130959a(view.getContext());
        m130959a.m130925c0(view);
        m130959a.m130918X(EnumC25294c.TOP);
        m130959a.m130920Z(false);
        m130959a.m130912R(EnumC25293b.RECTANGLE);
        m130959a.m130943l0(i11);
        m130959a.m130933g0(c22340u.m115792e());
        if (!TextUtils.isEmpty(c22340u.m115788a())) {
            m130959a.m130927d0(c22340u.m115788a());
        }
        TooltipView tooltipView = new TooltipView(view.getContext());
        tooltipView.setConfigs(m130959a);
        tooltipView.m90734d0();
        tooltipView.setOnTooltipFinishedListener(new TooltipView.InterfaceC16938b() { // from class: com.zing.zalo.ui.zviews.rh0
            @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
            /* renamed from: a */
            public final void mo66113a(TooltipView tooltipView2, int i12, int i13, boolean z11) {
                runnable.run();
            }
        });
        tooltipView.setTooltipId(m130959a.m130946n());
        tooltipView.setTooltipManager(c13306b);
        tooltipView.m90733c0();
        return tooltipView;
    }

    /* renamed from: e */
    public boolean m87405e(ZaloView zaloView, int i11) {
        ViewStub viewStub;
        try {
            C26071f m134222s = C26076k.m134208q().m134222s(i11);
            if (m134222s != null && m134222s.m134176g()) {
                if (this.f81938b == null && (viewStub = (ViewStub) zaloView.m92656bJ().findViewById(AbstractC6918a0.viewstub_setting_zinstant_banner)) != null) {
                    this.f81938b = (SettingReminderZinstantBanner) viewStub.inflate();
                }
                SettingReminderZinstantBanner settingReminderZinstantBanner = this.f81938b;
                if (settingReminderZinstantBanner != null && !settingReminderZinstantBanner.mo50498a(m134222s)) {
                    this.f81940d = zaloView;
                    m87407h();
                    int m118722k0 = AbstractC23136l9.m118722k0();
                    this.f81938b.setSettingReminderListener(this.f81939c);
                    this.f81938b.mo50499b(m134222s, m118722k0);
                    return true;
                }
                return true;
            }
            SettingReminderZinstantBanner settingReminderZinstantBanner2 = this.f81938b;
            if (settingReminderZinstantBanner2 != null) {
                settingReminderZinstantBanner2.mo50500c();
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    void m87406g(final View view, final HightLightSettingView hightLightSettingView, C22340u c22340u, final long j11, C13306b c13306b) {
        if (c22340u == null) {
            return;
        }
        final boolean m119660l = AbstractC23217t2.m119660l(c22340u.m115793f());
        final int m119657i = AbstractC23217t2.m119657i(c22340u.m115793f());
        final Drawable background = view.getBackground();
        TooltipView m87404v = m87404v(view, c13306b, c22340u, new Runnable() { // from class: com.zing.zalo.ui.zviews.qh0
            @Override // java.lang.Runnable
            public final void run() {
                sh0.m87401p(m119660l, view, m119657i, j11, background, hightLightSettingView);
            }
        });
        if (m119660l) {
            AbstractC23136l9.m118648E0(view, m119657i, j11, true, background, m87404v);
            hightLightSettingView.m75746h(view, j11, m87404v, c22340u.m115789b(), true, new RunnableC16132a(view, m119657i, j11, background));
        } else {
            hightLightSettingView.m75745g(view, j11, m87404v);
        }
    }

    /* renamed from: h */
    public void m87407h() {
        if (this.f81939c == null) {
            this.f81939c = new C16133b();
        }
    }

    /* renamed from: i */
    public SettingReminderZinstantBanner m87408i() {
        return this.f81938b;
    }

    /* renamed from: j */
    public void m87409j(View view, HightLightSettingView hightLightSettingView, int i11) {
        m87410k(view, hightLightSettingView, new C22340u(0, i11), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m87410k(final View view, final HightLightSettingView hightLightSettingView, final C22340u c22340u, final C13306b c13306b) {
        long j11;
        long j12;
        long j13;
        long j14;
        try {
            if (m87412n() && c22340u != null) {
                if (view != null && view.getVisibility() == 0) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    if (iArr[1] + (view.getHeight() / 2) > AbstractC23136l9.m118713h0() / 2) {
                        this.f81937a.scrollTo(0, (iArr[1] + (view.getHeight() / 2)) - (AbstractC23136l9.m118713h0() / 2));
                        j12 = 80;
                    } else {
                        j12 = 0;
                    }
                    long m115791d = c22340u.m115791d();
                    if (m115791d < 0) {
                        j14 = 2147483647L;
                    } else if (m115791d > 0) {
                        j14 = m115791d * 1000;
                    } else {
                        j13 = 1000;
                        if (!AbstractC23217t2.m119659k(c22340u.m115793f())) {
                            if (j12 > 0) {
                                final long j15 = j13;
                                view.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ph0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        sh0.this.m87402q(view, hightLightSettingView, c22340u, j15, c13306b);
                                    }
                                }, j12);
                            } else {
                                m87406g(view, hightLightSettingView, c22340u, j13, c13306b);
                            }
                            j12 = j12 + j13 + 300;
                            j11 = 0;
                        } else {
                            j11 = 0;
                        }
                    }
                    j13 = j14;
                    if (!AbstractC23217t2.m119659k(c22340u.m115793f())) {
                    }
                } else {
                    j11 = 0;
                    j12 = 0;
                }
                if (j12 > j11) {
                    this.f81942f = SystemClock.elapsedRealtime() + j12;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public boolean m87411l(View view, Runnable runnable) {
        if (view == null) {
            return false;
        }
        try {
            if (m87400o(this.f81941e) && this.f81943g) {
                this.f81943g = false;
                long max = Math.max(0L, Math.min(this.f81941e - SystemClock.elapsedRealtime(), 550L));
                if (max > 0) {
                    view.removeCallbacks(runnable);
                    view.postDelayed(runnable, max);
                    return true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: n */
    public boolean m87412n() {
        return this.f81937a != null;
    }

    /* renamed from: s */
    public void m87413s() {
        try {
            SettingReminderZinstantBanner settingReminderZinstantBanner = this.f81938b;
            if (settingReminderZinstantBanner != null) {
                settingReminderZinstantBanner.m50505l();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public void m87414t() {
        try {
            SettingReminderZinstantBanner settingReminderZinstantBanner = this.f81938b;
            if (settingReminderZinstantBanner != null) {
                settingReminderZinstantBanner.m50506m();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    public void m87415u(ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector) {
        this.f81937a = scrollViewVisibleChildViewDetector;
        m87398f();
    }
}
