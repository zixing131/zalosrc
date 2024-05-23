package j20;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: j20.a */
/* loaded from: classes5.dex */
public interface InterfaceC20907a {

    /* renamed from: j20.a$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC20907a {

        /* renamed from: a */
        private final Throwable f102731a;

        public a(Throwable th2) {
            this.f102731a = th2;
        }

        /* renamed from: a */
        public final Throwable m109378a() {
            return this.f102731a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f102731a, ((a) obj).f102731a);
        }

        public int hashCode() {
            Throwable th2 = this.f102731a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f102731a + ")";
        }

        public /* synthetic */ a(Throwable th2, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? null : th2);
        }
    }

    /* renamed from: j20.a$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC20907a {

        /* renamed from: a */
        public static final b f102732a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 547228192;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* renamed from: j20.a$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC20907a {

        /* renamed from: a */
        public static final c f102733a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1064463336;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: j20.a$d */
    /* loaded from: classes5.dex */
    public static final class d implements InterfaceC20907a {

        /* renamed from: a */
        private final Object f102734a;

        public d(Object obj) {
            this.f102734a = obj;
        }

        /* renamed from: a */
        public final Object m109379a() {
            return this.f102734a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC19074t.m100204b(this.f102734a, ((d) obj).f102734a);
        }

        public int hashCode() {
            Object obj = this.f102734a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f102734a + ")";
        }
    }
}
