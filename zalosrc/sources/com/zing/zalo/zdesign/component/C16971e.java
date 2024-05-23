package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import androidx.core.widget.AbstractC1640l;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.avatar.AbstractC16946b;
import com.zing.zalo.zdesign.component.avatar.AbstractC16950f;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import com.zing.zalo.zdesign.component.avatar.EnumC16947c;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import ei0.C18438c;
import ei0.InterfaceC18436a;
import ei0.InterfaceC18437b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji0.C21273a;
import ji0.C21274b;
import ln0.AbstractC22543l;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p193h0.AbstractC19694b;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import ri0.C25807a;
import ti0.C26706e;
import ui0.C27274a;
import ui0.C27275b;
import ui0.C27276c;
import ui0.C27280g;

/* renamed from: com.zing.zalo.zdesign.component.e */
/* loaded from: classes7.dex */
public class C16971e extends AbstractC16950f implements InterfaceC16976f1 {

    /* renamed from: A1 */
    private int[] f86692A1;

    /* renamed from: B1 */
    private int[] f86693B1;

    /* renamed from: C1 */
    private int f86694C1;

    /* renamed from: D1 */
    private C16977g f86695D1;

    /* renamed from: E1 */
    private boolean f86696E1;

    /* renamed from: F1 */
    private ValueAnimator f86697F1;

    /* renamed from: G1 */
    private ValueAnimator f86698G1;

    /* renamed from: H1 */
    private AbstractC16946b.a f86699H1;

    /* renamed from: I1 */
    private final InterfaceC24854k f86700I1;

    /* renamed from: J1 */
    private final InterfaceC24854k f86701J1;

    /* renamed from: N0 */
    private C25807a f86702N0;

    /* renamed from: O0 */
    private int f86703O0;

    /* renamed from: P0 */
    private C16716d f86704P0;

    /* renamed from: Q0 */
    private C21273a[] f86705Q0;

    /* renamed from: R0 */
    private AbstractC16946b[] f86706R0;

    /* renamed from: S0 */
    private Drawable f86707S0;

    /* renamed from: T0 */
    private String f86708T0;

    /* renamed from: U0 */
    private C21274b f86709U0;

    /* renamed from: V0 */
    private GradientDrawable f86710V0;

    /* renamed from: W0 */
    private List f86711W0;

    /* renamed from: X0 */
    private int f86712X0;

    /* renamed from: Y0 */
    private int f86713Y0;

    /* renamed from: Z0 */
    private int f86714Z0;

    /* renamed from: a1 */
    private boolean f86715a1;

    /* renamed from: b1 */
    private String f86716b1;

    /* renamed from: c1 */
    private String f86717c1;

    /* renamed from: d1 */
    public RectF f86718d1;

    /* renamed from: e1 */
    private int f86719e1;

    /* renamed from: f1 */
    private int f86720f1;

    /* renamed from: g1 */
    private Paint f86721g1;

    /* renamed from: h1 */
    private int f86722h1;

    /* renamed from: i1 */
    private boolean f86723i1;

    /* renamed from: j1 */
    private boolean f86724j1;

    /* renamed from: k1 */
    private boolean f86725k1;

    /* renamed from: l1 */
    private boolean f86726l1;

    /* renamed from: m1 */
    private int f86727m1;

    /* renamed from: n1 */
    private final RectF f86728n1;

    /* renamed from: o1 */
    private float f86729o1;

    /* renamed from: p1 */
    private final float f86730p1;

    /* renamed from: q1 */
    private final int f86731q1;

    /* renamed from: r1 */
    private Paint f86732r1;

    /* renamed from: s1 */
    private Paint f86733s1;

    /* renamed from: t1 */
    private boolean f86734t1;

    /* renamed from: u1 */
    private float f86735u1;

    /* renamed from: v1 */
    private boolean f86736v1;

    /* renamed from: w1 */
    private PathEffect f86737w1;

    /* renamed from: x1 */
    private float f86738x1;

    /* renamed from: y1 */
    private int[] f86739y1;

    /* renamed from: z1 */
    private int[] f86740z1;

    /* renamed from: com.zing.zalo.zdesign.component.e$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86741a;

        static {
            int[] iArr = new int[EnumC16947c.values().length];
            try {
                iArr[EnumC16947c.OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16947c.ONLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16947c.BLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC16947c.ADMIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC16947c.OWNER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC16947c.VERIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC16947c.OA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f86741a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.e$b */
    /* loaded from: classes7.dex */
    public static final class b implements AbstractC16946b.a {
        b() {
        }

        @Override // com.zing.zalo.zdesign.component.avatar.AbstractC16946b.a
        /* renamed from: a */
        public void mo90484a(AbstractC16946b abstractC16946b) {
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.e$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC18436a mo12V4() {
            C18438c c18438c = C18438c.f92957a;
            Context context = C16971e.this.getContext();
            AbstractC19074t.m100207e(context, "context");
            return c18438c.m97715a(context);
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.e$d */
    /* loaded from: classes7.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC18437b mo12V4() {
            C18438c c18438c = C18438c.f92957a;
            Context context = C16971e.this.getContext();
            AbstractC19074t.m100207e(context, "context");
            return c18438c.m97716b(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zdesign.component.e$e */
    /* loaded from: classes7.dex */
    public /* synthetic */ class e extends C19071q implements InterfaceC18509p {
        e(Object obj) {
            super(2, obj, C16971e.class, "onProfilesLoaded", "onProfilesLoaded(Ljava/util/List;Ljava/util/List;)V", 0);
        }

        /* renamed from: h */
        public final void m90914h(List list, List list2) {
            AbstractC19074t.m100208f(list, "p0");
            AbstractC19074t.m100208f(list2, "p1");
            ((C16971e) this.f94922q).m90863R1(list, list2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m90914h((List) obj, (List) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16971e(Context context, EnumC16949e enumC16949e) {
        this(context, enumC16949e.m90779c(context));
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(enumC16949e, "avatarSize");
    }

    /* renamed from: A1 */
    private final int m90858A1(Context context, int i11) {
        if (i11 == EnumC16949e.SIZE_16.m90779c(context)) {
            return 16;
        }
        if (i11 == EnumC16949e.SIZE_24.m90779c(context)) {
            return 12;
        }
        if (i11 == EnumC16949e.SIZE_32.m90779c(context)) {
            return 16;
        }
        if (i11 == EnumC16949e.SIZE_40.m90779c(context)) {
            return 20;
        }
        if (i11 == EnumC16949e.SIZE_48.m90779c(context)) {
            return 24;
        }
        if (i11 == EnumC16949e.SIZE_64.m90779c(context)) {
            return 20;
        }
        if (i11 == EnumC16949e.SIZE_96.m90779c(context)) {
            return 28;
        }
        EnumC16949e.SIZE_128.m90779c(context);
        return 32;
    }

    /* renamed from: K1 */
    private final float m90859K1() {
        TextView textView = new TextView(getContext());
        int i11 = this.f86712X0;
        if (this.f86703O0 != 1) {
            AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_xsmall);
        } else {
            EnumC16949e enumC16949e = EnumC16949e.SIZE_24;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            if (i11 < enumC16949e.m90779c(context)) {
                AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_xxsmall);
            } else {
                EnumC16949e enumC16949e2 = EnumC16949e.SIZE_32;
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                if (i11 < enumC16949e2.m90779c(context2)) {
                    AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_xsmall);
                } else {
                    EnumC16949e enumC16949e3 = EnumC16949e.SIZE_40;
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "context");
                    if (i11 < enumC16949e3.m90779c(context3)) {
                        AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_small);
                    } else {
                        EnumC16949e enumC16949e4 = EnumC16949e.SIZE_64;
                        Context context4 = getContext();
                        AbstractC19074t.m100207e(context4, "context");
                        if (i11 < enumC16949e4.m90779c(context4)) {
                            AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_medium);
                        } else {
                            EnumC16949e enumC16949e5 = EnumC16949e.SIZE_128;
                            Context context5 = getContext();
                            AbstractC19074t.m100207e(context5, "context");
                            if (i11 < enumC16949e5.m90779c(context5)) {
                                AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_large);
                            } else {
                                AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_xlarge);
                            }
                        }
                    }
                }
            }
        }
        return textView.getTextSize();
    }

    /* renamed from: M1 */
    private final void m90860M1() {
        Paint paint = new Paint(1);
        this.f86732r1 = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f86732r1;
        Paint paint3 = null;
        if (paint2 == null) {
            AbstractC19074t.m100223u("mProgressPaint");
            paint2 = null;
        }
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        Paint paint4 = this.f86732r1;
        if (paint4 == null) {
            AbstractC19074t.m100223u("mProgressPaint");
            paint4 = null;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        paint4.setColor(aVar.m13592a(context, AbstractC2807a.progress_indicator_white));
        Paint paint5 = this.f86732r1;
        if (paint5 == null) {
            AbstractC19074t.m100223u("mProgressPaint");
            paint5 = null;
        }
        paint5.setStrokeWidth(this.f86727m1);
        Paint paint6 = new Paint(1);
        this.f86733s1 = paint6;
        paint6.setStyle(style);
        Paint paint7 = this.f86733s1;
        if (paint7 == null) {
            AbstractC19074t.m100223u("mBackgroundPaint");
            paint7 = null;
        }
        paint7.setStrokeCap(cap);
        Paint paint8 = this.f86733s1;
        if (paint8 == null) {
            AbstractC19074t.m100223u("mBackgroundPaint");
            paint8 = null;
        }
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        paint8.setColor(aVar.m13592a(context2, AbstractC2807a.progress_track_background_white));
        Paint paint9 = this.f86733s1;
        if (paint9 == null) {
            AbstractC19074t.m100223u("mBackgroundPaint");
        } else {
            paint3 = paint9;
        }
        paint3.setStrokeWidth(this.f86727m1);
    }

    /* renamed from: P1 */
    private final void m90861P1(Canvas canvas) {
        Paint paint;
        if (this.f86734t1) {
            float f11 = this.f86727m1;
            float f12 = 2;
            float f13 = this.f86712X0 + (f12 * f11);
            float f14 = f11 / f12;
            float f15 = f13 - f14;
            this.f86728n1.set(f14, f14, f15, f15);
            float f16 = f13 / f12;
            float f17 = (f13 - f11) / f12;
            Paint paint2 = this.f86733s1;
            if (paint2 == null) {
                AbstractC19074t.m100223u("mBackgroundPaint");
                paint2 = null;
            }
            canvas.drawCircle(f16, f16, f17, paint2);
            RectF rectF = this.f86728n1;
            float f18 = this.f86729o1;
            float f19 = this.f86735u1;
            Paint paint3 = this.f86732r1;
            if (paint3 == null) {
                AbstractC19074t.m100223u("mProgressPaint");
                paint = null;
            } else {
                paint = paint3;
            }
            canvas.drawArc(rectF, f18, f19, false, paint);
        }
    }

    /* renamed from: Q1 */
    private final void m90862Q1(Canvas canvas) {
        canvas.save();
        if (this.f86726l1) {
            boolean z11 = this.f86736v1;
            if (!z11 && !this.f86724j1) {
                m90872t1(this.f86698G1);
                m90872t1(this.f86697F1);
            } else {
                if (z11) {
                    m90872t1(this.f86698G1);
                    m90865l2();
                } else {
                    m90872t1(this.f86697F1);
                    m90867n2();
                }
                float f11 = this.f86738x1;
                int i11 = this.f86712X0;
                canvas.rotate(f11, i11 / 2.0f, i11 / 2.0f);
            }
            this.f86721g1.setStrokeWidth(this.f86719e1);
            if (this.f86724j1) {
                canvas.drawArc(m90883I1(), 5.0f, 170.0f, false, this.f86721g1);
            } else {
                canvas.drawArc(m90883I1(), 0.0f, 360.0f, false, this.f86721g1);
            }
        }
        canvas.restore();
        if (this.f86736v1 || this.f86724j1) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R1 */
    public final void m90863R1(List list, List list2) {
        String str;
        String str2;
        boolean m127127w;
        try {
            try {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    m90873u1(intValue);
                    if (intValue < this.f86711W0.size()) {
                        C16948d mo88232c = m90874w1().mo88232c((String) this.f86711W0.get(intValue), this.f86696E1);
                        int i11 = 1;
                        String str3 = null;
                        if (mo88232c != null) {
                            str2 = mo88232c.m90775b();
                            if (TextUtils.isEmpty(str2)) {
                                str = null;
                            } else {
                                String mo88403b = m90875y1().mo88403b();
                                InterfaceC18436a m90874w1 = m90874w1();
                                AbstractC19074t.m100205c(str2);
                                if (m90874w1.mo88230a(str2)) {
                                    m127127w = AbstractC24341v.m127127w(mo88403b, mo88232c.m90777d(), false, 2, null);
                                    if (!m127127w) {
                                        String m90776c = mo88232c.m90776c();
                                        i11 = 3;
                                        str3 = mo88232c.m90777d();
                                        str = m90776c;
                                    }
                                }
                                str = null;
                                i11 = 2;
                            }
                        } else {
                            str = null;
                            str2 = null;
                        }
                        m90864T1(new C16948d(i11, str3, str, str2), intValue);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            postInvalidate();
        } catch (Throwable th2) {
            postInvalidate();
            throw th2;
        }
    }

    /* renamed from: T1 */
    private final void m90864T1(C16948d c16948d, int i11) {
        int m90774a = c16948d.m90774a();
        String m90777d = c16948d.m90777d();
        String m90776c = c16948d.m90776c();
        if (m90774a == 3 && m90777d != null && m90776c != null) {
            C27275b.a m139640a = C27275b.f128316a.m139640a(m90777d, false);
            C21273a c21273a = this.f86705Q0[i11];
            AbstractC19074t.m100205c(c21273a);
            C26706e.b bVar = C26706e.Companion;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            C26706e.d mo137297b = bVar.m137317a(context).mo137297b();
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            C26706e.e mo137296a = mo137297b.mo137300e(aVar.m13592a(context2, AbstractC2807a.text_04)).mo137298c(m90859K1()).mo137296a();
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            int m139647d = m139640a.m139647d(context3);
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            c21273a.mo111925v1(mo137296a.mo137299d(m90776c, m139647d, m139640a.m139646c(context4)));
            return;
        }
        if (m90774a == 2) {
            AbstractC16946b abstractC16946b = this.f86706R0[i11];
            AbstractC19074t.m100205c(abstractC16946b);
            abstractC16946b.mo88236g(this.f86705Q0[i11], c16948d.m90775b(), false, this.f86715a1);
        } else {
            C21273a c21273a2 = this.f86705Q0[i11];
            AbstractC19074t.m100205c(c21273a2);
            c21273a2.mo111925v1(this.f86707S0);
        }
    }

    /* renamed from: l2 */
    private final void m90865l2() {
        if (this.f86697F1 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
            this.f86697F1 = ofFloat;
            AbstractC19074t.m100205c(ofFloat);
            ofFloat.setDuration(5000L);
            ValueAnimator valueAnimator = this.f86697F1;
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.f86697F1;
            AbstractC19074t.m100205c(valueAnimator2);
            valueAnimator2.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimator3 = this.f86697F1;
            AbstractC19074t.m100205c(valueAnimator3);
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    C16971e.m90866m2(C16971e.this, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f86697F1;
        if (valueAnimator4 != null) {
            AbstractC19074t.m100205c(valueAnimator4);
            if (!valueAnimator4.isStarted()) {
                ValueAnimator valueAnimator5 = this.f86697F1;
                AbstractC19074t.m100205c(valueAnimator5);
                valueAnimator5.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m90866m2(C16971e c16971e, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c16971e, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c16971e.f86738x1 = ((Float) animatedValue).floatValue();
    }

    /* renamed from: n2 */
    private final void m90867n2() {
        if (this.f86698G1 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
            this.f86698G1 = ofFloat;
            AbstractC19074t.m100205c(ofFloat);
            ofFloat.setDuration(1000L);
            ValueAnimator valueAnimator = this.f86698G1;
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.f86698G1;
            AbstractC19074t.m100205c(valueAnimator2);
            valueAnimator2.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimator3 = this.f86698G1;
            AbstractC19074t.m100205c(valueAnimator3);
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    C16971e.m90868o2(C16971e.this, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f86698G1;
        if (valueAnimator4 != null) {
            AbstractC19074t.m100205c(valueAnimator4);
            if (!valueAnimator4.isStarted()) {
                ValueAnimator valueAnimator5 = this.f86698G1;
                AbstractC19074t.m100205c(valueAnimator5);
                valueAnimator5.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m90868o2(C16971e c16971e, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c16971e, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c16971e.f86738x1 = ((Float) animatedValue).floatValue();
    }

    /* renamed from: t1 */
    private final void m90872t1(ValueAnimator valueAnimator) {
        if (valueAnimator != null && valueAnimator.isStarted()) {
            valueAnimator.end();
        }
    }

    /* renamed from: u1 */
    private final void m90873u1(int i11) {
        AbstractC16946b abstractC16946b = this.f86706R0[i11];
        AbstractC19074t.m100205c(abstractC16946b);
        abstractC16946b.mo88237h();
    }

    /* renamed from: w1 */
    private final InterfaceC18436a m90874w1() {
        return (InterfaceC18436a) this.f86700I1.getValue();
    }

    /* renamed from: y1 */
    private final InterfaceC18437b m90875y1() {
        return (InterfaceC18437b) this.f86701J1.getValue();
    }

    /* renamed from: B1 */
    public final C21273a[] m90876B1() {
        return this.f86705Q0;
    }

    /* renamed from: C1 */
    public final List m90877C1() {
        return this.f86711W0;
    }

    /* renamed from: D1 */
    public final int m90878D1() {
        return this.f86712X0;
    }

    /* renamed from: E1 */
    public final int m90879E1() {
        return this.f86720f1;
    }

    /* renamed from: F1 */
    public final int m90880F1() {
        return this.f86713Y0;
    }

    /* renamed from: G1 */
    public final int m90881G1() {
        return this.f86714Z0;
    }

    /* renamed from: H1 */
    public final C21274b m90882H1() {
        return this.f86709U0;
    }

    /* renamed from: I1 */
    public final RectF m90883I1() {
        RectF rectF = this.f86718d1;
        if (rectF != null) {
            return rectF;
        }
        AbstractC19074t.m100223u("strokeRectF");
        return null;
    }

    /* renamed from: J1 */
    public final int m90884J1() {
        return this.f86719e1;
    }

    /* renamed from: L1 */
    public final int m90885L1() {
        return this.f86703O0;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: M0 */
    public void mo89109M0(C16719g.c cVar) {
        C25807a c25807a = this.f86702N0;
        if (c25807a == null || !c25807a.m133070c(cVar)) {
            super.mo89109M0(cVar);
        }
    }

    /* renamed from: N1 */
    public final void m90886N1(String str) {
        AbstractC19074t.m100208f(str, "avatar");
        this.f86711W0.clear();
        this.f86711W0.add(str);
        this.f86703O0 = 1;
        mo90906p2();
        m90909v1();
    }

    /* renamed from: O1 */
    public void mo90887O1(List list) {
        String m139636d;
        this.f86711W0.clear();
        if (list != null && !list.isEmpty()) {
            this.f86711W0.addAll(list);
        } else {
            this.f86711W0.add("");
        }
        this.f86708T0 = null;
        if (this.f86711W0.size() == 2 && AbstractC19074t.m100204b(this.f86711W0.get(1), "+1")) {
            this.f86703O0 = 5;
            this.f86711W0.remove(1);
            this.f86708T0 = "+1";
        } else if (this.f86711W0.size() == 4) {
            this.f86703O0 = 4;
            this.f86708T0 = null;
        } else if (this.f86711W0.size() >= 5) {
            this.f86703O0 = 4;
            InterfaceC18505l m90780o1 = m90780o1();
            C27274a c27274a = C27274a.f128311a;
            if (AbstractC19074t.m100204b(m90780o1, c27274a.m139634b())) {
                m139636d = c27274a.m139636d(this.f86711W0.size() - 3, m90780o1());
            } else {
                m139636d = c27274a.m139636d(this.f86711W0.size(), m90780o1());
            }
            this.f86708T0 = m139636d;
        } else {
            this.f86703O0 = this.f86711W0.size();
        }
        if (this.f86703O0 <= 0) {
            this.f86703O0 = 1;
        }
        mo90906p2();
        m90909v1();
    }

    /* renamed from: S1 */
    public final void m90888S1() {
        int length = this.f86705Q0.length;
        for (int i11 = 0; i11 < length; i11++) {
            C21273a c21273a = this.f86705Q0[i11];
            AbstractC19074t.m100205c(c21273a);
            c21273a.mo44614b1(8);
            C21273a c21273a2 = this.f86705Q0[i11];
            AbstractC19074t.m100205c(c21273a2);
            C16718f m89106L = c21273a2.m89106L();
            Boolean bool = Boolean.FALSE;
            m89106L.m89072y(bool).m89018B(bool).m89017A(bool).m89073z(bool).m89026J(false).m89031O(0);
        }
        this.f86709U0.mo44614b1(8);
        C16718f m89106L2 = this.f86709U0.m89106L();
        Boolean bool2 = Boolean.FALSE;
        m89106L2.m89073z(bool2).m89018B(bool2).m89017A(bool2).m89072y(bool2).m89026J(false).m89031O(0);
        C21273a c21273a3 = this.f86705Q0[0];
        AbstractC19074t.m100205c(c21273a3);
        c21273a3.m110190E1(this.f86727m1);
        this.f86709U0.m110194S1(this.f86727m1);
    }

    /* renamed from: U1 */
    public final void m90889U1(int i11) {
        m90873u1(0);
        this.f86703O0 = 1;
        C21273a c21273a = this.f86705Q0[0];
        AbstractC19074t.m100205c(c21273a);
        c21273a.mo111925v1(AbstractC19694b.m103336d(getContext(), i11));
        mo90906p2();
        invalidate();
    }

    /* renamed from: V1 */
    public final void m90890V1(PathEffect pathEffect) {
        AbstractC19074t.m100208f(pathEffect, "<set-?>");
        this.f86737w1 = pathEffect;
    }

    /* renamed from: W1 */
    public final void m90891W1(int i11) {
        this.f86722h1 = i11;
    }

    /* renamed from: X1 */
    public final void m90892X1(int i11) {
        this.f86720f1 = i11;
    }

    /* renamed from: Y1 */
    public final void m90893Y1(int i11) {
        this.f86713Y0 = i11;
    }

    /* renamed from: Z1 */
    public final void m90894Z1(int i11) {
        this.f86714Z0 = i11;
    }

    /* renamed from: a2 */
    public final void m90895a2(String str) {
        this.f86708T0 = str;
    }

    /* renamed from: b2 */
    public final void m90896b2(EnumC16947c enumC16947c) {
        AbstractC19074t.m100208f(enumC16947c, "status");
        this.f86695D1.mo44614b1(0);
        switch (a.f86741a[enumC16947c.ordinal()]) {
            case 1:
                this.f86695D1.mo44614b1(8);
                break;
            case 2:
                C16977g c16977g = this.f86695D1;
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                C16974f c16974f = new C16974f(context);
                c16974f.m90974x(EnumC16991i.USER_STATUS_ONLINE);
                c16974f.m90970t(true);
                c16977g.m90983u1(c16974f);
                break;
            case 3:
                C16977g c16977g2 = this.f86695D1;
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                C16974f c16974f2 = new C16974f(context2);
                c16974f2.m90974x(EnumC16991i.USER_STATUS_BLOCKED);
                c16974f2.m90970t(true);
                c16977g2.m90983u1(c16974f2);
                break;
            case 4:
                C16977g c16977g3 = this.f86695D1;
                Context context3 = getContext();
                AbstractC19074t.m100207e(context3, "context");
                C16974f c16974f3 = new C16974f(context3);
                c16974f3.m90974x(EnumC16991i.USER_STATUS_ADMIN);
                c16974f3.m90970t(true);
                c16977g3.m90983u1(c16974f3);
                break;
            case 5:
                C16977g c16977g4 = this.f86695D1;
                Context context4 = getContext();
                AbstractC19074t.m100207e(context4, "context");
                C16974f c16974f4 = new C16974f(context4);
                c16974f4.m90974x(EnumC16991i.USER_STATUS_OWNER);
                c16974f4.m90970t(true);
                c16977g4.m90983u1(c16974f4);
                break;
            case 6:
                C16977g c16977g5 = this.f86695D1;
                Context context5 = getContext();
                AbstractC19074t.m100207e(context5, "context");
                C16974f c16974f5 = new C16974f(context5);
                c16974f5.m90974x(EnumC16991i.USER_STATUS_VERIFIED);
                c16974f5.m90970t(true);
                c16977g5.m90983u1(c16974f5);
                break;
            case 7:
                C16977g c16977g6 = this.f86695D1;
                Context context6 = getContext();
                AbstractC19074t.m100207e(context6, "context");
                C16974f c16974f6 = new C16974f(context6);
                c16974f6.m90974x(EnumC16991i.OA);
                c16977g6.m90983u1(c16974f6);
                break;
        }
        mo90908r2();
        invalidate();
    }

    /* renamed from: c2 */
    public final void m90897c2(C16974f c16974f) {
        if (c16974f == null) {
            m90896b2(EnumC16947c.OFFLINE);
            return;
        }
        this.f86695D1.m90983u1(c16974f);
        this.f86695D1.mo44614b1(0);
        mo90908r2();
        invalidate();
    }

    /* renamed from: d2 */
    public final void m90898d2(int i11) {
        this.f86727m1 = i11;
    }

    /* renamed from: e2 */
    public final void m90899e2(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f86716b1 = str;
    }

    /* renamed from: f2 */
    public final void m90900f2(boolean z11) {
        this.f86736v1 = z11;
        if (z11) {
            this.f86721g1.setPathEffect(this.f86737w1);
            this.f86721g1.setStrokeCap(Paint.Cap.ROUND);
        } else {
            this.f86721g1.setPathEffect(null);
        }
        invalidate();
    }

    /* renamed from: g2 */
    public final void m90901g2(RectF rectF) {
        AbstractC19074t.m100208f(rectF, "<set-?>");
        this.f86718d1 = rectF;
    }

    /* renamed from: h2 */
    public final void m90902h2(int i11) {
        this.f86719e1 = i11;
    }

    /* renamed from: i2 */
    public final void m90903i2(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f86717c1 = str;
    }

    /* renamed from: j2 */
    public final void m90904j2(int i11) {
        this.f86703O0 = i11;
    }

    /* renamed from: k2 */
    public final void m90905k2(boolean z11, boolean z12) {
        boolean z13;
        int i11;
        int i12;
        if (z11) {
            try {
                int i13 = this.f86712X0;
                EnumC16949e enumC16949e = EnumC16949e.SIZE_24;
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                if (i13 <= enumC16949e.m90779c(context)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f86696E1 = z13;
                if (this.f86723i1) {
                    m90909v1();
                }
            } catch (Exception unused) {
                return;
            }
        }
        this.f86725k1 = z12;
        this.f86726l1 = z11;
        mo90908r2();
        if (z11) {
            if (this.f86724j1) {
                i11 = this.f86693B1[0];
            } else if (z12) {
                i11 = this.f86740z1[0];
            } else {
                i11 = this.f86692A1[0];
            }
        } else {
            i11 = this.f86739y1[0];
        }
        int i14 = i11;
        if (z11) {
            if (this.f86724j1) {
                i12 = this.f86693B1[1];
            } else if (z12) {
                i12 = this.f86740z1[1];
            } else {
                i12 = this.f86692A1[1];
            }
        } else {
            i12 = this.f86739y1[1];
        }
        int i15 = i12;
        if (!this.f86724j1) {
            Paint paint = this.f86721g1;
            int i16 = this.f86712X0;
            paint.setShader(new LinearGradient(0.0f, i16, i16, 0.0f, i14, i15, Shader.TileMode.MIRROR));
        } else {
            Paint paint2 = this.f86721g1;
            int i17 = this.f86712X0;
            float f11 = 2;
            paint2.setShader(new SweepGradient(i17 / f11, i17 / f11, this.f86693B1, new float[]{0.0f, 0.5f}));
        }
    }

    /* renamed from: p2 */
    public void mo90906p2() {
        m90888S1();
        int i11 = this.f86703O0;
        if (i11 == 5) {
            C21273a c21273a = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a);
            c21273a.mo44614b1(0);
            C21273a c21273a2 = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a2);
            C16718f m89106L = c21273a2.m89106L();
            int i12 = this.f86714Z0;
            C16718f m89028L = m89106L.m89028L(i12, i12);
            Boolean bool = Boolean.TRUE;
            m89028L.m89018B(bool).m89036T((this.f86713Y0 - this.f86714Z0) / 2).m89073z(bool);
            if (this.f86708T0 != null) {
                this.f86709U0.mo44614b1(0);
                C16718f m89106L2 = this.f86709U0.m89106L();
                int i13 = this.f86714Z0;
                m89106L2.m89028L(i13, i13).m89018B(bool).m89036T((this.f86713Y0 - this.f86714Z0) / 2).m89017A(bool);
                this.f86709U0.m111959G1(this.f86708T0);
                return;
            }
            return;
        }
        if (i11 == 4) {
            C21273a c21273a3 = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a3);
            c21273a3.mo44614b1(0);
            C21273a c21273a4 = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a4);
            C16718f m89106L3 = c21273a4.m89106L();
            int i14 = this.f86714Z0;
            C16718f m89072y = m89106L3.m89028L(i14, i14).m89072y(Boolean.FALSE);
            Boolean bool2 = Boolean.TRUE;
            m89072y.m89018B(bool2).m89073z(bool2);
            C21273a c21273a5 = this.f86705Q0[1];
            AbstractC19074t.m100205c(c21273a5);
            c21273a5.mo44614b1(0);
            C21273a c21273a6 = this.f86705Q0[1];
            AbstractC19074t.m100205c(c21273a6);
            C16718f m89106L4 = c21273a6.m89106L();
            int i15 = this.f86714Z0;
            m89106L4.m89028L(i15, i15).m89018B(bool2).m89017A(bool2);
            C21273a c21273a7 = this.f86705Q0[2];
            AbstractC19074t.m100205c(c21273a7);
            c21273a7.mo44614b1(0);
            C21273a c21273a8 = this.f86705Q0[2];
            AbstractC19074t.m100205c(c21273a8);
            C16718f m89106L5 = c21273a8.m89106L();
            int i16 = this.f86714Z0;
            m89106L5.m89028L(i16, i16).m89072y(bool2).m89073z(bool2);
            if (this.f86708T0 != null) {
                this.f86709U0.mo44614b1(0);
                C16718f m89106L6 = this.f86709U0.m89106L();
                int i17 = this.f86714Z0;
                m89106L6.m89028L(i17, i17).m89072y(bool2).m89017A(bool2);
                this.f86709U0.m111959G1(this.f86708T0);
                return;
            }
            C21273a c21273a9 = this.f86705Q0[3];
            AbstractC19074t.m100205c(c21273a9);
            c21273a9.mo44614b1(0);
            C21273a c21273a10 = this.f86705Q0[3];
            AbstractC19074t.m100205c(c21273a10);
            C16718f m89106L7 = c21273a10.m89106L();
            int i18 = this.f86714Z0;
            m89106L7.m89028L(i18, i18).m89072y(bool2).m89017A(bool2);
            return;
        }
        if (i11 == 3) {
            C21273a c21273a11 = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a11);
            c21273a11.mo44614b1(0);
            C21273a c21273a12 = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a12);
            C16718f m89106L8 = c21273a12.m89106L();
            int i19 = this.f86714Z0;
            C16718f m89028L2 = m89106L8.m89028L(i19, i19);
            Boolean bool3 = Boolean.TRUE;
            m89028L2.m89018B(bool3).m89073z(bool3);
            C21273a c21273a13 = this.f86705Q0[1];
            AbstractC19074t.m100205c(c21273a13);
            c21273a13.mo44614b1(0);
            C21273a c21273a14 = this.f86705Q0[1];
            AbstractC19074t.m100205c(c21273a14);
            C16718f m89106L9 = c21273a14.m89106L();
            int i21 = this.f86714Z0;
            m89106L9.m89028L(i21, i21).m89018B(bool3).m89017A(bool3);
            C21273a c21273a15 = this.f86705Q0[2];
            AbstractC19074t.m100205c(c21273a15);
            c21273a15.mo44614b1(0);
            C21273a c21273a16 = this.f86705Q0[2];
            AbstractC19074t.m100205c(c21273a16);
            C16718f m89106L10 = c21273a16.m89106L();
            int i22 = this.f86714Z0;
            m89106L10.m89028L(i22, i22).m89018B(bool3).m89036T((this.f86713Y0 - this.f86714Z0) - (this.f86727m1 * 2)).m89026J(true);
            return;
        }
        if (i11 == 2) {
            C21273a c21273a17 = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a17);
            c21273a17.mo44614b1(0);
            C21273a c21273a18 = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a18);
            C16718f m89106L11 = c21273a18.m89106L();
            int i23 = this.f86714Z0;
            C16718f m89028L3 = m89106L11.m89028L(i23, i23);
            Boolean bool4 = Boolean.TRUE;
            m89028L3.m89018B(bool4).m89036T((this.f86713Y0 - this.f86714Z0) / 2).m89073z(bool4);
            C21273a c21273a19 = this.f86705Q0[1];
            AbstractC19074t.m100205c(c21273a19);
            c21273a19.mo44614b1(0);
            C21273a c21273a20 = this.f86705Q0[1];
            AbstractC19074t.m100205c(c21273a20);
            C16718f m89106L12 = c21273a20.m89106L();
            int i24 = this.f86714Z0;
            m89106L12.m89028L(i24, i24).m89018B(bool4).m89036T((this.f86713Y0 - this.f86714Z0) / 2).m89017A(bool4);
            return;
        }
        if (this.f86734t1) {
            C21273a c21273a21 = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a21);
            c21273a21.m110192G1(this.f86734t1);
            C21273a c21273a22 = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a22);
            c21273a22.m110191F1(this.f86727m1);
        }
        C21273a c21273a23 = this.f86705Q0[0];
        AbstractC19074t.m100205c(c21273a23);
        c21273a23.mo44614b1(0);
        C21273a c21273a24 = this.f86705Q0[0];
        AbstractC19074t.m100205c(c21273a24);
        c21273a24.m110190E1(0.0f);
        C21273a c21273a25 = this.f86705Q0[0];
        AbstractC19074t.m100205c(c21273a25);
        C16718f m89106L13 = c21273a25.m89106L();
        int i25 = this.f86713Y0;
        m89106L13.m89028L(i25, i25);
    }

    /* renamed from: q2 */
    public void mo90907q2(int i11, int i12, boolean z11) {
        int m139649b;
        this.f86719e1 = i11;
        this.f86722h1 = i12;
        int i13 = i11 + i12;
        if (i13 != this.f86720f1 || z11) {
            this.f86720f1 = i13;
            if (this.f86734t1) {
                this.f86713Y0 = this.f86712X0 - (this.f86727m1 * 2);
            } else {
                this.f86713Y0 = this.f86712X0 - (i13 * 2);
            }
            int i14 = this.f86712X0;
            this.f86714Z0 = i14 / 2;
            if (this.f86703O0 != 1) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                m139649b = C27276c.m139649b(context, 2);
            } else {
                EnumC16949e enumC16949e = EnumC16949e.SIZE_48;
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                if (i14 <= enumC16949e.m90779c(context2)) {
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "context");
                    m139649b = C27276c.m139649b(context3, 2);
                } else {
                    int i15 = this.f86712X0;
                    EnumC16949e enumC16949e2 = EnumC16949e.SIZE_96;
                    Context context4 = getContext();
                    AbstractC19074t.m100207e(context4, "context");
                    if (i15 <= enumC16949e2.m90779c(context4)) {
                        Context context5 = getContext();
                        AbstractC19074t.m100207e(context5, "context");
                        m139649b = C27276c.m139649b(context5, 3);
                    } else {
                        Context context6 = getContext();
                        AbstractC19074t.m100207e(context6, "context");
                        m139649b = C27276c.m139649b(context6, 4);
                    }
                }
            }
            this.f86727m1 = m139649b;
            int i16 = this.f86719e1;
            int i17 = this.f86712X0;
            m90901g2(new RectF(i16 / 2.0f, i16 / 2.0f, i17 - (i16 / 2.0f), i17 - (i16 / 2.0f)));
            C16718f m89106L = this.f86704P0.m89106L();
            int i18 = this.f86713Y0;
            m89106L.m89028L(i18, i18).m89034R(this.f86720f1).m89036T(this.f86720f1).m89033Q(this.f86720f1).m89035S(this.f86720f1);
            Context context7 = getContext();
            AbstractC19074t.m100207e(context7, "context");
            RobotoTextView robotoTextView = new RobotoTextView(context7);
            AbstractC1640l.m8424o(robotoTextView, AbstractC2814h.avatar_text_xsmall);
            this.f86709U0.mo111964L1(robotoTextView.getTextSize());
            int length = this.f86705Q0.length - 1;
            if (length >= 0) {
                while (true) {
                    int i19 = length - 1;
                    C21273a c21273a = this.f86705Q0[length];
                    AbstractC19074t.m100205c(c21273a);
                    c21273a.m110190E1(this.f86727m1);
                    if (i19 < 0) {
                        break;
                    } else {
                        length = i19;
                    }
                }
            }
            mo90906p2();
        }
    }

    /* renamed from: r2 */
    public void mo90908r2() {
        int i11;
        int i12 = this.f86727m1;
        this.f86719e1 = i12;
        boolean z11 = this.f86726l1;
        if (!z11) {
            i12 = 0;
        }
        if (z11) {
            i11 = i12;
        } else {
            i11 = 0;
        }
        mo90907q2(i12, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: s */
    public void mo44179s(Canvas canvas) {
        if (canvas != null) {
            m90862Q1(canvas);
            m90861P1(canvas);
        }
        super.mo44179s(canvas);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25807a c25807a = this.f86702N0;
        if (c25807a != null) {
            c25807a.m133069b(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25807a c25807a = this.f86702N0;
        if (c25807a != null) {
            c25807a.m133071d(c0708i);
        }
    }

    /* renamed from: v1 */
    public final void m90909v1() {
        boolean m127120J;
        String str;
        String str2;
        boolean m127120J2;
        boolean m127149O;
        boolean m127149O2;
        try {
            int m116584g = (this.f86703O0 != 4 || this.f86708T0 == null) ? AbstractC22543l.m116584g(this.f86711W0.size(), this.f86703O0) : AbstractC22543l.m116584g(this.f86711W0.size(), 3);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < m116584g; i11++) {
                m90873u1(i11);
                int i12 = 1;
                String str3 = null;
                if (!TextUtils.isEmpty((CharSequence) this.f86711W0.get(i11))) {
                    m127120J = AbstractC24341v.m127120J((String) this.f86711W0.get(i11), "http", false, 2, null);
                    if (!m127120J) {
                        m127120J2 = AbstractC24341v.m127120J((String) this.f86711W0.get(i11), "https", false, 2, null);
                        if (!m127120J2) {
                            m127149O = AbstractC24342w.m127149O((CharSequence) this.f86711W0.get(i11), ".png", false, 2, null);
                            if (!m127149O) {
                                m127149O2 = AbstractC24342w.m127149O((CharSequence) this.f86711W0.get(i11), ".jpg", false, 2, null);
                                if (!m127149O2) {
                                    this.f86723i1 = true;
                                    C16948d mo88232c = m90874w1().mo88232c((String) this.f86711W0.get(i11), this.f86696E1);
                                    if (mo88232c != null) {
                                        str = mo88232c.m90775b();
                                        if (TextUtils.isEmpty(str)) {
                                            str2 = null;
                                        } else {
                                            String mo88403b = m90875y1().mo88403b();
                                            InterfaceC18436a m90874w1 = m90874w1();
                                            AbstractC19074t.m100205c(str);
                                            if (m90874w1.mo88230a(str) && mo88403b != null && !TextUtils.equals(mo88403b, mo88232c.m90777d())) {
                                                String m90776c = mo88232c.m90776c();
                                                i12 = 3;
                                                str3 = mo88232c.m90777d();
                                                str2 = m90776c;
                                            }
                                            str2 = null;
                                            i12 = 2;
                                        }
                                        m90864T1(new C16948d(i12, str3, str2, str), i11);
                                    } else {
                                        arrayList.add(this.f86711W0.get(i11));
                                        arrayList2.add(Integer.valueOf(i11));
                                    }
                                }
                            }
                        }
                    }
                    String str4 = (String) this.f86711W0.get(i11);
                    String mo88403b2 = m90875y1().mo88403b();
                    if (m90874w1().mo88230a(str4) && mo88403b2 != null && !TextUtils.isEmpty(this.f86717c1) && !AbstractC19074t.m100204b(mo88403b2, this.f86717c1)) {
                        str = str4;
                        str2 = this.f86716b1;
                        str3 = this.f86717c1;
                        i12 = 3;
                        m90864T1(new C16948d(i12, str3, str2, str), i11);
                    } else {
                        str = str4;
                        str2 = null;
                        i12 = 2;
                        m90864T1(new C16948d(i12, str3, str2, str), i11);
                    }
                }
                str2 = null;
                str = null;
                m90864T1(new C16948d(i12, str3, str2, str), i11);
            }
            if (arrayList.size() > 0) {
                m90874w1().mo88233d(arrayList, arrayList2, new e(this));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x1 */
    public final C16977g m90910x1() {
        return this.f86695D1;
    }

    /* renamed from: z1 */
    public final C16716d m90911z1() {
        return this.f86704P0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16971e(Context context, int i11) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f86703O0 = 1;
        this.f86706R0 = new AbstractC16946b[4];
        this.f86711W0 = new ArrayList();
        this.f86716b1 = "";
        this.f86717c1 = "";
        this.f86728n1 = new RectF();
        this.f86729o1 = -90.0f;
        this.f86730p1 = 360.0f;
        this.f86731q1 = 100;
        this.f86699H1 = new b();
        m129210a = AbstractC24856m.m129210a(new c());
        this.f86700I1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new d());
        this.f86701J1 = m129210a2;
        this.f86712X0 = i11;
        this.f86696E1 = i11 == EnumC16949e.SIZE_16.m90779c(context);
        Paint paint = new Paint(1);
        this.f86721g1 = paint;
        paint.setAntiAlias(true);
        this.f86721g1.setStyle(Paint.Style.STROKE);
        this.f86721g1.setColor(AbstractC1388a.m6961c(context, AbstractC2808b.ng30));
        Paint paint2 = this.f86721g1;
        paint2.setFlags(paint2.getFlags() | 1);
        this.f86721g1.setAlpha(m89086B());
        this.f86721g1.setStrokeCap(Paint.Cap.ROUND);
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        this.f86694C1 = aVar.m13592a(context, AbstractC2807a.avatar_border);
        C16718f m89106L = m89106L();
        int i12 = this.f86712X0;
        m89106L.m89028L(i12, i12);
        this.f86704P0 = new C16716d(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f86710V0 = gradientDrawable;
        gradientDrawable.setShape(1);
        this.f86710V0.setColor(aVar.m13592a(context, AbstractC2807a.avatar_counter_background));
        C21274b c21274b = new C21274b(context);
        this.f86709U0 = c21274b;
        c21274b.mo75850g(true);
        this.f86709U0.mo111965M1(1);
        this.f86709U0.m111962J1(aVar.m13592a(context, AbstractC2807a.text_02));
        this.f86709U0.m89085A0(this.f86710V0);
        this.f86709U0.m89106L().m89029M(15);
        this.f86709U0.m89103J0(true);
        this.f86709U0.m110193R1(this.f86694C1);
        this.f86709U0.m110194S1(this.f86727m1);
        C21273a[] c21273aArr = new C21273a[4];
        this.f86705Q0 = c21273aArr;
        int length = c21273aArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.f86705Q0[i13] = new C21273a(context);
            C21273a c21273a = this.f86705Q0[i13];
            AbstractC19074t.m100205c(c21273a);
            c21273a.m111929z1(5);
            C21273a c21273a2 = this.f86705Q0[i13];
            AbstractC19074t.m100205c(c21273a2);
            c21273a2.m110189D1(this.f86694C1);
            C21273a c21273a3 = this.f86705Q0[i13];
            AbstractC19074t.m100205c(c21273a3);
            c21273a3.m110190E1(this.f86727m1);
        }
        C21273a[] c21273aArr2 = this.f86705Q0;
        if (c21273aArr2.length == 4) {
            C16716d c16716d = this.f86704P0;
            C21273a c21273a4 = c21273aArr2[2];
            AbstractC19074t.m100205c(c21273a4);
            c16716d.m89001g1(c21273a4);
            C16716d c16716d2 = this.f86704P0;
            C21273a c21273a5 = this.f86705Q0[0];
            AbstractC19074t.m100205c(c21273a5);
            c16716d2.m89001g1(c21273a5);
            C16716d c16716d3 = this.f86704P0;
            C21273a c21273a6 = this.f86705Q0[1];
            AbstractC19074t.m100205c(c21273a6);
            c16716d3.m89001g1(c21273a6);
            C16716d c16716d4 = this.f86704P0;
            C21273a c21273a7 = this.f86705Q0[3];
            AbstractC19074t.m100205c(c21273a7);
            c16716d4.m89001g1(c21273a7);
        }
        this.f86704P0.m89001g1(this.f86709U0);
        this.f86704P0.m89007n1(false);
        int length2 = this.f86706R0.length;
        for (int i14 = 0; i14 < length2; i14++) {
            this.f86706R0[i14] = m90874w1().mo88231b(context, this.f86699H1, this);
        }
        C16977g c16977g = new C16977g(context);
        this.f86695D1 = c16977g;
        C16718f m89106L2 = c16977g.m89106L();
        Boolean bool = Boolean.TRUE;
        m89106L2.m89017A(bool).m89072y(bool).m89033Q(-C27276c.m139649b(context, 2)).m89035S(-C27276c.m139649b(context, 2));
        this.f86695D1.mo44614b1(8);
        m89001g1(this.f86704P0);
        m89001g1(this.f86695D1);
        mo90907q2(0, 0, true);
        this.f86739y1 = new int[]{0, 0};
        C27275b c27275b = C27275b.f128316a;
        this.f86740z1 = c27275b.m139643e(context);
        this.f86692A1 = c27275b.m139642d(context);
        this.f86693B1 = c27275b.m139644f(context);
        float m90858A1 = ((this.f86712X0 - (this.f86719e1 / 4)) * 3.1415927f) / ((m90858A1(context, this.f86712X0) * 2) + 1);
        this.f86737w1 = new DashPathEffect(new float[]{m90858A1, m90858A1}, 0.0f);
        this.f86707S0 = C27280g.m139658a(context, AbstractC2810d.default_avatar);
        m90860M1();
        this.f86702N0 = new C25807a(new WeakReference(this));
        m89007n1(false);
    }
}
