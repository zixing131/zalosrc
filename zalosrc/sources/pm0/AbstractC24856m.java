package pm0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pm0.m */
/* loaded from: classes.dex */
public abstract class AbstractC24856m {

    /* renamed from: pm0.m$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f119256a;

        static {
            int[] iArr = new int[EnumC24858o.values().length];
            try {
                iArr[EnumC24858o.f119257p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24858o.f119258q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24858o.f119259r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f119256a = iArr;
        }
    }

    /* renamed from: a */
    public static InterfaceC24854k m129210a(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "initializer");
        return new C24864u(interfaceC18494a, null, 2, null);
    }

    /* renamed from: b */
    public static InterfaceC24854k m129211b(EnumC24858o enumC24858o, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(enumC24858o, "mode");
        AbstractC19074t.m100208f(interfaceC18494a, "initializer");
        int i11 = a.f119256a[enumC24858o.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return new C24850h0(interfaceC18494a);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C24863t(interfaceC18494a);
        }
        return new C24864u(interfaceC18494a, null, 2, null);
    }
}
