package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.AbstractC1404k;
import androidx.core.view.AbstractC1579n0;
import org.xmlpull.v1.XmlPullParser;
import p286k2.AbstractC21441e;

/* loaded from: classes2.dex */
public class ChangeTransform extends Transition {

    /* renamed from: c0 */
    private static final String[] f8420c0 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: d0 */
    private static final Property f8421d0 = new C1973a(float[].class, "nonTranslations");

    /* renamed from: e0 */
    private static final Property f8422e0 = new C1974b(PointF.class, "translations");

    /* renamed from: f0 */
    private static final boolean f8423f0 = true;

    /* renamed from: Z */
    boolean f8424Z;

    /* renamed from: a0 */
    private boolean f8425a0;

    /* renamed from: b0 */
    private Matrix f8426b0;

    /* renamed from: androidx.transition.ChangeTransform$a */
    /* loaded from: classes2.dex */
    static class C1973a extends Property {
        C1973a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] get(C1977e c1977e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C1977e c1977e, float[] fArr) {
            c1977e.m10867d(fArr);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    /* loaded from: classes2.dex */
    static class C1974b extends Property {
        C1974b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C1977e c1977e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C1977e c1977e, PointF pointF) {
            c1977e.m10866c(pointF);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.ChangeTransform$c */
    /* loaded from: classes2.dex */
    public class C1975c extends AnimatorListenerAdapter {

        /* renamed from: p */
        private boolean f8427p;

        /* renamed from: q */
        private Matrix f8428q = new Matrix();

        /* renamed from: r */
        final /* synthetic */ boolean f8429r;

        /* renamed from: s */
        final /* synthetic */ Matrix f8430s;

        /* renamed from: t */
        final /* synthetic */ View f8431t;

        /* renamed from: u */
        final /* synthetic */ C1978f f8432u;

        /* renamed from: v */
        final /* synthetic */ C1977e f8433v;

        C1975c(boolean z11, Matrix matrix, View view, C1978f c1978f, C1977e c1977e) {
            this.f8429r = z11;
            this.f8430s = matrix;
            this.f8431t = view;
            this.f8432u = c1978f;
            this.f8433v = c1977e;
        }

        /* renamed from: a */
        private void m10863a(Matrix matrix) {
            this.f8428q.set(matrix);
            this.f8431t.setTag(AbstractC21441e.transition_transform, this.f8428q);
            this.f8432u.m10868a(this.f8431t);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8427p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f8427p) {
                if (this.f8429r && ChangeTransform.this.f8424Z) {
                    m10863a(this.f8430s);
                } else {
                    this.f8431t.setTag(AbstractC21441e.transition_transform, null);
                    this.f8431t.setTag(AbstractC21441e.parent_matrix, null);
                }
            }
            AbstractC2004b0.m10972f(this.f8431t, null);
            this.f8432u.m10868a(this.f8431t);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m10863a(this.f8433v.m10865a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.m10856v0(this.f8431t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.ChangeTransform$d */
    /* loaded from: classes2.dex */
    public static class C1976d extends AbstractC2027q {

        /* renamed from: p */
        private View f8435p;

        /* renamed from: q */
        private InterfaceC2009e f8436q;

        C1976d(View view, InterfaceC2009e interfaceC2009e) {
            this.f8435p = view;
            this.f8436q = interfaceC2009e;
        }

        @Override // androidx.transition.AbstractC2027q, androidx.transition.Transition.InterfaceC1995f
        /* renamed from: a */
        public void mo10834a(Transition transition) {
            this.f8436q.setVisibility(0);
        }

        @Override // androidx.transition.AbstractC2027q, androidx.transition.Transition.InterfaceC1995f
        /* renamed from: c */
        public void mo10835c(Transition transition) {
            this.f8436q.setVisibility(4);
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: d */
        public void mo10836d(Transition transition) {
            transition.mo10910b0(this);
            AbstractC2017i.m11015b(this.f8435p);
            this.f8435p.setTag(AbstractC21441e.transition_transform, null);
            this.f8435p.setTag(AbstractC21441e.parent_matrix, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.ChangeTransform$e */
    /* loaded from: classes2.dex */
    public static class C1977e {

        /* renamed from: a */
        private final Matrix f8437a = new Matrix();

        /* renamed from: b */
        private final View f8438b;

        /* renamed from: c */
        private final float[] f8439c;

        /* renamed from: d */
        private float f8440d;

        /* renamed from: e */
        private float f8441e;

        C1977e(View view, float[] fArr) {
            this.f8438b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f8439c = fArr2;
            this.f8440d = fArr2[2];
            this.f8441e = fArr2[5];
            m10864b();
        }

        /* renamed from: b */
        private void m10864b() {
            float[] fArr = this.f8439c;
            fArr[2] = this.f8440d;
            fArr[5] = this.f8441e;
            this.f8437a.setValues(fArr);
            AbstractC2004b0.m10972f(this.f8438b, this.f8437a);
        }

        /* renamed from: a */
        Matrix m10865a() {
            return this.f8437a;
        }

        /* renamed from: c */
        void m10866c(PointF pointF) {
            this.f8440d = pointF.x;
            this.f8441e = pointF.y;
            m10864b();
        }

        /* renamed from: d */
        void m10867d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f8439c, 0, fArr.length);
            m10864b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.ChangeTransform$f */
    /* loaded from: classes2.dex */
    public static class C1978f {

        /* renamed from: a */
        final float f8442a;

        /* renamed from: b */
        final float f8443b;

        /* renamed from: c */
        final float f8444c;

        /* renamed from: d */
        final float f8445d;

        /* renamed from: e */
        final float f8446e;

        /* renamed from: f */
        final float f8447f;

        /* renamed from: g */
        final float f8448g;

        /* renamed from: h */
        final float f8449h;

        C1978f(View view) {
            this.f8442a = view.getTranslationX();
            this.f8443b = view.getTranslationY();
            this.f8444c = AbstractC1579n0.m7838T(view);
            this.f8445d = view.getScaleX();
            this.f8446e = view.getScaleY();
            this.f8447f = view.getRotationX();
            this.f8448g = view.getRotationY();
            this.f8449h = view.getRotation();
        }

        /* renamed from: a */
        public void m10868a(View view) {
            ChangeTransform.m10858x0(view, this.f8442a, this.f8443b, this.f8444c, this.f8445d, this.f8446e, this.f8447f, this.f8448g, this.f8449h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1978f)) {
                return false;
            }
            C1978f c1978f = (C1978f) obj;
            if (c1978f.f8442a != this.f8442a || c1978f.f8443b != this.f8443b || c1978f.f8444c != this.f8444c || c1978f.f8445d != this.f8445d || c1978f.f8446e != this.f8446e || c1978f.f8447f != this.f8447f || c1978f.f8448g != this.f8448g || c1978f.f8449h != this.f8449h) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            float f11 = this.f8442a;
            int i18 = 0;
            if (f11 != 0.0f) {
                i11 = Float.floatToIntBits(f11);
            } else {
                i11 = 0;
            }
            int i19 = i11 * 31;
            float f12 = this.f8443b;
            if (f12 != 0.0f) {
                i12 = Float.floatToIntBits(f12);
            } else {
                i12 = 0;
            }
            int i21 = (i19 + i12) * 31;
            float f13 = this.f8444c;
            if (f13 != 0.0f) {
                i13 = Float.floatToIntBits(f13);
            } else {
                i13 = 0;
            }
            int i22 = (i21 + i13) * 31;
            float f14 = this.f8445d;
            if (f14 != 0.0f) {
                i14 = Float.floatToIntBits(f14);
            } else {
                i14 = 0;
            }
            int i23 = (i22 + i14) * 31;
            float f15 = this.f8446e;
            if (f15 != 0.0f) {
                i15 = Float.floatToIntBits(f15);
            } else {
                i15 = 0;
            }
            int i24 = (i23 + i15) * 31;
            float f16 = this.f8447f;
            if (f16 != 0.0f) {
                i16 = Float.floatToIntBits(f16);
            } else {
                i16 = 0;
            }
            int i25 = (i24 + i16) * 31;
            float f17 = this.f8448g;
            if (f17 != 0.0f) {
                i17 = Float.floatToIntBits(f17);
            } else {
                i17 = 0;
            }
            int i26 = (i25 + i17) * 31;
            float f18 = this.f8449h;
            if (f18 != 0.0f) {
                i18 = Float.floatToIntBits(f18);
            }
            return i26 + i18;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8424Z = true;
        this.f8425a0 = true;
        this.f8426b0 = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2026p.f8597g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f8424Z = AbstractC1404k.m7105a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f8425a0 = AbstractC1404k.m7105a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: r0 */
    private void m10852r0(C2030t c2030t) {
        Matrix matrix;
        View view = c2030t.f8616b;
        if (view.getVisibility() == 8) {
            return;
        }
        c2030t.f8615a.put("android:changeTransform:parent", view.getParent());
        c2030t.f8615a.put("android:changeTransform:transforms", new C1978f(view));
        Matrix matrix2 = view.getMatrix();
        if (matrix2 != null && !matrix2.isIdentity()) {
            matrix = new Matrix(matrix2);
        } else {
            matrix = null;
        }
        c2030t.f8615a.put("android:changeTransform:matrix", matrix);
        if (this.f8425a0) {
            Matrix matrix3 = new Matrix();
            AbstractC2004b0.m10976j((ViewGroup) view.getParent(), matrix3);
            matrix3.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            c2030t.f8615a.put("android:changeTransform:parentMatrix", matrix3);
            c2030t.f8615a.put("android:changeTransform:intermediateMatrix", view.getTag(AbstractC21441e.transition_transform));
            c2030t.f8615a.put("android:changeTransform:intermediateParentMatrix", view.getTag(AbstractC21441e.parent_matrix));
        }
    }

    /* renamed from: s0 */
    private void m10853s0(ViewGroup viewGroup, C2030t c2030t, C2030t c2030t2) {
        View view = c2030t2.f8616b;
        Matrix matrix = new Matrix((Matrix) c2030t2.f8615a.get("android:changeTransform:parentMatrix"));
        AbstractC2004b0.m10977k(viewGroup, matrix);
        InterfaceC2009e m11014a = AbstractC2017i.m11014a(view, viewGroup, matrix);
        if (m11014a == null) {
            return;
        }
        m11014a.mo10991a((ViewGroup) c2030t.f8615a.get("android:changeTransform:parent"), c2030t.f8616b);
        Transition transition = this;
        while (true) {
            Transition transition2 = transition.f8479G;
            if (transition2 == null) {
                break;
            } else {
                transition = transition2;
            }
        }
        transition.mo10907a(new C1976d(view, m11014a));
        if (f8423f0) {
            View view2 = c2030t.f8616b;
            if (view2 != c2030t2.f8616b) {
                AbstractC2004b0.m10974h(view2, 0.0f);
            }
            AbstractC2004b0.m10974h(view, 1.0f);
        }
    }

    /* renamed from: t0 */
    private ObjectAnimator m10854t0(C2030t c2030t, C2030t c2030t2, boolean z11) {
        Matrix matrix = (Matrix) c2030t.f8615a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) c2030t2.f8615a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = AbstractC2021k.f8589a;
        }
        if (matrix2 == null) {
            matrix2 = AbstractC2021k.f8589a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        C1978f c1978f = (C1978f) c2030t2.f8615a.get("android:changeTransform:transforms");
        View view = c2030t2.f8616b;
        m10856v0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C1977e c1977e = new C1977e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c1977e, PropertyValuesHolder.ofObject(f8421d0, new C2005c(new float[9]), fArr, fArr2), AbstractC2023m.m11020a(f8422e0, m10937z().mo10810a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        C1975c c1975c = new C1975c(z11, matrix3, view, c1978f, c1977e);
        ofPropertyValuesHolder.addListener(c1975c);
        AbstractC2001a.m10961a(ofPropertyValuesHolder, c1975c);
        return ofPropertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:            if (r4 == r5) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:            if (r5 == r4.f8616b) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:            r1 = false;     */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m10855u0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        boolean z11 = true;
        if (m10905P(viewGroup) && m10905P(viewGroup2)) {
            C2030t m10935x = m10935x(viewGroup, true);
            if (m10935x == null) {
                return false;
            }
        }
    }

    /* renamed from: v0 */
    static void m10856v0(View view) {
        m10858x0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: w0 */
    private void m10857w0(C2030t c2030t, C2030t c2030t2) {
        Matrix matrix = (Matrix) c2030t2.f8615a.get("android:changeTransform:parentMatrix");
        c2030t2.f8616b.setTag(AbstractC21441e.parent_matrix, matrix);
        Matrix matrix2 = this.f8426b0;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) c2030t.f8615a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            c2030t.f8615a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) c2030t.f8615a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: x0 */
    static void m10858x0(View view, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        view.setTranslationX(f11);
        view.setTranslationY(f12);
        AbstractC1579n0.m7860c1(view, f13);
        view.setScaleX(f14);
        view.setScaleY(f15);
        view.setRotationX(f16);
        view.setRotationY(f17);
        view.setRotation(f18);
    }

    @Override // androidx.transition.Transition
    /* renamed from: I */
    public String[] mo10817I() {
        return f8420c0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: i */
    public void mo10818i(C2030t c2030t) {
        m10852r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        m10852r0(c2030t);
        if (!f8423f0) {
            ((ViewGroup) c2030t.f8616b.getParent()).startViewTransition(c2030t.f8616b);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: p */
    public Animator mo10820p(ViewGroup viewGroup, C2030t c2030t, C2030t c2030t2) {
        boolean z11;
        if (c2030t != null && c2030t2 != null && c2030t.f8615a.containsKey("android:changeTransform:parent") && c2030t2.f8615a.containsKey("android:changeTransform:parent")) {
            ViewGroup viewGroup2 = (ViewGroup) c2030t.f8615a.get("android:changeTransform:parent");
            ViewGroup viewGroup3 = (ViewGroup) c2030t2.f8615a.get("android:changeTransform:parent");
            if (this.f8425a0 && !m10855u0(viewGroup2, viewGroup3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            Matrix matrix = (Matrix) c2030t.f8615a.get("android:changeTransform:intermediateMatrix");
            if (matrix != null) {
                c2030t.f8615a.put("android:changeTransform:matrix", matrix);
            }
            Matrix matrix2 = (Matrix) c2030t.f8615a.get("android:changeTransform:intermediateParentMatrix");
            if (matrix2 != null) {
                c2030t.f8615a.put("android:changeTransform:parentMatrix", matrix2);
            }
            if (z11) {
                m10857w0(c2030t, c2030t2);
            }
            ObjectAnimator m10854t0 = m10854t0(c2030t, c2030t2, z11);
            if (z11 && m10854t0 != null && this.f8424Z) {
                m10853s0(viewGroup, c2030t, c2030t2);
            } else if (!f8423f0) {
                viewGroup2.endViewTransition(c2030t.f8616b);
            }
            return m10854t0;
        }
        return null;
    }
}
