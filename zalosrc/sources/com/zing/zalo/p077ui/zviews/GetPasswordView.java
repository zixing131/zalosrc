package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import au.AbstractC2373t;
import au.AbstractC2379w;
import bn.C2887l;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.GetPasswordView;
import com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import cz.C17670w0;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import me0.AbstractC23244v8;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p135em.C18489c;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p588vw.C28647m;
import p588vw.C28655u;
import su.AbstractC26389c;
import vg.C28023b6;

/* loaded from: classes6.dex */
public class GetPasswordView extends BaseZaloView implements C23744a.c, View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: M0 */
    ImageButton f73496M0;

    /* renamed from: N0 */
    EditText f73497N0;

    /* renamed from: O0 */
    String f73498O0;

    /* renamed from: P0 */
    TextView f73499P0;

    /* renamed from: S0 */
    String f73502S0;

    /* renamed from: T0 */
    String f73503T0;

    /* renamed from: U0 */
    String f73504U0;

    /* renamed from: V0 */
    String f73505V0;

    /* renamed from: W0 */
    String f73506W0;

    /* renamed from: X0 */
    String f73507X0;

    /* renamed from: Z0 */
    String f73509Z0;

    /* renamed from: b1 */
    TextView f73511b1;

    /* renamed from: c1 */
    View f73512c1;

    /* renamed from: f1 */
    int f73515f1;

    /* renamed from: Q0 */
    boolean f73500Q0 = true;

    /* renamed from: R0 */
    boolean f73501R0 = false;

    /* renamed from: Y0 */
    String f73508Y0 = "";

    /* renamed from: a1 */
    boolean f73510a1 = false;

    /* renamed from: d1 */
    String f73513d1 = null;

    /* renamed from: e1 */
    int f73514e1 = 0;

    /* renamed from: g1 */
    boolean f73516g1 = false;

    /* renamed from: h1 */
    final Object f73517h1 = new Object();

    /* renamed from: i1 */
    final Object f73518i1 = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GetPasswordView$a */
    /* loaded from: classes6.dex */
    public class C14299a extends AbstractC18391a {
        C14299a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GetPasswordView.this.m79848lM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GetPasswordView$b */
    /* loaded from: classes6.dex */
    public class C14300b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f73520a;

        C14300b(String str) {
            this.f73520a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m79852e(String str) {
            if (GetPasswordView.this.f73499P0 != null) {
                if (!TextUtils.isEmpty(str)) {
                    GetPasswordView.this.f73499P0.setText(str);
                    GetPasswordView.this.f73499P0.setVisibility(0);
                } else {
                    GetPasswordView.this.f73499P0.setVisibility(8);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m79853f(C20096c c20096c) {
            TextView textView = GetPasswordView.this.f73499P0;
            if (textView != null) {
                textView.setText(c20096c.m104492d());
                GetPasswordView.this.f73499P0.setVisibility(0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            synchronized (GetPasswordView.this.f73517h1) {
                GetPasswordView getPasswordView = GetPasswordView.this;
                getPasswordView.f73516g1 = false;
                getPasswordView.f72421L0.mo49315c4();
            }
            if (AbstractC23216t1.m119643h(GetPasswordView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.ng
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    GetPasswordView.C14300b.this.m79852e(str);
                }
            })) {
                return;
            }
            try {
                if (c20096c.m104491c() != 2012 && c20096c.m104491c() != 2021) {
                    GetPasswordView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.og
                        @Override // java.lang.Runnable
                        public final void run() {
                            GetPasswordView.C14300b.this.m79853f(c20096c);
                        }
                    });
                }
                JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                InterfaceC27218a m92676n2 = GetPasswordView.this.m92676n2();
                GetPasswordView getPasswordView2 = GetPasswordView.this;
                AbstractC23153n4.m119159x(m92676n2, optJSONObject, false, 3, false, getPasswordView2.f73507X0, this.f73520a, getPasswordView2.f73513d1, getPasswordView2.f73514e1, getPasswordView2.f73515f1);
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
                    InterfaceC27218a m92676n2 = GetPasswordView.this.m92676n2();
                    GetPasswordView getPasswordView = GetPasswordView.this;
                    AbstractC23153n4.m119159x(m92676n2, optJSONObject, true, 3, false, getPasswordView.f73507X0, this.f73520a, getPasswordView.f73513d1, getPasswordView.f73514e1, getPasswordView.f73515f1);
                    synchronized (GetPasswordView.this.f73517h1) {
                        GetPasswordView getPasswordView2 = GetPasswordView.this;
                        getPasswordView2.f73516g1 = false;
                        r02 = getPasswordView2.f72421L0;
                        r02.mo49315c4();
                    }
                    z11 = r02;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (GetPasswordView.this.f73517h1) {
                        GetPasswordView getPasswordView3 = GetPasswordView.this;
                        getPasswordView3.f73516g1 = false;
                        ?? r03 = getPasswordView3.f72421L0;
                        r03.mo49315c4();
                        z11 = r03;
                    }
                }
            } catch (Throwable th2) {
                synchronized (GetPasswordView.this.f73517h1) {
                    GetPasswordView getPasswordView4 = GetPasswordView.this;
                    getPasswordView4.f73516g1 = z11;
                    getPasswordView4.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GetPasswordView$c */
    /* loaded from: classes6.dex */
    public class C14301c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f73522a;

        C14301c(String str) {
            this.f73522a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m79859h() {
            GetPasswordView.this.f72421L0.showDialog(3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m79860i() {
            if (AbstractC23309i.m121859e9() == 0 && !AbstractC23244v8.m119756t(GetPasswordView.this.f73497N0.getText().toString())) {
                AbstractC23309i.m121210Mt(1);
                GetPasswordView getPasswordView = GetPasswordView.this;
                getPasswordView.f73510a1 = true;
                TextView textView = getPasswordView.f73511b1;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = GetPasswordView.this.f73499P0;
                if (textView2 != null) {
                    textView2.setText(AbstractC23161o1.m119318c(ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4, ""));
                    GetPasswordView.this.f73499P0.setVisibility(0);
                    return;
                }
                return;
            }
            GetPasswordView getPasswordView2 = GetPasswordView.this;
            if (getPasswordView2.f73514e1 > 0) {
                TextView textView3 = getPasswordView2.f73499P0;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    GetPasswordView.this.f73499P0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_account_not_exits));
                    return;
                }
                return;
            }
            if (AbstractC23244v8.m119756t(getPasswordView2.f73497N0.getText().toString())) {
                TextView textView4 = GetPasswordView.this.f73499P0;
                if (textView4 != null) {
                    textView4.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                    GetPasswordView.this.f73499P0.setVisibility(0);
                    return;
                }
                return;
            }
            GetPasswordView.this.f72421L0.showDialog(5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m79861j(String str) {
            if (GetPasswordView.this.f73499P0 != null) {
                if (!TextUtils.isEmpty(str)) {
                    GetPasswordView.this.f73499P0.setText(str);
                    GetPasswordView.this.f73499P0.setVisibility(0);
                } else {
                    GetPasswordView.this.f73499P0.setVisibility(8);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m79862k() {
            TextView textView = GetPasswordView.this.f73511b1;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m79863l(C20096c c20096c) {
            try {
                if (GetPasswordView.this.f73499P0 != null) {
                    if (c20096c.m104491c() == 2045) {
                        GetPasswordView.this.f73499P0.setText(MainApplication.getAppContext().getString(AbstractC8020f0.error_account_exist) + "(" + c20096c.m104491c() + ")");
                    } else {
                        GetPasswordView.this.f73499P0.setText(c20096c.m104492d());
                    }
                    GetPasswordView.this.f73499P0.setVisibility(0);
                }
                if (c20096c.m104491c() == 2001) {
                    GetPasswordView.this.f73497N0.requestFocus();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            int i11;
            synchronized (GetPasswordView.this.f73518i1) {
                GetPasswordView getPasswordView = GetPasswordView.this;
                getPasswordView.f73501R0 = false;
                getPasswordView.f72421L0.mo49315c4();
            }
            if (AbstractC23216t1.m119643h(GetPasswordView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.pg
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    GetPasswordView.C14301c.this.m79861j(str);
                }
            })) {
                return;
            }
            try {
                if (GetPasswordView.this.f72421L0.m92672lJ() && c20096c.m104491c() != 50001) {
                    C18489c.m97852r(true);
                }
                if (c20096c.m104491c() == 2050) {
                    JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                    InterfaceC27218a m92676n2 = GetPasswordView.this.m92676n2();
                    String str = this.f73522a;
                    GetPasswordView getPasswordView2 = GetPasswordView.this;
                    AbstractC23153n4.m119151t(m92676n2, optJSONObject, 1010, str, 3, getPasswordView2.f73514e1, getPasswordView2.f73515f1);
                    return;
                }
                if (c20096c.m104491c() == 2060) {
                    AbstractC23153n4.m119155v(GetPasswordView.this.m92676n2(), new JSONObject(c20096c.m104490b()).optJSONObject("data"), 1004);
                    return;
                }
                if (c20096c.m104491c() == 2065) {
                    AbstractC2373t.m12412j();
                }
                if (c20096c.m104491c() == 2004 || c20096c.m104491c() == 2001 || c20096c.m104491c() == 2017) {
                    try {
                        char[] charArray = GetPasswordView.this.f73497N0.getText().toString().toCharArray();
                        if (c20096c.m104491c() == 2017) {
                            for (char c11 : charArray) {
                                if ((c11 >= 'a' && c11 <= 'z') || (c11 >= 'A' && c11 <= 'Z')) {
                                    break;
                                }
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    AbstractC23309i.m121210Mt(1);
                    GetPasswordView getPasswordView3 = GetPasswordView.this;
                    getPasswordView3.f73510a1 = true;
                    if (getPasswordView3.f72421L0.m92676n2() != null) {
                        GetPasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.qg
                            @Override // java.lang.Runnable
                            public final void run() {
                                GetPasswordView.C14301c.this.m79862k();
                            }
                        });
                    }
                }
                if (GetPasswordView.this.f72421L0.m92676n2() != null) {
                    GetPasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.rg
                        @Override // java.lang.Runnable
                        public final void run() {
                            GetPasswordView.C14301c.this.m79863l(c20096c);
                        }
                    });
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("identifier");
                GetPasswordView.this.f73507X0 = jSONObject.optString("sessionToken");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(GetPasswordView.this.f73507X0)) {
                    JSONObject jSONObject2 = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString));
                    GetPasswordView.this.f73502S0 = jSONObject2.optString("avatar_url");
                    GetPasswordView.this.f73503T0 = jSONObject2.optString("dname");
                    GetPasswordView.this.f73504U0 = jSONObject2.optString("uname");
                    GetPasswordView.this.f73506W0 = jSONObject2.optString("phone_num");
                    InterfaceC27218a m92676n2 = GetPasswordView.this.m92676n2();
                    GetPasswordView getPasswordView = GetPasswordView.this;
                    if (!AbstractC23153n4.m119139n(m92676n2, getPasswordView.f73506W0, getPasswordView.f73507X0, jSONObject, 3, getPasswordView.f73514e1, getPasswordView.f73515f1) && GetPasswordView.this.f72421L0.m92676n2() != null) {
                        GetPasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.sg
                            @Override // java.lang.Runnable
                            public final void run() {
                                GetPasswordView.C14301c.this.m79859h();
                            }
                        });
                    }
                } else if (GetPasswordView.this.f72421L0.m92676n2() != null) {
                    GetPasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.tg
                        @Override // java.lang.Runnable
                        public final void run() {
                            GetPasswordView.C14301c.this.m79860i();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            synchronized (GetPasswordView.this.f73518i1) {
                GetPasswordView getPasswordView2 = GetPasswordView.this;
                getPasswordView2.f73501R0 = false;
                getPasswordView2.f72421L0.mo49315c4();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static /* synthetic */ boolean m79842iM(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            AbstractC23647d.m123897g("38524");
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public /* synthetic */ void m79843jM(String str) {
        if (this.f73499P0 != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f73499P0.setText(str);
                this.f73499P0.setVisibility(0);
            } else {
                this.f73499P0.setVisibility(8);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (this.f72421L0.m92642L3() != null && this.f72421L0.m92642L3().containsKey("extra_account")) {
            this.f73498O0 = this.f72421L0.m92642L3().getString("extra_account");
            this.f73514e1 = this.f72421L0.m92642L3().getInt("EXTRA_FROM_SWITCH_ACCOUNT", 0);
            this.f73515f1 = this.f72421L0.m92642L3().getInt("EXTRA_SOURCE_SWITCH_ACCOUNT", 0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        this.f73513d1 = null;
        String str = "";
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 != 5) {
                    return null;
                }
                String m118281g = AbstractC23056e6.m118281g(this.f73497N0.getText().toString(), AbstractC23309i.m121704a5());
                if (TextUtils.isEmpty(m118281g) || m118281g.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                    EditText editText = this.f73497N0;
                    if (editText != null && editText.getText() != null) {
                        str = this.f73497N0.getText().toString();
                    }
                    m118281g = str;
                }
                C2887l.a aVar = new C2887l.a(this.f72421L0.m92648SI());
                aVar.m13843f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m13839b(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone10)).m13841d(m118281g).m13840c(AbstractC23136l9.m118743r0(AbstractC8020f0.change), this).m13842e(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), this);
                return aVar.m13838a();
            }
            this.f73509Z0 = AbstractC23309i.m121704a5();
            String m118282h = AbstractC23056e6.m118282h(this.f73497N0.getText().toString(), this.f73509Z0.toUpperCase(), true);
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (!TextUtils.isEmpty(m118282h)) {
                if (m118282h.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                }
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                aVar2.m43172u(AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleDlg_confirmPhone, m118282h)).m43173v(2).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_call)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), this);
                return aVar2.m43152a();
            }
            if (!TextUtils.isEmpty(this.f73506W0)) {
                String m118282h2 = AbstractC23056e6.m118282h(this.f73506W0, this.f73509Z0.toUpperCase(), false);
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
                this.f73513d1 = m118282h;
            } else if (!TextUtils.isEmpty(this.f73505V0)) {
                m118282h = this.f73505V0;
                this.f73513d1 = m118282h;
            } else {
                if (this.f73497N0.getText() != null) {
                    str = this.f73497N0.getText().toString();
                }
                m118282h = str;
            }
            C8009j.a aVar22 = new C8009j.a(this.f72421L0.m92648SI());
            aVar22.m43172u(AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleDlg_confirmPhone, m118282h)).m43173v(2).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_call)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), this);
            return aVar22.m43152a();
        }
        String m118281g2 = AbstractC23056e6.m118281g(this.f73497N0.getText().toString(), AbstractC23309i.m121704a5());
        if (TextUtils.isEmpty(m118281g2) || m118281g2.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
            EditText editText2 = this.f73497N0;
            if (editText2 != null && editText2.getText() != null) {
                str = this.f73497N0.getText().toString();
            }
            m118281g2 = str;
        }
        C2887l.a aVar3 = new C2887l.a(this.f72421L0.m92648SI());
        aVar3.m13843f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_register_new_user)).m13839b(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone11)).m13841d(m118281g2).m13840c(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cap_skip), this).m13842e(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cap_register_new_user), this);
        return aVar3.m13838a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.get_password_view, viewGroup, false);
        try {
            m79846hM(inflate, bundle);
            AbstractC23647d.m123897g("38522");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 1) {
                if (mo92862f != 3) {
                    if (mo92862f == 5) {
                        if (i11 == -1) {
                            interfaceC17463d.dismiss();
                            this.f72421L0.showDialog(1);
                            return;
                        } else {
                            if (i11 == -2) {
                                interfaceC17463d.dismiss();
                                AbstractC23309i.m121210Mt(1);
                                this.f73510a1 = true;
                                TextView textView = this.f73511b1;
                                if (textView != null) {
                                    textView.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    m79844fM();
                    AbstractC23647d.m123897g("38529");
                    return;
                } else {
                    if (i11 == -2) {
                        interfaceC17463d.dismiss();
                        this.f73497N0.requestFocus();
                        AbstractC23647d.m123897g("38528");
                        return;
                    }
                    return;
                }
            }
            if (i11 == -1) {
                AbstractC23647d.m123906p("19803");
                AbstractC23647d.m123893c();
                interfaceC17463d.dismiss();
                m79845gM();
                AbstractC23304d.f113402k0 = AbstractC23304d.f113398j0;
                Bundle bundle = new Bundle();
                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                if (C17670w0.f89662a.m93652d() == 0) {
                    this.f72421L0.m92662fJ().m93069k2(UpdateNameView.class, bundle, 1, true);
                } else {
                    this.f72421L0.m92662fJ().m93069k2(EnterUserNumberPhoneView.class, null, 1, true);
                }
                this.f72421L0.mo49315c4();
                return;
            }
            if (i11 == -2) {
                AbstractC23647d.m123906p("19802");
                AbstractC23647d.m123893c();
                interfaceC17463d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC2379w.m12430d(this.f73497N0);
            AbstractC23647d.m123897g("38523");
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            bundle.putBoolean("IS_SHOW_COUNTRY", this.f73510a1);
            bundle.putInt("srcSwitchAccount", this.f73514e1);
            bundle.putInt("source_switch", this.f73515f1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(this.f72421L0.m92651WI().getString(AbstractC8020f0.str_title_recover_pass));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (!z12 || this.f72421L0.m92683qJ()) {
                AbstractC2379w.m12432f(this.f73497N0);
            }
        }
    }

    /* renamed from: fM */
    void m79844fM() {
        String str;
        if (!TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
            synchronized (this.f73517h1) {
                try {
                    if (this.f73516g1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    this.f73516g1 = true;
                    this.f72421L0.mo46829Y();
                    String obj = this.f73497N0.getText().toString();
                    if (AbstractC23309i.m121859e9() == 1) {
                        str = AbstractC23309i.m121704a5();
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14300b(obj));
                    AbstractC23304d.f113289J.clear();
                    AbstractC23304d.f113399j1 = System.currentTimeMillis();
                    c0766k.mo1539T5(AbstractC23304d.f113398j0, str2, this.f73507X0, 1, 0, 3, this.f73514e1, this.f73515f1, AbstractC23034c6.m118110A());
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        TextView textView = this.f73499P0;
        if (textView != null) {
            textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
            this.f73499P0.setVisibility(0);
        }
    }

    /* renamed from: gM */
    public void m79845gM() {
        EditText editText = this.f73497N0;
        if (editText != null) {
            AbstractC2379w.m12430d(editText);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GetPasswordView";
    }

    /* renamed from: hM */
    void m79846hM(View view, Bundle bundle) {
        char charAt;
        this.f73499P0 = (TextView) view.findViewById(AbstractC6918a0.tvError);
        EditText editText = (EditText) view.findViewById(AbstractC6918a0.edtAccount);
        this.f73497N0 = editText;
        editText.addTextChangedListener(new C14299a());
        this.f73497N0.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.mg
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m79842iM;
                m79842iM = GetPasswordView.m79842iM(view2, motionEvent);
                return m79842iM;
            }
        });
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tvCountryName);
        this.f73511b1 = textView;
        textView.setOnClickListener(this);
        int i11 = 0;
        if (!TextUtils.isEmpty(this.f73498O0)) {
            if (AbstractC23309i.m121829dg()) {
                this.f73497N0.setText(this.f73498O0);
            } else {
                int i12 = 0;
                while (i12 < this.f73498O0.length() && (((charAt = this.f73498O0.charAt(i12)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'x'))) {
                    i12++;
                }
                if (i12 == this.f73498O0.length()) {
                    this.f73497N0.setText(this.f73498O0);
                } else {
                    this.f73497N0.setText("");
                }
            }
        }
        ImageButton imageButton = (ImageButton) view.findViewById(AbstractC6918a0.btnInput);
        this.f73496M0 = imageButton;
        imageButton.setOnClickListener(this);
        if (AbstractC23309i.m121829dg()) {
            this.f73500Q0 = AbstractC23309i.m122576xe();
            m79847kM();
        } else {
            this.f73500Q0 = true;
            m79847kM();
            this.f73496M0.setVisibility(8);
            this.f73497N0.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_input_account_phone_number));
        }
        View findViewById = view.findViewById(AbstractC6918a0.btnNext);
        this.f73512c1 = findViewById;
        findViewById.setOnClickListener(this);
        m79848lM();
        this.f73510a1 = false;
        if (bundle != null) {
            this.f73510a1 = bundle.getBoolean("IS_SHOW_COUNTRY", false);
            this.f73514e1 = bundle.getInt("srcSwitchAccount", 0);
            this.f73515f1 = bundle.getInt("source_switch", 0);
        }
        TextView textView2 = this.f73511b1;
        if (!this.f73510a1) {
            i11 = 8;
        }
        textView2.setVisibility(i11);
        AbstractC23309i.m121210Mt(this.f73510a1 ? 1 : 0);
    }

    /* renamed from: kM */
    void m79847kM() {
        EditText editText = this.f73497N0;
        if (editText != null && this.f73496M0 != null) {
            if (this.f73500Q0) {
                editText.setInputType(3);
                AbstractC2379w.m12432f(this.f73497N0);
                this.f73496M0.setImageResource(AbstractC16803z.login_abc);
                AbstractC23309i.m122394sh(true);
                return;
            }
            editText.setInputType(32);
            AbstractC2379w.m12432f(this.f73497N0);
            this.f73496M0.setImageResource(AbstractC16803z.login_123);
            AbstractC23309i.m122394sh(false);
        }
    }

    /* renamed from: lM */
    public void m79848lM() {
        boolean z11;
        try {
            View view = this.f73512c1;
            if (view != null) {
                if (this.f73497N0.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                view.setEnabled(z11);
            }
            TextView textView = this.f73499P0;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    public void m79849mM(String str, String str2) {
        AbstractC23304d.f113398j0 = str;
        synchronized (this.f73518i1) {
            try {
                if (this.f73501R0) {
                    this.f72421L0.mo46829Y();
                    return;
                }
                this.f73501R0 = true;
                this.f72421L0.mo46829Y();
                String str3 = "";
                if (AbstractC23309i.m121859e9() == 1) {
                    str3 = AbstractC23309i.m121704a5();
                }
                String str4 = AbstractC18458a.f93019a;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14301c(str));
                c0766k.m1809F0(str, str3, str4, str2, this.f73508Y0, 3, this.f73514e1, this.f73515f1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        EditText editText;
        try {
            if (i11 == 1010) {
                if (i12 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("data");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        JSONObject jSONObject = new JSONObject(stringExtra);
                        String optString = jSONObject.optString("identifier");
                        this.f73507X0 = jSONObject.optString("sessionToken");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(this.f73507X0)) {
                            JSONObject jSONObject2 = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString));
                            this.f73502S0 = jSONObject2.optString("avatar_url");
                            this.f73503T0 = jSONObject2.optString("dname");
                            this.f73504U0 = jSONObject2.optString("uname");
                            this.f73506W0 = jSONObject2.optString("phone_num");
                            if (!AbstractC23153n4.m119139n(m92676n2(), this.f73506W0, this.f73507X0, jSONObject, 3, this.f73514e1, this.f73515f1)) {
                                this.f72421L0.showDialog(3);
                                return;
                            }
                            return;
                        }
                        if (AbstractC23309i.m121859e9() == 0 && !AbstractC23244v8.m119756t(this.f73497N0.getText().toString())) {
                            AbstractC23309i.m121210Mt(1);
                            this.f73510a1 = true;
                            TextView textView = this.f73511b1;
                            if (textView != null) {
                                textView.setVisibility(0);
                            }
                            TextView textView2 = this.f73499P0;
                            if (textView2 != null) {
                                textView2.setText(AbstractC23161o1.m119318c(ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4, ""));
                                this.f73499P0.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        if (this.f73514e1 > 0) {
                            TextView textView3 = this.f73499P0;
                            if (textView3 != null) {
                                textView3.setVisibility(0);
                                this.f73499P0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_account_not_exits));
                                return;
                            }
                            return;
                        }
                        if (AbstractC23244v8.m119756t(this.f73497N0.getText().toString())) {
                            TextView textView4 = this.f73499P0;
                            if (textView4 != null) {
                                textView4.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                                this.f73499P0.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        this.f72421L0.showDialog(5);
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
                                    if (!TextUtils.isEmpty(optString2) && (editText = this.f73497N0) != null) {
                                        this.f73508Y0 = optString2;
                                        m79849mM(editText.getText().toString().trim(), "");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            C20096c c20096c = new C20096c(i13, jSONObject3.optString("error_message", ""));
                            c20096c.m104494f(stringExtra2);
                            AbstractC23216t1.m119643h(this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.lg
                                @Override // me0.AbstractC23216t1.d
                                /* renamed from: a */
                                public final void mo68088a(String str) {
                                    GetPasswordView.this.m79843jM(str);
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tvCountryName) {
            m79845gM();
            this.f72421L0.m92662fJ().m93069k2(CountryListView.class, null, 1, true);
            return;
        }
        if (id2 == AbstractC6918a0.btnInput) {
            this.f73500Q0 = !this.f73500Q0;
            m79847kM();
            return;
        }
        if (id2 == AbstractC6918a0.btnNext) {
            EditText editText = this.f73497N0;
            if (editText == null) {
                str = "";
            } else {
                str = editText.getText().toString().trim();
            }
            if (TextUtils.isEmpty(str)) {
                EditText editText2 = this.f73497N0;
                if (editText2 != null) {
                    editText2.requestFocus();
                }
                this.f73499P0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone12));
                this.f73499P0.setVisibility(0);
                return;
            }
            this.f73499P0.setVisibility(8);
            AbstractC23647d.m123897g("38525");
            m79849mM(str, "");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("38523");
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f72421L0.m92676n2().mo35554O(16);
        try {
            C23744a.m124114c().m124115b(this, 37);
            this.f73511b1.setText(AbstractC23309i.m121704a5());
            C28023b6.m141250h0().m141277D();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 37) {
            try {
                if (AbstractC23309i.m122166mc() != 2 && AbstractC23309i.m122166mc() != 4) {
                    return;
                }
                String m121704a5 = AbstractC23309i.m121704a5();
                ((C28655u) C28647m.m143325c().m143328b().get(m121704a5)).m143391b();
                String str = ((C28655u) C28647m.m143325c().m143328b().get(m121704a5)).f132863a;
                this.f73511b1.setText(m121704a5);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
