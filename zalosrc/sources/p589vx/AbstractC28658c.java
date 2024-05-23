package p589vx;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: vx.c */
/* loaded from: classes4.dex */
public abstract class AbstractC28658c {

    /* renamed from: vx.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC28658c {

        /* renamed from: a */
        public static final a f132881a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: vx.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC28658c {

        /* renamed from: a */
        private final int f132882a;

        /* renamed from: b */
        private final String f132883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, String str) {
            super(null);
            AbstractC19074t.m100208f(str, "errorMessage");
            this.f132882a = i11;
            this.f132883b = str;
        }

        /* renamed from: a */
        public final int m143400a() {
            return this.f132882a;
        }

        /* renamed from: b */
        public final String m143401b() {
            return this.f132883b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f132882a == bVar.f132882a && AbstractC19074t.m100204b(this.f132883b, bVar.f132883b);
        }

        public int hashCode() {
            return (this.f132882a * 31) + this.f132883b.hashCode();
        }

        public String toString() {
            return "Error(errorCode=" + this.f132882a + ", errorMessage=" + this.f132883b + ")";
        }
    }

    /* renamed from: vx.c$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC28658c {

        /* renamed from: a */
        private final Object f132884a;

        public c(Object obj) {
            super(null);
            this.f132884a = obj;
        }

        /* renamed from: a */
        public final Object m143402a() {
            return this.f132884a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC19074t.m100204b(this.f132884a, ((c) obj).f132884a);
        }

        public int hashCode() {
            Object obj = this.f132884a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f132884a + ")";
        }
    }

    private AbstractC28658c() {
    }

    public /* synthetic */ AbstractC28658c(AbstractC19060k abstractC19060k) {
        this();
    }
}
