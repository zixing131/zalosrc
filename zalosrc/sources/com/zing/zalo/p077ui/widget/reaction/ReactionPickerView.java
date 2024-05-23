package com.zing.zalo.p077ui.widget.reaction;

import ac.C0708i;
import ac.C0717m0;
import ac.C0732w;
import am.AbstractC0924m0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;
import en0.InterfaceC18494a;
import lb0.C22423y;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import p392oh.C24265l;
import ph.C24753f;
import ui0.C27280g;

/* loaded from: classes6.dex */
public class ReactionPickerView extends FrameLayout {

    /* renamed from: V */
    public static final int f71127V;

    /* renamed from: W */
    public static final int f71128W;

    /* renamed from: a0 */
    public static final int f71129a0;

    /* renamed from: b0 */
    static final int f71130b0;

    /* renamed from: c0 */
    static final int f71131c0;

    /* renamed from: d0 */
    static final int f71132d0;

    /* renamed from: e0 */
    static final int f71133e0;

    /* renamed from: f0 */
    public static final int f71134f0;

    /* renamed from: g0 */
    static Paint f71135g0;

    /* renamed from: h0 */
    static Drawable f71136h0;

    /* renamed from: i0 */
    static Drawable f71137i0;

    /* renamed from: j0 */
    static Drawable f71138j0;

    /* renamed from: k0 */
    static Drawable f71139k0;

    /* renamed from: l0 */
    static Drawable f71140l0;

    /* renamed from: m0 */
    static int f71141m0;

    /* renamed from: A */
    int f71142A;

    /* renamed from: B */
    int f71143B;

    /* renamed from: C */
    int f71144C;

    /* renamed from: D */
    int f71145D;

    /* renamed from: E */
    int f71146E;

    /* renamed from: F */
    int f71147F;

    /* renamed from: G */
    boolean f71148G;

    /* renamed from: H */
    boolean f71149H;

    /* renamed from: I */
    boolean f71150I;

    /* renamed from: J */
    boolean f71151J;

    /* renamed from: K */
    boolean f71152K;

    /* renamed from: L */
    boolean f71153L;

    /* renamed from: M */
    boolean f71154M;

    /* renamed from: N */
    Path f71155N;

    /* renamed from: O */
    ReactionScrollView f71156O;

    /* renamed from: P */
    int f71157P;

    /* renamed from: Q */
    int f71158Q;

    /* renamed from: R */
    int f71159R;

    /* renamed from: S */
    int f71160S;

    /* renamed from: T */
    float f71161T;

    /* renamed from: U */
    InterfaceC13747a f71162U;

    /* renamed from: p */
    int f71163p;

    /* renamed from: q */
    int f71164q;

    /* renamed from: r */
    int f71165r;

    /* renamed from: s */
    private final String f71166s;

    /* renamed from: t */
    ValueAnimator f71167t;

    /* renamed from: u */
    int f71168u;

    /* renamed from: v */
    int f71169v;

    /* renamed from: w */
    int f71170w;

    /* renamed from: x */
    int f71171x;

    /* renamed from: y */
    Drawable f71172y;

    /* renamed from: z */
    int f71173z;

    /* renamed from: com.zing.zalo.ui.widget.reaction.ReactionPickerView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13747a {
        /* renamed from: G8 */
        void mo62725G8(C24753f c24753f, String str);

        /* renamed from: Rp */
        void mo62726Rp();

        /* renamed from: WE */
        void mo62727WE(String str);

        /* renamed from: p2 */
        void mo62730p2();
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(50.0f);
        f71127V = m118742r;
        f71128W = AbstractC23136l9.m118742r(30.0f);
        f71129a0 = AbstractC23136l9.m118742r(24.0f);
        int m118742r2 = AbstractC23136l9.m118742r(0.0f);
        f71130b0 = m118742r2;
        f71131c0 = AbstractC23136l9.m118742r(0.0f);
        f71132d0 = AbstractC23136l9.m118742r(6.0f);
        f71133e0 = AbstractC23136l9.m118742r(6.0f);
        f71134f0 = m118742r + m118742r2;
        f71141m0 = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0132 A[EDGE_INSN: B:32:0x0132->B:25:0x0132 BREAK  A[LOOP:0: B:8:0x00ad->B:31:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReactionPickerView(Context context, int i11, boolean z11, String str, InterfaceC13747a interfaceC13747a, String str2) {
        super(context);
        int i12;
        final boolean z12;
        int i13;
        int i14;
        this.f71163p = f71132d0;
        this.f71164q = f71127V;
        this.f71165r = f71128W;
        this.f71167t = null;
        this.f71168u = 0;
        this.f71169v = 0;
        this.f71170w = 0;
        this.f71171x = 0;
        this.f71143B = 0;
        this.f71144C = 0;
        this.f71145D = 0;
        this.f71146E = 0;
        this.f71148G = false;
        this.f71149H = C24265l.m126676s().m126699o().m128544b();
        this.f71150I = false;
        this.f71151J = false;
        this.f71153L = false;
        this.f71158Q = 0;
        this.f71161T = 1.0f;
        m76809e(context);
        this.f71162U = interfaceC13747a;
        this.f71166s = str2;
        if (f71135g0 == null) {
            Paint paint = new Paint(1);
            f71135g0 = paint;
            paint.setColor(-2565928);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f71148G = true;
        }
        int min = Math.min(C24265l.m126676s().m126698n().size(), 6);
        int i15 = this.f71165r * min;
        final int m118722k0 = AbstractC23136l9.m118722k0() - AbstractC23222t7.f112514B;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC16802y.reaction_emoji_spacing);
        this.f71159R = Math.max(Math.min(dimensionPixelSize, (int) (((AbstractC23136l9.m118766z(getContext()) * 1.0f) / AbstractC23136l9.m118722k0()) * dimensionPixelSize)), this.f71163p);
        do {
            if (this.f71148G) {
                if (this.f71149H) {
                    i14 = this.f71159R + this.f71165r;
                } else {
                    i14 = 0;
                }
                this.f71147F = i14;
                int i16 = this.f71159R;
                int i17 = (i16 * 2) + i15 + ((min - 1) * i16) + i14;
                this.f71142A = i17;
                this.f71173z = i17 + this.f71163p + this.f71164q;
            } else {
                if (this.f71149H) {
                    i12 = this.f71159R + this.f71165r;
                } else {
                    i12 = 0;
                }
                this.f71147F = i12;
                int i18 = this.f71159R;
                int i19 = (i18 * 2) + i15 + ((min - 1) * i18) + i12;
                this.f71142A = i19;
                this.f71173z = i19;
            }
            if (this.f71173z > m118722k0) {
                int i21 = this.f71159R;
                int i22 = this.f71163p;
                if (i21 > i22) {
                    this.f71159R = i21 - AbstractC23222t7.f112550b;
                    i13 = this.f71165r;
                } else if (i22 > f71133e0) {
                    int i23 = i22 - AbstractC23222t7.f112550b;
                    this.f71163p = i23;
                    this.f71159R = i23;
                    z12 = true;
                    C22423y.m115857j(new InterfaceC18494a() { // from class: lb0.b0
                        @Override // en0.InterfaceC18494a
                        /* renamed from: V4 */
                        public final Object mo12V4() {
                            String m76810h;
                            m76810h = ReactionPickerView.this.m76810h(m118722k0, z12);
                            return m76810h;
                        }
                    });
                    if (this.f71173z <= m118722k0) {
                        break;
                    }
                } else {
                    int i24 = this.f71165r;
                    if (i24 > f71129a0) {
                        i13 = i24 - AbstractC23222t7.f112548a;
                        this.f71165r = i13;
                        this.f71164q = (i22 * 2) + i13;
                    }
                }
                i15 = i13 * min;
                z12 = true;
                C22423y.m115857j(new InterfaceC18494a() { // from class: lb0.b0
                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m76810h;
                        m76810h = ReactionPickerView.this.m76810h(m118722k0, z12);
                        return m76810h;
                    }
                });
                if (this.f71173z <= m118722k0) {
                }
            }
            z12 = false;
            C22423y.m115857j(new InterfaceC18494a() { // from class: lb0.b0
                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m76810h;
                    m76810h = ReactionPickerView.this.m76810h(m118722k0, z12);
                    return m76810h;
                }
            });
            if (this.f71173z <= m118722k0) {
            }
        } while (z12);
        this.f71157P = this.f71142A - this.f71147F;
        this.f71154M = z11;
        this.f71160S = i11;
        this.f71152K = i11 != -1;
        int i25 = this.f71159R;
        ReactionScrollView reactionScrollView = new ReactionScrollView(context, this.f71164q, this.f71165r, this.f71159R, i25, i25, interfaceC13747a, str2);
        this.f71156O = reactionScrollView;
        addView(reactionScrollView);
    }

    /* renamed from: c */
    public static void m76807c(int i11) {
        if (f71141m0 != i11) {
            f71141m0 = i11;
            m76808d();
        }
    }

    /* renamed from: d */
    private static void m76808d() {
        f71137i0 = null;
        f71136h0 = null;
        f71139k0 = null;
        f71138j0 = null;
        f71140l0 = null;
    }

    /* renamed from: e */
    private static void m76809e(Context context) {
        if (f71137i0 == null) {
            f71137i0 = AbstractC1388a.m6964f(context, AbstractC16803z.bg_reaction_bubble);
            f71136h0 = AbstractC1388a.m6964f(context, AbstractC16803z.icn_csc_reaction_remove_react);
            f71139k0 = AbstractC1388a.m6964f(context, AbstractC16803z.bg_reaction_arrow_down);
            f71138j0 = AbstractC1388a.m6964f(context, AbstractC16803z.bg_reaction_arrow_up);
            f71140l0 = C27280g.m139660c(context, AbstractC23322a.zds_ic_plus_line_24, AbstractC2807a.icon_02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ String m76810h(int i11, boolean z11) {
        return "ReactionPickerView width=" + this.f71173z + " screenWidth=" + i11 + " canDecreaseSize=" + z11 + " itemSpacing=" + this.f71159R;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m76811i(ValueAnimator valueAnimator) {
        setAnimScaleValue(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setAnimScaleValue(float f11) {
        this.f71161T = f11;
        postInvalidateOnAnimation(this.f71143B, this.f71144C, this.f71145D, this.f71146E);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Drawable bubbleDrawable = getBubbleDrawable();
        if (bubbleDrawable != null) {
            bubbleDrawable.setBounds(this.f71143B, this.f71144C, this.f71145D, this.f71146E);
            bubbleDrawable.draw(canvas);
        }
        if (this.f71152K) {
            this.f71172y.draw(canvas);
        }
        if (this.f71148G) {
            Drawable drawable = f71136h0;
            int i11 = this.f71143B;
            int i12 = this.f71142A + i11 + this.f71163p;
            int i13 = this.f71144C;
            drawable.setBounds(i12, i13, i11 + this.f71173z, this.f71164q + i13);
            f71136h0.draw(canvas);
        }
        if (this.f71149H && f71140l0 != null) {
            canvas.save();
            int i14 = this.f71164q / 2;
            int i15 = this.f71165r;
            int i16 = i14 - (i15 / 2);
            int i17 = i16 + i15;
            int i18 = this.f71143B;
            int i19 = this.f71142A;
            int i21 = (i18 + i19) - i15;
            int i22 = this.f71159R;
            int i23 = i21 - i22;
            this.f71168u = i23;
            this.f71169v = i16;
            int i24 = (i18 + i19) - i22;
            this.f71170w = i24;
            this.f71171x = i17;
            f71140l0.setBounds(i23, i16, i24, i17);
            float f11 = this.f71161T;
            canvas.scale(f11, f11, (this.f71168u + this.f71170w) / 2.0f, (this.f71169v + this.f71171x) / 2.0f);
            f71140l0.draw(canvas);
            canvas.restore();
        }
        Path path = this.f71155N;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: f */
    boolean m76812f(float f11, float f12) {
        int i11 = (this.f71143B + this.f71142A) - this.f71147F;
        int i12 = this.f71163p;
        if (f11 >= i11 - i12 && f11 <= ((r0 + r1) - this.f71159R) + i12) {
            int i13 = this.f71144C;
            if (f12 >= i13 - i12 && f12 <= i13 + this.f71164q + i12) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    boolean m76813g(float f11, float f12) {
        int i11 = this.f71143B;
        if (f11 >= this.f71142A + i11 + this.f71163p && f11 <= i11 + this.f71173z) {
            if (f12 >= this.f71144C && f12 <= r4 + this.f71164q) {
                return true;
            }
        }
        return false;
    }

    public Drawable getBubbleDrawable() {
        return f71137i0;
    }

    public InterfaceC13747a getListener() {
        return this.f71162U;
    }

    public int getReactionBarWidth() {
        return this.f71173z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0708i c0708i = new C0708i();
        c0708i.m1075f("src", this.f71166s);
        if (this.f71149H && AbstractC0924m0.m3219L8()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.2f);
            this.f71167t = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lb0.c0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ReactionPickerView.this.m76811i(valueAnimator);
                }
            });
            this.f71167t.setDuration(300L);
            this.f71167t.setRepeatMode(2);
            this.f71167t.setRepeatCount(-1);
            this.f71167t.start();
        }
        C0717m0.Companion.m1125a().m1123q("reaction_picker_view", "", 0L, 0L, 0L, c0708i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f71167t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f71167t.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int m118742r;
        int m118766z = (AbstractC23136l9.m118766z(getContext()) - this.f71173z) / 2;
        this.f71143B = m118766z;
        this.f71145D = m118766z + this.f71142A;
        if (this.f71154M) {
            i15 = f71130b0;
        } else {
            i15 = 0;
        }
        this.f71144C = i15;
        this.f71146E = i15 + this.f71164q;
        if (getResources().getConfiguration().orientation == 2 && this.f71152K) {
            int i16 = this.f71160S;
            if (i16 > this.f71145D) {
                int i17 = i16 + this.f71159R;
                this.f71145D = i17;
                this.f71143B = i17 - this.f71142A;
            } else if (i16 < this.f71143B) {
                int i18 = (i16 - f71131c0) - this.f71159R;
                if (this.f71148G) {
                    m118742r = AbstractC23136l9.m118742r(6.0f);
                } else {
                    m118742r = AbstractC23136l9.m118742r(1.0f);
                }
                int i19 = i18 - m118742r;
                this.f71143B = i19;
                this.f71145D = i19 + this.f71142A;
            }
        }
        if (this.f71152K) {
            int i21 = this.f71160S;
            int i22 = f71131c0;
            this.f71160S = i21 - i22;
            int min = Math.min(Math.max(this.f71143B + this.f71159R + AbstractC23136l9.m118742r(1.0f), this.f71160S), (((this.f71143B + this.f71142A) - this.f71159R) - AbstractC23136l9.m118742r(1.0f)) - i22);
            this.f71160S = min;
            if (this.f71154M) {
                Drawable drawable = f71138j0;
                this.f71172y = drawable;
                drawable.setBounds(min, 0, i22 + min, f71130b0);
            } else {
                Drawable drawable2 = f71139k0;
                this.f71172y = drawable2;
                drawable2.setBounds(min, this.f71146E, i22 + min, this.f71164q + f71130b0);
            }
        }
        this.f71158Q = this.f71143B;
        this.f71157P = this.f71142A - this.f71147F;
        Path path = new Path();
        this.f71155N = path;
        RectF rectF = new RectF(this.f71143B, this.f71144C, this.f71145D, this.f71146E);
        int i23 = this.f71164q;
        path.addRoundRect(rectF, i23 / 2.0f, i23 / 2.0f, Path.Direction.CW);
        ReactionScrollView reactionScrollView = this.f71156O;
        int i24 = this.f71158Q;
        reactionScrollView.layout(i24, this.f71144C, this.f71157P + i24, this.f71146E);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        if (this.f71152K) {
            i13 = f71134f0;
        } else {
            i13 = this.f71164q;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), i13);
        this.f71156O.measure(this.f71157P, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC13747a interfaceC13747a;
        InterfaceC13747a interfaceC13747a2;
        try {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (m76813g(motionEvent.getX(), motionEvent.getY()) && this.f71150I && (interfaceC13747a2 = this.f71162U) != null && !this.f71153L) {
                        interfaceC13747a2.mo62726Rp();
                        this.f71162U.mo62730p2();
                        this.f71153L = true;
                        C0732w.Companion.m1189a().m1187q("reaction_remove_all", this.f71166s, null, null);
                    } else if (m76812f(motionEvent.getX(), motionEvent.getY()) && this.f71151J && (interfaceC13747a = this.f71162U) != null && !this.f71153L) {
                        interfaceC13747a.mo62730p2();
                        this.f71162U.mo62727WE(this.f71166s);
                        this.f71153L = true;
                        AbstractC0924m0.m3224Ld(false);
                    }
                }
            } else {
                this.f71150I = m76813g(motionEvent.getX(), motionEvent.getY());
                this.f71151J = m76812f(motionEvent.getX(), motionEvent.getY());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!this.f71150I && !this.f71151J) {
            return false;
        }
        return true;
    }
}
