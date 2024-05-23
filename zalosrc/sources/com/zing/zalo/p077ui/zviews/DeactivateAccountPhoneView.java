package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.DeactivateAccountPhoneView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.phonenumbers.C16741a;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.lang.reflect.Field;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.C23055e5;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class DeactivateAccountPhoneView extends BaseZaloView implements InterfaceC0733x {

    /* renamed from: M0 */
    View f73088M0;

    /* renamed from: N0 */
    CustomEditText f73089N0;

    /* renamed from: O0 */
    CustomEditText f73090O0;

    /* renamed from: P0 */
    View f73091P0;

    /* renamed from: Q0 */
    View f73092Q0;

    /* renamed from: R0 */
    RobotoTextView f73093R0;

    /* renamed from: S0 */
    RobotoTextView f73094S0;

    /* renamed from: T0 */
    KeyEventCallbackC17462c f73095T0;

    /* renamed from: U0 */
    RobotoTextView f73096U0;

    /* renamed from: V0 */
    TextWatcher f73097V0 = new C14213b();

    /* renamed from: W0 */
    TextWatcher f73098W0 = new C14214c();

    /* renamed from: X0 */
    View.OnFocusChangeListener f73099X0 = new ViewOnFocusChangeListenerC14215d();

    /* renamed from: Y0 */
    boolean f73100Y0 = false;

    /* renamed from: Z0 */
    C0766k f73101Z0 = new C0766k();

    /* renamed from: a1 */
    final Object f73102a1 = new Object();

    /* renamed from: b1 */
    boolean f73103b1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPhoneView$a */
    /* loaded from: classes6.dex */
    class C14212a extends AbstractC18391a {
        C14212a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            boolean z11;
            DeactivateAccountPhoneView deactivateAccountPhoneView = DeactivateAccountPhoneView.this;
            View view = deactivateAccountPhoneView.f73088M0;
            if (view != null) {
                if (deactivateAccountPhoneView.f73089N0.getText().length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                view.setEnabled(z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPhoneView$b */
    /* loaded from: classes6.dex */
    class C14213b extends AbstractC18391a {
        C14213b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            DeactivateAccountPhoneView deactivateAccountPhoneView = DeactivateAccountPhoneView.this;
            deactivateAccountPhoneView.f73096U0.setText(String.format("%1$s/%2$s", Integer.valueOf(deactivateAccountPhoneView.f73090O0.length()), 200));
            DeactivateAccountPhoneView.this.m79228kM(true);
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            String charSequence2 = charSequence.toString();
            if (charSequence.length() > 200) {
                DeactivateAccountPhoneView.this.f73090O0.setText(charSequence2.substring(0, 200));
                DeactivateAccountPhoneView.this.f73090O0.setSelection(200);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPhoneView$c */
    /* loaded from: classes6.dex */
    class C14214c extends AbstractC18391a {
        C14214c() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i11;
            if (DeactivateAccountPhoneView.this.f73089N0.getText() == editable) {
                CustomEditText customEditText = DeactivateAccountPhoneView.this.f73089N0;
                if (customEditText.f83177K) {
                    customEditText.setBackgroundResource(AbstractC16803z.edt_active);
                    DeactivateAccountPhoneView.this.m79230tM("");
                    return;
                } else {
                    customEditText.setBackgroundResource(AbstractC16803z.edt_normal);
                    return;
                }
            }
            if (DeactivateAccountPhoneView.this.f73090O0.getText() == editable) {
                DeactivateAccountPhoneView deactivateAccountPhoneView = DeactivateAccountPhoneView.this;
                View view = deactivateAccountPhoneView.f73091P0;
                if (deactivateAccountPhoneView.f73090O0.f83177K) {
                    i11 = AbstractC16803z.edt_active;
                } else {
                    i11 = AbstractC16803z.edt_normal;
                }
                view.setBackgroundResource(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPhoneView$d */
    /* loaded from: classes6.dex */
    class ViewOnFocusChangeListenerC14215d implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC14215d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            int i11;
            int i12;
            DeactivateAccountPhoneView deactivateAccountPhoneView = DeactivateAccountPhoneView.this;
            CustomEditText customEditText = deactivateAccountPhoneView.f73089N0;
            if (view == customEditText) {
                if (z11) {
                    if (deactivateAccountPhoneView.f73103b1) {
                        i12 = AbstractC16803z.edt_error;
                    } else {
                        i12 = AbstractC16803z.edt_active;
                    }
                } else {
                    i12 = AbstractC16803z.edt_normal;
                }
                customEditText.setBackgroundResource(i12);
                return;
            }
            if (view == deactivateAccountPhoneView.f73090O0) {
                View view2 = deactivateAccountPhoneView.f73091P0;
                if (z11) {
                    i11 = AbstractC16803z.edt_active;
                } else {
                    i11 = AbstractC16803z.edt_normal;
                }
                view2.setBackgroundResource(i11);
                DeactivateAccountPhoneView.this.m79228kM(z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountPhoneView$e */
    /* loaded from: classes6.dex */
    public class C14216e implements InterfaceC20094a {
        C14216e() {
        }

        /* renamed from: d */
        public /* synthetic */ void m79232d() {
            try {
                KeyEventCallbackC17462c keyEventCallbackC17462c = DeactivateAccountPhoneView.this.f73095T0;
                if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                    DeactivateAccountPhoneView.this.f73095T0.dismiss();
                    DeactivateAccountPhoneView.this.f73095T0 = null;
                }
                AbstractC2379w.m12430d(DeactivateAccountPhoneView.this.f73089N0);
                Bundle bundle = new Bundle();
                bundle.putString("reason", DeactivateAccountPhoneView.this.f73090O0.getText().toString());
                if (DeactivateAccountPhoneView.this.f72421L0.m92650VI() != null) {
                    DeactivateAccountPhoneView.this.f72421L0.m92650VI().m92649TI().m93062f2(AbstractC6918a0.deactivate_container, DeactivateAccountPasswordView.class, bundle, 1, true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DeactivateAccountPhoneView", e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                synchronized (DeactivateAccountPhoneView.this.f73102a1) {
                    DeactivateAccountPhoneView deactivateAccountPhoneView = DeactivateAccountPhoneView.this;
                    deactivateAccountPhoneView.f73100Y0 = false;
                    deactivateAccountPhoneView.f72421L0.mo49315c4();
                }
                DeactivateAccountPhoneView.this.m79230tM(AbstractC23161o1.m119318c(c20096c.m104491c(), ""));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            synchronized (DeactivateAccountPhoneView.this.f73102a1) {
                DeactivateAccountPhoneView deactivateAccountPhoneView = DeactivateAccountPhoneView.this;
                deactivateAccountPhoneView.f73100Y0 = false;
                deactivateAccountPhoneView.f72421L0.mo49315c4();
            }
            if (DeactivateAccountPhoneView.this.f72421L0.m92676n2() != null) {
                DeactivateAccountPhoneView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.db
                    public /* synthetic */ RunnableC15545db() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        DeactivateAccountPhoneView.C14216e.this.m79232d();
                    }
                });
            }
        }
    }

    /* renamed from: mM */
    public static /* synthetic */ void m79221mM() {
        try {
            AbstractC23056e6.m118276b("123", false, false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeactivateAccountPhoneView", e11);
        }
    }

    /* renamed from: nM */
    public /* synthetic */ void m79222nM() {
        AbstractC2379w.m12432f(this.f73089N0);
    }

    /* renamed from: oM */
    public /* synthetic */ boolean m79223oM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 6) {
            m79229lM(this.f73089N0.getText().toString().trim());
            return false;
        }
        return false;
    }

    /* renamed from: pM */
    public /* synthetic */ boolean m79224pM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 6) {
            m79229lM(this.f73089N0.getText().toString().trim());
            return false;
        }
        return false;
    }

    /* renamed from: qM */
    public /* synthetic */ void m79225qM(View view) {
        this.f73090O0.setText("");
        this.f73090O0.setSelection(0);
        m79228kM(true);
    }

    /* renamed from: rM */
    public /* synthetic */ void m79226rM(View view) {
        m79229lM(this.f73089N0.getText().toString().trim());
    }

    /* renamed from: sM */
    public /* synthetic */ void m79227sM(String str) {
        if (this.f73093R0 == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f73093R0.setText(str.replaceAll("\n", ""));
            this.f73093R0.setVisibility(0);
            this.f73089N0.setBackgroundResource(AbstractC16803z.edt_error);
            this.f73103b1 = true;
            return;
        }
        this.f73093R0.setVisibility(8);
        this.f73103b1 = false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.cb
            @Override // java.lang.Runnable
            public final void run() {
                DeactivateAccountPhoneView.m79221mM();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f72421L0.m92676n2().mo35554O(18);
        return layoutInflater.inflate(AbstractC7409c0.deactivate_input_phone_view, viewGroup, false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        AbstractC2379w.m12430d(this.f73089N0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f73095T0;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f73095T0.cancel();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.bb
                public /* synthetic */ RunnableC15468bb() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DeactivateAccountPhoneView.this.m79222nM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        this.f73089N0 = (CustomEditText) view.findViewById(AbstractC6918a0.editText_PhoneNumber);
        this.f73090O0 = (CustomEditText) view.findViewById(AbstractC6918a0.edt_reason);
        this.f73093R0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvError1);
        this.f73094S0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvError2);
        this.f73092Q0 = view.findViewById(AbstractC6918a0.btn_clear_reason);
        this.f73091P0 = view.findViewById(AbstractC6918a0.layout_edt_reason);
        this.f73096U0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_count_reason);
        this.f73089N0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.wa
            public /* synthetic */ C16295wa() {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m79223oM;
                m79223oM = DeactivateAccountPhoneView.this.m79223oM(textView, i11, keyEvent);
                return m79223oM;
            }
        });
        this.f73089N0.addTextChangedListener(new C14212a());
        this.f73090O0.setScroller(new Scroller(this.f72421L0.m92648SI()));
        this.f73090O0.setVerticalScrollBarEnabled(true);
        this.f73090O0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.xa
            public /* synthetic */ C16332xa() {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m79224pM;
                m79224pM = DeactivateAccountPhoneView.this.m79224pM(textView, i11, keyEvent);
                return m79224pM;
            }
        });
        this.f73092Q0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ya
            public /* synthetic */ ViewOnClickListenerC16369ya() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeactivateAccountPhoneView.this.m79225qM(view2);
            }
        });
        this.f73089N0.addTextChangedListener(this.f73098W0);
        this.f73090O0.addTextChangedListener(this.f73098W0);
        this.f73089N0.setFocusChangeListener(this.f73099X0);
        this.f73090O0.setFocusChangeListener(this.f73099X0);
        this.f73090O0.addTextChangedListener(this.f73097V0);
        this.f73089N0.setRightDrawable(null);
        CustomEditText customEditText = this.f73089N0;
        customEditText.setClearDrawable(AbstractC23136l9.m118665N(customEditText.getContext(), AbstractC16803z.icn_forgotpass_delete));
        this.f73090O0.setForceHideClearBtn(true);
        this.f73090O0.setRightDrawable(null);
        this.f73090O0.setClearDrawable(null);
        this.f73096U0.setText(String.format("%1$s/%2$s", 0, 200));
        m79230tM("");
        View findViewById = view.findViewById(AbstractC6918a0.btn_next);
        this.f73088M0 = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.za
            public /* synthetic */ ViewOnClickListenerC16406za() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeactivateAccountPhoneView.this.m79226rM(view2);
            }
        });
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.f73089N0, Integer.valueOf(AbstractC16803z.chat_bar_text_cursor));
            declaredField.set(this.f73090O0, Integer.valueOf(AbstractC16803z.chat_bar_text_cursor));
        } catch (Exception unused) {
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DeactivateAccountPhoneView";
    }

    /* renamed from: kM */
    void m79228kM(boolean z11) {
        if (this.f73090O0.length() > 0 && z11) {
            this.f73092Q0.setVisibility(0);
        } else {
            this.f73092Q0.setVisibility(8);
        }
    }

    /* renamed from: lM */
    void m79229lM(String str) {
        m79230tM("");
        synchronized (this.f73102a1) {
            try {
                if (this.f73100Y0) {
                    this.f72421L0.mo46829Y();
                    return;
                }
                if (C23055e5.m118271f()) {
                    String m89307S = C16741a.m89307S(str);
                    if (!TextUtils.isEmpty(m89307S) && m89307S.length() >= 6) {
                        C14216e c14216e = new C14216e();
                        synchronized (this.f73102a1) {
                            this.f73100Y0 = true;
                            this.f72421L0.mo46829Y();
                        }
                        this.f73101Z0.mo1704o8(c14216e);
                        this.f73101Z0.mo1402C5(str, AbstractC23309i.m121704a5(), AbstractC23309i.m121477U0());
                    } else {
                        m79230tM(AbstractC23161o1.m119318c(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, ""));
                        return;
                    }
                } else {
                    ToastUtils.m89262j();
                }
                AbstractC23647d.m123897g("37172");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: tM */
    void m79230tM(String str) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ab

            /* renamed from: q */
            public final /* synthetic */ String f79800q;

            public /* synthetic */ RunnableC15431ab(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DeactivateAccountPhoneView.this.m79227sM(r2);
            }
        });
    }
}
