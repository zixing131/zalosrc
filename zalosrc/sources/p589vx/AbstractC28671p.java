package p589vx;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: vx.p */
/* loaded from: classes4.dex */
public abstract class AbstractC28671p {

    /* renamed from: vx.p$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC28671p {

        /* renamed from: a */
        private final int f133081a;

        /* renamed from: b */
        private final String f133082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, String str) {
            super(null);
            AbstractC19074t.m100208f(str, "errorMessage");
            this.f133081a = i11;
            this.f133082b = str;
        }

        /* renamed from: a */
        public final String m143579a() {
            return this.f133082b;
        }

        /* renamed from: b */
        public final boolean m143580b() {
            if (this.f133081a == AbstractC28665j.m143425a().m104491c()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean m143581c() {
            if (this.f133081a == AbstractC28665j.m143427c().m104491c()) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f133081a == aVar.f133081a && AbstractC19074t.m100204b(this.f133082b, aVar.f133082b);
        }

        public int hashCode() {
            return (this.f133081a * 31) + this.f133082b.hashCode();
        }

        public String toString() {
            return "Error(errorCode=" + this.f133081a + ", errorMessage=" + this.f133082b + ")";
        }
    }

    /* renamed from: vx.p$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC28671p {

        /* renamed from: a */
        private final Object f133083a;

        public b(Object obj) {
            super(null);
            this.f133083a = obj;
        }

        /* renamed from: a */
        public final Object m143582a() {
            return this.f133083a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f133083a, ((b) obj).f133083a);
        }

        public int hashCode() {
            Object obj = this.f133083a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f133083a + ")";
        }
    }

    private AbstractC28671p() {
    }

    public /* synthetic */ AbstractC28671p(AbstractC19060k abstractC19060k) {
        this();
    }
}
