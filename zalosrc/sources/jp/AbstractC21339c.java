package jp;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: jp.c */
/* loaded from: classes4.dex */
public abstract class AbstractC21339c {

    /* renamed from: jp.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC21339c {

        /* renamed from: a */
        private final Exception f103938a;

        public a(Exception exc) {
            super(null);
            this.f103938a = exc;
        }

        /* renamed from: a */
        public final Exception m110543a() {
            return this.f103938a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f103938a, ((a) obj).f103938a);
        }

        public int hashCode() {
            Exception exc = this.f103938a;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f103938a + ")";
        }
    }

    /* renamed from: jp.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC21339c {

        /* renamed from: a */
        public static final b f103939a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: jp.c$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC21339c {

        /* renamed from: a */
        private final Object f103940a;

        public c(Object obj) {
            super(null);
            this.f103940a = obj;
        }

        /* renamed from: a */
        public final Object m110544a() {
            return this.f103940a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC19074t.m100204b(this.f103940a, ((c) obj).f103940a);
        }

        public int hashCode() {
            Object obj = this.f103940a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f103940a + ")";
        }
    }

    private AbstractC21339c() {
    }

    public /* synthetic */ AbstractC21339c(AbstractC19060k abstractC19060k) {
        this();
    }
}
