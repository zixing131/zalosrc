package com.zing.zalo.p077ui.backuprestore.detail;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.lifecycle.InterfaceC1764d0;
import b50.C2556d;
import bi0.AbstractC2807a;
import c50.C3294e;
import c50.C3295f;
import c50.C3297h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.backuprestore.bottomsheet.AdditionOptionForLatestBackupBottomSheet;
import com.zing.zalo.p077ui.backuprestore.configbackup.ConfigBackupView;
import com.zing.zalo.p077ui.backuprestore.detail.BackupDetailView;
import com.zing.zalo.p077ui.backuprestore.detail.C11003b;
import com.zing.zalo.p077ui.backuprestore.explain.BackupInfoExplainView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessagePassManageView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessageSetPassView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView;
import com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView;
import com.zing.zalo.p077ui.backuprestore.widget.SyncEmptyBackupView;
import com.zing.zalo.p077ui.backuprestore.widget.SyncProcessorView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zalocloud.restore.C13958c;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.PcSyncRequestView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.settingreminder.SettingReminderZinstantBanner;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import dg0.AbstractC17927b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import ho0.AbstractC20110a;
import i30.C20223b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k30.C21459a;
import kn.AbstractC21777d;
import m40.InterfaceC22830a;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import p297kd.C21688c;
import p297kd.C21690e;
import p320ld.C22438j;
import p320ld.C22442n;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p387oc.C24199c;
import p421pc.C24720a;
import p443qc.AbstractC25219c;
import p479rc.C25724a;
import p484ri.C25804a;
import p484ri.C25806c;
import p525ti.C26701b;
import p542ub.InterfaceC27218a;
import p586vt.AbstractC28626k;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import p649xl.C29881k;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import qm0.AbstractC25358n;
import s00.AbstractC26084s;
import s00.C26071f;
import s00.C26076k;
import s00.InterfaceC26066a;
import sc.C26220b;
import si.C26263i;
import ui0.C27280g;
import x60.AbstractC29394g;

/* loaded from: classes5.dex */
public final class BackupDetailView extends SlidableZaloView implements InterfaceC22830a, InterfaceC28625j, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, SyncEmptyBackupView.InterfaceC11144a, SyncBannerCommonView.InterfaceC11142a, SyncProcessorView.InterfaceC11146a, InterfaceC17463d.d {
    public static final C10993a Companion = new C10993a(null);

    /* renamed from: P0 */
    private boolean f55528P0;

    /* renamed from: Q0 */
    private C29881k f55529Q0;

    /* renamed from: R0 */
    private View f55530R0;

    /* renamed from: S0 */
    private View f55531S0;

    /* renamed from: T0 */
    private RobotoTextView f55532T0;

    /* renamed from: U0 */
    private SyncEmptyBackupView f55533U0;

    /* renamed from: V0 */
    private SyncProcessorView f55534V0;

    /* renamed from: W0 */
    private SyncBannerCommonView f55535W0;

    /* renamed from: X0 */
    private SyncBannerCommonView f55536X0;

    /* renamed from: Y0 */
    private KeyEventCallbackC17462c f55537Y0;

    /* renamed from: Z0 */
    private Rect f55538Z0;

    /* renamed from: c1 */
    private InterfaceC11002a f55541c1;

    /* renamed from: d1 */
    private C11007f f55542d1;

    /* renamed from: a1 */
    private final sh0 f55539a1 = new sh0();

    /* renamed from: b1 */
    private final RunnableC10994b f55540b1 = new RunnableC10994b();

    /* renamed from: e1 */
    private boolean f55543e1 = true;

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.BackupDetailView$a */
    /* loaded from: classes5.dex */
    public static final class C10993a {
        private C10993a() {
        }

        public /* synthetic */ C10993a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.BackupDetailView$b */
    /* loaded from: classes5.dex */
    private final class RunnableC10994b implements Runnable {

        /* renamed from: p */
        private int f55544p;

        /* renamed from: q */
        private int f55545q;

        /* renamed from: r */
        private int f55546r;

        /* renamed from: s */
        private int f55547s;

        /* renamed from: t */
        private C21690e f55548t;

        /* renamed from: u */
        private boolean f55549u = true;

        /* renamed from: v */
        private boolean f55550v;

        public RunnableC10994b() {
        }

        /* renamed from: a */
        private final void m57337a() {
            BackupDetailView.this.mo57312Y0();
            BackupDetailView.this.mo57307R1(3);
            BackupDetailView.this.m57286zN();
        }

        /* renamed from: b */
        public final void m57338b(C21688c.b bVar) {
            AbstractC19074t.m100208f(bVar, "syncStateMessage");
            this.f55544p = bVar.f105263d;
            this.f55545q = bVar.f132722a;
            this.f55546r = bVar.m111856g();
            this.f55547s = bVar.m111855f();
            this.f55550v = bVar.f105265f;
            AbstractC28626k m143178a = bVar.m143178a();
            if (m143178a != null) {
                C21690e c21690e = (C21690e) m143178a;
                this.f55548t = c21690e;
                this.f55549u = c21690e.m111898x();
            }
            AbstractC20110a.f98889a.mo104548a("SyncStateMessage=" + bVar, new Object[0]);
        }

        @Override // java.lang.Runnable
        public void run() {
            long j11;
            C3294e c3294e;
            InterfaceC11002a interfaceC11002a = null;
            if (C22447s.m116035g0(this.f55545q)) {
                m57337a();
                int i11 = this.f55545q;
                if (i11 != 12 && i11 != 13 && i11 != 15 && i11 != 16) {
                    String m115989e = C22442n.m115989e(this.f55545q, C22447s.m115991A(this.f55548t, this.f55546r), this.f55550v);
                    AbstractC20110a.f98889a.mo104548a(C22447s.m116000F(this.f55545q) + ", actionType=" + this.f55547s + ", msgText=" + m115989e + ", process=" + this.f55544p + "%", new Object[0]);
                    SyncProcessorView syncProcessorView = BackupDetailView.this.f55534V0;
                    if (syncProcessorView != null) {
                        c3294e = syncProcessorView.getSyncStateData();
                    } else {
                        c3294e = null;
                    }
                    C3297h.m16735e(c3294e, m115989e, this.f55544p);
                    BackupDetailView.this.m57220UN();
                }
            }
            int i12 = this.f55545q;
            if (i12 != 0) {
                if (i12 != 1) {
                    switch (i12) {
                        case 17:
                            BackupDetailView.this.m57228YN(this.f55548t);
                            BackupDetailView backupDetailView = BackupDetailView.this;
                            InterfaceC11002a interfaceC11002a2 = backupDetailView.f55541c1;
                            if (interfaceC11002a2 == null) {
                                AbstractC19074t.m100223u("presenter");
                            } else {
                                interfaceC11002a = interfaceC11002a2;
                            }
                            backupDetailView.mo57316eB(interfaceC11002a.mo57393zh());
                            return;
                        case 18:
                            BackupDetailView.this.f72421L0.mo49282B8(C22442n.m115989e(18, this.f55546r, this.f55550v), false);
                            return;
                        case 19:
                            BackupDetailView.this.f72421L0.mo49282B8(C22442n.m115989e(19, this.f55546r, this.f55550v), false);
                            return;
                        case 20:
                            BackupDetailView.this.f72421L0.mo49315c4();
                            InterfaceC11002a interfaceC11002a3 = BackupDetailView.this.f55541c1;
                            if (interfaceC11002a3 == null) {
                                AbstractC19074t.m100223u("presenter");
                                interfaceC11002a3 = null;
                            }
                            interfaceC11002a3.mo57349I1();
                            BackupDetailView.this.mo57317g4("");
                            BackupDetailView.this.mo57314a4();
                            InterfaceC11002a interfaceC11002a4 = BackupDetailView.this.f55541c1;
                            if (interfaceC11002a4 == null) {
                                AbstractC19074t.m100223u("presenter");
                            } else {
                                interfaceC11002a = interfaceC11002a4;
                            }
                            interfaceC11002a.mo57391w1();
                            return;
                        case 21:
                            BackupDetailView.this.f72421L0.mo49315c4();
                            ToastUtils.showMess(true, C22442n.m115989e(21, this.f55546r, this.f55550v));
                            return;
                        case 22:
                            BackupDetailView.this.f72421L0.mo49315c4();
                            return;
                        default:
                            return;
                    }
                }
                if (AbstractC3489d.m17514v()) {
                    BackupDetailView backupDetailView2 = BackupDetailView.this;
                    TargetBackupInfo m135058w = C26263i.m135058w();
                    if (m135058w != null) {
                        j11 = m135058w.m40960p();
                    } else {
                        j11 = 0;
                    }
                    backupDetailView2.mo57294I5(1, j11);
                    return;
                }
                return;
            }
            BackupDetailView.this.f72421L0.mo49315c4();
            InterfaceC11002a interfaceC11002a5 = BackupDetailView.this.f55541c1;
            if (interfaceC11002a5 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC11002a = interfaceC11002a5;
            }
            interfaceC11002a.mo57351K();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.BackupDetailView$c */
    /* loaded from: classes5.dex */
    public static final class C10995c implements SyncBannerCommonView.InterfaceC11142a {
        C10995c() {
        }

        @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView.InterfaceC11142a
        /* renamed from: Rf */
        public void mo592Rf(View view) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC23306f.m120688m().m132986E(System.currentTimeMillis());
            BackupDetailView.this.mo57300M0();
        }

        @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView.InterfaceC11142a
        /* renamed from: x9 */
        public void mo596x9(int i11, View view) {
            AbstractC19074t.m100208f(view, "view");
            BackupDetailView.this.mo57326r(i11, 1);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.BackupDetailView$d */
    /* loaded from: classes5.dex */
    public static final class RunnableC10996d implements Runnable {

        /* renamed from: q */
        final /* synthetic */ View f55554q;

        RunnableC10996d(View view) {
            this.f55554q = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
                if (!BackupDetailView.this.f55539a1.m87411l(this.f55554q, this)) {
                    C11007f c11007f = BackupDetailView.this.f55542d1;
                    AbstractC19074t.m100205c(c11007f);
                    int m57462b = c11007f.m57462b();
                    C29881k c29881k = null;
                    if (m57462b == 58) {
                        C29881k c29881k2 = BackupDetailView.this.f55529Q0;
                        if (c29881k2 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29881k2 = null;
                        }
                        linearLayout = c29881k2.f138382R;
                    } else if (m57462b == 60) {
                        C29881k c29881k3 = BackupDetailView.this.f55529Q0;
                        if (c29881k3 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29881k3 = null;
                        }
                        linearLayout = c29881k3.f138379O;
                    } else if (m57462b == 112) {
                        C29881k c29881k4 = BackupDetailView.this.f55529Q0;
                        if (c29881k4 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29881k4 = null;
                        }
                        linearLayout = c29881k4.f138379O;
                    } else if (m57462b == 128) {
                        C29881k c29881k5 = BackupDetailView.this.f55529Q0;
                        if (c29881k5 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29881k5 = null;
                        }
                        linearLayout = c29881k5.f138379O;
                    } else {
                        linearLayout = null;
                    }
                    sh0 sh0Var = BackupDetailView.this.f55539a1;
                    C29881k c29881k6 = BackupDetailView.this.f55529Q0;
                    if (c29881k6 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29881k = c29881k6;
                    }
                    HightLightSettingView hightLightSettingView = c29881k.f138422x;
                    C11007f c11007f2 = BackupDetailView.this.f55542d1;
                    AbstractC19074t.m100205c(c11007f2);
                    sh0Var.m87409j(linearLayout, hightLightSettingView, c11007f2.m57463c());
                    BackupDetailView.this.m57253jN();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SMLSettingBackupRestoreView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.BackupDetailView$e */
    /* loaded from: classes5.dex */
    static final class C10997e extends AbstractC19075u implements InterfaceC18505l {
        C10997e() {
            super(1);
        }

        /* renamed from: a */
        public final void m57339a(C24860q c24860q) {
            boolean booleanValue = ((Boolean) c24860q.m129213a()).booleanValue();
            BackupDetailView.this.m57310UM(((Number) c24860q.m129214b()).intValue(), booleanValue);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57339a((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.BackupDetailView$f */
    /* loaded from: classes5.dex */
    static final class C10998f implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f55556p;

        C10998f(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f55556p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f55556p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f55556p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.BackupDetailView$g */
    /* loaded from: classes5.dex */
    static final class C10999g extends AbstractC19075u implements InterfaceC18494a {
        C10999g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57340a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57340a() {
            InterfaceC11002a interfaceC11002a = BackupDetailView.this.f55541c1;
            C29881k c29881k = null;
            if (interfaceC11002a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a = null;
            }
            interfaceC11002a.mo57386s2(true);
            C29881k c29881k2 = BackupDetailView.this.f55529Q0;
            if (c29881k2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29881k = c29881k2;
            }
            c29881k.f138418v.performClick();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.BackupDetailView$h */
    /* loaded from: classes5.dex */
    static final class C11000h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11000h f55558q = new C11000h();

        C11000h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57341a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57341a() {
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.BackupDetailView$i */
    /* loaded from: classes5.dex */
    public static final class C11001i implements AbstractC29394g.a {
        C11001i() {
        }

        @Override // x60.AbstractC29394g.a
        /* renamed from: a */
        public void mo57176a() {
            InterfaceC11002a interfaceC11002a = BackupDetailView.this.f55541c1;
            if (interfaceC11002a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a = null;
            }
            interfaceC11002a.mo57355M();
        }

        @Override // x60.AbstractC29394g.a
        /* renamed from: b */
        public void mo57177b(int i11) {
            InterfaceC11002a interfaceC11002a = BackupDetailView.this.f55541c1;
            if (interfaceC11002a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a = null;
            }
            interfaceC11002a.mo57385s0(i11);
        }
    }

    /* renamed from: AN */
    private final void m57181AN() {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        View findViewById = c29881k.f138379O.findViewById(AbstractC6918a0.icon_setting_reminder);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        ((ImageView) findViewById).setVisibility(8);
    }

    /* renamed from: BN */
    private final void m57183BN() {
        C29881k c29881k = null;
        if (AbstractC3489d.m17513u()) {
            C29881k c29881k2 = this.f55529Q0;
            if (c29881k2 == null) {
                AbstractC19074t.m100223u("binding");
                c29881k2 = null;
            }
            ZdsActionBar zdsActionBar = c29881k2.f138370F0;
            String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_features_connect_messages_backup_title);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            zdsActionBar.setMiddleTitle(m92652XI);
        }
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k3 = null;
        }
        c29881k3.f138368E0.setMeasureAllChildren(false);
        C29881k c29881k4 = this.f55529Q0;
        if (c29881k4 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k4 = null;
        }
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = c29881k4.f138394d0;
        scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
        scrollViewVisibleChildViewDetector.setScanMode(0);
        scrollViewVisibleChildViewDetector.setScrollViewListener(new ScrollViewVisibleChildViewDetector.InterfaceC9359c() { // from class: m40.r
            public /* synthetic */ C22858r() {
            }

            @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9359c
            /* renamed from: a */
            public final void mo50492a(ScrollView scrollView, int i11, int i12, int i13, int i14) {
                BackupDetailView.m57185CN(BackupDetailView.this, scrollView, i11, i12, i13, i14);
            }
        });
        sh0 sh0Var = this.f55539a1;
        C29881k c29881k5 = this.f55529Q0;
        if (c29881k5 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k5 = null;
        }
        sh0Var.m87415u(c29881k5.f138394d0);
        C29881k c29881k6 = this.f55529Q0;
        if (c29881k6 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k6 = null;
        }
        ZAppCompatImageView zAppCompatImageView = c29881k6.f138426z;
        Context context = zAppCompatImageView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_photo_line_16, AbstractC2807a.support_informative));
        ZAppCompatImageView zAppCompatImageView2 = c29881k6.f138365D;
        Context context2 = zAppCompatImageView2.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        zAppCompatImageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_chat_line_16, AbstractC2807a.support_informative));
        ZAppCompatImageView zAppCompatImageView3 = c29881k6.f138412s;
        Context context3 = zAppCompatImageView3.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        zAppCompatImageView3.setImageDrawable(C27280g.m139660c(context3, AbstractC23322a.zds_ic_more_horizontal_line_24, AbstractC2807a.icon_01));
        ZAppCompatImageView zAppCompatImageView4 = c29881k6.f138367E;
        Context context4 = zAppCompatImageView4.getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        zAppCompatImageView4.setImageDrawable(C27280g.m139660c(context4, AbstractC23322a.zds_ic_auto_clockwise_line_24, AbstractC2807a.icon_02));
        ZAppCompatImageView zAppCompatImageView5 = c29881k6.f138369F;
        Context context5 = zAppCompatImageView5.getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        zAppCompatImageView5.setImageDrawable(C27280g.m139660c(context5, AbstractC23322a.zds_ic_setting_line_24, AbstractC2807a.icon_02));
        ZAppCompatImageView zAppCompatImageView6 = c29881k6.f138424y;
        Context context6 = zAppCompatImageView6.getContext();
        AbstractC19074t.m100207e(context6, "getContext(...)");
        zAppCompatImageView6.setImageDrawable(C27280g.m139660c(context6, AbstractC23322a.zds_ic_info_circle_line_16, AbstractC2807a.icon_02));
        ZAppCompatImageView zAppCompatImageView7 = c29881k6.f138359A;
        Context context7 = c29881k6.f138424y.getContext();
        AbstractC19074t.m100207e(context7, "getContext(...)");
        zAppCompatImageView7.setImageDrawable(C27280g.m139660c(context7, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        ZAppCompatImageView zAppCompatImageView8 = c29881k6.f138361B;
        Context context8 = c29881k6.f138424y.getContext();
        AbstractC19074t.m100207e(context8, "getContext(...)");
        zAppCompatImageView8.setImageDrawable(C27280g.m139660c(context8, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        ZAppCompatImageView zAppCompatImageView9 = c29881k6.f138363C;
        Context context9 = c29881k6.f138424y.getContext();
        AbstractC19074t.m100207e(context9, "getContext(...)");
        zAppCompatImageView9.setImageDrawable(C27280g.m139660c(context9, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        C29881k c29881k7 = this.f55529Q0;
        if (c29881k7 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k7 = null;
        }
        c29881k7.f138382R.setOnClickListener(new View.OnClickListener() { // from class: m40.h0
            public /* synthetic */ ViewOnClickListenerC22845h0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57211PN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k8 = this.f55529Q0;
        if (c29881k8 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k8 = null;
        }
        Switch r02 = c29881k8.f138395e0;
        r02.setOnCheckedChangeListener(null);
        r02.setOnClickListener(new View.OnClickListener() { // from class: m40.i0
            public /* synthetic */ ViewOnClickListenerC22847i0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57213QN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k9 = this.f55529Q0;
        if (c29881k9 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k9 = null;
        }
        StencilSwitch stencilSwitch = c29881k9.f138396f0;
        stencilSwitch.setOnCheckedChangeListener(null);
        stencilSwitch.setOnClickListener(new View.OnClickListener() { // from class: m40.j0
            public /* synthetic */ ViewOnClickListenerC22849j0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57215RN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k10 = this.f55529Q0;
        if (c29881k10 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k10 = null;
        }
        c29881k10.f138414t.setOnClickListener(new View.OnClickListener() { // from class: m40.k0
            public /* synthetic */ ViewOnClickListenerC22851k0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57187DN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k11 = this.f55529Q0;
        if (c29881k11 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k11 = null;
        }
        c29881k11.f138418v.setOnClickListener(new View.OnClickListener() { // from class: m40.h
            public /* synthetic */ ViewOnClickListenerC22844h() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57191FN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k12 = this.f55529Q0;
        if (c29881k12 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k12 = null;
        }
        c29881k12.f138412s.setOnClickListener(new View.OnClickListener() { // from class: m40.i
            public /* synthetic */ ViewOnClickListenerC22846i() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57195HN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k13 = this.f55529Q0;
        if (c29881k13 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k13 = null;
        }
        c29881k13.f138366D0.setMeasureAllChildren(false);
        C29881k c29881k14 = this.f55529Q0;
        if (c29881k14 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k14 = null;
        }
        c29881k14.f138384T.setOnClickListener(new View.OnClickListener() { // from class: m40.j
            public /* synthetic */ ViewOnClickListenerC22848j() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57197IN(BackupDetailView.this, view);
            }
        });
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        if (!interfaceC11002a.mo57383r()) {
            View[] viewArr = new View[1];
            C29881k c29881k15 = this.f55529Q0;
            if (c29881k15 == null) {
                AbstractC19074t.m100223u("binding");
                c29881k15 = null;
            }
            viewArr[0] = c29881k15.f138384T;
            m57280wN(0L, viewArr);
        }
        InterfaceC11002a interfaceC11002a2 = this.f55541c1;
        if (interfaceC11002a2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a2 = null;
        }
        if (!interfaceC11002a2.mo57363S3()) {
            View[] viewArr2 = new View[1];
            C29881k c29881k16 = this.f55529Q0;
            if (c29881k16 == null) {
                AbstractC19074t.m100223u("binding");
                c29881k16 = null;
            }
            viewArr2[0] = c29881k16.f138383S;
            m57280wN(0L, viewArr2);
        }
        C29881k c29881k17 = this.f55529Q0;
        if (c29881k17 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k17 = null;
        }
        c29881k17.f138386V.setOnClickListener(new View.OnClickListener() { // from class: m40.k
            public /* synthetic */ ViewOnClickListenerC22850k() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57199JN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k18 = this.f55529Q0;
        if (c29881k18 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k18 = null;
        }
        c29881k18.f138381Q.setOnClickListener(new View.OnClickListener() { // from class: m40.l
            public /* synthetic */ ViewOnClickListenerC22852l() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57201KN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k19 = this.f55529Q0;
        if (c29881k19 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k19 = null;
        }
        c29881k19.f138416u.setOnClickListener(new View.OnClickListener() { // from class: m40.c0
            public /* synthetic */ ViewOnClickListenerC22835c0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57203LN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k20 = this.f55529Q0;
        if (c29881k20 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k20 = null;
        }
        c29881k20.f138390Z.setOnClickListener(new View.OnClickListener() { // from class: m40.e0
            public /* synthetic */ ViewOnClickListenerC22839e0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57205MN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k21 = this.f55529Q0;
        if (c29881k21 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k21 = null;
        }
        c29881k21.f138379O.setOnClickListener(new View.OnClickListener() { // from class: m40.f0
            public /* synthetic */ ViewOnClickListenerC22841f0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57207NN(BackupDetailView.this, view);
            }
        });
        C29881k c29881k22 = this.f55529Q0;
        if (c29881k22 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k22 = null;
        }
        c29881k22.f138377M.setOnClickListener(new View.OnClickListener() { // from class: m40.g0
            public /* synthetic */ ViewOnClickListenerC22843g0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupDetailView.m57209ON(BackupDetailView.this, view);
            }
        });
        InterfaceC11002a interfaceC11002a3 = this.f55541c1;
        if (interfaceC11002a3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a3 = null;
        }
        if (interfaceC11002a3.mo57388ul()) {
            C29881k c29881k23 = this.f55529Q0;
            if (c29881k23 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29881k = c29881k23;
            }
            c29881k.f138393c0.setVisibility(8);
        }
    }

    /* renamed from: CN */
    public static final void m57185CN(BackupDetailView backupDetailView, ScrollView scrollView, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57361R2();
    }

    /* renamed from: DN */
    public static final void m57187DN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_SETTING_BACKUP", new Runnable() { // from class: m40.x
            public /* synthetic */ RunnableC22864x() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BackupDetailView.m57189EN(BackupDetailView.this);
            }
        }, 1000L);
    }

    /* renamed from: EN */
    public static final void m57189EN(BackupDetailView backupDetailView) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57352K1();
    }

    /* renamed from: FN */
    public static final void m57191FN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_SETTING_RESTORE", new Runnable() { // from class: m40.z
            public /* synthetic */ RunnableC22866z() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BackupDetailView.m57193GN(BackupDetailView.this);
            }
        }, 1000L);
    }

    /* renamed from: GN */
    public static final void m57193GN(BackupDetailView backupDetailView) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57353L0();
    }

    /* renamed from: HN */
    public static final void m57195HN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        backupDetailView.m57232aO();
    }

    /* renamed from: IN */
    public static final void m57197IN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57346G1(true);
    }

    /* renamed from: JN */
    public static final void m57199JN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57369g0();
    }

    /* renamed from: KN */
    public static final void m57201KN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        BaseZaloView baseZaloView = backupDetailView.f72421L0;
        AbstractC19074t.m100207e(baseZaloView, "mThis");
        interfaceC11002a.mo57382q3(baseZaloView);
    }

    /* renamed from: LN */
    public static final void m57203LN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        BaseZaloView baseZaloView = backupDetailView.f72421L0;
        AbstractC19074t.m100207e(baseZaloView, "mThis");
        interfaceC11002a.mo57382q3(baseZaloView);
    }

    /* renamed from: MN */
    public static final void m57205MN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        BaseZaloView baseZaloView = backupDetailView.f72421L0;
        AbstractC19074t.m100207e(baseZaloView, "mThis");
        interfaceC11002a.mo57382q3(baseZaloView);
    }

    /* renamed from: NN */
    public static final void m57207NN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean("KEY_IS_HAS_RED_DOT", backupDetailView.f55528P0);
        C17487o0 m92662fJ = backupDetailView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ConfigBackupView.class, bundle, 100, 1, true);
        }
    }

    /* renamed from: ON */
    public static final void m57209ON(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        Bundle bundle = new Bundle();
        C17487o0 m92662fJ = backupDetailView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(BackupInfoExplainView.class, bundle, 1, true);
        }
    }

    /* renamed from: PN */
    public static final void m57211PN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57364T2();
    }

    /* renamed from: QN */
    public static final void m57213QN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        InterfaceC11002a interfaceC11002a2 = null;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        if (interfaceC11002a.mo57388ul()) {
            InterfaceC11002a interfaceC11002a3 = backupDetailView.f55541c1;
            if (interfaceC11002a3 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a3 = null;
            }
            if (!interfaceC11002a3.mo57370go()) {
                return;
            }
        }
        InterfaceC11002a interfaceC11002a4 = backupDetailView.f55541c1;
        if (interfaceC11002a4 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC11002a2 = interfaceC11002a4;
        }
        interfaceC11002a2.mo57373k3();
    }

    /* renamed from: RN */
    public static final void m57215RN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57357N();
    }

    /* renamed from: SN */
    private final void m57217SN() {
        C29881k c29881k = this.f55529Q0;
        C29881k c29881k2 = null;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        AbstractC26084s.m134251H(c29881k.f138382R, 58);
        C26076k m134208q = C26076k.m134208q();
        AbstractC19074t.m100205c(m134208q);
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k3 = null;
        }
        LinearLayout linearLayout = c29881k3.f138379O;
        AbstractC19074t.m100207e(linearLayout, "llOpenConfigSettingBackup");
        m57254jO(m134208q, linearLayout, 112);
        C29881k c29881k4 = this.f55529Q0;
        if (c29881k4 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k4 = null;
        }
        LinearLayout linearLayout2 = c29881k4.f138379O;
        AbstractC19074t.m100207e(linearLayout2, "llOpenConfigSettingBackup");
        m57254jO(m134208q, linearLayout2, 60);
        C29881k c29881k5 = this.f55529Q0;
        if (c29881k5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k2 = c29881k5;
        }
        LinearLayout linearLayout3 = c29881k2.f138379O;
        AbstractC19074t.m100207e(linearLayout3, "llOpenConfigSettingBackup");
        m57254jO(m134208q, linearLayout3, 128);
    }

    /* renamed from: TN */
    private final boolean m57219TN() {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        if (c29881k.f138368E0.getDisplayedChild() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: UN */
    public final void m57220UN() {
        SyncProcessorView syncProcessorView = this.f55534V0;
        if (syncProcessorView != null) {
            syncProcessorView.m58406d();
        }
    }

    /* renamed from: VM */
    private final void m57221VM(View view, boolean z11) {
        if (z11) {
            if (!view.isEnabled()) {
                view.setEnabled(true);
            }
            if (view.getAlpha() != 1.0f) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        if (view.isEnabled()) {
            view.setEnabled(false);
        }
        if (view.getAlpha() != 0.3f) {
            view.setAlpha(0.3f);
        }
    }

    /* renamed from: VN */
    public static final void m57222VN(BackupDetailView backupDetailView) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57359P2();
    }

    /* renamed from: WM */
    private final void m57223WM(boolean z11) {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        LinearLayout linearLayout = c29881k.f138381Q;
        AbstractC19074t.m100207e(linearLayout, "llSettingAccountGgdrive");
        m57221VM(linearLayout, z11);
    }

    /* renamed from: WN */
    public static final void m57224WN(BackupDetailView backupDetailView, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        if (backupDetailView.f55543e1) {
            InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
            if (interfaceC11002a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a = null;
            }
            interfaceC11002a.mo57386s2(true);
        }
    }

    /* renamed from: XM */
    private final void m57225XM(boolean z11) {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        ZAppCompatImageView zAppCompatImageView = c29881k.f138412s;
        AbstractC19074t.m100207e(zAppCompatImageView, "btnAdditionOptionLatestBackupInfo");
        m57221VM(zAppCompatImageView, z11);
    }

    /* renamed from: XN */
    public static final void m57226XN(BackupDetailView backupDetailView) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57359P2();
    }

    /* renamed from: YM */
    private final void m57227YM(boolean z11) {
        C29881k c29881k = this.f55529Q0;
        C29881k c29881k2 = null;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        LinearLayout linearLayout = c29881k.f138382R;
        AbstractC19074t.m100207e(linearLayout, "llSettingAutoBackup");
        m57221VM(linearLayout, z11);
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k3 = null;
        }
        Switch r02 = c29881k3.f138395e0;
        AbstractC19074t.m100207e(r02, "ssAutoBackup");
        m57221VM(r02, z11);
        C29881k c29881k4 = this.f55529Q0;
        if (c29881k4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k2 = c29881k4;
        }
        RobotoTextView robotoTextView = c29881k2.f138417u0;
        AbstractC19074t.m100207e(robotoTextView, "tvTitleSetting");
        m57221VM(robotoTextView, z11);
    }

    /* renamed from: YN */
    public final void m57228YN(C21690e c21690e) {
        C26220b.m134826i("SMLSettingBackupRestoreView", "onRestoreFinish(): sessionInfo=" + c21690e, null, 4, null);
        C20223b m120564A1 = AbstractC23306f.m120564A1();
        C17487o0 m92693xK = m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        m120564A1.m105694c(m92693xK);
    }

    /* renamed from: ZM */
    private final void m57229ZM(boolean z11) {
        C29881k c29881k = this.f55529Q0;
        C29881k c29881k2 = null;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        LinearLayout linearLayout = c29881k.f138383S;
        AbstractC19074t.m100207e(linearLayout, "llSettingBackupE2ee");
        m57221VM(linearLayout, z11);
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k2 = c29881k3;
        }
        StencilSwitch stencilSwitch = c29881k2.f138396f0;
        AbstractC19074t.m100207e(stencilSwitch, "ssBackupE2ee");
        m57221VM(stencilSwitch, z11);
    }

    /* renamed from: ZN */
    public static final void m57230ZN(BackupDetailView backupDetailView) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        backupDetailView.m57244gN();
    }

    /* renamed from: aN */
    private final void m57231aN(boolean z11) {
        C29881k c29881k = this.f55529Q0;
        C29881k c29881k2 = null;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        LinearLayout linearLayout = c29881k.f138376L;
        AbstractC19074t.m100207e(linearLayout, "llBackupInfoResult");
        m57221VM(linearLayout, z11);
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k2 = c29881k3;
        }
        LinearLayout linearLayout2 = c29881k2.f138374J;
        AbstractC19074t.m100207e(linearLayout2, "llBackupInfo");
        m57221VM(linearLayout2, z11);
    }

    /* renamed from: aO */
    private final void m57232aO() {
        Bundle bundle = new Bundle();
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35581q(AdditionOptionForLatestBackupBottomSheet.class, bundle, 33, 1, true);
        }
    }

    /* renamed from: bN */
    private final void m57233bN(boolean z11) {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        LinearLayout linearLayout = c29881k.f138384T;
        AbstractC19074t.m100207e(linearLayout, "llSettingBackupPwd");
        m57221VM(linearLayout, z11);
        View view = this.f55530R0;
        if (view != null) {
            m57221VM(view, z11);
        }
    }

    /* renamed from: bO */
    private final void m57234bO() {
        C22438j.m115954w(C13958c.b.f71927s);
    }

    /* renamed from: cN */
    private final void m57235cN(boolean z11) {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        LinearLayout linearLayout = c29881k.f138377M;
        AbstractC19074t.m100207e(linearLayout, "llDetailInfoDataBackup");
        m57221VM(linearLayout, z11);
    }

    /* renamed from: cO */
    public static final void m57236cO(SimpleAdapter simpleAdapter, String str, BackupDetailView backupDetailView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(simpleAdapter, "$adapter");
        AbstractC19074t.m100208f(str, "$emailBackup");
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        Object item = simpleAdapter.getItem(i11);
        AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
        Object obj = ((HashMap) item).get("id");
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (intValue == AbstractC8020f0.str_change_account) {
            AbstractC23647d.m123897g("580107");
            InterfaceC27218a m92692wK = backupDetailView.f72421L0.m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            C22447s.m116007J(0, 2, str, m92692wK, false, false, 48, null);
            return;
        }
        if (intValue == AbstractC8020f0.str_not_use_gdrvie_account) {
            InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
            if (interfaceC11002a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a = null;
            }
            interfaceC11002a.mo57342A2();
        }
    }

    /* renamed from: dN */
    private final void m57237dN(boolean z11) {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        LinearLayout linearLayout = c29881k.f138386V;
        AbstractC19074t.m100207e(linearLayout, "llSettingNetworkCondition");
        m57221VM(linearLayout, z11);
    }

    /* renamed from: dO */
    private final void m57238dO() {
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        if (interfaceC11002a.mo57381q0()) {
            return;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(1);
        MainApplication.C6895a c6895a = MainApplication.Companion;
        aVar.m43172u(c6895a.m35500c().getString(AbstractC8020f0.str_dialog_delete_backup_title));
        aVar.m43173v(3);
        aVar.m43162k(c6895a.m35500c().getString(AbstractC8020f0.str_dialog_delete_backup_msg));
        aVar.m43170s(c6895a.m35500c().getString(AbstractC8020f0.delete), new InterfaceC17463d.d() { // from class: m40.t
            public /* synthetic */ C22860t() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                BackupDetailView.m57240eO(BackupDetailView.this, interfaceC17463d, i11);
            }
        });
        aVar.m43165n(c6895a.m35500c().getString(AbstractC8020f0.str_sync_summary_cancel), new InterfaceC17463d.d() { // from class: m40.u
            public /* synthetic */ C22861u() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                BackupDetailView.m57242fO(BackupDetailView.this, interfaceC17463d, i11);
            }
        });
        aVar.m43152a().mo13822K();
    }

    /* renamed from: eN */
    private final void m57239eN(boolean z11) {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        LinearLayout linearLayout = c29881k.f138379O;
        AbstractC19074t.m100207e(linearLayout, "llOpenConfigSettingBackup");
        m57221VM(linearLayout, z11);
    }

    /* renamed from: eO */
    public static final void m57240eO(BackupDetailView backupDetailView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
                InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
                if (interfaceC11002a == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC11002a = null;
                }
                interfaceC11002a.mo57347G3();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: fN */
    private final void m57241fN(boolean z11) {
        C29881k c29881k = null;
        if (z11) {
            C29881k c29881k2 = this.f55529Q0;
            if (c29881k2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29881k = c29881k2;
            }
            c29881k.f138373I.setVisibility(0);
            return;
        }
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k = c29881k3;
        }
        c29881k.f138373I.setVisibility(8);
    }

    /* renamed from: fO */
    public static final void m57242fO(BackupDetailView backupDetailView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SMLSettingBackupRestoreView", e11);
            }
        }
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57367Z0();
    }

    /* renamed from: gN */
    private final void m57244gN() {
        C11007f c11007f = this.f55542d1;
        if (c11007f != null && c11007f.m57469i()) {
            InterfaceC11002a interfaceC11002a = this.f55541c1;
            if (interfaceC11002a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a = null;
            }
            interfaceC11002a.mo57377n3();
            C11007f c11007f2 = this.f55542d1;
            if (c11007f2 != null) {
                c11007f2.m57474n(false);
            }
        }
    }

    /* renamed from: gO */
    private final void m57245gO(ViewSwitcher viewSwitcher, int i11) {
        if (viewSwitcher.getDisplayedChild() != i11) {
            viewSwitcher.setDisplayedChild(i11);
        }
    }

    /* renamed from: hN */
    private final boolean m57247hN() {
        if (AbstractC21777d.m112310a(this.f72421L0.m92693xK(), this.f72421L0.m92642L3())) {
            return true;
        }
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ == null || m92662fJ.m93018M0() > 1) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92662fJ.m93069k2(MainTabView.class, bundle, 1, true);
        return true;
    }

    /* renamed from: hO */
    private final void m57248hO() {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        ViewSwitcher viewSwitcher = c29881k.f138366D0;
        AbstractC19074t.m100207e(viewSwitcher, "vsBackupInfo");
        m57245gO(viewSwitcher, 0);
    }

    /* renamed from: iN */
    private final boolean m57250iN(View view) {
        if (view != null) {
            if (this.f55538Z0 == null) {
                this.f55538Z0 = new Rect();
            }
            if (view.getGlobalVisibleRect(this.f55538Z0)) {
                Rect rect = this.f55538Z0;
                AbstractC19074t.m100205c(rect);
                int i11 = rect.bottom;
                Rect rect2 = this.f55538Z0;
                AbstractC19074t.m100205c(rect2);
                if (i11 - rect2.top > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: iO */
    private final void m57251iO() {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        ViewSwitcher viewSwitcher = c29881k.f138366D0;
        AbstractC19074t.m100207e(viewSwitcher, "vsBackupInfo");
        m57245gO(viewSwitcher, 1);
    }

    /* renamed from: jN */
    public final void m57253jN() {
        C11007f c11007f = this.f55542d1;
        if (c11007f != null) {
            c11007f.m57472l(-1);
        }
        C11007f c11007f2 = this.f55542d1;
        if (c11007f2 != null) {
            c11007f2.m57473m(0);
        }
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: jO */
    private final void m57254jO(C26076k c26076k, ViewGroup viewGroup, int i11) {
        C26071f m134221r = c26076k.m134221r(i11);
        if (m134221r != null && m134221r.m134171a()) {
            this.f55528P0 = true;
            AbstractC26084s.m134251H(viewGroup, i11);
        }
    }

    /* renamed from: kN */
    public static final void m57256kN(BackupDetailView backupDetailView) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        backupDetailView.m57217SN();
    }

    /* renamed from: lN */
    public static final void m57258lN(BackupDetailView backupDetailView) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57387u3(0);
    }

    /* renamed from: mN */
    public static final void m57260mN(BackupDetailView backupDetailView) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57387u3(1);
    }

    /* renamed from: nN */
    public static final void m57262nN(BackupDetailView backupDetailView) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57387u3(2);
    }

    /* renamed from: oN */
    public static final void m57264oN(BackupDetailView backupDetailView) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57387u3(3);
    }

    /* renamed from: pN */
    private final void m57266pN(boolean z11) {
        C29881k c29881k = null;
        if (z11) {
            C29881k c29881k2 = this.f55529Q0;
            if (c29881k2 == null) {
                AbstractC19074t.m100223u("binding");
                c29881k2 = null;
            }
            if (!c29881k2.f138418v.isEnabled()) {
                C29881k c29881k3 = this.f55529Q0;
                if (c29881k3 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29881k = c29881k3;
                }
                RobotoTextView robotoTextView = c29881k.f138418v;
                robotoTextView.setEnabled(true);
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC16781w.AppPrimaryColor));
                robotoTextView.setAlpha(1.0f);
                return;
            }
            return;
        }
        C29881k c29881k4 = this.f55529Q0;
        if (c29881k4 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k4 = null;
        }
        if (c29881k4.f138418v.isEnabled()) {
            C29881k c29881k5 = this.f55529Q0;
            if (c29881k5 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29881k = c29881k5;
            }
            RobotoTextView robotoTextView2 = c29881k.f138418v;
            robotoTextView2.setEnabled(false);
            robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC16781w.DisableTextColor1));
            robotoTextView2.setAlpha(0.5f);
        }
    }

    /* renamed from: qN */
    private final void m57268qN() {
        ViewStub viewStub;
        View view;
        View view2;
        int m127173b0;
        if (this.f55530R0 == null && this.f72421L0.m92656bJ() != null) {
            View m92656bJ = this.f72421L0.m92656bJ();
            RobotoTextView robotoTextView = null;
            if (m92656bJ != null) {
                viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.viewstub_banner_remind_backup_password);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            this.f55530R0 = view;
            if (view != null) {
                view2 = view.findViewById(AbstractC6918a0.btn_close_banner);
            } else {
                view2 = null;
            }
            this.f55531S0 = view2;
            View view3 = this.f55530R0;
            if (view3 != null) {
                robotoTextView = (RobotoTextView) view3.findViewById(AbstractC6918a0.txt_remind_banner_set_pass_content);
            }
            this.f55532T0 = robotoTextView;
            View view4 = this.f55530R0;
            if (view4 != null) {
                view4.setOnClickListener(new View.OnClickListener() { // from class: m40.a0
                    public /* synthetic */ ViewOnClickListenerC22831a0() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        BackupDetailView.m57270rN(BackupDetailView.this, view5);
                    }
                });
            }
            View view5 = this.f55531S0;
            if (view5 != null) {
                view5.setOnClickListener(new View.OnClickListener() { // from class: m40.b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        BackupDetailView.m57272sN(view6);
                    }
                });
            }
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_highlight_action_set_pass_backup);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_remind_banner_set_pass_backup);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m127173b0 = AbstractC24342w.m127173b0(m118743r02, m118743r0, 0, false, 6, null);
            if (m127173b0 != -1) {
                int length = m118743r0.length() + m127173b0;
                SpannableString spannableString = new SpannableString(m118743r02);
                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC16781w.AppPrimaryColor)), m127173b0, length, 33);
                RobotoTextView robotoTextView2 = this.f55532T0;
                if (robotoTextView2 != null) {
                    robotoTextView2.setText(spannableString);
                }
            }
        }
    }

    /* renamed from: rN */
    public static final void m57270rN(BackupDetailView backupDetailView, View view) {
        AbstractC19074t.m100208f(backupDetailView, "this$0");
        InterfaceC11002a interfaceC11002a = backupDetailView.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57346G1(false);
    }

    /* renamed from: sN */
    public static final void m57272sN(View view) {
        C2556d.m12981o().m13007x(3);
    }

    /* renamed from: tN */
    private final void m57274tN() {
        ViewStub viewStub;
        if (this.f55536X0 == null && this.f72421L0.m92656bJ() != null) {
            View m92656bJ = this.f72421L0.m92656bJ();
            View view = null;
            if (m92656bJ != null) {
                viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.viewstub_banner_reauthen_gdrive);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            SyncBannerCommonView syncBannerCommonView = (SyncBannerCommonView) view;
            this.f55536X0 = syncBannerCommonView;
            if (syncBannerCommonView != null) {
                syncBannerCommonView.setOnSyncBannerListener(new C10995c());
            }
            C3295f c3295f = new C3295f(null, 0, 0, 0, 0, 31, null);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_banner_remind_reconnect_gdrive);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            C3297h.m16737g(c3295f, m118743r0, 6);
            C3297h.m16733c(this.f55536X0, 0);
            SyncBannerCommonView syncBannerCommonView2 = this.f55536X0;
            if (syncBannerCommonView2 != null) {
                syncBannerCommonView2.m58393f(c3295f);
                syncBannerCommonView2.setMovementMethod(CustomMovementMethod.m56305e());
                syncBannerCommonView2.setVisibility(0);
            }
        }
    }

    /* renamed from: uN */
    private final void m57276uN() {
        ViewStub viewStub;
        if (this.f55535W0 == null && this.f72421L0.m92656bJ() != null) {
            InterfaceC11002a interfaceC11002a = this.f55541c1;
            View view = null;
            if (interfaceC11002a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a = null;
            }
            String mo57365U3 = interfaceC11002a.mo57365U3();
            if (mo57365U3.length() == 0) {
                return;
            }
            View m92656bJ = this.f72421L0.m92656bJ();
            if (m92656bJ != null) {
                viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.viewstub_banner_remind_restore);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            SyncBannerCommonView syncBannerCommonView = (SyncBannerCommonView) view;
            this.f55535W0 = syncBannerCommonView;
            if (syncBannerCommonView != null) {
                syncBannerCommonView.setOnSyncBannerListener(this);
            }
            C3295f c3295f = new C3295f(null, 0, 0, 0, 0, 31, null);
            C3297h.m16737g(c3295f, mo57365U3, 7);
            C3297h.m16733c(this.f55535W0, 0);
            SyncBannerCommonView syncBannerCommonView2 = this.f55535W0;
            if (syncBannerCommonView2 != null) {
                syncBannerCommonView2.m58393f(c3295f);
                syncBannerCommonView2.setVisibility(0);
            }
        }
    }

    /* renamed from: vN */
    private final void m57278vN() {
        ViewStub viewStub;
        if (this.f55533U0 == null && this.f72421L0.m92656bJ() != null) {
            View m92656bJ = this.f72421L0.m92656bJ();
            View view = null;
            if (m92656bJ != null) {
                viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.viewstub_sync_empty_backup_view);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            SyncEmptyBackupView syncEmptyBackupView = (SyncEmptyBackupView) view;
            this.f55533U0 = syncEmptyBackupView;
            if (syncEmptyBackupView != null) {
                syncEmptyBackupView.setOnEmptyBackupViewListener(this);
            }
        }
    }

    /* renamed from: wN */
    private final void m57280wN(long j11, View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                if (view.getVisibility() != 0) {
                    return;
                }
                if (j11 <= 0) {
                    view.setVisibility(8);
                } else {
                    view.animate().alpha(0.0f).setDuration(j11).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new Runnable() { // from class: m40.d0

                        /* renamed from: p */
                        public final /* synthetic */ View f111444p;

                        public /* synthetic */ RunnableC22837d0(View view2) {
                            r1 = view2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            BackupDetailView.m57282xN(r1);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: xN */
    public static final void m57282xN(View view) {
        view.setVisibility(8);
    }

    /* renamed from: yN */
    private final void m57284yN(View view) {
        try {
            if (this.f55542d1 == null) {
                return;
            }
            if (m57219TN()) {
                m57253jN();
                return;
            }
            C11007f c11007f = this.f55542d1;
            AbstractC19074t.m100205c(c11007f);
            if (c11007f.m57462b() >= 0) {
                view.postDelayed(new RunnableC10996d(view), 300L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLSettingBackupRestoreView", e11);
        }
    }

    /* renamed from: zN */
    public final void m57286zN() {
        AbstractC20110a.f98889a.mo104548a("hideAllBannerWhenSyncing", new Object[0]);
        mo57315bB();
        mo57293I0();
        mo57335z0();
        mo57300M0();
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: B */
    public void mo57287B(String str) {
        AbstractC19074t.m100208f(str, "strCondNetwork");
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        c29881k.f138409q0.setText(str);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: C3 */
    public void mo57288C3(boolean z11) {
        m57276uN();
        SyncBannerCommonView syncBannerCommonView = this.f55535W0;
        if (syncBannerCommonView != null) {
            syncBannerCommonView.setVisibility(0);
            syncBannerCommonView.setHasIconClose(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C25806c m120692n = AbstractC23306f.m120692n();
        AbstractC19074t.m100207e(m120692n, "provideBackupRestoreRepo(...)");
        C25804a m120688m = AbstractC23306f.m120688m();
        AbstractC19074t.m100207e(m120688m, "provideBackupRestoreMediaRepo(...)");
        C24720a m120676j = AbstractC23306f.m120676j();
        AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
        C24199c m120684l = AbstractC23306f.m120684l();
        AbstractC19074t.m100207e(m120684l, "provideBackupRestoreManager(...)");
        C25724a m120668h = AbstractC23306f.m120668h();
        AbstractC19074t.m100207e(m120668h, "provideBackupEncryptionManager(...)");
        this.f55541c1 = new C11003b(this, m120692n, m120688m, m120676j, m120684l, m120668h);
        this.f55542d1 = C11007f.Companion.m57475a(this.f72421L0.m92642L3());
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        InterfaceC11002a interfaceC11002a2 = null;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo995Nd(this.f55542d1, null);
        InterfaceC11002a interfaceC11002a3 = this.f55541c1;
        if (interfaceC11002a3 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC11002a2 = interfaceC11002a3;
        }
        interfaceC11002a2.mo57392x3(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        String m118743r0;
        if (i11 != 2) {
            if (i11 != 3) {
                InterfaceC11002a interfaceC11002a = null;
                if (i11 != 5) {
                    if (i11 != 6) {
                        return null;
                    }
                    Context m92686rK = this.f72421L0.m92686rK();
                    AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
                    C16972e0.a aVar = new C16972e0.a(m92686rK);
                    aVar.m90931h("backup_e2ee_modal_off_e2ee");
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_off_setting_backup_e2ee_title);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    aVar.m90918B(m118743r02);
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_off_setting_backup_e2ee_desc);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    aVar.m90949z(m118743r03);
                    aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
                    aVar.m90921E(true);
                    String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_off_setting_backup_e2ee_btn_positive);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    aVar.m90943t(m118743r04, this);
                    aVar.m90947x("backup_e2ee_dialog_confirm_off");
                    String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
                    AbstractC19074t.m100207e(m118743r05, "getString(...)");
                    aVar.m90934k(m118743r05, this);
                    aVar.m90937n("backup_e2ee_dialog_not_confirm_off");
                    return aVar.m90927d();
                }
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                C8009j.a m43165n = aVar2.m43159h(4).m43172u(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_dialog_confirm_backup_overwrite_title)).m43173v(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_confirm_backup_overwrite_desc)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_ask_restore_before_backup_action_negative), new InterfaceC17463d.b());
                InterfaceC11002a interfaceC11002a2 = this.f55541c1;
                if (interfaceC11002a2 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC11002a = interfaceC11002a2;
                }
                if (interfaceC11002a.mo57390w0()) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_ask_restore_before_backup_action_positive);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_confirm_backup_overwrite_btn_positive_auto);
                }
                m43165n.m43170s(m118743r0, this);
                return aVar2.m43152a();
            }
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
            aVar3.m43159h(4).m43172u(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_dialog_confirm_backup_overwrite_title)).m43173v(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_desc_restore_before_backup_set_pwd)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_negative_btn_restore_before_backup_pwd), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_positive_btn_restore_before_backup_pwd), this);
            return aVar3.m43152a();
        }
        C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
        aVar4.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_title_turn_off_auto_backup));
        aVar4.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_desc_turn_off_auto_backup));
        aVar4.m43159h(8);
        aVar4.m43173v(3);
        aVar4.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_btn_negative_turn_off_auto_backup), this);
        aVar4.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this);
        C8009j m43152a = aVar4.m43152a();
        this.f55543e1 = true;
        m43152a.m92855F(new InterfaceC17463d.e() { // from class: m40.w
            public /* synthetic */ C22863w() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
            /* renamed from: Tv */
            public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                BackupDetailView.m57224WN(BackupDetailView.this, interfaceC17463d);
            }
        });
        return m43152a;
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: E1 */
    public void mo57289E1() {
        SyncEmptyBackupView syncEmptyBackupView;
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        if (!interfaceC11002a.mo57375lb() && !AbstractC3489d.m17512t() && (syncEmptyBackupView = this.f55533U0) != null) {
            syncEmptyBackupView.m58401c(1);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: F */
    public void mo57290F() {
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(SyncMessagePassManageView.class, null, 1804, 1, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29881k m148141c = C29881k.m148141c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148141c, "inflate(...)");
        this.f55529Q0 = m148141c;
        m57183BN();
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        LinearLayout root = c29881k.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: H */
    public void mo57291H(String[] strArr, int i11) {
        AbstractC19074t.m100208f(strArr, "arrayConditionWifi");
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f55537Y0;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.dismiss();
        }
        this.f55537Y0 = AbstractC29394g.m146569n(this.f72421L0.m92648SI(), strArr, i11, MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_syncmes_sync_mes_setting_title), new C11001i(), 3);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: H1 */
    public void mo57292H1(String str, int i11) {
        C3294e c3294e;
        AbstractC19074t.m100208f(str, "msgText");
        SyncProcessorView syncProcessorView = this.f55534V0;
        if (syncProcessorView != null) {
            c3294e = syncProcessorView.getSyncStateData();
        } else {
            c3294e = null;
        }
        C3297h.m16734d(c3294e, str, i11);
        m57220UN();
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        AbstractC19074t.m100208f(scrollView, "scrollView");
        if (z11) {
            AbstractC26084s.m134267o(this.f55539a1.m87408i());
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: I0 */
    public void mo57293I0() {
        View view = this.f55530R0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: I5 */
    public void mo57294I5(int i11, long j11) {
        C29881k c29881k = null;
        if (i11 != 1 && !AbstractC3489d.m17514v()) {
            C29881k c29881k2 = this.f55529Q0;
            if (c29881k2 == null) {
                AbstractC19074t.m100223u("binding");
                c29881k2 = null;
            }
            c29881k2.f138380P.setVisibility(8);
            C29881k c29881k3 = this.f55529Q0;
            if (c29881k3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29881k = c29881k3;
            }
            c29881k.f138411r0.setText(m92652XI(AbstractC8020f0.str_content_backup_on_server));
            return;
        }
        C29881k c29881k4 = this.f55529Q0;
        if (c29881k4 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k4 = null;
        }
        c29881k4.f138380P.setVisibility(0);
        C29881k c29881k5 = this.f55529Q0;
        if (c29881k5 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k5 = null;
        }
        c29881k5.f138411r0.setText(C21459a.m111038f(j11, 0, 2, null) + " " + m92652XI(AbstractC8020f0.str_title_backuped));
        C29881k c29881k6 = this.f55529Q0;
        if (c29881k6 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k = c29881k6;
        }
        c29881k.f138397g0.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_stored_on_zcloud, C16805b.Companion.m89811a().m89800f()));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            this.f72421L0.mo49315c4();
            InterfaceC11002a interfaceC11002a = this.f55541c1;
            if (interfaceC11002a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a = null;
            }
            interfaceC11002a.mo994F2();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        super.mo39024IJ();
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: J0 */
    public void mo57295J0(boolean z11) {
        m57268qN();
        View view = this.f55530R0;
        if (view != null) {
            view.setVisibility(0);
        }
        if (z11) {
            View view2 = this.f55531S0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            RobotoTextView robotoTextView = this.f55532T0;
            if (robotoTextView != null) {
                robotoTextView.setPadding(0, 0, 0, 0);
                return;
            }
            return;
        }
        View view3 = this.f55531S0;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        RobotoTextView robotoTextView2 = this.f55532T0;
        if (robotoTextView2 != null) {
            robotoTextView2.setPadding(0, 0, AbstractC23222t7.f112566j, 0);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: J2 */
    public void mo57296J2() {
        C29881k c29881k = this.f55529Q0;
        C29881k c29881k2 = null;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        c29881k.f138408q.setVisibility(8);
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k3 = null;
        }
        c29881k3.f138410r.setVisibility(0);
        C29881k c29881k4 = this.f55529Q0;
        if (c29881k4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k2 = c29881k4;
        }
        c29881k2.f138412s.setVisibility(4);
        mo57294I5(0, 0L);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C23744a.Companion.m124119a().m124117e(this, 150812);
        this.f55530R0 = null;
        this.f55533U0 = null;
        this.f55534V0 = null;
        this.f55535W0 = null;
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: K3 */
    public void mo57297K3() {
        C21688c.Companion.m111854a().m111849u(this, "SYNC_MES");
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            InterfaceC11002a interfaceC11002a = null;
            if (mo92862f != 2) {
                if (mo92862f != 3) {
                    if (mo92862f != 5) {
                        if (mo92862f == 6) {
                            if (i11 != -2) {
                                if (i11 == -1) {
                                    InterfaceC11002a interfaceC11002a2 = this.f55541c1;
                                    if (interfaceC11002a2 == null) {
                                        AbstractC19074t.m100223u("presenter");
                                    } else {
                                        interfaceC11002a = interfaceC11002a2;
                                    }
                                    interfaceC11002a.mo57358P1(false);
                                    interfaceC17463d.dismiss();
                                    return;
                                }
                                return;
                            }
                            interfaceC17463d.dismiss();
                            return;
                        }
                        return;
                    }
                    if (i11 == -1) {
                        interfaceC17463d.dismiss();
                        InterfaceC11002a interfaceC11002a3 = this.f55541c1;
                        if (interfaceC11002a3 == null) {
                            AbstractC19074t.m100223u("presenter");
                        } else {
                            interfaceC11002a = interfaceC11002a3;
                        }
                        interfaceC11002a.mo57376m2();
                        return;
                    }
                    return;
                }
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    InterfaceC11002a interfaceC11002a4 = this.f55541c1;
                    if (interfaceC11002a4 == null) {
                        AbstractC19074t.m100223u("presenter");
                    } else {
                        interfaceC11002a = interfaceC11002a4;
                    }
                    interfaceC11002a.mo57378o0();
                    return;
                }
                return;
            }
            if (i11 != -2) {
                if (i11 == -1) {
                    AbstractC23647d.m123897g("5580103");
                    InterfaceC11002a interfaceC11002a5 = this.f55541c1;
                    if (interfaceC11002a5 == null) {
                        AbstractC19074t.m100223u("presenter");
                    } else {
                        interfaceC11002a = interfaceC11002a5;
                    }
                    interfaceC11002a.mo57386s2(false);
                    this.f55543e1 = false;
                    interfaceC17463d.dismiss();
                    return;
                }
                return;
            }
            AbstractC23647d.m123897g("5580104");
            InterfaceC11002a interfaceC11002a6 = this.f55541c1;
            if (interfaceC11002a6 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC11002a = interfaceC11002a6;
            }
            interfaceC11002a.mo57386s2(true);
            this.f55543e1 = true;
            interfaceC17463d.dismiss();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: L1 */
    public void mo57298L1() {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        ViewSwitcher viewSwitcher = c29881k.f138368E0;
        AbstractC19074t.m100207e(viewSwitcher, "vsContainerMainLayout");
        m57245gO(viewSwitcher, 0);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: M */
    public void mo57299M() {
        showDialog(3);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: M0 */
    public void mo57300M0() {
        SyncBannerCommonView syncBannerCommonView = this.f55536X0;
        if (syncBannerCommonView != null) {
            syncBannerCommonView.setVisibility(8);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: M1 */
    public void mo57301M1() {
        m57274tN();
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: N0 */
    public void mo57302N0(boolean z11) {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        c29881k.f138395e0.setChecked(z11);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: N1 */
    public void mo57303N1() {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        c29881k.f138381Q.setVisibility(8);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: N3 */
    public void mo57304N3(String str, List list) {
        AbstractC19074t.m100208f(str, "emailBackup");
        AbstractC19074t.m100208f(list, "entries");
        SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), list, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j m43152a = new C8009j.a(this.f72421L0.m92648SI()).m43172u(str).m43173v(100).m43155d(true).m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: m40.y

            /* renamed from: p */
            public final /* synthetic */ SimpleAdapter f111473p;

            /* renamed from: q */
            public final /* synthetic */ String f111474q;

            /* renamed from: r */
            public final /* synthetic */ BackupDetailView f111475r;

            public /* synthetic */ C22865y(SimpleAdapter simpleAdapter2, String str2, BackupDetailView this) {
                r1 = simpleAdapter2;
                r2 = str2;
                r3 = this;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                BackupDetailView.m57236cO(r1, r2, r3, interfaceC17463d, i11);
            }
        }).m43152a();
        AbstractC19074t.m100207e(m43152a, "create(...)");
        if (!m43152a.m92868m()) {
            m43152a.mo13822K();
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: O0 */
    public void mo57305O0(int i11, TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(targetBackupInfo, "backupInfo");
        if (AbstractC3489d.m17513u()) {
            if (AbstractC23306f.m120636Y1().m128530o() && AbstractC3489d.m17509q()) {
                C22438j.m115954w(C13958c.b.f71928t);
                return;
            } else if (C22447s.m116047m0(targetBackupInfo, false, 2, null)) {
                C22438j.m115954w(C13958c.b.f71928t);
                return;
            } else {
                C26263i.m135055u().m135085r0(i11);
                return;
            }
        }
        C17487o0 m92693xK = this.f72421L0.m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        C22438j.m115936J(m92693xK, i11, targetBackupInfo);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            C11007f.Companion.m57476b(this.f55542d1, this.f72421L0.m92642L3());
            View m92656bJ = this.f72421L0.m92656bJ();
            if (m92656bJ != null) {
                m57284yN(m92656bJ);
            }
            this.f72827B0.post(new Runnable() { // from class: m40.m
                public /* synthetic */ RunnableC22853m() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BackupDetailView.m57226XN(BackupDetailView.this);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLSettingBackupRestoreView", e11);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: Q */
    public void mo57306Q() {
        C29881k c29881k = this.f55529Q0;
        InterfaceC11002a interfaceC11002a = null;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        if (c29881k.f138396f0.isChecked()) {
            showDialog(6);
            return;
        }
        InterfaceC11002a interfaceC11002a2 = this.f55541c1;
        if (interfaceC11002a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC11002a = interfaceC11002a2;
        }
        interfaceC11002a.mo57358P1(true);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: R1 */
    public void mo57307R1(int i11) {
        AbstractC20110a.f98889a.mo104548a("changeUISettings, state=" + i11, new Object[0]);
        InterfaceC11002a interfaceC11002a = null;
        C29881k c29881k = null;
        InterfaceC11002a interfaceC11002a2 = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            mo57298L1();
                            m57251iO();
                            m57227YM(true);
                            m57237dN(true);
                            m57233bN(true);
                            m57223WM(true);
                            m57231aN(true);
                            m57239eN(true);
                            m57235cN(true);
                            m57241fN(false);
                            m57229ZM(true);
                            m57225XM(true);
                            mo57328s0(true);
                            return;
                        }
                        return;
                    }
                    mo57298L1();
                    m57251iO();
                    m57227YM(false);
                    m57237dN(false);
                    m57233bN(false);
                    m57223WM(false);
                    m57231aN(false);
                    m57239eN(false);
                    m57235cN(false);
                    m57241fN(false);
                    m57229ZM(false);
                    m57225XM(false);
                    mo57328s0(true);
                    return;
                }
                m57248hO();
                C29881k c29881k2 = this.f55529Q0;
                if (c29881k2 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29881k = c29881k2;
                }
                c29881k.f138412s.setVisibility(4);
                m57227YM(false);
                m57233bN(false);
                m57237dN(false);
                m57223WM(false);
                m57231aN(true);
                m57239eN(true);
                m57235cN(true);
                mo57328s0(false);
                m57241fN(false);
                m57229ZM(false);
                return;
            }
            m57251iO();
            m57227YM(true);
            m57237dN(true);
            m57233bN(false);
            m57223WM(true);
            m57231aN(true);
            m57239eN(true);
            m57235cN(true);
            m57229ZM(true);
            m57266pN(false);
            mo57328s0(false);
            m57241fN(true);
            InterfaceC11002a interfaceC11002a3 = this.f55541c1;
            if (interfaceC11002a3 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a3 = null;
            }
            if (!interfaceC11002a3.mo57381q0()) {
                InterfaceC11002a interfaceC11002a4 = this.f55541c1;
                if (interfaceC11002a4 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC11002a2 = interfaceC11002a4;
                }
                interfaceC11002a2.mo57349I1();
                return;
            }
            return;
        }
        m57251iO();
        m57227YM(true);
        m57233bN(true);
        m57237dN(true);
        m57223WM(true);
        m57231aN(true);
        m57239eN(true);
        m57235cN(true);
        m57225XM(true);
        m57229ZM(true);
        mo57298L1();
        m57266pN(true);
        m57241fN(true);
        InterfaceC11002a interfaceC11002a5 = this.f55541c1;
        if (interfaceC11002a5 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC11002a = interfaceC11002a5;
        }
        interfaceC11002a.mo57387u3(2);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            C21688c.Companion.m111854a().m111851x(this, "SYNC_MES");
            this.f55539a1.m87414t();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView.InterfaceC11142a
    /* renamed from: Rf */
    public void mo592Rf(View view) {
        AbstractC19074t.m100208f(view, "view");
        if (view == this.f55535W0) {
            InterfaceC11002a interfaceC11002a = this.f55541c1;
            if (interfaceC11002a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a = null;
            }
            interfaceC11002a.mo57356M0();
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: S2 */
    public void mo57308S2() {
        SyncEmptyBackupView syncEmptyBackupView;
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        if (!interfaceC11002a.mo57375lb() && !AbstractC3489d.m17512t() && (syncEmptyBackupView = this.f55533U0) != null) {
            syncEmptyBackupView.m58401c(0);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: U */
    public void mo57309U(int i11) {
        SyncMsgEditPwdBaseView.Companion.m58335b(this.f72421L0.m92662fJ(), SyncMessageSetPassView.class, 1803, i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        AbstractC26084s.m134256d(this);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 6003);
        bVar.m124119a().m124115b(this, 6024);
        bVar.m124119a().m124115b(this, 6025);
        bVar.m124119a().m124115b(this, 150812);
        m57217SN();
    }

    /* renamed from: UM */
    public void m57310UM(int i11, boolean z11) {
        int i12;
        String m92652XI;
        C29881k c29881k = this.f55529Q0;
        C29881k c29881k2 = null;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        ProgressBar progressBar = c29881k.f138389Y;
        AbstractC19074t.m100207e(progressBar, "progressBarRemainMedia");
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        progressBar.setVisibility(i12);
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k2 = c29881k3;
        }
        RobotoTextView robotoTextView = c29881k2.f138404n0;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    m92652XI = m92653YI(AbstractC8020f0.str_remind_number_img_exclude_from_backup_plural, Integer.valueOf(i11));
                } else {
                    m92652XI = m92653YI(AbstractC8020f0.str_remind_number_img_exclude_from_backup, Integer.valueOf(i11));
                }
            } else {
                m92652XI = m92653YI(AbstractC8020f0.str_content_all_img_is_backed_up, Integer.valueOf(i11));
            }
        } else {
            m92652XI = m92652XI(AbstractC8020f0.str_storage_calculating_usage);
        }
        robotoTextView.setText(m92652XI);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: V0 */
    public boolean mo57311V0() {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        return c29881k.f138384T.isEnabled();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 6003);
        bVar.m124119a().m124117e(this, 6024);
        bVar.m124119a().m124117e(this, 6025);
        InterfaceC11002a interfaceC11002a = null;
        this.f72827B0.removeCallbacksAndMessages(null);
        try {
            KeyEventCallbackC17462c keyEventCallbackC17462c = this.f55537Y0;
            if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                KeyEventCallbackC17462c keyEventCallbackC17462c2 = this.f55537Y0;
                AbstractC19074t.m100205c(keyEventCallbackC17462c2);
                keyEventCallbackC17462c2.dismiss();
            }
            InterfaceC11002a interfaceC11002a2 = this.f55541c1;
            if (interfaceC11002a2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC11002a = interfaceC11002a2;
            }
            interfaceC11002a.mo57345F();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: Y0 */
    public void mo57312Y0() {
        ViewStub viewStub;
        if (this.f55534V0 == null && this.f72421L0.m92656bJ() != null) {
            View m92656bJ = this.f72421L0.m92656bJ();
            View view = null;
            if (m92656bJ != null) {
                viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.viewstub_sync_processor);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            SyncProcessorView syncProcessorView = (SyncProcessorView) view;
            this.f55534V0 = syncProcessorView;
            if (syncProcessorView != null) {
                syncProcessorView.setEventListener(this);
            }
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: Y3 */
    public void mo57313Y3(String str) {
        AbstractC19074t.m100208f(str, "extraDataKey");
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            m92642L3.remove(str);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57349I1();
        m57284yN(view);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: a4 */
    public void mo57314a4() {
        try {
            InterfaceC11002a interfaceC11002a = this.f55541c1;
            C29881k c29881k = null;
            if (interfaceC11002a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a = null;
            }
            if (interfaceC11002a.mo57384r0()) {
                C29881k c29881k2 = this.f55529Q0;
                if (c29881k2 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29881k = c29881k2;
                }
                c29881k.f138407p0.setText(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_sync_backup_password_created));
                return;
            }
            C29881k c29881k3 = this.f55529Q0;
            if (c29881k3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29881k = c29881k3;
            }
            c29881k.f138407p0.setText(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_sync_backup_password_not_created));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: bB */
    public void mo57315bB() {
        if (this.f55539a1.m87408i() != null) {
            SettingReminderZinstantBanner m87408i = this.f55539a1.m87408i();
            AbstractC19074t.m100205c(m87408i);
            if (m87408i.getVisibility() != 8) {
                SettingReminderZinstantBanner m87408i2 = this.f55539a1.m87408i();
                AbstractC19074t.m100205c(m87408i2);
                m87408i2.setVisibility(8);
            }
        }
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_setting_auto_backup) {
            return 58;
        }
        if (i11 == AbstractC6918a0.ll_setting_backup_pwd) {
            return 112;
        }
        if (i11 == AbstractC6918a0.ll_setting_network_condition) {
            return 60;
        }
        return i11 == AbstractC6918a0.ll_setting_backup_e2ee ? 128 : -10;
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: eB */
    public void mo57316eB(AbstractC25219c abstractC25219c) {
        AbstractC19074t.m100208f(abstractC25219c, "driveState");
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        if (abstractC25219c instanceof AbstractC25219c.c) {
            c29881k.f138371G.setVisibility(8);
            c29881k.f138403m0.setVisibility(8);
            return;
        }
        if (abstractC25219c instanceof AbstractC25219c.a) {
            c29881k.f138371G.setVisibility(0);
            c29881k.f138403m0.setVisibility(0);
            c29881k.f138403m0.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.support_warning));
            ZAppCompatImageView zAppCompatImageView = c29881k.f138371G;
            Context context = zAppCompatImageView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_warning_line_16, AbstractC2807a.support_warning));
            c29881k.f138403m0.setText(m92652XI(AbstractC8020f0.str_error_account_running_out_of_space));
            return;
        }
        if (abstractC25219c instanceof AbstractC25219c.b) {
            c29881k.f138371G.setVisibility(0);
            c29881k.f138403m0.setVisibility(0);
            c29881k.f138403m0.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.support_error));
            ZAppCompatImageView zAppCompatImageView2 = c29881k.f138371G;
            Context context2 = zAppCompatImageView2.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            zAppCompatImageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_warning_line_16, AbstractC2807a.support_error));
            c29881k.f138403m0.setText(m92652XI(AbstractC8020f0.str_error_account_out_of_space));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (m57247hN()) {
            return;
        }
        super.finish();
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: g4 */
    public void mo57317g4(String str) {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        if (str != null && str.length() != 0) {
            c29881k.f138405o0.setText(str);
            c29881k.f138402l0.setText(str);
            c29881k.f138405o0.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            c29881k.f138391a0.setVisibility(0);
            c29881k.f138392b0.setVisibility(8);
        } else {
            c29881k.f138405o0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_add_account_ggdrive));
            c29881k.f138402l0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_add_account_ggdrive));
            c29881k.f138405o0.setCompoundDrawablesWithIntrinsicBounds(AbstractC16803z.ic_warning_backup_media, 0, 0, 0);
            c29881k.f138391a0.setVisibility(8);
            c29881k.f138392b0.setVisibility(0);
        }
        c29881k.f138371G.setVisibility(8);
        c29881k.f138403m0.setVisibility(8);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BackupDetailView";
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: j2 */
    public boolean mo57318j2() {
        View view = this.f55530R0;
        if (view != null && view != null && view.getVisibility() == 0) {
            return false;
        }
        return true;
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: j4 */
    public void mo57319j4(boolean z11) {
        int i11;
        C29881k c29881k = this.f55529Q0;
        C29881k c29881k2 = null;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        c29881k.f138396f0.setChecked(z11);
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k2 = c29881k3;
        }
        RobotoTextView robotoTextView = c29881k2.f138413s0;
        if (z11) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncEmptyBackupView.InterfaceC11144a
    /* renamed from: kx */
    public void mo57320kx() {
        C11007f c11007f;
        if (AbstractC3489d.m17504l()) {
            m57234bO();
            return;
        }
        C11007f c11007f2 = this.f55542d1;
        if (c11007f2 != null && c11007f2.m57461a() == 1 && (c11007f = this.f55542d1) != null) {
            c11007f.m57470j(0);
        }
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57362R9();
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: l3 */
    public void mo57321l3() {
        C29881k c29881k = this.f55529Q0;
        InterfaceC11002a interfaceC11002a = null;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        if (c29881k.f138395e0.isChecked()) {
            showDialog(2);
            return;
        }
        InterfaceC11002a interfaceC11002a2 = this.f55541c1;
        if (interfaceC11002a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC11002a = interfaceC11002a2;
        }
        interfaceC11002a.mo57377n3();
    }

    @Override // p586vt.InterfaceC28625j
    /* renamed from: lk */
    public void mo57172lk(AbstractC28627l abstractC28627l) {
        if (!(abstractC28627l instanceof C21688c.b)) {
            C26263i.m135034d0("Job message is not a sync message");
            return;
        }
        C21688c.b bVar = (C21688c.b) abstractC28627l;
        if (!mo45894h0()) {
            return;
        }
        AbstractC20110a.f98889a.mo104548a("BackupDetailView updateSyncStatus phase: %d = currentProgress: %d ", Integer.valueOf(bVar.f132722a), Integer.valueOf(bVar.f105263d));
        if (C22447s.m116019U(bVar.f132722a)) {
            RunnableC10994b runnableC10994b = new RunnableC10994b();
            runnableC10994b.m57338b(bVar);
            if (mo45894h0()) {
                this.f72827B0.post(runnableC10994b);
                return;
            }
            return;
        }
        this.f55540b1.m57338b(bVar);
        if (mo45894h0()) {
            this.f72827B0.post(this.f55540b1);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: m2 */
    public void mo57322m2(String str) {
        C3294e c3294e;
        AbstractC19074t.m100208f(str, "msgText");
        SyncProcessorView syncProcessorView = this.f55534V0;
        if (syncProcessorView != null) {
            c3294e = syncProcessorView.getSyncStateData();
        } else {
            c3294e = null;
        }
        C3297h.m16736f(c3294e, str);
        m57220UN();
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: m3 */
    public void mo57323m3() {
        C17487o0 m92662fJ;
        Context context = getContext();
        if (context != null && (m92662fJ = m92662fJ()) != null) {
            AbstractC23306f.m120696o().m126196B(context, m92662fJ, new C10999g(), C11000h.f55558q);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: o0 */
    public ArrayList mo57324o0() {
        C29881k c29881k = this.f55529Q0;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        return AbstractC26084s.m134263k(this, c29881k.f138394d0.getArrayChildViewVisible(), m92656bJ());
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        boolean z11;
        boolean m131390w;
        super.onActivityResult(i11, i12, intent);
        InterfaceC11002a interfaceC11002a = null;
        boolean z12 = true;
        if (i11 != 33) {
            if (i11 == 100 && i12 == -1 && intent != null) {
                m131390w = AbstractC25358n.m131390w(new Integer[]{128, 60, 112}, Integer.valueOf(intent.getIntExtra("EXTRA_REQ_KEY_CODE", 0)));
                if (m131390w) {
                    m57181AN();
                }
            }
        } else if (i12 == -1 && intent != null) {
            if (intent.getIntExtra("EXTRA_REQ_RESTORE_FROM_BOTTOM_SHEET", 0) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (intent.getIntExtra("EXTRA_REQ_REMOVE_BACKUP_FROM_BOTTOM_SHEET", 0) != 1) {
                z12 = false;
            }
            if (z11) {
                C29881k c29881k = this.f55529Q0;
                if (c29881k == null) {
                    AbstractC19074t.m100223u("binding");
                    c29881k = null;
                }
                c29881k.f138418v.performClick();
            }
            if (z12) {
                m57238dO();
            }
        }
        try {
            InterfaceC11002a interfaceC11002a2 = this.f55541c1;
            if (interfaceC11002a2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC11002a = interfaceC11002a2;
            }
            interfaceC11002a.mo57354L2(i11, i12, intent);
        } catch (Exception e11) {
            C26220b.m134821d("SMLSettingBackupRestoreView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4 && m57247hN()) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        InterfaceC11002a interfaceC11002a2 = null;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57368Z1();
        InterfaceC11002a interfaceC11002a3 = this.f55541c1;
        if (interfaceC11002a3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a3 = null;
        }
        interfaceC11002a3.mo57391w1();
        InterfaceC11002a interfaceC11002a4 = this.f55541c1;
        if (interfaceC11002a4 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a4 = null;
        }
        interfaceC11002a4.mo57344C2();
        try {
            mo57297K3();
            InterfaceC11002a interfaceC11002a5 = this.f55541c1;
            if (interfaceC11002a5 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a5 = null;
            }
            if (interfaceC11002a5.mo57381q0()) {
                InterfaceC11002a interfaceC11002a6 = this.f55541c1;
                if (interfaceC11002a6 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC11002a2 = interfaceC11002a6;
                }
                interfaceC11002a2.mo57379p();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        this.f55539a1.m87413s();
        this.f72827B0.post(new Runnable() { // from class: m40.g
            public /* synthetic */ RunnableC22842g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BackupDetailView.m57230ZN(BackupDetailView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncEmptyBackupView.InterfaceC11144a
    /* renamed from: p0 */
    public void mo57325p0() {
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57380p0();
    }

    @Override // m40.InterfaceC22830a, com.zing.zalo.p077ui.backuprestore.widget.SyncProcessorView.InterfaceC11146a
    /* renamed from: r */
    public void mo57326r(int i11, int i12) {
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        InterfaceC27218a m92692wK = this.f72421L0.m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        interfaceC11002a.mo57366Y3(i11, m92692wK, i12);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: r0 */
    public void mo57327r0(int i11, TargetBackupInfo targetBackupInfo) {
        C17487o0 m92693xK = this.f72421L0.m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        C22438j.m115930D(m92693xK, i11, targetBackupInfo);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: s0 */
    public void mo57328s0(boolean z11) {
        C29881k c29881k = null;
        if (z11) {
            C29881k c29881k2 = this.f55529Q0;
            if (c29881k2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29881k = c29881k2;
            }
            c29881k.f138420w.setVisibility(0);
            return;
        }
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k = c29881k3;
        }
        c29881k.f138420w.setVisibility(8);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: s1 */
    public void mo57329s1(String str, String str2) {
        AbstractC19074t.m100208f(str, "pcName");
        AbstractC19074t.m100208f(str2, "syncSession");
        Bundle bundle = new Bundle();
        bundle.putString("extra_req_sync_from_pc_name", str);
        bundle.putString("extra_req_sync_from_pc_session", str2);
        C17487o0 m92662fJ = m92662fJ();
        AbstractC19074t.m100205c(m92662fJ);
        m92662fJ.m93069k2(PcSyncRequestView.class, bundle, 0, true);
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: t0 */
    public boolean mo57330t0() {
        boolean z11;
        if (this.f55539a1.m87408i() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean m87405e = this.f55539a1.m87405e(this, 39);
        if (z11 && m87405e && this.f55539a1.m87408i() != null) {
            SettingReminderZinstantBanner m87408i = this.f55539a1.m87408i();
            AbstractC19074t.m100205c(m87408i);
            if (m87408i.getVisibility() != 0) {
                AbstractC20110a.f98889a.mo104548a("invalidateDataBannersChanged invalidateDataRemindSettingBanner VISIBLE", new Object[0]);
                SettingReminderZinstantBanner m87408i2 = this.f55539a1.m87408i();
                AbstractC19074t.m100205c(m87408i2);
                m87408i2.setVisibility(0);
            }
        }
        return m87405e;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncProcessorView.InterfaceC11146a
    /* renamed from: u */
    public void mo57331u() {
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57389v2();
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: u3 */
    public void mo57332u3() {
        Toast.makeText(getContext(), AbstractC8020f0.get_backupinfo_fail, 1).show();
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: w3 */
    public void mo57333w3() {
        try {
            m57278vN();
            C29881k c29881k = this.f55529Q0;
            if (c29881k == null) {
                AbstractC19074t.m100223u("binding");
                c29881k = null;
            }
            ViewSwitcher viewSwitcher = c29881k.f138368E0;
            AbstractC19074t.m100207e(viewSwitcher, "vsContainerMainLayout");
            m57245gO(viewSwitcher, 1);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: w4 */
    public boolean mo57334w4() {
        return m57250iN(this.f55530R0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 6000) {
            if (i11 != 6003) {
                if (i11 != 150812) {
                    if (i11 != 6024) {
                        if (i11 == 6025) {
                            this.f72827B0.post(new Runnable() { // from class: m40.s
                                public /* synthetic */ RunnableC22859s() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    BackupDetailView.m57264oN(BackupDetailView.this);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    this.f72827B0.post(new Runnable() { // from class: m40.q
                        public /* synthetic */ RunnableC22857q() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            BackupDetailView.m57262nN(BackupDetailView.this);
                        }
                    });
                    return;
                }
                AbstractC23350e.m122772b("EVENT_REFRESH_BACKUP_DETAIL bkd", new Object[0]);
                mo57298L1();
                return;
            }
            this.f72827B0.post(new Runnable() { // from class: m40.p
                public /* synthetic */ RunnableC22856p() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BackupDetailView.m57260mN(BackupDetailView.this);
                }
            });
            return;
        }
        this.f72827B0.post(new Runnable() { // from class: m40.n
            public /* synthetic */ RunnableC22854n() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BackupDetailView.m57256kN(BackupDetailView.this);
            }
        });
        this.f72827B0.post(new Runnable() { // from class: m40.o
            public /* synthetic */ RunnableC22855o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BackupDetailView.m57258lN(BackupDetailView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView.InterfaceC11142a
    /* renamed from: x9 */
    public void mo596x9(int i11, View view) {
        AbstractC19074t.m100208f(view, "view");
        mo57326r(i11, 1);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        InterfaceC11002a interfaceC11002a = this.f55541c1;
        InterfaceC11002a interfaceC11002a2 = null;
        if (interfaceC11002a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a = null;
        }
        interfaceC11002a.mo57360Q1();
        InterfaceC11002a interfaceC11002a3 = this.f55541c1;
        if (interfaceC11002a3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a3 = null;
        }
        interfaceC11002a3.mo57348I0();
        mo57314a4();
        InterfaceC11002a interfaceC11002a4 = this.f55541c1;
        if (interfaceC11002a4 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a4 = null;
        }
        interfaceC11002a4.mo57350J2();
        InterfaceC11002a interfaceC11002a5 = this.f55541c1;
        if (interfaceC11002a5 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a5 = null;
        }
        interfaceC11002a5.mo57372k2();
        this.f72827B0.post(new Runnable() { // from class: m40.v
            public /* synthetic */ RunnableC22862v() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BackupDetailView.m57222VN(BackupDetailView.this);
            }
        });
        InterfaceC11002a interfaceC11002a6 = this.f55541c1;
        if (interfaceC11002a6 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC11002a6 = null;
        }
        if (!interfaceC11002a6.mo57388ul()) {
            InterfaceC11002a interfaceC11002a7 = this.f55541c1;
            if (interfaceC11002a7 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a7 = null;
            }
            interfaceC11002a7.mo57343Bj(C11003b.b.f55576p);
            InterfaceC11002a interfaceC11002a8 = this.f55541c1;
            if (interfaceC11002a8 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC11002a8 = null;
            }
            interfaceC11002a8.mo57371io().m9219j(m92657cJ(), new C10998f(new C10997e()));
            InterfaceC11002a interfaceC11002a9 = this.f55541c1;
            if (interfaceC11002a9 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC11002a2 = interfaceC11002a9;
            }
            interfaceC11002a2.mo57374kn();
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: z0 */
    public void mo57335z0() {
        SyncBannerCommonView syncBannerCommonView = this.f55535W0;
        if (syncBannerCommonView != null) {
            syncBannerCommonView.setVisibility(8);
        }
    }

    @Override // m40.InterfaceC22830a
    /* renamed from: z2 */
    public void mo57336z2(C26701b c26701b) {
        AbstractC19074t.m100208f(c26701b, "syncBackupInfoContent");
        C29881k c29881k = this.f55529Q0;
        C29881k c29881k2 = null;
        if (c29881k == null) {
            AbstractC19074t.m100223u("binding");
            c29881k = null;
        }
        c29881k.f138408q.m58384V(c26701b);
        C29881k c29881k3 = this.f55529Q0;
        if (c29881k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k3 = null;
        }
        c29881k3.f138408q.setVisibility(0);
        C29881k c29881k4 = this.f55529Q0;
        if (c29881k4 == null) {
            AbstractC19074t.m100223u("binding");
            c29881k4 = null;
        }
        c29881k4.f138410r.setVisibility(8);
        C29881k c29881k5 = this.f55529Q0;
        if (c29881k5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29881k2 = c29881k5;
        }
        c29881k2.f138412s.setVisibility(0);
    }
}
