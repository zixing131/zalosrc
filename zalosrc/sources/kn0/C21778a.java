package kn0;

import fn0.AbstractC19074t;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import jn0.AbstractC21315a;

/* renamed from: kn0.a */
/* loaded from: classes7.dex */
public final class C21778a extends AbstractC21315a {
    @Override // jn0.AbstractC21317c
    /* renamed from: f */
    public int mo110378f(int i11, int i12) {
        return ThreadLocalRandom.current().nextInt(i11, i12);
    }

    @Override // jn0.AbstractC21317c
    /* renamed from: h */
    public long mo110379h(long j11) {
        return ThreadLocalRandom.current().nextLong(j11);
    }

    @Override // jn0.AbstractC21317c
    /* renamed from: i */
    public long mo110380i(long j11, long j12) {
        return ThreadLocalRandom.current().nextLong(j11, j12);
    }

    @Override // jn0.AbstractC21315a
    /* renamed from: j */
    public Random mo110375j() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC19074t.m100207e(current, "current(...)");
        return current;
    }
}
