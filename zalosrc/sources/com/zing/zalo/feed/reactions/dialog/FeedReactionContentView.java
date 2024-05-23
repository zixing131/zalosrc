package com.zing.zalo.feed.reactions.dialog;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ZAppCompatImageView;
import as.InterfaceC2332g;
import com.zing.zalo.feed.reactions.dialog.FeedReactionContentView;
import com.zing.zalo.p077ui.widget.C13637g0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23222t7;
import me0.C23081g9;
import p167fs.C19136a;
import p516t3.C26469c;
import p516t3.EnumC26468b;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class FeedReactionContentView extends ViewGroup {
    public static final C8842a Companion = new C8842a(null);

    /* renamed from: G */
    private static final int f47233G = AbstractC23222t7.f112532K;

    /* renamed from: H */
    private static final int f47234H = AbstractC23222t7.f112534M;

    /* renamed from: I */
    private static final int f47235I = AbstractC23222t7.f112549a0;

    /* renamed from: J */
    private static final int f47236J;

    /* renamed from: K */
    private static final int f47237K;

    /* renamed from: L */
    private static final int f47238L;

    /* renamed from: M */
    private static final int f47239M;

    /* renamed from: A */
    private float f47240A;

    /* renamed from: B */
    private float f47241B;

    /* renamed from: C */
    private Map f47242C;

    /* renamed from: D */
    private int f47243D;

    /* renamed from: E */
    private int[] f47244E;

    /* renamed from: F */
    private Rect f47245F;

    /* renamed from: p */
    private final HandlerC8847f f47246p;

    /* renamed from: q */
    private InterfaceC2332g f47247q;

    /* renamed from: r */
    private final float f47248r;

    /* renamed from: s */
    private final int f47249s;

    /* renamed from: t */
    private final float f47250t;

    /* renamed from: u */
    private List f47251u;

    /* renamed from: v */
    private final List f47252v;

    /* renamed from: w */
    private List f47253w;

    /* renamed from: x */
    private int f47254x;

    /* renamed from: y */
    private int f47255y;

    /* renamed from: z */
    private boolean f47256z;

    /* renamed from: com.zing.zalo.feed.reactions.dialog.FeedReactionContentView$a */
    /* loaded from: classes4.dex */
    public static final class C8842a {
        private C8842a() {
        }

        public /* synthetic */ C8842a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m47255a() {
            return FeedReactionContentView.f47235I;
        }

        /* renamed from: b */
        public final int m47256b() {
            return (FeedReactionContentView.f47237K * 2) + (FeedReactionContentView.f47234H * 6) + (FeedReactionContentView.f47236J * 5);
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.dialog.FeedReactionContentView$b */
    /* loaded from: classes4.dex */
    public static final class C8843b implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f47258q;

        C8843b(int i11) {
            this.f47258q = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m47257a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public void m47257a() {
            InterfaceC2332g interfaceC2332g = FeedReactionContentView.this.f47247q;
            if (interfaceC2332g != null) {
                interfaceC2332g.mo12287b(this.f47258q);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.dialog.FeedReactionContentView$c */
    /* loaded from: classes4.dex */
    public static final class C8844c implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ int f47260q;

        public C8844c(int i11) {
            this.f47260q = i11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            FeedReactionContentView.this.f47242C.remove(Integer.valueOf(this.f47260q));
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
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.dialog.FeedReactionContentView$d */
    /* loaded from: classes4.dex */
    public static final class C8845d implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ int f47262q;

        public C8845d(int i11) {
            this.f47262q = i11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            FeedReactionContentView.this.f47242C.remove(Integer.valueOf(this.f47262q));
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

    /* renamed from: com.zing.zalo.feed.reactions.dialog.FeedReactionContentView$e */
    /* loaded from: classes4.dex */
    public static final class C8846e implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ int f47264q;

        /* renamed from: r */
        final /* synthetic */ ValueAnimator f47265r;

        public C8846e(int i11, ValueAnimator valueAnimator) {
            this.f47264q = i11;
            this.f47265r = valueAnimator;
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
            Map map = FeedReactionContentView.this.f47242C;
            AbstractC19074t.m100207e(map, "access$getCurrentPlayingAnimProperty$p(...)");
            map.put(Integer.valueOf(this.f47264q), this.f47265r);
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.dialog.FeedReactionContentView$f */
    /* loaded from: classes4.dex */
    public static final class HandlerC8847f extends Handler {
        HandlerC8847f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            super.handleMessage(message);
            if (message.what == 1) {
                C23081g9.m118410g(30L);
            }
        }
    }

    static {
        int i11 = AbstractC23222t7.f112572m;
        f47236J = i11;
        f47237K = AbstractC23222t7.f112576o;
        f47238L = AbstractC23222t7.f112549a0;
        f47239M = i11 / 2;
    }

    public /* synthetic */ FeedReactionContentView(Context context, List list, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, list, (i12 & 4) != 0 ? null : attributeSet, (i12 & 8) != 0 ? 0 : i11);
    }

    /* renamed from: A */
    private final void m47220A(int i11) {
        if (i11 < 0) {
            return;
        }
        C23081g9.m118410g(30L);
        C19136a.f95164a.m100438c((View) this.f47252v.get(i11), 0.7f, new C8843b(i11));
    }

    /* renamed from: B */
    private final void m47221B(MotionEvent motionEvent) {
        float f11;
        float f12 = -1.0f;
        if (this.f47240A == -1.0f) {
            if (motionEvent != null) {
                f11 = motionEvent.getRawX();
            } else {
                f11 = -1.0f;
            }
            this.f47240A = f11;
        }
        if (this.f47241B == -1.0f) {
            if (motionEvent != null) {
                f12 = motionEvent.getRawY();
            }
            this.f47241B = f12;
        }
    }

    /* renamed from: C */
    private final void m47222C() {
        int size = this.f47252v.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((Number) this.f47253w.get(i11)).floatValue() != 1.0f && !m47242m(i11)) {
                m47224F(this, i11, ((Number) this.f47253w.get(i11)).floatValue(), 1.0f, 0L, 8, null);
            }
        }
    }

    /* renamed from: E */
    private final void m47223E(final int i11, float f11, float f12, long j11) {
        if (i11 >= 0) {
            try {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
                ofFloat.setDuration(j11);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: as.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        FeedReactionContentView.m47225G(FeedReactionContentView.this, i11, valueAnimator);
                    }
                });
                AbstractC19074t.m100205c(ofFloat);
                ofFloat.addListener(new C8846e(i11, ofFloat));
                ofFloat.addListener(new C8845d(i11));
                ofFloat.addListener(new C8844c(i11));
                ofFloat.start();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: F */
    static /* synthetic */ void m47224F(FeedReactionContentView feedReactionContentView, int i11, float f11, float f12, long j11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            j11 = 150;
        }
        feedReactionContentView.m47223E(i11, f11, f12, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final void m47225G(FeedReactionContentView feedReactionContentView, int i11, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(feedReactionContentView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        List list = feedReactionContentView.f47253w;
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        list.set(i11, (Float) animatedValue);
        feedReactionContentView.m47226H();
        feedReactionContentView.m47229K();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m47226H() {
        float f11;
        float f12;
        int size = this.f47252v.size();
        float f13 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) this.f47252v.get(i11);
            float f14 = 1.0f;
            if (i11 != 0) {
                int i12 = i11 - 1;
                if (((Number) this.f47253w.get(i12)).floatValue() != 0.0f) {
                    f11 = ((Number) this.f47253w.get(i12)).floatValue();
                    if (((Number) this.f47253w.get(i11)).floatValue() != 0.0f) {
                        f14 = ((Number) this.f47253w.get(i11)).floatValue();
                    }
                    if (i11 != 0) {
                        f12 = 0.0f;
                    } else {
                        f12 = f47234H * f11;
                    }
                    f13 += f12;
                    float f15 = f47237K + f13 + (f47236J * i11);
                    C8842a c8842a = Companion;
                    float m47255a = c8842a.m47255a();
                    int i13 = f47234H;
                    zAppCompatImageView.layout((int) f15, (int) (m47255a - (i13 * f14)), (int) ((i13 * f14) + f15), c8842a.m47255a());
                }
            }
            f11 = 1.0f;
            if (((Number) this.f47253w.get(i11)).floatValue() != 0.0f) {
            }
            if (i11 != 0) {
            }
            f13 += f12;
            float f152 = f47237K + f13 + (f47236J * i11);
            C8842a c8842a2 = Companion;
            float m47255a2 = c8842a2.m47255a();
            int i132 = f47234H;
            zAppCompatImageView.layout((int) f152, (int) (m47255a2 - (i132 * f14)), (int) ((i132 * f14) + f152), c8842a2.m47255a());
        }
    }

    /* renamed from: I */
    private final void m47227I() {
        this.f47240A = -1.0f;
        this.f47241B = -1.0f;
    }

    /* renamed from: J */
    private final void m47228J() {
        this.f47255y = -1;
        this.f47254x = -1;
        this.f47243D = -1;
        m47227I();
    }

    /* renamed from: K */
    private final void m47229K() {
        float floatValue;
        int m104529e;
        int size = this.f47252v.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((Number) this.f47253w.get(i11)).floatValue() == 0.0f) {
                floatValue = 1.0f;
            } else {
                floatValue = ((Number) this.f47253w.get(i11)).floatValue();
            }
            Drawable drawable = (Drawable) this.f47251u.get(i11);
            if (drawable instanceof C26469c) {
                ((C26469c) drawable).m136413o(floatValue, 1.0f, EnumC26468b.UP);
            } else if (drawable instanceof C13637g0) {
                m104529e = AbstractC20104d.m104529e(40 * floatValue);
                ((C13637g0) drawable).m76238a(m104529e);
            }
        }
    }

    /* renamed from: j */
    private final void m47239j() {
        for (Drawable drawable : this.f47251u) {
            if (drawable instanceof C26469c) {
                ((C26469c) drawable).m136419u();
            }
        }
    }

    /* renamed from: k */
    private final int m47240k(float f11, float f12, boolean z11) {
        int i11;
        boolean z12;
        if (z11) {
            i11 = f47238L;
        } else {
            i11 = 0;
        }
        int i12 = f47239M;
        int size = this.f47252v.size();
        for (int i13 = 0; i13 < size; i13++) {
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) this.f47252v.get(i13);
            zAppCompatImageView.getLocationOnScreen(this.f47244E);
            Rect rect = this.f47245F;
            int[] iArr = this.f47244E;
            int i14 = iArr[0];
            rect.left = i14;
            boolean z13 = true;
            rect.top = iArr[1];
            rect.right = i14 + zAppCompatImageView.getWidth();
            rect.bottom = this.f47244E[1] + zAppCompatImageView.getHeight();
            Rect rect2 = this.f47245F;
            if (f11 >= rect2.left - i12 && f11 <= rect2.right + i12) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (f12 < rect2.top - i11 || f12 > rect2.bottom + i11) {
                z13 = false;
            }
            if (z12 && z13) {
                return i13;
            }
        }
        return -1;
    }

    /* renamed from: l */
    static /* synthetic */ int m47241l(FeedReactionContentView feedReactionContentView, float f11, float f12, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return feedReactionContentView.m47240k(f11, f12, z11);
    }

    /* renamed from: m */
    private final boolean m47242m(int i11) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f47242C.get(Integer.valueOf(i11));
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m47243n(MotionEvent motionEvent) {
        float f11 = this.f47240A;
        if (f11 == -1.0f || this.f47241B == -1.0f) {
            return false;
        }
        float abs = Math.abs(f11 - motionEvent.getRawX());
        float abs2 = Math.abs(this.f47241B - motionEvent.getRawY());
        int i11 = AbstractC23222t7.f112556e;
        if (abs <= i11 && abs2 <= i11) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private final boolean m47244p(MotionEvent motionEvent) {
        Object m131205e0;
        if (this.f47252v.isEmpty()) {
            return true;
        }
        int i11 = f47238L;
        m131205e0 = AbstractC25332a0.m131205e0(this.f47252v);
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) m131205e0;
        zAppCompatImageView.getLocationOnScreen(this.f47244E);
        Rect rect = this.f47245F;
        int[] iArr = this.f47244E;
        boolean z11 = false;
        int i12 = iArr[0];
        rect.left = i12;
        rect.top = iArr[1];
        rect.right = i12 + zAppCompatImageView.getWidth();
        rect.bottom = this.f47244E[1] + zAppCompatImageView.getHeight();
        if (motionEvent.getRawY() >= this.f47245F.top - i11 && motionEvent.getRawY() <= this.f47245F.bottom + i11) {
            z11 = true;
        }
        return !z11;
    }

    /* renamed from: q */
    private final boolean m47245q(MotionEvent motionEvent) {
        if (m47240k(motionEvent.getRawX(), motionEvent.getRawY(), false) == -1 && !m47243n(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private final void m47246r(MotionEvent motionEvent) {
        int m47241l = m47241l(this, motionEvent.getRawX(), motionEvent.getRawY(), false, 4, null);
        this.f47254x = m47241l;
        if (m47241l != -1) {
            postDelayed(new Runnable() { // from class: as.b
                @Override // java.lang.Runnable
                public final void run() {
                    FeedReactionContentView.m47247s(FeedReactionContentView.this);
                }
            }, 120L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m47247s(FeedReactionContentView feedReactionContentView) {
        AbstractC19074t.m100208f(feedReactionContentView, "this$0");
        int i11 = feedReactionContentView.f47254x;
        if (i11 != -1 && i11 != feedReactionContentView.f47255y) {
            feedReactionContentView.m47252z(i11);
        }
    }

    /* renamed from: u */
    private final void m47248u(MotionEvent motionEvent) {
        boolean z11;
        this.f47254x = m47241l(this, motionEvent.getRawX(), motionEvent.getRawY(), false, 4, null);
        m47221B(motionEvent);
        if (motionEvent.getEventTime() - motionEvent.getDownTime() > ViewConfiguration.getTapTimeout()) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.f47254x;
        if (i11 != -1 && i11 != this.f47255y && m47245q(motionEvent) && z11) {
            m47252z(this.f47254x);
            this.f47246p.removeMessages(1);
            this.f47246p.sendEmptyMessageDelayed(1, 50L);
            this.f47255y = this.f47254x;
            return;
        }
        if (m47244p(motionEvent)) {
            m47222C();
            this.f47255y = -1;
        }
    }

    /* renamed from: v */
    private final void m47249v(MotionEvent motionEvent) {
        if (m47245q(motionEvent)) {
            if (this.f47254x >= 0) {
                int m47241l = m47241l(this, motionEvent.getRawX(), motionEvent.getRawY(), false, 4, null);
                int i11 = this.f47254x;
                if (m47241l == i11 && i11 < this.f47252v.size()) {
                    m47220A(this.f47254x);
                    this.f47254x = -1;
                    return;
                }
            }
            if (this.f47256z) {
                m47251x();
                return;
            }
        }
        m47228J();
        this.f47246p.postDelayed(new Runnable() { // from class: as.a
            @Override // java.lang.Runnable
            public final void run() {
                FeedReactionContentView.m47250w(FeedReactionContentView.this);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m47250w(FeedReactionContentView feedReactionContentView) {
        AbstractC19074t.m100208f(feedReactionContentView, "this$0");
        feedReactionContentView.m47222C();
    }

    /* renamed from: x */
    private final void m47251x() {
        InterfaceC2332g interfaceC2332g = this.f47247q;
        if (interfaceC2332g != null) {
            interfaceC2332g.mo12286a();
        }
    }

    /* renamed from: z */
    private final void m47252z(int i11) {
        float f11;
        int size = this.f47252v.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == i11) {
                f11 = this.f47250t;
            } else {
                f11 = this.f47248r;
            }
            m47224F(this, i12, ((Number) this.f47253w.get(i12)).floatValue(), f11, 0L, 8, null);
        }
        this.f47256z = true;
    }

    /* renamed from: D */
    public final void m47253D(MotionEvent motionEvent) {
        int i11;
        Integer num;
        if (motionEvent != null) {
            try {
                i11 = motionEvent.getPointerId(0);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return;
            }
        } else {
            i11 = -1;
        }
        int i12 = this.f47243D;
        if (i12 != -1 && i12 != i11) {
            return;
        }
        this.f47243D = i11;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            m47246r(motionEvent);
            return;
        }
        if (num.intValue() == 1) {
            m47249v(motionEvent);
            return;
        }
        if (num != null && num.intValue() == 2) {
            m47248u(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        m47226H();
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        C8842a c8842a = Companion;
        setMeasuredDimension(c8842a.m47256b(), c8842a.m47255a());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m47253D(motionEvent);
        return true;
    }

    public final void setOnFeedReactionSelectedListener(InterfaceC2332g interfaceC2332g) {
        this.f47247q = interfaceC2332g;
    }

    /* renamed from: y */
    public final void m47254y() {
        m47239j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedReactionContentView(Context context, List list, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        List m131502j;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(list, "listReactionDrawable");
        this.f47246p = new HandlerC8847f(Looper.getMainLooper());
        float f11 = f47233G;
        int i12 = f47234H;
        this.f47248r = f11 / i12;
        int i13 = f47235I;
        this.f47249s = i13;
        this.f47250t = i13 / i12;
        m131502j = AbstractC25368s.m131502j();
        this.f47251u = m131502j;
        this.f47252v = new ArrayList();
        this.f47253w = new ArrayList();
        this.f47254x = -1;
        this.f47255y = -1;
        this.f47240A = -1.0f;
        this.f47241B = -1.0f;
        this.f47242C = Collections.synchronizedMap(new LinkedHashMap());
        this.f47243D = -1;
        ArrayList<Drawable> arrayList = new ArrayList();
        arrayList.addAll(list);
        this.f47251u = arrayList;
        for (Drawable drawable : arrayList) {
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(context);
            zAppCompatImageView.setAdjustViewBounds(true);
            zAppCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            zAppCompatImageView.setImageDrawable(drawable);
            this.f47252v.add(zAppCompatImageView);
            this.f47253w.add(Float.valueOf(1.0f));
            addView(zAppCompatImageView);
            if (drawable instanceof C26469c) {
                C26469c c26469c = (C26469c) drawable;
                c26469c.m136414p(true);
                c26469c.m136418t();
            } else if (drawable instanceof C13637g0) {
                ((C13637g0) drawable).m76238a(40);
            }
        }
        this.f47244E = new int[2];
        this.f47245F = new Rect(0, 0, 0, 0);
    }
}
