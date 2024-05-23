package com.zing.zalo.p077ui.backuprestore.encryption.verification;

import ac.C0732w;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import ch0.AbstractC3489d;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.backuprestore.detail.BackupDetailView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.BackupKeyVerificationView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.C11072a;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase.C11085b;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.C11107b;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.PinCodeVerificationView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zalocloud.restore.ZCloudRestoreContainerView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import mj0.AbstractC23322a;
import nh0.C23793c;
import p320ld.C22436h;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p387oc.C24213q;
import p443qc.EnumC25220d;
import p645xh.C29628e;
import p649xl.C29971p;
import pm0.C24848g0;
import s40.C26130b;
import s40.InterfaceC26129a;
import tb0.C26626l;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class BackupKeyVerificationView extends SlidableZaloView implements InterfaceC26129a, View.OnClickListener {

    /* renamed from: P0 */
    private C29971p f55799P0;

    /* renamed from: Q0 */
    private C11072a f55800Q0;

    /* renamed from: R0 */
    private C26130b f55801R0;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.BackupKeyVerificationView$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11068a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55802a;

        static {
            int[] iArr = new int[C11072a.b.values().length];
            try {
                iArr[C11072a.b.f55810p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C11072a.b.f55811q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C11072a.b.f55812r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C11072a.b.f55814t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C11072a.b.f55813s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C11072a.b.f55815u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C11072a.b.f55816v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f55802a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.BackupKeyVerificationView$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11069b extends C19071q implements InterfaceC18494a {
        C11069b(Object obj) {
            super(0, obj, BackupKeyVerificationView.class, "onCloseView", "onCloseView()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57776h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m57776h() {
            ((BackupKeyVerificationView) this.f94922q).m57766oM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.BackupKeyVerificationView$c */
    /* loaded from: classes5.dex */
    public static final class C11070c extends AbstractC19075u implements InterfaceC18494a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.BackupKeyVerificationView$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f55804q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m57778a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m57778a() {
                AbstractC23306f.m120692n().m133040U(EnumC25220d.f120981r);
            }
        }

        C11070c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57777a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57777a() {
            BackupKeyVerificationView.this.m57767pM();
            AbstractC23306f.m120684l().m126154d(a.f55804q);
            BackupKeyVerificationView.this.m57766oM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.BackupKeyVerificationView$d */
    /* loaded from: classes5.dex */
    public static final class C11071d extends AbstractC19075u implements InterfaceC18494a {
        C11071d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57779a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57779a() {
            if (!(BackupKeyVerificationView.this.m92650VI() instanceof ZCloudSetupContainerView)) {
                BackupKeyVerificationView.this.m57772uM();
                return;
            }
            ZaloView m92650VI = BackupKeyVerificationView.this.m92650VI();
            if (m92650VI != null) {
                m92650VI.finish();
            }
        }
    }

    /* renamed from: lM */
    private final void m57763lM() {
        C11072a.b bVar;
        int i11;
        TargetBackupInfo m57781b;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C11072a c11072a = this.f55800Q0;
        if (c11072a != null) {
            bVar = c11072a.m57780a();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            i11 = -1;
        } else {
            i11 = C11068a.f55802a[bVar.ordinal()];
        }
        switch (i11) {
            case 1:
            case 2:
                C26626l.m136651J(C26626l.Companion.m136712a(), context, m92662fJ(), new C11069b(this), null, 8, null);
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_select_dimiss", null, null, null, 14, null);
                return;
            case 3:
                C11072a c11072a2 = this.f55800Q0;
                if (c11072a2 != null && (m57781b = c11072a2.m57781b()) != null) {
                    C24213q.Companion.m126205a().m126197E(m57781b, context, new C11070c());
                    return;
                }
                return;
            case 4:
                C29628e.m147249E0().m147293v1();
                m57772uM();
                C26626l.m136689z(C26626l.Companion.m136712a(), false, false, 3, null);
                return;
            case 5:
                C26626l.Companion.m136712a().m136698R(context, new C11071d());
                return;
            case 6:
                m57771tM();
                return;
            default:
                return;
        }
    }

    /* renamed from: mM */
    private final void m57764mM() {
        C29971p c29971p = this.f55799P0;
        C11072a.b bVar = null;
        if (c29971p == null) {
            AbstractC19074t.m100223u("binding");
            c29971p = null;
        }
        ZdsActionBar zdsActionBar = c29971p.f138923u;
        View divider = zdsActionBar.getDivider();
        int i11 = -1;
        if (divider != null) {
            divider.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }
        C11072a c11072a = this.f55800Q0;
        if (c11072a != null) {
            bVar = c11072a.m57780a();
        }
        if (bVar != null) {
            i11 = C11068a.f55802a[bVar.ordinal()];
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zdsActionBar.setTrailingType(ZdsActionBar.EnumC16990f.ICON.m91019c());
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                Drawable m139660c = C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_close_line_16, AbstractC2807a.btn_icon_tertiary_neutral);
                if (m139660c != null) {
                    zdsActionBar.setTrailingIconButton(m139660c);
                    zdsActionBar.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: s40.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BackupKeyVerificationView.m57765nM(BackupKeyVerificationView.this, view);
                        }
                    });
                    return;
                }
                return;
            default:
                zdsActionBar.setTrailingType(ZdsActionBar.EnumC16990f.NONE.m91019c());
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m57765nM(BackupKeyVerificationView backupKeyVerificationView, View view) {
        AbstractC19074t.m100208f(backupKeyVerificationView, "this$0");
        backupKeyVerificationView.m57763lM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:            if (r1 == com.zing.zalo.p077ui.backuprestore.encryption.verification.C11072a.b.f55811q) goto L13;     */
    /* renamed from: oM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m57766oM() {
        C11072a.b bVar;
        C11072a c11072a = this.f55800Q0;
        C11072a.b bVar2 = null;
        if (c11072a != null) {
            bVar = c11072a.m57780a();
        } else {
            bVar = null;
        }
        if (bVar != C11072a.b.f55810p) {
            C11072a c11072a2 = this.f55800Q0;
            if (c11072a2 != null) {
                bVar2 = c11072a2.m57780a();
            }
        }
        AbstractC23306f.m120636Y1().m128515G(true);
        AbstractC23306f.m120676j().m128408Z(false);
        m57773g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public final void m57767pM() {
        C22436h.f109760a.m115918n().mo13474a(new Runnable() { // from class: s40.d
            @Override // java.lang.Runnable
            public final void run() {
                BackupKeyVerificationView.m57768qM();
            }
        });
        C22447s.f109797a.m116071J0();
        AbstractC23647d.m123897g("5580114");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m57768qM() {
        AbstractC23306f.m120692n().m133035O(C23793c.Companion.m124321a().mo124314i());
        C22436h.f109760a.m115911A(1, false);
    }

    /* renamed from: rM */
    private final void m57769rM() {
        C29971p c29971p = this.f55799P0;
        C29971p c29971p2 = null;
        if (c29971p == null) {
            AbstractC19074t.m100223u("binding");
            c29971p = null;
        }
        c29971p.f138920r.setOnClickListener(this);
        C29971p c29971p3 = this.f55799P0;
        if (c29971p3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29971p2 = c29971p3;
        }
        c29971p2.f138919q.setOnClickListener(this);
    }

    /* renamed from: sM */
    private final void m57770sM() {
        m57764mM();
    }

    /* renamed from: tM */
    private final void m57771tM() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 7340032);
        m92693xK().m93069k2(BackupDetailView.class, bundle, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public final void m57772uM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92693xK().m93069k2(MainTabView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f55801R0 = new C26130b(this);
        this.f55800Q0 = C11072a.Companion.m57783a(this.f72421L0.m92642L3());
        C26130b c26130b = this.f55801R0;
        if (c26130b == null) {
            AbstractC19074t.m100223u("presenter");
            c26130b = null;
        }
        c26130b.mo995Nd(this.f55800Q0, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29971p m148342c = C29971p.m148342c(LayoutInflater.from(getContext()));
        AbstractC19074t.m100207e(m148342c, "inflate(...)");
        this.f55799P0 = m148342c;
        if (m148342c == null) {
            AbstractC19074t.m100223u("binding");
            m148342c = null;
        }
        FrameLayout root = m148342c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            Context context = getContext();
            if (context == null) {
                return;
            } else {
                actionBar.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_primary));
            }
        }
        C29971p c29971p = this.f55799P0;
        if (c29971p == null) {
            AbstractC19074t.m100223u("binding");
            c29971p = null;
        }
        ZAppCompatImageView zAppCompatImageView = c29971p.f138921s;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_backup_solid_24, AbstractC2807a.accent_blue_icon));
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m57770sM();
        m57769rM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        super.finish();
        if (AbstractC3489d.m17514v()) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_select_back", null, null, null, 14, null);
        }
    }

    /* renamed from: g */
    public void m57773g() {
        C11072a.b bVar;
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ZCloudSetupContainerView) {
            ZaloView m92650VI2 = m92650VI();
            AbstractC19074t.m100206d(m92650VI2, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView");
            ((ZCloudSetupContainerView) m92650VI2).m77888xM().m77922T();
            return;
        }
        if (m92650VI instanceof ZCloudRestoreContainerView) {
            C11072a c11072a = this.f55800Q0;
            if (c11072a != null) {
                bVar = c11072a.m57780a();
            } else {
                bVar = null;
            }
            if (bVar == C11072a.b.f55810p) {
                ZaloView m92650VI3 = m92650VI();
                AbstractC19074t.m100206d(m92650VI3, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.restore.ZCloudRestoreContainerView");
                ((ZCloudRestoreContainerView) m92650VI3).m77686uM().m77717T();
                return;
            } else {
                ZaloView m92650VI4 = m92650VI();
                AbstractC19074t.m100206d(m92650VI4, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.restore.ZCloudRestoreContainerView");
                ((ZCloudRestoreContainerView) m92650VI4).m77686uM().m77710M();
                return;
            }
        }
        m57772uM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        if (AbstractC3489d.m17513u()) {
            return "ZCloudRestoreChoosePwType";
        }
        return "RestoreBackupPickPwType";
    }

    @Override // s40.InterfaceC26129a
    /* renamed from: h4 */
    public void mo57774h4() {
        C11072a.b bVar;
        int i11;
        C11107b.b bVar2;
        C11072a c11072a = this.f55800Q0;
        C11072a.b bVar3 = null;
        if (c11072a != null) {
            bVar = c11072a.m57780a();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            i11 = -1;
        } else {
            i11 = C11068a.f55802a[bVar.ordinal()];
        }
        boolean z11 = true;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                if (i11 != 5) {
                    if (i11 != 7) {
                        m92693xK().m93069k2(PinCodeVerificationView.class, null, 1, true);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("KEY_TRACKING_FLOW_PIN", "CHANGE_PROTECT_CODE");
                    m92693xK().m93069k2(PinCodeVerificationView.class, bundle, 1, true);
                    finish();
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("KEY_TRACKING_FLOW_PIN", "VERIFY_CLOUD_ONBOARDING_SETUP");
                m92693xK().m93069k2(PinCodeVerificationView.class, bundle2, 1, true);
                return;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("KEY_TRACKING_FLOW_PIN", "NORMAL_RESTORE");
            m92693xK().m93066i2(PinCodeVerificationView.class, bundle3, 23081, 1, true);
            return;
        }
        C11072a c11072a2 = this.f55800Q0;
        if (c11072a2 != null) {
            bVar3 = c11072a2.m57780a();
        }
        boolean z12 = false;
        if (bVar3 != C11072a.b.f55811q) {
            z11 = false;
        }
        Bundle bundle4 = new Bundle();
        if (z11) {
            bVar2 = C11107b.b.f55928q;
        } else {
            bVar2 = C11107b.b.f55927p;
        }
        bundle4.putString("KEY_TRACKING_FLOW_PIN", bVar2.name());
        C11072a c11072a3 = this.f55800Q0;
        if (c11072a3 != null) {
            z12 = c11072a3.m57782c();
        }
        bundle4.putBoolean("ARG_IS_NEED_RESTORE_ZCLOUD_BACKUP", z12);
        m92693xK().m93066i2(PinCodeVerificationView.class, bundle4, 23081, 1, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if ((i11 == 23081 || i11 == 23082) && i12 == -1) {
            mo50035CK(i12, null);
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C29971p c29971p = this.f55799P0;
        C26130b c26130b = null;
        if (c29971p == null) {
            AbstractC19074t.m100223u("binding");
            c29971p = null;
        }
        if (AbstractC19074t.m100204b(view, c29971p.f138920r)) {
            C26130b c26130b2 = this.f55801R0;
            if (c26130b2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                c26130b = c26130b2;
            }
            c26130b.m134496Jp();
            return;
        }
        C29971p c29971p2 = this.f55799P0;
        if (c29971p2 == null) {
            AbstractC19074t.m100223u("binding");
            c29971p2 = null;
        }
        if (AbstractC19074t.m100204b(view, c29971p2.f138919q)) {
            C26130b c26130b3 = this.f55801R0;
            if (c26130b3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                c26130b = c26130b3;
            }
            c26130b.m134495Ip();
        }
    }

    @Override // s40.InterfaceC26129a
    /* renamed from: w2 */
    public void mo57775w2() {
        C11072a.b bVar;
        int i11;
        C11085b.b bVar2;
        C11072a c11072a = this.f55800Q0;
        C11072a.b bVar3 = null;
        if (c11072a != null) {
            bVar = c11072a.m57780a();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            i11 = -1;
        } else {
            i11 = C11068a.f55802a[bVar.ordinal()];
        }
        boolean z11 = true;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                if (i11 != 5) {
                    if (i11 != 7) {
                        m92693xK().m93069k2(PassphraseVerificationView.class, null, 1, true);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("KEY_TRACKING_FLOW_PASSPHRASE", "CHANGE_PROTECT_CODE");
                    m92693xK().m93069k2(PassphraseVerificationView.class, bundle, 1, true);
                    finish();
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("KEY_TRACKING_FLOW_PASSPHRASE", "VERIFY_CLOUD_ONBOARDING_SETUP");
                m92693xK().m93069k2(PassphraseVerificationView.class, bundle2, 1, true);
                return;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("KEY_TRACKING_FLOW_PASSPHRASE", "NORMAL_RESTORE");
            m92693xK().m93066i2(PassphraseVerificationView.class, bundle3, 23082, 1, true);
            return;
        }
        C11072a c11072a2 = this.f55800Q0;
        if (c11072a2 != null) {
            bVar3 = c11072a2.m57780a();
        }
        boolean z12 = false;
        if (bVar3 != C11072a.b.f55811q) {
            z11 = false;
        }
        Bundle bundle4 = new Bundle();
        if (z11) {
            bVar2 = C11085b.b.f55861q;
        } else {
            bVar2 = C11085b.b.f55860p;
        }
        bundle4.putString("KEY_TRACKING_FLOW_PASSPHRASE", bVar2.name());
        C11072a c11072a3 = this.f55800Q0;
        if (c11072a3 != null) {
            z12 = c11072a3.m57782c();
        }
        bundle4.putBoolean("ARG_IS_NEED_RESTORE_ZCLOUD_BACKUP", z12);
        m92693xK().m93066i2(PassphraseVerificationView.class, bundle4, 23082, 1, true);
    }
}
