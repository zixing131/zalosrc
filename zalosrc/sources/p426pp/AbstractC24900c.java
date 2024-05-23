package p426pp;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: pp.c */
/* loaded from: classes4.dex */
public abstract class AbstractC24900c {

    /* renamed from: pp.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC24900c {

        /* renamed from: a */
        private final Exception f119471a;

        public a(Exception exc) {
            super(null);
            this.f119471a = exc;
        }

        /* renamed from: a */
        public final Exception m129473a() {
            return this.f119471a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f119471a, ((a) obj).f119471a);
        }

        public int hashCode() {
            Exception exc = this.f119471a;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f119471a + ")";
        }
    }

    /* renamed from: pp.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC24900c {

        /* renamed from: a */
        public static final b f119472a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: pp.c$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC24900c {

        /* renamed from: a */
        private final Object f119473a;

        public c(Object obj) {
            super(null);
            this.f119473a = obj;
        }

        /* renamed from: a */
        public final Object m129474a() {
            return this.f119473a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC19074t.m100204b(this.f119473a, ((c) obj).f119473a);
        }

        public int hashCode() {
            Object obj = this.f119473a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f119473a + ")";
        }
    }

    private AbstractC24900c() {
    }

    public /* synthetic */ AbstractC24900c(AbstractC19060k abstractC19060k) {
        this();
    }
}
