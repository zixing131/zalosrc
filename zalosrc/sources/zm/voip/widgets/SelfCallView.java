package zm.voip.widgets;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import bp0.AbstractC3082b0;
import bp0.AbstractC3098j0;
import bp0.AbstractC3104p;
import bp0.AbstractC3105q;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalocore.CoreUtility;
import gp0.C19577z;
import jo0.C21334l;
import ko0.C21791f;
import org.webrtc.TextureViewRenderer;
import org.webrtc.ViewRenderListener;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import vg.C28203u6;
import zm.voip.service.AbstractC32273e3;
import zm.voip.widgets.SelfCallView;
import zm.voip.widgets.moduleviews.VoIPItemAva;

/* loaded from: classes7.dex */
public class SelfCallView extends ChildGridCallView {

    /* renamed from: w */
    C21791f f150100w;

    /* renamed from: x */
    public VoIPItemAva f150101x;

    /* renamed from: y */
    private final ViewRenderListener f150102y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.widgets.SelfCallView$a */
    /* loaded from: classes7.dex */
    public class C32501a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f150103l1;

        C32501a(String str) {
            this.f150103l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null && this.f150103l1.equals(str)) {
                        SelfCallView.this.f149894q.setImageInfo(c3979l, true);
                    }
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e("SelfCallView", "updateCaptureViewMask : " + e11.getMessage(), e11);
                    return;
                }
            }
            SelfCallView.this.f149894q.setImageResource(AbstractC16803z.avatar_blur_default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.widgets.SelfCallView$b */
    /* loaded from: classes7.dex */
    public class C32502b implements ViewRenderListener {
        C32502b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m157403b() {
            try {
                TextureViewRenderer textureViewRenderer = SelfCallView.this.f149893p;
                if (textureViewRenderer != null) {
                    textureViewRenderer.registerSurfaceViewCallback(null);
                    SelfCallView.this.f149893p.release();
                    SelfCallView.this.m157277c();
                    AbstractC32273e3.m155748Q().mo155883g2(SelfCallView.this.f149893p, true, 0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // org.webrtc.ViewRenderListener
        public void onRenderFail() {
            SelfCallView.this.f149893p.post(new Runnable() { // from class: zm.voip.widgets.b
                @Override // java.lang.Runnable
                public final void run() {
                    SelfCallView.C32502b.this.m157403b();
                }
            });
        }

        @Override // org.webrtc.ViewRenderListener
        public void onVideoFrameChange(int i11, int i12, int i13, int i14) {
        }
    }

    public SelfCallView(Context context) {
        super(context);
        this.f150102y = new C32502b();
    }

    /* renamed from: h */
    private void m157397h() {
        C21791f c21791f = new C21791f(1);
        this.f150100w = c21791f;
        c21791f.m112463F(C21334l.f103899A.m110500a());
        this.f150100w.m112458A("");
        this.f150100w.m112485t(C28203u6.f131407a.m141808b(CoreUtility.f89233i));
    }

    @Override // zm.voip.widgets.ChildGridCallView
    /* renamed from: b */
    public void mo157276b() {
        m157397h();
        TextureViewRenderer m15578a = AbstractC3098j0.m15578a(getContext(), true, "selfView");
        this.f149893p = m15578a;
        m15578a.setRenderListener(this.f150102y);
        this.f149893p.setId(AbstractC6918a0.call_selfView);
        this.f149893p.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
        m157277c();
        BlurImageView blurImageView = new BlurImageView(getContext());
        this.f149894q = blurImageView;
        blurImageView.setId(AbstractC6918a0.call_selfMaskView);
        this.f149894q.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f149894q.setImageBitmap(BitmapFactory.decodeResource(getResources(), AbstractC16803z.avatar_blur_default));
        this.f149894q.setVisibility(8);
        this.f149894q.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
        this.f150101x = new VoIPItemAva(getContext());
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(AbstractC3104p.m15650a(35.0f), AbstractC3104p.m15650a(35.0f));
        m15700c.gravity = 17;
        this.f150101x.setLayoutParams(m15700c);
        this.f150101x.setVisibility(8);
        this.f150101x.m157465W(AbstractC3104p.m15650a(32.0f));
        this.f150101x.m157466Y(this.f150100w);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149896s = linearLayout;
        linearLayout.setId(AbstractC6918a0.call_captureTextLayout);
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
        m15698a.gravity = 83;
        m15698a.leftMargin = AbstractC3104p.m15650a(12.0f);
        m15698a.bottomMargin = AbstractC3104p.m15650a(12.0f);
        this.f149896s.setLayoutParams(m15698a);
        this.f149896s.setPadding(AbstractC3104p.m15650a(6.0f), 0, AbstractC3104p.m15650a(6.0f), 0);
        this.f149896s.setBackgroundResource(AbstractC16803z.bg_gcall_mini_info_layout);
        this.f149896s.setOrientation(0);
        this.f149896s.setGravity(3);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f149897t = appCompatImageView;
        appCompatImageView.setId(AbstractC6918a0.call_ivCaptureStateMic);
        AppCompatImageView appCompatImageView2 = this.f149897t;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        appCompatImageView2.setScaleType(scaleType);
        this.f149897t.setImageResource(AbstractC16803z.ic_call_mini_off_mic);
        LinearLayout.LayoutParams m15703f = AbstractC3105q.m15703f(AbstractC3104p.m15661f0(), AbstractC3104p.m15661f0());
        m15703f.gravity = 16;
        m15703f.setMargins(AbstractC3104p.m15650a(3.0f), AbstractC3104p.m15650a(3.0f), AbstractC3104p.m15650a(3.0f), AbstractC3104p.m15650a(3.0f));
        this.f149897t.setLayoutParams(m15703f);
        AppCompatImageView appCompatImageView3 = this.f149897t;
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.FIT_CENTER;
        appCompatImageView3.setScaleType(scaleType2);
        this.f149897t.setVisibility(8);
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(getContext());
        this.f149898u = appCompatImageView4;
        appCompatImageView4.setId(AbstractC6918a0.call_ivCaptureStateCamera);
        this.f149898u.setScaleType(scaleType);
        this.f149898u.setImageResource(AbstractC16803z.ic_call_mini_off_cam);
        LinearLayout.LayoutParams m15703f2 = AbstractC3105q.m15703f(AbstractC3104p.m15661f0(), AbstractC3104p.m15661f0());
        m15703f2.gravity = 16;
        m15703f2.setMargins(AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f));
        this.f149898u.setLayoutParams(m15703f2);
        this.f149898u.setScaleType(scaleType2);
        this.f149898u.setVisibility(8);
        this.f149896s.addView(this.f149897t);
        addView(this.f149893p);
        addView(this.f149894q);
        addView(this.f150101x);
        addView(this.f149896s);
    }

    /* renamed from: g */
    public void m157398g(String str, boolean z11, boolean z12, int i11) {
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        if (i11 != 5) {
            this.f149894q.setVisibility(0);
            this.f150101x.setVisibility(0);
            if (i11 == 1 || i11 == 2) {
                AbstractC32273e3.m155748Q().mo155883g2(this.f149893p, true, 0);
            }
        } else if (!AbstractC23304d.f113327S1 || C19577z.m102341J().m102409b0() == 0) {
            AbstractC32273e3.m155748Q().mo155883g2(this.f149893p, true, 0);
            this.f149894q.setVisibility(8);
            this.f150101x.setVisibility(8);
        }
        m157400j(str);
        if (i11 == 5) {
            BlurImageView blurImageView = this.f149894q;
            if (z11) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            blurImageView.setVisibility(i12);
            VoIPItemAva voIPItemAva = this.f150101x;
            if (z11) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            voIPItemAva.setVisibility(i13);
            AppCompatImageView appCompatImageView = this.f149898u;
            if (z11) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            appCompatImageView.setVisibility(i14);
            AppCompatImageView appCompatImageView2 = this.f149897t;
            if (z12) {
                i15 = 0;
            }
            appCompatImageView2.setVisibility(i15);
        }
        m157278d(str);
    }

    /* renamed from: i */
    public void m157399i(boolean z11, boolean z12) {
        int i11;
        int i12;
        AppCompatImageView appCompatImageView = this.f149898u;
        int i13 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        appCompatImageView.setVisibility(i11);
        BlurImageView blurImageView = this.f149894q;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        blurImageView.setVisibility(i12);
        VoIPItemAva voIPItemAva = this.f150101x;
        if (z11 && !z12) {
            i13 = 0;
        }
        voIPItemAva.setVisibility(i13);
    }

    /* renamed from: j */
    public void m157400j(String str) {
        try {
            if (this.f149894q != null && !TextUtils.isEmpty(str)) {
                AbstractC3082b0.m15421c("SelfCallView", "updateCaptureViewMask " + str);
                if (!C23302b.f113247a.m120523d(str)) {
                    ((C23528a) this.f149899v.m123612r(this.f149894q)).m123577A(str, this.f149895r, 1, new C32501a(str));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m157401k(boolean z11) {
        int i11;
        LinearLayout linearLayout = this.f149896s;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        TextureViewRenderer textureViewRenderer = this.f149893p;
        if (textureViewRenderer != null) {
            textureViewRenderer.setAnim(true);
        }
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        TextureViewRenderer textureViewRenderer = this.f149893p;
        if (textureViewRenderer != null) {
            textureViewRenderer.setAnim(true);
        }
        super.onMeasure(i11, i12);
        TextureViewRenderer textureViewRenderer2 = this.f149893p;
        if (textureViewRenderer2 != null) {
            textureViewRenderer2.setAnim(false);
        }
    }
}
