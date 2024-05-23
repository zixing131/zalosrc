package p012a6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: a6.y */
/* loaded from: classes2.dex */
final class C0596y extends AbstractSet {

    /* renamed from: p */
    final /* synthetic */ C0240f0 f2084p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0596y(C0240f0 c0240f0) {
        this.f2084p = c0240f0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2084p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int m704t;
        Map m710k = this.f2084p.m710k();
        if (m710k != null) {
            return m710k.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            m704t = this.f2084p.m704t(entry.getKey());
            if (m704t != -1) {
                Object[] objArr = this.f2084p.f1112s;
                objArr.getClass();
                if (AbstractC0466qh.m859a(objArr[m704t], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C0240f0 c0240f0 = this.f2084p;
        Map m710k = c0240f0.m710k();
        if (m710k != null) {
            return m710k.entrySet().iterator();
        }
        return new C0560w(c0240f0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m703r;
        int i11;
        Map m710k = this.f2084p.m710k();
        if (m710k != null) {
            return m710k.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C0240f0 c0240f0 = this.f2084p;
        if (!c0240f0.m714q()) {
            m703r = c0240f0.m703r();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object m700h = C0240f0.m700h(this.f2084p);
            C0240f0 c0240f02 = this.f2084p;
            int[] iArr = c0240f02.f1110q;
            iArr.getClass();
            Object[] objArr = c0240f02.f1111r;
            objArr.getClass();
            Object[] objArr2 = c0240f02.f1112s;
            objArr2.getClass();
            int m719b = AbstractC0259g0.m719b(key, value, m703r, m700h, iArr, objArr, objArr2);
            if (m719b == -1) {
                return false;
            }
            this.f2084p.m713p(m719b, m703r);
            C0240f0 c0240f03 = this.f2084p;
            i11 = c0240f03.f1114u;
            c0240f03.f1114u = i11 - 1;
            this.f2084p.m711n();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2084p.size();
    }
}
