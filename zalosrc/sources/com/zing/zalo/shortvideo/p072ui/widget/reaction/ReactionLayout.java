package com.zing.zalo.shortvideo.p072ui.widget.reaction;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.reaction.ReactionLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zlottie.widget.C17291a;
import com.zing.zalo.zlottie.widget.LottieImageView;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import p20.C24619j;
import p20.C24620k;
import p500s1.C26087b;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import q10.C25043p1;
import s20.AbstractC26099a;
import s20.AbstractC26105g;
import s20.AbstractC26107i;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27410e;
import v00.AbstractC27412g;

/* loaded from: classes5.dex */
public final class ReactionLayout extends FrameLayout {

    /* renamed from: A */
    private String f54544A;

    /* renamed from: B */
    private Handler f54545B;

    /* renamed from: C */
    private boolean f54546C;

    /* renamed from: D */
    private int f54547D;

    /* renamed from: E */
    private int f54548E;

    /* renamed from: F */
    private final int f54549F;

    /* renamed from: G */
    private final InterfaceC24854k f54550G;

    /* renamed from: H */
    private boolean f54551H;

    /* renamed from: p */
    private InterfaceC10806b f54552p;

    /* renamed from: q */
    private final int f54553q;

    /* renamed from: r */
    private final int f54554r;

    /* renamed from: s */
    private final Drawable f54555s;

    /* renamed from: t */
    private final Drawable f54556t;

    /* renamed from: u */
    private final int[] f54557u;

    /* renamed from: v */
    private final Handler f54558v;

    /* renamed from: w */
    private final C10807c f54559w;

    /* renamed from: x */
    private final ArrayList f54560x;

    /* renamed from: y */
    private final Random f54561y;

    /* renamed from: z */
    private C24619j f54562z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$a */
    /* loaded from: classes5.dex */
    public static final class C10805a {

        /* renamed from: a */
        private final Point f54563a;

        /* renamed from: b */
        private final Point f54564b;

        /* renamed from: c */
        private final Point f54565c;

        /* renamed from: d */
        private final Point f54566d;

        public C10805a(Point point, Point point2, Point point3, Point point4) {
            AbstractC19074t.m100208f(point, "A");
            AbstractC19074t.m100208f(point2, "B");
            AbstractC19074t.m100208f(point3, "C");
            AbstractC19074t.m100208f(point4, "D");
            this.f54563a = point;
            this.f54564b = point2;
            this.f54565c = point3;
            this.f54566d = point4;
        }

        /* renamed from: a */
        public final Point m56103a(float f11) {
            float f12 = 1.0f - f11;
            float f13 = f12 * f12 * f12;
            float f14 = 3.0f * f11;
            float f15 = f14 * f12 * f12;
            float f16 = f14 * f11 * f12;
            float f17 = f11 * f11 * f11;
            Point point = this.f54563a;
            Point point2 = this.f54564b;
            Point point3 = this.f54565c;
            float f18 = (point.x * f13) + (point2.x * f15) + (point3.x * f16);
            Point point4 = this.f54566d;
            return new Point((int) (f18 + (point4.x * f17)), (int) ((f13 * point.y) + (f15 * point2.y) + (f16 * point3.y) + (f17 * point4.y)));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC10806b {
        /* renamed from: a */
        void mo56104a(String str);

        /* renamed from: b */
        void mo56105b(String str, int i11);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$c */
    /* loaded from: classes5.dex */
    private static final class C10807c {

        /* renamed from: a */
        private final ArrayList f54567a = new ArrayList();

        /* renamed from: b */
        private boolean f54568b;

        /* renamed from: a */
        public final void m56106a(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            if (this.f54568b) {
                animator.end();
            } else {
                this.f54567a.add(animator);
            }
        }

        /* renamed from: b */
        public final void m56107b() {
            this.f54568b = true;
            for (Animator animator : this.f54567a) {
                if (animator.isRunning()) {
                    animator.end();
                }
            }
        }

        /* renamed from: c */
        public final void m56108c(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            if (!this.f54568b) {
                this.f54567a.remove(animator);
            }
        }

        /* renamed from: d */
        public final void m56109d() {
            this.f54567a.clear();
            this.f54568b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$d */
    /* loaded from: classes5.dex */
    public static final class C10808d {

        /* renamed from: a */
        private final Drawable f54569a;

        /* renamed from: b */
        private Point f54570b;

        /* renamed from: c */
        private int f54571c;

        /* renamed from: d */
        private int f54572d;

        /* renamed from: e */
        private int f54573e;

        /* renamed from: f */
        private int f54574f;

        public C10808d(Drawable drawable) {
            AbstractC19074t.m100208f(drawable, "drawable");
            this.f54569a = drawable;
            this.f54570b = new Point();
        }

        /* renamed from: a */
        public final void m56110a(Canvas canvas) {
            AbstractC19074t.m100208f(canvas, "canvas");
            Drawable drawable = this.f54569a;
            Point point = this.f54570b;
            int i11 = point.x;
            int i12 = this.f54571c;
            int i13 = point.y;
            int i14 = this.f54572d;
            drawable.setBounds(i11 - i12, i13 - i14, i11 + i12, i13 + i14);
            int i15 = this.f54573e;
            if (i15 != 0) {
                this.f54569a.setTint(i15);
            }
            this.f54569a.setAlpha(this.f54574f);
            this.f54569a.draw(canvas);
        }

        /* renamed from: b */
        public final int m56111b() {
            return (this.f54571c + this.f54572d) / 2;
        }

        /* renamed from: c */
        public final Point m56112c() {
            return this.f54570b;
        }

        /* renamed from: d */
        public final int m56113d() {
            return this.f54573e;
        }

        /* renamed from: e */
        public final Drawable m56114e() {
            return this.f54569a;
        }

        /* renamed from: f */
        public final boolean m56115f() {
            return this.f54573e != 0;
        }

        /* renamed from: g */
        public final void m56116g(Random random, int[] iArr) {
            AbstractC19074t.m100208f(random, "randomizer");
            AbstractC19074t.m100208f(iArr, "colors");
            this.f54573e = iArr[random.nextInt(iArr.length)];
        }

        /* renamed from: h */
        public final void m56117h(int i11) {
            this.f54574f = i11;
        }

        /* renamed from: i */
        public final void m56118i(Point point) {
            AbstractC19074t.m100208f(point, "<set-?>");
            this.f54570b = point;
        }

        /* renamed from: j */
        public final void m56119j(int i11) {
            this.f54573e = i11;
        }

        /* renamed from: k */
        public final void m56120k(int i11) {
            this.f54571c = i11;
        }

        /* renamed from: l */
        public final void m56121l(int i11) {
            this.f54572d = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$e */
    /* loaded from: classes5.dex */
    public static final class C10809e {
        public static final a Companion = new a(null);

        /* renamed from: f */
        private static final C10809e f54575f = new C10809e(1, 1500, 3000, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);

        /* renamed from: g */
        private static final C10809e f54576g = new C10809e(2, ZAbstractBase.ZVU_PROCESS_FLUSH, 4000, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);

        /* renamed from: a */
        private final int f54577a;

        /* renamed from: b */
        private final int f54578b;

        /* renamed from: c */
        private final int f54579c;

        /* renamed from: d */
        private final int f54580d;

        /* renamed from: e */
        private final Random f54581e = new Random();

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$e$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final C10809e m56131a() {
                return C10809e.f54576g;
            }

            /* renamed from: b */
            public final C10809e m56132b() {
                return C10809e.f54575f;
            }
        }

        private C10809e(int i11, int i12, int i13, int i14) {
            this.f54577a = i11;
            this.f54578b = i12;
            this.f54579c = i13;
            this.f54580d = i14;
        }

        /* renamed from: c */
        public final C24860q m56124c(Drawable drawable) {
            AbstractC19074t.m100208f(drawable, "drawable");
            return new C24860q(Integer.valueOf((drawable.getIntrinsicWidth() / this.f54577a) / 2), Integer.valueOf((drawable.getIntrinsicHeight() / this.f54577a) / 2));
        }

        /* renamed from: d */
        public final int m56125d(float f11) {
            return (int) (((1.0f - Math.max(f11, 0.8f)) * 5.0f * 200.0f) + 55.0f);
        }

        /* renamed from: e */
        public final C24860q m56126e(C24860q c24860q, float f11) {
            AbstractC19074t.m100208f(c24860q, "dimensions");
            float pow = (1.0f - (((float) Math.pow(2.718281828459045d, (-f11) / 0.25d)) * ((float) Math.cos(10.0f * f11)))) * (0.85f - (f11 * 0.25f));
            return new C24860q(Integer.valueOf((int) (((Number) c24860q.m129215c()).floatValue() * pow)), Integer.valueOf((int) (((Number) c24860q.m129216d()).floatValue() * pow)));
        }

        /* renamed from: f */
        public final long m56127f() {
            return AbstractC26107i.m134355a(this.f54581e, this.f54578b, this.f54579c);
        }

        /* renamed from: g */
        public final int m56128g(float f11) {
            return (int) ((f11 * 200.0f) + 55.0f);
        }

        /* renamed from: h */
        public final C24860q m56129h(int i11, float f11) {
            int i12 = (int) (i11 * ((f11 / 2.0f) + 0.5f));
            return new C24860q(Integer.valueOf(i12), Integer.valueOf(i12));
        }

        /* renamed from: i */
        public final long m56130i() {
            return this.f54580d;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$f */
    /* loaded from: classes5.dex */
    static final class C10810f extends AbstractC19075u implements InterfaceC18494a {
        C10810f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25043p1 mo12V4() {
            return C25043p1.m129916a(ReactionLayout.this);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$g */
    /* loaded from: classes5.dex */
    static final class C10811g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25043p1 f54584r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10811g(C25043p1 c25043p1) {
            super(1);
            this.f54584r = c25043p1;
        }

        /* renamed from: a */
        public final void m56134a(boolean z11) {
            if (z11) {
                ReactionLayout.this.m56076N();
                return;
            }
            SimpleShadowTextView simpleShadowTextView = this.f54584r.f120181s;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtLiked");
            AbstractC26112n.m134367H(simpleShadowTextView);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m56134a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$h */
    /* loaded from: classes5.dex */
    public static final class C10812h implements C17291a.f {

        /* renamed from: b */
        final /* synthetic */ LottieImageView f54586b;

        C10812h(LottieImageView lottieImageView) {
            this.f54586b = lottieImageView;
        }

        @Override // com.zing.zalo.zlottie.widget.C17291a.f
        /* renamed from: a */
        public void mo55123a() {
            ReactionLayout.this.m56068E();
            LottieImageView lottieImageView = this.f54586b;
            AbstractC19074t.m100207e(lottieImageView, "$this_apply");
            AbstractC26112n.m134367H(lottieImageView);
        }

        @Override // com.zing.zalo.zlottie.widget.C17291a.f
        /* renamed from: b */
        public void mo55124b() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$i */
    /* loaded from: classes5.dex */
    public static final class C10813i implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ ValueAnimator f54588q;

        public C10813i(ValueAnimator valueAnimator) {
            this.f54588q = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            ReactionLayout.this.getBinding().f120179q.m56061n();
            C10807c c10807c = ReactionLayout.this.f54559w;
            AbstractC19074t.m100205c(this.f54588q);
            c10807c.m56108c(this.f54588q);
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

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$j */
    /* loaded from: classes5.dex */
    public static final class C10814j implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ ValueAnimator f54590q;

        public C10814j(ValueAnimator valueAnimator) {
            this.f54590q = valueAnimator;
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
            LottieImageView lottieImageView = ReactionLayout.this.getBinding().f120180r;
            lottieImageView.m92148C(AbstractC27412g.zch_reaction_boom, false);
            lottieImageView.setAutoRepeatMode(C17291a.g.LIMIT);
            lottieImageView.setMaxRepeatCount(1);
            lottieImageView.setAnimationListener(new C10812h(lottieImageView));
            lottieImageView.m92155v();
            AbstractC19074t.m100205c(lottieImageView);
            AbstractC26112n.m134431w0(lottieImageView);
            C10807c c10807c = ReactionLayout.this.f54559w;
            AbstractC19074t.m100205c(this.f54590q);
            c10807c.m56106a(this.f54590q);
            ReactionLayout.this.f54546C = true;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$k */
    /* loaded from: classes5.dex */
    public static final class C10815k implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ C10808d f54591p;

        /* renamed from: q */
        final /* synthetic */ ReactionLayout f54592q;

        /* renamed from: r */
        final /* synthetic */ C10809e f54593r;

        /* renamed from: s */
        final /* synthetic */ ValueAnimator f54594s;

        public C10815k(C10808d c10808d, ReactionLayout reactionLayout, C10809e c10809e, ValueAnimator valueAnimator) {
            this.f54591p = c10808d;
            this.f54592q = reactionLayout;
            this.f54593r = c10809e;
            this.f54594s = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            if (this.f54591p.m56115f()) {
                this.f54592q.m56074K(this.f54591p, this.f54593r);
            }
            C10807c c10807c = this.f54592q.f54559w;
            AbstractC19074t.m100205c(this.f54594s);
            c10807c.m56108c(this.f54594s);
            this.f54592q.f54560x.remove(this.f54591p);
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

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$l */
    /* loaded from: classes5.dex */
    public static final class C10816l implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ ValueAnimator f54596q;

        /* renamed from: r */
        final /* synthetic */ C10808d f54597r;

        public C10816l(ValueAnimator valueAnimator, C10808d c10808d) {
            this.f54596q = valueAnimator;
            this.f54597r = c10808d;
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
            C10807c c10807c = ReactionLayout.this.f54559w;
            AbstractC19074t.m100205c(this.f54596q);
            c10807c.m56106a(this.f54596q);
            ReactionLayout.this.f54560x.add(this.f54597r);
            if (ReactionLayout.this.f54560x.size() == 1) {
                ReactionLayout.this.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$m */
    /* loaded from: classes5.dex */
    public static final class C10817m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ C24860q f54599r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10817m(C24860q c24860q) {
            super(0);
            this.f54599r = c24860q;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC26107i.m134355a(ReactionLayout.this.f54561y, ((Number) this.f54599r.m129215c()).intValue(), ReactionLayout.this.getMeasuredWidth()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$n */
    /* loaded from: classes5.dex */
    public static final class C10818n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ int f54600q;

        /* renamed from: r */
        final /* synthetic */ Point f54601r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10818n(int i11, Point point) {
            super(1);
            this.f54600q = i11;
            this.f54601r = point;
        }

        /* renamed from: a */
        public final Integer m56136a(float f11) {
            return Integer.valueOf(this.f54600q + ((int) ((this.f54601r.y - r0) * f11)));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m56136a(((Number) obj).floatValue());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$o */
    /* loaded from: classes5.dex */
    public static final class C10819o implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ ValueAnimator f54603q;

        /* renamed from: r */
        final /* synthetic */ C10808d f54604r;

        public C10819o(ValueAnimator valueAnimator, C10808d c10808d) {
            this.f54603q = valueAnimator;
            this.f54604r = c10808d;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            C10807c c10807c = ReactionLayout.this.f54559w;
            AbstractC19074t.m100205c(this.f54603q);
            c10807c.m56108c(this.f54603q);
            ReactionLayout.this.f54560x.remove(this.f54604r);
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

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionLayout$p */
    /* loaded from: classes5.dex */
    public static final class C10820p implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ ValueAnimator f54606q;

        /* renamed from: r */
        final /* synthetic */ C10808d f54607r;

        public C10820p(ValueAnimator valueAnimator, C10808d c10808d) {
            this.f54606q = valueAnimator;
            this.f54607r = c10808d;
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
            C10807c c10807c = ReactionLayout.this.f54559w;
            AbstractC19074t.m100205c(this.f54606q);
            c10807c.m56106a(this.f54606q);
            ReactionLayout.this.f54560x.add(this.f54607r);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m56065A(ReactionLayout reactionLayout, View view) {
        AbstractC19074t.m100208f(reactionLayout, "this$0");
        if (!reactionLayout.f54546C) {
            reactionLayout.m56094x();
            reactionLayout.m56073J();
            InterfaceC10806b interfaceC10806b = reactionLayout.f54552p;
            if (interfaceC10806b != null) {
                interfaceC10806b.mo56104a(reactionLayout.f54544A);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    private final C10808d m56066B(String str, boolean z11) {
        C24620k c24620k;
        C24619j c24619j = this.f54562z;
        if (c24619j != null && (c24620k = (C24620k) c24619j.get(str)) != null) {
            C10808d c10808d = new C10808d(c24620k.m128120b(z11));
            if (c24620k.m128123e()) {
                c10808d.m56116g(this.f54561y, this.f54557u);
                return c10808d;
            }
            return c10808d;
        }
        C10808d c10808d2 = new C10808d(this.f54556t);
        c10808d2.m56116g(this.f54561y, this.f54557u);
        return c10808d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m56067D(ReactionLayout reactionLayout, String str) {
        AbstractC19074t.m100208f(reactionLayout, "this$0");
        reactionLayout.m56071H(reactionLayout.m56066B(str, false), C10809e.Companion.m56131a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final void m56068E() {
        this.f54545B.removeCallbacksAndMessages(null);
        this.f54546C = false;
        this.f54548E = 0;
        if (!this.f54551H) {
            m56076N();
        }
        getBinding().f120179q.setCount(0);
    }

    /* renamed from: F */
    private final void m56069F() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getBinding().f120179q.getScaleX(), 0.0f);
        AbstractC19074t.m100205c(ofFloat);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        AbstractC26099a.m134294a(ofFloat, context, 300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p20.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ReactionLayout.m56070G(ReactionLayout.this, valueAnimator);
            }
        });
        ofFloat.addListener(new C10814j(ofFloat));
        ofFloat.addListener(new C10813i(ofFloat));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final void m56070G(ReactionLayout reactionLayout, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(reactionLayout, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        reactionLayout.getBinding().f120179q.m56058i(floatValue, floatValue);
        reactionLayout.getBinding().f120182t.setAlpha(floatValue);
        reactionLayout.getBinding().f120181s.setAlpha(floatValue);
    }

    /* renamed from: H */
    private final void m56071H(final C10808d c10808d, final C10809e c10809e) {
        final C24860q m56124c = c10809e.m56124c(c10808d.m56114e());
        ReactionButton reactionButton = getBinding().f120179q;
        AbstractC19074t.m100205c(reactionButton);
        Point point = new Point(AbstractC26112n.m134422s(reactionButton), AbstractC26112n.m134430w(reactionButton));
        if (((Number) m56124c.m129216d()).intValue() < (point.y * 2) / 3 && ((Number) m56124c.m129215c()).intValue() < getMeasuredWidth()) {
            int m134355a = AbstractC26107i.m134355a(this.f54561y, ((Number) m56124c.m129216d()).intValue(), (point.y * 2) / 3);
            C10817m c10817m = new C10817m(m56124c);
            C10818n c10818n = new C10818n(m134355a, point);
            final C10805a c10805a = new C10805a(new Point(point.x, ((Number) c10818n.mo205i9(Float.valueOf(1.0f))).intValue()), new Point(((Number) c10817m.mo12V4()).intValue(), ((Number) c10818n.mo205i9(Float.valueOf(0.67f))).intValue()), new Point(((Number) c10817m.mo12V4()).intValue(), ((Number) c10818n.mo205i9(Float.valueOf(0.33f))).intValue()), new Point(((Number) c10817m.mo12V4()).intValue(), ((Number) c10818n.mo205i9(Float.valueOf(0.0f))).intValue()));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            AbstractC19074t.m100205c(ofFloat);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            AbstractC26099a.m134294a(ofFloat, context, c10809e.m56127f());
            ofFloat.setInterpolator(new C26087b());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.widget.reaction.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ReactionLayout.m56072I(ReactionLayout.C10808d.this, c10809e, m56124c, c10805a, valueAnimator);
                }
            });
            ofFloat.addListener(new C10816l(ofFloat, c10808d));
            ofFloat.addListener(new C10815k(c10808d, this, c10809e, ofFloat));
            ofFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m56072I(C10808d c10808d, C10809e c10809e, C24860q c24860q, C10805a c10805a, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c10808d, "$flyObject");
        AbstractC19074t.m100208f(c10809e, "$config");
        AbstractC19074t.m100208f(c24860q, "$dimensions");
        AbstractC19074t.m100208f(c10805a, "$flyingPath");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        C24860q m56126e = c10809e.m56126e(c24860q, floatValue);
        c10808d.m56120k(((Number) m56126e.m129215c()).intValue());
        c10808d.m56121l(((Number) m56126e.m129216d()).intValue());
        c10808d.m56118i(c10805a.m56103a(floatValue));
        c10808d.m56117h(c10809e.m56125d(floatValue));
    }

    /* renamed from: J */
    private final void m56073J() {
        C25043p1 binding = getBinding();
        int i11 = this.f54548E;
        int i12 = this.f54547D;
        if (i11 < i12) {
            binding.f120179q.m56059k();
        } else if (i11 == i12) {
            binding.f120179q.m56060m();
        }
        m56071H(m56066B(this.f54544A, true), C10809e.Companion.m56132b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final void m56074K(C10808d c10808d, final C10809e c10809e) {
        final C10808d c10808d2 = new C10808d(this.f54555s);
        c10808d2.m56118i(c10808d.m56112c());
        c10808d2.m56119j(c10808d.m56113d());
        final int m56111b = c10808d.m56111b();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        AbstractC19074t.m100205c(ofFloat);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        AbstractC26099a.m134294a(ofFloat, context, c10809e.m56130i());
        ofFloat.setInterpolator(new C26087b());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.widget.reaction.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ReactionLayout.m56075L(ReactionLayout.C10808d.this, c10809e, m56111b, valueAnimator);
            }
        });
        ofFloat.addListener(new C10820p(ofFloat, c10808d2));
        ofFloat.addListener(new C10819o(ofFloat, c10808d2));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m56075L(C10808d c10808d, C10809e c10809e, int i11, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c10808d, "$spark");
        AbstractC19074t.m100208f(c10809e, "$config");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        C24860q m56129h = c10809e.m56129h(i11, floatValue);
        c10808d.m56120k(((Number) m56129h.m129215c()).intValue());
        c10808d.m56121l(((Number) m56129h.m129216d()).intValue());
        c10808d.m56117h(c10809e.m56128g(floatValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final void m56076N() {
        if (this.f54551H) {
            SimpleShadowTextView simpleShadowTextView = getBinding().f120181s;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtLiked");
            AbstractC26112n.m134367H(simpleShadowTextView);
            return;
        }
        ReactionCount reactionCount = getBinding().f120182t;
        AbstractC19074t.m100207e(reactionCount, "txtReaction");
        if (AbstractC26112n.m134380U(reactionCount) && getBinding().f120182t.getAlpha() >= 0.5f) {
            SimpleShadowTextView simpleShadowTextView2 = getBinding().f120181s;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtLiked");
            AbstractC26112n.m134367H(simpleShadowTextView2);
            return;
        }
        if (AbstractC19074t.m100204b(getBinding().f120181s.getText(), "0")) {
            SimpleShadowTextView simpleShadowTextView3 = getBinding().f120181s;
            AbstractC19074t.m100207e(simpleShadowTextView3, "txtLiked");
            AbstractC26112n.m134367H(simpleShadowTextView3);
            return;
        }
        ReactionButton reactionButton = getBinding().f120179q;
        AbstractC19074t.m100207e(reactionButton, "btnReaction");
        if (AbstractC26112n.m134380U(reactionButton) && getBinding().f120179q.getAlpha() >= 0.5f) {
            if (getBinding().f120181s.getAlpha() <= 0.1f) {
                getBinding().f120181s.setAlpha(1.0f);
            }
            SimpleShadowTextView simpleShadowTextView4 = getBinding().f120181s;
            AbstractC19074t.m100207e(simpleShadowTextView4, "txtLiked");
            AbstractC26112n.m134431w0(simpleShadowTextView4);
        }
    }

    /* renamed from: q */
    private final void m56091q(long j11) {
        this.f54548E--;
        getBinding().f120182t.setCount(this.f54548E);
        getBinding().f120179q.setCount(this.f54548E);
        if (this.f54548E == 0) {
            return;
        }
        this.f54545B.removeCallbacksAndMessages(null);
        this.f54545B.postDelayed(new Runnable() { // from class: p20.i
            @Override // java.lang.Runnable
            public final void run() {
                ReactionLayout.m56092r(ReactionLayout.this);
            }
        }, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m56092r(ReactionLayout reactionLayout) {
        AbstractC19074t.m100208f(reactionLayout, "this$0");
        reactionLayout.m56091q(50L);
    }

    /* renamed from: s */
    private final boolean m56093s(MotionEvent motionEvent) {
        return m56102z();
    }

    /* renamed from: x */
    private final void m56094x() {
        this.f54548E++;
        getBinding().f120182t.setCount(this.f54548E);
        getBinding().f120179q.setCount(this.f54548E);
        this.f54545B.removeCallbacksAndMessages(null);
        this.f54545B.postDelayed(new Runnable() { // from class: p20.g
            @Override // java.lang.Runnable
            public final void run() {
                ReactionLayout.m56095y(ReactionLayout.this);
            }
        }, 350L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m56095y(ReactionLayout reactionLayout) {
        AbstractC19074t.m100208f(reactionLayout, "this$0");
        if (reactionLayout.f54548E < reactionLayout.f54547D) {
            reactionLayout.m56091q(350L);
            return;
        }
        reactionLayout.m56069F();
        InterfaceC10806b interfaceC10806b = reactionLayout.f54552p;
        if (interfaceC10806b != null) {
            interfaceC10806b.mo56105b(reactionLayout.f54544A, reactionLayout.f54548E);
        }
    }

    /* renamed from: C */
    public final void m56096C(final String str, int i11, long j11) {
        C24620k c24620k;
        ReactionButton reactionButton = getBinding().f120179q;
        AbstractC19074t.m100207e(reactionButton, "btnReaction");
        if (!AbstractC26112n.m134376Q(reactionButton) && i11 > 0) {
            if (str != null) {
                C24619j c24619j = this.f54562z;
                if (c24619j != null) {
                    c24620k = (C24620k) c24619j.get(str);
                } else {
                    c24620k = null;
                }
                if (c24620k == null) {
                    return;
                }
            }
            int i12 = 1;
            if (1 > i11) {
                return;
            }
            while (true) {
                this.f54558v.postDelayed(new Runnable() { // from class: p20.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReactionLayout.m56067D(ReactionLayout.this, str);
                    }
                }, (i12 * j11) / i11);
                if (i12 != i11) {
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: M */
    public final void m56097M(long j11) {
        if (j11 <= 0) {
            SimpleShadowTextView simpleShadowTextView = getBinding().f120181s;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtLiked");
            AbstractC26112n.m134367H(simpleShadowTextView);
        } else {
            m56076N();
        }
        getBinding().f120181s.setText(AbstractC26105g.m134334a(j11));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (!this.f54560x.isEmpty()) {
            Iterator it = this.f54560x.iterator();
            while (it.hasNext()) {
                ((C10808d) it.next()).m56110a(canvas);
            }
            invalidate();
        }
        super.draw(canvas);
    }

    public final C25043p1 getBinding() {
        return (C25043p1) this.f54550G.getValue();
    }

    public final InterfaceC10806b getCallback() {
        return this.f54552p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f54559w.m56109d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f54558v.removeCallbacksAndMessages(null);
        this.f54559w.m56107b();
        this.f54560x.clear();
        m56068E();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25043p1 binding = getBinding();
        binding.f120182t.setColors(new int[]{AbstractC26112n.m134426u(this, AbstractC27406a.zch_red_r55)});
        binding.f120182t.setShowHideLikeCountCb(new C10811g(binding));
        binding.f120179q.setOnClickListener(new View.OnClickListener() { // from class: p20.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReactionLayout.m56065A(ReactionLayout.this, view);
            }
        });
        C24619j c24619j = new C24619j();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c24619j.m128118o(context, new Object());
        setReactions(c24619j);
        m56096C("0", 30, 3000L);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (!m56093s(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25043p1 binding = getBinding();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ReactionButton reactionButton = binding.f120179q;
        AbstractC19074t.m100207e(reactionButton, "btnReaction");
        AbstractC26112n.m134382W(reactionButton, measuredHeight, measuredWidth);
        ReactionCount reactionCount = binding.f120182t;
        AbstractC19074t.m100207e(reactionCount, "txtReaction");
        if (AbstractC26112n.m134378S(reactionCount)) {
            int left = binding.f120179q.getLeft();
            int top = binding.f120179q.getTop();
            ReactionCount reactionCount2 = binding.f120182t;
            AbstractC19074t.m100207e(reactionCount2, "txtReaction");
            AbstractC26112n.m134381V(reactionCount2, top, left);
        }
        LottieImageView lottieImageView = binding.f120180r;
        AbstractC19074t.m100207e(lottieImageView, "livReaction");
        if (AbstractC26112n.m134378S(lottieImageView)) {
            ReactionButton reactionButton2 = binding.f120179q;
            AbstractC19074t.m100207e(reactionButton2, "btnReaction");
            int m134422s = AbstractC26112n.m134422s(reactionButton2) - (binding.f120180r.getMeasuredWidth() / 2);
            ReactionButton reactionButton3 = binding.f120179q;
            AbstractC19074t.m100207e(reactionButton3, "btnReaction");
            int m134424t = AbstractC26112n.m134424t(reactionButton3) - (binding.f120180r.getMeasuredHeight() / 2);
            LottieImageView lottieImageView2 = binding.f120180r;
            AbstractC19074t.m100207e(lottieImageView2, "livReaction");
            AbstractC26112n.m134383X(lottieImageView2, m134424t, m134422s);
        }
        SimpleShadowTextView simpleShadowTextView = binding.f120181s;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtLiked");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            ReactionButton reactionButton4 = binding.f120179q;
            AbstractC19074t.m100207e(reactionButton4, "btnReaction");
            int m134422s2 = AbstractC26112n.m134422s(reactionButton4) - (binding.f120181s.getMeasuredWidth() / 2);
            int top2 = binding.f120179q.getTop() - this.f54549F;
            SimpleShadowTextView simpleShadowTextView2 = binding.f120181s;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtLiked");
            AbstractC26112n.m134383X(simpleShadowTextView2, top2, m134422s2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25043p1 binding = getBinding();
        ReactionButton reactionButton = binding.f120179q;
        AbstractC19074t.m100207e(reactionButton, "btnReaction");
        int i13 = this.f54553q;
        AbstractC26112n.m134387a0(reactionButton, i13, 1073741824, i13, 1073741824);
        ReactionCount reactionCount = binding.f120182t;
        AbstractC19074t.m100207e(reactionCount, "txtReaction");
        if (AbstractC26112n.m134378S(reactionCount)) {
            ReactionCount reactionCount2 = binding.f120182t;
            AbstractC19074t.m100207e(reactionCount2, "txtReaction");
            AbstractC26112n.m134387a0(reactionCount2, this.f54553q, 1073741824, 0, 0);
        }
        LottieImageView lottieImageView = binding.f120180r;
        AbstractC19074t.m100207e(lottieImageView, "livReaction");
        if (AbstractC26112n.m134378S(lottieImageView)) {
            LottieImageView lottieImageView2 = binding.f120180r;
            AbstractC19074t.m100207e(lottieImageView2, "livReaction");
            AbstractC26112n.m134387a0(lottieImageView2, 0, 0, 0, 0);
            if (binding.f120180r.getMeasuredWidth() > 0) {
                LottieImageView lottieImageView3 = binding.f120180r;
                AbstractC19074t.m100207e(lottieImageView3, "livReaction");
                AbstractC26112n.m134423s0(lottieImageView3, this.f54554r / binding.f120180r.getMeasuredWidth());
            }
        }
        SimpleShadowTextView simpleShadowTextView = binding.f120181s;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtLiked");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = binding.f120181s;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtLiked");
            AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, 0, 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (!m56093s(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final Long m56098p(Long l11, int i11) {
        if (l11 != null) {
            long longValue = l11.longValue() + i11;
            getBinding().f120181s.setText(AbstractC26105g.m134334a(longValue));
            m56076N();
            return Long.valueOf(longValue);
        }
        return null;
    }

    public final void setCallback(InterfaceC10806b interfaceC10806b) {
        this.f54552p = interfaceC10806b;
    }

    public final void setReactions(C24619j c24619j) {
        AbstractC19074t.m100208f(c24619j, "reactions");
        C25043p1 binding = getBinding();
        if (c24619j.isEmpty()) {
            ReactionButton reactionButton = binding.f120179q;
            AbstractC19074t.m100207e(reactionButton, "btnReaction");
            ReactionButton.m56054h(reactionButton, null, 0, 3, null);
            this.f54544A = null;
            return;
        }
        C24620k m128111f = c24619j.m128111f();
        binding.f120179q.m56057g(m128111f.m128119a(), m128111f.m128122d());
        this.f54544A = m128111f.m128121c();
        this.f54562z = c24619j;
    }

    /* renamed from: u */
    public final void m56099u() {
        ReactionCount reactionCount = getBinding().f120182t;
        AbstractC19074t.m100207e(reactionCount, "txtReaction");
        AbstractC26112n.m134367H(reactionCount);
    }

    /* renamed from: v */
    public final void m56100v() {
    }

    /* renamed from: w */
    public final void m56101w(boolean z11) {
        this.f54551H = z11;
        m56076N();
    }

    /* renamed from: z */
    public final boolean m56102z() {
        return false;
    }

    public /* synthetic */ ReactionLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        View.inflate(context, AbstractC27410e.zch_layout_reaction, this);
        setWillNotDraw(false);
        this.f54553q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_button_size);
        this.f54554r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_lottie_boom_size);
        this.f54555s = AbstractC26112n.m134434z(this, AbstractC27408c.zch_ic_heart_livestream_reaction_spark);
        this.f54556t = AbstractC26112n.m134434z(this, AbstractC27408c.zch_ic_heart_livestream_reaction_fly);
        this.f54557u = new int[]{AbstractC26112n.m134426u(this, AbstractC27406a.zch_red_r55), AbstractC26112n.m134426u(this, AbstractC27406a.zch_green_gr55), AbstractC26112n.m134426u(this, AbstractC27406a.zch_yellow_y55), AbstractC26112n.m134426u(this, AbstractC27406a.zch_blue_b55), AbstractC26112n.m134426u(this, AbstractC27406a.zch_orange_or55)};
        this.f54558v = new Handler(Looper.getMainLooper());
        this.f54559w = new C10807c();
        this.f54560x = new ArrayList();
        this.f54561y = new Random();
        this.f54545B = new Handler(Looper.getMainLooper());
        this.f54547D = 100;
        this.f54549F = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_8);
        m129210a = AbstractC24856m.m129210a(new C10810f());
        this.f54550G = m129210a;
    }
}
