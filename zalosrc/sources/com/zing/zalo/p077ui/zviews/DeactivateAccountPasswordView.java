package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.DeactivateAccountPasswordView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.lang.reflect.Field;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import mm0.AbstractC23353h;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public class DeactivateAccountPasswordView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    View f73067P0;

    /* renamed from: Q0 */
    CustomEditText f73068Q0;

    /* renamed from: R0 */
    View f73069R0;

    /* renamed from: S0 */
    TextView f73070S0;

    /* renamed from: T0 */
    TextView f73071T0;

    /* renamed from: U0 */
    KeyEventCallbackC17462c f73072U0;

    /* renamed from: W0 */
    String f73074W0;

    /* renamed from: V0 */
    boolean f73073V0 = false;

    /* renamed from: X0 */
    TextWatcher f73075X0 = new C14207b();

    /* renamed from: Y0 */
    View.OnFocusChangeListener f73076Y0 = new ViewOnFocusChangeListenerC14208c();

    /* renamed from: Z0 */
    boolean f73077Z0 = false;

    /* renamed from: a1 */
    C0766k f73078a1 = new C0766k();

    /* renamed from: b1 */
    InterfaceC20094a f73079b1 = new C14210e();

    /* renamed from: c1 */
    final Object f73080c1 = new Object();

    /* renamed from: d1 */
    boolean f73081d1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPasswordView$a */
    /* loaded from: classes6.dex */
    class C14206a extends AbstractC18391a {
        C14206a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            boolean z11;
            DeactivateAccountPasswordView deactivateAccountPasswordView = DeactivateAccountPasswordView.this;
            View view = deactivateAccountPasswordView.f73069R0;
            if (view != null) {
                if (deactivateAccountPasswordView.f73068Q0.getText().length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                view.setEnabled(z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPasswordView$b */
    /* loaded from: classes6.dex */
    class C14207b extends AbstractC18391a {
        C14207b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (DeactivateAccountPasswordView.this.f73068Q0.getText() == editable) {
                CustomEditText customEditText = DeactivateAccountPasswordView.this.f73068Q0;
                if (customEditText.f83177K) {
                    customEditText.setBackgroundResource(AbstractC16803z.edt_active);
                    DeactivateAccountPasswordView.this.m79207qM("");
                } else {
                    customEditText.setBackgroundResource(AbstractC16803z.edt_normal);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPasswordView$c */
    /* loaded from: classes6.dex */
    class ViewOnFocusChangeListenerC14208c implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC14208c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            int i11;
            DeactivateAccountPasswordView deactivateAccountPasswordView = DeactivateAccountPasswordView.this;
            CustomEditText customEditText = deactivateAccountPasswordView.f73068Q0;
            if (view == customEditText) {
                if (z11) {
                    if (deactivateAccountPasswordView.f73081d1) {
                        i11 = AbstractC16803z.edt_error;
                    } else {
                        i11 = AbstractC16803z.edt_active;
                    }
                } else {
                    i11 = AbstractC16803z.edt_normal;
                }
                customEditText.setBackgroundResource(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPasswordView$d */
    /* loaded from: classes6.dex */
    public class C14209d extends InterfaceC17463d.b {
        C14209d() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.b, com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            super.mo605K8(interfaceC17463d, i11);
            AbstractC23647d.m123897g("37175");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPasswordView$e */
    /* loaded from: classes6.dex */
    public class C14210e implements InterfaceC20094a {
        C14210e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m79211f() {
            if (!DeactivateAccountPasswordView.this.f72421L0.m92676n2().isFinishing() && !DeactivateAccountPasswordView.this.f72421L0.m92681pJ()) {
                try {
                    KeyEventCallbackC17462c keyEventCallbackC17462c = DeactivateAccountPasswordView.this.f73072U0;
                    if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                        DeactivateAccountPasswordView.this.f73072U0.dismiss();
                        DeactivateAccountPasswordView.this.f73072U0 = null;
                    }
                    if (DeactivateAccountPasswordView.this.f72421L0.m92650VI() != null) {
                        DeactivateAccountPasswordView.this.f72421L0.m92650VI().m92662fJ().m93069k2(DeactivateAccountSuccessView.class, null, 1, true);
                        DeactivateAccountPasswordView.this.f72421L0.m92650VI().finish();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DeactivateAccountPasswordView", e11);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m79212g() {
            AbstractC2379w.m12432f(DeactivateAccountPasswordView.this.f73068Q0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m79213h(C20096c c20096c) {
            try {
                DeactivateAccountPasswordView.this.f73068Q0.setText("");
                KeyEventCallbackC17462c keyEventCallbackC17462c = DeactivateAccountPasswordView.this.f73072U0;
                if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                    DeactivateAccountPasswordView.this.f73072U0.dismiss();
                    DeactivateAccountPasswordView.this.f73072U0 = null;
                }
                if (c20096c.m104491c() == 2017) {
                    DeactivateAccountPasswordView.this.m79207qM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_account_wrong_password_error));
                } else if (c20096c.m104491c() == 2031) {
                    DeactivateAccountPasswordView.this.m79207qM(AbstractC23136l9.m118743r0(AbstractC8020f0.f43840x86aa994));
                } else if (c20096c.m104491c() == 112) {
                    DeactivateAccountPasswordView.this.m79207qM(AbstractC23136l9.m118743r0(AbstractC8020f0.deactivate_account_activity_error_unknown));
                } else {
                    ToastUtils.m89263k(c20096c);
                }
                DeactivateAccountPasswordView.this.f73068Q0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.va
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeactivateAccountPasswordView.C14210e.this.m79212g();
                    }
                }, 100L);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DeactivateAccountPasswordView", e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            synchronized (DeactivateAccountPasswordView.this.f73080c1) {
                DeactivateAccountPasswordView deactivateAccountPasswordView = DeactivateAccountPasswordView.this;
                deactivateAccountPasswordView.f73077Z0 = false;
                deactivateAccountPasswordView.f72421L0.mo49315c4();
            }
            if (DeactivateAccountPasswordView.this.f72421L0.m92676n2().isFinishing()) {
                return;
            }
            DeactivateAccountPasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ta
                @Override // java.lang.Runnable
                public final void run() {
                    DeactivateAccountPasswordView.C14210e.this.m79213h(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            synchronized (DeactivateAccountPasswordView.this.f73080c1) {
                DeactivateAccountPasswordView deactivateAccountPasswordView = DeactivateAccountPasswordView.this;
                deactivateAccountPasswordView.f73077Z0 = false;
                deactivateAccountPasswordView.f72421L0.mo49315c4();
            }
            if (!DeactivateAccountPasswordView.this.f72421L0.m92676n2().isFinishing() && !DeactivateAccountPasswordView.this.f72421L0.m92681pJ()) {
                DeactivateAccountPasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ua
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeactivateAccountPasswordView.C14210e.this.m79211f();
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPasswordView$f */
    /* loaded from: classes6.dex */
    class C14211f extends C10866e {
        public C14211f(InterfaceC27218a interfaceC27218a, int i11, int i12) {
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            CustomEditText customEditText = DeactivateAccountPasswordView.this.f73068Q0;
            if (customEditText != null) {
                AbstractC2379w.m12430d(customEditText);
            }
            if (DeactivateAccountPasswordView.this.m92676n2() != null) {
                DeactivateAccountPasswordView.this.m92676n2().mo35573l4(PolicyZView.class, null, 1, true);
            }
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
            if (this.f54861x) {
                textPaint.bgColor = C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.ItemBackgroundSelectedColor);
            } else {
                textPaint.bgColor = AbstractC23136l9.m118641B(this.f54823A.getContext(), AbstractC16801x.transparent);
            }
            textPaint.setColor(C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m79201mM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m79206lM(this.f73068Q0.getText().toString(), this.f73074W0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m79202nM() {
        AbstractC2379w.m12432f(this.f73068Q0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ boolean m79203oM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 6) {
            AbstractC2379w.m12430d(this.f73068Q0);
            m79205kM();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m79204pM(String str) {
        if (this.f73071T0 != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f73071T0.setText(str);
                this.f73071T0.setVisibility(0);
                this.f73068Q0.setBackgroundResource(AbstractC16803z.edt_error);
                this.f73081d1 = true;
                return;
            }
            this.f73071T0.setVisibility(8);
            this.f73081d1 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (this.f72421L0.m92642L3() != null && this.f72421L0.m92642L3().containsKey("reason")) {
            this.f73074W0 = this.f72421L0.m92642L3().getString("reason");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.deactivate_account_input_password_view, viewGroup, false);
        this.f73067P0 = inflate;
        this.f73071T0 = (TextView) inflate.findViewById(AbstractC6918a0.tvError);
        return this.f73067P0;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (this.f72421L0.m92650VI() != null) {
            if (z11) {
                this.f72421L0.m92650VI().m92649TI().m93094z(false);
            } else {
                this.f88756W = 0;
                finish();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Ps */
    public void mo62806Ps() {
        if (this.f72421L0.m92650VI() != null) {
            this.f72421L0.m92650VI().m92649TI().m93094z(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Tf */
    public View mo62809Tf() {
        ZaloView zaloView;
        if (this.f72421L0.m92650VI() != null) {
            zaloView = this.f72421L0.m92650VI().m92649TI().m93004H0();
        } else {
            zaloView = null;
        }
        if (zaloView == null) {
            return null;
        }
        return zaloView.m92656bJ();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f72421L0.mo49315c4();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f73072U0;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f73072U0.dismiss();
            this.f73072U0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.pa
                @Override // java.lang.Runnable
                public final void run() {
                    DeactivateAccountPasswordView.this.m79202nM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        CustomEditText customEditText = (CustomEditText) view.findViewById(AbstractC6918a0.editText_Password);
        this.f73068Q0 = customEditText;
        customEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.sa
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m79203oM;
                m79203oM = DeactivateAccountPasswordView.this.m79203oM(textView, i11, keyEvent);
                return m79203oM;
            }
        });
        this.f73068Q0.addTextChangedListener(new C14206a());
        this.f73068Q0.addTextChangedListener(this.f73075X0);
        this.f73068Q0.setFocusChangeListener(this.f73076Y0);
        this.f73068Q0.setRightDrawable(null);
        CustomEditText customEditText2 = this.f73068Q0;
        customEditText2.setClearDrawable(AbstractC23136l9.m118665N(customEditText2.getContext(), AbstractC16803z.icn_forgotpass_delete));
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tv_show_hide_password);
        this.f73070S0 = textView;
        textView.setOnClickListener(this);
        View findViewById = view.findViewById(AbstractC6918a0.btn_deactivate_account);
        this.f73069R0 = findViewById;
        findViewById.setOnClickListener(this);
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_consent);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.policy_delete_account);
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.consent_delete_account, m118743r0);
        SpannableString spannableString = new SpannableString(m118746s0);
        int indexOf = m118746s0.indexOf(m118743r0);
        if (indexOf > 0) {
            spannableString.setSpan(new C14211f(m92676n2(), indexOf, m118746s0.length()), indexOf, m118746s0.length(), 33);
        }
        robotoTextView.setMovementMethod(CustomMovementMethod.m56305e());
        robotoTextView.setText(spannableString);
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.f73068Q0, Integer.valueOf(AbstractC16803z.chat_bar_text_cursor));
        } catch (Exception unused) {
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DeactivateAccountPasswordView";
    }

    /* renamed from: kM */
    void m79205kM() {
        String str;
        TextView textView = this.f73071T0;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.f73068Q0.getText() != null) {
            str = this.f73068Q0.getText().toString();
        } else {
            str = "";
        }
        if (str.length() == 0) {
            m79207qM(AbstractC23136l9.m118743r0(AbstractC8020f0.deactivate_account_activity_error_password_empty));
            this.f73068Q0.requestFocus();
            return;
        }
        if (str.length() < 6) {
            m79207qM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_account_wrong_password_error));
            return;
        }
        this.f72421L0.mo49315c4();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f73072U0;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f73072U0.dismiss();
            this.f73072U0 = null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(7).m43162k(this.f72421L0.m92651WI().getString(AbstractC8020f0.str_delete_account_dialog_confirm_msg, AbstractC23304d.f113368c0.f42437s)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_account_dialog_confirm_no), new C14209d()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_account_dialog_confirm_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ra
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                DeactivateAccountPasswordView.this.m79201mM(interfaceC17463d, i11);
            }
        });
        C8009j m43152a = aVar.m43152a();
        this.f73072U0 = m43152a;
        m43152a.mo13822K();
    }

    /* renamed from: lM */
    void m79206lM(String str, String str2) {
        synchronized (this.f73080c1) {
            try {
                if (this.f73077Z0) {
                    this.f72421L0.mo46829Y();
                    return;
                }
                if (C23055e5.m118271f()) {
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    if (contactProfile == null) {
                        contactProfile = new ContactProfile(AbstractC23309i.m121675Zd());
                    }
                    String m118276b = AbstractC23056e6.m118276b(contactProfile.f42455y, false, false);
                    if (!TextUtils.isEmpty(m118276b) && !m118276b.equals(AbstractC23056e6.f112062a)) {
                        String m122788d = AbstractC23352g.m122788d(CoreUtility.f89225a + m118276b);
                        String m121704a5 = AbstractC23309i.m121704a5();
                        String m122790b = AbstractC23353h.m122790b(m122788d, str);
                        synchronized (this.f73080c1) {
                            this.f73077Z0 = true;
                            this.f72421L0.mo46829Y();
                        }
                        this.f73078a1.mo1704o8(this.f73079b1);
                        this.f73078a1.m1861o(m118276b, m121704a5, m122790b, str2);
                    } else {
                        m79207qM(AbstractC23161o1.m119318c(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, ""));
                        return;
                    }
                } else {
                    m79207qM(AbstractC23136l9.m118743r0(AbstractC8020f0.deactivate_account_activity_error_network));
                }
                AbstractC23647d.m123897g("37174");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tv_show_hide_password) {
            boolean z11 = !this.f73073V0;
            this.f73073V0 = z11;
            if (z11) {
                this.f73068Q0.setInputType(145);
                CustomEditText customEditText = this.f73068Q0;
                customEditText.setSelection(customEditText.getText().length());
                this.f73070S0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.startup_hide_password));
                return;
            }
            this.f73068Q0.setInputType(129);
            CustomEditText customEditText2 = this.f73068Q0;
            customEditText2.setSelection(customEditText2.getText().length());
            this.f73070S0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.startup_show_password));
            return;
        }
        if (id2 == AbstractC6918a0.btn_deactivate_account) {
            AbstractC2379w.m12430d(this.f73068Q0);
            m79205kM();
            AbstractC23647d.m123897g("37173");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: qG */
    public View mo62819qG() {
        ZaloView zaloView;
        if (this.f72421L0.m92650VI() != null) {
            zaloView = this.f72421L0.m92650VI().m92649TI().m93012K0();
        } else {
            zaloView = null;
        }
        if (zaloView == null || !zaloView.equals(this)) {
            return null;
        }
        return this.f73067P0;
    }

    /* renamed from: qM */
    void m79207qM(final String str) {
        if (this.f72421L0.m92676n2() != null && !this.f72421L0.m92676n2().isFinishing()) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.qa
                @Override // java.lang.Runnable
                public final void run() {
                    DeactivateAccountPasswordView.this.m79204pM(str);
                }
            });
        }
    }
}
