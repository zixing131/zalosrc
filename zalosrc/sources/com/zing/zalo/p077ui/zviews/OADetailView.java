package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import au.C2343e;
import ck.C3563d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7238v4;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.clock.ClockListView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.C23278z2;
import org.json.JSONObject;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import vg.AbstractC28034c7;

/* loaded from: classes6.dex */
public class OADetailView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: P0 */
    View f75647P0;

    /* renamed from: Q0 */
    ClockListView f75648Q0;

    /* renamed from: R0 */
    C7238v4 f75649R0;

    /* renamed from: S0 */
    List f75650S0 = new ArrayList();

    /* renamed from: T0 */
    C23528a f75651T0;

    /* renamed from: U0 */
    RobotoTextView f75652U0;

    /* renamed from: V0 */
    C3563d f75653V0;

    /* renamed from: W0 */
    RobotoTextView f75654W0;

    /* renamed from: X0 */
    LayoutInflater f75655X0;

    /* renamed from: Y0 */
    String f75656Y0;

    /* renamed from: Z0 */
    View f75657Z0;

    /* renamed from: a1 */
    LinearLayout f75658a1;

    /* renamed from: b1 */
    ImageView f75659b1;

    /* renamed from: c1 */
    RobotoTextView f75660c1;

    /* renamed from: d1 */
    boolean f75661d1;

    /* renamed from: e1 */
    String f75662e1;

    /* renamed from: f1 */
    View f75663f1;

    /* renamed from: g1 */
    String f75664g1;

    /* renamed from: h1 */
    LinearLayout f75665h1;

    /* renamed from: i1 */
    CircleImage f75666i1;

    /* renamed from: j1 */
    RobotoTextView f75667j1;

    /* renamed from: com.zing.zalo.ui.zviews.OADetailView$a */
    /* loaded from: classes6.dex */
    class C14697a extends AbstractC28034c7 {
        C14697a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    OADetailView.this.f75649R0.m36955e(false);
                    OADetailView.this.f75649R0.notifyDataSetChanged();
                } else {
                    OADetailView.this.f75649R0.m36955e(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public /* synthetic */ void m82352jM(View view) {
        try {
            if (this.f72421L0.m92676n2() != null && !this.f72421L0.m92676n2().isFinishing() && !this.f72421L0.mo60294yp()) {
                C3563d c3563d = this.f75653V0;
                if (c3563d.f15093d == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_oa_id", this.f75656Y0);
                    this.f72421L0.m92676n2().mo35579p().m93066i2(OALocationsView.class, bundle, 0, 1, true);
                } else {
                    AbstractC23152n3.m119042f0(this.f72421L0.m92648SI(), "", c3563d.m18099c(), this.f75653V0.m18097a());
                }
                AbstractC23647d.m123906p("870030");
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        this.f75651T0 = new C23528a(this.f72421L0.m92648SI());
        boolean z11 = true;
        m92637BK(true);
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f75656Y0 = m92642L3.getString("extra_oa_id");
                if (!m92642L3.containsKey("extra_bol_oa_certificate") || !m92642L3.getBoolean("extra_bol_oa_certificate")) {
                    z11 = false;
                }
                this.f75661d1 = z11;
                String str2 = "";
                if (!m92642L3.containsKey("extra_oa_name")) {
                    str = "";
                } else {
                    str = m92642L3.getString("extra_oa_name");
                }
                this.f75662e1 = str;
                if (m92642L3.containsKey("extra_oa_avatar")) {
                    str2 = m92642L3.getString("extra_oa_avatar");
                }
                this.f75664g1 = str2;
                String string = m92642L3.getString("extra_oa_info");
                if (!TextUtils.isEmpty(string)) {
                    this.f75653V0 = new C3563d(new JSONObject(string));
                    return;
                }
                return;
            }
            finish();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
            actionBarMenu.m92738e(AbstractC6918a0.menu_drawer, AbstractC16803z.stencils_ic_head_menu);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75655X0 = layoutInflater;
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_oa_detail, (ViewGroup) null, false);
        this.f75647P0 = inflate;
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (!z11) {
            this.f88756W = 0;
            finish();
        }
        this.f77813M0 = false;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Ps */
    public void mo62806Ps() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            finish();
            return true;
        }
        if (i11 == AbstractC6918a0.menu_drawer && this.f72421L0.m92650VI() != null && this.f72421L0.m92650VI().mo37491QJ(i11)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                if (this.f75665h1 == null) {
                    LinearLayout linearLayout = (LinearLayout) this.f75655X0.inflate(AbstractC7409c0.layout_avatar_action_bar, (ViewGroup) null);
                    this.f75665h1 = linearLayout;
                    linearLayout.setVisibility(0);
                    CircleImage circleImage = (CircleImage) this.f75665h1.findViewById(AbstractC6918a0.imvAvatar);
                    this.f75666i1 = circleImage;
                    circleImage.setEnableRoundPadding(false);
                    this.f75667j1 = (RobotoTextView) this.f75665h1.findViewById(AbstractC6918a0.tvTitle);
                }
                RobotoTextView robotoTextView = this.f75667j1;
                if (robotoTextView != null) {
                    robotoTextView.setText(this.f75662e1);
                }
                if (!TextUtils.isEmpty(this.f75664g1) && !this.f75664g1.equalsIgnoreCase("null")) {
                    if (C23302b.f113247a.m120523d(this.f75664g1)) {
                        int m12307a = C2343e.m12307a(this.f75656Y0, false);
                        this.f75666i1.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(this.f75662e1), m12307a));
                    } else {
                        ((C23528a) this.f75651T0.m123612r(this.f75666i1)).m123618x(this.f75664g1, C23278z2.m120143n());
                    }
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                layoutParams.setMargins(AbstractC23136l9.m118742r(56.0f), 0, AbstractC23136l9.m118742r(40.0f), 0);
                layoutParams.gravity = 16;
                this.f88760a0.addView(this.f75665h1, layoutParams);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Tf */
    public View mo62809Tf() {
        if (this.f72421L0.m92650VI() != null) {
            return this.f72421L0.m92650VI().m92656bJ();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C10866e.m56360g();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        this.f75648Q0 = (ClockListView) this.f75647P0.findViewById(AbstractC6918a0.listview);
        View inflate = this.f75655X0.inflate(AbstractC7409c0.layout_oa_detail_footer, (ViewGroup) null);
        this.f75657Z0 = inflate.findViewById(AbstractC6918a0.separate_line1);
        this.f75658a1 = (LinearLayout) inflate.findViewById(AbstractC6918a0.layout_view_locations);
        this.f75652U0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_view_location);
        this.f75658a1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.i20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OADetailView.this.m82352jM(view2);
            }
        });
        View findViewById = inflate.findViewById(AbstractC6918a0.layout_desc);
        this.f75663f1 = findViewById;
        findViewById.setBackgroundColor(-1);
        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_desc);
        this.f75654W0 = robotoTextView;
        robotoTextView.setMaxLines(Integer.MAX_VALUE);
        int i11 = 0;
        this.f75654W0.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        ImageView imageView = (ImageView) inflate.findViewById(AbstractC6918a0.icon_desc_next);
        this.f75659b1 = imageView;
        imageView.setVisibility(8);
        RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_certificate);
        this.f75660c1 = robotoTextView2;
        if (!this.f75661d1) {
            i11 = 8;
        }
        robotoTextView2.setVisibility(i11);
        this.f75648Q0.addFooterView(inflate);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "OADetailView";
    }

    /* renamed from: hM */
    void m82353hM() {
        int i11;
        int i12;
        int i13;
        try {
            C3563d c3563d = this.f75653V0;
            if (c3563d != null) {
                List m18098b = c3563d.m18098b();
                this.f75650S0 = m18098b;
                this.f75649R0.m36954d(m18098b);
                this.f75649R0.notifyDataSetChanged();
                View view = this.f75657Z0;
                if (view != null) {
                    if (this.f75653V0.f15093d != 1 && !m82354iM()) {
                        i13 = 8;
                        view.setVisibility(i13);
                    }
                    i13 = 0;
                    view.setVisibility(i13);
                }
                LinearLayout linearLayout = this.f75658a1;
                if (linearLayout != null) {
                    if (this.f75653V0.f15093d != 1 && !m82354iM()) {
                        i12 = 8;
                        linearLayout.setVisibility(i12);
                    }
                    i12 = 0;
                    linearLayout.setVisibility(i12);
                }
                View view2 = this.f75663f1;
                if (view2 != null) {
                    if (!TextUtils.isEmpty(this.f75653V0.f15090a)) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    view2.setVisibility(i11);
                }
                if (this.f75654W0 != null) {
                    if (!TextUtils.isEmpty(this.f75653V0.f15090a)) {
                        this.f75654W0.setVisibility(0);
                        this.f75654W0.setText(this.f75653V0.f15090a);
                    } else {
                        this.f75654W0.setVisibility(8);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iM */
    boolean m82354iM() {
        C3563d c3563d = this.f75653V0;
        if (c3563d == null || c3563d.f15091b <= 0.0d || c3563d.f15092c <= 0.0d) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && !this.f77813M0) {
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: qG */
    public View mo62819qG() {
        return this.f75647P0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            C7238v4 c7238v4 = new C7238v4(this.f72421L0.m92648SI(), this.f75650S0, this.f75651T0);
            this.f75649R0 = c7238v4;
            this.f75648Q0.setAdapter((ListAdapter) c7238v4);
            this.f75648Q0.setOnScrollListener(new C14697a());
            m82353hM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
