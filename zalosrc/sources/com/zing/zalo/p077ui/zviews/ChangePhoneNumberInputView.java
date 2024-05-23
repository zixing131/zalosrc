package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.ChangePhoneNumberInputView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.phonenumbers.C16741a;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.C23055e5;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;

/* loaded from: classes6.dex */
public class ChangePhoneNumberInputView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    View f72659P0;

    /* renamed from: Q0 */
    EditText f72660Q0;

    /* renamed from: R0 */
    KeyEventCallbackC17462c f72661R0;

    /* renamed from: S0 */
    View f72662S0;

    /* renamed from: T0 */
    TextView f72663T0;

    /* renamed from: U0 */
    String f72664U0 = "";

    /* renamed from: V0 */
    int f72665V0 = 1;

    /* renamed from: W0 */
    boolean f72666W0 = false;

    /* renamed from: X0 */
    boolean f72667X0 = false;

    /* renamed from: Y0 */
    String f72668Y0 = "";

    /* renamed from: com.zing.zalo.ui.zviews.ChangePhoneNumberInputView$a */
    /* loaded from: classes6.dex */
    class C14145a extends AbstractC18391a {
        C14145a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            boolean z11;
            ChangePhoneNumberInputView changePhoneNumberInputView = ChangePhoneNumberInputView.this;
            View view = changePhoneNumberInputView.f72659P0;
            if (view != null) {
                if (changePhoneNumberInputView.f72660Q0.getText().length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                view.setEnabled(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ChangePhoneNumberInputView$b */
    /* loaded from: classes6.dex */
    public class C14146b implements InterfaceC20094a {
        C14146b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m78765e() {
            try {
                ChangePhoneNumberInputView.this.m78761tM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m78766f(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("STR_EXTRA_NEW_PHONE_NUMBER", ChangePhoneNumberInputView.this.f72664U0);
            bundle.putInt("source_type_change_phone", ChangePhoneNumberInputView.this.f72665V0);
            bundle.putString("EXTRA_INFO_ACCOUNT", str);
            if (ChangePhoneNumberInputView.this.f72421L0.m92650VI() != null && ChangePhoneNumberInputView.this.f72421L0.m92650VI().m92649TI() != null) {
                ChangePhoneNumberInputView.this.f72421L0.m92650VI().m92649TI().m93062f2(AbstractC6918a0.deactivate_container, ChangePhoneAccountExistView.class, bundle, 0, true);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    boolean z11 = true;
                    if (c20096c.m104491c() == 2052) {
                        ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_phone_number_linked, Integer.valueOf(c20096c.m104491c())));
                    } else if (c20096c.m104491c() == 2049) {
                        ChangePhoneNumberInputView.this.m78759rM();
                    } else if (c20096c.m104491c() == 2013) {
                        final String m104490b = c20096c.m104490b();
                        if (TextUtils.isEmpty(m104490b)) {
                            ToastUtils.m89263k(c20096c);
                            ChangePhoneNumberInputView changePhoneNumberInputView = ChangePhoneNumberInputView.this;
                            if (c20096c.m104491c() != 2012) {
                                z11 = false;
                            }
                            changePhoneNumberInputView.f72666W0 = z11;
                        } else if (ChangePhoneNumberInputView.this.m92676n2() != null) {
                            ChangePhoneNumberInputView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.z5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChangePhoneNumberInputView.C14146b.this.m78766f(m104490b);
                                }
                            });
                        }
                    } else {
                        ToastUtils.m89263k(c20096c);
                        ChangePhoneNumberInputView changePhoneNumberInputView2 = ChangePhoneNumberInputView.this;
                        if (c20096c.m104491c() != 2012) {
                            z11 = false;
                        }
                        changePhoneNumberInputView2.f72666W0 = z11;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ChangePhoneNumberInputView changePhoneNumberInputView3 = ChangePhoneNumberInputView.this;
                changePhoneNumberInputView3.f72667X0 = false;
                changePhoneNumberInputView3.f72421L0.mo49315c4();
            } catch (Throwable th2) {
                ChangePhoneNumberInputView changePhoneNumberInputView4 = ChangePhoneNumberInputView.this;
                changePhoneNumberInputView4.f72667X0 = false;
                changePhoneNumberInputView4.f72421L0.mo49315c4();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (((JSONObject) obj).optInt("error_code", -999) == 0) {
                        if (ChangePhoneNumberInputView.this.f72421L0.m92676n2() != null) {
                            ChangePhoneNumberInputView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.y5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChangePhoneNumberInputView.C14146b.this.m78765e();
                                }
                            });
                        }
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.error_message));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ChangePhoneNumberInputView changePhoneNumberInputView = ChangePhoneNumberInputView.this;
                changePhoneNumberInputView.f72667X0 = false;
                changePhoneNumberInputView.f72421L0.mo49315c4();
            } catch (Throwable th2) {
                ChangePhoneNumberInputView changePhoneNumberInputView2 = ChangePhoneNumberInputView.this;
                changePhoneNumberInputView2.f72667X0 = false;
                changePhoneNumberInputView2.f72421L0.mo49315c4();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m78753mM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m78758lM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m78754nM() {
        AbstractC23136l9.m118693a1(this.f72660Q0, AbstractC16803z.edt_active);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ boolean m78755oM(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f72660Q0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.w5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChangePhoneNumberInputView.this.m78754nM();
                    }
                }, 200L);
                return false;
            }
            return false;
        }
        AbstractC23136l9.m118693a1(this.f72660Q0, AbstractC16803z.edt_normal);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ boolean m78756pM(TextView textView, int i11, KeyEvent keyEvent) {
        String str;
        if (i11 == 6) {
            AbstractC2379w.m12430d(this.f72660Q0);
            EditText editText = this.f72660Q0;
            if (editText != null && editText.getText() != null) {
                str = this.f72660Q0.getText().toString();
            } else {
                str = "";
            }
            String m118281g = AbstractC23056e6.m118281g(str, AbstractC23309i.m121742b5());
            if (!TextUtils.isEmpty(m118281g) && !m118281g.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                this.f72421L0.showDialog(1);
                return false;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m78757qM(Bundle bundle) {
        try {
            this.f72421L0.m92676n2().mo35579p().m93069k2(ChangePhoneNumberSuccessView.class, bundle, 1, true);
            if (this.f72421L0.m92650VI() != null) {
                this.f72421L0.m92650VI().finish();
            } else {
                this.f72421L0.finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        String str;
        if (i11 == 1) {
            EditText editText = this.f72660Q0;
            String str2 = "";
            if (editText == null || editText.getText() == null) {
                str = "";
            } else {
                str = this.f72660Q0.getText().toString();
            }
            String m118282h = AbstractC23056e6.m118282h(str, AbstractC23309i.m121742b5(), false);
            if (TextUtils.isEmpty(m118282h) || m118282h.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                EditText editText2 = this.f72660Q0;
                if (editText2 != null && editText2.getText() != null) {
                    str2 = this.f72660Q0.getText().toString();
                }
                m118282h = str2;
            }
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_des_popup_change_phone, m118282h);
            int indexOf = m118746s0.indexOf(m118282h);
            SpannableString spannableString = new SpannableString(m118746s0);
            if (indexOf >= 0) {
                spannableString.setSpan(new StyleSpan(1), indexOf, m118282h.length() + indexOf, 33);
            }
            C8009j.a aVar = new C8009j.a(m92648SI());
            aVar.m43159h(4).m43162k(spannableString).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_agree), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.t5
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ChangePhoneNumberInputView.this.m78753mM(interfaceC17463d, i12);
                }
            });
            this.f72661R0 = aVar.m43152a();
        }
        return this.f72661R0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f72421L0.m92676n2().mo35554O(18);
        View inflate = layoutInflater.inflate(AbstractC7409c0.change_phone_number_input_view, viewGroup, false);
        this.f72662S0 = inflate;
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        AbstractC2379w.m12430d(this.f72660Q0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f72661R0;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f72661R0.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        EditText editText;
        super.mo37122XJ(z11, z12);
        if (z11 && !z12 && (editText = this.f72660Q0) != null) {
            AbstractC2379w.m12432f(editText);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f72665V0 = m92642L3.getInt("source_type_change_phone", 1);
        }
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tvCountryName);
        this.f72663T0 = textView;
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AbstractC23136l9.m118665N(textView.getContext(), AbstractC16803z.ic_direction_triangle_down), (Drawable) null);
        this.f72663T0.setOnClickListener(this);
        this.f72663T0.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.u5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m78755oM;
                m78755oM = ChangePhoneNumberInputView.this.m78755oM(view2, motionEvent);
                return m78755oM;
            }
        });
        EditText editText = (EditText) view.findViewById(AbstractC6918a0.etPhoneNumber);
        this.f72660Q0 = editText;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.v5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i11, KeyEvent keyEvent) {
                boolean m78756pM;
                m78756pM = ChangePhoneNumberInputView.this.m78756pM(textView2, i11, keyEvent);
                return m78756pM;
            }
        });
        this.f72660Q0.addTextChangedListener(new C14145a());
        this.f72659P0 = view.findViewById(AbstractC6918a0.btn_next);
        EditText editText2 = this.f72660Q0;
        if (editText2 != null && editText2.getText() != null) {
            str = this.f72660Q0.getText().toString();
        } else {
            str = "";
        }
        this.f72659P0.setEnabled(!TextUtils.isEmpty(str));
        this.f72659P0.setOnClickListener(this);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ChangePhoneNumberInputView";
    }

    /* renamed from: lM */
    void m78758lM() {
        String str;
        if (!C23055e5.m118272g(true) || this.f72667X0) {
            return;
        }
        EditText editText = this.f72660Q0;
        if (editText == null || editText.getText() == null) {
            str = "";
        } else {
            str = this.f72660Q0.getText().toString();
        }
        this.f72664U0 = str;
        String m121742b5 = AbstractC23309i.m121742b5();
        if (!TextUtils.isEmpty(this.f72664U0) && !TextUtils.isEmpty(m121742b5)) {
            String m118277c = AbstractC23056e6.m118277c(this.f72664U0);
            if (!TextUtils.isEmpty(m118277c) && !m118277c.equals(AbstractC23056e6.f112062a)) {
                if (this.f72666W0 && !TextUtils.isEmpty(this.f72668Y0) && !this.f72668Y0.equals(m118277c)) {
                    this.f72666W0 = false;
                }
                this.f72668Y0 = m118277c;
                if (this.f72666W0) {
                    ToastUtils.showMess(AbstractC23161o1.m119318c(2012, ""));
                    return;
                }
                this.f72421L0.mo46829Y();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14146b());
                this.f72667X0 = true;
                c0766k.mo1707p3(m121742b5, m118277c, this.f72665V0, true);
                return;
            }
            ToastUtils.showMess(AbstractC23161o1.m119318c(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, ""));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1576 && i12 == -1 && intent != null) {
            try {
                AbstractC23309i.m122624yp(intent.getStringExtra("EXTRA_RESULT_ISO_COUNTRY_CODE"));
                m78762uM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tvCountryName) {
            EditText editText = this.f72660Q0;
            if (editText != null) {
                AbstractC2379w.m12430d(editText);
            }
            if (this.f72421L0.m92676n2() != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("EXTRA_DISCARD", true);
                this.f72421L0.m92676n2().mo35579p().m93066i2(CountryListView.class, bundle, 1576, 1, true);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_next) {
            AbstractC2379w.m12430d(this.f72660Q0);
            EditText editText2 = this.f72660Q0;
            String str2 = "";
            if (editText2 == null || editText2.getText() == null) {
                str = "";
            } else {
                str = this.f72660Q0.getText().toString();
            }
            String m118281g = AbstractC23056e6.m118281g(str, AbstractC23309i.m121742b5());
            if (!TextUtils.isEmpty(m118281g) && !m118281g.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                this.f72421L0.showDialog(1);
                return;
            }
            EditText editText3 = this.f72660Q0;
            if (editText3 != null && editText3.getText() != null) {
                str2 = this.f72660Q0.getText().toString();
            }
            String m89307S = C16741a.m89307S(str2.toString().trim());
            if (!TextUtils.isEmpty(m89307S) && m89307S.length() >= 6) {
                this.f72421L0.showDialog(1);
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        ChangePhoneAccountExistView.f72648Y0 = 0;
        try {
            m78762uM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    void m78759rM() {
        String str;
        String m118277c = AbstractC23056e6.m118277c(this.f72664U0);
        if (TextUtils.isEmpty(m118277c) || m118277c.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
            m118277c = this.f72664U0;
        }
        if (!TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
            str = AbstractC23056e6.m118281g(AbstractC23304d.f113394i0, AbstractC23309i.m121742b5());
            if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                str = AbstractC23304d.f113394i0;
            }
        } else {
            str = "";
        }
        String m118281g = AbstractC23056e6.m118281g(this.f72664U0, AbstractC23309i.m121742b5());
        if (TextUtils.isEmpty(m118281g) || m118281g.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
            m118281g = this.f72664U0;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("STR_EXTRA_NEW_PHONE_NUMBER", m118281g);
        bundle.putString("STR_EXTRA_OLD_PHONE_NUMBER", str);
        bundle.putBoolean("STR_EXTRA_CHANGE_BYPASS_WAY", true);
        bundle.putInt("source_type_change_phone", this.f72665V0);
        m78760sM(m118277c);
        AbstractC23309i.m121541Vr(0L);
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35579p() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.x5
                @Override // java.lang.Runnable
                public final void run() {
                    ChangePhoneNumberInputView.this.m78757qM(bundle);
                }
            });
        }
    }

    /* renamed from: sM */
    void m78760sM(String str) {
        try {
            AbstractC23304d.f113394i0 = str;
            AbstractC23304d.f113414n0 = 123219;
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            String str2 = AbstractC23304d.f113394i0;
            contactProfile.f42455y = str2;
            AbstractC23309i.m121396Ru(str2);
            AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    void m78761tM() {
        String str;
        try {
            EditText editText = this.f72660Q0;
            if (editText != null && editText.getText() != null) {
                str = this.f72660Q0.getText().toString();
            } else {
                str = "";
            }
            this.f72664U0 = str;
            Bundle bundle = new Bundle();
            bundle.putString("STR_EXTRA_NEW_PHONE_NUMBER", this.f72664U0);
            bundle.putInt("source_type_change_phone", this.f72665V0);
            if (this.f72421L0.m92650VI() != null && this.f72421L0.m92650VI().m92649TI() != null) {
                this.f72421L0.m92650VI().m92649TI().m93062f2(AbstractC6918a0.deactivate_container, VerifyChangePhoneNumberView.class, bundle, 0, true);
                if (this.f72421L0.m92650VI() instanceof ChangePhoneNumberView) {
                    ((ChangePhoneNumberView) this.f72421L0.m92650VI()).m78769gM();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uM */
    void m78762uM() {
        try {
            String m121742b5 = AbstractC23309i.m121742b5();
            if (m121742b5 != null) {
                if (m121742b5.length() == 0) {
                }
                this.f72663T0.setText(m121742b5);
            }
            m121742b5 = "VN";
            this.f72663T0.setText(m121742b5);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
