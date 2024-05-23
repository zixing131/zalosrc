package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.accessibility.C1507g0;
import com.google.android.material.internal.AbstractC6336c;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import com.google.android.material.internal.InterfaceC6358y;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.InterfaceC6398a;
import com.google.android.material.slider.InterfaceC6399b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p013a7.AbstractC0638a;
import p033b7.C2646a;
import p193h0.AbstractC19694b;
import p252j1.AbstractC20900a;
import p337m1.AbstractC22710a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23578c;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23585j;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p382o6.AbstractC24041a;
import p474r6.AbstractC25666b;
import p599w6.AbstractC28774c;
import p706z6.C31689h;
import p706z6.C31694m;

/* loaded from: classes3.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends InterfaceC6398a, T extends InterfaceC6399b> extends View {

    /* renamed from: q0 */
    static final int f35793q0 = AbstractC23586k.Widget_MaterialComponents_Slider;

    /* renamed from: A */
    private final List f35794A;

    /* renamed from: B */
    private final List f35795B;

    /* renamed from: C */
    private boolean f35796C;

    /* renamed from: D */
    private ValueAnimator f35797D;

    /* renamed from: E */
    private ValueAnimator f35798E;

    /* renamed from: F */
    private final int f35799F;

    /* renamed from: G */
    private int f35800G;

    /* renamed from: H */
    private int f35801H;

    /* renamed from: I */
    private int f35802I;

    /* renamed from: J */
    private int f35803J;

    /* renamed from: K */
    private int f35804K;

    /* renamed from: L */
    private int f35805L;

    /* renamed from: M */
    private int f35806M;

    /* renamed from: N */
    private int f35807N;

    /* renamed from: O */
    private int f35808O;

    /* renamed from: P */
    private int f35809P;

    /* renamed from: Q */
    private float f35810Q;

    /* renamed from: R */
    private MotionEvent f35811R;

    /* renamed from: S */
    private boolean f35812S;

    /* renamed from: T */
    private float f35813T;

    /* renamed from: U */
    private float f35814U;

    /* renamed from: V */
    private ArrayList f35815V;

    /* renamed from: W */
    private int f35816W;

    /* renamed from: a0 */
    private int f35817a0;

    /* renamed from: b0 */
    private float f35818b0;

    /* renamed from: c0 */
    private float[] f35819c0;

    /* renamed from: d0 */
    private boolean f35820d0;

    /* renamed from: e0 */
    private int f35821e0;

    /* renamed from: f0 */
    private boolean f35822f0;

    /* renamed from: g0 */
    private boolean f35823g0;

    /* renamed from: h0 */
    private boolean f35824h0;

    /* renamed from: i0 */
    private ColorStateList f35825i0;

    /* renamed from: j0 */
    private ColorStateList f35826j0;

    /* renamed from: k0 */
    private ColorStateList f35827k0;

    /* renamed from: l0 */
    private ColorStateList f35828l0;

    /* renamed from: m0 */
    private ColorStateList f35829m0;

    /* renamed from: n0 */
    private final C31689h f35830n0;

    /* renamed from: o0 */
    private float f35831o0;

    /* renamed from: p */
    private final Paint f35832p;

    /* renamed from: p0 */
    private int f35833p0;

    /* renamed from: q */
    private final Paint f35834q;

    /* renamed from: r */
    private final Paint f35835r;

    /* renamed from: s */
    private final Paint f35836s;

    /* renamed from: t */
    private final Paint f35837t;

    /* renamed from: u */
    private final Paint f35838u;

    /* renamed from: v */
    private final C6394e f35839v;

    /* renamed from: w */
    private final AccessibilityManager f35840w;

    /* renamed from: x */
    private RunnableC6393d f35841x;

    /* renamed from: y */
    private final InterfaceC6395f f35842y;

    /* renamed from: z */
    private final List f35843z;

    /* loaded from: classes3.dex */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C6389a();

        /* renamed from: p */
        float f35844p;

        /* renamed from: q */
        float f35845q;

        /* renamed from: r */
        ArrayList f35846r;

        /* renamed from: s */
        float f35847s;

        /* renamed from: t */
        boolean f35848t;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
        /* loaded from: classes3.dex */
        static class C6389a implements Parcelable.Creator {
            C6389a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SliderState[] newArray(int i11) {
                return new SliderState[i11];
            }
        }

        /* synthetic */ SliderState(Parcel parcel, C6390a c6390a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeFloat(this.f35844p);
            parcel.writeFloat(this.f35845q);
            parcel.writeList(this.f35846r);
            parcel.writeFloat(this.f35847s);
            parcel.writeBooleanArray(new boolean[]{this.f35848t});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(Parcel parcel) {
            super(parcel);
            this.f35844p = parcel.readFloat();
            this.f35845q = parcel.readFloat();
            ArrayList arrayList = new ArrayList();
            this.f35846r = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f35847s = parcel.readFloat();
            this.f35848t = parcel.createBooleanArray()[0];
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    /* loaded from: classes3.dex */
    public class C6390a implements InterfaceC6395f {

        /* renamed from: a */
        final /* synthetic */ AttributeSet f35849a;

        /* renamed from: b */
        final /* synthetic */ int f35850b;

        C6390a(AttributeSet attributeSet, int i11) {
            this.f35849a = attributeSet;
            this.f35850b = i11;
        }

        @Override // com.google.android.material.slider.BaseSlider.InterfaceC6395f
        /* renamed from: a */
        public C2646a mo32916a() {
            TypedArray m32639h = AbstractC6355v.m32639h(BaseSlider.this.getContext(), this.f35849a, AbstractC23587l.Slider, this.f35850b, BaseSlider.f35793q0, new int[0]);
            C2646a m32865Y = BaseSlider.m32865Y(BaseSlider.this.getContext(), m32639h);
            m32639h.recycle();
            return m32865Y;
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    /* loaded from: classes3.dex */
    public class C6391b implements ValueAnimator.AnimatorUpdateListener {
        C6391b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f35843z.iterator();
            while (it.hasNext()) {
                ((C2646a) it.next()).m13071C0(floatValue);
            }
            AbstractC1579n0.m7898r0(BaseSlider.this);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    /* loaded from: classes3.dex */
    public class C6392c extends AnimatorListenerAdapter {
        C6392c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Iterator it = BaseSlider.this.f35843z.iterator();
            while (it.hasNext()) {
                AbstractC6359z.m32650e(BaseSlider.this).mo32645b((C2646a) it.next());
            }
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$d */
    /* loaded from: classes3.dex */
    public class RunnableC6393d implements Runnable {

        /* renamed from: p */
        int f35854p;

        private RunnableC6393d() {
            this.f35854p = -1;
        }

        /* renamed from: a */
        void m32917a(int i11) {
            this.f35854p = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f35839v.m117454W(this.f35854p, 4);
        }

        /* synthetic */ RunnableC6393d(BaseSlider baseSlider, C6390a c6390a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.slider.BaseSlider$e */
    /* loaded from: classes3.dex */
    public static class C6394e extends AbstractC22710a {

        /* renamed from: q */
        private final BaseSlider f35856q;

        /* renamed from: r */
        Rect f35857r;

        C6394e(BaseSlider baseSlider) {
            super(baseSlider);
            this.f35857r = new Rect();
            this.f35856q = baseSlider;
        }

        /* renamed from: Y */
        private String m32918Y(int i11) {
            if (i11 == this.f35856q.getValues().size() - 1) {
                return this.f35856q.getContext().getString(AbstractC23585j.material_slider_range_end);
            }
            if (i11 == 0) {
                return this.f35856q.getContext().getString(AbstractC23585j.material_slider_range_start);
            }
            return "";
        }

        @Override // p337m1.AbstractC22710a
        /* renamed from: B */
        protected int mo32059B(float f11, float f12) {
            for (int i11 = 0; i11 < this.f35856q.getValues().size(); i11++) {
                this.f35856q.m32913k0(i11, this.f35857r);
                if (this.f35857r.contains((int) f11, (int) f12)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // p337m1.AbstractC22710a
        /* renamed from: C */
        protected void mo32060C(List list) {
            for (int i11 = 0; i11 < this.f35856q.getValues().size(); i11++) {
                list.add(Integer.valueOf(i11));
            }
        }

        @Override // p337m1.AbstractC22710a
        /* renamed from: L */
        protected boolean mo32061L(int i11, int i12, Bundle bundle) {
            if (!this.f35856q.isEnabled()) {
                return false;
            }
            if (i12 == 4096 || i12 == 8192) {
                float m32887m = this.f35856q.m32887m(20);
                if (i12 == 8192) {
                    m32887m = -m32887m;
                }
                if (this.f35856q.m32909M()) {
                    m32887m = -m32887m;
                }
                if (this.f35856q.m32881i0(i11, AbstractC20900a.m109344a(this.f35856q.getValues().get(i11).floatValue() + m32887m, this.f35856q.getValueFrom(), this.f35856q.getValueTo()))) {
                    this.f35856q.m32886l0();
                    this.f35856q.postInvalidate();
                    m117446E(i11);
                    return true;
                }
                return false;
            }
            if (i12 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                if (this.f35856q.m32881i0(i11, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    this.f35856q.m32886l0();
                    this.f35856q.postInvalidate();
                    m117446E(i11);
                    return true;
                }
            }
            return false;
        }

        @Override // p337m1.AbstractC22710a
        /* renamed from: P */
        protected void mo32063P(int i11, C1507g0 c1507g0) {
            c1507g0.m7614b(C1507g0.a.f6433L);
            List<Float> values = this.f35856q.getValues();
            float floatValue = values.get(i11).floatValue();
            float valueFrom = this.f35856q.getValueFrom();
            float valueTo = this.f35856q.getValueTo();
            if (this.f35856q.isEnabled()) {
                if (floatValue > valueFrom) {
                    c1507g0.m7612a(8192);
                }
                if (floatValue < valueTo) {
                    c1507g0.m7612a(4096);
                }
            }
            c1507g0.m7648v0(C1507g0.d.m7663a(1, valueFrom, valueTo, floatValue));
            c1507g0.m7619d0(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f35856q.getContentDescription() != null) {
                sb2.append(this.f35856q.getContentDescription());
                sb2.append(",");
            }
            if (values.size() > 1) {
                sb2.append(m32918Y(i11));
                sb2.append(this.f35856q.m32845C(floatValue));
            }
            c1507g0.m7624h0(sb2.toString());
            this.f35856q.m32913k0(i11, this.f35857r);
            c1507g0.m7610Y(this.f35857r);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$f */
    /* loaded from: classes3.dex */
    public interface InterfaceC6395f {
        /* renamed from: a */
        C2646a mo32916a();
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.sliderStyle);
    }

    /* renamed from: A */
    private void m32843A() {
        if (this.f35796C) {
            this.f35796C = false;
            ValueAnimator m32892p = m32892p(false);
            this.f35798E = m32892p;
            this.f35797D = null;
            m32892p.addListener(new C6392c());
            this.f35798E.start();
        }
    }

    /* renamed from: B */
    private void m32844B(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 17) {
                    if (i11 == 66) {
                        m32860T(Integer.MIN_VALUE);
                        return;
                    }
                    return;
                }
                m32860T(Integer.MAX_VALUE);
                return;
            }
            m32859S(Integer.MIN_VALUE);
            return;
        }
        m32859S(Integer.MAX_VALUE);
    }

    /* renamed from: C */
    public String m32845C(float f11) {
        String str;
        if (!mo32908J()) {
            if (((int) f11) == f11) {
                str = "%.0f";
            } else {
                str = "%.2f";
            }
            return String.format(str, Float.valueOf(f11));
        }
        throw null;
    }

    /* renamed from: D */
    private float[] m32846D() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f35815V.size() == 1) {
            floatValue2 = this.f35813T;
        }
        float m32861U = m32861U(floatValue2);
        float m32861U2 = m32861U(floatValue);
        if (m32909M()) {
            return new float[]{m32861U2, m32861U};
        }
        return new float[]{m32861U, m32861U2};
    }

    /* renamed from: E */
    private static float m32847E(ValueAnimator valueAnimator, float f11) {
        if (valueAnimator != null && valueAnimator.isRunning()) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            return floatValue;
        }
        return f11;
    }

    /* renamed from: F */
    private float m32848F(int i11, float f11) {
        float floatValue;
        float floatValue2;
        float f12 = 0.0f;
        if (this.f35818b0 == 0.0f) {
            f12 = getMinSeparation();
        }
        if (this.f35833p0 == 0) {
            f12 = m32898s(f12);
        }
        if (m32909M()) {
            f12 = -f12;
        }
        int i12 = i11 + 1;
        if (i12 >= this.f35815V.size()) {
            floatValue = this.f35814U;
        } else {
            floatValue = ((Float) this.f35815V.get(i12)).floatValue() - f12;
        }
        int i13 = i11 - 1;
        if (i13 < 0) {
            floatValue2 = this.f35813T;
        } else {
            floatValue2 = ((Float) this.f35815V.get(i13)).floatValue() + f12;
        }
        return AbstractC20900a.m109344a(f11, floatValue2, floatValue);
    }

    /* renamed from: G */
    private int m32849G(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: H */
    private float m32850H() {
        double m32880h0 = m32880h0(this.f35831o0);
        if (m32909M()) {
            m32880h0 = 1.0d - m32880h0;
        }
        float f11 = this.f35814U;
        return (float) ((m32880h0 * (f11 - r3)) + this.f35813T);
    }

    /* renamed from: I */
    private float m32851I() {
        float f11 = this.f35831o0;
        if (m32909M()) {
            f11 = 1.0f - f11;
        }
        float f12 = this.f35814U;
        float f13 = this.f35813T;
        return (f11 * (f12 - f13)) + f13;
    }

    /* renamed from: K */
    private void m32852K() {
        this.f35832p.setStrokeWidth(this.f35804K);
        this.f35834q.setStrokeWidth(this.f35804K);
        this.f35837t.setStrokeWidth(this.f35804K / 2.0f);
        this.f35838u.setStrokeWidth(this.f35804K / 2.0f);
    }

    /* renamed from: L */
    private boolean m32853L() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    private void m32854N(Resources resources) {
        this.f35802I = resources.getDimensionPixelSize(AbstractC23579d.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(AbstractC23579d.mtrl_slider_track_side_padding);
        this.f35800G = dimensionPixelOffset;
        this.f35805L = dimensionPixelOffset;
        this.f35801H = resources.getDimensionPixelSize(AbstractC23579d.mtrl_slider_thumb_radius);
        this.f35806M = resources.getDimensionPixelOffset(AbstractC23579d.mtrl_slider_track_top);
        this.f35809P = resources.getDimensionPixelSize(AbstractC23579d.mtrl_slider_label_padding);
    }

    /* renamed from: O */
    private void m32855O() {
        if (this.f35818b0 <= 0.0f) {
            return;
        }
        m32890n0();
        int min = Math.min((int) (((this.f35814U - this.f35813T) / this.f35818b0) + 1.0f), (this.f35821e0 / (this.f35804K * 2)) + 1);
        float[] fArr = this.f35819c0;
        if (fArr == null || fArr.length != min * 2) {
            this.f35819c0 = new float[min * 2];
        }
        float f11 = this.f35821e0 / (min - 1);
        for (int i11 = 0; i11 < min * 2; i11 += 2) {
            float[] fArr2 = this.f35819c0;
            fArr2[i11] = this.f35805L + ((i11 / 2) * f11);
            fArr2[i11 + 1] = m32889n();
        }
    }

    /* renamed from: P */
    private void m32856P(Canvas canvas, int i11, int i12) {
        if (m32877f0()) {
            int m32861U = (int) (this.f35805L + (m32861U(((Float) this.f35815V.get(this.f35817a0)).floatValue()) * i11));
            if (Build.VERSION.SDK_INT < 28) {
                int i13 = this.f35808O;
                canvas.clipRect(m32861U - i13, i12 - i13, m32861U + i13, i13 + i12, Region.Op.UNION);
            }
            canvas.drawCircle(m32861U, i12, this.f35808O, this.f35836s);
        }
    }

    /* renamed from: Q */
    private void m32857Q(Canvas canvas) {
        if (this.f35820d0 && this.f35818b0 > 0.0f) {
            float[] m32846D = m32846D();
            int m32867a0 = m32867a0(this.f35819c0, m32846D[0]);
            int m32867a02 = m32867a0(this.f35819c0, m32846D[1]);
            int i11 = m32867a0 * 2;
            canvas.drawPoints(this.f35819c0, 0, i11, this.f35837t);
            int i12 = m32867a02 * 2;
            canvas.drawPoints(this.f35819c0, i11, i12 - i11, this.f35838u);
            float[] fArr = this.f35819c0;
            canvas.drawPoints(fArr, i12, fArr.length - i12, this.f35837t);
        }
    }

    /* renamed from: R */
    private void m32858R() {
        this.f35805L = this.f35800G + Math.max(this.f35807N - this.f35801H, 0);
        if (AbstractC1579n0.m7865e0(this)) {
            m32888m0(getWidth());
        }
    }

    /* renamed from: S */
    private boolean m32859S(int i11) {
        int i12 = this.f35817a0;
        int m109346c = (int) AbstractC20900a.m109346c(i12 + i11, 0L, this.f35815V.size() - 1);
        this.f35817a0 = m109346c;
        if (m109346c == i12) {
            return false;
        }
        if (this.f35816W != -1) {
            this.f35816W = m109346c;
        }
        m32886l0();
        postInvalidate();
        return true;
    }

    /* renamed from: T */
    private boolean m32860T(int i11) {
        if (m32909M()) {
            if (i11 == Integer.MIN_VALUE) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = -i11;
            }
        }
        return m32859S(i11);
    }

    /* renamed from: U */
    private float m32861U(float f11) {
        float f12 = this.f35813T;
        float f13 = (f11 - f12) / (this.f35814U - f12);
        if (m32909M()) {
            return 1.0f - f13;
        }
        return f13;
    }

    /* renamed from: V */
    private Boolean m32862V(int i11, KeyEvent keyEvent) {
        if (i11 != 61) {
            if (i11 != 66) {
                if (i11 != 81) {
                    if (i11 != 69) {
                        if (i11 != 70) {
                            switch (i11) {
                                case 21:
                                    m32860T(-1);
                                    return Boolean.TRUE;
                                case 22:
                                    m32860T(1);
                                    return Boolean.TRUE;
                                case 23:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    } else {
                        m32859S(-1);
                        return Boolean.TRUE;
                    }
                }
                m32859S(1);
                return Boolean.TRUE;
            }
            this.f35816W = this.f35817a0;
            postInvalidate();
            return Boolean.TRUE;
        }
        if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(m32859S(1));
        }
        if (keyEvent.isShiftPressed()) {
            return Boolean.valueOf(m32859S(-1));
        }
        return Boolean.FALSE;
    }

    /* renamed from: W */
    private void m32863W() {
        Iterator it = this.f35795B.iterator();
        while (it.hasNext()) {
            ((InterfaceC6399b) it.next()).mo32927a(this);
        }
    }

    /* renamed from: X */
    private void m32864X() {
        Iterator it = this.f35795B.iterator();
        while (it.hasNext()) {
            ((InterfaceC6399b) it.next()).mo32928b(this);
        }
    }

    /* renamed from: Y */
    public static C2646a m32865Y(Context context, TypedArray typedArray) {
        return C2646a.m13066v0(context, null, 0, typedArray.getResourceId(AbstractC23587l.Slider_labelStyle, AbstractC23586k.Widget_MaterialComponents_Tooltip));
    }

    /* renamed from: a0 */
    private static int m32867a0(float[] fArr, float f11) {
        return Math.round(f11 * ((fArr.length / 2) - 1));
    }

    /* renamed from: b0 */
    private void m32869b0(Context context, AttributeSet attributeSet, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        TypedArray m32639h = AbstractC6355v.m32639h(context, attributeSet, AbstractC23587l.Slider, i11, f35793q0, new int[0]);
        this.f35813T = m32639h.getFloat(AbstractC23587l.Slider_android_valueFrom, 0.0f);
        this.f35814U = m32639h.getFloat(AbstractC23587l.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f35813T));
        this.f35818b0 = m32639h.getFloat(AbstractC23587l.Slider_android_stepSize, 0.0f);
        boolean hasValue = m32639h.hasValue(AbstractC23587l.Slider_trackColor);
        if (hasValue) {
            i12 = AbstractC23587l.Slider_trackColor;
        } else {
            i12 = AbstractC23587l.Slider_trackColorInactive;
        }
        if (hasValue) {
            i13 = AbstractC23587l.Slider_trackColor;
        } else {
            i13 = AbstractC23587l.Slider_trackColorActive;
        }
        ColorStateList m143973a = AbstractC28774c.m143973a(context, m32639h, i12);
        if (m143973a == null) {
            m143973a = AbstractC19694b.m103335c(context, AbstractC23578c.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(m143973a);
        ColorStateList m143973a2 = AbstractC28774c.m143973a(context, m32639h, i13);
        if (m143973a2 == null) {
            m143973a2 = AbstractC19694b.m103335c(context, AbstractC23578c.material_slider_active_track_color);
        }
        setTrackActiveTintList(m143973a2);
        this.f35830n0.m152442c0(AbstractC28774c.m143973a(context, m32639h, AbstractC23587l.Slider_thumbColor));
        if (m32639h.hasValue(AbstractC23587l.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(AbstractC28774c.m143973a(context, m32639h, AbstractC23587l.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(m32639h.getDimension(AbstractC23587l.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList m143973a3 = AbstractC28774c.m143973a(context, m32639h, AbstractC23587l.Slider_haloColor);
        if (m143973a3 == null) {
            m143973a3 = AbstractC19694b.m103335c(context, AbstractC23578c.material_slider_halo_color);
        }
        setHaloTintList(m143973a3);
        this.f35820d0 = m32639h.getBoolean(AbstractC23587l.Slider_tickVisible, true);
        boolean hasValue2 = m32639h.hasValue(AbstractC23587l.Slider_tickColor);
        if (hasValue2) {
            i14 = AbstractC23587l.Slider_tickColor;
        } else {
            i14 = AbstractC23587l.Slider_tickColorInactive;
        }
        if (hasValue2) {
            i15 = AbstractC23587l.Slider_tickColor;
        } else {
            i15 = AbstractC23587l.Slider_tickColorActive;
        }
        ColorStateList m143973a4 = AbstractC28774c.m143973a(context, m32639h, i14);
        if (m143973a4 == null) {
            m143973a4 = AbstractC19694b.m103335c(context, AbstractC23578c.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(m143973a4);
        ColorStateList m143973a5 = AbstractC28774c.m143973a(context, m32639h, i15);
        if (m143973a5 == null) {
            m143973a5 = AbstractC19694b.m103335c(context, AbstractC23578c.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(m143973a5);
        setThumbRadius(m32639h.getDimensionPixelSize(AbstractC23587l.Slider_thumbRadius, 0));
        setHaloRadius(m32639h.getDimensionPixelSize(AbstractC23587l.Slider_haloRadius, 0));
        setThumbElevation(m32639h.getDimension(AbstractC23587l.Slider_thumbElevation, 0.0f));
        setTrackHeight(m32639h.getDimensionPixelSize(AbstractC23587l.Slider_trackHeight, 0));
        this.f35803J = m32639h.getInt(AbstractC23587l.Slider_labelBehavior, 0);
        if (!m32639h.getBoolean(AbstractC23587l.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        m32639h.recycle();
    }

    /* renamed from: c0 */
    private void m32871c0(int i11) {
        RunnableC6393d runnableC6393d = this.f35841x;
        if (runnableC6393d == null) {
            this.f35841x = new RunnableC6393d(this, null);
        } else {
            removeCallbacks(runnableC6393d);
        }
        this.f35841x.m32917a(i11);
        postDelayed(this.f35841x, 200L);
    }

    /* renamed from: d0 */
    private void m32873d0(C2646a c2646a, float f11) {
        c2646a.m13072D0(m32845C(f11));
        int m32861U = (this.f35805L + ((int) (m32861U(f11) * this.f35821e0))) - (c2646a.getIntrinsicWidth() / 2);
        int m32889n = m32889n() - (this.f35809P + this.f35807N);
        c2646a.setBounds(m32861U, m32889n - c2646a.getIntrinsicHeight(), c2646a.getIntrinsicWidth() + m32861U, m32889n);
        Rect rect = new Rect(c2646a.getBounds());
        AbstractC6336c.m32557c(AbstractC6359z.m32649d(this), this, rect);
        c2646a.setBounds(rect);
        AbstractC6359z.m32650e(this).mo32644a(c2646a);
    }

    /* renamed from: e0 */
    private void m32875e0(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f35815V.size() == arrayList.size() && this.f35815V.equals(arrayList)) {
                return;
            }
            this.f35815V = arrayList;
            this.f35824h0 = true;
            this.f35817a0 = 0;
            m32886l0();
            m32894q();
            m32903v();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* renamed from: f0 */
    private boolean m32877f0() {
        if (!this.f35822f0 && (getBackground() instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    /* renamed from: g0 */
    private boolean m32879g0(float f11) {
        return m32881i0(this.f35816W, f11);
    }

    /* renamed from: h0 */
    private double m32880h0(float f11) {
        float f12 = this.f35818b0;
        if (f12 > 0.0f) {
            return Math.round(f11 * r0) / ((int) ((this.f35814U - this.f35813T) / f12));
        }
        return f11;
    }

    /* renamed from: i0 */
    public boolean m32881i0(int i11, float f11) {
        if (Math.abs(f11 - ((Float) this.f35815V.get(i11)).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f35815V.set(i11, Float.valueOf(m32848F(i11, f11)));
        this.f35817a0 = i11;
        m32901u(i11);
        return true;
    }

    /* renamed from: j */
    private void m32882j(C2646a c2646a) {
        c2646a.m13070B0(AbstractC6359z.m32649d(this));
    }

    /* renamed from: j0 */
    private boolean m32883j0() {
        return m32879g0(m32850H());
    }

    /* renamed from: k */
    private Float m32884k(int i11) {
        float m32885l;
        if (this.f35823g0) {
            m32885l = m32887m(20);
        } else {
            m32885l = m32885l();
        }
        if (i11 != 21) {
            if (i11 != 22) {
                if (i11 != 69) {
                    if (i11 != 70 && i11 != 81) {
                        return null;
                    }
                    return Float.valueOf(m32885l);
                }
                return Float.valueOf(-m32885l);
            }
            if (m32909M()) {
                m32885l = -m32885l;
            }
            return Float.valueOf(m32885l);
        }
        if (!m32909M()) {
            m32885l = -m32885l;
        }
        return Float.valueOf(m32885l);
    }

    /* renamed from: l */
    private float m32885l() {
        float f11 = this.f35818b0;
        if (f11 == 0.0f) {
            return 1.0f;
        }
        return f11;
    }

    /* renamed from: l0 */
    public void m32886l0() {
        if (!m32877f0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int m32861U = (int) ((m32861U(((Float) this.f35815V.get(this.f35817a0)).floatValue()) * this.f35821e0) + this.f35805L);
                int m32889n = m32889n();
                int i11 = this.f35808O;
                AbstractC1414a.m7194l(background, m32861U - i11, m32889n - i11, m32861U + i11, m32889n + i11);
            }
        }
    }

    /* renamed from: m */
    public float m32887m(int i11) {
        float m32885l = m32885l();
        if ((this.f35814U - this.f35813T) / m32885l <= i11) {
            return m32885l;
        }
        return Math.round(r1 / r4) * m32885l;
    }

    /* renamed from: m0 */
    private void m32888m0(int i11) {
        this.f35821e0 = Math.max(i11 - (this.f35805L * 2), 0);
        m32855O();
    }

    /* renamed from: n */
    private int m32889n() {
        int i11 = this.f35806M;
        int i12 = 0;
        if (this.f35803J == 1) {
            i12 = ((C2646a) this.f35843z.get(0)).getIntrinsicHeight();
        }
        return i11 + i12;
    }

    /* renamed from: n0 */
    private void m32890n0() {
        if (this.f35824h0) {
            m32893p0();
            m32895q0();
            m32891o0();
            m32897r0();
            m32902u0();
            this.f35824h0 = false;
        }
    }

    /* renamed from: o0 */
    private void m32891o0() {
        if (this.f35818b0 > 0.0f && !m32899s0(this.f35814U)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.toString(this.f35818b0), Float.toString(this.f35813T), Float.toString(this.f35814U)));
        }
    }

    /* renamed from: p */
    private ValueAnimator m32892p(boolean z11) {
        float f11;
        ValueAnimator valueAnimator;
        long j11;
        TimeInterpolator timeInterpolator;
        float f12 = 1.0f;
        if (z11) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        if (z11) {
            valueAnimator = this.f35798E;
        } else {
            valueAnimator = this.f35797D;
        }
        float m32847E = m32847E(valueAnimator, f11);
        if (!z11) {
            f12 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m32847E, f12);
        if (z11) {
            j11 = 83;
        } else {
            j11 = 117;
        }
        ofFloat.setDuration(j11);
        if (z11) {
            timeInterpolator = AbstractC24041a.f116362e;
        } else {
            timeInterpolator = AbstractC24041a.f116360c;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new C6391b());
        return ofFloat;
    }

    /* renamed from: p0 */
    private void m32893p0() {
        if (this.f35813T < this.f35814U) {
        } else {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.toString(this.f35813T), Float.toString(this.f35814U)));
        }
    }

    /* renamed from: q */
    private void m32894q() {
        if (this.f35843z.size() > this.f35815V.size()) {
            List<C2646a> subList = this.f35843z.subList(this.f35815V.size(), this.f35843z.size());
            for (C2646a c2646a : subList) {
                if (AbstractC1579n0.m7862d0(this)) {
                    m32896r(c2646a);
                }
            }
            subList.clear();
        }
        while (this.f35843z.size() < this.f35815V.size()) {
            C2646a mo32916a = this.f35842y.mo32916a();
            this.f35843z.add(mo32916a);
            if (AbstractC1579n0.m7862d0(this)) {
                m32882j(mo32916a);
            }
        }
        int i11 = 1;
        if (this.f35843z.size() == 1) {
            i11 = 0;
        }
        Iterator it = this.f35843z.iterator();
        while (it.hasNext()) {
            ((C2646a) it.next()).m152455n0(i11);
        }
    }

    /* renamed from: q0 */
    private void m32895q0() {
        if (this.f35814U > this.f35813T) {
        } else {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.toString(this.f35814U), Float.toString(this.f35813T)));
        }
    }

    /* renamed from: r */
    private void m32896r(C2646a c2646a) {
        InterfaceC6358y m32650e = AbstractC6359z.m32650e(this);
        if (m32650e != null) {
            m32650e.mo32645b(c2646a);
            c2646a.m13075x0(AbstractC6359z.m32649d(this));
        }
    }

    /* renamed from: r0 */
    private void m32897r0() {
        Iterator it = this.f35815V.iterator();
        while (it.hasNext()) {
            Float f11 = (Float) it.next();
            if (f11.floatValue() >= this.f35813T && f11.floatValue() <= this.f35814U) {
                if (this.f35818b0 > 0.0f && !m32899s0(f11.floatValue())) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", Float.toString(f11.floatValue()), Float.toString(this.f35813T), Float.toString(this.f35818b0), Float.toString(this.f35818b0)));
                }
            } else {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", Float.toString(f11.floatValue()), Float.toString(this.f35813T), Float.toString(this.f35814U)));
            }
        }
    }

    /* renamed from: s */
    private float m32898s(float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        float f12 = (f11 - this.f35805L) / this.f35821e0;
        float f13 = this.f35813T;
        return (f12 * (f13 - this.f35814U)) + f13;
    }

    /* renamed from: s0 */
    private boolean m32899s0(float f11) {
        if (Math.abs(Math.round(r0) - new BigDecimal(Float.toString(f11)).subtract(new BigDecimal(Float.toString(this.f35813T))).divide(new BigDecimal(Float.toString(this.f35818b0)), MathContext.DECIMAL64).doubleValue()) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    private float m32900t0(float f11) {
        return (m32861U(f11) * this.f35821e0) + this.f35805L;
    }

    /* renamed from: u */
    private void m32901u(int i11) {
        Iterator it = this.f35794A.iterator();
        while (it.hasNext()) {
            ((InterfaceC6398a) it.next()).mo32926a(this, ((Float) this.f35815V.get(i11)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f35840w;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            m32871c0(i11);
        }
    }

    /* renamed from: u0 */
    private void m32902u0() {
        float f11 = this.f35818b0;
        if (f11 == 0.0f) {
            return;
        }
        if (((int) f11) != f11) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "stepSize", Float.valueOf(f11));
        }
        float f12 = this.f35813T;
        if (((int) f12) != f12) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "valueFrom", Float.valueOf(f12));
        }
        float f13 = this.f35814U;
        if (((int) f13) != f13) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "valueTo", Float.valueOf(f13));
        }
    }

    /* renamed from: v */
    private void m32903v() {
        for (InterfaceC6398a interfaceC6398a : this.f35794A) {
            Iterator it = this.f35815V.iterator();
            while (it.hasNext()) {
                interfaceC6398a.mo32926a(this, ((Float) it.next()).floatValue(), false);
            }
        }
    }

    /* renamed from: w */
    private void m32904w(Canvas canvas, int i11, int i12) {
        float[] m32846D = m32846D();
        int i13 = this.f35805L;
        float f11 = i11;
        float f12 = i12;
        canvas.drawLine(i13 + (m32846D[0] * f11), f12, i13 + (m32846D[1] * f11), f12, this.f35834q);
    }

    /* renamed from: x */
    private void m32905x(Canvas canvas, int i11, int i12) {
        float[] m32846D = m32846D();
        float f11 = i11;
        float f12 = this.f35805L + (m32846D[1] * f11);
        if (f12 < r1 + i11) {
            float f13 = i12;
            canvas.drawLine(f12, f13, r1 + i11, f13, this.f35832p);
        }
        int i13 = this.f35805L;
        float f14 = i13 + (m32846D[0] * f11);
        if (f14 > i13) {
            float f15 = i12;
            canvas.drawLine(i13, f15, f14, f15, this.f35832p);
        }
    }

    /* renamed from: y */
    private void m32906y(Canvas canvas, int i11, int i12) {
        if (!isEnabled()) {
            Iterator it = this.f35815V.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(this.f35805L + (m32861U(((Float) it.next()).floatValue()) * i11), i12, this.f35807N, this.f35835r);
            }
        }
        Iterator it2 = this.f35815V.iterator();
        while (it2.hasNext()) {
            Float f11 = (Float) it2.next();
            canvas.save();
            int m32861U = this.f35805L + ((int) (m32861U(f11.floatValue()) * i11));
            int i13 = this.f35807N;
            canvas.translate(m32861U - i13, i12 - i13);
            this.f35830n0.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: z */
    private void m32907z() {
        if (this.f35803J == 2) {
            return;
        }
        if (!this.f35796C) {
            this.f35796C = true;
            ValueAnimator m32892p = m32892p(true);
            this.f35797D = m32892p;
            this.f35798E = null;
            m32892p.start();
        }
        Iterator it = this.f35843z.iterator();
        for (int i11 = 0; i11 < this.f35815V.size() && it.hasNext(); i11++) {
            if (i11 != this.f35817a0) {
                m32873d0((C2646a) it.next(), ((Float) this.f35815V.get(i11)).floatValue());
            }
        }
        if (it.hasNext()) {
            m32873d0((C2646a) it.next(), ((Float) this.f35815V.get(this.f35817a0)).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f35843z.size()), Integer.valueOf(this.f35815V.size())));
    }

    /* renamed from: J */
    public boolean mo32908J() {
        return false;
    }

    /* renamed from: M */
    final boolean m32909M() {
        if (AbstractC1579n0.m7812G(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    protected boolean mo32910Z() {
        boolean z11;
        if (this.f35816W != -1) {
            return true;
        }
        float m32851I = m32851I();
        float m32900t0 = m32900t0(m32851I);
        this.f35816W = 0;
        float abs = Math.abs(((Float) this.f35815V.get(0)).floatValue() - m32851I);
        for (int i11 = 1; i11 < this.f35815V.size(); i11++) {
            float abs2 = Math.abs(((Float) this.f35815V.get(i11)).floatValue() - m32851I);
            float m32900t02 = m32900t0(((Float) this.f35815V.get(i11)).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!m32909M() ? m32900t02 - m32900t0 < 0.0f : m32900t02 - m32900t0 > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.f35816W = i11;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(m32900t02 - m32900t0) < this.f35799F) {
                        this.f35816W = -1;
                        return false;
                    }
                    if (z11) {
                        this.f35816W = i11;
                    }
                }
            }
            abs = abs2;
        }
        if (this.f35816W != -1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f35839v.m117456v(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f35832p.setColor(m32849G(this.f35829m0));
        this.f35834q.setColor(m32849G(this.f35828l0));
        this.f35837t.setColor(m32849G(this.f35827k0));
        this.f35838u.setColor(m32849G(this.f35826j0));
        for (C2646a c2646a : this.f35843z) {
            if (c2646a.isStateful()) {
                c2646a.setState(getDrawableState());
            }
        }
        if (this.f35830n0.isStateful()) {
            this.f35830n0.setState(getDrawableState());
        }
        this.f35836s.setColor(m32849G(this.f35825i0));
        this.f35836s.setAlpha(63);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    final int getAccessibilityFocusedVirtualViewId() {
        return this.f35839v.m117458x();
    }

    public int getActiveThumbIndex() {
        return this.f35816W;
    }

    public int getFocusedThumbIndex() {
        return this.f35817a0;
    }

    public int getHaloRadius() {
        return this.f35808O;
    }

    public ColorStateList getHaloTintList() {
        return this.f35825i0;
    }

    public int getLabelBehavior() {
        return this.f35803J;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f35818b0;
    }

    public float getThumbElevation() {
        return this.f35830n0.m152460y();
    }

    public int getThumbRadius() {
        return this.f35807N;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f35830n0.m152428G();
    }

    public float getThumbStrokeWidth() {
        return this.f35830n0.m152429I();
    }

    public ColorStateList getThumbTintList() {
        return this.f35830n0.m152461z();
    }

    public ColorStateList getTickActiveTintList() {
        return this.f35826j0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f35827k0;
    }

    public ColorStateList getTickTintList() {
        if (this.f35827k0.equals(this.f35826j0)) {
            return this.f35826j0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f35828l0;
    }

    public int getTrackHeight() {
        return this.f35804K;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f35829m0;
    }

    public int getTrackSidePadding() {
        return this.f35805L;
    }

    public ColorStateList getTrackTintList() {
        if (this.f35829m0.equals(this.f35828l0)) {
            return this.f35828l0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f35821e0;
    }

    public float getValueFrom() {
        return this.f35813T;
    }

    public float getValueTo() {
        return this.f35814U;
    }

    public List<Float> getValues() {
        return new ArrayList(this.f35815V);
    }

    /* renamed from: h */
    public void mo32911h(InterfaceC6398a interfaceC6398a) {
        this.f35794A.add(interfaceC6398a);
    }

    /* renamed from: i */
    public void mo32912i(InterfaceC6399b interfaceC6399b) {
        this.f35795B.add(interfaceC6399b);
    }

    /* renamed from: k0 */
    void m32913k0(int i11, Rect rect) {
        int m32861U = this.f35805L + ((int) (m32861U(getValues().get(i11).floatValue()) * this.f35821e0));
        int m32889n = m32889n();
        int i12 = this.f35807N;
        rect.set(m32861U - i12, m32889n - i12, m32861U + i12, m32889n + i12);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f35843z.iterator();
        while (it.hasNext()) {
            m32882j((C2646a) it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        RunnableC6393d runnableC6393d = this.f35841x;
        if (runnableC6393d != null) {
            removeCallbacks(runnableC6393d);
        }
        this.f35796C = false;
        Iterator it = this.f35843z.iterator();
        while (it.hasNext()) {
            m32896r((C2646a) it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f35824h0) {
            m32890n0();
            m32855O();
        }
        super.onDraw(canvas);
        int m32889n = m32889n();
        m32905x(canvas, this.f35821e0, m32889n);
        if (((Float) Collections.max(getValues())).floatValue() > this.f35813T) {
            m32904w(canvas, this.f35821e0, m32889n);
        }
        m32857Q(canvas);
        if ((this.f35812S || isFocused()) && isEnabled()) {
            m32856P(canvas, this.f35821e0, m32889n);
            if (this.f35816W != -1) {
                m32907z();
            }
        }
        m32906y(canvas, this.f35821e0, m32889n);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (!z11) {
            this.f35816W = -1;
            m32843A();
            this.f35839v.m117455o(this.f35817a0);
        } else {
            m32844B(i11);
            this.f35839v.m117453V(this.f35817a0);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i11, keyEvent);
        }
        if (this.f35815V.size() == 1) {
            this.f35816W = 0;
        }
        if (this.f35816W == -1) {
            Boolean m32862V = m32862V(i11, keyEvent);
            if (m32862V != null) {
                return m32862V.booleanValue();
            }
            return super.onKeyDown(i11, keyEvent);
        }
        this.f35823g0 |= keyEvent.isLongPress();
        Float m32884k = m32884k(i11);
        if (m32884k != null) {
            if (m32879g0(((Float) this.f35815V.get(this.f35816W)).floatValue() + m32884k.floatValue())) {
                m32886l0();
                postInvalidate();
            }
            return true;
        }
        if (i11 != 23) {
            if (i11 != 61) {
                if (i11 != 66) {
                    return super.onKeyDown(i11, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return m32859S(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return m32859S(-1);
            }
        }
        this.f35816W = -1;
        m32843A();
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        this.f35823g0 = false;
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13 = this.f35802I;
        int i14 = 0;
        if (this.f35803J == 1) {
            i14 = ((C2646a) this.f35843z.get(0)).getIntrinsicHeight();
        }
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(i13 + i14, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f35813T = sliderState.f35844p;
        this.f35814U = sliderState.f35845q;
        m32875e0(sliderState.f35846r);
        this.f35818b0 = sliderState.f35847s;
        if (sliderState.f35848t) {
            requestFocus();
        }
        m32903v();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f35844p = this.f35813T;
        sliderState.f35845q = this.f35814U;
        sliderState.f35846r = new ArrayList(this.f35815V);
        sliderState.f35847s = this.f35818b0;
        sliderState.f35848t = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        m32888m0(i11);
        m32886l0();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x11 = motionEvent.getX();
        float f11 = (x11 - this.f35805L) / this.f35821e0;
        this.f35831o0 = f11;
        float max = Math.max(0.0f, f11);
        this.f35831o0 = max;
        this.f35831o0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f35812S) {
                        if (m32853L() && Math.abs(x11 - this.f35810Q) < this.f35799F) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        m32863W();
                    }
                    if (mo32910Z()) {
                        this.f35812S = true;
                        m32883j0();
                        m32886l0();
                        invalidate();
                    }
                }
            } else {
                this.f35812S = false;
                MotionEvent motionEvent2 = this.f35811R;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f35811R.getX() - motionEvent.getX()) <= this.f35799F && Math.abs(this.f35811R.getY() - motionEvent.getY()) <= this.f35799F && mo32910Z()) {
                    m32863W();
                }
                if (this.f35816W != -1) {
                    m32883j0();
                    this.f35816W = -1;
                    m32864X();
                }
                m32843A();
                invalidate();
            }
        } else {
            this.f35810Q = x11;
            if (!m32853L()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo32910Z()) {
                    requestFocus();
                    this.f35812S = true;
                    m32883j0();
                    m32886l0();
                    invalidate();
                    m32863W();
                }
            }
        }
        setPressed(this.f35812S);
        this.f35811R = MotionEvent.obtain(motionEvent);
        return true;
    }

    public void setActiveThumbIndex(int i11) {
        this.f35816W = i11;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        int i11;
        super.setEnabled(z11);
        if (z11) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        setLayerType(i11, null);
    }

    public void setFocusedThumbIndex(int i11) {
        if (i11 >= 0 && i11 < this.f35815V.size()) {
            this.f35817a0 = i11;
            this.f35839v.m117453V(i11);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(int i11) {
        if (i11 == this.f35808O) {
            return;
        }
        this.f35808O = i11;
        Drawable background = getBackground();
        if (!m32877f0() && (background instanceof RippleDrawable)) {
            AbstractC25666b.m132552a((RippleDrawable) background, this.f35808O);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i11) {
        setHaloRadius(getResources().getDimensionPixelSize(i11));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35825i0)) {
            return;
        }
        this.f35825i0 = colorStateList;
        Drawable background = getBackground();
        if (!m32877f0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f35836s.setColor(m32849G(colorStateList));
        this.f35836s.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i11) {
        if (this.f35803J != i11) {
            this.f35803J = i11;
            requestLayout();
        }
    }

    public void setLabelFormatter(InterfaceC6400c interfaceC6400c) {
    }

    public void setSeparationUnit(int i11) {
        this.f35833p0 = i11;
    }

    public void setStepSize(float f11) {
        if (f11 >= 0.0f) {
            if (this.f35818b0 != f11) {
                this.f35818b0 = f11;
                this.f35824h0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.toString(f11), Float.toString(this.f35813T), Float.toString(this.f35814U)));
    }

    public void setThumbElevation(float f11) {
        this.f35830n0.m152441b0(f11);
    }

    public void setThumbElevationResource(int i11) {
        setThumbElevation(getResources().getDimension(i11));
    }

    public void setThumbRadius(int i11) {
        if (i11 == this.f35807N) {
            return;
        }
        this.f35807N = i11;
        m32858R();
        this.f35830n0.setShapeAppearanceModel(C31694m.m152471a().m152522q(0, this.f35807N).m152519m());
        C31689h c31689h = this.f35830n0;
        int i12 = this.f35807N;
        c31689h.setBounds(0, 0, i12 * 2, i12 * 2);
        postInvalidate();
    }

    public void setThumbRadiusResource(int i11) {
        setThumbRadius(getResources().getDimensionPixelSize(i11));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f35830n0.m152454m0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i11) {
        if (i11 != 0) {
            setThumbStrokeColor(AbstractC19694b.m103335c(getContext(), i11));
        }
    }

    public void setThumbStrokeWidth(float f11) {
        this.f35830n0.m152455n0(f11);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i11) {
        if (i11 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i11));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35830n0.m152461z())) {
            return;
        }
        this.f35830n0.m152442c0(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35826j0)) {
            return;
        }
        this.f35826j0 = colorStateList;
        this.f35838u.setColor(m32849G(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35827k0)) {
            return;
        }
        this.f35827k0 = colorStateList;
        this.f35837t.setColor(m32849G(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z11) {
        if (this.f35820d0 != z11) {
            this.f35820d0 = z11;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35828l0)) {
            return;
        }
        this.f35828l0 = colorStateList;
        this.f35834q.setColor(m32849G(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i11) {
        if (this.f35804K != i11) {
            this.f35804K = i11;
            m32852K();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35829m0)) {
            return;
        }
        this.f35829m0 = colorStateList;
        this.f35832p.setColor(m32849G(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f11) {
        this.f35813T = f11;
        this.f35824h0 = true;
        postInvalidate();
    }

    public void setValueTo(float f11) {
        this.f35814U = f11;
        this.f35824h0 = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        m32875e0(arrayList);
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, f35793q0), attributeSet, i11);
        this.f35843z = new ArrayList();
        this.f35794A = new ArrayList();
        this.f35795B = new ArrayList();
        this.f35796C = false;
        this.f35812S = false;
        this.f35815V = new ArrayList();
        this.f35816W = -1;
        this.f35817a0 = -1;
        this.f35818b0 = 0.0f;
        this.f35820d0 = true;
        this.f35823g0 = false;
        C31689h c31689h = new C31689h();
        this.f35830n0 = c31689h;
        this.f35833p0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f35832p = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f35834q = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f35835r = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f35836s = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f35837t = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f35838u = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        m32854N(context2.getResources());
        this.f35842y = new C6390a(attributeSet, i11);
        m32869b0(context2, attributeSet, i11);
        setFocusable(true);
        setClickable(true);
        c31689h.m152450j0(2);
        this.f35799F = ViewConfiguration.get(context2).getScaledTouchSlop();
        C6394e c6394e = new C6394e(this);
        this.f35839v = c6394e;
        AbstractC1579n0.m7801A0(this, c6394e);
        this.f35840w = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(List<Float> list) {
        m32875e0(new ArrayList(list));
    }
}
