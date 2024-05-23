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
import me0.AbstractC23136l9;
import p500s1.C26088c;
import zm.voip.widgets.GestureBottomLayout;

/* loaded from: classes7.dex */
public class GestureBottomLayout extends FrameLayout {

    /* renamed from: A */
    private int f149999A;

    /* renamed from: B */
    public PointF f150000B;

    /* renamed from: C */
    Animator f150001C;

    /* renamed from: D */
    public boolean f150002D;

    /* renamed from: E */
    private int f150003E;

    /* renamed from: F */
    private InterfaceC32491b f150004F;

    /* renamed from: G */
    final int[] f150005G;

    /* renamed from: H */
    final int[] f150006H;

    /* renamed from: p */
    final C1547f0 f150007p;

    /* renamed from: q */
    private final int f150008q;

    /* renamed from: r */
    private int f150009r;

    /* renamed from: s */
    private int f150010s;

    /* renamed from: t */
    private float f150011t;

    /* renamed from: u */
    private float f150012u;

    /* renamed from: v */
    private boolean f150013v;

    /* renamed from: w */
    private boolean f150014w;

    /* renamed from: x */
    private boolean f150015x;

    /* renamed from: y */
    private boolean f150016y;

    /* renamed from: z */
    private MotionEvent f150017z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.widgets.GestureBottomLayout$a */
    /* loaded from: classes7.dex */
    public class C32490a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ int f150018p;

        C32490a(int i11) {
            this.f150018p = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            GestureBottomLayout gestureBottomLayout = GestureBottomLayout.this;
            gestureBottomLayout.f150001C = null;
            gestureBottomLayout.f150002D = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            GestureBottomLayout gestureBottomLayout = GestureBottomLayout.this;
            gestureBottomLayout.f150002D = false;
            if (gestureBottomLayout.f150004F != null) {
                int i11 = this.f150018p;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            GestureBottomLayout.this.f150004F.mo156642b();
                            return;
                        }
                        return;
                    }
                    GestureBottomLayout.this.f150004F.mo156641a();
                    return;
                }
                GestureBottomLayout.this.f150004F.mo156643c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            GestureBottomLayout.this.f150002D = true;
        }
    }

    /* renamed from: zm.voip.widgets.GestureBottomLayout$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC32491b {
        /* renamed from: a */
        void mo156641a();

        /* renamed from: b */
        void mo156642b();

        /* renamed from: c */
        void mo156643c();
    }

    public GestureBottomLayout(Context context) {
        super(context);
        this.f150011t = 0.0f;
        this.f150012u = 0.0f;
        this.f150013v = false;
        this.f150014w = false;
        this.f150015x = false;
        this.f150001C = null;
        this.f150002D = false;
        this.f150003E = 1;
        this.f150005G = new int[2];
        this.f150006H = new int[2];
        this.f150008q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f150007p = new C1547f0(this);
    }

    /* renamed from: c */
    private boolean m157356c(MotionEvent motionEvent, MotionEvent... motionEventArr) {
        boolean z11;
        if (motionEvent == null) {
            return false;
        }
        boolean z12 = false;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                if (rect.contains((int) obtainNoHistory.getX(), (int) obtainNoHistory.getY())) {
                    float f11 = -childAt.getLeft();
                    float f12 = -childAt.getTop();
                    if (motionEventArr != null) {
                        z11 = false;
                        for (MotionEvent motionEvent2 : motionEventArr) {
                            if (motionEvent2 != null) {
                                MotionEvent obtainNoHistory2 = MotionEvent.obtainNoHistory(motionEvent2);
                                obtainNoHistory2.offsetLocation(f11, f12);
                                z11 |= childAt.dispatchTouchEvent(obtainNoHistory2);
                            }
                        }
                    } else {
                        z11 = false;
                    }
                    obtainNoHistory.offsetLocation(f11, f12);
                    z12 = childAt.dispatchTouchEvent(obtainNoHistory) | z11;
                    if (z12) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m157357d(float f11, float f12, ValueAnimator valueAnimator) {
        setTranslationY(f11 + ((f12 - f11) * valueAnimator.getAnimatedFraction()));
    }

    /* renamed from: e */
    private MotionEvent m157358e(MotionEvent motionEvent, int i11) {
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        obtainNoHistory.setAction(i11);
        return obtainNoHistory;
    }

    /* renamed from: f */
    private boolean m157359f(MotionEvent motionEvent) {
        if (this.f150016y) {
            this.f150016y = false;
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(this.f150017z);
            obtainNoHistory.setLocation(motionEvent.getX(), motionEvent.getY());
            return m157356c(motionEvent, obtainNoHistory);
        }
        return m157356c(motionEvent, new MotionEvent[0]);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f150007p.m7761a();
    }

    public float getPosition() {
        return getTranslationY();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        int[] iArr2 = this.f150005G;
        if (dispatchNestedPreScroll(i11 - iArr[0], i12 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        dispatchNestedScroll(i11, i12, i13, i14, this.f150006H);
        int i15 = i14 + this.f150006H[1];
        if (i15 < 0) {
            setPosition(getTranslationY() - i15);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f150007p.m7762b(view, view2, i11);
        startNestedScroll(i11 & 2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        if (isEnabled() && (i11 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f150007p.m7764d(view);
        stopNestedScroll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:            if (r1 != 3) goto L50;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean m157359f;
        boolean z11;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f149999A == pointerId) {
                        if (this.f150000B == null) {
                            this.f150000B = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
                        }
                        if (Math.abs(motionEvent.getRawY() - this.f150012u) >= this.f150008q) {
                            if (motionEvent.getRawY() - this.f150012u > 0.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f150015x = z11;
                        }
                        if (this.f150010s == this.f150009r) {
                            if (this.f150015x) {
                                if (Math.abs(motionEvent.getRawY() - this.f150000B.y) >= this.f150008q) {
                                    setPosition(getPosition() + (motionEvent.getRawY() - this.f150011t));
                                } else if (getPosition() == this.f150010s) {
                                    m157359f(motionEvent);
                                }
                            } else {
                                m157359f(motionEvent);
                            }
                        } else if (getPosition() == this.f150009r) {
                            m157359f(motionEvent);
                        } else if (Math.abs(motionEvent.getRawY() - this.f150000B.y) >= this.f150008q) {
                            setPosition(getPosition() + (motionEvent.getRawY() - this.f150011t));
                        } else if (getPosition() == this.f150010s) {
                            m157359f(motionEvent);
                        }
                        if (this.f150013v) {
                            m157356c(m157358e(motionEvent, 3), new MotionEvent[0]);
                            if (getPosition() == this.f150009r) {
                                this.f150014w = true;
                                this.f150013v = false;
                                this.f150017z = m157358e(motionEvent, 0);
                                this.f150016y = true;
                            }
                        }
                        this.f150011t = motionEvent.getRawY();
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
            if (this.f149999A == pointerId) {
                if ((getPosition() != this.f150009r && getPosition() != this.f150010s) || this.f150013v) {
                    if (Math.abs(motionEvent.getRawY() - this.f150000B.y) > this.f150008q) {
                        if (this.f150015x) {
                            if (this.f150003E == 1) {
                                setMinimizedWithAnimation(2);
                            } else {
                                setMinimizedWithAnimation(1);
                            }
                        } else {
                            setMinimizedWithAnimation(0);
                        }
                    }
                    m157356c(m157358e(motionEvent, 3), new MotionEvent[0]);
                    return true;
                }
                if (getPosition() == this.f150009r || getPosition() == this.f150010s) {
                    if (this.f150014w && !this.f150013v) {
                        m157359f = m157356c(m157358e(motionEvent, 3), new MotionEvent[0]);
                    } else {
                        m157359f = m157359f(motionEvent);
                    }
                    if (m157359f) {
                        this.f150014w = false;
                        return true;
                    }
                }
                if (Math.abs(motionEvent.getRawY() - this.f150000B.y) > this.f150008q) {
                    if (this.f150015x) {
                        if (this.f150003E == 1) {
                            setMinimizedWithAnimation(2);
                        } else {
                            setMinimizedWithAnimation(1);
                        }
                    } else {
                        setMinimizedWithAnimation(0);
                    }
                }
                m157356c(m157358e(motionEvent, 3), new MotionEvent[0]);
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f149999A = pointerId;
        this.f150017z = MotionEvent.obtainNoHistory(motionEvent);
        this.f150016y = true;
        this.f150011t = motionEvent.getRawY();
        this.f150012u = motionEvent.getRawY();
        this.f150013v = false;
        this.f150000B = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        return true;
    }

    public void setListener(InterfaceC32491b interfaceC32491b) {
        this.f150004F = interfaceC32491b;
    }

    public void setMaxPosition(int i11) {
        this.f150010s = i11;
    }

    public void setMinPosition(int i11) {
        this.f150009r = i11;
    }

    public void setMinimized(int i11) {
        int i12;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    i12 = 0;
                } else {
                    i12 = 1500;
                }
            } else {
                i12 = this.f150010s;
            }
        } else {
            i12 = this.f150009r;
        }
        setPosition(i12);
        this.f150003E = i11;
    }

    public void setMinimizedWithAnimation(int i11) {
        int i12;
        Animator animator = this.f150001C;
        if (animator != null) {
            animator.cancel();
        }
        final float translationY = getTranslationY();
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    i12 = 0;
                } else {
                    i12 = AbstractC23136l9.m118713h0() + AbstractC23136l9.m118742r(100.0f);
                }
            } else {
                i12 = this.f150010s;
            }
        } else {
            i12 = this.f150009r;
        }
        final float f11 = i12;
        this.f150003E = i11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ep0.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GestureBottomLayout.this.m157357d(translationY, f11, valueAnimator);
            }
        });
        ofFloat.addListener(new C32490a(i11));
        ofFloat.setInterpolator(new C26088c());
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.f150001C = ofFloat;
    }

    public void setPosition(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (getTranslationY() != f11) {
            this.f150013v = true;
            setTranslationY(f11);
        }
    }

    public GestureBottomLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150011t = 0.0f;
        this.f150012u = 0.0f;
        this.f150013v = false;
        this.f150014w = false;
        this.f150015x = false;
        this.f150001C = null;
        this.f150002D = false;
        this.f150003E = 1;
        this.f150005G = new int[2];
        this.f150006H = new int[2];
        this.f150008q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f150007p = new C1547f0(this);
    }
}
