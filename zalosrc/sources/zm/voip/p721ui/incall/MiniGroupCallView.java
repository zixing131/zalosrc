package zm.voip.p721ui.incall;

import ac.InterfaceC0733x;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.AbstractC1388a;
import bp0.AbstractC3082b0;
import bp0.AbstractC3098j0;
import bp0.AbstractC3104p;
import bp0.AbstractC3105q;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import gp0.C19577z;
import kg.AbstractC21705b;
import kg.AbstractC21707d;
import kg.C21709f;
import kg.C21715l;
import mo0.EnumC23412c;
import org.webrtc.EglRenderer;
import org.webrtc.ICallbackSurfaceViewCreated;
import org.webrtc.TextureViewRenderer;
import p097db.C17846e;
import p266jg.AbstractC21245c;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import ro0.C25942f;
import to0.InterfaceC26860e;
import to0.InterfaceC26861f;
import wo0.C29179x0;
import zm.voip.p721ui.incall.MiniGroupCallView;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32318n3;
import zm.voip.service.C32328p3;
import zm.voip.service.C32369y;
import zm.voip.widgets.BlurImageView;
import zm.voip.widgets.RoundedImageView;
import zm.voip.widgets.VoIPButtonWithText;

/* loaded from: classes7.dex */
public class MiniGroupCallView extends BaseZaloView implements ICallbackSurfaceViewCreated, C23744a.c, InterfaceC26861f, InterfaceC0733x {

    /* renamed from: b1 */
    private static final int f149465b1 = AbstractC3104p.m15662g();

    /* renamed from: M0 */
    private C24003n f149466M0;

    /* renamed from: N0 */
    private FrameLayout f149467N0;

    /* renamed from: O0 */
    private RoundedImageView f149468O0;

    /* renamed from: P0 */
    private TextureViewRenderer f149469P0;

    /* renamed from: Q0 */
    private VoIPButtonWithText f149470Q0;

    /* renamed from: R0 */
    private FrameLayout f149471R0;

    /* renamed from: S0 */
    private BlurImageView f149472S0;

    /* renamed from: T0 */
    private TextureViewRenderer f149473T0;

    /* renamed from: U0 */
    private C23528a f149474U0;

    /* renamed from: V0 */
    private C3979l f149475V0;

    /* renamed from: W0 */
    private C21709f f149476W0;

    /* renamed from: X0 */
    private final AbstractC21705b f149477X0 = C21715l.m112062k();

    /* renamed from: Y0 */
    private int f149478Y0;

    /* renamed from: Z0 */
    private int f149479Z0;

    /* renamed from: a1 */
    private InterfaceC26860e f149480a1;

    /* renamed from: zm.voip.ui.incall.MiniGroupCallView$a */
    /* loaded from: classes7.dex */
    class C32401a extends AbstractC21707d {
        C32401a() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            MiniGroupCallView.this.m156662uM((float) c21709f.m112033d());
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: b */
        public void mo39828b(C21709f c21709f) {
            MiniGroupCallView.this.m156661tM();
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: c */
        public void mo39829c(C21709f c21709f) {
            MiniGroupCallView.this.m156660sM();
        }
    }

    /* renamed from: zm.voip.ui.incall.MiniGroupCallView$b */
    /* loaded from: classes7.dex */
    class C32402b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f149482l1;

        C32402b(String str) {
            this.f149482l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null && this.f149482l1.equals(str)) {
                        interfaceC3968a.setImageInfo(c3979l);
                    }
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e("MiniGroupCallView_Log", "updateSelfMaskView : " + e11.getMessage(), e11);
                }
            }
        }
    }

    /* renamed from: zm.voip.ui.incall.MiniGroupCallView$c */
    /* loaded from: classes7.dex */
    class C32403c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f149484l1;

        C32403c(String str) {
            this.f149484l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null && this.f149484l1.equals(str)) {
                        MiniGroupCallView.this.f149475V0 = c3979l;
                    }
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e("MiniGroupCallView_Log", "updateCaptureViewMask : " + e11.getMessage(), e11);
                    return;
                }
            }
            if (MiniGroupCallView.this.f149475V0 != null) {
                MiniGroupCallView.this.f149468O0.setImageInfo(MiniGroupCallView.this.f149475V0, true);
            } else {
                MiniGroupCallView.this.f149468O0.setImageResource(AbstractC16803z.avatar_blur_default);
            }
        }
    }

    /* renamed from: lM */
    private void m156653lM() {
        int m15650a = AbstractC3104p.m15650a(2.0f);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-1, -1);
        int i11 = f149465b1;
        m15700c.setMargins(i11, i11, i11, i11);
        RoundedImageView roundedImageView = new RoundedImageView(getContext());
        this.f149468O0 = roundedImageView;
        roundedImageView.setId(AbstractC6918a0.call_partnerMaskView);
        RoundedImageView roundedImageView2 = this.f149468O0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        roundedImageView2.setScaleType(scaleType);
        this.f149468O0.setVisibility(4);
        this.f149468O0.setLayoutParams(m15700c);
        this.f149468O0.setCornerRadius(AbstractC3104p.m15688t());
        this.f149468O0.setImageResource(AbstractC16803z.avatar_blur_default);
        TextureViewRenderer m15578a = AbstractC3098j0.m15578a(getContext(), false, "render_mini_view");
        this.f149469P0 = m15578a;
        m15578a.setId(AbstractC6918a0.call_partnerView);
        this.f149469P0.registerSurfaceViewCallback(this);
        this.f149469P0.setCorner(AbstractC3104p.m15688t());
        if (AbstractC23309i.m121967h3() == 1) {
            this.f149469P0.setVideoRenderMode(EglRenderer.RenderMode.AspectScaleToFill);
        }
        AbstractC3098j0.m15580c(this.f149469P0);
        AbstractC3082b0.m15421c("FloatingCallZaloView", "initViewRenderer TextureView");
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -1);
        m15698a.setMargins(AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g());
        this.f149469P0.setLayoutParams(m15698a);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AbstractC1388a.m6961c(getContext(), AbstractC16801x.capture_view_stroke_color));
        gradientDrawable.setCornerRadius(AbstractC3104p.m15688t());
        gradientDrawable.setStroke(1, 0);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f149471R0 = frameLayout;
        frameLayout.setId(AbstractC6918a0.call_selfContainer);
        FrameLayout.LayoutParams m15700c2 = AbstractC3105q.m15700c(AbstractC3104p.m15681p0(), AbstractC3104p.m15633J());
        m15700c2.gravity = 8388661;
        m15700c2.topMargin = AbstractC3104p.m15650a(5.0f);
        m15700c2.rightMargin = AbstractC3104p.m15650a(5.0f);
        this.f149471R0.setLayoutParams(m15700c2);
        TextureViewRenderer m15578a2 = AbstractC3098j0.m15578a(getContext(), true, "capture_mini_view");
        this.f149473T0 = m15578a2;
        AbstractC3098j0.m15580c(m15578a2);
        this.f149473T0.setCorner(AbstractC3104p.m15688t());
        this.f149473T0.setId(AbstractC6918a0.call_selfView);
        FrameLayout.LayoutParams m15698a2 = AbstractC3105q.m15698a(-1, -1);
        m15698a2.setMargins(m15650a, m15650a, m15650a, m15650a);
        this.f149473T0.setLayoutParams(m15698a2);
        FrameLayout.LayoutParams m15698a3 = AbstractC3105q.m15698a(-1, -1);
        ImageView imageView = new ImageView(getContext());
        imageView.setId(AbstractC6918a0.call_selfBackground);
        imageView.setBackgroundResource(AbstractC16803z.bg_call_self_layout);
        imageView.setLayoutParams(m15698a3);
        imageView.setImageDrawable(gradientDrawable);
        imageView.setPadding(AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g());
        imageView.setBackgroundResource(AbstractC16803z.bg_call_self_layout);
        BlurImageView blurImageView = new BlurImageView(getContext());
        this.f149472S0 = blurImageView;
        blurImageView.setId(AbstractC6918a0.call_selfMaskView);
        this.f149472S0.setScaleType(scaleType);
        this.f149472S0.setImageBitmap(BitmapFactory.decodeResource(getContext().getResources(), AbstractC16803z.avatar_blur_default));
        this.f149472S0.setVisibility(4);
        FrameLayout.LayoutParams m15698a4 = AbstractC3105q.m15698a(-1, -1);
        m15698a4.setMargins(m15650a, m15650a, m15650a, m15650a);
        this.f149472S0.setLayoutParams(m15698a4);
        this.f149472S0.setCornerRadius(AbstractC3104p.m15688t());
        this.f149472S0.setImageResource(AbstractC16803z.avatar_blur_default);
        this.f149471R0.addView(imageView);
        this.f149471R0.addView(this.f149473T0);
        this.f149471R0.addView(this.f149472S0);
        int m15672l = AbstractC3104p.m15672l();
        int m15664h = AbstractC3104p.m15664h();
        FrameLayout.LayoutParams m15700c3 = AbstractC3105q.m15700c(-2, -2);
        m15700c3.gravity = 81;
        m15700c3.bottomMargin = m15664h;
        VoIPButtonWithText voIPButtonWithText = new VoIPButtonWithText(getContext(), 3);
        this.f149470Q0 = voIPButtonWithText;
        voIPButtonWithText.setId(AbstractC6918a0.call_expandFullScreen);
        this.f149470Q0.m157418c(AbstractC3105q.m15703f(m15672l, m15672l)).m157417b(AbstractC16803z.ic_call_expand_selector);
        this.f149470Q0.m157425j(false);
        this.f149470Q0.setContentDescription("Expand");
        this.f149470Q0.setLayoutParams(m15700c3);
        this.f149467N0.addView(this.f149469P0);
        this.f149467N0.addView(this.f149468O0);
        this.f149467N0.addView(this.f149470Q0);
        this.f149467N0.addView(this.f149471R0);
    }

    /* renamed from: mM */
    private int m156654mM() {
        return AbstractC3104p.m15636M(((C32369y) m92676n2()).f149317y);
    }

    /* renamed from: nM */
    private int m156655nM() {
        return AbstractC3104p.m15687s0(((C32369y) m92676n2()).f149317y);
    }

    /* renamed from: oM */
    private void m156656oM(boolean z11) {
        if (((C32369y) m92676n2()) == null || this.f149467N0 == null) {
            return;
        }
        if (z11) {
            this.f149476W0.m112046s(0.5d);
        } else {
            this.f149476W0.m112046s(1.0d);
        }
    }

    /* renamed from: pM */
    private void m156657pM() {
        this.f149467N0 = new FrameLayout(getContext());
        this.f149467N0.setLayoutParams(AbstractC3105q.m15700c(this.f149478Y0, this.f149479Z0));
        this.f149467N0.setId(AbstractC6918a0.main_container);
        ImageView imageView = new ImageView(getContext());
        imageView.setId(AbstractC6918a0.call_mainFrameBackground);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-1, -1);
        m15700c.gravity = 17;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AbstractC1388a.m6961c(getContext(), AbstractC16801x.black));
        gradientDrawable.setCornerRadius(AbstractC3104p.m15688t());
        gradientDrawable.setStroke(1, 0);
        imageView.setImageDrawable(gradientDrawable);
        imageView.setPadding(AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g());
        imageView.setBackgroundResource(AbstractC16803z.bg_call_self_layout);
        imageView.setLayoutParams(m15700c);
        this.f149467N0.addView(imageView);
        m156653lM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m156658qM(Object[] objArr) {
        if (objArr != null) {
            try {
                if (objArr.length == 1) {
                    m156656oM(((Boolean) objArr[0]).booleanValue());
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("MiniGroupCallView_Log", "NOTI_CALL_MIC_STATUS_UPDATE", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m156659rM(int i11) {
        this.f149480a1.mo138232A0(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public void m156660sM() {
        this.f149469P0.setAnim(false);
        try {
            if (((C32369y) m92676n2()).f149317y) {
                TextureViewRenderer textureViewRenderer = this.f149473T0;
                if (textureViewRenderer != null) {
                    textureViewRenderer.release();
                    return;
                }
                return;
            }
            FrameLayout frameLayout = this.f149471R0;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            this.f149470Q0.setVisibility(0);
            this.f149473T0.setCorner(AbstractC3104p.m15688t());
            AbstractC3098j0.m15580c(this.f149473T0);
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("MiniGroupCallView_Log", "mini selfView release failed " + e11.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public void m156661tM() {
        try {
            this.f149469P0.setAnim(true);
            if (((C32369y) m92676n2()).f149317y) {
                FrameLayout frameLayout = this.f149471R0;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                this.f149470Q0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public void m156662uM(float f11) {
        C32369y c32369y = (C32369y) m92676n2();
        int m15687s0 = AbstractC3104p.m15687s0(false);
        int m15636M = AbstractC3104p.m15636M(false);
        ViewGroup.LayoutParams layoutParams = this.f149467N0.getLayoutParams();
        layoutParams.width = (int) (m15687s0 * f11);
        layoutParams.height = (int) (m15636M * f11);
        this.f149467N0.setLayoutParams(layoutParams);
        c32369y.m156433I(layoutParams.width, layoutParams.height);
    }

    /* renamed from: vM */
    private void m156663vM() {
        C23744a.m124114c().m124115b(this, 1007);
        C23744a.m124114c().m124115b(this, 1001);
        C23744a.m124114c().m124115b(this, 10011);
        C23744a.m124114c().m124115b(this, 40015);
        C23744a.m124114c().m124115b(this, 40012);
        C23744a.m124114c().m124115b(this, 40011);
        C23744a.m124114c().m124115b(this, 10018);
    }

    /* renamed from: wM */
    private void m156664wM() {
        try {
            C23744a.m124114c().m124117e(this, 1007);
            C23744a.m124114c().m124117e(this, 1001);
            C23744a.m124114c().m124117e(this, 10011);
            C23744a.m124114c().m124117e(this, 40015);
            C23744a.m124114c().m124117e(this, 40012);
            C23744a.m124114c().m124117e(this, 40011);
            C23744a.m124114c().m124117e(this, 10018);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("MiniGroupCallView_Log", "unregisterBroadcast " + e11.getMessage(), e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C29179x0 c29179x0 = new C29179x0(this, C19577z.m102341J(), AbstractC32273e3.m155748Q(), C32328p3.m156358e(), C32318n3.m156214E());
        this.f149480a1 = c29179x0;
        c29179x0.mo995Nd(null, null);
        this.f149474U0 = new C23528a(getContext());
        C24003n c24003n = new C24003n();
        this.f149466M0 = c24003n;
        c24003n.f116264e = 1006;
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116271l = AbstractC16803z.avatar_blur_default;
        C21709f m112019d = this.f149477X0.m112019d();
        this.f149476W0 = m112019d;
        m112019d.m112048u(AbstractC21245c.f103554a);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f149479Z0 = m156654mM();
        this.f149478Y0 = m156655nM();
        m156657pM();
        m156663vM();
        this.f149476W0.m112030a(new C32401a());
        this.f149476W0.m112050w(1.0d);
        this.f149480a1.mo138234b3();
        return this.f149467N0;
    }

    @Override // to0.InterfaceC26861f
    /* renamed from: Hd */
    public void mo138238Hd(ContactProfile contactProfile) {
        if (contactProfile == null) {
            return;
        }
        try {
            String str = contactProfile.f42446v;
            if (this.f149472S0 != null && !TextUtils.isEmpty(str)) {
                AbstractC3082b0.m15421c("MiniGroupCallView_Log", "updateSelfMaskView " + str);
                if (!C23302b.f113247a.m120523d(str)) {
                    ((C23528a) this.f149474U0.m123612r(this.f149472S0)).m123577A(str, this.f149466M0, 1, new C32402b(str));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // to0.InterfaceC26861f
    /* renamed from: JB */
    public void mo138239JB(boolean z11) {
        if (z11) {
            this.f149473T0.setVisibility(8);
            this.f149472S0.setVisibility(0);
        } else {
            this.f149473T0.setVisibility(0);
            this.f149472S0.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        m156664wM();
        try {
            TextureViewRenderer textureViewRenderer = this.f149473T0;
            if (textureViewRenderer != null) {
                textureViewRenderer.release();
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("MiniGroupCallView_Log", "mini selfView release failed " + e11.toString());
        }
        try {
            TextureViewRenderer textureViewRenderer2 = this.f149469P0;
            if (textureViewRenderer2 != null) {
                textureViewRenderer2.release();
                this.f149469P0.registerSurfaceViewCallback(null);
            }
        } catch (Exception e12) {
            AbstractC3082b0.m15422d("MiniGroupCallView_Log", "mini partnerView release failed " + e12.toString());
        }
        super.mo37484JJ();
        this.f149480a1.mo994F2();
    }

    @Override // to0.InterfaceC26861f
    /* renamed from: Ov */
    public void mo138240Ov(boolean z11) {
        TextureViewRenderer textureViewRenderer = this.f149473T0;
        if (textureViewRenderer != null) {
            textureViewRenderer.setMirror(z11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f149476W0.m112041n();
    }

    @Override // to0.InterfaceC26861f
    /* renamed from: Um */
    public void mo138241Um(boolean z11) {
        if (z11) {
            this.f149469P0.setVisibility(8);
            this.f149468O0.setVisibility(0);
        } else {
            this.f149469P0.setVisibility(0);
            this.f149468O0.setVisibility(8);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MiniGroupCallView";
    }

    @Override // to0.InterfaceC26861f
    /* renamed from: hi */
    public void mo138242hi(C25942f c25942f, boolean z11) {
        TextureViewRenderer textureViewRenderer = this.f149473T0;
        if (textureViewRenderer == null) {
            return;
        }
        this.f149480a1.mo138235q9(textureViewRenderer, true, 0);
        if (z11) {
            this.f149473T0.setVisibility(8);
            this.f149472S0.setVisibility(0);
        }
        mo138244qr(c25942f);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
    }

    @Override // org.webrtc.ICallbackSurfaceViewCreated
    public void onSurfaceViewCreated(int i11) {
    }

    @Override // to0.InterfaceC26861f
    /* renamed from: qj */
    public void mo138243qj(C25942f c25942f) {
        try {
            String m133653b = c25942f.m133653b();
            if (this.f149468O0 != null && !TextUtils.isEmpty(m133653b)) {
                AbstractC3082b0.m15421c("MiniGroupCallView_Log", "updateCaptureViewMask " + m133653b);
                if (!C23302b.f113247a.m120523d(m133653b)) {
                    ((C23528a) this.f149474U0.m123612r(this.f149468O0)).m123577A(m133653b, this.f149466M0, 1, new C32403c(m133653b));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // to0.InterfaceC26861f
    /* renamed from: qr */
    public void mo138244qr(C25942f c25942f) {
        if (this.f149469P0 != null && c25942f != null && c25942f.m133661k() != -1) {
            C17846e.m94223f().m94251v(c25942f.m133661k(), EnumC23412c.f113761q.ordinal());
            int i11 = 0;
            this.f149480a1.mo138235q9(this.f149469P0, false, c25942f.m133661k());
            if (c25942f.m133659i() != 3) {
                this.f149469P0.setVisibility(8);
                this.f149468O0.setVisibility(0);
                return;
            }
            this.f149469P0.setVisibility(0);
            RoundedImageView roundedImageView = this.f149468O0;
            if (!c25942f.m133663m()) {
                i11 = 8;
            }
            roundedImageView.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p205hc.InterfaceC19967f
    /* renamed from: wy */
    public void mo70710wy(Runnable runnable) {
        if (m92676n2() != null && runnable != null) {
            m92676n2().runOnUiThread(runnable);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, final Object... objArr) {
        switch (i11) {
            case 10011:
                mo70710wy(new Runnable() { // from class: vo0.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MiniGroupCallView.this.m156658qM(objArr);
                    }
                });
                return;
            case 10018:
                if (objArr != null && objArr.length >= 1) {
                    final int intValue = ((Integer) objArr[0]).intValue();
                    mo70710wy(new Runnable() { // from class: vo0.h1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MiniGroupCallView.this.m156659rM(intValue);
                        }
                    });
                    return;
                }
                return;
            case 40011:
                if (objArr != null) {
                    this.f149480a1.mo138236u2(Integer.valueOf(((Integer) objArr[0]).intValue()));
                    return;
                }
                return;
            case 40012:
                if (objArr != null) {
                    this.f149480a1.mo138237yn((C25942f) objArr[0], ((Integer) objArr[1]).intValue());
                    return;
                }
                return;
            case 40015:
                try {
                    int intValue2 = ((Integer) objArr[0]).intValue();
                    int intValue3 = ((Integer) objArr[1]).intValue();
                    if (intValue3 == 16 || intValue3 == 17) {
                        this.f149480a1.mo138233Ck(intValue2, ((Integer) objArr[3]).intValue());
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            default:
                return;
        }
    }
}
