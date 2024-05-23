package com.zing.zalo.register;

import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import au.AbstractC2373t;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.LoginView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.WebInAppView;
import com.zing.zalo.register.AlreadyExistAccountRegisterView;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import cz.C17670w0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23217t2;
import me0.C23212s8;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p140ev.C18613b;
import p227i3.C20218v;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p649xl.C29827h;
import pm0.C24848g0;
import su.AbstractC26389c;
import vl0.AbstractC28291a;

/* loaded from: classes4.dex */
public final class AlreadyExistAccountRegisterView extends SlidableZaloView {
    public static final C9280a Companion = new C9280a(null);

    /* renamed from: P0 */
    private C29827h f49218P0;

    /* renamed from: S0 */
    private int f49221S0;

    /* renamed from: Y0 */
    private JSONObject f49227Y0;

    /* renamed from: Q0 */
    private String f49219Q0 = "";

    /* renamed from: R0 */
    private String f49220R0 = "";

    /* renamed from: T0 */
    private String f49222T0 = "";

    /* renamed from: U0 */
    private String f49223U0 = "";

    /* renamed from: V0 */
    private String f49224V0 = "";

    /* renamed from: W0 */
    private String f49225W0 = "";

    /* renamed from: X0 */
    private String f49226X0 = "";

    /* renamed from: com.zing.zalo.register.AlreadyExistAccountRegisterView$a */
    /* loaded from: classes4.dex */
    public static final class C9280a {
        private C9280a() {
        }

        public /* synthetic */ C9280a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.register.AlreadyExistAccountRegisterView$b */
    /* loaded from: classes4.dex */
    public static final class C9281b extends ClickableSpan {

        /* renamed from: q */
        final /* synthetic */ String f49229q;

        C9281b(String str) {
            this.f49229q = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            C17487o0 m92662fJ = AlreadyExistAccountRegisterView.this.m92662fJ();
            if (m92662fJ != null) {
                String str = this.f49229q;
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_URL", str);
                m92662fJ.m93069k2(WebInAppView.class, bundle, 1, true);
            }
        }
    }

    /* renamed from: kM */
    private final KeyEventCallbackC17462c m49696kM() {
        int i11 = AbstractC8020f0.str_register_already_exist_account_dialog_confirm_title;
        Object[] objArr = new Object[1];
        C29827h c29827h = this.f49218P0;
        C29827h c29827h2 = null;
        if (c29827h == null) {
            AbstractC19074t.m100223u("binding");
            c29827h = null;
        }
        objArr[0] = c29827h.f137929u.getText();
        String m118746s0 = AbstractC23136l9.m118746s0(i11, objArr);
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        int i12 = AbstractC8020f0.str_register_already_exist_account_dialog_confirm_description;
        Object[] objArr2 = new Object[1];
        C29827h c29827h3 = this.f49218P0;
        if (c29827h3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29827h2 = c29827h3;
        }
        objArr2[0] = c29827h2.f137929u.getText();
        String m118746s02 = AbstractC23136l9.m118746s0(i12, objArr2);
        AbstractC19074t.m100207e(m118746s02, "getString(...)");
        SpannableString m119658j = AbstractC23217t2.m119658j(AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_already_exist_account_dialog_confirm_subtitle, m118746s02), m118746s02, C23212s8.m119606n(AbstractC28291a.error_text), 0);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        final C16972e0.a aVar = new C16972e0.a(m92689tK);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90918B(m118746s0);
        AbstractC19074t.m100205c(m119658j);
        aVar.m90949z(m119658j);
        aVar.m90921E(true);
        aVar.m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_continue);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        aVar.m90943t(m118743r0, new InterfaceC17463d.d() { // from class: cz.a
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                AlreadyExistAccountRegisterView.m49697lM(AlreadyExistAccountRegisterView.this, aVar, interfaceC17463d, i13);
            }
        });
        aVar.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_back);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        aVar.m90934k(m118743r02, new InterfaceC17463d.d() { // from class: cz.b
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                AlreadyExistAccountRegisterView.m49698mM(interfaceC17463d, i13);
            }
        });
        return aVar.m90927d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m49697lM(AlreadyExistAccountRegisterView alreadyExistAccountRegisterView, C16972e0.a aVar, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(alreadyExistAccountRegisterView, "this$0");
        AbstractC19074t.m100208f(aVar, "$this_apply");
        interfaceC17463d.dismiss();
        JSONObject jSONObject = alreadyExistAccountRegisterView.f49227Y0;
        C24848g0 c24848g0 = null;
        if (jSONObject != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_PHONE_NUMBER", alreadyExistAccountRegisterView.f49219Q0);
            bundle.putString("EXTRA_SESSION_TOKEN", alreadyExistAccountRegisterView.f49220R0);
            bundle.putInt("EXTRA_RENEW_ACCOUNT", alreadyExistAccountRegisterView.f49221S0);
            bundle.putString("EXTRA_WEB_URL", jSONObject.getString("secureUrl"));
            bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93606y);
            C17487o0 m92662fJ = alreadyExistAccountRegisterView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(H5EkycView.class, bundle, 1, true);
                c24848g0 = C24848g0.f119245a;
            }
        }
        if (c24848g0 == null) {
            alreadyExistAccountRegisterView.m49703rM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m49698mM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: nM */
    private final String m49699nM(String str) {
        boolean m127126v;
        String m119145q = AbstractC23153n4.m119145q(str);
        String m118283i = AbstractC23056e6.m118283i(m119145q, AbstractC23309i.m121704a5(), true, 4);
        if (!TextUtils.isEmpty(m118283i)) {
            m127126v = AbstractC24341v.m127126v(m118283i, AbstractC23056e6.f112062a, true);
            if (!m127126v) {
                m119145q = m118283i;
            }
        }
        AbstractC19074t.m100205c(m119145q);
        return m119145q;
    }

    /* renamed from: oM */
    private final void m49700oM() {
        int m127173b0;
        int m127173b02;
        boolean z11;
        int i11;
        C29827h c29827h = this.f49218P0;
        C29827h c29827h2 = null;
        if (c29827h == null) {
            AbstractC19074t.m100223u("binding");
            c29827h = null;
        }
        FrameLayout root = c29827h.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), AbstractC17484n.Companion.m92931b(), root.getPaddingRight(), root.getPaddingBottom());
        C29827h c29827h3 = this.f49218P0;
        if (c29827h3 == null) {
            AbstractC19074t.m100223u("binding");
            c29827h3 = null;
        }
        Avatar avatar = c29827h3.f137925q;
        Context context = avatar.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        avatar.m90481x(context, EnumC16949e.SIZE_128);
        avatar.m90479n(this.f49222T0);
        C29827h c29827h4 = this.f49218P0;
        if (c29827h4 == null) {
            AbstractC19074t.m100223u("binding");
            c29827h4 = null;
        }
        c29827h4.f137929u.setText(this.f49223U0);
        C29827h c29827h5 = this.f49218P0;
        if (c29827h5 == null) {
            AbstractC19074t.m100223u("binding");
            c29827h5 = null;
        }
        RobotoTextView robotoTextView = c29827h5.f137932x;
        String m49699nM = m49699nM(this.f49219Q0);
        boolean z12 = true;
        int i12 = 0;
        SpannableString spannableString = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_already_exist_account_description, m49699nM));
        m127173b0 = AbstractC24342w.m127173b0(spannableString, m49699nM, 0, false, 6, null);
        int length = m49699nM.length() + m127173b0;
        spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC2807a.text_primary)), m127173b0, length, 33);
        spannableString.setSpan(new StyleSpan(1), m127173b0, length, 33);
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        robotoTextView.setText(spannableString, bufferType);
        C29827h c29827h6 = this.f49218P0;
        if (c29827h6 == null) {
            AbstractC19074t.m100223u("binding");
            c29827h6 = null;
        }
        RobotoTextView robotoTextView2 = c29827h6.f137930v;
        String m93653e = C17670w0.f89662a.m93653e();
        SpannableString spannableString2 = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_already_exist_account_support_hint, m93653e));
        m127173b02 = AbstractC24342w.m127173b0(spannableString2, m93653e, 0, false, 6, null);
        int length2 = m93653e.length() + m127173b02;
        spannableString2.setSpan(new C9281b(m93653e), m127173b02, length2, 33);
        spannableString2.setSpan(new StyleSpan(1), m127173b02, length2, 33);
        robotoTextView2.setText(spannableString2, bufferType);
        robotoTextView2.setMovementMethod(CustomMovementMethod.m56305e());
        robotoTextView2.setHighlightColor(0);
        AbstractC19074t.m100205c(robotoTextView2);
        if (this.f49221S0 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView2.setVisibility(i11);
        C29827h c29827h7 = this.f49218P0;
        if (c29827h7 == null) {
            AbstractC19074t.m100223u("binding");
            c29827h7 = null;
        }
        c29827h7.f137927s.setOnClickListener(new View.OnClickListener() { // from class: cz.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlreadyExistAccountRegisterView.m49701pM(AlreadyExistAccountRegisterView.this, view);
            }
        });
        C29827h c29827h8 = this.f49218P0;
        if (c29827h8 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29827h2 = c29827h8;
        }
        Button button = c29827h2.f137926r;
        button.setOnClickListener(new View.OnClickListener() { // from class: cz.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlreadyExistAccountRegisterView.m49702qM(AlreadyExistAccountRegisterView.this, view);
            }
        });
        AbstractC19074t.m100205c(button);
        if (this.f49221S0 != 1) {
            z12 = false;
        }
        if (!z12) {
            i12 = 8;
        }
        button.setVisibility(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public static final void m49701pM(AlreadyExistAccountRegisterView alreadyExistAccountRegisterView, View view) {
        AbstractC19074t.m100208f(alreadyExistAccountRegisterView, "this$0");
        AbstractC23304d.f113406l0 = alreadyExistAccountRegisterView.f49219Q0;
        AbstractC0924m0.m2972Cm(0);
        AbstractC0924m0.m3691bf("");
        C17487o0 m92662fJ = alreadyExistAccountRegisterView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(LoginView.class, null, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m49702qM(AlreadyExistAccountRegisterView alreadyExistAccountRegisterView, View view) {
        AbstractC19074t.m100208f(alreadyExistAccountRegisterView, "this$0");
        alreadyExistAccountRegisterView.showDialog(1);
    }

    /* renamed from: rM */
    private final void m49703rM() {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PHONE_NUMBER", this.f49219Q0);
        bundle.putString("EXTRA_SESSION_TOKEN", this.f49220R0);
        bundle.putInt("EXTRA_RENEW_ACCOUNT", this.f49221S0);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(UserNamingView.class, bundle, 1, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:            if (r0 != false) goto L12;     */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37111CJ(Bundle bundle) {
        boolean m127126v;
        boolean m127126v2;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("EXTRA_PHONE_NUMBER");
            if (string != null) {
                AbstractC19074t.m100205c(string);
                this.f49219Q0 = string;
                if (!TextUtils.isEmpty(string)) {
                    String str = this.f49219Q0;
                    AbstractC23304d.f113398j0 = str;
                    String m118281g = AbstractC23056e6.m118281g(str, AbstractC23309i.m121704a5());
                    AbstractC19074t.m100207e(m118281g, "covertPhoneNumberToFineString(...)");
                    this.f49225W0 = m118281g;
                    if (!TextUtils.isEmpty(m118281g)) {
                        m127126v2 = AbstractC24341v.m127126v(this.f49225W0, AbstractC23056e6.f112062a, true);
                    }
                    this.f49225W0 = "";
                }
            }
            String string2 = m92642L3.getString("EXTRA_DATA", "");
            if (!TextUtils.isEmpty(string2)) {
                JSONObject jSONObject = new JSONObject(string2);
                this.f49221S0 = jSONObject.optInt("renewable");
                this.f49227Y0 = jSONObject.optJSONObject("ekyc");
                String optString = jSONObject.optString("identifier");
                String optString2 = jSONObject.optString("sessionToken", "");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                this.f49220R0 = optString2;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(this.f49220R0)) {
                    String m12409g = AbstractC2373t.m12409g();
                    AbstractC19074t.m100207e(m12409g, "getZaloIdentifyString(...)");
                    String substring = m12409g.substring(0, 16);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    String m135986b = AbstractC26389c.m135986b(substring, optString);
                    AbstractC19074t.m100207e(m135986b, "decryptionAES(...)");
                    JSONObject jSONObject2 = new JSONObject(m135986b);
                    String optString3 = jSONObject2.optString("avatar_url", "");
                    AbstractC19074t.m100207e(optString3, "optString(...)");
                    this.f49222T0 = optString3;
                    String optString4 = jSONObject2.optString("dname", "");
                    AbstractC19074t.m100207e(optString4, "optString(...)");
                    this.f49223U0 = optString4;
                    String optString5 = jSONObject2.optString("uname", "");
                    AbstractC19074t.m100207e(optString5, "optString(...)");
                    this.f49224V0 = optString5;
                    String optString6 = jSONObject2.optString("phone_num", "");
                    AbstractC19074t.m100207e(optString6, "optString(...)");
                    this.f49226X0 = optString6;
                    if (TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
                        AbstractC23304d.f113398j0 = this.f49226X0;
                    }
                    if (TextUtils.isEmpty(this.f49225W0)) {
                        String m118281g2 = AbstractC23056e6.m118281g(this.f49219Q0, AbstractC23309i.m121704a5());
                        AbstractC19074t.m100207e(m118281g2, "covertPhoneNumberToFineString(...)");
                        this.f49225W0 = m118281g2;
                        if (!TextUtils.isEmpty(m118281g2)) {
                            m127126v = AbstractC24341v.m127126v(this.f49225W0, AbstractC23056e6.f112062a, true);
                            if (!m127126v) {
                                return;
                            }
                        }
                        this.f49225W0 = this.f49226X0;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            return m49696kM();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29827h m148010c = C29827h.m148010c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148010c, "inflate(...)");
        this.f49218P0 = m148010c;
        m49700oM();
        C29827h c29827h = this.f49218P0;
        if (c29827h == null) {
            AbstractC19074t.m100223u("binding");
            c29827h = null;
        }
        FrameLayout root = c29827h.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "AlreadyExistAccountRegisterView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyUp(i11, keyEvent);
        }
        return true;
    }
}
