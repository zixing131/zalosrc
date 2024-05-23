package b00;

import a00.AbstractC0019d;
import a00.C0018c;
import a00.InterfaceC0017b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: b00.b */
/* loaded from: classes4.dex */
public class C2479b extends AbstractC0019d implements Cloneable {

    /* renamed from: q */
    private final List f10100q;

    /* renamed from: r */
    private boolean f10101r;

    public C2479b() {
        this(false);
    }

    /* renamed from: e */
    public void m12506e(C2479b c2479b) {
        m12507g(c2479b, true);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C2479b) && m12512n((C2479b) obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m12507g(C2479b c2479b, boolean z11) {
        if (!z11) {
            this.f10100q.add(c2479b);
        } else if (this.f34p.size() == 0) {
            this.f34p.addAll(c2479b.f34p);
            this.f10101r = c2479b.f10101r;
        } else {
            m12507g(c2479b, false);
        }
    }

    public int hashCode() {
        int i11;
        int hashCode = this.f34p.hashCode();
        if (m12515s()) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        return hashCode * i11;
    }

    public boolean isEmpty() {
        if (this.f34p.isEmpty() && this.f10100q.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public double m12508j() {
        return Math.abs(m12509k());
    }

    /* renamed from: k */
    public double m12509k() {
        boolean m12513p = m12513p();
        if (!m12513p) {
            m12511m();
        }
        double d11 = 0.0d;
        int i11 = 0;
        while (i11 < this.f34p.size() - 1) {
            float x11 = ((InterfaceC0017b) this.f34p.get(i11)).getX();
            float y11 = ((InterfaceC0017b) this.f34p.get(i11)).getY();
            i11++;
            d11 += (x11 * ((InterfaceC0017b) this.f34p.get(i11)).getY()) - (((InterfaceC0017b) this.f34p.get(i11)).getX() * y11);
        }
        if (!m12513p) {
            m12516u();
        }
        return d11 * 0.5d;
    }

    /* renamed from: l */
    public C2479b clone() {
        C2479b c2479b = new C2479b();
        c2479b.m12517v(this.f10101r);
        Iterator it = this.f34p.iterator();
        while (it.hasNext()) {
            c2479b.f34p.add(((InterfaceC0017b) it.next()).mo31a());
        }
        Iterator it2 = this.f10100q.iterator();
        while (it2.hasNext()) {
            c2479b.m12506e(((C2479b) it2.next()).clone());
        }
        return c2479b;
    }

    /* renamed from: m */
    public void m12511m() {
        if (!m12513p() && this.f34p.size() > 0) {
            List list = this.f34p;
            list.add((InterfaceC0017b) list.get(0));
        }
    }

    /* renamed from: n */
    public boolean m12512n(C2479b c2479b) {
        if (m12515s() != c2479b.m12515s() || this.f34p.size() != c2479b.f34p.size()) {
            return false;
        }
        if (isEmpty() && c2479b.isEmpty()) {
            return true;
        }
        int indexOf = this.f34p.indexOf(c2479b.f34p.get(0));
        if (indexOf == -1) {
            return false;
        }
        int size = this.f34p.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!((InterfaceC0017b) c2479b.f34p.get(i11)).equals(this.f34p.get((i11 + indexOf) % size))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public boolean m12513p() {
        if (this.f34p.size() <= 0) {
            return false;
        }
        float x11 = ((InterfaceC0017b) this.f34p.get(0)).getX();
        List list = this.f34p;
        if (x11 != ((InterfaceC0017b) list.get(list.size() - 1)).getX()) {
            return false;
        }
        float y11 = ((InterfaceC0017b) this.f34p.get(0)).getY();
        List list2 = this.f34p;
        if (y11 != ((InterfaceC0017b) list2.get(list2.size() - 1)).getY()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public boolean m12514r() {
        boolean m12513p = m12513p();
        if (m12513p) {
            m12516u();
        }
        int size = size();
        if (size < 3) {
            return false;
        }
        int i11 = 0;
        float f11 = 0.0f;
        while (i11 < size) {
            InterfaceC0017b interfaceC0017b = (InterfaceC0017b) this.f34p.get(i11);
            int i12 = i11 + 1;
            InterfaceC0017b interfaceC0017b2 = (InterfaceC0017b) this.f34p.get(i12 % size);
            C0018c c0018c = new C0018c();
            c0018c.f32p = interfaceC0017b2.getX() - interfaceC0017b.getX();
            c0018c.f33q = interfaceC0017b2.getY() - interfaceC0017b.getY();
            InterfaceC0017b interfaceC0017b3 = (InterfaceC0017b) this.f34p.get((i11 + 2) % size);
            if (i11 == 0) {
                float x11 = interfaceC0017b3.getX() * c0018c.f33q;
                float y11 = interfaceC0017b3.getY();
                float f12 = c0018c.f32p;
                f11 = ((x11 - (y11 * f12)) + (f12 * interfaceC0017b.getY())) - (c0018c.f33q * interfaceC0017b.getX());
            } else {
                float x12 = interfaceC0017b3.getX() * c0018c.f33q;
                float y12 = interfaceC0017b3.getY();
                float f13 = c0018c.f32p;
                float y13 = ((x12 - (y12 * f13)) + (f13 * interfaceC0017b.getY())) - (c0018c.f33q * interfaceC0017b.getX());
                if ((y13 > 0.0f && f11 < 0.0f) || (y13 < 0.0f && f11 > 0.0f)) {
                    return false;
                }
            }
            i11 = i12;
        }
        if (m12513p) {
            m12511m();
            return true;
        }
        return true;
    }

    /* renamed from: s */
    public boolean m12515s() {
        return this.f10101r;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (m12515s()) {
            sb2.append("H");
        }
        if (this.f34p.size() < 10) {
            sb2.append(this.f34p.toString());
        } else {
            sb2.append(this.f34p.subList(0, 5).toString());
            sb2.append("...");
            List list = this.f34p;
            sb2.append(list.subList(list.size() - 5, this.f34p.size()).toString());
        }
        if (this.f10100q.size() > 0) {
            sb2.append("\n    - ");
            sb2.append(this.f10100q.size());
            sb2.append(" inner polygons:");
            for (C2479b c2479b : this.f10100q) {
                sb2.append("\n       + ");
                sb2.append(c2479b.toString());
            }
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public void m12516u() {
        if (m12513p() && this.f34p.size() > 1) {
            List list = this.f34p;
            list.remove(list.size() - 1);
        }
    }

    /* renamed from: v */
    public void m12517v(boolean z11) {
        this.f10101r = z11;
    }

    public C2479b(boolean z11) {
        super(new InterfaceC0017b[0]);
        this.f10100q = new ArrayList();
        this.f10101r = z11;
    }

    public C2479b(Collection collection) {
        this(collection, false);
    }

    public C2479b(Collection collection, boolean z11) {
        super(collection, z11);
        this.f10100q = new ArrayList();
        this.f10101r = false;
    }
}
