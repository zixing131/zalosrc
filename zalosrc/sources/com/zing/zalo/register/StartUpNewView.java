package com.zing.zalo.register;

import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import am.C0927o;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
import android.widget.FrameLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import ck.C3560a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7050e3;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.PreferencesProvider;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.DeviceRestartView;
import com.zing.zalo.p077ui.zviews.GetPasswordView;
import com.zing.zalo.p077ui.zviews.IOErrorInfoView;
import com.zing.zalo.p077ui.zviews.LoginView;
import com.zing.zalo.p077ui.zviews.UpdateNameView;
import com.zing.zalo.p077ui.zviews.ZVDialogConfirmLockAccount;
import com.zing.zalo.p077ui.zviews.ZVDialogLockAccountSuccess;
import com.zing.zalo.p077ui.zviews.ZVDialogViewLockAccount;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.register.bottomsheet.RegisterLayoutBottomSheet;
import com.zing.zalo.register.enterphonenumber.EnterUserNumberPhoneView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import cz.C17667v0;
import cz.C17670w0;
import fh0.AbstractC18942g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.Arrays;
import ln0.AbstractC22543l;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23178p7;
import me0.C23055e5;
import me0.C23269y3;
import mj0.AbstractC23322a;
import mm0.AbstractC23349d;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.AbstractC23775p0;
import p542ub.InterfaceC27218a;
import p588vw.C28655u;
import p649xl.C29930mc;
import qm0.AbstractC25358n;
import ui0.C27280g;
import wl0.InterfaceC29091d;

/* loaded from: classes.dex */
public final class StartUpNewView extends BaseZaloView implements ZaloView.InterfaceC17426k {
    public static final C9298a Companion = new C9298a(null);

    /* renamed from: M0 */
    public C29930mc f49306M0;

    /* renamed from: N0 */
    private final String[] f49307N0;

    /* renamed from: O0 */
    private final String[] f49308O0;

    /* renamed from: P0 */
    private String f49309P0;

    /* renamed from: Q0 */
    private C3560a f49310Q0;

    /* renamed from: R0 */
    private boolean f49311R0;

    /* renamed from: S0 */
    private boolean f49312S0;

    /* renamed from: T0 */
    private InterfaceC20094a f49313T0;

    /* renamed from: U0 */
    private boolean f49314U0;

    /* renamed from: V0 */
    private boolean f49315V0;

    /* renamed from: W0 */
    private boolean f49316W0;

    /* renamed from: X0 */
    private boolean f49317X0;

    /* renamed from: Y0 */
    private boolean f49318Y0;

    /* renamed from: Z0 */
    private ZVDialogConfirmLockAccount f49319Z0;

    /* renamed from: a1 */
    private boolean f49320a1;

    /* renamed from: com.zing.zalo.register.StartUpNewView$a */
    /* loaded from: classes.dex */
    public static final class C9298a {
        private C9298a() {
        }

        public /* synthetic */ C9298a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.register.StartUpNewView$b */
    /* loaded from: classes.dex */
    public static final class C9299b implements InterfaceC20094a {
        C9299b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            StartUpNewView.this.m49927WM(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                if (!AbstractC23304d.f113382f0.get()) {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        jSONObject = optJSONObject.optJSONObject("features");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        AbstractC23309i.m120834Cn(jSONObject.optInt("enable_username_for_startup_flow", 1));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            StartUpNewView.this.m49927WM(false);
        }
    }

    /* renamed from: com.zing.zalo.register.StartUpNewView$c */
    /* loaded from: classes.dex */
    public static final class C9300c implements InterfaceC20094a {
        C9300c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            StartUpNewView.this.f49312S0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String string;
            String string2;
            String string3;
            boolean z11;
            boolean z12;
            AbstractC19074t.m100208f(obj, "entity");
            StartUpNewView.this.f49312S0 = false;
            JSONObject jSONObject = (JSONObject) obj;
            try {
                if (!jSONObject.isNull("data")) {
                    JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("countries");
                    AbstractC19074t.m100207e(jSONArray, "getJSONArray(...)");
                    if (jSONArray.length() > 0) {
                        C7960e.m41971c6().m42506q4();
                    }
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj2 = jSONArray.get(i11);
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject2 = (JSONObject) obj2;
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
                        C7960e.m41971c6().m42424i9(new C28655u(string3, string, string2, i11, z11, z12));
                    }
                }
                AbstractC23309i.m121885ey(System.currentTimeMillis());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.register.StartUpNewView$d */
    /* loaded from: classes.dex */
    public static final class C9301d implements ViewPager.InterfaceC6875j {
        C9301d() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            int i13 = i11 % 5;
            if (i13 == 3) {
                StartUpNewView.this.m49923FM().f138708y.setTranslationX(-i12);
            } else if (i13 == 4) {
                StartUpNewView.this.m49923FM().f138708y.setTranslationX(AbstractC23136l9.m118722k0() - i12);
            } else {
                StartUpNewView.this.m49923FM().f138708y.setTranslationX(0.0f);
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            int i12 = i11 % 5;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("{screen : %s}", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC20887g.m109248z(510004, format);
            if (i12 == 4) {
                AbstractC23309i.m122372rw(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.register.StartUpNewView$e */
    /* loaded from: classes4.dex */
    public static final class C9302e implements InterfaceC20094a {
        C9302e() {
        }

        /* renamed from: e */
        public static final void m49930e(StartUpNewView startUpNewView) {
            AbstractC19074t.m100208f(startUpNewView, "this$0");
            startUpNewView.m49926VM(false);
            startUpNewView.f49311R0 = true;
            AbstractC23309i.m122248oj("");
            startUpNewView.m49903jN();
        }

        /* renamed from: f */
        public static final void m49931f(StartUpNewView startUpNewView) {
            AbstractC19074t.m100208f(startUpNewView, "this$0");
            startUpNewView.showDialog(1);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            StartUpNewView.this.m49926VM(false);
            StartUpNewView.this.m78954jL();
            StartUpNewView startUpNewView = StartUpNewView.this;
            startUpNewView.mo70710wy(new Runnable() { // from class: cz.v1
                public /* synthetic */ RunnableC17668v1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StartUpNewView.C9302e.m49931f(StartUpNewView.this);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            StartUpNewView.this.m78954jL();
            StartUpNewView startUpNewView = StartUpNewView.this;
            startUpNewView.mo70710wy(new Runnable() { // from class: cz.w1
                public /* synthetic */ RunnableC17671w1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StartUpNewView.C9302e.m49930e(StartUpNewView.this);
                }
            });
        }
    }

    public StartUpNewView() {
        String[] m118755v0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_language);
        AbstractC19074t.m100207e(m118755v0, "getStringArray(...)");
        this.f49307N0 = m118755v0;
        String[] m118755v02 = AbstractC23136l9.m118755v0(AbstractC16775v.array_language_as_code);
        AbstractC19074t.m100207e(m118755v02, "getStringArray(...)");
        this.f49308O0 = m118755v02;
        this.f49309P0 = "";
        this.f49313T0 = new C9300c();
    }

    /* renamed from: BM */
    private final void m49867BM() {
        AbstractC23775p0.m124198c("default", "3");
    }

    /* renamed from: CM */
    private final void m49868CM(String str) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC23647d.m123906p("19700");
            C23269y3.m120035a(str);
            AbstractC23647d.m123893c();
            BaseZaloActivity baseZaloActivity = (BaseZaloActivity) m92648SI();
            AbstractC19074t.m100205c(baseZaloActivity);
            baseZaloActivity.recreate();
        }
    }

    /* renamed from: DM */
    private final void m49869DM() {
        C17487o0 m92662fJ;
        try {
            int m3331P4 = AbstractC0924m0.m3331P4();
            if (m3331P4 > 0) {
                String m4066o0 = AbstractC0924m0.m4066o0();
                AbstractC19074t.m100205c(m4066o0);
                if (m4066o0.length() > 0) {
                    JSONObject jSONObject = new JSONObject(m4066o0);
                    if (m3331P4 != 1 && m3331P4 != 2) {
                        int i11 = 3;
                        if (m3331P4 != 3) {
                            if (m3331P4 == 4 || m3331P4 == 5) {
                                if (System.currentTimeMillis() < jSONObject.optLong("timeout_token_name")) {
                                    C17487o0 m92662fJ2 = m92662fJ();
                                    if (m92662fJ2 != null) {
                                        m92662fJ2.m93069k2(ResumeRegisterView.class, null, 1, true);
                                    }
                                } else if (System.currentTimeMillis() < jSONObject.optLong("timeout_token_otp")) {
                                    if (jSONObject.optInt("exist_account") == 1) {
                                        i11 = 1;
                                    }
                                    AbstractC0924m0.m2972Cm(i11);
                                    C17487o0 m92662fJ3 = m92662fJ();
                                    if (m92662fJ3 != null) {
                                        m92662fJ3.m93069k2(ResumeRegisterView.class, null, 1, true);
                                    }
                                }
                            }
                        }
                    }
                    if (System.currentTimeMillis() < jSONObject.optLong("timeout_token_otp") && (m92662fJ = m92662fJ()) != null) {
                        m92662fJ.m93069k2(ResumeRegisterView.class, null, 1, true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: EM */
    private final void m49870EM() {
        String str;
        try {
            if (this.f49315V0) {
                return;
            }
            String str2 = "0";
            try {
                str = AbstractC23309i.m121037I4();
                try {
                    int m122766d = AbstractC23349d.m122766d();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m122766d);
                    str2 = sb2.toString();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C9299b());
                    AbstractC23309i.m122663zr(System.currentTimeMillis());
                    this.f49315V0 = true;
                    c0766k.mo1538T4(str2, str, "", "");
                }
            } catch (Exception e12) {
                e = e12;
                str = "";
            }
            C0766k c0766k2 = new C0766k();
            c0766k2.mo1704o8(new C9299b());
            AbstractC23309i.m122663zr(System.currentTimeMillis());
            this.f49315V0 = true;
            c0766k2.mo1538T4(str2, str, "", "");
        } catch (Exception e13) {
            e13.printStackTrace();
            this.f49315V0 = false;
        }
    }

    /* renamed from: GM */
    private final String m49871GM(boolean z11) {
        String str = AbstractC18458a.f93019a;
        int i11 = 0;
        if (!(!TextUtils.isEmpty(str))) {
            String str2 = this.f49307N0[0];
            AbstractC19074t.m100207e(str2, "get(...)");
            return str2;
        }
        String str3 = this.f49307N0[0];
        String[] strArr = this.f49308O0;
        String str4 = strArr[0];
        int length = strArr.length;
        while (true) {
            if (i11 < length) {
                if (AbstractC19074t.m100204b(str, this.f49308O0[i11])) {
                    str3 = this.f49307N0[i11];
                    break;
                }
                i11++;
            } else {
                str = str4;
                break;
            }
        }
        if (z11) {
            AbstractC19074t.m100205c(str3);
            return str3;
        }
        AbstractC19074t.m100205c(str);
        return str;
    }

    /* renamed from: HM */
    static /* synthetic */ String m49872HM(StartUpNewView startUpNewView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return startUpNewView.m49871GM(z11);
    }

    /* renamed from: JM */
    private final void m49873JM() {
        int i11;
        View view = m49923FM().f138706w;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC19074t.m100207e(layoutParams, "getLayoutParams(...)");
        layoutParams.height = AbstractC17484n.Companion.m92931b();
        view.setLayoutParams(layoutParams);
        m49923FM().f138703t.setOnClickListener(new View.OnClickListener() { // from class: cz.k1
            public /* synthetic */ ViewOnClickListenerC17628k1() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StartUpNewView.m49878OM(StartUpNewView.this, view2);
            }
        });
        m49923FM().f138697C.setText(m49872HM(this, false, 1, null));
        ZAppCompatImageView zAppCompatImageView = m49923FM().f138707x;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC23322a.zds_ic_chevron_down_line_16, AbstractC2807a.icon_01));
        ViewPager viewPager = m49923FM().f138698D;
        C7050e3 c7050e3 = new C7050e3();
        c7050e3.m36029y(new View.OnClickListener() { // from class: cz.n1

            /* renamed from: q */
            public final /* synthetic */ C7050e3 f89628q;

            public /* synthetic */ ViewOnClickListenerC17640n1(C7050e3 c7050e32) {
                r2 = c7050e32;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StartUpNewView.m49874KM(ViewPager.this, r2, view2);
            }
        });
        viewPager.setAdapter(c7050e32);
        if (AbstractC23309i.m121123Kg()) {
            i11 = 499;
        } else {
            i11 = 0;
        }
        viewPager.setCurrentItem(i11);
        viewPager.addOnPageChangeListener(new C9301d());
        SlidingTabLayout slidingTabLayout = m49923FM().f138696B;
        slidingTabLayout.f69624v = 5;
        slidingTabLayout.setViewPager(m49923FM().f138698D);
        slidingTabLayout.setSelectedIndicatorColors(-16741121);
        slidingTabLayout.setEnableDivider(true);
        slidingTabLayout.setDividerColors(0);
        slidingTabLayout.setOnTouchListener(new View.OnTouchListener() { // from class: cz.o1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m49875LM;
                m49875LM = StartUpNewView.m49875LM(view2, motionEvent);
                return m49875LM;
            }
        });
        m49923FM().f138701r.setOnClickListener(new View.OnClickListener() { // from class: cz.p1
            public /* synthetic */ ViewOnClickListenerC17648p1() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StartUpNewView.m49876MM(StartUpNewView.this, view2);
            }
        });
        m49923FM().f138702s.setOnClickListener(new View.OnClickListener() { // from class: cz.q1
            public /* synthetic */ ViewOnClickListenerC17652q1() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StartUpNewView.m49877NM(StartUpNewView.this, view2);
            }
        });
    }

    /* renamed from: KM */
    public static final void m49874KM(ViewPager viewPager, C7050e3 c7050e3, View view) {
        int m116584g;
        AbstractC19074t.m100208f(viewPager, "$this_apply");
        AbstractC19074t.m100208f(c7050e3, "$introLoginAdapter");
        m116584g = AbstractC22543l.m116584g(viewPager.getCurrentItem() + 1, c7050e3.mo35335g() - 1);
        viewPager.setCurrentItem(m116584g, true);
    }

    /* renamed from: LM */
    public static final boolean m49875LM(View view, MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: MM */
    public static final void m49876MM(StartUpNewView startUpNewView, View view) {
        int m131368P;
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        AbstractC20887g.m109217D(510002, null, 2, null);
        AbstractC23304d.f113382f0.set(true);
        Bundle bundle = new Bundle();
        bundle.putBoolean("BOL_EXTRA_FROM_STARTUP", true);
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        C17487o0 m92662fJ = startUpNewView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(LoginView.class, bundle, 1, true);
        }
        try {
            int currentItem = (startUpNewView.m49923FM().f138698D.getCurrentItem() % 5) + 1;
            C19067n0 c19067n0 = C19067n0.f94947a;
            m131368P = AbstractC25358n.m131368P(startUpNewView.f49308O0, startUpNewView.m49871GM(false));
            String format = String.format("38500%d%d", Arrays.copyOf(new Object[]{Integer.valueOf(currentItem), Integer.valueOf(m131368P + 1)}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC23647d.m123897g(format);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: NM */
    public static final void m49877NM(StartUpNewView startUpNewView, View view) {
        int m131368P;
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        if (C17670w0.f89662a.m93652d() == 1) {
            AbstractC20887g.m109217D(510001, null, 2, null);
            C17487o0 m92662fJ = startUpNewView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(EnterUserNumberPhoneView.class, null, 1, true);
            }
        } else {
            AbstractC23304d.f113382f0.set(true);
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 16777216);
            C17487o0 m92662fJ2 = startUpNewView.m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(UpdateNameView.class, bundle, 1, true);
            }
        }
        try {
            int currentItem = (startUpNewView.m49923FM().f138698D.getCurrentItem() % 5) + 1;
            C19067n0 c19067n0 = C19067n0.f94947a;
            m131368P = AbstractC25358n.m131368P(startUpNewView.f49308O0, startUpNewView.m49871GM(false));
            String format = String.format("38501%d%d", Arrays.copyOf(new Object[]{Integer.valueOf(currentItem), Integer.valueOf(m131368P + 1)}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC23647d.m123897g(format);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: OM */
    public static final void m49878OM(StartUpNewView startUpNewView, View view) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        startUpNewView.m49883TM();
    }

    /* renamed from: PM */
    public static final void m49879PM(StartUpNewView startUpNewView) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        try {
            if (!C7960e.m41971c6().m42583x9() && System.currentTimeMillis() - AbstractC23309i.m121119Kc() <= 86400000) {
                return;
            }
            startUpNewView.m49924IM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: QM */
    public static final void m49880QM(StartUpNewView startUpNewView, String str) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        AbstractC19074t.m100208f(str, "$currentLanguage");
        startUpNewView.m49868CM(str);
    }

    /* renamed from: RM */
    public static final void m49881RM(StartUpNewView startUpNewView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        startUpNewView.m49889cN(true);
    }

    /* renamed from: SM */
    public static final void m49882SM(StartUpNewView startUpNewView) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        try {
            C17667v0.f89659a.m93647d(startUpNewView.m92676n2());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: TM */
    private final void m49883TM() {
        this.f49309P0 = m49871GM(false);
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TAG", 5);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35581q(RegisterLayoutBottomSheet.class, bundle, 5, 1, true);
        }
    }

    /* renamed from: XM */
    private final void m49884XM() {
        boolean m127149O;
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.setClassName(m92689tK(), "com.zing.zalo.ui.SplashActivity");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.addFlags(268435456);
            intent.addFlags(2097152);
            if (Build.VERSION.SDK_INT < 26) {
                Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                intent2.putExtra("duplicate", false);
                intent2.putExtra("android.intent.extra.shortcut.NAME", AbstractC23136l9.m118743r0(AbstractC8020f0.app_name));
                intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(m92648SI(), AbstractC16803z.icon));
                Context m92648SI = m92648SI();
                if (m92648SI != null) {
                    m92648SI.sendBroadcast(intent2);
                }
            } else if (AbstractC18942g.m99253i() && AbstractC18942g.m99250f() != null) {
                String m99250f = AbstractC18942g.m99250f();
                AbstractC19074t.m100207e(m99250f, "getPreloadedValue(...)");
                m127149O = AbstractC24342w.m127149O(m99250f, "SAMSUNG", false, 2, null);
                if (m127149O) {
                    AbstractC23178p7.m119404c(m92689tK(), AbstractC23178p7.m119408g(getContext(), "zalo-launcher-shortcut", AbstractC16803z.icon, AbstractC23136l9.m118743r0(AbstractC8020f0.app_name), intent));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: YM */
    private final void m49885YM() {
        ZaloView zaloView;
        int i11;
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            zaloView = m92662fJ.m92996E0("TAG_CONFIRM_LOCK_ACCOUNT_Z_V_DIALOG");
        } else {
            zaloView = null;
        }
        ZVDialogConfirmLockAccount zVDialogConfirmLockAccount = (ZVDialogConfirmLockAccount) zaloView;
        this.f49319Z0 = zVDialogConfirmLockAccount;
        if (zVDialogConfirmLockAccount != null) {
            zVDialogConfirmLockAccount.dismiss();
        }
        ZVDialogConfirmLockAccount.C15378a c15378a = new ZVDialogConfirmLockAccount.C15378a();
        ZVDialogConfirmLockAccount.C15378a c15378a2 = (ZVDialogConfirmLockAccount.C15378a) c15378a.mo77087g(new InterfaceC29091d.a() { // from class: cz.j1
            public /* synthetic */ C17624j1() {
            }

            @Override // wl0.InterfaceC29091d.a
            /* renamed from: a */
            public final void mo87277a(InterfaceC29091d interfaceC29091d) {
                StartUpNewView.m49886ZM(StartUpNewView.this, interfaceC29091d);
            }
        });
        C3560a c3560a = this.f49310Q0;
        if (c3560a != null) {
            AbstractC19074t.m100205c(c3560a);
            i11 = c3560a.f15078l;
        } else {
            i11 = 1;
        }
        c15378a2.m86909v(i11).m86908u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_confirm_lock_account), new InterfaceC29091d.b() { // from class: cz.l1
            public /* synthetic */ C17632l1() {
            }

            @Override // wl0.InterfaceC29091d.b
            /* renamed from: a */
            public final void mo87262a(InterfaceC29091d interfaceC29091d, int i12) {
                StartUpNewView.m49887aN(StartUpNewView.this, interfaceC29091d, i12);
            }
        }).m86907t(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC29091d.b() { // from class: cz.m1
            public /* synthetic */ C17636m1() {
            }

            @Override // wl0.InterfaceC29091d.b
            /* renamed from: a */
            public final void mo87262a(InterfaceC29091d interfaceC29091d, int i12) {
                StartUpNewView.m49888bN(StartUpNewView.this, interfaceC29091d, i12);
            }
        });
        ZVDialogConfirmLockAccount m86906s = c15378a.m86906s();
        this.f49319Z0 = m86906s;
        this.f49317X0 = true;
        if (m86906s != null) {
            m86906s.m92622OK(m92662fJ(), "TAG_CONFIRM_LOCK_ACCOUNT_Z_V_DIALOG");
        }
    }

    /* renamed from: ZM */
    public static final void m49886ZM(StartUpNewView startUpNewView, InterfaceC29091d interfaceC29091d) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        startUpNewView.f49317X0 = false;
        startUpNewView.m49889cN(true);
    }

    /* renamed from: aN */
    public static final void m49887aN(StartUpNewView startUpNewView, InterfaceC29091d interfaceC29091d, int i11) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        try {
            C3560a c3560a = startUpNewView.f49310Q0;
            if (c3560a != null) {
                int i12 = c3560a.f15071e;
                if (i12 == 1) {
                    if (C23055e5.m118272g(true)) {
                        startUpNewView.m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
                        C0766k c0766k = new C0766k();
                        c0766k.mo1704o8(new C9302e());
                        startUpNewView.f49318Y0 = true;
                        ZVDialogConfirmLockAccount zVDialogConfirmLockAccount = startUpNewView.f49319Z0;
                        AbstractC19074t.m100205c(zVDialogConfirmLockAccount);
                        boolean m86900SK = zVDialogConfirmLockAccount.m86900SK();
                        startUpNewView.f49316W0 = m86900SK;
                        c0766k.mo1608bb(c3560a.f15075i, c3560a.f15076j, c3560a.f15070d, m86900SK);
                    } else {
                        startUpNewView.m49889cN(true);
                    }
                } else if (i12 == 2) {
                    Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + c3560a.f15072f));
                    intent.putExtra("sms_body", c3560a.f15073g);
                    startUpNewView.startActivityForResult(intent, 4534);
                }
            }
            startUpNewView.f49317X0 = false;
            if (interfaceC29091d != null) {
                interfaceC29091d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bN */
    public static final void m49888bN(StartUpNewView startUpNewView, InterfaceC29091d interfaceC29091d, int i11) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        try {
            startUpNewView.f49317X0 = false;
            startUpNewView.m49889cN(true);
            if (interfaceC29091d != null) {
                interfaceC29091d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d A[Catch: Exception -> 0x0013, TRY_LEAVE, TryCatch #0 {Exception -> 0x0013, blocks: (B:6:0x0005, B:9:0x000e, B:10:0x0017, B:13:0x001d, B:14:0x0020, B:20:0x002b, B:22:0x002f, B:26:0x0040, B:29:0x0059, B:31:0x005f, B:32:0x0072, B:34:0x0080, B:36:0x0084, B:38:0x008c, B:39:0x008e, B:42:0x0099, B:45:0x00a2, B:46:0x0117, B:48:0x011d, B:51:0x00cb, B:52:0x006a), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: cN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m49889cN(boolean z11) {
        ZaloView zaloView;
        Spanned fromHtml;
        ZVDialogViewLockAccount m86936w;
        if (this.f49310Q0 == null) {
            return;
        }
        try {
            C17487o0 m92662fJ = m92662fJ();
            ZVDialogViewLockAccount zVDialogViewLockAccount = null;
            if (m92662fJ != null) {
                zaloView = m92662fJ.m92996E0("TAG_LOCK_ACCOUNT_Z_V_DIALOG");
            } else {
                zaloView = null;
            }
            ZVDialogViewLockAccount zVDialogViewLockAccount2 = (ZVDialogViewLockAccount) zaloView;
            if (zVDialogViewLockAccount2 != null) {
                if (z11) {
                    zVDialogViewLockAccount2.dismiss();
                }
                if (!zVDialogViewLockAccount2.m92621MK() && !z11) {
                    zVDialogViewLockAccount = zVDialogViewLockAccount2;
                }
                zVDialogViewLockAccount2 = zVDialogViewLockAccount;
            }
            C3560a c3560a = this.f49310Q0;
            if (c3560a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = c3560a.f15077k;
                if (currentTimeMillis > j11 && j11 > 0) {
                    m49867BM();
                    this.f49311R0 = true;
                    AbstractC23309i.m122248oj("");
                    this.f72827B0.postDelayed(new Runnable() { // from class: cz.u1
                        public /* synthetic */ RunnableC17665u1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            StartUpNewView.m49891dN(StartUpNewView.this);
                        }
                    }, 1000L);
                    return;
                }
                if (zVDialogViewLockAccount2 == null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        fromHtml = Html.fromHtml(c3560a.m18087a(), 63);
                    } else {
                        fromHtml = Html.fromHtml(c3560a.m18087a());
                    }
                    SpannableString spannableString = new SpannableString(fromHtml);
                    Linkify.addLinks(spannableString, 6);
                    if (c3560a.f15071e == 2 && (c3560a.f15072f == 0 || TextUtils.isEmpty(c3560a.f15073g))) {
                        c3560a.f15071e = 1;
                    }
                    ZVDialogViewLockAccount.C15381b c15381b = new ZVDialogViewLockAccount.C15381b();
                    int i11 = c3560a.f15071e;
                    if (i11 != 2 && (i11 != 1 || TextUtils.isEmpty(c3560a.f15070d))) {
                        c15381b.m86931A(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_lock_account)).m86938z(spannableString).m86937y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC29091d.b() { // from class: cz.d1
                            public /* synthetic */ C17600d1() {
                            }

                            @Override // wl0.InterfaceC29091d.b
                            /* renamed from: a */
                            public final void mo87262a(InterfaceC29091d interfaceC29091d, int i12) {
                                StartUpNewView.m49899hN(StartUpNewView.this, interfaceC29091d, i12);
                            }
                        }).mo77087g(new InterfaceC29091d.a() { // from class: cz.e1
                            public /* synthetic */ C17604e1() {
                            }

                            @Override // wl0.InterfaceC29091d.a
                            /* renamed from: a */
                            public final void mo87277a(InterfaceC29091d interfaceC29091d) {
                                StartUpNewView.m49901iN(StartUpNewView.this, interfaceC29091d);
                            }
                        });
                        m49867BM();
                        m86936w = c15381b.m86936w();
                        if (m86936w == null) {
                            m86936w.m92622OK(m92662fJ(), "TAG_LOCK_ACCOUNT_Z_V_DIALOG");
                            return;
                        }
                        return;
                    }
                    ((ZVDialogViewLockAccount.C15381b) ((ZVDialogViewLockAccount.C15381b) c15381b.m86931A(c3560a.m18088b()).m86938z(spannableString).mo77085e(false)).mo77086f(false)).m86935E(c3560a.f15074h).m86934D(c3560a.f15077k).m86933C(new ZVDialogViewLockAccount.InterfaceC15382c() { // from class: cz.a1

                        /* renamed from: b */
                        public final /* synthetic */ C3560a f89567b;

                        public /* synthetic */ C17588a1(C3560a c3560a2) {
                            r2 = c3560a2;
                        }

                        @Override // com.zing.zalo.p077ui.zviews.ZVDialogViewLockAccount.InterfaceC15382c
                        /* renamed from: a */
                        public final void mo86939a() {
                            StartUpNewView.m49893eN(StartUpNewView.this, r2);
                        }
                    }).m86932B(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_lock_account), new InterfaceC29091d.b() { // from class: cz.b1
                        public /* synthetic */ C17592b1() {
                        }

                        @Override // wl0.InterfaceC29091d.b
                        /* renamed from: a */
                        public final void mo87262a(InterfaceC29091d interfaceC29091d, int i12) {
                            StartUpNewView.m49895fN(StartUpNewView.this, interfaceC29091d, i12);
                        }
                    }).m86937y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC29091d.b() { // from class: cz.c1
                        public /* synthetic */ C17596c1() {
                        }

                        @Override // wl0.InterfaceC29091d.b
                        /* renamed from: a */
                        public final void mo87262a(InterfaceC29091d interfaceC29091d, int i12) {
                            StartUpNewView.m49897gN(StartUpNewView.this, interfaceC29091d, i12);
                        }
                    });
                    m86936w = c15381b.m86936w();
                    if (m86936w == null) {
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: dN */
    public static final void m49891dN(StartUpNewView startUpNewView) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        startUpNewView.m49867BM();
    }

    /* renamed from: eN */
    public static final void m49893eN(StartUpNewView startUpNewView, C3560a c3560a) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        AbstractC19074t.m100208f(c3560a, "$it");
        if (!startUpNewView.f49314U0) {
            c3560a.f15074h = 0;
            AbstractC23309i.m122248oj(c3560a.m18092f().toString());
        }
    }

    /* renamed from: fN */
    public static final void m49895fN(StartUpNewView startUpNewView, InterfaceC29091d interfaceC29091d, int i11) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        try {
            startUpNewView.m49885YM();
            if (interfaceC29091d != null) {
                interfaceC29091d.dismiss();
            }
            AbstractC23775p0.m124198c("default", "3");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gN */
    public static final void m49897gN(StartUpNewView startUpNewView, InterfaceC29091d interfaceC29091d, int i11) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        if (interfaceC29091d != null) {
            try {
                interfaceC29091d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        startUpNewView.f49311R0 = true;
        AbstractC23309i.m122248oj("");
        startUpNewView.m49867BM();
    }

    /* renamed from: hN */
    public static final void m49899hN(StartUpNewView startUpNewView, InterfaceC29091d interfaceC29091d, int i11) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        try {
            startUpNewView.f49311R0 = true;
            AbstractC23309i.m122248oj("");
            if (interfaceC29091d != null) {
                interfaceC29091d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iN */
    public static final void m49901iN(StartUpNewView startUpNewView, InterfaceC29091d interfaceC29091d) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        try {
            startUpNewView.f49311R0 = true;
            AbstractC23309i.m122248oj("");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jN */
    public final void m49903jN() {
        ZaloView zaloView;
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            zaloView = m92662fJ.m92996E0("TAG_LOCK_ACCOUNT_SUCCESS_Z_V_DIALOG");
        } else {
            zaloView = null;
        }
        ZVDialogLockAccountSuccess zVDialogLockAccountSuccess = (ZVDialogLockAccountSuccess) zaloView;
        if (zVDialogLockAccountSuccess != null) {
            zVDialogLockAccountSuccess.dismiss();
        }
        ZVDialogLockAccountSuccess.C15379a c15379a = new ZVDialogLockAccountSuccess.C15379a();
        c15379a.m86915s(this.f49316W0);
        if (this.f49316W0) {
            c15379a.m86914r(AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_get_password), new InterfaceC29091d.b() { // from class: cz.g1
                public /* synthetic */ C17612g1() {
                }

                @Override // wl0.InterfaceC29091d.b
                /* renamed from: a */
                public final void mo87262a(InterfaceC29091d interfaceC29091d, int i11) {
                    StartUpNewView.m49905kN(StartUpNewView.this, interfaceC29091d, i11);
                }
            });
        } else {
            c15379a.m86914r(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC29091d.b() { // from class: cz.h1
                public /* synthetic */ C17616h1() {
                }

                @Override // wl0.InterfaceC29091d.b
                /* renamed from: a */
                public final void mo87262a(InterfaceC29091d interfaceC29091d, int i11) {
                    StartUpNewView.m49907lN(StartUpNewView.this, interfaceC29091d, i11);
                }
            });
        }
        c15379a.mo77087g(new InterfaceC29091d.a() { // from class: cz.i1
            public /* synthetic */ C17620i1() {
            }

            @Override // wl0.InterfaceC29091d.a
            /* renamed from: a */
            public final void mo87277a(InterfaceC29091d interfaceC29091d) {
                StartUpNewView.m49909mN(StartUpNewView.this, interfaceC29091d);
            }
        });
        ZVDialogLockAccountSuccess m86913q = c15379a.m86913q();
        this.f49320a1 = true;
        m86913q.m92622OK(m92662fJ(), "TAG_LOCK_ACCOUNT_SUCCESS_Z_V_DIALOG");
    }

    /* renamed from: kN */
    public static final void m49905kN(StartUpNewView startUpNewView, InterfaceC29091d interfaceC29091d, int i11) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        try {
            startUpNewView.f49320a1 = false;
            if (interfaceC29091d != null) {
                interfaceC29091d.dismiss();
            }
            Bundle bundle = new Bundle();
            String m120742A5 = AbstractC23309i.m120742A5();
            if (!TextUtils.isEmpty(m120742A5)) {
                bundle.putString("extra_account", m120742A5);
            }
            bundle.putInt("EXTRA_FROM_SWITCH_ACCOUNT", 0);
            C17487o0 m92662fJ = startUpNewView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(GetPasswordView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lN */
    public static final void m49907lN(StartUpNewView startUpNewView, InterfaceC29091d interfaceC29091d, int i11) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        startUpNewView.f49320a1 = false;
        if (interfaceC29091d != null) {
            interfaceC29091d.dismiss();
        }
    }

    /* renamed from: mN */
    public static final void m49909mN(StartUpNewView startUpNewView, InterfaceC29091d interfaceC29091d) {
        AbstractC19074t.m100208f(startUpNewView, "this$0");
        startUpNewView.f49320a1 = false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C13778s1.m76971l(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C16972e0.a aVar = new C16972e0.a(m92689tK);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            C16972e0.a m90918B = aVar.m90918B(m118743r0);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_lock_account_error);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            C16972e0.a m90949z = m90918B.m90949z(m118743r02);
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_close);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            return m90949z.m90934k(m118743r03, new InterfaceC17463d.d() { // from class: cz.f1
                public /* synthetic */ C17608f1() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    StartUpNewView.m49881RM(StartUpNewView.this, interfaceC17463d, i12);
                }
            }).m90927d();
        }
        return null;
    }

    /* renamed from: FM */
    public final C29930mc m49923FM() {
        C29930mc c29930mc = this.f49306M0;
        if (c29930mc != null) {
            return c29930mc;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29930mc m148257c = C29930mc.m148257c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148257c, "inflate(...)");
        m49925UM(m148257c);
        m49873JM();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.getBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", false) || System.currentTimeMillis() - AbstractC23309i.m121744b7() > 3600000) {
                m49870EM();
            }
            if (m92642L3.getBoolean("EXTRA_IGNORE_RESUME_REGISTER", false)) {
                m49869DM();
            }
        }
        FrameLayout root = m49923FM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: IM */
    public final void m49924IM() {
        if (this.f49312S0) {
            return;
        }
        this.f49312S0 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(this.f49313T0);
        c0766k.mo1482M4(AbstractC23309i.m121704a5(), true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putBoolean("isCloseDialog", this.f49311R0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        try {
            this.f49314U0 = false;
            if (!this.f49320a1 && !this.f49317X0 && !this.f49318Y0 && !this.f49311R0 && this.f49310Q0 != null) {
                m49889cN(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: UM */
    public final void m49925UM(C29930mc c29930mc) {
        AbstractC19074t.m100208f(c29930mc, "<set-?>");
        this.f49306M0 = c29930mc;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
    }

    /* renamed from: VM */
    public final void m49926VM(boolean z11) {
        this.f49318Y0 = z11;
    }

    /* renamed from: WM */
    public final void m49927WM(boolean z11) {
        this.f49315V0 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        C17487o0 m92662fJ;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (CoreUtility.getAppContext() == null && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.m93069k2(DeviceRestartView.class, null, 2, true);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "StartUpNewView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str;
        if (i11 == 4534) {
            m49889cN(true);
            return;
        }
        if (i11 == 5 && i12 == -1 && intent != null) {
            String m49871GM = m49871GM(false);
            if (this.f49309P0.length() > 0 && !AbstractC19074t.m100204b(this.f49309P0, m49871GM)) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                Object[] objArr = new Object[1];
                if (AbstractC19074t.m100204b(m49871GM, this.f49308O0[0])) {
                    str = "0";
                } else {
                    str = "1";
                }
                objArr[0] = str;
                String format = String.format("{language : %s}", Arrays.copyOf(objArr, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                AbstractC20887g.m109248z(510003, format);
                AbstractC19444a.m101694b(new Runnable() { // from class: cz.t1

                    /* renamed from: q */
                    public final /* synthetic */ String f89652q;

                    public /* synthetic */ RunnableC17662t1(String m49871GM2) {
                        r2 = m49871GM2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StartUpNewView.m49880QM(StartUpNewView.this, r2);
                    }
                }, 250L);
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23059e9.m118334m(m92676n2());
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f72827B0.postDelayed(new Runnable() { // from class: cz.s1
            public /* synthetic */ RunnableC17659s1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                StartUpNewView.m49882SM(StartUpNewView.this);
            }
        }, 200L);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        ZaloView zaloView;
        ZaloView zaloView2;
        JSONObject jSONObject;
        super.mo37135xJ(bundle);
        try {
            if (AbstractC23309i.m121514V0()) {
                AbstractC23309i.m121908fj(false);
                m49884XM();
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: cz.r1
                public /* synthetic */ RunnableC17656r1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StartUpNewView.m49879PM(StartUpNewView.this);
                }
            });
            if (bundle == null && PreferencesProvider.f43165t) {
                IOErrorInfoView.m80767fM(this.f72421L0.m92662fJ());
            }
            if (bundle != null) {
                this.f49311R0 = bundle.getBoolean("isCloseDialog", false);
            }
            ZaloView zaloView3 = null;
            this.f49310Q0 = null;
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("EXTRA_KICK_OUT_DATA") && !this.f49311R0) {
                String string = m92642L3.getString("EXTRA_KICK_OUT_DATA");
                if (string != null) {
                    jSONObject = new JSONObject(string);
                } else {
                    jSONObject = null;
                }
                C3560a c3560a = new C3560a(jSONObject);
                this.f49310Q0 = c3560a;
                AbstractC19074t.m100205c(c3560a);
                if (c3560a.f15071e > 0) {
                    AbstractC23309i.m122248oj(String.valueOf(jSONObject));
                }
            }
            if (this.f49310Q0 == null) {
                try {
                    String m121851e1 = AbstractC23309i.m121851e1();
                    if (!TextUtils.isEmpty(m121851e1)) {
                        this.f49310Q0 = new C3560a(new JSONObject(m121851e1));
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                zaloView = m92662fJ.m92996E0("TAG_LOCK_ACCOUNT_SUCCESS_Z_V_DIALOG");
            } else {
                zaloView = null;
            }
            ZVDialogLockAccountSuccess zVDialogLockAccountSuccess = (ZVDialogLockAccountSuccess) zaloView;
            if (zVDialogLockAccountSuccess != null) {
                this.f49320a1 = true;
                this.f49316W0 = zVDialogLockAccountSuccess.f79527I0;
                m49903jN();
            }
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                zaloView2 = m92662fJ2.m92996E0("TAG_CONFIRM_LOCK_ACCOUNT_Z_V_DIALOG");
            } else {
                zaloView2 = null;
            }
            if (((ZVDialogConfirmLockAccount) zaloView2) != null) {
                this.f49317X0 = true;
                m49885YM();
            }
            C17487o0 m92662fJ3 = m92662fJ();
            if (m92662fJ3 != null) {
                zaloView3 = m92662fJ3.m92996E0("TAG_LOCK_ACCOUNT_Z_V_DIALOG");
            }
            ZVDialogViewLockAccount zVDialogViewLockAccount = (ZVDialogViewLockAccount) zaloView3;
            if (zVDialogViewLockAccount != null) {
                zVDialogViewLockAccount.dismiss();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }
}
