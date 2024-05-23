package xm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: xm0.d */
/* loaded from: classes7.dex */
public final class C30168d implements Serializable {

    /* renamed from: q */
    private static final a f140175q = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: p */
    private final Class f140176p;

    /* renamed from: xm0.d$a */
    /* loaded from: classes7.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C30168d(Enum[] enumArr) {
        AbstractC19074t.m100208f(enumArr, "entries");
        Class<?> componentType = enumArr.getClass().getComponentType();
        AbstractC19074t.m100205c(componentType);
        this.f140176p = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f140176p.getEnumConstants();
        AbstractC19074t.m100207e(enumConstants, "getEnumConstants(...)");
        return AbstractC30166b.m148796a((Enum[]) enumConstants);
    }
}
