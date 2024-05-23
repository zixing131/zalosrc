package p203ha;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p015a9.InterfaceC0662b;

/* renamed from: ha.c */
/* loaded from: classes.dex */
public class C19947c {

    /* renamed from: a */
    private final Map f98229a = new HashMap();

    /* renamed from: ha.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final Class f98230a;

        /* renamed from: b */
        private final InterfaceC0662b f98231b;

        public a(Class cls, InterfaceC0662b interfaceC0662b) {
            this.f98230a = cls;
            this.f98231b = interfaceC0662b;
        }

        /* renamed from: a */
        final InterfaceC0662b m103702a() {
            return this.f98231b;
        }

        /* renamed from: b */
        final Class m103703b() {
            return this.f98230a;
        }
    }

    public C19947c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            this.f98229a.put(aVar.m103703b(), aVar.m103702a());
        }
    }
}
