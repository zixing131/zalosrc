package b40;

import fn0.AbstractC19060k;

/* renamed from: b40.f0 */
/* loaded from: classes5.dex */
public abstract class AbstractC2531f0 {

    /* renamed from: a */
    private final int f10292a;

    /* renamed from: b40.f0$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC2531f0 {

        /* renamed from: b */
        public static final a f10293b = new a();

        private a() {
            super(4, null);
        }
    }

    /* renamed from: b40.f0$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC2531f0 {

        /* renamed from: b */
        private final EnumC2523b0 f10294b;

        public b(EnumC2523b0 enumC2523b0) {
            super(5, null);
            this.f10294b = enumC2523b0;
        }

        /* renamed from: b */
        public final EnumC2523b0 m12744b() {
            return this.f10294b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f10294b == ((b) obj).f10294b;
        }

        public int hashCode() {
            EnumC2523b0 enumC2523b0 = this.f10294b;
            if (enumC2523b0 == null) {
                return 0;
            }
            return enumC2523b0.hashCode();
        }

        public String toString() {
            return "DecryptFailedNotResend(notResendingReason=" + this.f10294b + ")";
        }
    }

    /* renamed from: b40.f0$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC2531f0 {

        /* renamed from: b */
        public static final c f10295b = new c();

        private c() {
            super(6, null);
        }
    }

    /* renamed from: b40.f0$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC2531f0 {

        /* renamed from: b */
        public static final d f10296b = new d();

        private d() {
            super(2, null);
        }
    }

    /* renamed from: b40.f0$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC2531f0 {

        /* renamed from: b */
        public static final e f10297b = new e();

        private e() {
            super(1, null);
        }
    }

    /* renamed from: b40.f0$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC2531f0 {

        /* renamed from: b */
        public static final f f10298b = new f();

        private f() {
            super(0, null);
        }
    }

    public /* synthetic */ AbstractC2531f0(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m12743a() {
        return this.f10292a;
    }

    private AbstractC2531f0(int i11) {
        this.f10292a = i11;
    }
}
