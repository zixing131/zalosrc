package com.zing.zalo.shortvideo.p072ui.widget.reaction;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zing.zalo.shortvideo.p072ui.widget.reaction.ReactionBoard;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import p664y.AbstractC30228a;
import pm0.C24848g0;
import s20.AbstractC26099a;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27408c;

/* loaded from: classes5.dex */
public final class ReactionBoard extends View {

    /* renamed from: A */
    private int f54487A;

    /* renamed from: B */
    private boolean f54488B;

    /* renamed from: p */
    private final Drawable f54489p;

    /* renamed from: q */
    private final int f54490q;

    /* renamed from: r */
    private final int f54491r;

    /* renamed from: s */
    private final int f54492s;

    /* renamed from: t */
    private final int f54493t;

    /* renamed from: u */
    private final int f54494u;

    /* renamed from: v */
    private int f54495v;

    /* renamed from: w */
    private int f54496w;

    /* renamed from: x */
    private C10794c f54497x;

    /* renamed from: y */
    private final C10792a f54498y;

    /* renamed from: z */
    private final ArrayList f54499z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionBoard$a */
    /* loaded from: classes5.dex */
    public static final class C10792a {

        /* renamed from: a */
        private final Drawable f54500a;

        /* renamed from: b */
        private final int f54501b;

        /* renamed from: c */
        private int f54502c;

        /* renamed from: d */
        private int f54503d;

        /* renamed from: e */
        private int f54504e;

        /* renamed from: f */
        private int f54505f;

        /* renamed from: g */
        private int f54506g;

        /* renamed from: h */
        private int f54507h;

        public C10792a(Drawable drawable, int i11) {
            AbstractC19074t.m100208f(drawable, "drawable");
            this.f54500a = drawable;
            this.f54501b = i11;
        }

        /* renamed from: a */
        public final void m56045a(Canvas canvas) {
            AbstractC19074t.m100208f(canvas, "canvas");
            Drawable drawable = this.f54500a;
            int i11 = this.f54503d;
            int i12 = this.f54504e;
            int i13 = this.f54507h;
            drawable.setBounds(i11, i12 + i13, this.f54505f, this.f54506g + i13);
            this.f54500a.setAlpha(this.f54502c);
            this.f54500a.draw(canvas);
        }

        /* renamed from: b */
        public final boolean m56046b(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, "event");
            if (motionEvent.getX() >= this.f54503d && motionEvent.getX() <= this.f54505f && motionEvent.getY() >= this.f54504e && motionEvent.getY() <= this.f54506g) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final void m56047c(float f11) {
            this.f54502c = Math.min((int) (255 * (1 - f11)), 255);
            this.f54507h = (int) (f11 * this.f54501b);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionBoard$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC10793b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionBoard$c */
    /* loaded from: classes5.dex */
    public static final class C10794c {

        /* renamed from: a */
        private final InterfaceC18494a f54508a;

        /* renamed from: b */
        private final ArrayList f54509b;

        /* renamed from: c */
        private boolean f54510c;

        public C10794c(InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(interfaceC18494a, "doOnExit");
            this.f54508a = interfaceC18494a;
            this.f54509b = new ArrayList();
        }

        /* renamed from: a */
        public final void m56048a(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f54509b.add(animator);
        }

        /* renamed from: b */
        public final boolean m56049b() {
            return !this.f54509b.isEmpty();
        }

        /* renamed from: c */
        public final void m56050c(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f54509b.remove(animator);
            if (this.f54510c && this.f54509b.isEmpty()) {
                this.f54508a.mo12V4();
            }
        }

        /* renamed from: d */
        public final void m56051d(boolean z11) {
            this.f54510c = z11;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionBoard$d */
    /* loaded from: classes5.dex */
    private static final class C10795d {
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionBoard$e */
    /* loaded from: classes5.dex */
    static final class C10796e extends AbstractC19075u implements InterfaceC18494a {
        C10796e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m56052a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m56052a() {
            ReactionBoard.m56032e(ReactionBoard.this);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionBoard$f */
    /* loaded from: classes5.dex */
    public static final class C10797f implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ ValueAnimator f54513q;

        public C10797f(ValueAnimator valueAnimator) {
            this.f54513q = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            C10794c c10794c = ReactionBoard.this.f54497x;
            AbstractC19074t.m100205c(this.f54513q);
            c10794c.m56050c(this.f54513q);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionBoard$g */
    /* loaded from: classes5.dex */
    public static final class C10798g implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ ValueAnimator f54515q;

        public C10798g(ValueAnimator valueAnimator) {
            this.f54515q = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            C10794c c10794c = ReactionBoard.this.f54497x;
            AbstractC19074t.m100205c(this.f54515q);
            c10794c.m56048a(this.f54515q);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionBoard$h */
    /* loaded from: classes5.dex */
    public static final class C10799h implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ ValueAnimator f54517q;

        public C10799h(ValueAnimator valueAnimator) {
            this.f54517q = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            C10794c c10794c = ReactionBoard.this.f54497x;
            AbstractC19074t.m100205c(this.f54517q);
            c10794c.m56050c(this.f54517q);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionBoard$i */
    /* loaded from: classes5.dex */
    public static final class C10800i implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ ValueAnimator f54519q;

        public C10800i(ValueAnimator valueAnimator) {
            this.f54519q = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            C10794c c10794c = ReactionBoard.this.f54497x;
            AbstractC19074t.m100205c(this.f54519q);
            c10794c.m56048a(this.f54519q);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionBoard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC10793b m56032e(ReactionBoard reactionBoard) {
        reactionBoard.getClass();
        return null;
    }

    /* renamed from: g */
    private final void m56033g() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        AbstractC19074t.m100205c(ofFloat);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        AbstractC26099a.m134294a(ofFloat, context, 300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p20.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ReactionBoard.m56034h(ReactionBoard.this, valueAnimator);
            }
        });
        ofFloat.addListener(new C10798g(ofFloat));
        ofFloat.addListener(new C10797f(ofFloat));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m56034h(ReactionBoard reactionBoard, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(reactionBoard, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        reactionBoard.f54498y.m56047c(((Float) animatedValue).floatValue());
    }

    /* renamed from: i */
    private final void m56035i(final int i11) {
        if (i11 < 0) {
            return;
        }
        if (i11 == this.f54487A) {
            m56035i(i11 - 1);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        AbstractC19074t.m100205c(ofFloat);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        AbstractC26099a.m134294a(ofFloat, context, 400L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p20.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ReactionBoard.m56036j(ReactionBoard.this, i11, valueAnimator);
            }
        });
        ofFloat.addListener(new C10800i(ofFloat));
        ofFloat.addListener(new C10799h(ofFloat));
        ofFloat.start();
        postDelayed(new Runnable() { // from class: p20.c
            @Override // java.lang.Runnable
            public final void run() {
                ReactionBoard.m56037k(ReactionBoard.this, i11);
            }
        }, ((this.f54499z.size() - i11) + 1) * 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m56036j(ReactionBoard reactionBoard, int i11, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(reactionBoard, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((Float) animatedValue).floatValue();
        AbstractC30228a.m149044a(reactionBoard.f54499z.get(i11));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m56037k(ReactionBoard reactionBoard, int i11) {
        AbstractC19074t.m100208f(reactionBoard, "this$0");
        reactionBoard.m56035i(i11 - 1);
    }

    /* renamed from: m */
    private final boolean m56038m(MotionEvent motionEvent) {
        if (motionEvent.getX() >= getLeft() && motionEvent.getX() <= getRight() && motionEvent.getY() >= getTop() && motionEvent.getY() <= getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private final void m56039n() {
        if (this.f54499z.size() <= 0) {
            return;
        }
        AbstractC30228a.m149044a(this.f54499z.get(0));
        throw null;
    }

    /* renamed from: p */
    private final void m56040p(MotionEvent motionEvent) {
        boolean z11;
        Iterator it = this.f54499z.iterator();
        if (!it.hasNext()) {
            boolean z12 = this.f54488B;
            if (this.f54487A != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f54488B = z12 | z11;
            this.f54487A = -1;
            return;
        }
        AbstractC30228a.m149044a(it.next());
        throw null;
    }

    /* renamed from: q */
    private final void m56041q() {
        int i11 = this.f54487A;
        if (i11 < 0) {
            Iterator it = this.f54499z.iterator();
            if (!it.hasNext()) {
                this.f54488B = false;
                m56039n();
                return;
            } else {
                AbstractC30228a.m149044a(it.next());
                throw null;
            }
        }
        AbstractC30228a.m149044a(this.f54499z.get(i11));
        throw null;
    }

    /* renamed from: r */
    private final void m56042r(C10795d c10795d) {
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.draw(canvas);
        if (!m56044l() && this.f54488B) {
            m56041q();
        }
        this.f54498y.m56045a(canvas);
        Iterator it = this.f54499z.iterator();
        if (!it.hasNext()) {
            invalidate();
        } else {
            AbstractC30228a.m149044a(it.next());
            throw null;
        }
    }

    /* renamed from: f */
    public final void m56043f() {
        if (!m56044l()) {
            this.f54497x.m56051d(true);
            m56033g();
            m56035i(this.f54499z.size() - 1);
        }
    }

    /* renamed from: l */
    public final boolean m56044l() {
        return this.f54497x.m56049b();
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(this.f54495v, this.f54496w);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (!m56044l()) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (m56038m(motionEvent)) {
                            m56040p(motionEvent);
                        } else {
                            this.f54487A = -1;
                            this.f54488B = true;
                        }
                    }
                } else if (this.f54487A >= 0) {
                    Iterator it = this.f54499z.iterator();
                    if (!it.hasNext()) {
                        m56043f();
                        Object obj = this.f54499z.get(this.f54487A);
                        AbstractC19074t.m100207e(obj, "get(...)");
                        AbstractC30228a.m149044a(obj);
                        m56042r(null);
                    } else {
                        AbstractC30228a.m149044a(it.next());
                        throw null;
                    }
                } else {
                    m56043f();
                }
            } else if (this.f54498y.m56046b(motionEvent)) {
                m56040p(motionEvent);
            } else {
                m56043f();
            }
        }
        return true;
    }

    public /* synthetic */ ReactionBoard(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionBoard(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        Drawable m134434z = AbstractC26112n.m134434z(this, AbstractC27408c.zch_bg_bar_reaction);
        this.f54489p = m134434z;
        this.f54490q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_board_margin_bottom);
        this.f54491r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_throw_margin_right);
        this.f54492s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_throw_margin_bottom);
        int m134433y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_icon_size);
        this.f54493t = m134433y;
        this.f54494u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_icon_spacing);
        this.f54497x = new C10794c(new C10796e());
        this.f54498y = new C10792a(m134434z, m134433y);
        this.f54499z = new ArrayList();
        this.f54487A = -1;
    }
}
