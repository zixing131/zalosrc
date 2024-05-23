package a00;

import i00.C20180c;
import k00.AbstractC21425b;

/* renamed from: a00.c */
/* loaded from: classes4.dex */
public class C0018c implements InterfaceC0017b, Cloneable {

    /* renamed from: p */
    public float f32p;

    /* renamed from: q */
    public float f33q;

    public C0018c(float f11, float f12) {
        this.f32p = f11;
        this.f33q = f12;
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: b */
    public void mo32b(float f11) {
        this.f33q = f11;
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: e */
    public void mo34e(float f11) {
        this.f32p = f11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC0017b)) {
            return false;
        }
        InterfaceC0017b interfaceC0017b = (InterfaceC0017b) obj;
        if (interfaceC0017b.getX() != this.f32p || interfaceC0017b.getY() != this.f33q) {
            return false;
        }
        return true;
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: f */
    public boolean mo35f(Object obj) {
        if (!(obj instanceof InterfaceC0017b)) {
            return false;
        }
        InterfaceC0017b interfaceC0017b = (InterfaceC0017b) obj;
        if (!AbstractC21425b.m110929a(interfaceC0017b.getX(), this.f32p, 0.001f) || !AbstractC21425b.m110929a(interfaceC0017b.getY(), this.f33q, 0.001f)) {
            return false;
        }
        return true;
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: g */
    public void mo36g(InterfaceC0017b interfaceC0017b) {
        this.f32p = interfaceC0017b.getX();
        this.f33q = interfaceC0017b.getY();
    }

    @Override // a00.InterfaceC0017b
    public float getX() {
        return this.f32p;
    }

    @Override // a00.InterfaceC0017b
    public float getY() {
        return this.f33q;
    }

    /* renamed from: h */
    public C0018c clone() {
        try {
            return (C0018c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("Can't happen. If not, ask TamDH2");
        }
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: i */
    public C0018c mo31a() {
        return clone();
    }

    @Override // a00.InterfaceC0017b
    /* renamed from: j */
    public C0018c mo33c(C20180c c20180c) {
        if (c20180c.m105275k() == 3) {
            float m105268c = (((float) c20180c.m105268c(0, 0)) * getX()) + (((float) c20180c.m105268c(0, 1)) * getY()) + ((float) c20180c.m105268c(0, 2));
            float m105268c2 = (((float) c20180c.m105268c(1, 0)) * getX()) + (((float) c20180c.m105268c(1, 1)) * getY()) + ((float) c20180c.m105268c(1, 2));
            float m105268c3 = (((float) c20180c.m105268c(2, 0)) * getX()) + (((float) c20180c.m105268c(2, 1)) * getY()) + ((float) c20180c.m105268c(2, 2));
            return new C0018c(m105268c / m105268c3, m105268c2 / m105268c3);
        }
        if (c20180c.m105275k() == 2 && c20180c.m105271g() == 2) {
            return new C0018c((((float) c20180c.m105268c(0, 0)) * getX()) + (((float) c20180c.m105268c(0, 1)) * getY()), (((float) c20180c.m105268c(1, 0)) * getX()) + (((float) c20180c.m105268c(1, 1)) * getY()));
        }
        if (c20180c.m105275k() == 2 && c20180c.m105271g() == 3) {
            return new C0018c((((float) c20180c.m105268c(0, 0)) * getX()) + (((float) c20180c.m105268c(0, 1)) * getY()) + ((float) c20180c.m105268c(0, 2)), (((float) c20180c.m105268c(1, 0)) * getX()) + (((float) c20180c.m105268c(1, 1)) * getY()) + ((float) c20180c.m105268c(1, 2)));
        }
        throw new IllegalArgumentException("Transform matrix has unexpected size");
    }

    public String toString() {
        return "(" + this.f32p + "," + this.f33q + ")";
    }

    public C0018c(InterfaceC0017b interfaceC0017b) {
        mo36g(interfaceC0017b);
    }

    public C0018c() {
    }

    public C0018c(double d11, double d12) {
        this.f32p = (float) d11;
        this.f33q = (float) d12;
    }
}
