package p512t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import p467r.C25589l;

/* renamed from: t.a */
/* loaded from: classes2.dex */
public class C26435a {

    /* renamed from: c */
    private static C26435a f125604c = new C26435a();

    /* renamed from: a */
    private final ArrayList f125605a = new ArrayList();

    /* renamed from: b */
    private final ArrayList f125606b = new ArrayList();

    private C26435a() {
    }

    /* renamed from: a */
    public static C26435a m136271a() {
        return f125604c;
    }

    /* renamed from: b */
    public void m136272b(C25589l c25589l) {
        this.f125605a.add(c25589l);
    }

    /* renamed from: c */
    public Collection m136273c() {
        return Collections.unmodifiableCollection(this.f125605a);
    }

    /* renamed from: d */
    public void m136274d(C25589l c25589l) {
        boolean m136277g = m136277g();
        this.f125606b.add(c25589l);
        if (m136277g) {
            return;
        }
        C26440f.m136313b().m136316e();
    }

    /* renamed from: e */
    public Collection m136275e() {
        return Collections.unmodifiableCollection(this.f125606b);
    }

    /* renamed from: f */
    public void m136276f(C25589l c25589l) {
        boolean m136277g = m136277g();
        this.f125605a.remove(c25589l);
        this.f125606b.remove(c25589l);
        if (!m136277g || m136277g()) {
            return;
        }
        C26440f.m136313b().m136317f();
    }

    /* renamed from: g */
    public boolean m136277g() {
        return this.f125606b.size() > 0;
    }
}
