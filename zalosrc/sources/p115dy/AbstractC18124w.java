package p115dy;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: dy.w */
/* loaded from: classes4.dex */
public abstract class AbstractC18124w {

    /* renamed from: dy.w$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC18124w {

        /* renamed from: a */
        private final CharSequence f91750a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CharSequence charSequence) {
            super(null);
            AbstractC19074t.m100208f(charSequence, "errorMessage");
            this.f91750a = charSequence;
        }

        /* renamed from: a */
        public final CharSequence m96411a() {
            return this.f91750a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f91750a, ((a) obj).f91750a);
        }

        public int hashCode() {
            return this.f91750a.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + ((Object) this.f91750a) + ")";
        }
    }

    /* renamed from: dy.w$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC18124w {

        /* renamed from: a */
        public static final b f91751a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: dy.w$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC18124w {

        /* renamed from: a */
        public static final c f91752a = new c();

        private c() {
            super(null);
        }
    }

    private AbstractC18124w() {
    }

    public /* synthetic */ AbstractC18124w(AbstractC19060k abstractC19060k) {
        this();
    }
}
