package p502s3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: s3.d */
/* loaded from: classes2.dex */
class C26118d {

    /* renamed from: a */
    private final a f124335a = new a();

    /* renamed from: b */
    private final Map f124336b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3.d$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        final Object f124337a;

        /* renamed from: b */
        private List f124338b;

        /* renamed from: c */
        a f124339c;

        /* renamed from: d */
        a f124340d;

        public a() {
            this(null);
        }

        /* renamed from: a */
        public void m134466a(Object obj) {
            if (this.f124338b == null) {
                this.f124338b = new ArrayList();
            }
            this.f124338b.add(obj);
        }

        /* renamed from: b */
        public Object m134467b() {
            int m134468c = m134468c();
            if (m134468c > 0) {
                return this.f124338b.remove(m134468c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m134468c() {
            List list = this.f124338b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(Object obj) {
            this.f124340d = this;
            this.f124339c = this;
            this.f124337a = obj;
        }
    }

    /* renamed from: b */
    private void m134459b(a aVar) {
        m134461e(aVar);
        a aVar2 = this.f124335a;
        aVar.f124340d = aVar2;
        aVar.f124339c = aVar2.f124339c;
        m134462g(aVar);
    }

    /* renamed from: c */
    private void m134460c(a aVar) {
        m134461e(aVar);
        a aVar2 = this.f124335a;
        aVar.f124340d = aVar2.f124340d;
        aVar.f124339c = aVar2;
        m134462g(aVar);
    }

    /* renamed from: e */
    private static void m134461e(a aVar) {
        a aVar2 = aVar.f124340d;
        aVar2.f124339c = aVar.f124339c;
        aVar.f124339c.f124340d = aVar2;
    }

    /* renamed from: g */
    private static void m134462g(a aVar) {
        aVar.f124339c.f124340d = aVar;
        aVar.f124340d.f124339c = aVar;
    }

    /* renamed from: a */
    public Object m134463a(InterfaceC26122h interfaceC26122h) {
        a aVar = (a) this.f124336b.get(interfaceC26122h);
        if (aVar == null) {
            aVar = new a(interfaceC26122h);
            this.f124336b.put(interfaceC26122h, aVar);
        } else {
            interfaceC26122h.mo134483a();
        }
        m134459b(aVar);
        return aVar.m134467b();
    }

    /* renamed from: d */
    public void m134464d(InterfaceC26122h interfaceC26122h, Object obj) {
        a aVar = (a) this.f124336b.get(interfaceC26122h);
        if (aVar == null) {
            aVar = new a(interfaceC26122h);
            m134460c(aVar);
            this.f124336b.put(interfaceC26122h, aVar);
        } else {
            interfaceC26122h.mo134483a();
        }
        aVar.m134466a(obj);
    }

    /* renamed from: f */
    public Object m134465f() {
        for (a aVar = this.f124335a.f124340d; !aVar.equals(this.f124335a); aVar = aVar.f124340d) {
            Object m134467b = aVar.m134467b();
            if (m134467b != null) {
                return m134467b;
            }
            m134461e(aVar);
            this.f124336b.remove(aVar.f124337a);
            ((InterfaceC26122h) aVar.f124337a).mo134483a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f124335a.f124339c;
        boolean z11 = false;
        while (!aVar.equals(this.f124335a)) {
            sb2.append('{');
            sb2.append(aVar.f124337a);
            sb2.append(':');
            sb2.append(aVar.m134468c());
            sb2.append("}, ");
            aVar = aVar.f124339c;
            z11 = true;
        }
        if (z11) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
