package p470r2;

import fn0.AbstractC19060k;

/* renamed from: r2.b */
/* loaded from: classes2.dex */
public abstract class AbstractC25616b {

    /* renamed from: r2.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC25616b {

        /* renamed from: a */
        public static final a f122468a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: r2.b$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC25616b {

        /* renamed from: a */
        private final int f122469a;

        public b(int i11) {
            super(null);
            this.f122469a = i11;
        }

        /* renamed from: a */
        public final int m132299a() {
            return this.f122469a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f122469a == ((b) obj).f122469a;
        }

        public int hashCode() {
            return this.f122469a;
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.f122469a + ')';
        }
    }

    private AbstractC25616b() {
    }

    public /* synthetic */ AbstractC25616b(AbstractC19060k abstractC19060k) {
        this();
    }
}
