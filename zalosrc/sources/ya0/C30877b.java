package ya0;

import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;

/* renamed from: ya0.b */
/* loaded from: classes6.dex */
public final class C30877b {

    /* renamed from: a */
    private List f142458a;

    /* renamed from: b */
    private long f142459b;

    public C30877b(List list) {
        AbstractC19074t.m100208f(list, "entries");
        this.f142458a = list;
        Iterator it = list.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += ((C30876a) it.next()).m150084e();
        }
        this.f142459b = j11;
    }

    /* renamed from: a */
    public final List m150087a() {
        return this.f142458a;
    }

    /* renamed from: b */
    public final long m150088b() {
        return this.f142459b;
    }
}
