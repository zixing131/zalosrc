package b40;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: b40.a0 */
/* loaded from: classes5.dex */
public abstract class AbstractC2521a0 {

    /* renamed from: a */
    private final int f10240a;

    /* renamed from: b40.a0$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC2521a0 {

        /* renamed from: b */
        public static final a f10241b = new a();

        private a() {
            super(4, null);
        }
    }

    /* renamed from: b40.a0$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC2521a0 {

        /* renamed from: b */
        public static final b f10242b = new b();

        private b() {
            super(2, null);
        }
    }

    /* renamed from: b40.a0$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC2521a0 {

        /* renamed from: b */
        public static final c f10243b = new c();

        private c() {
            super(3, null);
        }
    }

    /* renamed from: b40.a0$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC2521a0 {

        /* renamed from: b */
        public static final d f10244b = new d();

        private d() {
            super(1, null);
        }
    }

    /* renamed from: b40.a0$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC2521a0 {

        /* renamed from: b */
        private final EnumC2527d0 f10245b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumC2527d0 enumC2527d0) {
            super(6, null);
            AbstractC19074t.m100208f(enumC2527d0, "requestRetryErrorReason");
            this.f10245b = enumC2527d0;
        }

        /* renamed from: b */
        public final EnumC2527d0 m12632b() {
            return this.f10245b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f10245b == ((e) obj).f10245b;
        }

        public int hashCode() {
            return this.f10245b.hashCode();
        }

        public String toString() {
            return "RequestRetryGenerateFailed(requestRetryErrorReason=" + this.f10245b + ")";
        }
    }

    /* renamed from: b40.a0$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC2521a0 {

        /* renamed from: b */
        private final EnumC2529e0 f10246b;

        /* renamed from: c */
        private final EnumC2527d0 f10247c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumC2529e0 enumC2529e0, EnumC2527d0 enumC2527d0) {
            super(7, null);
            AbstractC19074t.m100208f(enumC2529e0, "retryKeyErrorReason");
            AbstractC19074t.m100208f(enumC2527d0, "requestRetryErrorReason");
            this.f10246b = enumC2529e0;
            this.f10247c = enumC2527d0;
        }

        /* renamed from: b */
        public final EnumC2527d0 m12633b() {
            return this.f10247c;
        }

        /* renamed from: c */
        public final EnumC2529e0 m12634c() {
            return this.f10246b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f10246b == fVar.f10246b && this.f10247c == fVar.f10247c;
        }

        public int hashCode() {
            return (this.f10246b.hashCode() * 31) + this.f10247c.hashCode();
        }

        public String toString() {
            return "RetryKeyAndRequestResendGenerateFailed(retryKeyErrorReason=" + this.f10246b + ", requestRetryErrorReason=" + this.f10247c + ")";
        }
    }

    /* renamed from: b40.a0$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC2521a0 {

        /* renamed from: b */
        private final EnumC2529e0 f10248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC2529e0 enumC2529e0) {
            super(5, null);
            AbstractC19074t.m100208f(enumC2529e0, "retryKeyErrorReason");
            this.f10248b = enumC2529e0;
        }

        /* renamed from: b */
        public final EnumC2529e0 m12635b() {
            return this.f10248b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f10248b == ((g) obj).f10248b;
        }

        public int hashCode() {
            return this.f10248b.hashCode();
        }

        public String toString() {
            return "RetryKeyGenerateFailed(retryKeyErrorReason=" + this.f10248b + ")";
        }
    }

    public /* synthetic */ AbstractC2521a0(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m12631a() {
        return this.f10240a;
    }

    private AbstractC2521a0(int i11) {
        this.f10240a = i11;
    }
}
