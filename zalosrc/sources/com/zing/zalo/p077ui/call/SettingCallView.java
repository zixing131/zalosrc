package com.zing.zalo.p077ui.call;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.C3080a0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView;
import com.zing.zalo.p077ui.call.SettingCallView;
import com.zing.zalo.p077ui.call.settingringtone.SettingRingtoneView;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import com.zing.zalo.p077ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.SettingCallFromStrangerView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import je.C21228a;
import l50.C22080b;
import l50.C22083e;
import l50.C22086h;
import lo0.AbstractC22609k0;
import lo0.C22592c;
import lo0.C22626t;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23217t2;
import me0.C23046d7;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p321le.C22451b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;
import th.AbstractC26681b;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32257b4;
import zm.voip.service.C32328p3;

/* loaded from: classes5.dex */
public class SettingCallView extends SlidableZaloView implements View.OnClickListener, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: P0 */
    LinearLayout f56289P0;

    /* renamed from: Q0 */
    LinearLayout f56290Q0;

    /* renamed from: R0 */
    LinearLayout f56291R0;

    /* renamed from: S0 */
    LinearLayout f56292S0;

    /* renamed from: T0 */
    LinearLayout f56293T0;

    /* renamed from: U0 */
    LinearLayout f56294U0;

    /* renamed from: V0 */
    LinearLayout f56295V0;

    /* renamed from: W0 */
    LinearLayout f56296W0;

    /* renamed from: X0 */
    LinearLayout f56297X0;

    /* renamed from: Y0 */
    StencilSwitch f56298Y0;

    /* renamed from: Z0 */
    StencilSwitch f56299Z0;

    /* renamed from: a1 */
    StencilSwitch f56300a1;

    /* renamed from: b1 */
    StencilSwitch f56301b1;

    /* renamed from: c1 */
    TextView f56302c1;

    /* renamed from: d1 */
    TextView f56303d1;

    /* renamed from: e1 */
    RobotoTextView f56304e1;

    /* renamed from: f1 */
    RobotoTextView f56305f1;

    /* renamed from: g1 */
    View f56306g1;

    /* renamed from: i1 */
    ScrollViewVisibleChildViewDetector f56308i1;

    /* renamed from: j1 */
    HightLightSettingView f56309j1;

    /* renamed from: t1 */
    int f56319t1;

    /* renamed from: u1 */
    int f56320u1;

    /* renamed from: h1 */
    int f56307h1 = 0;

    /* renamed from: k1 */
    int f56310k1 = -1;

    /* renamed from: l1 */
    int f56311l1 = 0;

    /* renamed from: m1 */
    private String f56312m1 = "";

    /* renamed from: n1 */
    private int f56313n1 = 0;

    /* renamed from: o1 */
    final sh0 f56314o1 = new sh0();

    /* renamed from: p1 */
    private final Handler f56315p1 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: f50.g
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m58668CM;
            m58668CM = SettingCallView.this.m58668CM(message);
            return m58668CM;
        }
    });

    /* renamed from: q1 */
    boolean f56316q1 = false;

    /* renamed from: r1 */
    private final InterfaceC0765j f56317r1 = new C0766k();

    /* renamed from: s1 */
    private final InterfaceC20094a f56318s1 = new C11196a();

    /* renamed from: v1 */
    boolean f56321v1 = false;

    /* renamed from: w1 */
    private final InterfaceC0765j f56322w1 = new C0766k();

    /* renamed from: x1 */
    private final InterfaceC20094a f56323x1 = new C11197b();

    /* renamed from: com.zing.zalo.ui.call.SettingCallView$a */
    /* loaded from: classes5.dex */
    class C11196a implements InterfaceC20094a {
        C11196a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingCallView settingCallView = SettingCallView.this;
            settingCallView.f56316q1 = false;
            settingCallView.m58709RM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingCallView.this.f56316q1 = false;
            AbstractC23309i.m122552wr(System.currentTimeMillis());
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                AbstractC23148n.m118844r(jSONObject);
                if (!jSONObject.isNull("privacy")) {
                    AbstractC23309i.m122593xv("GET_SUCCESSFUL");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            SettingCallView.this.m58709RM();
            C3080a0.f13112a.m15414e(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.SettingCallView$b */
    /* loaded from: classes5.dex */
    public class C11197b implements InterfaceC20094a {
        C11197b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m58714d() {
            try {
                SettingCallView settingCallView = SettingCallView.this;
                AbstractC23148n.m118848v(settingCallView.f56319t1, settingCallView.f56320u1);
                SettingCallView.this.m58708QM();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                    SettingCallView.this.m58709RM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingCallView settingCallView = SettingCallView.this;
                settingCallView.f56321v1 = false;
                settingCallView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingCallView settingCallView2 = SettingCallView.this;
                settingCallView2.f56321v1 = false;
                settingCallView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (SettingCallView.this.f72421L0.m92676n2() != null) {
                        SettingCallView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.call.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingCallView.C11197b.this.m58714d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingCallView settingCallView = SettingCallView.this;
                settingCallView.f56321v1 = false;
                settingCallView.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.SettingCallView$c */
    /* loaded from: classes5.dex */
    public class RunnableC11198c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f56326p;

        RunnableC11198c(View view) {
            this.f56326p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
                if (SettingCallView.this.f56314o1.m87411l(this.f56326p, this)) {
                    return;
                }
                SettingCallView settingCallView = SettingCallView.this;
                int i11 = settingCallView.f56310k1;
                if (i11 != 20) {
                    if (i11 != 124) {
                        if (i11 != 129) {
                            if (i11 != 149) {
                                if (i11 != 94) {
                                    if (i11 != 95) {
                                        linearLayout = null;
                                    } else {
                                        linearLayout = settingCallView.f56291R0;
                                    }
                                } else {
                                    linearLayout = settingCallView.f56290Q0;
                                }
                            } else {
                                linearLayout = settingCallView.f56292S0;
                            }
                        } else {
                            linearLayout = settingCallView.f56296W0;
                        }
                    } else {
                        linearLayout = settingCallView.f56295V0;
                    }
                } else {
                    linearLayout = settingCallView.f56289P0;
                }
                settingCallView.f56314o1.m87409j(linearLayout, settingCallView.f56309j1, settingCallView.f56311l1);
                SettingCallView.this.m58678MA();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: BM */
    private void m58667BM(StencilSwitch stencilSwitch) {
        if (stencilSwitch.getId() == this.f56298Y0.getId()) {
            m58704AM();
        } else if (stencilSwitch.getId() == this.f56299Z0.getId()) {
            m58712zM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ boolean m58668CM(Message message) {
        int i11 = message.what;
        if (i11 == 1) {
            AbstractC32273e3.m155748Q().mo155899m2();
            m58707PM("onResume", 8);
            this.f72421L0.mo78960q3();
            return false;
        }
        if (i11 == 2) {
            AbstractC32273e3.m155748Q().mo155914r2();
            m58706OM("HomeApp", 2);
            this.f72421L0.mo78960q3();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m58669DM() {
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        this.f56315p1.removeMessages(2);
        this.f56315p1.sendEmptyMessageDelayed(1, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m58670EM(int i11) {
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        this.f56315p1.removeMessages(1);
        this.f56315p1.sendEmptyMessageDelayed(2, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m58671FM() {
        try {
            m58708QM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ void m58672GM(String str) {
        this.f56304e1.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public /* synthetic */ void m58673HM() {
        try {
            int intValue = ((Integer) new C22083e().m101509a(Boolean.TRUE)).intValue();
            this.f56313n1 = intValue;
            final String str = "";
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            str = m58702wM();
                        }
                    } else {
                        this.f56312m1 = AbstractC0924m0.m3713c7();
                        str = m58701vM();
                    }
                } else {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_base_on_system_ringtone);
                }
            } else {
                String m3683b7 = AbstractC0924m0.m3683b7();
                this.f56312m1 = m3683b7;
                if (m3683b7.isEmpty()) {
                    String str2 = AbstractC22609k0.f110725a;
                    this.f56312m1 = str2;
                    AbstractC0924m0.m3497Up(str2);
                }
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.zalo);
                if (AbstractC23304d.f113267D1 == 2) {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_setting_default);
                }
            }
            mo70710wy(new Runnable() { // from class: f50.l
                @Override // java.lang.Runnable
                public final void run() {
                    SettingCallView.this.m58672GM(str);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public /* synthetic */ void m58674IM(C21228a c21228a) {
        if (c21228a.m110007g()) {
            this.f56305f1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_setting_default));
        } else {
            this.f56305f1.setText(String.format("%s - %s", c21228a.m110004d(), c21228a.m110001a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public /* synthetic */ void m58675JM(final C21228a c21228a) {
        this.f56305f1.post(new Runnable() { // from class: f50.m
            @Override // java.lang.Runnable
            public final void run() {
                SettingCallView.this.m58674IM(c21228a);
            }
        });
    }

    /* renamed from: KM */
    private void m58676KM(StencilSwitch stencilSwitch) {
        if (stencilSwitch.getId() == this.f56298Y0.getId()) {
            AbstractC23309i.m122412sz(this.f56298Y0.isChecked());
        } else if (stencilSwitch.getId() == this.f56299Z0.getId()) {
            AbstractC23309i.m121846dx(this.f56299Z0.isChecked());
        }
    }

    /* renamed from: LM */
    private void m58677LM() {
        if (AbstractC3096i0.m15538g() && !AbstractC3096i0.f13166j && AbstractC32273e3.m155748Q().mo155799F0()) {
            AbstractC32273e3.m155748Q().m155827M1(new Runnable() { // from class: f50.i
                @Override // java.lang.Runnable
                public final void run() {
                    SettingCallView.this.m58669DM();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MA */
    public void m58678MA() {
        this.f56310k1 = -1;
        this.f56311l1 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: MM */
    private void m58679MM() {
        m58680NM(ZAbstractBase.ZVU_PROCESS_FLUSH);
    }

    /* renamed from: NM */
    private void m58680NM(final int i11) {
        if (AbstractC32273e3.m155748Q().mo155799F0()) {
            AbstractC32273e3.m155748Q().m155827M1(new Runnable() { // from class: f50.k
                @Override // java.lang.Runnable
                public final void run() {
                    SettingCallView.this.m58670EM(i11);
                }
            });
        }
    }

    /* renamed from: SM */
    private void m58681SM(StencilSwitch stencilSwitch, String str, int[] iArr) {
        if (AbstractC23034c6.m118114C(this.f72421L0.m92648SI(), str)) {
            if (this.f56307h1 == stencilSwitch.getId()) {
                stencilSwitch.setChecked(!stencilSwitch.isChecked());
                m58676KM(stencilSwitch);
                this.f56307h1 = 0;
                return;
            }
            m58696qM(stencilSwitch);
            return;
        }
        if (stencilSwitch != null) {
            stencilSwitch.setChecked(false);
            if (iArr.length > 0) {
                m58676KM(stencilSwitch);
            }
        }
    }

    /* renamed from: TM */
    private void m58682TM() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: f50.f
            @Override // java.lang.Runnable
            public final void run() {
                SettingCallView.this.m58673HM();
            }
        });
    }

    /* renamed from: UM */
    private void m58683UM() {
        new C22451b().m101508a(new C22451b.a() { // from class: f50.h
            @Override // p321le.C22451b.a
            /* renamed from: a */
            public final void mo73846a(C21228a c21228a) {
                SettingCallView.this.m58675JM(c21228a);
            }
        });
    }

    /* renamed from: VM */
    private void m58684VM() {
        boolean z11;
        int i11;
        int i12 = 0;
        if ((!AbstractC3096i0.m15511R() && !AbstractC26681b.f126356a) || (AbstractC3096i0.m15511R() && !AbstractC23034c6.m118130P(MainApplication.getAppContext()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        LinearLayout linearLayout = this.f56293T0;
        if (linearLayout != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
        }
        LinearLayout linearLayout2 = this.f56296W0;
        if (linearLayout2 != null) {
            if (!AbstractC3096i0.m15564t().booleanValue()) {
                i12 = 8;
            }
            linearLayout2.setVisibility(i12);
        }
    }

    /* renamed from: Vp */
    private void m58685Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f56310k1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f56311l1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* renamed from: qM */
    private void m58696qM(StencilSwitch stencilSwitch) {
        if (stencilSwitch.getId() == this.f56298Y0.getId()) {
            this.f56298Y0.setChecked(AbstractC23309i.m121342Qd());
        } else if (stencilSwitch.getId() == this.f56299Z0.getId()) {
            this.f56299Z0.setChecked(AbstractC23309i.m121414Sb());
        }
    }

    /* renamed from: rM */
    private boolean m58697rM(String str, int i11) {
        if (!AbstractC23034c6.m118114C(this.f72421L0.getContext(), str)) {
            AbstractC23034c6.m118186w0(this.f72421L0.m92676n2(), new String[]{str}, i11);
            return false;
        }
        return true;
    }

    /* renamed from: sM */
    private void m58698sM(StencilSwitch stencilSwitch, boolean z11, String str, int i11) {
        if (!z11) {
            stencilSwitch.setChecked(false);
        } else {
            stencilSwitch.setChecked(m58697rM(str, i11));
        }
    }

    /* renamed from: tM */
    private void m58699tM(StencilSwitch stencilSwitch, String str, int i11) {
        if (!stencilSwitch.isChecked()) {
            if (m58697rM(str, i11)) {
                m58667BM(stencilSwitch);
                return;
            }
            return;
        }
        m58667BM(stencilSwitch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public void m58700uM() {
        try {
            AbstractC26084s.m134251H(this.f56289P0, 20);
            AbstractC26084s.m134251H(this.f56292S0, 149);
            AbstractC26084s.m134251H(this.f56290Q0, 94);
            AbstractC26084s.m134251H(this.f56291R0, 95);
            this.f56314o1.m87405e(this, 42);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingCallView", e11);
        }
    }

    /* renamed from: vM */
    private String m58701vM() {
        Uri parse = Uri.parse(this.f56312m1);
        if (parse != null) {
            return RingtoneManager.getRingtone(getContext(), parse).getTitle(getContext());
        }
        return "";
    }

    /* renamed from: wM */
    private String m58702wM() {
        try {
            RingtoneData ringtoneData = (RingtoneData) new C22086h().m101506a();
            if (ringtoneData == null) {
                return "";
            }
            return ringtoneData.m58733e() + " - " + ringtoneData.m58731c();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: xM */
    private void m58703xM(View view) {
        if (this.f56310k1 >= 0) {
            view.postDelayed(new RunnableC11198c(view), 300L);
        }
    }

    /* renamed from: AM */
    void m58704AM() {
        StencilSwitch stencilSwitch = this.f56298Y0;
        if (stencilSwitch != null) {
            stencilSwitch.setChecked(!stencilSwitch.isChecked());
            AbstractC23309i.m122412sz(this.f56298Y0.isChecked());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            m58685Vp();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_call_view, viewGroup, false);
        m58711yM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f56314o1.m87408i());
        }
    }

    /* renamed from: Ie */
    void m58705Ie(int i11, int i12) {
        try {
            if (this.f56321v1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f56319t1 = i11;
                this.f56320u1 = i12;
                this.f56321v1 = true;
                this.f56322w1.mo1704o8(this.f56323x1);
                this.f56322w1.mo1545U3(i11, i12, "");
            } else {
                this.f56321v1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                m58708QM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: OM */
    void m58706OM(String str, int i11) {
        if (AbstractC32273e3.f148886z) {
            C22592c m156362c = C32328p3.m156358e().m156362c();
            if (m156362c != null && !m156362c.m116850H()) {
                AbstractC32273e3.m155748Q().mo155781A2(str, i11);
                return;
            }
            return;
        }
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null && m155737l.m117047N0() && !m155737l.m117114h0()) {
            AbstractC3082b0.m15421c("SettingCallView", "turnOffCamera ifOffCamera = " + m155737l.m117114h0() + " " + str);
            AbstractC32273e3.m155748Q().mo155781A2(str, i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            m58685Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m58703xM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PM */
    void m58707PM(String str, int i11) {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null && m155737l.m117047N0() && AbstractC32273e3.m155748Q().mo155855W().f123737b) {
            AbstractC3082b0.m15421c("SettingCallView", "turnOnCamera ifOffCamera = " + m155737l.m117114h0() + " " + str);
            AbstractC32273e3.m155748Q().mo155785B2(str, i11);
        }
    }

    /* renamed from: QM */
    void m58708QM() {
        String str;
        int i11;
        try {
            StencilSwitch stencilSwitch = this.f56301b1;
            C3080a0 c3080a0 = C3080a0.f13112a;
            stencilSwitch.setChecked(c3080a0.m15417j());
            if (AbstractC23304d.f113263C1) {
                this.f56303d1.setText(c3080a0.m15416g());
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                str = "android.permission.READ_CALL_LOG";
            } else {
                str = "android.permission.CALL_PHONE";
            }
            if (i12 >= 28) {
                i11 = 121;
            } else {
                i11 = 123;
            }
            if (AbstractC23309i.m121377Rb() != 0 && C8937j0.m47663l("call_log_noti_call")) {
                m58698sM(this.f56299Z0, AbstractC23309i.m121414Sb(), str, i11);
            }
            m58698sM(this.f56298Y0, AbstractC23309i.m121342Qd(), str, i11);
            boolean z11 = false;
            if (AbstractC3096i0.m15511R()) {
                StencilSwitch stencilSwitch2 = this.f56300a1;
                if (AbstractC23309i.m121776c2() == 1) {
                    z11 = true;
                }
                stencilSwitch2.setChecked(z11);
                return;
            }
            StencilSwitch stencilSwitch3 = this.f56300a1;
            if (AbstractC23309i.m121776c2() == 1 && AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
                z11 = true;
            }
            stencilSwitch3.setChecked(z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f56314o1.m87414t();
    }

    /* renamed from: RM */
    void m58709RM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: f50.j
                @Override // java.lang.Runnable
                public final void run() {
                    SettingCallView.this.m58671FM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m58700uM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f56308i1;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
    }

    /* renamed from: Vx */
    void m58710Vx() {
        if (this.f56316q1) {
            return;
        }
        if (C23055e5.m118271f()) {
            this.f56316q1 = true;
            this.f56317r1.mo1704o8(this.f56318s1);
            this.f56317r1.mo1589Z7(AbstractC23148n.m118835i());
            return;
        }
        this.f56316q1 = false;
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_getPrivacySettings_fromServer_fail));
        m58709RM();
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_use_popup_miss_call) {
            return 20;
        }
        if (i11 == AbstractC6918a0.ll_allow_incomming_calls) {
            return 149;
        }
        if (i11 == AbstractC6918a0.ll_setting_native_call_bubble) {
            return 94;
        }
        if (i11 == AbstractC6918a0.ll_setting_call_mini_mode) {
            return 95;
        }
        if (i11 == AbstractC6918a0.ll_setting_call_ringtone) {
            return 124;
        }
        return i11 == AbstractC6918a0.ll_ring_back_tone ? 129 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingCallView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 11122 && AbstractC23034c6.m118126L(MainApplication.getAppContext()) && !AbstractC3096i0.m15511R()) {
            boolean z11 = true;
            AbstractC23309i.m122323qk(1);
            StencilSwitch stencilSwitch = this.f56300a1;
            if (AbstractC23309i.m121776c2() != 1 || !AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
                z11 = false;
            }
            stencilSwitch.setChecked(z11);
            m58677LM();
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            int id2 = view.getId();
            int i11 = 123;
            String str5 = "android.permission.CALL_PHONE";
            if (id2 != AbstractC6918a0.ll_use_popup_miss_call && id2 != AbstractC6918a0.sw_use_popup_miss_call) {
                if (id2 != AbstractC6918a0.ll_allow_incomming_calls && id2 != AbstractC6918a0.sw_allow_incomming_calls) {
                    if (id2 != AbstractC6918a0.ll_setting_native_call_bubble && id2 != AbstractC6918a0.sw_setting_native_call_bubble) {
                        if (id2 != AbstractC6918a0.ll_setting_call_mini_mode && id2 != AbstractC6918a0.sw_setting_call_mini_mode) {
                            if (id2 == AbstractC6918a0.layout_setting_call_ringtone) {
                                Bundle bundle = new Bundle();
                                bundle.putString("SOURCE_OPEN_SETTING_RING_TONE_SCREEN", "1");
                                int i12 = AbstractC23304d.f113267D1;
                                if (i12 == 1) {
                                    this.f72421L0.m92662fJ().m93069k2(SettingRingtoneView.class, bundle, 1, true);
                                    return;
                                } else {
                                    if (i12 == 2) {
                                        this.f72421L0.m92662fJ().m93069k2(SettingRingtoneViewV2.class, bundle, 1, true);
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (id2 == AbstractC6918a0.layout_ring_back_tone) {
                                this.f72421L0.m92662fJ().m93069k2(SettingRingBackToneView.class, null, 1, true);
                                return;
                            } else {
                                if (id2 == AbstractC6918a0.ll_record_nw_data) {
                                    this.f72421L0.m92662fJ().m93069k2(SettingCallLogsView.class, null, 1, true);
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f56300a1.isChecked()) {
                            AbstractC23309i.m122323qk(0);
                            this.f56300a1.setChecked(false);
                            m58679MM();
                        } else if (AbstractC3096i0.m15511R()) {
                            AbstractC23309i.m122323qk(1);
                            this.f56300a1.setChecked(true);
                        } else if (AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
                            AbstractC23309i.m122323qk(1);
                            this.f56300a1.setChecked(true);
                            m58677LM();
                        } else {
                            AbstractC23034c6.m118182u0(this.f72421L0.m92662fJ(), 11122);
                        }
                        AbstractC26084s.m134269q(0, 95);
                        if (this.f56300a1.isChecked()) {
                            str4 = "400501";
                        } else {
                            str4 = "400502";
                        }
                        AbstractC23647d.m123906p(str4);
                        AbstractC23647d.m123893c();
                        C0815e1.m2079N(95, 1, 0, 0, 0);
                        return;
                    }
                    this.f56307h1 = this.f56299Z0.getId();
                    if (AbstractC23309i.m121377Rb() != 0) {
                        if (C8937j0.m47663l("call_log_noti_call")) {
                            int i13 = Build.VERSION.SDK_INT;
                            if (i13 >= 28) {
                                str5 = "android.permission.READ_CALL_LOG";
                            }
                            if (i13 >= 28) {
                                i11 = 121;
                            }
                            m58699tM(this.f56299Z0, str5, i11);
                            if (this.f56299Z0.isChecked()) {
                                str3 = "400503";
                            } else {
                                str3 = "400504";
                            }
                            AbstractC23647d.m123906p(str3);
                            AbstractC23647d.m123893c();
                        } else {
                            C23046d7.m118239b(m92689tK()).mo13822K();
                        }
                    }
                    AbstractC26084s.m134269q(0, 94);
                    C0815e1.m2079N(94, 1, 0, 0, 0);
                    return;
                }
                AbstractC26084s.m134269q(0, 149);
                if (AbstractC23304d.f113263C1) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("CALL_FROM_STRANGER_SETTING_ENTRY_POINT", "setting_call");
                    this.f72421L0.m92662fJ().m93069k2(SettingCallFromStrangerView.class, bundle2, 1, true);
                } else {
                    this.f56301b1.setChecked(!r0.isChecked());
                    m58705Ie(25, this.f56301b1.isChecked() ? 1 : 0);
                    if (this.f56301b1.isChecked()) {
                        str2 = "37026";
                    } else {
                        str2 = "37025";
                    }
                    AbstractC23647d.m123906p(str2);
                    AbstractC23647d.m123893c();
                }
                C0815e1.m2079N(149, 1, 0, 0, 0);
                return;
            }
            this.f56307h1 = this.f56298Y0.getId();
            AbstractC26084s.m134269q(0, 20);
            if (C8937j0.m47663l("call_log_noti_call")) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 28) {
                    str5 = "android.permission.READ_CALL_LOG";
                }
                if (i14 >= 28) {
                    i11 = 121;
                }
                m58699tM(this.f56298Y0, str5, i11);
                if (this.f56298Y0.isChecked()) {
                    str = "37205";
                } else {
                    str = "37206";
                }
                AbstractC23647d.m123906p(str);
                AbstractC23647d.m123893c();
            } else {
                C23046d7.m118239b(m92689tK()).mo13822K();
            }
            C0815e1.m2079N(20, 1, 0, 0, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        String str;
        if ((i11 == 121 || i11 == 123) && C8937j0.m47663l("call_log_noti_call")) {
            if (i11 == 123) {
                str = "android.permission.CALL_PHONE";
            } else {
                str = "android.permission.READ_CALL_LOG";
            }
            m58681SM(this.f56298Y0, str, iArr);
            if (AbstractC23309i.m121377Rb() != 0) {
                m58681SM(this.f56299Z0, str, iArr);
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (!AbstractC3096i0.m15511R() && !AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
            this.f56300a1.setChecked(false);
            this.f56315p1.removeMessages(1);
            m58680NM(0);
        }
        m58682TM();
        if (AbstractC3096i0.m15564t().booleanValue()) {
            m58683UM();
        }
        this.f56314o1.m87413s();
        m58708QM();
        m58684VM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: f50.e
                @Override // java.lang.Runnable
                public final void run() {
                    SettingCallView.this.m58700uM();
                }
            });
        }
    }

    /* renamed from: yM */
    void m58711yM(View view) {
        int i11;
        try {
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view.findViewById(AbstractC6918a0.scroll_main_layout);
            this.f56308i1 = scrollViewVisibleChildViewDetector;
            int i12 = 0;
            scrollViewVisibleChildViewDetector.setScanMode(0);
            this.f56308i1.setOnScrollStateChangedListener(this);
            this.f56314o1.m87415u(this.f56308i1);
            this.f56309j1 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            this.f56289P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_use_popup_miss_call);
            this.f56290Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_native_call_bubble);
            this.f56291R0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_call_mini_mode);
            this.f56292S0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_allow_incomming_calls);
            this.f56293T0 = (LinearLayout) view.findViewById(AbstractC6918a0.layout_setting_call_mini_mode);
            this.f56294U0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_call_sync);
            this.f56295V0 = (LinearLayout) view.findViewById(AbstractC6918a0.layout_setting_call_ringtone);
            this.f56296W0 = (LinearLayout) view.findViewById(AbstractC6918a0.layout_ring_back_tone);
            this.f56297X0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_record_nw_data);
            this.f56298Y0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_use_popup_miss_call);
            this.f56299Z0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_setting_native_call_bubble);
            this.f56300a1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_setting_call_mini_mode);
            this.f56301b1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_allow_incomming_calls);
            this.f56306g1 = view.findViewById(AbstractC6918a0.separate_setting_video_auto_play);
            this.f56304e1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_des_setting_call_ringtone);
            this.f56305f1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_des_ring_back_tone);
            this.f56289P0.setOnClickListener(this);
            this.f56290Q0.setOnClickListener(this);
            this.f56291R0.setOnClickListener(this);
            this.f56292S0.setOnClickListener(this);
            this.f56295V0.setOnClickListener(this);
            this.f56296W0.setOnClickListener(this);
            this.f56297X0.setOnClickListener(this);
            this.f56298Y0.setOnClickListener(this);
            this.f56299Z0.setOnClickListener(this);
            this.f56300a1.setOnClickListener(this);
            this.f56301b1.setOnClickListener(this);
            AbstractC23309i.m121148L4();
            m58708QM();
            this.f56302c1 = (TextView) view.findViewById(AbstractC6918a0.tv_allow_incomming_calls);
            this.f56303d1 = (TextView) view.findViewById(AbstractC6918a0.tv_allow_incomming_call_des);
            m58710Vx();
            if (AbstractC23309i.m121377Rb() == 0) {
                LinearLayout linearLayout = this.f56290Q0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    if (this.f56289P0.getVisibility() == 8) {
                        this.f56294U0.setVisibility(8);
                    }
                }
                view.findViewById(AbstractC6918a0.separate_setting_native_call_bubble).setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f56295V0;
            if (AbstractC23148n.m118840n()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
            if (AbstractC23304d.f113263C1) {
                this.f56301b1.setVisibility(8);
                this.f56302c1.setText(AbstractC8020f0.str_call_who_can_call_you);
                this.f56303d1.setVisibility(0);
            } else {
                this.f56302c1.setText(AbstractC8020f0.str_call_allow_stranger_call_title);
                this.f56303d1.setVisibility(8);
                this.f56301b1.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.f56297X0;
            if (!AbstractC23304d.f113279G1) {
                i12 = 8;
            }
            linearLayout3.setVisibility(i12);
            m58703xM(view);
            new C22080b().m101504a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zM */
    void m58712zM() {
        StencilSwitch stencilSwitch = this.f56299Z0;
        if (stencilSwitch != null) {
            stencilSwitch.setChecked(!stencilSwitch.isChecked());
            AbstractC23309i.m121846dx(this.f56299Z0.isChecked());
        }
    }
}
