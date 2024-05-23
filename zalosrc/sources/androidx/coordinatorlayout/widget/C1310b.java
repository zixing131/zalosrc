package androidx.coordinatorlayout.widget;

import androidx.core.util.C1485g;
import androidx.core.util.InterfaceC1484f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p665y0.C30245g;

/* renamed from: androidx.coordinatorlayout.widget.b */
/* loaded from: classes2.dex */
public final class C1310b {

    /* renamed from: a */
    private final InterfaceC1484f f5832a = new C1485g(10);

    /* renamed from: b */
    private final C30245g f5833b = new C30245g();

    /* renamed from: c */
    private final ArrayList f5834c = new ArrayList();

    /* renamed from: d */
    private final HashSet f5835d = new HashSet();

    /* renamed from: e */
    private void m6594e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.f5833b.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    m6594e(arrayList2.get(i11), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* renamed from: f */
    private ArrayList m6595f() {
        ArrayList arrayList = (ArrayList) this.f5832a.mo7484b();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: k */
    private void m6596k(ArrayList arrayList) {
        arrayList.clear();
        this.f5832a.mo7483a(arrayList);
    }

    /* renamed from: a */
    public void m6597a(Object obj, Object obj2) {
        if (this.f5833b.containsKey(obj) && this.f5833b.containsKey(obj2)) {
            ArrayList arrayList = (ArrayList) this.f5833b.get(obj);
            if (arrayList == null) {
                arrayList = m6595f();
                this.f5833b.put(obj, arrayList);
            }
            arrayList.add(obj2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    /* renamed from: b */
    public void m6598b(Object obj) {
        if (!this.f5833b.containsKey(obj)) {
            this.f5833b.put(obj, null);
        }
    }

    /* renamed from: c */
    public void m6599c() {
        int size = this.f5833b.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList arrayList = (ArrayList) this.f5833b.m149167o(i11);
            if (arrayList != null) {
                m6596k(arrayList);
            }
        }
        this.f5833b.clear();
    }

    /* renamed from: d */
    public boolean m6600d(Object obj) {
        return this.f5833b.containsKey(obj);
    }

    /* renamed from: g */
    public List m6601g(Object obj) {
        return (List) this.f5833b.get(obj);
    }

    /* renamed from: h */
    public List m6602h(Object obj) {
        int size = this.f5833b.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList arrayList2 = (ArrayList) this.f5833b.m149167o(i11);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f5833b.m149163i(i11));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList m6603i() {
        this.f5834c.clear();
        this.f5835d.clear();
        int size = this.f5833b.size();
        for (int i11 = 0; i11 < size; i11++) {
            m6594e(this.f5833b.m149163i(i11), this.f5834c, this.f5835d);
        }
        return this.f5834c;
    }

    /* renamed from: j */
    public boolean m6604j(Object obj) {
        int size = this.f5833b.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList arrayList = (ArrayList) this.f5833b.m149167o(i11);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
