package com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase;

import ac.C0732w;
import ah0.C0860a;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.lifecycle.AbstractC1791r;
import androidx.lifecycle.AbstractC1803x;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.backuprestore.detail.BackupDetailView;
import com.zing.zalo.p077ui.backuprestore.drive.ManageGoogleAccountView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase.C11085b;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView;
import com.zing.zalo.p077ui.backuprestore.widget.InputKeyCodeView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.restore.ZCloudRestoreContainerView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.C19071q;
import gg0.AbstractC19444a;
import java.util.Arrays;
import kg0.C21719b;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import mg0.C23290b;
import mj0.AbstractC23322a;
import nh0.C23793c;
import nl.C23870a;
import p269jj.C21275a;
import p297kd.C21688c;
import p320ld.C22436h;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p387oc.C24199c;
import p387oc.C24213q;
import p421pc.C24720a;
import p443qc.EnumC25220d;
import p479rc.C25724a;
import p484ri.C25806c;
import p542ub.InterfaceC27218a;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import p645xh.C29628e;
import p649xl.C29860ie;
import p649xl.C30024s;
import pg0.C24747a;
import pm0.C24848g0;
import qg0.C25268c;
import t40.InterfaceC26478a;
import tb0.C26626l;
import tg0.C26676b;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class PassphraseVerificationView extends SlidableZaloView implements InterfaceC26478a, View.OnClickListener {
    public static final C11073a Companion = new C11073a(null);

    /* renamed from: P0 */
    private C30024s f55819P0;

    /* renamed from: Q0 */
    private C11085b f55820Q0;

    /* renamed from: R0 */
    private final C11078f f55821R0 = new C11078f();

    /* renamed from: S0 */
    private C11084a f55822S0;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$a */
    /* loaded from: classes5.dex */
    public static final class C11073a {
        private C11073a() {
        }

        public /* synthetic */ C11073a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11074b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55823a;

        static {
            int[] iArr = new int[C11085b.b.values().length];
            try {
                iArr[C11085b.b.f55860p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C11085b.b.f55861q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C11085b.b.f55862r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C11085b.b.f55864t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C11085b.b.f55863s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C11085b.b.f55866v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f55823a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11075c extends C19071q implements InterfaceC18494a {
        C11075c(Object obj) {
            super(0, obj, PassphraseVerificationView.class, "onCloseView", "onCloseView()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57821h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m57821h() {
            ((PassphraseVerificationView) this.f94922q).m57799tM();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$d */
    /* loaded from: classes5.dex */
    public static final class C11076d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f55825q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m57823a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m57823a() {
                AbstractC23306f.m120692n().m133040U(EnumC25220d.f120981r);
            }
        }

        C11076d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57822a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57822a() {
            PassphraseVerificationView.this.m57800uM();
            C11084a c11084a = PassphraseVerificationView.this.f55822S0;
            if (c11084a == null) {
                AbstractC19074t.m100223u("presenter");
                c11084a = null;
            }
            c11084a.m57853Qp(a.f55825q);
            PassphraseVerificationView.this.m57799tM();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$e */
    /* loaded from: classes5.dex */
    public static final class C11077e extends AbstractC19075u implements InterfaceC18494a {
        C11077e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57824a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57824a() {
            PassphraseVerificationView.this.mo57814g();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$f */
    /* loaded from: classes5.dex */
    public static final class C11078f implements InterfaceC28625j {
        C11078f() {
        }

        /* renamed from: b */
        public static final void m57826b(PassphraseVerificationView passphraseVerificationView) {
            C11085b.b bVar;
            boolean z11;
            AbstractC19074t.m100208f(passphraseVerificationView, "this$0");
            passphraseVerificationView.mo49315c4();
            C11085b c11085b = passphraseVerificationView.f55820Q0;
            if (c11085b != null) {
                bVar = c11085b.m57863a();
            } else {
                bVar = null;
            }
            if (bVar == C11085b.b.f55863s) {
                z11 = true;
            } else {
                z11 = false;
            }
            passphraseVerificationView.mo57813bl(false, z11);
        }

        @Override // p586vt.InterfaceC28625j
        /* renamed from: lk */
        public void mo57172lk(AbstractC28627l abstractC28627l) {
            C21688c.b bVar = (C21688c.b) abstractC28627l;
            if (bVar != null && bVar.f132722a == 22) {
                AbstractC19444a.m101697e(new Runnable() { // from class: t40.e
                    public /* synthetic */ RunnableC26482e() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PassphraseVerificationView.C11078f.m57826b(PassphraseVerificationView.this);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$g */
    /* loaded from: classes5.dex */
    public static final class C11079g implements TextWatcher {
        public C11079g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            C30024s c30024s = PassphraseVerificationView.this.f55819P0;
            if (c30024s == null) {
                AbstractC19074t.m100223u("binding");
                c30024s = null;
            }
            Button button = c30024s.f139265r;
            if (String.valueOf(editable).length() == 64) {
                z11 = true;
            } else {
                z11 = false;
            }
            button.setEnabled(z11);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$h */
    /* loaded from: classes5.dex */
    public static final class C11080h implements TextView.OnEditorActionListener {
        C11080h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            if (i11 == 6) {
                C30024s c30024s = PassphraseVerificationView.this.f55819P0;
                C30024s c30024s2 = null;
                if (c30024s == null) {
                    AbstractC19074t.m100223u("binding");
                    c30024s = null;
                }
                Editable text = c30024s.f139261A.getText();
                if (text != null && text.length() == 64) {
                    C30024s c30024s3 = PassphraseVerificationView.this.f55819P0;
                    if (c30024s3 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c30024s2 = c30024s3;
                    }
                    c30024s2.f139265r.performClick();
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$i */
    /* loaded from: classes5.dex */
    public static final class C11081i extends AbstractC19075u implements InterfaceC18505l {
        C11081i() {
            super(1);
        }

        /* renamed from: a */
        public final void m57827a(int i11) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_code_change_no_bio", null, null, null, 14, null);
            PassphraseVerificationView.this.mo57811Z0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57827a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$j */
    /* loaded from: classes5.dex */
    public static final class C11082j extends AbstractC19075u implements InterfaceC18494a {
        C11082j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57828a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57828a() {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_code_change_bio_pass", null, null, null, 14, null);
            PassphraseVerificationView.this.mo57811Z0();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView$k */
    /* loaded from: classes5.dex */
    static final class C11083k extends AbstractC19075u implements InterfaceC18494a {
        C11083k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57829a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57829a() {
            PassphraseVerificationView.this.mo46829Y();
            C11084a c11084a = PassphraseVerificationView.this.f55822S0;
            if (c11084a == null) {
                AbstractC19074t.m100223u("presenter");
                c11084a = null;
            }
            c11084a.m57859gq();
        }
    }

    /* renamed from: BM */
    public static final void m57785BM(PassphraseVerificationView passphraseVerificationView, Bundle bundle) {
        AbstractC19074t.m100208f(passphraseVerificationView, "this$0");
        AbstractC19074t.m100208f(bundle, "$extras");
        try {
            C17487o0 m92662fJ = passphraseVerificationView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(ZCloudSetupContainerView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            C26676b.m136953c(e11);
        }
    }

    /* renamed from: oM */
    private final String m57794oM() {
        C30024s c30024s = this.f55819P0;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        return String.valueOf(c30024s.f139261A.getText());
    }

    /* renamed from: pM */
    private final void m57795pM() {
        C11085b.b bVar;
        int i11;
        TargetBackupInfo m57864b;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C11085b c11085b = this.f55820Q0;
        if (c11085b != null) {
            bVar = c11085b.m57863a();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            i11 = -1;
        } else {
            i11 = C11074b.f55823a[bVar.ordinal()];
        }
        switch (i11) {
            case 1:
            case 2:
                C26626l.m136651J(C26626l.Companion.m136712a(), context, m92662fJ(), new C11075c(this), null, 8, null);
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_64key_dismiss", null, null, null, 14, null);
                return;
            case 3:
                C11085b c11085b2 = this.f55820Q0;
                if (c11085b2 != null && (m57864b = c11085b2.m57864b()) != null) {
                    C24213q.Companion.m126205a().m126197E(m57864b, context, new C11076d());
                    return;
                }
                return;
            case 4:
                C29628e.m147249E0().m147293v1();
                mo57814g();
                C26626l.m136689z(C26626l.Companion.m136712a(), false, false, 3, null);
                return;
            case 5:
                C26626l.Companion.m136712a().m136698R(context, new C11077e());
                return;
            case 6:
                mo57810U1();
                return;
            default:
                return;
        }
    }

    /* renamed from: qM */
    private final void m57796qM() {
        C11085b.b bVar;
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_64key_forgot", null, null, null, 14, null);
        C11085b c11085b = this.f55820Q0;
        C11084a c11084a = null;
        if (c11085b != null) {
            bVar = c11085b.m57863a();
        } else {
            bVar = null;
        }
        if (bVar == C11085b.b.f55865u) {
            m57804yM();
            return;
        }
        C11084a c11084a2 = this.f55822S0;
        if (c11084a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            c11084a = c11084a2;
        }
        c11084a.m57858fq();
    }

    /* renamed from: rM */
    private final void m57797rM() {
        C30024s c30024s = this.f55819P0;
        C11085b.b bVar = null;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        ZdsActionBar zdsActionBar = c30024s.f139262B;
        View divider = zdsActionBar.getDivider();
        int i11 = -1;
        if (divider != null) {
            divider.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }
        C11085b c11085b = this.f55820Q0;
        if (c11085b != null) {
            bVar = c11085b.m57863a();
        }
        if (bVar != null) {
            i11 = C11074b.f55823a[bVar.ordinal()];
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
                    zdsActionBar.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: t40.b
                        public /* synthetic */ ViewOnClickListenerC26479b() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PassphraseVerificationView.m57798sM(PassphraseVerificationView.this, view);
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

    /* renamed from: sM */
    public static final void m57798sM(PassphraseVerificationView passphraseVerificationView, View view) {
        AbstractC19074t.m100208f(passphraseVerificationView, "this$0");
        passphraseVerificationView.m57795pM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:            if (r1 == com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase.C11085b.b.f55861q) goto L29;     */
    /* renamed from: tM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m57799tM() {
        C11085b.b bVar;
        C11085b c11085b = this.f55820Q0;
        C11085b.b bVar2 = null;
        if (c11085b != null) {
            bVar = c11085b.m57863a();
        } else {
            bVar = null;
        }
        if (bVar != C11085b.b.f55860p) {
            C11085b c11085b2 = this.f55820Q0;
            if (c11085b2 != null) {
                bVar2 = c11085b2.m57863a();
            }
        }
        AbstractC23306f.m120636Y1().m128515G(true);
        AbstractC23306f.m120692n().m133040U(EnumC25220d.f120981r);
        AbstractC23306f.m120676j().m128408Z(false);
        mo57814g();
    }

    /* renamed from: uM */
    public final void m57800uM() {
        C22436h.f109760a.m115918n().mo13474a(new Runnable() { // from class: t40.d
            @Override // java.lang.Runnable
            public final void run() {
                PassphraseVerificationView.m57801vM();
            }
        });
        C22447s.f109797a.m116071J0();
        AbstractC23647d.m123897g("5580114");
    }

    /* renamed from: vM */
    public static final void m57801vM() {
        AbstractC23306f.m120692n().m133035O(C23793c.Companion.m124321a().mo124314i());
        C22436h.f109760a.m115911A(1, false);
    }

    /* renamed from: wM */
    private final void m57802wM() {
        C30024s c30024s = this.f55819P0;
        C30024s c30024s2 = null;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        c30024s.f139265r.setOnClickListener(this);
        C30024s c30024s3 = this.f55819P0;
        if (c30024s3 == null) {
            AbstractC19074t.m100223u("binding");
            c30024s3 = null;
        }
        c30024s3.f139266s.setOnClickListener(this);
        C30024s c30024s4 = this.f55819P0;
        if (c30024s4 == null) {
            AbstractC19074t.m100223u("binding");
            c30024s4 = null;
        }
        c30024s4.f139273z.setOnClickListener(this);
        C30024s c30024s5 = this.f55819P0;
        if (c30024s5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30024s2 = c30024s5;
        }
        InputKeyCodeView inputKeyCodeView = c30024s2.f139261A;
        AbstractC19074t.m100207e(inputKeyCodeView, "vPassphrase");
        inputKeyCodeView.addTextChangedListener(new C11079g());
    }

    /* renamed from: xM */
    private final void m57803xM() {
        C11085b.b bVar;
        m57797rM();
        C30024s c30024s = this.f55819P0;
        C30024s c30024s2 = null;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        ZAppCompatImageView zAppCompatImageView = c30024s.f139268u.f138209q;
        Context context = zAppCompatImageView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_warning_solid_16, AbstractC2807a.support_error));
        C11085b c11085b = this.f55820Q0;
        if (c11085b != null) {
            bVar = c11085b.m57863a();
        } else {
            bVar = null;
        }
        if (bVar == C11085b.b.f55865u) {
            C30024s c30024s3 = this.f55819P0;
            if (c30024s3 == null) {
                AbstractC19074t.m100223u("binding");
                c30024s3 = null;
            }
            c30024s3.f139272y.setText(m92652XI(AbstractC8020f0.str_title_enter_current_protect_code));
        }
        C30024s c30024s4 = this.f55819P0;
        if (c30024s4 == null) {
            AbstractC19074t.m100223u("binding");
            c30024s4 = null;
        }
        ZAppCompatImageView zAppCompatImageView2 = c30024s4.f139267t;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView2.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_backup_solid_24, AbstractC2807a.accent_blue_icon));
        C30024s c30024s5 = this.f55819P0;
        if (c30024s5 == null) {
            AbstractC19074t.m100223u("binding");
            c30024s5 = null;
        }
        c30024s5.f139261A.setImeOptions(6);
        C30024s c30024s6 = this.f55819P0;
        if (c30024s6 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30024s2 = c30024s6;
        }
        c30024s2.f139261A.setOnEditorActionListener(new C11080h());
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(18);
        }
    }

    /* renamed from: yM */
    private final void m57804yM() {
        Object m92648SI = m92648SI();
        if (m92648SI == null || !(m92648SI instanceof InterfaceC27218a)) {
            return;
        }
        C26626l m136712a = C26626l.Companion.m136712a();
        InterfaceC27218a interfaceC27218a = (InterfaceC27218a) m92648SI;
        Context context = interfaceC27218a.getContext();
        AbstractC19074t.m100205c(context);
        C26626l.m136649G(m136712a, interfaceC27218a, context, new C11081i(), new C11082j(), null, 16, null);
    }

    /* renamed from: zM */
    private final void m57805zM() {
        int i11 = AbstractC2807a.snackbar_custom_color_red;
        Snackbar.C16925c c16925c = Snackbar.Companion;
        C30024s c30024s = this.f55819P0;
        C30024s c30024s2 = null;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        FrameLayout frameLayout = c30024s.f139271x;
        AbstractC19074t.m100207e(frameLayout, "snackBarContainer");
        Snackbar m90668c = c16925c.m90668c(frameLayout, AbstractC8020f0.str_error_protect_code_not_found_from_ggdrive, -1);
        C30024s c30024s3 = this.f55819P0;
        if (c30024s3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30024s2 = c30024s3;
        }
        Context context = c30024s2.f139271x.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        m90668c.m90644J(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_circle_solid_24, i11));
        m90668c.m90648N();
    }

    /* renamed from: AM */
    public void m57806AM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92693xK().m93069k2(MainTabView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f55820Q0 = C11085b.Companion.m57866a(this.f72421L0.m92642L3());
        C21275a m120583H = AbstractC23306f.m120583H();
        AbstractC19074t.m100207e(m120583H, "provideCommonRepo(...)");
        C23290b m120700p = AbstractC23306f.m120700p();
        AbstractC19074t.m100207e(m120700p, "provideBackupZCloudKeyManager(...)");
        C24720a m120676j = AbstractC23306f.m120676j();
        AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
        C25724a m120668h = AbstractC23306f.m120668h();
        AbstractC19074t.m100207e(m120668h, "provideBackupEncryptionManager(...)");
        C0860a m120691m2 = AbstractC23306f.m120691m2();
        AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
        C21719b m120655d2 = AbstractC23306f.m120655d2();
        AbstractC19074t.m100207e(m120655d2, "provideZaloCloudManager(...)");
        C25268c m120647b2 = AbstractC23306f.m120647b2();
        AbstractC19074t.m100207e(m120647b2, "provideZaloCloudKeyManager(...)");
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        C24747a m120636Y1 = AbstractC23306f.m120636Y1();
        AbstractC19074t.m100207e(m120636Y1, "provideZaloCloudCriticalCaseManager(...)");
        C24199c m120684l = AbstractC23306f.m120684l();
        AbstractC19074t.m100207e(m120684l, "provideBackupRestoreManager(...)");
        C25806c m120692n = AbstractC23306f.m120692n();
        AbstractC19074t.m100207e(m120692n, "provideBackupRestoreRepo(...)");
        C11084a c11084a = new C11084a(this, m120583H, m120700p, m120676j, m120668h, m120691m2, m120655d2, m120647b2, m120679j2, m120636Y1, m120684l, m120692n);
        this.f55822S0 = c11084a;
        c11084a.m57856dq(this.f55820Q0, null);
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: D1 */
    public void mo57807D1() {
        C11085b c11085b = this.f55820Q0;
        if (c11085b != null) {
            if (C11074b.f55823a[c11085b.m57863a().ordinal()] == 3) {
                mo50035CK(-1, null);
                finish();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30024s m148464c = C30024s.m148464c(LayoutInflater.from(getContext()));
        AbstractC19074t.m100207e(m148464c, "inflate(...)");
        this.f55819P0 = m148464c;
        if (m148464c == null) {
            AbstractC19074t.m100223u("binding");
            m148464c = null;
        }
        RelativeLayout root = m148464c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C21688c.Companion.m111854a().m111851x(this.f55821R0, "SYNC_MES");
        C30024s c30024s = this.f55819P0;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        AbstractC2379w.m12430d(c30024s.getRoot());
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: P3 */
    public void mo57808P3(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC23152n3.m119050j0(m92689tK(), str);
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: TC */
    public void mo57809TC(String str) {
        AbstractC19074t.m100208f(str, "passphrase");
        mo49315c4();
        C30024s c30024s = this.f55819P0;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        c30024s.f139261A.setPassCode(str);
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: U1 */
    public void mo57810U1() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 7340032);
        m92693xK().m93069k2(BackupDetailView.class, bundle, 1, true);
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: Z0 */
    public void mo57811Z0() {
        C30024s c30024s = this.f55819P0;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        AbstractC2379w.m12430d(c30024s.getRoot());
        InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_CHANGE_KEY", true);
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        if (m57112d != null) {
            m57112d.runOnUiThread(new Runnable() { // from class: t40.c

                /* renamed from: q */
                public final /* synthetic */ Bundle f125718q;

                public /* synthetic */ RunnableC26480c(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PassphraseVerificationView.m57785BM(PassphraseVerificationView.this, r2);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C21688c.Companion.m111854a().m111849u(this.f55821R0, "SYNC_MES");
        m57803xM();
        m57802wM();
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: Ze */
    public void mo57812Ze() {
        C30024s c30024s = this.f55819P0;
        C30024s c30024s2 = null;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        c30024s.f139268u.getRoot().setVisibility(0);
        C30024s c30024s3 = this.f55819P0;
        if (c30024s3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30024s2 = c30024s3;
        }
        c30024s2.f139268u.f138210r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_incorrect_input_protect_code));
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: bl */
    public void mo57813bl(boolean z11, boolean z12) {
        C30024s c30024s = this.f55819P0;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        AbstractC2379w.m12430d(c30024s.getRoot());
        if (m92650VI() instanceof ZCloudSetupContainerView) {
            ZaloView m92650VI = m92650VI();
            AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView");
            ((ZCloudSetupContainerView) m92650VI).m77888xM().m77921R(z11, z12);
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.str_zcloud_setup_error, new Object[0]);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        super.finish();
        if (AbstractC3489d.m17513u()) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_64key_dismiss", null, null, null, 14, null);
        }
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: g */
    public void mo57814g() {
        C11085b.b bVar;
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ZCloudSetupContainerView) {
            ZaloView m92650VI2 = m92650VI();
            AbstractC19074t.m100206d(m92650VI2, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView");
            ((ZCloudSetupContainerView) m92650VI2).m77888xM().m77922T();
            return;
        }
        if (m92650VI instanceof ZCloudRestoreContainerView) {
            C11085b c11085b = this.f55820Q0;
            if (c11085b != null) {
                bVar = c11085b.m57863a();
            } else {
                bVar = null;
            }
            if (bVar == C11085b.b.f55860p) {
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
        m57806AM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        C11085b.b bVar;
        if (AbstractC3489d.m17513u()) {
            return "ZCloudRestore64key";
        }
        C11085b c11085b = this.f55820Q0;
        if (c11085b != null) {
            bVar = c11085b.m57863a();
        } else {
            bVar = null;
        }
        if (bVar == C11085b.b.f55865u) {
            return "ZCloudCodeChangeRemain64";
        }
        return "RestoreBackupInputPw64Key";
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: gm */
    public void mo57815gm(int i11) {
        C30024s c30024s = this.f55819P0;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        C29860ie c29860ie = c30024s.f139268u;
        c29860ie.getRoot().setVisibility(0);
        c29860ie.f138210r.setText(m92651WI().getQuantityString(AbstractC7921d0.str_title_incorrect_code_with_attempt_times, i11, Integer.valueOf(i11)));
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: mx */
    public void mo57816mx() {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_MODE", 4);
        bundle.putBoolean("extra_from_zcloud", true);
        bundle.putInt("extra_entry_point", 16);
        bundle.putBoolean("extra_need_fetch_metadata", false);
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ManageGoogleAccountView.class, bundle, 18061, 1, true);
        }
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: oA */
    public void mo57817oA() {
        mo49315c4();
        C30024s c30024s = this.f55819P0;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        AbstractC2379w.m12430d(c30024s.getRoot());
        m57805zM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 18061 && i12 == -1) {
            mo46829Y();
            C11084a c11084a = this.f55822S0;
            if (c11084a == null) {
                AbstractC19074t.m100223u("presenter");
                c11084a = null;
            }
            c11084a.m57855Tp();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C30024s c30024s = this.f55819P0;
        C11084a c11084a = null;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        if (AbstractC19074t.m100204b(view, c30024s.f139265r)) {
            C11084a c11084a2 = this.f55822S0;
            if (c11084a2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                c11084a = c11084a2;
            }
            c11084a.m57857eq(m57794oM());
            return;
        }
        C30024s c30024s2 = this.f55819P0;
        if (c30024s2 == null) {
            AbstractC19074t.m100223u("binding");
            c30024s2 = null;
        }
        if (AbstractC19074t.m100204b(view, c30024s2.f139266s)) {
            m57796qM();
            return;
        }
        C30024s c30024s3 = this.f55819P0;
        if (c30024s3 == null) {
            AbstractC19074t.m100223u("binding");
            c30024s3 = null;
        }
        if (AbstractC19074t.m100204b(view, c30024s3.f139273z)) {
            C11084a c11084a3 = this.f55822S0;
            if (c11084a3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                c11084a = c11084a3;
            }
            c11084a.m57854Rp();
        }
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: vC */
    public AbstractC1791r mo57818vC() {
        return AbstractC1803x.m9388a(this);
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: x1 */
    public void mo57819x1() {
        C24213q m126205a = C24213q.Companion.m126205a();
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C24213q.m126191v(m126205a, m92689tK, null, new C11083k(), 2, null);
    }

    @Override // t40.InterfaceC26478a
    /* renamed from: y2 */
    public void mo57820y2(int i11) {
        C30024s c30024s = this.f55819P0;
        if (c30024s == null) {
            AbstractC19074t.m100223u("binding");
            c30024s = null;
        }
        C29860ie c29860ie = c30024s.f139268u;
        c29860ie.getRoot().setVisibility(0);
        RobotoTextView robotoTextView = c29860ie.f138210r;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message_with_code);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
    }
}
