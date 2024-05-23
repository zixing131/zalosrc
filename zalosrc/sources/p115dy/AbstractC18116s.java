package p115dy;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: dy.s */
/* loaded from: classes4.dex */
public abstract class AbstractC18116s {

    /* renamed from: dy.s$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC18116s {

        /* renamed from: a */
        private final CharSequence f91722a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CharSequence charSequence) {
            super(null);
            AbstractC19074t.m100208f(charSequence, "errorMessage");
            this.f91722a = charSequence;
        }

        /* renamed from: a */
        public final CharSequence m96407a() {
            return this.f91722a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f91722a, ((a) obj).f91722a);
        }

        public int hashCode() {
            return this.f91722a.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + ((Object) this.f91722a) + ")";
        }
    }

    /* renamed from: dy.s$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC18116s {

        /* renamed from: a */
        public static final b f91723a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: dy.s$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC18116s {

        /* renamed from: a */
        public static final c f91724a = new c();

        private c() {
            super(null);
        }
    }

    private AbstractC18116s() {
    }

    public /* synthetic */ AbstractC18116s(AbstractC19060k abstractC19060k) {
        this();
    }
}
