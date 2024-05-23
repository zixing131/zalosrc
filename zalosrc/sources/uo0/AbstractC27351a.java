package uo0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: uo0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC27351a {

    /* renamed from: uo0.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC27351a {

        /* renamed from: a */
        private final int f128637a;

        public a(int i11) {
            super(null);
            this.f128637a = i11;
        }

        /* renamed from: a */
        public final int m139960a() {
            return this.f128637a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f128637a == ((a) obj).f128637a;
        }

        public int hashCode() {
            return this.f128637a;
        }

        public String toString() {
            return "ERROR(errorCode=" + this.f128637a + ")";
        }
    }

    /* renamed from: uo0.a$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC27351a {

        /* renamed from: a */
        public static final b f128638a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: uo0.a$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC27351a {

        /* renamed from: a */
        private final List f128639a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(null);
            AbstractC19074t.m100208f(list, "stickers");
            this.f128639a = list;
        }

        /* renamed from: a */
        public final List m139961a() {
            return this.f128639a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC19074t.m100204b(this.f128639a, ((c) obj).f128639a);
        }

        public int hashCode() {
            return this.f128639a.hashCode();
        }

        public String toString() {
            return "SUCCESS(stickers=" + this.f128639a + ")";
        }
    }

    private AbstractC27351a() {
    }

    public /* synthetic */ AbstractC27351a(AbstractC19060k abstractC19060k) {
        this();
    }
}
