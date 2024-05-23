package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0815e1;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.ConfirmChangePhoneDialogView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.zviews.ChangePhoneAccountExistView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
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
public class ChangePhoneAccountExistView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: Y0 */
    public static int f72648Y0;

    /* renamed from: P0 */
    int f72649P0;

    /* renamed from: Q0 */
    String f72650Q0;

    /* renamed from: R0 */
    String f72651R0;

    /* renamed from: S0 */
    String f72652S0;

    /* renamed from: T0 */
    String f72653T0;

    /* renamed from: U0 */
    String f72654U0;

    /* renamed from: W0 */
    ConfirmChangePhoneDialogView f72656W0;

    /* renamed from: V0 */
    String f72655V0 = "";

    /* renamed from: X0 */
    boolean f72657X0 = false;

    /* renamed from: com.zing.zalo.ui.zviews.ChangePhoneAccountExistView$a */
    /* loaded from: classes6.dex */
    public class C14144a implements InterfaceC20094a {
        C14144a() {
        }

        /* renamed from: d */
        public /* synthetic */ void m78747d() {
            try {
                ChangePhoneAccountExistView.this.m78745sM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (c20096c.m104491c() == 2049) {
                        ChangePhoneAccountExistView.this.m78742pM();
                    } else {
                        ToastUtils.m89263k(c20096c);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ChangePhoneAccountExistView changePhoneAccountExistView = ChangePhoneAccountExistView.this;
                changePhoneAccountExistView.f72657X0 = false;
                changePhoneAccountExistView.f72421L0.mo49315c4();
            } catch (Throwable th2) {
                ChangePhoneAccountExistView changePhoneAccountExistView2 = ChangePhoneAccountExistView.this;
                changePhoneAccountExistView2.f72657X0 = false;
                changePhoneAccountExistView2.f72421L0.mo49315c4();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (((JSONObject) obj).optInt("error_code", -999) == 0) {
                        if (ChangePhoneAccountExistView.this.f72421L0.m92676n2() != null) {
                            ChangePhoneAccountExistView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.s5
                                public /* synthetic */ RunnableC16119s5() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChangePhoneAccountExistView.C14144a.this.m78747d();
                                }
                            });
                        }
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.error_message));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ChangePhoneAccountExistView changePhoneAccountExistView = ChangePhoneAccountExistView.this;
                changePhoneAccountExistView.f72657X0 = false;
                changePhoneAccountExistView.f72421L0.mo49315c4();
            } catch (Throwable th2) {
                ChangePhoneAccountExistView changePhoneAccountExistView2 = ChangePhoneAccountExistView.this;
                changePhoneAccountExistView2.f72657X0 = false;
                changePhoneAccountExistView2.f72421L0.mo49315c4();
                throw th2;
            }
        }
    }

    /* renamed from: lM */
    public /* synthetic */ void m78737lM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m78741kM();
    }

    /* renamed from: mM */
    public /* synthetic */ void m78738mM(Bundle bundle) {
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

    /* renamed from: nM */
    public /* synthetic */ void m78739nM(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            ConfirmChangePhoneDialogView confirmChangePhoneDialogView = this.f72656W0;
            if (confirmChangePhoneDialogView != null) {
                confirmChangePhoneDialogView.dismiss();
            }
            if (m92650VI() != null) {
                m92650VI().finish();
            } else {
                finish();
            }
            C0815e1.m2075D().m2099U(3, 0, 29, "6");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    public /* synthetic */ void m78740oM(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            ConfirmChangePhoneDialogView confirmChangePhoneDialogView = this.f72656W0;
            if (confirmChangePhoneDialogView != null) {
                confirmChangePhoneDialogView.dismiss();
            }
            m78741kM();
            C0815e1.m2075D().m2099U(3, 0, 29, "4");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                this.f72649P0 = m92642L3.getInt("source_type_change_phone", 1);
                if (m92642L3.containsKey("STR_EXTRA_NEW_PHONE_NUMBER")) {
                    str = m92642L3.getString("STR_EXTRA_NEW_PHONE_NUMBER");
                } else {
                    str = "";
                }
                this.f72650Q0 = str;
                String string = m92642L3.getString("EXTRA_INFO_ACCOUNT");
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    this.f72651R0 = jSONObject.optString("displayName");
                    this.f72652S0 = jSONObject.optString("avatar");
                    this.f72653T0 = jSONObject.optString("phoneNumber");
                    this.f72654U0 = jSONObject.optString("isoCode");
                }
            }
            C0815e1.m2075D().m2099U(3, 0, 29, "1");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return null;
        }
        try {
            String replace = this.f72651R0.replace("\n", " ");
            SpannableString spannableString = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_change_phone_title_dialog_confirm, replace));
            spannableString.setSpan(new ForegroundColorSpan(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.red_color1)), 0, spannableString.length(), 33);
            C8009j.a aVar = new C8009j.a(m92648SI());
            aVar.m43173v(15).m43172u(spannableString).m43159h(4).m43162k(AbstractC23136l9.m118746s0(AbstractC8020f0.str_change_phone_content_dialog_confirm, this.f72655V0, replace)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_continue), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.q5
                public /* synthetic */ C16044q5() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ChangePhoneAccountExistView.this.m78737lM(interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String m118281g;
        View inflate = layoutInflater.inflate(AbstractC7409c0.change_phone_account_exist, viewGroup, false);
        try {
            ((TextView) inflate.findViewById(AbstractC6918a0.tv_name)).setText(this.f72651R0);
            ((GroupAvatarView) inflate.findViewById(AbstractC6918a0.img_avt)).m75732d(this.f72652S0);
            inflate.findViewById(AbstractC6918a0.btn_next).setOnClickListener(this);
            inflate.findViewById(AbstractC6918a0.btn_my_account).setOnClickListener(this);
            m118281g = AbstractC23056e6.m118281g(this.f72650Q0, AbstractC23309i.m121742b5());
            this.f72655V0 = m118281g;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!TextUtils.isEmpty(m118281g)) {
            if (this.f72655V0.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
            }
            ((TextView) inflate.findViewById(AbstractC6918a0.tv_hint_top)).setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_change_phone_title_account_exist, this.f72655V0));
            return inflate;
        }
        this.f72655V0 = this.f72650Q0;
        ((TextView) inflate.findViewById(AbstractC6918a0.tv_hint_top)).setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_change_phone_title_account_exist, this.f72655V0));
        return inflate;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ChangePhoneAccountExistView";
    }

    /* renamed from: kM */
    void m78741kM() {
        if (!C23055e5.m118272g(true) || this.f72657X0) {
            return;
        }
        String m121742b5 = AbstractC23309i.m121742b5();
        if (!TextUtils.isEmpty(this.f72650Q0) && !TextUtils.isEmpty(m121742b5)) {
            String m118277c = AbstractC23056e6.m118277c(this.f72650Q0);
            if (!TextUtils.isEmpty(m118277c) && !m118277c.equals(AbstractC23056e6.f112062a)) {
                this.f72421L0.mo46829Y();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14144a());
                this.f72657X0 = true;
                c0766k.mo1707p3(m121742b5, m118277c, this.f72649P0, false);
                return;
            }
            ToastUtils.showMess(AbstractC23161o1.m119318c(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, ""));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_next) {
                f72648Y0 = 1;
                showDialog(1);
                C0815e1.m2075D().m2099U(3, 0, 29, "7");
            } else if (id2 == AbstractC6918a0.btn_my_account) {
                f72648Y0 = 2;
                m78744rM();
                C0815e1.m2075D().m2099U(3, 0, 29, "3");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pM */
    void m78742pM() {
        String str;
        String m118277c = AbstractC23056e6.m118277c(this.f72650Q0);
        if (TextUtils.isEmpty(m118277c) || m118277c.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
            m118277c = this.f72650Q0;
        }
        if (!TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
            str = AbstractC23056e6.m118281g(AbstractC23304d.f113394i0, AbstractC23309i.m121742b5());
            if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                str = AbstractC23304d.f113394i0;
            }
        } else {
            str = "";
        }
        String m118281g = AbstractC23056e6.m118281g(this.f72650Q0, AbstractC23309i.m121742b5());
        if (TextUtils.isEmpty(m118281g) || m118281g.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
            m118281g = this.f72650Q0;
        }
        Bundle bundle = new Bundle();
        bundle.putString("STR_EXTRA_NEW_PHONE_NUMBER", m118281g);
        bundle.putString("STR_EXTRA_OLD_PHONE_NUMBER", str);
        bundle.putBoolean("STR_EXTRA_CHANGE_BYPASS_WAY", true);
        bundle.putInt("source_type_change_phone", this.f72649P0);
        m78743qM(m118277c);
        AbstractC23309i.m121541Vr(0L);
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35579p() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.r5

                /* renamed from: q */
                public final /* synthetic */ Bundle f81783q;

                public /* synthetic */ RunnableC16081r5(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChangePhoneAccountExistView.this.m78738mM(r2);
                }
            });
        }
    }

    /* renamed from: qM */
    void m78743qM(String str) {
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

    /* renamed from: rM */
    public void m78744rM() {
        try {
            ConfirmChangePhoneDialogView confirmChangePhoneDialogView = (ConfirmChangePhoneDialogView) m92650VI().m92649TI().m92996E0("TAG_CONFIRM_CHANGE_PHONE_DIALOG");
            this.f72656W0 = confirmChangePhoneDialogView;
            if (confirmChangePhoneDialogView != null) {
                confirmChangePhoneDialogView.dismiss();
            }
            ConfirmChangePhoneDialogView confirmChangePhoneDialogView2 = new ConfirmChangePhoneDialogView();
            this.f72656W0 = confirmChangePhoneDialogView2;
            confirmChangePhoneDialogView2.m42845TK(new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.o5
                public /* synthetic */ C15969o5() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChangePhoneAccountExistView.this.m78739nM(interfaceC17463d, i11);
                }
            });
            this.f72656W0.m42846UK(new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.p5
                public /* synthetic */ C16007p5() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ChangePhoneAccountExistView.this.m78740oM(interfaceC17463d, i11);
                }
            });
            this.f72656W0.m42847VK(AbstractC23136l9.m118746s0(AbstractC8020f0.str_change_phone_title_dialog_my_account, this.f72651R0, this.f72655V0));
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_change_phone_content_dialog_my_account_2, this.f72651R0);
            String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_change_phone_content_dialog_my_account, this.f72655V0, AbstractC23304d.f113368c0.f42437s, m118746s0);
            int indexOf = m118746s02.indexOf(m118746s0);
            SpannableString spannableString = new SpannableString(m118746s02);
            spannableString.setSpan(new ForegroundColorSpan(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.red_color1)), indexOf, m118746s02.length(), 33);
            this.f72656W0.m42844SK(spannableString);
            this.f72656W0.m42848WK(m92650VI().m92649TI(), "TAG_CONFIRM_CHANGE_PHONE_DIALOG", AbstractC6918a0.deactivate_container);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    void m78745sM() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("STR_EXTRA_NEW_PHONE_NUMBER", this.f72650Q0);
            bundle.putInt("source_type_change_phone", this.f72649P0);
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

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            if (((ConfirmChangePhoneDialogView) m92650VI().m92649TI().m92996E0("TAG_CONFIRM_CHANGE_PHONE_DIALOG")) != null) {
                m78744rM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
