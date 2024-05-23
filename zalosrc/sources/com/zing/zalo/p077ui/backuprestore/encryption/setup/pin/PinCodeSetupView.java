package com.zing.zalo.p077ui.backuprestore.encryption.setup.pin;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import c50.EnumC3291b;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.pin.PinCodeSetupView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.p077ui.zalocloud.setup.C14008d;
import com.zing.zalo.zdesign.component.EnumC16975f0;
import com.zing.zalo.zdesign.component.OtpField;
import com.zing.zalo.zdesign.component.inputfield.EnumC17007i;
import com.zing.zalo.zdesign.component.inputfield.OtpEdittext;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import i20.C20196i;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import p649xl.AbstractC30109x;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import r40.C25647a;
import tg0.C26676b;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class PinCodeSetupView extends BaseZCloudView<AbstractC30109x> {
    public static final C11053a Companion = new C11053a(null);

    /* renamed from: R0 */
    private final InterfaceC24854k f55763R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f55764S0;

    /* renamed from: T0 */
    private C20196i f55765T0;

    /* renamed from: U0 */
    private boolean f55766U0;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupView$a */
    /* loaded from: classes5.dex */
    public static final class C11053a {
        private C11053a() {
        }

        public /* synthetic */ C11053a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupView$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11054b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55767a;

        static {
            int[] iArr = new int[EnumC3291b.values().length];
            try {
                iArr[EnumC3291b.f14085t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3291b.f14083r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3291b.f14086u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55767a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupView$c */
    /* loaded from: classes5.dex */
    static final class C11055c extends AbstractC19075u implements InterfaceC18509p {
        C11055c() {
            super(2);
        }

        /* renamed from: a */
        public final void m57718a(int i11, float f11) {
            RelativeLayout relativeLayout;
            boolean z11;
            int height = (PinCodeSetupView.m57710uM(PinCodeSetupView.this).getRoot().getHeight() - PinCodeSetupView.m57710uM(PinCodeSetupView.this).f139858X.getHeight()) - PinCodeSetupView.m57710uM(PinCodeSetupView.this).f139850P.getHeight();
            if (PinCodeSetupView.m57710uM(PinCodeSetupView.this).f139852R.getHeight() > 0) {
                relativeLayout = PinCodeSetupView.m57710uM(PinCodeSetupView.this).f139852R;
            } else {
                relativeLayout = PinCodeSetupView.m57710uM(PinCodeSetupView.this).f139851Q;
            }
            if (height - AbstractC23222t7.f112549a0 < relativeLayout.getHeight() + PinCodeSetupView.m57710uM(PinCodeSetupView.this).f139855U.getHeight() + PinCodeSetupView.m57710uM(PinCodeSetupView.this).f139857W.getHeight()) {
                z11 = true;
            } else {
                z11 = false;
            }
            PinCodeSetupView.this.m57715zM().m57754h0(z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m57718a(((Number) obj).intValue(), ((Number) obj2).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupView$d */
    /* loaded from: classes5.dex */
    public static final class C11056d extends AbstractC19075u implements InterfaceC18494a {
        C11056d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57719a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57719a() {
            PinCodeSetupView.m57710uM(PinCodeSetupView.this).f139855U.getEditText().setText("");
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupView$e */
    /* loaded from: classes5.dex */
    public static final class C11057e implements TextWatcher {
        public C11057e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            PinCodeSetupView.this.m57707GM(PinCodeSetupView.this.m57715zM().m57750c0(String.valueOf(charSequence), PinCodeSetupView.this.m57716DM()));
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupView$f */
    /* loaded from: classes5.dex */
    static final class C11058f extends AbstractC19075u implements InterfaceC18494a {
        C11058f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C11067b mo12V4() {
            ZaloView m92690uK = PinCodeSetupView.this.m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C11067b) new C1802w0(m92690uK, new C25647a()).m9378a(C11067b.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupView$g */
    /* loaded from: classes5.dex */
    static final class C11059g extends AbstractC19075u implements InterfaceC18505l {
        C11059g() {
            super(1);
        }

        /* renamed from: a */
        public final void m57721a(PinCodeSetupContainerViewState pinCodeSetupContainerViewState) {
            boolean z11;
            PinCodeSetupView pinCodeSetupView = PinCodeSetupView.this;
            if (pinCodeSetupContainerViewState.m57700d() && PinCodeSetupView.this.m57716DM()) {
                z11 = true;
            } else {
                z11 = false;
            }
            pinCodeSetupView.m57706FM(z11);
            PinCodeSetupView.this.m57705EM(pinCodeSetupContainerViewState.m57701e());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57721a((PinCodeSetupContainerViewState) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupView$h */
    /* loaded from: classes5.dex */
    static final class C11060h extends AbstractC19075u implements InterfaceC18494a {
        C11060h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C14008d mo12V4() {
            ZaloView m92690uK = PinCodeSetupView.this.m92690uK().m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C14008d) new C1802w0(m92690uK).m9378a(C14008d.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupView$i */
    /* loaded from: classes5.dex */
    static final class C11061i implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f55774p;

        C11061i(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f55774p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f55774p;
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
            this.f55774p.mo205i9(obj);
        }
    }

    public PinCodeSetupView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C11058f());
        this.f55763R0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11060h());
        this.f55764S0 = m129210a2;
    }

    /* renamed from: AM */
    private final C14008d m57702AM() {
        return (C14008d) this.f55764S0.getValue();
    }

    /* renamed from: BM */
    public static final void m57703BM(PinCodeSetupView pinCodeSetupView, View view) {
        AbstractC19074t.m100208f(pinCodeSetupView, "this$0");
        if (pinCodeSetupView.m92650VI() instanceof PinCodeSetupContainerView) {
            C26676b c26676b = C26676b.f126324a;
            ZaloView m92650VI = pinCodeSetupView.m92650VI();
            AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView");
            c26676b.m136963B(true, ((PinCodeSetupContainerView) m92650VI).m77749uM(false));
        }
        pinCodeSetupView.m57715zM().m57739Q(String.valueOf(((AbstractC30109x) pinCodeSetupView.m77756kM()).f139855U.getEditText().getText()), new C11056d());
    }

    /* renamed from: CM */
    public static final void m57704CM(PinCodeSetupView pinCodeSetupView, View view) {
        AbstractC19074t.m100208f(pinCodeSetupView, "this$0");
        if (pinCodeSetupView.m92650VI() instanceof PinCodeSetupContainerView) {
            C26676b c26676b = C26676b.f126324a;
            ZaloView m92650VI = pinCodeSetupView.m92650VI();
            AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView");
            c26676b.m136963B(false, ((PinCodeSetupContainerView) m92650VI).m77749uM(false));
        }
        pinCodeSetupView.m57715zM().m57748a0();
    }

    /* renamed from: EM */
    public final void m57705EM(boolean z11) {
        if (z11) {
            ((AbstractC30109x) m77756kM()).f139852R.setVisibility(8);
            ((AbstractC30109x) m77756kM()).f139851Q.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = ((AbstractC30109x) m77756kM()).f139856V.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).addRule(2, ((AbstractC30109x) m77756kM()).f139850P.getId());
            return;
        }
        ((AbstractC30109x) m77756kM()).f139851Q.setVisibility(8);
        ((AbstractC30109x) m77756kM()).f139852R.setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = ((AbstractC30109x) m77756kM()).f139856V.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams2).addRule(2, ((AbstractC30109x) m77756kM()).f139852R.getId());
    }

    /* renamed from: FM */
    public final void m57706FM(boolean z11) {
        ((AbstractC30109x) m77756kM()).f139855U.m90595c(z11);
        ((AbstractC30109x) m77756kM()).f139855U.m90594b(z11);
    }

    /* renamed from: GM */
    public final void m57707GM(EnumC3291b enumC3291b) {
        int i11 = C11054b.f55767a[enumC3291b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    ((AbstractC30109x) m77756kM()).f139850P.setEnabled(false);
                    return;
                } else {
                    ((AbstractC30109x) m77756kM()).f139850P.setEnabled(false);
                    return;
                }
            }
            ((AbstractC30109x) m77756kM()).f139850P.setEnabled(true);
            return;
        }
        m57706FM(false);
        ((AbstractC30109x) m77756kM()).f139850P.setEnabled(true);
        AbstractC2379w.m12430d(m92656bJ());
    }

    /* renamed from: uM */
    public static final /* synthetic */ AbstractC30109x m57710uM(PinCodeSetupView pinCodeSetupView) {
        return (AbstractC30109x) pinCodeSetupView.m77756kM();
    }

    /* renamed from: zM */
    public final C11067b m57715zM() {
        return (C11067b) this.f55763R0.getValue();
    }

    /* renamed from: DM */
    public final boolean m57716DM() {
        return this.f55766U0;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return this.f55766U0;
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

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C20196i c20196i = this.f55765T0;
        if (c20196i != null) {
            C20196i.m105317q(c20196i, null, 1, null);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C20196i c20196i = this.f55765T0;
        if (c20196i != null) {
            c20196i.m105321s();
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return this.f55766U0 ? "ZCloudSetUpPinConfirm" : "ZCloudSetUpPinCreate";
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
        this.f55766U0 = z11;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.backup_pin_code_setup_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        this.f55765T0 = new C20196i(this, true, new C11055c());
        OtpField otpField = ((AbstractC30109x) m77756kM()).f139855U;
        otpField.setFieldState(EnumC17007i.ERROR);
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_setup_pin_code_not_match);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        otpField.setErrorText(m92652XI);
        otpField.setLongClickable(false);
        otpField.setShowingMode(EnumC16975f0.AUTO_HIDDEN);
        otpField.setTimeAnimAutoHidden(500L);
        m57706FM(false);
        OtpEdittext editText = otpField.getEditText();
        editText.setMaxLength(6);
        editText.addTextChangedListener(new C11057e());
        otpField.requestFocus();
        AbstractC2379w.m12432f(otpField.getEditText());
        if (this.f55766U0) {
            Editable text = ((AbstractC30109x) m77756kM()).f139855U.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            ((AbstractC30109x) m77756kM()).f139857W.setText(m92652XI(AbstractC8020f0.str_zcloud_setup_pin_confirm_code));
            ((AbstractC30109x) m77756kM()).f139850P.setText(m92652XI(AbstractC8020f0.str_zcloud_finish));
            ((AbstractC30109x) m77756kM()).f139850P.setOnClickListener(new View.OnClickListener() { // from class: r40.b
                public /* synthetic */ ViewOnClickListenerC25648b() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinCodeSetupView.m57703BM(PinCodeSetupView.this, view);
                }
            });
            if (m57702AM().m77929b0() || m57702AM().m77930c0()) {
                ((AbstractC30109x) m77756kM()).f139850P.setText(m92652XI(AbstractC8020f0.str_finished));
                return;
            }
            return;
        }
        m57706FM(false);
        Editable text2 = ((AbstractC30109x) m77756kM()).f139855U.getEditText().getText();
        if (text2 != null) {
            text2.clear();
        }
        ((AbstractC30109x) m77756kM()).f139857W.setText(m92652XI(AbstractC8020f0.str_zcloud_setup_pin_create_pin_title));
        ((AbstractC30109x) m77756kM()).f139850P.setOnClickListener(new View.OnClickListener() { // from class: r40.c
            public /* synthetic */ ViewOnClickListenerC25649c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PinCodeSetupView.m57704CM(PinCodeSetupView.this, view);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m57715zM().m57744W().m9219j(m92657cJ(), new C11061i(new C11059g()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        if (this.f55766U0) {
            m57715zM().m57740R();
            return;
        }
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: rM */
    public void mo57717rM() {
    }
}
