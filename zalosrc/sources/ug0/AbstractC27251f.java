package ug0;

import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ug0.f */
/* loaded from: classes7.dex */
public abstract class AbstractC27251f {

    /* renamed from: ug0.f$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f128052a;

        static {
            int[] iArr = new int[EnumC27250e.values().length];
            try {
                iArr[EnumC27250e.f128047p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27250e.f128048q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27250e.f128049r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f128052a = iArr;
        }
    }

    /* renamed from: a */
    public static final EnumC27249d m139401a(EnumC27250e enumC27250e) {
        AbstractC19074t.m100208f(enumC27250e, "<this>");
        int i11 = a.f128052a[enumC27250e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return EnumC27249d.f128044s;
                }
                throw new NoWhenBranchMatchedException();
            }
            return EnumC27249d.f128043r;
        }
        return EnumC27249d.f128042q;
    }
}
