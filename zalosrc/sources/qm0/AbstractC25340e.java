package qm0;

import gn0.InterfaceC19520d;
import java.util.AbstractList;
import java.util.List;

/* renamed from: qm0.e */
/* loaded from: classes.dex */
public abstract class AbstractC25340e extends AbstractList implements List, InterfaceC19520d {
    /* renamed from: d */
    public abstract int mo131256d();

    /* renamed from: e */
    public abstract Object mo131257e(int i11);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i11) {
        return mo131257e(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo131256d();
    }
}
