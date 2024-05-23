package p735do;

import p137eo.C18524h;

/* renamed from: do.c */
/* loaded from: classes4.dex */
public final class C18035c extends AbstractC18033a {
    public C18035c() {
        super(10, null, 2, null);
    }

    @Override // p735do.AbstractC18033a, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof C18524h.a)) {
            return false;
        }
        return m95887e((C18524h.a) obj);
    }

    @Override // p735do.AbstractC18033a, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C18524h.b)) {
            return false;
        }
        return m95888f((C18524h.b) obj);
    }

    /* renamed from: e */
    public /* bridge */ boolean m95887e(C18524h.a aVar) {
        return super.containsKey(aVar);
    }

    /* renamed from: f */
    public /* bridge */ boolean m95888f(C18524h.b bVar) {
        return super.containsValue(bVar);
    }

    /* renamed from: g */
    public /* bridge */ C18524h.b m95889g(C18524h.a aVar) {
        return (C18524h.b) super.get(aVar);
    }

    @Override // p735do.AbstractC18033a, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof C18524h.a)) {
            return null;
        }
        return m95889g((C18524h.a) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof C18524h.a)) {
            return obj2;
        }
        return m95890h((C18524h.a) obj, (C18524h.b) obj2);
    }

    /* renamed from: h */
    public /* bridge */ C18524h.b m95890h(C18524h.a aVar, C18524h.b bVar) {
        return (C18524h.b) super.getOrDefault(aVar, bVar);
    }

    /* renamed from: i */
    public /* bridge */ C18524h.b m95891i(C18524h.a aVar) {
        return (C18524h.b) super.remove(aVar);
    }

    /* renamed from: k */
    public /* bridge */ boolean m95892k(C18524h.a aVar, C18524h.b bVar) {
        return super.remove(aVar, bVar);
    }

    @Override // p735do.AbstractC18033a, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof C18524h.a) {
            return m95891i((C18524h.a) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof C18524h.a) && (obj2 instanceof C18524h.b)) {
            return m95892k((C18524h.a) obj, (C18524h.b) obj2);
        }
        return false;
    }
}
