package ej0;

import aj0.C0880c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import jj0.EnumC21277b;
import jj0.EnumC21279d;

/* renamed from: ej0.a */
/* loaded from: classes.dex */
public abstract class AbstractC18457a {

    /* renamed from: a */
    private final boolean f93006a;

    /* renamed from: ej0.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC18457a {

        /* renamed from: b */
        public static final a f93007b = new a();

        private a() {
            super(false, null);
        }
    }

    /* renamed from: ej0.a$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC18457a {

        /* renamed from: b */
        public static final b f93008b = new b();

        private b() {
            super(true, null);
        }
    }

    /* renamed from: ej0.a$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC18457a {

        /* renamed from: b */
        private final String f93009b;

        /* renamed from: c */
        private final String f93010c;

        /* renamed from: d */
        private final EnumC21279d f93011d;

        /* renamed from: e */
        private final String f93012e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, EnumC21279d enumC21279d, String str3) {
            super(false, null);
            AbstractC19074t.m100208f(str, "tranxId");
            AbstractC19074t.m100208f(str2, "productId");
            AbstractC19074t.m100208f(enumC21279d, "responseCode");
            AbstractC19074t.m100208f(str3, "jsCallback");
            this.f93009b = str;
            this.f93010c = str2;
            this.f93011d = enumC21279d;
            this.f93012e = str3;
        }

        /* renamed from: b */
        public final String m97775b() {
            return this.f93009b;
        }

        /* renamed from: c */
        public final String m97776c() {
            return this.f93010c;
        }

        /* renamed from: d */
        public final EnumC21279d m97777d() {
            return this.f93011d;
        }

        /* renamed from: e */
        public final String m97778e() {
            return this.f93012e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f93009b, cVar.f93009b) && AbstractC19074t.m100204b(this.f93010c, cVar.f93010c) && this.f93011d == cVar.f93011d && AbstractC19074t.m100204b(this.f93012e, cVar.f93012e);
        }

        /* renamed from: f */
        public final EnumC21279d m97779f() {
            return this.f93011d;
        }

        public int hashCode() {
            return (((((this.f93009b.hashCode() * 31) + this.f93010c.hashCode()) * 31) + this.f93011d.hashCode()) * 31) + this.f93012e.hashCode();
        }

        public String toString() {
            return "ResponseRequest(tranxId=" + this.f93009b + ", productId=" + this.f93010c + ", responseCode=" + this.f93011d + ", jsCallback=" + this.f93012e + ")";
        }
    }

    /* renamed from: ej0.a$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC18457a {

        /* renamed from: b */
        private final String f93013b;

        /* renamed from: c */
        private final String f93014c;

        /* renamed from: d */
        private final EnumC21277b f93015d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, EnumC21277b enumC21277b) {
            super(false, null);
            AbstractC19074t.m100208f(str, "tranxId");
            AbstractC19074t.m100208f(str2, "productId");
            AbstractC19074t.m100208f(enumC21277b, "responseCode");
            this.f93013b = str;
            this.f93014c = str2;
            this.f93015d = enumC21277b;
        }

        /* renamed from: b */
        public final String m97780b() {
            return this.f93013b;
        }

        /* renamed from: c */
        public final String m97781c() {
            return this.f93014c;
        }

        /* renamed from: d */
        public final EnumC21277b m97782d() {
            return this.f93015d;
        }

        /* renamed from: e */
        public final EnumC21277b m97783e() {
            return this.f93015d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC19074t.m100204b(this.f93013b, dVar.f93013b) && AbstractC19074t.m100204b(this.f93014c, dVar.f93014c) && this.f93015d == dVar.f93015d;
        }

        public int hashCode() {
            return (((this.f93013b.hashCode() * 31) + this.f93014c.hashCode()) * 31) + this.f93015d.hashCode();
        }

        public String toString() {
            return "ResponseResult(tranxId=" + this.f93013b + ", productId=" + this.f93014c + ", responseCode=" + this.f93015d + ")";
        }
    }

    /* renamed from: ej0.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC18457a {

        /* renamed from: b */
        private final C0880c f93016b;

        /* renamed from: c */
        private final boolean f93017c;

        /* renamed from: d */
        private final int f93018d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0880c c0880c, boolean z11, int i11) {
            super(false, null);
            AbstractC19074t.m100208f(c0880c, "billingItem");
            this.f93016b = c0880c;
            this.f93017c = z11;
            this.f93018d = i11;
        }

        /* renamed from: b */
        public final C0880c m97784b() {
            return this.f93016b;
        }

        /* renamed from: c */
        public final boolean m97785c() {
            return this.f93017c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC19074t.m100204b(this.f93016b, eVar.f93016b) && this.f93017c == eVar.f93017c && this.f93018d == eVar.f93018d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f93016b.hashCode() * 31;
            boolean z11 = this.f93017c;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return ((hashCode + i11) * 31) + this.f93018d;
        }

        public String toString() {
            return "VerifyRetry(billingItem=" + this.f93016b + ", isExceededMaxRetry=" + this.f93017c + ", retryCount=" + this.f93018d + ")";
        }
    }

    public /* synthetic */ AbstractC18457a(boolean z11, AbstractC19060k abstractC19060k) {
        this(z11);
    }

    /* renamed from: a */
    public final boolean m97774a() {
        return this.f93006a;
    }

    private AbstractC18457a(boolean z11) {
        this.f93006a = z11;
    }
}
