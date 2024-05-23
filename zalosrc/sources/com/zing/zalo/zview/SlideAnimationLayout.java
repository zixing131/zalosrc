package com.zing.zalo.zview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.zview.SlideAnimationLayout;
import zl0.AbstractC32226c;
import zl0.AbstractC32227d;
import zl0.AbstractC32232i;
import zl0.AbstractC32235l;

/* loaded from: classes.dex */
public class SlideAnimationLayout extends FrameLayout {

    /* renamed from: L */
    private static final String f88687L = "SlideAnimationLayout";

    /* renamed from: A */
    private final Paint f88688A;

    /* renamed from: B */
    private final Drawable f88689B;

    /* renamed from: C */
    private final int f88690C;

    /* renamed from: D */
    private boolean f88691D;

    /* renamed from: E */
    private boolean f88692E;

    /* renamed from: F */
    private C17487o0 f88693F;

    /* renamed from: G */
    InterfaceC17409d f88694G;

    /* renamed from: H */
    Runnable f88695H;

    /* renamed from: I */
    private int f88696I;

    /* renamed from: J */
    private final Rect f88697J;

    /* renamed from: K */
    boolean f88698K;

    /* renamed from: p */
    private String f88699p;

    /* renamed from: q */
    private C17410e f88700q;

    /* renamed from: r */
    private boolean f88701r;

    /* renamed from: s */
    protected boolean f88702s;

    /* renamed from: t */
    private int f88703t;

    /* renamed from: u */
    private int f88704u;

    /* renamed from: v */
    protected boolean f88705v;

    /* renamed from: w */
    private VelocityTracker f88706w;

    /* renamed from: x */
    private boolean f88707x;

    /* renamed from: y */
    private int f88708y;

    /* renamed from: z */
    private float f88709z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zview.SlideAnimationLayout$a */
    /* loaded from: classes.dex */
    public class RunnableC17406a implements Runnable {
        RunnableC17406a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SlideAnimationLayout.this.setInnerTranslationX(0.0f);
            SlideAnimationLayout slideAnimationLayout = SlideAnimationLayout.this;
            slideAnimationLayout.f88702s = false;
            slideAnimationLayout.f88705v = false;
        }
    }

    /* renamed from: com.zing.zalo.zview.SlideAnimationLayout$b */
    /* loaded from: classes7.dex */
    public class C17407b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f88711p;

        C17407b(boolean z11) {
            this.f88711p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            InterfaceC17409d interfaceC17409d = SlideAnimationLayout.this.f88694G;
            if (interfaceC17409d != null) {
                interfaceC17409d.mo59740N7(this.f88711p);
            }
            SlideAnimationLayout slideAnimationLayout = SlideAnimationLayout.this;
            slideAnimationLayout.postDelayed(slideAnimationLayout.f88695H, 100L);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            InterfaceC17409d interfaceC17409d = SlideAnimationLayout.this.f88694G;
            if (interfaceC17409d != null) {
                interfaceC17409d.mo59740N7(this.f88711p);
            }
            SlideAnimationLayout slideAnimationLayout = SlideAnimationLayout.this;
            slideAnimationLayout.postDelayed(slideAnimationLayout.f88695H, 100L);
        }
    }

    /* renamed from: com.zing.zalo.zview.SlideAnimationLayout$c */
    /* loaded from: classes7.dex */
    public class C17408c extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f88713p;

        C17408c(View view) {
            this.f88713p = view;
        }

        /* renamed from: b */
        public /* synthetic */ void m92613b(View view) {
            SlideAnimationLayout.this.setInnerTranslationX(0.0f);
            SlideAnimationLayout slideAnimationLayout = SlideAnimationLayout.this;
            slideAnimationLayout.f88702s = false;
            slideAnimationLayout.f88705v = false;
            if (view != null) {
                AbstractC1579n0.m7854a1(view, 0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            InterfaceC17409d interfaceC17409d = SlideAnimationLayout.this.f88694G;
            if (interfaceC17409d != null) {
                interfaceC17409d.mo59740N7(false);
            }
            SlideAnimationLayout.this.postDelayed(new Runnable() { // from class: com.zing.zalo.zview.j

                /* renamed from: q */
                public final /* synthetic */ View f89072q;

                public /* synthetic */ RunnableC17476j(View view) {
                    r2 = view;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SlideAnimationLayout.C17408c.this.m92613b(r2);
                }
            }, 100L);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            InterfaceC17409d interfaceC17409d = SlideAnimationLayout.this.f88694G;
            if (interfaceC17409d != null) {
                interfaceC17409d.mo59740N7(false);
            }
            SlideAnimationLayout slideAnimationLayout = SlideAnimationLayout.this;
            slideAnimationLayout.postDelayed(slideAnimationLayout.f88695H, 100L);
        }
    }

    /* renamed from: com.zing.zalo.zview.SlideAnimationLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC17409d {
        /* renamed from: KB */
        void mo73053KB();

        /* renamed from: Li */
        boolean mo37488Li();

        /* renamed from: N7 */
        void mo59740N7(boolean z11);

        /* renamed from: Ps */
        void mo62806Ps();

        /* renamed from: Tf */
        View mo62809Tf();

        /* renamed from: qG */
        View mo62819qG();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zview.SlideAnimationLayout$e */
    /* loaded from: classes7.dex */
    public static class C17410e {

        /* renamed from: a */
        boolean f88715a;

        /* renamed from: b */
        boolean f88716b;

        /* renamed from: c */
        VelocityTracker f88717c;

        C17410e(VelocityTracker velocityTracker, boolean z11, boolean z12) {
            this.f88717c = velocityTracker;
            this.f88715a = z11;
            this.f88716b = z12;
        }

        /* renamed from: a */
        public void m92614a() {
            VelocityTracker velocityTracker = this.f88717c;
            if (velocityTracker != null) {
                velocityTracker.clear();
                this.f88717c = null;
            }
        }
    }

    public SlideAnimationLayout(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private boolean m92606c(int i11, int i12) {
        if (i11 < getLeft() + this.f88690C) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static /* synthetic */ void m92607d(View view) {
    }

    /* renamed from: e */
    private void m92608e() {
        boolean z11;
        try {
            int keyboardHeight = getKeyboardHeight();
            if (keyboardHeight > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (keyboardHeight == this.f88696I) {
                if (!this.f88698K) {
                }
                if (!this.f88698K && !z11) {
                    this.f88698K = false;
                    return;
                }
            }
            if (z11) {
                this.f88698K = true;
                this.f88696I = keyboardHeight;
                return;
            }
            if (!this.f88698K) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    private void m92609f(MotionEvent motionEvent) {
        this.f88701r = false;
        this.f88702s = true;
        this.f88703t = (int) motionEvent.getX();
        this.f88707x = false;
        InterfaceC17409d interfaceC17409d = this.f88694G;
        if (interfaceC17409d != null) {
            interfaceC17409d.mo62806Ps();
        }
    }

    /* renamed from: g */
    public static ViewGroup m92610g(View view, C17487o0 c17487o0) {
        SlideAnimationLayout slideAnimationLayout = new SlideAnimationLayout(view.getContext());
        slideAnimationLayout.f88693F = c17487o0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            slideAnimationLayout.setLayoutParams(layoutParams);
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        slideAnimationLayout.addView(view);
        if (!c17487o0.f89119m) {
            AbstractC32232i.m155463k(slideAnimationLayout, true);
        }
        return slideAnimationLayout;
    }

    private int getKeyboardHeight() {
        int i11;
        View rootView = getRootView();
        getWindowVisibleDisplayFrame(this.f88697J);
        int identifier = getContext().getResources().getIdentifier("android", "dimen", "status_bar_height");
        int i12 = 0;
        if (identifier > 0) {
            i11 = getContext().getResources().getDimensionPixelSize(identifier);
        } else {
            i11 = 0;
        }
        Rect m155410i = AbstractC32226c.m155410i(rootView);
        int height = rootView.getHeight();
        Rect rect = this.f88697J;
        int i13 = rect.top;
        if (i13 != 0) {
            i12 = i11;
        }
        return ((height - i12) - m155410i.bottom) - (rect.bottom - i13);
    }

    /* renamed from: b */
    public void m92611b() {
        InterfaceC17409d interfaceC17409d;
        if (this.f88702s && (interfaceC17409d = this.f88694G) != null) {
            View mo62819qG = interfaceC17409d.mo62819qG();
            float m7844W = AbstractC1579n0.m7844W(mo62819qG);
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = mo62819qG.getMeasuredWidth() - m7844W;
            animatorSet.playTogether(ObjectAnimator.ofFloat(mo62819qG, "translationX", mo62819qG.getMeasuredWidth()), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f88709z, mo62819qG.getMeasuredWidth()));
            animatorSet.setDuration(Math.max((int) ((200.0f / mo62819qG.getMeasuredWidth()) * measuredWidth), 50));
            animatorSet.addListener(new C17408c(mo62819qG));
            animatorSet.start();
            this.f88705v = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            C17410e c17410e = this.f88700q;
            if (c17410e != null) {
                c17410e.m92614a();
                this.f88700q = null;
            }
            this.f88701r = false;
            this.f88702s = false;
            VelocityTracker velocityTracker = this.f88706w;
            if (velocityTracker != null) {
                velocityTracker.clear();
                this.f88706w = null;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        if (this.f88694G != null) {
            float f11 = 0.0f;
            if (this.f88709z != 0.0f) {
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int paddingRight = ((int) this.f88709z) + getPaddingRight();
                int paddingLeft = getPaddingLeft() + width;
                int save = canvas.save();
                if (!this.f88705v && paddingRight != 0 && paddingLeft != 0) {
                    canvas.clipRect(paddingRight, 0, paddingLeft, getHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j11);
                canvas.restoreToCount(save);
                if (paddingRight != 0) {
                    float f12 = width - paddingRight;
                    float max = Math.max(0.0f, Math.min(f12 / AbstractC32232i.m155453a(20.0f), 1.0f));
                    Drawable drawable = this.f88689B;
                    drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom());
                    this.f88689B.setAlpha((int) (max * 255.0f));
                    this.f88689B.draw(canvas);
                    float min = Math.min(0.8f, f12 / width);
                    if (min >= 0.0f) {
                        f11 = min;
                    }
                    this.f88688A.setColor(((int) (f11 * 153.0f)) << 24);
                    canvas.drawRect(0.0f, 0.0f, paddingRight, getHeight(), this.f88688A);
                }
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j11);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C17487o0 c17487o0;
        String str = f88687L;
        AbstractC32227d.m155417a(str, "onInterceptTouchEvent>>> mOwnerZaloViewName= " + this.f88699p + ", animationInProgress= " + this.f88705v + ", ZaloViewAnimationUtils.isRunning= " + AbstractC32235l.m155473d());
        if (this.f88693F != null) {
            AbstractC32227d.m155417a(str, "onInterceptTouchEvent>>> isMainManager= " + this.f88693F.f89119m + ", mAddingOrRemovingView= " + this.f88693F.f89109c);
        }
        if (!this.f88705v && (((c17487o0 = this.f88693F) == null || !c17487o0.f89119m || !c17487o0.f89109c) && !AbstractC32235l.m155473d() && !onTouchEvent(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f88705v) {
                return true;
            }
            if (this.f88702s && this.f88694G != null) {
                m92611b();
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        long currentTimeMillis = System.currentTimeMillis();
        super.onLayout(z11, i11, i12, i13, i14);
        m92608e();
        long currentTimeMillis2 = System.currentTimeMillis();
        AbstractC32227d.m155417a(f88687L, "onLayout, owner ZaloView= " + this.f88699p + ", elapsedTime= " + (currentTimeMillis2 - currentTimeMillis));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        long currentTimeMillis = System.currentTimeMillis();
        super.onMeasure(i11, i12);
        long currentTimeMillis2 = System.currentTimeMillis();
        AbstractC32227d.m155417a(f88687L, "onMeasure, owner ZaloView= " + this.f88699p + ", elapsedTime= " + (currentTimeMillis2 - currentTimeMillis));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (this.f88705v || AbstractC32235l.m155473d()) {
            return false;
        }
        if (getChildCount() > 0) {
            InterfaceC17409d interfaceC17409d = this.f88694G;
            if (interfaceC17409d != null && interfaceC17409d.mo37488Li()) {
                if (this.f88694G.mo62809Tf() == null) {
                    return this.f88702s;
                }
                View mo62819qG = this.f88694G.mo62819qG();
                if (mo62819qG == null) {
                    return this.f88702s;
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f88702s && !this.f88701r) {
                    this.f88708y = motionEvent.getPointerId(0);
                    this.f88701r = true;
                    this.f88703t = (int) motionEvent.getX();
                    this.f88704u = (int) motionEvent.getY();
                    VelocityTracker velocityTracker = this.f88706w;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                    if (this.f88691D) {
                        this.f88692E = m92606c(this.f88703t, this.f88704u);
                    } else {
                        this.f88692E = false;
                    }
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f88708y) {
                    if (this.f88706w == null) {
                        this.f88706w = VelocityTracker.obtain();
                    }
                    int max = Math.max(0, (int) (motionEvent.getX() - this.f88703t));
                    int abs = Math.abs(((int) motionEvent.getY()) - this.f88704u);
                    this.f88706w.addMovement(motionEvent);
                    if (this.f88701r && !this.f88702s && max >= AbstractC32232i.m155454b(0.4f, true) && Math.abs(max) / 3 > abs) {
                        if (!this.f88691D || this.f88692E) {
                            m92609f(motionEvent);
                        }
                    } else if (this.f88702s) {
                        if (!this.f88707x) {
                            InterfaceC17409d interfaceC17409d2 = this.f88694G;
                            if (interfaceC17409d2 != null) {
                                interfaceC17409d2.mo73053KB();
                            }
                            this.f88707x = true;
                        }
                        float f11 = max;
                        AbstractC1579n0.m7854a1(mo62819qG, f11);
                        setInnerTranslationX(f11);
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f88708y && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.f88706w == null) {
                        this.f88706w = VelocityTracker.obtain();
                    }
                    this.f88706w.computeCurrentVelocity(1000);
                    if (this.f88702s) {
                        if (!this.f88707x) {
                            InterfaceC17409d interfaceC17409d3 = this.f88694G;
                            if (interfaceC17409d3 != null) {
                                interfaceC17409d3.mo73053KB();
                            }
                            this.f88707x = true;
                        }
                        float m7844W = AbstractC1579n0.m7844W(mo62819qG);
                        AnimatorSet animatorSet = new AnimatorSet();
                        float xVelocity = this.f88706w.getXVelocity();
                        float yVelocity = this.f88706w.getYVelocity();
                        if (m7844W < mo62819qG.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            m7844W = mo62819qG.getMeasuredWidth() - m7844W;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(mo62819qG, "translationX", mo62819qG.getMeasuredWidth()), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f88709z, mo62819qG.getMeasuredWidth()));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(mo62819qG, "translationX", 0.0f), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f88709z, 0.0f));
                        }
                        animatorSet.setDuration(Math.max((int) ((200.0f / mo62819qG.getMeasuredWidth()) * m7844W), 50));
                        animatorSet.addListener(new C17407b(z11));
                        animatorSet.start();
                        this.f88705v = true;
                        this.f88692E = false;
                    } else {
                        this.f88701r = false;
                        this.f88702s = false;
                    }
                    VelocityTracker velocityTracker2 = this.f88706w;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f88706w = null;
                    }
                } else if (motionEvent == null) {
                    this.f88701r = false;
                    this.f88702s = false;
                    VelocityTracker velocityTracker3 = this.f88706w;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.f88706w = null;
                    }
                }
            } else {
                this.f88701r = false;
                this.f88702s = false;
                VelocityTracker velocityTracker4 = this.f88706w;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f88706w = null;
                }
            }
        }
        return this.f88702s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (z11) {
            C17410e c17410e = this.f88700q;
            if (c17410e != null) {
                c17410e.m92614a();
            }
            this.f88700q = new C17410e(this.f88706w, this.f88701r, this.f88702s);
            this.f88702s = false;
            this.f88701r = false;
            VelocityTracker velocityTracker = this.f88706w;
            if (velocityTracker != null) {
                velocityTracker.clear();
                this.f88706w = null;
            }
        } else {
            C17410e c17410e2 = this.f88700q;
            if (c17410e2 != null) {
                this.f88706w = c17410e2.f88717c;
                this.f88701r = c17410e2.f88715a;
                this.f88702s = c17410e2.f88716b;
            }
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public void setInnerTranslationX(float f11) {
        this.f88709z = f11;
        invalidate();
    }

    public void setLeftEdgeMode(boolean z11) {
        this.f88691D = z11;
    }

    public void setOwnerZaloViewName(String str) {
        this.f88699p = str;
    }

    public void setSlidingListener(InterfaceC17409d interfaceC17409d) {
        this.f88694G = interfaceC17409d;
    }

    public SlideAnimationLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideAnimationLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f88700q = null;
        this.f88709z = 0.0f;
        this.f88691D = false;
        this.f88692E = false;
        this.f88695H = new RunnableC17406a();
        this.f88696I = 0;
        this.f88697J = new Rect();
        this.f88698K = false;
        this.f88688A = new Paint();
        this.f88689B = context.getResources().getDrawable(AbstractC17466e.layer_shadow, context.getTheme());
        this.f88690C = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zview.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlideAnimationLayout.m92607d(view);
            }
        });
    }
}
