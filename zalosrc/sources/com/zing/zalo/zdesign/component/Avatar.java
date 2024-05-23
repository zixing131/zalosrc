package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import androidx.core.widget.AbstractC1640l;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.zdesign.component.avatar.AbstractC16946b;
import com.zing.zalo.zdesign.component.avatar.BaseAvatar;
import com.zing.zalo.zdesign.component.avatar.C16945a;
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
import hn0.AbstractC20104d;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p193h0.AbstractC19694b;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import ri0.C25808b;
import ti0.C26706e;
import ui0.C27274a;
import ui0.C27275b;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public final class Avatar extends BaseAvatar implements InterfaceC16976f1 {

    /* renamed from: A */
    private ValueAnimator f86134A;

    /* renamed from: B */
    private ValueAnimator f86135B;

    /* renamed from: C */
    private String f86136C;

    /* renamed from: D */
    private int f86137D;

    /* renamed from: E */
    private int f86138E;

    /* renamed from: F */
    private int f86139F;

    /* renamed from: G */
    private String f86140G;

    /* renamed from: H */
    private String f86141H;

    /* renamed from: I */
    private boolean f86142I;

    /* renamed from: J */
    private boolean f86143J;

    /* renamed from: K */
    private boolean f86144K;

    /* renamed from: L */
    private PathEffect f86145L;

    /* renamed from: M */
    private float f86146M;

    /* renamed from: N */
    private int f86147N;

    /* renamed from: O */
    private int f86148O;

    /* renamed from: P */
    private boolean f86149P;

    /* renamed from: Q */
    private boolean f86150Q;

    /* renamed from: R */
    private final RectF f86151R;

    /* renamed from: S */
    private float f86152S;

    /* renamed from: T */
    private final float f86153T;

    /* renamed from: U */
    private final int f86154U;

    /* renamed from: V */
    private Paint f86155V;

    /* renamed from: W */
    private Paint f86156W;

    /* renamed from: a0 */
    private boolean f86157a0;

    /* renamed from: b0 */
    private int f86158b0;

    /* renamed from: c0 */
    private float f86159c0;

    /* renamed from: d0 */
    private int[] f86160d0;

    /* renamed from: e0 */
    private int[] f86161e0;

    /* renamed from: f0 */
    private int[] f86162f0;

    /* renamed from: g0 */
    private int[] f86163g0;

    /* renamed from: h0 */
    private RectF f86164h0;

    /* renamed from: i0 */
    private Paint f86165i0;

    /* renamed from: j0 */
    private int f86166j0;

    /* renamed from: k0 */
    private int f86167k0;

    /* renamed from: l0 */
    private Badge f86168l0;

    /* renamed from: m0 */
    private boolean f86169m0;

    /* renamed from: n0 */
    private boolean f86170n0;

    /* renamed from: o0 */
    private AbstractC16946b.a f86171o0;

    /* renamed from: p0 */
    private final InterfaceC24854k f86172p0;

    /* renamed from: q0 */
    private final InterfaceC24854k f86173q0;

    /* renamed from: r */
    private C25808b f86174r;

    /* renamed from: s */
    private int f86175s;

    /* renamed from: t */
    private final C16945a f86176t;

    /* renamed from: u */
    private Drawable[] f86177u;

    /* renamed from: v */
    private AbstractC16946b[] f86178v;

    /* renamed from: w */
    private Drawable f86179w;

    /* renamed from: x */
    private boolean f86180x;

    /* renamed from: y */
    private List f86181y;

    /* renamed from: z */
    private boolean f86182z;

    /* renamed from: com.zing.zalo.zdesign.component.Avatar$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16904a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86183a;

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
            f86183a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Avatar$b */
    /* loaded from: classes7.dex */
    static final class C16905b extends AbstractC19075u implements InterfaceC18494a {
        C16905b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC18436a mo12V4() {
            C18438c c18438c = C18438c.f92957a;
            Context context = Avatar.this.getContext();
            AbstractC19074t.m100207e(context, "context");
            return c18438c.m97715a(context);
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Avatar$c */
    /* loaded from: classes7.dex */
    public static final class C16906c implements AbstractC16946b.a {
        C16906c() {
        }

        @Override // com.zing.zalo.zdesign.component.avatar.AbstractC16946b.a
        /* renamed from: a */
        public void mo90484a(AbstractC16946b abstractC16946b) {
            Drawable drawable;
            int length = Avatar.this.f86178v.length;
            for (int i11 = 0; i11 < length; i11++) {
                AbstractC16946b abstractC16946b2 = Avatar.this.f86178v[i11];
                Drawable drawable2 = null;
                if (abstractC16946b2 != null) {
                    drawable = abstractC16946b2.m90768a();
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    Drawable[] drawableArr = Avatar.this.f86177u;
                    AbstractC16946b abstractC16946b3 = Avatar.this.f86178v[i11];
                    if (abstractC16946b3 != null) {
                        drawable2 = abstractC16946b3.m90768a();
                    }
                    drawableArr[i11] = drawable2;
                }
            }
            Avatar.this.postInvalidate();
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Avatar$d */
    /* loaded from: classes7.dex */
    static final class C16907d extends AbstractC19075u implements InterfaceC18494a {
        C16907d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC18437b mo12V4() {
            C18438c c18438c = C18438c.f92957a;
            Context context = Avatar.this.getContext();
            AbstractC19074t.m100207e(context, "context");
            return c18438c.m97716b(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zdesign.component.Avatar$e */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16908e extends C19071q implements InterfaceC18509p {
        C16908e(Object obj) {
            super(2, obj, Avatar.class, "onProfilesLoaded", "onProfilesLoaded(Ljava/util/List;Ljava/util/List;)V", 0);
        }

        /* renamed from: h */
        public final void m90486h(List list, List list2) {
            AbstractC19074t.m100208f(list, "p0");
            AbstractC19074t.m100208f(list2, "p1");
            ((Avatar) this.f94922q).m90472v(list, list2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m90486h((List) obj, (List) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Avatar(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m90454A(Avatar avatar, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(avatar, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        avatar.f86146M = ((Float) animatedValue).floatValue();
    }

    /* renamed from: B */
    private final void m90455B() {
        if (this.f86135B == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
            this.f86135B = ofFloat;
            AbstractC19074t.m100205c(ofFloat);
            ofFloat.setDuration(1000L);
            ValueAnimator valueAnimator = this.f86135B;
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.f86135B;
            AbstractC19074t.m100205c(valueAnimator2);
            valueAnimator2.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimator3 = this.f86135B;
            AbstractC19074t.m100205c(valueAnimator3);
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    Avatar.m90456C(Avatar.this, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f86135B;
        if (valueAnimator4 != null) {
            AbstractC19074t.m100205c(valueAnimator4);
            if (!valueAnimator4.isStarted()) {
                ValueAnimator valueAnimator5 = this.f86135B;
                AbstractC19074t.m100205c(valueAnimator5);
                valueAnimator5.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m90456C(Avatar avatar, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(avatar, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        avatar.f86146M = ((Float) animatedValue).floatValue();
    }

    /* renamed from: D */
    private final void m90457D() {
        boolean z11;
        int m139649b;
        int i11 = this.f86137D;
        EnumC16949e enumC16949e = EnumC16949e.SIZE_16;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        if (i11 == enumC16949e.m90779c(context)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f86149P = z11;
        int i12 = this.f86137D;
        EnumC16949e enumC16949e2 = EnumC16949e.SIZE_48;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        if (i12 <= enumC16949e2.m90779c(context2)) {
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            m139649b = C27276c.m139649b(context3, 2);
        } else {
            int i13 = this.f86137D;
            EnumC16949e enumC16949e3 = EnumC16949e.SIZE_96;
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            if (i13 <= enumC16949e3.m90779c(context4)) {
                Context context5 = getContext();
                AbstractC19074t.m100207e(context5, "context");
                m139649b = C27276c.m139649b(context5, 3);
            } else {
                Context context6 = getContext();
                AbstractC19074t.m100207e(context6, "context");
                m139649b = C27276c.m139649b(context6, 4);
            }
        }
        this.f86166j0 = m139649b;
        AbstractC19074t.m100207e(getContext(), "context");
        float m90466j = ((this.f86137D - (this.f86166j0 / 2)) * 3.1415927f) / ((m90466j(r0, this.f86137D) * 2) + 1);
        Context context7 = getContext();
        AbstractC19074t.m100207e(context7, "context");
        m90466j(context7, this.f86137D);
        this.f86145L = new DashPathEffect(new float[]{m90466j, m90466j}, 0.0f);
        setStoryStrokeWidth(this.f86166j0);
    }

    /* renamed from: E */
    private final void m90458E() {
        if (this.f86143J) {
            this.f86139F = this.f86147N;
            this.f86176t.m90765g(true);
        } else {
            this.f86139F = 0;
            this.f86176t.m90765g(false);
        }
        this.f86176t.m90767i(this.f86137D - (this.f86139F * 2));
    }

    /* renamed from: f */
    private final void m90464f(ValueAnimator valueAnimator) {
        if (valueAnimator != null && valueAnimator.isStarted()) {
            valueAnimator.end();
        }
    }

    /* renamed from: g */
    private final void m90465g(int i11) {
        AbstractC16946b abstractC16946b = this.f86178v[i11];
        if (abstractC16946b != null) {
            abstractC16946b.mo88237h();
        }
    }

    private final InterfaceC18436a getAvatarBusiness() {
        return (InterfaceC18436a) this.f86172p0.getValue();
    }

    private final InterfaceC18437b getComponentBusiness() {
        return (InterfaceC18437b) this.f86173q0.getValue();
    }

    private final float getTextSize() {
        TextView textView = new TextView(getContext());
        int m90762d = this.f86176t.m90762d();
        if (this.f86175s != 1) {
            AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_xsmall);
        } else {
            EnumC16949e enumC16949e = EnumC16949e.SIZE_24;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            if (m90762d < enumC16949e.m90779c(context)) {
                AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_xxsmall);
            } else {
                EnumC16949e enumC16949e2 = EnumC16949e.SIZE_32;
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                if (m90762d < enumC16949e2.m90779c(context2)) {
                    AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_xsmall);
                } else {
                    EnumC16949e enumC16949e3 = EnumC16949e.SIZE_40;
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "context");
                    if (m90762d < enumC16949e3.m90779c(context3)) {
                        AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_small);
                    } else {
                        EnumC16949e enumC16949e4 = EnumC16949e.SIZE_64;
                        Context context4 = getContext();
                        AbstractC19074t.m100207e(context4, "context");
                        if (m90762d < enumC16949e4.m90779c(context4)) {
                            AbstractC1640l.m8424o(textView, AbstractC2814h.avatar_text_medium);
                        } else {
                            EnumC16949e enumC16949e5 = EnumC16949e.SIZE_128;
                            Context context5 = getContext();
                            AbstractC19074t.m100207e(context5, "context");
                            if (m90762d < enumC16949e5.m90779c(context5)) {
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

    /* renamed from: j */
    private final int m90466j(Context context, int i11) {
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
        if (i11 == EnumC16949e.SIZE_58.m90779c(context) || i11 == EnumC16949e.SIZE_64.m90779c(context)) {
            return 20;
        }
        if (i11 == EnumC16949e.SIZE_96.m90779c(context)) {
            return 28;
        }
        EnumC16949e.SIZE_128.m90779c(context);
        return 32;
    }

    /* renamed from: k */
    private final void m90467k() {
        Paint paint = this.f86155V;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f86155V;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        Paint paint3 = this.f86155V;
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        paint3.setColor(aVar.m13592a(context, AbstractC2807a.progress_indicator_white));
        this.f86155V.setStrokeWidth(this.f86166j0);
        this.f86156W.setStyle(style);
        this.f86156W.setStrokeCap(cap);
        Paint paint4 = this.f86156W;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        paint4.setColor(aVar.m13592a(context2, AbstractC2807a.progress_track_background_white));
        this.f86156W.setStrokeWidth(this.f86166j0);
    }

    /* renamed from: q */
    private final void m90468q(String str, int i11) {
        AbstractC16946b abstractC16946b = this.f86178v[i11];
        if (abstractC16946b != null) {
            abstractC16946b.mo88235f(str, this.f86182z, this.f86180x);
        }
    }

    /* renamed from: r */
    private final void m90469r(Canvas canvas) {
        Badge badge;
        if (this.f86169m0 && (badge = this.f86168l0) != null) {
            AbstractC19074t.m100205c(badge);
            int currentBadgeSize = badge.getCurrentBadgeSize();
            int i11 = this.f86137D - currentBadgeSize;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            int m139649b = i11 + C27276c.m139649b(context, 2);
            int i12 = this.f86138E - currentBadgeSize;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            int m139649b2 = i12 + C27276c.m139649b(context2, 2);
            Badge badge2 = this.f86168l0;
            AbstractC19074t.m100205c(badge2);
            badge2.measure(currentBadgeSize, currentBadgeSize);
            Badge badge3 = this.f86168l0;
            AbstractC19074t.m100205c(badge3);
            badge3.layout(0, 0, currentBadgeSize, currentBadgeSize);
            canvas.save();
            canvas.translate(m139649b, m139649b2);
            Badge badge4 = this.f86168l0;
            AbstractC19074t.m100205c(badge4);
            badge4.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: s */
    private final void m90470s(Canvas canvas) {
        if (this.f86157a0) {
            float f11 = this.f86166j0;
            float f12 = 2;
            float f13 = f11 / f12;
            this.f86151R.set(f13, f13, getWidth() - f13, getWidth() - f13);
            canvas.drawCircle(getWidth() / f12, getWidth() / f12, (getWidth() - f11) / f12, this.f86156W);
            canvas.drawArc(this.f86151R, this.f86152S, this.f86159c0, false, this.f86155V);
        }
    }

    private final void setStoryStrokeWidth(int i11) {
        try {
            this.f86166j0 = i11;
            this.f86147N = i11 * 2;
            this.f86148O = i11;
            int i12 = this.f86166j0;
            this.f86164h0 = new RectF(i12 / 2.0f, i12 / 2.0f, this.f86137D - (i12 / 2.0f), this.f86138E - (i12 / 2.0f));
            this.f86176t.m90764f(this.f86148O);
            this.f86165i0.setStrokeWidth(this.f86166j0);
            this.f86155V.setStrokeWidth(this.f86166j0);
            this.f86156W.setStrokeWidth(this.f86166j0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: u */
    private final void m90471u(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.save();
        if (this.f86143J) {
            boolean z11 = this.f86144K;
            if (!z11 && !this.f86150Q) {
                m90464f(this.f86135B);
                m90464f(this.f86134A);
            } else {
                if (z11) {
                    m90464f(this.f86135B);
                    m90474z();
                } else {
                    m90464f(this.f86134A);
                    m90455B();
                }
                canvas.rotate(this.f86146M, this.f86137D / 2.0f, this.f86138E / 2.0f);
            }
            if (this.f86150Q) {
                RectF rectF3 = this.f86164h0;
                if (rectF3 == null) {
                    AbstractC19074t.m100223u("strokeRectF");
                    rectF2 = null;
                } else {
                    rectF2 = rectF3;
                }
                canvas.drawArc(rectF2, 5.0f, 170.0f, false, this.f86165i0);
            } else {
                RectF rectF4 = this.f86164h0;
                if (rectF4 == null) {
                    AbstractC19074t.m100223u("strokeRectF");
                    rectF = null;
                } else {
                    rectF = rectF4;
                }
                canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f86165i0);
            }
        }
        canvas.restore();
        if (this.f86144K || this.f86150Q) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m90472v(List list, List list2) {
        String str;
        String str2;
        boolean m127127w;
        try {
            try {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    m90465g(intValue);
                    if (intValue < this.f86181y.size()) {
                        C16948d mo88232c = getAvatarBusiness().mo88232c((String) this.f86181y.get(intValue), this.f86149P);
                        int i11 = 1;
                        String str3 = null;
                        if (mo88232c != null) {
                            str2 = mo88232c.m90775b();
                            if (TextUtils.isEmpty(str2)) {
                                str = null;
                            } else {
                                String mo88403b = getComponentBusiness().mo88403b();
                                InterfaceC18436a avatarBusiness = getAvatarBusiness();
                                AbstractC19074t.m100205c(str2);
                                if (avatarBusiness.mo88230a(str2)) {
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
                        m90473w(new C16948d(i11, str3, str, str2), intValue);
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

    /* renamed from: w */
    private final void m90473w(C16948d c16948d, int i11) {
        int m90774a = c16948d.m90774a();
        String m90777d = c16948d.m90777d();
        String m90776c = c16948d.m90776c();
        if (m90774a == 3 && m90777d != null && m90776c != null) {
            C27275b.a m139640a = C27275b.f128316a.m139640a(m90777d, false);
            Drawable[] drawableArr = this.f86177u;
            C26706e.b bVar = C26706e.Companion;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            C26706e.d mo137297b = bVar.m137317a(context).mo137297b();
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            C26706e.e mo137296a = mo137297b.mo137300e(aVar.m13592a(context2, AbstractC2807a.text_04)).mo137298c(getTextSize()).mo137296a();
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            int m139647d = m139640a.m139647d(context3);
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            drawableArr[i11] = mo137296a.mo137299d(m90776c, m139647d, m139640a.m139646c(context4));
            return;
        }
        if (m90774a == 2) {
            this.f86177u[i11] = this.f86179w;
            m90468q(c16948d.m90775b(), i11);
        } else {
            this.f86177u[i11] = this.f86179w;
        }
    }

    /* renamed from: z */
    private final void m90474z() {
        if (this.f86134A == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
            this.f86134A = ofFloat;
            AbstractC19074t.m100205c(ofFloat);
            ofFloat.setDuration(5000L);
            ValueAnimator valueAnimator = this.f86134A;
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.f86134A;
            AbstractC19074t.m100205c(valueAnimator2);
            valueAnimator2.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimator3 = this.f86134A;
            AbstractC19074t.m100205c(valueAnimator3);
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    Avatar.m90454A(Avatar.this, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f86134A;
        if (valueAnimator4 != null) {
            AbstractC19074t.m100205c(valueAnimator4);
            if (!valueAnimator4.isStarted()) {
                ValueAnimator valueAnimator5 = this.f86134A;
                AbstractC19074t.m100205c(valueAnimator5);
                valueAnimator5.start();
            }
        }
    }

    public final Bitmap getBitmap() {
        int dimensionPixelSize;
        int i11;
        int i12;
        int m104529e;
        if (getWidth() > 0 && getHeight() > 0) {
            dimensionPixelSize = getWidth();
            i11 = getHeight();
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC2809c.avatar_size_default);
            i11 = dimensionPixelSize;
        }
        if (dimensionPixelSize > i11) {
            i12 = dimensionPixelSize;
        } else {
            i12 = i11;
        }
        m104529e = AbstractC20104d.m104529e((float) Math.sqrt((i12 * i12) / 2));
        int i13 = m104529e * 2;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, i11, config);
        AbstractC19074t.m100207e(createBitmap, "createBitmap(layoutWidth… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        if (!m90477l()) {
            createBitmap.recycle();
            return null;
        }
        this.f86176t.m90761a(canvas);
        if (this.f86175s > 1) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            Bitmap createBitmap2 = Bitmap.createBitmap(i13, i13, config);
            AbstractC19074t.m100207e(createBitmap2, "createBitmap(size, size, Bitmap.Config.ARGB_8888)");
            Canvas canvas2 = new Canvas(createBitmap2);
            Rect rect = new Rect(0, 0, i13, i13);
            Paint paint2 = new Paint(1);
            if (Build.VERSION.SDK_INT < 26) {
                paint2.setColor(Color.parseColor("#7fffffff"));
            } else {
                paint2.setColor(Color.parseColor("#ffffff"));
            }
            canvas2.drawCircle(rect.centerX(), rect.centerY(), rect.width() / 2, paint2);
            int i14 = (i13 - dimensionPixelSize) / 2;
            int i15 = (i13 - i11) / 2;
            canvas2.drawBitmap(createBitmap, (Rect) null, new Rect(i14, i15, dimensionPixelSize + i14, i11 + i15), paint);
            createBitmap.recycle();
            return createBitmap2;
        }
        return createBitmap;
    }

    public final int getNumOfNeedLoadAvatars() {
        int m116584g;
        int m116584g2;
        if (this.f86175s != 4 || this.f86136C == null) {
            m116584g = AbstractC22543l.m116584g(this.f86181y.size(), this.f86175s);
            return m116584g;
        }
        m116584g2 = AbstractC22543l.m116584g(this.f86181y.size(), 3);
        return m116584g2;
    }

    public final String getShortDpnAvt() {
        return this.f86140G;
    }

    public final String getUidForGenColor() {
        return this.f86141H;
    }

    /* renamed from: h */
    protected final void m90475h() {
        boolean m127120J;
        String str;
        String substring;
        String str2;
        boolean m127120J2;
        boolean m127149O;
        boolean m127149O2;
        try {
            int numOfNeedLoadAvatars = getNumOfNeedLoadAvatars();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < numOfNeedLoadAvatars; i11++) {
                m90465g(i11);
                int i12 = 1;
                String str3 = null;
                if (!TextUtils.isEmpty((CharSequence) this.f86181y.get(i11))) {
                    m127120J = AbstractC24341v.m127120J((String) this.f86181y.get(i11), "http", false, 2, null);
                    if (!m127120J) {
                        m127120J2 = AbstractC24341v.m127120J((String) this.f86181y.get(i11), "https", false, 2, null);
                        if (!m127120J2) {
                            m127149O = AbstractC24342w.m127149O((CharSequence) this.f86181y.get(i11), ".png", false, 2, null);
                            if (!m127149O) {
                                m127149O2 = AbstractC24342w.m127149O((CharSequence) this.f86181y.get(i11), ".jpg", false, 2, null);
                                if (!m127149O2) {
                                    this.f86170n0 = true;
                                    C16948d mo88232c = getAvatarBusiness().mo88232c((String) this.f86181y.get(i11), this.f86149P);
                                    if (mo88232c != null) {
                                        str = mo88232c.m90775b();
                                        if (TextUtils.isEmpty(str)) {
                                            str2 = null;
                                        } else {
                                            String mo88403b = getComponentBusiness().mo88403b();
                                            InterfaceC18436a avatarBusiness = getAvatarBusiness();
                                            AbstractC19074t.m100205c(str);
                                            if (avatarBusiness.mo88230a(str) && mo88403b != null && !AbstractC19074t.m100204b(mo88403b, mo88232c.m90777d())) {
                                                String m90776c = mo88232c.m90776c();
                                                i12 = 3;
                                                str3 = mo88232c.m90777d();
                                                str2 = m90776c;
                                            }
                                            str2 = null;
                                            i12 = 2;
                                        }
                                        m90473w(new C16948d(i12, str3, str2, str), i11);
                                    } else {
                                        arrayList.add(this.f86181y.get(i11));
                                        arrayList2.add(Integer.valueOf(i11));
                                    }
                                }
                            }
                        }
                    }
                    String str4 = (String) this.f86181y.get(i11);
                    String mo88403b2 = getComponentBusiness().mo88403b();
                    if (getAvatarBusiness().mo88230a(str4) && mo88403b2 != null && !TextUtils.isEmpty(this.f86141H) && !AbstractC19074t.m100204b(mo88403b2, this.f86141H)) {
                        if (this.f86140G.length() < 2) {
                            str3 = this.f86140G;
                        } else if (this.f86140G.length() >= 2) {
                            if (this.f86149P) {
                                substring = this.f86140G.substring(0, 1);
                                AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            } else {
                                substring = this.f86140G.substring(0, 2);
                                AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            str3 = substring;
                        }
                        str = str4;
                        str2 = str3;
                        str3 = this.f86141H;
                        i12 = 3;
                        m90473w(new C16948d(i12, str3, str2, str), i11);
                    } else {
                        str = str4;
                        str2 = null;
                        i12 = 2;
                        m90473w(new C16948d(i12, str3, str2, str), i11);
                    }
                }
                str2 = null;
                str = null;
                m90473w(new C16948d(i12, str3, str2, str), i11);
            }
            invalidate();
            if (arrayList.size() > 0) {
                getAvatarBusiness().mo88233d(arrayList, arrayList2, new C16908e(this));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    protected final void m90476i(C16948d c16948d) {
        String str;
        String str2;
        String substring;
        int numOfNeedLoadAvatars = getNumOfNeedLoadAvatars();
        for (int i11 = 0; i11 < numOfNeedLoadAvatars; i11++) {
            m90465g(i11);
            int i12 = 1;
            this.f86170n0 = true;
            String str3 = null;
            if (c16948d != null) {
                String m90775b = c16948d.m90775b();
                if (TextUtils.isEmpty(m90775b)) {
                    str2 = m90775b;
                } else {
                    String mo88403b = getComponentBusiness().mo88403b();
                    InterfaceC18436a avatarBusiness = getAvatarBusiness();
                    AbstractC19074t.m100205c(m90775b);
                    if (avatarBusiness.mo88230a(m90775b) && mo88403b != null && !AbstractC19074t.m100204b(mo88403b, c16948d.m90777d())) {
                        String m90776c = c16948d.m90776c();
                        if (m90776c != null && m90776c.length() >= 2) {
                            if (m90776c.length() >= 2) {
                                if (this.f86149P) {
                                    substring = m90776c.substring(0, 1);
                                    AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                } else {
                                    substring = m90776c.substring(0, 2);
                                    AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                                str3 = substring;
                            }
                        } else {
                            str3 = m90776c;
                        }
                        str2 = m90775b;
                        str = str3;
                        str3 = c16948d.m90777d();
                        i12 = 3;
                    } else {
                        str2 = m90775b;
                        i12 = 2;
                    }
                }
                str = null;
            } else {
                str = null;
                str2 = null;
            }
            m90473w(new C16948d(i12, str3, str, str2), i11);
        }
        invalidate();
    }

    /* renamed from: l */
    public final boolean m90477l() {
        try {
            int numOfNeedLoadAvatars = getNumOfNeedLoadAvatars();
            for (int i11 = 0; i11 < numOfNeedLoadAvatars; i11++) {
                if (this.f86177u[i11] == this.f86179w) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: m */
    public final void m90478m(C16948d c16948d) {
        String m90775b;
        AbstractC19074t.m100208f(c16948d, "properties");
        this.f86181y.clear();
        List list = this.f86181y;
        if (c16948d.m90775b() == null) {
            m90775b = "";
        } else {
            m90775b = c16948d.m90775b();
            AbstractC19074t.m100205c(m90775b);
        }
        list.add(m90775b);
        this.f86175s = 1;
        m90476i(c16948d);
        this.f86176t.m90766h(this.f86175s, null, this.f86177u);
    }

    /* renamed from: n */
    public final void m90479n(String str) {
        AbstractC19074t.m100208f(str, "avatar");
        this.f86181y.clear();
        this.f86181y.add(str);
        this.f86175s = 1;
        m90475h();
        this.f86176t.m90766h(this.f86175s, null, this.f86177u);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        canvas.save();
        if (this.f86157a0) {
            int i11 = this.f86139F;
            int i12 = this.f86166j0;
            canvas.translate(i11 + i12, i11 + i12);
        } else {
            int i13 = this.f86139F;
            canvas.translate(i13, i13);
        }
        this.f86176t.m90761a(canvas);
        canvas.restore();
        m90471u(canvas);
        m90469r(canvas);
        m90470s(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f86157a0) {
            int i13 = this.f86137D;
            int i14 = this.f86166j0;
            setMeasuredDimension(i13 + (i14 * 2), this.f86138E + (i14 * 2));
            return;
        }
        setMeasuredDimension(this.f86137D, this.f86138E);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f86176t.m90767i(this.f86137D - (this.f86139F * 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m90480p(List list) {
        String m139636d;
        boolean m127120J;
        this.f86181y.clear();
        if (list != null && !list.isEmpty()) {
            this.f86181y.addAll(list);
        } else {
            this.f86181y.add("");
        }
        this.f86136C = null;
        if (this.f86181y.size() == 2) {
            m127120J = AbstractC24341v.m127120J((String) this.f86181y.get(1), "+", false, 2, null);
            if (m127120J) {
                this.f86175s = 5;
                this.f86136C = (String) this.f86181y.get(1);
                this.f86181y.remove(1);
                if (this.f86175s <= 0) {
                    this.f86175s = 1;
                }
                m90475h();
                this.f86176t.m90766h(this.f86175s, this.f86136C, this.f86177u);
            }
        }
        if (this.f86181y.size() == 4) {
            this.f86175s = 4;
            this.f86136C = null;
        } else if (this.f86181y.size() >= 5) {
            this.f86175s = 4;
            InterfaceC18505l formatAvatarMore = getFormatAvatarMore();
            C27274a c27274a = C27274a.f128311a;
            if (AbstractC19074t.m100204b(formatAvatarMore, c27274a.m139634b())) {
                m139636d = c27274a.m139636d(this.f86181y.size() - 3, getFormatAvatarMore());
            } else {
                m139636d = c27274a.m139636d(this.f86181y.size(), getFormatAvatarMore());
            }
            this.f86136C = m139636d;
        } else {
            this.f86175s = this.f86181y.size();
        }
        if (this.f86175s <= 0) {
        }
        m90475h();
        this.f86176t.m90766h(this.f86175s, this.f86136C, this.f86177u);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86174r;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    public final void setImageDrawable(Drawable drawable) {
        m90465g(0);
        this.f86175s = 1;
        Drawable[] drawableArr = this.f86177u;
        drawableArr[0] = drawable;
        this.f86176t.m90766h(1, null, drawableArr);
    }

    public final void setImageResource(int i11) {
        m90465g(0);
        this.f86175s = 1;
        this.f86177u[0] = AbstractC19694b.m103336d(getContext(), i11);
        this.f86176t.m90766h(this.f86175s, null, this.f86177u);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86174r;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    public final void setOnlineStatus(EnumC16947c enumC16947c) {
        AbstractC19074t.m100208f(enumC16947c, "status");
        if (this.f86168l0 == null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            this.f86168l0 = new Badge(context);
        }
        this.f86169m0 = true;
        switch (C16904a.f86183a[enumC16947c.ordinal()]) {
            case 1:
                this.f86169m0 = false;
                break;
            case 2:
                Badge badge = this.f86168l0;
                if (badge != null) {
                    Context context2 = getContext();
                    AbstractC19074t.m100207e(context2, "context");
                    C16974f c16974f = new C16974f(context2);
                    c16974f.m90974x(EnumC16991i.USER_STATUS_ONLINE);
                    c16974f.m90970t(true);
                    badge.m90493g(c16974f);
                    break;
                }
                break;
            case 3:
                Badge badge2 = this.f86168l0;
                if (badge2 != null) {
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "context");
                    C16974f c16974f2 = new C16974f(context3);
                    c16974f2.m90974x(EnumC16991i.USER_STATUS_BLOCKED);
                    c16974f2.m90970t(true);
                    badge2.m90493g(c16974f2);
                    break;
                }
                break;
            case 4:
                Badge badge3 = this.f86168l0;
                if (badge3 != null) {
                    Context context4 = getContext();
                    AbstractC19074t.m100207e(context4, "context");
                    C16974f c16974f3 = new C16974f(context4);
                    c16974f3.m90974x(EnumC16991i.USER_STATUS_ADMIN);
                    c16974f3.m90970t(true);
                    badge3.m90493g(c16974f3);
                    break;
                }
                break;
            case 5:
                Badge badge4 = this.f86168l0;
                if (badge4 != null) {
                    Context context5 = getContext();
                    AbstractC19074t.m100207e(context5, "context");
                    C16974f c16974f4 = new C16974f(context5);
                    c16974f4.m90974x(EnumC16991i.USER_STATUS_OWNER);
                    c16974f4.m90970t(true);
                    badge4.m90493g(c16974f4);
                    break;
                }
                break;
            case 6:
                Badge badge5 = this.f86168l0;
                if (badge5 != null) {
                    Context context6 = getContext();
                    AbstractC19074t.m100207e(context6, "context");
                    C16974f c16974f5 = new C16974f(context6);
                    c16974f5.m90974x(EnumC16991i.USER_STATUS_VERIFIED);
                    c16974f5.m90970t(true);
                    badge5.m90493g(c16974f5);
                    break;
                }
                break;
            case 7:
                Badge badge6 = this.f86168l0;
                if (badge6 != null) {
                    Context context7 = getContext();
                    AbstractC19074t.m100207e(context7, "context");
                    C16974f c16974f6 = new C16974f(context7);
                    c16974f6.m90974x(EnumC16991i.OA);
                    badge6.m90493g(c16974f6);
                    break;
                }
                break;
        }
        m90458E();
        invalidate();
    }

    public final void setOnlineStatusBadge(C16974f c16974f) {
        if (c16974f == null) {
            setOnlineStatus(EnumC16947c.OFFLINE);
            return;
        }
        this.f86169m0 = true;
        if (this.f86168l0 == null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            this.f86168l0 = new Badge(context);
        }
        Badge badge = this.f86168l0;
        if (badge != null) {
            badge.m90493g(c16974f);
        }
        m90458E();
        invalidate();
    }

    public final void setProgress(int i11) {
        this.f86158b0 = i11;
        this.f86159c0 = (this.f86153T / this.f86154U) * i11;
        invalidate();
    }

    public final void setScrollingMode(boolean z11) {
        this.f86180x = z11;
    }

    public final void setShortDpn(String str) {
        AbstractC19074t.m100208f(str, "dpn");
        m90465g(0);
        this.f86175s = 1;
        C27275b.a m139640a = C27275b.f128316a.m139640a(str, false);
        Drawable[] drawableArr = this.f86177u;
        C26706e.b bVar = C26706e.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        C26706e.d mo137297b = bVar.m137317a(context).mo137297b();
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        C26706e.e mo137296a = mo137297b.mo137300e(aVar.m13592a(context2, AbstractC2807a.text_04)).mo137298c(getTextSize()).mo137296a();
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        int m139647d = m139640a.m139647d(context3);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "context");
        drawableArr[0] = mo137296a.mo137299d(str, m139647d, m139640a.m139646c(context4));
        this.f86176t.m90766h(this.f86175s, null, this.f86177u);
    }

    public final void setShortDpnAvt(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f86140G = str;
    }

    public final void setStateLoadingStory(boolean z11) {
        this.f86144K = z11;
        if (z11) {
            this.f86165i0.setPathEffect(this.f86145L);
            this.f86165i0.setStrokeCap(Paint.Cap.ROUND);
        } else {
            this.f86165i0.setPathEffect(null);
        }
        invalidate();
    }

    public final void setStateUploadingStory(boolean z11) {
        boolean z12;
        this.f86150Q = z11;
        if (z11 != this.f86143J) {
            z12 = true;
        } else {
            z12 = false;
        }
        m90482y(z11, true);
        if (this.f86170n0 && z12) {
            m90475h();
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86174r;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    public final void setUidForGenColor(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f86141H = str;
    }

    /* renamed from: x */
    public final void m90481x(Context context, EnumC16949e enumC16949e) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(enumC16949e, "avatarSize");
        int m90779c = enumC16949e.m90779c(context);
        this.f86137D = m90779c;
        this.f86138E = m90779c;
        m90457D();
        m90482y(this.f86143J, this.f86142I);
        if (this.f86170n0) {
            m90475h();
        }
    }

    /* renamed from: y */
    public final void m90482y(boolean z11, boolean z12) {
        int i11;
        int i12;
        boolean z13;
        this.f86142I = z12;
        this.f86143J = z11;
        if (z11) {
            int i13 = this.f86137D;
            EnumC16949e enumC16949e = EnumC16949e.SIZE_24;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            if (i13 <= enumC16949e.m90779c(context)) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f86149P = z13;
        }
        try {
            m90458E();
            if (z11) {
                if (this.f86150Q) {
                    i11 = this.f86163g0[0];
                } else if (z12) {
                    i11 = this.f86161e0[0];
                } else {
                    i11 = this.f86162f0[0];
                }
            } else {
                i11 = this.f86160d0[0];
            }
            int i14 = i11;
            if (z11) {
                if (this.f86150Q) {
                    i12 = this.f86163g0[1];
                } else if (z12) {
                    i12 = this.f86161e0[1];
                } else {
                    i12 = this.f86162f0[1];
                }
            } else {
                i12 = this.f86160d0[1];
            }
            int i15 = i12;
            if (!this.f86150Q) {
                Paint paint = this.f86165i0;
                int i16 = this.f86138E;
                float f11 = 2;
                paint.setShader(new LinearGradient(i16 / f11, 0.0f, i16 / f11, i16, i14, i15, Shader.TileMode.MIRROR));
                return;
            }
            float f12 = 2;
            this.f86165i0.setShader(new SweepGradient(this.f86137D / f12, this.f86138E / f12, this.f86163g0, new float[]{0.0f, 0.5f}));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Avatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Avatar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f86175s = 1;
        this.f86177u = new Drawable[4];
        this.f86178v = new AbstractC16946b[4];
        this.f86181y = new ArrayList();
        this.f86140G = "";
        this.f86141H = "";
        this.f86151R = new RectF();
        this.f86152S = -90.0f;
        this.f86153T = 360.0f;
        this.f86154U = 100;
        this.f86155V = new Paint(1);
        this.f86156W = new Paint(1);
        this.f86165i0 = new Paint(1);
        this.f86167k0 = AbstractC1388a.m6961c(getContext(), AbstractC2808b.ng30);
        this.f86171o0 = new C16906c();
        m129210a = AbstractC24856m.m129210a(new C16905b());
        this.f86172p0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C16907d());
        this.f86173q0 = m129210a2;
        this.f86174r = new C25808b(new WeakReference(this));
        int m90779c = EnumC16949e.SIZE_48.m90779c(context);
        this.f86137D = m90779c;
        this.f86138E = m90779c;
        float m90466j = ((this.f86137D - (this.f86166j0 / 4)) * 3.1415927f) / ((m90466j(context, m90779c) * 2) + 1);
        this.f86145L = new DashPathEffect(new float[]{m90466j, m90466j}, 0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2815i.Avatar, i11, 0);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…          0\n            )");
        String string = obtainStyledAttributes.getString(AbstractC2815i.Avatar_trackingId);
        if (string != null && string.length() != 0) {
            setIdTracking(string);
        }
        obtainStyledAttributes.recycle();
        int i12 = this.f86137D;
        int i13 = this.f86139F;
        this.f86176t = new C16945a(this, i12 - (i13 * 2), this.f86138E - (i13 * 2), false);
        m90457D();
        int length = this.f86178v.length;
        for (int i14 = 0; i14 < length; i14++) {
            this.f86178v[i14] = getAvatarBusiness().mo88231b(context, this.f86171o0, this);
        }
        this.f86165i0.setStrokeWidth(this.f86166j0);
        this.f86165i0.setColor(this.f86167k0);
        this.f86165i0.setStrokeCap(Paint.Cap.ROUND);
        this.f86165i0.setStyle(Paint.Style.STROKE);
        this.f86160d0 = new int[]{0, 0};
        C27275b c27275b = C27275b.f128316a;
        this.f86161e0 = c27275b.m139643e(context);
        this.f86163g0 = c27275b.m139644f(context);
        this.f86162f0 = c27275b.m139642d(context);
        this.f86179w = C27280g.m139658a(context, AbstractC2810d.default_avatar);
        m90467k();
    }
}
