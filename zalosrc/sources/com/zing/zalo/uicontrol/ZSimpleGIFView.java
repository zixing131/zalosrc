package com.zing.zalo.uicontrol;

import ag0.AbstractC0837p0;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Outline;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZGifView;
import com.zing.zalo.zplayer.C17395R;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalocore.CoreUtility;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23202r9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* loaded from: classes4.dex */
public class ZSimpleGIFView extends FrameLayout {

    /* renamed from: p */
    protected int f83605p;

    /* renamed from: q */
    protected ZGifView f83606q;

    /* renamed from: r */
    protected C23528a f83607r;

    /* renamed from: s */
    protected C16554f f83608s;

    /* renamed from: t */
    protected AbstractC16553e f83609t;

    /* renamed from: u */
    protected int f83610u;

    /* renamed from: v */
    protected boolean f83611v;

    /* renamed from: w */
    protected boolean f83612w;

    /* renamed from: x */
    private final Runnable f83613x;

    /* renamed from: com.zing.zalo.uicontrol.ZSimpleGIFView$a */
    /* loaded from: classes4.dex */
    public class C16549a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ RecyclingImageView f83614l1;

        /* renamed from: com.zing.zalo.uicontrol.ZSimpleGIFView$a$a */
        /* loaded from: classes4.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }
        }

        C16549a(RecyclingImageView recyclingImageView) {
            this.f83614l1 = recyclingImageView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            String str2;
            try {
                C16554f c16554f = ZSimpleGIFView.this.f83608s;
                if (c16554f != null) {
                    str2 = c16554f.f83624b;
                } else {
                    str2 = "";
                }
                if (!TextUtils.isEmpty(str) && str.equals(str2) && c3979l != null && c3979l.m18839c() != null && !c3979l.m18839c().isRecycled()) {
                    this.f83614l1.setAlpha(0.0f);
                    AbstractC23202r9.m119539g(this.f83614l1, 150L, new a());
                    ZSimpleGIFView.this.setImageThumbGIF(c3979l);
                    ZSimpleGIFView.this.f83606q.m92344M(false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.ZSimpleGIFView$b */
    /* loaded from: classes4.dex */
    public class C16550b extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f83617a;

        C16550b(int i11) {
            this.f83617a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = view.getWidth();
            int height = view.getHeight();
            int i11 = this.f83617a;
            outline.setRoundRect(0, 0, width, height + i11, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.ZSimpleGIFView$c */
    /* loaded from: classes4.dex */
    public class C16551c extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f83619a;

        C16551c(int i11) {
            this.f83619a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f83619a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.ZSimpleGIFView$d */
    /* loaded from: classes4.dex */
    public class C16552d extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f83621a;

        C16552d(int i11) {
            this.f83621a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, -this.f83621a, view.getWidth(), view.getHeight(), this.f83621a);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.ZSimpleGIFView$e */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC16553e {
        /* renamed from: a */
        public abstract void mo79869a(C3979l c3979l);
    }

    public ZSimpleGIFView(Context context) {
        super(context);
        this.f83605p = 2;
        this.f83607r = new C23528a(getContext());
        this.f83608s = new C16554f();
        this.f83610u = -1;
        this.f83611v = false;
        this.f83612w = true;
        this.f83613x = new Runnable() { // from class: com.zing.zalo.uicontrol.u2
            public /* synthetic */ RunnableC16664u2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZSimpleGIFView.this.m88220k();
            }
        };
        m88225h();
    }

    /* renamed from: c */
    public static Size m88218c(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21 = i14;
        if (i12 * i11 <= 0) {
            i15 = i21;
            i16 = i15;
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                double d11 = i21;
                i19 = (int) (d11 / 1.5d);
                i18 = (int) (d11 * 0.25d);
                i17 = (int) (d11 * 1.3333333730697632d);
            } else {
                int i22 = (int) (i21 / 1.3333333730697632d);
                i18 = i21;
                i21 = i22;
                i19 = (int) (i22 / 1.5d);
                i17 = i18;
            }
        } else {
            double d12 = i21;
            i17 = (int) (d12 * 1.3333333730697632d);
            i18 = (int) (d12 * 0.25d);
            i19 = i21;
        }
        double d13 = i16;
        double d14 = i15;
        double d15 = d13 / d14;
        if (0.25d <= d15 && d15 <= 1.5d) {
            if (i13 == 2) {
                i21 = (i15 * i17) / i16;
            } else {
                int i23 = (i21 * i16) / i15;
                if (i23 > i17) {
                    i21 = (i15 * i17) / i16;
                } else {
                    i18 = i23;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i21);
                    sb2.append(", ");
                    sb2.append(i18);
                    i19 = i21;
                }
            }
            i18 = i17;
            StringBuilder sb22 = new StringBuilder();
            sb22.append(i21);
            sb22.append(", ");
            sb22.append(i18);
            i19 = i21;
        } else if (d15 < 0.25d) {
            double d16 = i18 / d13;
            i19 = Math.min(i21, (((int) (d14 * d16)) * i18) / ((int) (d13 * d16)));
        } else if (i13 == 2) {
            double d17 = i18 / d13;
            i19 = Math.min(i21, (((int) (d14 * d17)) * i18) / ((int) (d13 * d17)));
        } else {
            double d18 = i19 / d14;
            i18 = Math.min(i17, (((int) (d13 * d18)) * i19) / ((int) (d14 * d18)));
        }
        return new Size(i19, i18);
    }

    /* renamed from: j */
    public /* synthetic */ void m88219j() {
        try {
            if (isAttachedToWindow() && this.f83608s != null && this.f83612w && !this.f83611v) {
                this.f83612w = false;
                this.f83606q.m92336E();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: k */
    public /* synthetic */ void m88220k() {
        if (this.f83612w && !this.f83611v) {
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.uicontrol.v2
                public /* synthetic */ RunnableC16668v2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZSimpleGIFView.this.m88219j();
                }
            });
        }
    }

    /* renamed from: d */
    public void m88221d() {
        removeCallbacks(this.f83613x);
    }

    /* renamed from: e */
    public boolean m88222e(String str) {
        if (TextUtils.equals(this.f83608s.f83623a, str) && m88226i()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    protected void m88223f() {
        m88221d();
        this.f83606q.m92345N();
        this.f83606q.m92337F(true);
        this.f83608s = null;
        this.f83612w = true;
        this.f83611v = false;
    }

    /* renamed from: g */
    public void m88224g(long j11) {
        removeCallbacks(this.f83613x);
        postDelayed(this.f83613x, j11);
    }

    /* renamed from: h */
    protected void m88225h() {
        ZGifView zGifView = new ZGifView(getContext());
        this.f83606q = zGifView;
        addView(zGifView, new FrameLayout.LayoutParams(-1, -1, 17));
        setCropMode(2);
        this.f83606q.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(1));
        this.f83606q.setForceHideController(true);
        this.f83606q.setClickable(false);
        requestLayout();
    }

    /* renamed from: i */
    public boolean m88226i() {
        return this.f83606q.isPlaying();
    }

    /* renamed from: l */
    public void m88227l(C16554f c16554f, int i11, AbstractC16553e abstractC16553e) {
        float f11;
        try {
            String str = c16554f.f83623a;
            removeCallbacks(this.f83613x);
            if (TextUtils.isEmpty(str)) {
                m88223f();
                this.f83608s = c16554f;
                this.f83610u = i11;
                this.f83609t = abstractC16553e;
                this.f83612w = false;
                m88228m();
                return;
            }
            C16554f c16554f2 = this.f83608s;
            if (c16554f2 == null || i11 != this.f83610u || !TextUtils.equals(str, c16554f2.f83623a)) {
                m88223f();
                this.f83608s = c16554f;
                this.f83610u = i11;
                this.f83609t = abstractC16553e;
                this.f83612w = true;
                int i12 = c16554f.f83625c;
                int i13 = c16554f.f83626d;
                if (i12 * i13 == 0) {
                    f11 = 1.0f;
                } else {
                    f11 = (i12 * 1.0f) / i13;
                }
                this.f83606q.m92341J(new C17391z(CoreUtility.f89233i, "", c16554f.f83623a, "", c16554f.f83624b, i12, false, 3, f11, 4, null, c16554f.f83627e, i11), ZMediaPlayerSettings.getVideoConfig(4));
                m88228m();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: m */
    protected void m88228m() {
        C16554f c16554f;
        RecyclingImageView loadingView = this.f83606q.getLoadingView();
        if (loadingView != null && (c16554f = this.f83608s) != null && !TextUtils.isEmpty(c16554f.f83624b)) {
            String str = this.f83608s.f83624b;
            C24003n m120125f = C23278z2.m120125f();
            C3979l m125676A2 = C23999j.m125676A2(str, this.f83608s.f83628f, m120125f.f116266g);
            if (m125676A2 != null) {
                setImageThumbGIF(m125676A2);
                return;
            }
            loadingView.setImageDrawable(AbstractC23136l9.m118665N(loadingView.getContext(), AbstractC17466e.transparent));
            this.f83606q.m92344M(true);
            ((C23528a) this.f83607r.m123612r(loadingView)).m123588L(str, m120125f, this.f83608s.f83628f, new C16549a(loadingView));
        }
    }

    /* renamed from: n */
    public void m88229n() {
        this.f83606q.pause();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f83606q.getLoadingView() != null) {
            this.f83606q.getLoadingView().setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        m88223f();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        if (m88226i() && !z11) {
            this.f83606q.pause();
        } else if (this.f83606q.getCurrentState() == 4 && z11) {
            m88228m();
            this.f83606q.m92340I();
        }
    }

    public void setCropMode(int i11) {
        this.f83605p = i11;
        RecyclingImageView loadingView = this.f83606q.getLoadingView();
        if (i11 != 1) {
            if (i11 == 2) {
                this.f83606q.setUseVideoRatio(true);
                this.f83606q.setVideoPlayerMode(2);
                if (loadingView != null) {
                    loadingView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
            }
        } else {
            this.f83606q.setUseVideoRatio(false);
            this.f83606q.setVideoPlayerMode(1);
            if (loadingView != null) {
                loadingView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
        requestLayout();
    }

    protected void setImageThumbGIF(C3979l c3979l) {
        try {
            RecyclingImageView loadingView = this.f83606q.getLoadingView();
            if (loadingView != null) {
                loadingView.setVisibility(0);
                loadingView.setImageInfo(c3979l);
            }
            AbstractC16553e abstractC16553e = this.f83609t;
            if (abstractC16553e != null) {
                abstractC16553e.mo79869a(c3979l);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    public void setRoundCorner(int i11) {
        setOutlineProvider(new C16551c(i11));
        setClipToOutline(true);
    }

    public void setRoundCornerBottomOnly(int i11) {
        setBackgroundColor(getResources().getColor(C17395R.color.transparent));
        setOutlineProvider(new C16552d(i11));
        setClipToOutline(true);
    }

    public void setRoundCornerTopOnly(int i11) {
        setBackgroundColor(getResources().getColor(C17395R.color.transparent));
        setOutlineProvider(new C16550b(i11));
        setClipToOutline(true);
    }

    public void setScrolling(boolean z11) {
        this.f83611v = z11;
    }

    /* renamed from: com.zing.zalo.uicontrol.ZSimpleGIFView$f */
    /* loaded from: classes4.dex */
    public static class C16554f {

        /* renamed from: a */
        String f83623a;

        /* renamed from: b */
        String f83624b;

        /* renamed from: c */
        int f83625c;

        /* renamed from: d */
        int f83626d;

        /* renamed from: e */
        String f83627e;

        /* renamed from: f */
        int f83628f;

        public C16554f() {
            this.f83623a = "";
            this.f83624b = "";
            this.f83625c = 1;
            this.f83626d = 1;
            this.f83627e = "";
            this.f83628f = AbstractC23006a0.m117921q();
        }

        public C16554f(String str, String str2, int i11, int i12, String str3) {
            this.f83623a = str;
            this.f83624b = str2;
            this.f83625c = i11;
            this.f83626d = i12;
            this.f83627e = str3;
            this.f83628f = AbstractC23006a0.m117921q();
        }

        public C16554f(String str, String str2, int i11, int i12, String str3, int i13) {
            this.f83623a = str;
            this.f83624b = str2;
            this.f83625c = i11;
            this.f83626d = i12;
            this.f83627e = str3;
            this.f83628f = i13;
        }
    }

    public ZSimpleGIFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83605p = 2;
        this.f83607r = new C23528a(getContext());
        this.f83608s = new C16554f();
        this.f83610u = -1;
        this.f83611v = false;
        this.f83612w = true;
        this.f83613x = new Runnable() { // from class: com.zing.zalo.uicontrol.u2
            public /* synthetic */ RunnableC16664u2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZSimpleGIFView.this.m88220k();
            }
        };
        m88225h();
    }
}
