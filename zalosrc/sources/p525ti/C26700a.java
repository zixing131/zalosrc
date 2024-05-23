package p525ti;

import fn0.AbstractC19074t;

/* renamed from: ti.a */
/* loaded from: classes3.dex */
public final class C26700a {

    /* renamed from: a */
    private final String f126588a;

    /* renamed from: b */
    private final String f126589b;

    public C26700a(String str, String str2) {
        AbstractC19074t.m100208f(str, "modelCode");
        AbstractC19074t.m100208f(str2, "deviceName");
        this.f126588a = str;
        this.f126589b = str2;
    }

    /* renamed from: a */
    public final String m137263a() {
        return this.f126589b;
    }

    /* renamed from: b */
    public final String m137264b() {
        return this.f126588a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26700a)) {
            return false;
        }
        C26700a c26700a = (C26700a) obj;
        return AbstractC19074t.m100204b(this.f126588a, c26700a.f126588a) && AbstractC19074t.m100204b(this.f126589b, c26700a.f126589b);
    }

    public int hashCode() {
        return (this.f126588a.hashCode() * 31) + this.f126589b.hashCode();
    }

    public String toString() {
        return "DeviceInfo(modelCode=" + this.f126588a + ", deviceName=" + this.f126589b + ")";
    }
}
