package com.zing.zalo.p077ui.backuprestore.remind;

import ac.C0697c0;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.text.AbstractC1463b;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.backuprestore.remind.RemindBackupView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.t81;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.EnumC17020n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p227i3.C20218v;
import p269jj.C21275a;
import p320ld.C22438j;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p542ub.InterfaceC27218a;
import p645xh.C29628e;
import p649xl.C29928ma;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vg.AbstractC28207v1;

/* loaded from: classes5.dex */
public final class RemindBackupView extends SlidableZaloView implements View.OnClickListener {
    public static final C11110a Companion = new C11110a(null);

    /* renamed from: P0 */
    private C29928ma f55945P0;

    /* renamed from: Q0 */
    private C16972e0 f55946Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f55947R0;

    /* renamed from: S0 */
    private TargetBackupInfo f55948S0;

    /* renamed from: T0 */
    private boolean f55949T0;

    /* renamed from: U0 */
    private boolean f55950U0;

    /* renamed from: com.zing.zalo.ui.backuprestore.remind.RemindBackupView$a */
    /* loaded from: classes5.dex */
    public static final class C11110a {
        private C11110a() {
        }

        public /* synthetic */ C11110a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.remind.RemindBackupView$b */
    /* loaded from: classes5.dex */
    static final class C11111b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11111b f55951q = new C11111b();

        C11111b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21275a mo12V4() {
            return AbstractC23306f.m120583H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.remind.RemindBackupView$c */
    /* loaded from: classes5.dex */
    public static final class C11112c extends AbstractC19075u implements InterfaceC18494a {
        C11112c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m58038a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m58038a() {
            RemindBackupView.this.m58015LM();
        }
    }

    public RemindBackupView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C11111b.f55951q);
        this.f55947R0 = m129210a;
    }

    /* renamed from: AM */
    private final void m58004AM() {
        C0697c0.Companion.m1052f(this, "funnel", m58025oM());
        C29928ma c29928ma = this.f55945P0;
        C29928ma c29928ma2 = null;
        if (c29928ma == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma = null;
        }
        c29928ma.f138682s.setIdTracking("skip_remind_backup_old_device_icon");
        C29928ma c29928ma3 = this.f55945P0;
        if (c29928ma3 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma3 = null;
        }
        c29928ma3.f138680q.setIdTracking("remind_to_backup_old_device_button");
        C29928ma c29928ma4 = this.f55945P0;
        if (c29928ma4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29928ma2 = c29928ma4;
        }
        c29928ma2.f138681r.setIdTracking("remind_to_backup_old_device_negative_button");
    }

    /* renamed from: BM */
    private final void m58005BM() {
        TargetBackupInfo targetBackupInfo = this.f55948S0;
        if (targetBackupInfo != null) {
            m58036zM(targetBackupInfo);
        }
    }

    /* renamed from: CM */
    private final void m58006CM() {
        int i11;
        TargetBackupInfo targetBackupInfo = this.f55948S0;
        if (targetBackupInfo != null && !C22447s.m116057s(targetBackupInfo)) {
            i11 = AbstractC8020f0.str_remind_backup_restore_old_backup_popup_desc;
        } else {
            i11 = AbstractC8020f0.str_remind_backup_restore_old_backup_popup_desc_media;
        }
        Spanned m7440a = AbstractC1463b.m7440a(m92652XI(i11), 0);
        AbstractC19074t.m100207e(m7440a, "fromHtml(...)");
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.warning_popup_top_view_red, (ViewGroup) null);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90949z = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("dialog_restore_old_backup_after_remind").m90917A(AbstractC8020f0.str_remind_backup_restore_old_backup_popup_title).m90949z(m7440a);
        String m92652XI = m92652XI(AbstractC8020f0.str_remind_backup_restore_old_backup_popup_desc_2);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        this.f55946Q0 = m90949z.m90925b(m92652XI, null).m90920D(inflate).m90922F(true).m90942s(AbstractC8020f0.str_remind_backup_action, new InterfaceC17463d.d() { // from class: x40.e
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                RemindBackupView.m58007DM(RemindBackupView.this, interfaceC17463d, i12);
            }
        }).m90944u(AbstractC23136l9.m118665N(m92689tK(), AbstractC23322a.zds_ic_open_out_app_line_24), EnumC17020n.LEADING).m90933j(AbstractC8020f0.str_remind_backup_restore_old_backup_popup_confirm_btn, new InterfaceC17463d.d() { // from class: x40.f
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                RemindBackupView.m58008EM(RemindBackupView.this, interfaceC17463d, i12);
            }
        }).m90947x("remind_to_backup_old_device_button").m90937n("restore_backup_button").m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m58007DM(RemindBackupView remindBackupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(remindBackupView, "this$0");
        interfaceC17463d.dismiss();
        AbstractC23152n3.m119050j0(remindBackupView.m92689tK(), remindBackupView.m58026pM().m110204g().m116310b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m58008EM(RemindBackupView remindBackupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(remindBackupView, "this$0");
        interfaceC17463d.dismiss();
        remindBackupView.m58032vM();
    }

    /* renamed from: FM */
    private final void m58009FM() {
        int i11 = AbstractC8020f0.str_remind_backup_skip_popup_title_media;
        String m92652XI = m92652XI(AbstractC8020f0.str_remind_backup_skip_popup_desc_media);
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.warning_popup_top_view_red, (ViewGroup) null);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90917A = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("dialog_no_restore_after_remind").m90917A(i11);
        AbstractC19074t.m100205c(m92652XI);
        this.f55946Q0 = m90917A.m90949z(m92652XI).m90920D(inflate).m90922F(true).m90942s(AbstractC8020f0.str_remind_backup_action, new InterfaceC17463d.d() { // from class: x40.c
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                RemindBackupView.m58010GM(RemindBackupView.this, interfaceC17463d, i12);
            }
        }).m90944u(AbstractC23136l9.m118665N(m92689tK(), AbstractC23322a.zds_ic_open_out_app_line_24), EnumC17020n.LEADING).m90933j(AbstractC8020f0.str_remind_backup_skip_popup_skip_btn, new InterfaceC17463d.d() { // from class: x40.d
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                RemindBackupView.m58011HM(RemindBackupView.this, interfaceC17463d, i12);
            }
        }).m90947x("remind_to_backup_old_device_button").m90937n("no_restore_button").m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m58010GM(RemindBackupView remindBackupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(remindBackupView, "this$0");
        interfaceC17463d.dismiss();
        AbstractC23152n3.m119050j0(remindBackupView.m92689tK(), remindBackupView.m58026pM().m110204g().m116310b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m58011HM(RemindBackupView remindBackupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(remindBackupView, "this$0");
        interfaceC17463d.dismiss();
        remindBackupView.finish();
    }

    /* renamed from: IM */
    private final void m58012IM() {
        int i11;
        int i12;
        boolean z11 = !C22447s.m116057s(this.f55948S0);
        if (z11) {
            i11 = AbstractC8020f0.str_restore_skip_popup_title;
        } else {
            i11 = AbstractC8020f0.str_restore_skip_popup_title_media;
        }
        if (z11) {
            i12 = AbstractC8020f0.str_restore_skip_popup_desc;
        } else {
            i12 = AbstractC8020f0.str_restore_skip_popup_desc_media;
        }
        String m92652XI = m92652XI(i12);
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.warning_popup_top_view_red, (ViewGroup) null);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90917A = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("dialog_no_restore_after_remind").m90917A(i11);
        AbstractC19074t.m100205c(m92652XI);
        this.f55946Q0 = m90917A.m90949z(m92652XI).m90920D(inflate).m90922F(true).m90942s(AbstractC8020f0.str_remind_backup_action, new InterfaceC17463d.d() { // from class: x40.a
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                RemindBackupView.m58013JM(RemindBackupView.this, interfaceC17463d, i13);
            }
        }).m90944u(AbstractC23136l9.m118665N(m92689tK(), AbstractC23322a.zds_ic_open_out_app_line_24), EnumC17020n.LEADING).m90933j(AbstractC8020f0.str_restore_skip_popup_skip_btn, new InterfaceC17463d.d() { // from class: x40.b
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                RemindBackupView.m58014KM(RemindBackupView.this, interfaceC17463d, i13);
            }
        }).m90947x("remind_to_backup_old_device_button").m90937n("no_restore_button").m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m58013JM(RemindBackupView remindBackupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(remindBackupView, "this$0");
        interfaceC17463d.dismiss();
        AbstractC23152n3.m119050j0(remindBackupView.m92689tK(), remindBackupView.m58026pM().m110204g().m116310b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m58014KM(RemindBackupView remindBackupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(remindBackupView, "this$0");
        interfaceC17463d.dismiss();
        remindBackupView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public final void m58015LM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92693xK().m93069k2(MainTabView.class, bundle, 1, true);
    }

    /* renamed from: MM */
    private final void m58016MM(int i11, InterfaceC18494a interfaceC18494a) {
        String m128414i;
        try {
            try {
                m128414i = AbstractC23306f.m120676j().m128414i();
            } catch (Exception e11) {
                interfaceC18494a.mo12V4();
                AbstractC23350e.m122776f("SMLRemindBackupView", e11);
            }
            if (m128414i != null && m128414i.length() != 0 && !this.f55950U0) {
                JSONObject jSONObject = new JSONObject(m128414i);
                InterfaceC27218a m92676n2 = m92676n2();
                AbstractC19074t.m100205c(m92676n2);
                AbstractC28207v1.m141875H0(jSONObject, m92676n2, null, null, null, i11, new t81());
                return;
            }
            interfaceC18494a.mo12V4();
        } finally {
            this.f55950U0 = true;
        }
    }

    /* renamed from: nM */
    private final void m58024nM() {
        C16972e0 c16972e0 = this.f55946Q0;
        if (c16972e0 != null && c16972e0.m92868m()) {
            c16972e0.dismiss();
            this.f55946Q0 = null;
        }
    }

    /* renamed from: oM */
    private final String m58025oM() {
        if (m58027qM()) {
            return "{\"flow\":\"no_backup_after_login\"}";
        }
        return "{\"flow\":\"has_old_backup_after_login\"}";
    }

    /* renamed from: pM */
    private final C21275a m58026pM() {
        return (C21275a) this.f55947R0.getValue();
    }

    /* renamed from: qM */
    private final boolean m58027qM() {
        return this.f55948S0 == null;
    }

    /* renamed from: rM */
    private final void m58028rM() {
        AbstractC23152n3.m119050j0(m92689tK(), m58026pM().m110204g().m116310b());
    }

    /* renamed from: sM */
    private final void m58029sM() {
        boolean z11 = !this.f55949T0;
        this.f55949T0 = z11;
        m58034xM(z11);
    }

    /* renamed from: tM */
    private final void m58030tM() {
        m58006CM();
    }

    /* renamed from: uM */
    private final void m58031uM() {
        if (m58027qM()) {
            m58009FM();
        } else {
            m58012IM();
        }
    }

    /* renamed from: vM */
    private final void m58032vM() {
        TargetBackupInfo targetBackupInfo = this.f55948S0;
        if (targetBackupInfo != null) {
            C17487o0 m92693xK = m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            C22438j.m115936J(m92693xK, 3, targetBackupInfo);
        }
    }

    /* renamed from: wM */
    private final void m58033wM() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f55948S0 = (TargetBackupInfo) m92642L3.getParcelable("EXTRA_BACKUP_INFO");
        }
        TargetBackupInfo targetBackupInfo = this.f55948S0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("parseViewArgs(): backupInfo=");
        sb2.append(targetBackupInfo);
    }

    /* renamed from: xM */
    private final void m58034xM(boolean z11) {
        int i11;
        int i12;
        C29928ma c29928ma = this.f55945P0;
        C29928ma c29928ma2 = null;
        if (c29928ma == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma = null;
        }
        Context context = c29928ma.getRoot().getContext();
        if (z11) {
            i11 = AbstractC23322a.zds_ic_chevron_up_line_16;
        } else {
            i11 = AbstractC23322a.zds_ic_chevron_down_line_16;
        }
        Drawable m118665N = AbstractC23136l9.m118665N(context, i11);
        C29928ma c29928ma3 = this.f55945P0;
        if (c29928ma3 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma3 = null;
        }
        c29928ma3.f138687x.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, m118665N, (Drawable) null);
        C29928ma c29928ma4 = this.f55945P0;
        if (c29928ma4 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma4 = null;
        }
        RobotoTextView robotoTextView = c29928ma4.f138689z;
        int i13 = 8;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        robotoTextView.setVisibility(i12);
        C29928ma c29928ma5 = this.f55945P0;
        if (c29928ma5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29928ma2 = c29928ma5;
        }
        RobotoTextView robotoTextView2 = c29928ma2.f138688y;
        if (z11) {
            i13 = 0;
        }
        robotoTextView2.setVisibility(i13);
    }

    /* renamed from: yM */
    private final void m58035yM() {
        C29928ma c29928ma = this.f55945P0;
        C29928ma c29928ma2 = null;
        if (c29928ma == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma = null;
        }
        c29928ma.f138682s.setOnClickListener(this);
        C29928ma c29928ma3 = this.f55945P0;
        if (c29928ma3 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma3 = null;
        }
        c29928ma3.f138680q.setOnClickListener(this);
        C29928ma c29928ma4 = this.f55945P0;
        if (c29928ma4 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma4 = null;
        }
        c29928ma4.f138681r.setOnClickListener(this);
        C29928ma c29928ma5 = this.f55945P0;
        if (c29928ma5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29928ma2 = c29928ma5;
        }
        c29928ma2.f138687x.setOnClickListener(this);
    }

    /* renamed from: zM */
    private final void m58036zM(TargetBackupInfo targetBackupInfo) {
        long days = TimeUnit.MILLISECONDS.toDays(C23793c.Companion.m124321a().mo124314i() - targetBackupInfo.m40950f());
        C29928ma c29928ma = this.f55945P0;
        C29928ma c29928ma2 = null;
        if (c29928ma == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma = null;
        }
        c29928ma.f138678A.setText(m92653YI(AbstractC8020f0.str_remind_backup_title_old_backup, Long.valueOf(days)));
        C29928ma c29928ma3 = this.f55945P0;
        if (c29928ma3 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma3 = null;
        }
        c29928ma3.f138686w.setText(m92653YI(AbstractC8020f0.str_remind_backup_desc_old_backup, Long.valueOf(days)));
        C29928ma c29928ma4 = this.f55945P0;
        if (c29928ma4 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma4 = null;
        }
        c29928ma4.f138686w.setVisibility(0);
        C29928ma c29928ma5 = this.f55945P0;
        if (c29928ma5 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma5 = null;
        }
        c29928ma5.f138685v.setText(AbstractC8020f0.str_remind_backup_action_old_backup);
        C29928ma c29928ma6 = this.f55945P0;
        if (c29928ma6 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma6 = null;
        }
        c29928ma6.f138687x.setVisibility(0);
        String m116058t = C22447s.m116058t(targetBackupInfo.m40950f());
        C29928ma c29928ma7 = this.f55945P0;
        if (c29928ma7 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma7 = null;
        }
        c29928ma7.f138689z.setText(m92653YI(AbstractC8020f0.str_remind_backup_latest_backup_time, m116058t));
        C29928ma c29928ma8 = this.f55945P0;
        if (c29928ma8 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma8 = null;
        }
        c29928ma8.f138688y.setText(m92653YI(AbstractC8020f0.str_remind_backup_latest_backup_device, targetBackupInfo.m40958n()));
        C29928ma c29928ma9 = this.f55945P0;
        if (c29928ma9 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma9 = null;
        }
        c29928ma9.f138681r.setVisibility(0);
        C29928ma c29928ma10 = this.f55945P0;
        if (c29928ma10 == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma10 = null;
        }
        ViewGroup.LayoutParams layoutParams = c29928ma10.f138680q.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, 0, 0, AbstractC23136l9.m118742r(80.0f));
        C29928ma c29928ma11 = this.f55945P0;
        if (c29928ma11 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29928ma2 = c29928ma11;
        }
        c29928ma2.f138680q.setLayoutParams(layoutParams2);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        boolean z11 = false;
        C29928ma m148251c = C29928ma.m148251c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148251c, "inflate(...)");
        this.f55945P0 = m148251c;
        if (bundle != null) {
            z11 = bundle.getBoolean("EXTRA_IS_SKIP_SURVEY");
        }
        this.f55950U0 = z11;
        m58033wM();
        m58005BM();
        m58004AM();
        m58035yM();
        C29928ma c29928ma = this.f55945P0;
        if (c29928ma == null) {
            AbstractC19074t.m100223u("binding");
            c29928ma = null;
        }
        RelativeLayout root = c29928ma.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putBoolean("EXTRA_IS_SKIP_SURVEY", this.f55950U0);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m58024nM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        AbstractC23306f.m120676j().m128408Z(false);
        C29628e.m147249E0().m147293v1();
        m58016MM(69905, new C11112c());
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BackupLoginScreen";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 69905) {
            m58015LM();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_skip) {
            m58031uM();
            return;
        }
        if (id2 == AbstractC6918a0.tv_lasted_backup) {
            m58029sM();
        } else if (id2 == AbstractC6918a0.btn_action) {
            m58028rM();
        } else if (id2 == AbstractC6918a0.btn_negative_action) {
            m58030tM();
        }
    }
}
