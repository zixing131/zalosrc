package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7109j7;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.SecurityQuestionView;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23179p8;
import me0.AbstractC23216t1;
import me0.AbstractC23244v8;
import me0.C23055e5;
import me0.C23278z2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import mm0.AbstractC23353h;
import nh0.InterfaceC23792b;
import org.json.JSONObject;
import p135em.C18489c;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import sx.AbstractC26401c;
import sx.C26400b;
import sx.C26402d;

/* loaded from: classes6.dex */
public class SecurityQuestionView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    TextView f77353M0;

    /* renamed from: N0 */
    TextView f77354N0;

    /* renamed from: O0 */
    C7109j7 f77355O0;

    /* renamed from: P0 */
    C26400b f77356P0;

    /* renamed from: Q0 */
    Button f77357Q0;

    /* renamed from: R0 */
    LinearLayout f77358R0;

    /* renamed from: S0 */
    HorizontalScrollView f77359S0;

    /* renamed from: U0 */
    C23528a f77361U0;

    /* renamed from: V0 */
    View f77362V0;

    /* renamed from: a1 */
    int f77367a1;

    /* renamed from: h1 */
    private InterfaceC23792b f77374h1;

    /* renamed from: T0 */
    ArrayList f77360T0 = new ArrayList();

    /* renamed from: W0 */
    String f77363W0 = "";

    /* renamed from: X0 */
    String f77364X0 = "";

    /* renamed from: Y0 */
    String f77365Y0 = "";

    /* renamed from: Z0 */
    int f77366Z0 = 0;

    /* renamed from: b1 */
    String f77368b1 = "";

    /* renamed from: c1 */
    String f77369c1 = "";

    /* renamed from: d1 */
    String f77370d1 = "";

    /* renamed from: e1 */
    String f77371e1 = "";

    /* renamed from: f1 */
    String f77372f1 = "";

    /* renamed from: g1 */
    String f77373g1 = "";

    /* renamed from: i1 */
    String f77375i1 = "";

    /* renamed from: j1 */
    boolean f77376j1 = false;

    /* renamed from: k1 */
    boolean f77377k1 = false;

    /* renamed from: l1 */
    boolean f77378l1 = false;

    /* renamed from: m1 */
    final Object f77379m1 = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SecurityQuestionView$a */
    /* loaded from: classes6.dex */
    public class C15014a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f77380a;

        /* renamed from: b */
        final /* synthetic */ String f77381b;

        /* renamed from: c */
        final /* synthetic */ long f77382c;

        /* renamed from: d */
        final /* synthetic */ String f77383d;

        C15014a(String str, String str2, long j11, String str3) {
            this.f77380a = str;
            this.f77381b = str2;
            this.f77382c = j11;
            this.f77383d = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m84021d(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (AbstractC23216t1.m119643h(SecurityQuestionView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.tg0
                        @Override // me0.AbstractC23216t1.d
                        /* renamed from: a */
                        public final void mo68088a(String str) {
                            SecurityQuestionView.C15014a.m84021d(str);
                        }
                    })) {
                        synchronized (SecurityQuestionView.this.f77379m1) {
                            SecurityQuestionView securityQuestionView = SecurityQuestionView.this;
                            securityQuestionView.f77378l1 = false;
                            securityQuestionView.f72421L0.mo49315c4();
                        }
                        return;
                    }
                    SecurityQuestionView.this.m84013BM(c20096c, this.f77380a, this.f77381b);
                    synchronized (SecurityQuestionView.this.f77379m1) {
                        SecurityQuestionView securityQuestionView2 = SecurityQuestionView.this;
                        securityQuestionView2.f77378l1 = false;
                        securityQuestionView2.f72421L0.mo49315c4();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("SecurityQuestionView", e11);
                    synchronized (SecurityQuestionView.this.f77379m1) {
                        SecurityQuestionView securityQuestionView3 = SecurityQuestionView.this;
                        securityQuestionView3.f77378l1 = false;
                        securityQuestionView3.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (SecurityQuestionView.this.f77379m1) {
                    SecurityQuestionView securityQuestionView4 = SecurityQuestionView.this;
                    securityQuestionView4.f77378l1 = false;
                    securityQuestionView4.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            try {
                InterfaceC27218a m92676n2 = SecurityQuestionView.this.m92676n2();
                String str = this.f77380a;
                long j11 = this.f77382c;
                SecurityQuestionView securityQuestionView = SecurityQuestionView.this;
                if (securityQuestionView.f77366Z0 > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC23153n4.m119161y(m92676n2, obj, str, j11, z11, securityQuestionView.f77367a1, TextUtils.isEmpty(this.f77383d), false);
                synchronized (SecurityQuestionView.this.f77379m1) {
                    SecurityQuestionView securityQuestionView2 = SecurityQuestionView.this;
                    securityQuestionView2.f77378l1 = false;
                    securityQuestionView2.f72421L0.mo49315c4();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m83993AM(C20096c c20096c) {
        if (c20096c != null) {
            if (c20096c.m104491c() == 2057) {
                this.f77375i1 = c20096c.m104492d();
                try {
                    this.f77375i1 = new JSONObject(c20096c.m104490b()).optString("error_message", "");
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f72421L0.showDialog(4);
                return;
            }
            if (c20096c.m104491c() != 2037 && c20096c.m104491c() != 2034) {
                boolean z11 = false;
                if (c20096c.m104491c() == 2051) {
                    this.f77375i1 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pwd_token_expired), Integer.valueOf(c20096c.m104491c()));
                    this.f77376j1 = true;
                    this.f72421L0.showDialog(1);
                    return;
                }
                if (c20096c.m104491c() == 2052) {
                    this.f77375i1 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_quota_question), Integer.valueOf(c20096c.m104491c()));
                    try {
                        JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("back_to_login", 0) > 0) {
                                z11 = true;
                            }
                            this.f77377k1 = z11;
                        }
                    } catch (Exception e12) {
                        AbstractC20110a.m104539h(e12);
                    }
                    this.f77376j1 = true;
                    this.f72421L0.showDialog(1);
                    return;
                }
                if (c20096c.m104491c() == 2055) {
                    try {
                        this.f77376j1 = false;
                        JSONObject jSONObject = new JSONObject(c20096c.m104490b()).getJSONObject("data");
                        if (jSONObject != null && jSONObject.optInt("hasMsg") == 1) {
                            String optString = jSONObject.optString("message");
                            this.f77368b1 = optString;
                            if (TextUtils.isEmpty(optString)) {
                                this.f77368b1 = AbstractC23136l9.m118743r0(AbstractC8020f0.deactivate_force_login_otp);
                            }
                            this.f72421L0.showDialog(5);
                            return;
                        }
                        return;
                    } catch (Exception e13) {
                        AbstractC23350e.m122778h(e13);
                        return;
                    }
                }
                String m104492d = c20096c.m104492d();
                this.f77375i1 = m104492d;
                this.f77376j1 = false;
                if (!TextUtils.isEmpty(m104492d)) {
                    this.f72421L0.showDialog(1);
                    return;
                }
                return;
            }
            this.f72421L0.showDialog(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m84004rM(View view) {
        AbstractC23647d.m123906p("19903");
        this.f77358R0.removeView(view);
        this.f77356P0.m136139p((AbstractC26401c) view.getTag());
        m84014CM();
        this.f77355O0.notifyDataSetChanged();
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m84005sM() {
        this.f77359S0.fullScroll(66);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public /* synthetic */ void m84006tM(AdapterView adapterView, View view, int i11, long j11) {
        AbstractC23647d.m123906p("19902");
        AbstractC23647d.m123893c();
        if (this.f77356P0 == null) {
            return;
        }
        AbstractC26401c abstractC26401c = (AbstractC26401c) this.f77355O0.getItem(i11);
        if (!abstractC26401c.m136142c()) {
            this.f77356P0.m136133j(abstractC26401c);
            m84017oM(abstractC26401c);
        } else {
            this.f77356P0.m136139p(abstractC26401c);
            m84015DM(abstractC26401c);
        }
        m84014CM();
        this.f77355O0.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m84007uM(InterfaceC17463d interfaceC17463d) {
        if (this.f77377k1) {
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
            m92676n2().mo35579p().m93069k2(StartUpNewView.class, bundle, 2, true);
        } else if (this.f77376j1) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m84008vM(InterfaceC17463d interfaceC17463d, int i11) {
        mo50035CK(-1, null);
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m84009wM(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m84010xM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        mo50035CK(-1, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m84011yM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        Intent intent = new Intent();
        intent.putExtra("msg_force_login_otp", this.f77368b1);
        mo50035CK(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m84012zM(C26400b c26400b) {
        showDialog(3);
        this.f77356P0 = c26400b;
        C7109j7 c7109j7 = this.f77355O0;
        if (c7109j7 != null) {
            c7109j7.m36202k(c26400b);
            this.f77355O0.notifyDataSetChanged();
        }
        m84018pM();
    }

    /* renamed from: BM */
    void m84013BM(final C20096c c20096c, String str, String str2) {
        try {
            if (c20096c.m104491c() == 2060) {
                AbstractC23153n4.m119155v(m92676n2(), new JSONObject(c20096c.m104490b()).optJSONObject("data"), 1005);
                return;
            }
            if (c20096c.m104491c() == 2058) {
                JSONObject optJSONObject = new JSONObject(c20096c.m104490b()).optJSONObject("data");
                optJSONObject.put("password", str2);
                optJSONObject.put("question_type", this.f77371e1);
                optJSONObject.put("answer_type", this.f77372f1);
                optJSONObject.put("answer_value", this.f77373g1);
                optJSONObject.put("login_by_password", 2);
                AbstractC23153n4.m119151t(m92676n2(), optJSONObject, 1004, str, 1, this.f77366Z0, this.f77367a1);
                return;
            }
            if ((c20096c.m104491c() == 2036 || c20096c.m104491c() == 2033) && !TextUtils.isEmpty(c20096c.m104490b())) {
                try {
                    final C26400b m136124i = C26400b.m136124i(new JSONObject(c20096c.m104490b()).getJSONObject("data").getJSONObject("question"));
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.sg0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SecurityQuestionView.this.m84012zM(m136124i);
                        }
                    });
                    synchronized (this.f77379m1) {
                        this.f77378l1 = false;
                        this.f72421L0.mo49315c4();
                    }
                    return;
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("SecurityQuestionView", e11);
                }
            }
            if (c20096c.m104491c() != 50001) {
                C18489c.m97852r(true);
            }
            if (this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.jg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SecurityQuestionView.this.m83993AM(c20096c);
                    }
                });
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f77361U0 = new C23528a(this.f72421L0.m92648SI());
        this.f77374h1 = AbstractC23306f.m120579F1();
        if (bundle != null) {
            if (bundle.containsKey("KEY_CURRENT_QUESTION")) {
                this.f77356P0 = (C26400b) bundle.getSerializable("KEY_CURRENT_QUESTION");
            }
            this.f77364X0 = bundle.getString("KEY_ACCOUNT", "");
            this.f77363W0 = bundle.getString("KEY_PASSWORD", "");
            this.f77365Y0 = bundle.getString("KEY_PWD_TOKEN", "");
            this.f77366Z0 = bundle.getInt("KEY_SWITCH_ACCOUNT", 0);
            this.f77367a1 = bundle.getInt("KEY_SOURCE_SWITCH", 0);
            this.f77369c1 = bundle.getString("KEY_CAPTCHA_VALUE", "");
            this.f77370d1 = bundle.getString("KEY_CAPTCHA_TOKEN", "");
        }
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (this.f77356P0 == null && m92642L3.containsKey("EXTRA_QUESTION")) {
                try {
                    this.f77356P0 = (C26400b) m92642L3.getSerializable("EXTRA_QUESTION");
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("SecurityQuestionView", e11);
                }
            }
            if (TextUtils.isEmpty(this.f77364X0) && m92642L3.containsKey("EXTRA_ACCOUNT")) {
                this.f77364X0 = m92642L3.getString("EXTRA_ACCOUNT", "");
            }
            if (TextUtils.isEmpty(this.f77363W0) && m92642L3.containsKey("EXTRA_PASSWORD")) {
                this.f77363W0 = m92642L3.getString("EXTRA_PASSWORD", "");
            }
            if (TextUtils.isEmpty(this.f77365Y0) && m92642L3.containsKey("EXTRA_PWD_TOKEN")) {
                this.f77365Y0 = m92642L3.getString("EXTRA_PWD_TOKEN", "");
            }
            this.f77366Z0 = m92642L3.getInt("EXTRA_FROM_SWITCH_ACCOUNT", 0);
            this.f77367a1 = m92642L3.getInt("EXTRA_SOURCE_SWITCH_ACCOUNT", 0);
            if (TextUtils.isEmpty(this.f77369c1) && m92642L3.containsKey("EXTRA_CAPTCHA_VALUE")) {
                this.f77369c1 = m92642L3.getString("EXTRA_CAPTCHA_VALUE", "");
            }
            if (TextUtils.isEmpty(this.f77370d1) && m92642L3.containsKey("EXTRA_CAPTCHA_TOKEN")) {
                this.f77370d1 = m92642L3.getString("EXTRA_CAPTCHA_TOKEN", "");
            }
        }
        if (this.f77356P0 == null || TextUtils.isEmpty(this.f77364X0) || (TextUtils.isEmpty(this.f77363W0) && TextUtils.isEmpty(this.f77365Y0))) {
            finish();
        }
    }

    /* renamed from: CM */
    void m84014CM() {
        C26400b c26400b = this.f77356P0;
        if (c26400b == null) {
            return;
        }
        boolean z11 = false;
        if (c26400b.m136132h()) {
            int m136126b = this.f77356P0.m136126b();
            if (m136126b > 0) {
                if (this.f77356P0.m136131g() <= m136126b) {
                    this.f77353M0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.security_question_activity_multi_choice_answer_hint_pattern_4));
                    TextView textView = this.f77353M0;
                    textView.setTextColor(AbstractC23136l9.m118641B(textView.getContext(), AbstractC16801x.security_question_answer_hint_text_color_positive));
                } else {
                    this.f77353M0.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.security_question_activity_multi_choice_answer_hint_pattern_2, Integer.valueOf(this.f77356P0.m136131g() - m136126b)));
                    TextView textView2 = this.f77353M0;
                    textView2.setTextColor(AbstractC23136l9.m118641B(textView2.getContext(), AbstractC16801x.security_question_answer_hint_text_color_negative));
                }
            } else {
                this.f77353M0.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.security_question_activity_multi_choice_answer_hint_pattern_1, Integer.valueOf(this.f77356P0.m136131g())));
                TextView textView3 = this.f77353M0;
                textView3.setTextColor(AbstractC23136l9.m118641B(textView3.getContext(), AbstractC16801x.security_question_answer_hint_text_color_negative));
            }
        } else {
            this.f77353M0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.security_question_activity_multi_choice_answer_hint_pattern_3));
            if (this.f77356P0.m136126b() > 0) {
                TextView textView4 = this.f77353M0;
                textView4.setTextColor(AbstractC23136l9.m118641B(textView4.getContext(), AbstractC16801x.security_question_answer_hint_text_color_positive));
            } else {
                TextView textView5 = this.f77353M0;
                textView5.setTextColor(AbstractC23136l9.m118641B(textView5.getContext(), AbstractC16801x.security_question_answer_hint_text_color_negative));
            }
        }
        Button button = this.f77357Q0;
        if (this.f77356P0.m136126b() >= this.f77356P0.m136131g()) {
            z11 = true;
        }
        button.setEnabled(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                        aVar.m43159h(4);
                        aVar.m43162k(this.f77368b1);
                        aVar.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirmation_code), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ng0
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                SecurityQuestionView.this.m84011yM(interfaceC17463d, i12);
                            }
                        });
                        aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_back), new InterfaceC17463d.b());
                        return aVar.m43152a();
                    }
                    C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                    aVar2.m43159h(4).m43171t(AbstractC8020f0.str_titleDlg9).m43162k(this.f77375i1).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_continue), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.kg0
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            SecurityQuestionView.this.m84008vM(interfaceC17463d, i12);
                        }
                    });
                    C8009j m43152a = aVar2.m43152a();
                    m43152a.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.lg0
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                        /* renamed from: Tv */
                        public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                            SecurityQuestionView.this.m84009wM(interfaceC17463d);
                        }
                    });
                    m43152a.m92874z(false);
                    return m43152a;
                }
                C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                aVar3.m43159h(3).m43171t(AbstractC8020f0.str_title_dialog_general).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_answer_not_correct)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
                return aVar3.m43152a();
            }
            C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
            aVar4.m43159h(6).m43161j(AbstractC8020f0.security_question_activity_re_activation).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ok), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.mg0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    SecurityQuestionView.this.m84010xM(interfaceC17463d, i12);
                }
            });
            C8009j m43152a2 = aVar4.m43152a();
            m43152a2.m92873y(false);
            return m43152a2;
        }
        C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
        aVar5.m43159h(3).m43171t(AbstractC8020f0.str_title_dialog_general).m43162k(this.f77375i1).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
        C8009j m43152a3 = aVar5.m43152a();
        if (this.f77376j1) {
            m43152a3.m92874z(false);
        }
        m43152a3.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.ig0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
            /* renamed from: Tv */
            public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                SecurityQuestionView.this.m84007uM(interfaceC17463d);
            }
        });
        return m43152a3;
    }

    /* renamed from: DM */
    void m84015DM(AbstractC26401c abstractC26401c) {
        if (this.f77360T0.contains(abstractC26401c)) {
            this.f77360T0.remove(abstractC26401c);
            for (int i11 = 0; i11 < this.f77358R0.getChildCount(); i11++) {
                if (abstractC26401c.equals(this.f77358R0.getChildAt(i11).getTag())) {
                    this.f77358R0.removeViewAt(i11);
                    return;
                }
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f77362V0 = layoutInflater.inflate(AbstractC7409c0.security_question_view, (ViewGroup) null);
        m84019qM();
        m84018pM();
        return this.f77362V0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putSerializable("KEY_CURRENT_QUESTION", this.f77356P0);
        bundle.putString("KEY_ACCOUNT", this.f77364X0);
        bundle.putString("KEY_PASSWORD", this.f77363W0);
        bundle.putString("KEY_PWD_TOKEN", this.f77365Y0);
        bundle.putInt("KEY_SWITCH_ACCOUNT", this.f77366Z0);
        bundle.putInt("KEY_SOURCE_SWITCH", this.f77367a1);
        bundle.putString("KEY_CAPTCHA_VALUE", this.f77369c1);
        bundle.putString("KEY_CAPTCHA_TOKEN", this.f77370d1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.security_question_activity_title));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SecurityQuestionView";
    }

    /* renamed from: nM */
    public void m84016nM(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        if (C23055e5.m118272g(true)) {
            synchronized (this.f77379m1) {
                try {
                    if (this.f77378l1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    if (AbstractC23244v8.m119756t(str2)) {
                        str6 = str2;
                        str5 = "";
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    String m118290p = AbstractC23056e6.m118290p(str6, str5);
                    synchronized (this.f77379m1) {
                        this.f77378l1 = true;
                        this.f72421L0.mo46829Y();
                    }
                    this.f77368b1 = "";
                    String str7 = "";
                    if (!TextUtils.isEmpty(str3)) {
                        str7 = AbstractC23353h.m122790b(AbstractC23352g.m122788d(CoreUtility.f89225a + m118290p), str3);
                    }
                    String str8 = str7;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C15014a(str2, str3, elapsedRealtime, str4));
                    String str9 = "";
                    if (this.f77366Z0 > 0) {
                        str9 = AbstractC23179p8.m119418d(CoreUtility.f89233i);
                    }
                    this.f77371e1 = String.valueOf(this.f77356P0.m136130f());
                    this.f77372f1 = String.valueOf(this.f77356P0.m136131g());
                    String m136127c = this.f77356P0.m136127c();
                    this.f77373g1 = m136127c;
                    c0766k.mo1490N4(str2, str8, str5, this.f77371e1, this.f77372f1, m136127c, 0, str4, this.f77366Z0, str9, this.f77367a1, this.f77369c1, this.f77370d1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: oM */
    void m84017oM(AbstractC26401c abstractC26401c) {
        if (abstractC26401c instanceof C26402d) {
            this.f77360T0.add(abstractC26401c);
            int m118712h = AbstractC23136l9.m118712h(this.f72421L0.m92648SI(), 40.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m118712h, m118712h);
            layoutParams.rightMargin = AbstractC23136l9.m118712h(this.f72421L0.m92648SI(), 16.0f);
            FrameLayout frameLayout = new FrameLayout(this.f72421L0.m92648SI());
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.og0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SecurityQuestionView.this.m84004rM(view);
                }
            });
            frameLayout.setTag(abstractC26401c);
            RecyclingImageView recyclingImageView = new RecyclingImageView(this.f72421L0.m92648SI());
            recyclingImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            ((C23528a) this.f77361U0.m123612r(recyclingImageView)).m123618x(((C26402d) abstractC26401c).m136146g(), C23278z2.m120154t());
            frameLayout.addView(recyclingImageView);
            ImageView imageView = new ImageView(this.f72421L0.m92648SI());
            imageView.setImageResource(AbstractC16803z.ic_remove_user);
            imageView.setFocusableInTouchMode(false);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 85;
            imageView.setLayoutParams(layoutParams2);
            frameLayout.addView(imageView);
            this.f77358R0.addView(frameLayout);
            this.f77359S0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.pg0
                @Override // java.lang.Runnable
                public final void run() {
                    SecurityQuestionView.this.m84005sM();
                }
            }, 200L);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        boolean z11;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1004) {
            if (i12 == -1 && intent != null) {
                try {
                    if (intent.hasExtra("error_code")) {
                        int intExtra = intent.getIntExtra("error_code", 0);
                        if (intExtra == 0) {
                            String stringExtra = intent.getStringExtra("data");
                            String stringExtra2 = intent.getStringExtra("phone_num");
                            long longExtra = intent.getLongExtra("send_request_time", 0L);
                            if (!TextUtils.isEmpty(stringExtra)) {
                                JSONObject jSONObject = new JSONObject(stringExtra);
                                InterfaceC27218a m92676n2 = m92676n2();
                                if (this.f77366Z0 > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                AbstractC23153n4.m119161y(m92676n2, jSONObject, stringExtra2, longExtra, z11, this.f77367a1, TextUtils.isEmpty(this.f77365Y0), false);
                            }
                        } else {
                            String stringExtra3 = intent.getStringExtra("phone_num");
                            String stringExtra4 = intent.getStringExtra("password");
                            String stringExtra5 = intent.getStringExtra("msg");
                            String stringExtra6 = intent.getStringExtra("data");
                            this.f77369c1 = intent.getStringExtra("captcha_value");
                            this.f77370d1 = intent.getStringExtra("captcha_token");
                            C20096c c20096c = new C20096c(intExtra, stringExtra5);
                            c20096c.m104494f(stringExtra6);
                            m84013BM(c20096c, stringExtra3, stringExtra4);
                        }
                    }
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            return;
        }
        if (i11 == 1005 && i12 == -1 && intent != null) {
            try {
                String stringExtra7 = intent.getStringExtra("data");
                if (!TextUtils.isEmpty(stringExtra7)) {
                    JSONObject jSONObject2 = new JSONObject(stringExtra7);
                    if (jSONObject2.has("error_code")) {
                        int i13 = jSONObject2.getInt("error_code");
                        String str = "";
                        if (i13 == 0) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                            if (optJSONObject != null) {
                                String optString = optJSONObject.optString("captchaToken", "");
                                this.f77370d1 = optString;
                                if (!TextUtils.isEmpty(optString)) {
                                    if (AbstractC23309i.m121859e9() == 1) {
                                        str = AbstractC23309i.m121704a5();
                                    }
                                    m84016nM(str, this.f77364X0, this.f77363W0, this.f77365Y0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C20096c c20096c2 = new C20096c(i13, jSONObject2.optString("error_message", ""));
                        c20096c2.m104494f(stringExtra7);
                        if (AbstractC23216t1.m119643h(this.f72421L0, c20096c2, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.qg0
                            @Override // me0.AbstractC23216t1.d
                            /* renamed from: a */
                            public final void mo68088a(String str2) {
                                ToastUtils.showMess(str2);
                            }
                        })) {
                            return;
                        }
                        if (i13 == 1002) {
                            this.f77375i1 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_session_expired_web, Integer.valueOf(i13));
                        } else if (i13 == 1112) {
                            this.f77375i1 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_unknown, Integer.valueOf(i13));
                        } else {
                            this.f77375i1 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_unknown, Integer.valueOf(i13));
                        }
                        if (!TextUtils.isEmpty(this.f77375i1)) {
                            this.f72421L0.showDialog(1);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        if (view.getId() == AbstractC6918a0.btn_answer) {
            AbstractC23647d.m123906p("19904");
            AbstractC23647d.m123893c();
            if (AbstractC23309i.m121859e9() == 1) {
                str = AbstractC23309i.m121704a5();
            } else {
                str = "";
            }
            m84016nM(str, this.f77364X0, this.f77363W0, this.f77365Y0);
        }
    }

    /* renamed from: pM */
    void m84018pM() {
        this.f77355O0.m35953b();
        this.f77355O0.m35952a(this.f77356P0.m136125a());
        this.f77354N0.setText(this.f77356P0.m136129e() + " " + AbstractC23136l9.m118746s0(AbstractC8020f0.security_question_activity_multi_choice_answer_hint_pattern_5, Integer.valueOf(this.f77356P0.m136131g())));
        this.f77358R0.removeAllViews();
        for (AbstractC26401c abstractC26401c : this.f77356P0.m136125a()) {
            if (abstractC26401c.m136142c()) {
                m84017oM(abstractC26401c);
            }
        }
        m84014CM();
    }

    /* renamed from: qM */
    void m84019qM() {
        ListView listView = (ListView) this.f77362V0.findViewById(AbstractC6918a0.list_view_answers);
        this.f77353M0 = (TextView) this.f77362V0.findViewById(AbstractC6918a0.tv_security_question_answer_hint);
        this.f77354N0 = (TextView) this.f77362V0.findViewById(AbstractC6918a0.tv_security_question);
        C7109j7 c7109j7 = new C7109j7(this.f72421L0.m92648SI(), new C23528a(this.f72421L0.m92648SI()), this.f77356P0);
        this.f77355O0 = c7109j7;
        listView.setAdapter((ListAdapter) c7109j7);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.rg0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                SecurityQuestionView.this.m84006tM(adapterView, view, i11, j11);
            }
        });
        Button button = (Button) this.f77362V0.findViewById(AbstractC6918a0.btn_answer);
        this.f77357Q0 = button;
        button.setOnClickListener(this);
        this.f77359S0 = (HorizontalScrollView) this.f77362V0.findViewById(AbstractC6918a0.bubble_scroll_view);
        this.f77358R0 = (LinearLayout) this.f77362V0.findViewById(AbstractC6918a0.layout_bubble_selected);
    }
}
