package com.zing.zalo.p077ui.zalocloud.settings;

import ac.C0697c0;
import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.BackupKeyVerificationView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.PinCodeVerificationView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.settings.ZCloudSettingsView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import kc0.C21683v;
import kc0.C21684w;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p479rc.C25724a;
import p649xl.AbstractC29880jg;
import p649xl.C30057tf;
import pm0.InterfaceC24854k;
import si.C26263i;
import tg0.C26676b;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ZCloudSettingsView extends SlidableZaloView {
    public static final C13959a Companion = new C13959a(null);

    /* renamed from: P0 */
    private AbstractC29880jg f71931P0;

    /* renamed from: Q0 */
    private C30057tf f71932Q0;

    /* renamed from: R0 */
    private Switch f71933R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f71934S0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C21683v.class), new C13961c(new C13960b(this)), C13962d.f71937q);

    /* renamed from: com.zing.zalo.ui.zalocloud.settings.ZCloudSettingsView$a */
    /* loaded from: classes6.dex */
    public static final class C13959a {
        private C13959a() {
        }

        public /* synthetic */ C13959a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.settings.ZCloudSettingsView$b */
    /* loaded from: classes6.dex */
    public static final class C13960b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f71935q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13960b(ZaloView zaloView) {
            super(0);
            this.f71935q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f71935q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.settings.ZCloudSettingsView$c */
    /* loaded from: classes6.dex */
    public static final class C13961c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f71936q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13961c(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f71936q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f71936q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.settings.ZCloudSettingsView$d */
    /* loaded from: classes6.dex */
    static final class C13962d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13962d f71937q = new C13962d();

        C13962d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return C21684w.Companion.m111821a();
        }
    }

    /* renamed from: nM */
    public static final void m77729nM(ZCloudSettingsView zCloudSettingsView, Object[] objArr) {
        AbstractC19074t.m100208f(zCloudSettingsView, "this$0");
        AbstractC19074t.m100208f(objArr, "$args");
        zCloudSettingsView.m77732qM(objArr);
    }

    /* renamed from: oM */
    private final C21683v m77730oM() {
        return (C21683v) this.f71934S0.getValue();
    }

    /* renamed from: pM */
    private final void m77731pM() {
        if (C26263i.m135055u().m135071M()) {
            ToastUtils.showMess(m92652XI(AbstractC8020f0.str_msg_notice_change_protect_code_when_syncing));
            return;
        }
        if (!AbstractC23306f.m120684l().m126159l()) {
            ToastUtils.showMess(m92652XI(AbstractC8020f0.str_msg_notice_need_restore_before_change_protection_code));
            return;
        }
        if (AbstractC3489d.m17512t()) {
            if (C26263i.m135058w() == null) {
                C26676b.m136957g("SMLZCloudSettingsView", "Vui lòng tạo bản sao lưu trước khi thực hiện đổi mã bảo vệ!", null, 4, null);
                return;
            } else if (!AbstractC3489d.m17508p()) {
                C26676b.m136957g("SMLZCloudSettingsView", "Vui lòng kết nối tính năng sao lưu tin nhắn văn bản!", null, 4, null);
                return;
            }
        }
        int m132665A = C25724a.Companion.m132700a().m132665A();
        Bundle bundle = new Bundle();
        if (m132665A != 2) {
            if (m132665A != 3) {
                bundle.putString("KEY_TRACKING_FLOW_PICK_TYPE_VERIFY", "CHANGE_PROTECT_CODE");
            } else {
                bundle.putString("KEY_TRACKING_FLOW_PASSPHRASE", "CHANGE_PROTECT_CODE");
            }
        } else {
            bundle.putString("KEY_TRACKING_FLOW_PIN", "CHANGE_PROTECT_CODE");
        }
        if (m132665A != 2) {
            if (m132665A != 3) {
                m92693xK().m93069k2(BackupKeyVerificationView.class, bundle, 1, true);
                return;
            } else {
                m92693xK().m93069k2(PassphraseVerificationView.class, bundle, 1, true);
                return;
            }
        }
        m92693xK().m93069k2(PinCodeVerificationView.class, bundle, 1, true);
    }

    /* renamed from: qM */
    private final void m77732qM(Object[] objArr) {
        Object obj = objArr[1];
        if (obj != null) {
            int intValue = ((Integer) obj).intValue();
            Switch r52 = null;
            AbstractC29880jg abstractC29880jg = null;
            Switch r53 = null;
            if (intValue != -1 && intValue != 69) {
                if (intValue != 100) {
                    AbstractC29880jg abstractC29880jg2 = this.f71931P0;
                    if (abstractC29880jg2 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        abstractC29880jg = abstractC29880jg2;
                    }
                    abstractC29880jg.f138354Q.setEnabled(true);
                    return;
                }
                AbstractC29880jg abstractC29880jg3 = this.f71931P0;
                if (abstractC29880jg3 == null) {
                    AbstractC19074t.m100223u("binding");
                    abstractC29880jg3 = null;
                }
                abstractC29880jg3.f138354Q.setEnabled(false);
                Switch r7 = this.f71933R0;
                if (r7 == null) {
                    AbstractC19074t.m100223u("offLoadSwitch");
                } else {
                    r53 = r7;
                }
                r53.m90686i(false, true);
                return;
            }
            AbstractC29880jg abstractC29880jg4 = this.f71931P0;
            if (abstractC29880jg4 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29880jg4 = null;
            }
            abstractC29880jg4.f138354Q.setEnabled(true);
            Switch r72 = this.f71933R0;
            if (r72 == null) {
                AbstractC19074t.m100223u("offLoadSwitch");
                r72 = null;
            }
            r72.m90686i(false, true);
            Switch r73 = this.f71933R0;
            if (r73 == null) {
                AbstractC19074t.m100223u("offLoadSwitch");
            } else {
                r52 = r73;
            }
            r52.setEnabled(false);
        }
    }

    /* renamed from: rM */
    private final void m77733rM() {
        int i11;
        boolean z11;
        C16805b m120633X1 = AbstractC23306f.m120633X1();
        AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
        AbstractC29880jg abstractC29880jg = this.f71931P0;
        AbstractC29880jg abstractC29880jg2 = null;
        if (abstractC29880jg == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29880jg = null;
        }
        ListItem listItem = abstractC29880jg.f138353P;
        listItem.m90591l(AbstractC23222t7.f112586t, 0, 0, 0);
        ImageView iconChevronRight = listItem.getIconChevronRight();
        Context context = listItem.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        iconChevronRight.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_chevron_right_line_16, AbstractC2807a.list_item_trailing_chevron));
        listItem.getIconChevronRight().setVisibility(0);
        listItem.setSubtitleMaxLine(2);
        listItem.setTrailingItemVisibility(0);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        listItem.setTrailingGravity(enumC16952b0);
        listItem.setOnClickListener(new View.OnClickListener() { // from class: gc0.c
            public /* synthetic */ ViewOnClickListenerC19387c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudSettingsView.m77736uM(ZCloudSettingsView.this, view);
            }
        });
        AbstractC29880jg abstractC29880jg3 = this.f71931P0;
        if (abstractC29880jg3 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29880jg3 = null;
        }
        ListItem listItem2 = abstractC29880jg3.f138354Q;
        Context context2 = listItem2.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        Switch r62 = new Switch(context2);
        r62.setChecked(m77730oM().m111816N());
        r62.setOnClickListener(new View.OnClickListener() { // from class: gc0.d
            public /* synthetic */ ViewOnClickListenerC19388d() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudSettingsView.m77737vM(ZCloudSettingsView.this, view);
            }
        });
        if (r62.isChecked()) {
            AbstractC0924m0.m3674as(true);
        }
        this.f71933R0 = r62;
        listItem2.m90589e(r62);
        String m92653YI = m92653YI(AbstractC8020f0.str_subtitle_auto_free_up_data_storage, m120633X1.m89800f());
        AbstractC19074t.m100207e(m92653YI, "getString(...)");
        listItem2.setSubtitle(m92653YI);
        listItem2.setSubtitleMaxLine(3);
        listItem2.setTrailingItemVisibility(0);
        listItem2.setTrailingGravity(enumC16952b0);
        if (m120633X1.m89803k().m89778c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        listItem2.setVisibility(i11);
        listItem2.setOnClickListener(new View.OnClickListener() { // from class: gc0.e
            public /* synthetic */ ViewOnClickListenerC19389e() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudSettingsView.m77738wM(ZCloudSettingsView.this, view);
            }
        });
        listItem2.setEnabled(!AbstractC3489d.m17506n());
        Switch r02 = this.f71933R0;
        if (r02 == null) {
            AbstractC19074t.m100223u("offLoadSwitch");
            r02 = null;
        }
        if (AbstractC3489d.m17501i() && !AbstractC3489d.m17506n()) {
            z11 = true;
        } else {
            z11 = false;
        }
        r02.setEnabled(z11);
        AbstractC29880jg abstractC29880jg4 = this.f71931P0;
        if (abstractC29880jg4 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29880jg4 = null;
        }
        ListItem listItem3 = abstractC29880jg4.f138355R;
        listItem3.m90591l(AbstractC23222t7.f112586t, 0, 0, 0);
        Context context3 = listItem3.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context3);
        C26708g c26708g = new C26708g(robotoTextView);
        Context context4 = robotoTextView.getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        c26708g.m137319a(C26705d.m137293a(context4, AbstractC2814h.t_xsmall_m));
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.text_tertiary));
        robotoTextView.setText(m92652XI(AbstractC8020f0.str_wifi_formal));
        listItem3.m90589e(robotoTextView);
        listItem3.setTrailingItemVisibility(0);
        listItem3.setOnClickListener(new View.OnClickListener() { // from class: gc0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudSettingsView.m77734sM(view);
            }
        });
        AbstractC29880jg abstractC29880jg5 = this.f71931P0;
        if (abstractC29880jg5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC29880jg2 = abstractC29880jg5;
        }
        ListItem listItem4 = abstractC29880jg2.f138356S;
        listItem4.m90591l(AbstractC23222t7.f112586t, 0, 0, 0);
        Context context5 = listItem4.getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        RobotoTextView robotoTextView2 = new RobotoTextView(context5);
        C26708g c26708g2 = new C26708g(robotoTextView2);
        Context context6 = robotoTextView2.getContext();
        AbstractC19074t.m100207e(context6, "getContext(...)");
        c26708g2.m137319a(C26705d.m137293a(context6, AbstractC2814h.t_xsmall_m));
        robotoTextView2.setTextColor(C23212s8.m119606n(AbstractC2807a.text_tertiary));
        robotoTextView2.setText(m92653YI(AbstractC8020f0.str_num_mega_byte, 100));
        listItem4.m90589e(robotoTextView2);
        listItem4.setTrailingItemVisibility(0);
        listItem4.setOnClickListener(new View.OnClickListener() { // from class: gc0.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudSettingsView.m77735tM(view);
            }
        });
    }

    /* renamed from: sM */
    public static final void m77734sM(View view) {
        C26676b.f126324a.m136966E();
    }

    /* renamed from: tM */
    public static final void m77735tM(View view) {
        C26676b.f126324a.m137008v();
    }

    /* renamed from: uM */
    public static final void m77736uM(ZCloudSettingsView zCloudSettingsView, View view) {
        AbstractC19074t.m100208f(zCloudSettingsView, "this$0");
        ZaloCloudRecoverCloudMediaWorker.C16883e c16883e = ZaloCloudRecoverCloudMediaWorker.Companion;
        if (!(c16883e.m90201h().getValue() instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) && !(c16883e.m90201h().getValue() instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b)) {
            zCloudSettingsView.m77731pM();
            C26676b.f126324a.m136971J();
        } else {
            ToastUtils.m89266n(AbstractC8020f0.str_feature_not_available, new Object[0]);
        }
    }

    /* renamed from: vM */
    public static final void m77737vM(ZCloudSettingsView zCloudSettingsView, View view) {
        AbstractC19074t.m100208f(zCloudSettingsView, "this$0");
        zCloudSettingsView.m77741zM();
    }

    /* renamed from: wM */
    public static final void m77738wM(ZCloudSettingsView zCloudSettingsView, View view) {
        AbstractC19074t.m100208f(zCloudSettingsView, "this$0");
        if (!AbstractC3489d.m17512t() && !AbstractC3489d.m17505m()) {
            zCloudSettingsView.m77741zM();
        } else {
            ToastUtils.showMess(zCloudSettingsView.m92653YI(AbstractC8020f0.str_feature_available_only_for_zcloud, AbstractC23306f.m120633X1().m89800f()));
        }
    }

    /* renamed from: xM */
    public static final void m77739xM(ZCloudSettingsView zCloudSettingsView, ViewStub viewStub, View view) {
        AbstractC19074t.m100208f(zCloudSettingsView, "this$0");
        C30057tf m148547a = C30057tf.m148547a(view);
        AbstractC19074t.m100207e(m148547a, "bind(...)");
        zCloudSettingsView.f71932Q0 = m148547a;
    }

    /* renamed from: yM */
    private final void m77740yM() {
        String m4274v0 = AbstractC0924m0.m4274v0();
        if (TextUtils.isEmpty(m4274v0)) {
            m4274v0 = AbstractC23160o0.m119264k0();
            AbstractC0924m0.m3901if(m4274v0);
        }
        C0697c0.b bVar = C0697c0.Companion;
        AbstractC19074t.m100205c(m4274v0);
        bVar.m1052f(this, "first_time", m4274v0);
    }

    /* renamed from: zM */
    private final void m77741zM() {
        Switch r02 = this.f71933R0;
        Switch r12 = null;
        if (r02 == null) {
            AbstractC19074t.m100223u("offLoadSwitch");
            r02 = null;
        }
        boolean z11 = !r02.isChecked();
        Switch r42 = this.f71933R0;
        if (r42 == null) {
            AbstractC19074t.m100223u("offLoadSwitch");
        } else {
            r12 = r42;
        }
        r12.setChecked(z11);
        m77730oM().m111817O(z11);
        if (z11 && !AbstractC0924m0.m4019md()) {
            ToastUtils.m89266n(AbstractC8020f0.str_msg_toast_offload_setting, new Object[0]);
            AbstractC0924m0.m3674as(true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.zcloud_settings_view, viewGroup, false);
        AbstractC29880jg m148138Q = AbstractC29880jg.m148138Q(inflate);
        AbstractC19074t.m100207e(m148138Q, "bind(...)");
        this.f71931P0 = m148138Q;
        if (m148138Q == null) {
            AbstractC19074t.m100223u("binding");
            m148138Q = null;
        }
        m148138Q.f138357T.m8572k(new ViewStub.OnInflateListener() { // from class: gc0.b
            public /* synthetic */ ViewStubOnInflateListenerC19386b() {
            }

            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                ZCloudSettingsView.m77739xM(ZCloudSettingsView.this, viewStub, view);
            }
        });
        m77733rM();
        m77740yM();
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 150803);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudSettings";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 150803) {
            AbstractC19444a.m101697e(new Runnable() { // from class: gc0.a

                /* renamed from: q */
                public final /* synthetic */ Object[] f96219q;

                public /* synthetic */ RunnableC19385a(Object[] objArr2) {
                    r2 = objArr2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZCloudSettingsView.m77729nM(ZCloudSettingsView.this, r2);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 150803);
    }
}
