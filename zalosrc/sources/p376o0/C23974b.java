package p376o0;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o0.b */
/* loaded from: classes.dex */
public class C23974b implements Iterable {

    /* renamed from: p */
    c f116029p;

    /* renamed from: q */
    private c f116030q;

    /* renamed from: r */
    private final WeakHashMap f116031r = new WeakHashMap();

    /* renamed from: s */
    private int f116032s = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.b$a */
    /* loaded from: classes.dex */
    public static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p376o0.C23974b.e
        /* renamed from: c */
        c mo125465c(c cVar) {
            return cVar.f116036s;
        }

        @Override // p376o0.C23974b.e
        /* renamed from: d */
        c mo125466d(c cVar) {
            return cVar.f116035r;
        }
    }

    /* renamed from: o0.b$b */
    /* loaded from: classes2.dex */
    private static class b extends e {
        b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p376o0.C23974b.e
        /* renamed from: c */
        c mo125465c(c cVar) {
            return cVar.f116035r;
        }

        @Override // p376o0.C23974b.e
        /* renamed from: d */
        c mo125466d(c cVar) {
            return cVar.f116036s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.b$c */
    /* loaded from: classes.dex */
    public static class c implements Map.Entry {

        /* renamed from: p */
        final Object f116033p;

        /* renamed from: q */
        final Object f116034q;

        /* renamed from: r */
        c f116035r;

        /* renamed from: s */
        c f116036s;

        c(Object obj, Object obj2) {
            this.f116033p = obj;
            this.f116034q = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f116033p.equals(cVar.f116033p) && this.f116034q.equals(cVar.f116034q)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f116033p;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f116034q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f116033p.hashCode() ^ this.f116034q.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f116033p + "=" + this.f116034q;
        }
    }

    /* renamed from: o0.b$d */
    /* loaded from: classes.dex */
    public class d extends f implements Iterator {

        /* renamed from: p */
        private c f116037p;

        /* renamed from: q */
        private boolean f116038q = true;

        d() {
        }

        @Override // p376o0.C23974b.f
        /* renamed from: a */
        void mo125467a(c cVar) {
            boolean z11;
            c cVar2 = this.f116037p;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f116036s;
                this.f116037p = cVar3;
                if (cVar3 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f116038q = z11;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar;
            if (this.f116038q) {
                this.f116038q = false;
                this.f116037p = C23974b.this.f116029p;
            } else {
                c cVar2 = this.f116037p;
                if (cVar2 != null) {
                    cVar = cVar2.f116035r;
                } else {
                    cVar = null;
                }
                this.f116037p = cVar;
            }
            return this.f116037p;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f116038q) {
                if (C23974b.this.f116029p == null) {
                    return false;
                }
                return true;
            }
            c cVar = this.f116037p;
            if (cVar == null || cVar.f116035r == null) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: o0.b$e */
    /* loaded from: classes.dex */
    private static abstract class e extends f implements Iterator {

        /* renamed from: p */
        c f116040p;

        /* renamed from: q */
        c f116041q;

        e(c cVar, c cVar2) {
            this.f116040p = cVar2;
            this.f116041q = cVar;
        }

        /* renamed from: f */
        private c m125469f() {
            c cVar = this.f116041q;
            c cVar2 = this.f116040p;
            if (cVar != cVar2 && cVar2 != null) {
                return mo125466d(cVar);
            }
            return null;
        }

        @Override // p376o0.C23974b.f
        /* renamed from: a */
        public void mo125467a(c cVar) {
            if (this.f116040p == cVar && cVar == this.f116041q) {
                this.f116041q = null;
                this.f116040p = null;
            }
            c cVar2 = this.f116040p;
            if (cVar2 == cVar) {
                this.f116040p = mo125465c(cVar2);
            }
            if (this.f116041q == cVar) {
                this.f116041q = m125469f();
            }
        }

        /* renamed from: c */
        abstract c mo125465c(c cVar);

        /* renamed from: d */
        abstract c mo125466d(c cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f116041q;
            this.f116041q = m125469f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f116041q != null;
        }
    }

    /* renamed from: o0.b$f */
    /* loaded from: classes.dex */
    public static abstract class f {
        /* renamed from: a */
        abstract void mo125467a(c cVar);
    }

    /* renamed from: d */
    public Map.Entry m125461d() {
        return this.f116029p;
    }

    public Iterator descendingIterator() {
        b bVar = new b(this.f116030q, this.f116029p);
        this.f116031r.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: e */
    protected c mo125457e(Object obj) {
        c cVar = this.f116029p;
        while (cVar != null && !cVar.f116033p.equals(obj)) {
            cVar = cVar.f116035r;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23974b)) {
            return false;
        }
        C23974b c23974b = (C23974b) obj;
        if (size() != c23974b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c23974b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public d m125462g() {
        d dVar = new d();
        this.f116031r.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((Map.Entry) it.next()).hashCode();
        }
        return i11;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f116029p, this.f116030q);
        this.f116031r.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: j */
    public Map.Entry m125463j() {
        return this.f116030q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public c m125464k(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f116032s++;
        c cVar2 = this.f116030q;
        if (cVar2 == null) {
            this.f116029p = cVar;
            this.f116030q = cVar;
            return cVar;
        }
        cVar2.f116035r = cVar;
        cVar.f116036s = cVar2;
        this.f116030q = cVar;
        return cVar;
    }

    /* renamed from: l */
    public Object mo125458l(Object obj, Object obj2) {
        c mo125457e = mo125457e(obj);
        if (mo125457e != null) {
            return mo125457e.f116034q;
        }
        m125464k(obj, obj2);
        return null;
    }

    /* renamed from: m */
    public Object mo125459m(Object obj) {
        c mo125457e = mo125457e(obj);
        if (mo125457e == null) {
            return null;
        }
        this.f116032s--;
        if (!this.f116031r.isEmpty()) {
            Iterator it = this.f116031r.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo125467a(mo125457e);
            }
        }
        c cVar = mo125457e.f116036s;
        if (cVar != null) {
            cVar.f116035r = mo125457e.f116035r;
        } else {
            this.f116029p = mo125457e.f116035r;
        }
        c cVar2 = mo125457e.f116035r;
        if (cVar2 != null) {
            cVar2.f116036s = cVar;
        } else {
            this.f116030q = cVar;
        }
        mo125457e.f116035r = null;
        mo125457e.f116036s = null;
        return mo125457e.f116034q;
    }

    public int size() {
        return this.f116032s;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
