package com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase;

import ac.C0708i;
import ac.C0732w;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.AbstractC11045b;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.PassphraseSetupView;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.SaveBackupKeyBottomSheet;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.SecretPhaseView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.p077ui.zalocloud.setup.C14008d;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import java.util.Arrays;
import me0.C23055e5;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mj0.AbstractC23322a;
import p205hc.C19965d;
import p649xl.AbstractC29989q;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import q40.C25112a;
import q40.EnumC25120i;
import tg0.C26676b;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class PassphraseSetupView extends BaseZCloudView<AbstractC29989q> {
    public static final C11033a Companion = new C11033a(null);

    /* renamed from: R0 */
    private final InterfaceC24854k f55707R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f55708S0;

    /* renamed from: T0 */
    private boolean f55709T0;

    /* renamed from: U0 */
    private boolean f55710U0;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupView$a */
    /* loaded from: classes5.dex */
    public static final class C11033a {
        private C11033a() {
        }

        public /* synthetic */ C11033a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupView$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11034b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55711a;

        static {
            int[] iArr = new int[EnumC25120i.values().length];
            try {
                iArr[EnumC25120i.f120644p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25120i.f120645q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25120i.f120646r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25120i.f120647s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f55711a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupView$c */
    /* loaded from: classes5.dex */
    public static final class C11035c implements SecretPhaseView.InterfaceC11043a {
        C11035c() {
        }

        @Override // com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.SecretPhaseView.InterfaceC11043a
        /* renamed from: a */
        public void mo57632a() {
            C26676b.f126324a.m136970I(PassphraseSetupView.this.m57629GM(), PassphraseSetupView.m57625wM(PassphraseSetupView.this).f139061V.getId(), PassphraseSetupView.this.m57615DM());
            PassphraseSetupView.this.m57613BM().m57671c0(SaveBackupKeyBottomSheet.EnumC11042b.f55722s);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupView$d */
    /* loaded from: classes5.dex */
    static final class C11036d extends AbstractC19075u implements InterfaceC18494a {
        C11036d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11046c mo12V4() {
            ZaloView m92690uK = PassphraseSetupView.this.m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C11046c) new C1802w0(m92690uK, new C25112a()).m9378a(C11046c.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupView$e */
    /* loaded from: classes5.dex */
    static final class C11037e extends AbstractC19075u implements InterfaceC18505l {
        C11037e() {
            super(1);
        }

        /* renamed from: a */
        public final void m57634a(String str) {
            SecretPhaseView secretPhaseView = PassphraseSetupView.m57625wM(PassphraseSetupView.this).f139061V;
            AbstractC19074t.m100205c(str);
            secretPhaseView.m57653c(4, str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57634a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupView$f */
    /* loaded from: classes5.dex */
    static final class C11038f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupView$f$a */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f55716a;

            static {
                int[] iArr = new int[EnumC25120i.values().length];
                try {
                    iArr[EnumC25120i.f120644p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC25120i.f120645q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC25120i.f120647s.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC25120i.f120646r.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f55716a = iArr;
            }
        }

        C11038f() {
            super(1);
        }

        /* renamed from: a */
        public final void m57635a(AbstractC11045b abstractC11045b) {
            AbstractC19074t.m100208f(abstractC11045b, "it");
            if (abstractC11045b instanceof AbstractC11045b.a) {
                AbstractC11045b.a aVar = (AbstractC11045b.a) abstractC11045b;
                int i11 = a.f55716a[aVar.m57654a().ordinal()];
                if (i11 == 1) {
                    PassphraseSetupView.this.f55710U0 = true;
                    Context context = PassphraseSetupView.this.getContext();
                    if (context != null) {
                        ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119768g(context, PassphraseSetupView.this.m57613BM().m57667Y(), new SensitiveData("clipboard_copy_passphrase_setup_zcloud", "zcloud", null, 4, null), false);
                    }
                } else if (i11 == 2) {
                    PassphraseSetupView.this.f55710U0 = true;
                    C26676b.f126324a.m136989b0(SaveBackupKeyBottomSheet.EnumC11042b.f55721r, true, PassphraseSetupView.this.m57615DM());
                } else if (i11 == 3 || i11 == 4) {
                    C26676b.f126324a.m136989b0(SaveBackupKeyBottomSheet.EnumC11042b.f55721r, false, PassphraseSetupView.this.m57615DM());
                }
                PassphraseSetupView.this.m57630KM(aVar.m57654a());
                PassphraseSetupView.m57625wM(PassphraseSetupView.this).f139057R.setEnabled(PassphraseSetupView.this.f55710U0);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57635a((AbstractC11045b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupView$g */
    /* loaded from: classes5.dex */
    static final class C11039g extends AbstractC19075u implements InterfaceC18494a {
        C11039g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C14008d mo12V4() {
            ZaloView m92690uK = PassphraseSetupView.this.m92690uK().m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C14008d) new C1802w0(m92690uK).m9378a(C14008d.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupView$h */
    /* loaded from: classes5.dex */
    static final class C11040h implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f55718p;

        C11040h(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f55718p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f55718p;
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
            this.f55718p.mo205i9(obj);
        }
    }

    public PassphraseSetupView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C11036d());
        this.f55707R0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11039g());
        this.f55708S0 = m129210a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public final C11046c m57613BM() {
        return (C11046c) this.f55707R0.getValue();
    }

    /* renamed from: CM */
    private final C14008d m57614CM() {
        return (C14008d) this.f55708S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public final String m57615DM() {
        if (m92650VI() instanceof PassphraseSetupContainerView) {
            ZaloView m92650VI = m92650VI();
            AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupContainerView");
            return ((PassphraseSetupContainerView) m92650VI).m77749uM(false);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m57616EM(PassphraseSetupView passphraseSetupView, View view) {
        AbstractC19074t.m100208f(passphraseSetupView, "this$0");
        C0732w.b bVar = C0732w.Companion;
        C0732w m1189a = bVar.m1189a();
        C0708i c0708i = new C0708i();
        c0708i.m1075f("source", passphraseSetupView.m57615DM());
        C24848g0 c24848g0 = C24848g0.f119245a;
        C0732w.m1177r(m1189a, "zcloud_setup_pass_create_save_pass", null, c0708i, null, 10, null);
        C0732w m1189a2 = bVar.m1189a();
        C0708i c0708i2 = new C0708i();
        c0708i2.m1075f("source", passphraseSetupView.m57615DM());
        C0732w.m1177r(m1189a2, "zcloud_setup_pass_option_ggdrive", null, c0708i2, null, 10, null);
        passphraseSetupView.m57613BM().m57671c0(SaveBackupKeyBottomSheet.EnumC11042b.f55721r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m57617FM(PassphraseSetupView passphraseSetupView, View view) {
        AbstractC19074t.m100208f(passphraseSetupView, "this$0");
        C0732w m1189a = C0732w.Companion.m1189a();
        C0708i c0708i = new C0708i();
        c0708i.m1075f("source", passphraseSetupView.m57615DM());
        C24848g0 c24848g0 = C24848g0.f119245a;
        C0732w.m1177r(m1189a, "zcloud_setup_pass_create_btn_next", null, c0708i, null, 10, null);
        passphraseSetupView.m57618HM();
    }

    /* renamed from: HM */
    private final void m57618HM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a aVar = new C16972e0.a(m92689tK);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90922F(true);
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_setup_passphrase_dialog_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        aVar.m90918B(m92652XI);
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m92652XI2 = m92652XI(AbstractC8020f0.str_zcloud_setup_passphrase_dialog_description);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        String format = String.format(m92652XI2, Arrays.copyOf(new Object[]{C16805b.Companion.m89811a().m89800f()}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        aVar.m90949z(format);
        aVar.m90945v(AbstractC2814h.ButtonLarge_Tertiary);
        String string = m92651WI().getString(AbstractC8020f0.str_zcloud_setup_passphrase_dialog_positive);
        AbstractC19074t.m100207e(string, "getString(...)");
        aVar.m90943t(string, new InterfaceC17463d.d() { // from class: q40.d
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                PassphraseSetupView.m57620JM(PassphraseSetupView.this, interfaceC17463d, i11);
            }
        });
        String string2 = m92651WI().getString(AbstractC8020f0.str_zcloud_setup_passphrase_dialog_negative);
        AbstractC19074t.m100207e(string2, "getString(...)");
        aVar.m90934k(string2, new InterfaceC17463d.d() { // from class: q40.e
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                PassphraseSetupView.m57619IM(PassphraseSetupView.this, interfaceC17463d, i11);
            }
        });
        aVar.m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m57619IM(PassphraseSetupView passphraseSetupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(passphraseSetupView, "this$0");
        C0732w m1189a = C0732w.Companion.m1189a();
        C0708i c0708i = new C0708i();
        c0708i.m1075f("source", passphraseSetupView.m57615DM());
        C24848g0 c24848g0 = C24848g0.f119245a;
        C0732w.m1177r(m1189a, "zcloud_setup_pass_confirm_back", null, c0708i, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m57620JM(PassphraseSetupView passphraseSetupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(passphraseSetupView, "this$0");
        C0732w m1189a = C0732w.Companion.m1189a();
        C0708i c0708i = new C0708i();
        c0708i.m1075f("source", passphraseSetupView.m57615DM());
        C24848g0 c24848g0 = C24848g0.f119245a;
        C0732w.m1177r(m1189a, "zcloud_setup_pass_confirm_save_pass", null, c0708i, null, 10, null);
        if (!C23055e5.m118272g(true)) {
            return;
        }
        if (passphraseSetupView.m57613BM().m57673f0()) {
            passphraseSetupView.m57613BM().m57664T();
        } else if (passphraseSetupView.m57613BM().m57672e0()) {
            passphraseSetupView.m57613BM().m57663S();
        } else {
            passphraseSetupView.m57614CM().m77937k0(passphraseSetupView.m57613BM().m57667Y(), 3);
        }
    }

    /* renamed from: wM */
    public static final /* synthetic */ AbstractC29989q m57625wM(PassphraseSetupView passphraseSetupView) {
        return (AbstractC29989q) passphraseSetupView.m77756kM();
    }

    /* renamed from: GM */
    public final boolean m57629GM() {
        return this.f55709T0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: KM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m57630KM(EnumC25120i enumC25120i) {
        String m92652XI;
        int i11;
        int i12;
        AbstractC19074t.m100208f(enumC25120i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        int i13 = C11034b.f55711a[enumC25120i.ordinal()];
        boolean z11 = true;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3 && i13 != 4) {
                    m92652XI = m92652XI(AbstractC8020f0.error_general);
                } else {
                    m92652XI = m92652XI(AbstractC8020f0.str_zcloud_backup_passphrase_drive_full_storage);
                }
                Snackbar.C16925c c16925c = Snackbar.Companion;
                FrameLayout frameLayout = ((AbstractC29989q) m77756kM()).f139060U;
                AbstractC19074t.m100207e(frameLayout, "snackBarContainer");
                AbstractC19074t.m100205c(m92652XI);
                Snackbar m90669d = c16925c.m90669d(frameLayout, m92652XI, -1);
                Context context = ((AbstractC29989q) m77756kM()).f139060U.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                if (!z11) {
                    i11 = AbstractC23322a.zds_ic_close_circle_solid_24;
                } else {
                    i11 = AbstractC23322a.zds_ic_check_circle_solid_24;
                }
                if (!z11) {
                    i12 = AbstractC2808b.f150830r60;
                } else {
                    i12 = AbstractC2808b.gr60;
                }
                m90669d.m90644J(C27280g.m139659b(context, i11, i12));
                m90669d.m90648N();
            }
            m92652XI = m92652XI(AbstractC8020f0.str_zcloud_setup_secret_phrase_snackbar_saved_code_to_drive);
        } else {
            m92652XI = m92652XI(AbstractC8020f0.str_zcloud_setup_secret_phrase_snackbar_code_copied);
        }
        z11 = false;
        Snackbar.C16925c c16925c2 = Snackbar.Companion;
        FrameLayout frameLayout2 = ((AbstractC29989q) m77756kM()).f139060U;
        AbstractC19074t.m100207e(frameLayout2, "snackBarContainer");
        AbstractC19074t.m100205c(m92652XI);
        Snackbar m90669d2 = c16925c2.m90669d(frameLayout2, m92652XI, -1);
        Context context2 = ((AbstractC29989q) m77756kM()).f139060U.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        if (!z11) {
        }
        if (!z11) {
        }
        m90669d2.m90644J(C27280g.m139659b(context2, i11, i12));
        m90669d2.m90648N();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return this.f55709T0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putBoolean("STATE_ENABLE_CONTINUE_BTN", this.f55710U0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        Context context;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null || (context = getContext()) == null) {
            return;
        }
        actionBar.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_primary));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return this.f55709T0 ? "ZCloudSetUpPassConfirm" : "ZCloudSetUpPassCreate";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: iM */
    public void mo57631iM() {
        super.mo57631iM();
        Bundle m92642L3 = m92642L3();
        boolean z11 = false;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("ARG_IS_CONFIRM_MODE", false);
        }
        this.f55709T0 = z11;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.backup_passphrase_setup_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: lM */
    public void mo57576lM(Bundle bundle) {
        boolean z11;
        super.mo57576lM(bundle);
        if (bundle != null) {
            z11 = bundle.getBoolean("STATE_ENABLE_CONTINUE_BTN");
        } else {
            z11 = false;
        }
        this.f55710U0 = z11;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        ((AbstractC29989q) m77756kM()).f139057R.setEnabled(this.f55710U0);
        ((AbstractC29989q) m77756kM()).f139058S.setOnClickListener(new View.OnClickListener() { // from class: q40.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PassphraseSetupView.m57616EM(PassphraseSetupView.this, view);
            }
        });
        ((AbstractC29989q) m77756kM()).f139057R.setOnClickListener(new View.OnClickListener() { // from class: q40.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PassphraseSetupView.m57617FM(PassphraseSetupView.this, view);
            }
        });
        ((AbstractC29989q) m77756kM()).f139061V.setListener(new C11035c());
        if (m57614CM().m77929b0() || m57614CM().m77930c0()) {
            ((AbstractC29989q) m77756kM()).f139057R.setText(m92652XI(AbstractC8020f0.str_finished));
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m57613BM().m57666X().m9219j(m92657cJ(), new C11040h(new C11037e()));
        m57613BM().m57665V().m9219j(m92657cJ(), new C19965d(new C11038f()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        if (this.f55709T0) {
            finish();
            return;
        }
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.finish();
        }
    }
}
