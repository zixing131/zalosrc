package ep0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ko0.C21791f;

/* renamed from: ep0.r */
/* loaded from: classes7.dex */
public class C18558r {

    /* renamed from: a */
    private final HashSet f93273a = new HashSet();

    /* renamed from: b */
    private final ArrayList f93274b = new ArrayList();

    /* renamed from: a */
    public void m97970a(C21791f c21791f) {
        if (c21791f != null && !this.f93273a.contains(Integer.valueOf(c21791f.m112477l()))) {
            this.f93273a.add(Integer.valueOf(c21791f.m112477l()));
            this.f93274b.add(c21791f);
        }
    }

    /* renamed from: b */
    public void m97971b() {
        this.f93273a.clear();
        this.f93274b.clear();
    }

    /* renamed from: c */
    public boolean m97972c(int i11) {
        return this.f93273a.contains(Integer.valueOf(i11));
    }

    /* renamed from: d */
    public boolean m97973d(C21791f c21791f) {
        if (c21791f == null) {
            return false;
        }
        return this.f93273a.contains(Integer.valueOf(c21791f.m112477l()));
    }

    /* renamed from: e */
    public C21791f m97974e(int i11) {
        return (C21791f) this.f93274b.get(i11);
    }

    /* renamed from: f */
    public ArrayList m97975f() {
        return this.f93274b;
    }

    /* renamed from: g */
    public C21791f m97976g(int i11) {
        Iterator it = this.f93274b.iterator();
        while (it.hasNext()) {
            C21791f c21791f = (C21791f) it.next();
            if (i11 == c21791f.m112477l()) {
                return c21791f;
            }
        }
        return null;
    }

    /* renamed from: h */
    public HashSet m97977h() {
        return this.f93273a;
    }

    /* renamed from: i */
    public void m97978i(C21791f c21791f) {
        if (c21791f != null && this.f93273a.contains(Integer.valueOf(c21791f.m112477l()))) {
            this.f93273a.remove(Integer.valueOf(c21791f.m112477l()));
            this.f93274b.remove(c21791f);
        }
    }

    /* renamed from: j */
    public void m97979j(C21791f c21791f, C21791f c21791f2) {
        int indexOf = this.f93274b.indexOf(c21791f);
        if (c21791f2.m112477l() == c21791f.m112477l()) {
            this.f93274b.set(indexOf, c21791f2);
            return;
        }
        this.f93274b.remove(c21791f);
        this.f93274b.remove(c21791f2);
        if (indexOf >= this.f93274b.size()) {
            this.f93274b.add(c21791f2);
        } else {
            this.f93274b.add(indexOf, c21791f2);
        }
        this.f93273a.remove(Integer.valueOf(c21791f.m112477l()));
        this.f93273a.add(Integer.valueOf(c21791f2.m112477l()));
    }

    /* renamed from: k */
    public int m97980k() {
        return this.f93274b.size();
    }

    /* renamed from: l */
    public void m97981l(C21791f c21791f, C21791f c21791f2) {
        if (this.f93273a.contains(Integer.valueOf(c21791f.m112477l())) && this.f93273a.contains(Integer.valueOf(c21791f2.m112477l()))) {
            int indexOf = this.f93274b.indexOf(c21791f);
            int indexOf2 = this.f93274b.indexOf(c21791f2);
            this.f93274b.set(indexOf, c21791f2);
            this.f93274b.set(indexOf2, c21791f);
        }
    }
}
