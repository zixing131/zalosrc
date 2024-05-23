package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes2.dex */
class C1738l extends AbstractC1739m {

    /* renamed from: androidx.fragment.app.l$a */
    /* loaded from: classes2.dex */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f7184a;

        a(Rect rect) {
            this.f7184a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f7184a;
        }
    }

    /* renamed from: androidx.fragment.app.l$b */
    /* loaded from: classes2.dex */
    class b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f7186a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f7187b;

        b(View view, ArrayList arrayList) {
            this.f7186a = view;
            this.f7187b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f7186a.setVisibility(8);
            int size = this.f7187b.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((View) this.f7187b.get(i11)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.l$c */
    /* loaded from: classes2.dex */
    class c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f7189a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f7190b;

        /* renamed from: c */
        final /* synthetic */ Object f7191c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f7192d;

        /* renamed from: e */
        final /* synthetic */ Object f7193e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f7194f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f7189a = obj;
            this.f7190b = arrayList;
            this.f7191c = obj2;
            this.f7192d = arrayList2;
            this.f7193e = obj3;
            this.f7194f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f7189a;
            if (obj != null) {
                C1738l.this.mo9179q(obj, this.f7190b, null);
            }
            Object obj2 = this.f7191c;
            if (obj2 != null) {
                C1738l.this.mo9179q(obj2, this.f7192d, null);
            }
            Object obj3 = this.f7193e;
            if (obj3 != null) {
                C1738l.this.mo9179q(obj3, this.f7194f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$d */
    /* loaded from: classes2.dex */
    class d extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f7196a;

        d(Rect rect) {
            this.f7196a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f7196a;
            if (rect != null && !rect.isEmpty()) {
                return this.f7196a;
            }
            return null;
        }
    }

    /* renamed from: B */
    private static boolean m9169B(Transition transition) {
        if (AbstractC1739m.m9189l(transition.getTargetIds()) && AbstractC1739m.m9189l(transition.getTargetNames()) && AbstractC1739m.m9189l(transition.getTargetTypes())) {
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
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: a */
    public void mo9171a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
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
            int transitionCount = transitionSet.getTransitionCount();
            while (i11 < transitionCount) {
                mo9172b(transitionSet.getTransitionAt(i11), arrayList);
                i11++;
            }
            return;
        }
        if (!m9169B(transition) && AbstractC1739m.m9189l(transition.getTargets())) {
            int size = arrayList.size();
            while (i11 < size) {
                transition.addTarget((View) arrayList.get(i11));
                i11++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: c */
    public void mo9173c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
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
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
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
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: n */
    public Object mo9177n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: p */
    public void mo9178p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: q */
    public void mo9179q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i11 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i11 < transitionCount) {
                mo9179q(transitionSet.getTransitionAt(i11), arrayList, arrayList2);
                i11++;
            }
            return;
        }
        if (!m9169B(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i11 < size) {
                transition.addTarget((View) arrayList2.get(i11));
                i11++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: r */
    public void mo9180r(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: t */
    public void mo9181t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: u */
    public void mo9182u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new d(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: v */
    public void mo9183v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m9192k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: y */
    public void mo9184y(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1739m.m9186d(targets, (View) arrayList.get(i11));
        }
        targets.add(view);
        arrayList.add(view);
        mo9172b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC1739m
    /* renamed from: z */
    public void mo9185z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo9179q(transitionSet, arrayList, arrayList2);
        }
    }
}
