package p673y8;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y8.a */
/* loaded from: classes3.dex */
public final class C30813a extends AbstractC30830r {

    /* renamed from: a */
    private final String f142276a;

    /* renamed from: b */
    private final List f142277b;

    public C30813a(String str, List list) {
        if (str != null) {
            this.f142276a = str;
            if (list != null) {
                this.f142277b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // p673y8.AbstractC30830r
    /* renamed from: b */
    public List mo149892b() {
        return this.f142277b;
    }

    @Override // p673y8.AbstractC30830r
    /* renamed from: c */
    public String mo149893c() {
        return this.f142276a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC30830r)) {
            return false;
        }
        AbstractC30830r abstractC30830r = (AbstractC30830r) obj;
        if (this.f142276a.equals(abstractC30830r.mo149893c()) && this.f142277b.equals(abstractC30830r.mo149892b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f142276a.hashCode() ^ 1000003) * 1000003) ^ this.f142277b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f142276a + ", usedDates=" + this.f142277b + "}";
    }
}
