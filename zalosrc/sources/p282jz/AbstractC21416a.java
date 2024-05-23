package p282jz;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import wm0.AbstractC29094b;

/* renamed from: jz.a */
/* loaded from: classes4.dex */
public abstract class AbstractC21416a {

    /* renamed from: jz.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC21416a {

        /* renamed from: a */
        private final int f104379a;

        /* renamed from: b */
        private final String f104380b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, String str) {
            super(null);
            AbstractC19074t.m100208f(str, "errorMessage");
            this.f104379a = i11;
            this.f104380b = str;
        }

        /* renamed from: b */
        public final int m110911b() {
            return this.f104379a;
        }

        /* renamed from: c */
        public final String m110912c() {
            return this.f104380b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f104379a == aVar.f104379a && AbstractC19074t.m100204b(this.f104380b, aVar.f104380b);
        }

        public int hashCode() {
            return (this.f104379a * 31) + this.f104380b.hashCode();
        }

        public String toString() {
            return "Error(errorCode=" + this.f104379a + ", errorMessage=" + this.f104380b + ')';
        }
    }

    /* renamed from: jz.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC21416a {

        /* renamed from: a */
        private final Object f104381a;

        public b(Object obj) {
            super(null);
            this.f104381a = obj;
        }

        /* renamed from: b */
        public final Object m110913b() {
            return this.f104381a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f104381a, ((b) obj).f104381a);
        }

        public int hashCode() {
            Object obj = this.f104381a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f104381a + ')';
        }
    }

    public /* synthetic */ AbstractC21416a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final Object m110910a(InterfaceC18510q interfaceC18510q, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        if (this instanceof a) {
            a aVar = (a) this;
            return interfaceC18510q.mo45599Hr(AbstractC29094b.m145341c(aVar.m110911b()), aVar.m110912c(), continuation);
        }
        if (this instanceof b) {
            return interfaceC18509p.mo240pC(((b) this).m110913b(), continuation);
        }
        return C24848g0.f119245a;
    }

    private AbstractC21416a() {
    }
}
