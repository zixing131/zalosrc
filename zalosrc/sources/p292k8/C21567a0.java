package p292k8;

import p292k8.AbstractC21573d0;

/* renamed from: k8.a0 */
/* loaded from: classes.dex */
public final class C21567a0 extends AbstractC21573d0.c {

    /* renamed from: a */
    private final String f104721a;

    /* renamed from: b */
    private final String f104722b;

    /* renamed from: c */
    private final boolean f104723c;

    public C21567a0(String str, String str2, boolean z11) {
        if (str != null) {
            this.f104721a = str;
            if (str2 != null) {
                this.f104722b = str2;
                this.f104723c = z11;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // p292k8.AbstractC21573d0.c
    /* renamed from: b */
    public boolean mo111234b() {
        return this.f104723c;
    }

    @Override // p292k8.AbstractC21573d0.c
    /* renamed from: c */
    public String mo111235c() {
        return this.f104722b;
    }

    @Override // p292k8.AbstractC21573d0.c
    /* renamed from: d */
    public String mo111236d() {
        return this.f104721a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21573d0.c)) {
            return false;
        }
        AbstractC21573d0.c cVar = (AbstractC21573d0.c) obj;
        if (this.f104721a.equals(cVar.mo111236d()) && this.f104722b.equals(cVar.mo111235c()) && this.f104723c == cVar.mo111234b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i11;
        int hashCode = (((this.f104721a.hashCode() ^ 1000003) * 1000003) ^ this.f104722b.hashCode()) * 1000003;
        if (this.f104723c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return hashCode ^ i11;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f104721a + ", osCodeName=" + this.f104722b + ", isRooted=" + this.f104723c + "}";
    }
}
