package com.zing.zalo.feed.mvp.socialmemory;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import aq.C2288h;
import bo.C3021p1;
import bo.C3031r1;
import bo.C3036s1;
import bo.C3044u1;
import bo.C3052w1;
import bo.C3056x1;
import bo.C3060y1;
import br.AbstractC3137v;
import br.C3124i;
import br.InterfaceC3116a;
import br.InterfaceC3117b;
import br.InterfaceC3118c;
import com.showingphotolib.view.AspectRatioImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7230u7;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.common.KeyframeAnimLayout;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.components.InterfaceC8411v6;
import com.zing.zalo.feed.components.SegmentProgressBar;
import com.zing.zalo.feed.components.SocialMemoryIntroPage;
import com.zing.zalo.feed.components.SocialMemoryOutroPage;
import com.zing.zalo.feed.components.SocialMemoryPage;
import com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.ShareMemoryView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zlottie.widget.LottieImageView;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import is.AbstractC20826v0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import me0.AbstractC23136l9;
import me0.AbstractC23193r0;
import me0.C23055e5;
import me0.C23212s8;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p207he.C20024r;
import p354n3.C23528a;
import p361nb.C23648e;
import p363nh.C23744a;
import p494rv.C25979a;
import p716zh.AbstractC31969j1;
import p716zh.C31877d;
import p716zh.C32002l4;
import p716zh.C32017m4;
import tn.C26747f0;
import vg.AbstractC28207v1;
import zl0.AbstractC32229f;

/* loaded from: classes4.dex */
public class SocialMemoryView extends BaseZaloView implements InterfaceC3118c, C23744a.c, InterfaceC3116a, View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: H1 */
    public static final int f46925H1 = Color.parseColor("#B8C5D0");

    /* renamed from: I1 */
    private static final int f46926I1 = AbstractC23136l9.m118655I(AbstractC16802y.height_bottom_memory);

    /* renamed from: A1 */
    float f46927A1;

    /* renamed from: B1 */
    float f46928B1;

    /* renamed from: D1 */
    AlphaAnimation f46930D1;

    /* renamed from: E1 */
    ValueAnimator f46931E1;

    /* renamed from: M0 */
    InterfaceC3117b f46934M0;

    /* renamed from: N0 */
    MultiStateView f46935N0;

    /* renamed from: O0 */
    View f46936O0;

    /* renamed from: P0 */
    View f46937P0;

    /* renamed from: Q0 */
    View f46938Q0;

    /* renamed from: R0 */
    ActionBar f46939R0;

    /* renamed from: S0 */
    View f46940S0;

    /* renamed from: T0 */
    ViewPager f46941T0;

    /* renamed from: U0 */
    View f46942U0;

    /* renamed from: V0 */
    SegmentProgressBar f46943V0;

    /* renamed from: W0 */
    TextView f46944W0;

    /* renamed from: X0 */
    TextView f46945X0;

    /* renamed from: Y0 */
    View f46946Y0;

    /* renamed from: Z0 */
    View f46947Z0;

    /* renamed from: a1 */
    View f46948a1;

    /* renamed from: b1 */
    View f46949b1;

    /* renamed from: c1 */
    AspectRatioImageView f46950c1;

    /* renamed from: d1 */
    AspectRatioImageView f46951d1;

    /* renamed from: e1 */
    View f46952e1;

    /* renamed from: f1 */
    ImageView f46953f1;

    /* renamed from: g1 */
    C7230u7 f46954g1;

    /* renamed from: h1 */
    KeyframeAnimLayout f46955h1;

    /* renamed from: i1 */
    private LottieImageView f46956i1;

    /* renamed from: l1 */
    Map f46959l1;

    /* renamed from: r1 */
    C23528a f46965r1;

    /* renamed from: s1 */
    C32002l4 f46966s1;

    /* renamed from: u1 */
    ValueAnimator f46968u1;

    /* renamed from: v1 */
    ValueAnimator f46969v1;

    /* renamed from: w1 */
    ValueAnimator f46970w1;

    /* renamed from: x1 */
    ValueAnimator f46971x1;

    /* renamed from: y1 */
    float f46972y1;

    /* renamed from: z1 */
    float f46973z1;

    /* renamed from: j1 */
    private String f46957j1 = "";

    /* renamed from: k1 */
    Drawable[] f46958k1 = new Drawable[4];

    /* renamed from: m1 */
    int[] f46960m1 = new int[4];

    /* renamed from: n1 */
    int f46961n1 = 0;

    /* renamed from: o1 */
    private int f46962o1 = -1;

    /* renamed from: p1 */
    boolean f46963p1 = false;

    /* renamed from: q1 */
    int f46964q1 = 0;

    /* renamed from: t1 */
    String f46967t1 = "";

    /* renamed from: C1 */
    int f46929C1 = -1;

    /* renamed from: F1 */
    float f46932F1 = 0.0f;

    /* renamed from: G1 */
    boolean f46933G1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView$a */
    /* loaded from: classes4.dex */
    public class C8732a extends ActionBar.C17431a {
        C8732a() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBar.C17431a
        /* renamed from: b */
        public void mo46831b(int i11) {
            SocialMemoryView.this.m46733MM(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView$b */
    /* loaded from: classes4.dex */
    public class C8733b implements ViewPager.InterfaceC2061i {
        C8733b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageScrollStateChanged(int i11) {
            if (i11 == 0) {
                SocialMemoryView socialMemoryView = SocialMemoryView.this;
                socialMemoryView.f46964q1 = 0;
                socialMemoryView.f46963p1 = false;
                socialMemoryView.f46943V0.m44498c(false);
                SocialMemoryView socialMemoryView2 = SocialMemoryView.this;
                if (socialMemoryView2.m46755XM(socialMemoryView2.f46941T0.getCurrentItem(), 0)) {
                    SocialMemoryView socialMemoryView3 = SocialMemoryView.this;
                    socialMemoryView3.m46801pN(socialMemoryView3.f46961n1);
                }
                SocialMemoryView socialMemoryView4 = SocialMemoryView.this;
                if (socialMemoryView4.m46755XM(socialMemoryView4.f46941T0.getCurrentItem(), 1)) {
                    SocialMemoryView.this.m46797nN();
                } else {
                    SocialMemoryView.this.m46725HM();
                }
                SocialMemoryView socialMemoryView5 = SocialMemoryView.this;
                socialMemoryView5.m46720EM(socialMemoryView5.f46961n1);
                SocialMemoryView socialMemoryView6 = SocialMemoryView.this;
                if (socialMemoryView6.f46961n1 > 0) {
                    socialMemoryView6.f46933G1 = true;
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageScrolled(int i11, float f11, int i12) {
            boolean z11;
            SocialMemoryView socialMemoryView = SocialMemoryView.this;
            if ((!socialMemoryView.f46963p1 || socialMemoryView.f46962o1 != i11) && i12 != 0) {
                SocialMemoryView socialMemoryView2 = SocialMemoryView.this;
                int i13 = socialMemoryView2.f46961n1;
                if (i11 != i13 && (!(z11 = socialMemoryView2.f46963p1) || socialMemoryView2.f46964q1 != 2)) {
                    if (i11 < i13 || (z11 && socialMemoryView2.f46964q1 == 1)) {
                        socialMemoryView2.f46964q1 = 1;
                    }
                } else {
                    socialMemoryView2.f46964q1 = 2;
                }
                socialMemoryView2.m46790kO(socialMemoryView2.f46964q1, i11);
                SocialMemoryView socialMemoryView3 = SocialMemoryView.this;
                socialMemoryView3.f46963p1 = true;
                socialMemoryView3.f46962o1 = i11;
            }
            SocialMemoryView socialMemoryView4 = SocialMemoryView.this;
            socialMemoryView4.m46793lO(socialMemoryView4.f46964q1, i11, f11);
            SocialMemoryView.this.m46813vN(i11, f11, i12);
            SocialMemoryView socialMemoryView5 = SocialMemoryView.this;
            if (socialMemoryView5.f46963p1) {
                socialMemoryView5.m46799oN(i11);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageSelected(int i11) {
            SocialMemoryView socialMemoryView = SocialMemoryView.this;
            socialMemoryView.f46961n1 = i11;
            socialMemoryView.mo15750S1();
            SocialMemoryView.this.f46934M0.mo15747xl(i11 + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView$c */
    /* loaded from: classes4.dex */
    public class C8734c implements Animator.AnimatorListener {
        C8734c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SocialMemoryView socialMemoryView = SocialMemoryView.this;
            socialMemoryView.f46973z1 = socialMemoryView.f46972y1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SocialMemoryView socialMemoryView = SocialMemoryView.this;
            socialMemoryView.f46973z1 = socialMemoryView.f46972y1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView$d */
    /* loaded from: classes4.dex */
    public class C8735d implements Animator.AnimatorListener {
        C8735d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SocialMemoryView socialMemoryView = SocialMemoryView.this;
            socialMemoryView.f46973z1 = socialMemoryView.f46972y1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SocialMemoryView socialMemoryView = SocialMemoryView.this;
            socialMemoryView.f46973z1 = socialMemoryView.f46972y1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView$e */
    /* loaded from: classes4.dex */
    public class C8736e implements Animator.AnimatorListener {
        C8736e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SocialMemoryView socialMemoryView = SocialMemoryView.this;
            socialMemoryView.f46928B1 = socialMemoryView.f46927A1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SocialMemoryView socialMemoryView = SocialMemoryView.this;
            socialMemoryView.f46928B1 = socialMemoryView.f46927A1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView$f */
    /* loaded from: classes4.dex */
    public class C8737f implements Animator.AnimatorListener {
        C8737f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SocialMemoryView socialMemoryView = SocialMemoryView.this;
            socialMemoryView.f46928B1 = socialMemoryView.f46927A1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SocialMemoryView socialMemoryView = SocialMemoryView.this;
            socialMemoryView.f46928B1 = socialMemoryView.f46927A1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView$g */
    /* loaded from: classes4.dex */
    public class C8738g implements Animator.AnimatorListener {
        C8738g() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SocialMemoryView.this.m46723GM();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SocialMemoryView.this.m46723GM();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: AN */
    private void m46716AN() {
        if ((this.f46955h1 != null || this.f46956i1 != null) && !this.f46963p1) {
            m46720EM(this.f46961n1);
        }
    }

    /* renamed from: BN */
    private void m46718BN() {
        Bitmap bitmap;
        int i11;
        ColorDrawable colorDrawable;
        Drawable colorDrawable2;
        if (!this.f46963p1 && this.f46953f1 != null) {
            KeyEvent.Callback m36897B = this.f46954g1.m36897B(this.f46961n1);
            final Drawable[] drawableArr = null;
            if (m36897B instanceof InterfaceC8411v6) {
                InterfaceC8411v6 interfaceC8411v6 = (InterfaceC8411v6) m36897B;
                i11 = interfaceC8411v6.getBackgroundColor();
                bitmap = interfaceC8411v6.getBackgroundUrlBitmap();
            } else {
                bitmap = null;
                i11 = 0;
            }
            if (bitmap == null && i11 == 0) {
                if (this.f46929C1 == -1) {
                    int i12 = f46925H1;
                    Drawable[] drawableArr2 = {new ColorDrawable(i12), new ColorDrawable(0)};
                    this.f46953f1.setTag(drawableArr2);
                    this.f46953f1.setImageDrawable(new LayerDrawable(drawableArr2));
                    this.f46929C1 = i12;
                    this.f46953f1.setVisibility(0);
                    this.f46953f1.setAlpha(1.0f);
                    return;
                }
                return;
            }
            final Drawable[] drawableArr3 = new Drawable[2];
            if (i11 != 0) {
                colorDrawable = new ColorDrawable(i11);
            } else {
                colorDrawable = new ColorDrawable(f46925H1);
            }
            drawableArr3[0] = colorDrawable;
            if (bitmap != null) {
                colorDrawable2 = new BitmapDrawable(m92651WI(), bitmap);
            } else {
                colorDrawable2 = new ColorDrawable(0);
            }
            drawableArr3[1] = colorDrawable2;
            if (this.f46953f1.getTag() instanceof Drawable[]) {
                drawableArr = (Drawable[]) this.f46953f1.getTag();
            }
            if (drawableArr != null && drawableArr.length >= 2 && drawableArr[0] != null && drawableArr[1] != null) {
                if (this.f46931E1 == null) {
                    this.f46931E1 = ValueAnimator.ofFloat(0.0f, 1.0f);
                }
                this.f46931E1.setDuration(1000L);
                this.f46931E1.cancel();
                this.f46931E1.removeAllUpdateListeners();
                this.f46931E1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: br.q
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SocialMemoryView.this.m46774fN(drawableArr, drawableArr3, valueAnimator);
                    }
                });
                this.f46931E1.start();
            } else {
                this.f46953f1.setImageDrawable(new LayerDrawable(drawableArr3));
                this.f46953f1.setAlpha(1.0f);
                if (this.f46930D1 == null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    this.f46930D1 = alphaAnimation;
                    alphaAnimation.setDuration(1000L);
                }
                this.f46953f1.startAnimation(this.f46930D1);
            }
            this.f46929C1 = -1;
            this.f46953f1.setTag(drawableArr3);
            this.f46953f1.setVisibility(0);
        }
    }

    /* renamed from: CN */
    private void m46719CN() {
        float f11;
        View view = this.f46942U0;
        if (view != null && !this.f46963p1) {
            view.setVisibility(0);
            View view2 = this.f46942U0;
            if (m46755XM(this.f46961n1, 1)) {
                f11 = 0.0f;
            } else {
                f11 = f46926I1;
            }
            view2.setTranslationY(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public void m46720EM(int i11) {
        C3056x1 c3056x1;
        C3052w1 c3052w1;
        String str;
        boolean z11;
        C7230u7 c7230u7 = this.f46954g1;
        C3044u1 c3044u1 = null;
        if (c7230u7 != null) {
            c3056x1 = c7230u7.m36900y(i11);
        } else {
            c3056x1 = null;
        }
        if (c3056x1 != null) {
            c3052w1 = c3056x1.f12358e;
        } else {
            c3052w1 = null;
        }
        if (c3052w1 != null) {
            c3044u1 = c3052w1.f12304c;
        }
        if (c3044u1 != null) {
            str = String.valueOf(c3044u1.f12269a);
        } else {
            str = "";
        }
        MultiStateView multiStateView = this.f46935N0;
        if (multiStateView != null && multiStateView.getState() == MultiStateView.EnumC15914e.CONTENT) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!TextUtils.isEmpty(str) && !str.equals("0") && m92687sJ() && z11) {
            this.f46967t1 = str;
            this.f46934M0.mo15741Gm(str);
        } else if (!TextUtils.isEmpty(this.f46967t1) && m92687sJ() && z11) {
            this.f46934M0.mo15741Gm(this.f46967t1);
        }
    }

    /* renamed from: EN */
    private void m46721EN() {
        View view;
        View m36897B = this.f46954g1.m36897B(this.f46961n1);
        if (m36897B instanceof SocialMemoryIntroPage) {
            view = ((SocialMemoryIntroPage) m36897B).getContentView();
        } else if (m36897B instanceof SocialMemoryOutroPage) {
            view = ((SocialMemoryOutroPage) m36897B).getContentView();
        } else {
            view = null;
        }
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setAlpha(1.0f);
        }
    }

    /* renamed from: FN */
    private void m46722FN() {
        if (m46755XM(this.f46961n1, 0) && !this.f46963p1) {
            m46801pN(this.f46961n1);
            m46721EN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public void m46723GM() {
        try {
            if (this.f46941T0 != null && m92687sJ() && this.f46941T0.m11181C()) {
                this.f46941T0.m11204r();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f46932F1 = 0.0f;
        this.f46933G1 = true;
    }

    /* renamed from: GN */
    private void m46724GN() {
        if (m46755XM(this.f46961n1, 2) && !this.f46963p1) {
            m46721EN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public void m46725HM() {
        ValueAnimator valueAnimator = this.f46968u1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f46972y1 = 0.0f;
        this.f46973z1 = 0.0f;
        ValueAnimator valueAnimator2 = this.f46970w1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f46927A1 = 0.0f;
        this.f46928B1 = 0.0f;
    }

    /* renamed from: HN */
    private void m46726HN() {
        int i11;
        SegmentProgressBar segmentProgressBar = this.f46943V0;
        if (segmentProgressBar != null && !this.f46963p1) {
            if (this.f46954g1.mo11220d() > 0) {
                i11 = this.f46954g1.mo11220d() - 1;
            } else {
                i11 = 1;
            }
            segmentProgressBar.setTotalSegment(i11);
            this.f46943V0.setPosition(this.f46961n1);
            this.f46943V0.m44498c(true);
            this.f46943V0.setVisibility(0);
        }
    }

    /* renamed from: IN */
    private void m46727IN() {
        if (!this.f46963p1) {
            if (m46755XM(this.f46961n1, 1)) {
                m46797nN();
            } else {
                m46748TN();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* renamed from: JN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m46728JN() {
        int i11;
        if (this.f46952e1 != null && !this.f46963p1) {
            if (m46757YM(this.f46961n1)) {
                KeyEvent.Callback m36897B = this.f46954g1.m36897B(this.f46961n1);
                if (m36897B instanceof InterfaceC8411v6) {
                    i11 = ((InterfaceC8411v6) m36897B).getOverlayColor();
                    if (i11 == 0) {
                        this.f46952e1.setAlpha(1.0f);
                        this.f46952e1.setBackgroundColor(i11);
                        this.f46952e1.setVisibility(0);
                        return;
                    }
                    m46750UN();
                    return;
                }
            }
            i11 = 0;
            if (i11 == 0) {
            }
        }
    }

    /* renamed from: KM */
    private void m46729KM() {
        this.f46934M0.mo15745Sj(C32017m4.m154326S().m154378x(this.f46966s1));
    }

    /* renamed from: KN */
    private void m46730KN() {
        float f11;
        View view = this.f46949b1;
        if (view != null && !this.f46963p1) {
            if (m46757YM(this.f46961n1)) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            view.setAlpha(f11);
            this.f46949b1.setVisibility(0);
        }
    }

    /* renamed from: LM */
    private int m46731LM() {
        int nextInt = new Random().nextInt(4);
        if (nextInt < 0) {
            nextInt = 0;
        } else if (nextInt > 3) {
            nextInt = 3;
        }
        int[] iArr = this.f46960m1;
        if (nextInt < iArr.length) {
            return iArr[nextInt];
        }
        return f46925H1;
    }

    /* renamed from: LN */
    private void m46732LN(boolean z11) {
        if (!this.f72421L0.m92676n2().mo35576n3()) {
            AbstractC23136l9.m118686X0(this.f72421L0.m92676n2().getWindow(), z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public void m46733MM(int i11) {
        if (i11 == 16908332) {
            m46825Dm();
        }
    }

    /* renamed from: MN */
    private void m46734MN() {
        mo15749Q0();
        KeyframeAnimLayout keyframeAnimLayout = this.f46955h1;
        if (keyframeAnimLayout != null) {
            keyframeAnimLayout.m39938p();
        }
        if (this.f46956i1 != null && !TextUtils.isEmpty(this.f46957j1) && C7853b.m40052a0().m40139l0(this.f46957j1)) {
            C7853b.m40052a0().m40136j1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM, reason: merged with bridge method [inline-methods] */
    public void m46771eN(Bundle bundle) {
        boolean z11;
        if (m92672lJ() && m92687sJ()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (bundle != null && z11) {
            int i11 = bundle.getInt(AbstractC20826v0.f102360j, -1);
            String string = bundle.getString(AbstractC20826v0.f102363m, "");
            if (i11 == 3) {
                ToastUtils.showMess(true, AbstractC20826v0.m108749B(string), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
            }
        }
    }

    /* renamed from: NN */
    private void m46736NN() {
        if (this.f46953f1 != null) {
            AlphaAnimation alphaAnimation = this.f46930D1;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.f46953f1.setVisibility(8);
        }
    }

    /* renamed from: OM */
    private void m46737OM() {
        this.f46960m1[0] = Color.parseColor("#715BFC");
        this.f46960m1[1] = Color.parseColor("#32A5F9");
        this.f46960m1[2] = Color.parseColor("#1CB4B2");
        this.f46960m1[3] = Color.parseColor("#F47F85");
    }

    /* renamed from: ON */
    private void m46738ON() {
        View view = this.f46942U0;
        if (view != null) {
            view.setTranslationY(f46926I1);
            this.f46942U0.setVisibility(8);
        }
    }

    /* renamed from: PM */
    private void m46739PM(MultiStateView multiStateView, LayoutInflater layoutInflater) {
        if (multiStateView.getContentView() == null) {
            View inflate = layoutInflater.inflate(AbstractC7409c0.social_memory_content_view, (ViewGroup) null, false);
            this.f46936O0 = inflate;
            multiStateView.addView(inflate);
        }
        this.f46941T0 = (ViewPager) this.f46936O0.findViewById(AbstractC6918a0.view_pager);
        this.f46942U0 = this.f46936O0.findViewById(AbstractC6918a0.button_share_memory);
        this.f46943V0 = (SegmentProgressBar) this.f46936O0.findViewById(AbstractC6918a0.progress_bar);
        this.f46950c1 = (AspectRatioImageView) this.f46936O0.findViewById(AbstractC6918a0.top_decor_frame);
        this.f46951d1 = (AspectRatioImageView) this.f46936O0.findViewById(AbstractC6918a0.bottom_decor_frame);
        this.f46952e1 = this.f46936O0.findViewById(AbstractC6918a0.view_overlay);
        this.f46953f1 = (ImageView) this.f46936O0.findViewById(AbstractC6918a0.view_background);
        this.f46944W0 = (TextView) this.f46936O0.findViewById(AbstractC6918a0.txt_title);
        this.f46945X0 = (TextView) this.f46936O0.findViewById(AbstractC6918a0.txt_desc);
        this.f46946Y0 = this.f46936O0.findViewById(AbstractC6918a0.img_close);
        this.f46949b1 = this.f46936O0.findViewById(AbstractC6918a0.view_text_shadow);
    }

    /* renamed from: PN */
    private void m46740PN() {
        AspectRatioImageView aspectRatioImageView = this.f46950c1;
        if (aspectRatioImageView != null) {
            aspectRatioImageView.setVisibility(8);
        }
        AspectRatioImageView aspectRatioImageView2 = this.f46951d1;
        if (aspectRatioImageView2 != null) {
            aspectRatioImageView2.setVisibility(8);
        }
    }

    /* renamed from: QM */
    private void m46741QM(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("entry_point_chain")) {
                this.f46966s1 = C32002l4.m154269m(bundle.getString("entry_point_chain")).m154271a(10016);
            } else {
                this.f46966s1 = C32002l4.m154264g(10016);
            }
        }
    }

    /* renamed from: QN */
    private void m46742QN() {
    }

    /* renamed from: RM */
    private void m46743RM(MultiStateView multiStateView, LayoutInflater layoutInflater) {
        multiStateView.setEnableBtnEmpty(true);
        View emptyView = multiStateView.getEmptyView();
        this.f46937P0 = emptyView;
        this.f46939R0 = (ActionBar) emptyView.findViewById(AbstractC6918a0.action_bar_view);
    }

    /* renamed from: RN */
    private void m46744RN() {
    }

    /* renamed from: SM */
    private void m46745SM(MultiStateView multiStateView, LayoutInflater layoutInflater) {
        multiStateView.setEnableImageErrorView(false);
        View errorView = multiStateView.getErrorView();
        this.f46938Q0 = errorView;
        this.f46948a1 = errorView.findViewById(AbstractC6918a0.img_close);
    }

    /* renamed from: SN */
    private void m46746SN() {
        SegmentProgressBar segmentProgressBar = this.f46943V0;
        if (segmentProgressBar != null) {
            segmentProgressBar.setTotalSegment(1);
            this.f46943V0.setPosition(0);
            this.f46943V0.setVisibility(8);
        }
    }

    /* renamed from: TM */
    private void m46747TM(View view) {
        if (view instanceof ViewGroup) {
            KeyframeAnimLayout keyframeAnimLayout = new KeyframeAnimLayout(getContext(), AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0(), this);
            this.f46955h1 = keyframeAnimLayout;
            ((ViewGroup) view).addView(keyframeAnimLayout);
            m78943YL(this.f46955h1);
        }
    }

    /* renamed from: TN */
    private void m46748TN() {
        m46725HM();
        TextView textView = this.f46944W0;
        if (textView != null) {
            textView.setVisibility(8);
            this.f46944W0.setAlpha(0.0f);
        }
        TextView textView2 = this.f46945X0;
        if (textView2 != null) {
            textView2.setVisibility(8);
            this.f46945X0.setAlpha(0.0f);
        }
    }

    /* renamed from: UM */
    private void m46749UM(MultiStateView multiStateView, LayoutInflater layoutInflater) {
        View loadingView = multiStateView.getLoadingView();
        this.f46940S0 = loadingView;
        this.f46947Z0 = loadingView.findViewById(AbstractC6918a0.img_close);
    }

    /* renamed from: UN */
    private void m46750UN() {
        View view = this.f46952e1;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: VM */
    private void m46751VM(View view) {
        if (view instanceof ViewGroup) {
            int m118722k0 = AbstractC23136l9.m118722k0();
            int m118713h0 = AbstractC23136l9.m118713h0();
            LottieImageView lottieImageView = new LottieImageView(getContext());
            this.f46956i1 = lottieImageView;
            lottieImageView.setLayoutParams(new ViewGroup.LayoutParams(m118722k0, m118713h0));
            ((ViewGroup) view).addView(this.f46956i1);
        }
    }

    /* renamed from: VN */
    private void m46752VN() {
        View view = this.f46949b1;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: WM */
    private void m46753WM(View view, LayoutInflater layoutInflater) {
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state_view);
        this.f46935N0 = multiStateView;
        multiStateView.setEnableSwapStateAnim(false);
        m46739PM(this.f46935N0, layoutInflater);
        m46749UM(this.f46935N0, layoutInflater);
        m46743RM(this.f46935N0, layoutInflater);
        m46745SM(this.f46935N0, layoutInflater);
        m46747TM(view);
        m46751VM(view);
    }

    /* renamed from: WN */
    private void m46754WN(Bundle bundle) {
        if (bundle != null) {
            this.f46967t1 = bundle.getString("temp_effect_key", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public boolean m46755XM(int i11, int i12) {
        C3056x1 m36900y;
        C3052w1 c3052w1;
        if (this.f46954g1 == null || !m46759ZM(i11) || (m36900y = this.f46954g1.m36900y(i11)) == null || (c3052w1 = m36900y.f12358e) == null || c3052w1.f12303b != i12) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XN */
    public void m46756XN() {
        C23055e5.m118272g(true);
        m46729KM();
    }

    /* renamed from: YM */
    private boolean m46757YM(int i11) {
        if (!m46755XM(i11, 0) && !m46755XM(i11, 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: YN */
    private void m46758YN() {
        if (this.f46941T0 != null && this.f46954g1 != null) {
            if (m46759ZM(this.f46961n1)) {
                this.f46941T0.setCurrentItem(this.f46961n1);
            } else if (this.f46954g1.mo11220d() > 0) {
                this.f46941T0.setCurrentItem(this.f46954g1.mo11220d() - 1);
            }
        }
    }

    /* renamed from: ZM */
    private boolean m46759ZM(int i11) {
        C7230u7 c7230u7 = this.f46954g1;
        if (c7230u7 != null && i11 >= 0 && i11 < c7230u7.mo11220d()) {
            return true;
        }
        return false;
    }

    /* renamed from: ZN */
    private void m46760ZN() {
        TextView textView;
        try {
            View m92656bJ = m92656bJ();
            if (m92656bJ != null && AbstractC32229f.m155443o(m92656bJ) && (textView = this.f46944W0) != null && (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46944W0.getLayoutParams();
                marginLayoutParams.setMargins(0, AbstractC23136l9.m118655I(AbstractC16802y.social_memory_title_mg_top) + AbstractC17484n.Companion.m92931b(), 0, 0);
                this.f46944W0.setLayoutParams(marginLayoutParams);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aN */
    private boolean m46761aN(int i11) {
        if (i11 + 1 < this.f46954g1.mo11220d()) {
            return true;
        }
        return false;
    }

    /* renamed from: aO */
    private void m46762aO() {
        m46729KM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public /* synthetic */ void m46763bN(ValueAnimator valueAnimator) {
        try {
            ViewPager viewPager = this.f46941T0;
            if (viewPager != null && viewPager.m11181C()) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f46941T0.m11206u((floatValue - this.f46932F1) * (-1.0f));
                this.f46932F1 = floatValue;
            } else {
                m46723GM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m46723GM();
        }
    }

    /* renamed from: bO */
    private void m46764bO() {
        try {
            this.f46941T0.setOffscreenPageLimit(2);
            C7230u7 m46826FM = m46826FM();
            this.f46954g1 = m46826FM;
            this.f46941T0.setAdapter(m46826FM);
            m46758YN();
            this.f46941T0.m11193X(false, new ViewPager.InterfaceC2062j() { // from class: br.p
                @Override // androidx.viewpager.widget.ViewPager.InterfaceC2062j
                /* renamed from: a */
                public final void mo11215a(View view, float f11) {
                    SocialMemoryView.this.m46777gN(view, f11);
                }
            });
            this.f46941T0.m11198c(new C8733b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public /* synthetic */ void m46765cN() {
        try {
            if (m46769dO()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AbstractC23136l9.m118722k0() * 1.0f);
                ofFloat.setDuration(700L);
                this.f46941T0.m11200e();
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: br.l
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SocialMemoryView.this.m46763bN(valueAnimator);
                    }
                });
                ofFloat.addListener(new C8738g());
                ofFloat.start();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m46723GM();
        }
    }

    /* renamed from: cO */
    private void m46766cO() {
        m46764bO();
        this.f46942U0.setOnClickListener(this);
        this.f46950c1.setScaleOption(0);
        this.f46951d1.setScaleOption(0);
        this.f46946Y0.setOnClickListener(this);
        this.f46947Z0.setOnClickListener(this);
        this.f46948a1.setOnClickListener(this);
        this.f46943V0.setProgressBgColor(Color.parseColor("#4c000000"));
        ActionBar actionBar = this.f46939R0;
        if (actionBar != null) {
            actionBar.setBackgroundColor(C23212s8.m119607o(actionBar.getContext(), AbstractC16781w.HeaderFormColor));
            this.f46939R0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
            ActionBar actionBar2 = this.f46939R0;
            actionBar2.setTitleColor(C23212s8.m119607o(actionBar2.getContext(), AbstractC7354t0.NormalIconWhiteHeaderColor));
            this.f46939R0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_memory_empty_action_bar_title));
            this.f46939R0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            this.f46939R0.setActionBarMenuOnItemClick(new C8732a());
        }
        Typeface m153697b = AbstractC31969j1.m153697b(getContext(), 0);
        if (m153697b != null) {
            this.f46944W0.setTypeface(m153697b);
        }
        this.f46944W0.setAlpha(0.0f);
        Typeface m153697b2 = AbstractC31969j1.m153697b(getContext(), 5);
        if (m153697b != null) {
            this.f46945X0.setTypeface(m153697b2);
        }
        this.f46945X0.setAlpha(0.0f);
        this.f46955h1.setClickable(false);
        this.f46956i1.setClickable(false);
        this.f46935N0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_memory_empty_title));
        this.f46935N0.setEmptyImageResourceId(AbstractC16803z.ic_illus_empty_memory);
        this.f46935N0.setBtnEmptyString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_post_feed));
        this.f46935N0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_memory_error_title));
        this.f46935N0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: br.n
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                SocialMemoryView.this.m46756XN();
            }
        });
        this.f46935N0.setEmptyOnClickListener(new View.OnClickListener() { // from class: br.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SocialMemoryView.this.m46780hN(view);
            }
        });
        this.f46935N0.setState(MultiStateView.EnumC15914e.LOADING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public /* synthetic */ void m46768dN() {
        m46795mN();
        this.f46934M0.mo15742Im(true);
    }

    /* renamed from: dO */
    private boolean m46769dO() {
        ViewPager viewPager;
        C7230u7 c7230u7;
        if (!this.f46933G1 && !this.f46963p1 && (viewPager = this.f46941T0) != null && !viewPager.m11181C() && this.f46961n1 == 0 && (c7230u7 = this.f46954g1) != null && c7230u7.mo11220d() > 0 && m92687sJ()) {
            return true;
        }
        return false;
    }

    /* renamed from: eO */
    private void m46772eO() {
        if (this.f46971x1 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f46971x1 = ofFloat;
            ofFloat.setDuration(150L);
            this.f46971x1.addListener(new C8737f());
            this.f46971x1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: br.k
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SocialMemoryView.this.m46783iN(valueAnimator);
                }
            });
        }
        ValueAnimator valueAnimator = this.f46970w1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!this.f46971x1.isStarted() && this.f46945X0 != null) {
            this.f46971x1.cancel();
            this.f46971x1.setFloatValues(this.f46928B1, 0.0f);
            this.f46971x1.start();
            this.f46945X0.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public /* synthetic */ void m46774fN(Drawable[] drawableArr, Drawable[] drawableArr2, ValueAnimator valueAnimator) {
        try {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (0.0f <= floatValue && floatValue <= 1.0f) {
                int i11 = (int) (floatValue * 255.0f);
                Drawable drawable = drawableArr[0];
                Drawable[] drawableArr3 = {drawable, drawableArr[1], drawableArr2[0], drawableArr2[1]};
                int i12 = 255 - i11;
                drawable.setAlpha(i12);
                drawableArr3[1].setAlpha(i12);
                drawableArr3[2].setAlpha(i11);
                drawableArr3[3].setAlpha(i11);
                this.f46953f1.setImageDrawable(new LayerDrawable(drawableArr3));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            ImageView imageView = this.f46953f1;
            if (imageView != null) {
                imageView.setImageDrawable(new LayerDrawable(drawableArr2));
            }
        }
    }

    /* renamed from: fO */
    private void m46775fO() {
        if (this.f46970w1 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f46970w1 = ofFloat;
            ofFloat.setDuration(400L);
            this.f46970w1.addListener(new C8736e());
            this.f46970w1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: br.r
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SocialMemoryView.this.m46786jN(valueAnimator);
                }
            });
        }
        ValueAnimator valueAnimator = this.f46971x1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!this.f46970w1.isStarted() && this.f46945X0 != null) {
            this.f46970w1.cancel();
            this.f46970w1.setFloatValues(this.f46928B1, 1.0f);
            this.f46970w1.start();
            this.f46945X0.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public /* synthetic */ void m46777gN(View view, float f11) {
        View view2;
        if (this.f46964q1 == 0) {
            return;
        }
        boolean z11 = view instanceof SocialMemoryIntroPage;
        if (!z11 && !(view instanceof SocialMemoryOutroPage)) {
            if (view instanceof SocialMemoryPage) {
                float width = view.getWidth();
                float height = view.getHeight();
                view.setPivotX(width * 0.5f);
                view.setPivotY(height);
                float f12 = (-15.0f) * f11 * (-1.25f);
                if (f11 < -1.0f) {
                    view.setRotation(0.0f);
                    return;
                }
                if (f11 <= 0.0f) {
                    if (this.f46964q1 == 2 && f11 < 0.0f) {
                        view.setRotation(f12);
                        return;
                    } else {
                        view.setRotation(0.0f);
                        return;
                    }
                }
                if (f11 <= 1.0f) {
                    if (this.f46964q1 == 1 && f11 < 1.0f) {
                        view.setRotation(f12);
                        return;
                    } else {
                        view.setRotation(0.0f);
                        return;
                    }
                }
                view.setRotation(0.0f);
                return;
            }
            return;
        }
        if (z11) {
            view2 = ((SocialMemoryIntroPage) view).getContentView();
        } else if (view instanceof SocialMemoryOutroPage) {
            view2 = ((SocialMemoryOutroPage) view).getContentView();
        } else {
            view2 = null;
        }
        if (view2 != null && f11 >= -1.0f && f11 <= 1.0f) {
            float width2 = view2.getWidth();
            float height2 = view2.getHeight();
            view2.setPivotX(width2 * 0.5f);
            view2.setPivotY(height2 * 0.5f);
            view2.setScaleX(1.0f - Math.abs(f11));
            view2.setScaleY(1.0f - Math.abs(f11));
            view2.setAlpha(1.0f - Math.abs(f11));
        }
    }

    /* renamed from: gO */
    private void m46778gO() {
        if (this.f46969v1 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f46969v1 = ofFloat;
            ofFloat.setDuration(150L);
            this.f46969v1.addListener(new C8735d());
            this.f46969v1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: br.u
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SocialMemoryView.this.m46789kN(valueAnimator);
                }
            });
        }
        ValueAnimator valueAnimator = this.f46968u1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!this.f46969v1.isStarted() && this.f46944W0 != null) {
            this.f46969v1.cancel();
            this.f46969v1.setFloatValues(this.f46973z1, 0.0f);
            this.f46969v1.start();
            this.f46944W0.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public /* synthetic */ void m46780hN(View view) {
        m46819yN();
    }

    /* renamed from: hO */
    private void m46781hO() {
        if (this.f46968u1 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f46968u1 = ofFloat;
            ofFloat.setDuration(400L);
            this.f46968u1.addListener(new C8734c());
            this.f46968u1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: br.t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SocialMemoryView.this.m46792lN(valueAnimator);
                }
            });
        }
        ValueAnimator valueAnimator = this.f46969v1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!this.f46968u1.isStarted() && this.f46944W0 != null) {
            this.f46968u1.cancel();
            this.f46968u1.setFloatValues(this.f46973z1, 1.0f);
            this.f46968u1.start();
            this.f46944W0.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public /* synthetic */ void m46783iN(ValueAnimator valueAnimator) {
        TextView textView;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (0.0f <= floatValue && floatValue <= 1.0f && floatValue < this.f46928B1 && (textView = this.f46945X0) != null) {
            textView.setAlpha(floatValue);
            this.f46927A1 = floatValue;
        }
    }

    /* renamed from: iO */
    private void m46784iO() {
        m46778gO();
        m46772eO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public /* synthetic */ void m46786jN(ValueAnimator valueAnimator) {
        TextView textView;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (0.0f <= floatValue && floatValue <= 1.0f && (textView = this.f46945X0) != null && floatValue > this.f46928B1) {
            textView.setAlpha(floatValue);
            this.f46927A1 = floatValue;
        }
    }

    /* renamed from: jO */
    private void m46787jO() {
        m46781hO();
        m46775fO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public /* synthetic */ void m46789kN(ValueAnimator valueAnimator) {
        TextView textView;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (0.0f <= floatValue && floatValue <= 1.0f && floatValue < this.f46973z1 && (textView = this.f46944W0) != null) {
            textView.setAlpha(floatValue);
            this.f46972y1 = floatValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kO */
    public void m46790kO(int i11, int i12) {
        Bitmap bitmap;
        int i13;
        Bitmap bitmap2;
        int i14;
        ColorDrawable colorDrawable;
        Drawable colorDrawable2;
        ColorDrawable colorDrawable3;
        Drawable colorDrawable4;
        Bitmap bitmap3;
        int i15;
        Bitmap bitmap4;
        int i16;
        ColorDrawable colorDrawable5;
        Drawable colorDrawable6;
        ColorDrawable colorDrawable7;
        Drawable colorDrawable8;
        if (i11 == 1) {
            KeyEvent.Callback m36897B = this.f46954g1.m36897B(i12);
            if (m36897B instanceof InterfaceC8411v6) {
                InterfaceC8411v6 interfaceC8411v6 = (InterfaceC8411v6) m36897B;
                i15 = interfaceC8411v6.getBackgroundColor();
                bitmap3 = interfaceC8411v6.getBackgroundUrlBitmap();
            } else {
                bitmap3 = null;
                i15 = 0;
            }
            KeyEvent.Callback m36897B2 = this.f46954g1.m36897B(i12 + 1);
            if (m36897B2 instanceof InterfaceC8411v6) {
                InterfaceC8411v6 interfaceC8411v62 = (InterfaceC8411v6) m36897B2;
                i16 = interfaceC8411v62.getBackgroundColor();
                bitmap4 = interfaceC8411v62.getBackgroundUrlBitmap();
            } else {
                bitmap4 = null;
                i16 = 0;
            }
            Drawable[] drawableArr = this.f46958k1;
            if (i15 != 0) {
                colorDrawable5 = new ColorDrawable(i15);
            } else {
                colorDrawable5 = new ColorDrawable(f46925H1);
            }
            drawableArr[0] = colorDrawable5;
            Drawable[] drawableArr2 = this.f46958k1;
            if (bitmap3 != null) {
                colorDrawable6 = new BitmapDrawable(m92651WI(), bitmap3);
            } else {
                colorDrawable6 = new ColorDrawable(0);
            }
            drawableArr2[1] = colorDrawable6;
            Drawable[] drawableArr3 = this.f46958k1;
            if (i16 != 0) {
                colorDrawable7 = new ColorDrawable(i16);
            } else {
                colorDrawable7 = new ColorDrawable(f46925H1);
            }
            drawableArr3[2] = colorDrawable7;
            Drawable[] drawableArr4 = this.f46958k1;
            if (bitmap4 != null) {
                colorDrawable8 = new BitmapDrawable(m92651WI(), bitmap4);
            } else {
                colorDrawable8 = new ColorDrawable(0);
            }
            drawableArr4[3] = colorDrawable8;
        } else if (i11 == 2) {
            KeyEvent.Callback m36897B3 = this.f46954g1.m36897B(i12);
            if (m36897B3 instanceof InterfaceC8411v6) {
                InterfaceC8411v6 interfaceC8411v63 = (InterfaceC8411v6) m36897B3;
                i13 = interfaceC8411v63.getBackgroundColor();
                bitmap = interfaceC8411v63.getBackgroundUrlBitmap();
            } else {
                bitmap = null;
                i13 = 0;
            }
            KeyEvent.Callback m36897B4 = this.f46954g1.m36897B(i12 + 1);
            if (m36897B4 instanceof InterfaceC8411v6) {
                InterfaceC8411v6 interfaceC8411v64 = (InterfaceC8411v6) m36897B4;
                i14 = interfaceC8411v64.getBackgroundColor();
                bitmap2 = interfaceC8411v64.getBackgroundUrlBitmap();
            } else {
                bitmap2 = null;
                i14 = 0;
            }
            Drawable[] drawableArr5 = this.f46958k1;
            if (i14 != 0) {
                colorDrawable = new ColorDrawable(i14);
            } else {
                colorDrawable = new ColorDrawable(f46925H1);
            }
            drawableArr5[0] = colorDrawable;
            Drawable[] drawableArr6 = this.f46958k1;
            if (bitmap2 != null) {
                colorDrawable2 = new BitmapDrawable(m92651WI(), bitmap2);
            } else {
                colorDrawable2 = new ColorDrawable(0);
            }
            drawableArr6[1] = colorDrawable2;
            Drawable[] drawableArr7 = this.f46958k1;
            if (i13 != 0) {
                colorDrawable3 = new ColorDrawable(i13);
            } else {
                colorDrawable3 = new ColorDrawable(f46925H1);
            }
            drawableArr7[2] = colorDrawable3;
            Drawable[] drawableArr8 = this.f46958k1;
            if (bitmap != null) {
                colorDrawable4 = new BitmapDrawable(m92651WI(), bitmap);
            } else {
                colorDrawable4 = new ColorDrawable(0);
            }
            drawableArr8[3] = colorDrawable4;
        }
        Drawable[] drawableArr9 = this.f46958k1;
        if (drawableArr9[0] == null) {
            drawableArr9[0] = new ColorDrawable(f46925H1);
        }
        Drawable[] drawableArr10 = this.f46958k1;
        if (drawableArr10[1] == null) {
            drawableArr10[1] = new ColorDrawable(0);
        }
        Drawable[] drawableArr11 = this.f46958k1;
        if (drawableArr11[2] == null) {
            drawableArr11[2] = new ColorDrawable(f46925H1);
        }
        Drawable[] drawableArr12 = this.f46958k1;
        if (drawableArr12[3] == null) {
            drawableArr12[3] = new ColorDrawable(0);
        }
        ImageView imageView = this.f46953f1;
        if (imageView != null) {
            imageView.setImageDrawable(new LayerDrawable(this.f46958k1));
            this.f46953f1.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public /* synthetic */ void m46792lN(ValueAnimator valueAnimator) {
        TextView textView;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (0.0f <= floatValue && floatValue <= 1.0f && floatValue > this.f46973z1 && (textView = this.f46944W0) != null) {
            textView.setAlpha(floatValue);
            this.f46972y1 = floatValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lO */
    public void m46793lO(int i11, int i12, float f11) {
        boolean z11;
        boolean z12;
        float f12;
        float f13;
        SegmentProgressBar segmentProgressBar = this.f46943V0;
        if (segmentProgressBar != null && segmentProgressBar.getTotalSegment() >= 1.0f && i11 != 0) {
            int i13 = 0;
            this.f46943V0.setVisibility(0);
            float totalSegment = this.f46943V0.getTotalSegment();
            if (i12 == 0 && f11 == 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            float f14 = i12;
            if (f14 == totalSegment && f11 == 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && !z12) {
                if (f11 == 0.0f) {
                    this.f46943V0.setPosition(i12);
                    this.f46943V0.m44498c(true);
                    return;
                }
                if (f11 == 1.0f) {
                    this.f46943V0.setPosition(i12 + 1);
                    this.f46943V0.m44498c(true);
                    return;
                }
                if (i11 == 1) {
                    f14 = i12 + 1;
                }
                float segmentSize = this.f46943V0.getSegmentSize();
                if (f14 == totalSegment) {
                    f12 = 100.0f;
                } else {
                    f12 = f14 * segmentSize;
                }
                float f15 = f11 * segmentSize;
                SegmentProgressBar segmentProgressBar2 = this.f46943V0;
                if (i11 == 1) {
                    f13 = f12 - (segmentSize - f15);
                } else {
                    f13 = f12 + f15;
                }
                segmentProgressBar2.m44497b(f13);
                return;
            }
            SegmentProgressBar segmentProgressBar3 = this.f46943V0;
            if (!z11) {
                i13 = (int) totalSegment;
            }
            segmentProgressBar3.setPosition(i13);
            this.f46943V0.m44498c(true);
        }
    }

    /* renamed from: mN */
    private void m46795mN() {
        if (this.f46954g1 != null) {
            int max = Math.max(0, this.f46961n1 - 2);
            int max2 = Math.max(max, Math.min(this.f46961n1 + 2, this.f46954g1.mo11220d() - 1));
            while (max <= max2) {
                View m36897B = this.f46954g1.m36897B(max);
                if (m36897B != null) {
                    m36897B.setTag(AbstractC6918a0.social_memory_refresh, Boolean.TRUE);
                }
                max++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public void m46797nN() {
        C3052w1 c3052w1;
        C3036s1 c3036s1;
        C3056x1 m36900y = this.f46954g1.m36900y(this.f46961n1);
        if (m36900y != null && (c3052w1 = m36900y.f12358e) != null) {
            C3021p1 c3021p1 = c3052w1.f12305d;
            C3031r1 c3031r1 = null;
            if (c3021p1 != null) {
                c3036s1 = c3021p1.f12068a;
            } else {
                c3036s1 = null;
            }
            m46823DM(c3036s1);
            C3021p1 c3021p12 = m36900y.f12358e.f12305d;
            if (c3021p12 != null) {
                c3031r1 = c3021p12.f12069b;
            }
            m46822CM(c3031r1);
            m46787jO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public void m46799oN(int i11) {
        View m36897B = this.f46954g1.m36897B(i11);
        if (m36897B instanceof SocialMemoryIntroPage) {
            ((SocialMemoryIntroPage) m36897B).m44518n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public void m46801pN(int i11) {
        View m36897B = this.f46954g1.m36897B(i11);
        if (m36897B instanceof SocialMemoryIntroPage) {
            ((SocialMemoryIntroPage) m36897B).m44519p();
        }
    }

    /* renamed from: qN */
    private void m46803qN(int i11, float f11, int i12) {
        int i13;
        if (i12 != 0 && this.f46962o1 == i11) {
            int i14 = (int) (f11 * 255.0f);
            int i15 = this.f46964q1;
            if (i15 == 1) {
                i13 = i14;
            } else if (i15 == 2) {
                i13 = 255 - i14;
            } else {
                i13 = -1;
            }
            if (i15 == 1) {
                i14 = 255 - i14;
            } else if (i15 != 2) {
                i14 = -1;
            }
            Drawable drawable = this.f46958k1[0];
            if (drawable != null && i14 != -1) {
                drawable.setAlpha(i14);
            }
            Drawable drawable2 = this.f46958k1[1];
            if (drawable2 != null && i14 != -1) {
                drawable2.setAlpha(i14);
            }
            Drawable drawable3 = this.f46958k1[2];
            if (drawable3 != null && i13 != -1) {
                drawable3.setAlpha(i13);
            }
            Drawable drawable4 = this.f46958k1[3];
            if (drawable4 != null && i13 != -1) {
                drawable4.setAlpha(i13);
            }
        }
    }

    /* renamed from: rN */
    private void m46805rN(int i11, float f11, int i12) {
        Bitmap bottomDecorFrame;
        int i13 = this.f46964q1;
        if (i13 == 0) {
            return;
        }
        Bitmap bitmap = null;
        if (i13 == 2) {
            if (m46755XM(i11, 0) && m46755XM(i11 + 1, 1)) {
                f11 = 1.0f - f11;
                View m36897B = this.f46954g1.m36897B(i11);
                if (m36897B instanceof SocialMemoryIntroPage) {
                    SocialMemoryIntroPage socialMemoryIntroPage = (SocialMemoryIntroPage) m36897B;
                    bitmap = socialMemoryIntroPage.getTopDecorFrame();
                    bottomDecorFrame = socialMemoryIntroPage.getBottomDecorFrame();
                }
                bottomDecorFrame = null;
            } else {
                if (m46755XM(i11, 1)) {
                    int i14 = i11 + 1;
                    if (m46755XM(i14, 0)) {
                        View m36897B2 = this.f46954g1.m36897B(i14);
                        if (m36897B2 instanceof SocialMemoryIntroPage) {
                            SocialMemoryIntroPage socialMemoryIntroPage2 = (SocialMemoryIntroPage) m36897B2;
                            bitmap = socialMemoryIntroPage2.getTopDecorFrame();
                            bottomDecorFrame = socialMemoryIntroPage2.getBottomDecorFrame();
                        }
                        bottomDecorFrame = null;
                    }
                }
                f11 = -100.0f;
                bottomDecorFrame = null;
            }
        } else {
            if (i13 == 1) {
                if (m46755XM(i11, 0) && m46755XM(i11 + 1, 1)) {
                    f11 = 1.0f - f11;
                    View m36897B3 = this.f46954g1.m36897B(i11);
                    if (m36897B3 instanceof SocialMemoryIntroPage) {
                        SocialMemoryIntroPage socialMemoryIntroPage3 = (SocialMemoryIntroPage) m36897B3;
                        bitmap = socialMemoryIntroPage3.getTopDecorFrame();
                        bottomDecorFrame = socialMemoryIntroPage3.getBottomDecorFrame();
                    }
                    bottomDecorFrame = null;
                } else if (m46755XM(i11, 1)) {
                    int i15 = i11 + 1;
                    if (m46755XM(i15, 0)) {
                        View m36897B4 = this.f46954g1.m36897B(i15);
                        if (m36897B4 instanceof SocialMemoryIntroPage) {
                            SocialMemoryIntroPage socialMemoryIntroPage4 = (SocialMemoryIntroPage) m36897B4;
                            bitmap = socialMemoryIntroPage4.getTopDecorFrame();
                            bottomDecorFrame = socialMemoryIntroPage4.getBottomDecorFrame();
                        }
                        bottomDecorFrame = null;
                    }
                }
            }
            f11 = -100.0f;
            bottomDecorFrame = null;
        }
        if (0.0f <= f11 && f11 <= 1.0f && bitmap != null && bottomDecorFrame != null) {
            this.f46950c1.setAlpha(f11);
            this.f46950c1.setImageBitmap(bitmap);
            this.f46951d1.setAlpha(f11);
            this.f46951d1.setImageBitmap(bottomDecorFrame);
        } else {
            this.f46950c1.setAlpha(0.0f);
            this.f46951d1.setAlpha(0.0f);
        }
        this.f46950c1.setVisibility(0);
        this.f46951d1.setVisibility(0);
    }

    /* renamed from: sN */
    private void m46807sN(int i11, float f11, int i12) {
        int overlayColor;
        if (this.f46964q1 != 0 && m46761aN(i11)) {
            int i13 = this.f46964q1;
            if (i13 == 2) {
                if (m46757YM(i11) && m46755XM(i11 + 1, 1)) {
                    f11 = 1.0f - f11;
                    KeyEvent.Callback m36897B = this.f46954g1.m36897B(i11);
                    if (m36897B instanceof InterfaceC8411v6) {
                        overlayColor = ((InterfaceC8411v6) m36897B).getOverlayColor();
                    }
                    overlayColor = 0;
                } else {
                    if (m46755XM(i11, 1)) {
                        int i14 = i11 + 1;
                        if (m46757YM(i14)) {
                            KeyEvent.Callback m36897B2 = this.f46954g1.m36897B(i14);
                            if (m36897B2 instanceof InterfaceC8411v6) {
                                overlayColor = ((InterfaceC8411v6) m36897B2).getOverlayColor();
                            }
                            overlayColor = 0;
                        }
                    }
                    f11 = -100.0f;
                    overlayColor = 0;
                }
            } else {
                if (i13 == 1) {
                    if (m46757YM(i11) && m46755XM(i11 + 1, 1)) {
                        f11 = 1.0f - f11;
                        KeyEvent.Callback m36897B3 = this.f46954g1.m36897B(i11);
                        if (m36897B3 instanceof InterfaceC8411v6) {
                            overlayColor = ((InterfaceC8411v6) m36897B3).getOverlayColor();
                        }
                        overlayColor = 0;
                    } else if (m46755XM(i11, 1)) {
                        int i15 = i11 + 1;
                        if (m46757YM(i15)) {
                            KeyEvent.Callback m36897B4 = this.f46954g1.m36897B(i15);
                            if (m36897B4 instanceof InterfaceC8411v6) {
                                overlayColor = ((InterfaceC8411v6) m36897B4).getOverlayColor();
                            }
                            overlayColor = 0;
                        }
                    }
                }
                f11 = -100.0f;
                overlayColor = 0;
            }
            if (0.0f <= f11 && f11 <= 1.0f && overlayColor != 0) {
                this.f46952e1.setAlpha(f11);
                this.f46952e1.setBackgroundColor(overlayColor);
            } else {
                this.f46952e1.setAlpha(0.0f);
            }
            this.f46952e1.setVisibility(0);
        }
    }

    /* renamed from: tN */
    private void m46809tN(int i11, float f11, int i12) {
        int i13 = this.f46964q1;
        if (i13 == 2) {
            if (m46757YM(i11) && m46755XM(i11 + 1, 1)) {
                this.f46942U0.setTranslationY((1.0f - f11) * f46926I1);
                this.f46942U0.setAlpha(f11);
            } else if (m46755XM(i11, 1) && m46757YM(i11 + 1)) {
                this.f46942U0.setTranslationY(f46926I1 * f11);
                this.f46942U0.setAlpha(1.0f - f11);
            }
        } else if (i13 == 1) {
            if (m46757YM(i11) && m46755XM(i11 + 1, 1)) {
                this.f46942U0.setTranslationY((1.0f - f11) * f46926I1);
                this.f46942U0.setAlpha(f11);
            } else if (m46755XM(i11, 1) && m46757YM(i11 + 1)) {
                this.f46942U0.setTranslationY(f46926I1 * f11);
                this.f46942U0.setAlpha(1.0f - f11);
            }
        }
        this.f46942U0.setVisibility(0);
    }

    /* renamed from: uN */
    private void m46811uN(int i11, float f11, int i12) {
        if (f11 != 0.0f && f11 != 1.0f) {
            m46784iO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vN */
    public void m46813vN(int i11, float f11, int i12) {
        m46809tN(i11, f11, i12);
        m46803qN(i11, f11, i12);
        m46805rN(i11, f11, i12);
        m46807sN(i11, f11, i12);
        m46811uN(i11, f11, i12);
        m46815wN(i11, f11, i12);
    }

    /* renamed from: wN */
    private void m46815wN(int i11, float f11, int i12) {
        int i13 = this.f46964q1;
        if (i13 == 2) {
            if (m46757YM(i11) && m46755XM(i11 + 1, 1)) {
                this.f46949b1.setAlpha(f11);
            } else if (m46755XM(i11, 1) && m46757YM(i11 + 1)) {
                this.f46949b1.setAlpha(1.0f - f11);
            }
        } else if (i13 == 1) {
            if (m46757YM(i11) && m46755XM(i11 + 1, 1)) {
                this.f46949b1.setAlpha(f11);
            } else if (m46755XM(i11, 1) && m46757YM(i11 + 1)) {
                this.f46949b1.setAlpha(1.0f - f11);
            }
        }
        this.f46949b1.setVisibility(0);
    }

    /* renamed from: xN */
    private void m46817xN(C3060y1 c3060y1) {
        C17487o0 c17487o0;
        String str;
        try {
            if (m92676n2() != null) {
                c17487o0 = m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            C17487o0 c17487o02 = c17487o0;
            if (c17487o02 != null && c3060y1 != null) {
                String str2 = c3060y1.f12368b;
                String str3 = CoreUtility.f89233i;
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("fid", str2);
                    bundle.putString("ownerId", str3);
                    bundle.putString("extra_feed_memory_info", c3060y1.m14711c().toString());
                    bundle.putInt("fromSrc", 13);
                    C32002l4 c32002l4 = this.f46966s1;
                    if (c32002l4 != null) {
                        str = c32002l4.m154277l();
                    } else {
                        str = "";
                    }
                    bundle.putString("extra_entry_point_flow", str);
                    c17487o02.m93066i2(FeedDetailsView.class, bundle, 1, 1, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yN */
    private void m46819yN() {
        C17487o0 c17487o0;
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_tracking_source", new TrackingSource(31).m40686z());
            c17487o0.m93069k2(UpdateStatusView.class, bundle, 1, true);
        }
    }

    /* renamed from: zN */
    private void m46821zN() {
        C3056x1 c3056x1;
        C3052w1 c3052w1;
        C3021p1 c3021p1;
        C3060y1 c3060y1;
        JSONObject jSONObject;
        String str;
        try {
            C7230u7 c7230u7 = this.f46954g1;
            C17487o0 c17487o0 = null;
            if (c7230u7 != null) {
                c3056x1 = c7230u7.m36900y(this.f46961n1);
            } else {
                c3056x1 = null;
            }
            if (c3056x1 != null) {
                c3052w1 = c3056x1.f12358e;
            } else {
                c3052w1 = null;
            }
            if (c3052w1 != null) {
                c3021p1 = c3052w1.f12305d;
            } else {
                c3021p1 = null;
            }
            if (c3021p1 != null) {
                c3060y1 = c3021p1.f12072e;
            } else {
                c3060y1 = null;
            }
            if (c3060y1 != null) {
                jSONObject = c3060y1.m14711c();
            } else {
                jSONObject = null;
            }
            if (m92676n2() != null) {
                c17487o0 = m92676n2().mo35579p();
            }
            if (c17487o0 != null && jSONObject != null) {
                Bundle bundle = new Bundle();
                bundle.putString("memory_entry_attachment", jSONObject.toString());
                C32002l4 c32002l4 = this.f46966s1;
                if (c32002l4 != null) {
                    str = c32002l4.m154277l();
                } else {
                    str = "";
                }
                bundle.putString("entry_point_chain", str);
                c17487o0.m93069k2(ShareMemoryView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C3124i c3124i = new C3124i(this, C2288h.m12125s());
        this.f46934M0 = c3124i;
        AbstractC3137v.m15776a(m92642L3());
        c3124i.mo995Nd(null, null);
        this.f46965r1 = new C23528a(getContext());
        this.f46959l1 = new HashMap();
        m46737OM();
        C26747f0.m137582I().m137669U0();
    }

    /* renamed from: CM */
    protected void m46822CM(C3031r1 c3031r1) {
        if (this.f46945X0 == null) {
            return;
        }
        if (c3031r1 != null) {
            String str = AbstractC18458a.f93019a;
            if (!str.equals("en") && !str.equals("my")) {
                this.f46945X0.setText(c3031r1.f12216a);
            } else {
                this.f46945X0.setText(c3031r1.f12217b);
            }
        }
        this.f46945X0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_confirm_view_memory_title)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_confirm_view_memory_positive), this);
        return aVar.m43152a();
    }

    /* renamed from: DM */
    protected void m46823DM(C3036s1 c3036s1) {
        if (this.f46944W0 == null) {
            return;
        }
        if (c3036s1 != null) {
            String str = AbstractC18458a.f93019a;
            if (!str.equals("en") && !str.equals("my")) {
                this.f46944W0.setText(c3036s1.f12234a);
            } else {
                this.f46944W0.setText(c3036s1.f12235b);
            }
        }
        this.f46944W0.setVisibility(0);
    }

    /* renamed from: DN */
    public void m46824DN() {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f46963p1 && this.f46950c1 != null && this.f46951d1 != null) {
            if (m46755XM(this.f46961n1, 0)) {
                View m36897B = this.f46954g1.m36897B(this.f46961n1);
                if (m36897B instanceof SocialMemoryIntroPage) {
                    SocialMemoryIntroPage socialMemoryIntroPage = (SocialMemoryIntroPage) m36897B;
                    bitmap = socialMemoryIntroPage.getTopDecorFrame();
                    bitmap2 = socialMemoryIntroPage.getBottomDecorFrame();
                    if (bitmap == null && bitmap2 != null) {
                        this.f46950c1.setAlpha(1.0f);
                        this.f46950c1.setImageBitmap(bitmap);
                        this.f46951d1.setAlpha(1.0f);
                        this.f46951d1.setImageBitmap(bitmap2);
                        this.f46950c1.setVisibility(0);
                        this.f46951d1.setVisibility(0);
                        return;
                    }
                    m46740PN();
                }
            }
            bitmap = null;
            bitmap2 = null;
            if (bitmap == null) {
            }
            m46740PN();
        }
    }

    /* renamed from: Dm */
    public void m46825Dm() {
        try {
            if (!m92676n2().mo35576n3()) {
                if (m92662fJ().m93029Q(MainTabView.class)) {
                    finish();
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                    m92662fJ().m93069k2(MainTabView.class, bundle, 2, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // br.InterfaceC3116a
    /* renamed from: Eh */
    public void mo15735Eh(String str, String str2) {
        C31877d c31877d = new C31877d();
        if (TextUtils.equals(str, "action.open.postfeed")) {
            c31877d.m153187f(new TrackingSource(32));
        }
        AbstractC28207v1.m141994i3(str, 7, m92676n2(), this.f72421L0, str2, c31877d);
    }

    /* renamed from: FM */
    protected C7230u7 m46826FM() {
        C7230u7 c7230u7 = this.f46954g1;
        if (c7230u7 == null) {
            return new C7230u7(this.f46965r1, this);
        }
        return c7230u7;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(m46827IM(), viewGroup, false);
        m46753WM(inflate, layoutInflater);
        m46766cO();
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        if (m92656bJ() instanceof ViewGroup) {
            ((ViewGroup) m92656bJ()).removeView(this.f46955h1);
            m78943YL(null);
        }
        this.f46967t1 = "";
        MultiStateView multiStateView = this.f46935N0;
        if (multiStateView != null && multiStateView.getState() == MultiStateView.EnumC15914e.CONTENT) {
            C0815e1.m2075D().m2100V(new C23648e(12, "", 1, "social_memory_count_slide", String.valueOf(this.f46934M0.mo15743Ko()), String.valueOf(this.f46934M0.mo15746Yi())), false);
        }
    }

    /* renamed from: IM */
    public int m46827IM() {
        return AbstractC7409c0.social_memory_view;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
    }

    /* renamed from: JM */
    protected C3060y1 m46828JM() {
        C3052w1 c3052w1;
        C3021p1 c3021p1;
        C3056x1 m36900y = this.f46954g1.m36900y(this.f46961n1);
        if (m36900y != null) {
            c3052w1 = m36900y.f12358e;
        } else {
            c3052w1 = null;
        }
        if (c3052w1 != null) {
            c3021p1 = c3052w1.f12305d;
        } else {
            c3021p1 = null;
        }
        if (c3021p1 == null) {
            return null;
        }
        return c3021p1.f12072e;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 1 && i11 == -1) {
                m46817xN(m46828JM());
                interfaceC17463d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 6004);
        C23744a.m124114c().m124117e(this, 5117);
        m46799oN(this.f46961n1);
    }

    @Override // br.InterfaceC3118c
    /* renamed from: Mo */
    public void mo15748Mo() {
        if (m92687sJ()) {
            m46732LN(false);
        }
        this.f46935N0.setState(MultiStateView.EnumC15914e.EMPTY);
    }

    @Override // br.InterfaceC3116a
    /* renamed from: Pk */
    public void mo15736Pk() {
        if (!this.f46963p1) {
            showDialog(1);
        }
    }

    @Override // br.InterfaceC3118c
    /* renamed from: Q0 */
    public void mo15749Q0() {
        KeyframeAnimLayout keyframeAnimLayout = this.f46955h1;
        if (keyframeAnimLayout != null) {
            keyframeAnimLayout.setLoop(false);
            this.f46955h1.mo1316s();
            this.f46955h1.setVisibility(8);
        }
        LottieImageView lottieImageView = this.f46956i1;
        if (lottieImageView != null) {
            lottieImageView.m92150E();
            this.f46956i1.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m46799oN(this.f46961n1);
        m46732LN(false);
        this.f46934M0.mo15744Q0();
    }

    @Override // br.InterfaceC3118c
    /* renamed from: S1 */
    public void mo15750S1() {
        if (this.f46963p1) {
            return;
        }
        m46719CN();
        m46726HN();
        m46824DN();
        m46722FN();
        m46724GN();
        m46728JN();
        m46718BN();
        m46730KN();
        m46716AN();
        m46727IN();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        if (bundle != null) {
            String str = this.f46967t1;
            if (str == null) {
                str = "";
            }
            bundle.putString("temp_effect_key", str);
        }
    }

    @Override // br.InterfaceC3116a
    /* renamed from: Tl */
    public void mo15737Tl(int i11) {
        if (!this.f46963p1 && this.f46961n1 == i11) {
            m46824DN();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f46934M0.mo15744Q0();
        KeyframeAnimLayout keyframeAnimLayout = this.f46955h1;
        if (keyframeAnimLayout != null) {
            keyframeAnimLayout.m39938p();
        }
        if (this.f46956i1 != null && !TextUtils.isEmpty(this.f46957j1) && C7853b.m40052a0().m40139l0(this.f46957j1)) {
            C7853b.m40052a0().m40136j1();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p205hc.InterfaceC19970i
    /* renamed from: Y */
    public void mo46829Y() {
        if (m92687sJ()) {
            m46732LN(true);
        }
        this.f46935N0.setState(MultiStateView.EnumC15914e.LOADING);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
    }

    @Override // br.InterfaceC3118c
    /* renamed from: cD */
    public void mo15751cD() {
        if (m92687sJ()) {
            m46732LN(true);
        }
        this.f46935N0.setState(MultiStateView.EnumC15914e.CONTENT);
    }

    @Override // br.InterfaceC3118c
    /* renamed from: cs */
    public void mo15752cs() {
        this.f72827B0.postDelayed(new Runnable() { // from class: br.s
            @Override // java.lang.Runnable
            public final void run() {
                SocialMemoryView.this.m46765cN();
            }
        }, 5000L);
    }

    @Override // br.InterfaceC3116a
    /* renamed from: dF */
    public void mo15738dF(int i11) {
        if (!this.f46963p1 && this.f46961n1 == i11) {
            m46718BN();
        }
    }

    @Override // br.InterfaceC3118c
    /* renamed from: ei */
    public void mo15753ei(String str, String str2, LottieConfig lottieConfig) {
        LottieImageView lottieImageView = this.f46956i1;
        if (lottieImageView == null) {
            return;
        }
        lottieImageView.setVisibility(0);
        this.f46956i1.m92147B(str2 + "/data.json", "fullscreen_lottie_effect_" + str, !AbstractC23193r0.m119506o(), false);
        C25979a.m133810a(this.f46956i1, lottieConfig);
        this.f46956i1.m92155v();
        if (!C20024r.m103941j() && !C7853b.m40052a0().m40133i0() && lottieConfig.m48106i()) {
            C7853b m40052a0 = C7853b.m40052a0();
            m40052a0.m40136j1();
            String str3 = str2 + "/sound.mp3";
            this.f46957j1 = str3;
            if (new File(str3).exists()) {
                m40052a0.m40093D0(str3, 0, null, true, C25979a.m133813d(lottieConfig), true);
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SocialMemoryView";
    }

    @Override // br.InterfaceC3118c
    /* renamed from: hw */
    public void mo15754hw(String str, String str2) {
        KeyframeAnimLayout keyframeAnimLayout = this.f46955h1;
        if (keyframeAnimLayout != null) {
            keyframeAnimLayout.m39937m(str2, str);
            this.f46955h1.m39935i();
            this.f46955h1.setVisibility(0);
        }
    }

    @Override // br.InterfaceC3118c
    /* renamed from: io */
    public void mo15755io(List list) {
        this.f46954g1.m36899E(list);
        m46758YN();
    }

    @Override // br.InterfaceC3118c
    /* renamed from: j0 */
    public void mo15756j0() {
        if (m92687sJ()) {
            m46732LN(true);
        }
        this.f46935N0.setState(MultiStateView.EnumC15914e.ERROR);
    }

    @Override // br.InterfaceC3118c
    /* renamed from: mH */
    public void mo15757mH() {
        mo15755io(new ArrayList());
        this.f46961n1 = 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.button_share_memory) {
            if (!this.f46963p1) {
                m46821zN();
            }
        } else if (id2 == AbstractC6918a0.img_close) {
            m46825Dm();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m46825Dm();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        MultiStateView multiStateView = this.f46935N0;
        boolean z11 = true;
        if (multiStateView != null) {
            if (multiStateView.getState() == MultiStateView.EnumC15914e.EMPTY) {
                z11 = false;
            }
            m46732LN(z11);
        } else {
            m46732LN(true);
        }
        m46720EM(this.f46961n1);
        m46801pN(this.f46961n1);
    }

    @Override // br.InterfaceC3116a
    /* renamed from: tx */
    public int mo15739tx(int i11) {
        Map map = this.f46959l1;
        if (map != null) {
            Integer num = (Integer) map.get(Integer.valueOf(i11));
            if (num == null) {
                num = Integer.valueOf(m46731LM());
                this.f46959l1.put(Integer.valueOf(i11), num);
            }
            return num.intValue();
        }
        return f46925H1;
    }

    @Override // br.InterfaceC3118c
    /* renamed from: wF */
    public void mo15758wF() {
        m46738ON();
        m46746SN();
        m46740PN();
        m46742QN();
        m46744RN();
        m46750UN();
        m46736NN();
        m46752VN();
        m46734MN();
        m46748TN();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 5100) {
            if (i11 != 5117) {
                if (i11 == 6004) {
                    this.f46934M0.mo15742Im(((Boolean) objArr[0]).booleanValue());
                    return;
                }
                return;
            }
            mo70710wy(new Runnable() { // from class: br.j
                @Override // java.lang.Runnable
                public final void run() {
                    SocialMemoryView.this.m46768dN();
                }
            });
            return;
        }
        if (objArr != null && objArr.length > 0) {
            final Object obj = objArr[0];
            if (obj instanceof Bundle) {
                mo70710wy(new Runnable() { // from class: br.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        SocialMemoryView.this.m46771eN(obj);
                    }
                });
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m46741QM(m92642L3());
        m46754WN(bundle);
        m46762aO();
    }

    @Override // br.InterfaceC3116a
    /* renamed from: xf */
    public void mo15740xf(int i11) {
        if (!this.f46963p1 && this.f46961n1 == i11) {
            mo15750S1();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: yJ */
    public void mo46830yJ(WindowInsets windowInsets) {
        super.mo46830yJ(windowInsets);
        m46760ZN();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 6004);
        C23744a.m124114c().m124115b(this, 5117);
    }
}
