package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.circularreveal.AbstractC6285a;
import com.google.android.material.circularreveal.C6286b;
import com.google.android.material.circularreveal.InterfaceC6287c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p357n6.AbstractC23581f;
import p382o6.AbstractC24041a;
import p382o6.AbstractC24042b;
import p382o6.C24043c;
import p382o6.C24044d;
import p382o6.C24045e;
import p382o6.C24048h;
import p382o6.C24049i;
import p382o6.C24050j;
import p539u6.AbstractC27041a;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f36233c;

    /* renamed from: d */
    private final RectF f36234d;

    /* renamed from: e */
    private final RectF f36235e;

    /* renamed from: f */
    private final int[] f36236f;

    /* renamed from: g */
    private float f36237g;

    /* renamed from: h */
    private float f36238h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes3.dex */
    class C6464a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f36239p;

        /* renamed from: q */
        final /* synthetic */ View f36240q;

        /* renamed from: r */
        final /* synthetic */ View f36241r;

        C6464a(boolean z11, View view, View view2) {
            this.f36239p = z11;
            this.f36240q = view;
            this.f36241r = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f36239p) {
                this.f36240q.setVisibility(4);
                this.f36241r.setAlpha(1.0f);
                this.f36241r.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f36239p) {
                this.f36240q.setVisibility(0);
                this.f36241r.setAlpha(0.0f);
                this.f36241r.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes3.dex */
    public class C6465b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: p */
        final /* synthetic */ View f36243p;

        C6465b(View view) {
            this.f36243p = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f36243p.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes3.dex */
    public class C6466c extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ InterfaceC6287c f36245p;

        /* renamed from: q */
        final /* synthetic */ Drawable f36246q;

        C6466c(InterfaceC6287c interfaceC6287c, Drawable drawable) {
            this.f36245p = interfaceC6287c;
            this.f36246q = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36245p.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f36245p.setCircularRevealOverlayDrawable(this.f36246q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes3.dex */
    public class C6467d extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ InterfaceC6287c f36248p;

        C6467d(InterfaceC6287c interfaceC6287c) {
            this.f36248p = interfaceC6287c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC6287c.e revealInfo = this.f36248p.getRevealInfo();
            revealInfo.f35237c = Float.MAX_VALUE;
            this.f36248p.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes3.dex */
    public static class C6468e {

        /* renamed from: a */
        public C24048h f36250a;

        /* renamed from: b */
        public C24050j f36251b;
    }

    public FabTransformationBehavior() {
        this.f36233c = new Rect();
        this.f36234d = new RectF();
        this.f36235e = new RectF();
        this.f36236f = new int[2];
    }

    /* renamed from: K */
    private ViewGroup m33299K(View view) {
        View findViewById = view.findViewById(AbstractC23581f.mtrl_child_content_container);
        if (findViewById != null) {
            return m33319f0(findViewById);
        }
        if (!(view instanceof TransformationChildLayout) && !(view instanceof TransformationChildCard)) {
            return m33319f0(view);
        }
        return m33319f0(((ViewGroup) view).getChildAt(0));
    }

    /* renamed from: L */
    private void m33300L(View view, C6468e c6468e, C24049i c24049i, C24049i c24049i2, float f11, float f12, float f13, float f14, RectF rectF) {
        float m33307S = m33307S(c6468e, c24049i, f11, f13);
        float m33307S2 = m33307S(c6468e, c24049i2, f12, f14);
        Rect rect = this.f36233c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f36234d;
        rectF2.set(rect);
        RectF rectF3 = this.f36235e;
        m33308T(view, rectF3);
        rectF3.offset(m33307S, m33307S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m33301M(View view, RectF rectF) {
        m33308T(view, rectF);
        rectF.offset(this.f36237g, this.f36238h);
    }

    /* renamed from: N */
    private Pair m33302N(float f11, float f12, boolean z11, C6468e c6468e) {
        C24049i m125929h;
        C24049i m125929h2;
        if (f11 != 0.0f && f12 != 0.0f) {
            if ((z11 && f12 < 0.0f) || (!z11 && f12 > 0.0f)) {
                m125929h = c6468e.f36250a.m125929h("translationXCurveUpwards");
                m125929h2 = c6468e.f36250a.m125929h("translationYCurveUpwards");
            } else {
                m125929h = c6468e.f36250a.m125929h("translationXCurveDownwards");
                m125929h2 = c6468e.f36250a.m125929h("translationYCurveDownwards");
            }
        } else {
            m125929h = c6468e.f36250a.m125929h("translationXLinear");
            m125929h2 = c6468e.f36250a.m125929h("translationYLinear");
        }
        return new Pair(m125929h, m125929h2);
    }

    /* renamed from: O */
    private float m33303O(View view, View view2, C24050j c24050j) {
        RectF rectF = this.f36234d;
        RectF rectF2 = this.f36235e;
        m33301M(view, rectF);
        m33308T(view2, rectF2);
        rectF2.offset(-m33305Q(view, view2, c24050j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m33304P(View view, View view2, C24050j c24050j) {
        RectF rectF = this.f36234d;
        RectF rectF2 = this.f36235e;
        m33301M(view, rectF);
        m33308T(view2, rectF2);
        rectF2.offset(0.0f, -m33306R(view, view2, c24050j));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m33305Q(View view, View view2, C24050j c24050j) {
        float centerX;
        float centerX2;
        float f11;
        RectF rectF = this.f36234d;
        RectF rectF2 = this.f36235e;
        m33301M(view, rectF);
        m33308T(view2, rectF2);
        int i11 = c24050j.f116378a & 7;
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 != 5) {
                    f11 = 0.0f;
                    return f11 + c24050j.f116379b;
                }
                centerX = rectF2.right;
                centerX2 = rectF.right;
            } else {
                centerX = rectF2.left;
                centerX2 = rectF.left;
            }
        } else {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        }
        f11 = centerX - centerX2;
        return f11 + c24050j.f116379b;
    }

    /* renamed from: R */
    private float m33306R(View view, View view2, C24050j c24050j) {
        float centerY;
        float centerY2;
        float f11;
        RectF rectF = this.f36234d;
        RectF rectF2 = this.f36235e;
        m33301M(view, rectF);
        m33308T(view2, rectF2);
        int i11 = c24050j.f116378a & 112;
        if (i11 != 16) {
            if (i11 != 48) {
                if (i11 != 80) {
                    f11 = 0.0f;
                    return f11 + c24050j.f116380c;
                }
                centerY = rectF2.bottom;
                centerY2 = rectF.bottom;
            } else {
                centerY = rectF2.top;
                centerY2 = rectF.top;
            }
        } else {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        }
        f11 = centerY - centerY2;
        return f11 + c24050j.f116380c;
    }

    /* renamed from: S */
    private float m33307S(C6468e c6468e, C24049i c24049i, float f11, float f12) {
        long m125938c = c24049i.m125938c();
        long m125939d = c24049i.m125939d();
        C24049i m125929h = c6468e.f36250a.m125929h("expansion");
        return AbstractC24041a.m125910a(f11, f12, c24049i.m125940e().getInterpolation(((float) (((m125929h.m125938c() + m125929h.m125939d()) + 17) - m125938c)) / ((float) m125939d)));
    }

    /* renamed from: T */
    private void m33308T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f36236f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: U */
    private void m33309U(View view, View view2, boolean z11, boolean z12, C6468e c6468e, List list, List list2) {
        ViewGroup m33299K;
        ObjectAnimator ofFloat;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof InterfaceC6287c) && C6286b.f35221j == 0) || (m33299K = m33299K(view2)) == null) {
            return;
        }
        if (z11) {
            if (!z12) {
                C24044d.f116364a.set(m33299K, Float.valueOf(0.0f));
            }
            ofFloat = ObjectAnimator.ofFloat(m33299K, (Property<ViewGroup, Float>) C24044d.f116364a, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(m33299K, (Property<ViewGroup, Float>) C24044d.f116364a, 0.0f);
        }
        c6468e.f36250a.m125929h("contentFade").m125937a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    private void m33310V(View view, View view2, boolean z11, boolean z12, C6468e c6468e, List list, List list2) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof InterfaceC6287c)) {
            return;
        }
        InterfaceC6287c interfaceC6287c = (InterfaceC6287c) view2;
        int m33318d0 = m33318d0(view);
        int i11 = 16777215 & m33318d0;
        if (z11) {
            if (!z12) {
                interfaceC6287c.setCircularRevealScrimColor(m33318d0);
            }
            ofInt = ObjectAnimator.ofInt(interfaceC6287c, (Property<InterfaceC6287c, Integer>) InterfaceC6287c.d.f35234a, i11);
        } else {
            ofInt = ObjectAnimator.ofInt(interfaceC6287c, (Property<InterfaceC6287c, Integer>) InterfaceC6287c.d.f35234a, m33318d0);
        }
        ofInt.setEvaluator(C24043c.m125914b());
        c6468e.f36250a.m125929h("color").m125937a(ofInt);
        list.add(ofInt);
    }

    /* renamed from: W */
    private void m33311W(View view, View view2, boolean z11, C6468e c6468e, List list) {
        float m33305Q = m33305Q(view, view2, c6468e.f36251b);
        float m33306R = m33306R(view, view2, c6468e.f36251b);
        Pair m33302N = m33302N(m33305Q, m33306R, z11, c6468e);
        C24049i c24049i = (C24049i) m33302N.first;
        C24049i c24049i2 = (C24049i) m33302N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z11) {
            m33305Q = this.f36237g;
        }
        fArr[0] = m33305Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z11) {
            m33306R = this.f36238h;
        }
        fArr2[0] = m33306R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        c24049i.m125937a(ofFloat);
        c24049i2.m125937a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: X */
    private void m33312X(View view, View view2, boolean z11, boolean z12, C6468e c6468e, List list, List list2) {
        ObjectAnimator ofFloat;
        float m7800A = AbstractC1579n0.m7800A(view2) - AbstractC1579n0.m7800A(view);
        if (z11) {
            if (!z12) {
                view2.setTranslationZ(-m7800A);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -m7800A);
        }
        c6468e.f36250a.m125929h("elevation").m125937a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Y */
    private void m33313Y(View view, View view2, boolean z11, boolean z12, C6468e c6468e, float f11, float f12, List list, List list2) {
        Animator animator;
        if (!(view2 instanceof InterfaceC6287c)) {
            return;
        }
        InterfaceC6287c interfaceC6287c = (InterfaceC6287c) view2;
        float m33303O = m33303O(view, view2, c6468e.f36251b);
        float m33304P = m33304P(view, view2, c6468e.f36251b);
        ((FloatingActionButton) view).m32337i(this.f36233c);
        float width = this.f36233c.width() / 2.0f;
        C24049i m125929h = c6468e.f36250a.m125929h("expansion");
        if (z11) {
            if (!z12) {
                interfaceC6287c.setRevealInfo(new InterfaceC6287c.e(m33303O, m33304P, width));
            }
            if (z12) {
                width = interfaceC6287c.getRevealInfo().f35237c;
            }
            animator = AbstractC6285a.m32224a(interfaceC6287c, m33303O, m33304P, AbstractC27041a.m139197b(m33303O, m33304P, 0.0f, 0.0f, f11, f12));
            animator.addListener(new C6467d(interfaceC6287c));
            m33316b0(view2, m125929h.m125938c(), (int) m33303O, (int) m33304P, width, list);
        } else {
            float f13 = interfaceC6287c.getRevealInfo().f35237c;
            Animator m32224a = AbstractC6285a.m32224a(interfaceC6287c, m33303O, m33304P, width);
            int i11 = (int) m33303O;
            int i12 = (int) m33304P;
            m33316b0(view2, m125929h.m125938c(), i11, i12, f13, list);
            m33315a0(view2, m125929h.m125938c(), m125929h.m125939d(), c6468e.f36250a.m125930i(), i11, i12, width, list);
            animator = m32224a;
        }
        m125929h.m125937a(animator);
        list.add(animator);
        list2.add(AbstractC6285a.m32225b(interfaceC6287c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Z */
    private void m33314Z(View view, View view2, boolean z11, boolean z12, C6468e c6468e, List list, List list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof InterfaceC6287c) && (view instanceof ImageView)) {
            InterfaceC6287c interfaceC6287c = (InterfaceC6287c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z11) {
                if (!z12) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, (Property<Drawable, Integer>) C24045e.f116365b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, (Property<Drawable, Integer>) C24045e.f116365b, 255);
            }
            ofInt.addUpdateListener(new C6465b(view2));
            c6468e.f36250a.m125929h("iconFade").m125937a(ofInt);
            list.add(ofInt);
            list2.add(new C6466c(interfaceC6287c, drawable));
        }
    }

    /* renamed from: a0 */
    private void m33315a0(View view, long j11, long j12, long j13, int i11, int i12, float f11, List list) {
        long j14 = j11 + j12;
        if (j14 < j13) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i11, i12, f11, f11);
            createCircularReveal.setStartDelay(j14);
            createCircularReveal.setDuration(j13 - j14);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: b0 */
    private void m33316b0(View view, long j11, int i11, int i12, float f11, List list) {
        if (j11 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i11, i12, f11, f11);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j11);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m33317c0(View view, View view2, boolean z11, boolean z12, C6468e c6468e, List list, List list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m33305Q = m33305Q(view, view2, c6468e.f36251b);
        float m33306R = m33306R(view, view2, c6468e.f36251b);
        Pair m33302N = m33302N(m33305Q, m33306R, z11, c6468e);
        C24049i c24049i = (C24049i) m33302N.first;
        C24049i c24049i2 = (C24049i) m33302N.second;
        if (z11) {
            if (!z12) {
                view2.setTranslationX(-m33305Q);
                view2.setTranslationY(-m33306R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            m33300L(view2, c6468e, c24049i, c24049i2, -m33305Q, -m33306R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -m33305Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -m33306R);
        }
        c24049i.m125937a(ofFloat);
        c24049i2.m125937a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: d0 */
    private int m33318d0(View view) {
        ColorStateList m7907w = AbstractC1579n0.m7907w(view);
        if (m7907w != null) {
            return m7907w.getColorForState(view.getDrawableState(), m7907w.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m33319f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo33298J(View view, View view2, boolean z11, boolean z12) {
        C6468e mo33320e0 = mo33320e0(view2.getContext(), z11);
        if (z11) {
            this.f36237g = view.getTranslationX();
            this.f36238h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m33312X(view, view2, z11, z12, mo33320e0, arrayList, arrayList2);
        RectF rectF = this.f36234d;
        m33317c0(view, view2, z11, z12, mo33320e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m33311W(view, view2, z11, mo33320e0, arrayList);
        m33314Z(view, view2, z11, z12, mo33320e0, arrayList, arrayList2);
        m33313Y(view, view2, z11, z12, mo33320e0, width, height, arrayList, arrayList2);
        m33310V(view, view2, z11, z12, mo33320e0, arrayList, arrayList2);
        m33309U(view, view2, z11, z12, mo33320e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC24042b.m125913a(animatorSet, arrayList);
        animatorSet.addListener(new C6464a(z11, view2, view));
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i11));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: e */
    public boolean mo6547e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: e0 */
    protected abstract C6468e mo33320e0(Context context, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: g */
    public void mo6549g(CoordinatorLayout.C1306e c1306e) {
        if (c1306e.f5820h == 0) {
            c1306e.f5820h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36233c = new Rect();
        this.f36234d = new RectF();
        this.f36235e = new RectF();
        this.f36236f = new int[2];
    }
}
