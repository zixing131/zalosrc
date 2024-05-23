package com.zing.zalo.p077ui.zalocloud.restore;

import ac.C0732w;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.lifecycle.C1802w0;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.BackupKeyVerificationView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.PinCodeVerificationView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.resetcloud.ZaloCloudResetContainerView;
import com.zing.zalo.p077ui.zalocloud.restore.C13958c;
import com.zing.zalo.p077ui.zalocloud.restore.ZaloCloudRestoreView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fc0.C18870b;
import fc0.InterfaceC18875g;
import fc0.InterfaceC18876h;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import java.util.Arrays;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p421pc.C24720a;
import p479rc.C25724a;
import p649xl.AbstractC29951nf;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import si.C26263i;
import tb0.C26626l;
import tg0.C26676b;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ZaloCloudRestoreView extends BaseZCloudView<AbstractC29951nf> implements InterfaceC18876h {

    /* renamed from: R0 */
    private C13958c f71908R0;

    /* renamed from: S0 */
    private InterfaceC18875g f71909S0;

    /* renamed from: T0 */
    private boolean f71910T0 = AbstractC23306f.m120636Y1().m128535t();

    /* renamed from: U0 */
    private TargetBackupInfo f71911U0 = C26263i.m135058w();

    /* renamed from: V0 */
    private final InterfaceC24854k f71912V0;

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.ZaloCloudRestoreView$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13952a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71913a;

        static {
            int[] iArr = new int[C13958c.b.values().length];
            try {
                iArr[C13958c.b.f71924p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C13958c.b.f71925q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C13958c.b.f71928t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C13958c.b.f71927s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f71913a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.ZaloCloudRestoreView$b */
    /* loaded from: classes6.dex */
    static final class C13953b extends AbstractC19075u implements InterfaceC18494a {
        C13953b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13957b mo12V4() {
            ZaloView m92690uK = ZaloCloudRestoreView.this.m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C13957b) new C1802w0(m92690uK).m9378a(C13957b.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.ZaloCloudRestoreView$c */
    /* loaded from: classes6.dex */
    public static final class C13954c extends AbstractC19075u implements InterfaceC18494a {
        C13954c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77708a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77708a() {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_skip_accept", null, null, null, 14, null);
            ZaloCloudRestoreView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.ZaloCloudRestoreView$d */
    /* loaded from: classes6.dex */
    public static final class C13955d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13955d f71916q = new C13955d();

        C13955d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77709a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77709a() {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_skip_back", null, null, null, 14, null);
        }
    }

    public ZaloCloudRestoreView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13953b());
        this.f71912V0 = m129210a;
    }

    /* renamed from: AM */
    public static final void m77691AM(ZaloCloudRestoreView zaloCloudRestoreView, View view) {
        AbstractC19074t.m100208f(zaloCloudRestoreView, "this$0");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_start_resume_service_backward", null, null, null, 14, null);
        zaloCloudRestoreView.finish();
    }

    /* renamed from: BM */
    public static final void m77692BM(ZaloCloudRestoreView zaloCloudRestoreView, View view) {
        AbstractC19074t.m100208f(zaloCloudRestoreView, "this$0");
        zaloCloudRestoreView.m77702yM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c2, code lost:            if (si.C26263i.m135012E() == false) goto L97;     */
    /* renamed from: CM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m77693CM() {
        boolean z11;
        int i11;
        AbstractC2379w.m12430d(((AbstractC29951nf) m77756kM()).getRoot());
        RobotoTextView robotoTextView = ((AbstractC29951nf) m77756kM()).f138821P;
        AbstractC19074t.m100205c(robotoTextView);
        if (!this.f71910T0 && !m77701xM()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: fc0.c
            public /* synthetic */ ViewOnClickListenerC18871c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZaloCloudRestoreView.m77694DM(ZaloCloudRestoreView.this, view);
            }
        });
        ZAppCompatImageView zAppCompatImageView = ((AbstractC29951nf) m77756kM()).f138823R;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_zcloud_solid_24, AbstractC2807a.accent_blue_icon));
        ((AbstractC29951nf) m77756kM()).f138822Q.setOnClickListener(new View.OnClickListener() { // from class: fc0.d
            public /* synthetic */ ViewOnClickListenerC18872d() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZaloCloudRestoreView.m77695EM(ZaloCloudRestoreView.this, view);
            }
        });
        InterfaceC18875g interfaceC18875g = null;
        if (C26263i.m135012E()) {
            InterfaceC18875g interfaceC18875g2 = this.f71909S0;
            if (interfaceC18875g2 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC18875g2 = null;
            }
            if (interfaceC18875g2.mo98895wi()) {
                ListItem listItem = ((AbstractC29951nf) m77756kM()).f138825T;
                AbstractC19074t.m100205c(listItem);
                listItem.setVisibility(0);
                AppCompatImageView appCompatImageView = new AppCompatImageView(listItem.getContext());
                Context context = appCompatImageView.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                appCompatImageView.setBackground(C27280g.m139658a(context, AbstractC16803z.bg_layer_selected_round));
                Context context2 = appCompatImageView.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                appCompatImageView.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_chat_line_24, AbstractC2807a.icon_secondary));
                int i12 = AbstractC23222t7.f112566j;
                appCompatImageView.setPadding(i12, i12, i12, i12);
                listItem.m90587c(appCompatImageView);
                String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_features_connect_messages_backup_title);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                listItem.setTitle(m92652XI);
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m92652XI2 = m92652XI(AbstractC8020f0.str_title_lastest_time_store);
                AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                TargetBackupInfo targetBackupInfo = this.f71911U0;
                AbstractC19074t.m100205c(targetBackupInfo);
                String format = String.format(m92652XI2, Arrays.copyOf(new Object[]{C22447s.m116058t(targetBackupInfo.m40952h())}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                listItem.setSubtitle(format);
                listItem.m90592m(false);
                listItem.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.surface_background_alt));
            }
        }
        InterfaceC18875g interfaceC18875g3 = this.f71909S0;
        if (interfaceC18875g3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC18875g3 = null;
        }
        if (interfaceC18875g3.mo98896yl()) {
            ListItem listItem2 = ((AbstractC29951nf) m77756kM()).f138824S;
            AbstractC19074t.m100205c(listItem2);
            listItem2.setVisibility(0);
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(listItem2.getContext());
            Context context3 = appCompatImageView2.getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            appCompatImageView2.setBackground(C27280g.m139658a(context3, AbstractC16803z.bg_layer_selected_round));
            Context context4 = appCompatImageView2.getContext();
            AbstractC19074t.m100207e(context4, "getContext(...)");
            appCompatImageView2.setImageDrawable(C27280g.m139660c(context4, AbstractC2810d.zds_ic_album_line_24, AbstractC2807a.icon_secondary));
            int i13 = AbstractC23222t7.f112566j;
            appCompatImageView2.setPadding(i13, i13, i13, i13);
            listItem2.m90587c(appCompatImageView2);
            String m92652XI3 = m92652XI(AbstractC8020f0.str_store_media_messages);
            AbstractC19074t.m100207e(m92652XI3, "getString(...)");
            listItem2.setTitle(m92652XI3);
            C19067n0 c19067n02 = C19067n0.f94947a;
            String m92652XI4 = m92652XI(AbstractC8020f0.str_title_lastest_time_store);
            AbstractC19074t.m100207e(m92652XI4, "getString(...)");
            String format2 = String.format(m92652XI4, Arrays.copyOf(new Object[]{C22447s.m116058t(AbstractC3489d.m17498f())}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            listItem2.setSubtitle(format2);
            listItem2.m90592m(false);
            listItem2.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.surface_background_alt));
        }
        InterfaceC18875g interfaceC18875g4 = this.f71909S0;
        if (interfaceC18875g4 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC18875g4 = null;
        }
        if (!interfaceC18875g4.mo98893le()) {
            InterfaceC18875g interfaceC18875g5 = this.f71909S0;
            if (interfaceC18875g5 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC18875g5 = null;
            }
            if (!interfaceC18875g5.mo98896yl()) {
                InterfaceC18875g interfaceC18875g6 = this.f71909S0;
                if (interfaceC18875g6 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC18875g = interfaceC18875g6;
                }
                if (interfaceC18875g.mo98895wi()) {
                }
            }
            ((AbstractC29951nf) m77756kM()).f138827V.setText(m92652XI(AbstractC8020f0.str_zcloud_connect_restore_conversation_data));
            ((AbstractC29951nf) m77756kM()).f138826U.setVisibility(8);
            return;
        }
        RobotoTextView robotoTextView2 = ((AbstractC29951nf) m77756kM()).f138827V;
        C19067n0 c19067n03 = C19067n0.f94947a;
        String m92652XI5 = m92652XI(AbstractC8020f0.str_zcloud_connect_to_zcloud);
        AbstractC19074t.m100207e(m92652XI5, "getString(...)");
        String format3 = String.format(m92652XI5, Arrays.copyOf(new Object[]{C16805b.Companion.m89811a().m89800f()}, 1));
        AbstractC19074t.m100207e(format3, "format(...)");
        robotoTextView2.setText(format3);
        ((AbstractC29951nf) m77756kM()).f138826U.setVisibility(0);
    }

    /* renamed from: DM */
    public static final void m77694DM(ZaloCloudRestoreView zaloCloudRestoreView, View view) {
        AbstractC19074t.m100208f(zaloCloudRestoreView, "this$0");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_start_resume_service_cant_connect", null, null, null, 14, null);
        C17487o0 m92662fJ = zaloCloudRestoreView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(ZaloCloudResetContainerView.class, new Bundle(), 1, true);
        }
    }

    /* renamed from: EM */
    public static final void m77695EM(ZaloCloudRestoreView zaloCloudRestoreView, View view) {
        AbstractC19074t.m100208f(zaloCloudRestoreView, "this$0");
        zaloCloudRestoreView.m77703zM();
    }

    /* renamed from: wM */
    private final C13957b m77700wM() {
        return (C13957b) this.f71912V0.getValue();
    }

    /* renamed from: xM */
    private final boolean m77701xM() {
        C13958c.b bVar;
        C13958c c13958c = this.f71908R0;
        if (c13958c != null) {
            bVar = c13958c.m77718a();
        } else {
            bVar = null;
        }
        if (bVar == C13958c.b.f71927s) {
            return true;
        }
        return false;
    }

    /* renamed from: yM */
    private final void m77702yM() {
        Context context = getContext();
        if (context != null) {
            C26626l.Companion.m136712a().m136695I(context, m92662fJ(), new C13954c(), C13955d.f71916q);
        }
    }

    /* renamed from: zM */
    private final void m77703zM() {
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_start_btn", null, null, null, 14, null);
        InterfaceC18875g interfaceC18875g = this.f71909S0;
        if (interfaceC18875g == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC18875g = null;
        }
        interfaceC18875g.mo98892X9();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            if (!this.f71910T0 && !m77701xM()) {
                ZdsActionBar m87077NK = m87077NK();
                if (m87077NK != null) {
                    ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(m92689tK());
                    zAppCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    Context m92689tK = m92689tK();
                    AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                    zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC7356u0.icn_header_close, AbstractC2807a.button_tertiary_neutral_icon));
                    zAppCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: fc0.f
                        public /* synthetic */ ViewOnClickListenerC18874f() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ZaloCloudRestoreView.m77692BM(ZaloCloudRestoreView.this, view);
                        }
                    });
                    m87077NK.setCustomTrailingItem(zAppCompatImageView);
                    View divider = m87077NK.getDivider();
                    if (divider != null) {
                        divider.setVisibility(8);
                    }
                }
            }
            ZdsActionBar m87077NK2 = m87077NK();
            if (m87077NK2 != null) {
                ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(m92689tK());
                zAppCompatImageView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                Context m92689tK2 = m92689tK();
                AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                zAppCompatImageView2.setImageDrawable(C27280g.m139660c(m92689tK2, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_primary));
                zAppCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: fc0.e
                    public /* synthetic */ ViewOnClickListenerC18873e() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ZaloCloudRestoreView.m77691AM(ZaloCloudRestoreView.this, view);
                    }
                });
                m87077NK2.setCustomLeadingItem(zAppCompatImageView2);
                View divider2 = m87077NK2.getDivider();
                if (divider2 != null) {
                    divider2.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            C26676b.m136953c(e11);
        }
    }

    @Override // fc0.InterfaceC18876h
    /* renamed from: ck */
    public void mo77704ck() {
        C13958c.b bVar;
        int i11;
        String str;
        Bundle bundle = new Bundle();
        C13958c c13958c = this.f71908R0;
        InterfaceC18875g interfaceC18875g = null;
        if (c13958c != null) {
            bVar = c13958c.m77718a();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            i11 = -1;
        } else {
            i11 = C13952a.f71913a[bVar.ordinal()];
        }
        if (i11 != 2 && i11 != 3) {
            if (i11 != 4) {
                str = "CLOUD_RESTORE";
            } else {
                str = "BACKUP_DETAIL";
            }
        } else {
            str = "CLOUD_RESTORE_FROM_TAB_ME";
        }
        bundle.putString("KEY_TRACKING_FLOW_PICK_TYPE_VERIFY", str);
        InterfaceC18875g interfaceC18875g2 = this.f71909S0;
        if (interfaceC18875g2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC18875g = interfaceC18875g2;
        }
        bundle.putBoolean("ARG_IS_NEED_RESTORE_ZCLOUD_BACKUP", interfaceC18875g.mo98894vl());
        m92693xK().m93069k2(BackupKeyVerificationView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        C13958c.b bVar;
        AbstractC23306f.m120676j().m128408Z(false);
        AbstractC23306f.m120636Y1().m128515G(true);
        C22447s.f109797a.m116071J0();
        C13958c c13958c = this.f71908R0;
        if (c13958c != null) {
            bVar = c13958c.m77718a();
        } else {
            bVar = null;
        }
        if (bVar != null && C13952a.f71913a[bVar.ordinal()] == 1) {
            m77700wM().m77717T();
        } else {
            m77700wM().m77710M();
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudRestoreData";
    }

    @Override // fc0.InterfaceC18876h
    /* renamed from: h4 */
    public void mo77705h4() {
        C13958c.b bVar;
        int i11;
        String str;
        Bundle bundle = new Bundle();
        C13958c c13958c = this.f71908R0;
        InterfaceC18875g interfaceC18875g = null;
        if (c13958c != null) {
            bVar = c13958c.m77718a();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            i11 = -1;
        } else {
            i11 = C13952a.f71913a[bVar.ordinal()];
        }
        if (i11 != 2 && i11 != 3) {
            if (i11 != 4) {
                str = "CLOUD_RESTORE";
            } else {
                str = "BACKUP_DETAIL";
            }
        } else {
            str = "CLOUD_RESTORE_FROM_TAB_ME";
        }
        bundle.putString("KEY_TRACKING_FLOW_PIN", str);
        InterfaceC18875g interfaceC18875g2 = this.f71909S0;
        if (interfaceC18875g2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC18875g = interfaceC18875g2;
        }
        bundle.putBoolean("ARG_IS_NEED_RESTORE_ZCLOUD_BACKUP", interfaceC18875g.mo98894vl());
        m92693xK().m93069k2(PinCodeVerificationView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: iM */
    public void mo57631iM() {
        super.mo57631iM();
        C24720a m120676j = AbstractC23306f.m120676j();
        AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
        C25724a m120668h = AbstractC23306f.m120668h();
        AbstractC19074t.m100207e(m120668h, "provideBackupEncryptionManager(...)");
        this.f71909S0 = new C18870b(this, m120676j, m120668h);
        this.f71908R0 = m77700wM().m77712O();
        InterfaceC18875g interfaceC18875g = this.f71909S0;
        if (interfaceC18875g == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC18875g = null;
        }
        interfaceC18875g.mo995Nd(this.f71908R0, null);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.zalo_cloud_restore_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        m77693CM();
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && !this.f71910T0) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        C13958c.b bVar;
        C13958c c13958c = this.f71908R0;
        if (c13958c != null) {
            bVar = c13958c.m77718a();
        } else {
            bVar = null;
        }
        if (bVar != null && C13952a.f71913a[bVar.ordinal()] == 1) {
            return;
        }
        super.mo57606qM();
    }

    @Override // fc0.InterfaceC18876h
    /* renamed from: w2 */
    public void mo77706w2() {
        C13958c.b bVar;
        int i11;
        String str;
        Bundle bundle = new Bundle();
        C13958c c13958c = this.f71908R0;
        InterfaceC18875g interfaceC18875g = null;
        if (c13958c != null) {
            bVar = c13958c.m77718a();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            i11 = -1;
        } else {
            i11 = C13952a.f71913a[bVar.ordinal()];
        }
        if (i11 != 2 && i11 != 3) {
            if (i11 != 4) {
                str = "CLOUD_RESTORE";
            } else {
                str = "BACKUP_DETAIL";
            }
        } else {
            str = "CLOUD_RESTORE_FROM_TAB_ME";
        }
        bundle.putString("KEY_TRACKING_FLOW_PASSPHRASE", str);
        InterfaceC18875g interfaceC18875g2 = this.f71909S0;
        if (interfaceC18875g2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC18875g = interfaceC18875g2;
        }
        bundle.putBoolean("ARG_IS_NEED_RESTORE_ZCLOUD_BACKUP", interfaceC18875g.mo98894vl());
        m92693xK().m93069k2(PassphraseVerificationView.class, bundle, 1, true);
    }
}
