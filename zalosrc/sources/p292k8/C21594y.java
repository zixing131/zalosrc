package p292k8;

import p153f8.C18820e;
import p292k8.AbstractC21573d0;

/* renamed from: k8.y */
/* loaded from: classes.dex */
public final class C21594y extends AbstractC21573d0.a {

    /* renamed from: a */
    private final String f104929a;

    /* renamed from: b */
    private final String f104930b;

    /* renamed from: c */
    private final String f104931c;

    /* renamed from: d */
    private final String f104932d;

    /* renamed from: e */
    private final int f104933e;

    /* renamed from: f */
    private final C18820e f104934f;

    public C21594y(String str, String str2, String str3, String str4, int i11, C18820e c18820e) {
        if (str != null) {
            this.f104929a = str;
            if (str2 != null) {
                this.f104930b = str2;
                if (str3 != null) {
                    this.f104931c = str3;
                    if (str4 != null) {
                        this.f104932d = str4;
                        this.f104933e = i11;
                        if (c18820e != null) {
                            this.f104934f = c18820e;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // p292k8.AbstractC21573d0.a
    /* renamed from: a */
    public String mo111502a() {
        return this.f104929a;
    }

    @Override // p292k8.AbstractC21573d0.a
    /* renamed from: c */
    public int mo111503c() {
        return this.f104933e;
    }

    @Override // p292k8.AbstractC21573d0.a
    /* renamed from: d */
    public C18820e mo111504d() {
        return this.f104934f;
    }

    @Override // p292k8.AbstractC21573d0.a
    /* renamed from: e */
    public String mo111505e() {
        return this.f104932d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21573d0.a)) {
            return false;
        }
        AbstractC21573d0.a aVar = (AbstractC21573d0.a) obj;
        if (this.f104929a.equals(aVar.mo111502a()) && this.f104930b.equals(aVar.mo111506f()) && this.f104931c.equals(aVar.mo111507g()) && this.f104932d.equals(aVar.mo111505e()) && this.f104933e == aVar.mo111503c() && this.f104934f.equals(aVar.mo111504d())) {
            return true;
        }
        return false;
    }

    @Override // p292k8.AbstractC21573d0.a
    /* renamed from: f */
    public String mo111506f() {
        return this.f104930b;
    }

    @Override // p292k8.AbstractC21573d0.a
    /* renamed from: g */
    public String mo111507g() {
        return this.f104931c;
    }

    public int hashCode() {
        return ((((((((((this.f104929a.hashCode() ^ 1000003) * 1000003) ^ this.f104930b.hashCode()) * 1000003) ^ this.f104931c.hashCode()) * 1000003) ^ this.f104932d.hashCode()) * 1000003) ^ this.f104933e) * 1000003) ^ this.f104934f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f104929a + ", versionCode=" + this.f104930b + ", versionName=" + this.f104931c + ", installUuid=" + this.f104932d + ", deliveryMechanism=" + this.f104933e + ", developmentPlatformProvider=" + this.f104934f + "}";
    }
}
