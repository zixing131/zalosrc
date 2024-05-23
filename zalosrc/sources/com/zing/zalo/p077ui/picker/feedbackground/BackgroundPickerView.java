package com.zing.zalo.p077ui.picker.feedbackground;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.picker.feedbackground.BackgroundPickerView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import is.AbstractC20826v0;
import java.util.List;
import java.util.Random;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p716zh.C31845ac;
import p716zh.C31890dc;
import v20.C27477e;

/* loaded from: classes6.dex */
public class BackgroundPickerView extends BaseZaloView implements C23744a.c, InterfaceC0733x {

    /* renamed from: M0 */
    View f66025M0;

    /* renamed from: N0 */
    RecyclerView f66026N0;

    /* renamed from: O0 */
    LinearLayoutManager f66027O0;

    /* renamed from: P0 */
    C27477e f66028P0;

    /* renamed from: Q0 */
    InterfaceC12675c f66029Q0;

    /* renamed from: R0 */
    View f66030R0;

    /* renamed from: S0 */
    int f66031S0;

    /* renamed from: T0 */
    boolean f66032T0 = false;

    /* renamed from: U0 */
    boolean f66033U0 = false;

    /* renamed from: V0 */
    Handler f66034V0 = new HandlerC12673a(Looper.getMainLooper());

    /* renamed from: W0 */
    boolean f66035W0 = true;

    /* renamed from: X0 */
    boolean f66036X0 = true;

    /* renamed from: com.zing.zalo.ui.picker.feedbackground.BackgroundPickerView$a */
    /* loaded from: classes6.dex */
    class HandlerC12673a extends Handler {
        HandlerC12673a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    BackgroundPickerView.this.m71394uM((String) message.obj);
                    return;
                }
                return;
            }
            BackgroundPickerView.this.m71397xM(((Boolean) message.obj).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.feedbackground.BackgroundPickerView$b */
    /* loaded from: classes6.dex */
    public class C12674b extends RecyclerView.AbstractC1892s {
        C12674b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    BackgroundPickerView.this.f66028P0.m140550e0(false);
                    BackgroundPickerView.this.f66028P0.m10008p();
                } else {
                    BackgroundPickerView.this.f66028P0.m140550e0(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            String format;
            super.mo10176d(recyclerView, i11, i12);
            try {
                int m9745c2 = BackgroundPickerView.this.f66027O0.m9745c2() + 1;
                if (m9745c2 < 10) {
                    format = String.format("136050%d", Integer.valueOf(m9745c2));
                } else {
                    format = String.format("13605%d", Integer.valueOf(m9745c2));
                }
                AbstractC23647d.m123897g(format);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.feedbackground.BackgroundPickerView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC12675c {
        /* renamed from: i */
        void mo39149i(C31890dc c31890dc);

        /* renamed from: j */
        void mo39150j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.feedbackground.BackgroundPickerView$d */
    /* loaded from: classes6.dex */
    public class C12676d implements C31845ac.g {
        C12676d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m71402e() {
            if (BackgroundPickerView.this.f72421L0.m92672lJ()) {
                BackgroundPickerView.this.m71391rM(true, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m71403f(String str, C31890dc c31890dc) {
            try {
                BackgroundPickerView.this.m71390qM();
                C31890dc m140541R = BackgroundPickerView.this.f66028P0.m140541R();
                if (m140541R != null) {
                    if (str.equals(m140541R.f146495a + "")) {
                        if (c31890dc.m153250u()) {
                            BackgroundPickerView.this.m71392sM(c31890dc);
                        } else {
                            BackgroundPickerView.this.m71391rM(true, true);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p716zh.C31845ac.g
        /* renamed from: a */
        public void mo71404a(int i11, String str) {
            BackgroundPickerView.this.f66034V0.post(new Runnable() { // from class: com.zing.zalo.ui.picker.feedbackground.a
                @Override // java.lang.Runnable
                public final void run() {
                    BackgroundPickerView.C12676d.this.m71402e();
                }
            });
        }

        @Override // p716zh.C31845ac.g
        /* renamed from: b */
        public void mo71405b(final String str, final C31890dc c31890dc) {
            BackgroundPickerView.this.f66034V0.post(new Runnable() { // from class: com.zing.zalo.ui.picker.feedbackground.b
                @Override // java.lang.Runnable
                public final void run() {
                    BackgroundPickerView.C12676d.this.m71403f(str, c31890dc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m71379lM() {
        m71390qM();
        m71397xM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m71380mM(C31890dc c31890dc) {
        String format;
        try {
            if (c31890dc.m153250u()) {
                m71392sM(c31890dc);
            } else {
                C31845ac.m152996J().m153029G(c31890dc, new C12676d(), (byte) 4);
            }
            int m153039R = C31845ac.m152996J().m153039R(c31890dc) + 1;
            if (m153039R > 0) {
                if (m153039R < 10) {
                    format = String.format("136060%d", Integer.valueOf(m153039R));
                } else {
                    format = String.format("13606%d", Integer.valueOf(m153039R));
                }
                AbstractC23647d.m123897g(format);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m71381nM(int i11, int i12, String str, C31890dc c31890dc) {
        try {
            if (i12 == 0 && c31890dc != null) {
                if (i11 == -2) {
                    C31890dc c31890dc2 = new C31890dc(new JSONObject(c31890dc.m153253y()));
                    c31890dc2.f146509o = i11;
                    c31890dc = c31890dc2;
                }
                m71390qM();
                m71392sM(c31890dc);
                return;
            }
            m71391rM(true, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m71382oM(int i11, int i12, String str, C31890dc c31890dc) {
        try {
            if (i12 == 0 && c31890dc != null) {
                if (i11 == -2) {
                    C31890dc c31890dc2 = new C31890dc(new JSONObject(c31890dc.m153253y()));
                    c31890dc2.f146509o = i11;
                    c31890dc = c31890dc2;
                }
                m71390qM();
                m71392sM(c31890dc);
                return;
            }
            m71391rM(true, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m71383pM(int i11) {
        try {
            boolean z11 = !this.f66035W0;
            this.f66035W0 = false;
            C27477e c27477e = this.f66028P0;
            if (c27477e != null) {
                c27477e.m140545Z(i11, this.f66026N0, this.f66027O0, z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: AM */
    public void m71384AM(boolean z11) {
        this.f66033U0 = z11;
    }

    /* renamed from: BM */
    public void m71385BM(C31890dc c31890dc) {
        C27477e c27477e = this.f66028P0;
        if (c27477e != null && c31890dc != null) {
            c27477e.m140551f0(c31890dc);
            m71398yM(c31890dc, 0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_HEIGHT_VIEW_OFFSET")) {
            this.f66031S0 = m92642L3.getInt("EXTRA_HEIGHT_VIEW_OFFSET");
        }
    }

    /* renamed from: CM */
    public void m71386CM(int i11) {
        try {
            this.f66031S0 = i11;
            this.f66030R0.getLayoutParams().height = this.f66031S0;
            this.f66030R0.requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f66025M0 = layoutInflater.inflate(AbstractC7409c0.bg_feed_layout, viewGroup, false);
        m71388jM();
        return this.f66025M0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 88);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BackgroundPickerView";
    }

    /* renamed from: iM */
    C31890dc m71387iM(String str) {
        C31890dc c31890dc = null;
        try {
            JSONArray jSONArray = new JSONArray(str);
            while (jSONArray.length() > 0) {
                int nextInt = new Random().nextInt(jSONArray.length());
                c31890dc = C31845ac.m152996J().m153028F(this.f66028P0.m140539P(), jSONArray.getInt(nextInt), -100, 1);
                if (c31890dc != null && !c31890dc.m153247r()) {
                    break;
                }
                jSONArray = AbstractC18069a.m96099r(nextInt, jSONArray, 1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c31890dc;
    }

    /* renamed from: jM */
    void m71388jM() {
        this.f66026N0 = (RecyclerView) this.f66025M0.findViewById(AbstractC6918a0.lv_bg_graphy);
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
        this.f66027O0 = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        this.f66026N0.setLayoutManager(this.f66027O0);
        this.f66026N0.setOverScrollMode(2);
        this.f66026N0.m9826E(new C12674b());
        C27477e c27477e = new C27477e(this.f72421L0.getContext(), C27477e.d.BG_FEED);
        this.f66028P0 = c27477e;
        c27477e.m140547b0(new C27477e.a() { // from class: h90.c
            @Override // v20.C27477e.a
            /* renamed from: a */
            public final void mo103701a(C31890dc c31890dc) {
                BackgroundPickerView.this.m71380mM(c31890dc);
            }
        });
        this.f66026N0.setAdapter(this.f66028P0);
        if (this.f66033U0) {
            this.f66025M0.setBackgroundColor(AbstractC23136l9.m118641B(this.f72421L0.getContext(), AbstractC16801x.transparent));
            this.f66026N0.setBackgroundColor(AbstractC23136l9.m118641B(this.f72421L0.getContext(), AbstractC16801x.black_70));
            this.f66028P0.m140549d0(true);
        }
        View findViewById = this.f66025M0.findViewById(AbstractC6918a0.view_offset);
        this.f66030R0 = findViewById;
        findViewById.getLayoutParams().height = this.f66031S0;
    }

    /* renamed from: kM */
    public boolean m71389kM() {
        return this.f66036X0;
    }

    /* renamed from: qM */
    public void m71390qM() {
        try {
            this.f66028P0.m140548c0(C31845ac.m152996J().m153032K());
            this.f66028P0.m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    void m71391rM(boolean z11, boolean z12) {
        try {
            C31890dc m153020A = C31845ac.m152996J().m153020A();
            this.f66028P0.m140551f0(m153020A);
            InterfaceC12675c interfaceC12675c = this.f66029Q0;
            if (interfaceC12675c != null) {
                interfaceC12675c.mo39150j();
            }
            if (z12) {
                m71398yM(m153020A, 0);
            }
            if (z11) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_download_bg_feed_failed));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    void m71392sM(C31890dc c31890dc) {
        InterfaceC12675c interfaceC12675c = this.f66029Q0;
        if (interfaceC12675c != null) {
            interfaceC12675c.mo39149i(c31890dc);
        }
        m71398yM(c31890dc, 200);
    }

    /* renamed from: tM */
    void m71393tM(C31890dc c31890dc) {
        if (c31890dc != null) {
            this.f66028P0.m140551f0(c31890dc);
            m71398yM(c31890dc, 200);
            final int i11 = c31890dc.f146509o;
            C31845ac.m152996J().m153057o0(c31890dc.f146495a, new C31845ac.e() { // from class: h90.b
                @Override // p716zh.C31845ac.e
                /* renamed from: a */
                public final void mo39491a(int i12, String str, C31890dc c31890dc2) {
                    BackgroundPickerView.this.m71381nM(i11, i12, str, c31890dc2);
                }
            });
            this.f66036X0 = false;
        }
    }

    /* renamed from: uM */
    public void m71394uM(String str) {
        int m121624Y;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!this.f66032T0) {
                Message obtain = Message.obtain();
                obtain.what = 2;
                obtain.obj = str;
                this.f66034V0.sendMessageDelayed(obtain, 100L);
                return;
            }
            this.f66034V0.removeMessages(2);
            C31890dc m71387iM = m71387iM(str);
            if ((m71387iM == null || m71387iM.m153247r()) && (m121624Y = AbstractC23309i.m121624Y()) != -100) {
                m71387iM = C31845ac.m152996J().m153042U(this.f66028P0.m140539P(), m121624Y);
            }
            if (m71387iM == null || m71387iM.m153247r()) {
                C31890dc m108781R = AbstractC20826v0.m108781R(this.f72421L0.getContext());
                m71387iM = C31845ac.m152996J().m153028F(this.f66028P0.m140539P(), m108781R.f146495a, m108781R.f146509o, 1);
            }
            if (m71387iM == null || m71387iM.m153247r()) {
                m71387iM = C31845ac.m152996J().m153043V(this.f66028P0.m140539P());
            }
            if (m71387iM == null) {
                m71387iM = C31845ac.m152996J().m153020A();
            }
            if (m71387iM != null) {
                if (!C31845ac.m152996J().m153049d0(m71387iM.f146495a)) {
                    m71391rM(false, false);
                }
                this.f66028P0.m140551f0(m71387iM);
                m71398yM(m71387iM, 200);
                final int i11 = m71387iM.f146509o;
                C31845ac.m152996J().m153057o0(m71387iM.f146495a, new C31845ac.e() { // from class: h90.d
                    @Override // p716zh.C31845ac.e
                    /* renamed from: a */
                    public final void mo39491a(int i12, String str2, C31890dc c31890dc) {
                        BackgroundPickerView.this.m71382oM(i11, i12, str2, c31890dc);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    public void m71395vM() {
        C31890dc m140541R = this.f66028P0.m140541R();
        List m140539P = this.f66028P0.m140539P();
        if (m140541R != null && m140539P != null && !m140539P.isEmpty()) {
            m71393tM(C31845ac.m152996J().m153037P(m140539P, m140541R));
        }
    }

    /* renamed from: wM */
    public void m71396wM() {
        C31890dc m140541R = this.f66028P0.m140541R();
        List m140539P = this.f66028P0.m140539P();
        if (m140541R != null && m140539P != null && !m140539P.isEmpty()) {
            m71393tM(C31845ac.m152996J().m153040S(m140539P, m140541R));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 88) {
            this.f66034V0.post(new Runnable() { // from class: h90.a
                @Override // java.lang.Runnable
                public final void run() {
                    BackgroundPickerView.this.m71379lM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m71390qM();
        this.f66032T0 = true;
    }

    /* renamed from: xM */
    public void m71397xM(boolean z11) {
        C31890dc c31890dc;
        try {
            if (!this.f66032T0) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = Boolean.valueOf(z11);
                this.f66034V0.sendMessageDelayed(obtain, 100L);
                return;
            }
            this.f66034V0.removeMessages(1);
            int m121624Y = AbstractC23309i.m121624Y();
            C31890dc m140541R = this.f66028P0.m140541R();
            if (m140541R != null && m140541R.f146509o == m121624Y) {
                c31890dc = C31845ac.m152996J().m153028F(this.f66028P0.m140539P(), m140541R.f146495a, m140541R.f146509o, 1);
            } else {
                c31890dc = null;
            }
            if (c31890dc == null && m121624Y != -100 && z11) {
                c31890dc = C31845ac.m152996J().m153042U(this.f66028P0.m140539P(), m121624Y);
            }
            if (c31890dc == null || c31890dc.m153247r()) {
                C31890dc m108781R = AbstractC20826v0.m108781R(this.f72421L0.getContext());
                c31890dc = C31845ac.m152996J().m153028F(this.f66028P0.m140539P(), m108781R.f146495a, m108781R.f146509o, 1);
            }
            if (c31890dc == null || c31890dc.m153247r()) {
                c31890dc = C31845ac.m152996J().m153043V(this.f66028P0.m140539P());
            }
            if (c31890dc == null) {
                c31890dc = C31845ac.m152996J().m153020A();
            }
            m71393tM(c31890dc);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yM */
    void m71398yM(C31890dc c31890dc, int i11) {
        final int i12;
        Handler handler;
        try {
            C27477e c27477e = this.f66028P0;
            if (c27477e != null) {
                i12 = c27477e.m140540Q(c31890dc);
            } else {
                i12 = -1;
            }
            if (i12 != -1 && (handler = this.f66034V0) != null) {
                handler.postDelayed(new Runnable() { // from class: h90.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        BackgroundPickerView.this.m71383pM(i12);
                    }
                }, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 88);
    }

    /* renamed from: zM */
    public void m71399zM(InterfaceC12675c interfaceC12675c) {
        this.f66029Q0 = interfaceC12675c;
    }
}
