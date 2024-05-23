package p455qo;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: qo.o */
/* loaded from: classes4.dex */
public abstract class AbstractC25425o {

    /* renamed from: qo.o$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC25425o {

        /* renamed from: a */
        private final Exception f121724a;

        public a(Exception exc) {
            super(null);
            this.f121724a = exc;
        }

        /* renamed from: a */
        public final Exception m131705a() {
            return this.f121724a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121724a, ((a) obj).f121724a);
        }

        public int hashCode() {
            Exception exc = this.f121724a;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f121724a + ")";
        }
    }

    /* renamed from: qo.o$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC25425o {

        /* renamed from: a */
        public static final b f121725a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: qo.o$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC25425o {

        /* renamed from: a */
        public static final c f121726a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: qo.o$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC25425o {

        /* renamed from: a */
        public static final d f121727a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: qo.o$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC25425o {

        /* renamed from: a */
        public static final e f121728a = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: qo.o$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC25425o {

        /* renamed from: a */
        public static final f f121729a = new f();

        private f() {
            super(null);
        }
    }

    private AbstractC25425o() {
    }

    public /* synthetic */ AbstractC25425o(AbstractC19060k abstractC19060k) {
        this();
    }
}
