package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.AbstractC2373t;
import au.AbstractC2379w;
import bn.C2887l;
import ck.C3560a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.ConfirmDialogView;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.zviews.LoginView;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import cz.C17670w0;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import me0.AbstractC23028c0;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23179p8;
import me0.AbstractC23216t1;
import me0.AbstractC23244v8;
import me0.C23055e5;
import me0.C23225u;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import mm0.AbstractC23353h;
import nh0.InterfaceC23792b;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p135em.C18489c;
import p248iy.AbstractC20887g;
import p320ld.C22438j;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import su.AbstractC26389c;
import vg.C28023b6;

/* loaded from: classes6.dex */
public class LoginView extends BaseZaloView implements C23744a.c, View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: O1 */
    static final String f74733O1 = "LoginView";

    /* renamed from: I1 */
    String f74742I1;

    /* renamed from: N1 */
    ConfirmDialogView f74749N1;

    /* renamed from: P0 */
    String f74751P0;

    /* renamed from: Q0 */
    String f74752Q0;

    /* renamed from: T0 */
    KeyboardFrameLayout f74755T0;

    /* renamed from: V0 */
    private InterfaceC23792b f74757V0;

    /* renamed from: W0 */
    TextView f74758W0;

    /* renamed from: X0 */
    TextView f74759X0;

    /* renamed from: Y0 */
    GroupAvatarView f74760Y0;

    /* renamed from: Z0 */
    View f74761Z0;

    /* renamed from: a1 */
    EditText f74762a1;

    /* renamed from: b1 */
    EditText f74763b1;

    /* renamed from: c1 */
    ImageButton f74764c1;

    /* renamed from: d1 */
    View f74765d1;

    /* renamed from: f1 */
    View f74767f1;

    /* renamed from: g1 */
    TextView f74768g1;

    /* renamed from: h1 */
    String f74769h1;

    /* renamed from: i1 */
    String f74770i1;

    /* renamed from: j1 */
    String f74771j1;

    /* renamed from: m1 */
    JSONObject f74774m1;

    /* renamed from: n1 */
    TextView f74775n1;

    /* renamed from: o1 */
    TextView f74776o1;

    /* renamed from: p1 */
    TextView f74777p1;

    /* renamed from: q1 */
    TextView f74778q1;

    /* renamed from: r1 */
    TextView f74779r1;

    /* renamed from: s1 */
    LinearLayout f74780s1;

    /* renamed from: t1 */
    LinearLayout f74781t1;

    /* renamed from: u1 */
    boolean f74782u1;

    /* renamed from: x1 */
    String f74785x1;

    /* renamed from: y1 */
    String f74786y1;

    /* renamed from: M0 */
    int f74746M0 = 0;

    /* renamed from: N0 */
    String f74748N0 = "";

    /* renamed from: O0 */
    long f74750O0 = 0;

    /* renamed from: R0 */
    String f74753R0 = "";

    /* renamed from: S0 */
    String f74754S0 = "";

    /* renamed from: U0 */
    int f74756U0 = 1;

    /* renamed from: e1 */
    boolean f74766e1 = true;

    /* renamed from: k1 */
    int f74772k1 = 0;

    /* renamed from: l1 */
    int f74773l1 = 0;

    /* renamed from: v1 */
    boolean f74783v1 = false;

    /* renamed from: w1 */
    boolean f74784w1 = true;

    /* renamed from: z1 */
    String f74787z1 = "";

    /* renamed from: A1 */
    int f74734A1 = 0;

    /* renamed from: B1 */
    String f74735B1 = "";

    /* renamed from: C1 */
    boolean f74736C1 = false;

    /* renamed from: D1 */
    boolean f74737D1 = false;

    /* renamed from: E1 */
    String f74738E1 = "";

    /* renamed from: F1 */
    String f74739F1 = "";

    /* renamed from: G1 */
    String f74740G1 = "";

    /* renamed from: H1 */
    final Object f74741H1 = new Object();

    /* renamed from: J1 */
    boolean f74743J1 = false;

    /* renamed from: K1 */
    final Object f74744K1 = new Object();

    /* renamed from: L1 */
    boolean f74745L1 = false;

    /* renamed from: M1 */
    final Object f74747M1 = new Object();

    /* renamed from: com.zing.zalo.ui.zviews.LoginView$a */
    /* loaded from: classes6.dex */
    public class C14522a implements KeyboardFrameLayout.InterfaceC13508a {
        C14522a() {
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            View view = LoginView.this.f74767f1;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            View view = LoginView.this.f74767f1;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.LoginView$b */
    /* loaded from: classes6.dex */
    public class C14523b extends AbstractC18391a {
        C14523b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            View view = LoginView.this.f74765d1;
            if (editable.length() > 0 && LoginView.this.f74762a1.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            view.setEnabled(z11);
            LoginView.this.f74775n1.setVisibility(8);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.LoginView$c */
    /* loaded from: classes6.dex */
    public class C14524c extends AbstractC18391a {
        C14524c() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            LoginView loginView = LoginView.this;
            View view = loginView.f74765d1;
            if (loginView.f74763b1.length() > 0 && editable.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            view.setEnabled(z11);
            LoginView.this.f74775n1.setVisibility(8);
            if (!editable.toString().equals(AbstractC23309i.m120742A5()) && !AbstractC23244v8.m119756t(editable.toString())) {
                AbstractC23304d.f113402k0 = editable.toString();
            } else {
                AbstractC23304d.f113402k0 = "";
            }
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (charSequence.length() == 0 && i12 > 0) {
                AbstractC23309i.m121576Wp("");
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.LoginView$d */
    /* loaded from: classes6.dex */
    public class C14525d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f74791a;

        /* renamed from: b */
        final /* synthetic */ String f74792b;

        /* renamed from: c */
        final /* synthetic */ long f74793c;

        C14525d(String str, String str2, long j11) {
            this.f74791a = str;
            this.f74792b = str2;
            this.f74793c = j11;
        }

        /* renamed from: d */
        public /* synthetic */ void m81243d() {
            LoginView.this.m81240sM();
            TextView textView = LoginView.this.f74775n1;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                synchronized (LoginView.this.f74741H1) {
                    LoginView loginView = LoginView.this;
                    loginView.f74736C1 = false;
                    loginView.f72421L0.mo49315c4();
                }
                LoginView.this.m81232HM(c20096c, this.f74791a, this.f74792b);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(LoginView.f74733O1, e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            boolean z12;
            LoginView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ev
                public /* synthetic */ RunnableC15602ev() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LoginView.C14525d.this.m81243d();
                }
            });
            InterfaceC27218a m92676n2 = LoginView.this.m92676n2();
            String str = this.f74791a;
            long j11 = this.f74793c;
            LoginView loginView = LoginView.this;
            if (loginView.f74772k1 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC23153n4.m119161y(m92676n2, obj, str, j11, z11, loginView.f74773l1, true, false);
            LoginView loginView2 = LoginView.this;
            if (AbstractC23309i.m121859e9() == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            loginView2.f74783v1 = z12;
            synchronized (LoginView.this.f74741H1) {
                try {
                    LoginView.this.f74736C1 = false;
                    if (C22438j.f109770a.m115960m().getAndSet(true)) {
                        LoginView.this.f72421L0.mo49315c4();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.LoginView$e */
    /* loaded from: classes6.dex */
    public class C14526e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f74795a;

        /* renamed from: b */
        final /* synthetic */ int f74796b;

        C14526e(String str, int i11) {
            this.f74795a = str;
            this.f74796b = i11;
        }

        /* renamed from: g */
        public /* synthetic */ void m81248g() {
            LoginView.this.f72421L0.showDialog(5);
        }

        /* renamed from: h */
        public /* synthetic */ void m81249h() {
            TextView textView = LoginView.this.f74775n1;
            if (textView != null) {
                textView.setVisibility(0);
                LoginView.this.f74775n1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_account_not_exits));
            }
        }

        /* renamed from: i */
        public /* synthetic */ void m81250i(String str) {
            if (LoginView.this.f74775n1 != null) {
                if (!TextUtils.isEmpty(str)) {
                    LoginView.this.f74775n1.setText(str);
                    LoginView.this.f74775n1.setVisibility(0);
                } else {
                    LoginView.this.f74775n1.setVisibility(8);
                }
            }
        }

        /* renamed from: j */
        public /* synthetic */ void m81251j(C20096c c20096c) {
            try {
                TextView textView = LoginView.this.f74775n1;
                if (textView != null) {
                    textView.setVisibility(0);
                    LoginView.this.f74775n1.setText(c20096c.m104492d());
                }
                if (c20096c.m104491c() == 2001) {
                    LoginView.this.f74762a1.requestFocus();
                } else if (c20096c.m104491c() == 2017) {
                    LoginView.this.f74763b1.requestFocus();
                }
                if ((c20096c.m104491c() == 2004 || c20096c.m104491c() == 2001 || c20096c.m104491c() == 2017) && !AbstractC23244v8.m119756t(LoginView.this.f74762a1.getText().toString())) {
                    AbstractC23309i.m121210Mt(1);
                    LoginView loginView = LoginView.this;
                    loginView.f74783v1 = true;
                    TextView textView2 = loginView.f74777p1;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            synchronized (LoginView.this.f74744K1) {
                LoginView loginView = LoginView.this;
                loginView.f74743J1 = false;
                loginView.f72421L0.mo49315c4();
            }
            if (AbstractC23216t1.m119643h(LoginView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.fv
                public /* synthetic */ C15639fv() {
                }

                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    LoginView.C14526e.this.m81250i(str);
                }
            })) {
                return;
            }
            try {
                if (LoginView.this.f72421L0.m92672lJ() && c20096c.m104491c() != 50001) {
                    C18489c.m97852r(true);
                }
                if (c20096c.m104491c() == 2050) {
                    JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                    InterfaceC27218a m92676n2 = LoginView.this.m92676n2();
                    String str = this.f74795a;
                    int i11 = this.f74796b;
                    LoginView loginView2 = LoginView.this;
                    AbstractC23153n4.m119151t(m92676n2, optJSONObject, ZAbstractBase.ZVU_BLEND_PERCENTAGE, str, i11, loginView2.f74772k1, loginView2.f74773l1);
                    return;
                }
                if (c20096c.m104491c() == 2060) {
                    JSONObject optJSONObject2 = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                    optJSONObject2.put("src_type", this.f74796b);
                    AbstractC23153n4.m119155v(LoginView.this.m92676n2(), optJSONObject2, 1004);
                } else {
                    if (c20096c.m104491c() == 2065) {
                        AbstractC2373t.m12412j();
                    }
                    if (LoginView.this.f72421L0.m92676n2() != null) {
                        LoginView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.gv

                            /* renamed from: q */
                            public final /* synthetic */ C20096c f80501q;

                            public /* synthetic */ RunnableC15676gv(C20096c c20096c2) {
                                r2 = c20096c2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                LoginView.C14526e.this.m81251j(r2);
                            }
                        });
                    }
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
                LoginView.this.f74742I1 = jSONObject.optString("sessionToken");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(LoginView.this.f74742I1)) {
                    JSONObject jSONObject2 = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString));
                    LoginView.this.f74769h1 = jSONObject2.optString("avatar_url");
                    LoginView.this.f74770i1 = jSONObject2.optString("dname");
                    LoginView.this.f74771j1 = jSONObject2.optString("uname");
                    InterfaceC27218a m92676n2 = LoginView.this.m92676n2();
                    String str = this.f74795a;
                    LoginView loginView = LoginView.this;
                    if (!AbstractC23153n4.m119139n(m92676n2, str, loginView.f74742I1, jSONObject, this.f74796b, loginView.f74772k1, loginView.f74773l1)) {
                        if (this.f74796b != 3 && TextUtils.isEmpty(LoginView.this.f74754S0)) {
                            if (LoginView.this.f72421L0.m92676n2() != null) {
                                LoginView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.hv
                                    public /* synthetic */ RunnableC15713hv() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        LoginView.C14526e.this.m81248g();
                                    }
                                });
                            }
                        }
                        LoginView.this.m81239rM(this.f74796b);
                    }
                } else {
                    LoginView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.iv
                        public /* synthetic */ RunnableC15749iv() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginView.C14526e.this.m81249h();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            synchronized (LoginView.this.f74744K1) {
                LoginView loginView2 = LoginView.this;
                loginView2.f74743J1 = false;
                loginView2.f72421L0.mo49315c4();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.LoginView$f */
    /* loaded from: classes6.dex */
    public class C14527f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f74798a;

        /* renamed from: b */
        final /* synthetic */ String f74799b;

        C14527f(int i11, String str) {
            this.f74798a = i11;
            this.f74799b = str;
        }

        /* renamed from: e */
        public /* synthetic */ void m81254e(String str) {
            if (LoginView.this.f74775n1 != null) {
                if (!TextUtils.isEmpty(str)) {
                    LoginView.this.f74775n1.setText(str);
                    LoginView.this.f74775n1.setVisibility(0);
                } else {
                    LoginView.this.f74775n1.setVisibility(8);
                }
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m81255f(C20096c c20096c) {
            TextView textView = LoginView.this.f74775n1;
            if (textView != null) {
                textView.setText(c20096c.m104492d());
                LoginView.this.f74775n1.setVisibility(0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            synchronized (LoginView.this.f74747M1) {
                LoginView loginView = LoginView.this;
                loginView.f74745L1 = false;
                loginView.f72421L0.mo49315c4();
            }
            if (AbstractC23216t1.m119643h(LoginView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.jv
                public /* synthetic */ C15786jv() {
                }

                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    LoginView.C14527f.this.m81254e(str);
                }
            })) {
                return;
            }
            try {
                if (c20096c.m104491c() != 2012 && c20096c.m104491c() != 2021) {
                    LoginView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.kv

                        /* renamed from: q */
                        public final /* synthetic */ C20096c f80945q;

                        public /* synthetic */ RunnableC15829kv(C20096c c20096c2) {
                            r2 = c20096c2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginView.C14527f.this.m81255f(r2);
                        }
                    });
                }
                JSONObject optJSONObject = new JSONObject(c20096c2.m104490b()).optJSONObject("data");
                InterfaceC27218a m92676n2 = LoginView.this.m92676n2();
                int i11 = this.f74798a;
                LoginView loginView2 = LoginView.this;
                AbstractC23153n4.m119159x(m92676n2, optJSONObject, false, i11, false, loginView2.f74742I1, this.f74799b, null, loginView2.f74772k1, loginView2.f74773l1);
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
                    InterfaceC27218a m92676n2 = LoginView.this.m92676n2();
                    int i11 = this.f74798a;
                    LoginView loginView = LoginView.this;
                    AbstractC23153n4.m119159x(m92676n2, optJSONObject, true, i11, false, loginView.f74742I1, this.f74799b, null, loginView.f74772k1, loginView.f74773l1);
                    synchronized (LoginView.this.f74747M1) {
                        LoginView loginView2 = LoginView.this;
                        loginView2.f74745L1 = false;
                        r02 = loginView2.f72421L0;
                        r02.mo49315c4();
                    }
                    z11 = r02;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (LoginView.this.f74747M1) {
                        LoginView loginView3 = LoginView.this;
                        loginView3.f74745L1 = false;
                        ?? r03 = loginView3.f72421L0;
                        r03.mo49315c4();
                        z11 = r03;
                    }
                }
            } catch (Throwable th2) {
                synchronized (LoginView.this.f74747M1) {
                    LoginView loginView4 = LoginView.this;
                    loginView4.f74745L1 = z11;
                    loginView4.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.LoginView$g */
    /* loaded from: classes6.dex */
    public class RunnableC14528g implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f74801p;

        RunnableC14528g(String str) {
            this.f74801p = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_URL", this.f74801p);
            LoginView.this.m92676n2().mo35573l4(WebInAppView.class, bundle, 1, true);
        }
    }

    /* renamed from: AM */
    public /* synthetic */ void m81207AM() {
        m81240sM();
        TextView textView = this.f74775n1;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: BM */
    public /* synthetic */ void m81208BM() {
        TextView textView = this.f74777p1;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: CM */
    public /* synthetic */ void m81209CM(C20096c c20096c) {
        JSONObject optJSONObject;
        EditText editText;
        EditText editText2;
        if (c20096c != null) {
            if (c20096c.m104491c() == 2004) {
                if (this.f74772k1 > 0) {
                    TextView textView = this.f74775n1;
                    if (textView != null) {
                        textView.setVisibility(0);
                        this.f74775n1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_account_not_exits));
                    }
                } else {
                    int i11 = this.f74734A1;
                    if (i11 > 0) {
                        TextView textView2 = this.f74775n1;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                        this.f72421L0.showDialog(6);
                    } else {
                        this.f74734A1 = i11 + 1;
                        TextView textView3 = this.f74775n1;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            this.f74775n1.setText(c20096c.m104492d());
                        }
                    }
                }
            } else if (c20096c.m104491c() == 2037) {
                this.f72421L0.showDialog(3);
            } else {
                String str = "";
                if (c20096c.m104491c() == 2034) {
                    this.f74740G1 = c20096c.m104492d();
                    try {
                        this.f74740G1 = new JSONObject(c20096c.m104490b()).optString("error_message", "");
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    this.f72421L0.showDialog(9);
                } else if (c20096c.m104491c() == 2046) {
                    Bundle bundle = new Bundle();
                    try {
                        JSONObject jSONObject = new JSONObject(c20096c.m104490b()).getJSONObject("data");
                        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("simpleInfo")) != null) {
                            str = optJSONObject.optString("dname");
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    bundle.putString("extra_account", this.f74762a1.getText().toString());
                    bundle.putString("extra_name", str);
                    bundle.putInt("EXTRA_FROM_SWITCH_ACCOUNT", this.f74772k1);
                    bundle.putInt("EXTRA_SOURCE_SWITCH_ACCOUNT", this.f74773l1);
                    this.f72421L0.m92662fJ().m93069k2(SetPasswordView.class, bundle, 1, true);
                } else if (c20096c.m104491c() == 2030) {
                    if (!TextUtils.isEmpty(c20096c.m104492d())) {
                        str = c20096c.m104492d();
                    }
                    this.f74753R0 = str;
                    this.f72421L0.showDialog(2);
                } else {
                    TextView textView4 = this.f74775n1;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                        this.f74775n1.setText(c20096c.m104492d());
                    }
                }
            }
            if (c20096c.m104491c() == 2001 && (editText2 = this.f74762a1) != null) {
                editText2.requestFocus();
            } else if (c20096c.m104491c() == 2017 && (editText = this.f74763b1) != null) {
                editText.requestFocus();
            }
            if (c20096c.m104491c() == 2020) {
                try {
                    JSONObject jSONObject2 = new JSONObject(c20096c.m104490b()).getJSONObject("data");
                    if (jSONObject2 != null && !jSONObject2.isNull("hasMsg") && jSONObject2.getInt("hasMsg") == 1) {
                        C3560a c3560a = new C3560a();
                        c3560a.m18091e(1);
                        c3560a.m18090d(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_ban_dialog));
                        c3560a.m18089c(jSONObject2.getString("message"));
                        m81235KM(c3560a);
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            if (c20096c.m104491c() == 2055) {
                try {
                    JSONObject jSONObject3 = new JSONObject(c20096c.m104490b()).getJSONObject("data");
                    if (jSONObject3 != null && jSONObject3.optInt("hasMsg") == 1) {
                        String optString = jSONObject3.optString("message");
                        this.f74754S0 = optString;
                        if (TextUtils.isEmpty(optString)) {
                            this.f74754S0 = AbstractC23136l9.m118743r0(AbstractC8020f0.deactivate_force_login_otp);
                        }
                        this.f72421L0.showDialog(8);
                    }
                    TextView textView5 = this.f74775n1;
                    if (textView5 != null) {
                        textView5.setVisibility(8);
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
        }
    }

    /* renamed from: DM */
    public /* synthetic */ void m81210DM(String str) {
        if (this.f74775n1 != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f74775n1.setVisibility(0);
                this.f74775n1.setText(str);
            } else {
                this.f74775n1.setVisibility(8);
            }
        }
    }

    /* renamed from: EM */
    public /* synthetic */ void m81211EM() {
        AbstractC2379w.m12432f(this.f74763b1);
    }

    /* renamed from: FM */
    public /* synthetic */ void m81212FM() {
        AbstractC2379w.m12432f(this.f74762a1);
    }

    /* renamed from: uM */
    public /* synthetic */ boolean m81225uM(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (view == this.f74762a1) {
                AbstractC23647d.m123897g("38513");
                return false;
            }
            if (view == this.f74763b1) {
                AbstractC23647d.m123897g("38514");
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: vM */
    public /* synthetic */ boolean m81226vM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 6) {
            View view = this.f74765d1;
            if (view != null) {
                view.performClick();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: wM */
    public /* synthetic */ void m81227wM(View view, boolean z11) {
        int i11;
        int i12;
        LinearLayout linearLayout = this.f74780s1;
        if (linearLayout != null) {
            if (z11) {
                i12 = AbstractC16803z.edt_active;
            } else {
                i12 = AbstractC16803z.edt_normal;
            }
            linearLayout.setBackgroundResource(i12);
        }
        LinearLayout linearLayout2 = this.f74781t1;
        if (linearLayout2 != null) {
            if (z11) {
                i11 = AbstractC16803z.edt_normal;
            } else {
                i11 = AbstractC16803z.edt_active;
            }
            linearLayout2.setBackgroundResource(i11);
        }
    }

    /* renamed from: xM */
    public /* synthetic */ void m81228xM(View view, boolean z11) {
        int i11;
        int i12;
        LinearLayout linearLayout = this.f74781t1;
        if (linearLayout != null) {
            if (z11) {
                i12 = AbstractC16803z.edt_active;
            } else {
                i12 = AbstractC16803z.edt_normal;
            }
            linearLayout.setBackgroundResource(i12);
        }
        LinearLayout linearLayout2 = this.f74780s1;
        if (linearLayout2 != null) {
            if (z11) {
                i11 = AbstractC16803z.edt_normal;
            } else {
                i11 = AbstractC16803z.edt_active;
            }
            linearLayout2.setBackgroundResource(i11);
        }
    }

    /* renamed from: yM */
    public static /* synthetic */ void m81229yM() {
        try {
            AbstractC23056e6.m118276b("113", false, false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f74733O1, e11);
        }
    }

    /* renamed from: zM */
    public /* synthetic */ void m81230zM(String str) {
        if (this.f74775n1 != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f74775n1.setText(str);
                this.f74775n1.setVisibility(0);
            } else {
                this.f74775n1.setVisibility(8);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            if (this.f72421L0.m92642L3() != null) {
                this.f74737D1 = this.f72421L0.m92642L3().getBoolean("extra_from_account_exist", false);
                this.f74772k1 = this.f72421L0.m92642L3().getInt("EXTRA_FROM_SWITCH_ACCOUNT", 0);
                this.f74773l1 = this.f72421L0.m92642L3().getInt("EXTRA_SOURCE_SWITCH_ACCOUNT", 0);
                this.f74751P0 = this.f72421L0.m92642L3().getString("EXTRA_FILL_ACCOUNT", "");
                this.f74752Q0 = this.f72421L0.m92642L3().getString("EXTRA_FILL_PASSWORD", "");
                String string = this.f72421L0.m92642L3().getString("EXTRA_DATA_SWITCH_ACCOUNT", "");
                if (!TextUtils.isEmpty(string)) {
                    this.f74774m1 = new JSONObject(string);
                }
                this.f74757V0 = AbstractC23306f.m120579F1();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        String str;
        if (i11 != 2) {
            if (i11 != 3) {
                String str2 = "";
                if (i11 != 5) {
                    if (i11 != 6) {
                        if (i11 != 8) {
                            if (i11 != 9) {
                                return null;
                            }
                            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                            aVar.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_can_not_login)).m43162k(this.f74740G1).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_recover_pass_func), this);
                            C8009j m43152a = aVar.m43152a();
                            m43152a.m92874z(false);
                            return m43152a;
                        }
                        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                        aVar2.m43159h(4);
                        aVar2.m43162k(this.f74754S0);
                        aVar2.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirmation_code), this);
                        aVar2.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_back), this);
                        return aVar2.m43152a();
                    }
                    if (AbstractC23309i.m121859e9() == 1) {
                        str = AbstractC23056e6.m118281g(this.f74762a1.getText().toString(), AbstractC23309i.m121704a5());
                    } else {
                        EditText editText = this.f74762a1;
                        if (editText == null || editText.getText() == null) {
                            str = "";
                        } else {
                            str = this.f74762a1.getText().toString();
                        }
                    }
                    if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                        EditText editText2 = this.f74762a1;
                        if (editText2 != null && editText2.getText() != null) {
                            str2 = this.f74762a1.getText().toString();
                        }
                        str = str2;
                    }
                    C2887l.a aVar3 = new C2887l.a(this.f72421L0.m92648SI());
                    aVar3.m13843f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_register_new_user)).m13839b(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone11)).m13841d(str).m13840c(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cap_skip), this).m13842e(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cap_register_new_user), this);
                    return aVar3.m13838a();
                }
                String m118282h = AbstractC23056e6.m118282h(this.f74762a1.getText().toString(), AbstractC23309i.m121704a5(), true);
                if (TextUtils.isEmpty(m118282h) || m118282h.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                    if (!TextUtils.isEmpty(AbstractC23304d.f113442u0)) {
                        str2 = AbstractC23304d.f113442u0;
                    } else {
                        EditText editText3 = this.f74762a1;
                        if (editText3 != null && editText3.getText() != null) {
                            str2 = this.f74762a1.getText().toString();
                        }
                    }
                    m118282h = str2;
                }
                C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
                aVar4.m43172u(AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleDlg_confirmPhone, m118282h)).m43173v(2).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_call)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), this);
                return aVar4.m43152a();
            }
            C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
            aVar5.m43159h(6).m43161j(AbstractC8020f0.security_question_activity_re_activation).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ok), this);
            C8009j m43152a2 = aVar5.m43152a();
            m43152a2.m92873y(false);
            return m43152a2;
        }
        C8009j.a aVar6 = new C8009j.a(this.f72421L0.m92648SI());
        aVar6.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlgUpdate)).m43162k(this.f74753R0).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close_app), this).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlgUpdate), this);
        C8009j m43152a3 = aVar6.m43152a();
        m43152a3.m92873y(false);
        return m43152a3;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.login_view, viewGroup, false);
        try {
            m81241tM(inflate, bundle);
            AbstractC23647d.m123897g("38511");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    /* renamed from: GM */
    void m81231GM() {
        try {
            m81240sM();
            this.f72421L0.mo49315c4();
            if (this.f74772k1 > 0) {
                finish();
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                AbstractC0924m0.m2972Cm(0);
                AbstractC0924m0.m3691bf("");
                this.f72421L0.m92662fJ().m93069k2(StartUpNewView.class, bundle, 2, true);
            }
            AbstractC23647d.m123897g("38512");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HM */
    void m81232HM(C20096c c20096c, String str, String str2) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (AbstractC23216t1.m119643h(this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.wu
            public /* synthetic */ C16315wu() {
            }

            @Override // me0.AbstractC23216t1.d
            /* renamed from: a */
            public final void mo68088a(String str3) {
                LoginView.this.m81210DM(str3);
            }
        })) {
            return;
        }
        if (c20096c.m104491c() == 2060) {
            AbstractC23153n4.m119155v(m92676n2(), new JSONObject(c20096c.m104490b()).optJSONObject("data"), 1005);
            return;
        }
        if (c20096c.m104491c() == 2058) {
            JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
            optJSONObject.put("password", str2);
            optJSONObject.put("login_by_password", this.f74756U0);
            AbstractC23153n4.m119151t(m92676n2(), optJSONObject, ZAbstractBase.ZVU_BLEND_GEN_THUMB, str, 1, this.f74772k1, this.f74773l1);
            return;
        }
        if ((c20096c.m104491c() == 2036 || c20096c.m104491c() == 2033) && !TextUtils.isEmpty(c20096c.m104490b())) {
            try {
                JSONObject jSONObject = new JSONObject(c20096c.m104490b()).getJSONObject("data");
                jSONObject.put("EXTRA_PASSWORD", this.f74786y1);
                jSONObject.put("EXTRA_CAPTCHA_VALUE", this.f74738E1);
                jSONObject.put("EXTRA_CAPTCHA_TOKEN", this.f74739F1);
                jSONObject.put("EXTRA_FROM_SWITCH_ACCOUNT", this.f74772k1);
                jSONObject.put("EXTRA_SOURCE_SWITCH_ACCOUNT", this.f74773l1);
                AbstractC23153n4.m119157w(m92676n2(), jSONObject, 1001, this.f74785x1, null);
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.xu
                    public /* synthetic */ RunnableC16352xu() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginView.this.m81240sM();
                    }
                });
                synchronized (this.f74741H1) {
                    this.f74736C1 = false;
                    this.f72421L0.mo49315c4();
                }
                return;
            } catch (Exception e12) {
                AbstractC23350e.m122776f(f74733O1, e12);
            }
        } else {
            if (c20096c.m104491c() == 2048) {
                try {
                    AbstractC23153n4.m119155v(m92676n2(), new JSONObject(c20096c.m104490b()).optJSONObject("data"), 999);
                    synchronized (this.f74741H1) {
                        this.f74736C1 = false;
                        this.f72421L0.mo49315c4();
                    }
                    String m118285k = AbstractC23056e6.m118285k(str);
                    if (!TextUtils.isEmpty(m118285k) && !m118285k.equals(AbstractC23056e6.f112062a)) {
                        str = m118285k;
                    }
                    if (str.equals(this.f74748N0) && System.currentTimeMillis() < this.f74750O0) {
                        this.f74746M0++;
                        return;
                    }
                    this.f74746M0 = 1;
                    this.f74748N0 = str;
                    this.f74750O0 = System.currentTimeMillis() + 180000;
                    return;
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            } else if (c20096c.m104491c() == 2065) {
                AbstractC2373t.m12412j();
            }
            if (c20096c.m104491c() == 2004 || c20096c.m104491c() == 2001 || c20096c.m104491c() == 2017) {
                try {
                    char[] charArray = this.f74762a1.getText().toString().toCharArray();
                    if (c20096c.m104491c() == 2017) {
                        for (char c11 : charArray) {
                            if ((c11 >= 'a' && c11 <= 'z') || (c11 >= 'A' && c11 <= 'Z')) {
                                break;
                            }
                        }
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
                AbstractC23309i.m121210Mt(1);
                this.f74783v1 = true;
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.yu
                        public /* synthetic */ RunnableC16389yu() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginView.this.m81208BM();
                        }
                    });
                }
            }
            if (c20096c.m104491c() != 50001) {
                C18489c.m97852r(true);
            }
            if (this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.zu

                    /* renamed from: q */
                    public final /* synthetic */ C20096c f82879q;

                    public /* synthetic */ RunnableC16426zu(C20096c c20096c2) {
                        r2 = c20096c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginView.this.m81209CM(r2);
                    }
                });
                return;
            }
            return;
        }
        e11.printStackTrace();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        this.f72421L0.mo49315c4();
        super.mo39024IJ();
    }

    /* renamed from: IM */
    public void m81233IM() {
        try {
            ZaloWebView.m87103hS(this.f72421L0.m92676n2(), String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ratezalo_url), this.f72421L0.m92648SI().getPackageName()));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: JM */
    public void m81234JM() {
        EditText editText = this.f74762a1;
        if (editText != null && this.f74764c1 != null) {
            if (this.f74766e1) {
                editText.setInputType(3);
                AbstractC2379w.m12432f(this.f74762a1);
                this.f74764c1.setImageResource(AbstractC16803z.login_abc);
                AbstractC23309i.m122394sh(true);
                return;
            }
            editText.setInputType(32);
            AbstractC2379w.m12432f(this.f74762a1);
            this.f74764c1.setImageResource(AbstractC16803z.login_123);
            AbstractC23309i.m122394sh(false);
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            switch (interfaceC17463d.mo92862f()) {
                case 0:
                    if (i11 == -2) {
                        AbstractC23647d.m123907q("19405", "");
                        interfaceC17463d.dismiss();
                        AbstractC23647d.m123893c();
                        EditText editText = this.f74762a1;
                        if (editText != null) {
                            editText.requestFocus();
                            return;
                        }
                        return;
                    }
                    if (i11 == -1) {
                        AbstractC23647d.m123907q("19406", "");
                        interfaceC17463d.dismiss();
                        AbstractC23647d.m123893c();
                        return;
                    }
                    return;
                case 1:
                    if (i11 == -2) {
                        interfaceC17463d.dismiss();
                        EditText editText2 = this.f74762a1;
                        if (editText2 != null) {
                            editText2.requestFocus();
                            return;
                        }
                        return;
                    }
                    if (i11 == -1) {
                        interfaceC17463d.dismiss();
                        m81239rM(1);
                        return;
                    }
                    return;
                case 2:
                    if (i11 == -2) {
                        interfaceC17463d.dismiss();
                        m81233IM();
                        AbstractC23059e9.m118334m(this.f72421L0.m92676n2());
                        return;
                    } else {
                        if (i11 == -1) {
                            interfaceC17463d.dismiss();
                            AbstractC23059e9.m118334m(this.f72421L0.m92676n2());
                            return;
                        }
                        return;
                    }
                case 3:
                case 9:
                    if (i11 == -1) {
                        try {
                            interfaceC17463d.dismiss();
                            EditText editText3 = this.f74762a1;
                            if (editText3 != null) {
                                this.f74785x1 = editText3.getText().toString().trim();
                            }
                            if (m81238qM(true, false)) {
                                m81236LM(this.f74785x1, 1);
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                    }
                    return;
                case 4:
                    if (i11 == -2) {
                        interfaceC17463d.dismiss();
                        this.f74762a1.requestFocus();
                        return;
                    } else {
                        if (i11 == -1) {
                            interfaceC17463d.dismiss();
                            return;
                        }
                        return;
                    }
                case 5:
                    if (i11 == -2) {
                        AbstractC23647d.m123906p("19800");
                        AbstractC23647d.m123893c();
                        interfaceC17463d.dismiss();
                        EditText editText4 = this.f74762a1;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        }
                        return;
                    }
                    if (i11 == -1) {
                        AbstractC23647d.m123906p("19801");
                        AbstractC23647d.m123893c();
                        interfaceC17463d.dismiss();
                        m81239rM(1);
                        return;
                    }
                    return;
                case 6:
                    if (i11 == -2) {
                        AbstractC23647d.m123906p("19802");
                        AbstractC23647d.m123893c();
                        interfaceC17463d.dismiss();
                        return;
                    } else {
                        if (i11 == -1) {
                            AbstractC23647d.m123906p("19803");
                            AbstractC23647d.m123893c();
                            interfaceC17463d.dismiss();
                            m81240sM();
                            Bundle bundle = new Bundle();
                            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                            AbstractC23304d.f113402k0 = this.f74785x1;
                            if (C17670w0.f89662a.m93652d() == 0) {
                                this.f72421L0.m92662fJ().m93069k2(UpdateNameView.class, bundle, 1, true);
                            } else {
                                this.f72421L0.m92662fJ().m93069k2(EnterUserNumberPhoneView.class, null, 1, true);
                            }
                            this.f72421L0.mo49315c4();
                            return;
                        }
                        return;
                    }
                case 7:
                default:
                    return;
                case 8:
                    if (-1 == i11) {
                        interfaceC17463d.dismiss();
                        EditText editText5 = this.f74762a1;
                        if (editText5 != null) {
                            this.f74785x1 = editText5.getText().toString().trim();
                        }
                        if (m81238qM(true, false)) {
                            m81236LM(this.f74785x1, 1);
                            return;
                        }
                        return;
                    }
                    if (-2 == i11) {
                        interfaceC17463d.dismiss();
                        return;
                    }
                    return;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        e12.printStackTrace();
    }

    /* renamed from: KM */
    public void m81235KM(C3560a c3560a) {
        try {
            if (this.f74749N1 == null) {
                ConfirmDialogView confirmDialogView = (ConfirmDialogView) this.f72421L0.m92649TI().m92996E0("ban_dialog");
                this.f74749N1 = confirmDialogView;
                if (confirmDialogView != null) {
                    confirmDialogView.dismiss();
                    this.f74749N1 = null;
                }
            }
            if (this.f74749N1 == null) {
                this.f74749N1 = new ConfirmDialogView();
            }
            Spanned fromHtml = Html.fromHtml(c3560a.m18087a());
            SpannableString spannableString = new SpannableString(fromHtml);
            Linkify.addLinks(spannableString, 6);
            String obj = fromHtml.toString();
            int indexOf = obj.indexOf("(");
            int indexOf2 = obj.indexOf(")", indexOf);
            if (indexOf >= 0 && indexOf2 > indexOf) {
                int i11 = indexOf + 1;
                String trim = obj.substring(i11, indexOf2).trim();
                if (trim.startsWith("http")) {
                    spannableString.setSpan(new C23225u.a(i11, indexOf2, new RunnableC14528g(trim)), i11, indexOf2, 33);
                }
            }
            this.f74749N1.mo43041MK(true);
            this.f74749N1.m42854bL(c3560a.m18088b());
            this.f74749N1.m42850XK(spannableString);
            this.f74749N1.m42852ZK(AbstractC8020f0.str_close, new InterfaceC17463d.b());
            this.f74749N1.m92602UK(this.f72421L0.m92649TI(), "ban_dialog");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LM */
    public void m81236LM(String str, int i11) {
        AbstractC23304d.f113398j0 = str;
        synchronized (this.f74744K1) {
            try {
                if (this.f74743J1) {
                    this.f72421L0.mo46829Y();
                    return;
                }
                this.f74743J1 = true;
                this.f72421L0.mo46829Y();
                String str2 = "";
                if (AbstractC23309i.m121859e9() == 1) {
                    str2 = AbstractC23309i.m121704a5();
                }
                String str3 = AbstractC18458a.f93019a;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14526e(str, i11));
                c0766k.m1809F0(str, str2, str3, this.f74738E1, this.f74739F1, i11, this.f74772k1, this.f74773l1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 != 16908332) {
            return super.mo37491QJ(i11);
        }
        m81231GM();
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.m124114c().m124117e(this, 37);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            try {
                bundle.putString("onSave", AbstractC23304d.f113398j0);
                bundle.putString("zalo_phoneNumber", AbstractC23304d.f113438t0);
                bundle.putString("phoneNumberE164Server", AbstractC23304d.f113442u0);
                bundle.putString("sms_gateWay", AbstractC23304d.f113446v0);
                bundle.putString("sms_format", AbstractC23304d.f113458y0);
                bundle.putString("sms_content_hint", AbstractC23304d.f113454x0);
                bundle.putString("last_submit_phone_num", this.f74735B1);
                bundle.putInt("wrong_submit_phone_count", this.f74734A1);
                bundle.putBoolean("IS_SHOW_COUNTRY", this.f74783v1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
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
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        EditText editText;
        super.mo37122XJ(z11, z12);
        if (z11) {
            try {
                this.f72421L0.m92676n2().mo35554O(16);
                if (!z12 && (editText = this.f74762a1) != null && this.f74763b1 != null) {
                    if (!TextUtils.isEmpty(editText.getText().toString().trim())) {
                        AbstractC2379w.m12432f(this.f74763b1);
                    } else {
                        AbstractC2379w.m12432f(this.f74762a1);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f74733O1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        EditText editText;
        EditText editText2;
        super.onActivityResult(i11, i12, intent);
        boolean z11 = true;
        try {
            switch (i11) {
                case 999:
                case 1004:
                case 1005:
                    if (i12 != -1 || intent == null) {
                        return;
                    }
                    try {
                        String stringExtra = intent.getStringExtra("data");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            JSONObject jSONObject = new JSONObject(stringExtra);
                            if (jSONObject.has("error_code")) {
                                int i13 = jSONObject.getInt("error_code");
                                if (i13 == 0) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                    if (optJSONObject != null) {
                                        if (i11 == 999) {
                                            int optInt = optJSONObject.optInt("verificationType", 0);
                                            if (optInt == 1) {
                                                String optString = optJSONObject.optString("verificationToken");
                                                this.f74785x1 = this.f74762a1.getText().toString().trim();
                                                m81237pM(AbstractC23309i.m121859e9() == 1 ? AbstractC23309i.m121704a5() : "", this.f74785x1, this.f74763b1.getText().toString(), optString, "");
                                                return;
                                            } else {
                                                if (optInt == 2) {
                                                    EditText editText3 = this.f74762a1;
                                                    if (editText3 != null) {
                                                        this.f74785x1 = editText3.getText().toString().trim();
                                                    }
                                                    if (m81238qM(true, false)) {
                                                        m81236LM(this.f74785x1, 1);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        if (i11 == 1004) {
                                            String optString2 = optJSONObject.optString("captchaToken", "");
                                            this.f74739F1 = optString2;
                                            if (TextUtils.isEmpty(optString2) || (editText = this.f74762a1) == null) {
                                                return;
                                            }
                                            this.f74785x1 = editText.getText().toString().trim();
                                            m81236LM(this.f74785x1, intent.getIntExtra("src_type", 1));
                                            return;
                                        }
                                        if (i11 != 1005) {
                                            return;
                                        }
                                        String optString3 = optJSONObject.optString("captchaToken", "");
                                        this.f74739F1 = optString3;
                                        if (TextUtils.isEmpty(optString3) || (editText2 = this.f74762a1) == null || this.f74763b1 == null) {
                                            return;
                                        }
                                        this.f74785x1 = editText2.getText().toString().trim();
                                        m81237pM(AbstractC23309i.m121859e9() == 1 ? AbstractC23309i.m121704a5() : "", this.f74785x1, this.f74763b1.getText().toString(), null, this.f74739F1);
                                        return;
                                    }
                                    return;
                                }
                                C20096c c20096c = new C20096c(i13, jSONObject.optString("error_message", ""));
                                c20096c.m104494f(stringExtra);
                                if (AbstractC23216t1.m119643h(this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.ru
                                    public /* synthetic */ C16107ru() {
                                    }

                                    @Override // me0.AbstractC23216t1.d
                                    /* renamed from: a */
                                    public final void mo68088a(String str) {
                                        LoginView.this.m81230zM(str);
                                    }
                                })) {
                                    return;
                                }
                                if (i13 == 1002) {
                                    TextView textView = this.f74775n1;
                                    if (textView != null) {
                                        textView.setVisibility(0);
                                        this.f74775n1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_session_expired_web, Integer.valueOf(i13)));
                                        return;
                                    }
                                    return;
                                }
                                if (i13 == 1112) {
                                    TextView textView2 = this.f74775n1;
                                    if (textView2 != null) {
                                        textView2.setVisibility(0);
                                        this.f74775n1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_unknown, Integer.valueOf(i13)));
                                        return;
                                    }
                                    return;
                                }
                                TextView textView3 = this.f74775n1;
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                    this.f74775n1.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_unknown, Integer.valueOf(i13)));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (intent.getIntExtra("fall_back", 0) == 1) {
                            this.f74746M0 = 2;
                            this.f74785x1 = this.f74762a1.getText().toString().trim();
                            m81237pM(AbstractC23309i.m121859e9() == 1 ? AbstractC23309i.m121704a5() : "", this.f74785x1, this.f74763b1.getText().toString(), null, "");
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                case 1000:
                default:
                    return;
                case 1001:
                    if (i12 == -1) {
                        EditText editText4 = this.f74762a1;
                        if (editText4 != null) {
                            this.f74785x1 = editText4.getText().toString().trim();
                        }
                        if (intent != null && TextUtils.isEmpty(this.f74754S0)) {
                            this.f74754S0 = intent.getStringExtra("msg_force_login_otp") != null ? intent.getStringExtra("msg_force_login_otp") : "";
                        }
                        if (m81238qM(true, false)) {
                            m81236LM(this.f74785x1, 1);
                            return;
                        }
                        return;
                    }
                    return;
                case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                    if (i12 != -1 || intent == null) {
                        return;
                    }
                    String stringExtra2 = intent.getStringExtra("data");
                    int intExtra = intent.getIntExtra("srcType", 0);
                    if (TextUtils.isEmpty(stringExtra2)) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(stringExtra2);
                    String optString4 = jSONObject2.optString("identifier");
                    this.f74742I1 = jSONObject2.optString("sessionToken");
                    if (TextUtils.isEmpty(optString4) || TextUtils.isEmpty(this.f74742I1)) {
                        TextView textView4 = this.f74775n1;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            this.f74775n1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_account_not_exits));
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject3 = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString4));
                    this.f74769h1 = jSONObject3.optString("avatar_url");
                    this.f74770i1 = jSONObject3.optString("dname");
                    this.f74771j1 = jSONObject3.optString("uname");
                    if (AbstractC23153n4.m119139n(m92676n2(), this.f74785x1, this.f74742I1, jSONObject2, intExtra, this.f74772k1, this.f74773l1)) {
                        return;
                    }
                    if (intExtra != 3 && TextUtils.isEmpty(this.f74754S0)) {
                        this.f72421L0.showDialog(5);
                        return;
                    }
                    m81239rM(intExtra);
                    return;
                case ZAbstractBase.ZVU_BLEND_GEN_THUMB /* 1003 */:
                    if (i12 != -1 || intent == null) {
                        return;
                    }
                    try {
                        if (intent.hasExtra("error_code")) {
                            int intExtra2 = intent.getIntExtra("error_code", 0);
                            if (intExtra2 == 0) {
                                String stringExtra3 = intent.getStringExtra("data");
                                String stringExtra4 = intent.getStringExtra("phone_num");
                                long longExtra = intent.getLongExtra("send_request_time", 0L);
                                if (!TextUtils.isEmpty(stringExtra3)) {
                                    mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.vu
                                        public /* synthetic */ RunnableC16278vu() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            LoginView.this.m81207AM();
                                        }
                                    });
                                    AbstractC23153n4.m119161y(m92676n2(), new JSONObject(stringExtra3), stringExtra4, longExtra, this.f74772k1 > 0, this.f74773l1, true, false);
                                    if (AbstractC23309i.m121859e9() != 1) {
                                        z11 = false;
                                    }
                                    this.f74783v1 = z11;
                                }
                            } else {
                                String stringExtra5 = intent.getStringExtra("phone_num");
                                String stringExtra6 = intent.getStringExtra("password");
                                String stringExtra7 = intent.getStringExtra("msg");
                                String stringExtra8 = intent.getStringExtra("data");
                                this.f74738E1 = intent.getStringExtra("captcha_value");
                                this.f74739F1 = intent.getStringExtra("captcha_token");
                                C20096c c20096c2 = new C20096c(intExtra2, stringExtra7);
                                c20096c2.m104494f(stringExtra8);
                                m81232HM(c20096c2, stringExtra5, stringExtra6);
                            }
                        }
                        return;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        return;
                    }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        e13.printStackTrace();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String m121704a5;
        String str;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tv_show_password) {
            boolean z11 = !this.f74782u1;
            this.f74782u1 = z11;
            if (z11) {
                AbstractC23647d.m123897g("38518");
                this.f74763b1.setInputType(145);
                EditText editText = this.f74763b1;
                editText.setSelection(editText.getText().length());
                this.f74779r1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.startup_hide_password));
            } else {
                this.f74763b1.setInputType(129);
                EditText editText2 = this.f74763b1;
                editText2.setSelection(editText2.getText().length());
                this.f74779r1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.startup_show_password));
            }
            this.f74763b1.setTypeface(Typeface.DEFAULT);
            return;
        }
        if (id2 == AbstractC6918a0.btnInput) {
            this.f74766e1 = !this.f74766e1;
            m81234JM();
            return;
        }
        if (id2 == AbstractC6918a0.btnLogin) {
            AbstractC23647d.m123907q("19407", "");
            AbstractC23647d.m123893c();
            AbstractC23647d.m123897g("38519");
            this.f74785x1 = this.f74762a1.getText().toString().trim();
            this.f74786y1 = this.f74763b1.getText().toString();
            if (m81238qM(true, true)) {
                String str2 = this.f74785x1;
                AbstractC23304d.f113398j0 = str2;
                if (!str2.equals(this.f74735B1)) {
                    this.f74735B1 = this.f74785x1;
                    this.f74734A1 = 0;
                }
                if (AbstractC23309i.m121859e9() == 0) {
                    TextView textView = this.f74777p1;
                    if (textView == null || textView.getVisibility() != 8) {
                        m121704a5 = "";
                    } else {
                        m121704a5 = AbstractC23309i.m121817d5(this.f74785x1);
                        if (!TextUtils.isEmpty(m121704a5)) {
                            AbstractC23309i.m122587xp(m121704a5);
                            AbstractC20887g.m109229g(125030, 125038, m121704a5);
                        }
                    }
                } else {
                    m121704a5 = AbstractC23309i.m121704a5();
                }
                if (AbstractC23244v8.m119756t(this.f74785x1)) {
                    str = "";
                } else {
                    str = m121704a5;
                }
                m81237pM(str, this.f74785x1, this.f74786y1, null, "");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.tvCountryName) {
            m81240sM();
            this.f72421L0.m92662fJ().m93069k2(CountryListView.class, null, 1, true);
            return;
        }
        if (id2 != AbstractC6918a0.tvCountryNameTemp) {
            if (id2 == AbstractC6918a0.tvForgotPassword) {
                AbstractC23647d.m123907q("19404", "");
                AbstractC23647d.m123893c();
                EditText editText3 = this.f74762a1;
                if (editText3 != null) {
                    this.f74785x1 = editText3.getText().toString().trim();
                }
                if (this.f74785x1.length() > 0) {
                    if (AbstractC23244v8.m119756t(this.f74785x1)) {
                        AbstractC23647d.m123897g("38517");
                    } else {
                        AbstractC23647d.m123897g("38516");
                    }
                } else {
                    AbstractC23647d.m123897g("38515");
                }
                if (this.f74772k1 > 0 && this.f74774m1 != null) {
                    m81236LM(this.f74785x1, 3);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("extra_account", this.f74785x1);
                bundle.putInt("EXTRA_FROM_SWITCH_ACCOUNT", this.f74772k1);
                bundle.putInt("EXTRA_SOURCE_SWITCH_ACCOUNT", this.f74773l1);
                this.f72421L0.m92662fJ().m93069k2(GetPasswordView.class, bundle, 1, true);
                return;
            }
            if (id2 == AbstractC6918a0.tvFAQ) {
                m81240sM();
                Bundle bundle2 = new Bundle();
                bundle2.putString("open_url", AbstractC23306f.m120583H().m110204g().m116317i());
                this.f72421L0.m92662fJ().m93069k2(PolicyZView.class, bundle2, 1, true);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m81231GM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        try {
            EditText editText = this.f74762a1;
            if (editText != null && this.f74763b1 != null) {
                if (!TextUtils.isEmpty(editText.getText().toString().trim())) {
                    this.f74763b1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.av
                        public /* synthetic */ RunnableC15451av() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginView.this.m81211EM();
                        }
                    }, 100L);
                } else {
                    this.f74762a1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.bv
                        public /* synthetic */ RunnableC15488bv() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginView.this.m81212FM();
                        }
                    }, 100L);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            C23744a.m124114c().m124115b(this, 37);
            this.f74777p1.setText(AbstractC23309i.m121704a5());
            C28023b6.m141250h0().m141277D();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pM */
    public void m81237pM(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7;
        int i11;
        int i12;
        if (C23055e5.m118272g(true)) {
            synchronized (this.f74741H1) {
                try {
                    if (this.f74736C1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    this.f74754S0 = "";
                    if (AbstractC23244v8.m119756t(str2)) {
                        str7 = str2;
                        str6 = "";
                    } else {
                        str6 = str;
                        str7 = str2;
                    }
                    String m118290p = AbstractC23056e6.m118290p(str7, str6);
                    synchronized (this.f74741H1) {
                        this.f74736C1 = true;
                        this.f72421L0.mo46829Y();
                    }
                    this.f74787z1 = AbstractC23353h.m122790b(AbstractC23352g.m122788d(CoreUtility.f89225a + m118290p), str3);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14525d(str2, str3, elapsedRealtime));
                    String str8 = "";
                    if (this.f74772k1 > 0) {
                        str8 = AbstractC23179p8.m119418d(CoreUtility.f89233i);
                    }
                    String str9 = str8;
                    if (TextUtils.isEmpty(str4)) {
                        String m118285k = AbstractC23056e6.m118285k(str2);
                        if (TextUtils.isEmpty(m118285k) || m118285k.equals(AbstractC23056e6.f112062a)) {
                            m118285k = str7;
                        }
                        if (this.f74746M0 >= 2 && m118285k.equals(this.f74748N0)) {
                            this.f74756U0 = 2;
                            String str10 = this.f74787z1;
                            if (this.f74746M0 >= 2) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            c0766k.mo1601b4(str2, str10, str6, i12, this.f74772k1, str9, this.f74773l1, "", str5);
                            return;
                        }
                        if (this.f74737D1) {
                            i11 = 3;
                        } else {
                            i11 = 1;
                        }
                        this.f74756U0 = 1;
                        c0766k.mo1654h9(str2, this.f74787z1, str6, i11, this.f74772k1, str9, this.f74773l1, "", str5);
                        return;
                    }
                    c0766k.mo1718q6(str2, this.f74787z1, str6, str4, null, this.f74772k1, str9, this.f74773l1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: qM */
    public boolean m81238qM(boolean z11, boolean z12) {
        if (z11 && TextUtils.isEmpty(this.f74785x1)) {
            this.f74762a1.requestFocus();
            this.f74775n1.setVisibility(0);
            this.f74775n1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone12));
            return false;
        }
        if (z12 && TextUtils.isEmpty(this.f74786y1)) {
            this.f74763b1.requestFocus();
            this.f74775n1.setVisibility(0);
            this.f74775n1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_empty_password));
            return false;
        }
        return true;
    }

    /* renamed from: rM */
    void m81239rM(int i11) {
        String str;
        if (!TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
            synchronized (this.f74747M1) {
                try {
                    if (this.f74745L1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    this.f74745L1 = true;
                    this.f72421L0.mo46829Y();
                    String obj = this.f74762a1.getText().toString();
                    if (AbstractC23309i.m121859e9() == 1) {
                        str = AbstractC23309i.m121704a5();
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14527f(i11, obj));
                    AbstractC23304d.f113289J.clear();
                    AbstractC23304d.f113399j1 = System.currentTimeMillis();
                    c0766k.mo1539T5(AbstractC23304d.f113398j0, str2, this.f74742I1, 0, 0, i11, this.f74772k1, this.f74773l1, AbstractC23034c6.m118110A());
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        TextView textView = this.f74775n1;
        if (textView != null) {
            textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
            this.f74775n1.setVisibility(0);
        }
    }

    /* renamed from: sM */
    public void m81240sM() {
        EditText editText = this.f74762a1;
        if (editText != null && this.f74763b1 != null) {
            AbstractC2379w.m12430d(editText);
            AbstractC2379w.m12430d(this.f74763b1);
        }
    }

    /* renamed from: tM */
    void m81241tM(View view, Bundle bundle) {
        boolean z11;
        int i11;
        char charAt;
        this.f74755T0 = (KeyboardFrameLayout) view.findViewById(AbstractC6918a0.keyboard_root_view);
        this.f74765d1 = view.findViewById(AbstractC6918a0.btnLogin);
        this.f74762a1 = (EditText) view.findViewById(AbstractC6918a0.edtAccount);
        this.f74763b1 = (EditText) view.findViewById(AbstractC6918a0.edtPass);
        this.f74764c1 = (ImageButton) view.findViewById(AbstractC6918a0.btnInput);
        this.f74780s1 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutAccount);
        this.f74781t1 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutPassword);
        this.f74761Z0 = view.findViewById(AbstractC6918a0.ll_switch_account);
        this.f74760Y0 = (GroupAvatarView) view.findViewById(AbstractC6918a0.avatar);
        this.f74759X0 = (TextView) view.findViewById(AbstractC6918a0.tv_name);
        this.f74758W0 = (TextView) view.findViewById(AbstractC6918a0.tv_phone);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tvHintLogin);
        if (AbstractC23309i.m121343Qe()) {
            this.f74774m1 = null;
        }
        int i12 = 8;
        if (this.f74772k1 > 0 && this.f74774m1 != null) {
            this.f74761Z0.setVisibility(0);
            this.f74780s1.setVisibility(8);
            textView.setVisibility(8);
            ContactProfile contactProfile = new ContactProfile(this.f74774m1.optString("uid"));
            contactProfile.f42446v = this.f74774m1.optString("avt", "");
            contactProfile.f42437s = this.f74774m1.optString("name", "");
            contactProfile.f42455y = this.f74774m1.optString("phone", "");
            contactProfile.f42427o1 = AbstractC23028c0.m118087g(contactProfile.f42437s);
            this.f74760Y0.m75731c(contactProfile);
            this.f74759X0.setText(contactProfile.f42437s);
            this.f74758W0.setText(contactProfile.f42455y);
            this.f74762a1.setText(contactProfile.f42455y);
        }
        TextView textView2 = (TextView) view.findViewById(AbstractC6918a0.tv_show_password);
        this.f74779r1 = textView2;
        textView2.setOnClickListener(this);
        this.f74755T0.setOnKeyboardListener(new C14522a());
        this.f74764c1.setOnClickListener(this);
        if (AbstractC23309i.m121829dg()) {
            this.f74766e1 = AbstractC23309i.m122576xe();
            m81234JM();
        } else {
            this.f74766e1 = true;
            m81234JM();
            this.f74764c1.setVisibility(8);
            this.f74762a1.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_input_account_phone_number));
        }
        this.f74765d1.setOnClickListener(this);
        View view2 = this.f74765d1;
        if (this.f74763b1.length() > 0 && this.f74762a1.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        view2.setEnabled(z11);
        this.f74763b1.addTextChangedListener(new C14523b());
        this.f74762a1.addTextChangedListener(new C14524c());
        ViewOnTouchListenerC15524cv viewOnTouchListenerC15524cv = new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.cv
            public /* synthetic */ ViewOnTouchListenerC15524cv() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                boolean m81225uM;
                m81225uM = LoginView.this.m81225uM(view3, motionEvent);
                return m81225uM;
            }
        };
        this.f74762a1.setOnTouchListener(viewOnTouchListenerC15524cv);
        this.f74763b1.setOnTouchListener(viewOnTouchListenerC15524cv);
        this.f74763b1.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.dv
            public /* synthetic */ C15565dv() {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                boolean m81226vM;
                m81226vM = LoginView.this.m81226vM(textView3, i13, keyEvent);
                return m81226vM;
            }
        });
        this.f74763b1.setTypeface(Typeface.DEFAULT);
        TextView textView3 = (TextView) view.findViewById(AbstractC6918a0.tvError);
        this.f74775n1 = textView3;
        textView3.setVisibility(8);
        if (AbstractC23309i.m121829dg()) {
            i11 = AbstractC8020f0.str_hint_login_account;
        } else {
            i11 = AbstractC8020f0.hint_login_phone_number;
        }
        textView.setText(AbstractC23136l9.m118743r0(i11));
        TextView textView4 = (TextView) view.findViewById(AbstractC6918a0.tvCountryName);
        this.f74777p1 = textView4;
        textView4.setOnClickListener(this);
        this.f74777p1.setVisibility(8);
        TextView textView5 = (TextView) view.findViewById(AbstractC6918a0.tvCountryNameTemp);
        this.f74778q1 = textView5;
        textView5.setOnClickListener(this);
        this.f74778q1.setVisibility(8);
        TextView textView6 = (TextView) view.findViewById(AbstractC6918a0.tvForgotPassword);
        this.f74776o1 = textView6;
        textView6.setOnClickListener(this);
        this.f74762a1.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.ui.zviews.su
            public /* synthetic */ ViewOnFocusChangeListenerC16167su() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z12) {
                LoginView.this.m81227wM(view3, z12);
            }
        });
        this.f74763b1.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.ui.zviews.tu
            public /* synthetic */ ViewOnFocusChangeListenerC16204tu() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z12) {
                LoginView.this.m81228xM(view3, z12);
            }
        });
        String[] m118183v = AbstractC23034c6.m118183v();
        if (this.f74784w1 && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), m118183v) != 0) {
            this.f74784w1 = false;
            AbstractC23034c6.m118186w0((BaseZaloActivity) this.f72421L0.m92648SI(), m118183v, 106);
        }
        String m120742A5 = AbstractC23309i.m120742A5();
        if (!TextUtils.isEmpty(this.f74751P0)) {
            this.f74762a1.setText(this.f74751P0);
        } else if (this.f74772k1 > 0) {
            this.f74762a1.setText("");
        } else if (!TextUtils.isEmpty(AbstractC23304d.f113406l0)) {
            this.f74762a1.setText(AbstractC23304d.f113406l0);
        } else if (!TextUtils.isEmpty(m120742A5)) {
            if (AbstractC23309i.m121829dg()) {
                this.f74762a1.setText(m120742A5);
            } else {
                int i13 = 0;
                while (i13 < m120742A5.length() && (((charAt = m120742A5.charAt(i13)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'x'))) {
                    i13++;
                }
                if (i13 == m120742A5.length()) {
                    this.f74762a1.setText(m120742A5);
                } else {
                    this.f74762a1.setText("");
                }
            }
        } else {
            this.f74762a1.setText("");
        }
        EditText editText = this.f74762a1;
        if (editText != null && this.f74763b1 != null) {
            if (!TextUtils.isEmpty(editText.getText().toString().trim())) {
                this.f74763b1.requestFocus();
            } else {
                this.f74762a1.requestFocus();
            }
        }
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.uu
            @Override // java.lang.Runnable
            public final void run() {
                LoginView.m81229yM();
            }
        });
        this.f74767f1 = view.findViewById(AbstractC6918a0.layoutFAQ);
        TextView textView7 = (TextView) view.findViewById(AbstractC6918a0.tvFAQ);
        this.f74768g1 = textView7;
        textView7.setOnClickListener(this);
        this.f74783v1 = false;
        if (bundle != null) {
            this.f74783v1 = bundle.getBoolean("IS_SHOW_COUNTRY", false);
        }
        if (this.f74737D1) {
            this.f74783v1 = true;
        }
        TextView textView8 = this.f74777p1;
        if (this.f74783v1) {
            i12 = 0;
        }
        textView8.setVisibility(i12);
        AbstractC23309i.m121210Mt(this.f74783v1 ? 1 : 0);
        AbstractC23647d.m123906p("19400");
        AbstractC23647d.m123893c();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 37) {
            try {
                if (AbstractC23309i.m122166mc() != 2 && AbstractC23309i.m122166mc() != 4) {
                    return;
                }
                this.f74777p1.setText(AbstractC23309i.m121704a5());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        super.mo37135xJ(bundle);
        if (bundle != null) {
            try {
                String str6 = "";
                if (!bundle.containsKey("onSave")) {
                    str = "";
                } else {
                    str = bundle.getString("onSave");
                }
                AbstractC23304d.f113398j0 = str;
                if (!bundle.containsKey("zalo_phoneNumber")) {
                    str2 = "";
                } else {
                    str2 = bundle.getString("zalo_phoneNumber");
                }
                AbstractC23304d.f113438t0 = str2;
                if (!bundle.containsKey("phoneNumberE164Server")) {
                    str3 = "";
                } else {
                    str3 = bundle.getString("phoneNumberE164Server");
                }
                AbstractC23304d.f113442u0 = str3;
                if (!bundle.containsKey("sms_gateWay")) {
                    str4 = "";
                } else {
                    str4 = bundle.getString("sms_gateWay");
                }
                AbstractC23304d.f113446v0 = str4;
                if (!bundle.containsKey("sms_format")) {
                    str5 = "";
                } else {
                    str5 = bundle.getString("sms_format");
                }
                AbstractC23304d.f113458y0 = str5;
                if (bundle.containsKey("sms_content_hint")) {
                    str6 = bundle.getString("sms_content_hint");
                }
                AbstractC23304d.f113454x0 = str6;
                if (bundle.containsKey("last_submit_phone_num")) {
                    this.f74735B1 = bundle.getString("last_submit_phone_num");
                }
                if (bundle.containsKey("wrong_submit_phone_count")) {
                    this.f74734A1 = bundle.getInt("wrong_submit_phone_count");
                }
                EditText editText = this.f74762a1;
                if (editText != null) {
                    editText.setText(AbstractC23304d.f113398j0);
                }
                ConfirmDialogView confirmDialogView = (ConfirmDialogView) this.f72421L0.m92649TI().m92996E0("ban_dialog");
                this.f74749N1 = confirmDialogView;
                if (confirmDialogView != null) {
                    confirmDialogView.dismiss();
                    this.f74749N1 = null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
