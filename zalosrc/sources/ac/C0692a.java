package ac;

import android.app.Activity;
import android.view.ViewTreeObserver;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ac.a */
/* loaded from: classes.dex */
public final class C0692a {

    /* renamed from: a */
    private final WeakHashMap f2264a = new WeakHashMap();

    /* renamed from: b */
    private WeakReference f2265b = new WeakReference(null);

    /* renamed from: ac.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo1013a();

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ac.a$b */
    /* loaded from: classes.dex */
    public final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: p */
        private final WeakReference f2266p;

        /* renamed from: q */
        final /* synthetic */ C0692a f2267q;

        public b(C0692a c0692a, Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            this.f2267q = c0692a;
            this.f2266p = new WeakReference(activity);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            List list;
            Activity activity = (Activity) this.f2266p.get();
            if (activity == null || (list = (List) this.f2267q.f2264a.get(activity)) == null) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if ((aVar instanceof C0702f) && ((C0702f) aVar).m1060g() == null) {
                    it.remove();
                } else if ((aVar instanceof C0696c) && ((C0696c) aVar).m1018f() == null) {
                    it.remove();
                } else {
                    aVar.mo1013a();
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final int m1007b() {
        return this.f2264a.size();
    }

    /* renamed from: c */
    public final void m1008c(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        this.f2264a.put(activity, new ArrayList());
        if (this.f2265b.get() != null) {
            this.f2265b.clear();
        }
        this.f2265b = new WeakReference(activity);
        activity.getWindow().getDecorView().getViewTreeObserver().addOnPreDrawListener(new b(this, activity));
    }

    /* renamed from: d */
    public final void m1009d(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        if (AbstractC19074t.m100204b(this.f2265b.get(), activity)) {
            this.f2265b.clear();
        }
        this.f2264a.remove(activity);
    }

    /* renamed from: e */
    public final void m1010e(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        List list = (List) this.f2264a.get(activity);
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onActivityStarted(activity);
        }
    }

    /* renamed from: f */
    public final void m1011f(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        List list = (List) this.f2264a.get(activity);
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onActivityStopped(activity);
        }
    }

    /* renamed from: g */
    public final void m1012g(a aVar) {
        List list;
        AbstractC19074t.m100208f(aVar, "listener");
        Activity activity = (Activity) this.f2265b.get();
        if (activity == null || (list = (List) this.f2264a.get(activity)) == null) {
            return;
        }
        list.add(aVar);
    }
}
