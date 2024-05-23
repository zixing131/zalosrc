package zm.voip.p721ui.incall;

import ac.InterfaceC0733x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ViewSwitcher;
import androidx.core.content.AbstractC1388a;
import au.AbstractC2351i;
import bp0.AbstractC3082b0;
import bp0.AbstractC3098j0;
import bp0.AbstractC3104p;
import bp0.AbstractC3105q;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoChronometer;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.zview.ZaloView;
import gg0.AbstractC19444a;
import kg.AbstractC21705b;
import kg.AbstractC21707d;
import kg.C21709f;
import kg.C21715l;
import lo0.C22626t;
import me0.C23212s8;
import me0.C23278z2;
import org.webrtc.EglRenderer;
import org.webrtc.ICallbackSurfaceViewCreated;
import org.webrtc.TextureViewRenderer;
import p097db.C17843b;
import p097db.EnumC17859r;
import p266jg.AbstractC21245c;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import th.AbstractC26681b;
import zm.voip.p721ui.incall.VoIPFloatingZView;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32257b4;
import zm.voip.service.C32318n3;
import zm.voip.service.C32369y;
import zm.voip.widgets.BlurImageView;
import zm.voip.widgets.MarqueeTextView;
import zm.voip.widgets.RoundedImageView;
import zm.voip.widgets.VoIPButton;

/* loaded from: classes7.dex */
public class VoIPFloatingZView extends ZaloView implements ICallbackSurfaceViewCreated, C23744a.c, InterfaceC0733x {

    /* renamed from: a1 */
    private static final int f149486a1 = AbstractC3104p.m15662g();

    /* renamed from: A0 */
    private VoIPButton f149487A0;

    /* renamed from: B0 */
    private FrameLayout f149488B0;

    /* renamed from: C0 */
    private BlurImageView f149489C0;

    /* renamed from: D0 */
    private TextureViewRenderer f149490D0;

    /* renamed from: E0 */
    private RecyclingImageView f149491E0;

    /* renamed from: F0 */
    private MarqueeTextView f149492F0;

    /* renamed from: G0 */
    private Chronometer f149493G0;

    /* renamed from: H0 */
    private ViewSwitcher f149494H0;

    /* renamed from: I0 */
    private RobotoTextView f149495I0;

    /* renamed from: J0 */
    private ProgressBar f149496J0;

    /* renamed from: L0 */
    private Drawable f149498L0;

    /* renamed from: M0 */
    private C23528a f149499M0;

    /* renamed from: N0 */
    private C22626t f149500N0;

    /* renamed from: O0 */
    private C3979l f149501O0;

    /* renamed from: P0 */
    private C21709f f149502P0;

    /* renamed from: U0 */
    private int f149507U0;

    /* renamed from: V0 */
    private int f149508V0;

    /* renamed from: w0 */
    private C24003n f149513w0;

    /* renamed from: x0 */
    private FrameLayout f149514x0;

    /* renamed from: y0 */
    private RoundedImageView f149515y0;

    /* renamed from: z0 */
    private TextureViewRenderer f149516z0;

    /* renamed from: K0 */
    private String f149497K0 = "";

    /* renamed from: Q0 */
    private final AbstractC21705b f149503Q0 = C21715l.m112062k();

    /* renamed from: R0 */
    private volatile boolean f149504R0 = false;

    /* renamed from: S0 */
    private boolean f149505S0 = true;

    /* renamed from: T0 */
    private boolean f149506T0 = false;

    /* renamed from: W0 */
    private int f149509W0 = -1;

    /* renamed from: X0 */
    private boolean f149510X0 = false;

    /* renamed from: Y0 */
    private final int f149511Y0 = m156680YK() - AbstractC3104p.m15650a(8.0f);

    /* renamed from: Z0 */
    private final BroadcastReceiver f149512Z0 = new C32404a();

    /* renamed from: zm.voip.ui.incall.VoIPFloatingZView$a */
    /* loaded from: classes7.dex */
    class C32404a extends BroadcastReceiver {
        C32404a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if (AbstractC26681b.f126360e && VoIPFloatingZView.this.f149514x0 != null && "ACTION_CALL_UPDATE_STATE".equalsIgnoreCase(intent.getAction())) {
                    if (!VoIPFloatingZView.this.f149500N0.m117126k0() && !VoIPFloatingZView.this.f149500N0.m117047N0()) {
                        return;
                    }
                    VoIPFloatingZView voIPFloatingZView = VoIPFloatingZView.this;
                    voIPFloatingZView.m156703vL(voIPFloatingZView.f149500N0);
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("FloatingCallZView", "updateViewReceiver ", e11);
            }
        }
    }

    /* renamed from: zm.voip.ui.incall.VoIPFloatingZView$b */
    /* loaded from: classes7.dex */
    class C32405b extends AbstractC21707d {
        C32405b() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            VoIPFloatingZView.this.m156692kL((float) c21709f.m112033d());
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: b */
        public void mo39828b(C21709f c21709f) {
            VoIPFloatingZView.this.m156691jL();
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: c */
        public void mo39829c(C21709f c21709f) {
            VoIPFloatingZView.this.m156690iL();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.VoIPFloatingZView$c */
    /* loaded from: classes7.dex */
    public class C32406c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f149519l1;

        C32406c(String str) {
            this.f149519l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null && this.f149519l1.equals(str)) {
                        interfaceC3968a.setImageInfo(c3979l);
                    }
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e("FloatingCallZView", "updateSelfMaskView : " + e11.getMessage(), e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.VoIPFloatingZView$d */
    /* loaded from: classes7.dex */
    public class C32407d extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f149521l1;

        C32407d(String str) {
            this.f149521l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null && this.f149521l1.equals(str)) {
                        VoIPFloatingZView.this.f149501O0 = c3979l;
                    }
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e("FloatingCallZView", "updateCaptureViewMask : " + e11.getMessage(), e11);
                }
            }
        }
    }

    /* renamed from: VK */
    private void m156677VK() {
        if (this.f149500N0.m117073W()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149496J0.getLayoutParams();
            if (this.f149510X0) {
                layoutParams.gravity = 16;
                layoutParams.leftMargin = (AbstractC3104p.m15650a(4.0f) + (this.f149511Y0 / 2)) - (layoutParams.width / 2);
            } else {
                layoutParams.gravity = 17;
                layoutParams.leftMargin = 0;
            }
            this.f149496J0.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: WK */
    private void m156678WK() {
        RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
        this.f149491E0 = recyclingImageView;
        recyclingImageView.setId(AbstractC6918a0.call_avatarView);
        int i11 = this.f149511Y0;
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(i11, i11);
        m15700c.gravity = 16;
        m15700c.leftMargin = AbstractC3104p.m15650a(4.0f);
        this.f149491E0.setLayoutParams(m15700c);
        this.f149491E0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        LinearLayout linearLayout = new LinearLayout(getContext());
        FrameLayout.LayoutParams m15700c2 = AbstractC3105q.m15700c(-1, -1);
        m15700c2.leftMargin = m156680YK() + AbstractC3104p.m15650a(4.0f);
        m15700c2.gravity = 16;
        linearLayout.setLayoutParams(m15700c2);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        MarqueeTextView marqueeTextView = new MarqueeTextView(getContext());
        this.f149492F0 = marqueeTextView;
        marqueeTextView.setId(AbstractC6918a0.call_remoteName);
        this.f149492F0.setLayoutParams(AbstractC3105q.m15704g(-2, -2, 16));
        this.f149492F0.setSingleLine();
        MarqueeTextView marqueeTextView2 = this.f149492F0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        marqueeTextView2.setEllipsize(truncateAt);
        this.f149492F0.setTextColor(-1);
        this.f149492F0.setGravity(16);
        this.f149492F0.setTextStyleBold(true);
        this.f149492F0.mo75850g(true);
        this.f149492F0.setTextSize(1, 14.0f);
        ViewSwitcher viewSwitcher = new ViewSwitcher(getContext());
        this.f149494H0 = viewSwitcher;
        viewSwitcher.setId(AbstractC6918a0.call_switcherInCallStatus);
        FrameLayout.LayoutParams m15699b = AbstractC3105q.m15699b(-1, -2, 16);
        m15699b.topMargin = AbstractC3104p.m15650a(4.0f);
        this.f149494H0.setLayoutParams(m15699b);
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        this.f149495I0 = robotoTextView;
        robotoTextView.setId(AbstractC6918a0.call_statusText);
        this.f149495I0.setSingleLine();
        this.f149495I0.setEllipsize(truncateAt);
        this.f149495I0.setLayoutParams(AbstractC3105q.m15699b(-1, -2, 17));
        this.f149495I0.setGravity(16);
        this.f149495I0.setTextSize(1, 13.0f);
        this.f149495I0.mo75850g(true);
        this.f149495I0.setTextColor(Color.parseColor("#80FFFFFF"));
        RobotoChronometer robotoChronometer = new RobotoChronometer(getContext());
        this.f149493G0 = robotoChronometer;
        robotoChronometer.setId(AbstractC6918a0.call_audio_elapsed_time);
        this.f149493G0.setSingleLine();
        this.f149493G0.setEllipsize(truncateAt);
        this.f149493G0.setLayoutParams(AbstractC3105q.m15699b(-1, -2, 17));
        this.f149493G0.setGravity(16);
        this.f149493G0.setTextColor(-12397172);
        this.f149493G0.setTextSize(1, 13.0f);
        this.f149493G0.setTextColor(Color.parseColor("#80ffffff"));
        this.f149494H0.addView(this.f149495I0);
        this.f149494H0.addView(this.f149493G0);
        linearLayout.addView(this.f149492F0);
        linearLayout.addView(this.f149494H0);
        this.f149514x0.addView(this.f149491E0);
        this.f149514x0.addView(linearLayout);
    }

    /* renamed from: XK */
    private void m156679XK() {
        int m15650a = AbstractC3104p.m15650a(2.0f);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-1, -1);
        int i11 = f149486a1;
        m15700c.setMargins(i11, i11, i11, i11);
        RoundedImageView roundedImageView = new RoundedImageView(getContext());
        this.f149515y0 = roundedImageView;
        roundedImageView.setId(AbstractC6918a0.call_partnerMaskView);
        RoundedImageView roundedImageView2 = this.f149515y0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        roundedImageView2.setScaleType(scaleType);
        this.f149515y0.setImageBitmap(BitmapFactory.decodeResource(m92651WI(), AbstractC16803z.avatar_blur_default));
        this.f149515y0.setVisibility(4);
        this.f149515y0.setLayoutParams(m15700c);
        m156701tL(this.f149500N0);
        this.f149515y0.setCornerRadius(AbstractC3104p.m15688t());
        TextureViewRenderer m15578a = AbstractC3098j0.m15578a(getContext(), false, "render_mini_view");
        this.f149516z0 = m15578a;
        m15578a.setId(AbstractC6918a0.call_partnerView);
        this.f149516z0.registerSurfaceViewCallback(this);
        this.f149516z0.setCorner(AbstractC3104p.m15688t());
        if (AbstractC23309i.m121967h3() == 1) {
            this.f149516z0.setVideoRenderMode(EglRenderer.RenderMode.AspectScaleToFill);
        }
        AbstractC3098j0.m15580c(this.f149516z0);
        AbstractC3082b0.m15421c("FloatingCallZaloView", "initViewRenderer TextureView");
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -1);
        m15698a.setMargins(AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g());
        this.f149516z0.setLayoutParams(m15698a);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AbstractC1388a.m6961c(getContext(), AbstractC16801x.capture_view_stroke_color));
        gradientDrawable.setCornerRadius(AbstractC3104p.m15688t());
        gradientDrawable.setStroke(1, 0);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f149488B0 = frameLayout;
        frameLayout.setId(AbstractC6918a0.call_selfContainer);
        FrameLayout.LayoutParams m15700c2 = AbstractC3105q.m15700c(AbstractC3104p.m15681p0(), AbstractC3104p.m15633J());
        m15700c2.gravity = 8388661;
        m15700c2.topMargin = AbstractC3104p.m15650a(5.0f);
        m15700c2.rightMargin = AbstractC3104p.m15650a(5.0f);
        this.f149488B0.setLayoutParams(m15700c2);
        TextureViewRenderer m15578a2 = AbstractC3098j0.m15578a(getContext(), true, "capture_mini_view");
        AbstractC3098j0.m15580c(m15578a2);
        m15578a2.setCorner(AbstractC3104p.m15688t());
        this.f149490D0 = m15578a2;
        m15578a2.setId(AbstractC6918a0.call_selfView);
        FrameLayout.LayoutParams m15698a2 = AbstractC3105q.m15698a(-1, -1);
        m15698a2.setMargins(m15650a, m15650a, m15650a, m15650a);
        this.f149490D0.setLayoutParams(m15698a2);
        this.f149490D0.setMirror(true ^ this.f149500N0.m117110g0());
        FrameLayout.LayoutParams m15698a3 = AbstractC3105q.m15698a(-1, -1);
        ImageView imageView = new ImageView(getContext());
        imageView.setId(AbstractC6918a0.call_selfBackground);
        imageView.setBackgroundResource(AbstractC16803z.bg_call_self_layout);
        imageView.setLayoutParams(m15698a3);
        imageView.setImageDrawable(gradientDrawable);
        imageView.setPadding(AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g());
        imageView.setBackgroundResource(AbstractC16803z.bg_call_self_layout);
        BlurImageView blurImageView = new BlurImageView(getContext());
        this.f149489C0 = blurImageView;
        blurImageView.setId(AbstractC6918a0.call_selfMaskView);
        this.f149489C0.setScaleType(scaleType);
        this.f149489C0.setImageBitmap(BitmapFactory.decodeResource(getContext().getResources(), AbstractC16803z.avatar_blur_default));
        this.f149489C0.setVisibility(4);
        FrameLayout.LayoutParams m15698a4 = AbstractC3105q.m15698a(-1, -1);
        m15698a4.setMargins(m15650a, m15650a, m15650a, m15650a);
        this.f149489C0.setLayoutParams(m15698a4);
        m156700sL();
        this.f149489C0.setCornerRadius(AbstractC3104p.m15688t());
        this.f149488B0.addView(imageView);
        this.f149488B0.addView(this.f149490D0);
        this.f149488B0.addView(this.f149489C0);
        int m15672l = AbstractC3104p.m15672l();
        int m15664h = AbstractC3104p.m15664h();
        FrameLayout.LayoutParams m15700c3 = AbstractC3105q.m15700c(-2, -2);
        m15700c3.gravity = 81;
        m15700c3.bottomMargin = m15664h;
        VoIPButton voIPButton = new VoIPButton(getContext());
        this.f149487A0 = voIPButton;
        voIPButton.setId(AbstractC6918a0.call_expandFullScreen);
        this.f149487A0.setLayoutParams(AbstractC3105q.m15703f(m15672l, m15672l));
        this.f149487A0.setImageResource(AbstractC16803z.ic_call_expand_selector);
        this.f149487A0.setContentDescription("Expand");
        this.f149487A0.setLayoutParams(m15700c3);
        this.f149514x0.addView(this.f149516z0);
        this.f149514x0.addView(this.f149515y0);
        this.f149514x0.addView(this.f149487A0);
        this.f149514x0.addView(this.f149488B0);
    }

    /* renamed from: YK */
    private int m156680YK() {
        C32369y c32369y = (C32369y) m92676n2();
        if (this.f149506T0) {
            return AbstractC3104p.m15636M(c32369y.f149317y);
        }
        return AbstractC3104p.m15629F();
    }

    /* renamed from: ZK */
    private int m156681ZK() {
        C32369y c32369y = (C32369y) m92676n2();
        if (this.f149506T0) {
            return AbstractC3104p.m15687s0(c32369y.f149317y);
        }
        return AbstractC3104p.m15677n0();
    }

    /* renamed from: aL */
    private void m156682aL(boolean z11) {
        this.f149510X0 = z11;
        if (((C32369y) m92676n2()) == null || this.f149514x0 == null) {
            return;
        }
        if (z11) {
            this.f149502P0.m112046s(0.5d);
        } else {
            this.f149502P0.m112046s(1.0d);
        }
    }

    /* renamed from: bL */
    private void m156683bL(LayoutInflater layoutInflater) {
        this.f149514x0 = new FrameLayout(getContext());
        this.f149514x0.setLayoutParams(AbstractC3105q.m15700c(this.f149507U0, this.f149508V0));
        this.f149514x0.setId(AbstractC6918a0.main_container);
        ImageView imageView = new ImageView(getContext());
        imageView.setId(AbstractC6918a0.call_mainFrameBackground);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-1, -1);
        m15700c.gravity = 17;
        if (this.f149506T0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(AbstractC1388a.m6961c(getContext(), AbstractC16801x.capture_view_stroke_color));
            gradientDrawable.setCornerRadius(AbstractC3104p.m15688t());
            gradientDrawable.setStroke(1, 0);
            imageView.setImageDrawable(gradientDrawable);
            imageView.setPadding(AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g(), AbstractC3104p.m15662g());
            imageView.setBackgroundResource(AbstractC16803z.bg_call_self_layout);
            imageView.setLayoutParams(m15700c);
            this.f149514x0.addView(imageView);
            m156679XK();
        } else {
            imageView.setBackgroundResource(AbstractC16803z.bg_mini_mode_audio_call);
            imageView.setLayoutParams(m15700c);
            this.f149514x0.addView(imageView);
            m156678WK();
        }
        this.f149496J0 = (ProgressBar) layoutInflater.inflate(AbstractC7409c0.layout_call_loading_view, (ViewGroup) this.f149514x0, false);
        m156677VK();
        this.f149514x0.addView(this.f149496J0);
        this.f149496J0.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cL */
    public /* synthetic */ void m156684cL(Object[] objArr) {
        if (objArr != null) {
            try {
                if (objArr.length >= 1) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int m117113h = this.f149500N0.m117113h();
                    if (intValue == 443 && m117113h == 5 && this.f149506T0) {
                        m156703vL(this.f149500N0);
                    }
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("FloatingCallZView", "NOTI_CALL_MIC_STATUS_UPDATE", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dL */
    public /* synthetic */ void m156685dL(Object[] objArr) {
        if (objArr != null) {
            try {
                if (objArr.length == 1) {
                    m156682aL(((Boolean) objArr[0]).booleanValue());
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("FloatingCallZView", "NOTI_CALL_MIC_STATUS_UPDATE", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eL */
    public /* synthetic */ void m156686eL(Object[] objArr) {
        if (objArr != null) {
            try {
                if (objArr.length == 1) {
                    this.f149510X0 = ((Boolean) objArr[0]).booleanValue();
                    m156677VK();
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("FloatingCallZView", "NOTI_CALL_MIC_STATUS_UPDATE", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fL */
    public /* synthetic */ void m156687fL(int i11) {
        TextureViewRenderer textureViewRenderer;
        if (i11 == EnumC17859r.SWITCH_CAMERA.ordinal() && (textureViewRenderer = this.f149490D0) != null) {
            textureViewRenderer.setMirror(!this.f149500N0.m117110g0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gL */
    public /* synthetic */ void m156688gL() {
        if (this.f149506T0) {
            return;
        }
        AbstractC3082b0.m15424f("FloatingCallZView", "Update ui from call state " + this.f149500N0.m117043M(getContext()));
        int m117113h = this.f149500N0.m117113h();
        String m117007A = this.f149500N0.m117007A();
        if (!TextUtils.isEmpty(m117007A) && !m117007A.equalsIgnoreCase(this.f149497K0)) {
            this.f149505S0 = true;
            m156699rL();
        }
        m156702uL();
        this.f149493G0.setBase(this.f149500N0.m117121j());
        String m117040L = this.f149500N0.m117040L(getContext());
        if (!TextUtils.isEmpty(m117040L)) {
            this.f149495I0.setText(m117040L);
        }
        switch (m117113h) {
            case 1:
            case 2:
            case 3:
            case 4:
                m156697pL();
                return;
            case 5:
                if (!this.f149504R0) {
                    this.f149493G0.start();
                    this.f149504R0 = true;
                }
                if (this.f149500N0.m117154r0()) {
                    m156696oL();
                } else {
                    m156696oL();
                    AbstractC32273e3.m155748Q().mo155868b2(this.f149493G0.getBase());
                }
                this.f149495I0.setVisibility(8);
                return;
            case 6:
                this.f149493G0.stop();
                return;
            default:
                return;
        }
    }

    /* renamed from: hL */
    private void m156689hL() {
        m92676n2().runOnUiThread(new Runnable() { // from class: vo0.i1
            @Override // java.lang.Runnable
            public final void run() {
                VoIPFloatingZView.this.m156688gL();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iL */
    public void m156690iL() {
        this.f149516z0.setAnim(false);
        C32369y c32369y = (C32369y) m92676n2();
        try {
            AbstractC3082b0.m15424f("VoIPFloatingZView", "onAnimationEndCollapse " + c32369y.f149317y);
            if (c32369y.f149317y) {
                TextureViewRenderer textureViewRenderer = this.f149490D0;
                if (textureViewRenderer != null) {
                    textureViewRenderer.release();
                    return;
                }
                return;
            }
            FrameLayout frameLayout = this.f149488B0;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            this.f149487A0.setVisibility(0);
            this.f149490D0.setCorner(AbstractC3104p.m15688t());
            AbstractC3098j0.m15580c(this.f149490D0);
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("FloatingCallZView", "mini selfView release failed " + e11.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jL */
    public void m156691jL() {
        try {
            this.f149516z0.setAnim(true);
            C32369y c32369y = (C32369y) m92676n2();
            AbstractC3082b0.m15424f("VoIPFloatingZView", "onAnimationStartCollapse " + c32369y.f149317y);
            if (c32369y.f149317y) {
                FrameLayout frameLayout = this.f149488B0;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                this.f149487A0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kL */
    public void m156692kL(float f11) {
        C32369y c32369y = (C32369y) m92676n2();
        int m15687s0 = AbstractC3104p.m15687s0(false);
        int m15636M = AbstractC3104p.m15636M(false);
        ViewGroup.LayoutParams layoutParams = this.f149514x0.getLayoutParams();
        layoutParams.width = (int) (m15687s0 * f11);
        layoutParams.height = (int) (m15636M * f11);
        this.f149514x0.setLayoutParams(layoutParams);
        c32369y.m156433I(layoutParams.width, layoutParams.height);
    }

    /* renamed from: lL */
    private void m156693lL() {
        C23744a.m124114c().m124115b(this, 1007);
        C23744a.m124114c().m124115b(this, 1001);
        C23744a.m124114c().m124115b(this, 10011);
        C23744a.m124114c().m124115b(this, 10016);
        C23744a.m124114c().m124115b(this, 10017);
        C23744a.m124114c().m124115b(this, 10014);
    }

    /* renamed from: mL */
    private void m156694mL() {
        try {
            if (this.f149509W0 == 1) {
                C17843b.m94137o().m94171d0();
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("FloatingCallZView", "setLastFrameIntoRenderView: " + e11.getMessage(), e11);
        }
    }

    /* renamed from: nL */
    private void m156695nL() {
        AbstractC3082b0.m15424f("VoIPFloatingZView", "setNativeVideoView " + this.f149506T0);
        if (this.f149506T0) {
            if (this.f149490D0 != null) {
                AbstractC32273e3.m155748Q().mo155880f2(this.f149490D0, true);
            }
            if (this.f149516z0 != null) {
                AbstractC32273e3.m155748Q().mo155880f2(this.f149516z0, false);
            }
        }
    }

    /* renamed from: oL */
    private void m156696oL() {
        int i11;
        if (this.f149494H0.getCurrentView() != this.f149493G0) {
            this.f149494H0.showNext();
        }
        Chronometer chronometer = this.f149493G0;
        if (this.f149500N0.m117154r0()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        chronometer.setVisibility(i11);
    }

    /* renamed from: pL */
    private void m156697pL() {
        if (this.f149494H0.getCurrentView() == this.f149493G0) {
            this.f149494H0.showNext();
        }
    }

    /* renamed from: qL */
    private void m156698qL() {
        try {
            C23744a.m124114c().m124117e(this, 1007);
            C23744a.m124114c().m124117e(this, 1001);
            C23744a.m124114c().m124117e(this, 10011);
            C23744a.m124114c().m124117e(this, 10016);
            C23744a.m124114c().m124117e(this, 10017);
            C23744a.m124114c().m124117e(this, 10014);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("FloatingCallZView", "unregisterBroadcast " + e11.getMessage(), e11);
        }
    }

    /* renamed from: rL */
    private void m156699rL() {
        if (this.f149505S0 && this.f149491E0 != null) {
            try {
                m156700sL();
                String m117007A = this.f149500N0.m117007A();
                this.f149497K0 = m117007A;
                if (!TextUtils.isEmpty(m117007A)) {
                    if (C23302b.f113247a.m120523d(this.f149497K0)) {
                        int m155825M = AbstractC32273e3.m155748Q().m155825M(String.valueOf(this.f149500N0.m117013C()));
                        String m155853V = AbstractC32273e3.m155748Q().m155853V(this.f149500N0.m117010B());
                        if (m155825M != -1 && !TextUtils.isEmpty(m155853V)) {
                            this.f149491E0.setImageDrawable(C16640q2.m88404a().mo88412f(m155853V, m155825M));
                        }
                        ((C23528a) this.f149499M0.m123612r(this.f149491E0)).m123615u(this.f149498L0);
                    } else {
                        ((C23528a) this.f149499M0.m123612r(this.f149491E0)).m123618x(this.f149497K0, C23278z2.m120143n());
                    }
                } else {
                    ((C23528a) this.f149499M0.m123612r(this.f149491E0)).m123615u(this.f149498L0);
                }
                this.f149505S0 = false;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: sL */
    private void m156700sL() {
        try {
            String m117169w = this.f149500N0.m117169w();
            if (this.f149489C0 != null && !TextUtils.isEmpty(m117169w)) {
                AbstractC3082b0.m15421c("FloatingCallZView", "updateSelfMaskView " + m117169w);
                if (!C23302b.f113247a.m120523d(m117169w)) {
                    ((C23528a) this.f149499M0.m123612r(this.f149489C0)).m123577A(m117169w, this.f149513w0, 1, new C32406c(m117169w));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: tL */
    private void m156701tL(C22626t c22626t) {
        try {
            String m117007A = c22626t.m117007A();
            if (this.f149515y0 != null && !TextUtils.isEmpty(m117007A)) {
                AbstractC3082b0.m15421c("FloatingCallZView", "updateCaptureViewMask " + m117007A);
                if (!C23302b.f113247a.m120523d(m117007A)) {
                    ((C23528a) this.f149499M0.m123612r(this.f149515y0)).m123577A(m117007A, this.f149513w0, 1, new C32407d(m117007A));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: uL */
    private void m156702uL() {
        if (this.f149492F0 == null) {
            return;
        }
        String m117049O = this.f149500N0.m117049O(getContext(), 20);
        String string = m92651WI().getString(AbstractC8020f0.unknown_user);
        if (TextUtils.isEmpty(this.f149492F0.getText()) || this.f149492F0.getText().equals(string) || (!this.f149492F0.getText().equals(m117049O) && !m117049O.equals(string))) {
            this.f149492F0.setText(m117049O);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vL */
    public void m156703vL(C22626t c22626t) {
        if (this.f149514x0 != null && c22626t != null) {
            if (this.f149506T0) {
                m156700sL();
                if (!c22626t.m117114h0() && !c22626t.m117038K0()) {
                    this.f149490D0.setVisibility(0);
                    this.f149489C0.setVisibility(8);
                } else {
                    this.f149490D0.setVisibility(8);
                    this.f149489C0.setVisibility(0);
                }
                if (c22626t.m117176y0()) {
                    int m117178z = c22626t.m117178z();
                    if (c22626t.m117179z0() && m117178z != 3 && m117178z != 14) {
                        this.f149515y0.setVisibility(8);
                    } else {
                        this.f149515y0.setVisibility(0);
                    }
                } else {
                    this.f149515y0.setVisibility(8);
                }
                C3979l c3979l = this.f149501O0;
                if (c3979l != null) {
                    this.f149515y0.setImageInfo(c3979l, true);
                    return;
                } else {
                    this.f149515y0.setImageResource(AbstractC16803z.avatar_blur_default);
                    return;
                }
            }
            m156689hL();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C32318n3.m156214E().m156254M(false);
        this.f149499M0 = new C23528a(getContext());
        this.f149498L0 = C23212s8.m119609q(getContext(), AbstractC16781w.default_avatar);
        C22626t m155737l = C32257b4.m155726m().m155737l();
        this.f149500N0 = m155737l;
        this.f149506T0 = m155737l.m117047N0();
        C24003n c24003n = new C24003n();
        this.f149513w0 = c24003n;
        c24003n.f116264e = 1006;
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116271l = AbstractC16803z.avatar_blur_default;
        C21709f m112019d = this.f149503Q0.m112019d();
        this.f149502P0 = m112019d;
        m112019d.m112048u(AbstractC21245c.f103554a);
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("ACTION_CALL_UPDATE_STATE");
            AbstractC2351i.m12327a(getContext(), this.f149512Z0, intentFilter, false);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("FloatingCallZView", "Register receiver failed ", e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f149508V0 = m156680YK();
        this.f149507U0 = m156681ZK();
        m156683bL(layoutInflater);
        m156703vL(this.f149500N0);
        m156695nL();
        m156693lL();
        this.f149502P0.m112030a(new C32405b());
        this.f149502P0.m112050w(1.0d);
        return this.f149514x0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        getContext().unregisterReceiver(this.f149512Z0);
        m156698qL();
        try {
            TextureViewRenderer textureViewRenderer = this.f149490D0;
            if (textureViewRenderer != null) {
                textureViewRenderer.release();
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("FloatingCallZView", "mini selfView release failed " + e11.toString());
        }
        try {
            TextureViewRenderer textureViewRenderer2 = this.f149516z0;
            if (textureViewRenderer2 != null) {
                textureViewRenderer2.release();
                this.f149516z0.registerSurfaceViewCallback(null);
            }
        } catch (Exception e12) {
            AbstractC3082b0.m15422d("FloatingCallZView", "mini partnerView release failed " + e12.toString());
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f149502P0.m112041n();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "VoIPFloatingZView";
    }

    @Override // com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.f149506T0) {
            m156689hL();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
    }

    @Override // org.webrtc.ICallbackSurfaceViewCreated
    public void onSurfaceViewCreated(int i11) {
        synchronized (this) {
            if (i11 >= 0) {
                try {
                    this.f149509W0 = i11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C22626t c22626t = this.f149500N0;
        if (c22626t != null && this.f149506T0) {
            if (c22626t.m117176y0() || this.f149500N0.m117130l0()) {
                m156694mL();
            }
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, final Object... objArr) {
        if (i11 != 1001) {
            if (i11 != 1007) {
                if (i11 != 10011) {
                    if (i11 != 10014) {
                        if (i11 != 10016) {
                            if (i11 == 10017) {
                                AbstractC19444a.m101695c(new Runnable() { // from class: vo0.l1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        VoIPFloatingZView.this.m156686eL(objArr);
                                    }
                                });
                                return;
                            }
                            return;
                        } else {
                            ProgressBar progressBar = this.f149496J0;
                            if (progressBar != null) {
                                progressBar.setVisibility(0);
                                return;
                            }
                            return;
                        }
                    }
                    final int intValue = ((Integer) objArr[0]).intValue();
                    m92676n2().runOnUiThread(new Runnable() { // from class: vo0.m1
                        @Override // java.lang.Runnable
                        public final void run() {
                            VoIPFloatingZView.this.m156687fL(intValue);
                        }
                    });
                    return;
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: vo0.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        VoIPFloatingZView.this.m156685dL(objArr);
                    }
                });
                return;
            }
            if (this.f149500N0 == null) {
                return;
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: vo0.j1
                @Override // java.lang.Runnable
                public final void run() {
                    VoIPFloatingZView.this.m156684cL(objArr);
                }
            });
            return;
        }
        AbstractC3082b0.m15421c("FloatingCallZView", "Update UI from call state: " + this.f149500N0.m117113h());
        if (!this.f149506T0) {
            m156689hL();
        }
    }
}
