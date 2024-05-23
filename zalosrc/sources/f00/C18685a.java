package f00;

import a00.InterfaceC0017b;
import i00.C20180c;
import k00.AbstractC21425b;

/* renamed from: f00.a */
/* loaded from: classes4.dex */
public class C18685a implements InterfaceC0017b, Cloneable {

    /* renamed from: p */
    public int f93908p;

    /* renamed from: q */
    public int f93909q;

    public C18685a(int i11, int i12) {
        this.f93908p = i11;
        this.f93909q = i12;
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: b */
    public void mo32b(float f11) {
        this.f93909q = Math.round(f11);
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: e */
    public void mo34e(float f11) {
        this.f93908p = Math.round(f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18685a)) {
            return false;
        }
        C18685a c18685a = (C18685a) obj;
        if (c18685a.f93908p == this.f93908p && c18685a.f93909q == this.f93909q) {
            return true;
        }
        return false;
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: f */
    public boolean mo35f(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18685a)) {
            return false;
        }
        C18685a c18685a = (C18685a) obj;
        if (AbstractC21425b.m110929a(c18685a.f93908p, this.f93908p, 0.001f) && AbstractC21425b.m110929a(c18685a.f93909q, this.f93909q, 0.001f)) {
            return true;
        }
        return false;
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: g */
    public void mo36g(InterfaceC0017b interfaceC0017b) {
        mo34e(interfaceC0017b.getX());
        mo32b(interfaceC0017b.getY());
    }

    @Override // a00.InterfaceC0017b
    public float getX() {
        return this.f93908p;
    }

    @Override // a00.InterfaceC0017b
    public float getY() {
        return this.f93909q;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C18685a clone() {
        return new C18685a(this.f93908p, this.f93909q);
    }

    public int hashCode() {
        return ((527 + this.f93908p) * 31) + this.f93909q;
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C18685a mo31a() {
        return clone();
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C18685a mo33c(C20180c c20180c) {
        if (c20180c.m105275k() == 3) {
            float m105268c = (((float) c20180c.m105268c(0, 0)) * getX()) + (((float) c20180c.m105268c(0, 1)) * getY()) + ((float) c20180c.m105268c(0, 2));
            float m105268c2 = (((float) c20180c.m105268c(1, 0)) * getX()) + (((float) c20180c.m105268c(1, 1)) * getY()) + ((float) c20180c.m105268c(1, 2));
            float m105268c3 = (((float) c20180c.m105268c(2, 0)) * getX()) + (((float) c20180c.m105268c(2, 1)) * getY()) + ((float) c20180c.m105268c(2, 2));
            return new C18685a(Math.round(m105268c / m105268c3), Math.round(m105268c2 / m105268c3));
        }
        if (c20180c.m105275k() == 2) {
            return new C18685a(Math.round((((float) c20180c.m105268c(0, 0)) * getX()) + (((float) c20180c.m105268c(0, 1)) * getY())), Math.round((((float) c20180c.m105268c(1, 0)) * getX()) + (((float) c20180c.m105268c(1, 1)) * getY())));
        }
        throw new IllegalArgumentException("Transform matrix has unexpected size");
    }

    public String toString() {
        return "(" + this.f93908p + ", " + this.f93909q + ")";
    }
}
