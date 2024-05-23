package p398oo;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: oo.b0 */
/* loaded from: classes4.dex */
public abstract class AbstractC24349b0 {

    /* renamed from: oo.b0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC24349b0 {

        /* renamed from: a */
        public static final a f117475a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: oo.b0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC24349b0 {

        /* renamed from: a */
        private final List f117476a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(null);
            AbstractC19074t.m100208f(list, "listUsers");
            this.f117476a = list;
        }

        /* renamed from: a */
        public final List m127236a() {
            return this.f117476a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f117476a, ((b) obj).f117476a);
        }

        public int hashCode() {
            return this.f117476a.hashCode();
        }

        public String toString() {
            return "Success(listUsers=" + this.f117476a + ")";
        }
    }

    private AbstractC24349b0() {
    }

    public /* synthetic */ AbstractC24349b0(AbstractC19060k abstractC19060k) {
        this();
    }
}
