package ci;

import au.EnumC2382z;
import fn0.AbstractC19074t;

/* renamed from: ci.v */
/* loaded from: classes3.dex */
public abstract class AbstractC3527v {

    /* renamed from: ci.v$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14828a;

        static {
            int[] iArr = new int[EnumC2382z.values().length];
            try {
                iArr[EnumC2382z.f9945r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2382z.f9947t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2382z.f9946s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14828a = iArr;
        }
    }

    /* renamed from: a */
    public static final int m17873a(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        int i11 = a.f14828a[enumC2382z.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return 4;
            }
            return 0;
        }
        return 8;
    }
}
