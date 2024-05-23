package p566v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p516t3.C26467a;
import p631x3.AbstractC29304e;
import p631x3.AbstractC29305f;

/* renamed from: v3.m */
/* loaded from: classes2.dex */
public class C27505m implements InterfaceC27493a {

    /* renamed from: a */
    private final int f129391a;

    /* renamed from: b */
    private final b f129392b;

    /* renamed from: v3.m$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public int f129393a;

        /* renamed from: b */
        public List f129394b;

        /* renamed from: a */
        public C27505m m140637a() {
            return new C27505m(this.f129393a, this.f129394b);
        }
    }

    public C27505m(int i11, List list) {
        this.f129391a = i11;
        this.f129392b = new b(list);
    }

    @Override // p566v3.InterfaceC27493a
    /* renamed from: a */
    public int mo140593a() {
        return this.f129391a;
    }

    /* renamed from: b */
    public b m140636b() {
        return this.f129392b;
    }

    public C27505m(C27505m c27505m) {
        this.f129391a = c27505m.f129391a;
        b bVar = c27505m.f129392b;
        if (bVar != null) {
            this.f129392b = new b(bVar);
        } else {
            this.f129392b = null;
        }
    }

    /* renamed from: v3.m$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private final List f129395a;

        public b(List list) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(AbstractC29305f.m146406e((String) list.get(i11)));
            }
            this.f129395a = AbstractC29304e.m146402a(arrayList);
        }

        /* renamed from: a */
        public void m140638a(C26467a c26467a) {
            int size = this.f129395a.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((AbstractC29305f) this.f129395a.get(i11)).mo146410a(c26467a);
            }
        }

        /* renamed from: b */
        public List m140639b() {
            return this.f129395a;
        }

        public b(b bVar) {
            if (bVar.f129395a == null) {
                this.f129395a = null;
                return;
            }
            this.f129395a = new ArrayList();
            Iterator it = bVar.f129395a.iterator();
            while (it.hasNext()) {
                this.f129395a.add((AbstractC29305f) it.next());
            }
        }
    }
}
