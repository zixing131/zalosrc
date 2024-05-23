package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1579n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p665y0.C30239a;

/* renamed from: androidx.transition.r */
/* loaded from: classes2.dex */
public abstract class AbstractC2028r {

    /* renamed from: a */
    private static Transition f8602a = new AutoTransition();

    /* renamed from: b */
    private static ThreadLocal f8603b = new ThreadLocal();

    /* renamed from: c */
    static ArrayList f8604c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.r$a */
    /* loaded from: classes2.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: p */
        Transition f8605p;

        /* renamed from: q */
        ViewGroup f8606q;

        /* renamed from: androidx.transition.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C32639a extends AbstractC2027q {

            /* renamed from: p */
            final /* synthetic */ C30239a f8607p;

            C32639a(C30239a c30239a) {
                this.f8607p = c30239a;
            }

            @Override // androidx.transition.Transition.InterfaceC1995f
            /* renamed from: d */
            public void mo10836d(Transition transition) {
                ((ArrayList) this.f8607p.get(a.this.f8606q)).remove(transition);
                transition.mo10910b0(this);
            }
        }

        a(Transition transition, ViewGroup viewGroup) {
            this.f8605p = transition;
            this.f8606q = viewGroup;
        }

        /* renamed from: a */
        private void m11028a() {
            this.f8606q.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f8606q.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m11028a();
            if (!AbstractC2028r.f8604c.remove(this.f8606q)) {
                return true;
            }
            C30239a m11025b = AbstractC2028r.m11025b();
            ArrayList arrayList = (ArrayList) m11025b.get(this.f8606q);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                m11025b.put(this.f8606q, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f8605p);
            this.f8605p.mo10907a(new C32639a(m11025b));
            this.f8605p.m10922m(this.f8606q, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo10912d0(this.f8606q);
                }
            }
            this.f8605p.m10908a0(this.f8606q);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m11028a();
            AbstractC2028r.f8604c.remove(this.f8606q);
            ArrayList arrayList = (ArrayList) AbstractC2028r.m11025b().get(this.f8606q);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo10912d0(this.f8606q);
                }
            }
            this.f8605p.m10924n(true);
        }
    }

    /* renamed from: a */
    public static void m11024a(ViewGroup viewGroup, Transition transition) {
        if (!f8604c.contains(viewGroup) && AbstractC1579n0.m7865e0(viewGroup)) {
            f8604c.add(viewGroup);
            if (transition == null) {
                transition = f8602a;
            }
            Transition clone = transition.clone();
            m11027d(viewGroup, clone);
            AbstractC2025o.m11023b(viewGroup, null);
            m11026c(viewGroup, clone);
        }
    }

    /* renamed from: b */
    static C30239a m11025b() {
        C30239a c30239a;
        WeakReference weakReference = (WeakReference) f8603b.get();
        if (weakReference != null && (c30239a = (C30239a) weakReference.get()) != null) {
            return c30239a;
        }
        C30239a c30239a2 = new C30239a();
        f8603b.set(new WeakReference(c30239a2));
        return c30239a2;
    }

    /* renamed from: c */
    private static void m11026c(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            a aVar = new a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m11027d(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) m11025b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo10906Y(viewGroup);
            }
        }
        if (transition != null) {
            transition.m10922m(viewGroup, true);
        }
        AbstractC2025o.m11022a(viewGroup);
    }
}
