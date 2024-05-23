package com.zing.zalo.p077ui.backuprestore.configbackup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.lifecycle.AbstractC1803x;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.backuprestore.configbackup.ConfigBackupView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessagePassManageView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessageSetPassView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.bottomsheet.ChangeProtectCodeRecognitionSheetView;
import com.zing.zalo.p077ui.zalocloud.settings.ZCloudSettingsView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import l40.C22065e;
import l40.InterfaceC22061a;
import l40.InterfaceC22062b;
import me0.AbstractC23136l9;
import mg0.AbstractC23291c;
import mj0.AbstractC23322a;
import p297kd.C21688c;
import p297kd.C21690e;
import p320ld.C22442n;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p421pc.C24720a;
import p479rc.C25727d;
import p484ri.C25806c;
import p586vt.AbstractC28626k;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import p649xl.C29848i2;
import p716zh.C31986k3;
import p716zh.EnumC31882d4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;
import si.C26263i;
import tg0.C26676b;
import ui0.C27280g;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import x60.AbstractC29394g;

/* loaded from: classes5.dex */
public final class ConfigBackupView extends SlidableZaloView implements InterfaceC22062b, InterfaceC17463d.d, C23744a.c, InterfaceC26066a, InterfaceC28625j {
    public static final C10988a Companion = new C10988a(null);

    /* renamed from: Q0 */
    private C29848i2 f55510Q0;

    /* renamed from: S0 */
    private C10992a f55512S0;

    /* renamed from: T0 */
    private KeyEventCallbackC17462c f55513T0;

    /* renamed from: U0 */
    private InterfaceC22061a f55514U0;

    /* renamed from: P0 */
    private Handler f55509P0 = new Handler(Looper.getMainLooper());

    /* renamed from: R0 */
    private final RunnableC10989b f55511R0 = new RunnableC10989b();

    /* renamed from: com.zing.zalo.ui.backuprestore.configbackup.ConfigBackupView$a */
    /* loaded from: classes5.dex */
    public static final class C10988a {
        private C10988a() {
        }

        public /* synthetic */ C10988a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.configbackup.ConfigBackupView$b */
    /* loaded from: classes5.dex */
    private final class RunnableC10989b implements Runnable {

        /* renamed from: p */
        private int f55515p;

        /* renamed from: q */
        private int f55516q;

        /* renamed from: r */
        private int f55517r;

        /* renamed from: s */
        private int f55518s;

        /* renamed from: t */
        private C21690e f55519t;

        /* renamed from: u */
        private boolean f55520u = true;

        /* renamed from: v */
        private boolean f55521v;

        public RunnableC10989b() {
        }

        /* renamed from: a */
        public final void m57173a(C21688c.b bVar) {
            AbstractC19074t.m100208f(bVar, "syncStateMessage");
            this.f55515p = bVar.f105263d;
            this.f55516q = bVar.f132722a;
            this.f55517r = bVar.m111856g();
            this.f55518s = bVar.m111855f();
            this.f55521v = bVar.f105265f;
            AbstractC28626k m143178a = bVar.m143178a();
            if (m143178a != null) {
                C21690e c21690e = (C21690e) m143178a;
                this.f55519t = c21690e;
                this.f55520u = c21690e.m111898x();
            }
            AbstractC20110a.f98889a.mo104548a("SyncStateMessage=" + bVar, new Object[0]);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11 = this.f55516q;
            if (i11 != 0) {
                switch (i11) {
                    case 18:
                        ConfigBackupView.this.f72421L0.mo49282B8(C22442n.m115989e(18, this.f55517r, this.f55521v), false);
                        return;
                    case 19:
                        ConfigBackupView.this.f72421L0.mo49282B8(C22442n.m115989e(19, this.f55517r, this.f55521v), false);
                        return;
                    case 20:
                        ConfigBackupView.this.f72421L0.mo49315c4();
                        ConfigBackupView.this.mo57168So();
                        return;
                    case 21:
                        ConfigBackupView.this.f72421L0.mo49315c4();
                        ToastUtils.showMess(true, C22442n.m115989e(21, this.f55517r, this.f55521v));
                        return;
                    case 22:
                        ConfigBackupView.this.f72421L0.mo49315c4();
                        return;
                    default:
                        return;
                }
            }
            ConfigBackupView.this.f72421L0.mo49315c4();
            InterfaceC22061a interfaceC22061a = ConfigBackupView.this.f55514U0;
            if (interfaceC22061a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC22061a = null;
            }
            interfaceC22061a.mo115184K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.configbackup.ConfigBackupView$c */
    /* loaded from: classes5.dex */
    public static final class C10990c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55523t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.backuprestore.configbackup.ConfigBackupView$c$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ ConfigBackupView f55525p;

            a(ConfigBackupView configBackupView) {
                this.f55525p = configBackupView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC23291c abstractC23291c, Continuation continuation) {
                C29848i2 c29848i2 = null;
                if (abstractC23291c instanceof AbstractC23291c.c) {
                    C29848i2 c29848i22 = this.f55525p.f55510Q0;
                    if (c29848i22 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29848i2 = c29848i22;
                    }
                    RobotoTextView robotoTextView = c29848i2.f138123w;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m92652XI = this.f55525p.m92652XI(AbstractC8020f0.str_zcloud_change_pass_progressing);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    String format = String.format(m92652XI, Arrays.copyOf(new Object[]{AbstractC29094b.m145341c(abstractC23291c.mo120404a())}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    robotoTextView.setText(format + "%");
                } else {
                    C29848i2 c29848i23 = this.f55525p.f55510Q0;
                    if (c29848i23 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29848i2 = c29848i23;
                    }
                    c29848i2.f138123w.setText(this.f55525p.m92652XI(AbstractC8020f0.str_title_protect_code));
                }
                return C24848g0.f119245a;
            }
        }

        C10990c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10990c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f55523t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m132783f = C25727d.Companion.m132783f();
                a aVar = new a(ConfigBackupView.this);
                this.f55523t = 1;
                if (m132783f.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10990c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.configbackup.ConfigBackupView$d */
    /* loaded from: classes5.dex */
    public static final class C10991d implements AbstractC29394g.a {
        C10991d() {
        }

        @Override // x60.AbstractC29394g.a
        /* renamed from: a */
        public void mo57176a() {
            InterfaceC22061a interfaceC22061a = ConfigBackupView.this.f55514U0;
            if (interfaceC22061a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC22061a = null;
            }
            interfaceC22061a.mo115185M();
        }

        @Override // x60.AbstractC29394g.a
        /* renamed from: b */
        public void mo57177b(int i11) {
            InterfaceC22061a interfaceC22061a = ConfigBackupView.this.f55514U0;
            if (interfaceC22061a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC22061a = null;
            }
            interfaceC22061a.mo115196s0(i11);
        }
    }

    /* renamed from: AM */
    private final void m57139AM() {
        C29848i2 c29848i2 = this.f55510Q0;
        C29848i2 c29848i22 = null;
        if (c29848i2 == null) {
            AbstractC19074t.m100223u("binding");
            c29848i2 = null;
        }
        AbstractC26084s.m134251H(c29848i2.f138120t, 112);
        C29848i2 c29848i23 = this.f55510Q0;
        if (c29848i23 == null) {
            AbstractC19074t.m100223u("binding");
            c29848i23 = null;
        }
        AbstractC26084s.m134251H(c29848i23.f138119s, 60);
        C29848i2 c29848i24 = this.f55510Q0;
        if (c29848i24 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29848i22 = c29848i24;
        }
        AbstractC26084s.m134251H(c29848i22.f138118r, 128);
    }

    /* renamed from: K3 */
    private final void m57140K3() {
        C21688c.Companion.m111854a().m111849u(this, "SYNC_MES");
    }

    /* renamed from: oM */
    private final void m57149oM() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getBoolean("KEY_SHOW_RECOGNITION_CHANGE_PROTECT_CODE", false) && !ChangeProtectCodeRecognitionSheetView.Companion.m77101f()) {
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                m92642L32.putBoolean("KEY_SHOW_RECOGNITION_CHANGE_PROTECT_CODE", false);
            }
            BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C10990c(null), 3, null);
            AbstractC19444a.m101694b(new Runnable() { // from class: l40.k
                @Override // java.lang.Runnable
                public final void run() {
                    ConfigBackupView.m57150pM(ConfigBackupView.this);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public static final void m57150pM(ConfigBackupView configBackupView) {
        AbstractC19074t.m100208f(configBackupView, "this$0");
        ChangeProtectCodeRecognitionSheetView.C13825a c13825a = ChangeProtectCodeRecognitionSheetView.Companion;
        C17487o0 m92693xK = configBackupView.m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        c13825a.m77103h(m92693xK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m57151qM(ConfigBackupView configBackupView) {
        AbstractC19074t.m100208f(configBackupView, "this$0");
        configBackupView.m57139AM();
    }

    /* renamed from: rM */
    private final void m57152rM(View[] viewArr, long j11) {
        for (final View view : viewArr) {
            if (view != null) {
                if (view.getVisibility() != 0) {
                    return;
                }
                if (j11 <= 0) {
                    view.setVisibility(8);
                } else {
                    view.animate().alpha(0.0f).setDuration(j11).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new Runnable() { // from class: l40.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConfigBackupView.m57154tM(view);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: sM */
    static /* synthetic */ void m57153sM(ConfigBackupView configBackupView, View[] viewArr, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        configBackupView.m57152rM(viewArr, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public static final void m57154tM(View view) {
        view.setVisibility(8);
    }

    /* renamed from: uM */
    private final void m57155uM() {
        C29848i2 c29848i2 = this.f55510Q0;
        if (c29848i2 == null) {
            AbstractC19074t.m100223u("binding");
            c29848i2 = null;
        }
        c29848i2.f138119s.setOnClickListener(new View.OnClickListener() { // from class: l40.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigBackupView.m57156vM(ConfigBackupView.this, view);
            }
        });
        Switch r22 = c29848i2.f138122v;
        r22.setOnCheckedChangeListener(null);
        r22.setOnClickListener(new View.OnClickListener() { // from class: l40.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigBackupView.m57157wM(ConfigBackupView.this, view);
            }
        });
        c29848i2.f138120t.setOnClickListener(new View.OnClickListener() { // from class: l40.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigBackupView.m57158xM(ConfigBackupView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final void m57156vM(ConfigBackupView configBackupView, View view) {
        AbstractC19074t.m100208f(configBackupView, "this$0");
        configBackupView.mo50035CK(-1, new Intent().putExtra("EXTRA_REQ_KEY_CODE", 60));
        InterfaceC22061a interfaceC22061a = configBackupView.f55514U0;
        if (interfaceC22061a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC22061a = null;
        }
        interfaceC22061a.mo115188g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final void m57157wM(ConfigBackupView configBackupView, View view) {
        AbstractC19074t.m100208f(configBackupView, "this$0");
        InterfaceC22061a interfaceC22061a = configBackupView.f55514U0;
        if (interfaceC22061a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC22061a = null;
        }
        interfaceC22061a.mo115186N();
        configBackupView.mo50035CK(-1, new Intent().putExtra("EXTRA_REQ_KEY_CODE", 128));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m57158xM(ConfigBackupView configBackupView, View view) {
        AbstractC19074t.m100208f(configBackupView, "this$0");
        configBackupView.mo50035CK(-1, new Intent().putExtra("EXTRA_REQ_KEY_CODE", 112));
        InterfaceC22061a interfaceC22061a = configBackupView.f55514U0;
        if (interfaceC22061a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC22061a = null;
        }
        interfaceC22061a.mo115198za(true);
    }

    /* renamed from: yM */
    private final void m57159yM() {
        C25806c m120692n = AbstractC23306f.m120692n();
        AbstractC19074t.m100207e(m120692n, "provideBackupRestoreRepo(...)");
        C24720a m120676j = AbstractC23306f.m120676j();
        AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
        this.f55514U0 = new C22065e(this, m120692n, m120676j);
        this.f55512S0 = new C10992a(false, 1, null);
        InterfaceC22061a interfaceC22061a = this.f55514U0;
        if (interfaceC22061a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC22061a = null;
        }
        C10992a c10992a = this.f55512S0;
        if (c10992a == null) {
            AbstractC19074t.m100223u("viewArgs");
            c10992a = null;
        }
        interfaceC22061a.mo995Nd(c10992a, null);
    }

    /* renamed from: zM */
    private final void m57160zM() {
        C10992a m57179a = C10992a.Companion.m57179a(this.f72421L0.m92642L3());
        this.f55512S0 = m57179a;
        InterfaceC22061a interfaceC22061a = null;
        if (m57179a == null) {
            AbstractC19074t.m100223u("viewArgs");
            m57179a = null;
        }
        if (m57179a.m57178a()) {
            m57139AM();
        }
        InterfaceC22061a interfaceC22061a2 = this.f55514U0;
        if (interfaceC22061a2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC22061a2 = null;
        }
        if (!interfaceC22061a2.mo115194r()) {
            View[] viewArr = new View[1];
            C29848i2 c29848i2 = this.f55510Q0;
            if (c29848i2 == null) {
                AbstractC19074t.m100223u("binding");
                c29848i2 = null;
            }
            viewArr[0] = c29848i2.f138120t;
            m57153sM(this, viewArr, 0L, 2, null);
        }
        InterfaceC22061a interfaceC22061a3 = this.f55514U0;
        if (interfaceC22061a3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC22061a3 = null;
        }
        if (!interfaceC22061a3.mo115187N4()) {
            View[] viewArr2 = new View[1];
            C29848i2 c29848i22 = this.f55510Q0;
            if (c29848i22 == null) {
                AbstractC19074t.m100223u("binding");
                c29848i22 = null;
            }
            viewArr2[0] = c29848i22.f138119s;
            m57153sM(this, viewArr2, 0L, 2, null);
        }
        C29848i2 c29848i23 = this.f55510Q0;
        if (c29848i23 == null) {
            AbstractC19074t.m100223u("binding");
            c29848i23 = null;
        }
        if (C31986k3.f147083a.m154111U1()) {
            View[] viewArr3 = new View[1];
            C29848i2 c29848i24 = this.f55510Q0;
            if (c29848i24 == null) {
                AbstractC19074t.m100223u("binding");
                c29848i24 = null;
            }
            viewArr3[0] = c29848i24.f138118r;
            m57153sM(this, viewArr3, 0L, 2, null);
            InterfaceC22061a interfaceC22061a4 = this.f55514U0;
            if (interfaceC22061a4 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC22061a4 = null;
            }
            if (!interfaceC22061a4.mo115189je()) {
                InterfaceC22061a interfaceC22061a5 = this.f55514U0;
                if (interfaceC22061a5 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC22061a = interfaceC22061a5;
                }
                interfaceC22061a.mo115183Hh(EnumC31882d4.f146444r.m153207c());
            }
        } else {
            Switch r32 = c29848i23.f138122v;
            InterfaceC22061a interfaceC22061a6 = this.f55514U0;
            if (interfaceC22061a6 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC22061a = interfaceC22061a6;
            }
            r32.setChecked(interfaceC22061a.mo115190m6());
        }
        ZAppCompatImageView zAppCompatImageView = c29848i23.f138117q;
        Context context = zAppCompatImageView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        mo57168So();
    }

    @Override // l40.InterfaceC22062b
    /* renamed from: B */
    public void mo57161B(String str) {
        AbstractC19074t.m100208f(str, "strCondNetwork");
        C29848i2 c29848i2 = this.f55510Q0;
        if (c29848i2 == null) {
            AbstractC19074t.m100223u("binding");
            c29848i2 = null;
        }
        c29848i2.f138124x.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(4).m43172u(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_dialog_confirm_backup_overwrite_title)).m43173v(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_desc_restore_before_backup_set_pwd)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_negative_btn_restore_before_backup_pwd), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_positive_btn_restore_before_backup_pwd), this);
            return aVar.m43152a();
        }
        Context m92686rK = this.f72421L0.m92686rK();
        AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
        C16972e0.a aVar2 = new C16972e0.a(m92686rK);
        aVar2.m90931h("backup_e2ee_modal_off_e2ee");
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_off_setting_backup_e2ee_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        aVar2.m90918B(m118743r0);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_off_setting_backup_e2ee_desc);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        aVar2.m90949z(m118743r02);
        aVar2.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar2.m90921E(true);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_off_setting_backup_e2ee_btn_positive);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        aVar2.m90943t(m118743r03, this);
        aVar2.m90947x("backup_e2ee_dialog_confirm_off");
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        aVar2.m90934k(m118743r04, this);
        aVar2.m90937n("backup_e2ee_dialog_not_confirm_off");
        return aVar2.m90927d();
    }

    @Override // l40.InterfaceC22062b
    /* renamed from: F */
    public void mo57162F() {
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(SyncMessagePassManageView.class, null, 1804, 1, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29848i2 m148060c = C29848i2.m148060c(LayoutInflater.from(getContext()));
        AbstractC19074t.m100207e(m148060c, "inflate(...)");
        this.f55510Q0 = m148060c;
        m57159yM();
        C29848i2 c29848i2 = this.f55510Q0;
        if (c29848i2 == null) {
            AbstractC19074t.m100223u("binding");
            c29848i2 = null;
        }
        ScrollViewVisibleChildViewDetector root = c29848i2.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // l40.InterfaceC22062b
    /* renamed from: Gr */
    public void mo57163Gr() {
        m92693xK().m93069k2(ZCloudSettingsView.class, null, 1, true);
        C26676b.f126324a.m137011y();
    }

    @Override // l40.InterfaceC22062b
    /* renamed from: H */
    public void mo57164H(String[] strArr, int i11) {
        AbstractC19074t.m100208f(strArr, "arrayConditionWifi");
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f55513T0;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.dismiss();
        }
        this.f55513T0 = AbstractC29394g.m146569n(this.f72421L0.m92648SI(), strArr, i11, MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_syncmes_sync_mes_setting_title), new C10991d(), 3);
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            C29848i2 c29848i2 = null;
            InterfaceC22061a interfaceC22061a = null;
            InterfaceC22061a interfaceC22061a2 = null;
            if (mo92862f != 1) {
                if (mo92862f == 2 && i11 == -1) {
                    interfaceC17463d.dismiss();
                    InterfaceC22061a interfaceC22061a3 = this.f55514U0;
                    if (interfaceC22061a3 == null) {
                        AbstractC19074t.m100223u("presenter");
                    } else {
                        interfaceC22061a = interfaceC22061a3;
                    }
                    interfaceC22061a.mo115191o0();
                    return;
                }
                return;
            }
            if (i11 != -2) {
                if (i11 == -1) {
                    InterfaceC22061a interfaceC22061a4 = this.f55514U0;
                    if (interfaceC22061a4 == null) {
                        AbstractC19074t.m100223u("presenter");
                    } else {
                        interfaceC22061a2 = interfaceC22061a4;
                    }
                    interfaceC22061a2.mo115197sh(false);
                    interfaceC17463d.dismiss();
                    return;
                }
                return;
            }
            C29848i2 c29848i22 = this.f55510Q0;
            if (c29848i22 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29848i2 = c29848i22;
            }
            c29848i2.f138122v.setChecked(true);
            interfaceC17463d.dismiss();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // l40.InterfaceC22062b
    /* renamed from: M */
    public void mo57165M() {
        showDialog(2);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        m57149oM();
    }

    @Override // l40.InterfaceC22062b
    /* renamed from: Q */
    public void mo57166Q() {
        C29848i2 c29848i2 = this.f55510Q0;
        InterfaceC22061a interfaceC22061a = null;
        if (c29848i2 == null) {
            AbstractC19074t.m100223u("binding");
            c29848i2 = null;
        }
        if (c29848i2.f138122v.isChecked()) {
            showDialog(1);
            return;
        }
        InterfaceC22061a interfaceC22061a2 = this.f55514U0;
        if (interfaceC22061a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC22061a = interfaceC22061a2;
        }
        interfaceC22061a.mo115197sh(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            C21688c.Companion.m111854a().m111851x(this, "SYNC_MES");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // l40.InterfaceC22062b
    /* renamed from: Ri */
    public ArrayList mo57167Ri() {
        C29848i2 c29848i2 = this.f55510Q0;
        if (c29848i2 == null) {
            AbstractC19074t.m100223u("binding");
            c29848i2 = null;
        }
        return AbstractC26084s.m134263k(this, c29848i2.f138121u.getArrayChildViewVisible(), m92656bJ());
    }

    @Override // l40.InterfaceC22062b
    /* renamed from: So */
    public void mo57168So() {
        TargetBackupInfo targetBackupInfo;
        try {
            InterfaceC22061a interfaceC22061a = this.f55514U0;
            C29848i2 c29848i2 = null;
            if (interfaceC22061a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC22061a = null;
            }
            if (interfaceC22061a.mo115195r0()) {
                C7924a m135087t = C26263i.m135055u().m135087t();
                if (m135087t != null && (targetBackupInfo = m135087t.f42886u) != null) {
                    if (targetBackupInfo.m40953i() == 1) {
                        C29848i2 c29848i22 = this.f55510Q0;
                        if (c29848i22 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c29848i2 = c29848i22;
                        }
                        c29848i2.f138123w.setText(m92652XI(AbstractC8020f0.str_tv_password));
                        return;
                    }
                    C29848i2 c29848i23 = this.f55510Q0;
                    if (c29848i23 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29848i2 = c29848i23;
                    }
                    c29848i2.f138123w.setText(m92652XI(AbstractC8020f0.str_title_protect_code));
                    return;
                }
                return;
            }
            C29848i2 c29848i24 = this.f55510Q0;
            if (c29848i24 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29848i2 = c29848i24;
            }
            c29848i2.f138123w.setText(m92652XI(AbstractC8020f0.str_title_password_not_set));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // l40.InterfaceC22062b
    /* renamed from: U */
    public void mo57169U(int i11) {
        SyncMsgEditPwdBaseView.Companion.m58335b(this.f72421L0.m92662fJ(), SyncMessageSetPassView.class, 1803, i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        InterfaceC22061a interfaceC22061a = this.f55514U0;
        if (interfaceC22061a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC22061a = null;
        }
        interfaceC22061a.mo115182F();
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_config_password_backup) {
            return 112;
        }
        if (i11 == AbstractC6918a0.ll_config_network_condition) {
            return 60;
        }
        return i11 == AbstractC6918a0.ll_config_backup_msg_e2ee ? 128 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ConfigBackupView";
    }

    @Override // l40.InterfaceC22062b
    /* renamed from: kd */
    public void mo57171kd(boolean z11) {
        C29848i2 c29848i2 = this.f55510Q0;
        if (c29848i2 == null) {
            AbstractC19074t.m100223u("binding");
            c29848i2 = null;
        }
        c29848i2.f138122v.setChecked(z11);
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
        AbstractC20110a.f98889a.mo104548a("ConfigBackupView updateSyncStatus phase: %d = currentProgress: %d ", Integer.valueOf(bVar.f132722a), Integer.valueOf(bVar.f105263d));
        if (C22447s.m116019U(bVar.f132722a)) {
            RunnableC10989b runnableC10989b = new RunnableC10989b();
            runnableC10989b.m57173a(bVar);
            if (mo45894h0()) {
                this.f55509P0.post(runnableC10989b);
                return;
            }
            return;
        }
        this.f55511R0.m57173a(bVar);
        if (mo45894h0()) {
            this.f55509P0.post(this.f55511R0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        int i13 = 2;
        if (i11 != 1804) {
            if (i11 == 1805) {
                mo57168So();
                if (intent != null) {
                    i13 = intent.getIntExtra("extra_entry_point", 2);
                }
                boolean z11 = false;
                if (intent != null && intent.getBooleanExtra("extra_delete_data", false)) {
                    z11 = true;
                }
                if (i12 == -1 && !z11) {
                    C26263i.m135055u().m135085r0(i13);
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("extra_action", -1);
            if (intExtra != 0 && intExtra != 2) {
                if (intExtra == 3) {
                    finish();
                }
            } else {
                this.f72421L0.mo46829Y();
            }
        }
        mo57168So();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            m57140K3();
            InterfaceC22061a interfaceC22061a = this.f55514U0;
            InterfaceC22061a interfaceC22061a2 = null;
            if (interfaceC22061a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC22061a = null;
            }
            if (interfaceC22061a.mo115193q0()) {
                InterfaceC22061a interfaceC22061a3 = this.f55514U0;
                if (interfaceC22061a3 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC22061a2 = interfaceC22061a3;
                }
                interfaceC22061a2.mo115192p();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 6000) {
            this.f55509P0.post(new Runnable() { // from class: l40.l
                @Override // java.lang.Runnable
                public final void run() {
                    ConfigBackupView.m57151qM(ConfigBackupView.this);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m57160zM();
        m57155uM();
    }
}
