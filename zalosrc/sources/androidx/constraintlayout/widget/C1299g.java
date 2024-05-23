package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.widget.g */
/* loaded from: classes2.dex */
public class C1299g {

    /* renamed from: a */
    private SparseIntArray f5768a = new SparseIntArray();

    /* renamed from: b */
    private HashMap f5769b = new HashMap();

    /* renamed from: androidx.constraintlayout.widget.g$a */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* renamed from: a */
    public void m6486a(int i11, a aVar) {
        HashSet hashSet = (HashSet) this.f5769b.get(Integer.valueOf(i11));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f5769b.put(Integer.valueOf(i11), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }

    /* renamed from: b */
    public void m6487b(int i11, a aVar) {
        HashSet hashSet = (HashSet) this.f5769b.get(Integer.valueOf(i11));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a aVar2 = (a) weakReference.get();
            if (aVar2 == null || aVar2 == aVar) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }
}
