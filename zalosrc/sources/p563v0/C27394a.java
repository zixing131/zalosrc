package p563v0;

import p563v0.InterfaceC27398e;

/* renamed from: v0.a */
/* loaded from: classes2.dex */
public final class C27394a extends InterfaceC27398e.a {

    /* renamed from: a */
    private final String f129039a;

    /* renamed from: b */
    private final Class f129040b;

    /* renamed from: c */
    private final Object f129041c;

    public C27394a(String str, Class cls, Object obj) {
        if (str != null) {
            this.f129039a = str;
            if (cls != null) {
                this.f129040b = cls;
                this.f129041c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    @Override // p563v0.InterfaceC27398e.a
    /* renamed from: c */
    public String mo140353c() {
        return this.f129039a;
    }

    @Override // p563v0.InterfaceC27398e.a
    /* renamed from: d */
    public Object mo140354d() {
        return this.f129041c;
    }

    @Override // p563v0.InterfaceC27398e.a
    /* renamed from: e */
    public Class mo140355e() {
        return this.f129040b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC27398e.a)) {
            return false;
        }
        InterfaceC27398e.a aVar = (InterfaceC27398e.a) obj;
        if (this.f129039a.equals(aVar.mo140353c()) && this.f129040b.equals(aVar.mo140355e())) {
            Object obj2 = this.f129041c;
            if (obj2 == null) {
                if (aVar.mo140354d() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.mo140354d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f129039a.hashCode() ^ 1000003) * 1000003) ^ this.f129040b.hashCode()) * 1000003;
        Object obj = this.f129041c;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "Option{id=" + this.f129039a + ", valueClass=" + this.f129040b + ", token=" + this.f129041c + "}";
    }
}
