package com.zing.zalo.p077ui.showcase;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.content.res.AbstractC1401h;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.showcase.WalkThroughOnboardView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import kd0.C21697g;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p500s1.C26087b;
import sa0.C26209i;

/* loaded from: classes6.dex */
public final class WalkThroughOnboardView extends FrameLayout {
    public static final C13299a Companion = new C13299a(null);

    /* renamed from: A */
    private Bitmap f68345A;

    /* renamed from: B */
    private Canvas f68346B;

    /* renamed from: C */
    private boolean f68347C;

    /* renamed from: D */
    private Animator f68348D;

    /* renamed from: E */
    private final ArrayList f68349E;

    /* renamed from: F */
    private int f68350F;

    /* renamed from: G */
    private RectF f68351G;

    /* renamed from: H */
    private final RectF f68352H;

    /* renamed from: I */
    private final long f68353I;

    /* renamed from: J */
    private final C26087b f68354J;

    /* renamed from: K */
    private InterfaceC13300b f68355K;

    /* renamed from: p */
    private ModulesView f68356p;

    /* renamed from: q */
    private C16716d f68357q;

    /* renamed from: r */
    private C21697g f68358r;

    /* renamed from: s */
    private C21697g f68359s;

    /* renamed from: t */
    private C21697g f68360t;

    /* renamed from: u */
    private C21697g f68361u;

    /* renamed from: v */
    private C21697g f68362v;

    /* renamed from: w */
    private Paint f68363w;

    /* renamed from: x */
    private Paint f68364x;

    /* renamed from: y */
    private int f68365y;

    /* renamed from: z */
    private float f68366z;

    /* renamed from: com.zing.zalo.ui.showcase.WalkThroughOnboardView$a */
    /* loaded from: classes6.dex */
    public static final class C13299a {
        private C13299a() {
        }

        public /* synthetic */ C13299a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.showcase.WalkThroughOnboardView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13300b {
        /* renamed from: a */
        void mo74659a(WalkThroughOnboardView walkThroughOnboardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.showcase.WalkThroughOnboardView$c */
    /* loaded from: classes6.dex */
    public static final class C13301c implements TypeEvaluator {

        /* renamed from: a */
        private RectF f68367a;

        public C13301c(RectF rectF) {
            this.f68367a = rectF;
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RectF evaluate(float f11, RectF rectF, RectF rectF2) {
            AbstractC19074t.m100208f(rectF, "startValue");
            AbstractC19074t.m100208f(rectF2, "endValue");
            float f12 = rectF.left;
            float f13 = f12 + ((rectF2.left - f12) * f11);
            float f14 = rectF.top;
            float f15 = f14 + ((rectF2.top - f14) * f11);
            float f16 = rectF.right;
            float f17 = f16 + ((rectF2.right - f16) * f11);
            float f18 = rectF.bottom;
            float f19 = f18 + ((rectF2.bottom - f18) * f11);
            RectF rectF3 = this.f68367a;
            if (rectF3 == null) {
                return new RectF(f13, f15, f17, f19);
            }
            rectF3.set(f13, f15, f17, f19);
            return rectF3;
        }
    }

    /* renamed from: com.zing.zalo.ui.showcase.WalkThroughOnboardView$e */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnPreDrawListenerC13303e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: q */
        final /* synthetic */ C13302d f68378q;

        ViewTreeObserverOnPreDrawListenerC13303e(C13302d c13302d) {
            this.f68378q = c13302d;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ModulesView modulesView = WalkThroughOnboardView.this.f68356p;
            if (modulesView == null) {
                AbstractC19074t.m100223u("tipLayout");
                modulesView = null;
            }
            modulesView.getViewTreeObserver().removeOnPreDrawListener(this);
            WalkThroughOnboardView.this.m74654m(this.f68378q);
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.showcase.WalkThroughOnboardView$f */
    /* loaded from: classes6.dex */
    public static final class C13304f extends AnimatorListenerAdapter {
        C13304f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            WalkThroughOnboardView.this.f68347C = true;
            WalkThroughOnboardView.this.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkThroughOnboardView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f68365y = Color.parseColor("#99000000");
        this.f68366z = AbstractC23222t7.f112556e;
        this.f68349E = new ArrayList();
        this.f68352H = new RectF();
        this.f68353I = 200L;
        this.f68354J = new C26087b();
        setTag("WalkThroughOnboardView");
        m74656p();
    }

    /* renamed from: i */
    private final void m74650i() {
        int i11;
        Object obj = this.f68349E.get(this.f68350F);
        AbstractC19074t.m100207e(obj, "get(...)");
        C13302d c13302d = (C13302d) obj;
        C21697g c21697g = this.f68358r;
        ModulesView modulesView = null;
        if (c21697g == null) {
            AbstractC19074t.m100223u("tvTitle");
            c21697g = null;
        }
        c21697g.m111959G1(c13302d.m74669i());
        C21697g c21697g2 = this.f68358r;
        if (c21697g2 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c21697g2 = null;
        }
        if (c13302d.m74669i().length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        c21697g2.mo44614b1(i11);
        C21697g c21697g3 = this.f68359s;
        if (c21697g3 == null) {
            AbstractC19074t.m100223u("tvDesc");
            c21697g3 = null;
        }
        c21697g3.m111959G1(c13302d.m74662b());
        this.f68366z = c13302d.m74663c();
        if (c13302d.m74664d()) {
            if (this.f68350F == this.f68349E.size() - 1) {
                C21697g c21697g4 = this.f68360t;
                if (c21697g4 == null) {
                    AbstractC19074t.m100223u("btnCta");
                    c21697g4 = null;
                }
                CharSequence m74661a = c13302d.m74661a();
                if (m74661a.length() == 0) {
                    m74661a = getContext().getResources().getString(AbstractC8020f0.str_saved_message_onboard_step_2_button);
                    AbstractC19074t.m100207e(m74661a, "getString(...)");
                }
                c21697g4.m111959G1(m74661a);
                C21697g c21697g5 = this.f68360t;
                if (c21697g5 == null) {
                    AbstractC19074t.m100223u("btnCta");
                    c21697g5 = null;
                }
                c21697g5.mo89109M0(new C16719g.c() { // from class: sa0.k
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        WalkThroughOnboardView.m74652k(WalkThroughOnboardView.this, c16719g);
                    }
                });
            } else {
                C21697g c21697g6 = this.f68360t;
                if (c21697g6 == null) {
                    AbstractC19074t.m100223u("btnCta");
                    c21697g6 = null;
                }
                CharSequence m74661a2 = c13302d.m74661a();
                if (m74661a2.length() == 0) {
                    m74661a2 = getContext().getResources().getString(AbstractC8020f0.str_saved_message_onboard_step_1_button);
                    AbstractC19074t.m100207e(m74661a2, "getString(...)");
                }
                c21697g6.m111959G1(m74661a2);
                C21697g c21697g7 = this.f68360t;
                if (c21697g7 == null) {
                    AbstractC19074t.m100223u("btnCta");
                    c21697g7 = null;
                }
                c21697g7.mo89109M0(new C16719g.c() { // from class: sa0.l
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        WalkThroughOnboardView.m74653l(WalkThroughOnboardView.this, c16719g);
                    }
                });
            }
            C21697g c21697g8 = this.f68360t;
            if (c21697g8 == null) {
                AbstractC19074t.m100223u("btnCta");
                c21697g8 = null;
            }
            c21697g8.mo44614b1(0);
        } else {
            C21697g c21697g9 = this.f68360t;
            if (c21697g9 == null) {
                AbstractC19074t.m100223u("btnCta");
                c21697g9 = null;
            }
            c21697g9.mo44614b1(8);
        }
        if (c13302d.m74665e() && this.f68350F < this.f68349E.size() - 1) {
            C21697g c21697g10 = this.f68361u;
            if (c21697g10 == null) {
                AbstractC19074t.m100223u("btnDismiss");
                c21697g10 = null;
            }
            c21697g10.m111959G1(getContext().getResources().getString(AbstractC8020f0.str_quit));
            C21697g c21697g11 = this.f68361u;
            if (c21697g11 == null) {
                AbstractC19074t.m100223u("btnDismiss");
                c21697g11 = null;
            }
            c21697g11.mo89109M0(new C16719g.c() { // from class: sa0.m
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    WalkThroughOnboardView.m74651j(WalkThroughOnboardView.this, c16719g);
                }
            });
            C21697g c21697g12 = this.f68361u;
            if (c21697g12 == null) {
                AbstractC19074t.m100223u("btnDismiss");
                c21697g12 = null;
            }
            c21697g12.mo44614b1(0);
        } else {
            C21697g c21697g13 = this.f68361u;
            if (c21697g13 == null) {
                AbstractC19074t.m100223u("btnDismiss");
                c21697g13 = null;
            }
            c21697g13.mo44614b1(8);
        }
        if (c13302d.m74666f()) {
            C21697g c21697g14 = this.f68362v;
            if (c21697g14 == null) {
                AbstractC19074t.m100223u("tvStep");
                c21697g14 = null;
            }
            c21697g14.m111959G1((this.f68350F + 1) + "/" + this.f68349E.size());
            C21697g c21697g15 = this.f68362v;
            if (c21697g15 == null) {
                AbstractC19074t.m100223u("tvStep");
                c21697g15 = null;
            }
            c21697g15.mo44614b1(0);
        } else {
            C21697g c21697g16 = this.f68362v;
            if (c21697g16 == null) {
                AbstractC19074t.m100223u("tvStep");
                c21697g16 = null;
            }
            c21697g16.mo44614b1(8);
        }
        ModulesView modulesView2 = this.f68356p;
        if (modulesView2 == null) {
            AbstractC19074t.m100223u("tipLayout");
            modulesView2 = null;
        }
        modulesView2.setVisibility(4);
        ModulesView modulesView3 = this.f68356p;
        if (modulesView3 == null) {
            AbstractC19074t.m100223u("tipLayout");
        } else {
            modulesView = modulesView3;
        }
        modulesView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC13303e(c13302d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m74651j(WalkThroughOnboardView walkThroughOnboardView, C16719g c16719g) {
        AbstractC19074t.m100208f(walkThroughOnboardView, "this$0");
        InterfaceC13300b interfaceC13300b = walkThroughOnboardView.f68355K;
        if (interfaceC13300b != null) {
            interfaceC13300b.mo74659a(walkThroughOnboardView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m74652k(WalkThroughOnboardView walkThroughOnboardView, C16719g c16719g) {
        AbstractC19074t.m100208f(walkThroughOnboardView, "this$0");
        InterfaceC13300b interfaceC13300b = walkThroughOnboardView.f68355K;
        if (interfaceC13300b != null) {
            interfaceC13300b.mo74659a(walkThroughOnboardView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m74653l(WalkThroughOnboardView walkThroughOnboardView, C16719g c16719g) {
        AbstractC19074t.m100208f(walkThroughOnboardView, "this$0");
        walkThroughOnboardView.m74658r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m74654m(C13302d c13302d) {
        Transition changeBounds;
        Paint paint;
        int m116580c;
        try {
            if (this.f68350F == 0) {
                changeBounds = new Fade();
            } else {
                changeBounds = new ChangeBounds();
            }
            ModulesView modulesView = this.f68356p;
            ModulesView modulesView2 = null;
            if (modulesView == null) {
                AbstractC19074t.m100223u("tipLayout");
                modulesView = null;
            }
            changeBounds.addTarget(modulesView);
            changeBounds.setDuration(this.f68353I);
            changeBounds.setInterpolator(this.f68354J);
            TransitionManager.beginDelayedTransition(this, changeBounds);
            final RectF rectF = this.f68351G;
            if (c13302d.m74668h().f124547b != null) {
                RectF rectF2 = new RectF();
                rectF2.left = c13302d.m74668h().f124547b.left;
                rectF2.top = c13302d.m74668h().f124547b.top;
                rectF2.right = c13302d.m74668h().f124547b.right;
                rectF2.bottom = c13302d.m74668h().f124547b.bottom;
                rectF2.left -= c13302d.m74668h().f124548c;
                rectF2.top -= c13302d.m74668h().f124548c;
                rectF2.right += c13302d.m74668h().f124548c;
                rectF2.bottom += c13302d.m74668h().f124548c;
                this.f68351G = rectF2;
            } else if (c13302d.m74668h().f124546a != null) {
                int[] iArr = new int[2];
                c13302d.m74668h().f124546a.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                getLocationInWindow(iArr2);
                RectF rectF3 = new RectF();
                float f11 = iArr[0] - iArr2[0];
                rectF3.left = f11;
                rectF3.top = iArr[1] - iArr2[1];
                rectF3.right = f11 + c13302d.m74668h().f124546a.getWidth();
                rectF3.bottom = rectF3.top + c13302d.m74668h().f124546a.getHeight();
                rectF3.left -= c13302d.m74668h().f124548c;
                rectF3.top -= c13302d.m74668h().f124548c;
                rectF3.right += c13302d.m74668h().f124548c;
                rectF3.bottom += c13302d.m74668h().f124548c;
                this.f68351G = rectF3;
            } else {
                this.f68351G = null;
            }
            Bitmap bitmap = this.f68345A;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f68345A = null;
            this.f68346B = null;
            this.f68347C = false;
            RectF rectF4 = this.f68351G;
            if (rectF4 != null) {
                ModulesView modulesView3 = this.f68356p;
                if (modulesView3 == null) {
                    AbstractC19074t.m100223u("tipLayout");
                    modulesView3 = null;
                }
                ViewGroup.LayoutParams layoutParams = modulesView3.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int m74667g = c13302d.m74667g();
                if (m74667g != 2) {
                    if (m74667g != 3) {
                        if (m74667g != 4) {
                            if (m74667g != 5) {
                                layoutParams2.gravity = 8388659;
                                layoutParams2.leftMargin = (int) rectF4.left;
                                layoutParams2.topMargin = ((int) rectF4.bottom) + AbstractC23222t7.f112586t;
                            } else {
                                layoutParams2.gravity = 8388659;
                                float width = rectF4.width();
                                C16716d c16716d = this.f68357q;
                                if (c16716d == null) {
                                    AbstractC19074t.m100223u("contentModule");
                                    c16716d = null;
                                }
                                if (width > c16716d.m89114P()) {
                                    int i11 = (int) rectF4.left;
                                    int width2 = (int) rectF4.width();
                                    C16716d c16716d2 = this.f68357q;
                                    if (c16716d2 == null) {
                                        AbstractC19074t.m100223u("contentModule");
                                        c16716d2 = null;
                                    }
                                    layoutParams2.leftMargin = i11 + ((width2 - c16716d2.m89114P()) / 2);
                                } else {
                                    layoutParams2.leftMargin = (int) rectF4.left;
                                }
                                layoutParams2.topMargin = ((int) rectF4.bottom) + AbstractC23222t7.f112566j;
                            }
                        } else {
                            layoutParams2.gravity = 8388659;
                            float width3 = rectF4.width();
                            C16716d c16716d3 = this.f68357q;
                            if (c16716d3 == null) {
                                AbstractC19074t.m100223u("contentModule");
                                c16716d3 = null;
                            }
                            if (width3 > c16716d3.m89114P()) {
                                int i12 = (int) rectF4.left;
                                int width4 = (int) rectF4.width();
                                C16716d c16716d4 = this.f68357q;
                                if (c16716d4 == null) {
                                    AbstractC19074t.m100223u("contentModule");
                                    c16716d4 = null;
                                }
                                layoutParams2.leftMargin = i12 + ((width4 - c16716d4.m89114P()) / 2);
                            } else {
                                layoutParams2.leftMargin = (int) rectF4.left;
                            }
                            int i13 = ((int) rectF4.top) - AbstractC23222t7.f112566j;
                            C16716d c16716d5 = this.f68357q;
                            if (c16716d5 == null) {
                                AbstractC19074t.m100223u("contentModule");
                                c16716d5 = null;
                            }
                            layoutParams2.topMargin = i13 - c16716d5.m89112O();
                        }
                    } else {
                        layoutParams2.gravity = 8388659;
                        layoutParams2.leftMargin = (int) rectF4.left;
                        int i14 = ((int) rectF4.top) - AbstractC23222t7.f112566j;
                        C16716d c16716d6 = this.f68357q;
                        if (c16716d6 == null) {
                            AbstractC19074t.m100223u("contentModule");
                            c16716d6 = null;
                        }
                        layoutParams2.topMargin = i14 - c16716d6.m89112O();
                    }
                } else {
                    layoutParams2.gravity = 49;
                    layoutParams2.topMargin = ((int) rectF4.bottom) + AbstractC23222t7.f112586t;
                }
                int i15 = layoutParams2.leftMargin;
                C16716d c16716d7 = this.f68357q;
                if (c16716d7 == null) {
                    AbstractC19074t.m100223u("contentModule");
                    c16716d7 = null;
                }
                if (i15 + c16716d7.m89114P() > getWidth()) {
                    int i16 = (int) rectF4.right;
                    C16716d c16716d8 = this.f68357q;
                    if (c16716d8 == null) {
                        AbstractC19074t.m100223u("contentModule");
                        c16716d8 = null;
                    }
                    m116580c = AbstractC22543l.m116580c(i16 - c16716d8.m89114P(), 0);
                    layoutParams2.leftMargin = m116580c;
                }
                ModulesView modulesView4 = this.f68356p;
                if (modulesView4 == null) {
                    AbstractC19074t.m100223u("tipLayout");
                    modulesView4 = null;
                }
                modulesView4.setLayoutParams(layoutParams2);
                int width5 = (int) rectF4.width();
                int height = (int) rectF4.height();
                if (width5 > 0 && height > 0) {
                    this.f68345A = Bitmap.createBitmap(width5, height, Bitmap.Config.ARGB_8888);
                    Bitmap bitmap2 = this.f68345A;
                    AbstractC19074t.m100205c(bitmap2);
                    Canvas canvas = new Canvas(bitmap2);
                    this.f68346B = canvas;
                    AbstractC19074t.m100205c(canvas);
                    canvas.drawColor(this.f68365y);
                    Canvas canvas2 = this.f68346B;
                    AbstractC19074t.m100205c(canvas2);
                    float f12 = width5;
                    float f13 = height;
                    float f14 = this.f68366z;
                    Paint paint2 = this.f68364x;
                    if (paint2 == null) {
                        AbstractC19074t.m100223u("clearPaint");
                        paint = null;
                    } else {
                        paint = paint2;
                    }
                    canvas2.drawRoundRect(0.0f, 0.0f, f12, f13, f14, f14, paint);
                }
            }
            requestLayout();
            ModulesView modulesView5 = this.f68356p;
            if (modulesView5 == null) {
                AbstractC19074t.m100223u("tipLayout");
            } else {
                modulesView2 = modulesView5;
            }
            modulesView2.setVisibility(0);
            Animator animator = this.f68348D;
            if (animator != null) {
                animator.cancel();
            }
            final RectF rectF5 = this.f68351G;
            if (rectF != null && rectF5 != null) {
                this.f68347C = false;
                final C13301c c13301c = new C13301c(this.f68352H);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(this.f68353I);
                ofFloat.setInterpolator(this.f68354J);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.showcase.f
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        WalkThroughOnboardView.m74655n(WalkThroughOnboardView.C13301c.this, rectF, rectF5, this, valueAnimator);
                    }
                });
                ofFloat.addListener(new C13304f());
                ofFloat.start();
                this.f68348D = ofFloat;
                return;
            }
            this.f68347C = true;
            if (rectF5 != null) {
                this.f68352H.set(rectF5);
            } else {
                this.f68352H.setEmpty();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m74655n(C13301c c13301c, RectF rectF, RectF rectF2, WalkThroughOnboardView walkThroughOnboardView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c13301c, "$rectEvaluator");
        AbstractC19074t.m100208f(walkThroughOnboardView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        c13301c.evaluate(valueAnimator.getAnimatedFraction(), rectF, rectF2);
        walkThroughOnboardView.invalidate();
    }

    /* renamed from: p */
    private final void m74656p() {
        this.f68356p = new ModulesView(getContext());
        C16716d c16716d = new C16716d(getContext());
        this.f68357q = c16716d;
        c16716d.m89106L().m89028L(AbstractC23136l9.m118742r(240.0f), -2).m89042Z(AbstractC23222t7.f112586t, AbstractC23222t7.f112576o, AbstractC23222t7.f112586t, AbstractC23222t7.f112576o);
        C16716d c16716d2 = this.f68357q;
        Paint paint = null;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("contentModule");
            c16716d2 = null;
        }
        c16716d2.m89087B0(AbstractC16803z.bg_walk_through_onboard_tip);
        C21697g c21697g = new C21697g(getContext());
        c21697g.m89106L().m89028L(-1, -2);
        c21697g.m111962J1(-16777216);
        c21697g.mo111965M1(1);
        c21697g.m111953A1(2);
        c21697g.mo111964L1(AbstractC23222t7.f112586t);
        c21697g.m111984z1(AbstractC23222t7.f112562h, 1.0f);
        this.f68358r = c21697g;
        C21697g c21697g2 = new C21697g(getContext());
        C16718f m89028L = c21697g2.m89106L().m89028L(-1, -2);
        C21697g c21697g3 = this.f68358r;
        if (c21697g3 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c21697g3 = null;
        }
        m89028L.m89023G(c21697g3).m89036T(AbstractC23222t7.f112556e);
        c21697g2.m111962J1(-16777216);
        c21697g2.mo111965M1(0);
        c21697g2.m111953A1(3);
        c21697g2.mo111964L1(AbstractC23222t7.f112582r);
        c21697g2.m111984z1(AbstractC23222t7.f112556e, 1.0f);
        this.f68359s = c21697g2;
        C21697g c21697g4 = new C21697g(getContext());
        C16718f m89106L = c21697g4.m89106L();
        C21697g c21697g5 = this.f68359s;
        if (c21697g5 == null) {
            AbstractC19074t.m100223u("tvDesc");
            c21697g5 = null;
        }
        C16718f m89036T = m89106L.m89023G(c21697g5).m89036T(AbstractC23222t7.f112576o);
        Boolean bool = Boolean.TRUE;
        m89036T.m89017A(bool);
        c21697g4.m111962J1(AbstractC1401h.m7080d(c21697g4.getContext().getResources(), AbstractC16801x.cLink1, c21697g4.getContext().getTheme()));
        c21697g4.mo111965M1(1);
        c21697g4.m111953A1(1);
        c21697g4.mo111964L1(AbstractC23222t7.f112582r);
        this.f68360t = c21697g4;
        C21697g c21697g6 = new C21697g(getContext());
        C16718f m89106L2 = c21697g6.m89106L();
        C21697g c21697g7 = this.f68359s;
        if (c21697g7 == null) {
            AbstractC19074t.m100223u("tvDesc");
            c21697g7 = null;
        }
        C16718f m89035S = m89106L2.m89023G(c21697g7).m89036T(AbstractC23222t7.f112576o).m89035S(AbstractC23222t7.f112526H);
        C21697g c21697g8 = this.f68360t;
        if (c21697g8 == null) {
            AbstractC19074t.m100223u("btnCta");
            c21697g8 = null;
        }
        m89035S.m89049e0(c21697g8);
        c21697g6.m111962J1(AbstractC1401h.m7080d(c21697g6.getContext().getResources(), AbstractC16801x.cLink1_alpha70, c21697g6.getContext().getTheme()));
        c21697g6.mo111965M1(1);
        c21697g6.m111953A1(1);
        c21697g6.mo111964L1(AbstractC23222t7.f112582r);
        this.f68361u = c21697g6;
        C21697g c21697g9 = new C21697g(getContext());
        C16718f m89106L3 = c21697g9.m89106L();
        C21697g c21697g10 = this.f68359s;
        if (c21697g10 == null) {
            AbstractC19074t.m100223u("tvDesc");
            c21697g10 = null;
        }
        m89106L3.m89023G(c21697g10).m89036T(AbstractC23222t7.f112576o).m89073z(bool);
        c21697g9.m111962J1(AbstractC1401h.m7080d(c21697g9.getContext().getResources(), AbstractC16801x.cLink1_alpha70, c21697g9.getContext().getTheme()));
        c21697g9.mo111965M1(1);
        c21697g9.m111953A1(1);
        c21697g9.mo111964L1(AbstractC23222t7.f112582r);
        this.f68362v = c21697g9;
        C16716d c16716d3 = this.f68357q;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("contentModule");
            c16716d3 = null;
        }
        C21697g c21697g11 = this.f68358r;
        if (c21697g11 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c21697g11 = null;
        }
        c16716d3.m89001g1(c21697g11);
        C16716d c16716d4 = this.f68357q;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("contentModule");
            c16716d4 = null;
        }
        C21697g c21697g12 = this.f68359s;
        if (c21697g12 == null) {
            AbstractC19074t.m100223u("tvDesc");
            c21697g12 = null;
        }
        c16716d4.m89001g1(c21697g12);
        C16716d c16716d5 = this.f68357q;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("contentModule");
            c16716d5 = null;
        }
        C21697g c21697g13 = this.f68360t;
        if (c21697g13 == null) {
            AbstractC19074t.m100223u("btnCta");
            c21697g13 = null;
        }
        c16716d5.m89001g1(c21697g13);
        C16716d c16716d6 = this.f68357q;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("contentModule");
            c16716d6 = null;
        }
        C21697g c21697g14 = this.f68362v;
        if (c21697g14 == null) {
            AbstractC19074t.m100223u("tvStep");
            c21697g14 = null;
        }
        c16716d6.m89001g1(c21697g14);
        C16716d c16716d7 = this.f68357q;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("contentModule");
            c16716d7 = null;
        }
        C21697g c21697g15 = this.f68361u;
        if (c21697g15 == null) {
            AbstractC19074t.m100223u("btnDismiss");
            c21697g15 = null;
        }
        c16716d7.m89001g1(c21697g15);
        ModulesView modulesView = this.f68356p;
        if (modulesView == null) {
            AbstractC19074t.m100223u("tipLayout");
            modulesView = null;
        }
        C16716d c16716d8 = this.f68357q;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("contentModule");
            c16716d8 = null;
        }
        modulesView.mo69681L(c16716d8);
        ModulesView modulesView2 = this.f68356p;
        if (modulesView2 == null) {
            AbstractC19074t.m100223u("tipLayout");
            modulesView2 = null;
        }
        addView(modulesView2);
        Paint paint2 = new Paint(1);
        this.f68363w = paint2;
        paint2.setColor(this.f68365y);
        Paint paint3 = this.f68363w;
        if (paint3 == null) {
            AbstractC19074t.m100223u("dimPaint");
        } else {
            paint = paint3;
        }
        paint.setStyle(Paint.Style.FILL);
        Paint paint4 = new Paint(1);
        this.f68364x = paint4;
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setElevation(AbstractC23222t7.f112556e);
        setOnClickListener(new View.OnClickListener() { // from class: sa0.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalkThroughOnboardView.m74657q(WalkThroughOnboardView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m74657q(WalkThroughOnboardView walkThroughOnboardView, View view) {
        AbstractC19074t.m100208f(walkThroughOnboardView, "this$0");
        if (walkThroughOnboardView.f68350F == walkThroughOnboardView.f68349E.size() - 1) {
            InterfaceC13300b interfaceC13300b = walkThroughOnboardView.f68355K;
            if (interfaceC13300b != null) {
                interfaceC13300b.mo74659a(walkThroughOnboardView);
                return;
            }
            return;
        }
        walkThroughOnboardView.m74658r();
    }

    /* renamed from: r */
    private final void m74658r() {
        int m116584g;
        m116584g = AbstractC22543l.m116584g(this.f68350F + 1, this.f68349E.size() - 1);
        this.f68350F = m116584g;
        m74650i();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Bitmap bitmap;
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f68347C && (bitmap = this.f68345A) != null && this.f68351G != null) {
            AbstractC19074t.m100205c(bitmap);
            RectF rectF = this.f68351G;
            AbstractC19074t.m100205c(rectF);
            float f11 = rectF.left;
            RectF rectF2 = this.f68351G;
            AbstractC19074t.m100205c(rectF2);
            canvas.drawBitmap(bitmap, f11, rectF2.top, (Paint) null);
        }
        float width = canvas.getWidth();
        float f12 = this.f68352H.top;
        Paint paint5 = this.f68363w;
        if (paint5 == null) {
            AbstractC19074t.m100223u("dimPaint");
            paint = null;
        } else {
            paint = paint5;
        }
        canvas.drawRect(0.0f, 0.0f, width, f12, paint);
        float f13 = this.f68352H.bottom;
        float width2 = canvas.getWidth();
        float height = canvas.getHeight();
        Paint paint6 = this.f68363w;
        if (paint6 == null) {
            AbstractC19074t.m100223u("dimPaint");
            paint2 = null;
        } else {
            paint2 = paint6;
        }
        canvas.drawRect(0.0f, f13, width2, height, paint2);
        RectF rectF3 = this.f68352H;
        float f14 = rectF3.top;
        float f15 = rectF3.left;
        float f16 = rectF3.bottom;
        Paint paint7 = this.f68363w;
        if (paint7 == null) {
            AbstractC19074t.m100223u("dimPaint");
            paint3 = null;
        } else {
            paint3 = paint7;
        }
        canvas.drawRect(0.0f, f14, f15, f16, paint3);
        RectF rectF4 = this.f68352H;
        float f17 = rectF4.right;
        float f18 = rectF4.top;
        float width3 = canvas.getWidth();
        float f19 = this.f68352H.bottom;
        Paint paint8 = this.f68363w;
        if (paint8 == null) {
            AbstractC19074t.m100223u("dimPaint");
            paint4 = null;
        } else {
            paint4 = paint8;
        }
        canvas.drawRect(f17, f18, width3, f19, paint4);
        super.dispatchDraw(canvas);
    }

    public final InterfaceC13300b getListener() {
        return this.f68355K;
    }

    public final void setData(List<C13302d> list) {
        AbstractC19074t.m100208f(list, "steps");
        this.f68349E.clear();
        this.f68349E.addAll(list);
        if (this.f68350F >= this.f68349E.size()) {
            this.f68350F = 0;
        }
        m74650i();
    }

    public final void setDimColor(int i11) {
        this.f68365y = i11;
        Paint paint = this.f68363w;
        if (paint == null) {
            AbstractC19074t.m100223u("dimPaint");
            paint = null;
        }
        paint.setColor(this.f68365y);
    }

    public final void setListener(InterfaceC13300b interfaceC13300b) {
        this.f68355K = interfaceC13300b;
    }

    /* renamed from: com.zing.zalo.ui.showcase.WalkThroughOnboardView$d */
    /* loaded from: classes6.dex */
    public static final class C13302d {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final CharSequence f68368a;

        /* renamed from: b */
        private final CharSequence f68369b;

        /* renamed from: c */
        private final C26209i f68370c;

        /* renamed from: d */
        private final CharSequence f68371d;

        /* renamed from: e */
        private int f68372e;

        /* renamed from: f */
        private float f68373f;

        /* renamed from: g */
        private boolean f68374g;

        /* renamed from: h */
        private boolean f68375h;

        /* renamed from: i */
        private boolean f68376i;

        /* renamed from: com.zing.zalo.ui.showcase.WalkThroughOnboardView$d$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public C13302d(CharSequence charSequence, CharSequence charSequence2, C26209i c26209i, CharSequence charSequence3) {
            AbstractC19074t.m100208f(charSequence, "title");
            AbstractC19074t.m100208f(charSequence2, "description");
            AbstractC19074t.m100208f(c26209i, "tipTarget");
            AbstractC19074t.m100208f(charSequence3, "ctaText");
            this.f68368a = charSequence;
            this.f68369b = charSequence2;
            this.f68370c = c26209i;
            this.f68371d = charSequence3;
            this.f68372e = 1;
            this.f68373f = AbstractC23222t7.f112556e;
            this.f68374g = true;
        }

        /* renamed from: a */
        public final CharSequence m74661a() {
            return this.f68371d;
        }

        /* renamed from: b */
        public final CharSequence m74662b() {
            return this.f68369b;
        }

        /* renamed from: c */
        public final float m74663c() {
            return this.f68373f;
        }

        /* renamed from: d */
        public final boolean m74664d() {
            return this.f68374g;
        }

        /* renamed from: e */
        public final boolean m74665e() {
            return this.f68375h;
        }

        /* renamed from: f */
        public final boolean m74666f() {
            return this.f68376i;
        }

        /* renamed from: g */
        public final int m74667g() {
            return this.f68372e;
        }

        /* renamed from: h */
        public final C26209i m74668h() {
            return this.f68370c;
        }

        /* renamed from: i */
        public final CharSequence m74669i() {
            return this.f68368a;
        }

        /* renamed from: j */
        public final void m74670j(float f11) {
            this.f68373f = f11;
        }

        /* renamed from: k */
        public final void m74671k(boolean z11) {
            this.f68374g = z11;
        }

        /* renamed from: l */
        public final void m74672l(boolean z11) {
            this.f68375h = z11;
        }

        /* renamed from: m */
        public final void m74673m(boolean z11) {
            this.f68376i = z11;
        }

        /* renamed from: n */
        public final void m74674n(int i11) {
            this.f68372e = i11;
        }

        public /* synthetic */ C13302d(CharSequence charSequence, CharSequence charSequence2, C26209i c26209i, String str, int i11, AbstractC19060k abstractC19060k) {
            this(charSequence, charSequence2, c26209i, (i11 & 8) != 0 ? "" : str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkThroughOnboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f68365y = Color.parseColor("#99000000");
        this.f68366z = AbstractC23222t7.f112556e;
        this.f68349E = new ArrayList();
        this.f68352H = new RectF();
        this.f68353I = 200L;
        this.f68354J = new C26087b();
        setTag("WalkThroughOnboardView");
        m74656p();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkThroughOnboardView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f68365y = Color.parseColor("#99000000");
        this.f68366z = AbstractC23222t7.f112556e;
        this.f68349E = new ArrayList();
        this.f68352H = new RectF();
        this.f68353I = 200L;
        this.f68354J = new C26087b();
        setTag("WalkThroughOnboardView");
        m74656p();
    }
}
