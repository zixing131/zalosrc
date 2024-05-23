package s20;

import fn0.AbstractC19074t;
import java.util.Random;

/* renamed from: s20.i */
/* loaded from: classes5.dex */
public abstract class AbstractC26107i {
    /* renamed from: a */
    public static final int m134355a(Random random, int i11, int i12) {
        AbstractC19074t.m100208f(random, "<this>");
        if (i11 < i12) {
            return i11 + random.nextInt(i12 - i11);
        }
        throw new IllegalArgumentException("Lower bound MUST be less than Upper bound".toString());
    }
}
