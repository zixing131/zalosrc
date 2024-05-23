package jn0;

import java.util.Random;

/* renamed from: jn0.a */
/* loaded from: classes.dex */
public abstract class AbstractC21315a extends AbstractC21317c {
    @Override // jn0.AbstractC21317c
    /* renamed from: b */
    public int mo110370b(int i11) {
        return AbstractC21318d.m110387g(mo110375j().nextInt(), i11);
    }

    @Override // jn0.AbstractC21317c
    /* renamed from: c */
    public float mo110371c() {
        return mo110375j().nextFloat();
    }

    @Override // jn0.AbstractC21317c
    /* renamed from: d */
    public int mo110372d() {
        return mo110375j().nextInt();
    }

    @Override // jn0.AbstractC21317c
    /* renamed from: e */
    public int mo110373e(int i11) {
        return mo110375j().nextInt(i11);
    }

    @Override // jn0.AbstractC21317c
    /* renamed from: g */
    public long mo110374g() {
        return mo110375j().nextLong();
    }

    /* renamed from: j */
    public abstract Random mo110375j();
}
