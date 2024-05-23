package com.zing.zalo.register.enterphonenumber;

import ae.C0766k;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import au.AbstractC2373t;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.LoginView;
import com.zing.zalo.p077ui.zviews.PolicyZView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.WebInAppView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.register.BannedAccountRegisterView;
import com.zing.zalo.register.bottomsheet.RegisterLayoutBottomSheet;
import com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.PhoneField;
import com.zing.zalo.zdesign.component.inputfield.EditText;
import com.zing.zalo.zdesign.component.inputfield.EnumC17007i;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import cz.C17667v0;
import cz.C17670w0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23216t1;
import me0.C23212s8;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p588vw.C28647m;
import p588vw.C28655u;
import p649xl.C29903l3;
import p649xl.C29910la;
import pm0.C24848g0;
import vg.C28023b6;

/* loaded from: classes4.dex */
public final class EnterUserNumberPhoneView extends SlidableZaloView {
    public static final C9316c Companion = new C9316c(null);

    /* renamed from: P0 */
    public C29903l3 f49380P0;

    /* renamed from: Q0 */
    private boolean f49381Q0;

    /* renamed from: R0 */
    private C28655u f49382R0;

    /* renamed from: Y0 */
    private boolean f49389Y0;

    /* renamed from: Z0 */
    private boolean f49390Z0;

    /* renamed from: b1 */
    private boolean f49392b1;

    /* renamed from: c1 */
    private boolean f49393c1;

    /* renamed from: S0 */
    private HashMap f49383S0 = new HashMap();

    /* renamed from: T0 */
    private HashMap f49384T0 = new HashMap();

    /* renamed from: U0 */
    private ArrayList f49385U0 = new ArrayList();

    /* renamed from: V0 */
    private ArrayList f49386V0 = new ArrayList();

    /* renamed from: W0 */
    private final String[] f49387W0 = AbstractC23034c6.m118174q0();

    /* renamed from: X0 */
    private String f49388X0 = "";

    /* renamed from: a1 */
    private String f49391a1 = "";

    /* renamed from: com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView$a */
    /* loaded from: classes4.dex */
    public static final class C9314a {

        /* renamed from: a */
        private int f49394a;

        /* renamed from: b */
        private String f49395b;

        /* renamed from: c */
        private String f49396c;

        /* renamed from: d */
        private String f49397d;

        /* renamed from: e */
        private String f49398e;

        /* renamed from: f */
        private long f49399f;

        public C9314a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "json");
            this.f49395b = "";
            this.f49396c = "";
            this.f49397d = "";
            this.f49398e = "";
            this.f49394a = jSONObject.optInt("id", 0);
            String optString = jSONObject.optString("vi", "");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f49395b = optString;
            String optString2 = jSONObject.optString("en", "");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f49396c = optString2;
            String optString3 = jSONObject.optString("url_vi", "");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            this.f49397d = optString3;
            String optString4 = jSONObject.optString("url_en", "");
            AbstractC19074t.m100207e(optString4, "optString(...)");
            this.f49398e = optString4;
        }

        /* renamed from: a */
        public final String m50121a() {
            if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi")) {
                return this.f49395b;
            }
            return this.f49396c;
        }

        /* renamed from: b */
        public final int m50122b() {
            return this.f49394a;
        }

        /* renamed from: c */
        public final JSONObject m50123c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("term_id", this.f49394a);
                jSONObject.put("timestamp", this.f49399f);
                jSONObject.put("action", "agree");
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        /* renamed from: d */
        public final String m50124d() {
            if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi")) {
                return this.f49397d;
            }
            return this.f49398e;
        }

        /* renamed from: e */
        public final void m50125e() {
            this.f49399f = System.currentTimeMillis() - AbstractC23304d.f113305N;
        }
    }

    /* renamed from: com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView$b */
    /* loaded from: classes4.dex */
    public final class C9315b extends C10866e {

        /* renamed from: g0 */
        private String f49400g0;

        /* renamed from: h0 */
        final /* synthetic */ EnterUserNumberPhoneView f49401h0;

        public C9315b(EnterUserNumberPhoneView enterUserNumberPhoneView, InterfaceC27218a interfaceC27218a, String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            this.f49401h0 = enterUserNumberPhoneView;
            this.f49400g0 = str;
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            AbstractC19074t.m100208f(view, "widget");
            C17667v0.f89659a.m93647d(this.f49401h0.m92676n2());
            C17487o0 m92662fJ = this.f49401h0.m92662fJ();
            if (m92662fJ != null) {
                EnterUserNumberPhoneView enterUserNumberPhoneView = this.f49401h0;
                if (TextUtils.isEmpty(this.f49400g0)) {
                    m92662fJ.m93069k2(PolicyZView.class, null, 1, true);
                    return;
                }
                enterUserNumberPhoneView.m50118dN(true);
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_URL", this.f49400g0);
                m92662fJ.m93069k2(WebInAppView.class, bundle, 1, true);
            }
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            textPaint.setUnderlineText(false);
            if (this.f54861x) {
                textPaint.bgColor = C23212s8.m119607o(this.f49401h0.getContext(), AbstractC16781w.ItemBackgroundSelectedColor);
            } else {
                textPaint.bgColor = AbstractC23136l9.m118641B(this.f49401h0.m92689tK(), AbstractC16801x.transparent);
            }
            textPaint.setColor(C23212s8.m119607o(this.f49401h0.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* renamed from: com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView$c */
    /* loaded from: classes4.dex */
    public static final class C9316c {
        private C9316c() {
        }

        public /* synthetic */ C9316c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView$d */
    /* loaded from: classes4.dex */
    public static final class C9317d {

        /* renamed from: a */
        private boolean f49402a;

        /* renamed from: b */
        private String f49403b;

        /* renamed from: c */
        private Set f49404c;

        /* renamed from: d */
        private List f49405d;

        /* renamed from: e */
        private int f49406e;

        public C9317d(String str, JSONArray jSONArray) {
            AbstractC19074t.m100208f(str, "region");
            this.f49403b = "";
            this.f49404c = new HashSet();
            this.f49405d = new ArrayList();
            this.f49406e = 14;
            this.f49403b = str;
            if (AbstractC19074t.m100204b(str, "default")) {
                this.f49402a = true;
            }
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Set set = this.f49404c;
                    String optString = jSONArray.optString(i11, "");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    set.add(optString);
                }
            }
        }

        /* renamed from: a */
        public final void m50127a(C9314a c9314a) {
            AbstractC19074t.m100208f(c9314a, "action");
            this.f49405d.add(c9314a);
        }

        /* renamed from: b */
        public final boolean m50128b(String str) {
            AbstractC19074t.m100208f(str, "countryCode");
            if (this.f49402a) {
                return true;
            }
            return this.f49404c.contains(str);
        }

        /* renamed from: c */
        public final List m50129c() {
            return this.f49405d;
        }

        /* renamed from: d */
        public final int m50130d() {
            return this.f49406e;
        }

        /* renamed from: e */
        public final String m50131e() {
            return this.f49403b;
        }

        /* renamed from: f */
        public final void m50132f(int i11) {
            this.f49406e = i11;
        }
    }

    /* renamed from: com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView$e */
    /* loaded from: classes4.dex */
    public static final class C9318e implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC23216t1.c {

            /* renamed from: a */
            final /* synthetic */ EnterUserNumberPhoneView f49408a;

            a(EnterUserNumberPhoneView enterUserNumberPhoneView) {
                this.f49408a = enterUserNumberPhoneView;
            }

            @Override // me0.AbstractC23216t1.c
            /* renamed from: a */
            public void mo50139a() {
                this.f49408a.finish();
            }

            @Override // me0.AbstractC23216t1.c
            /* renamed from: b */
            public void mo50140b(String str) {
                if (str != null && str.length() != 0) {
                    ToastUtils.m89276x(this.f49408a, str);
                }
            }
        }

        C9318e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m50136f(JSONObject jSONObject, EnterUserNumberPhoneView enterUserNumberPhoneView) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("actions");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                        C9314a c9314a = new C9314a(jSONObject2);
                        enterUserNumberPhoneView.f49383S0.put(Integer.valueOf(c9314a.m50122b()), c9314a);
                    }
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("regions");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        AbstractC19074t.m100205c(next);
                        enterUserNumberPhoneView.f49385U0.add(new C9317d(next, optJSONObject.getJSONArray(next)));
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("minimum_age");
                if (optJSONObject2 != null) {
                    Iterator<String> keys2 = optJSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        HashMap hashMap = enterUserNumberPhoneView.f49384T0;
                        AbstractC19074t.m100205c(next2);
                        hashMap.put(next2, Integer.valueOf(optJSONObject2.optInt(next2, C17670w0.f89662a.m93650b())));
                    }
                }
                enterUserNumberPhoneView.f49385U0.add(new C9317d("default", null));
                JSONObject optJSONObject3 = jSONObject.optJSONObject("region_action");
                if (optJSONObject3 != null) {
                    Iterator<String> keys3 = optJSONObject3.keys();
                    while (keys3.hasNext()) {
                        String next3 = keys3.next();
                        if (optJSONObject3.get(next3) instanceof JSONArray) {
                            int size = enterUserNumberPhoneView.f49385U0.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size) {
                                    JSONArray jSONArray = optJSONObject3.getJSONArray(next3);
                                    Object obj = enterUserNumberPhoneView.f49385U0.get(i12);
                                    AbstractC19074t.m100207e(obj, "get(...)");
                                    C9317d c9317d = (C9317d) obj;
                                    if (AbstractC19074t.m100204b(next3, c9317d.m50131e())) {
                                        int length2 = jSONArray.length();
                                        for (int i13 = 0; i13 < length2; i13++) {
                                            C9314a c9314a2 = (C9314a) enterUserNumberPhoneView.f49383S0.get(Integer.valueOf(jSONArray.getInt(i13)));
                                            Integer num = (Integer) enterUserNumberPhoneView.f49384T0.get(c9317d.m50131e());
                                            if (c9314a2 != null) {
                                                c9317d.m50127a(c9314a2);
                                            }
                                            if (num != null) {
                                                c9317d.m50132f(num.intValue());
                                            }
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                }
                enterUserNumberPhoneView.f49382R0 = (C28655u) C28647m.m143325c().m143328b().get(AbstractC23309i.m121704a5());
                enterUserNumberPhoneView.m50088eN();
                C28655u c28655u = enterUserNumberPhoneView.f49382R0;
                if (c28655u != null) {
                    String str = c28655u.f132864b;
                    AbstractC19074t.m100207e(str, "isocountrycodes");
                    enterUserNumberPhoneView.m50094iN(str, true);
                }
                enterUserNumberPhoneView.m50092hN();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m50137g(EnterUserNumberPhoneView enterUserNumberPhoneView) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            ToastUtils.m89276x(enterUserNumberPhoneView, AbstractC23136l9.m118743r0(AbstractC8020f0.str_general_error) + "(502)");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m50138h(EnterUserNumberPhoneView enterUserNumberPhoneView) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            enterUserNumberPhoneView.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            EnterUserNumberPhoneView.this.m78954jL();
            EnterUserNumberPhoneView enterUserNumberPhoneView = EnterUserNumberPhoneView.this;
            if (AbstractC23216t1.m119642g(enterUserNumberPhoneView, c20096c, new a(enterUserNumberPhoneView))) {
                return;
            }
            final EnterUserNumberPhoneView enterUserNumberPhoneView2 = EnterUserNumberPhoneView.this;
            enterUserNumberPhoneView2.mo70710wy(new Runnable() { // from class: ez.q
                @Override // java.lang.Runnable
                public final void run() {
                    EnterUserNumberPhoneView.C9318e.m50137g(EnterUserNumberPhoneView.this);
                }
            });
            final EnterUserNumberPhoneView enterUserNumberPhoneView3 = EnterUserNumberPhoneView.this;
            AbstractC19444a.m101694b(new Runnable() { // from class: ez.r
                @Override // java.lang.Runnable
                public final void run() {
                    EnterUserNumberPhoneView.C9318e.m50138h(EnterUserNumberPhoneView.this);
                }
            }, 1500L);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            try {
                EnterUserNumberPhoneView.this.m78954jL();
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    final EnterUserNumberPhoneView enterUserNumberPhoneView = EnterUserNumberPhoneView.this;
                    long optLong = optJSONObject.optLong("timestamp_in_milis", 0L);
                    if (optLong > 0) {
                        AbstractC23304d.f113305N = System.currentTimeMillis() - optLong;
                    }
                    String optString = optJSONObject.optString("sessionToken", "");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    enterUserNumberPhoneView.f49388X0 = optString;
                    final JSONObject optJSONObject2 = optJSONObject.optJSONObject("terms");
                    if (optJSONObject2 != null) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: ez.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                EnterUserNumberPhoneView.C9318e.m50136f(optJSONObject2, enterUserNumberPhoneView);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView$f */
    /* loaded from: classes4.dex */
    public static final class C9319f extends ClickableSpan {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18494a f49409p;

        C9319f(InterfaceC18494a interfaceC18494a) {
            this.f49409p = interfaceC18494a;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "textView");
            this.f49409p.mo12V4();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView$g */
    /* loaded from: classes4.dex */
    public static final class C9320g implements TextWatcher {
        C9320g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m50143c(EnterUserNumberPhoneView enterUserNumberPhoneView, C19059j0 c19059j0) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            AbstractC19074t.m100208f(c19059j0, "$textToUpdate");
            enterUserNumberPhoneView.m50115PM().f138550s.getEditText().setText((CharSequence) c19059j0.f94941p);
            enterUserNumberPhoneView.m50115PM().f138550s.getEditText().setSelection(((String) c19059j0.f94941p).length());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m50144d(EnterUserNumberPhoneView enterUserNumberPhoneView) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            enterUserNumberPhoneView.m50115PM().f138550s.getEditText().setText("");
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EnterUserNumberPhoneView.this.m50115PM().f138550s.setFieldState(EnumC17007i.NORMAL);
            EnterUserNumberPhoneView.this.m50092hN();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            String m127114D;
            CharSequence m127170Y0;
            if (charSequence != null) {
                final EnterUserNumberPhoneView enterUserNumberPhoneView = EnterUserNumberPhoneView.this;
                if (charSequence.length() < 19 && charSequence.length() > 0) {
                    m127114D = AbstractC24341v.m127114D(new C24329j("[^0-9]").m127019g(charSequence.toString(), ""), " ", "", false, 4, null);
                    if (m127114D.length() > 0) {
                        final C19059j0 c19059j0 = new C19059j0();
                        c19059j0.f94941p = m127114D;
                        for (int length = m127114D.length() / 4; length > 0; length += -1) {
                            int i14 = length * 4;
                            String substring = ((String) c19059j0.f94941p).substring(0, i14);
                            AbstractC19074t.m100207e(substring, "substring(...)");
                            String substring2 = ((String) c19059j0.f94941p).substring(i14);
                            AbstractC19074t.m100207e(substring2, "substring(...)");
                            c19059j0.f94941p = substring + " " + substring2;
                        }
                        m127170Y0 = AbstractC24342w.m127170Y0((String) c19059j0.f94941p);
                        String obj = m127170Y0.toString();
                        c19059j0.f94941p = obj;
                        if (!TextUtils.equals(obj, charSequence.toString())) {
                            AbstractC19444a.m101697e(new Runnable() { // from class: ez.s
                                @Override // java.lang.Runnable
                                public final void run() {
                                    EnterUserNumberPhoneView.C9320g.m50143c(EnterUserNumberPhoneView.this, c19059j0);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    AbstractC19444a.m101697e(new Runnable() { // from class: ez.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            EnterUserNumberPhoneView.C9320g.m50144d(EnterUserNumberPhoneView.this);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView$h */
    /* loaded from: classes4.dex */
    public static final class C9321h extends AbstractC19075u implements InterfaceC18494a {
        C9321h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m50145a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m50145a() {
            AbstractC20887g.m109217D(510011, null, 2, null);
            C17487o0 m92662fJ = EnterUserNumberPhoneView.this.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(LoginView.class, null, 1, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView$i */
    /* loaded from: classes4.dex */
    public static final class C9322i implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f49413b;

        C9322i(String str) {
            this.f49413b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m50152i(EnterUserNumberPhoneView enterUserNumberPhoneView, String str) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            enterUserNumberPhoneView.m50115PM().f138550s.m91044C(true);
            enterUserNumberPhoneView.m50115PM().f138550s.setFieldState(EnumC17007i.ERROR);
            PhoneField phoneField = enterUserNumberPhoneView.m50115PM().f138550s;
            AbstractC19074t.m100205c(str);
            phoneField.setErrorText(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static final void m50153j(EnterUserNumberPhoneView enterUserNumberPhoneView) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            ToastUtils.m89275w(enterUserNumberPhoneView, ToastUtils.EnumC16738b.DISCONNECTED, "50001");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static final void m50154k(EnterUserNumberPhoneView enterUserNumberPhoneView) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            enterUserNumberPhoneView.showDialog(3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m50155l(EnterUserNumberPhoneView enterUserNumberPhoneView, Bundle bundle) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            AbstractC19074t.m100208f(bundle, "$bundle");
            C17487o0 m92662fJ = enterUserNumberPhoneView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(BannedAccountRegisterView.class, bundle, 1, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static final void m50156m(EnterUserNumberPhoneView enterUserNumberPhoneView, C20096c c20096c) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            enterUserNumberPhoneView.m92639EK(2, c20096c.m104492d());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m50157n(EnterUserNumberPhoneView enterUserNumberPhoneView, C20096c c20096c) {
            AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
            enterUserNumberPhoneView.m50115PM().f138550s.m91044C(true);
            enterUserNumberPhoneView.m50115PM().f138550s.setFieldState(EnumC17007i.ERROR);
            PhoneField phoneField = enterUserNumberPhoneView.m50115PM().f138550s;
            AbstractC19074t.m100205c(c20096c);
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            phoneField.setErrorText(m104492d);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            Integer num;
            String m127114D;
            EnterUserNumberPhoneView.this.m50119fN(false);
            EnterUserNumberPhoneView.this.m78954jL();
            final EnterUserNumberPhoneView enterUserNumberPhoneView = EnterUserNumberPhoneView.this;
            if (AbstractC23216t1.m119643h(enterUserNumberPhoneView.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: ez.u
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    EnterUserNumberPhoneView.C9322i.m50152i(EnterUserNumberPhoneView.this, str);
                }
            })) {
                return;
            }
            if (c20096c != null) {
                num = Integer.valueOf(c20096c.m104491c());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 50001) {
                final EnterUserNumberPhoneView enterUserNumberPhoneView2 = EnterUserNumberPhoneView.this;
                enterUserNumberPhoneView2.mo70710wy(new Runnable() { // from class: ez.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        EnterUserNumberPhoneView.C9322i.m50153j(EnterUserNumberPhoneView.this);
                    }
                });
                return;
            }
            if (num != null && num.intValue() == 2030) {
                final EnterUserNumberPhoneView enterUserNumberPhoneView3 = EnterUserNumberPhoneView.this;
                enterUserNumberPhoneView3.mo70710wy(new Runnable() { // from class: ez.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        EnterUserNumberPhoneView.C9322i.m50154k(EnterUserNumberPhoneView.this);
                    }
                });
                return;
            }
            if (num != null && num.intValue() == 2050) {
                C17667v0.f89659a.m93647d(EnterUserNumberPhoneView.this.m92676n2());
                AbstractC23153n4.m119153u(EnterUserNumberPhoneView.this.m92676n2(), new JSONObject(c20096c.m104490b().toString()).optJSONObject("data"), 65432, this.f49413b, 0, EnterUserNumberPhoneView.this.f49388X0);
                return;
            }
            if (num != null && num.intValue() == 2060) {
                C17667v0.f89659a.m93647d(EnterUserNumberPhoneView.this.m92676n2());
                AbstractC23153n4.m119155v(EnterUserNumberPhoneView.this.m92676n2(), new JSONObject(c20096c.m104490b().toString()).optJSONObject("data"), 65433);
                return;
            }
            if (num != null && num.intValue() == 2065) {
                AbstractC2373t.m12412j();
                return;
            }
            if (num != null && num.intValue() == 2020) {
                EnterUserNumberPhoneView.this.f49390Z0 = true;
                final Bundle bundle = new Bundle();
                m127114D = AbstractC24341v.m127114D(this.f49413b, " ", "", false, 4, null);
                bundle.putString("EXTRA_PHONE_NUMBER", m127114D);
                bundle.putString("EXTRA_BAN_MESSAGE", c20096c.m104492d());
                final EnterUserNumberPhoneView enterUserNumberPhoneView4 = EnterUserNumberPhoneView.this;
                enterUserNumberPhoneView4.mo70710wy(new Runnable() { // from class: ez.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        EnterUserNumberPhoneView.C9322i.m50155l(EnterUserNumberPhoneView.this, bundle);
                    }
                });
                return;
            }
            if (num != null && num.intValue() == 2003) {
                final EnterUserNumberPhoneView enterUserNumberPhoneView5 = EnterUserNumberPhoneView.this;
                enterUserNumberPhoneView5.mo70710wy(new Runnable() { // from class: ez.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        EnterUserNumberPhoneView.C9322i.m50156m(EnterUserNumberPhoneView.this, c20096c);
                    }
                });
            } else {
                final EnterUserNumberPhoneView enterUserNumberPhoneView6 = EnterUserNumberPhoneView.this;
                enterUserNumberPhoneView6.mo70710wy(new Runnable() { // from class: ez.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        EnterUserNumberPhoneView.C9322i.m50157n(EnterUserNumberPhoneView.this, c20096c);
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            EnterUserNumberPhoneView.this.m50119fN(false);
            EnterUserNumberPhoneView.this.m78954jL();
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                AbstractC23153n4.m119087B(EnterUserNumberPhoneView.this.m92676n2(), 1, this.f49413b, optJSONObject);
            }
        }
    }

    /* renamed from: GM */
    private final boolean m50068GM() {
        return AbstractC23034c6.m118116D(m92689tK(), this.f49387W0);
    }

    /* renamed from: HM */
    private final KeyEventCallbackC17462c m50069HM() {
        String str;
        boolean m127126v;
        String m119145q = AbstractC23153n4.m119145q(String.valueOf(m50115PM().f138550s.getEditText().getText()));
        C28655u c28655u = this.f49382R0;
        if (c28655u != null) {
            str = c28655u.f132864b;
        } else {
            str = null;
        }
        String m118283i = AbstractC23056e6.m118283i(m119145q, str, true, 4);
        if (!TextUtils.isEmpty(m118283i)) {
            m127126v = AbstractC24341v.m127126v(m118283i, AbstractC23056e6.f112062a, true);
            if (!m127126v) {
                m119145q = m118283i;
            }
        }
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_receive_verification_code_via, m119145q);
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_verification_code_message);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a aVar = new C16972e0.a(m92689tK);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90918B(m118746s0);
        aVar.m90949z(m118743r0);
        aVar.m90922F(true);
        aVar.m90945v(AbstractC2814h.ButtonMedium_Tertiary);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_next);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        aVar.m90943t(m118743r02, new InterfaceC17463d.d() { // from class: ez.k
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                EnterUserNumberPhoneView.m50070IM(EnterUserNumberPhoneView.this, interfaceC17463d, i11);
            }
        });
        aVar.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_number);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        aVar.m90934k(m118743r03, new InterfaceC17463d.d() { // from class: ez.l
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                EnterUserNumberPhoneView.m50071JM(EnterUserNumberPhoneView.this, interfaceC17463d, i11);
            }
        });
        return aVar.m90927d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m50070IM(EnterUserNumberPhoneView enterUserNumberPhoneView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        interfaceC17463d.dismiss();
        String str = null;
        AbstractC20887g.m109217D(510012, null, 2, null);
        if (!enterUserNumberPhoneView.m50068GM()) {
            C28655u c28655u = enterUserNumberPhoneView.f49382R0;
            if (c28655u != null) {
                str = c28655u.f132865c;
            }
            if (AbstractC19074t.m100204b(str, "84")) {
                enterUserNumberPhoneView.m50090gN();
                return;
            }
        }
        enterUserNumberPhoneView.m50120mN(String.valueOf(enterUserNumberPhoneView.m50115PM().f138550s.getEditText().getText()), "", "", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m50071JM(final EnterUserNumberPhoneView enterUserNumberPhoneView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        interfaceC17463d.dismiss();
        AbstractC20887g.m109217D(510013, null, 2, null);
        AbstractC19444a.m101694b(new Runnable() { // from class: ez.f
            @Override // java.lang.Runnable
            public final void run() {
                EnterUserNumberPhoneView.m50072KM(EnterUserNumberPhoneView.this);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m50072KM(EnterUserNumberPhoneView enterUserNumberPhoneView) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        C28655u c28655u = enterUserNumberPhoneView.f49382R0;
        if (c28655u != null) {
            String str = c28655u.f132864b;
            AbstractC19074t.m100207e(str, "isocountrycodes");
            enterUserNumberPhoneView.m50094iN(str, true);
        }
        C17667v0.f89659a.m93648e(enterUserNumberPhoneView.m50115PM().f138550s.getEditText());
    }

    /* renamed from: LM */
    private final KeyEventCallbackC17462c m50073LM() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_version_zalo_outdated);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_version_zalo_outdated_description);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a aVar = new C16972e0.a(m92689tK);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90918B(m118743r0);
        aVar.m90949z(m118743r02);
        aVar.m90945v(AbstractC2814h.ButtonMedium_Tertiary);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_user_update_avatar_button_update_title);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        aVar.m90943t(m118743r03, new InterfaceC17463d.d() { // from class: ez.g
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                EnterUserNumberPhoneView.m50074MM(EnterUserNumberPhoneView.this, interfaceC17463d, i11);
            }
        });
        aVar.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_close);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        aVar.m90934k(m118743r04, new InterfaceC17463d.d() { // from class: ez.h
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                EnterUserNumberPhoneView.m50075NM(interfaceC17463d, i11);
            }
        });
        return aVar.m90927d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m50074MM(EnterUserNumberPhoneView enterUserNumberPhoneView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        interfaceC17463d.dismiss();
        try {
            ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
            InterfaceC27218a m92676n2 = enterUserNumberPhoneView.m92676n2();
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ratezalo_url);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{enterUserNumberPhoneView.m92686rK().getPackageName()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            c15403a.m87168C(m92676n2, format);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public static final void m50075NM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static final void m50076OM(EnterUserNumberPhoneView enterUserNumberPhoneView, String str) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        PhoneField phoneField = enterUserNumberPhoneView.m50115PM().f138550s;
        AbstractC19074t.m100205c(str);
        phoneField.setPhoneCode(str);
        m50096jN(enterUserNumberPhoneView, str, false, 2, null);
    }

    /* renamed from: RM */
    private final C28655u m50077RM() {
        C28655u c28655u = new C28655u("Vietnam", "VN", "84", -1, true, true);
        c28655u.f132871i = true;
        return c28655u;
    }

    /* renamed from: SM */
    private final SpannableString m50078SM(String str, int i11, int i12, InterfaceC18494a interfaceC18494a) {
        C9319f c9319f = new C9319f(interfaceC18494a);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(c9319f, i11, i12, 33);
        spannableString.setSpan(new StyleSpan(1), i11, i12, 33);
        return spannableString;
    }

    /* renamed from: TM */
    private final void m50079TM() {
        FrameLayout root = m50115PM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), AbstractC17484n.Companion.m92931b(), root.getPaddingRight(), root.getPaddingBottom());
        PhoneField phoneField = m50115PM().f138550s;
        phoneField.getLeftControlsLayout().setOnClickListener(new View.OnClickListener() { // from class: ez.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterUserNumberPhoneView.m50080UM(EnterUserNumberPhoneView.this, view);
            }
        });
        phoneField.setMaxLength(19);
        phoneField.getEditText().addTextChangedListener(new C9320g());
        String str = AbstractC23304d.f113402k0;
        if (str != null) {
            AbstractC19074t.m100205c(str);
            EditText editText = m50115PM().f138550s.getEditText();
            if (str.length() > 16) {
                str = str.substring(0, 16);
                AbstractC19074t.m100207e(str, "substring(...)");
            }
            editText.setText(str);
        }
        RobotoTextView robotoTextView = m50115PM().f138553v;
        robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_already_have_an_account, AbstractC23136l9.m118743r0(AbstractC8020f0.str_login_now));
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        robotoTextView.setText(m50078SM(m118746s0, m118746s0.length() - AbstractC23136l9.m118743r0(AbstractC8020f0.str_login_now).length(), m118746s0.length(), new C9321h()), TextView.BufferType.SPANNABLE);
        robotoTextView.setHighlightColor(0);
        m50115PM().f138549r.setOnClickListener(new View.OnClickListener() { // from class: ez.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterUserNumberPhoneView.m50081VM(EnterUserNumberPhoneView.this, view);
            }
        });
        m50115PM().f138548q.setOnClickListener(new View.OnClickListener() { // from class: ez.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterUserNumberPhoneView.m50082WM(EnterUserNumberPhoneView.this, view);
            }
        });
        if (this.f49382R0 == null) {
            this.f49382R0 = m50077RM();
        }
        m50088eN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m50080UM(EnterUserNumberPhoneView enterUserNumberPhoneView, View view) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        Bundle bundle = new Bundle();
        C28655u c28655u = enterUserNumberPhoneView.f49382R0;
        if (c28655u != null) {
            bundle.putString("icc", c28655u.m143390a());
        }
        C17667v0.f89659a.m93647d(enterUserNumberPhoneView.m92676n2());
        C17487o0 m92662fJ = enterUserNumberPhoneView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(SelectCountryView.class, bundle, 1001, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final void m50081VM(EnterUserNumberPhoneView enterUserNumberPhoneView, View view) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = enterUserNumberPhoneView.f49386V0.iterator();
            while (it.hasNext()) {
                C29910la c29910la = (C29910la) it.next();
                if (c29910la.getRoot().getVisibility() == 0 && c29910la.getRoot().getTag() != null) {
                    Object tag = c29910la.getRoot().getTag();
                    AbstractC19074t.m100206d(tag, "null cannot be cast to non-null type com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView.Action");
                    jSONArray.put(((C9314a) tag).m50123c());
                }
            }
            AbstractC0924m0.m3312Oe(jSONArray.toString());
        } catch (Exception unused) {
        }
        AbstractC20887g.m109217D(510010, null, 2, null);
        enterUserNumberPhoneView.m50115PM().f138550s.setFieldState(EnumC17007i.NORMAL);
        enterUserNumberPhoneView.showDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public static final void m50082WM(EnterUserNumberPhoneView enterUserNumberPhoneView, View view) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        C17667v0.f89659a.m93647d(enterUserNumberPhoneView.m92676n2());
        enterUserNumberPhoneView.finish();
    }

    /* renamed from: XM */
    private final boolean m50083XM() {
        Iterator it = this.f49386V0.iterator();
        while (it.hasNext()) {
            C29910la c29910la = (C29910la) it.next();
            if (c29910la.getRoot().getVisibility() == 0 && !c29910la.f138594q.isChecked()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public static final void m50084YM(EnterUserNumberPhoneView enterUserNumberPhoneView) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        enterUserNumberPhoneView.m50115PM().f138549r.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public static final void m50085ZM(EnterUserNumberPhoneView enterUserNumberPhoneView, String str) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        AbstractC19074t.m100208f(str, "errorMsg");
        if (str.length() > 0) {
            ToastUtils.m89276x(enterUserNumberPhoneView, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public static final void m50086aN(EnterUserNumberPhoneView enterUserNumberPhoneView) {
        ZaloView zaloView;
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        C17487o0 m92662fJ = enterUserNumberPhoneView.m92662fJ();
        if (m92662fJ != null) {
            zaloView = m92662fJ.m93012K0();
        } else {
            zaloView = null;
        }
        if (AbstractC19074t.m100204b(zaloView, enterUserNumberPhoneView)) {
            enterUserNumberPhoneView.m50120mN(String.valueOf(enterUserNumberPhoneView.m50115PM().f138550s.getEditText().getText()), "", "", 0);
        } else {
            enterUserNumberPhoneView.f49392b1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public static final void m50087bN(EnterUserNumberPhoneView enterUserNumberPhoneView) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        C17667v0.f89659a.m93648e(enterUserNumberPhoneView.m50115PM().f138550s.getEditText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public final void m50088eN() {
        C28655u c28655u = this.f49382R0;
        if (c28655u != null) {
            m50115PM().f138550s.setPhoneCode("+" + c28655u.f132865c);
        }
    }

    /* renamed from: gN */
    private final void m50090gN() {
        this.f49381Q0 = true;
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TAG", 1);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(RegisterLayoutBottomSheet.class, bundle, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public final void m50092hN() {
        boolean z11;
        try {
            Button button = m50115PM().f138549r;
            if (m50083XM() && m50115PM().f138550s.getEditText().length() > 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            button.setEnabled(z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* renamed from: iN */
    public final void m50094iN(String str, boolean z11) {
        int m127173b0;
        String m127114D;
        int m127173b02;
        String m127114D2;
        if (!z11) {
            try {
                if (AbstractC19074t.m100204b(str, this.f49391a1)) {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f49391a1 = str;
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
        Iterator it = this.f49385U0.iterator();
        while (true) {
            ?? r82 = 0;
            if (!it.hasNext()) {
                break;
            }
            C9317d c9317d = (C9317d) it.next();
            if (c9317d.m50128b(upperCase)) {
                C17670w0.f89662a.m93657i(c9317d.m50130d());
                int size = c9317d.m50129c().size();
                int i11 = 0;
                while (i11 < size) {
                    final C9314a c9314a = (C9314a) c9317d.m50129c().get(i11);
                    final C19059j0 c19059j0 = new C19059j0();
                    if (i11 >= this.f49386V0.size()) {
                        C29910la m148209c = C29910la.m148209c(LayoutInflater.from(getContext()), m50115PM().f138551t, true);
                        AbstractC19074t.m100207e(m148209c, "inflate(...)");
                        c19059j0.f94941p = m148209c;
                        this.f49386V0.add(m148209c);
                    } else {
                        Object obj = this.f49386V0.get(i11);
                        AbstractC19074t.m100207e(obj, "get(...)");
                        c19059j0.f94941p = obj;
                        ((C29910la) obj).getRoot().setVisibility(r82);
                    }
                    ((C29910la) c19059j0.f94941p).getRoot().setTag(c9314a);
                    ((C29910la) c19059j0.f94941p).f138594q.setChecked(r82);
                    ((C29910la) c19059j0.f94941p).f138594q.setOnClickListener(new View.OnClickListener() { // from class: ez.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            EnterUserNumberPhoneView.m50098kN(EnterUserNumberPhoneView.C9314a.this, this, view);
                        }
                    });
                    ((C29910la) c19059j0.f94941p).f138595r.setOnClickListener(new View.OnClickListener() { // from class: ez.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            EnterUserNumberPhoneView.m50100lN(EnterUserNumberPhoneView.this, c19059j0, c9314a, view);
                        }
                    });
                    String m50121a = c9314a.m50121a();
                    m127173b0 = AbstractC24342w.m127173b0(m50121a, "{", 0, false, 6, null);
                    if (m127173b0 >= 0) {
                        m127114D = AbstractC24341v.m127114D(m50121a, "{", "", false, 4, null);
                        m127173b02 = AbstractC24342w.m127173b0(m127114D, "}", 0, false, 6, null);
                        m127114D2 = AbstractC24341v.m127114D(m127114D, "}", "", false, 4, null);
                        SpannableString spannableString = new SpannableString(m127114D2);
                        spannableString.setSpan(new C9315b(this, m92676n2(), c9314a.m50124d(), m127173b0, m127173b02), m127173b0, m127173b02, 33);
                        spannableString.setSpan(new StyleSpan(1), m127173b0, m127173b02, 33);
                        ((C29910la) c19059j0.f94941p).f138595r.setMovementMethod(CustomMovementMethod.m56305e());
                        ((C29910la) c19059j0.f94941p).f138595r.setText(spannableString);
                    } else {
                        ((C29910la) c19059j0.f94941p).f138595r.setText(m50121a);
                    }
                    i11++;
                    r82 = 0;
                }
                int size2 = this.f49386V0.size();
                for (int size3 = c9317d.m50129c().size(); size3 < size2; size3++) {
                    ((C29910la) this.f49386V0.get(size3)).getRoot().setVisibility(8);
                }
            }
        }
        if (this.f49390Z0) {
            m50092hN();
            this.f49390Z0 = false;
        }
    }

    /* renamed from: jN */
    static /* synthetic */ void m50096jN(EnterUserNumberPhoneView enterUserNumberPhoneView, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        enterUserNumberPhoneView.m50094iN(str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public static final void m50098kN(C9314a c9314a, EnterUserNumberPhoneView enterUserNumberPhoneView, View view) {
        AbstractC19074t.m100208f(c9314a, "$action");
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        c9314a.m50125e();
        enterUserNumberPhoneView.m50092hN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public static final void m50100lN(EnterUserNumberPhoneView enterUserNumberPhoneView, C19059j0 c19059j0, C9314a c9314a, View view) {
        AbstractC19074t.m100208f(enterUserNumberPhoneView, "this$0");
        AbstractC19074t.m100208f(c19059j0, "$regionActionBinding");
        AbstractC19074t.m100208f(c9314a, "$action");
        if (enterUserNumberPhoneView.f49389Y0) {
            enterUserNumberPhoneView.f49389Y0 = false;
            return;
        }
        ((C29910la) c19059j0.f94941p).f138594q.setChecked(!((C29910la) r1).f138594q.isChecked());
        c9314a.m50125e();
        enterUserNumberPhoneView.m50092hN();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
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
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                return m50073LM();
            }
            C17667v0 c17667v0 = C17667v0.f89659a;
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            return c17667v0.m93646b(this, (String) obj);
        }
        return m50069HM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29903l3 m148191c = C29903l3.m148191c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148191c, "inflate(...)");
        m50117cN(m148191c);
        m50079TM();
        FrameLayout root = m50115PM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        AbstractC23304d.f113402k0 = "";
    }

    /* renamed from: PM */
    public final C29903l3 m50115PM() {
        C29903l3 c29903l3 = this.f49380P0;
        if (c29903l3 != null) {
            return c29903l3;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: QM */
    public final void m50116QM() {
        m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C9318e());
        c0766k.mo1728r8();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.Companion.m124119a().m124117e(this, 37);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            AbstractC19444a.m101694b(new Runnable() { // from class: ez.c
                @Override // java.lang.Runnable
                public final void run() {
                    EnterUserNumberPhoneView.m50087bN(EnterUserNumberPhoneView.this);
                }
            }, 50L);
        }
    }

    /* renamed from: cN */
    public final void m50117cN(C29903l3 c29903l3) {
        AbstractC19074t.m100208f(c29903l3, "<set-?>");
        this.f49380P0 = c29903l3;
    }

    /* renamed from: dN */
    public final void m50118dN(boolean z11) {
        this.f49389Y0 = z11;
    }

    /* renamed from: fN */
    public final void m50119fN(boolean z11) {
        this.f49393c1 = z11;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "EnterUserNumberPhoneView";
    }

    /* renamed from: mN */
    public final void m50120mN(String str, String str2, String str3, int i11) {
        AbstractC19074t.m100208f(str, "phoneNumber");
        AbstractC19074t.m100208f(str2, "captchaValue");
        AbstractC19074t.m100208f(str3, "captchaToken");
        if (this.f49393c1) {
            return;
        }
        this.f49393c1 = true;
        m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C9322i(str));
        c0766k.mo1498O4(AbstractC23153n4.m119145q(str), AbstractC23153n4.m119147r(), str2, str3, i11, this.f49388X0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str;
        try {
            if (i11 != 1) {
                if (i11 != 1001) {
                    switch (i11) {
                        case 65432:
                            if (i12 == -1 && intent != null) {
                                String stringExtra = intent.getStringExtra("data");
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    AbstractC23153n4.m119087B(m92676n2(), 1, String.valueOf(m50115PM().f138550s.getEditText().getText()), new JSONObject(String.valueOf(stringExtra)).optJSONObject("data"));
                                    return;
                                }
                                return;
                            }
                            return;
                        case 65433:
                            if (i12 == -1 && intent != null) {
                                String stringExtra2 = intent.getStringExtra("data");
                                if (!TextUtils.isEmpty(stringExtra2)) {
                                    JSONObject jSONObject = new JSONObject(String.valueOf(stringExtra2));
                                    if (jSONObject.has("error_code")) {
                                        int i13 = jSONObject.getInt("error_code");
                                        if (i13 == 0) {
                                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                            if (optJSONObject != null) {
                                                String optString = optJSONObject.optString("captchaToken", "");
                                                if (!TextUtils.isEmpty(optString)) {
                                                    String valueOf = String.valueOf(m50115PM().f138550s.getEditText().getText());
                                                    AbstractC19074t.m100205c(optString);
                                                    m50120mN(valueOf, "", optString, 0);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        C20096c c20096c = new C20096c(i13, jSONObject.optString("error_message", ""));
                                        c20096c.m104494f(stringExtra2);
                                        AbstractC23216t1.m119643h(this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: ez.j
                                            @Override // me0.AbstractC23216t1.d
                                            /* renamed from: a */
                                            public final void mo68088a(String str2) {
                                                EnterUserNumberPhoneView.m50085ZM(EnterUserNumberPhoneView.this, str2);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            super.onActivityResult(i11, i12, intent);
                            return;
                    }
                }
                if (i12 == -1 && intent != null) {
                    try {
                        String stringExtra3 = intent.getStringExtra("EXTRA_SELECTED_COUNTRY");
                        if (stringExtra3 != null) {
                            C28655u c28655u = new C28655u(new JSONObject(stringExtra3));
                            String str2 = c28655u.f132865c;
                            C28655u c28655u2 = this.f49382R0;
                            if (c28655u2 != null) {
                                str = c28655u2.f132865c;
                            } else {
                                str = null;
                            }
                            if (!AbstractC19074t.m100204b(str2, str)) {
                                mo70710wy(new Runnable() { // from class: ez.i
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        EnterUserNumberPhoneView.m50084YM(EnterUserNumberPhoneView.this);
                                    }
                                });
                            }
                            this.f49382R0 = c28655u;
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                }
                return;
            }
            if (i12 == -1 && intent != null && intent.getBooleanExtra("refreshConsents", false)) {
                m50115PM().f138551t.removeAllViews();
                this.f49386V0.clear();
                this.f49383S0.clear();
                this.f49384T0.clear();
                this.f49385U0.clear();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        int i12;
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 121) {
            if (m50068GM()) {
                i12 = 510020;
            } else {
                i12 = 510021;
            }
            AbstractC20887g.m109217D(i12, null, 2, null);
            AbstractC19444a.m101694b(new Runnable() { // from class: ez.a
                @Override // java.lang.Runnable
                public final void run() {
                    EnterUserNumberPhoneView.m50086aN(EnterUserNumberPhoneView.this);
                }
            }, 200L);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        String str;
        super.onResume();
        if (this.f49386V0.isEmpty()) {
            m50116QM();
        }
        if (this.f49392b1) {
            m50120mN(String.valueOf(m50115PM().f138550s.getEditText().getText()), "", "", 0);
            this.f49392b1 = false;
            return;
        }
        m50115PM().f138550s.setFieldState(EnumC17007i.NORMAL);
        if (this.f49381Q0) {
            this.f49381Q0 = false;
            if (!m50068GM()) {
                C28655u c28655u = this.f49382R0;
                if (c28655u != null) {
                    str = c28655u.f132865c;
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(str, "84")) {
                    AbstractC23034c6.m118184v0(this.f72421L0, this.f49387W0, 121);
                }
            }
            m50120mN(String.valueOf(m50115PM().f138550s.getEditText().getText()), "", "", 0);
        }
        try {
            C23744a.Companion.m124119a().m124115b(this, 37);
            this.f49382R0 = (C28655u) C28647m.m143325c().m143328b().get(AbstractC23309i.m121704a5());
            m50088eN();
            C28655u c28655u2 = this.f49382R0;
            if (c28655u2 != null) {
                String str2 = c28655u2.f132864b;
                AbstractC19074t.m100207e(str2, "isocountrycodes");
                m50094iN(str2, this.f49390Z0);
            }
            C28023b6.m141250h0().m141277D();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 37) {
            try {
                if (AbstractC23309i.m122166mc() != 2 && AbstractC23309i.m122166mc() != 4) {
                    return;
                }
                Object obj = C28647m.m143325c().m143328b().get(AbstractC23309i.m121704a5());
                AbstractC19074t.m100205c(obj);
                final String str = ((C28655u) obj).f132864b;
                mo70710wy(new Runnable() { // from class: ez.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        EnterUserNumberPhoneView.m50076OM(EnterUserNumberPhoneView.this, str);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
