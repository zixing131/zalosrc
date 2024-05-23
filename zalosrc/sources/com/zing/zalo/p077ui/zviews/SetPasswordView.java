package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au.AbstractC2373t;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.SetPasswordView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23216t1;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p135em.C18489c;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p542ub.InterfaceC27218a;
import su.AbstractC26389c;

/* loaded from: classes6.dex */
public class SetPasswordView extends BaseZaloView implements InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: M0 */
    View f77391M0;

    /* renamed from: O0 */
    String f77393O0;

    /* renamed from: P0 */
    String f77394P0;

    /* renamed from: Q0 */
    String f77395Q0;

    /* renamed from: R0 */
    String f77396R0;

    /* renamed from: S0 */
    String f77397S0;

    /* renamed from: T0 */
    TextView f77398T0;

    /* renamed from: V0 */
    int f77400V0;

    /* renamed from: X0 */
    String f77402X0;

    /* renamed from: N0 */
    String f77392N0 = null;

    /* renamed from: U0 */
    int f77399U0 = 0;

    /* renamed from: W0 */
    String f77401W0 = "";

    /* renamed from: Y0 */
    boolean f77403Y0 = false;

    /* renamed from: Z0 */
    final Object f77404Z0 = new Object();

    /* renamed from: a1 */
    boolean f77405a1 = false;

    /* renamed from: b1 */
    final Object f77406b1 = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SetPasswordView$a */
    /* loaded from: classes6.dex */
    public class C15017a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77407a;

        C15017a(String str) {
            this.f77407a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m84052f() {
            SetPasswordView.this.f72421L0.showDialog(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static /* synthetic */ void m84053g(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static /* synthetic */ void m84054h(C20096c c20096c) {
            if (c20096c != null) {
                ToastUtils.showMess(c20096c.m104492d());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            synchronized (SetPasswordView.this.f77404Z0) {
                SetPasswordView setPasswordView = SetPasswordView.this;
                setPasswordView.f77403Y0 = false;
                setPasswordView.f72421L0.mo49315c4();
            }
            try {
                if (SetPasswordView.this.f72421L0.m92672lJ() && c20096c.m104491c() != 50001) {
                    C18489c.m97852r(true);
                }
                if (AbstractC23216t1.m119643h(SetPasswordView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.bh0
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        SetPasswordView.C15017a.m84053g(str);
                    }
                })) {
                    return;
                }
                if (c20096c.m104491c() == 2050) {
                    JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                    InterfaceC27218a m92676n2 = SetPasswordView.this.m92676n2();
                    String str = this.f77407a;
                    SetPasswordView setPasswordView2 = SetPasswordView.this;
                    AbstractC23153n4.m119151t(m92676n2, optJSONObject, ZAbstractBase.ZVU_BLEND_GEN_THUMB, str, 1, setPasswordView2.f77399U0, setPasswordView2.f77400V0);
                    return;
                }
                if (c20096c.m104491c() == 2060) {
                    AbstractC23153n4.m119155v(SetPasswordView.this.m92676n2(), new JSONObject(c20096c.m104490b()).optJSONObject("data"), 1004);
                } else if (SetPasswordView.this.f72421L0.m92676n2() != null) {
                    SetPasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ch0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SetPasswordView.C15017a.m84054h(C20096c.this);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("identifier");
                SetPasswordView.this.f77402X0 = jSONObject.optString("sessionToken");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(SetPasswordView.this.f77402X0)) {
                    JSONObject jSONObject2 = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString));
                    SetPasswordView.this.f77394P0 = jSONObject2.optString("avatar_url");
                    SetPasswordView.this.f77395Q0 = jSONObject2.optString("dname");
                    SetPasswordView.this.f77396R0 = jSONObject2.optString("uname");
                    InterfaceC27218a m92676n2 = SetPasswordView.this.m92676n2();
                    String str = this.f77407a;
                    SetPasswordView setPasswordView = SetPasswordView.this;
                    if (!AbstractC23153n4.m119139n(m92676n2, str, setPasswordView.f77402X0, jSONObject, 1, setPasswordView.f77399U0, setPasswordView.f77400V0) && SetPasswordView.this.f72421L0.m92676n2() != null) {
                        SetPasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.dh0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SetPasswordView.C15017a.this.m84052f();
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            synchronized (SetPasswordView.this.f77404Z0) {
                SetPasswordView setPasswordView2 = SetPasswordView.this;
                setPasswordView2.f77403Y0 = false;
                setPasswordView2.f72421L0.mo49315c4();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SetPasswordView$b */
    /* loaded from: classes6.dex */
    public class C15018b implements InterfaceC20094a {
        C15018b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m84056d(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            synchronized (SetPasswordView.this.f77406b1) {
                SetPasswordView setPasswordView = SetPasswordView.this;
                setPasswordView.f77405a1 = false;
                setPasswordView.f72421L0.mo49315c4();
            }
            if (AbstractC23216t1.m119643h(SetPasswordView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.eh0
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    SetPasswordView.C15018b.m84056d(str);
                }
            })) {
                return;
            }
            try {
                if (c20096c.m104491c() != 2012 && c20096c.m104491c() != 2021) {
                    ToastUtils.showMess(c20096c.m104492d());
                }
                JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                InterfaceC27218a m92676n2 = SetPasswordView.this.m92676n2();
                SetPasswordView setPasswordView2 = SetPasswordView.this;
                AbstractC23153n4.m119159x(m92676n2, optJSONObject, false, 1, false, setPasswordView2.f77402X0, setPasswordView2.f77392N0, null, setPasswordView2.f77399U0, setPasswordView2.f77400V0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r0v7, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ?? r02;
            boolean z11 = false;
            z11 = false;
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    InterfaceC27218a m92676n2 = SetPasswordView.this.m92676n2();
                    SetPasswordView setPasswordView = SetPasswordView.this;
                    AbstractC23153n4.m119159x(m92676n2, optJSONObject, true, 1, false, setPasswordView.f77402X0, setPasswordView.f77392N0, null, setPasswordView.f77399U0, setPasswordView.f77400V0);
                    synchronized (SetPasswordView.this.f77406b1) {
                        SetPasswordView setPasswordView2 = SetPasswordView.this;
                        setPasswordView2.f77405a1 = false;
                        r02 = setPasswordView2.f72421L0;
                        r02.mo49315c4();
                    }
                    z11 = r02;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (SetPasswordView.this.f77406b1) {
                        SetPasswordView setPasswordView3 = SetPasswordView.this;
                        setPasswordView3.f77405a1 = false;
                        ?? r03 = setPasswordView3.f72421L0;
                        r03.mo49315c4();
                        z11 = r03;
                    }
                }
            } catch (Throwable th2) {
                synchronized (SetPasswordView.this.f77406b1) {
                    SetPasswordView setPasswordView4 = SetPasswordView.this;
                    setPasswordView4.f77405a1 = z11;
                    setPasswordView4.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public /* synthetic */ void m84044hM(View view) {
        m84048jM(this.f77392N0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static /* synthetic */ void m84045iM(String str) {
        if (!TextUtils.isEmpty(str)) {
            ToastUtils.showMess(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        if (i11 != 2) {
            return null;
        }
        String upperCase = AbstractC23309i.m121704a5().toUpperCase();
        String m118282h = AbstractC23056e6.m118282h(this.f77392N0, upperCase, true);
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!TextUtils.isEmpty(m118282h)) {
            if (m118282h.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleDlg_confirmPhone, m118282h)).m43173v(2).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_call)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), this);
            return aVar.m43152a();
        }
        if (!TextUtils.isEmpty(this.f77397S0)) {
            String m118282h2 = AbstractC23056e6.m118282h(this.f77397S0, upperCase, false);
            if (TextUtils.isEmpty(m118282h2) || m118282h2.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                m118282h2 = "*** *** ***";
            }
            char[] charArray = m118282h2.toCharArray();
            int indexOf = m118282h2.indexOf(" ");
            if (indexOf > 0) {
                i12 = indexOf + 2;
            } else {
                i12 = 1;
            }
            while (i12 < m118282h2.length() - 2) {
                if (charArray[i12] != ' ') {
                    charArray[i12] = '*';
                }
                i12++;
            }
            m118282h = String.copyValueOf(charArray);
        } else {
            m118282h = this.f77392N0;
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        aVar2.m43172u(AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleDlg_confirmPhone, m118282h)).m43173v(2).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_call)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), this);
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.set_password_view, viewGroup, false);
        try {
            m84047gM(inflate);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d.mo92862f() == 2 && i11 == -1) {
            interfaceC17463d.dismiss();
            m84046fM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.login_title));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fM */
    void m84046fM() {
        String str;
        if (!TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
            synchronized (this.f77406b1) {
                try {
                    if (this.f77405a1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    this.f77405a1 = true;
                    this.f72421L0.mo46829Y();
                    if (AbstractC23309i.m121859e9() == 1) {
                        str = AbstractC23309i.m121704a5();
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C15018b());
                    AbstractC23304d.f113289J.clear();
                    AbstractC23304d.f113399j1 = System.currentTimeMillis();
                    c0766k.mo1539T5(AbstractC23304d.f113398j0, str2, this.f77402X0, 0, 0, 1, this.f77399U0, this.f77400V0, AbstractC23034c6.m118110A());
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
    }

    /* renamed from: gM */
    void m84047gM(View view) {
        String str;
        if (this.f72421L0.m92642L3() != null) {
            String str2 = "";
            if (!this.f72421L0.m92642L3().containsKey("extra_account")) {
                str = "";
            } else {
                str = this.f72421L0.m92642L3().getString("extra_account");
            }
            this.f77392N0 = str;
            if (this.f72421L0.m92642L3().containsKey("extra_name")) {
                str2 = this.f72421L0.m92642L3().getString("extra_name");
            }
            this.f77393O0 = str2;
            this.f77399U0 = this.f72421L0.m92642L3().getInt("EXTRA_FROM_SWITCH_ACCOUNT", 0);
            this.f77400V0 = this.f72421L0.m92642L3().getInt("EXTRA_SOURCE_SWITCH_ACCOUNT", 0);
        }
        View findViewById = view.findViewById(AbstractC6918a0.btnNext);
        this.f77391M0 = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.zg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SetPasswordView.this.m84044hM(view2);
            }
        });
        this.f77398T0 = (TextView) view.findViewById(AbstractC6918a0.tvHint);
        if (!TextUtils.isEmpty(this.f77393O0)) {
            String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_set_password), this.f77393O0);
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                int indexOf = format.indexOf(this.f77393O0);
                spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, this.f77393O0.length() + indexOf, 34);
                this.f77398T0.setText(spannableStringBuilder);
                return;
            } catch (Exception unused) {
                this.f77398T0.setText(format);
                return;
            }
        }
        this.f77398T0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_set_password_not_name));
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SetPasswordView";
    }

    /* renamed from: jM */
    public void m84048jM(String str) {
        AbstractC23304d.f113398j0 = str;
        synchronized (this.f77404Z0) {
            try {
                if (this.f77403Y0) {
                    this.f72421L0.mo46829Y();
                    return;
                }
                this.f77403Y0 = true;
                this.f72421L0.mo46829Y();
                String str2 = "";
                if (AbstractC23309i.m121859e9() == 1) {
                    str2 = AbstractC23309i.m121704a5();
                }
                String str3 = AbstractC18458a.f93019a;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15017a(str));
                c0766k.m1809F0(str, str2, str3, "", this.f77401W0, 1, this.f77399U0, this.f77400V0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 == 1003) {
                if (i12 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("data");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        JSONObject jSONObject = new JSONObject(stringExtra);
                        String optString = jSONObject.optString("identifier");
                        this.f77402X0 = jSONObject.optString("sessionToken");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(this.f77402X0)) {
                            JSONObject jSONObject2 = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString));
                            this.f77394P0 = jSONObject2.optString("avatar_url");
                            this.f77395Q0 = jSONObject2.optString("dname");
                            this.f77396R0 = jSONObject2.optString("uname");
                            this.f77397S0 = jSONObject2.optString("phone_num");
                            if (!AbstractC23153n4.m119139n(m92676n2(), this.f77392N0, this.f77402X0, jSONObject, 1, this.f77399U0, this.f77400V0)) {
                                this.f72421L0.showDialog(2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 1004) {
                if (i12 == -1 && intent != null) {
                    String stringExtra2 = intent.getStringExtra("data");
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        JSONObject jSONObject3 = new JSONObject(stringExtra2);
                        if (jSONObject3.has("error_code")) {
                            int i13 = jSONObject3.getInt("error_code");
                            if (i13 == 0) {
                                JSONObject optJSONObject = jSONObject3.optJSONObject("data");
                                if (optJSONObject != null) {
                                    String optString2 = optJSONObject.optString("captchaToken", "");
                                    if (!TextUtils.isEmpty(optString2)) {
                                        this.f77401W0 = optString2;
                                        m84048jM(this.f77392N0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            C20096c c20096c = new C20096c(i13, jSONObject3.optString("error_message", ""));
                            c20096c.m104494f(stringExtra2);
                            AbstractC23216t1.m119643h(this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.ah0
                                @Override // me0.AbstractC23216t1.d
                                /* renamed from: a */
                                public final void mo68088a(String str) {
                                    SetPasswordView.m84045iM(str);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            super.onActivityResult(i11, i12, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
