package qm0;

import gn0.InterfaceC19521e;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: qm0.f */
/* loaded from: classes7.dex */
public abstract class AbstractC25342f extends AbstractMap implements Map, InterfaceC19521e {
    /* renamed from: a */
    public abstract Set mo113209a();

    /* renamed from: b */
    public abstract /* bridge */ Set mo113210b();

    /* renamed from: c */
    public abstract /* bridge */ int mo113211c();

    /* renamed from: d */
    public /* bridge */ Collection m131260d() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return mo113209a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return mo113210b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return mo113211c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return m131260d();
    }
}
