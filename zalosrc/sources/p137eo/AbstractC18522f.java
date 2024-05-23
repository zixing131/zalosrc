package p137eo;

import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: eo.f */
/* loaded from: classes4.dex */
public abstract class AbstractC18522f {

    /* renamed from: eo.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC18522f {

        /* renamed from: a */
        private final Object f93157a;

        public a(Object obj) {
            super(null);
            this.f93157a = obj;
        }

        /* renamed from: b */
        public final Object m97905b() {
            return this.f93157a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f93157a, ((a) obj).f93157a);
        }

        public int hashCode() {
            Object obj = this.f93157a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f93157a + ")";
        }
    }

    /* renamed from: eo.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC18522f {

        /* renamed from: a */
        private final Object f93158a;

        public b(Object obj) {
            super(null);
            this.f93158a = obj;
        }

        /* renamed from: b */
        public final Object m97906b() {
            return this.f93158a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f93158a, ((b) obj).f93158a);
        }

        public int hashCode() {
            Object obj = this.f93158a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f93158a + ")";
        }
    }

    private AbstractC18522f() {
    }

    public /* synthetic */ AbstractC18522f(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final Object m97904a(InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2) {
        AbstractC19074t.m100208f(interfaceC18505l, "onError");
        AbstractC19074t.m100208f(interfaceC18505l2, "onSuccess");
        if (this instanceof a) {
            return interfaceC18505l.mo205i9(((a) this).m97905b());
        }
        if (this instanceof b) {
            return interfaceC18505l2.mo205i9(((b) this).m97906b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
