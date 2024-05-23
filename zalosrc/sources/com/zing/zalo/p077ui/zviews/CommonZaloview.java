package com.zing.zalo.p077ui.zviews;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.ProgressDialogNewView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.startup.StartupApplication;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import dg0.AbstractC17927b;
import ge0.C19433f;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import in.C20629c;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import li.AbstractC22490a;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p205hc.InterfaceC19970i;
import p304ks.AbstractC21935u;
import p363nh.C23744a;
import p494rv.C25979a;
import p716zh.C31877d;
import vg.AbstractC28207v1;
import vg.C28203u6;

/* loaded from: classes.dex */
public abstract class CommonZaloview extends ZaloViewNewActionBar implements InterfaceC19970i, C23744a.c {

    /* renamed from: A0 */
    protected ProgressDialogView f72826A0;

    /* renamed from: B0 */
    protected Handler f72827B0;

    /* renamed from: C0 */
    public CommonZaloview f72828C0;

    /* renamed from: D0 */
    public String f72829D0;

    /* renamed from: E0 */
    protected int f72830E0;

    /* renamed from: F0 */
    private View f72831F0;

    /* renamed from: G0 */
    protected Runnable f72832G0;

    /* renamed from: H0 */
    ProgressDialogView f72833H0;

    /* renamed from: I0 */
    String f72834I0;

    /* renamed from: J0 */
    String f72835J0;

    /* renamed from: K0 */
    private ProgressDialogNewView f72836K0;

    /* renamed from: z0 */
    protected int f72837z0;

    /* renamed from: com.zing.zalo.ui.zviews.CommonZaloview$a */
    /* loaded from: classes6.dex */
    public class C14172a extends AbstractC28207v1.g0 {

        /* renamed from: a */
        final /* synthetic */ int f72838a;

        /* renamed from: b */
        final /* synthetic */ String f72839b;

        /* renamed from: c */
        final /* synthetic */ String f72840c;

        C14172a(int i11, String str, String str2) {
            this.f72838a = i11;
            this.f72839b = str;
            this.f72840c = str2;
        }

        /* renamed from: x */
        public /* synthetic */ void m78976x() {
            CommonZaloview.this.m78966uL();
        }

        /* renamed from: y */
        public /* synthetic */ void m78977y(List list, int i11, int i12, String str, String str2) {
            CommonZaloview.this.m78967vL(list, i11, i12, str, str2);
        }

        /* renamed from: z */
        public /* synthetic */ void m78978z() {
            CommonZaloview.this.m78968wL(null);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: b */
        public void mo40737b(JSONObject jSONObject) {
            CommonZaloview.this.m78898AL(jSONObject, this.f72839b);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: d */
        public int mo40739d() {
            return super.mo40739d();
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: g */
        public void mo40742g() {
            CommonZaloview.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.c8
                public /* synthetic */ RunnableC15501c8() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CommonZaloview.C14172a.this.m78976x();
                }
            });
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: h */
        public void mo40743h() {
            CommonZaloview.this.m78964sL();
            CommonZaloview.this.m78931oL(this.f72839b);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: i */
        public void mo40744i() {
            CommonZaloview.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.a8
                public /* synthetic */ RunnableC15428a8() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CommonZaloview.C14172a.this.m78978z();
                }
            });
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: j */
        public void mo40745j(String str) {
            CommonZaloview.this.m78968wL(str);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: m */
        public void mo40748m(String str) {
            CommonZaloview.this.m78962rL(str, false);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: n */
        public void mo40749n(List list, int i11) {
            CommonZaloview.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.b8

                /* renamed from: q */
                public final /* synthetic */ List f79894q;

                /* renamed from: r */
                public final /* synthetic */ int f79895r;

                /* renamed from: s */
                public final /* synthetic */ int f79896s;

                /* renamed from: t */
                public final /* synthetic */ String f79897t;

                /* renamed from: u */
                public final /* synthetic */ String f79898u;

                public /* synthetic */ RunnableC15465b8(List list2, int i112, int i12, String str, String str2) {
                    r2 = list2;
                    r3 = i112;
                    r4 = i12;
                    r5 = str;
                    r6 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CommonZaloview.C14172a.this.m78977y(r2, r3, r4, r5, r6);
                }
            });
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: o */
        public void mo40750o() {
            CommonZaloview.this.m78971xL(this.f72840c);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: q */
        public void mo40752q(String str) {
            CommonZaloview.this.m78961qL(str);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: r */
        public void mo40753r(String str, String str2, String str3) {
            CommonZaloview.this.m78965tL(str2, str, this.f72838a, this.f72839b, this.f72840c, str3);
        }

        @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
        /* renamed from: s */
        public void mo40754s(String str) {
            CommonZaloview.this.m78962rL(str, true);
            CommonZaloview.this.mo78939UL(this.f72839b);
        }
    }

    public CommonZaloview() {
        this.f72837z0 = 1;
        this.f72827B0 = new Handler(Looper.getMainLooper());
        this.f72828C0 = this;
        this.f72829D0 = "";
        this.f72832G0 = new Runnable() { // from class: com.zing.zalo.ui.zviews.z7
            public /* synthetic */ RunnableC16403z7() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CommonZaloview.this.mo49315c4();
            }
        };
        this.f72833H0 = null;
        this.f72834I0 = "";
        this.f72835J0 = "";
        this.f72836K0 = null;
        m78930kL();
    }

    /* renamed from: AL */
    public void m78898AL(JSONObject jSONObject, String str) {
        if ("action.open.editstory".equals(str)) {
            try {
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.o7

                    /* renamed from: q */
                    public final /* synthetic */ long f81432q;

                    /* renamed from: r */
                    public final /* synthetic */ String f81433r;

                    /* renamed from: s */
                    public final /* synthetic */ String f81434s;

                    public /* synthetic */ RunnableC15971o7(long j11, String str2, String str3) {
                        r2 = j11;
                        r4 = str2;
                        r5 = str3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CommonZaloview.this.m78905JL(r2, r4, r5);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: BL */
    public void m78915RL(Boolean bool, String str) {
        ProgressDialogNewView.EnumC14810a enumC14810a;
        try {
            ProgressDialogNewView progressDialogNewView = this.f72836K0;
            if (progressDialogNewView != null && progressDialogNewView.m92595KK()) {
                ProgressDialogNewView progressDialogNewView2 = this.f72836K0;
                if (bool.booleanValue()) {
                    enumC14810a = ProgressDialogNewView.EnumC14810a.f76500q;
                } else {
                    enumC14810a = ProgressDialogNewView.EnumC14810a.f76501r;
                }
                progressDialogNewView2.m83095ZK(enumC14810a, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: EL */
    public /* synthetic */ void m78900EL() {
        try {
            ProgressDialogView progressDialogView = this.f72833H0;
            if (progressDialogView != null && progressDialogView.m92674mJ()) {
                this.f72833H0.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FL */
    public /* synthetic */ void m78901FL() {
        try {
            ProgressDialogNewView progressDialogNewView = this.f72836K0;
            if (progressDialogNewView != null && progressDialogNewView.m92595KK()) {
                this.f72836K0.dismiss();
                this.f72836K0 = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: GL */
    public /* synthetic */ void m78902GL() {
        try {
            ProgressDialogView progressDialogView = this.f72826A0;
            if (progressDialogView != null && progressDialogView.m92595KK()) {
                this.f72826A0.dismiss();
                this.f72826A0 = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: HL */
    public /* synthetic */ void m78903HL(String str) {
        if (m92687sJ() && this.f72835J0.equals(str)) {
            m78953iL();
            this.f72835J0 = "";
        }
    }

    /* renamed from: IL */
    public /* synthetic */ void m78904IL(InterfaceC17463d interfaceC17463d) {
        mo68807SL();
    }

    /* renamed from: JL */
    public /* synthetic */ void m78905JL(long j11, String str, String str2) {
        if (j11 != 100) {
            m78945aM(j11, str, str2);
        } else {
            m78953iL();
        }
    }

    /* renamed from: KL */
    public /* synthetic */ void m78906KL(InterfaceC17463d interfaceC17463d) {
        try {
            mo68807SL();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LL */
    public /* synthetic */ void m78907LL() {
        AbstractC20110a.m104535d("Call fireMainUILoadedEvent() from %s", this);
        StartupApplication.Companion.m56558a().m56553l(null);
    }

    /* renamed from: ML */
    public /* synthetic */ void m78908ML(InterfaceC17463d interfaceC17463d) {
        this.f72834I0 = "";
    }

    /* renamed from: NL */
    public static /* synthetic */ void m78909NL(String str, String str2) {
        C20629c.m107448k().m107452f(str, str2);
    }

    /* renamed from: OL */
    public static /* synthetic */ void m78910OL(String str, String str2, InterfaceC17463d interfaceC17463d) {
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.q7

            /* renamed from: p */
            public final /* synthetic */ String f81677p;

            /* renamed from: q */
            public final /* synthetic */ String f81678q;

            public /* synthetic */ RunnableC16046q7(String str3, String str22) {
                r1 = str3;
                r2 = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CommonZaloview.m78909NL(r1, r2);
            }
        });
    }

    /* renamed from: kL */
    private void m78930kL() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            AbstractC20110a.m104539h(new IllegalStateException("new BaseZaloView must be called on the main thread"));
        }
    }

    /* renamed from: oL */
    public void m78931oL(String str) {
        if (str.equals("action.open.editstory")) {
            m78953iL();
        }
    }

    /* renamed from: yL */
    public void m78911PL(String str, Boolean bool) {
        try {
            ProgressDialogNewView progressDialogNewView = this.f72836K0;
            if (progressDialogNewView != null && progressDialogNewView.m92595KK()) {
                this.f72836K0.dismiss();
                this.f72836K0 = null;
            }
            if (this.f72836K0 == null) {
                this.f72836K0 = new ProgressDialogNewView();
            }
            this.f72836K0.mo43041MK(bool.booleanValue());
            if (!str.isEmpty()) {
                this.f72836K0.m83094YK(str);
            }
            this.f72836K0.mo83093TK(this.f72828C0.m92649TI());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zL */
    public void m78913QL(CharSequence charSequence, boolean z11) {
        try {
            ProgressDialogView progressDialogView = this.f72826A0;
            if (progressDialogView != null && progressDialogView.m92595KK()) {
                this.f72826A0.dismiss();
                this.f72826A0 = null;
            }
            if (this.f72826A0 == null) {
                this.f72826A0 = new ProgressDialogView();
            }
            this.f72826A0.mo43041MK(z11);
            this.f72826A0.m92596NK(z11);
            if (charSequence != null) {
                if (charSequence.length() > 0) {
                    this.f72826A0.m83097WK(charSequence);
                }
            } else {
                this.f72826A0.m83097WK(AbstractC23136l9.m118743r0(AbstractC8020f0.PROCESSING));
            }
            this.f72826A0.mo83093TK(m92649TI());
            this.f72826A0.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.m7
                public /* synthetic */ C15879m7() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    CommonZaloview.this.m78904IL(interfaceC17463d);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: B8 */
    public void mo49282B8(CharSequence charSequence, boolean z11) {
        if (AbstractC19444a.m101693a()) {
            m78913QL(charSequence, z11);
        } else {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.v7

                /* renamed from: q */
                public final /* synthetic */ CharSequence f82389q;

                /* renamed from: r */
                public final /* synthetic */ boolean f82390r;

                public /* synthetic */ RunnableC16255v7(CharSequence charSequence2, boolean z112) {
                    r2 = charSequence2;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CommonZaloview.this.m78913QL(r2, r3);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        AbstractC22490a.m116281d("create " + getClass().getName());
    }

    /* renamed from: CL */
    public boolean m78934CL(int i11, KeyEvent keyEvent) {
        if (m78958nL() != null && m78958nL().onKeyUp(i11, keyEvent)) {
            m78943YL(null);
            return true;
        }
        return false;
    }

    /* renamed from: DL */
    public boolean m78935DL() {
        ProgressDialogView progressDialogView = this.f72826A0;
        if (progressDialogView != null && progressDialogView.m92595KK()) {
            return true;
        }
        return false;
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: E */
    public void mo78936E(String str) {
        ToastUtils.showMess(str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        AbstractC22490a.m116281d("destroy " + getClass().getName());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IK */
    protected final void mo78937IK(Bundle bundle) {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
    }

    @Override // p205hc.InterfaceC19970i
    /* renamed from: Pn */
    public void mo78938Pn(String str) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && actionBar.getTitleTextView() != null) {
            this.f88760a0.getTitleTextView().setText(str);
        }
    }

    /* renamed from: SL */
    public void mo68807SL() {
    }

    /* renamed from: TL */
    protected List mo78192TL() {
        return new ArrayList();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        Iterator it = mo78192TL().iterator();
        while (it.hasNext()) {
            C23744a.m124114c().m124115b(this, ((Integer) it.next()).intValue());
        }
        AbstractC17927b.m94533b().mo94531e(new Runnable() { // from class: com.zing.zalo.ui.zviews.y7
            public /* synthetic */ RunnableC16366y7() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CommonZaloview.this.m78907LL();
            }
        }, 500L);
    }

    /* renamed from: UL */
    public void mo78939UL(String str) {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        Iterator it = mo78192TL().iterator();
        while (it.hasNext()) {
            C23744a.m124114c().m124117e(this, ((Integer) it.next()).intValue());
        }
    }

    /* renamed from: VL */
    public void m78940VL(int i11) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackgroundColor(i11);
        }
    }

    /* renamed from: WL */
    public void m78941WL(int i11) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackgroundResource(i11);
        }
    }

    /* renamed from: XL */
    public void m78942XL(int i11) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && actionBar.getTitleTextView() != null) {
            this.f88760a0.getTitleTextView().setTextColor(i11);
        }
    }

    /* renamed from: Y */
    public void mo46829Y() {
        mo49282B8(null, true);
    }

    /* renamed from: YL */
    public void m78943YL(View view) {
        this.f72831F0 = view;
    }

    /* renamed from: ZL */
    public void m78944ZL() {
        try {
            if (this.f72833H0 == null) {
                ProgressDialogView progressDialogView = new ProgressDialogView();
                this.f72833H0 = progressDialogView;
                progressDialogView.mo43041MK(true);
                this.f72833H0.m83097WK(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                this.f72833H0.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.l7
                    public /* synthetic */ C15842l7() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        CommonZaloview.this.m78908ML(interfaceC17463d);
                    }
                });
            }
            this.f72833H0.mo83093TK(this.f72828C0.m92649TI());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aM */
    void m78945aM(long j11, String str, String str2) {
        try {
            if (this.f72833H0 == null) {
                ProgressDialogView progressDialogView = new ProgressDialogView();
                this.f72833H0 = progressDialogView;
                progressDialogView.m92596NK(false);
            }
            this.f72833H0.m83097WK(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing) + " " + j11 + "%");
            if (!this.f72833H0.m92595KK()) {
                this.f72833H0.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.p7

                    /* renamed from: p */
                    public final /* synthetic */ String f81557p;

                    /* renamed from: q */
                    public final /* synthetic */ String f81558q;

                    public /* synthetic */ C16009p7(String str3, String str22) {
                        r1 = str3;
                        r2 = str22;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        CommonZaloview.m78910OL(r1, r2, interfaceC17463d);
                    }
                });
                this.f72833H0.mo83093TK(this.f72828C0.m92649TI());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bM */
    public void m78946bM(String str, Boolean bool) {
        if (AbstractC19444a.m101693a()) {
            m78911PL(str, bool);
        } else {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.s7

                /* renamed from: q */
                public final /* synthetic */ String f81901q;

                /* renamed from: r */
                public final /* synthetic */ Boolean f81902r;

                public /* synthetic */ RunnableC16121s7(String str2, Boolean bool2) {
                    r2 = str2;
                    r3 = bool2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CommonZaloview.this.m78911PL(r2, r3);
                }
            });
        }
    }

    @Override // p205hc.InterfaceC19970i
    /* renamed from: bg */
    public boolean mo78947bg() {
        return m92677nJ();
    }

    /* renamed from: c4 */
    public void mo49315c4() {
        try {
            if (m92648SI() != null && this.f72826A0 != null) {
                this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.t7
                    public /* synthetic */ RunnableC16181t7() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CommonZaloview.this.m78902GL();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: cM */
    public void m78948cM(Boolean bool, String str) {
        if (AbstractC19444a.m101693a()) {
            m78915RL(bool, str);
        } else {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.n7

                /* renamed from: q */
                public final /* synthetic */ Boolean f81320q;

                /* renamed from: r */
                public final /* synthetic */ String f81321r;

                public /* synthetic */ RunnableC15934n7(Boolean bool2, String str2) {
                    r2 = bool2;
                    r3 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CommonZaloview.this.m78915RL(r2, r3);
                }
            });
        }
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: ch */
    public void mo78949ch(boolean z11, String str) {
        ToastUtils.showMess(z11, str);
    }

    @Override // p205hc.InterfaceC19970i
    /* renamed from: cq */
    public void mo78950cq(CharSequence charSequence) {
        mo49282B8(charSequence, true);
    }

    /* renamed from: gL */
    public ActionBarMenuItem m78951gL(int i11, int i12) {
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            return actionBarMenu.m92738e(i11, i12);
        }
        return null;
    }

    /* renamed from: h0 */
    public boolean mo45894h0() {
        return m92672lJ();
    }

    /* renamed from: hL */
    public ActionBarMenuItem m78952hL(int i11, Drawable drawable) {
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            return actionBarMenu.m92748p(i11, AbstractC7409c0.action_menu_item_layout, drawable);
        }
        return null;
    }

    /* renamed from: iL */
    public void m78953iL() {
        try {
            if (this.f72828C0.m92648SI() != null && this.f72833H0 != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zing.zalo.ui.zviews.u7
                    public /* synthetic */ RunnableC16218u7() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CommonZaloview.this.m78900EL();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jL */
    public void m78954jL() {
        try {
            if (m92648SI() != null && this.f72836K0 != null) {
                this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.w7
                    public /* synthetic */ RunnableC16292w7() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CommonZaloview.this.m78901FL();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: jx */
    public void mo59032jx(int i11) {
        ToastUtils.m89266n(i11, new Object[0]);
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: kl */
    public void mo78955kl(Runnable runnable, long j11) {
        this.f72827B0.postDelayed(runnable, j11);
    }

    /* renamed from: lL */
    public Context m78956lL() {
        Context context = getContext();
        if (context == null) {
            try {
                return MainApplication.getAppContext();
            } catch (Exception e11) {
                e11.printStackTrace();
                return context;
            }
        }
        return context;
    }

    /* renamed from: mL */
    public int m78957mL() {
        return this.f72830E0;
    }

    /* renamed from: nL */
    public View m78958nL() {
        return this.f72831F0;
    }

    @Override // com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i11 = this.f72837z0;
        int i12 = configuration.orientation;
        if (i11 != i12) {
            this.f72837z0 = i12;
            ActionBarMenu actionBarMenu = this.f88763d0;
            if (actionBarMenu != null) {
                actionBarMenu.m92753w();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (C25979a.m133814e(this, i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: pL */
    public void m78959pL(String str, String str2, int i11, C31877d c31877d) {
        try {
            AbstractC28207v1.m141984g3(str, i11, this.f72828C0.m92676n2(), this, str2, new C14172a(i11, str, str2), c31877d);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p205hc.InterfaceC19970i
    /* renamed from: q3 */
    public void mo78960q3() {
        mo70710wy(this.f72832G0);
    }

    /* renamed from: qL */
    public void m78961qL(String str) {
        try {
            if (m92687sJ()) {
                this.f72835J0 = str;
                m78944ZL();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m78953iL();
        }
    }

    /* renamed from: rL */
    public void m78962rL(String str, boolean z11) {
        try {
            this.f72828C0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.x7

                /* renamed from: q */
                public final /* synthetic */ String f82606q;

                public /* synthetic */ RunnableC16329x7(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CommonZaloview.this.m78903HL(r2);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
            m78953iL();
        }
    }

    @Override // p205hc.InterfaceC19967f
    public boolean removeCallbacks(Runnable runnable) {
        this.f72827B0.removeCallbacks(runnable);
        return true;
    }

    @Override // p205hc.InterfaceC19970i
    /* renamed from: ru */
    public boolean mo78963ru() {
        if (m92674mJ() && !m92681pJ()) {
            return true;
        }
        return false;
    }

    /* renamed from: sL */
    public void m78964sL() {
        try {
            if (m92687sJ()) {
                m78953iL();
                this.f72834I0 = "";
                ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m78953iL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000e, B:20:0x005a, B:22:0x0062, B:25:0x006b, B:26:0x006f, B:28:0x0079, B:29:0x007c, B:35:0x0056, B:38:0x008c, B:40:0x0098, B:42:0x00ac, B:43:0x00af, B:45:0x00b5, B:47:0x00c0, B:48:0x00c9, B:50:0x00d1, B:53:0x00dc, B:55:0x00e4, B:57:0x00ef, B:60:0x0026, B:63:0x0033), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000e, B:20:0x005a, B:22:0x0062, B:25:0x006b, B:26:0x006f, B:28:0x0079, B:29:0x007c, B:35:0x0056, B:38:0x008c, B:40:0x0098, B:42:0x00ac, B:43:0x00af, B:45:0x00b5, B:47:0x00c0, B:48:0x00c9, B:50:0x00d1, B:53:0x00dc, B:55:0x00e4, B:57:0x00ef, B:60:0x0026, B:63:0x0033), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000e, B:20:0x005a, B:22:0x0062, B:25:0x006b, B:26:0x006f, B:28:0x0079, B:29:0x007c, B:35:0x0056, B:38:0x008c, B:40:0x0098, B:42:0x00ac, B:43:0x00af, B:45:0x00b5, B:47:0x00c0, B:48:0x00c9, B:50:0x00d1, B:53:0x00dc, B:55:0x00e4, B:57:0x00ef, B:60:0x0026, B:63:0x0033), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000e, B:20:0x005a, B:22:0x0062, B:25:0x006b, B:26:0x006f, B:28:0x0079, B:29:0x007c, B:35:0x0056, B:38:0x008c, B:40:0x0098, B:42:0x00ac, B:43:0x00af, B:45:0x00b5, B:47:0x00c0, B:48:0x00c9, B:50:0x00d1, B:53:0x00dc, B:55:0x00e4, B:57:0x00ef, B:60:0x0026, B:63:0x0033), top: B:1:0x0000 }] */
    /* renamed from: tL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m78965tL(String str, String str2, int i11, String str3, String str4, String str5) {
        char c11;
        boolean z11;
        JSONObject jSONObject;
        try {
            if (m92687sJ() && str.equals(this.f72834I0)) {
                m78953iL();
                this.f72834I0 = "";
                int hashCode = str3.hashCode();
                if (hashCode != -987623510) {
                    if (hashCode == 457856844 && str3.equals("action.open.sharesheet")) {
                        c11 = 1;
                        JSONObject jSONObject2 = null;
                        if (c11 == 0) {
                            if (c11 == 1) {
                                try {
                                    jSONObject = new JSONObject(str4);
                                    try {
                                        jSONObject.put("dataPath", str2);
                                    } catch (Exception e11) {
                                        e = e11;
                                        jSONObject2 = jSONObject;
                                        e.printStackTrace();
                                        jSONObject = jSONObject2;
                                        Bundle bundle = new Bundle();
                                        if (i11 == 4) {
                                        }
                                        if (jSONObject != null) {
                                        }
                                        bundle.putString("action_list", str4);
                                        bundle.putBoolean("bol_share_in_app", true);
                                        if (str5 != null) {
                                        }
                                        this.f72828C0.m92676n2().mo35579p().m93069k2(ShareView.class, bundle, 1, true);
                                        return;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                }
                                Bundle bundle2 = new Bundle();
                                if (i11 == 4) {
                                    bundle2.putBoolean("extra_share_from_feed", true);
                                }
                                if (jSONObject != null) {
                                    str4 = jSONObject.toString();
                                }
                                bundle2.putString("action_list", str4);
                                bundle2.putBoolean("bol_share_in_app", true);
                                if (str5 != null) {
                                    bundle2.putString("extra_action_list_task_id", str5);
                                }
                                this.f72828C0.m92676n2().mo35579p().m93069k2(ShareView.class, bundle2, 1, true);
                                return;
                            }
                            return;
                        }
                        C17487o0 mo35579p = this.f72828C0.m92676n2().mo35579p();
                        if (mo35579p != null) {
                            Bundle bundle3 = new Bundle();
                            ArrayList<String> arrayList = new ArrayList<>();
                            arrayList.add(str2);
                            bundle3.putStringArrayList("path", arrayList);
                            if (str5 != null) {
                                bundle3.putString("extra_action_list_task_id", str5);
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                JSONObject jSONObject3 = new JSONObject(str4);
                                TrackingSource m108802c0 = AbstractC20826v0.m108802c0(jSONObject3, null);
                                if (m108802c0 != null) {
                                    bundle3.putString("extra_tracking_source", m108802c0.m40686z());
                                }
                                JSONObject optJSONObject = jSONObject3.optJSONObject("music");
                                if (optJSONObject != null) {
                                    if (optJSONObject.optInt("openPlaylist", 0) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    int optInt = optJSONObject.optInt("cate", 0);
                                    if (z11) {
                                        bundle3.putInt("extra_from_feed_remind_media_type", 3);
                                        bundle3.putInt("EXTRA_PARAM_CATE_FOCUS", optInt);
                                    }
                                }
                            }
                            mo35579p.m93069k2(UpdateStatusView.class, bundle3, AbstractC10919t.fadein, true);
                            return;
                        }
                        return;
                    }
                    c11 = 65535;
                    JSONObject jSONObject22 = null;
                    if (c11 == 0) {
                    }
                } else {
                    if (str3.equals("action.open.postfeed")) {
                        c11 = 0;
                        JSONObject jSONObject222 = null;
                        if (c11 == 0) {
                        }
                    }
                    c11 = 65535;
                    JSONObject jSONObject2222 = null;
                    if (c11 == 0) {
                    }
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
            m78953iL();
        }
    }

    /* renamed from: uL */
    public void m78966uL() {
        try {
            if (m92687sJ()) {
                m78953iL();
                this.f72834I0 = "";
                ToastUtils.m89266n(AbstractC8020f0.str_all_photos_can_not_be_downloaded, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m78953iL();
        }
    }

    /* renamed from: vL */
    public void m78967vL(List list, int i11, int i12, String str, String str2) {
        try {
            if (this.f72828C0.m92676n2().mo35579p() != null) {
                m78953iL();
                String str3 = "";
                if (i11 - list.size() > 0 && this.f72828C0.m92648SI() != null) {
                    str3 = this.f72828C0.m92648SI().getResources().getQuantityString(AbstractC7921d0.plural_error_download, i11 - list.size(), Integer.valueOf(i11 - list.size()));
                }
                new C19433f().m101508a(new C19433f.a(this.f72828C0.m92676n2(), str2, list, "", str3));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m78953iL();
        }
    }

    /* renamed from: wL */
    public void m78968wL(String str) {
        try {
            if (m92687sJ()) {
                this.f72834I0 = str;
                m78944ZL();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m78953iL();
        }
    }

    @Override // p205hc.InterfaceC19970i
    /* renamed from: we */
    public void mo78969we(int i11) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && actionBar.getTitleTextView() != null) {
            this.f88760a0.getTitleTextView().setCompoundDrawablePadding(i11);
        }
    }

    @Override // p205hc.InterfaceC19970i
    /* renamed from: wq */
    public void mo78970wq(boolean z11) {
        int i11;
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            actionBar.setVisibility(i11);
        }
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: wy */
    public void mo70710wy(Runnable runnable) {
        if (m92676n2() != null) {
            m92676n2().runOnUiThread(runnable);
        }
    }

    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle != null) {
            try {
                ZaloView m92996E0 = m92649TI().m92996E0("ProgressDialogView");
                if (m92996E0 instanceof ProgressDialogView) {
                    ProgressDialogView progressDialogView = (ProgressDialogView) m92996E0;
                    progressDialogView.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.r7
                        public /* synthetic */ C16083r7() {
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                        /* renamed from: p7 */
                        public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                            CommonZaloview.this.m78906KL(interfaceC17463d);
                        }
                    });
                    progressDialogView.dismiss();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: xL */
    public void m78971xL(String str) {
        try {
            if (m92687sJ()) {
                String str2 = "";
                try {
                    str2 = new JSONObject(str).getString("touserid");
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                ContactProfile m141809c = C28203u6.f131407a.m141809c(str2);
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_send_sticker);
                if (m141809c != null) {
                    m118743r0 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_send_sticker_for), AbstractC21935u.m114542i(str2, m141809c.mo2475c()));
                }
                ToastUtils.showMess(m118743r0);
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // p205hc.InterfaceC19970i
    /* renamed from: xi */
    public void mo78972xi(int i11, int i12, int i13, int i14) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && actionBar.getTitleTextView() != null) {
            this.f88760a0.getTitleTextView().setCompoundDrawablesWithIntrinsicBounds(i11, i12, i13, i14);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zK */
    public void mo60305zK(Bundle bundle) {
        super.mo60305zK(bundle);
        if (bundle != null && bundle.containsKey("SOURCE_ACTION")) {
            this.f72829D0 = bundle.getString("SOURCE_ACTION");
        }
    }

    public CommonZaloview(int i11) {
        super(i11);
        this.f72837z0 = 1;
        this.f72827B0 = new Handler(Looper.getMainLooper());
        this.f72828C0 = this;
        this.f72829D0 = "";
        this.f72832G0 = new Runnable() { // from class: com.zing.zalo.ui.zviews.z7
            public /* synthetic */ RunnableC16403z7() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CommonZaloview.this.mo49315c4();
            }
        };
        this.f72833H0 = null;
        this.f72834I0 = "";
        this.f72835J0 = "";
        this.f72836K0 = null;
        m78930kL();
    }
}
