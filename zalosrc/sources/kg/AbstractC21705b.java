package kg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: kg.b */
/* loaded from: classes3.dex */
public abstract class AbstractC21705b {

    /* renamed from: c */
    private final AbstractC21714k f105422c;

    /* renamed from: a */
    private final Map f105420a = new HashMap();

    /* renamed from: b */
    private final Set f105421b = new CopyOnWriteArraySet();

    /* renamed from: d */
    private final CopyOnWriteArraySet f105423d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private boolean f105424e = true;

    public AbstractC21705b(AbstractC21714k abstractC21714k) {
        if (abstractC21714k != null) {
            this.f105422c = abstractC21714k;
            abstractC21714k.m112061a(this);
            return;
        }
        throw new IllegalArgumentException("springLooper is required");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m112016a(String str) {
        C21709f c21709f = (C21709f) this.f105420a.get(str);
        if (c21709f != null) {
            this.f105421b.add(c21709f);
            if (m112022g()) {
                this.f105424e = false;
                this.f105422c.mo112014b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("springId " + str + " does not reference a registered spring");
    }

    /* renamed from: b */
    public void m112017b(InterfaceC21716m interfaceC21716m) {
        if (interfaceC21716m != null) {
            this.f105423d.add(interfaceC21716m);
            return;
        }
        throw new IllegalArgumentException("newListener is required");
    }

    /* renamed from: c */
    void m112018c(double d11) {
        for (C21709f c21709f : this.f105421b) {
            if (c21709f.m112051x()) {
                c21709f.m112031b(d11 / 1000.0d);
            } else {
                this.f105421b.remove(c21709f);
            }
        }
    }

    /* renamed from: d */
    public C21709f m112019d() {
        C21709f c21709f = new C21709f(this);
        m112024i(c21709f);
        return c21709f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m112020e(C21709f c21709f) {
        if (c21709f != null) {
            this.f105421b.remove(c21709f);
            this.f105420a.remove(c21709f.m112035g());
            return;
        }
        throw new IllegalArgumentException("spring is required");
    }

    /* renamed from: f */
    public List m112021f() {
        List arrayList;
        Collection values = this.f105420a.values();
        if (values instanceof List) {
            arrayList = (List) values;
        } else {
            arrayList = new ArrayList(values);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    public boolean m112022g() {
        return this.f105424e;
    }

    /* renamed from: h */
    public void m112023h(double d11) {
        Iterator it = this.f105423d.iterator();
        while (it.hasNext()) {
            ((InterfaceC21716m) it.next()).mo65889f(this);
        }
        m112018c(d11);
        if (this.f105421b.isEmpty()) {
            this.f105424e = true;
        }
        Iterator it2 = this.f105423d.iterator();
        while (it2.hasNext()) {
            ((InterfaceC21716m) it2.next()).mo65888d(this);
        }
        if (this.f105424e) {
            this.f105422c.mo112015c();
        }
    }

    /* renamed from: i */
    void m112024i(C21709f c21709f) {
        if (c21709f != null) {
            if (!this.f105420a.containsKey(c21709f.m112035g())) {
                this.f105420a.put(c21709f.m112035g(), c21709f);
                return;
            }
            throw new IllegalArgumentException("spring is already registered");
        }
        throw new IllegalArgumentException("spring is required");
    }

    /* renamed from: j */
    public void m112025j() {
        this.f105423d.clear();
    }
}
