package com.zing.zalo.p077ui.widget.liveemoji;

import ag0.C0824j;
import am.AbstractC0939u;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.custom.floating.FloatingController;
import com.zing.zalo.p077ui.widget.EmojiView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton;
import kg.C21709f;
import kg.C21711h;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p394oj.C24277c;

/* loaded from: classes6.dex */
public class LiveEmojiButton extends RelativeLayout implements FloatingController.InterfaceC11856a, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d0 */
    public static final int f70632d0 = AbstractC23136l9.m118742r(90.0f);

    /* renamed from: e0 */
    public static final int f70633e0 = AbstractC23136l9.m118742r(50.0f);

    /* renamed from: f0 */
    public static final int f70634f0 = AbstractC23136l9.m118742r(5.0f);

    /* renamed from: g0 */
    public static final int f70635g0 = AbstractC23136l9.m118742r(40.0f);

    /* renamed from: h0 */
    static final int f70636h0 = AbstractC23136l9.m118742r(36.0f);

    /* renamed from: i0 */
    public static final int f70637i0 = AbstractC23136l9.m118742r(18.0f);

    /* renamed from: A */
    LiveEmojiButton f70638A;

    /* renamed from: B */
    private boolean f70639B;

    /* renamed from: C */
    float f70640C;

    /* renamed from: D */
    float f70641D;

    /* renamed from: E */
    float f70642E;

    /* renamed from: F */
    boolean f70643F;

    /* renamed from: G */
    boolean f70644G;

    /* renamed from: H */
    boolean f70645H;

    /* renamed from: I */
    float f70646I;

    /* renamed from: J */
    float f70647J;

    /* renamed from: K */
    AnimatorSet f70648K;

    /* renamed from: L */
    boolean f70649L;

    /* renamed from: M */
    float f70650M;

    /* renamed from: N */
    public boolean f70651N;

    /* renamed from: O */
    AnimatorSet f70652O;

    /* renamed from: P */
    boolean f70653P;

    /* renamed from: Q */
    RunnableC13680c f70654Q;

    /* renamed from: R */
    int f70655R;

    /* renamed from: S */
    RunnableC13681d f70656S;

    /* renamed from: T */
    RectF f70657T;

    /* renamed from: U */
    private float f70658U;

    /* renamed from: V */
    private int f70659V;

    /* renamed from: W */
    private int f70660W;

    /* renamed from: a0 */
    private boolean f70661a0;

    /* renamed from: b0 */
    public FloatingController f70662b0;

    /* renamed from: c0 */
    private final C21711h f70663c0;

    /* renamed from: p */
    final int f70664p;

    /* renamed from: q */
    float f70665q;

    /* renamed from: r */
    Handler f70666r;

    /* renamed from: s */
    Runnable f70667s;

    /* renamed from: t */
    boolean f70668t;

    /* renamed from: u */
    boolean f70669u;

    /* renamed from: v */
    int f70670v;

    /* renamed from: w */
    C24277c f70671w;

    /* renamed from: x */
    InterfaceC13682e f70672x;

    /* renamed from: y */
    EmojiView f70673y;

    /* renamed from: z */
    RobotoTextView f70674z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.liveemoji.LiveEmojiButton$a */
    /* loaded from: classes6.dex */
    public class RunnableC13678a implements Runnable {
        RunnableC13678a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveEmojiButton liveEmojiButton = LiveEmojiButton.this;
            liveEmojiButton.f70665q = 1.0f;
            liveEmojiButton.f70670v = 0;
            RobotoTextView robotoTextView = liveEmojiButton.f70674z;
            if (robotoTextView != null) {
                ObjectAnimator.ofFloat(robotoTextView, "alpha", 1.0f, 0.0f).setDuration(150L).start();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.liveemoji.LiveEmojiButton$b */
    /* loaded from: classes6.dex */
    class C13679b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ float f70676a;

        C13679b(float f11) {
            this.f70676a = f11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                AbstractC23309i.m121024Hs(this.f70676a);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.liveemoji.LiveEmojiButton$c */
    /* loaded from: classes6.dex */
    public class RunnableC13680c implements Runnable {

        /* renamed from: p */
        public int f70678p;

        RunnableC13680c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveEmojiButton liveEmojiButton = LiveEmojiButton.this;
            if (liveEmojiButton.f70653P && liveEmojiButton.f70638A.getParent() != null) {
                int i11 = this.f70678p;
                LiveEmojiButton liveEmojiButton2 = LiveEmojiButton.this;
                if (i11 == liveEmojiButton2.f70655R) {
                    liveEmojiButton2.f70653P = false;
                    liveEmojiButton2.performHapticFeedback(0);
                    LiveEmojiButton liveEmojiButton3 = LiveEmojiButton.this;
                    liveEmojiButton3.f70668t = false;
                    liveEmojiButton3.f70645H = false;
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    LiveEmojiButton.this.onTouchEvent(obtain);
                    obtain.recycle();
                    InterfaceC13682e interfaceC13682e = LiveEmojiButton.this.f70672x;
                    if (interfaceC13682e != null) {
                        interfaceC13682e.mo60450b();
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.liveemoji.LiveEmojiButton$d */
    /* loaded from: classes6.dex */
    public class RunnableC13681d implements Runnable {
        RunnableC13681d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveEmojiButton liveEmojiButton = LiveEmojiButton.this;
            if (liveEmojiButton.f70654Q == null) {
                liveEmojiButton.f70654Q = new RunnableC13680c();
            }
            LiveEmojiButton liveEmojiButton2 = LiveEmojiButton.this;
            RunnableC13680c runnableC13680c = liveEmojiButton2.f70654Q;
            int i11 = liveEmojiButton2.f70655R + 1;
            liveEmojiButton2.f70655R = i11;
            runnableC13680c.f70678p = i11;
            liveEmojiButton2.postDelayed(runnableC13680c, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.liveemoji.LiveEmojiButton$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC13682e {
        /* renamed from: b */
        void mo60450b();

        /* renamed from: c */
        void mo60451c();

        /* renamed from: d */
        int mo60452d();

        /* renamed from: e */
        void mo60453e(float f11);
    }

    public LiveEmojiButton(Context context, C24277c c24277c, int i11, int i12) {
        super(context);
        this.f70664p = ViewConfiguration.get(MainApplication.getAppContext()).getScaledTouchSlop();
        this.f70665q = 1.0f;
        this.f70666r = new Handler();
        this.f70667s = new RunnableC13678a();
        this.f70668t = true;
        this.f70669u = true;
        this.f70670v = 0;
        this.f70638A = this;
        this.f70639B = true;
        this.f70643F = false;
        this.f70644G = false;
        this.f70645H = false;
        this.f70649L = true;
        this.f70650M = 0.0f;
        this.f70651N = true;
        this.f70653P = false;
        this.f70654Q = null;
        this.f70655R = 0;
        this.f70656S = null;
        this.f70657T = new RectF();
        this.f70658U = 0.0f;
        this.f70661a0 = false;
        this.f70662b0 = new FloatingController(getContext(), this, 1500);
        this.f70663c0 = C21711h.m112058a(50.0d, 9.0d);
        LiveEmojiButton liveEmojiButton = this.f70638A;
        int i13 = f70634f0;
        liveEmojiButton.setPadding(i13, i13, i13, i13);
        this.f70671w = c24277c;
        EmojiView emojiView = new EmojiView(this.f70638A.getContext());
        this.f70673y = emojiView;
        emojiView.f69219v = true;
        emojiView.setEmojiSize(i12);
        this.f70673y.setData(this.f70671w.f117241b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams.addRule(11);
        addView(this.f70673y, layoutParams);
        RobotoTextView robotoTextView = new RobotoTextView(context);
        this.f70674z = robotoTextView;
        robotoTextView.setAlpha(0.0f);
        this.f70674z.setTextStyleBold(true);
        this.f70674z.setTextSize(1, 12.0f);
        this.f70674z.setTextColor(-1);
        this.f70674z.setGravity(17);
        this.f70674z.setPadding(0, 0, 0, AbstractC23136l9.m118742r(1.0f));
        AbstractC23136l9.m118696b1(this.f70674z, AbstractC11531v0.m62171M1());
        int i14 = f70636h0;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i14, i14);
        layoutParams2.addRule(9);
        layoutParams2.addRule(15);
        addView(this.f70674z, layoutParams2);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* renamed from: i */
    public /* synthetic */ void m76392i() {
        this.f70669u = true;
    }

    /* renamed from: j */
    private void m76393j() {
        float f11;
        m76398g();
        AnimatorSet animatorSet = this.f70648K;
        if (animatorSet == null) {
            this.f70648K = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f70673y, "scaleX", 1.0f, 0.95f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f70673y, "scaleY", 1.0f, 0.95f, 1.0f);
            RobotoTextView robotoTextView = this.f70674z;
            float[] fArr = new float[3];
            fArr[0] = 1.0f;
            float f12 = 0.75f;
            if (this.f70670v <= 50) {
                f11 = 0.95f;
            } else {
                f11 = 0.75f;
            }
            fArr[1] = f11;
            fArr[2] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(robotoTextView, "scaleX", fArr);
            RobotoTextView robotoTextView2 = this.f70674z;
            float[] fArr2 = new float[3];
            fArr2[0] = 1.0f;
            if (this.f70670v <= 50) {
                f12 = 0.95f;
            }
            fArr2[1] = f12;
            fArr2[2] = 1.0f;
            this.f70648K.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(robotoTextView2, "scaleY", fArr2));
            this.f70648K.setDuration(200L);
        } else {
            animatorSet.cancel();
        }
        this.f70648K.start();
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: A */
    public void mo65911A(C21709f c21709f, C21709f c21709f2) {
        int i11;
        if (this.f70639B && this.f70643F) {
            this.f70643F = false;
            InterfaceC13682e interfaceC13682e = this.f70672x;
            if (interfaceC13682e != null) {
                i11 = interfaceC13682e.mo60452d();
            } else {
                i11 = 1;
            }
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f70662b0.m65897q(this.f70658U, this.f70647J);
                    return;
                }
                if (i11 == 2) {
                    double m65892i = this.f70662b0.m65892i() + ((int) (c21709f2.m112038j() / 10.0d));
                    RectF rectF = this.f70657T;
                    float f11 = rectF.top;
                    if (m65892i < f11) {
                        m65892i = f11;
                    } else {
                        float f12 = rectF.bottom;
                        if (m65892i > f12) {
                            m65892i = f12;
                        }
                    }
                    this.f70662b0.m65897q(this.f70658U, m65892i);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f70669u && this.f70645H) {
            m76393j();
            InterfaceC13682e interfaceC13682e2 = this.f70672x;
            if (interfaceC13682e2 != null) {
                interfaceC13682e2.mo60453e(this.f70665q);
            }
            float f13 = this.f70665q + 0.05f;
            this.f70665q = f13;
            this.f70665q = Math.min(f13, 3.0f);
            this.f70666r.removeCallbacks(this.f70667s);
            this.f70666r.postDelayed(this.f70667s, 300L);
            this.f70662b0.m65902v(this.f70658U, this.f70647J);
            return;
        }
        this.f70662b0.m65897q(this.f70658U, this.f70647J);
    }

    /* renamed from: b */
    boolean m76394b() {
        return this.f70668t && this.f70650M > 0.0f && this.f70645H;
    }

    /* renamed from: c */
    void m76395c() {
        this.f70653P = false;
        RunnableC13680c runnableC13680c = this.f70654Q;
        if (runnableC13680c != null) {
            removeCallbacks(runnableC13680c);
        }
        RunnableC13681d runnableC13681d = this.f70656S;
        if (runnableC13681d != null) {
            removeCallbacks(runnableC13681d);
        }
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: d */
    public void mo65912d(C21709f c21709f, C21709f c21709f2) {
        if (!this.f70639B) {
            return;
        }
        float m112033d = (float) c21709f.m112033d();
        animate().x(m112033d).y((float) c21709f2.m112033d()).setDuration(0L).start();
    }

    /* renamed from: e */
    public void m76396e(int i11) {
        if (this.f70669u) {
            this.f70669u = false;
            if (i11 >= 0) {
                this.f70666r.postDelayed(new Runnable() { // from class: gb0.a
                    public /* synthetic */ RunnableC19376a() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveEmojiButton.this.m76392i();
                    }
                }, i11);
            }
        }
    }

    /* renamed from: f */
    public void m76397f() {
        this.f70669u = true;
    }

    /* renamed from: g */
    void m76398g() {
        Drawable m62176N1;
        String str;
        int i11 = this.f70670v;
        int i12 = i11 + 1;
        this.f70670v = i12;
        RobotoTextView robotoTextView = this.f70674z;
        if (robotoTextView != null) {
            if (i12 == 1 || (i11 <= 50 && i12 > 50)) {
                if (i12 <= 50) {
                    m62176N1 = AbstractC11531v0.m62171M1();
                } else {
                    m62176N1 = AbstractC11531v0.m62176N1();
                }
                AbstractC23136l9.m118696b1(robotoTextView, m62176N1);
                this.f70648K = null;
            }
            RobotoTextView robotoTextView2 = this.f70674z;
            if (this.f70670v > 50) {
                str = "+50";
            } else {
                str = "" + this.f70670v;
            }
            robotoTextView2.setText(str);
            if (this.f70674z.getAlpha() == 0.0f) {
                ObjectAnimator.ofFloat(this.f70674z, "alpha", 0.0f, 1.0f).setDuration(150L).start();
            }
        }
    }

    public C24277c getEmoji() {
        return this.f70671w;
    }

    public EmojiView getEmojiView() {
        return this.f70673y;
    }

    /* renamed from: h */
    boolean m76399h(float f11, float f12) {
        int left = this.f70673y.getLeft();
        int i11 = f70634f0;
        if (f11 >= left - i11 && f11 <= this.f70673y.getRight() + i11 && f12 >= 0.0f && f12 <= this.f70638A.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m76400k(int i11) {
        this.f70652O = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f70673y, "scaleX", 1.0f, 1.15f, 1.0f);
        ofFloat.setRepeatCount(3);
        ofFloat.setRepeatMode(2);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f70673y, "scaleY", 1.0f, 1.15f, 1.0f);
        ofFloat2.setRepeatCount(3);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setDuration(300L);
        this.f70652O.playTogether(ofFloat, ofFloat2);
        this.f70652O.setStartDelay(i11);
        this.f70652O.start();
    }

    /* renamed from: l */
    public void m76401l(int i11, int i12) {
        this.f70673y.m75701c(i11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:            if (r0 > r4) goto L40;     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m76402m(float f11, float f12, float f13, float f14, float f15) {
        if (!this.f70661a0) {
            this.f70662b0.m65903w(this.f70663c0);
            this.f70659V = f70632d0;
            this.f70660W = f70633e0;
            RectF rectF = this.f70657T;
            rectF.left = f11;
            rectF.top = f12;
            rectF.right = f13;
            rectF.bottom = f14;
            this.f70662b0.m65900t(f11, f12, f13, f14);
            this.f70658U = f13;
            this.f70662b0.m65902v(f13, AbstractC23309i.m121934g8() + f14);
            this.f70661a0 = true;
        }
        RectF rectF2 = this.f70657T;
        if (rectF2.left == f11 && rectF2.top == f12 && rectF2.right == f13 && rectF2.bottom == f14) {
            this.f70650M = f15;
            return;
        }
        float m65892i = this.f70662b0.m65892i() - f12;
        RectF rectF3 = this.f70657T;
        float f16 = (((f14 - f12) * m65892i) / (rectF3.bottom - rectF3.top)) + f12;
        setTranslationY(getTranslationY() + (this.f70650M - f15));
        RectF rectF4 = this.f70657T;
        rectF4.left = f11;
        rectF4.top = f12;
        rectF4.right = f13;
        rectF4.bottom = f14;
        this.f70662b0.m65900t(f11, f12, f13, f14);
        double d11 = f16;
        double d12 = f12;
        if (d11 >= d12) {
            d12 = f14;
        }
        d11 = d12;
        this.f70662b0.m65897q(this.f70658U, d11);
        this.f70650M = f15;
    }

    /* renamed from: n */
    void m76403n() {
        if (this.f70653P) {
            return;
        }
        this.f70653P = true;
        if (this.f70656S == null) {
            this.f70656S = new RunnableC13681d();
        }
        postDelayed(this.f70656S, ViewConfiguration.getTapTimeout());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f70662b0.m65895m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f70651N) {
            C0824j.m2153b(new C13679b(getTranslationY()));
        }
        this.f70662b0.m65894l();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (isAttachedToWindow() && !this.f70661a0) {
            View view = (View) getParent();
            int width = view.getWidth();
            int height = view.getHeight();
            float f11 = width;
            this.f70658U = f11;
            RectF rectF = this.f70657T;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = f11;
            float f12 = height;
            rectF.bottom = f12;
            this.f70662b0.m65900t(0.0f, 0.0f, f11, f12);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            this.f70661a0 = false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        m76395c();
                    } else {
                        m76395c();
                        this.f70644G = true;
                    }
                } else if (m76394b()) {
                    float x11 = motionEvent.getX() - this.f70640C;
                    float y11 = motionEvent.getY() - this.f70641D;
                    if (this.f70643F || Math.abs(x11) > this.f70664p || Math.abs(y11) > this.f70664p) {
                        this.f70643F = true;
                        m76395c();
                        InterfaceC13682e interfaceC13682e = this.f70672x;
                        if (interfaceC13682e != null) {
                            interfaceC13682e.mo60451c();
                        }
                    }
                }
            } else {
                m76395c();
                AnimatorSet animatorSet = this.f70652O;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f70652O = null;
                }
            }
        } else {
            this.f70646I = getX();
            this.f70647J = getY();
            this.f70640C = motionEvent.getX();
            this.f70641D = motionEvent.getY();
            this.f70642E = getTranslationY();
            this.f70668t = true;
            this.f70643F = false;
            this.f70644G = false;
            boolean m76399h = m76399h(motionEvent.getX(), motionEvent.getY());
            this.f70645H = m76399h;
            if (m76399h) {
                m76403n();
            }
        }
        this.f70662b0.m65896n(motionEvent);
        return this.f70645H;
    }

    public void setAllowFlyingAnim(boolean z11) {
        this.f70639B = z11;
    }

    public void setEmoji(C24277c c24277c) {
        this.f70671w = c24277c;
        this.f70673y.setData(c24277c.f117241b);
        this.f70673y.invalidate();
    }

    public void setEmojiGrayscale(boolean z11) {
        if (z11) {
            this.f70673y.m75699a();
        } else {
            this.f70673y.m75700b();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        this.f70673y.setEnabled(false);
        super.setEnabled(z11);
    }

    public void setListener(InterfaceC13682e interfaceC13682e) {
        this.f70672x = interfaceC13682e;
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: x */
    public PointF mo65913x(float f11, float f12, MotionEvent motionEvent) {
        motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        RectF rectF = this.f70657T;
        float f13 = rectF.top;
        if (rawY >= f13) {
            float f14 = rawY - this.f70660W;
            float f15 = rectF.bottom;
            if (f14 <= f15) {
                if (f12 < f13) {
                    f12 = f13;
                } else if (f12 > f15) {
                    f12 = f15;
                }
                return new PointF(f11, f12);
            }
        }
        return new PointF(f11, this.f70662b0.m65892i());
    }

    @Override // com.zing.zalo.p077ui.custom.floating.FloatingController.InterfaceC11856a
    /* renamed from: z */
    public PointF mo65914z(PointF pointF) {
        if (pointF == null || (pointF.x == 0.0f && pointF.y == 0.0f)) {
            pointF = new PointF(1000.0f, 0.0f);
            if (this.f70662b0.m65891h() > this.f70658U) {
                pointF.x = -1000.0f;
            }
        }
        return pointF;
    }

    public LiveEmojiButton(Context context, C24277c c24277c) {
        this(context, c24277c, f70635g0, f70637i0);
    }
}
