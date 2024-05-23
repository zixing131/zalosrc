package com.zing.zalo.zdesign.layout;

import ac.C0708i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.zdesign.component.InterfaceC16976f1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import pm0.C24848g0;
import qi0.EnumC25293b;
import qi0.EnumC25294c;
import ri0.C25808b;
import ui0.C27276c;
import ui0.C27279f;

/* loaded from: classes7.dex */
public abstract class BasePopupView extends FrameLayout implements InterfaceC16976f1 {
    public static final C17077a Companion = new C17077a(null);

    /* renamed from: A */
    private Drawable f87368A;

    /* renamed from: B */
    private EnumC25294c f87369B;

    /* renamed from: C */
    private EnumC25293b f87370C;

    /* renamed from: D */
    private View f87371D;

    /* renamed from: E */
    private ImageView f87372E;

    /* renamed from: F */
    private int f87373F;

    /* renamed from: G */
    private Animator f87374G;

    /* renamed from: H */
    private boolean f87375H;

    /* renamed from: I */
    private long f87376I;

    /* renamed from: J */
    private int f87377J;

    /* renamed from: K */
    private boolean f87378K;

    /* renamed from: L */
    private ViewTreeObserver.OnGlobalLayoutListener f87379L;

    /* renamed from: M */
    private ViewTreeObserver.OnScrollChangedListener f87380M;

    /* renamed from: N */
    private C25808b f87381N;

    /* renamed from: O */
    private int f87382O;

    /* renamed from: P */
    private int f87383P;

    /* renamed from: Q */
    private int f87384Q;

    /* renamed from: R */
    private int f87385R;

    /* renamed from: S */
    private int f87386S;

    /* renamed from: T */
    private int f87387T;

    /* renamed from: U */
    private int f87388U;

    /* renamed from: V */
    private int f87389V;

    /* renamed from: W */
    private int f87390W;

    /* renamed from: a0 */
    private int f87391a0;

    /* renamed from: b0 */
    private int f87392b0;

    /* renamed from: c0 */
    private int f87393c0;

    /* renamed from: d0 */
    private int f87394d0;

    /* renamed from: e0 */
    private int f87395e0;

    /* renamed from: f0 */
    private int f87396f0;

    /* renamed from: p */
    private final int f87397p;

    /* renamed from: q */
    private final int f87398q;

    /* renamed from: r */
    private final int f87399r;

    /* renamed from: s */
    private final int f87400s;

    /* renamed from: t */
    private Bitmap f87401t;

    /* renamed from: u */
    private Canvas f87402u;

    /* renamed from: v */
    private Paint f87403v;

    /* renamed from: w */
    private Paint f87404w;

    /* renamed from: x */
    private Rect f87405x;

    /* renamed from: y */
    private View f87406y;

    /* renamed from: z */
    private int f87407z;

    /* renamed from: com.zing.zalo.zdesign.layout.BasePopupView$a */
    /* loaded from: classes7.dex */
    public static final class C17077a {
        private C17077a() {
        }

        public /* synthetic */ C17077a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.zdesign.layout.BasePopupView$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C17078b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f87408a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f87409b;

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
            f87408a = iArr;
            int[] iArr2 = new int[EnumC25293b.values().length];
            try {
                iArr2[EnumC25293b.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC25293b.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f87409b = iArr2;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.layout.BasePopupView$c */
    /* loaded from: classes7.dex */
    public static final class C17079c extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f87410p;

        /* renamed from: q */
        final /* synthetic */ BasePopupView f87411q;

        C17079c(Runnable runnable, BasePopupView basePopupView) {
            this.f87410p = runnable;
            this.f87411q = basePopupView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            Runnable runnable = this.f87410p;
            if (runnable != null) {
                runnable.run();
            }
            this.f87411q.setShowing(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePopupView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f87397p = C27276c.m139649b(context, 2);
        this.f87398q = C27276c.m139649b(context, 8);
        this.f87399r = C27276c.m139649b(context, 12);
        this.f87400s = C27276c.m139649b(context, 16);
        this.f87403v = new Paint(1);
        this.f87405x = new Rect();
        this.f87370C = EnumC25293b.RECTANGLE;
        this.f87379L = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zing.zalo.zdesign.layout.b
            public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC17083b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BasePopupView.m91370r(BasePopupView.this);
            }
        };
        this.f87380M = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.zing.zalo.zdesign.layout.c
            public /* synthetic */ ViewTreeObserverOnScrollChangedListenerC17084c() {
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BasePopupView.m91371w(BasePopupView.this);
            }
        };
        this.f87403v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* renamed from: h */
    public static /* synthetic */ Animator m91368h(BasePopupView basePopupView, boolean z11, long j11, Runnable runnable, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                j11 = 300;
            }
            if ((i11 & 4) != 0) {
                runnable = null;
            }
            return basePopupView.m91373g(z11, j11, runnable);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAlphaAnimatorSet");
    }

    /* renamed from: l */
    private final void m91369l() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view = this.f87371D;
        AbstractC19074t.m100205c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        View view2 = this.f87371D;
        AbstractC19074t.m100205c(view2);
        int measuredWidth = view2.getMeasuredWidth();
        View view3 = this.f87371D;
        AbstractC19074t.m100205c(view3);
        int measuredHeight = view3.getMeasuredHeight();
        ImageView imageView = this.f87372E;
        if (imageView != null) {
            i11 = imageView.getMeasuredHeight();
            i12 = imageView.getMeasuredWidth();
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (this.f87406y != null) {
            EnumC25294c enumC25294c = this.f87369B;
            if (enumC25294c == null) {
                i13 = -1;
            } else {
                i13 = C17078b.f87408a[enumC25294c.ordinal()];
            }
            if (i13 != 1 && i13 != 2) {
                if (i13 == 3 || i13 == 4) {
                    if (this.f87372E == null) {
                        i12 = this.f87398q;
                    }
                    int i16 = this.f87384Q + ((this.f87386S - measuredHeight) / 2);
                    this.f87396f0 = i16;
                    if (this.f87369B == EnumC25294c.LEFT) {
                        i15 = (this.f87383P - measuredWidth) - i12;
                    } else {
                        i15 = this.f87383P + this.f87385R + i12;
                    }
                    this.f87395e0 = i15;
                    int i17 = this.f87392b0;
                    if (i16 < i17) {
                        this.f87396f0 = i17;
                    }
                    int i18 = this.f87396f0 + measuredHeight;
                    int i19 = this.f87394d0;
                    if (i18 > i19) {
                        this.f87396f0 = i19 - measuredHeight;
                    }
                    mo90735f();
                    return;
                }
                return;
            }
            if (this.f87372E == null) {
                i11 = this.f87398q;
            }
            if (this.f87369B == EnumC25294c.TOP) {
                i14 = (this.f87384Q - measuredHeight) - i11;
            } else {
                i14 = this.f87384Q + this.f87386S + i11;
            }
            this.f87396f0 = i14;
            int i21 = (((this.f87383P + (this.f87385R / 2)) - (measuredWidth / 2)) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
            this.f87395e0 = i21;
            int i22 = this.f87391a0;
            if (i21 < i22) {
                this.f87395e0 = i22;
            }
            int i23 = this.f87395e0 + measuredWidth;
            int i24 = this.f87393c0;
            if (i23 > i24) {
                this.f87395e0 = i24 - measuredWidth;
            }
            mo90735f();
        }
    }

    /* renamed from: r */
    public static final void m91370r(BasePopupView basePopupView) {
        AbstractC19074t.m100208f(basePopupView, "this$0");
        basePopupView.m91379y();
    }

    /* renamed from: w */
    public static final void m91371w(BasePopupView basePopupView) {
        AbstractC19074t.m100208f(basePopupView, "this$0");
        basePopupView.m91379y();
    }

    /* renamed from: z */
    public static final void m91372z(BasePopupView basePopupView) {
        AbstractC19074t.m100208f(basePopupView, "this$0");
        ImageView imageView = basePopupView.f87372E;
        AbstractC19074t.m100205c(imageView);
        imageView.setImageResource(basePopupView.f87373F);
    }

    /* renamed from: A */
    protected abstract void mo90725A();

    /* renamed from: B */
    protected abstract void mo90726B();

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int[] iArr;
        int dimColor;
        Drawable mutate;
        Drawable.ConstantState constantState;
        View view;
        int intrinsicWidth;
        int intrinsicHeight;
        AbstractC19074t.m100208f(canvas, "canvas");
        try {
            iArr = new int[2];
            dimColor = getDimColor();
            getLocationOnScreen(iArr);
            View view2 = this.f87406y;
            if (view2 != null) {
                int i11 = iArr[1];
                view2.getLocationOnScreen(iArr);
                iArr[1] = iArr[1] - i11;
            }
        } catch (Exception unused) {
        }
        if (dimColor == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f87404w == null) {
            Paint paint = new Paint(1);
            this.f87404w = paint;
            AbstractC19074t.m100205c(paint);
            paint.setStyle(Paint.Style.FILL);
        }
        Paint paint2 = this.f87404w;
        AbstractC19074t.m100205c(paint2);
        paint2.setColor(dimColor);
        EnumC25293b enumC25293b = this.f87370C;
        Drawable drawable = null;
        if (enumC25293b != EnumC25293b.RECTANGLE && enumC25293b != EnumC25293b.CIRCLE) {
            canvas.drawColor(dimColor);
            Drawable drawable2 = this.f87368A;
            if (drawable2 != null) {
                drawable = drawable2;
            } else {
                View view3 = this.f87406y;
                if (view3 instanceof ImageView) {
                    AbstractC19074t.m100206d(view3, "null cannot be cast to non-null type android.widget.ImageView");
                    Drawable drawable3 = ((ImageView) view3).getDrawable();
                    if (drawable3 == null) {
                        View view4 = this.f87406y;
                        AbstractC19074t.m100206d(view4, "null cannot be cast to non-null type android.widget.ImageView");
                        drawable3 = ((ImageView) view4).getBackground();
                    }
                    if (drawable3 != null && (mutate = drawable3.mutate()) != null && (constantState = mutate.getConstantState()) != null) {
                        drawable = constantState.newDrawable();
                    }
                }
            }
            if (drawable != null && (view = this.f87406y) != null) {
                int i12 = iArr[0];
                AbstractC19074t.m100205c(view);
                int width = i12 + (view.getWidth() / 2);
                int i13 = iArr[1];
                View view5 = this.f87406y;
                AbstractC19074t.m100205c(view5);
                int height = i13 + (view5.getHeight() / 2);
                if (drawable.getIntrinsicWidth() == -1) {
                    View view6 = this.f87406y;
                    AbstractC19074t.m100205c(view6);
                    intrinsicWidth = view6.getWidth();
                } else {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                if (drawable.getIntrinsicHeight() == -1) {
                    View view7 = this.f87406y;
                    AbstractC19074t.m100205c(view7);
                    intrinsicHeight = view7.getHeight();
                } else {
                    intrinsicHeight = drawable.getIntrinsicHeight();
                }
                drawable.setBounds(width - (intrinsicWidth / 2), height - (intrinsicHeight / 2), width + (intrinsicWidth / 2), height + (intrinsicHeight / 2));
                drawable.draw(canvas);
            }
            super.dispatchDraw(canvas);
        }
        Rect rect = this.f87405x;
        RectF rectF = new RectF(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f87402u == null) {
            if (this.f87401t == null) {
                this.f87401t = Bitmap.createBitmap((int) Math.ceil(rectF.width()), (int) Math.ceil(rectF.height()), Bitmap.Config.ARGB_4444);
            }
            Bitmap bitmap = this.f87401t;
            AbstractC19074t.m100205c(bitmap);
            Canvas canvas2 = new Canvas(bitmap);
            this.f87402u = canvas2;
            AbstractC19074t.m100205c(canvas2);
            canvas2.drawColor(dimColor);
            int i14 = C17078b.f87409b[this.f87370C.ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    AbstractC19074t.m100205c(this.f87402u);
                    AbstractC19074t.m100205c(this.f87402u);
                    float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                    Canvas canvas3 = this.f87402u;
                    AbstractC19074t.m100205c(canvas3);
                    canvas3.drawCircle(r1.getWidth() / 2.0f, r3.getHeight() / 2.0f, min, this.f87403v);
                }
            } else {
                Canvas canvas4 = this.f87402u;
                AbstractC19074t.m100205c(canvas4);
                float width2 = canvas4.getWidth();
                AbstractC19074t.m100205c(this.f87402u);
                RectF rectF2 = new RectF(0.0f, 0.0f, width2, r3.getHeight());
                Canvas canvas5 = this.f87402u;
                AbstractC19074t.m100205c(canvas5);
                int i15 = this.f87407z;
                canvas5.drawRoundRect(rectF2, i15, i15, this.f87403v);
            }
        }
        Bitmap bitmap2 = this.f87401t;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, rectF.left, rectF.top, (Paint) null);
        }
        float width3 = canvas.getWidth();
        float f11 = rectF.top;
        Paint paint3 = this.f87404w;
        AbstractC19074t.m100205c(paint3);
        canvas.drawRect(0.0f, 0.0f, width3, f11, paint3);
        float f12 = rectF.bottom;
        float width4 = canvas.getWidth();
        float height2 = canvas.getHeight();
        Paint paint4 = this.f87404w;
        AbstractC19074t.m100205c(paint4);
        canvas.drawRect(0.0f, f12, width4, height2, paint4);
        float f13 = rectF.top;
        float f14 = rectF.left;
        float f15 = rectF.bottom;
        Paint paint5 = this.f87404w;
        AbstractC19074t.m100205c(paint5);
        canvas.drawRect(0.0f, f13, f14, f15, paint5);
        float f16 = rectF.right;
        float f17 = rectF.top;
        float width5 = canvas.getWidth();
        float f18 = rectF.bottom;
        Paint paint6 = this.f87404w;
        AbstractC19074t.m100205c(paint6);
        canvas.drawRect(f16, f17, width5, f18, paint6);
        super.dispatchDraw(canvas);
    }

    /* renamed from: f */
    protected abstract void mo90735f();

    /* renamed from: g */
    protected final Animator m91373g(boolean z11, long j11, Runnable runnable) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z11) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<BasePopupView, Float>) View.ALPHA, 0.0f, 1.0f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<BasePopupView, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        animatorSet.setDuration(j11);
        animatorSet.addListener(new C17079c(runnable, this));
        this.f87375H = z11;
        return animatorSet;
    }

    public final ImageView getArrowView() {
        return this.f87372E;
    }

    protected final int getArrowViewResId() {
        return this.f87373F;
    }

    protected final int getBottomSpaceValid() {
        return this.f87390W;
    }

    public final int getChildLeft() {
        return this.f87395e0;
    }

    public final int getChildTop() {
        return this.f87396f0;
    }

    protected final Paint getClearPaint() {
        return this.f87403v;
    }

    protected final EnumC25293b getClearTargetShape() {
        return this.f87370C;
    }

    protected final Paint getDimBackgroundPaint() {
        return this.f87404w;
    }

    protected abstract int getDimColor();

    protected final int getLeftSpaceValid() {
        return this.f87387T;
    }

    public final boolean getMDismissed() {
        return this.f87378K;
    }

    public final long getMStartShowingTime() {
        return this.f87376I;
    }

    public final int getMTotalShowingTime() {
        return this.f87377J;
    }

    public final View getMainPopupView() {
        return this.f87371D;
    }

    protected final int getNoOfChild() {
        return this.f87382O;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener getOnGlobalLayoutListener() {
        return this.f87379L;
    }

    public final ViewTreeObserver.OnScrollChangedListener getOnScrollChangedListener() {
        return this.f87380M;
    }

    public final EnumC25294c getOverlayPlace() {
        return this.f87369B;
    }

    public final int getPadding12() {
        return this.f87399r;
    }

    public final int getPadding16() {
        return this.f87400s;
    }

    public final int getPadding2() {
        return this.f87397p;
    }

    public final int getPadding8() {
        return this.f87398q;
    }

    protected final int getRightSpaceValid() {
        return this.f87389V;
    }

    public final int getSafeAreaBottom() {
        return this.f87394d0;
    }

    public final int getSafeAreaLeft() {
        return this.f87391a0;
    }

    public final int getSafeAreaRight() {
        return this.f87393c0;
    }

    public final int getSafeAreaTop() {
        return this.f87392b0;
    }

    public final Animator getShowHideAlphaAnimator() {
        return this.f87374G;
    }

    public final int getStatusBarHeight() {
        C27279f c27279f = C27279f.f128337a;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        return c27279f.m139652b(context, C27279f.a.STATUS_BAR_HEIGHT);
    }

    protected final Drawable getTargetIcon() {
        return this.f87368A;
    }

    protected final int getTargetRounded() {
        return this.f87407z;
    }

    public final View getTargetView() {
        return this.f87406y;
    }

    public final int getTargetViewHeight() {
        return this.f87386S;
    }

    public final int getTargetViewLeft() {
        return this.f87383P;
    }

    public final Rect getTargetViewRect() {
        return this.f87405x;
    }

    public final int getTargetViewTop() {
        return this.f87384Q;
    }

    public final int getTargetViewWidth() {
        return this.f87385R;
    }

    protected final int getTopSpaceValid() {
        return this.f87388U;
    }

    protected final C25808b getTrackingViewHolder() {
        return this.f87381N;
    }

    protected final Bitmap getViewBitmap() {
        return this.f87401t;
    }

    protected final Canvas getViewCanvas() {
        return this.f87402u;
    }

    /* renamed from: i */
    protected View mo91184i(int i11) {
        View childAt = super.getChildAt(i11);
        AbstractC19074t.m100207e(childAt, "super.getChildAt(index)");
        return childAt;
    }

    /* renamed from: j */
    public void mo90736j(int i11, int i12, int i13) {
        int max = Math.max(i11, i12);
        if (max == i11) {
            this.f87369B = EnumC25294c.TOP;
        } else if (max == i12) {
            this.f87369B = EnumC25294c.BOTTOM;
        }
    }

    /* renamed from: k */
    protected abstract void mo90737k();

    /* renamed from: m */
    public final void m91374m() {
        int i11;
        C24848g0 c24848g0;
        int i12;
        View view = this.f87371D;
        int i13 = 0;
        if (view != null) {
            i11 = view.getHeight();
        } else {
            i11 = 0;
        }
        View view2 = this.f87371D;
        if (view2 != null) {
            i13 = view2.getWidth();
        }
        EnumC25294c enumC25294c = this.f87369B;
        if (enumC25294c != null) {
            if (enumC25294c == null) {
                i12 = -1;
            } else {
                i12 = C17078b.f87408a[enumC25294c.ordinal()];
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4 && (1 > i13 || i13 >= this.f87389V)) {
                            this.f87369B = EnumC25294c.LEFT;
                            if (1 > i13 || i13 >= this.f87387T) {
                                mo90736j(this.f87388U, this.f87390W, i11);
                            }
                        }
                    } else if (1 > i13 || i13 >= this.f87387T) {
                        this.f87369B = EnumC25294c.RIGHT;
                        if (1 > i13 || i13 >= this.f87389V) {
                            mo90736j(this.f87388U, this.f87390W, i11);
                        }
                    }
                } else if (1 > i11 || i11 >= this.f87390W) {
                    mo90736j(this.f87388U, this.f87390W, i11);
                }
            } else if (1 > i11 || i11 >= this.f87388U) {
                mo90736j(this.f87388U, this.f87390W, i11);
            }
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            mo90736j(this.f87388U, this.f87390W, i11);
        }
    }

    /* renamed from: n */
    public final boolean m91375n() {
        return this.f87375H;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View view = this.f87406y;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f87379L);
            viewTreeObserver.addOnScrollChangedListener(this.f87380M);
        }
        this.f87377J = 0;
        mo90740x();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i11 = configuration.orientation;
        if (i11 == 2 || i11 == 1) {
            this.f87402u = null;
            Bitmap bitmap = this.f87401t;
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                this.f87401t = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f87402u = null;
        Bitmap bitmap = this.f87401t;
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            this.f87401t = null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "ev");
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        m91379y();
    }

    /* renamed from: p */
    public final boolean m91376p() {
        return mo90738q();
    }

    /* renamed from: q */
    protected abstract boolean mo90738q();

    /* renamed from: s */
    protected abstract void mo90739s();

    public final void setArrowView(ImageView imageView) {
        this.f87372E = imageView;
    }

    public final void setArrowViewResId(int i11) {
        this.f87373F = i11;
    }

    public final void setBottomSpaceValid(int i11) {
        this.f87390W = i11;
    }

    public final void setChildLeft(int i11) {
        this.f87395e0 = i11;
    }

    public final void setChildTop(int i11) {
        this.f87396f0 = i11;
    }

    protected final void setClearPaint(Paint paint) {
        AbstractC19074t.m100208f(paint, "<set-?>");
        this.f87403v = paint;
    }

    public final void setClearTargetShape(EnumC25293b enumC25293b) {
        AbstractC19074t.m100208f(enumC25293b, "<set-?>");
        this.f87370C = enumC25293b;
    }

    protected final void setDimBackgroundPaint(Paint paint) {
        this.f87404w = paint;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f87381N;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    public final void setLeftSpaceValid(int i11) {
        this.f87387T = i11;
    }

    public final void setMDismissed(boolean z11) {
        this.f87378K = z11;
    }

    public final void setMStartShowingTime(long j11) {
        this.f87376I = j11;
    }

    public final void setMTotalShowingTime(int i11) {
        this.f87377J = i11;
    }

    public final void setMainPopupView(View view) {
        this.f87371D = view;
    }

    public final void setNoOfChild(int i11) {
        this.f87382O = i11;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f87381N;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    protected final void setOnGlobalLayoutListener(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        AbstractC19074t.m100208f(onGlobalLayoutListener, "<set-?>");
        this.f87379L = onGlobalLayoutListener;
    }

    protected final void setOnScrollChangedListener(ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        AbstractC19074t.m100208f(onScrollChangedListener, "<set-?>");
        this.f87380M = onScrollChangedListener;
    }

    public final void setOverlayPlace(EnumC25294c enumC25294c) {
        this.f87369B = enumC25294c;
    }

    public final void setRightSpaceValid(int i11) {
        this.f87389V = i11;
    }

    public final void setSafeAreaBottom(int i11) {
        this.f87394d0 = i11;
    }

    public final void setSafeAreaLeft(int i11) {
        this.f87391a0 = i11;
    }

    public final void setSafeAreaRight(int i11) {
        this.f87393c0 = i11;
    }

    public final void setSafeAreaTop(int i11) {
        this.f87392b0 = i11;
    }

    public final void setShowHideAlphaAnimator(Animator animator) {
        this.f87374G = animator;
    }

    public final void setShowing(boolean z11) {
        this.f87375H = z11;
    }

    public final void setTargetIcon(Drawable drawable) {
        this.f87368A = drawable;
    }

    public final void setTargetRounded(int i11) {
        this.f87407z = i11;
    }

    public final void setTargetView(View view) {
        this.f87406y = view;
    }

    public final void setTargetViewHeight(int i11) {
        this.f87386S = i11;
    }

    public final void setTargetViewLeft(int i11) {
        this.f87383P = i11;
    }

    protected final void setTargetViewRect(Rect rect) {
        AbstractC19074t.m100208f(rect, "<set-?>");
        this.f87405x = rect;
    }

    public final void setTargetViewTop(int i11) {
        this.f87384Q = i11;
    }

    public final void setTargetViewWidth(int i11) {
        this.f87385R = i11;
    }

    public final void setTopSpaceValid(int i11) {
        this.f87388U = i11;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f87381N;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    public final void setTrackingViewHolder(C25808b c25808b) {
        this.f87381N = c25808b;
    }

    protected final void setViewBitmap(Bitmap bitmap) {
        this.f87401t = bitmap;
    }

    protected final void setViewCanvas(Canvas canvas) {
        this.f87402u = canvas;
    }

    /* renamed from: u */
    public void m91377u() {
        mo90739s();
    }

    /* renamed from: v */
    public void m91378v() {
        mo90740x();
    }

    /* renamed from: x */
    protected abstract void mo90740x();

    /* renamed from: y */
    public final void m91379y() {
        try {
            mo90726B();
            Animator animator = this.f87374G;
            if (animator != null) {
                AbstractC19074t.m100205c(animator);
                if (animator.isRunning() && !this.f87375H) {
                    return;
                }
            }
            mo90725A();
            m91374m();
            int i11 = this.f87382O;
            for (int i12 = 0; i12 < i11; i12++) {
                View mo91184i = mo91184i(i12);
                if (mo91184i.getVisibility() != 8) {
                    this.f87395e0 = 0;
                    this.f87396f0 = 0;
                    if (AbstractC19074t.m100204b(mo91184i, this.f87372E)) {
                        mo90737k();
                    } else if (AbstractC19074t.m100204b(mo91184i, this.f87371D)) {
                        m91369l();
                    }
                    if (this.f87372E != null) {
                        post(new Runnable() { // from class: com.zing.zalo.zdesign.layout.a
                            public /* synthetic */ RunnableC17082a() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                BasePopupView.m91372z(BasePopupView.this);
                            }
                        });
                    }
                    mo91184i.setTranslationX(this.f87395e0);
                    mo91184i.setTranslationY(this.f87396f0);
                }
            }
            EnumC25293b enumC25293b = this.f87370C;
            if (enumC25293b == EnumC25293b.CIRCLE || enumC25293b == EnumC25293b.RECTANGLE) {
                invalidate();
            }
        } catch (Exception unused) {
        }
    }
}
