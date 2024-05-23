package p670y5;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: y5.n0 */
/* loaded from: classes2.dex */
final class C30545n0 extends AbstractSet {

    /* renamed from: p */
    final /* synthetic */ C30659t0 f141529p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30545n0(C30659t0 c30659t0) {
        this.f141529p = c30659t0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f141529p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int m149640t;
        Map m149646k = this.f141529p.m149646k();
        if (m149646k != null) {
            return m149646k.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            m149640t = this.f141529p.m149640t(entry.getKey());
            if (m149640t != -1) {
                Object[] objArr = this.f141529p.f141810s;
                objArr.getClass();
                if (AbstractC30506l.m149562a(objArr[m149640t], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C30659t0 c30659t0 = this.f141529p;
        Map m149646k = c30659t0.m149646k();
        if (m149646k != null) {
            return m149646k.entrySet().iterator();
        }
        return new C30507l0(c30659t0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m149639r;
        int i11;
        Map m149646k = this.f141529p.m149646k();
        if (m149646k != null) {
            return m149646k.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C30659t0 c30659t0 = this.f141529p;
        if (!c30659t0.m149650q()) {
            m149639r = c30659t0.m149639r();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object m149636h = C30659t0.m149636h(this.f141529p);
            C30659t0 c30659t02 = this.f141529p;
            int[] iArr = c30659t02.f141808q;
            iArr.getClass();
            Object[] objArr = c30659t02.f141809r;
            objArr.getClass();
            Object[] objArr2 = c30659t02.f141810s;
            objArr2.getClass();
            int m149652b = AbstractC30678u0.m149652b(key, value, m149639r, m149636h, iArr, objArr, objArr2);
            if (m149652b == -1) {
                return false;
            }
            this.f141529p.m149649p(m149652b, m149639r);
            C30659t0 c30659t03 = this.f141529p;
            i11 = c30659t03.f141812u;
            c30659t03.f141812u = i11 - 1;
            this.f141529p.m149647n();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f141529p.size();
    }
}
