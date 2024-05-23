package a00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: a00.d */
/* loaded from: classes4.dex */
public abstract class AbstractC0019d implements Iterable, Cloneable {

    /* renamed from: p */
    public List f34p;

    public AbstractC0019d(InterfaceC0017b... interfaceC0017bArr) {
        ArrayList arrayList = new ArrayList();
        this.f34p = arrayList;
        arrayList.addAll(Arrays.asList(interfaceC0017bArr));
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f34p.iterator();
    }

    public int size() {
        return this.f34p.size();
    }

    public AbstractC0019d(Collection collection, boolean z11) {
        ArrayList arrayList = new ArrayList();
        this.f34p = arrayList;
        if (!z11) {
            arrayList.addAll(collection);
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f34p.add(((InterfaceC0017b) it.next()).mo31a());
        }
    }
}
