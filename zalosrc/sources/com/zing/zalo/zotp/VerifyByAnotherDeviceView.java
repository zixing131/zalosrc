package com.zing.zalo.zotp;

import ae.C0766k;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zotp.VerifyByAnotherDeviceView;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.Locale;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23216t1;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p649xl.C29824ge;
import pm0.C24848g0;
import ui0.C27280g;

/* loaded from: classes7.dex */
public final class VerifyByAnotherDeviceView extends SlidableZaloView {
    public static final C17393a Companion = new C17393a(null);

    /* renamed from: a1 */
    public static boolean f88639a1;

    /* renamed from: P0 */
    private C29824ge f88640P0;

    /* renamed from: U0 */
    private int f88645U0;

    /* renamed from: V0 */
    private int f88646V0;

    /* renamed from: W0 */
    private int f88647W0;

    /* renamed from: X0 */
    private int f88648X0;

    /* renamed from: Y0 */
    private boolean f88649Y0;

    /* renamed from: Q0 */
    private JSONObject f88641Q0 = new JSONObject();

    /* renamed from: R0 */
    private String f88642R0 = "";

    /* renamed from: S0 */
    private String f88643S0 = "";

    /* renamed from: T0 */
    private String f88644T0 = "";

    /* renamed from: Z0 */
    private final Object f88650Z0 = new Object();

    /* renamed from: com.zing.zalo.zotp.VerifyByAnotherDeviceView$a */
    /* loaded from: classes7.dex */
    public static final class C17393a {
        private C17393a() {
        }

        public /* synthetic */ C17393a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.zotp.VerifyByAnotherDeviceView$b */
    /* loaded from: classes7.dex */
    public static final class C17394b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ boolean f88652b;

        C17394b(boolean z11) {
            this.f88652b = z11;
        }

        /* renamed from: e */
        public static final void m92573e(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* renamed from: f */
        public static final void m92574f(VerifyByAnotherDeviceView verifyByAnotherDeviceView) {
            AbstractC19074t.m100208f(verifyByAnotherDeviceView, "this$0");
            verifyByAnotherDeviceView.showDialog(2);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            Object m92569rM = VerifyByAnotherDeviceView.this.m92569rM();
            VerifyByAnotherDeviceView verifyByAnotherDeviceView = VerifyByAnotherDeviceView.this;
            synchronized (m92569rM) {
                verifyByAnotherDeviceView.m92570yM(false);
                verifyByAnotherDeviceView.mo49315c4();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            if (AbstractC23216t1.m119643h(VerifyByAnotherDeviceView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: rl0.f
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    VerifyByAnotherDeviceView.C17394b.m92573e(str);
                }
            })) {
                return;
            }
            try {
                int m104491c = c20096c.m104491c();
                if (m104491c != 2003) {
                    if (m104491c != 2012 && m104491c != 2021) {
                        ToastUtils.showMess(c20096c.m104492d());
                    } else {
                        AbstractC23153n4.m119159x(VerifyByAnotherDeviceView.this.m92676n2(), new JSONObject(c20096c.m104490b()).optJSONObject("data"), false, 1, false, VerifyByAnotherDeviceView.this.f88642R0, VerifyByAnotherDeviceView.this.f88643S0, null, VerifyByAnotherDeviceView.this.f88647W0, VerifyByAnotherDeviceView.this.f88648X0);
                    }
                } else {
                    VerifyByAnotherDeviceView verifyByAnotherDeviceView2 = VerifyByAnotherDeviceView.this;
                    verifyByAnotherDeviceView2.mo70710wy(new Runnable() { // from class: rl0.g
                        public /* synthetic */ RunnableC25833g() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            VerifyByAnotherDeviceView.C17394b.m92574f(VerifyByAnotherDeviceView.this);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Object m92569rM;
            VerifyByAnotherDeviceView verifyByAnotherDeviceView;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        optJSONObject.put("EXTRA_USER_HAVING_DEVICE", this.f88652b);
                    }
                    if (optJSONObject != null) {
                        optJSONObject.put("EXTRA_DEVICE_NAME", VerifyByAnotherDeviceView.this.f88644T0);
                    }
                    AbstractC23153n4.m119159x(VerifyByAnotherDeviceView.this.m92676n2(), optJSONObject, true, 3, false, VerifyByAnotherDeviceView.this.f88642R0, VerifyByAnotherDeviceView.this.f88643S0, null, VerifyByAnotherDeviceView.this.f88647W0, VerifyByAnotherDeviceView.this.f88648X0);
                    m92569rM = VerifyByAnotherDeviceView.this.m92569rM();
                    verifyByAnotherDeviceView = VerifyByAnotherDeviceView.this;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    m92569rM = VerifyByAnotherDeviceView.this.m92569rM();
                    VerifyByAnotherDeviceView verifyByAnotherDeviceView2 = VerifyByAnotherDeviceView.this;
                    synchronized (m92569rM) {
                        verifyByAnotherDeviceView2.m92570yM(false);
                        verifyByAnotherDeviceView2.f72421L0.mo49315c4();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                }
                synchronized (m92569rM) {
                    verifyByAnotherDeviceView.m92570yM(false);
                    verifyByAnotherDeviceView.f72421L0.mo49315c4();
                    C24848g0 c24848g02 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                Object m92569rM2 = VerifyByAnotherDeviceView.this.m92569rM();
                VerifyByAnotherDeviceView verifyByAnotherDeviceView3 = VerifyByAnotherDeviceView.this;
                synchronized (m92569rM2) {
                    verifyByAnotherDeviceView3.m92570yM(false);
                    verifyByAnotherDeviceView3.f72421L0.mo49315c4();
                    C24848g0 c24848g03 = C24848g0.f119245a;
                    throw th2;
                }
            }
        }
    }

    /* renamed from: qM */
    private final void m92562qM(boolean z11) {
        String str;
        if (!TextUtils.isEmpty(AbstractC23304d.f113398j0)) {
            synchronized (this.f88650Z0) {
                if (this.f88649Y0) {
                    mo46829Y();
                    return;
                }
                this.f88649Y0 = true;
                mo46829Y();
                C24848g0 c24848g0 = C24848g0.f119245a;
                if (AbstractC23309i.m121859e9() == 1) {
                    str = AbstractC23309i.m121704a5();
                } else {
                    str = "";
                }
                String str2 = str;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C17394b(z11));
                AbstractC23304d.f113289J.clear();
                AbstractC23304d.f113399j1 = System.currentTimeMillis();
                c0766k.mo1530S4(AbstractC23304d.f113398j0, str2, this.f88642R0, this.f88645U0, 0, this.f88646V0, this.f88647W0, this.f88648X0, AbstractC23034c6.m118110A(), z11);
                return;
            }
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.input_phone09));
    }

    /* renamed from: sM */
    private final void m92563sM() {
        int m127173b0;
        C29824ge c29824ge = this.f88640P0;
        C29824ge c29824ge2 = null;
        if (c29824ge == null) {
            AbstractC19074t.m100223u("binding");
            c29824ge = null;
        }
        RelativeLayout root = c29824ge.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), AbstractC17484n.Companion.m92931b(), root.getPaddingRight(), root.getPaddingBottom());
        C29824ge c29824ge3 = this.f88640P0;
        if (c29824ge3 == null) {
            AbstractC19074t.m100223u("binding");
            c29824ge3 = null;
        }
        c29824ge3.f137908q.setOnClickListener(new View.OnClickListener() { // from class: rl0.a
            public /* synthetic */ ViewOnClickListenerC25827a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyByAnotherDeviceView.m92564tM(VerifyByAnotherDeviceView.this, view);
            }
        });
        C29824ge c29824ge4 = this.f88640P0;
        if (c29824ge4 == null) {
            AbstractC19074t.m100223u("binding");
            c29824ge4 = null;
        }
        Avatar avatar = c29824ge4.f137911t;
        Context context = avatar.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        avatar.m90481x(context, EnumC16949e.SIZE_128);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        avatar.setImageDrawable(C27280g.m139658a(m92689tK, AbstractC23322a.zds_il_zalo_otp_spot_1_1));
        C29824ge c29824ge5 = this.f88640P0;
        if (c29824ge5 == null) {
            AbstractC19074t.m100223u("binding");
            c29824ge5 = null;
        }
        RobotoTextView robotoTextView = c29824ge5.f137913v;
        SpannableString spannableString = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_verify_by_another_device_description, this.f88644T0));
        m127173b0 = AbstractC24342w.m127173b0(spannableString, this.f88644T0, 0, false, 6, null);
        spannableString.setSpan(new StyleSpan(1), m127173b0, this.f88644T0.length() + m127173b0, 33);
        robotoTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
        C29824ge c29824ge6 = this.f88640P0;
        if (c29824ge6 == null) {
            AbstractC19074t.m100223u("binding");
            c29824ge6 = null;
        }
        c29824ge6.f137910s.setOnClickListener(new View.OnClickListener() { // from class: rl0.b
            public /* synthetic */ ViewOnClickListenerC25828b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyByAnotherDeviceView.m92565uM(VerifyByAnotherDeviceView.this, view);
            }
        });
        C29824ge c29824ge7 = this.f88640P0;
        if (c29824ge7 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29824ge2 = c29824ge7;
        }
        c29824ge2.f137909r.setOnClickListener(new View.OnClickListener() { // from class: rl0.c
            public /* synthetic */ ViewOnClickListenerC25829c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyByAnotherDeviceView.m92566vM(VerifyByAnotherDeviceView.this, view);
            }
        });
    }

    /* renamed from: tM */
    public static final void m92564tM(VerifyByAnotherDeviceView verifyByAnotherDeviceView, View view) {
        AbstractC19074t.m100208f(verifyByAnotherDeviceView, "this$0");
        verifyByAnotherDeviceView.finish();
    }

    /* renamed from: uM */
    public static final void m92565uM(VerifyByAnotherDeviceView verifyByAnotherDeviceView, View view) {
        AbstractC19074t.m100208f(verifyByAnotherDeviceView, "this$0");
        verifyByAnotherDeviceView.m92562qM(true);
    }

    /* renamed from: vM */
    public static final void m92566vM(VerifyByAnotherDeviceView verifyByAnotherDeviceView, View view) {
        AbstractC19074t.m100208f(verifyByAnotherDeviceView, "this$0");
        verifyByAnotherDeviceView.showDialog(1);
    }

    /* renamed from: wM */
    public static final void m92567wM(VerifyByAnotherDeviceView verifyByAnotherDeviceView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(verifyByAnotherDeviceView, "this$0");
        interfaceC17463d.dismiss();
        verifyByAnotherDeviceView.m92562qM(false);
    }

    /* renamed from: xM */
    public static final void m92568xM(VerifyByAnotherDeviceView verifyByAnotherDeviceView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(verifyByAnotherDeviceView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        verifyByAnotherDeviceView.finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("data");
            if (string != null) {
                this.f88641Q0 = new JSONObject(string);
            }
            String string2 = m92642L3.getString("EXTRA_SESSION_TOKEN", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f88642R0 = string2;
            String string3 = m92642L3.getString("EXTRA_NUMBER_PHONE", "");
            AbstractC19074t.m100207e(string3, "getString(...)");
            this.f88643S0 = string3;
            String string4 = m92642L3.getString("EXTRA_DEVICE_NAME", "");
            AbstractC19074t.m100207e(string4, "getString(...)");
            this.f88644T0 = string4;
            this.f88647W0 = m92642L3.getInt("EXTRA_SOURCE_SWITCH_ACCOUNT", 0);
            this.f88648X0 = m92642L3.getInt("EXTRA_SOURCE_SWITCH", 0);
            this.f88646V0 = m92642L3.getInt("EXTRA_TYPE_SOURCE", 0);
            this.f88645U0 = m92642L3.getInt("EXTRA_FORGET_PASSWORD", 0);
        }
        if (bundle == null) {
            f88639a1 = false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        boolean m127126v;
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C16972e0.a m90932i = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_general);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            C16972e0.a m90918B = m90932i.m90918B(m118743r0);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_expired_session);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            C16972e0.a m90945v = m90918B.m90949z(m118743r02).m90945v(AbstractC2814h.ButtonMedium_TertiaryNeutral);
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.back);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            return m90945v.m90943t(m118743r03, new InterfaceC17463d.d() { // from class: rl0.e
                public /* synthetic */ C25831e() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    VerifyByAnotherDeviceView.m92568xM(VerifyByAnotherDeviceView.this, interfaceC17463d, i12);
                }
            }).m90927d();
        }
        String m121704a5 = AbstractC23309i.m121704a5();
        AbstractC19074t.m100207e(m121704a5, "getIsoCountryCode(...)");
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String upperCase = m121704a5.toUpperCase(locale);
        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
        String m118282h = AbstractC23056e6.m118282h(this.f88643S0, upperCase, true);
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!TextUtils.isEmpty(m118282h)) {
            m127126v = AbstractC24341v.m127126v(m118282h, AbstractC23056e6.f112062a, true);
            if (m127126v) {
            }
            Context m92689tK2 = m92689tK();
            AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
            C16972e0.a m90932i2 = new C16972e0.a(m92689tK2).m90932i(C16972e0.b.DIALOG_INFORMATION);
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleDlg_confirmPhone, m118282h);
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            C16972e0.a m90918B2 = m90932i2.m90918B(m118746s0);
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_call);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            C16972e0.a m90935l = m90918B2.m90949z(m118743r04).m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
            String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
            AbstractC19074t.m100207e(m118743r05, "getString(...)");
            C16972e0.a m90945v2 = m90935l.m90934k(m118743r05, new InterfaceC17463d.b()).m90945v(AbstractC2814h.ButtonMedium_Tertiary);
            String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.confirm);
            AbstractC19074t.m100207e(m118743r06, "getString(...)");
            return m90945v2.m90943t(m118743r06, new InterfaceC17463d.d() { // from class: rl0.d
                public /* synthetic */ C25830d() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    VerifyByAnotherDeviceView.m92567wM(VerifyByAnotherDeviceView.this, interfaceC17463d, i12);
                }
            }).m90927d();
        }
        m118282h = this.f88643S0;
        Context m92689tK22 = m92689tK();
        AbstractC19074t.m100207e(m92689tK22, "requireContext(...)");
        C16972e0.a m90932i22 = new C16972e0.a(m92689tK22).m90932i(C16972e0.b.DIALOG_INFORMATION);
        String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleDlg_confirmPhone, m118282h);
        AbstractC19074t.m100207e(m118746s02, "getString(...)");
        C16972e0.a m90918B22 = m90932i22.m90918B(m118746s02);
        String m118743r042 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_call);
        AbstractC19074t.m100207e(m118743r042, "getString(...)");
        C16972e0.a m90935l2 = m90918B22.m90949z(m118743r042).m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        String m118743r052 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
        AbstractC19074t.m100207e(m118743r052, "getString(...)");
        C16972e0.a m90945v22 = m90935l2.m90934k(m118743r052, new InterfaceC17463d.b()).m90945v(AbstractC2814h.ButtonMedium_Tertiary);
        String m118743r062 = AbstractC23136l9.m118743r0(AbstractC8020f0.confirm);
        AbstractC19074t.m100207e(m118743r062, "getString(...)");
        return m90945v22.m90943t(m118743r062, new InterfaceC17463d.d() { // from class: rl0.d
            public /* synthetic */ C25830d() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                VerifyByAnotherDeviceView.m92567wM(VerifyByAnotherDeviceView.this, interfaceC17463d, i12);
            }
        }).m90927d();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29824ge m148004c = C29824ge.m148004c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148004c, "inflate(...)");
        this.f88640P0 = m148004c;
        m92563sM();
        C29824ge c29824ge = this.f88640P0;
        if (c29824ge == null) {
            AbstractC19074t.m100223u("binding");
            c29824ge = null;
        }
        RelativeLayout root = c29824ge.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "VerifyByAnotherDeviceView_ID";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (f88639a1) {
            finish();
        }
    }

    /* renamed from: rM */
    public final Object m92569rM() {
        return this.f88650Z0;
    }

    /* renamed from: yM */
    public final void m92570yM(boolean z11) {
        this.f88649Y0 = z11;
    }
}
