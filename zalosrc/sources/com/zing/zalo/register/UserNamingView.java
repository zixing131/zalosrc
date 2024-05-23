package com.zing.zalo.register;

import ae.C0766k;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.RegulationDisplayNameView;
import com.zing.zalo.register.UserNamingView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TextField;
import com.zing.zalo.zdesign.component.inputfield.EditText;
import com.zing.zalo.zdesign.component.inputfield.EnumC17007i;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import cz.C17667v0;
import cz.C17670w0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23216t1;
import on0.C24329j;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p542ub.InterfaceC27218a;
import p649xl.C29788ee;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes4.dex */
public final class UserNamingView extends BaseZaloView {
    public static final C9303a Companion = new C9303a(null);

    /* renamed from: M0 */
    private C29788ee f49326M0;

    /* renamed from: P0 */
    private int f49329P0;

    /* renamed from: T0 */
    private boolean f49333T0;

    /* renamed from: U0 */
    private int f49334U0;

    /* renamed from: V0 */
    private boolean f49335V0;

    /* renamed from: N0 */
    private String f49327N0 = "";

    /* renamed from: O0 */
    private String f49328O0 = "";

    /* renamed from: Q0 */
    private String f49330Q0 = "";

    /* renamed from: R0 */
    private JSONObject f49331R0 = new JSONObject();

    /* renamed from: S0 */
    private String f49332S0 = "";

    /* renamed from: com.zing.zalo.register.UserNamingView$a */
    /* loaded from: classes4.dex */
    public static final class C9303a {
        private C9303a() {
        }

        public /* synthetic */ C9303a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.register.UserNamingView$b */
    /* loaded from: classes4.dex */
    public static final class EnumC9304b {

        /* renamed from: p */
        public static final EnumC9304b f49336p = new EnumC9304b("NAME_CONTAIN_NUMBER", 0);

        /* renamed from: q */
        public static final EnumC9304b f49337q = new EnumC9304b("NAME_CONTAIN_SPECIAL_CHARACTER", 1);

        /* renamed from: r */
        public static final EnumC9304b f49338r = new EnumC9304b("NAME_TOO_SHORT", 2);

        /* renamed from: s */
        public static final EnumC9304b f49339s = new EnumC9304b("NAME_TOO_LONG", 3);

        /* renamed from: t */
        public static final EnumC9304b f49340t = new EnumC9304b(Image.SCALE_TYPE_NONE, 4);

        /* renamed from: u */
        private static final /* synthetic */ EnumC9304b[] f49341u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f49342v;

        static {
            EnumC9304b[] m49956b = m49956b();
            f49341u = m49956b;
            f49342v = AbstractC30166b.m148796a(m49956b);
        }

        private EnumC9304b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC9304b[] m49956b() {
            return new EnumC9304b[]{f49336p, f49337q, f49338r, f49339s, f49340t};
        }

        public static EnumC9304b valueOf(String str) {
            return (EnumC9304b) Enum.valueOf(EnumC9304b.class, str);
        }

        public static EnumC9304b[] values() {
            return (EnumC9304b[]) f49341u.clone();
        }
    }

    /* renamed from: com.zing.zalo.register.UserNamingView$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C9305c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49343a;

        static {
            int[] iArr = new int[EnumC9304b.values().length];
            try {
                iArr[EnumC9304b.f49339s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9304b.f49338r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9304b.f49337q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9304b.f49336p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC9304b.f49340t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f49343a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.register.UserNamingView$d */
    /* loaded from: classes4.dex */
    public static final class C9306d extends ClickableSpan {
        C9306d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "textView");
            C17667v0.f89659a.m93647d(UserNamingView.this.m92676n2());
            AbstractC20887g.m109217D(510051, null, 2, null);
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_OPEN_URL", C17670w0.f89662a.m93654f());
            C17487o0 m92662fJ = UserNamingView.this.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(RegulationDisplayNameView.class, bundle, 1, true);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.zing.zalo.register.UserNamingView$e */
    /* loaded from: classes4.dex */
    public static final class C9307e implements TextWatcher {
        C9307e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                UserNamingView userNamingView = UserNamingView.this;
                C29788ee c29788ee = userNamingView.f49326M0;
                if (c29788ee == null) {
                    AbstractC19074t.m100223u("binding");
                    c29788ee = null;
                }
                TextField textField = c29788ee.f137702r;
                AbstractC19074t.m100207e(textField, "inputName");
                userNamingView.m49951qM(textField, editable.toString());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: com.zing.zalo.register.UserNamingView$f */
    /* loaded from: classes4.dex */
    public static final class C9308f implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f49347b;

        C9308f(String str) {
            this.f49347b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m49960f(UserNamingView userNamingView, String str, String str2) {
            AbstractC19074t.m100208f(userNamingView, "this$0");
            AbstractC19074t.m100208f(str, "$sessionToken");
            C17667v0.f89659a.m93647d(userNamingView.m92676n2());
            userNamingView.m78954jL();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_PHONE_NUMBER", userNamingView.m49952jM());
            bundle.putString("EXTRA_SESSION_TOKEN", str);
            bundle.putInt("EXTRA_RENEW_ACCOUNT", userNamingView.m49953kM());
            bundle.putString("EXTRA_DISPLAY_NAME", str2);
            bundle.putString("EXTRA_E_KYC_INFO", userNamingView.f49331R0.toString());
            C17487o0 m92662fJ = userNamingView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(EnterUserExtraProfileView.class, bundle, 1, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m49961g(UserNamingView userNamingView, C20096c c20096c, String str) {
            AbstractC19074t.m100208f(userNamingView, "this$0");
            C29788ee c29788ee = userNamingView.f49326M0;
            C29788ee c29788ee2 = null;
            if (c29788ee == null) {
                AbstractC19074t.m100223u("binding");
                c29788ee = null;
            }
            c29788ee.f137702r.m91044C(true);
            C29788ee c29788ee3 = userNamingView.f49326M0;
            if (c29788ee3 == null) {
                AbstractC19074t.m100223u("binding");
                c29788ee3 = null;
            }
            c29788ee3.f137702r.setFieldState(EnumC17007i.ERROR);
            C29788ee c29788ee4 = userNamingView.f49326M0;
            if (c29788ee4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29788ee2 = c29788ee4;
            }
            TextField textField = c29788ee2.f137702r;
            AbstractC19074t.m100205c(c20096c);
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            textField.setErrorText(m104492d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m49962h(C20096c c20096c, UserNamingView userNamingView) {
            Integer num;
            AbstractC19074t.m100208f(userNamingView, "this$0");
            C29788ee c29788ee = null;
            if (c20096c != null) {
                num = Integer.valueOf(c20096c.m104491c());
            } else {
                num = null;
            }
            if (num == null || num.intValue() != 2003) {
                C29788ee c29788ee2 = userNamingView.f49326M0;
                if (c29788ee2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29788ee2 = null;
                }
                c29788ee2.f137702r.m91044C(true);
                C29788ee c29788ee3 = userNamingView.f49326M0;
                if (c29788ee3 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29788ee3 = null;
                }
                c29788ee3.f137702r.setFieldState(EnumC17007i.ERROR);
                C29788ee c29788ee4 = userNamingView.f49326M0;
                if (c29788ee4 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29788ee = c29788ee4;
                }
                TextField textField = c29788ee.f137702r;
                AbstractC19074t.m100205c(c20096c);
                String m104492d = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                textField.setErrorText(m104492d);
                return;
            }
            userNamingView.m92639EK(1, c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            UserNamingView.this.m49954pM(false);
            UserNamingView.this.m78954jL();
            final UserNamingView userNamingView = UserNamingView.this;
            if (AbstractC23216t1.m119643h(userNamingView.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: cz.c2
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    UserNamingView.C9308f.m49961g(UserNamingView.this, c20096c, str);
                }
            })) {
                return;
            }
            final UserNamingView userNamingView2 = UserNamingView.this;
            userNamingView2.mo70710wy(new Runnable() { // from class: cz.d2
                @Override // java.lang.Runnable
                public final void run() {
                    UserNamingView.C9308f.m49962h(C20096c.this, userNamingView2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            JSONObject jSONObject;
            try {
                UserNamingView.this.m49954pM(false);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                final String str2 = null;
                final String str3 = "";
                if (optJSONObject != null) {
                    str = optJSONObject.optString("sessionToken", "");
                } else {
                    str = null;
                }
                if (str != null) {
                    str3 = str;
                }
                long j11 = 0;
                if (optJSONObject != null) {
                    j11 = optJSONObject.optLong("sessionTTL", 0L);
                }
                if (optJSONObject != null) {
                    str2 = optJSONObject.optString("display_name", this.f49347b);
                }
                try {
                    jSONObject = new JSONObject(AbstractC0924m0.m4066o0());
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("token_name", str3);
                jSONObject.put("timeout_token_name", System.currentTimeMillis() + j11);
                jSONObject.put("display_name", str2);
                AbstractC0924m0.m3691bf(jSONObject.toString());
                AbstractC0924m0.m2972Cm(4);
                final UserNamingView userNamingView = UserNamingView.this;
                userNamingView.mo70710wy(new Runnable() { // from class: cz.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserNamingView.C9308f.m49960f(UserNamingView.this, str3, str2);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: iM */
    private final boolean m49946iM() {
        try {
            if (AbstractC0924m0.m3331P4() > 3) {
                String m4066o0 = AbstractC0924m0.m4066o0();
                AbstractC19074t.m100205c(m4066o0);
                if (m4066o0.length() > 0) {
                    JSONObject jSONObject = new JSONObject(m4066o0);
                    String optString = jSONObject.optString("token_otp");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    this.f49328O0 = optString;
                    String optString2 = jSONObject.optString("display_name", "");
                    AbstractC19074t.m100207e(optString2, "optString(...)");
                    this.f49330Q0 = optString2;
                    String optString3 = jSONObject.optString("phone_number");
                    AbstractC19074t.m100207e(optString3, "optString(...)");
                    this.f49327N0 = optString3;
                    this.f49329P0 = jSONObject.optInt("exist_account");
                    String string = jSONObject.getString("ekyc_info");
                    if (string != null && string.length() != 0) {
                        JSONObject jSONObject2 = new JSONObject(string);
                        this.f49331R0 = jSONObject2;
                        String optString4 = jSONObject2.optString("name");
                        AbstractC19074t.m100207e(optString4, "optString(...)");
                        this.f49330Q0 = optString4;
                    }
                    String optString5 = jSONObject.optString("ekyc_token");
                    AbstractC19074t.m100207e(optString5, "optString(...)");
                    this.f49332S0 = optString5;
                    return false;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: lM */
    private final void m49947lM() {
        C29788ee c29788ee = this.f49326M0;
        C29788ee c29788ee2 = null;
        if (c29788ee == null) {
            AbstractC19074t.m100223u("binding");
            c29788ee = null;
        }
        FrameLayout root = c29788ee.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), AbstractC17484n.Companion.m92931b(), root.getPaddingRight(), root.getPaddingBottom());
        C29788ee c29788ee3 = this.f49326M0;
        if (c29788ee3 == null) {
            AbstractC19074t.m100223u("binding");
            c29788ee3 = null;
        }
        RobotoTextView robotoTextView = c29788ee3.f137703s;
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_enter_name_policy, AbstractC23136l9.m118743r0(AbstractC8020f0.str_enter_name_policy_link_name));
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        int length = m118746s0.length() - AbstractC23136l9.m118743r0(AbstractC8020f0.str_enter_name_policy_link_name).length();
        int length2 = m118746s0.length();
        C9306d c9306d = new C9306d();
        SpannableString spannableString = new SpannableString(m118746s0);
        spannableString.setSpan(new StyleSpan(1), length, length2, 33);
        spannableString.setSpan(c9306d, length, length2, 33);
        robotoTextView.setText(spannableString);
        robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
        robotoTextView.setHighlightColor(0);
        C29788ee c29788ee4 = this.f49326M0;
        if (c29788ee4 == null) {
            AbstractC19074t.m100223u("binding");
            c29788ee4 = null;
        }
        EditText editText = c29788ee4.f137702r.getEditText();
        editText.addTextChangedListener(new C9307e());
        editText.setText(this.f49330Q0);
        C29788ee c29788ee5 = this.f49326M0;
        if (c29788ee5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29788ee2 = c29788ee5;
        }
        c29788ee2.f137701q.setOnClickListener(new View.OnClickListener() { // from class: cz.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserNamingView.m49948mM(UserNamingView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m49948mM(UserNamingView userNamingView, View view) {
        AbstractC19074t.m100208f(userNamingView, "this$0");
        C29788ee c29788ee = null;
        AbstractC20887g.m109217D(510050, null, 2, null);
        C17667v0.f89659a.m93647d(userNamingView.m92676n2());
        C29788ee c29788ee2 = userNamingView.f49326M0;
        if (c29788ee2 == null) {
            AbstractC19074t.m100223u("binding");
            c29788ee2 = null;
        }
        c29788ee2.f137702r.setFieldState(EnumC17007i.NORMAL);
        C29788ee c29788ee3 = userNamingView.f49326M0;
        if (c29788ee3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29788ee = c29788ee3;
        }
        userNamingView.m49955rM(String.valueOf(c29788ee.f137702r.getEditText().getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m49949nM(UserNamingView userNamingView) {
        AbstractC19074t.m100208f(userNamingView, "this$0");
        C17667v0 c17667v0 = C17667v0.f89659a;
        C29788ee c29788ee = userNamingView.f49326M0;
        if (c29788ee == null) {
            AbstractC19074t.m100223u("binding");
            c29788ee = null;
        }
        c17667v0.m93648e(c29788ee.f137702r.getEditText());
    }

    /* renamed from: oM */
    private final EnumC9304b m49950oM(String str) {
        if (str.length() == 0) {
            return EnumC9304b.f49340t;
        }
        C24329j c24329j = new C24329j(".*\\d.*");
        C24329j c24329j2 = new C24329j("[,.?!'\"+-=/*%<>$€£¥(){}\\[\\]&#@^_|~;:\\\\/]");
        if (str.length() < 2) {
            return EnumC9304b.f49338r;
        }
        if (str.length() > 40) {
            return EnumC9304b.f49339s;
        }
        if (c24329j.m127018f(str)) {
            this.f49333T0 = false;
            return EnumC9304b.f49336p;
        }
        if (c24329j2.m127015a(str)) {
            this.f49333T0 = false;
            return EnumC9304b.f49337q;
        }
        return EnumC9304b.f49340t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public final void m49951qM(TextField textField, String str) {
        int m116584g;
        int m116584g2;
        int i11 = C9305c.f49343a[m49950oM(str).ordinal()];
        boolean z11 = true;
        C29788ee c29788ee = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            if (!this.f49333T0) {
                                textField.setFieldState(EnumC17007i.NORMAL);
                                C29788ee c29788ee2 = this.f49326M0;
                                if (c29788ee2 == null) {
                                    AbstractC19074t.m100223u("binding");
                                } else {
                                    c29788ee = c29788ee2;
                                }
                                Button button = c29788ee.f137701q;
                                if (str.length() <= 0) {
                                    z11 = false;
                                }
                                button.setEnabled(z11);
                                return;
                            }
                            this.f49333T0 = false;
                            return;
                        }
                        return;
                    }
                    textField.setFieldState(EnumC17007i.ERROR);
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_enter_name_pre_validate_error_contain_number);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    textField.setErrorText(m118743r0);
                    C29788ee c29788ee3 = this.f49326M0;
                    if (c29788ee3 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29788ee = c29788ee3;
                    }
                    c29788ee.f137701q.setEnabled(false);
                    this.f49333T0 = false;
                    return;
                }
                textField.setFieldState(EnumC17007i.ERROR);
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_enter_name_pre_validate_error_contain_special_character);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                textField.setErrorText(m118743r02);
                C29788ee c29788ee4 = this.f49326M0;
                if (c29788ee4 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29788ee = c29788ee4;
                }
                c29788ee.f137701q.setEnabled(false);
                this.f49333T0 = false;
                return;
            }
            textField.setFieldState(EnumC17007i.NORMAL);
            C29788ee c29788ee5 = this.f49326M0;
            if (c29788ee5 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29788ee = c29788ee5;
            }
            c29788ee.f137701q.setEnabled(false);
            this.f49333T0 = false;
            return;
        }
        textField.setFieldState(EnumC17007i.ERROR);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_enter_name_pre_validate_error_too_long);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        textField.setErrorText(m118743r03);
        C29788ee c29788ee6 = this.f49326M0;
        if (c29788ee6 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29788ee = c29788ee6;
        }
        this.f49334U0 = c29788ee.f137702r.getEditText().getSelectionStart();
        this.f49333T0 = true;
        EditText editText = textField.getEditText();
        m116584g = AbstractC22543l.m116584g(str.length(), 40);
        String substring = str.substring(0, m116584g);
        AbstractC19074t.m100207e(substring, "substring(...)");
        editText.setText(substring);
        EditText editText2 = textField.getEditText();
        m116584g2 = AbstractC22543l.m116584g(this.f49334U0, 40);
        editText2.setSelection(m116584g2);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("EXTRA_PHONE_NUMBER", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f49327N0 = string;
            String string2 = m92642L3.getString("EXTRA_SESSION_TOKEN", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f49328O0 = string2;
            this.f49329P0 = m92642L3.getInt("EXTRA_RENEW_ACCOUNT", 0);
            String string3 = m92642L3.getString("EXTRA_DISPLAY_NAME", "");
            AbstractC19074t.m100207e(string3, "getString(...)");
            this.f49330Q0 = string3;
            String string4 = m92642L3.getString("EXTRA_E_KYC_INFO");
            if (string4 != null && string4.length() != 0) {
                JSONObject jSONObject = new JSONObject(string4);
                this.f49331R0 = jSONObject;
                String optString = jSONObject.optString("name");
                AbstractC19074t.m100207e(optString, "optString(...)");
                this.f49330Q0 = optString;
            }
            String string5 = m92642L3.getString("EXTRA_E_KYC_TOKEN", "");
            AbstractC19074t.m100207e(string5, "getString(...)");
            this.f49332S0 = string5;
        }
        m49946iM();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(16);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return mo49769EJ(i11, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "objects");
        if (i11 == 1) {
            C17667v0 c17667v0 = C17667v0.f89659a;
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            return c17667v0.m93646b(this, (String) obj);
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29788ee m147913c = C29788ee.m147913c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147913c, "inflate(...)");
        this.f49326M0 = m147913c;
        m49947lM();
        C29788ee c29788ee = this.f49326M0;
        if (c29788ee == null) {
            AbstractC19074t.m100223u("binding");
            c29788ee = null;
        }
        FrameLayout root = c29788ee.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            AbstractC19444a.m101694b(new Runnable() { // from class: cz.a2
                @Override // java.lang.Runnable
                public final void run() {
                    UserNamingView.m49949nM(UserNamingView.this);
                }
            }, 50L);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UserNamingView";
    }

    /* renamed from: jM */
    public final String m49952jM() {
        return this.f49327N0;
    }

    /* renamed from: kM */
    public final int m49953kM() {
        return this.f49329P0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyUp(i11, keyEvent);
        }
        return true;
    }

    /* renamed from: pM */
    public final void m49954pM(boolean z11) {
        this.f49335V0 = z11;
    }

    /* renamed from: rM */
    public final void m49955rM(String str) {
        AbstractC19074t.m100208f(str, "displayName");
        if (this.f49335V0) {
            m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
            return;
        }
        this.f49335V0 = true;
        m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C9308f(str));
        c0766k.mo1478L8(this.f49327N0, AbstractC23153n4.m119147r(), str, this.f49328O0, this.f49332S0);
    }
}
