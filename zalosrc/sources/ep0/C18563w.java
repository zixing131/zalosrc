package ep0;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3098j0;
import bp0.AbstractC3104p;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import ep0.C18563w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import jo0.C21334l;
import ko0.C21791f;
import mo0.EnumC23412c;
import on0.AbstractC24341v;
import org.webrtc.EglRenderer;
import org.webrtc.OnNextRenderCallback;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.ViewRenderListener;
import p097db.C17846e;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import zm.voip.service.AbstractC32273e3;
import zm.voip.widgets.BlurImageView;
import zm.voip.widgets.moduleviews.VoIPItemAva;

/* renamed from: ep0.w */
/* loaded from: classes7.dex */
public final class C18563w extends RecyclerView.AbstractC1876c0 {

    /* renamed from: Y */
    public static final b f93279Y = new b(null);

    /* renamed from: Z */
    private static final int f93280Z = AbstractC3104p.m15650a(8.0f);

    /* renamed from: I */
    private final Context f93281I;

    /* renamed from: J */
    private final C23528a f93282J;

    /* renamed from: K */
    private LinearLayout f93283K;

    /* renamed from: L */
    private RobotoTextView f93284L;

    /* renamed from: M */
    private RobotoTextView f93285M;

    /* renamed from: N */
    private LinearLayout f93286N;

    /* renamed from: O */
    private VoIPItemAva f93287O;

    /* renamed from: P */
    private TextureViewRenderer f93288P;

    /* renamed from: Q */
    private AppCompatImageView f93289Q;

    /* renamed from: R */
    private BlurImageView f93290R;

    /* renamed from: S */
    private int f93291S;

    /* renamed from: T */
    private int f93292T;

    /* renamed from: U */
    private boolean f93293U;

    /* renamed from: V */
    private boolean f93294V;

    /* renamed from: W */
    private final C21791f f93295W;

    /* renamed from: X */
    private C24003n f93296X;

    /* renamed from: ep0.w$a */
    /* loaded from: classes7.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m98017c(final C18563w c18563w) {
            AbstractC19074t.m100208f(c18563w, "this$0");
            AbstractC3082b0.m15424f("VoIPRenderViewHolder", "onNextRender idRendering " + c18563w.m98012u0() + " - renderStarted " + c18563w.m98013v0());
            if (c18563w.m98013v0()) {
                return;
            }
            c18563w.m98009E0(true);
            AbstractC19444a.m101695c(new Runnable() { // from class: ep0.v
                @Override // java.lang.Runnable
                public final void run() {
                    C18563w.a.m98018d(C18563w.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m98018d(C18563w c18563w) {
            AbstractC19074t.m100208f(c18563w, "this$0");
            if (!c18563w.m97985H0(c18563w.m98011t0())) {
                c18563w.f93290R.setVisibility(8);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC19074t.m100208f(view, "view");
            C18563w.this.m98009E0(false);
            AbstractC3082b0.m15424f("VoIPRenderViewHolder", "onViewAttachedToWindow registerActionOnNextRender");
            TextureViewRenderer textureViewRenderer = C18563w.this.f93288P;
            final C18563w c18563w = C18563w.this;
            textureViewRenderer.registerActionOnNextRender(new OnNextRenderCallback() { // from class: ep0.u
                @Override // org.webrtc.OnNextRenderCallback
                public final void onNextRender() {
                    C18563w.a.m98017c(C18563w.this);
                }
            });
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC19074t.m100208f(view, "view");
            if (C18563w.this.m98012u0() == C21334l.f103899A.m110500a()) {
                AbstractC32273e3.m155748Q().mo155883g2(null, true, 0);
            } else {
                C17846e.m94223f().m94251v(C18563w.this.m98012u0(), EnumC23412c.f113760p.ordinal());
            }
            AbstractC3082b0.m15424f("VoIPRenderViewHolder", "onViewDetachedFromWindow " + C18563w.this.m98012u0());
            C18563w.this.f93288P.registerActionOnNextRender(null);
            C18563w.this.m98006B0();
        }
    }

    /* renamed from: ep0.w$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ep0.w$c */
    /* loaded from: classes7.dex */
    public static final class c implements ViewRenderListener {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m98020b(C18563w c18563w) {
            AbstractC19074t.m100208f(c18563w, "this$0");
            try {
                c18563w.f93288P.registerSurfaceViewCallback(null);
                c18563w.f93288P.release();
                AbstractC3098j0.m15580c(c18563w.f93288P);
                c18563w.m97983F0(c18563w.m98012u0());
                C17846e.m94223f().m94251v(c18563w.m98012u0(), 2);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // org.webrtc.ViewRenderListener
        public void onRenderFail() {
            AbstractC3082b0.m15424f("VoIPRenderViewHolder", "onRenderFail id " + C18563w.this.m98012u0());
            TextureViewRenderer textureViewRenderer = C18563w.this.f93288P;
            final C18563w c18563w = C18563w.this;
            textureViewRenderer.post(new Runnable() { // from class: ep0.x
                @Override // java.lang.Runnable
                public final void run() {
                    C18563w.c.m98020b(C18563w.this);
                }
            });
        }

        @Override // org.webrtc.ViewRenderListener
        public void onVideoFrameChange(int i11, int i12, int i13, int i14) {
        }
    }

    /* renamed from: ep0.w$d */
    /* loaded from: classes7.dex */
    public static final class d extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f93299l1;

        d(String str) {
            this.f93299l1 = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bd");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                if (c3979l.m18839c() != null && AbstractC19074t.m100204b(this.f93299l1, str)) {
                    ((RecyclingImageView) interfaceC3968a).setImageInfo(c3979l);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18563w(Context context, View view, C23528a c23528a) {
        super(view);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(view, "itemView");
        AbstractC19074t.m100208f(c23528a, "mAQ");
        this.f93281I = context;
        this.f93282J = c23528a;
        View findViewById = view.findViewById(AbstractC6918a0.groupMiniInfo);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f93283K = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(AbstractC6918a0.bigName);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f93284L = (RobotoTextView) findViewById2;
        View findViewById3 = view.findViewById(AbstractC6918a0.callState);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f93285M = (RobotoTextView) findViewById3;
        View findViewById4 = view.findViewById(AbstractC6918a0.informationGroup);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f93286N = (LinearLayout) findViewById4;
        View findViewById5 = view.findViewById(AbstractC6918a0.avatar);
        AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
        this.f93287O = (VoIPItemAva) findViewById5;
        View findViewById6 = view.findViewById(AbstractC6918a0.renderer);
        AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
        this.f93288P = (TextureViewRenderer) findViewById6;
        View findViewById7 = view.findViewById(AbstractC6918a0.iconMic);
        AbstractC19074t.m100207e(findViewById7, "findViewById(...)");
        this.f93289Q = (AppCompatImageView) findViewById7;
        View findViewById8 = view.findViewById(AbstractC6918a0.blurView);
        AbstractC19074t.m100207e(findViewById8, "findViewById(...)");
        this.f93290R = (BlurImageView) findViewById8;
        this.f93292T = -1;
        this.f93295W = new C21791f(1);
        C24003n c24003n = new C24003n(0, null, 0, false, 0, false, null, 127, null);
        this.f93296X = c24003n;
        c24003n.f116264e = 1006;
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116271l = AbstractC16803z.avatar_blur_default;
        this.f93290R.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f93288P.setCorner(f93280Z);
        this.f93288P.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        this.f93288P.setVideoRenderMode(EglRenderer.RenderMode.AspectScaleToFill);
        m98014x0();
        this.f93287O.m157465W(AbstractC3104p.m15650a(48.0f));
        view.addOnAttachStateChangeListener(new a());
    }

    /* renamed from: A0 */
    private final void m97982A0(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (C23302b.f113247a.m120523d(str)) {
                }
                ((C23528a) this.f93282J.m123612r(this.f93290R)).m123577A(str, this.f93296X, 1, new d(str));
            }
            ((C23528a) this.f93282J.m123612r(this.f93290R)).m123619y(C23302b.f113247a.m120521a(), this.f93296X, 1);
            ((C23528a) this.f93282J.m123612r(this.f93290R)).m123577A(str, this.f93296X, 1, new d(str));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public final void m97983F0(int i11) {
        if (!m98005z0()) {
            AbstractC32273e3.m155748Q().mo155883g2(this.f93288P, false, i11);
        }
    }

    /* renamed from: G0 */
    private final boolean m97984G0(C21791f c21791f) {
        if (m98004y0(c21791f) && !c21791f.m112479n()) {
            return false;
        }
        if ((c21791f.m112473h() == 3 && !c21791f.m112479n()) || c21791f.m112473h() != 3) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public final boolean m97985H0(C21791f c21791f) {
        if (m97984G0(c21791f)) {
            return true;
        }
        if (m98004y0(c21791f) && c21791f.m112479n()) {
            return true;
        }
        if (!m98004y0(c21791f) && ((!c21791f.m112483r() && c21791f.m112477l() != this.f93292T) || c21791f.m112477l() != this.f93292T || !this.f93294V)) {
            return true;
        }
        return false;
    }

    /* renamed from: I0 */
    private final void m97986I0(C21791f c21791f, boolean z11) {
        int i11;
        BlurImageView blurImageView = this.f93290R;
        if (m97985H0(c21791f)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        blurImageView.setVisibility(i11);
        if (m97984G0(c21791f) && !z11) {
            this.f93286N.setVisibility(0);
            this.f93287O.setVisibility(0);
        } else {
            this.f93287O.setVisibility(8);
        }
        this.f93295W.m112486u(c21791f.m112479n());
    }

    /* renamed from: J0 */
    private final void m97987J0(boolean z11) {
        if (z11 && this.f93290R.getCornerRadius() == f93280Z) {
            this.f93290R.setCornerRadius(0);
            this.f93288P.setCorner(0.0f);
        } else if (!z11) {
            int cornerRadius = this.f93290R.getCornerRadius();
            int i11 = f93280Z;
            if (cornerRadius != i11) {
                this.f93290R.setCornerRadius(i11);
                this.f93288P.setCorner(i11);
            }
        }
    }

    /* renamed from: K0 */
    private final void m97988K0(C21791f c21791f) {
        if (this.f93291S != this.f7784p.getLayoutParams().height) {
            if (this.f93291S == 0) {
                this.f7784p.getLayoutParams().height = -1;
            } else {
                this.f7784p.getLayoutParams().height = this.f93291S;
            }
            m97982A0(c21791f.m112467b());
        }
    }

    /* renamed from: L0 */
    private final void m97989L0(C21791f c21791f, boolean z11) {
        int i11 = 8;
        if (c21791f.m112481p()) {
            if (this.f93289Q.getVisibility() != 0) {
                this.f93289Q.setVisibility(0);
            }
            LinearLayout linearLayout = this.f93283K;
            if (!z11) {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
            return;
        }
        if (this.f93289Q.getVisibility() == 0) {
            this.f93289Q.setVisibility(8);
        }
        this.f93283K.setVisibility(8);
    }

    /* renamed from: M0 */
    private final void m97990M0(boolean z11) {
        if (z11) {
            View view = this.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            view.setPadding(0, 0, 0, 0);
        } else {
            View view2 = this.f7784p;
            AbstractC19074t.m100207e(view2, "itemView");
            int m15650a = AbstractC3104p.m15650a(2.0f);
            view2.setPadding(m15650a, m15650a, m15650a, m15650a);
        }
    }

    /* renamed from: N0 */
    private final void m97991N0(C21791f c21791f) {
        if (c21791f.m112482q()) {
            this.f93288P.setVideoRenderMode(EglRenderer.RenderMode.AspectScaleToFit);
        } else {
            this.f93288P.setVideoRenderMode(EglRenderer.RenderMode.AspectScaleToFill);
        }
    }

    /* renamed from: O0 */
    private final void m97992O0(C21791f c21791f) {
        if (c21791f.m112473h() == this.f93295W.m112473h()) {
            return;
        }
        this.f93295W.m112461D(c21791f.m112473h());
        this.f93285M.setText(c21791f.m112474i());
        int m112473h = c21791f.m112473h();
        if (m112473h != -1) {
            if (m112473h != 1 && m112473h != 2) {
                if (m112473h != 3) {
                    if (m112473h == 4) {
                        this.f93286N.setVisibility(0);
                        this.f93285M.setVisibility(8);
                        this.f93283K.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f93284L.setVisibility(8);
                this.f93285M.setVisibility(8);
                return;
            }
            this.f93286N.setVisibility(0);
            this.f93287O.setVisibility(8);
            this.f93284L.setVisibility(8);
            if (!c21791f.m112480o() && !m98004y0(c21791f)) {
                this.f93285M.setVisibility(0);
                this.f93283K.setVisibility(8);
                return;
            } else {
                this.f93285M.setVisibility(8);
                this.f93283K.setVisibility(8);
                return;
            }
        }
        this.f93286N.setVisibility(8);
        this.f93283K.setVisibility(8);
    }

    /* renamed from: o0 */
    private final void m97999o0(C21791f c21791f) {
        this.f93287O.m157466Y(c21791f);
    }

    /* renamed from: p0 */
    private final void m98000p0(C21791f c21791f) {
        if (m98004y0(c21791f)) {
            this.f93294V = true;
            this.f93288P.registerActionOnNextRender(null);
            int i11 = this.f93292T;
            C21334l.a aVar = C21334l.f103899A;
            if (i11 != aVar.m110500a()) {
                AbstractC32273e3.m155748Q().mo155883g2(this.f93288P, true, 0);
            }
            this.f93288P.setMirror(c21791f.m112470e());
            this.f93292T = aVar.m110500a();
            return;
        }
        if (c21791f.m112473h() == 3) {
            if (!c21791f.m112483r()) {
                if (this.f93295W.m112472g() != 0) {
                    C17846e.m94223f().m94251v(c21791f.m112477l(), EnumC23412c.f113760p.ordinal());
                }
                this.f93295W.m112459B(EnumC23412c.f113760p.ordinal());
                return;
            }
            if (this.f93292T != c21791f.m112477l()) {
                if (!this.f93294V) {
                    this.f93290R.setVisibility(0);
                }
                AbstractC3082b0.m15424f("VoIPRenderViewHolder", "registerActionOnNextRender " + c21791f.m112477l());
                this.f93288P.registerActionOnNextRender(new OnNextRenderCallback() { // from class: ep0.s
                    @Override // org.webrtc.OnNextRenderCallback
                    public final void onNextRender() {
                        C18563w.m98001q0(C18563w.this);
                    }
                });
                m97983F0(c21791f.m112477l());
                this.f93288P.setMirror(false);
                this.f93292T = c21791f.m112477l();
            }
            C17846e.m94223f().m94251v(c21791f.m112477l(), c21791f.m112472g());
            this.f93295W.m112459B(c21791f.m112472g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public static final void m98001q0(final C18563w c18563w) {
        AbstractC19074t.m100208f(c18563w, "this$0");
        AbstractC3082b0.m15424f("VoIPRenderViewHolder", "onNextRender2 idRendering " + c18563w.f93292T + " - renderStarted " + c18563w.f93294V);
        if (c18563w.f93294V) {
            return;
        }
        c18563w.f93294V = true;
        AbstractC19444a.m101695c(new Runnable() { // from class: ep0.t
            @Override // java.lang.Runnable
            public final void run() {
                C18563w.m98002r0(C18563w.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m98002r0(C18563w c18563w) {
        AbstractC19074t.m100208f(c18563w, "this$0");
        c18563w.f93290R.setVisibility(8);
        c18563w.f93286N.setVisibility(8);
    }

    /* renamed from: w0 */
    private final void m98003w0(C21791f c21791f) {
        boolean m127128x;
        if (this.f93295W.m112477l() == c21791f.m112477l()) {
            return;
        }
        String m112471f = c21791f.m112471f();
        if (m112471f != null) {
            m127128x = AbstractC24341v.m127128x(m112471f);
            if (!m127128x) {
                String m112471f2 = c21791f.m112471f();
                if (m112471f2.length() > 20) {
                    AbstractC19074t.m100205c(m112471f2);
                    String substring = m112471f2.substring(0, 19);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    m112471f2 = substring + "...";
                }
                this.f93284L.setText(m112471f2);
                m97999o0(c21791f);
                m97982A0(c21791f.m112467b());
                this.f93295W.m112463F(c21791f.m112477l());
            }
        }
        this.f93284L.setText("");
        m97999o0(c21791f);
        m97982A0(c21791f.m112467b());
        this.f93295W.m112463F(c21791f.m112477l());
    }

    /* renamed from: y0 */
    private final boolean m98004y0(C21791f c21791f) {
        if (c21791f.m112477l() == C21334l.f103899A.m110500a()) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    private final boolean m98005z0() {
        if (AbstractC3096i0.f13170n && (AbstractC3096i0.f13174r == 5 || AbstractC3096i0.f13174r == 6)) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public final void m98006B0() {
        this.f93295W.m112461D(0);
        this.f93295W.m112463F(0);
        this.f93295W.m112459B(EnumC23412c.f113760p.ordinal());
        this.f93292T = 0;
        this.f93294V = false;
    }

    /* renamed from: C0 */
    public final void m98007C0(C21791f c21791f, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(c21791f, "data");
        try {
            AbstractC3082b0.m15424f("VoIPRenderViewHolder", "setData " + c21791f.m112477l() + " - isDestroying " + z11 + " - state " + c21791f.m112473h() + " - renderStarted " + this.f93294V + " - isOffCam " + c21791f.m112479n() + " - isOffMic " + c21791f.m112481p() + " - isvisible " + c21791f.m112483r() + " - idShowing " + this.f93295W.m112477l());
            m97988K0(c21791f);
            m98003w0(c21791f);
            if (!this.f93293U) {
                m98014x0();
            }
            m97991N0(c21791f);
            m97986I0(c21791f, z12);
            m98000p0(c21791f);
            m97989L0(c21791f, z12);
            m97992O0(c21791f);
            m97990M0(z12);
            m97987J0(z12);
            if (z11) {
                m98010s0(c21791f);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D0 */
    public final void m98008D0(int i11) {
        this.f93291S = i11;
    }

    /* renamed from: E0 */
    public final void m98009E0(boolean z11) {
        this.f93294V = z11;
    }

    /* renamed from: s0 */
    public final void m98010s0(C21791f c21791f) {
        AbstractC19074t.m100208f(c21791f, "data");
        AbstractC3082b0.m15424f("VoIPRenderViewHolder", "clearRender " + c21791f.m112477l());
        this.f93288P.registerActionOnNextRender(null);
        AbstractC32273e3.m155748Q().mo155883g2(null, m98004y0(c21791f), c21791f.m112477l());
        this.f93288P.setRenderListener(null);
        this.f93288P.release();
        this.f93293U = false;
    }

    /* renamed from: t0 */
    public final C21791f m98011t0() {
        return this.f93295W;
    }

    /* renamed from: u0 */
    public final int m98012u0() {
        return this.f93292T;
    }

    /* renamed from: v0 */
    public final boolean m98013v0() {
        return this.f93294V;
    }

    /* renamed from: x0 */
    public final void m98014x0() {
        this.f93288P.setRenderListener(new c());
        AbstractC3098j0.m15580c(this.f93288P);
        this.f93293U = true;
    }
}
