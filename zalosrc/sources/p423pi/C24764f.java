package p423pi;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: pi.f */
/* loaded from: classes3.dex */
public final class C24764f {

    /* renamed from: a */
    private final String f118945a;

    /* renamed from: b */
    private final int f118946b;

    /* renamed from: c */
    private final String f118947c;

    /* renamed from: d */
    private final List f118948d;

    public C24764f(String str, int i11, String str2, List list) {
        AbstractC19074t.m100208f(str, "threadType");
        AbstractC19074t.m100208f(str2, "rqcData");
        this.f118945a = str;
        this.f118946b = i11;
        this.f118947c = str2;
        this.f118948d = list;
    }

    /* renamed from: a */
    public final List m128727a() {
        return this.f118948d;
    }

    /* renamed from: b */
    public final String m128728b() {
        return this.f118947c;
    }

    /* renamed from: c */
    public final int m128729c() {
        return this.f118946b;
    }

    /* renamed from: d */
    public final String m128730d() {
        return this.f118945a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24764f)) {
            return false;
        }
        C24764f c24764f = (C24764f) obj;
        return AbstractC19074t.m100204b(this.f118945a, c24764f.f118945a) && this.f118946b == c24764f.f118946b && AbstractC19074t.m100204b(this.f118947c, c24764f.f118947c) && AbstractC19074t.m100204b(this.f118948d, c24764f.f118948d);
    }

    public int hashCode() {
        int hashCode = ((((this.f118945a.hashCode() * 31) + this.f118946b) * 31) + this.f118947c.hashCode()) * 31;
        List list = this.f118948d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "ThreadInfoDownloadMediaLogEntity(threadType=" + this.f118945a + ", threadSize=" + this.f118946b + ", rqcData=" + this.f118947c + ", msgLogList=" + this.f118948d + ")";
    }
}
