package ul0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ul0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC27302a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final EnumC27303b f128523a;

    /* renamed from: ul0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m139824a(String str, StringBuilder sb2) {
            AbstractC19074t.m100208f(sb2, "result");
            if (str != null && str.length() > 0) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC27302a(EnumC27303b enumC27303b) {
        AbstractC19074t.m100208f(enumC27303b, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f128523a = enumC27303b;
    }

    /* renamed from: a */
    public abstract String mo139823a();

    public String toString() {
        return mo139823a();
    }
}
