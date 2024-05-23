package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1591q0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1563j0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.m */
/* loaded from: classes2.dex */
public abstract class AbstractC1739m {

    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ int f7198p;

        /* renamed from: q */
        final /* synthetic */ ArrayList f7199q;

        /* renamed from: r */
        final /* synthetic */ ArrayList f7200r;

        /* renamed from: s */
        final /* synthetic */ ArrayList f7201s;

        /* renamed from: t */
        final /* synthetic */ ArrayList f7202t;

        a(int i11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f7198p = i11;
            this.f7199q = arrayList;
            this.f7200r = arrayList2;
            this.f7201s = arrayList3;
            this.f7202t = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i11 = 0; i11 < this.f7198p; i11++) {
                AbstractC1579n0.m7851Z0((View) this.f7199q.get(i11), (String) this.f7200r.get(i11));
                AbstractC1579n0.m7851Z0((View) this.f7201s.get(i11), (String) this.f7202t.get(i11));
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ ArrayList f7204p;

        /* renamed from: q */
        final /* synthetic */ Map f7205q;

        b(ArrayList arrayList, Map map) {
            this.f7204p = arrayList;
            this.f7205q = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f7204p.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) this.f7204p.get(i11);
                String m7832Q = AbstractC1579n0.m7832Q(view);
                if (m7832Q != null) {
                    AbstractC1579n0.m7851Z0(view, AbstractC1739m.m9188i(this.f7205q, m7832Q));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$c */
    /* loaded from: classes2.dex */
    class c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ ArrayList f7207p;

        /* renamed from: q */
        final /* synthetic */ Map f7208q;

        c(ArrayList arrayList, Map map) {
            this.f7207p = arrayList;
            this.f7208q = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f7207p.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) this.f7207p.get(i11);
                AbstractC1579n0.m7851Z0(view, (String) this.f7208q.get(AbstractC1579n0.m7832Q(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m9186d(List list, View view) {
        int size = list.size();
        if (m9187h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i11 = size; i11 < list.size(); i11++) {
            View view2 = (View) list.get(i11);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    if (!m9187h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m9187h(List list, View view, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (list.get(i12) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m9188i(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static boolean m9189l(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public abstract Object mo9170A(Object obj);

    /* renamed from: a */
    public abstract void mo9171a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo9172b(Object obj, ArrayList arrayList);

    /* renamed from: c */
    public abstract void mo9173c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo9174e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m9190f(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (AbstractC1591q0.m8137a(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    m9190f(arrayList, viewGroup.getChildAt(i11));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* renamed from: g */
    public abstract Object mo9175g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m9191j(Map map, View view) {
        if (view.getVisibility() == 0) {
            String m7832Q = AbstractC1579n0.m7832Q(view);
            if (m7832Q != null) {
                map.put(m7832Q, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    m9191j(map, viewGroup.getChildAt(i11));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m9192k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        rect.set(i11, iArr[1], view.getWidth() + i11, iArr[1] + view.getHeight());
    }

    /* renamed from: m */
    public abstract Object mo9176m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo9177n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList m9193o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            arrayList2.add(AbstractC1579n0.m7832Q(view));
            AbstractC1579n0.m7851Z0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo9178p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo9179q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: r */
    public abstract void mo9180r(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m9194s(ViewGroup viewGroup, ArrayList arrayList, Map map) {
        ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(viewGroup, new c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo9181t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    /* renamed from: u */
    public abstract void mo9182u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo9183v(Object obj, View view);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m9195w(View view, ArrayList arrayList, Map map) {
        ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(view, new b(arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m9196x(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = (View) arrayList.get(i11);
            String m7832Q = AbstractC1579n0.m7832Q(view2);
            arrayList4.add(m7832Q);
            if (m7832Q != null) {
                AbstractC1579n0.m7851Z0(view2, null);
                String str = (String) map.get(m7832Q);
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i12))) {
                        AbstractC1579n0.m7851Z0((View) arrayList2.get(i12), m7832Q);
                        break;
                    }
                    i12++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: y */
    public abstract void mo9184y(Object obj, View view, ArrayList arrayList);

    /* renamed from: z */
    public abstract void mo9185z(Object obj, ArrayList arrayList, ArrayList arrayList2);
}
