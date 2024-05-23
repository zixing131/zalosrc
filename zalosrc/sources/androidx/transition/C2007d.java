package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1739m;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.transition.d */
/* loaded from: classes2.dex */
public class C2007d extends AbstractC1739m {

    /* renamed from: androidx.transition.d$a */
    /* loaded from: classes2.dex */
    class a extends Transition.AbstractC1994e {

        /* renamed from: a */
        final /* synthetic */ Rect f8548a;

        a(Rect rect) {
            this.f8548a = rect;
        }

        @Override // androidx.transition.Transition.AbstractC1994e
        /* renamed from: a */
        public Rect mo10938a(Transition transition) {
            return this.f8548a;
        }
    }

    /* renamed from: androidx.transition.d$b */
    /* loaded from: classes2.dex */
    class b implements Transition.InterfaceC1995f {

        /* renamed from: p */
        final /* synthetic */ View f8550p;

        /* renamed from: q */
        final /* synthetic */ ArrayList f8551q;

        b(View view, ArrayList arrayList) {
            this.f8550p = view;
            this.f8551q = arrayList;
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: a */
        public void mo10834a(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: b */
        public void mo10939b(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: c */
        public void mo10835c(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: d */
        public void mo10836d(Transition transition) {
            transition.mo10910b0(this);
            this.f8550p.setVisibility(8);
            int size = this.f8551q.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((View) this.f8551q.get(i11)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: e */
        public void mo10837e(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.d$c */
    /* loaded from: classes2.dex */
    class c extends AbstractC2027q {

        /* renamed from: p */
        final /* synthetic */ Object f8553p;

        /* renamed from: q */
        final /* synthetic */ ArrayList f8554q;

        /* renamed from: r */
        final /* synthetic */ Object f8555r;

        /* renamed from: s */
        final /* synthetic */ ArrayList f8556s;

        /* renamed from: t */
        final /* synthetic */ Object f8557t;

        /* renamed from: u */
        final /* synthetic */ ArrayList f8558u;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f8553p = obj;
            this.f8554q = arrayList;
            this.f8555r = obj2;
            this.f8556s = arrayList2;
            this.f8557t = obj3;
            this.f8558u = arrayList3;
        }

        @Override // androidx.transition.AbstractC2027q, androidx.transition.Transition.InterfaceC1995f
        /* renamed from: b */
        public void mo10939b(Transition transition) {
            Object obj = this.f8553p;
            if (obj != null) {
                C2007d.this.mo9179q(obj, this.f8554q, null);
            }
            Object obj2 = this.f8555r;
            if (obj2 != null) {
                C2007d.this.mo9179q(obj2, this.f8556s, null);
            }
            Object obj3 = this.f8557t;
            if (obj3 != null) {
                C2007d.this.mo9179q(obj3, this.f8558u, null);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: d */
        public void mo10836d(Transition transition) {
            transition.mo10910b0(this);
        }
    }

    /* renamed from: androidx.transition.d$d */
    /* loaded from: classes2.dex */
    class d extends Transition.AbstractC1994e {

        /* renamed from: a */
        final /* synthetic */ Rect f8560a;

        d(Rect rect) {
            this.f8560a = rect;
        }

        @Override // androidx.transition.Transition.AbstractC1994e
        /* renamed from: a */
        public Rect mo10938a(Transition transition) {
            Rect rect = this.f8560a;
            if (rect != null && !rect.isEmpty()) {
                return this.f8560a;
            }
            return null;
        }
    }

    /* renamed from: B */
    private static boolean m10987B(Transition transition) {
        if (AbstractC1739m.m9189l(transition.m10899D()) && AbstractC1739m.m9189l(transition.m10900E()) && AbstractC1739m.m9189l(transition.m10901G())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: A */
    public Object mo9170A(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.m10947t0((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: a */
    public void mo9171a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo10909b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: b */
    public void mo9172b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i11 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int m10949w0 = transitionSet.m10949w0();
            while (i11 < m10949w0) {
                mo9172b(transitionSet.m10948v0(i11), arrayList);
                i11++;
            }
            return;
        }
        if (!m10987B(transition) && AbstractC1739m.m9189l(transition.m10902H())) {
            int size = arrayList.size();
            while (i11 < size) {
                transition.mo10909b((View) arrayList.get(i11));
                i11++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: c */
    public void mo9173c(ViewGroup viewGroup, Object obj) {
        AbstractC2028r.m11024a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: e */
    public boolean mo9174e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: g */
    public Object mo9175g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: m */
    public Object mo9176m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().m10947t0(transition).m10947t0(transition2).m10943B0(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.m10947t0(transition);
            }
            transitionSet.m10947t0(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: n */
    public Object mo9177n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.m10947t0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.m10947t0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.m10947t0((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: p */
    public void mo9178p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo10911c0(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: q */
    public void mo9179q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        Transition transition = (Transition) obj;
        int i11 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int m10949w0 = transitionSet.m10949w0();
            while (i11 < m10949w0) {
                mo9179q(transitionSet.m10948v0(i11), arrayList, arrayList2);
                i11++;
            }
            return;
        }
        if (!m10987B(transition)) {
            List m10902H = transition.m10902H();
            if (m10902H.size() == arrayList.size() && m10902H.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i11 < size) {
                    transition.mo10909b((View) arrayList2.get(i11));
                    i11++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.mo10911c0((View) arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: r */
    public void mo9180r(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).mo10907a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: t */
    public void mo9181t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).mo10907a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: u */
    public void mo9182u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo10917h0(new d(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: v */
    public void mo9183v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m9192k(view, rect);
            ((Transition) obj).mo10917h0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: y */
    public void mo9184y(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List m10902H = transitionSet.m10902H();
        m10902H.clear();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1739m.m9186d(m10902H, (View) arrayList.get(i11));
        }
        m10902H.add(view);
        arrayList.add(view);
        mo9172b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: z */
    public void mo9185z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.m10902H().clear();
            transitionSet.m10902H().addAll(arrayList2);
            mo9179q(transitionSet, arrayList, arrayList2);
        }
    }
}
