package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0808c0;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import hm0.AbstractC20095b;
import hm0.C20096c;
import java.net.URI;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import jm0.InterfaceC21299i;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23278z2;
import org.json.JSONObject;
import p135em.C18489c;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p609wh.C29000b;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class WebAuthorizationView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    URI f79384M0;

    /* renamed from: N0 */
    Map f79385N0;

    /* renamed from: O0 */
    RobotoTextView f79386O0;

    /* renamed from: P0 */
    RobotoButton f79387P0;

    /* renamed from: Q0 */
    RobotoTextView f79388Q0;

    /* renamed from: R0 */
    RobotoTextView f79389R0;

    /* renamed from: S0 */
    RobotoTextView f79390S0;

    /* renamed from: T0 */
    RecyclingImageView f79391T0;

    /* renamed from: U0 */
    RecyclingImageView f79392U0;

    /* renamed from: V0 */
    LinearLayout f79393V0;

    /* renamed from: W0 */
    C23528a f79394W0;

    /* renamed from: X0 */
    String f79395X0;

    /* renamed from: Y0 */
    String f79396Y0;

    /* renamed from: Z0 */
    String f79397Z0;

    /* renamed from: a1 */
    String f79398a1;

    /* renamed from: b1 */
    String f79399b1;

    /* renamed from: c1 */
    String f79400c1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.WebAuthorizationView$a */
    /* loaded from: classes6.dex */
    public class C15349a extends C23999j {
        C15349a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                WebAuthorizationView.this.f79391T0.setImageInfo(c3979l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.WebAuthorizationView$b */
    /* loaded from: classes6.dex */
    public class C15350b extends C23999j {
        C15350b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                WebAuthorizationView.this.f79392U0.setImageInfo(c3979l);
            } else {
                WebAuthorizationView webAuthorizationView = WebAuthorizationView.this;
                ((C23528a) webAuthorizationView.f79394W0.m123612r(webAuthorizationView.f79392U0)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.WebAuthorizationView$c */
    /* loaded from: classes6.dex */
    public class C15351c implements InterfaceC21299i {
        C15351c() {
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            WebAuthorizationView.this.f72421L0.mo49315c4();
            WebAuthorizationView.this.f72421L0.m92662fJ().m93013K1();
            ToastUtils.showMess(c20096c.m104492d());
            WebAuthorizationView.this.finish();
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            try {
                WebAuthorizationView.this.f72421L0.mo49315c4();
                WebAuthorizationView.this.f72421L0.m92662fJ().m93013K1();
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                WebAuthorizationView.this.f79395X0 = jSONObject2.optString("cancelUrl", "");
                WebAuthorizationView.this.f79396Y0 = jSONObject2.optString("loginUrl", "");
                WebAuthorizationView.this.f79397Z0 = jSONObject2.optString(ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE, "");
                WebAuthorizationView.this.f79398a1 = jSONObject2.optString("title", "");
                WebAuthorizationView.this.f79399b1 = jSONObject2.optString("logoUrl", "");
                WebAuthorizationView.this.f79400c1 = jSONObject2.optString("avatarUrl", "");
                WebAuthorizationView.this.m86581iM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: gM */
    private void m86577gM(String str) {
        LocaleList locales;
        int size;
        Locale locale;
        LocaleList locales2;
        try {
            C15351c c15351c = new C15351c();
            C29000b c29000b = new C29000b(c15351c);
            String str2 = "en";
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    locales = m92689tK().getResources().getConfiguration().getLocales();
                    size = locales.size();
                    if (size > 0) {
                        locales2 = m92689tK().getResources().getConfiguration().getLocales();
                        locale = locales2.get(0);
                    } else {
                        locale = m92689tK().getResources().getConfiguration().locale;
                    }
                    if (locale != null) {
                        str2 = locale.getLanguage();
                    }
                } else {
                    str2 = m92689tK().getResources().getConfiguration().locale.getLanguage();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            int i11 = 1;
            c29000b.m110314j(C18489c.m97849k(C7962g.c.a.ID_ZALOAPP_COM_S) + "/account/login/native/get-login-url", "", new String[]{"token", "session_key", "language"}, new String[]{str, CoreUtility.f89232h, str2});
            if (AbstractC23059e9.m118343v()) {
                i11 = 11;
            }
            c29000b.f103775r = i11;
            if (C23055e5.m118271f()) {
                C0808c0.m2046b(c29000b);
                this.f72421L0.mo46829Y();
            } else {
                c15351c.mo1342c(new C20096c(50001, AbstractC20095b.f98829a));
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            this.f72421L0.mo49315c4();
            this.f72421L0.m92662fJ().m93013K1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public /* synthetic */ void m86578hM() {
        C24003n m120138l0 = C23278z2.m120138l0();
        if (!TextUtils.isEmpty(this.f79399b1)) {
            ((C23528a) this.f79394W0.m123612r(this.f79391T0)).m123579C(this.f79399b1, m120138l0, new C15349a());
        }
        if (!TextUtils.isEmpty(this.f79400c1)) {
            ((C23528a) this.f79394W0.m123612r(this.f79392U0)).m123579C(this.f79400c1, m120138l0, new C15350b());
        } else {
            ((C23528a) this.f79394W0.m123612r(this.f79392U0)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
        }
        if (!TextUtils.isEmpty(this.f79398a1)) {
            this.f79390S0.setText(this.f79398a1);
        } else {
            this.f79390S0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_web_login_title));
        }
        if (!TextUtils.isEmpty(this.f79397Z0)) {
            this.f79389R0.setText(this.f79397Z0);
        } else {
            this.f79389R0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_web_login_subtitle));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            if (this.f72421L0.m92642L3() == null) {
                finish();
                return;
            }
            String string = this.f72421L0.m92642L3().getString("uri");
            if (TextUtils.isEmpty(string)) {
                finish();
                return;
            }
            this.f79394W0 = new C23528a(m92689tK());
            this.f79384M0 = new URI(string);
            this.f79385N0 = new LinkedHashMap();
            for (String str : this.f79384M0.getQuery().split("&")) {
                int indexOf = str.indexOf("=");
                this.f79385N0.put(URLDecoder.decode(str.substring(0, indexOf), "UTF-8"), URLDecoder.decode(str.substring(indexOf + 1), "UTF-8"));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.web_authorization_view_layout, viewGroup, false);
        this.f79393V0 = (LinearLayout) inflate.findViewById(AbstractC6918a0.web_login_logo_container);
        this.f79391T0 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.web_login_icon);
        this.f79392U0 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.web_login_avatar);
        LinearLayout linearLayout = this.f79393V0;
        if (linearLayout != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMargins(0, AbstractC23136l9.m118742r(30.0f) + AbstractC32226c.m155405d(this.f72421L0.m92676n2()), 0, 0);
            this.f79393V0.setLayoutParams(layoutParams);
        }
        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.web_login_close);
        this.f79386O0 = robotoTextView;
        if (robotoTextView != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) robotoTextView.getLayoutParams();
            layoutParams2.setMargins(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(10.0f) + AbstractC32226c.m155405d(this.f72421L0.m92676n2()), 0, 0);
            this.f79386O0.setLayoutParams(layoutParams2);
            this.f79386O0.setOnClickListener(this);
        }
        this.f79390S0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.web_login_title);
        this.f79389R0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.web_login_message);
        RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.web_login_deny);
        this.f79388Q0 = robotoTextView2;
        robotoTextView2.setOnClickListener(this);
        RobotoButton robotoButton = (RobotoButton) inflate.findViewById(AbstractC6918a0.web_login_approve);
        this.f79387P0 = robotoButton;
        robotoButton.setOnClickListener(this);
        this.f72421L0.m92662fJ().m93019M1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_splashscreen_version, CoreUtility.f89234j), AbstractC16803z.img_splashscreen);
        m86577gM((String) this.f79385N0.get("token"));
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
    }

    /* renamed from: eM */
    void m86579eM() {
        try {
            String str = this.f79396Y0;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            this.f72421L0.m92641HK(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        finish();
    }

    /* renamed from: fM */
    void m86580fM() {
        try {
            String str = this.f79395X0;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            this.f72421L0.m92641HK(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (this.f72421L0.m92662fJ().m93009J0() == 0) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_START_FROM_WEB_AUTHORIZATION", true);
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
            this.f72421L0.m92662fJ().m93069k2(MainTabView.class, bundle, 0, true);
            return;
        }
        super.finish();
        AbstractC23136l9.m118678T0((Activity) this.f72421L0.m92648SI());
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "WebAuthorizationView";
    }

    /* renamed from: iM */
    void m86581iM() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zing.zalo.ui.zviews.z31
            @Override // java.lang.Runnable
            public final void run() {
                WebAuthorizationView.this.m86578hM();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.web_login_approve) {
            m86579eM();
        } else if (id2 == AbstractC6918a0.web_login_close) {
            finish();
        } else if (id2 == AbstractC6918a0.web_login_deny) {
            m86580fM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyUp(i11, keyEvent);
        }
        finish();
        return true;
    }
}
