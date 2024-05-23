package p387oc;

import ac.C0708i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.backuprestore.exception.BackupRestoreForegroundServiceException;
import com.zing.zalo.backuprestore.service.BackupRestoreService;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import jm.AbstractC21289a;
import me0.AbstractC23104j;
import me0.AbstractC23136l9;
import p320ld.C22438j;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p421pc.C24720a;
import p484ri.C25806c;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import sc.C26220b;
import si.C26263i;

/* renamed from: oc.q */
/* loaded from: classes3.dex */
public final class C24213q {
    public static final b Companion = new b(null);

    /* renamed from: d */
    private static final InterfaceC24854k f116827d;

    /* renamed from: a */
    private final InterfaceC24854k f116828a;

    /* renamed from: b */
    private final InterfaceC24854k f116829b;

    /* renamed from: c */
    private C16972e0 f116830c;

    /* renamed from: oc.q$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f116831q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24213q mo12V4() {
            return c.f116832a.m126206a();
        }
    }

    /* renamed from: oc.q$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24213q m126205a() {
            return (C24213q) C24213q.f116827d.getValue();
        }
    }

    /* renamed from: oc.q$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f116832a = new c();

        /* renamed from: b */
        private static final C24213q f116833b = new C24213q();

        private c() {
        }

        /* renamed from: a */
        public final C24213q m126206a() {
            return f116833b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oc.q$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f116834q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24720a mo12V4() {
            return AbstractC23306f.m120676j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oc.q$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f116835q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25806c mo12V4() {
            return AbstractC23306f.m120692n();
        }
    }

    /* renamed from: oc.q$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f116836q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m126209a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m126209a() {
        }
    }

    /* renamed from: oc.q$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f116837q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m126210a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m126210a() {
        }
    }

    /* renamed from: oc.q$h */
    /* loaded from: classes3.dex */
    public static final class h extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ ButtonWithProgress f116838a;

        /* renamed from: b */
        final /* synthetic */ Context f116839b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ButtonWithProgress buttonWithProgress, Context context) {
            super(5000L, 1000L);
            this.f116838a = buttonWithProgress;
            this.f116839b = context;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Button button;
            ButtonWithProgress buttonWithProgress = this.f116838a;
            Button button2 = null;
            if (buttonWithProgress != null) {
                button = buttonWithProgress.getButton();
            } else {
                button = null;
            }
            if (button != null) {
                button.setText(this.f116839b.getString(AbstractC8020f0.str_popup_story_delete_confirm));
            }
            ButtonWithProgress buttonWithProgress2 = this.f116838a;
            if (buttonWithProgress2 != null) {
                button2 = buttonWithProgress2.getButton();
            }
            if (button2 != null) {
                button2.setEnabled(true);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
            Button button;
            ButtonWithProgress buttonWithProgress = this.f116838a;
            Button button2 = null;
            if (buttonWithProgress != null) {
                button = buttonWithProgress.getButton();
            } else {
                button = null;
            }
            if (button != null) {
                button.setText(this.f116839b.getString(AbstractC8020f0.str_popup_story_delete_confirm) + " (" + ((j11 / 1000) + 1) + ")");
            }
            ButtonWithProgress buttonWithProgress2 = this.f116838a;
            if (buttonWithProgress2 != null) {
                button2 = buttonWithProgress2.getButton();
            }
            if (button2 != null) {
                button2.setEnabled(false);
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f116831q);
        f116827d = m129210a;
    }

    public C24213q() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(e.f116835q);
        this.f116828a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(d.f116834q);
        this.f116829b = m129210a2;
    }

    /* renamed from: A */
    public static final void m126164A(C19059j0 c19059j0, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(c19059j0, "$countDownTimer");
        CountDownTimer countDownTimer = (CountDownTimer) c19059j0.f94941p;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c19059j0.f94941p = null;
    }

    /* renamed from: C */
    public static final void m126165C(InterfaceC18494a interfaceC18494a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC18494a, "$onPositiveButtonClick");
        interfaceC18494a.mo12V4();
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: D */
    public static final void m126166D(InterfaceC18494a interfaceC18494a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC18494a, "$onNegativeButtonClick");
        interfaceC18494a.mo12V4();
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: F */
    public static final void m126167F(InterfaceC18494a interfaceC18494a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC18494a, "$onPositiveButtonClick");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        interfaceC18494a.mo12V4();
    }

    /* renamed from: G */
    public static final void m126168G(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23647d.m123897g("5580115");
    }

    /* renamed from: I */
    public static final void m126169I(Context context, ZaloView zaloView, C24213q c24213q, InterfaceC17463d interfaceC17463d, int i11) {
        C17487o0 c17487o0;
        AbstractC19074t.m100208f(context, "$context");
        AbstractC19074t.m100208f(zaloView, "$zaloView");
        AbstractC19074t.m100208f(c24213q, "this$0");
        InterfaceC27218a m92676n2 = zaloView.m92676n2();
        if (m92676n2 != null) {
            c17487o0 = m92676n2.mo35579p();
        } else {
            c17487o0 = null;
        }
        c24213q.m126190t(c17487o0);
        interfaceC17463d.dismiss();
    }

    /* renamed from: J */
    public static final void m126170J(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: M */
    public static final void m126171M(InterfaceC27218a interfaceC27218a) {
        ZaloView m93012K0;
        AbstractC19074t.m100208f(interfaceC27218a, "$zaloLauncherActivity");
        try {
            C17487o0 mo35579p = interfaceC27218a.mo35579p();
            if (mo35579p == null || (m93012K0 = mo35579p.m93012K0()) == null) {
                return;
            }
            C8009j.a aVar = new C8009j.a(m93012K0.m92648SI());
            aVar.m43172u(m93012K0.m92652XI(AbstractC8020f0.alert_title));
            aVar.m43162k(m93012K0.m92652XI(AbstractC8020f0.sync_when_transfer_error));
            aVar.m43170s(m93012K0.m92652XI(AbstractC8020f0.str_close), new InterfaceC17463d.d() { // from class: oc.g
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    C24213q.m126172N(interfaceC17463d, i11);
                }
            });
            aVar.m43152a().mo13822K();
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreUIHandler", e11);
        }
    }

    /* renamed from: N */
    public static final void m126172N(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        interfaceC17463d.dismiss();
    }

    /* renamed from: p */
    private final C24720a m126187p() {
        return (C24720a) this.f116829b.getValue();
    }

    /* renamed from: q */
    private final C25806c m126188q() {
        return (C25806c) this.f116828a.getValue();
    }

    /* renamed from: s */
    public static final C24213q m126189s() {
        return Companion.m126205a();
    }

    /* renamed from: t */
    private final void m126190t(C17487o0 c17487o0) {
        Bundle bundle = new Bundle();
        m126187p().m128393J();
        bundle.putBoolean("FORCE_PROCESSING_FLAG", true);
        if (c17487o0 != null) {
            C22438j.m115953v(c17487o0, bundle);
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m126191v(C24213q c24213q, Context context, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC18494a = f.f116836q;
        }
        if ((i11 & 4) != 0) {
            interfaceC18494a2 = g.f116837q;
        }
        c24213q.m126203u(context, interfaceC18494a, interfaceC18494a2);
    }

    /* renamed from: w */
    public static final void m126192w(InterfaceC18494a interfaceC18494a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC18494a, "$onClickPositiveEvent");
        interfaceC18494a.mo12V4();
    }

    /* renamed from: x */
    public static final void m126193x(InterfaceC18494a interfaceC18494a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC18494a, "$onClickNegativeEvent");
        interfaceC18494a.mo12V4();
    }

    /* renamed from: y */
    public static final void m126194y(C16972e0 c16972e0, C19059j0 c19059j0, Context context, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(c16972e0, "$this_apply");
        AbstractC19074t.m100208f(c19059j0, "$countDownTimer");
        AbstractC19074t.m100208f(context, "$context");
        c19059j0.f94941p = new h(c16972e0.m90915L(-1), context).start();
    }

    /* renamed from: z */
    public static final void m126195z(C19059j0 c19059j0, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(c19059j0, "$countDownTimer");
        CountDownTimer countDownTimer = (CountDownTimer) c19059j0.f94941p;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c19059j0.f94941p = null;
    }

    /* renamed from: B */
    public final void m126196B(Context context, C17487o0 c17487o0, final InterfaceC18494a interfaceC18494a, final InterfaceC18494a interfaceC18494a2) {
        int i11;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18494a, "onPositiveButtonClick");
        AbstractC19074t.m100208f(interfaceC18494a2, "onNegativeButtonClick");
        if (c17487o0 != null) {
            boolean m116057s = C22447s.m116057s(C26263i.m135058w());
            String string = context.getString(AbstractC8020f0.str_title_warning_the_unrestored_backup);
            AbstractC19074t.m100207e(string, "getString(...)");
            if (m116057s) {
                i11 = AbstractC8020f0.str_description_backup_override_message_and_media;
            } else {
                i11 = AbstractC8020f0.str_description_backup_override_message_only;
            }
            String string2 = context.getString(i11);
            AbstractC19074t.m100207e(string2, "getString(...)");
            String string3 = context.getString(AbstractC8020f0.str_skip);
            AbstractC19074t.m100207e(string3, "getString(...)");
            String string4 = context.getString(AbstractC8020f0.str_action_restore);
            AbstractC19074t.m100207e(string4, "getString(...)");
            new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("override_auto_backup_dialog").m90918B(string).m90949z(string2).m90920D(LayoutInflater.from(context).inflate(AbstractC7409c0.warning_popup_top_view_red, (ViewGroup) null)).m90922F(true).m90947x("override_restore_button").m90943t(string4, new InterfaceC17463d.d() { // from class: oc.n
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    C24213q.m126165C(InterfaceC18494a.this, interfaceC17463d, i12);
                }
            }).m90937n("override_backup_button").m90934k(string3, new InterfaceC17463d.d() { // from class: oc.o
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    C24213q.m126166D(InterfaceC18494a.this, interfaceC17463d, i12);
                }
            }).m90927d().mo13822K();
        }
    }

    /* renamed from: E */
    public final void m126197E(TargetBackupInfo targetBackupInfo, Context context, final InterfaceC18494a interfaceC18494a) {
        int i11;
        String string;
        AbstractC19074t.m100208f(targetBackupInfo, "backupInfo");
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18494a, "onPositiveButtonClick");
        boolean z11 = !C22447s.m116057s(targetBackupInfo);
        if (z11) {
            i11 = AbstractC8020f0.str_restore_skip_popup_title;
        } else {
            i11 = AbstractC8020f0.str_restore_skip_popup_title_media;
        }
        if (z11) {
            string = context.getString(AbstractC8020f0.str_restore_skip_popup_desc);
        } else {
            string = context.getString(AbstractC8020f0.str_restore_skip_popup_desc_media);
        }
        AbstractC19074t.m100205c(string);
        new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("dialog_no_restore_with_new_backup").m90917A(i11).m90949z(string).m90920D(LayoutInflater.from(context).inflate(AbstractC7409c0.warning_popup_top_view_red, (ViewGroup) null)).m90921E(true).m90922F(false).m90942s(AbstractC8020f0.str_restore_skip_popup_skip_btn, new InterfaceC17463d.d() { // from class: oc.p
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                C24213q.m126167F(InterfaceC18494a.this, interfaceC17463d, i12);
            }
        }).m90933j(AbstractC8020f0.str_btn_back, new InterfaceC17463d.d() { // from class: oc.e
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                C24213q.m126168G(interfaceC17463d, i12);
            }
        }).m90947x("no_restore_button").m90937n("dialog_no_restore_with_new_backup_cancel").m90923G();
    }

    /* renamed from: H */
    public final void m126198H(final ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        C16972e0 c16972e0 = this.f116830c;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        String m92652XI = zaloView.m92652XI(AbstractC8020f0.str_title_promote_auto_backup);
        String m92652XI2 = zaloView.m92652XI(AbstractC8020f0.str_des_promote_auto_backup);
        final Context context = zaloView.getContext();
        if (context == null) {
            return;
        }
        AbstractC19074t.m100207e(context, "requireNonNull(...)");
        C16972e0.a m90919C = new C16972e0.a(context).m90932i(C16972e0.b.POPUP).m90931h("auto_backup_dialog").m90919C(AbstractC23136l9.m118665N(context, AbstractC16803z.ic_promote_auto_backup_16_9));
        AbstractC19074t.m100205c(m92652XI);
        C16972e0.a m90918B = m90919C.m90918B(m92652XI);
        AbstractC19074t.m100205c(m92652XI2);
        C16972e0.a m90947x = m90918B.m90925b(m92652XI2, null).m90947x("autobackup_reminder_button");
        C0708i c0708i = new C0708i();
        c0708i.m1072c("display_time", m126188q().m133062x());
        this.f116830c = m90947x.m90946w(c0708i).m90942s(AbstractC8020f0.str_btn_enable_promote_auto_backup, new InterfaceC17463d.d() { // from class: oc.d
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C24213q.m126169I(context, zaloView, this, interfaceC17463d, i11);
            }
        }).m90937n("autobackup_close_button").m90933j(AbstractC8020f0.str_btn_cancel_promote_auto_backup, new InterfaceC17463d.d() { // from class: oc.h
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C24213q.m126170J(interfaceC17463d, i11);
            }
        }).m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral).m90923G();
    }

    /* renamed from: K */
    public final void m126199K() {
        C26220b.m134827j("stopBackupService()", null, 2, null);
        try {
            MainApplication.C6895a c6895a = MainApplication.Companion;
            c6895a.m35500c().stopService(new Intent(c6895a.m35500c().getApplicationContext(), (Class<?>) BackupRestoreService.class));
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreUIHandler", e11);
        }
    }

    /* renamed from: L */
    public final void m126200L() {
        final InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
        if (m57112d == null) {
            return;
        }
        m57112d.runOnUiThread(new Runnable() { // from class: oc.f
            @Override // java.lang.Runnable
            public final void run() {
                C24213q.m126171M(InterfaceC27218a.this);
            }
        });
    }

    /* renamed from: o */
    public final boolean m126201o(String str) {
        AbstractC19074t.m100208f(str, "queue");
        C26220b.m134827j("checkAndStartBackupService()", null, 2, null);
        boolean m118480b = AbstractC23104j.m118480b(31);
        boolean z11 = AbstractC21289a.Companion.m110248b().get();
        if (C22447s.f109797a.m116076s0()) {
            return false;
        }
        if (m118480b && !z11) {
            C26220b.m134820c("App in background. Do not start BACKUP/RESTORE/TRANSFER foreground service");
            return false;
        }
        if (!C22447s.m116052p0(true)) {
            C26220b.m134820c("Invalid notif channel. Do not start BACKUP/RESTORE/TRANSFER foreground service");
            return false;
        }
        C26220b.m134825h("Start BACKUP/RESTORE/TRANSFER foreground service", C26220b.a.f124588p);
        try {
            MainApplication.C6895a c6895a = MainApplication.Companion;
            Intent intent = new Intent(c6895a.m35500c().getApplicationContext(), (Class<?>) BackupRestoreService.class);
            intent.putExtra("extra_queue", str);
            intent.setAction("com.zing.zalo.intent.action.START_BACKUP_SERVICE_FOREGROUND");
            AbstractC1388a.m6975q(c6895a.m35500c(), intent);
            return true;
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreUIHandler", new BackupRestoreForegroundServiceException("Error occurred while start BACKUP/RESTORE/TRANSFER foreground service: isAtLeastS=" + m118480b + ", isAppForeGround=" + z11, e11));
            return false;
        }
    }

    /* renamed from: r */
    public final String m126202r(Context context) {
        int i11;
        AbstractC19074t.m100208f(context, "context");
        if (AbstractC3489d.m17514v()) {
            i11 = AbstractC8020f0.str_content_backup_on_zcloud_server;
        } else {
            i11 = AbstractC8020f0.str_content_backup_on_server;
        }
        String string = context.getString(i11);
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    /* renamed from: u */
    public final void m126203u(final Context context, final InterfaceC18494a interfaceC18494a, final InterfaceC18494a interfaceC18494a2) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18494a, "onClickNegativeEvent");
        AbstractC19074t.m100208f(interfaceC18494a2, "onClickPositiveEvent");
        final C19059j0 c19059j0 = new C19059j0();
        C16972e0.a m90920D = new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION).m90920D(LayoutInflater.from(context).inflate(AbstractC7409c0.warning_popup_top_view_red, (ViewGroup) null));
        String string = context.getString(AbstractC8020f0.str_zcloud_setup_dialog_delete_password_and_backup_title);
        AbstractC19074t.m100207e(string, "getString(...)");
        C16972e0.a m90918B = m90920D.m90918B(string);
        String string2 = context.getString(AbstractC8020f0.str_zcloud_setup_dialog_delete_password_and_backup_description);
        AbstractC19074t.m100207e(string2, "getString(...)");
        final C16972e0 m90927d = m90918B.m90949z(string2).m90921E(true).m90928e(true).m90942s(AbstractC8020f0.str_popup_story_delete_confirm, new InterfaceC17463d.d() { // from class: oc.i
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C24213q.m126192w(InterfaceC18494a.this, interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: oc.j
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C24213q.m126193x(InterfaceC18494a.this, interfaceC17463d, i11);
            }
        }).m90927d();
        m90927d.mo88280H(new InterfaceC17463d.g() { // from class: oc.k
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.g
            /* renamed from: a */
            public final void mo12456a(InterfaceC17463d interfaceC17463d) {
                C24213q.m126194y(C16972e0.this, c19059j0, context, interfaceC17463d);
            }
        });
        m90927d.m92855F(new InterfaceC17463d.e() { // from class: oc.l
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
            /* renamed from: Tv */
            public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                C24213q.m126195z(C19059j0.this, interfaceC17463d);
            }
        });
        m90927d.m92854E(new InterfaceC17463d.c() { // from class: oc.m
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                C24213q.m126164A(C19059j0.this, interfaceC17463d);
            }
        });
        m90927d.mo13822K();
    }
}
