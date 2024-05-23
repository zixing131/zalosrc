package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.util.InterfaceC1479a;
import androidx.recyclerview.widget.RecyclerView;
import ck0.C3568b;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7098i7;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SecurityCheckupItemView;
import com.zing.zalo.p077ui.zviews.SettingSecurityView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import lk0.AbstractC22506d;
import lk0.C22504b;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p131ei.C18434b;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23304d;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C29731bb;
import p649xl.C29804fc;
import p667y2.C30268e;
import s00.AbstractC26084s;
import t00.C26445b;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class SettingSecurityView extends SlidableZaloView implements C23744a.c {
    public static final C15041b Companion = new C15041b(null);

    /* renamed from: Q0 */
    private C29804fc f77536Q0;

    /* renamed from: R0 */
    private C7098i7 f77537R0;

    /* renamed from: X0 */
    private boolean f77543X0;

    /* renamed from: Y0 */
    private boolean f77544Y0;

    /* renamed from: Z0 */
    private boolean f77545Z0;

    /* renamed from: a1 */
    private boolean f77546a1;

    /* renamed from: b1 */
    private boolean f77547b1;

    /* renamed from: c1 */
    private boolean f77548c1;

    /* renamed from: P0 */
    private final String f77535P0 = "SettingSecurityView";

    /* renamed from: S0 */
    private boolean f77538S0 = true;

    /* renamed from: T0 */
    private final String f77539T0 = "https://help.zalo.me/article/kiem-tra-bao-mat-cac-truong-hop-co-the-gay-mat-tai-khoan?preview=true";

    /* renamed from: U0 */
    private final int f77540U0 = 1;

    /* renamed from: V0 */
    private final int f77541V0 = 2;

    /* renamed from: W0 */
    private final int f77542W0 = 3;

    /* renamed from: com.zing.zalo.ui.zviews.SettingSecurityView$a */
    /* loaded from: classes6.dex */
    public final class C15040a extends C10866e {

        /* renamed from: g0 */
        private final String f77549g0;

        /* renamed from: h0 */
        final /* synthetic */ SettingSecurityView f77550h0;

        public C15040a(SettingSecurityView settingSecurityView, InterfaceC27218a interfaceC27218a, int i11, int i12) {
            AbstractC19074t.m100208f(interfaceC27218a, "activity");
            this.f77550h0 = settingSecurityView;
            this.f77549g0 = "https://help.zalo.me/article/category/quyen-rieng-tu-va-bao-mat";
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            AbstractC19074t.m100208f(view, "widget");
            try {
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", this.f77549g0);
                ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
                InterfaceC27218a interfaceC27218a = this.f54823A;
                AbstractC19074t.m100207e(interfaceC27218a, "mActivity");
                c15403a.m87171F(interfaceC27218a, this.f77549g0, bundle);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            if (this.f54861x) {
                textPaint.bgColor = C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.ItemBackgroundSelectedColor);
            } else {
                textPaint.bgColor = AbstractC23136l9.m118641B(this.f54823A.getContext(), AbstractC16801x.transparent);
            }
            textPaint.setColor(C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingSecurityView$b */
    /* loaded from: classes6.dex */
    public static final class C15041b {
        private C15041b() {
        }

        public /* synthetic */ C15041b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingSecurityView$c */
    /* loaded from: classes6.dex */
    public static final class C15042c implements InterfaceC20094a {
        C15042c() {
        }

        /* renamed from: d */
        public static final void m84215d(SettingSecurityView settingSecurityView, ArrayList arrayList) {
            AbstractC19074t.m100208f(settingSecurityView, "this$0");
            AbstractC19074t.m100208f(arrayList, "$listProcessed");
            C7098i7 c7098i7 = settingSecurityView.f77537R0;
            C7098i7 c7098i72 = null;
            if (c7098i7 == null) {
                AbstractC19074t.m100223u("mAdapter");
                c7098i7 = null;
            }
            c7098i7.m36181O(arrayList);
            C7098i7 c7098i73 = settingSecurityView.f77537R0;
            if (c7098i73 == null) {
                AbstractC19074t.m100223u("mAdapter");
            } else {
                c7098i72 = c7098i73;
            }
            c7098i72.m10008p();
            settingSecurityView.m84208MM(settingSecurityView.f77542W0);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingSecurityView.this.m84206KM(false);
            SettingSecurityView settingSecurityView = SettingSecurityView.this;
            settingSecurityView.m84208MM(settingSecurityView.f77541V0);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    JSONArray jSONArray = null;
                    if (optJSONObject != null) {
                        jSONObject = optJSONObject.optJSONObject("processed");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        jSONArray = jSONObject.optJSONArray("list");
                    }
                    if (jSONArray != null) {
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject optJSONObject2 = jSONArray.optJSONObject(i11);
                            String optString = optJSONObject2.optString("title");
                            AbstractC19074t.m100207e(optString, "optString(...)");
                            arrayList.add(new C26445b(optString, null, 1, 2, null));
                            JSONArray optJSONArray = optJSONObject2.optJSONArray("issues");
                            if (optJSONArray != null) {
                                int length2 = optJSONArray.length();
                                for (int i12 = 0; i12 < length2; i12++) {
                                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i12);
                                    String optString2 = optJSONObject3.optString("title");
                                    AbstractC19074t.m100207e(optString2, "optString(...)");
                                    String optString3 = optJSONObject3.optString("content");
                                    AbstractC19074t.m100207e(optString3, "optString(...)");
                                    arrayList.add(new C26445b(optString2, optString3, 0, 4, null));
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingSecurityView.this.m84206KM(false);
                SettingSecurityView settingSecurityView = SettingSecurityView.this;
                settingSecurityView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.vi0

                    /* renamed from: q */
                    public final /* synthetic */ ArrayList f82423q;

                    public /* synthetic */ vi0(ArrayList arrayList2) {
                        r2 = arrayList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingSecurityView.C15042c.m84215d(SettingSecurityView.this, r2);
                    }
                });
            } catch (Throwable th2) {
                SettingSecurityView.this.m84206KM(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingSecurityView$d */
    /* loaded from: classes6.dex */
    public static final class C15043d implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.SettingSecurityView$d$a */
        /* loaded from: classes6.dex */
        public static final class a implements SecurityCheckupItemView.InterfaceC13522a {

            /* renamed from: a */
            final /* synthetic */ SettingSecurityView f77553a;

            a(SettingSecurityView settingSecurityView) {
                this.f77553a = settingSecurityView;
            }

            @Override // com.zing.zalo.p077ui.widget.SecurityCheckupItemView.InterfaceC13522a
            /* renamed from: n1 */
            public void mo75877n1() {
            }

            @Override // com.zing.zalo.p077ui.widget.SecurityCheckupItemView.InterfaceC13522a
            /* renamed from: o1 */
            public void mo75878o1(String str, String str2, AbstractC28207v1.h0 h0Var) {
                AbstractC28207v1.m141989h3(str, -1, this.f77553a.m92676n2(), this.f77553a, str2, h0Var, "", null, null);
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.SettingSecurityView$d$b */
        /* loaded from: classes6.dex */
        public static final class b implements SecurityCheckupItemView.InterfaceC13522a {

            /* renamed from: a */
            final /* synthetic */ SettingSecurityView f77554a;

            b(SettingSecurityView settingSecurityView) {
                this.f77554a = settingSecurityView;
            }

            @Override // com.zing.zalo.p077ui.widget.SecurityCheckupItemView.InterfaceC13522a
            /* renamed from: n1 */
            public void mo75877n1() {
            }

            @Override // com.zing.zalo.p077ui.widget.SecurityCheckupItemView.InterfaceC13522a
            /* renamed from: o1 */
            public void mo75878o1(String str, String str2, AbstractC28207v1.h0 h0Var) {
                AbstractC28207v1.m141989h3(str, -1, this.f77554a.m92676n2(), this.f77554a, str2, h0Var, "", null, null);
            }
        }

        C15043d() {
        }

        /* renamed from: f */
        public static final void m84219f(SettingSecurityView settingSecurityView, JSONObject jSONObject) {
            AbstractC19074t.m100208f(settingSecurityView, "this$0");
            try {
                C29804fc c29804fc = settingSecurityView.f77536Q0;
                C29804fc c29804fc2 = null;
                if (c29804fc == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc = null;
                }
                c29804fc.f137770r.setActionProcessDelegate(new a(settingSecurityView));
                C22504b m116363a = new AbstractC22506d.a().m116364b(37).m116365c(jSONObject).m116363a();
                if (m116363a != null) {
                    C29804fc c29804fc3 = settingSecurityView.f77536Q0;
                    if (c29804fc3 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29804fc2 = c29804fc3;
                    }
                    c29804fc2.f137770r.m75872d(m116363a);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: g */
        public static final void m84220g(SettingSecurityView settingSecurityView, JSONArray jSONArray) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            AbstractC19074t.m100208f(settingSecurityView, "this$0");
            try {
                settingSecurityView.m84207LM(settingSecurityView.f77542W0);
                C29804fc c29804fc = settingSecurityView.f77536Q0;
                if (c29804fc == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc = null;
                }
                c29804fc.f137773u.removeAllViews();
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject3 = jSONArray.optJSONObject(i11);
                        if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("ZInstantAPIInfo")) != null && (optJSONObject2 = optJSONObject.optJSONObject("zinstantdata")) != null) {
                            LayoutInflater from = LayoutInflater.from(settingSecurityView.m92648SI());
                            C29804fc c29804fc2 = settingSecurityView.f77536Q0;
                            if (c29804fc2 == null) {
                                AbstractC19074t.m100223u("binding");
                                c29804fc2 = null;
                            }
                            SecurityCheckupItemView root = C29731bb.m147777c(from, c29804fc2.f137773u, true).getRoot();
                            AbstractC19074t.m100207e(root, "getRoot(...)");
                            root.setActionProcessDelegate(new b(settingSecurityView));
                            C22504b m116363a = new AbstractC22506d.a().m116364b(37).m116365c(optJSONObject2).m116363a();
                            if (m116363a != null) {
                                root.m75872d(m116363a);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: h */
        public static final void m84221h(SettingSecurityView settingSecurityView) {
            AbstractC19074t.m100208f(settingSecurityView, "this$0");
            settingSecurityView.m84207LM(settingSecurityView.f77541V0);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingSecurityView.this.m84205JM(false);
            SettingSecurityView settingSecurityView = SettingSecurityView.this;
            settingSecurityView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.wi0
                public /* synthetic */ wi0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SettingSecurityView.C15043d.m84221h(SettingSecurityView.this);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONArray jSONArray;
            JSONObject jSONObject2;
            String str;
            JSONObject optJSONObject;
            JSONObject jSONObject3;
            JSONObject optJSONObject2;
            try {
                try {
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject optJSONObject3 = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject3 != null && (optJSONObject2 = optJSONObject3.optJSONObject("not_processed")) != null) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("subTitle", optJSONObject2.optJSONObject("subTitle"));
                        jSONObject4.put("warningType", optJSONObject2.optInt("warningType"));
                        AbstractC0924m0.m4242tq(jSONObject4.toString());
                    }
                    if (optJSONObject3 != null) {
                        jSONObject = optJSONObject3.optJSONObject("not_processed");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        jSONArray = jSONObject.optJSONArray("list");
                    } else {
                        jSONArray = null;
                    }
                    if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("header")) != null && (jSONObject3 = optJSONObject.getJSONObject("ZInstantAPIInfo")) != null) {
                        jSONObject2 = jSONObject3.optJSONObject("zinstantdata");
                    } else {
                        jSONObject2 = null;
                    }
                    AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                    if (jSONObject2 != null) {
                        str = jSONObject2.toString();
                    } else {
                        str = null;
                    }
                    aVar.mo104551d("Test: " + str, new Object[0]);
                    if (jSONObject2 != null) {
                        SettingSecurityView settingSecurityView = SettingSecurityView.this;
                        settingSecurityView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.xi0

                            /* renamed from: q */
                            public final /* synthetic */ JSONObject f82641q;

                            public /* synthetic */ xi0(JSONObject jSONObject22) {
                                r2 = jSONObject22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingSecurityView.C15043d.m84219f(SettingSecurityView.this, r2);
                            }
                        });
                    }
                    if (jSONObject != null && jSONObject.optInt("tot", 0) == 0 && SettingSecurityView.this.f77545Z0 && AbstractC23304d.f113280G2 != null) {
                        C18434b.Companion.m97695b().m97691w(AbstractC23304d.f113280G2);
                        AbstractC23304d.f113280G2 = null;
                        C19669z.Companion.m103232a().m103198O0();
                    }
                    SettingSecurityView settingSecurityView2 = SettingSecurityView.this;
                    settingSecurityView2.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.yi0

                        /* renamed from: q */
                        public final /* synthetic */ JSONArray f82749q;

                        public /* synthetic */ yi0(JSONArray jSONArray2) {
                            r2 = jSONArray2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingSecurityView.C15043d.m84220g(SettingSecurityView.this, r2);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingSecurityView.this.m84205JM(false);
            } catch (Throwable th2) {
                SettingSecurityView.this.m84205JM(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingSecurityView$e */
    /* loaded from: classes6.dex */
    public static final class C15044e implements C3568b.b {
        C15044e() {
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            AbstractC19074t.m100208f(c3568b, "zinstantDagger");
        }
    }

    /* renamed from: AM */
    public static final void m84180AM(SettingSecurityView settingSecurityView, View view) {
        AbstractC19074t.m100208f(settingSecurityView, "this$0");
        settingSecurityView.m84209NM(false);
    }

    /* renamed from: BM */
    public static final void m84181BM(SettingSecurityView settingSecurityView, View view) {
        AbstractC19074t.m100208f(settingSecurityView, "this$0");
        settingSecurityView.m84209NM(true);
    }

    /* renamed from: CM */
    public static final void m84182CM(SettingSecurityView settingSecurityView, View view) {
        AbstractC19074t.m100208f(settingSecurityView, "this$0");
        settingSecurityView.m84207LM(settingSecurityView.f77540U0);
        settingSecurityView.m84211wM();
    }

    /* renamed from: DM */
    public static final void m84183DM(SettingSecurityView settingSecurityView, View view) {
        AbstractC19074t.m100208f(settingSecurityView, "this$0");
        settingSecurityView.m84208MM(settingSecurityView.f77540U0);
        settingSecurityView.m84210vM();
    }

    /* renamed from: EM */
    public static final void m84184EM(SecurityCheckupItemView securityCheckupItemView) {
        securityCheckupItemView.m75873f();
    }

    /* renamed from: FM */
    public static final void m84185FM(SecurityCheckupItemView securityCheckupItemView) {
        securityCheckupItemView.m75874g();
    }

    /* renamed from: GM */
    public static final void m84186GM(SecurityCheckupItemView securityCheckupItemView) {
        securityCheckupItemView.m75875h();
    }

    /* renamed from: HM */
    public static final void m84187HM(SecurityCheckupItemView securityCheckupItemView) {
        securityCheckupItemView.m75876i();
    }

    /* renamed from: uM */
    private final void m84202uM(InterfaceC1479a interfaceC1479a) {
        C29804fc c29804fc = this.f77536Q0;
        C29804fc c29804fc2 = null;
        if (c29804fc == null) {
            AbstractC19074t.m100223u("binding");
            c29804fc = null;
        }
        interfaceC1479a.accept(c29804fc.f137770r);
        C29804fc c29804fc3 = this.f77536Q0;
        if (c29804fc3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29804fc2 = c29804fc3;
        }
        LinearLayout linearLayout = c29804fc2.f137773u;
        AbstractC19074t.m100207e(linearLayout, "llListItem");
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            AbstractC19074t.m100207e(childAt, "getChildAt(index)");
            if (childAt instanceof SecurityCheckupItemView) {
                interfaceC1479a.accept(childAt);
            }
        }
    }

    /* renamed from: yM */
    public static final void m84203yM(SettingSecurityView settingSecurityView, View view) {
        AbstractC19074t.m100208f(settingSecurityView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_WEB_URL", settingSecurityView.f77539T0);
        ZaloWebView.Companion.m87169D(settingSecurityView.m92662fJ(), settingSecurityView.f77539T0, bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C3568b.m18124b().m18127d(new C15044e());
        if (m92642L3() != null) {
            Bundle m92642L3 = m92642L3();
            AbstractC19074t.m100205c(m92642L3);
            this.f77545Z0 = m92642L3.getBoolean("EXTRA_OPEN_FROM_ACTION_LIST", false);
        }
        AbstractC26084s.m134269q(0, 121);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29804fc m147955c = C29804fc.m147955c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147955c, "inflate(...)");
        this.f77536Q0 = m147955c;
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 6030);
        bVar.m124119a().m124115b(this, 6032);
        m84213zM();
        C29804fc c29804fc = this.f77536Q0;
        if (c29804fc == null) {
            AbstractC19074t.m100223u("binding");
            c29804fc = null;
        }
        LinearLayout root = c29804fc.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: IM */
    public final void m84204IM(int i11) {
        if (m92672lJ()) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        if (this.f77538S0) {
                            this.f77543X0 = true;
                            m84210vM();
                            return;
                        } else {
                            this.f77544Y0 = true;
                            m84211wM();
                            return;
                        }
                    }
                    return;
                }
                if (this.f77538S0) {
                    m84210vM();
                    return;
                } else {
                    this.f77544Y0 = true;
                    return;
                }
            }
            if (this.f77538S0) {
                this.f77543X0 = true;
                return;
            } else {
                m84211wM();
                return;
            }
        }
        if (i11 == 0 || i11 == 2) {
            this.f77543X0 = true;
        }
        if (i11 == 1 || i11 == 2) {
            this.f77544Y0 = true;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 6030);
        bVar.m124119a().m124117e(this, 6032);
    }

    /* renamed from: JM */
    public final void m84205JM(boolean z11) {
        this.f77547b1 = z11;
    }

    /* renamed from: KM */
    public final void m84206KM(boolean z11) {
        this.f77548c1 = z11;
    }

    /* renamed from: LM */
    public final void m84207LM(int i11) {
        try {
            C29804fc c29804fc = null;
            if (i11 == this.f77540U0) {
                C29804fc c29804fc2 = this.f77536Q0;
                if (c29804fc2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc2 = null;
                }
                c29804fc2.f137769q.setVisibility(8);
                C29804fc c29804fc3 = this.f77536Q0;
                if (c29804fc3 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc3 = null;
                }
                c29804fc3.f137775w.setVisibility(0);
                C29804fc c29804fc4 = this.f77536Q0;
                if (c29804fc4 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29804fc = c29804fc4;
                }
                c29804fc.f137775w.setState(MultiStateView.EnumC15914e.LOADING);
                return;
            }
            if (i11 == this.f77541V0) {
                C29804fc c29804fc5 = this.f77536Q0;
                if (c29804fc5 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc5 = null;
                }
                c29804fc5.f137769q.setVisibility(8);
                C29804fc c29804fc6 = this.f77536Q0;
                if (c29804fc6 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc6 = null;
                }
                c29804fc6.f137775w.setVisibility(0);
                C29804fc c29804fc7 = this.f77536Q0;
                if (c29804fc7 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29804fc = c29804fc7;
                }
                c29804fc.f137775w.setState(MultiStateView.EnumC15914e.ERROR);
                return;
            }
            if (i11 == this.f77542W0) {
                C29804fc c29804fc8 = this.f77536Q0;
                if (c29804fc8 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc8 = null;
                }
                c29804fc8.f137769q.setVisibility(0);
                C29804fc c29804fc9 = this.f77536Q0;
                if (c29804fc9 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29804fc = c29804fc9;
                }
                c29804fc.f137775w.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MM */
    public final void m84208MM(int i11) {
        try {
            C29804fc c29804fc = null;
            if (i11 == this.f77540U0) {
                C29804fc c29804fc2 = this.f77536Q0;
                if (c29804fc2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc2 = null;
                }
                c29804fc2.f137774v.setVisibility(8);
                C29804fc c29804fc3 = this.f77536Q0;
                if (c29804fc3 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc3 = null;
                }
                c29804fc3.f137776x.setVisibility(0);
                C29804fc c29804fc4 = this.f77536Q0;
                if (c29804fc4 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29804fc = c29804fc4;
                }
                c29804fc.f137776x.setState(MultiStateView.EnumC15914e.LOADING);
                return;
            }
            if (i11 == this.f77541V0) {
                C29804fc c29804fc5 = this.f77536Q0;
                if (c29804fc5 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc5 = null;
                }
                c29804fc5.f137774v.setVisibility(8);
                C29804fc c29804fc6 = this.f77536Q0;
                if (c29804fc6 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc6 = null;
                }
                c29804fc6.f137776x.setVisibility(0);
                C29804fc c29804fc7 = this.f77536Q0;
                if (c29804fc7 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29804fc = c29804fc7;
                }
                c29804fc.f137776x.setState(MultiStateView.EnumC15914e.ERROR);
                return;
            }
            if (i11 == this.f77542W0) {
                C7098i7 c7098i7 = this.f77537R0;
                if (c7098i7 == null) {
                    AbstractC19074t.m100223u("mAdapter");
                    c7098i7 = null;
                }
                if (c7098i7.mo10003k() > 0) {
                    C29804fc c29804fc8 = this.f77536Q0;
                    if (c29804fc8 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29804fc8 = null;
                    }
                    c29804fc8.f137774v.setVisibility(0);
                    C29804fc c29804fc9 = this.f77536Q0;
                    if (c29804fc9 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29804fc = c29804fc9;
                    }
                    c29804fc.f137776x.setVisibility(8);
                    return;
                }
                C29804fc c29804fc10 = this.f77536Q0;
                if (c29804fc10 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc10 = null;
                }
                c29804fc10.f137774v.setVisibility(8);
                C29804fc c29804fc11 = this.f77536Q0;
                if (c29804fc11 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc11 = null;
                }
                c29804fc11.f137776x.setVisibility(0);
                C29804fc c29804fc12 = this.f77536Q0;
                if (c29804fc12 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29804fc12 = null;
                }
                c29804fc12.f137776x.setState(MultiStateView.EnumC15914e.EMPTY);
                C29804fc c29804fc13 = this.f77536Q0;
                if (c29804fc13 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29804fc = c29804fc13;
                }
                c29804fc.f137776x.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_resolved_security_hub));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: NM */
    public final void m84209NM(boolean z11) {
        if (z11 == this.f77538S0) {
            return;
        }
        this.f77538S0 = z11;
        C29804fc c29804fc = null;
        if (z11) {
            C29804fc c29804fc2 = this.f77536Q0;
            if (c29804fc2 == null) {
                AbstractC19074t.m100223u("binding");
                c29804fc2 = null;
            }
            c29804fc2.f137772t.setVisibility(0);
            C29804fc c29804fc3 = this.f77536Q0;
            if (c29804fc3 == null) {
                AbstractC19074t.m100223u("binding");
                c29804fc3 = null;
            }
            c29804fc3.f137771s.setVisibility(8);
            C29804fc c29804fc4 = this.f77536Q0;
            if (c29804fc4 == null) {
                AbstractC19074t.m100223u("binding");
                c29804fc4 = null;
            }
            RobotoTextView robotoTextView = c29804fc4.f137765A;
            robotoTextView.setBackground(AbstractC23136l9.m118665N(robotoTextView.getContext(), AbstractC16803z.bg_tab_selected_security_checkup));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setTextStyleBold(true);
            C29804fc c29804fc5 = this.f77536Q0;
            if (c29804fc5 == null) {
                AbstractC19074t.m100223u("binding");
                c29804fc5 = null;
            }
            RobotoTextView robotoTextView2 = c29804fc5.f137778z;
            robotoTextView2.setBackground(null);
            robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC16781w.TabUnSelectedColor));
            robotoTextView2.setTextStyleBold(false);
            m84212xM();
            if (this.f77544Y0) {
                m84210vM();
                return;
            }
            return;
        }
        C29804fc c29804fc6 = this.f77536Q0;
        if (c29804fc6 == null) {
            AbstractC19074t.m100223u("binding");
            c29804fc6 = null;
        }
        c29804fc6.f137772t.setVisibility(8);
        C29804fc c29804fc7 = this.f77536Q0;
        if (c29804fc7 == null) {
            AbstractC19074t.m100223u("binding");
            c29804fc7 = null;
        }
        c29804fc7.f137771s.setVisibility(0);
        C29804fc c29804fc8 = this.f77536Q0;
        if (c29804fc8 == null) {
            AbstractC19074t.m100223u("binding");
            c29804fc8 = null;
        }
        RobotoTextView robotoTextView3 = c29804fc8.f137765A;
        robotoTextView3.setBackground(null);
        robotoTextView3.setTextColor(C23212s8.m119607o(robotoTextView3.getContext(), AbstractC16781w.TabUnSelectedColor));
        robotoTextView3.setTextStyleBold(false);
        C29804fc c29804fc9 = this.f77536Q0;
        if (c29804fc9 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29804fc = c29804fc9;
        }
        RobotoTextView robotoTextView4 = c29804fc.f137778z;
        robotoTextView4.setBackground(AbstractC23136l9.m118665N(robotoTextView4.getContext(), AbstractC16803z.bg_tab_selected_security_checkup));
        robotoTextView4.setTextColor(C23212s8.m119607o(robotoTextView4.getContext(), AbstractC21196a.TextColor1));
        robotoTextView4.setTextStyleBold(true);
        if (this.f77543X0) {
            m84211wM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_security_checkub);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        m84204IM(2);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m84202uM(new InterfaceC1479a() { // from class: com.zing.zalo.ui.zviews.mi0
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                SettingSecurityView.m84184EM((SecurityCheckupItemView) obj);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m84202uM(new InterfaceC1479a() { // from class: com.zing.zalo.ui.zviews.ri0
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                SettingSecurityView.m84186GM((SecurityCheckupItemView) obj);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m84202uM(new InterfaceC1479a() { // from class: com.zing.zalo.ui.zviews.si0
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                SettingSecurityView.m84187HM((SecurityCheckupItemView) obj);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            m84211wM();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingSecurityView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m84202uM(new InterfaceC1479a() { // from class: com.zing.zalo.ui.zviews.ti0
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                SettingSecurityView.m84185FM((SecurityCheckupItemView) obj);
            }
        });
    }

    /* renamed from: vM */
    public final void m84210vM() {
        this.f77544Y0 = false;
        if (this.f77548c1) {
            return;
        }
        this.f77548c1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15042c());
        c0766k.mo1776x7(2);
    }

    /* renamed from: wM */
    public final void m84211wM() {
        this.f77543X0 = false;
        if (this.f77547b1) {
            return;
        }
        this.f77547b1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15043d());
        c0766k.mo1776x7(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        Integer num;
        AbstractC19074t.m100208f(objArr, "args");
        int i12 = 2;
        if (i11 != 6030) {
            if (i11 == 6032) {
                if (objArr instanceof Integer) {
                    num = (Integer) objArr;
                } else {
                    num = null;
                }
                if (num != null) {
                    i12 = num.intValue();
                }
                m84204IM(i12);
                return;
            }
            return;
        }
        m84204IM(2);
    }

    /* renamed from: xM */
    public final void m84212xM() {
        if (!this.f77546a1) {
            C7098i7 c7098i7 = new C7098i7();
            this.f77537R0 = c7098i7;
            c7098i7.m36182P(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ui0
                public /* synthetic */ ui0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingSecurityView.m84203yM(SettingSecurityView.this, view);
                }
            });
            C29804fc c29804fc = this.f77536Q0;
            C7098i7 c7098i72 = null;
            if (c29804fc == null) {
                AbstractC19074t.m100223u("binding");
                c29804fc = null;
            }
            RecyclerView recyclerView = c29804fc.f137774v;
            NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(getContext());
            noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
            recyclerView.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
            C29804fc c29804fc2 = this.f77536Q0;
            if (c29804fc2 == null) {
                AbstractC19074t.m100223u("binding");
                c29804fc2 = null;
            }
            RecyclerView recyclerView2 = c29804fc2.f137774v;
            C7098i7 c7098i73 = this.f77537R0;
            if (c7098i73 == null) {
                AbstractC19074t.m100223u("mAdapter");
            } else {
                c7098i72 = c7098i73;
            }
            recyclerView2.setAdapter(c7098i72);
            m84210vM();
            this.f77546a1 = true;
        }
    }

    /* renamed from: zM */
    public final void m84213zM() {
        int m127173b0;
        C29804fc c29804fc = this.f77536Q0;
        C29804fc c29804fc2 = null;
        if (c29804fc == null) {
            AbstractC19074t.m100223u("binding");
            c29804fc = null;
        }
        c29804fc.f137778z.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ni0
            public /* synthetic */ ni0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingSecurityView.m84180AM(SettingSecurityView.this, view);
            }
        });
        C29804fc c29804fc3 = this.f77536Q0;
        if (c29804fc3 == null) {
            AbstractC19074t.m100223u("binding");
            c29804fc3 = null;
        }
        c29804fc3.f137765A.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.oi0
            public /* synthetic */ oi0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingSecurityView.m84181BM(SettingSecurityView.this, view);
            }
        });
        m84209NM(false);
        C29804fc c29804fc4 = this.f77536Q0;
        if (c29804fc4 == null) {
            AbstractC19074t.m100223u("binding");
            c29804fc4 = null;
        }
        View errorView = c29804fc4.f137775w.getErrorView();
        if (errorView != null) {
            errorView.findViewById(AbstractC6918a0.btn_refresh).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.pi0
                public /* synthetic */ pi0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingSecurityView.m84182CM(SettingSecurityView.this, view);
                }
            });
            errorView.setVisibility(8);
        }
        C29804fc c29804fc5 = this.f77536Q0;
        if (c29804fc5 == null) {
            AbstractC19074t.m100223u("binding");
            c29804fc5 = null;
        }
        View errorView2 = c29804fc5.f137776x.getErrorView();
        if (errorView2 != null) {
            errorView2.findViewById(AbstractC6918a0.btn_refresh).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.qi0
                public /* synthetic */ qi0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingSecurityView.m84183DM(SettingSecurityView.this, view);
                }
            });
            errorView2.setVisibility(8);
        }
        m84207LM(this.f77540U0);
        m84208MM(this.f77540U0);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more_security_checkup);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m127173b0 = AbstractC24342w.m127173b0(m118743r0, "?", 0, false, 6, null);
        if (m127173b0 > 0) {
            SpannableString spannableString = new SpannableString(m118743r0);
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            if (m92676n2 != null) {
                spannableString.setSpan(new C15040a(this, m92676n2, m118743r0.length(), spannableString.length()), m127173b0 + 2, spannableString.length(), 33);
            }
            C29804fc c29804fc6 = this.f77536Q0;
            if (c29804fc6 == null) {
                AbstractC19074t.m100223u("binding");
                c29804fc6 = null;
            }
            c29804fc6.f137777y.setMovementMethod(CustomMovementMethod.m56305e());
            C29804fc c29804fc7 = this.f77536Q0;
            if (c29804fc7 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29804fc2 = c29804fc7;
            }
            c29804fc2.f137777y.setText(spannableString);
        }
    }
}
