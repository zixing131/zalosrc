package p137eo;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: eo.l */
/* loaded from: classes4.dex */
public final class C18528l implements InterfaceC18527k {

    /* renamed from: a */
    private final String f93201a;

    /* renamed from: b */
    private final long f93202b;

    /* renamed from: c */
    private final int f93203c;

    public C18528l(String str, long j11, int i11) {
        AbstractC19074t.m100208f(str, "viewerId");
        this.f93201a = str;
        this.f93202b = j11;
        this.f93203c = i11;
    }

    @Override // p137eo.InterfaceC18527k
    /* renamed from: a */
    public long mo97914a() {
        return this.f93202b;
    }

    @Override // p137eo.InterfaceC18527k
    /* renamed from: b */
    public String mo97915b() {
        return this.f93201a;
    }

    @Override // p137eo.InterfaceC18527k
    /* renamed from: c */
    public int mo97916c() {
        return this.f93203c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18528l)) {
            return false;
        }
        C18528l c18528l = (C18528l) obj;
        return AbstractC19074t.m100204b(this.f93201a, c18528l.f93201a) && this.f93202b == c18528l.f93202b && this.f93203c == c18528l.f93203c;
    }

    public int hashCode() {
        return (((this.f93201a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f93202b)) * 31) + this.f93203c;
    }

    public String toString() {
        return "StateDeleteAlbum(viewerId=" + this.f93201a + ", albumId=" + this.f93202b + ", albumType=" + this.f93203c + ")";
    }
}
