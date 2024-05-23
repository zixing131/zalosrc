package p458qr;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: qr.a */
/* loaded from: classes4.dex */
public abstract class AbstractC25468a {

    /* renamed from: qr.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC25468a {

        /* renamed from: a */
        private final Exception f122048a;

        public a(Exception exc) {
            super(null);
            this.f122048a = exc;
        }

        /* renamed from: a */
        public final Exception m131934a() {
            return this.f122048a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f122048a, ((a) obj).f122048a);
        }

        public int hashCode() {
            Exception exc = this.f122048a;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f122048a + ")";
        }

        public /* synthetic */ a(Exception exc, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? null : exc);
        }
    }

    /* renamed from: qr.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC25468a {

        /* renamed from: a */
        public static final b f122049a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: qr.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC25468a {

        /* renamed from: a */
        private final Object f122050a;

        public c(Object obj) {
            super(null);
            this.f122050a = obj;
        }

        /* renamed from: a */
        public final Object m131935a() {
            return this.f122050a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC19074t.m100204b(this.f122050a, ((c) obj).f122050a);
        }

        public int hashCode() {
            Object obj = this.f122050a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f122050a + ")";
        }
    }

    private AbstractC25468a() {
    }

    public /* synthetic */ AbstractC25468a(AbstractC19060k abstractC19060k) {
        this();
    }
}
