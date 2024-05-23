package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.searchglobal.SearchGlobalView;
import com.zing.zalo.p077ui.zviews.FindFriendByPhoneNumberView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.phonenumbers.C16741a;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.AbstractC20276f;
import me0.AbstractC23059e9;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import me0.C23024b7;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p172fy.C19171b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p510sq.C26365a;
import p588vw.C28647m;
import p588vw.C28655u;
import p716zh.C32002l4;
import pm0.C24848g0;
import sy.AbstractC26412d;
import vg.C28023b6;

/* loaded from: classes6.dex */
public class FindFriendByPhoneNumberView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    EditText f73387P0;

    /* renamed from: Q0 */
    View f73388Q0;

    /* renamed from: R0 */
    TextView f73389R0;

    /* renamed from: S0 */
    TextView f73390S0;

    /* renamed from: U0 */
    RelativeLayout f73392U0;

    /* renamed from: V0 */
    View f73393V0;

    /* renamed from: W0 */
    View f73394W0;

    /* renamed from: Y0 */
    boolean f73396Y0;

    /* renamed from: Z0 */
    KeyEventCallbackC17462c f73397Z0;

    /* renamed from: a1 */
    KeyEventCallbackC17462c f73398a1;

    /* renamed from: b1 */
    KeyEventCallbackC17462c f73399b1;

    /* renamed from: e1 */
    RelativeLayout f73402e1;

    /* renamed from: f1 */
    LinearLayout f73403f1;

    /* renamed from: g1 */
    LinearLayout f73404g1;

    /* renamed from: h1 */
    LinearLayout f73405h1;

    /* renamed from: i1 */
    TextView f73406i1;

    /* renamed from: j1 */
    TextView f73407j1;

    /* renamed from: k1 */
    View f73408k1;

    /* renamed from: l1 */
    View f73409l1;

    /* renamed from: T0 */
    String f73391T0 = "";

    /* renamed from: X0 */
    Handler f73395X0 = new Handler();

    /* renamed from: c1 */
    String f73400c1 = "";

    /* renamed from: d1 */
    long f73401d1 = 0;

    /* renamed from: m1 */
    String f73410m1 = "";

    /* renamed from: n1 */
    InterfaceC20094a f73411n1 = new C14284b();

    /* renamed from: o1 */
    boolean f73412o1 = false;

    /* renamed from: p1 */
    boolean f73413p1 = false;

    /* renamed from: q1 */
    InterfaceC0765j f73414q1 = new C0766k();

    /* renamed from: r1 */
    InterfaceC20094a f73415r1 = new C14286d();

    /* renamed from: com.zing.zalo.ui.zviews.FindFriendByPhoneNumberView$a */
    /* loaded from: classes6.dex */
    public class C14283a extends AbstractC18391a {
        C14283a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            FindFriendByPhoneNumberView.this.m79770IM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FindFriendByPhoneNumberView$b */
    /* loaded from: classes6.dex */
    public class C14284b implements InterfaceC20094a {
        C14284b() {
        }

        /* renamed from: h */
        public /* synthetic */ void m79782h() {
            FindFriendByPhoneNumberView.this.m79765DM(false);
        }

        /* renamed from: i */
        public /* synthetic */ void m79783i(String str) {
            if (str.length() > 0 && !str.equalsIgnoreCase("null")) {
                AbstractC2379w.m12430d(FindFriendByPhoneNumberView.this.f73387P0);
                C32002l4 m154264g = C32002l4.m154264g(2);
                if (!str.equals(CoreUtility.f89233i)) {
                    TrackingSource trackingSource = new TrackingSource(40);
                    trackingSource.m40677a("sourceView", 16);
                    C21927m.m114302u().m114330e0(str, trackingSource);
                }
                new C19171b().m101508a(new C19171b.a(FindFriendByPhoneNumberView.this.f72421L0.m92676n2(), new C26365a.b(str, m154264g).m135736C(FindFriendByPhoneNumberView.this.f73391T0).m135743b(), 0, 1));
            }
        }

        /* renamed from: j */
        public /* synthetic */ void m79784j() {
            FindFriendByPhoneNumberView.this.m79765DM(false);
        }

        /* renamed from: k */
        public /* synthetic */ void m79785k() {
            FindFriendByPhoneNumberView.this.showDialog(4);
        }

        /* renamed from: l */
        public /* synthetic */ void m79786l(C20096c c20096c) {
            try {
                try {
                    if (FindFriendByPhoneNumberView.this.f72421L0.m92676n2() != null) {
                        FindFriendByPhoneNumberView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.of
                            public /* synthetic */ RunnableC15980of() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FindFriendByPhoneNumberView.C14284b.this.m79784j();
                            }
                        });
                    }
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                    if (c20096c != null) {
                        int m104491c = c20096c.m104491c();
                        String str = "";
                        if (m104491c == 1010) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_1);
                        } else if (m104491c == 111) {
                            m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_missparam, 111);
                        } else if (m104491c == 102) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_error_login);
                        } else if (m104491c == 515) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG);
                        } else if (m104491c == 2027) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.TOO_MANY_REQUEST_MSG);
                        } else if (m104491c == 1001) {
                            try {
                                if (!TextUtils.isEmpty(c20096c.m104490b())) {
                                    str = C23024b7.m118048i(new JSONObject(c20096c.m104490b()));
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        } else if (m104491c == 1012 || m104491c == 1011) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_2_desc);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            FindFriendByPhoneNumberView.this.f73410m1 = str;
                            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.pf
                                public /* synthetic */ RunnableC16017pf() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    FindFriendByPhoneNumberView.C14284b.this.m79785k();
                                }
                            });
                        } else {
                            FindFriendByPhoneNumberView findFriendByPhoneNumberView = FindFriendByPhoneNumberView.this;
                            if (findFriendByPhoneNumberView.f73396Y0) {
                                findFriendByPhoneNumberView.m79768GM(m118743r0);
                            }
                        }
                    } else {
                        FindFriendByPhoneNumberView findFriendByPhoneNumberView2 = FindFriendByPhoneNumberView.this;
                        if (findFriendByPhoneNumberView2.f73396Y0) {
                            findFriendByPhoneNumberView2.m79768GM(m118743r0);
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                FindFriendByPhoneNumberView.this.f73412o1 = false;
            } catch (Throwable th2) {
                FindFriendByPhoneNumberView.this.f73412o1 = false;
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Handler handler = FindFriendByPhoneNumberView.this.f73395X0;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.nf

                    /* renamed from: q */
                    public final /* synthetic */ C20096c f81349q;

                    public /* synthetic */ RunnableC15942nf(C20096c c20096c2) {
                        r2 = c20096c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FindFriendByPhoneNumberView.C14284b.this.m79786l(r2);
                    }
                }, 500L);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (FindFriendByPhoneNumberView.this.f72421L0.m92676n2() != null) {
                        FindFriendByPhoneNumberView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.lf
                            public /* synthetic */ RunnableC15850lf() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FindFriendByPhoneNumberView.C14284b.this.m79782h();
                            }
                        });
                    }
                    if (obj != null) {
                        JSONObject jSONObject = new JSONObject(((JSONObject) obj).getString("data"));
                        String string = jSONObject.getString("uid");
                        ContactProfile contactProfile = new ContactProfile(jSONObject);
                        try {
                            if (C7960e.m41971c6() != null && string.length() > 0 && !string.equalsIgnoreCase("null")) {
                                C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(string));
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        Handler handler = FindFriendByPhoneNumberView.this.f73395X0;
                        if (handler != null) {
                            handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.mf

                                /* renamed from: q */
                                public final /* synthetic */ String f81128q;

                                public /* synthetic */ RunnableC15887mf(String string2) {
                                    r2 = string2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    FindFriendByPhoneNumberView.C14284b.this.m79783i(r2);
                                }
                            });
                        }
                    }
                } catch (Throwable th2) {
                    FindFriendByPhoneNumberView.this.f73412o1 = false;
                    throw th2;
                }
            } catch (Exception unused) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_contentDlg4));
            }
            FindFriendByPhoneNumberView.this.f73412o1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FindFriendByPhoneNumberView$c */
    /* loaded from: classes6.dex */
    public class C14285c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f73418a;

        C14285c(String str) {
            this.f73418a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            FindFriendByPhoneNumberView.this.m79767FM(this.f73418a, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.bodyinvite), AbstractC23262x6.m120002o(AbstractC23304d.f113368c0.f42437s)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                String str = "";
                if (!jSONObject.isNull("data")) {
                    str = new JSONObject(jSONObject.getString("data")).optString("text");
                }
                if (TextUtils.isEmpty(str)) {
                    str = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.bodyinvite), AbstractC23262x6.m120002o(AbstractC23304d.f113368c0.f42437s));
                }
                FindFriendByPhoneNumberView.this.m79767FM(this.f73418a, str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FindFriendByPhoneNumberView$d */
    /* loaded from: classes6.dex */
    class C14286d implements InterfaceC20094a {
        C14286d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            FindFriendByPhoneNumberView.this.f73413p1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String string;
            String string2;
            String string3;
            boolean z11;
            boolean z12;
            FindFriendByPhoneNumberView.this.f73413p1 = false;
            JSONObject jSONObject = (JSONObject) obj;
            new JSONArray();
            try {
                if (!jSONObject.isNull("data")) {
                    JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("countries");
                    if (jSONArray.length() > 0) {
                        C7960e.m41971c6().m42506q4();
                    }
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i11);
                        if (jSONObject2.isNull("iso_country_code")) {
                            string = "";
                        } else {
                            string = jSONObject2.getString("iso_country_code");
                        }
                        if (jSONObject2.isNull("country_code")) {
                            string2 = "";
                        } else {
                            string2 = jSONObject2.getString("country_code");
                        }
                        if (jSONObject2.isNull("country_name")) {
                            string3 = "";
                        } else {
                            string3 = jSONObject2.getString("country_name");
                        }
                        if (!jSONObject2.isNull("sms") && jSONObject2.getBoolean("sms")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!jSONObject2.isNull("voice") && jSONObject2.getBoolean("voice")) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z13 = z11;
                        C7960e.m41971c6().m42424i9(new C28655u(string3, string, string2, i11, z13, z12));
                    }
                }
                AbstractC23309i.m121885ey(System.currentTimeMillis());
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: AM */
    public /* synthetic */ void m79747AM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        try {
            m79772pM(this.f73387P0.getText().toString().trim());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        AbstractC23126l.m118627a("Intive friend in Phone List");
    }

    /* renamed from: BM */
    public static /* synthetic */ C24848g0 m79748BM() {
        return null;
    }

    /* renamed from: CM */
    public /* synthetic */ void m79749CM(String str) {
        if (this.f73389R0 != null && !TextUtils.isEmpty(str)) {
            this.f73389R0.setText(str);
            this.f73389R0.setVisibility(0);
        }
    }

    /* renamed from: uM */
    public /* synthetic */ boolean m79759uM(TextView textView, int i11, KeyEvent keyEvent) {
        m79774rM();
        return false;
    }

    /* renamed from: vM */
    public /* synthetic */ void m79760vM() {
        try {
            if (!C7960e.m41971c6().m42583x9() && System.currentTimeMillis() - AbstractC23309i.m121119Kc() <= 86400000) {
                return;
            }
            m79773qM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    public /* synthetic */ void m79761wM() {
        View view = this.f73409l1;
        if (view != null) {
            AbstractC20276f.m105888a(view, 2.0f, 1200L, 500L, null);
        }
    }

    /* renamed from: xM */
    public /* synthetic */ void m79762xM(InterfaceC17463d interfaceC17463d, int i11) {
        this.f72421L0.removeDialog(3);
    }

    /* renamed from: yM */
    public /* synthetic */ void m79763yM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f72421L0.removeDialog(1);
    }

    /* renamed from: zM */
    public /* synthetic */ void m79764zM(InterfaceC17463d interfaceC17463d, int i11) {
        this.f72421L0.removeDialog(0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72421L0.m92676n2().mo35554O(3);
        m92637BK(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        AddFriendView.Companion.m78064c(m92686rK(), this.f73410m1, new InterfaceC18494a() { // from class: com.zing.zalo.ui.zviews.gf
                            @Override // en0.InterfaceC18494a
                            /* renamed from: V4 */
                            public final Object mo12V4() {
                                C24848g0 m79748BM;
                                m79748BM = FindFriendByPhoneNumberView.m79748BM();
                                return m79748BM;
                            }
                        });
                        return null;
                    }
                    return null;
                }
                try {
                    C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                    aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.zalo)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_network_notsupport)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.cf
                        public /* synthetic */ C15508cf() {
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            FindFriendByPhoneNumberView.this.m79762xM(interfaceC17463d, i12);
                        }
                    });
                    C8009j m43152a = aVar.m43152a();
                    this.f73397Z0 = m43152a;
                    return m43152a;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return null;
                }
            }
            try {
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_contentDlg4)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.df
                    public /* synthetic */ C15549df() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        FindFriendByPhoneNumberView.this.m79763yM(interfaceC17463d, i12);
                    }
                });
                C8009j m43152a2 = aVar2.m43152a();
                this.f73399b1 = m43152a2;
                return m43152a2;
            } catch (Exception e12) {
                e12.printStackTrace();
                return null;
            }
        }
        try {
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
            aVar3.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_contentDlg5)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ef
                public /* synthetic */ C15586ef() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    FindFriendByPhoneNumberView.this.m79764zM(interfaceC17463d, i12);
                }
            }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ff
                public /* synthetic */ C15623ff() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    FindFriendByPhoneNumberView.this.m79747AM(interfaceC17463d, i12);
                }
            });
            C8009j m43152a3 = aVar3.m43152a();
            this.f73398a1 = m43152a3;
            return m43152a3;
        } catch (Exception e13) {
            e13.printStackTrace();
            return null;
        }
    }

    /* renamed from: DM */
    void m79765DM(boolean z11) {
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
            if (z11) {
                this.f88763d0.m92744k(0, AbstractC7409c0.holo_circular_progress_bar_abs);
            }
        }
    }

    /* renamed from: EM */
    void m79766EM(String str, String str2) {
        m79765DM(true);
        if (C23055e5.m118272g(true)) {
            this.f73391T0 = str;
            this.f73412o1 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f73411n1);
            c0766k.mo1583Y9(str, str2, 1);
            return;
        }
        m79765DM(false);
    }

    /* renamed from: FM */
    void m79767FM(String str, String str2) {
        try {
            if (str.trim().equals("")) {
                if (this.f73396Y0) {
                    m79768GM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_the_phone_number_invalid));
                }
            } else {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
                intent.putExtra("sms_body", str2);
                this.f72421L0.startActivityForResult(intent, 2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.find_friend_by_phone_number_layout_view, viewGroup, false);
        m79776tM(inflate);
        return inflate;
    }

    /* renamed from: GM */
    void m79768GM(String str) {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.kf

                /* renamed from: q */
                public final /* synthetic */ String f80902q;

                public /* synthetic */ RunnableC15813kf(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FindFriendByPhoneNumberView.this.m79749CM(r2);
                }
            });
        }
    }

    /* renamed from: HM */
    void m79769HM() {
        try {
            String m121779c5 = AbstractC23309i.m121779c5();
            if (m121779c5 != null) {
                if (m121779c5.length() == 0) {
                }
                String m143391b = ((C28655u) C28647m.m143325c().m143328b().get(m121779c5)).m143391b();
                String str = ((C28655u) C28647m.m143325c().m143328b().get(m121779c5)).f132863a;
                this.f73390S0.setText(str + " (" + m143391b + ")");
                C28023b6.m141250h0().m141277D();
            }
            m121779c5 = "VN";
            String m143391b2 = ((C28655u) C28647m.m143325c().m143328b().get(m121779c5)).m143391b();
            String str2 = ((C28655u) C28647m.m143325c().m143328b().get(m121779c5)).f132863a;
            this.f73390S0.setText(str2 + " (" + m143391b2 + ")");
            C28023b6.m141250h0().m141277D();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IM */
    void m79770IM() {
        boolean z11;
        View view = this.f73388Q0;
        if (this.f73387P0.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        view.setEnabled(z11);
    }

    /* renamed from: JM */
    void m79771JM() {
        try {
            if (AbstractC23309i.m122042j3() == 1) {
                this.f73404g1.setVisibility(8);
                this.f73405h1.setVisibility(0);
                if (AbstractC23309i.m122577xf()) {
                    this.f73406i1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_search_friend));
                    if (TextUtils.isEmpty(AbstractC23304d.f113368c0.f42460z1)) {
                        this.f73408k1.setVisibility(0);
                        this.f73407j1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_empty_username));
                        this.f73408k1.setOnClickListener(this);
                        this.f73407j1.setOnClickListener(this);
                    } else {
                        this.f73408k1.setVisibility(8);
                        String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_username_search_friend), AbstractC23304d.f113368c0.f42460z1);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                        spannableStringBuilder.setSpan(new StyleSpan(1), format.indexOf(AbstractC23304d.f113368c0.f42460z1), spannableStringBuilder.length(), 33);
                        this.f73407j1.setText(spannableStringBuilder);
                        this.f73407j1.setOnClickListener(null);
                    }
                } else {
                    this.f73406i1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_input_phone_number));
                    String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_hint_phone_number_search_friend, AbstractC23304d.f113368c0.f42455y);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m118746s0);
                    spannableStringBuilder2.setSpan(new StyleSpan(1), m118746s0.indexOf(AbstractC23304d.f113368c0.f42455y), spannableStringBuilder2.length(), 33);
                    this.f73407j1.setText(spannableStringBuilder2);
                    this.f73407j1.setOnClickListener(null);
                    this.f73408k1.setVisibility(8);
                }
            } else {
                this.f73404g1.setVisibility(0);
                this.f73405h1.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                AbstractC2379w.m12430d(this.f73387P0);
                AbstractC23647d.m123897g("5801175");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f73396Y0 = false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        ActionBar actionBar;
        super.mo37493TJ();
        try {
            if (this.f72421L0.m92674mJ() && (actionBar = this.f88760a0) != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.funcSocialNetwork));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        AbstractC23647d.m123906p("3605");
        AbstractC23647d.m123893c();
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "FindFriendByPhoneNumberView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 == 2) {
                if (i12 == -1) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_send_invite_success));
                }
            } else if (i11 == 1001 && i12 == -1 && intent != null) {
                AbstractC23309i.m122661zp(intent.getStringExtra("EXTRA_RESULT_ISO_COUNTRY_CODE"));
                m79769HM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C17487o0 mo35579p;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tv_country) {
            EditText editText = this.f73387P0;
            if (editText != null) {
                AbstractC2379w.m12430d(editText);
            }
            AbstractC23647d.m123897g("5801176");
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_DISCARD", true);
            this.f72421L0.m92662fJ().m93066i2(CountryListView.class, bundle, 1001, 1, true);
            return;
        }
        if (id2 == AbstractC6918a0.tv_search) {
            AbstractC23647d.m123897g("5801109");
            if (!this.f73412o1) {
                m79774rM();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.rl_scan_qr) {
            EditText editText2 = this.f73387P0;
            if (editText2 != null) {
                AbstractC2379w.m12430d(editText2);
            }
            AbstractC23647d.m123906p("3602");
            AbstractC23647d.m123893c();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("extra_src", 3);
            AbstractC26412d.m136219h(m92676n2(), bundle2, 0);
            return;
        }
        if (id2 == AbstractC6918a0.rl_invite_friend) {
            EditText editText3 = this.f73387P0;
            if (editText3 != null) {
                AbstractC2379w.m12430d(editText3);
            }
            AbstractC23647d.m123906p("56002");
            this.f72421L0.m92662fJ().m93069k2(BroadcastSMSInviteToFriendsView.class, null, 1, true);
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.rl_people_you_may_know) {
            EditText editText4 = this.f73387P0;
            if (editText4 != null) {
                AbstractC2379w.m12430d(editText4);
            }
            AbstractC23647d.m123897g("5801180");
            if (AbstractC23309i.m121344Qf()) {
                this.f72421L0.m92662fJ().m93069k2(PeopleYouMayKnowView.class, null, 1, true);
                return;
            } else {
                this.f72421L0.m92662fJ().m93069k2(IntroPeopleYouMayKnowView.class, null, 1, true);
                return;
            }
        }
        if (id2 == AbstractC6918a0.ll_search_friend) {
            AbstractC23647d.m123906p("3601");
            AbstractC23647d.m123893c();
            Bundle bundle3 = new Bundle();
            if (AbstractC23309i.m122577xf()) {
                bundle3.putInt("HINT_SEARCH", 3);
            } else {
                bundle3.putInt("HINT_SEARCH", 1);
            }
            bundle3.putString("EXTRA_OPEN_SOURCE_POSITION", "0");
            bundle3.putString("EXTRA_OPEN_SOURCE_ACTION", "0");
            SearchGlobalView.m73151oO(this.f72421L0.m92662fJ(), bundle3, 0, 1, true);
            return;
        }
        if (id2 == AbstractC6918a0.ic_create_username) {
            AbstractC23647d.m123906p("360101");
            AbstractC23647d.m123893c();
            this.f72421L0.m92662fJ().m93069k2(IntroUsernameView.class, null, 1, true);
            return;
        }
        if (id2 == AbstractC6918a0.tv_hint_friend) {
            AbstractC23647d.m123906p("360101");
            AbstractC23647d.m123893c();
            this.f72421L0.m92662fJ().m93069k2(IntroUsernameView.class, null, 1, true);
            return;
        }
        if (id2 == AbstractC6918a0.rl_outgoing_friend_request) {
            EditText editText5 = this.f73387P0;
            if (editText5 != null) {
                AbstractC2379w.m12430d(editText5);
            }
            AbstractC23647d.m123897g("5801181");
            this.f72421L0.m92662fJ().m93069k2(RequestFriendView.class, null, 1, true);
            return;
        }
        if (id2 == AbstractC6918a0.rl_convert_phone) {
            EditText editText6 = this.f73387P0;
            if (editText6 != null) {
                AbstractC2379w.m12430d(editText6);
            }
            this.f72421L0.m92662fJ().m93069k2(ToolConvertPhoneNumberView.class, null, 1, true);
            AbstractC23647d.m123906p("3000191");
            return;
        }
        if (id2 == AbstractC6918a0.rl_friend_from_native) {
            EditText editText7 = this.f73387P0;
            if (editText7 != null) {
                AbstractC2379w.m12430d(editText7);
            }
            if (this.f72421L0.m92676n2() != null && (mo35579p = this.f72421L0.m92676n2().mo35579p()) != null) {
                mo35579p.m93069k2(ListContactNativeView.class, null, 1, true);
                AbstractC23647d.m123897g("3000201");
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123906p("3605");
            AbstractC23647d.m123893c();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        AbstractC23059e9.m118318G(40);
        m79771JM();
        this.f73396Y0 = true;
    }

    /* renamed from: pM */
    void m79772pM(String str) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14285c(str));
        c0766k.m1810G(str);
    }

    /* renamed from: qM */
    void m79773qM() {
        if (this.f73413p1) {
            return;
        }
        this.f73413p1 = true;
        this.f73414q1.mo1704o8(this.f73415r1);
        this.f73414q1.mo1482M4(AbstractC23309i.m121704a5(), true);
    }

    /* renamed from: rM */
    void m79774rM() {
        TextView textView = this.f73389R0;
        if (textView != null) {
            textView.setVisibility(8);
        }
        String obj = this.f73387P0.getText().toString();
        if (obj.trim().equals("")) {
            m79768GM(AbstractC23136l9.m118743r0(AbstractC8020f0.find_friend_input_phone_notify));
            return;
        }
        String m121779c5 = AbstractC23309i.m121779c5();
        if (m121779c5 == null) {
            m121779c5 = AbstractC23309i.m121704a5();
        }
        String m89307S = C16741a.m89307S(obj.trim());
        if (!TextUtils.isEmpty(m89307S) && m89307S.length() >= 6) {
            if (m89307S.equals(this.f73400c1) && System.currentTimeMillis() - this.f73401d1 < 2000) {
                return;
            }
            this.f73401d1 = System.currentTimeMillis();
            this.f73400c1 = m89307S;
            m79766EM(m89307S, m121779c5);
            return;
        }
        m79768GM(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
    }

    /* renamed from: sM */
    void m79775sM() {
        EditText editText = this.f73387P0;
        if (editText != null) {
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.hf
                public /* synthetic */ C15697hf() {
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    boolean m79759uM;
                    m79759uM = FindFriendByPhoneNumberView.this.m79759uM(textView, i11, keyEvent);
                    return m79759uM;
                }
            });
            this.f73387P0.addTextChangedListener(new C14283a());
        }
        this.f73390S0.setOnClickListener(this);
        this.f73388Q0.setOnClickListener(this);
        this.f73393V0.setOnClickListener(this);
        this.f73392U0.setOnClickListener(this);
        this.f73403f1.setOnClickListener(this);
        this.f73394W0.setOnClickListener(this);
        this.f73402e1.setOnClickListener(this);
        m79771JM();
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.if
            public /* synthetic */ RunnableC15734if() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FindFriendByPhoneNumberView.this.m79760vM();
            }
        });
        m79770IM();
        m79769HM();
        int m122598y = AbstractC23309i.m122598y();
        if (m122598y > 0) {
            AbstractC23309i.m120902Eh(m122598y - 1);
            new Handler().postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.jf
                public /* synthetic */ RunnableC15770jf() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FindFriendByPhoneNumberView.this.m79761wM();
                }
            }, 500L);
        }
    }

    /* renamed from: tM */
    void m79776tM(View view) {
        this.f73387P0 = (EditText) view.findViewById(AbstractC6918a0.edt_phone_number);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tv_error);
        this.f73389R0 = textView;
        textView.setVisibility(8);
        this.f73390S0 = (TextView) view.findViewById(AbstractC6918a0.tv_country);
        this.f73388Q0 = view.findViewById(AbstractC6918a0.tv_search);
        this.f73393V0 = view.findViewById(AbstractC6918a0.rl_scan_qr);
        this.f73402e1 = (RelativeLayout) view.findViewById(AbstractC6918a0.rl_outgoing_friend_request);
        this.f73394W0 = view.findViewById(AbstractC6918a0.rl_people_you_may_know);
        this.f73392U0 = (RelativeLayout) view.findViewById(AbstractC6918a0.rl_invite_friend);
        this.f73404g1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_find_phone_number);
        this.f73405h1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_find_username);
        this.f73403f1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_search_friend);
        this.f73406i1 = (TextView) view.findViewById(AbstractC6918a0.tv_search_friend);
        this.f73407j1 = (TextView) view.findViewById(AbstractC6918a0.tv_hint_friend);
        this.f73408k1 = view.findViewById(AbstractC6918a0.ic_create_username);
        this.f73409l1 = view.findViewById(AbstractC6918a0.btn_search_global);
        View findViewById = view.findViewById(AbstractC6918a0.rl_friend_from_native);
        if (AbstractC23309i.m122119l4()) {
            view.findViewById(AbstractC6918a0.line_friend_from_native).setVisibility(0);
            findViewById.setOnClickListener(this);
            findViewById.setVisibility(0);
        } else {
            view.findViewById(AbstractC6918a0.line_friend_from_native).setVisibility(8);
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(AbstractC6918a0.rl_convert_phone);
        if (AbstractC23309i.m121716ag()) {
            view.findViewById(AbstractC6918a0.line_tool_convert).setVisibility(0);
            findViewById2.setOnClickListener(this);
            findViewById2.setVisibility(0);
        } else {
            view.findViewById(AbstractC6918a0.line_tool_convert).setVisibility(8);
            findViewById2.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m79775sM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
