package p115dy;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: dy.r */
/* loaded from: classes4.dex */
public abstract class AbstractC18114r {

    /* renamed from: dy.r$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC18114r {

        /* renamed from: a */
        private final CharSequence f91717a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CharSequence charSequence) {
            super(null);
            AbstractC19074t.m100208f(charSequence, "errorMessage");
            this.f91717a = charSequence;
        }

        /* renamed from: a */
        public final CharSequence m96406a() {
            return this.f91717a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f91717a, ((a) obj).f91717a);
        }

        public int hashCode() {
            return this.f91717a.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + ((Object) this.f91717a) + ")";
        }
    }

    /* renamed from: dy.r$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC18114r {

        /* renamed from: a */
        public static final b f91718a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: dy.r$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC18114r {

        /* renamed from: a */
        public static final c f91719a = new c();

        private c() {
            super(null);
        }
    }

    private AbstractC18114r() {
    }

    public /* synthetic */ AbstractC18114r(AbstractC19060k abstractC19060k) {
        this();
    }
}
