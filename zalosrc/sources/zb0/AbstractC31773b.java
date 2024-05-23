package zb0;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;

/* renamed from: zb0.b */
/* loaded from: classes6.dex */
public abstract class AbstractC31773b {

    /* renamed from: zb0.b$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC31773b {

        /* renamed from: a */
        public static final a f145875a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: zb0.b$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC31773b {

        /* renamed from: a */
        public static final b f145876a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: zb0.b$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC31773b {

        /* renamed from: a */
        private final long f145877a;

        /* renamed from: b */
        private final long f145878b;

        /* renamed from: c */
        private final long f145879c;

        public c(long j11, long j12, long j13) {
            super(null);
            this.f145877a = j11;
            this.f145878b = j12;
            this.f145879c = j13;
        }

        /* renamed from: a */
        public final long m152769a() {
            return this.f145879c;
        }

        /* renamed from: b */
        public final long m152770b() {
            return this.f145878b;
        }

        /* renamed from: c */
        public final long m152771c() {
            return this.f145877a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f145877a == cVar.f145877a && this.f145878b == cVar.f145878b && this.f145879c == cVar.f145879c;
        }

        public int hashCode() {
            return (((AbstractC2147g0.m11521a(this.f145877a) * 31) + AbstractC2147g0.m11521a(this.f145878b)) * 31) + AbstractC2147g0.m11521a(this.f145879c);
        }

        public String toString() {
            return "OnAnalyzeSuccess(totalMediaSize=" + this.f145877a + ", totalDownloadMediaSize=" + this.f145878b + ", localMedia=" + this.f145879c + ")";
        }
    }

    /* renamed from: zb0.b$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC31773b {

        /* renamed from: a */
        public static final d f145880a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: zb0.b$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC31773b {

        /* renamed from: a */
        public static final e f145881a = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: zb0.b$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC31773b {

        /* renamed from: a */
        private final int f145882a;

        public f(int i11) {
            super(null);
            this.f145882a = i11;
        }

        /* renamed from: a */
        public final int m152772a() {
            return this.f145882a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f145882a == ((f) obj).f145882a;
        }

        public int hashCode() {
            return this.f145882a;
        }

        public String toString() {
            return "ShowToolStorage(mode=" + this.f145882a + ")";
        }
    }

    private AbstractC31773b() {
    }

    public /* synthetic */ AbstractC31773b(AbstractC19060k abstractC19060k) {
        this();
    }
}
