package zm.voip.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.core.view.C1547f0;
import p500s1.C26088c;
import zm.voip.widgets.GestureRightLayout;

/* loaded from: classes7.dex */
public class GestureRightLayout extends FrameLayout {

    /* renamed from: A */
    private InterfaceC32493b f150020A;

    /* renamed from: B */
    private MotionEvent f150021B;

    /* renamed from: C */
    public PointF f150022C;

    /* renamed from: D */
    Animator f150023D;

    /* renamed from: E */
    final int[] f150024E;

    /* renamed from: F */
    private int f150025F;

    /* renamed from: G */
    private boolean f150026G;

    /* renamed from: p */
    final C1547f0 f150027p;

    /* renamed from: q */
    private final int f150028q;

    /* renamed from: r */
    private int f150029r;

    /* renamed from: s */
    private int f150030s;

    /* renamed from: t */
    private float f150031t;

    /* renamed from: u */
    private boolean f150032u;

    /* renamed from: v */
    private boolean f150033v;

    /* renamed from: w */
    private boolean f150034w;

    /* renamed from: x */
    private boolean f150035x;

    /* renamed from: y */
    private boolean f150036y;

    /* renamed from: z */
    private int f150037z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.widgets.GestureRightLayout$a */
    /* loaded from: classes7.dex */
    public class C32492a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f150038p;

        C32492a(boolean z11) {
            this.f150038p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            GestureRightLayout.this.f150023D = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (GestureRightLayout.this.f150020A != null) {
                GestureRightLayout.this.f150020A.mo142946a(this.f150038p);
            }
        }
    }

    /* renamed from: zm.voip.widgets.GestureRightLayout$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC32493b {
        /* renamed from: a */
        void mo142946a(boolean z11);
    }

    public GestureRightLayout(Context context) {
        super(context);
        this.f150031t = 0.0f;
        this.f150032u = false;
        this.f150033v = false;
        this.f150034w = false;
        this.f150037z = 0;
        this.f150023D = null;
        this.f150024E = new int[2];
        this.f150028q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f150027p = new C1547f0(this);
    }

    /* renamed from: c */
    private void m157362c(MotionEvent motionEvent, MotionEvent... motionEventArr) {
        if (motionEvent == null) {
            return;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                childAt.getHitRect(new Rect());
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                float f11 = -childAt.getLeft();
                float f12 = -childAt.getTop();
                boolean z11 = false;
                if (motionEventArr != null) {
                    boolean z12 = false;
                    for (MotionEvent motionEvent2 : motionEventArr) {
                        if (motionEvent2 != null) {
                            MotionEvent obtainNoHistory2 = MotionEvent.obtainNoHistory(motionEvent2);
                            obtainNoHistory2.offsetLocation(f11, f12);
                            z12 |= childAt.dispatchTouchEvent(obtainNoHistory2);
                        }
                    }
                    z11 = z12;
                }
                obtainNoHistory.offsetLocation(f11, f12);
                if ((childAt.dispatchTouchEvent(obtainNoHistory) | z11) != 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m157363e(float f11, float f12, ValueAnimator valueAnimator) {
        setPosition(f11 + ((f12 - f11) * valueAnimator.getAnimatedFraction()));
    }

    /* renamed from: f */
    private MotionEvent m157364f(MotionEvent motionEvent, int i11) {
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        obtainNoHistory.setAction(i11);
        return obtainNoHistory;
    }

    /* renamed from: g */
    private void m157365g(MotionEvent motionEvent) {
        if (this.f150035x) {
            this.f150035x = false;
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(this.f150021B);
            obtainNoHistory.setLocation(motionEvent.getX(), motionEvent.getY());
            m157362c(motionEvent, obtainNoHistory);
            return;
        }
        m157362c(motionEvent, new MotionEvent[0]);
    }

    /* renamed from: d */
    public boolean m157366d() {
        return this.f150036y;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f150027p.m7761a();
    }

    public float getPosition() {
        return getTranslationX();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f150030s = getMeasuredWidth() - this.f150025F;
        if (this.f150026G || this.f150037z != getMeasuredWidth()) {
            setMinimized(this.f150036y);
            this.f150037z = getMeasuredWidth();
            this.f150026G = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        dispatchNestedScroll(i11, i12, i13, i14, this.f150024E);
        int i15 = i13 + this.f150024E[0];
        if (i15 < 0) {
            setPosition(getPosition() - i15);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f150027p.m7762b(view, view2, i11);
        startNestedScroll(i11 & 1);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        if (isEnabled() && (i11 & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f150027p.m7764d(view);
        stopNestedScroll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:            if (r0 != 3) goto L35;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f150022C == null) {
                        this.f150022C = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
                    }
                    if (Math.abs(motionEvent.getRawX() - this.f150031t) >= this.f150028q) {
                        if (motionEvent.getRawX() - this.f150031t > 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f150034w = z11;
                    }
                    if (getPosition() == this.f150029r) {
                        m157365g(motionEvent);
                    } else if (Math.abs(motionEvent.getRawX() - this.f150022C.x) >= this.f150028q) {
                        setPosition(getPosition() + (motionEvent.getRawX() - this.f150031t));
                    } else if (getPosition() == this.f150030s) {
                        m157365g(motionEvent);
                    }
                    if (this.f150032u) {
                        m157362c(m157364f(motionEvent, 3), new MotionEvent[0]);
                        if (getPosition() == this.f150029r) {
                            this.f150033v = true;
                            this.f150032u = false;
                            this.f150021B = m157364f(motionEvent, 0);
                            this.f150035x = true;
                        }
                    }
                    this.f150031t = motionEvent.getRawX();
                }
                return super.onTouchEvent(motionEvent);
            }
            if (Math.abs(motionEvent.getRawX() - this.f150022C.x) > this.f150028q) {
                setMinimizedWithAnimation(this.f150034w);
            }
            if ((getPosition() != this.f150029r && getPosition() != this.f150030s) || this.f150032u) {
                m157362c(m157364f(motionEvent, 3), new MotionEvent[0]);
                return true;
            }
            if (getPosition() == this.f150029r || getPosition() == this.f150030s) {
                if (this.f150033v && !this.f150032u) {
                    m157362c(m157364f(motionEvent, 3), new MotionEvent[0]);
                } else {
                    m157365g(motionEvent);
                }
            }
            this.f150033v = false;
            return true;
        }
        this.f150021B = MotionEvent.obtainNoHistory(motionEvent);
        this.f150035x = true;
        this.f150031t = motionEvent.getRawX();
        this.f150032u = false;
        this.f150022C = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        return true;
    }

    public void setGestureListener(InterfaceC32493b interfaceC32493b) {
        this.f150020A = interfaceC32493b;
    }

    public void setMaxPosition(int i11) {
        this.f150025F = i11;
        this.f150026G = true;
    }

    public void setMinPosition(int i11) {
        this.f150029r = i11;
    }

    public void setMinimized(boolean z11) {
        int i11;
        if (z11) {
            i11 = this.f150030s;
        } else {
            i11 = this.f150029r;
        }
        setPosition(i11);
        this.f150036y = z11;
        InterfaceC32493b interfaceC32493b = this.f150020A;
        if (interfaceC32493b != null) {
            interfaceC32493b.mo142946a(z11);
        }
    }

    public void setMinimizedWithAnimation(boolean z11) {
        int i11;
        this.f150036y = z11;
        Animator animator = this.f150023D;
        if (animator != null) {
            animator.cancel();
        }
        final float position = getPosition();
        if (z11) {
            i11 = this.f150030s;
        } else {
            i11 = this.f150029r;
        }
        final float f11 = i11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ep0.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GestureRightLayout.this.m157363e(position, f11, valueAnimator);
            }
        });
        ofFloat.addListener(new C32492a(z11));
        ofFloat.setInterpolator(new C26088c());
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.f150023D = ofFloat;
    }

    public void setPosition(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (getPosition() != f11) {
            this.f150032u = true;
            setTranslationX(f11);
        }
    }

    public GestureRightLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150031t = 0.0f;
        this.f150032u = false;
        this.f150033v = false;
        this.f150034w = false;
        this.f150037z = 0;
        this.f150023D = null;
        this.f150024E = new int[2];
        this.f150028q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f150027p = new C1547f0(this);
    }
}
