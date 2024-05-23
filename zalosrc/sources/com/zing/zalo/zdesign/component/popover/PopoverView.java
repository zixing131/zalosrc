package com.zing.zalo.zdesign.component.popover;

import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import com.zing.zalo.zdesign.component.popover.InterfaceC17034c;
import com.zing.zalo.zdesign.layout.BasePopupView;
import com.zing.zalo.zdesign.layout.BoundedLinearLayout;
import com.zing.zalo.zdesign.layout.BoundedRecyclerView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import pm0.C24848g0;
import qi0.EnumC25294c;
import ri0.C25808b;
import ui0.C27276c;
import ui0.C27279f;

/* loaded from: classes7.dex */
public final class PopoverView<T extends InterfaceC17034c> extends BasePopupView {

    /* renamed from: g0 */
    private final FrameLayout f87137g0;

    /* renamed from: h0 */
    private BoundedRecyclerView f87138h0;

    /* renamed from: i0 */
    private C17033b f87139i0;

    /* renamed from: j0 */
    private C17035d f87140j0;

    /* renamed from: k0 */
    private AnimationSet f87141k0;

    /* renamed from: l0 */
    private InterfaceC17028b f87142l0;

    /* renamed from: com.zing.zalo.zdesign.component.popover.PopoverView$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC17027a {
    }

    /* renamed from: com.zing.zalo.zdesign.component.popover.PopoverView$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC17028b {
        /* renamed from: a */
        void mo91185a();
    }

    /* renamed from: com.zing.zalo.zdesign.component.popover.PopoverView$c */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C17029c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f87143a;

        static {
            int[] iArr = new int[EnumC25294c.values().length];
            try {
                iArr[EnumC25294c.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25294c.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25294c.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25294c.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f87143a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.popover.PopoverView$d */
    /* loaded from: classes7.dex */
    public static final class AnimationAnimationListenerC17030d implements Animation.AnimationListener {

        /* renamed from: b */
        final /* synthetic */ boolean f87145b;

        /* renamed from: c */
        final /* synthetic */ Runnable f87146c;

        AnimationAnimationListenerC17030d(boolean z11, Runnable runnable) {
            this.f87145b = z11;
            this.f87146c = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            PopoverView.this.setShowing(false);
            if (this.f87145b) {
                InterfaceC17028b interfaceC17028b = PopoverView.this.f87142l0;
                if (interfaceC17028b != null) {
                    interfaceC17028b.mo91185a();
                }
            } else {
                PopoverView.m91167D(PopoverView.this);
            }
            Runnable runnable = this.f87146c;
            if (runnable != null) {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.popover.PopoverView$e */
    /* loaded from: classes7.dex */
    public static final class C17031e extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ BoundedLinearLayout f87147a;

        C17031e(BoundedLinearLayout boundedLinearLayout) {
            this.f87147a = boundedLinearLayout;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            AbstractC19074t.m100207e(this.f87147a.getContext(), "context");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C27276c.m139649b(r0, 12));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopoverView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f87137g0 = new FrameLayout(context);
        m91180O();
    }

    /* renamed from: D */
    public static final /* synthetic */ InterfaceC17027a m91167D(PopoverView popoverView) {
        popoverView.getClass();
        return null;
    }

    /* renamed from: G */
    private final void m91170G() {
        ViewParent viewParent;
        ImageView arrowView;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        C17035d c17035d = this.f87140j0;
        C17035d c17035d2 = null;
        if (c17035d == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            c17035d = null;
        }
        float m139649b = C27276c.m139649b(context, c17035d.m91207f());
        C17035d c17035d3 = this.f87140j0;
        if (c17035d3 == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            c17035d3 = null;
        }
        if (c17035d3.m91203b()) {
            if (getArrowView() == null) {
                setArrowView(new ImageView(getContext()));
            }
            ImageView arrowView2 = getArrowView();
            if (arrowView2 != null) {
                arrowView2.setElevation(m139649b);
            }
            C17035d c17035d4 = this.f87140j0;
            if (c17035d4 == null) {
                AbstractC19074t.m100223u("popoverConfigs");
                c17035d4 = null;
            }
            Drawable m91202a = c17035d4.m91202a();
            if (m91202a != null && (arrowView = getArrowView()) != null) {
                arrowView.setImageDrawable(m91202a);
            }
            ImageView arrowView3 = getArrowView();
            if (arrowView3 != null) {
                viewParent = arrowView3.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent == null) {
                this.f87137g0.addView(getArrowView(), new ViewGroup.LayoutParams(-2, -2));
            }
        }
        View mainPopupView = getMainPopupView();
        if (mainPopupView != null) {
            mainPopupView.setElevation(m139649b);
            C17035d c17035d5 = this.f87140j0;
            if (c17035d5 == null) {
                AbstractC19074t.m100223u("popoverConfigs");
            } else {
                c17035d2 = c17035d5;
            }
            Drawable m91204c = c17035d2.m91204c();
            if (m91204c != null) {
                mainPopupView.setBackground(m91204c);
            }
            if (mainPopupView.getParent() != null && !AbstractC19074t.m100204b(mainPopupView.getParent(), this.f87137g0)) {
                View mainPopupView2 = getMainPopupView();
                AbstractC19074t.m100205c(mainPopupView2);
                if (mainPopupView2.getParent() instanceof ViewGroup) {
                    View mainPopupView3 = getMainPopupView();
                    AbstractC19074t.m100205c(mainPopupView3);
                    ViewParent parent = mainPopupView3.getParent();
                    AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(mainPopupView);
                }
            }
            if (mainPopupView.getParent() == null) {
                if (mainPopupView.getLayoutParams() != null) {
                    this.f87137g0.addView(mainPopupView);
                } else {
                    this.f87137g0.addView(mainPopupView, new ViewGroup.LayoutParams(-2, -2));
                }
            }
        }
        if (this.f87137g0.getParent() != null && !AbstractC19074t.m100204b(this.f87137g0.getParent(), this) && (this.f87137g0.getParent() instanceof ViewGroup)) {
            ViewParent parent2 = this.f87137g0.getParent();
            AbstractC19074t.m100206d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent2).removeView(this.f87137g0);
        }
        if (this.f87137g0.getParent() == null) {
            addView(this.f87137g0);
        }
    }

    /* renamed from: J */
    public static final void m91171J(PopoverView popoverView) {
        AbstractC19074t.m100208f(popoverView, "this$0");
        ViewParent parent = popoverView.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(popoverView);
            AbstractC20110a.m104535d("Popover was removed", new Object[0]);
        }
    }

    /* renamed from: K */
    private final Animation m91172K(boolean z11) {
        AlphaAnimation alphaAnimation;
        if (z11) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(200L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        return alphaAnimation;
    }

    /* renamed from: L */
    private final Animation m91173L(boolean z11) {
        ScaleAnimation scaleAnimation;
        int[] iArr = new int[2];
        View targetView = getTargetView();
        if (targetView != null) {
            targetView.getLocationOnScreen(iArr);
        }
        if (z11) {
            scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, iArr[0], iArr[1]);
        } else {
            scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, iArr[0], iArr[1]);
        }
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(new LinearInterpolator());
        return scaleAnimation;
    }

    /* renamed from: M */
    private final AnimationSet m91174M(boolean z11, Runnable runnable) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(m91173L(z11));
        animationSet.addAnimation(m91172K(z11));
        animationSet.setAnimationListener(new AnimationAnimationListenerC17030d(z11, runnable));
        setShowing(true);
        return animationSet;
    }

    /* renamed from: N */
    static /* synthetic */ AnimationSet m91175N(PopoverView popoverView, boolean z11, Runnable runnable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            runnable = null;
        }
        return popoverView.m91174M(z11, runnable);
    }

    /* renamed from: P */
    private final void m91176P() {
        BoundedRecyclerView boundedRecyclerView;
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC2812f.layout_popover, (ViewGroup) this, false);
        AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type com.zing.zalo.zdesign.layout.BoundedLinearLayout");
        setMainPopupView((BoundedLinearLayout) inflate);
        View mainPopupView = getMainPopupView();
        AbstractC19074t.m100206d(mainPopupView, "null cannot be cast to non-null type com.zing.zalo.zdesign.layout.BoundedLinearLayout");
        this.f87138h0 = (BoundedRecyclerView) ((BoundedLinearLayout) mainPopupView).findViewById(AbstractC2811e.rv_popover_options);
        View mainPopupView2 = getMainPopupView();
        AbstractC19074t.m100206d(mainPopupView2, "null cannot be cast to non-null type com.zing.zalo.zdesign.layout.BoundedLinearLayout");
        BoundedLinearLayout boundedLinearLayout = (BoundedLinearLayout) mainPopupView2;
        Context context = boundedLinearLayout.getContext();
        AbstractC19074t.m100207e(context, "context");
        boundedLinearLayout.setMinimumWidth(C27276c.m139649b(context, 160));
        boundedLinearLayout.setClipToOutline(true);
        boundedLinearLayout.setOutlineProvider(new C17031e(boundedLinearLayout));
        Context context2 = boundedLinearLayout.getContext();
        AbstractC19074t.m100207e(context2, "context");
        boundedLinearLayout.setMaxWidth(Math.min((int) (boundedLinearLayout.getResources().getDisplayMetrics().widthPixels * 0.75f), C27276c.m139649b(context2, 400)));
        C17033b c17033b = this.f87139i0;
        if (c17033b != null) {
            AbstractC19074t.m100205c(c17033b);
            if (c17033b.mo10003k() > 0 && (boundedRecyclerView = this.f87138h0) != null) {
                boundedRecyclerView.setAdapter(this.f87139i0);
            }
        }
    }

    /* renamed from: S */
    private final void m91177S(ViewGroup viewGroup) {
        Activity activity;
        View view;
        Window window;
        C17033b c17033b;
        setMDismissed(false);
        C17035d c17035d = this.f87140j0;
        if (c17035d == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            c17035d = null;
        }
        if (c17035d.m91205d() == null && (c17033b = this.f87139i0) != null && c17033b.mo10003k() == 0) {
            AbstractC20110a.m104535d("Cannot show popover, please check popover data again.", new Object[0]);
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this);
        }
        if (viewGroup == null) {
            Context context = getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            if (activity != null && (window = activity.getWindow()) != null) {
                view = window.getDecorView();
            } else {
                view = null;
            }
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
        }
        if (viewGroup == null) {
            AbstractC20110a.m104535d("Cannot show popover, container view is null.", new Object[0]);
            return;
        }
        viewGroup.addView(this);
        if (m91376p()) {
            AbstractC20110a.m104535d("Popover is shown", new Object[0]);
            AnimationSet m91175N = m91175N(this, false, null, 3, null);
            this.f87141k0 = m91175N;
            this.f87137g0.startAnimation(m91175N);
            return;
        }
        AbstractC20110a.m104535d("Popover is invisible because target view isn't shown", new Object[0]);
        mo90739s();
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: A */
    protected void mo90725A() {
        setNoOfChild(this.f87137g0.getChildCount());
        setSafeAreaLeft(getLeft() + getPadding8());
        setSafeAreaTop(getTop() + getStatusBarHeight() + getPadding16());
        setSafeAreaRight(getRight() - getPadding8());
        int bottom = getBottom();
        C27279f c27279f = C27279f.f128337a;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        setSafeAreaBottom((bottom - c27279f.m139652b(context, C27279f.a.NAVIGATION_BAR_HEIGHT)) - getPadding16());
        setTargetViewLeft(0);
        setTargetViewTop(0);
        setTargetViewWidth(0);
        setTargetViewHeight(0);
        setLeftSpaceValid(0);
        setTopSpaceValid(0);
        setRightSpaceValid(0);
        setBottomSpaceValid(0);
        if (getTargetView() != null) {
            m91183T();
            setTargetViewLeft(getTargetViewRect().left);
            setTargetViewTop(getTargetViewRect().top);
            setTargetViewWidth(getTargetViewRect().width());
            setTargetViewHeight(getTargetViewRect().height());
            setLeftSpaceValid((getTargetViewLeft() - getSafeAreaLeft()) - getPadding12());
            setTopSpaceValid((getTargetViewTop() - getSafeAreaTop()) - getPadding12());
            setRightSpaceValid(getSafeAreaRight() - ((getTargetViewLeft() + getTargetViewWidth()) + getPadding12()));
            setBottomSpaceValid(getSafeAreaBottom() - ((getTargetViewTop() + getTargetViewHeight()) + getPadding12()));
        }
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: B */
    protected void mo90726B() {
    }

    /* renamed from: H */
    public final void m91178H(C17035d c17035d, C17033b c17033b) {
        AbstractC19074t.m100208f(c17035d, "configs");
        this.f87137g0.removeAllViews();
        this.f87140j0 = c17035d;
        C24848g0 c24848g0 = null;
        if (c17035d == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            c17035d = null;
        }
        setTargetView(c17035d.m91213l());
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        C17035d c17035d2 = this.f87140j0;
        if (c17035d2 == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            c17035d2 = null;
        }
        setTargetRounded(C27276c.m139649b(context, c17035d2.m91212k()));
        C17035d c17035d3 = this.f87140j0;
        if (c17035d3 == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            c17035d3 = null;
        }
        setOverlayPlace(c17035d3.m91209h());
        C17035d c17035d4 = this.f87140j0;
        if (c17035d4 == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            c17035d4 = null;
        }
        setClearTargetShape(c17035d4.m91214m());
        C17035d c17035d5 = this.f87140j0;
        if (c17035d5 == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            c17035d5 = null;
        }
        View m91205d = c17035d5.m91205d();
        if (m91205d != null) {
            setMainPopupView(m91205d);
            c24848g0 = C24848g0.f119245a;
        }
        if (c24848g0 == null) {
            if (c17033b == null) {
                AbstractC20110a.m104535d("Adapter cannot be null", new Object[0]);
                return;
            } else {
                this.f87139i0 = c17033b;
                m91176P();
            }
        }
        m91170G();
        requestLayout();
    }

    /* renamed from: I */
    public void m91179I() {
        ViewTreeObserver viewTreeObserver;
        if (!getMDismissed() && getParent() != null) {
            setMDismissed(true);
            View targetView = getTargetView();
            if (targetView != null && (viewTreeObserver = targetView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(getOnGlobalLayoutListener());
                viewTreeObserver.removeOnScrollChangedListener(getOnScrollChangedListener());
            }
            this.f87137g0.startAnimation(m91174M(false, new Runnable() { // from class: com.zing.zalo.zdesign.component.popover.g
                public /* synthetic */ RunnableC17038g() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PopoverView.m91171J(PopoverView.this);
                }
            }));
        }
    }

    /* renamed from: O */
    protected void m91180O() {
        setTrackingViewHolder(new C25808b(new WeakReference(this)));
    }

    /* renamed from: Q */
    public final void m91181Q() {
        m91177S(null);
    }

    /* renamed from: R */
    public final void m91182R(ViewGroup viewGroup) {
        m91177S(viewGroup);
    }

    /* renamed from: T */
    public final void m91183T() {
        int i11;
        int width;
        int i12;
        int i13;
        View targetView = getTargetView();
        if (targetView != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            targetView.getLocationOnScreen(iArr2);
            C17035d c17035d = this.f87140j0;
            C17035d c17035d2 = null;
            if (c17035d == null) {
                AbstractC19074t.m100223u("popoverConfigs");
                c17035d = null;
            }
            if (c17035d.m91210i() != null) {
                C17035d c17035d3 = this.f87140j0;
                if (c17035d3 == null) {
                    AbstractC19074t.m100223u("popoverConfigs");
                    c17035d3 = null;
                }
                Rect m91210i = c17035d3.m91210i();
                AbstractC19074t.m100205c(m91210i);
                int i14 = m91210i.left;
                C17035d c17035d4 = this.f87140j0;
                if (c17035d4 == null) {
                    AbstractC19074t.m100223u("popoverConfigs");
                    c17035d4 = null;
                }
                Rect m91210i2 = c17035d4.m91210i();
                AbstractC19074t.m100205c(m91210i2);
                int i15 = m91210i2.top;
                i12 = i14 - iArr[0];
                i11 = i15 - iArr[1];
                C17035d c17035d5 = this.f87140j0;
                if (c17035d5 == null) {
                    AbstractC19074t.m100223u("popoverConfigs");
                    c17035d5 = null;
                }
                Rect m91210i3 = c17035d5.m91210i();
                AbstractC19074t.m100205c(m91210i3);
                width = m91210i3.width() + i12;
                C17035d c17035d6 = this.f87140j0;
                if (c17035d6 == null) {
                    AbstractC19074t.m100223u("popoverConfigs");
                } else {
                    c17035d2 = c17035d6;
                }
                Rect m91210i4 = c17035d2.m91210i();
                AbstractC19074t.m100205c(m91210i4);
                i13 = m91210i4.height() + i11;
            } else {
                int i16 = iArr2[0];
                int i17 = iArr2[1];
                int i18 = i16 - iArr[0];
                i11 = i17 - iArr[1];
                width = targetView.getWidth() + i18;
                int height = targetView.getHeight() + i11;
                C17035d c17035d7 = this.f87140j0;
                if (c17035d7 == null) {
                    AbstractC19074t.m100223u("popoverConfigs");
                } else {
                    c17035d2 = c17035d7;
                }
                if (c17035d2.m91208g()) {
                    int paddingLeft = i18 + targetView.getPaddingLeft();
                    i11 += targetView.getPaddingTop();
                    width -= targetView.getPaddingRight();
                    i13 = height - targetView.getPaddingBottom();
                    i12 = paddingLeft;
                } else {
                    i12 = i18;
                    i13 = height;
                }
            }
            getTargetViewRect().set(i12, i11, width, i13);
        }
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: f */
    protected void mo90735f() {
        int i11;
        ImageView arrowView = getArrowView();
        if (arrowView != null) {
            int measuredHeight = arrowView.getMeasuredHeight();
            int measuredWidth = arrowView.getMeasuredWidth();
            int translationX = (int) arrowView.getTranslationX();
            int width = arrowView.getWidth() + translationX;
            int translationY = (int) arrowView.getTranslationY();
            int height = arrowView.getHeight() + translationY;
            View mainPopupView = getMainPopupView();
            AbstractC19074t.m100205c(mainPopupView);
            int measuredWidth2 = mainPopupView.getMeasuredWidth();
            View mainPopupView2 = getMainPopupView();
            AbstractC19074t.m100205c(mainPopupView2);
            int measuredHeight2 = mainPopupView2.getMeasuredHeight();
            int childLeft = getChildLeft() + measuredWidth2;
            int childTop = getChildTop() + measuredHeight2;
            EnumC25294c overlayPlace = getOverlayPlace();
            if (overlayPlace == null) {
                i11 = -1;
            } else {
                i11 = C17029c.f87143a[overlayPlace.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            if (translationY - getChildTop() < getPadding16()) {
                                setArrowViewResId(AbstractC2810d.ic_popover_arrow_left_top);
                                int targetViewTop = getTargetViewTop() + (getTargetViewWidth() / 2);
                                arrowView.setTranslationY(targetViewTop);
                                setChildTop(targetViewTop);
                                setChildLeft(getTargetViewLeft() + getTargetViewWidth() + (measuredWidth / 2));
                                return;
                            }
                            if (childTop - height < getPadding16()) {
                                setArrowViewResId(AbstractC2810d.ic_popover_arrow_left_bottom);
                                int targetViewTop2 = (getTargetViewTop() + (getTargetViewWidth() / 2)) - measuredHeight;
                                arrowView.setTranslationY(targetViewTop2);
                                setChildTop((targetViewTop2 + arrowView.getHeight()) - measuredHeight2);
                                setChildLeft(getTargetViewLeft() + getTargetViewWidth() + (measuredWidth / 2));
                                return;
                            }
                            setChildLeft(getTargetViewLeft() + getTargetViewWidth() + (measuredWidth / 2));
                            setArrowViewResId(AbstractC2810d.ic_popover_arrow_left_center);
                            return;
                        }
                        return;
                    }
                    if (translationY - getChildTop() < getPadding16()) {
                        setArrowViewResId(AbstractC2810d.ic_popover_arrow_right_top);
                        int targetViewTop3 = getTargetViewTop() + (getTargetViewWidth() / 2);
                        arrowView.setTranslationY(targetViewTop3);
                        setChildTop(targetViewTop3);
                        setChildLeft((getTargetViewLeft() - measuredWidth2) - (measuredWidth / 2));
                        return;
                    }
                    if (childTop - height < getPadding16()) {
                        setArrowViewResId(AbstractC2810d.ic_popover_arrow_right_bottom);
                        int targetViewTop4 = (getTargetViewTop() + (getTargetViewWidth() / 2)) - measuredHeight;
                        arrowView.setTranslationY(targetViewTop4);
                        setChildTop((targetViewTop4 + arrowView.getHeight()) - measuredHeight2);
                        setChildLeft((getTargetViewLeft() - measuredWidth2) - (measuredWidth / 2));
                        return;
                    }
                    setChildLeft((getTargetViewLeft() - measuredWidth2) - (measuredWidth / 2));
                    setArrowViewResId(AbstractC2810d.ic_popover_arrow_right_center);
                    return;
                }
                if (translationX - getChildLeft() < getPadding16()) {
                    setArrowViewResId(AbstractC2810d.ic_popover_arrow_top_left);
                    int targetViewLeft = getTargetViewLeft() + (getTargetViewWidth() / 2);
                    arrowView.setTranslationX(targetViewLeft);
                    setChildLeft(targetViewLeft);
                    setChildTop(getTargetViewTop() + getTargetViewHeight() + (measuredHeight / 2));
                    return;
                }
                if (childLeft - width < getPadding16()) {
                    setArrowViewResId(AbstractC2810d.ic_popover_arrow_top_right);
                    int targetViewLeft2 = (getTargetViewLeft() + (getTargetViewWidth() / 2)) - measuredWidth;
                    arrowView.setTranslationX(targetViewLeft2);
                    setChildLeft((targetViewLeft2 + arrowView.getWidth()) - measuredWidth2);
                    setChildTop(getTargetViewTop() + getTargetViewHeight() + (measuredHeight / 2));
                    return;
                }
                setChildTop(getTargetViewTop() + getTargetViewHeight() + (measuredHeight / 2));
                setArrowViewResId(AbstractC2810d.ic_popover_arrow_top_center);
                return;
            }
            if (translationX - getChildLeft() < getPadding16()) {
                setArrowViewResId(AbstractC2810d.ic_popover_arrow_bottom_left);
                int targetViewLeft3 = getTargetViewLeft() + (getTargetViewWidth() / 2);
                arrowView.setTranslationX(targetViewLeft3);
                setChildLeft(targetViewLeft3);
                setChildTop((getTargetViewTop() - measuredHeight2) - (measuredHeight / 2));
                return;
            }
            if (childLeft - width < getPadding16()) {
                setArrowViewResId(AbstractC2810d.ic_popover_arrow_bottom_right);
                int targetViewLeft4 = (getTargetViewLeft() + (getTargetViewWidth() / 2)) - measuredWidth;
                arrowView.setTranslationX(targetViewLeft4);
                setChildLeft((targetViewLeft4 + arrowView.getWidth()) - measuredWidth2);
                setChildTop((getTargetViewTop() - measuredHeight2) - (measuredHeight / 2));
                return;
            }
            setChildTop((getTargetViewTop() - measuredHeight2) - (measuredHeight / 2));
            setArrowViewResId(AbstractC2810d.ic_popover_arrow_bottom_center);
        }
    }

    public final C17035d getConfigs() {
        C17035d c17035d = this.f87140j0;
        if (c17035d == null) {
            return null;
        }
        if (c17035d == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            return null;
        }
        return c17035d;
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    protected int getDimColor() {
        C17035d c17035d = this.f87140j0;
        if (c17035d == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            c17035d = null;
        }
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        return c17035d.m91206e(context);
    }

    public final RecyclerView getRecyclerView() {
        return this.f87138h0;
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: i */
    protected View mo91184i(int i11) {
        View childAt = this.f87137g0.getChildAt(i11);
        AbstractC19074t.m100207e(childAt, "frameContainer.getChildAt(index)");
        return childAt;
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: j */
    public void mo90736j(int i11, int i12, int i13) {
        BoundedRecyclerView boundedRecyclerView;
        super.mo90736j(i11, i12, i13);
        int max = Math.max(i11, i12);
        if ((1 > i13 || i13 >= max) && (boundedRecyclerView = this.f87138h0) != null) {
            boundedRecyclerView.setMaxHeight(max);
        }
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: k */
    protected void mo90737k() {
        int i11;
        ImageView arrowView = getArrowView();
        AbstractC19074t.m100205c(arrowView);
        int measuredWidth = arrowView.getMeasuredWidth();
        ImageView arrowView2 = getArrowView();
        AbstractC19074t.m100205c(arrowView2);
        int measuredHeight = arrowView2.getMeasuredHeight();
        if (getTargetView() != null) {
            EnumC25294c overlayPlace = getOverlayPlace();
            if (overlayPlace == null) {
                i11 = -1;
            } else {
                i11 = C17029c.f87143a[overlayPlace.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        setChildLeft(getTargetViewLeft() + getTargetViewWidth() + getPadding2());
                        setChildTop(getTargetViewTop() + ((getTargetViewHeight() - measuredHeight) / 2));
                        setArrowViewResId(AbstractC2810d.ic_popover_arrow_left_center);
                        return;
                    } else {
                        setChildLeft((getTargetViewLeft() - measuredWidth) - getPadding2());
                        setChildTop(getTargetViewTop() + ((getTargetViewWidth() - measuredHeight) / 2));
                        setArrowViewResId(AbstractC2810d.ic_popover_arrow_right_center);
                        return;
                    }
                }
                setChildTop(getTargetViewTop() + getTargetViewHeight() + getPadding2());
                setChildLeft(getTargetViewLeft() + ((getTargetViewWidth() - measuredWidth) / 2));
                setArrowViewResId(AbstractC2810d.ic_popover_arrow_top_center);
                return;
            }
            setChildTop((getTargetViewTop() - measuredHeight) - getPadding2());
            setChildLeft(getTargetViewLeft() + ((getTargetViewWidth() - measuredWidth) / 2));
            setArrowViewResId(AbstractC2810d.ic_popover_arrow_bottom_center);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC19074t.m100208f(motionEvent, "event");
        View mainPopupView = getMainPopupView();
        if (mainPopupView != null) {
            z11 = C27279f.f128337a.m139653c(mainPopupView, motionEvent);
        } else {
            z11 = false;
        }
        BoundedRecyclerView boundedRecyclerView = this.f87138h0;
        if (boundedRecyclerView != null) {
            z12 = C27279f.f128337a.m139653c(boundedRecyclerView, motionEvent);
        } else {
            z12 = false;
        }
        C27279f c27279f = C27279f.f128337a;
        View targetView = getTargetView();
        C17035d c17035d = this.f87140j0;
        C17035d c17035d2 = null;
        if (c17035d == null) {
            AbstractC19074t.m100223u("popoverConfigs");
            c17035d = null;
        }
        Rect m91210i = c17035d.m91210i();
        C17035d c17035d3 = this.f87140j0;
        if (c17035d3 == null) {
            AbstractC19074t.m100223u("popoverConfigs");
        } else {
            c17035d2 = c17035d3;
        }
        if (!c27279f.m139654d(targetView, motionEvent, m91210i, c17035d2.m91211j()) && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11) {
            if (z12) {
                return false;
            }
            return true;
        }
        if (z13) {
            m91179I();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: q */
    protected boolean mo90738q() {
        Object parent;
        View targetView = getTargetView();
        if (targetView == null || (parent = targetView.getParent()) == null) {
            return false;
        }
        View targetView2 = getTargetView();
        AbstractC19074t.m100205c(targetView2);
        boolean isShown = targetView2.isShown();
        Rect rect = new Rect();
        View targetView3 = getTargetView();
        AbstractC19074t.m100205c(targetView3);
        if (!targetView3.getGlobalVisibleRect(rect)) {
            isShown = false;
        }
        if (isShown) {
            C17035d c17035d = this.f87140j0;
            if (c17035d == null) {
                AbstractC19074t.m100223u("popoverConfigs");
                c17035d = null;
            }
            if (c17035d.m91210i() != null) {
                m91183T();
                View view = (View) parent;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                int width = view.getWidth() + i11;
                int height = view.getHeight() + i12;
                if (getOverlayPlace() == EnumC25294c.TOP) {
                    if (getTargetViewRect().left > width || getTargetViewRect().right < i11 || getTargetViewRect().top > height || getTargetViewRect().bottom < i12) {
                        return false;
                    }
                } else if (getOverlayPlace() == EnumC25294c.BOTTOM) {
                    if (getTargetViewRect().left > width || getTargetViewRect().right < i11 || getTargetViewRect().bottom > height || getTargetViewRect().bottom < i12) {
                        return false;
                    }
                } else if (getTargetViewRect().left > width || getTargetViewRect().right < i11 || getTargetViewRect().top > height || getTargetViewRect().bottom < i12) {
                    return false;
                }
            }
        }
        return isShown;
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: s */
    protected void mo90739s() {
        AbstractC20110a.m104535d("Popover onHidden", new Object[0]);
        setVisibility(4);
    }

    public final void setOnDismissListener(InterfaceC17027a interfaceC17027a) {
        AbstractC19074t.m100208f(interfaceC17027a, "onDismissListener");
    }

    public final void setOnShownListener(InterfaceC17028b interfaceC17028b) {
        AbstractC19074t.m100208f(interfaceC17028b, "onShownListener");
        this.f87142l0 = interfaceC17028b;
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: x */
    protected void mo90740x() {
        AbstractC20110a.m104535d("Popover onShown", new Object[0]);
        setVisibility(0);
    }
}
