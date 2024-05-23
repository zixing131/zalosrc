package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.AbstractC2373t;
import au.AbstractC2379w;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.zviews.RegisterView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23216t1;
import me0.C23212s8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p133ek.AbstractC18458a;
import p135em.C18489c;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p588vw.C28647m;
import p588vw.C28655u;
import p649xl.C29910la;
import su.AbstractC26389c;
import vg.C28023b6;
import y20.C30274b;
import y20.InterfaceC30273a;

/* loaded from: classes6.dex */
public class RegisterView extends SlidableZaloView implements C23744a.c, InterfaceC0733x {

    /* renamed from: Q0 */
    CustomEditText f76850Q0;

    /* renamed from: R0 */
    TextView f76851R0;

    /* renamed from: S0 */
    TextView f76852S0;

    /* renamed from: T0 */
    TextView f76853T0;

    /* renamed from: U0 */
    RecyclingImageView f76854U0;

    /* renamed from: V0 */
    LinearLayout f76855V0;

    /* renamed from: X0 */
    String f76857X0;

    /* renamed from: Z0 */
    String f76859Z0;

    /* renamed from: a1 */
    String f76860a1;

    /* renamed from: b1 */
    String f76861b1;

    /* renamed from: c1 */
    String f76862c1;

    /* renamed from: P0 */
    private final String f76849P0 = RegisterView.class.getSimpleName();

    /* renamed from: W0 */
    List f76856W0 = new ArrayList();

    /* renamed from: Y0 */
    boolean f76858Y0 = true;

    /* renamed from: d1 */
    String f76863d1 = "";

    /* renamed from: e1 */
    Map f76864e1 = new HashMap();

    /* renamed from: f1 */
    List f76865f1 = new ArrayList();

    /* renamed from: g1 */
    boolean f76866g1 = false;

    /* renamed from: h1 */
    String f76867h1 = "";

    /* renamed from: i1 */
    boolean f76868i1 = false;

    /* renamed from: j1 */
    final Object f76869j1 = new Object();

    /* renamed from: k1 */
    boolean f76870k1 = false;

    /* renamed from: l1 */
    final Object f76871l1 = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RegisterView$a */
    /* loaded from: classes6.dex */
    public class C14921a extends AbstractC18391a {
        C14921a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            RegisterView.this.m83533IM();
            AbstractC23304d.f113402k0 = editable.toString();
            AbstractC23304d.f113406l0 = "";
            TextView textView = RegisterView.this.f76853T0;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RegisterView$b */
    /* loaded from: classes6.dex */
    public class C14922b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f76873a;

        C14922b(String str) {
            this.f76873a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m83544g(JSONObject jSONObject, String str) {
            try {
                CustomEditText customEditText = RegisterView.this.f76850Q0;
                if (customEditText != null) {
                    AbstractC2379w.m12430d(customEditText);
                }
                Bundle bundle = new Bundle();
                bundle.putString("extra_data", jSONObject.toString());
                bundle.putString("extra_phone_number", str);
                RegisterView.this.f72421L0.m92662fJ().m93069k2(AccountExistView.class, bundle, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m83545h() {
            RegisterView.this.f72421L0.showDialog(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m83546i(String str) {
            if (RegisterView.this.f76853T0 != null) {
                if (!TextUtils.isEmpty(str)) {
                    RegisterView.this.f76853T0.setText(str);
                    RegisterView.this.f76853T0.setVisibility(0);
                } else {
                    RegisterView.this.f76853T0.setVisibility(8);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m83547j(C20096c c20096c) {
            try {
                TextView textView = RegisterView.this.f76853T0;
                if (textView != null) {
                    textView.setText(c20096c.m104492d());
                    RegisterView.this.f76853T0.setVisibility(0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            synchronized (RegisterView.this.f76869j1) {
                RegisterView registerView = RegisterView.this;
                registerView.f76868i1 = false;
                registerView.f72421L0.mo49315c4();
            }
            if (AbstractC23216t1.m119643h(RegisterView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.ib0
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    RegisterView.C14922b.this.m83546i(str);
                }
            })) {
                return;
            }
            try {
                if (RegisterView.this.f72421L0.m92672lJ() && c20096c.m104491c() != 50001) {
                    C18489c.m97852r(true);
                }
                if (c20096c.m104491c() == 2050) {
                    AbstractC23153n4.m119151t(RegisterView.this.m92676n2(), new JSONObject(c20096c.m104490b()).optJSONObject("data"), 1011, this.f76873a, 2, 0, 0);
                } else {
                    if (c20096c.m104491c() == 2060) {
                        AbstractC23153n4.m119155v(RegisterView.this.m92676n2(), new JSONObject(c20096c.m104490b()).optJSONObject("data"), 1004);
                        return;
                    }
                    if (c20096c.m104491c() == 2065) {
                        AbstractC2373t.m12412j();
                    }
                    if (RegisterView.this.f72421L0.m92676n2() != null) {
                        RegisterView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.jb0
                            @Override // java.lang.Runnable
                            public final void run() {
                                RegisterView.C14922b.this.m83547j(c20096c);
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
                CustomEditText customEditText = RegisterView.this.f76850Q0;
                if (customEditText != null) {
                    AbstractC23304d.f113406l0 = customEditText.getText().toString();
                }
                final JSONObject jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("identifier");
                RegisterView.this.f76862c1 = jSONObject.optString("sessionToken");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(RegisterView.this.f76862c1)) {
                    JSONObject jSONObject2 = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString));
                    RegisterView.this.f76859Z0 = jSONObject2.optString("avatar_url");
                    RegisterView.this.f76860a1 = jSONObject2.optString("dname");
                    RegisterView.this.f76861b1 = jSONObject2.optString("uname");
                    if (RegisterView.this.f72421L0.m92676n2() != null) {
                        InterfaceC27218a m92676n2 = RegisterView.this.f72421L0.m92676n2();
                        final String str = this.f76873a;
                        m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.kb0
                            @Override // java.lang.Runnable
                            public final void run() {
                                RegisterView.C14922b.this.m83544g(jSONObject, str);
                            }
                        });
                    }
                } else if (RegisterView.this.f72421L0.m92676n2() != null) {
                    RegisterView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.lb0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RegisterView.C14922b.this.m83545h();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            synchronized (RegisterView.this.f76869j1) {
                RegisterView registerView = RegisterView.this;
                registerView.f76868i1 = false;
                registerView.f72421L0.mo49315c4();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RegisterView$c */
    /* loaded from: classes6.dex */
    public class C14923c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f76875a;

        C14923c(String str) {
            this.f76875a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m83552g() {
            CustomEditText customEditText = RegisterView.this.f76850Q0;
            if (customEditText != null) {
                AbstractC2379w.m12430d(customEditText);
            }
            RegisterView.this.m83537sM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m83553h(String str) {
            if (RegisterView.this.f76853T0 != null) {
                if (!TextUtils.isEmpty(str)) {
                    RegisterView.this.f76853T0.setText(str);
                    RegisterView.this.f76853T0.setVisibility(0);
                } else {
                    RegisterView.this.f76853T0.setVisibility(8);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m83554i() {
            CustomEditText customEditText = RegisterView.this.f76850Q0;
            if (customEditText != null) {
                AbstractC2379w.m12430d(customEditText);
            }
            RegisterView.this.m83537sM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m83555j(C20096c c20096c) {
            TextView textView = RegisterView.this.f76853T0;
            if (textView != null) {
                textView.setText(c20096c.m104492d());
                RegisterView.this.f76853T0.setVisibility(0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            synchronized (RegisterView.this.f76871l1) {
                RegisterView registerView = RegisterView.this;
                registerView.f76870k1 = false;
                registerView.f72421L0.mo49315c4();
            }
            if (AbstractC23216t1.m119643h(RegisterView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.mb0
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    RegisterView.C14923c.this.m83553h(str);
                }
            })) {
                return;
            }
            try {
                if (c20096c.m104491c() != 2012 && c20096c.m104491c() != 2021) {
                    RegisterView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ob0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RegisterView.C14923c.this.m83555j(c20096c);
                        }
                    });
                }
                JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                RegisterView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.nb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RegisterView.C14923c.this.m83554i();
                    }
                });
                AbstractC23153n4.m119159x(RegisterView.this.m92676n2(), optJSONObject, false, 2, false, RegisterView.this.f76862c1, this.f76875a, null, 0, 0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    RegisterView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.pb0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RegisterView.C14923c.this.m83552g();
                        }
                    });
                    AbstractC23153n4.m119159x(RegisterView.this.m92676n2(), optJSONObject, true, 2, false, RegisterView.this.f76862c1, this.f76875a, null, 0, 0);
                    synchronized (RegisterView.this.f76871l1) {
                        RegisterView registerView = RegisterView.this;
                        registerView.f76870k1 = false;
                        registerView.f72421L0.mo49315c4();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (RegisterView.this.f76871l1) {
                        RegisterView registerView2 = RegisterView.this;
                        registerView2.f76870k1 = false;
                        registerView2.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (RegisterView.this.f76871l1) {
                    RegisterView registerView3 = RegisterView.this;
                    registerView3.f76870k1 = false;
                    registerView3.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RegisterView$d */
    /* loaded from: classes6.dex */
    public class C14924d implements InterfaceC30273a {
        C14924d() {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RegisterView$e */
    /* loaded from: classes6.dex */
    public class C14925e {

        /* renamed from: a */
        public int f76878a;

        /* renamed from: b */
        private String f76879b;

        /* renamed from: c */
        private String f76880c;

        /* renamed from: d */
        private String f76881d;

        /* renamed from: e */
        private String f76882e;

        /* renamed from: f */
        private long f76883f = 0;

        public C14925e(JSONObject jSONObject) {
            this.f76878a = 0;
            this.f76879b = "";
            this.f76880c = "";
            this.f76881d = "";
            this.f76882e = "";
            this.f76878a = jSONObject.optInt("id", 0);
            this.f76879b = jSONObject.optString("vi", "");
            this.f76880c = jSONObject.optString("en", "");
            this.f76881d = jSONObject.optString("url_vi", "");
            this.f76882e = jSONObject.optString("url_en", "");
        }

        /* renamed from: a */
        String m83556a() {
            if (AbstractC18458a.f93019a.equals("vi")) {
                return this.f76879b;
            }
            return this.f76880c;
        }

        /* renamed from: b */
        public JSONObject m83557b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("term_id", this.f76878a);
                jSONObject.put("timestamp", this.f76883f);
                jSONObject.put("action", "agree");
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        /* renamed from: c */
        String m83558c() {
            if (AbstractC18458a.f93019a.equals("vi")) {
                return this.f76881d;
            }
            return this.f76882e;
        }

        /* renamed from: d */
        public void m83559d() {
            this.f76883f = System.currentTimeMillis() - AbstractC23304d.f113305N;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RegisterView$f */
    /* loaded from: classes6.dex */
    public class C14926f extends C10866e {

        /* renamed from: g0 */
        String f76885g0;

        public C14926f(InterfaceC27218a interfaceC27218a, String str, int i11, int i12) {
            this.f76885g0 = str;
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            CustomEditText customEditText = RegisterView.this.f76850Q0;
            if (customEditText != null) {
                AbstractC2379w.m12430d(customEditText);
            }
            if (RegisterView.this.m92662fJ() != null) {
                if (TextUtils.isEmpty(this.f76885g0)) {
                    RegisterView.this.m92662fJ().m93069k2(PolicyZView.class, null, 1, true);
                    return;
                }
                RegisterView.this.f76866g1 = true;
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_URL", this.f76885g0);
                RegisterView.this.m92662fJ().m93069k2(WebInAppView.class, bundle, 1, true);
            }
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
            if (this.f54861x) {
                textPaint.bgColor = C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.ItemBackgroundSelectedColor);
            } else {
                textPaint.bgColor = AbstractC23136l9.m118641B(this.f54823A.getContext(), AbstractC16801x.transparent);
            }
            textPaint.setColor(C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RegisterView$g */
    /* loaded from: classes6.dex */
    public class C14927g {

        /* renamed from: a */
        private boolean f76887a;

        /* renamed from: b */
        String f76888b;

        /* renamed from: c */
        Set f76889c = new HashSet();

        /* renamed from: d */
        List f76890d = new ArrayList();

        public C14927g(String str, JSONArray jSONArray) {
            this.f76887a = false;
            this.f76888b = "";
            this.f76888b = str;
            if (str.equals("default")) {
                this.f76887a = true;
            }
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    this.f76889c.add(jSONArray.optString(i11, ""));
                }
            }
        }

        /* renamed from: a */
        public void m83560a(C14925e c14925e) {
            this.f76890d.add(c14925e);
        }

        /* renamed from: b */
        public boolean m83561b(String str) {
            if (this.f76887a) {
                return true;
            }
            return this.f76889c.contains(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m83509AM(View view) {
        AbstractC2379w.m12430d(this.f76850Q0);
        if (!m83539uM()) {
            return;
        }
        AbstractC23647d.m123897g("19204");
        AbstractC23647d.m123897g("38507");
        String trim = this.f76850Q0.getText().toString().trim();
        this.f76857X0 = trim;
        if (TextUtils.isEmpty(trim)) {
            TextView textView = this.f76853T0;
            if (textView != null) {
                textView.setText(m92652XI(AbstractC8020f0.input_phone00));
                this.f76853T0.setVisibility(0);
                return;
            }
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (C29910la c29910la : this.f76856W0) {
                if (c29910la.getRoot().getVisibility() == 0 && c29910la.getRoot().getTag() != null) {
                    jSONArray.put(((C14925e) c29910la.getRoot().getTag()).m83557b());
                }
            }
            AbstractC23304d.f113309O = jSONArray.toString();
        } catch (Exception unused) {
        }
        m83535KM(this.f76857X0, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m83510BM(String str) {
        if (this.f76853T0 != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f76853T0.setText(str);
                this.f76853T0.setVisibility(0);
            } else {
                this.f76853T0.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static /* synthetic */ void m83511CM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23647d.m123897g("38509");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m83512DM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m83536rM();
        AbstractC23647d.m123897g("38510");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m83513EM() {
        AbstractC2379w.m12432f(this.f76850Q0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m83514FM(C14925e c14925e, View view) {
        c14925e.m83559d();
        m83533IM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ void m83515GM(C29910la c29910la, C14925e c14925e, View view) {
        if (this.f76866g1) {
            this.f76866g1 = false;
            return;
        }
        c29910la.f138594q.setChecked(!r1.isChecked());
        c14925e.m83559d();
        m83533IM();
    }

    /* renamed from: vM */
    private boolean m83527vM() {
        for (C29910la c29910la : this.f76856W0) {
            if (c29910la.getRoot().getVisibility() == 0 && !c29910la.f138594q.isChecked()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m83528wM(String str) {
        this.f76851R0.setText(str);
        m83534JM(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ boolean m83529xM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 6 && m83539uM()) {
            RecyclingImageView recyclingImageView = this.f76854U0;
            if (recyclingImageView != null) {
                recyclingImageView.performClick();
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static /* synthetic */ boolean m83530yM(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            AbstractC23647d.m123897g("38506");
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m83531zM(View view) {
        CustomEditText customEditText = this.f76850Q0;
        if (customEditText != null) {
            AbstractC2379w.m12430d(customEditText);
        }
        AbstractC23647d.m123897g("38508");
        this.f72421L0.m92662fJ().m93069k2(CountryListView.class, null, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                String string = m92642L3.getString("terms", "");
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    JSONArray optJSONArray = jSONObject.optJSONArray("actions");
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            C14925e c14925e = new C14925e(optJSONArray.getJSONObject(i11));
                            this.f76864e1.put(Integer.valueOf(c14925e.f76878a), c14925e);
                        }
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("regions");
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            this.f76865f1.add(new C14927g(next, optJSONObject.getJSONArray(next)));
                        }
                    }
                    this.f76865f1.add(new C14927g("default", null));
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("region_action");
                    if (optJSONObject2 != null) {
                        Iterator<String> keys2 = optJSONObject2.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            int i12 = 0;
                            while (true) {
                                if (i12 < this.f76865f1.size()) {
                                    JSONArray jSONArray = optJSONObject2.getJSONArray(next2);
                                    C14927g c14927g = (C14927g) this.f76865f1.get(i12);
                                    if (next2.equals(c14927g.f76888b)) {
                                        for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                                            C14925e c14925e2 = (C14925e) this.f76864e1.get(Integer.valueOf(jSONArray.getInt(i13)));
                                            if (c14925e2 != null) {
                                                c14927g.m83560a(c14925e2);
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
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 2) {
            return null;
        }
        String m118282h = AbstractC23056e6.m118282h(this.f76850Q0.getText().toString(), AbstractC23309i.m121704a5(), true);
        if (TextUtils.isEmpty(m118282h) || m118282h.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
            if (!TextUtils.isEmpty(AbstractC23304d.f113442u0)) {
                m118282h = AbstractC23304d.f113442u0;
            } else {
                CustomEditText customEditText = this.f76850Q0;
                if (customEditText != null && customEditText.getText() != null) {
                    m118282h = this.f76850Q0.getText().toString();
                } else {
                    m118282h = "";
                }
            }
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleDlg_confirmPhone, m118282h)).m43173v(2).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_call)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.db0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                RegisterView.m83511CM(interfaceC17463d, i12);
            }
        }).m43170s(m92652XI(AbstractC8020f0.confirm), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.eb0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                RegisterView.this.m83512DM(interfaceC17463d, i12);
            }
        });
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.register_view, viewGroup, false);
        m83538tM(inflate);
        AbstractC23647d.m123897g("38504");
        return inflate;
    }

    /* renamed from: HM */
    public void m83532HM() {
        CustomEditText customEditText = this.f76850Q0;
        if (customEditText != null) {
            AbstractC2379w.m12430d(customEditText);
        }
        AbstractC23647d.m123897g("38505");
        this.f72421L0.finish();
    }

    /* renamed from: IM */
    public void m83533IM() {
        boolean z11;
        try {
            RecyclingImageView recyclingImageView = this.f76854U0;
            if (recyclingImageView != null) {
                if (m83527vM() && this.f76850Q0.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                recyclingImageView.setEnabled(z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* renamed from: JM */
    void m83534JM(String str) {
        C29910la c29910la;
        String str2;
        String str3 = "}";
        try {
            if (str.equals(this.f76867h1)) {
                return;
            }
            this.f76867h1 = str;
            String upperCase = str.toUpperCase();
            Iterator it = this.f76865f1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C14927g c14927g = (C14927g) it.next();
                if (c14927g.m83561b(upperCase)) {
                    ?? r02 = 0;
                    int i11 = 0;
                    while (i11 < c14927g.f76890d.size()) {
                        final C14925e c14925e = (C14925e) c14927g.f76890d.get(i11);
                        if (i11 >= this.f76856W0.size()) {
                            c29910la = C29910la.m148209c(LayoutInflater.from(getContext()), this.f76855V0, true);
                            this.f76856W0.add(c29910la);
                        } else {
                            c29910la = (C29910la) this.f76856W0.get(i11);
                            c29910la.getRoot().setVisibility(r02);
                        }
                        final C29910la c29910la2 = c29910la;
                        c29910la2.getRoot().setTag(c14925e);
                        c29910la2.f138594q.setChecked(r02);
                        c29910la2.f138594q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.fb0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                RegisterView.this.m83514FM(c14925e, view);
                            }
                        });
                        c29910la2.f138595r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.gb0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                RegisterView.this.m83515GM(c29910la2, c14925e, view);
                            }
                        });
                        String m83556a = c14925e.m83556a();
                        int indexOf = m83556a.indexOf("{");
                        if (indexOf >= 0) {
                            String replace = m83556a.replace("{", "");
                            int indexOf2 = replace.indexOf(str3);
                            SpannableString spannableString = new SpannableString(replace.replace(str3, ""));
                            str2 = str3;
                            spannableString.setSpan(new C14926f(this.f72421L0.m92676n2(), c14925e.m83558c(), indexOf, indexOf2), indexOf, indexOf2, 33);
                            c29910la2.f138595r.setMovementMethod(CustomMovementMethod.m56305e());
                            c29910la2.f138595r.setText(spannableString);
                        } else {
                            str2 = str3;
                            c29910la2.f138595r.setText(m83556a);
                        }
                        i11++;
                        str3 = str2;
                        r02 = 0;
                    }
                    for (int size = c14927g.f76890d.size(); size < this.f76856W0.size(); size++) {
                        ((C29910la) this.f76856W0.get(size)).getRoot().setVisibility(8);
                    }
                }
            }
            m83533IM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KM */
    public void m83535KM(String str, String str2) {
        AbstractC23304d.f113398j0 = str;
        synchronized (this.f76869j1) {
            try {
                if (this.f76868i1) {
                    this.f72421L0.mo46829Y();
                    return;
                }
                this.f76868i1 = true;
                this.f72421L0.mo46829Y();
                String str3 = "";
                if (AbstractC23309i.m121859e9() == 1) {
                    str3 = AbstractC23309i.m121704a5();
                }
                String str4 = AbstractC18458a.f93019a;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14922b(str));
                c0766k.m1809F0(str, str3, str4, str2, this.f76863d1, 2, 0, 0);
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
        m83532HM();
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
        try {
            bundle.putString("onSave", this.f76857X0);
            bundle.putString("zalo_phoneNumber", AbstractC23304d.f113438t0);
            bundle.putString("phoneNumberE164Server", AbstractC23304d.f113442u0);
            bundle.putString("sms_gateWay", AbstractC23304d.f113446v0);
            bundle.putString("sms_format", AbstractC23304d.f113458y0);
            bundle.putString("sms_content_hint", AbstractC23304d.f113454x0);
            bundle.putString("myDisplayName", AbstractC23304d.f113462z0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_create_account));
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
        CustomEditText customEditText;
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            try {
                if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.m118183v()) == 0 && (customEditText = this.f76850Q0) != null) {
                    AbstractC2379w.m12432f(customEditText);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "RegisterView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        CustomEditText customEditText;
        try {
            if (i11 == 1011) {
                if (i12 == -1 && intent != null) {
                    AbstractC23304d.f113406l0 = this.f76850Q0.getText().toString();
                    String stringExtra = intent.getStringExtra("data");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        JSONObject jSONObject = new JSONObject(stringExtra);
                        String optString = jSONObject.optString("identifier");
                        this.f76862c1 = jSONObject.optString("sessionToken");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(this.f76862c1)) {
                            JSONObject jSONObject2 = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString));
                            this.f76859Z0 = jSONObject2.optString("avatar_url");
                            this.f76860a1 = jSONObject2.optString("dname");
                            this.f76861b1 = jSONObject2.optString("uname");
                            AbstractC2379w.m12430d(this.f76850Q0);
                            Bundle bundle = new Bundle();
                            bundle.putString("extra_data", jSONObject.toString());
                            bundle.putString("extra_phone_number", this.f76850Q0.getText().toString().trim());
                            this.f72421L0.m92662fJ().m93069k2(AccountExistView.class, bundle, 1, true);
                            return;
                        }
                        this.f72421L0.showDialog(2);
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
                                    if (!TextUtils.isEmpty(optString2) && (customEditText = this.f76850Q0) != null) {
                                        this.f76863d1 = optString2;
                                        m83535KM(customEditText.getText().toString().trim(), "");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            C20096c c20096c = new C20096c(i13, jSONObject3.optString("error_message", ""));
                            c20096c.m104494f(stringExtra2);
                            AbstractC23216t1.m119643h(this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.ya0
                                @Override // me0.AbstractC23216t1.d
                                /* renamed from: a */
                                public final void mo68088a(String str) {
                                    RegisterView.this.m83510BM(str);
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

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m83532HM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        try {
            CustomEditText customEditText = this.f76850Q0;
            if (customEditText != null) {
                customEditText.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.hb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RegisterView.this.m83513EM();
                    }
                }, 100L);
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
            String str = ((C28655u) C28647m.m143325c().m143328b().get(AbstractC23309i.m121704a5())).f132864b;
            this.f76851R0.setText(str);
            m83534JM(str);
            C28023b6.m141250h0().m141277D();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    void m83536rM() {
        String str;
        String str2;
        if (!TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
            synchronized (this.f76871l1) {
                try {
                    if (this.f76870k1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    this.f76870k1 = true;
                    this.f72421L0.mo46829Y();
                    CustomEditText customEditText = this.f76850Q0;
                    if (customEditText != null) {
                        str = customEditText.getText().toString();
                    } else {
                        str = "";
                    }
                    if (AbstractC23309i.m121859e9() == 1) {
                        str2 = AbstractC23309i.m121704a5();
                    } else {
                        str2 = "";
                    }
                    String str3 = str2;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14923c(str));
                    AbstractC23304d.f113289J.clear();
                    AbstractC23304d.f113399j1 = System.currentTimeMillis();
                    c0766k.mo1539T5(AbstractC23304d.f113398j0, str3, this.f76862c1, 0, 0, 2, 0, 0, AbstractC23034c6.m118110A());
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        TextView textView = this.f76853T0;
        if (textView != null) {
            textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
            this.f76853T0.setVisibility(0);
        }
    }

    /* renamed from: sM */
    public void m83537sM() {
        try {
            Account[] accountsByType = AccountManager.get(m92648SI()).getAccountsByType("com.google");
            if (accountsByType.length > 0) {
                C30274b c30274b = new C30274b(accountsByType[0].name, "oauth2:https://www.googleapis.com/auth/userinfo.profile");
                c30274b.m149410y(new C14924d());
                c30274b.m2434i(AbstractC0837p0.m2225f(), new Void[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    void m83538tM(View view) {
        boolean z11;
        CustomEditText customEditText = (CustomEditText) view.findViewById(AbstractC6918a0.etPhoneNumber);
        this.f76850Q0 = customEditText;
        customEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.za0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m83529xM;
                m83529xM = RegisterView.this.m83529xM(textView, i11, keyEvent);
                return m83529xM;
            }
        });
        this.f76850Q0.addTextChangedListener(new C14921a());
        if (!TextUtils.isEmpty(AbstractC23304d.f113402k0)) {
            this.f76850Q0.setText(AbstractC23304d.f113402k0);
        }
        this.f76850Q0.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.ab0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m83530yM;
                m83530yM = RegisterView.m83530yM(view2, motionEvent);
                return m83530yM;
            }
        });
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tvError);
        this.f76853T0 = textView;
        textView.setVisibility(8);
        TextView textView2 = (TextView) view.findViewById(AbstractC6918a0.tvCountryName);
        this.f76851R0 = textView2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.bb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RegisterView.this.m83531zM(view2);
            }
        });
        RecyclingImageView recyclingImageView = (RecyclingImageView) view.findViewById(AbstractC6918a0.btnSubmitPhoneNumber);
        this.f76854U0 = recyclingImageView;
        if (this.f76850Q0.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        recyclingImageView.setEnabled(z11);
        this.f76854U0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.cb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RegisterView.this.m83509AM(view2);
            }
        });
        try {
            String[] m118183v = AbstractC23034c6.m118183v();
            if (this.f76858Y0 && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), m118183v) != 0) {
                this.f76858Y0 = false;
                AbstractC23034c6.m118186w0((BaseZaloActivity) this.f72421L0.m92648SI(), m118183v, 106);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f76855V0 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutAction);
        this.f76852S0 = (TextView) view.findViewById(AbstractC6918a0.tv_str_policy);
        if (!AbstractC23136l9.m118654H0(this.f72421L0.m92648SI())) {
            AbstractC2379w.m12432f(this.f76850Q0);
        } else {
            this.f76850Q0.requestFocus();
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.policy);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.policy_2);
        int indexOf = m118743r0.indexOf(m118743r02);
        if (indexOf >= 0) {
            int length = m118743r02.length() + indexOf;
            SpannableString spannableString = new SpannableString(m118743r0);
            spannableString.setSpan(new C14926f(this.f72421L0.m92676n2(), null, indexOf, length), indexOf, length, 33);
            this.f76852S0.setMovementMethod(CustomMovementMethod.m56305e());
            this.f76852S0.setText(spannableString);
        }
        AbstractC23309i.m121210Mt(1);
    }

    /* renamed from: uM */
    public boolean m83539uM() {
        RecyclingImageView recyclingImageView = this.f76854U0;
        if (recyclingImageView != null) {
            return recyclingImageView.isEnabled();
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 37) {
            try {
                if (AbstractC23309i.m122166mc() != 2 && AbstractC23309i.m122166mc() != 4) {
                    return;
                }
                final String str = ((C28655u) C28647m.m143325c().m143328b().get(AbstractC23309i.m121704a5())).f132864b;
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.xa0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RegisterView.this.m83528wM(str);
                    }
                });
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
        String str6;
        super.mo37135xJ(bundle);
        if (bundle != null) {
            try {
                String str7 = "";
                if (!bundle.containsKey("onSave")) {
                    str = "";
                } else {
                    str = bundle.getString("onSave");
                }
                this.f76857X0 = str;
                CustomEditText customEditText = this.f76850Q0;
                if (customEditText != null) {
                    customEditText.setText(str);
                }
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
                if (!bundle.containsKey("sms_content_hint")) {
                    str6 = "";
                } else {
                    str6 = bundle.getString("sms_content_hint");
                }
                AbstractC23304d.f113454x0 = str6;
                if (bundle.containsKey("myDisplayName")) {
                    str7 = bundle.getString("myDisplayName");
                }
                AbstractC23304d.f113462z0 = str7;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
