package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.content.res.AbstractC1404k;
import androidx.core.view.AbstractC1579n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import p286k2.AbstractC21443g;
import p665y0.C30239a;
import p665y0.C30242d;

/* loaded from: classes2.dex */
public abstract class Transition implements Cloneable {

    /* renamed from: W */
    private static final int[] f8470W = {2, 1, 3, 4};

    /* renamed from: X */
    private static final PathMotion f8471X = new C1990a();

    /* renamed from: Y */
    private static ThreadLocal f8472Y = new ThreadLocal();

    /* renamed from: I */
    private ArrayList f8481I;

    /* renamed from: J */
    private ArrayList f8482J;

    /* renamed from: S */
    AbstractC21443g f8491S;

    /* renamed from: T */
    private AbstractC1994e f8492T;

    /* renamed from: U */
    private C30239a f8493U;

    /* renamed from: p */
    private String f8495p = getClass().getName();

    /* renamed from: q */
    private long f8496q = -1;

    /* renamed from: r */
    long f8497r = -1;

    /* renamed from: s */
    private TimeInterpolator f8498s = null;

    /* renamed from: t */
    ArrayList f8499t = new ArrayList();

    /* renamed from: u */
    ArrayList f8500u = new ArrayList();

    /* renamed from: v */
    private ArrayList f8501v = null;

    /* renamed from: w */
    private ArrayList f8502w = null;

    /* renamed from: x */
    private ArrayList f8503x = null;

    /* renamed from: y */
    private ArrayList f8504y = null;

    /* renamed from: z */
    private ArrayList f8505z = null;

    /* renamed from: A */
    private ArrayList f8473A = null;

    /* renamed from: B */
    private ArrayList f8474B = null;

    /* renamed from: C */
    private ArrayList f8475C = null;

    /* renamed from: D */
    private ArrayList f8476D = null;

    /* renamed from: E */
    private C2031u f8477E = new C2031u();

    /* renamed from: F */
    private C2031u f8478F = new C2031u();

    /* renamed from: G */
    TransitionSet f8479G = null;

    /* renamed from: H */
    private int[] f8480H = f8470W;

    /* renamed from: K */
    private ViewGroup f8483K = null;

    /* renamed from: L */
    boolean f8484L = false;

    /* renamed from: M */
    ArrayList f8485M = new ArrayList();

    /* renamed from: N */
    private int f8486N = 0;

    /* renamed from: O */
    private boolean f8487O = false;

    /* renamed from: P */
    private boolean f8488P = false;

    /* renamed from: Q */
    private ArrayList f8489Q = null;

    /* renamed from: R */
    private ArrayList f8490R = new ArrayList();

    /* renamed from: V */
    private PathMotion f8494V = f8471X;

    /* renamed from: androidx.transition.Transition$a */
    /* loaded from: classes2.dex */
    static class C1990a extends PathMotion {
        C1990a() {
        }

        @Override // androidx.transition.PathMotion
        /* renamed from: a */
        public Path mo10810a(float f11, float f12, float f13, float f14) {
            Path path = new Path();
            path.moveTo(f11, f12);
            path.lineTo(f13, f14);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    /* loaded from: classes2.dex */
    public class C1991b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ C30239a f8506p;

        C1991b(C30239a c30239a) {
            this.f8506p = c30239a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8506p.remove(animator);
            Transition.this.f8485M.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.f8485M.add(animator);
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    /* loaded from: classes2.dex */
    public class C1992c extends AnimatorListenerAdapter {
        C1992c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.m10930r();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    /* loaded from: classes2.dex */
    public static class C1993d {

        /* renamed from: a */
        View f8509a;

        /* renamed from: b */
        String f8510b;

        /* renamed from: c */
        C2030t f8511c;

        /* renamed from: d */
        InterfaceC2020j0 f8512d;

        /* renamed from: e */
        Transition f8513e;

        C1993d(View view, String str, Transition transition, InterfaceC2020j0 interfaceC2020j0, C2030t c2030t) {
            this.f8509a = view;
            this.f8510b = str;
            this.f8511c = c2030t;
            this.f8512d = interfaceC2020j0;
            this.f8513e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1994e {
        /* renamed from: a */
        public abstract Rect mo10938a(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC1995f {
        /* renamed from: a */
        void mo10834a(Transition transition);

        /* renamed from: b */
        void mo10939b(Transition transition);

        /* renamed from: c */
        void mo10835c(Transition transition);

        /* renamed from: d */
        void mo10836d(Transition transition);

        /* renamed from: e */
        void mo10837e(Transition transition);
    }

    public Transition() {
    }

    /* renamed from: B */
    private static C30239a m10883B() {
        C30239a c30239a = (C30239a) f8472Y.get();
        if (c30239a == null) {
            C30239a c30239a2 = new C30239a();
            f8472Y.set(c30239a2);
            return c30239a2;
        }
        return c30239a;
    }

    /* renamed from: O */
    private static boolean m10884O(int i11) {
        return i11 >= 1 && i11 <= 4;
    }

    /* renamed from: R */
    private static boolean m10885R(C2030t c2030t, C2030t c2030t2, String str) {
        Object obj = c2030t.f8615a.get(str);
        Object obj2 = c2030t2.f8615a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: S */
    private void m10886S(C30239a c30239a, C30239a c30239a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = (View) sparseArray.valueAt(i11);
            if (view2 != null && m10905P(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && m10905P(view)) {
                C2030t c2030t = (C2030t) c30239a.get(view2);
                C2030t c2030t2 = (C2030t) c30239a2.get(view);
                if (c2030t != null && c2030t2 != null) {
                    this.f8481I.add(c2030t);
                    this.f8482J.add(c2030t2);
                    c30239a.remove(view2);
                    c30239a2.remove(view);
                }
            }
        }
    }

    /* renamed from: T */
    private void m10887T(C30239a c30239a, C30239a c30239a2) {
        C2030t c2030t;
        for (int size = c30239a.size() - 1; size >= 0; size--) {
            View view = (View) c30239a.m149163i(size);
            if (view != null && m10905P(view) && (c2030t = (C2030t) c30239a2.remove(view)) != null && m10905P(c2030t.f8616b)) {
                this.f8481I.add((C2030t) c30239a.m149165l(size));
                this.f8482J.add(c2030t);
            }
        }
    }

    /* renamed from: U */
    private void m10888U(C30239a c30239a, C30239a c30239a2, C30242d c30242d, C30242d c30242d2) {
        View view;
        int m149135m = c30242d.m149135m();
        for (int i11 = 0; i11 < m149135m; i11++) {
            View view2 = (View) c30242d.m149136n(i11);
            if (view2 != null && m10905P(view2) && (view = (View) c30242d2.m149128f(c30242d.m149131i(i11))) != null && m10905P(view)) {
                C2030t c2030t = (C2030t) c30239a.get(view2);
                C2030t c2030t2 = (C2030t) c30239a2.get(view);
                if (c2030t != null && c2030t2 != null) {
                    this.f8481I.add(c2030t);
                    this.f8482J.add(c2030t2);
                    c30239a.remove(view2);
                    c30239a2.remove(view);
                }
            }
        }
    }

    /* renamed from: V */
    private void m10889V(C30239a c30239a, C30239a c30239a2, C30239a c30239a3, C30239a c30239a4) {
        View view;
        int size = c30239a3.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = (View) c30239a3.m149167o(i11);
            if (view2 != null && m10905P(view2) && (view = (View) c30239a4.get(c30239a3.m149163i(i11))) != null && m10905P(view)) {
                C2030t c2030t = (C2030t) c30239a.get(view2);
                C2030t c2030t2 = (C2030t) c30239a2.get(view);
                if (c2030t != null && c2030t2 != null) {
                    this.f8481I.add(c2030t);
                    this.f8482J.add(c2030t2);
                    c30239a.remove(view2);
                    c30239a2.remove(view);
                }
            }
        }
    }

    /* renamed from: W */
    private void m10890W(C2031u c2031u, C2031u c2031u2) {
        C30239a c30239a = new C30239a(c2031u.f8618a);
        C30239a c30239a2 = new C30239a(c2031u2.f8618a);
        int i11 = 0;
        while (true) {
            int[] iArr = this.f8480H;
            if (i11 < iArr.length) {
                int i12 = iArr[i11];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                m10888U(c30239a, c30239a2, c2031u.f8620c, c2031u2.f8620c);
                            }
                        } else {
                            m10886S(c30239a, c30239a2, c2031u.f8619b, c2031u2.f8619b);
                        }
                    } else {
                        m10889V(c30239a, c30239a2, c2031u.f8621d, c2031u2.f8621d);
                    }
                } else {
                    m10887T(c30239a, c30239a2);
                }
                i11++;
            } else {
                m10892c(c30239a, c30239a2);
                return;
            }
        }
    }

    /* renamed from: X */
    private static int[] m10891X(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i11] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i11] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i11] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i11] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                i11--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i11++;
        }
        return iArr;
    }

    /* renamed from: c */
    private void m10892c(C30239a c30239a, C30239a c30239a2) {
        for (int i11 = 0; i11 < c30239a.size(); i11++) {
            C2030t c2030t = (C2030t) c30239a.m149167o(i11);
            if (m10905P(c2030t.f8616b)) {
                this.f8481I.add(c2030t);
                this.f8482J.add(null);
            }
        }
        for (int i12 = 0; i12 < c30239a2.size(); i12++) {
            C2030t c2030t2 = (C2030t) c30239a2.m149167o(i12);
            if (m10905P(c2030t2.f8616b)) {
                this.f8482J.add(c2030t2);
                this.f8481I.add(null);
            }
        }
    }

    /* renamed from: e */
    private static void m10893e(C2031u c2031u, View view, C2030t c2030t) {
        c2031u.f8618a.put(view, c2030t);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (c2031u.f8619b.indexOfKey(id2) >= 0) {
                c2031u.f8619b.put(id2, null);
            } else {
                c2031u.f8619b.put(id2, view);
            }
        }
        String m7832Q = AbstractC1579n0.m7832Q(view);
        if (m7832Q != null) {
            if (c2031u.f8621d.containsKey(m7832Q)) {
                c2031u.f8621d.put(m7832Q, null);
            } else {
                c2031u.f8621d.put(m7832Q, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c2031u.f8620c.m149130h(itemIdAtPosition) >= 0) {
                    View view2 = (View) c2031u.f8620c.m149128f(itemIdAtPosition);
                    if (view2 != null) {
                        AbstractC1579n0.m7821K0(view2, false);
                        c2031u.f8620c.m149132j(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                AbstractC1579n0.m7821K0(view, true);
                c2031u.f8620c.m149132j(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: e0 */
    private void m10894e0(Animator animator, C30239a c30239a) {
        if (animator != null) {
            animator.addListener(new C1991b(c30239a));
            m10914g(animator);
        }
    }

    /* renamed from: f */
    private static boolean m10895f(int[] iArr, int i11) {
        int i12 = iArr[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            if (iArr[i13] == i12) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m10896j(View view, boolean z11) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f8503x;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id2))) {
            return;
        }
        ArrayList arrayList2 = this.f8504y;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList arrayList3 = this.f8505z;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((Class) this.f8505z.get(i11)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            C2030t c2030t = new C2030t(view);
            if (z11) {
                mo10819l(c2030t);
            } else {
                mo10818i(c2030t);
            }
            c2030t.f8617c.add(this);
            mo10919k(c2030t);
            if (z11) {
                m10893e(this.f8477E, view, c2030t);
            } else {
                m10893e(this.f8478F, view, c2030t);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList arrayList4 = this.f8474B;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id2))) {
                return;
            }
            ArrayList arrayList5 = this.f8475C;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
            ArrayList arrayList6 = this.f8476D;
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (((Class) this.f8476D.get(i12)).isInstance(view)) {
                        return;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                m10896j(viewGroup.getChildAt(i13), z11);
            }
        }
    }

    /* renamed from: A */
    public AbstractC21443g m10897A() {
        return this.f8491S;
    }

    /* renamed from: C */
    public long m10898C() {
        return this.f8496q;
    }

    /* renamed from: D */
    public List m10899D() {
        return this.f8499t;
    }

    /* renamed from: E */
    public List m10900E() {
        return this.f8501v;
    }

    /* renamed from: G */
    public List m10901G() {
        return this.f8502w;
    }

    /* renamed from: H */
    public List m10902H() {
        return this.f8500u;
    }

    /* renamed from: I */
    public String[] mo10817I() {
        return null;
    }

    /* renamed from: L */
    public C2030t m10903L(View view, boolean z11) {
        C2031u c2031u;
        TransitionSet transitionSet = this.f8479G;
        if (transitionSet != null) {
            return transitionSet.m10903L(view, z11);
        }
        if (z11) {
            c2031u = this.f8477E;
        } else {
            c2031u = this.f8478F;
        }
        return (C2030t) c2031u.f8618a.get(view);
    }

    /* renamed from: N */
    public boolean mo10904N(C2030t c2030t, C2030t c2030t2) {
        if (c2030t == null || c2030t2 == null) {
            return false;
        }
        String[] mo10817I = mo10817I();
        if (mo10817I != null) {
            for (String str : mo10817I) {
                if (!m10885R(c2030t, c2030t2, str)) {
                }
            }
            return false;
        }
        Iterator it = c2030t.f8615a.keySet().iterator();
        while (it.hasNext()) {
            if (m10885R(c2030t, c2030t2, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: P */
    public boolean m10905P(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f8503x;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f8504y;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f8505z;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((Class) this.f8505z.get(i11)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f8473A != null && AbstractC1579n0.m7832Q(view) != null && this.f8473A.contains(AbstractC1579n0.m7832Q(view))) {
            return false;
        }
        if ((this.f8499t.size() == 0 && this.f8500u.size() == 0 && (((arrayList = this.f8502w) == null || arrayList.isEmpty()) && ((arrayList2 = this.f8501v) == null || arrayList2.isEmpty()))) || this.f8499t.contains(Integer.valueOf(id2)) || this.f8500u.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f8501v;
        if (arrayList6 != null && arrayList6.contains(AbstractC1579n0.m7832Q(view))) {
            return true;
        }
        if (this.f8502w != null) {
            for (int i12 = 0; i12 < this.f8502w.size(); i12++) {
                if (((Class) this.f8502w.get(i12)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Y */
    public void mo10906Y(View view) {
        if (!this.f8488P) {
            C30239a m10883B = m10883B();
            int size = m10883B.size();
            InterfaceC2020j0 m10970d = AbstractC2004b0.m10970d(view);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                C1993d c1993d = (C1993d) m10883B.m149167o(i11);
                if (c1993d.f8509a != null && m10970d.equals(c1993d.f8512d)) {
                    AbstractC2001a.m10962b((Animator) m10883B.m149163i(i11));
                }
            }
            ArrayList arrayList = this.f8489Q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f8489Q.clone();
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((InterfaceC1995f) arrayList2.get(i12)).mo10835c(this);
                }
            }
            this.f8487O = true;
        }
    }

    /* renamed from: a */
    public Transition mo10907a(InterfaceC1995f interfaceC1995f) {
        if (this.f8489Q == null) {
            this.f8489Q = new ArrayList();
        }
        this.f8489Q.add(interfaceC1995f);
        return this;
    }

    /* renamed from: a0 */
    public void m10908a0(ViewGroup viewGroup) {
        C1993d c1993d;
        this.f8481I = new ArrayList();
        this.f8482J = new ArrayList();
        m10890W(this.f8477E, this.f8478F);
        C30239a m10883B = m10883B();
        int size = m10883B.size();
        InterfaceC2020j0 m10970d = AbstractC2004b0.m10970d(viewGroup);
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animator = (Animator) m10883B.m149163i(i11);
            if (animator != null && (c1993d = (C1993d) m10883B.get(animator)) != null && c1993d.f8509a != null && m10970d.equals(c1993d.f8512d)) {
                C2030t c2030t = c1993d.f8511c;
                View view = c1993d.f8509a;
                C2030t m10903L = m10903L(view, true);
                C2030t m10935x = m10935x(view, true);
                if (m10903L == null && m10935x == null) {
                    m10935x = (C2030t) this.f8478F.f8618a.get(view);
                }
                if ((m10903L != null || m10935x != null) && c1993d.f8513e.mo10904N(c2030t, m10935x)) {
                    if (!animator.isRunning() && !animator.isStarted()) {
                        m10883B.remove(animator);
                    } else {
                        animator.cancel();
                    }
                }
            }
        }
        mo10928q(viewGroup, this.f8477E, this.f8478F, this.f8481I, this.f8482J);
        mo10913f0();
    }

    /* renamed from: b */
    public Transition mo10909b(View view) {
        this.f8500u.add(view);
        return this;
    }

    /* renamed from: b0 */
    public Transition mo10910b0(InterfaceC1995f interfaceC1995f) {
        ArrayList arrayList = this.f8489Q;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC1995f);
        if (this.f8489Q.size() == 0) {
            this.f8489Q = null;
        }
        return this;
    }

    /* renamed from: c0 */
    public Transition mo10911c0(View view) {
        this.f8500u.remove(view);
        return this;
    }

    /* renamed from: d0 */
    public void mo10912d0(View view) {
        if (this.f8487O) {
            if (!this.f8488P) {
                C30239a m10883B = m10883B();
                int size = m10883B.size();
                InterfaceC2020j0 m10970d = AbstractC2004b0.m10970d(view);
                for (int i11 = size - 1; i11 >= 0; i11--) {
                    C1993d c1993d = (C1993d) m10883B.m149167o(i11);
                    if (c1993d.f8509a != null && m10970d.equals(c1993d.f8512d)) {
                        AbstractC2001a.m10963c((Animator) m10883B.m149163i(i11));
                    }
                }
                ArrayList arrayList = this.f8489Q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f8489Q.clone();
                    int size2 = arrayList2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ((InterfaceC1995f) arrayList2.get(i12)).mo10834a(this);
                    }
                }
            }
            this.f8487O = false;
        }
    }

    /* renamed from: f0 */
    public void mo10913f0() {
        m10927p0();
        C30239a m10883B = m10883B();
        Iterator it = this.f8490R.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (m10883B.containsKey(animator)) {
                m10927p0();
                m10894e0(animator, m10883B);
            }
        }
        this.f8490R.clear();
        m10930r();
    }

    /* renamed from: g */
    protected void m10914g(Animator animator) {
        if (animator == null) {
            m10930r();
            return;
        }
        if (m10931s() >= 0) {
            animator.setDuration(m10931s());
        }
        if (m10898C() >= 0) {
            animator.setStartDelay(m10898C() + animator.getStartDelay());
        }
        if (m10934w() != null) {
            animator.setInterpolator(m10934w());
        }
        animator.addListener(new C1992c());
        animator.start();
    }

    /* renamed from: g0 */
    public Transition mo10915g0(long j11) {
        this.f8497r = j11;
        return this;
    }

    /* renamed from: h */
    public void m10916h() {
        for (int size = this.f8485M.size() - 1; size >= 0; size--) {
            ((Animator) this.f8485M.get(size)).cancel();
        }
        ArrayList arrayList = this.f8489Q;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f8489Q.clone();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((InterfaceC1995f) arrayList2.get(i11)).mo10837e(this);
            }
        }
    }

    /* renamed from: h0 */
    public void mo10917h0(AbstractC1994e abstractC1994e) {
        this.f8492T = abstractC1994e;
    }

    /* renamed from: i */
    public abstract void mo10818i(C2030t c2030t);

    /* renamed from: j0 */
    public Transition mo10918j0(TimeInterpolator timeInterpolator) {
        this.f8498s = timeInterpolator;
        return this;
    }

    /* renamed from: k */
    public void mo10919k(C2030t c2030t) {
        String[] mo110988b;
        if (this.f8491S == null || c2030t.f8615a.isEmpty() || (mo110988b = this.f8491S.mo110988b()) == null) {
            return;
        }
        for (String str : mo110988b) {
            if (!c2030t.f8615a.containsKey(str)) {
                this.f8491S.mo110987a(c2030t);
                return;
            }
        }
    }

    /* renamed from: k0 */
    public void m10920k0(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            for (int i11 = 0; i11 < iArr.length; i11++) {
                if (m10884O(iArr[i11])) {
                    if (m10895f(iArr, i11)) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                } else {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
            }
            this.f8480H = (int[]) iArr.clone();
            return;
        }
        this.f8480H = f8470W;
    }

    /* renamed from: l */
    public abstract void mo10819l(C2030t c2030t);

    /* renamed from: l0 */
    public void mo10921l0(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f8494V = f8471X;
        } else {
            this.f8494V = pathMotion;
        }
    }

    /* renamed from: m */
    public void m10922m(ViewGroup viewGroup, boolean z11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C30239a c30239a;
        m10924n(z11);
        if ((this.f8499t.size() <= 0 && this.f8500u.size() <= 0) || (((arrayList = this.f8501v) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f8502w) != null && !arrayList2.isEmpty()))) {
            m10896j(viewGroup, z11);
        } else {
            for (int i11 = 0; i11 < this.f8499t.size(); i11++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f8499t.get(i11)).intValue());
                if (findViewById != null) {
                    C2030t c2030t = new C2030t(findViewById);
                    if (z11) {
                        mo10819l(c2030t);
                    } else {
                        mo10818i(c2030t);
                    }
                    c2030t.f8617c.add(this);
                    mo10919k(c2030t);
                    if (z11) {
                        m10893e(this.f8477E, findViewById, c2030t);
                    } else {
                        m10893e(this.f8478F, findViewById, c2030t);
                    }
                }
            }
            for (int i12 = 0; i12 < this.f8500u.size(); i12++) {
                View view = (View) this.f8500u.get(i12);
                C2030t c2030t2 = new C2030t(view);
                if (z11) {
                    mo10819l(c2030t2);
                } else {
                    mo10818i(c2030t2);
                }
                c2030t2.f8617c.add(this);
                mo10919k(c2030t2);
                if (z11) {
                    m10893e(this.f8477E, view, c2030t2);
                } else {
                    m10893e(this.f8478F, view, c2030t2);
                }
            }
        }
        if (!z11 && (c30239a = this.f8493U) != null) {
            int size = c30239a.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList3.add(this.f8477E.f8621d.remove((String) this.f8493U.m149163i(i13)));
            }
            for (int i14 = 0; i14 < size; i14++) {
                View view2 = (View) arrayList3.get(i14);
                if (view2 != null) {
                    this.f8477E.f8621d.put((String) this.f8493U.m149167o(i14), view2);
                }
            }
        }
    }

    /* renamed from: m0 */
    public void mo10923m0(AbstractC21443g abstractC21443g) {
        this.f8491S = abstractC21443g;
    }

    /* renamed from: n */
    public void m10924n(boolean z11) {
        if (z11) {
            this.f8477E.f8618a.clear();
            this.f8477E.f8619b.clear();
            this.f8477E.f8620c.m149126b();
        } else {
            this.f8478F.f8618a.clear();
            this.f8478F.f8619b.clear();
            this.f8478F.f8620c.m149126b();
        }
    }

    /* renamed from: n0 */
    public Transition mo10925n0(long j11) {
        this.f8496q = j11;
        return this;
    }

    @Override // 
    /* renamed from: o */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f8490R = new ArrayList();
            transition.f8477E = new C2031u();
            transition.f8478F = new C2031u();
            transition.f8481I = null;
            transition.f8482J = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public Animator mo10820p(ViewGroup viewGroup, C2030t c2030t, C2030t c2030t2) {
        return null;
    }

    /* renamed from: p0 */
    public void m10927p0() {
        if (this.f8486N == 0) {
            ArrayList arrayList = this.f8489Q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f8489Q.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((InterfaceC1995f) arrayList2.get(i11)).mo10939b(this);
                }
            }
            this.f8488P = false;
        }
        this.f8486N++;
    }

    /* renamed from: q */
    public void mo10928q(ViewGroup viewGroup, C2031u c2031u, C2031u c2031u2, ArrayList arrayList, ArrayList arrayList2) {
        Animator mo10820p;
        int i11;
        View view;
        Animator animator;
        C2030t c2030t;
        Animator animator2;
        C2030t c2030t2;
        C30239a m10883B = m10883B();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j11 = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            C2030t c2030t3 = (C2030t) arrayList.get(i12);
            C2030t c2030t4 = (C2030t) arrayList2.get(i12);
            if (c2030t3 != null && !c2030t3.f8617c.contains(this)) {
                c2030t3 = null;
            }
            if (c2030t4 != null && !c2030t4.f8617c.contains(this)) {
                c2030t4 = null;
            }
            if ((c2030t3 == null && c2030t4 == null) || ((c2030t3 != null && c2030t4 != null && !mo10904N(c2030t3, c2030t4)) || (mo10820p = mo10820p(viewGroup, c2030t3, c2030t4)) == null)) {
                i11 = size;
            } else {
                if (c2030t4 != null) {
                    view = c2030t4.f8616b;
                    String[] mo10817I = mo10817I();
                    if (mo10817I != null && mo10817I.length > 0) {
                        c2030t2 = new C2030t(view);
                        i11 = size;
                        C2030t c2030t5 = (C2030t) c2031u2.f8618a.get(view);
                        if (c2030t5 != null) {
                            int i13 = 0;
                            while (i13 < mo10817I.length) {
                                Map map = c2030t2.f8615a;
                                String str = mo10817I[i13];
                                map.put(str, c2030t5.f8615a.get(str));
                                i13++;
                                mo10817I = mo10817I;
                            }
                        }
                        int size2 = m10883B.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                C1993d c1993d = (C1993d) m10883B.get((Animator) m10883B.m149163i(i14));
                                if (c1993d.f8511c != null && c1993d.f8509a == view && c1993d.f8510b.equals(m10936y()) && c1993d.f8511c.equals(c2030t2)) {
                                    animator2 = null;
                                    break;
                                }
                                i14++;
                            } else {
                                animator2 = mo10820p;
                                break;
                            }
                        }
                    } else {
                        i11 = size;
                        animator2 = mo10820p;
                        c2030t2 = null;
                    }
                    animator = animator2;
                    c2030t = c2030t2;
                } else {
                    i11 = size;
                    view = c2030t3.f8616b;
                    animator = mo10820p;
                    c2030t = null;
                }
                if (animator != null) {
                    AbstractC21443g abstractC21443g = this.f8491S;
                    if (abstractC21443g != null) {
                        long mo110982c = abstractC21443g.mo110982c(viewGroup, this, c2030t3, c2030t4);
                        sparseIntArray.put(this.f8490R.size(), (int) mo110982c);
                        j11 = Math.min(mo110982c, j11);
                    }
                    m10883B.put(animator, new C1993d(view, m10936y(), this, AbstractC2004b0.m10970d(viewGroup), c2030t));
                    this.f8490R.add(animator);
                    j11 = j11;
                }
            }
            i12++;
            size = i11;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator3 = (Animator) this.f8490R.get(sparseIntArray.keyAt(i15));
                animator3.setStartDelay((sparseIntArray.valueAt(i15) - j11) + animator3.getStartDelay());
            }
        }
    }

    /* renamed from: q0 */
    public String mo10929q0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f8497r != -1) {
            str2 = str2 + "dur(" + this.f8497r + ") ";
        }
        if (this.f8496q != -1) {
            str2 = str2 + "dly(" + this.f8496q + ") ";
        }
        if (this.f8498s != null) {
            str2 = str2 + "interp(" + this.f8498s + ") ";
        }
        if (this.f8499t.size() > 0 || this.f8500u.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f8499t.size() > 0) {
                for (int i11 = 0; i11 < this.f8499t.size(); i11++) {
                    if (i11 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f8499t.get(i11);
                }
            }
            if (this.f8500u.size() > 0) {
                for (int i12 = 0; i12 < this.f8500u.size(); i12++) {
                    if (i12 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f8500u.get(i12);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* renamed from: r */
    public void m10930r() {
        int i11 = this.f8486N - 1;
        this.f8486N = i11;
        if (i11 == 0) {
            ArrayList arrayList = this.f8489Q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f8489Q.clone();
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((InterfaceC1995f) arrayList2.get(i12)).mo10836d(this);
                }
            }
            for (int i13 = 0; i13 < this.f8477E.f8620c.m149135m(); i13++) {
                View view = (View) this.f8477E.f8620c.m149136n(i13);
                if (view != null) {
                    AbstractC1579n0.m7821K0(view, false);
                }
            }
            for (int i14 = 0; i14 < this.f8478F.f8620c.m149135m(); i14++) {
                View view2 = (View) this.f8478F.f8620c.m149136n(i14);
                if (view2 != null) {
                    AbstractC1579n0.m7821K0(view2, false);
                }
            }
            this.f8488P = true;
        }
    }

    /* renamed from: s */
    public long m10931s() {
        return this.f8497r;
    }

    public String toString() {
        return mo10929q0("");
    }

    /* renamed from: u */
    public Rect m10932u() {
        AbstractC1994e abstractC1994e = this.f8492T;
        if (abstractC1994e == null) {
            return null;
        }
        return abstractC1994e.mo10938a(this);
    }

    /* renamed from: v */
    public AbstractC1994e m10933v() {
        return this.f8492T;
    }

    /* renamed from: w */
    public TimeInterpolator m10934w() {
        return this.f8498s;
    }

    /* renamed from: x */
    public C2030t m10935x(View view, boolean z11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TransitionSet transitionSet = this.f8479G;
        if (transitionSet != null) {
            return transitionSet.m10935x(view, z11);
        }
        if (z11) {
            arrayList = this.f8481I;
        } else {
            arrayList = this.f8482J;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                C2030t c2030t = (C2030t) arrayList.get(i11);
                if (c2030t == null) {
                    return null;
                }
                if (c2030t.f8616b == view) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return null;
        }
        if (z11) {
            arrayList2 = this.f8482J;
        } else {
            arrayList2 = this.f8481I;
        }
        return (C2030t) arrayList2.get(i11);
    }

    /* renamed from: y */
    public String m10936y() {
        return this.f8495p;
    }

    /* renamed from: z */
    public PathMotion m10937z() {
        return this.f8494V;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2026p.f8593c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long m7111g = AbstractC1404k.m7111g(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (m7111g >= 0) {
            mo10915g0(m7111g);
        }
        long m7111g2 = AbstractC1404k.m7111g(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (m7111g2 > 0) {
            mo10925n0(m7111g2);
        }
        int m7112h = AbstractC1404k.m7112h(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (m7112h > 0) {
            mo10918j0(AnimationUtils.loadInterpolator(context, m7112h));
        }
        String m7113i = AbstractC1404k.m7113i(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m7113i != null) {
            m10920k0(m10891X(m7113i));
        }
        obtainStyledAttributes.recycle();
    }
}
