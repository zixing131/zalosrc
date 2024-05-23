package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au.AbstractC2373t;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.zviews.AccountExistView;
import com.zing.zalo.utils.ToastUtils;
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
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import su.AbstractC26389c;
import y20.C30274b;
import y20.InterfaceC30273a;

/* loaded from: classes6.dex */
public class AccountExistView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: Q0 */
    GroupAvatarView f72103Q0;

    /* renamed from: R0 */
    TextView f72104R0;

    /* renamed from: S0 */
    TextView f72105S0;

    /* renamed from: T0 */
    String f72106T0;

    /* renamed from: W0 */
    TextView f72109W0;

    /* renamed from: X0 */
    TextView f72110X0;

    /* renamed from: M0 */
    String f72099M0 = "";

    /* renamed from: N0 */
    String f72100N0 = "";

    /* renamed from: O0 */
    String f72101O0 = "";

    /* renamed from: P0 */
    String f72102P0 = "";

    /* renamed from: U0 */
    String f72107U0 = "";

    /* renamed from: V0 */
    int f72108V0 = 0;

    /* renamed from: Y0 */
    boolean f72111Y0 = false;

    /* renamed from: Z0 */
    final Object f72112Z0 = new Object();

    /* renamed from: com.zing.zalo.ui.zviews.AccountExistView$a */
    /* loaded from: classes6.dex */
    public class C14024a implements InterfaceC20094a {
        C14024a() {
        }

        /* renamed from: g */
        public /* synthetic */ void m78010g() {
            AccountExistView.this.m78004hM();
        }

        /* renamed from: h */
        public static /* synthetic */ void m78011h(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* renamed from: i */
        public /* synthetic */ void m78012i() {
            AccountExistView.this.m78004hM();
        }

        /* renamed from: j */
        public /* synthetic */ void m78013j(C20096c c20096c) {
            try {
                if (c20096c.m104491c() != 2012 && c20096c.m104491c() != 2021) {
                    if (c20096c.m104491c() == 2003) {
                        AccountExistView.this.f72421L0.showDialog(2);
                    } else {
                        ToastUtils.showMess(c20096c.m104492d());
                    }
                }
                JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                AccountExistView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.n
                    public /* synthetic */ RunnableC15926n() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AccountExistView.C14024a.this.m78012i();
                    }
                });
                InterfaceC27218a m92676n2 = AccountExistView.this.m92676n2();
                AccountExistView accountExistView = AccountExistView.this;
                AbstractC23153n4.m119159x(m92676n2, optJSONObject, false, 2, true, accountExistView.f72106T0, accountExistView.f72102P0, null, 0, 0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            synchronized (AccountExistView.this.f72112Z0) {
                AccountExistView accountExistView = AccountExistView.this;
                accountExistView.f72111Y0 = false;
                accountExistView.f72421L0.mo49315c4();
            }
            if (AbstractC23216t1.m119643h(AccountExistView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.k
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    AccountExistView.C14024a.m78011h(str);
                }
            })) {
                return;
            }
            AccountExistView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.l

                /* renamed from: q */
                public final /* synthetic */ C20096c f80956q;

                public /* synthetic */ RunnableC15834l(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AccountExistView.C14024a.this.m78013j(r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    AccountExistView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.m
                        public /* synthetic */ RunnableC15871m() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AccountExistView.C14024a.this.m78010g();
                        }
                    });
                    InterfaceC27218a m92676n2 = AccountExistView.this.m92676n2();
                    AccountExistView accountExistView = AccountExistView.this;
                    AbstractC23153n4.m119159x(m92676n2, optJSONObject, true, 2, true, accountExistView.f72106T0, accountExistView.f72102P0, null, 0, 0);
                    synchronized (AccountExistView.this.f72112Z0) {
                        AccountExistView accountExistView2 = AccountExistView.this;
                        accountExistView2.f72111Y0 = false;
                        accountExistView2.f72421L0.mo49315c4();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (AccountExistView.this.f72112Z0) {
                        AccountExistView accountExistView3 = AccountExistView.this;
                        accountExistView3.f72111Y0 = false;
                        accountExistView3.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (AccountExistView.this.f72112Z0) {
                    AccountExistView accountExistView4 = AccountExistView.this;
                    accountExistView4.f72111Y0 = false;
                    accountExistView4.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AccountExistView$b */
    /* loaded from: classes6.dex */
    public class C14025b implements InterfaceC30273a {
        C14025b() {
        }

        @Override // y20.InterfaceC30273a
        /* renamed from: a */
        public void mo78014a(Object obj) {
        }

        @Override // y20.InterfaceC30273a
        /* renamed from: b */
        public void mo78015b(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                AbstractC23304d.f113426q0 = AbstractC18069a.m96089h(jSONObject, "name");
                AbstractC23304d.f113434s0 = AbstractC18069a.m96089h(jSONObject, "gender");
                AbstractC23304d.f113430r0 = AbstractC18069a.m96089h(jSONObject, "picture");
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: jM */
    public static /* synthetic */ void m78000jM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23647d.m123897g("199714");
    }

    /* renamed from: kM */
    public /* synthetic */ void m78001kM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m78003gM();
        AbstractC23647d.m123897g("199715");
    }

    /* renamed from: lM */
    public /* synthetic */ void m78002lM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            if (m92642L3() != null && m92642L3().containsKey("extra_data")) {
                String string = m92642L3().getString("extra_data", "");
                String string2 = m92642L3().getString("extra_phone_number", "");
                if (!TextUtils.isEmpty(string2)) {
                    AbstractC23304d.f113398j0 = string2;
                    String m118281g = AbstractC23056e6.m118281g(string2, AbstractC23309i.m121704a5());
                    this.f72107U0 = m118281g;
                    if (!TextUtils.isEmpty(m118281g)) {
                        if (this.f72107U0.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                        }
                    }
                    this.f72107U0 = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    this.f72108V0 = jSONObject.optInt("renewable");
                    String optString = jSONObject.optString("identifier");
                    this.f72106T0 = jSONObject.optString("sessionToken", "");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(this.f72106T0)) {
                        JSONObject jSONObject2 = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString));
                        this.f72099M0 = jSONObject2.optString("avatar_url", "");
                        this.f72100N0 = jSONObject2.optString("dname", "");
                        this.f72101O0 = jSONObject2.optString("uname", "");
                        this.f72102P0 = jSONObject2.optString("phone_num", "");
                        if (TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
                            AbstractC23304d.f113398j0 = this.f72102P0;
                        }
                        if (TextUtils.isEmpty(this.f72107U0)) {
                            String m118281g2 = AbstractC23056e6.m118281g(string2, AbstractC23309i.m121704a5());
                            this.f72107U0 = m118281g2;
                            if (TextUtils.isEmpty(m118281g2) || this.f72107U0.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                                this.f72107U0 = this.f72102P0;
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_general)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_expired_session)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.back), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.j
                public /* synthetic */ C15754j() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    AccountExistView.this.m78002lM(interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        }
        SpannableString spannableString = new SpannableString(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_title_dialog_confirm), this.f72100N0));
        spannableString.setSpan(new ForegroundColorSpan(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.red_color1)), 0, spannableString.length(), 33);
        C8009j.a aVar2 = new C8009j.a(m92648SI());
        aVar2.m43173v(3).m43172u(spannableString).m43159h(4).m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_renew_account_content_dialog_confirm), this.f72107U0, this.f72100N0)).m43165n(m92652XI(AbstractC8020f0.cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.h
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                AccountExistView.m78000jM(interfaceC17463d, i12);
            }
        }).m43170s(m92652XI(AbstractC8020f0.btn_continue), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.i
            public /* synthetic */ C15718i() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                AccountExistView.this.m78001kM(interfaceC17463d, i12);
            }
        });
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.account_exist_view, viewGroup, false);
        m78005iM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC23647d.m123897g("199712");
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.header_account_exist));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gM */
    void m78003gM() {
        String str;
        if (!TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
            synchronized (this.f72112Z0) {
                try {
                    if (this.f72111Y0) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    this.f72111Y0 = true;
                    this.f72421L0.mo46829Y();
                    if (AbstractC23309i.m121859e9() == 1) {
                        str = AbstractC23309i.m121704a5();
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14024a());
                    AbstractC23304d.f113289J.clear();
                    AbstractC23304d.f113399j1 = System.currentTimeMillis();
                    c0766k.mo1539T5(AbstractC23304d.f113398j0, str2, this.f72106T0, 0, 1, 2, 0, 0, AbstractC23034c6.m118110A());
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "AccountExistView";
    }

    /* renamed from: hM */
    public void m78004hM() {
        try {
            Account[] accountsByType = AccountManager.get(m92648SI()).getAccountsByType("com.google");
            if (accountsByType.length > 0) {
                C30274b c30274b = new C30274b(accountsByType[0].name, "oauth2:https://www.googleapis.com/auth/userinfo.profile");
                c30274b.m149410y(new C14025b());
                c30274b.m2434i(AbstractC0837p0.m2225f(), new Void[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iM */
    void m78005iM(View view) {
        try {
            this.f72109W0 = (TextView) view.findViewById(AbstractC6918a0.btnLogin);
            this.f72110X0 = (TextView) view.findViewById(AbstractC6918a0.btnRegister);
            this.f72109W0.setOnClickListener(this);
            this.f72110X0.setOnClickListener(this);
            View findViewById = view.findViewById(AbstractC6918a0.btnBack);
            findViewById.setOnClickListener(this);
            ((TextView) view.findViewById(AbstractC6918a0.tvTitle)).setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_change_phone_title_account_exist, this.f72107U0));
            if (this.f72108V0 == 1) {
                findViewById.setVisibility(8);
                this.f72110X0.setVisibility(0);
            } else {
                this.f72110X0.setVisibility(8);
                findViewById.setVisibility(0);
            }
            this.f72103Q0 = (GroupAvatarView) view.findViewById(AbstractC6918a0.img_avt);
            this.f72104R0 = (TextView) view.findViewById(AbstractC6918a0.tv_name);
            this.f72105S0 = (TextView) view.findViewById(AbstractC6918a0.tv_phone_number);
            this.f72103Q0.m75732d(this.f72099M0);
            this.f72105S0.setText(this.f72107U0);
            if (TextUtils.isEmpty(this.f72100N0)) {
                this.f72100N0 = "";
            }
            this.f72104R0.setText(this.f72100N0);
            TextView textView = (TextView) view.findViewById(AbstractC6918a0.tvHintAccountExist);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_login_account_exist);
            int indexOf = m118743r0.indexOf("%s");
            SpannableString spannableString = new SpannableString(String.format(m118743r0, this.f72100N0));
            spannableString.setSpan(new StyleSpan(1), indexOf, this.f72100N0.length() + indexOf, 33);
            textView.setText(spannableString);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 2210 && i12 == -1) {
            finish();
        } else {
            super.onActivityResult(i11, i12, intent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btnLogin) {
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            bundle.putBoolean("extra_from_account_exist", true);
            this.f72421L0.m92662fJ().m93069k2(LoginView.class, bundle, 0, true);
            AbstractC23647d.m123897g("199727");
            return;
        }
        if (id2 == AbstractC6918a0.btnRegister) {
            this.f72421L0.showDialog(1);
            AbstractC23647d.m123897g("199728");
        } else if (id2 == AbstractC6918a0.btnBack) {
            finish();
            AbstractC23647d.m123897g("199713");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("199712");
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
