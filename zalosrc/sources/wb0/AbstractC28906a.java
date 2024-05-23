package wb0;

import fn0.AbstractC19060k;

/* renamed from: wb0.a */
/* loaded from: classes6.dex */
public abstract class AbstractC28906a {

    /* renamed from: wb0.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC28906a {

        /* renamed from: a */
        public static final a f133826a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: wb0.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC28906a {

        /* renamed from: a */
        private final int f133827a;

        public b(int i11) {
            super(null);
            this.f133827a = i11;
        }

        /* renamed from: a */
        public final int m144405a() {
            return this.f133827a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f133827a == ((b) obj).f133827a;
        }

        public int hashCode() {
            return this.f133827a;
        }

        public String toString() {
            return "ShowToast(toastId=" + this.f133827a + ")";
        }
    }

    private AbstractC28906a() {
    }

    public /* synthetic */ AbstractC28906a(AbstractC19060k abstractC19060k) {
        this();
    }
}
