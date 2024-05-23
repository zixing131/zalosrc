package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import au.AbstractC2338b0;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.GameManageDetailView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.Serializable;
import me0.C23278z2;
import mm0.AbstractC23350e;
import ms.C23438d;
import org.json.JSONObject;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p402os.C24546a;
import p402os.C24547b;

/* loaded from: classes6.dex */
public class GameManageDetailView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: l1 */
    protected static final String f73450l1 = "GameManageDetailView";

    /* renamed from: P0 */
    StencilSwitch f73451P0;

    /* renamed from: Q0 */
    RecyclingImageView f73452Q0;

    /* renamed from: R0 */
    TextView f73453R0;

    /* renamed from: S0 */
    TextView f73454S0;

    /* renamed from: T0 */
    C8009j f73455T0;

    /* renamed from: U0 */
    View f73456U0;

    /* renamed from: V0 */
    View f73457V0;

    /* renamed from: a1 */
    C23528a f73462a1;

    /* renamed from: b1 */
    C23438d f73463b1;

    /* renamed from: c1 */
    C24546a f73464c1;

    /* renamed from: d1 */
    C24546a f73465d1;

    /* renamed from: W0 */
    InterfaceC0765j f73458W0 = new C0766k();

    /* renamed from: X0 */
    InterfaceC0765j f73459X0 = new C0766k();

    /* renamed from: Y0 */
    InterfaceC0765j f73460Y0 = new C0766k();

    /* renamed from: Z0 */
    InterfaceC0765j f73461Z0 = new C0766k();

    /* renamed from: e1 */
    boolean f73466e1 = false;

    /* renamed from: f1 */
    boolean f73467f1 = false;

    /* renamed from: g1 */
    boolean f73468g1 = true;

    /* renamed from: h1 */
    InterfaceC20094a f73469h1 = new C14292a();

    /* renamed from: i1 */
    InterfaceC20094a f73470i1 = new C14293b();

    /* renamed from: j1 */
    InterfaceC20094a f73471j1 = new C14294c();

    /* renamed from: k1 */
    InterfaceC20094a f73472k1 = new C14295d();

    /* renamed from: com.zing.zalo.ui.zviews.GameManageDetailView$a */
    /* loaded from: classes6.dex */
    public class C14292a implements InterfaceC20094a {
        C14292a() {
        }

        /* renamed from: d */
        public /* synthetic */ void m79824d() {
            GameManageDetailView gameManageDetailView = GameManageDetailView.this;
            gameManageDetailView.f73468g1 = false;
            gameManageDetailView.m79816S1();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m92652XI;
            if (c20096c != null) {
                String str = GameManageDetailView.f73450l1;
                c20096c.m104492d();
            }
            if (GameManageDetailView.this.f72421L0.m92674mJ() && !GameManageDetailView.this.f72421L0.m92677nJ()) {
                if (c20096c != null) {
                    try {
                        if (c20096c.m104490b() != null) {
                            GameManageDetailView.this.f73464c1.m127889t(new JSONObject(c20096c.m104490b()));
                            GameManageDetailView.this.m79819qM();
                            return;
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(GameManageDetailView.f73450l1, e11);
                    }
                }
                if (c20096c != null) {
                    m92652XI = c20096c.m104492d();
                } else {
                    m92652XI = GameManageDetailView.this.f72421L0.m92652XI(AbstractC8020f0.unknown_error);
                }
                ToastUtils.showMess(m92652XI);
                GameManageDetailView.this.finish();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str = GameManageDetailView.f73450l1;
            obj.toString();
            if (GameManageDetailView.this.f72421L0.m92674mJ() && !GameManageDetailView.this.f72421L0.m92677nJ() && GameManageDetailView.this.f73464c1 != null) {
                try {
                    GameManageDetailView.this.f73464c1.m127889t(new JSONObject(obj.toString()).getJSONObject("data"));
                    GameManageDetailView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.eg
                        public /* synthetic */ RunnableC15587eg() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GameManageDetailView.C14292a.this.m79824d();
                        }
                    });
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(GameManageDetailView.f73450l1, e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GameManageDetailView$b */
    /* loaded from: classes6.dex */
    class C14293b implements InterfaceC20094a {
        C14293b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24546a c24546a;
            try {
                String str = GameManageDetailView.f73450l1;
                c20096c.m104492d();
                GameManageDetailView gameManageDetailView = GameManageDetailView.this;
                gameManageDetailView.f73467f1 = false;
                if (gameManageDetailView.f72421L0.m92674mJ() && !GameManageDetailView.this.f72421L0.m92677nJ() && (c24546a = GameManageDetailView.this.f73464c1) != null) {
                    if (c24546a.m127881l()) {
                        ToastUtils.m89266n(AbstractC8020f0.game_manage_detail_block_status_pulling_block_error_message, new Object[0]);
                    } else {
                        ToastUtils.m89266n(AbstractC8020f0.game_manage_detail_block_status_pulling_unblock_error_message, new Object[0]);
                    }
                    GameManageDetailView.this.f73464c1.m127884o(!r2.m127881l());
                    GameManageDetailView.this.m79819qM();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageDetailView.f73450l1, e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C24546a c24546a;
            try {
                String str = GameManageDetailView.f73450l1;
                obj.toString();
                GameManageDetailView gameManageDetailView = GameManageDetailView.this;
                gameManageDetailView.f73467f1 = false;
                if (gameManageDetailView.f72421L0.m92674mJ() && !GameManageDetailView.this.f72421L0.m92677nJ() && (c24546a = GameManageDetailView.this.f73464c1) != null) {
                    if (c24546a.m127881l()) {
                        ToastUtils.m89266n(AbstractC8020f0.game_manage_detail_block_status_pulling_block_success_message, new Object[0]);
                    } else {
                        ToastUtils.m89266n(AbstractC8020f0.game_manage_detail_block_status_pulling_unblock_success_message, new Object[0]);
                    }
                    GameManageDetailView.this.f72421L0.mo50035CK(-1, null);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageDetailView.f73450l1, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GameManageDetailView$c */
    /* loaded from: classes6.dex */
    class C14294c implements InterfaceC20094a {
        C14294c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                String str = GameManageDetailView.f73450l1;
                c20096c.m104492d();
                GameManageDetailView gameManageDetailView = GameManageDetailView.this;
                gameManageDetailView.f73466e1 = false;
                if (gameManageDetailView.f72421L0.m92674mJ() && !GameManageDetailView.this.f72421L0.m92677nJ()) {
                    GameManageDetailView gameManageDetailView2 = GameManageDetailView.this;
                    if (gameManageDetailView2.f73464c1 != null) {
                        gameManageDetailView2.f73464c1 = gameManageDetailView2.f73465d1;
                        gameManageDetailView2.m79819qM();
                        ToastUtils.m89266n(AbstractC8020f0.authorised_app_detail_save_error, new Object[0]);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageDetailView.f73450l1, e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                String str = GameManageDetailView.f73450l1;
                obj.toString();
                GameManageDetailView gameManageDetailView = GameManageDetailView.this;
                gameManageDetailView.f73466e1 = false;
                if (gameManageDetailView.f72421L0.m92674mJ() && !GameManageDetailView.this.f72421L0.m92677nJ() && GameManageDetailView.this.f73464c1 != null) {
                    ToastUtils.m89266n(AbstractC8020f0.authorised_app_detail_save_done, new Object[0]);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageDetailView.f73450l1, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GameManageDetailView$d */
    /* loaded from: classes6.dex */
    class C14295d implements InterfaceC20094a {
        C14295d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str = GameManageDetailView.f73450l1;
            c20096c.m104492d();
            if (GameManageDetailView.this.f72421L0.m92674mJ() && !GameManageDetailView.this.f72421L0.m92677nJ()) {
                ToastUtils.m89266n(AbstractC8020f0.authorised_app_detail_unauthorize_error, new Object[0]);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                String str = GameManageDetailView.f73450l1;
                obj.toString();
                if (GameManageDetailView.this.f72421L0.m92674mJ() && !GameManageDetailView.this.f72421L0.m92677nJ()) {
                    ToastUtils.m89266n(AbstractC8020f0.authorised_app_detail_unauthorize_done, new Object[0]);
                    GameManageDetailView.this.f72421L0.mo50035CK(-1, null);
                    GameManageDetailView.this.finish();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageDetailView.f73450l1, e11);
            }
        }
    }

    /* renamed from: kM */
    public /* synthetic */ void m79812kM(CompoundButton compoundButton, boolean z11) {
        if (this.f73468g1) {
            AbstractC23647d.m123906p("550073");
            AbstractC23647d.m123893c();
        }
        C24546a c24546a = this.f73464c1;
        if (c24546a != null && !this.f73467f1 && z11 == c24546a.m127881l()) {
            this.f73464c1.m127884o(!r2.m127881l());
            m79818pM();
            m79816S1();
        }
    }

    /* renamed from: lM */
    public /* synthetic */ void m79813lM(C24547b c24547b) {
        if (!this.f73466e1 && this.f73464c1 != null && c24547b.m127897c()) {
            m79821sM();
            c24547b.m127899f(!c24547b.m127898d());
            m79816S1();
            m79820rM();
        }
    }

    /* renamed from: mM */
    public /* synthetic */ void m79814mM(C24547b c24547b, boolean z11) {
        if (!this.f73466e1 && this.f73464c1 != null && c24547b.m127897c() && z11 != c24547b.m127898d()) {
            m79821sM();
            c24547b.m127899f(z11);
            m79816S1();
            m79820rM();
        }
    }

    /* renamed from: nM */
    public /* synthetic */ void m79815nM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        this.f73461Z0.mo1691ma(this.f73464c1.m127871b());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        if (this.f72421L0.m92642L3() != null) {
            Serializable serializable = this.f72421L0.m92642L3().getSerializable("com.zing.zalo.game.EXTRA_GAME_OBJECT");
            if (serializable instanceof C24546a) {
                this.f73464c1 = (C24546a) serializable;
            }
        }
        this.f73460Y0.mo1704o8(this.f73471j1);
        this.f73461Z0.mo1704o8(this.f73472k1);
        this.f73458W0.mo1704o8(this.f73469h1);
        this.f73459X0.mo1704o8(this.f73470i1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.game_manage_detail_view, viewGroup, false);
        this.f73452Q0 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.authorised_app_detail_logo);
        this.f73453R0 = (TextView) inflate.findViewById(AbstractC6918a0.authorised_app_detail_name);
        this.f73454S0 = (TextView) inflate.findViewById(AbstractC6918a0.authorised_app_detail_company);
        this.f73456U0 = inflate.findViewById(AbstractC6918a0.loading_layout);
        this.f73457V0 = inflate.findViewById(AbstractC6918a0.authorised_app_permission_session_container);
        View findViewById = inflate.findViewById(AbstractC6918a0.authorization_app_receive_notification_layout);
        this.f73451P0 = (StencilSwitch) inflate.findViewById(AbstractC6918a0.authorization_app_receive_notification_checkbox);
        this.f73463b1 = new C23438d(this.f72421L0.m92648SI(), (ViewGroup) inflate.findViewById(AbstractC6918a0.authorization_app_permission_container));
        findViewById.setOnClickListener(this);
        this.f73451P0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.bg
            public /* synthetic */ C15473bg() {
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                GameManageDetailView.this.m79812kM(compoundButton, z11);
            }
        });
        this.f73463b1.m123101k(new C23438d.d() { // from class: com.zing.zalo.ui.zviews.cg
            public /* synthetic */ C15509cg() {
            }

            @Override // ms.C23438d.d
            /* renamed from: a */
            public final void mo87276a(C24547b c24547b) {
                GameManageDetailView.this.m79813lM(c24547b);
            }
        });
        this.f73463b1.m123100j(new C23438d.c() { // from class: com.zing.zalo.ui.zviews.dg
            public /* synthetic */ C15550dg() {
            }

            @Override // ms.C23438d.c
            /* renamed from: a */
            public final void mo87295a(C24547b c24547b, boolean z11) {
                GameManageDetailView.this.m79814mM(c24547b, z11);
            }
        });
        inflate.findViewById(AbstractC6918a0.authorised_app_detail_action_unauthen_btn).setOnClickListener(this);
        return inflate;
    }

    /* renamed from: S1 */
    public void m79816S1() {
        try {
            if (this.f73464c1 == null) {
                this.f73456U0.setVisibility(0);
                return;
            }
            this.f73456U0.setVisibility(8);
            if (this.f73464c1.m127877h() != null && this.f73464c1.m127877h().size() != 0) {
                this.f73457V0.setVisibility(0);
                this.f73451P0.setChecked(!this.f73464c1.m127881l());
                this.f73463b1.m35953b();
                this.f73463b1.m35952a(this.f73464c1.m127877h());
                this.f73463b1.m123102l();
                this.f73453R0.setText(this.f73464c1.m127875f());
                this.f73454S0.setText(this.f73464c1.m127873d());
                ((C23528a) this.f73462a1.m123612r(this.f73452Q0)).m123618x(this.f73464c1.m127874e(), C23278z2.m120107Y0());
            }
            this.f73457V0.setVisibility(8);
            this.f73451P0.setChecked(!this.f73464c1.m127881l());
            this.f73463b1.m35953b();
            this.f73463b1.m35952a(this.f73464c1.m127877h());
            this.f73463b1.m123102l();
            this.f73453R0.setText(this.f73464c1.m127875f());
            this.f73454S0.setText(this.f73464c1.m127873d());
            ((C23528a) this.f73462a1.m123612r(this.f73452Q0)).m123618x(this.f73464c1.m127874e(), C23278z2.m120107Y0());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f73450l1, e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(this.f72421L0.m92652XI(AbstractC8020f0.game_manage_detail_activity_title));
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f73455T0;
        if (c8009j != null && c8009j.m92868m()) {
            this.f73455T0.dismiss();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f73450l1;
    }

    /* renamed from: oM */
    void m79817oM() {
        C24546a c24546a = this.f73464c1;
        if (c24546a == null) {
            return;
        }
        this.f73458W0.mo1391Aa(c24546a.m127871b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.authorization_app_receive_notification_layout) {
            C24546a c24546a = this.f73464c1;
            if (c24546a != null && !this.f73467f1) {
                c24546a.m127884o(!c24546a.m127881l());
                m79818pM();
                this.f73468g1 = true;
                m79816S1();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.authorised_app_detail_action_unauthen_btn) {
            m79822tM();
        }
    }

    /* renamed from: pM */
    void m79818pM() {
        C24546a c24546a = this.f73464c1;
        if (c24546a == null) {
            return;
        }
        this.f73467f1 = true;
        this.f73459X0.mo1397B8(c24546a.m127871b(), this.f73464c1.m127881l());
    }

    /* renamed from: qM */
    void m79819qM() {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.zf
            public /* synthetic */ RunnableC16411zf() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GameManageDetailView.this.m79816S1();
            }
        });
    }

    /* renamed from: rM */
    void m79820rM() {
        try {
            if (this.f73466e1) {
                return;
            }
            this.f73466e1 = true;
            this.f73460Y0.mo1535S9(this.f73464c1.m127871b(), C24547b.m127894a(this.f73464c1.m127877h()));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f73450l1, e11);
            this.f73466e1 = false;
        }
    }

    /* renamed from: sM */
    void m79821sM() {
        try {
            if (this.f73466e1) {
                return;
            }
            this.f73465d1 = (C24546a) AbstractC2338b0.m12294a(this.f73464c1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f73450l1, e11);
        }
    }

    /* renamed from: tM */
    void m79822tM() {
        if (this.f73464c1 == null) {
            return;
        }
        try {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(5).m43162k(this.f72421L0.m92652XI(AbstractC8020f0.authorised_app_detail_unauthorize_warning_message)).m43165n(this.f72421L0.m92652XI(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(this.f72421L0.m92652XI(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ag
                public /* synthetic */ C15436ag() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    GameManageDetailView.this.m79815nM(interfaceC17463d, i11);
                }
            });
            C8009j c8009j = this.f73455T0;
            if (c8009j != null && c8009j.m92868m()) {
                this.f73455T0.dismiss();
            }
            C8009j m43152a = aVar.m43152a();
            this.f73455T0 = m43152a;
            m43152a.mo13822K();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f73450l1, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f73462a1 = new C23528a(this.f72421L0.m92648SI());
        m79817oM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        try {
            this.f73462a1 = new C23528a(this.f72421L0.m92648SI());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
