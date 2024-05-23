package p398oo;

import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import p398oo.C24377r;

/* renamed from: oo.f */
/* loaded from: classes4.dex */
public abstract class AbstractC24356f {

    /* renamed from: oo.f$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f117574a;

        static {
            int[] iArr = new int[C24377r.b.values().length];
            try {
                iArr[C24377r.b.f117732q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C24377r.b.f117731p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C24377r.b.f117733r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f117574a = iArr;
        }
    }

    /* renamed from: a */
    public static final int m127365a(C24377r.b bVar) {
        AbstractC19074t.m100208f(bVar, "<this>");
        int i11 = a.f117574a[bVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            if (i11 == 3) {
                return 2;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }
}
