package com.zing.zalo.p077ui.backuprestore.encryption.verification.password;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.password.AbstractC11093a;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.password.PasswordVerificationView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseSetupZaloCloudView;
import com.zing.zalo.zdesign.component.PasswordField;
import com.zing.zalo.zdesign.component.inputfield.EnumC17007i;
import com.zing.zalo.zview.actionbar.ActionBar;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p205hc.C19965d;
import p297kd.C21688c;
import p387oc.C24213q;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import p649xl.AbstractC30041t;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import u40.C27030a;
import u40.C27033d;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class PasswordVerificationView extends BaseSetupZaloCloudView<AbstractC30041t> {

    /* renamed from: U0 */
    private final InterfaceC24854k f55869U0;

    /* renamed from: V0 */
    private final C11087b f55870V0;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.password.PasswordVerificationView$a */
    /* loaded from: classes5.dex */
    public static final class C11086a implements TextWatcher {
        public C11086a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            PasswordVerificationView.this.m57875HM().m57894T(String.valueOf(charSequence));
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.password.PasswordVerificationView$b */
    /* loaded from: classes5.dex */
    public static final class C11087b implements InterfaceC28625j {
        C11087b() {
        }

        @Override // p586vt.InterfaceC28625j
        /* renamed from: lk */
        public void mo57172lk(AbstractC28627l abstractC28627l) {
            C21688c.b bVar = (C21688c.b) abstractC28627l;
            if (bVar != null && bVar.f132722a == 22) {
                PasswordVerificationView.this.m57875HM().m57893S();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.password.PasswordVerificationView$c */
    /* loaded from: classes5.dex */
    static final class C11088c extends AbstractC19075u implements InterfaceC18494a {
        C11088c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C11094b mo12V4() {
            return (C11094b) new C1802w0(PasswordVerificationView.this, new C27033d()).m9378a(C11094b.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.password.PasswordVerificationView$d */
    /* loaded from: classes5.dex */
    static final class C11089d extends AbstractC19075u implements InterfaceC18505l {
        C11089d() {
            super(1);
        }

        /* renamed from: a */
        public final void m57883a(C27030a c27030a) {
            PasswordVerificationView.m57869BM(PasswordVerificationView.this).f139351Q.setEnabled(c27030a.m139173c());
            PasswordVerificationView.this.m57879LM(c27030a.m139175e());
            if (c27030a.m139174d()) {
                PasswordVerificationView.this.mo46829Y();
            } else {
                PasswordVerificationView.this.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57883a((C27030a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.password.PasswordVerificationView$e */
    /* loaded from: classes5.dex */
    static final class C11090e extends AbstractC19075u implements InterfaceC18505l {
        C11090e() {
            super(1);
        }

        /* renamed from: a */
        public final void m57884a(AbstractC11093a abstractC11093a) {
            AbstractC19074t.m100208f(abstractC11093a, "event");
            if (!AbstractC19074t.m100204b(abstractC11093a, AbstractC11093a.c.f55880a)) {
                if (AbstractC19074t.m100204b(abstractC11093a, AbstractC11093a.a.f55878a)) {
                    PasswordVerificationView.this.m57875HM().m57895U(PasswordVerificationView.this.m57874GM());
                    return;
                }
                if (AbstractC19074t.m100204b(abstractC11093a, AbstractC11093a.b.f55879a)) {
                    PasswordVerificationView.this.m57878KM();
                } else if (AbstractC19074t.m100204b(abstractC11093a, AbstractC11093a.d.f55881a)) {
                    PasswordVerificationView.this.m77748tM().m77921R(true, true);
                } else if (AbstractC19074t.m100204b(abstractC11093a, AbstractC11093a.e.f55882a)) {
                    PasswordVerificationView.this.m77748tM().m77921R(false, true);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57884a((AbstractC11093a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.password.PasswordVerificationView$f */
    /* loaded from: classes5.dex */
    static final class C11091f implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f55876p;

        C11091f(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f55876p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f55876p;
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
            this.f55876p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.password.PasswordVerificationView$g */
    /* loaded from: classes5.dex */
    public static final class C11092g extends AbstractC19075u implements InterfaceC18494a {
        C11092g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57885a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57885a() {
            try {
                PasswordVerificationView.this.m57875HM().m57888M();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    public PasswordVerificationView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C11088c());
        this.f55869U0 = m129210a;
        this.f55870V0 = new C11087b();
    }

    /* renamed from: BM */
    public static final /* synthetic */ AbstractC30041t m57869BM(PasswordVerificationView passwordVerificationView) {
        return (AbstractC30041t) passwordVerificationView.m77756kM();
    }

    /* renamed from: GM */
    public final String m57874GM() {
        return String.valueOf(((AbstractC30041t) m77756kM()).f139353S.getEditText().getText());
    }

    /* renamed from: HM */
    public final C11094b m57875HM() {
        return (C11094b) this.f55869U0.getValue();
    }

    /* renamed from: IM */
    public static final void m57876IM(PasswordVerificationView passwordVerificationView, View view) {
        AbstractC19074t.m100208f(passwordVerificationView, "this$0");
        passwordVerificationView.m57875HM().m57892R(view.getId());
    }

    /* renamed from: JM */
    public static final void m57877JM(PasswordVerificationView passwordVerificationView, View view) {
        AbstractC19074t.m100208f(passwordVerificationView, "this$0");
        passwordVerificationView.m57875HM().m57892R(view.getId());
    }

    /* renamed from: KM */
    public final void m57878KM() {
        C24213q m126205a = C24213q.Companion.m126205a();
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C24213q.m126191v(m126205a, m92689tK, null, new C11092g(), 2, null);
    }

    /* renamed from: LM */
    public final void m57879LM(boolean z11) {
        EnumC17007i enumC17007i;
        String str;
        PasswordField passwordField = ((AbstractC30041t) m77756kM()).f139353S;
        if (z11) {
            enumC17007i = EnumC17007i.ERROR;
        } else {
            enumC17007i = EnumC17007i.NORMAL;
        }
        passwordField.setFieldState(enumC17007i);
        String str2 = "";
        if (!z11) {
            str = "";
        } else {
            str = m92652XI(AbstractC8020f0.str_zcloud_setup_enter_backup_password_error);
            AbstractC19074t.m100207e(str, "getString(...)");
        }
        passwordField.setErrorText(str);
        if (z11) {
            str2 = m92652XI(AbstractC8020f0.str_zcloud_setup_enter_backup_password_error);
            AbstractC19074t.m100207e(str2, "getString(...)");
        }
        passwordField.setHelperText(str2);
        passwordField.m91043B(z11);
        passwordField.m91044C(z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C21688c.Companion.m111854a().m111851x(this.f55870V0, "SYNC_MES");
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

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.backup_password_verification_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: nM */
    public void mo57729nM() {
        super.mo57729nM();
        C21688c.Companion.m111854a().m111849u(this.f55870V0, "SYNC_MES");
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        ((AbstractC30041t) m77756kM()).f139353S.getEditText().setText(m57875HM().m57889O());
        ((AbstractC30041t) m77756kM()).f139351Q.setOnClickListener(new View.OnClickListener() { // from class: u40.b
            public /* synthetic */ ViewOnClickListenerC27031b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordVerificationView.m57876IM(PasswordVerificationView.this, view);
            }
        });
        ((AbstractC30041t) m77756kM()).f139352R.setOnClickListener(new View.OnClickListener() { // from class: u40.c
            public /* synthetic */ ViewOnClickListenerC27032c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordVerificationView.m57877JM(PasswordVerificationView.this, view);
            }
        });
        ((AbstractC30041t) m77756kM()).f139353S.getEditText().addTextChangedListener(new C11086a());
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m57875HM().m57891Q().m9219j(m92657cJ(), new C11091f(new C11089d()));
        m57875HM().m57890P().m9219j(m92657cJ(), new C19965d(new C11090e()));
    }
}
