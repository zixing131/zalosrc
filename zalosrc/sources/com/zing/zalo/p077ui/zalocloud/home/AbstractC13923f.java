package com.zing.zalo.p077ui.zalocloud.home;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import bc0.EnumC2746k;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import jc0.C21221b;
import mg0.AbstractC23291c;
import og0.EnumC24251b;
import wg0.AbstractC28981d;

/* renamed from: com.zing.zalo.ui.zalocloud.home.f */
/* loaded from: classes6.dex */
public abstract class AbstractC13923f {

    /* renamed from: a */
    private final int f71768a;

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$a */
    /* loaded from: classes6.dex */
    public static abstract class a extends AbstractC13923f {

        /* renamed from: com.zing.zalo.ui.zalocloud.home.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C32785a extends a {

            /* renamed from: b */
            public static final C32785a f71769b = new C32785a();

            private C32785a() {
                super(null);
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.f$a$b */
        /* loaded from: classes6.dex */
        public static final class b extends a {

            /* renamed from: b */
            public static final b f71770b = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        private a() {
            super(11, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$b */
    /* loaded from: classes6.dex */
    public static abstract class b extends AbstractC13923f {

        /* renamed from: com.zing.zalo.ui.zalocloud.home.f$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: b */
            private AbstractC23291c f71771b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC23291c abstractC23291c) {
                super(null);
                AbstractC19074t.m100208f(abstractC23291c, "state");
                this.f71771b = abstractC23291c;
            }

            /* renamed from: b */
            public final AbstractC23291c m77498b() {
                return this.f71771b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC19074t.m100204b(this.f71771b, ((a) obj).f71771b);
            }

            public int hashCode() {
                return this.f71771b.hashCode();
            }

            public String toString() {
                return "ChangePassChart(state=" + this.f71771b + ")";
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C32786b extends b {

            /* renamed from: b */
            private ZCloudQuotaUsage f71772b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32786b(ZCloudQuotaUsage zCloudQuotaUsage) {
                super(null);
                AbstractC19074t.m100208f(zCloudQuotaUsage, "cloudQuotaUsage");
                this.f71772b = zCloudQuotaUsage;
            }

            /* renamed from: b */
            public final ZCloudQuotaUsage m77499b() {
                return this.f71772b;
            }

            /* renamed from: c */
            public final void m77500c(ZCloudQuotaUsage zCloudQuotaUsage) {
                AbstractC19074t.m100208f(zCloudQuotaUsage, "<set-?>");
                this.f71772b = zCloudQuotaUsage;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32786b) && AbstractC19074t.m100204b(this.f71772b, ((C32786b) obj).f71772b);
            }

            public int hashCode() {
                return this.f71772b.hashCode();
            }

            public String toString() {
                return "NormalChart(cloudQuotaUsage=" + this.f71772b + ")";
            }

            public /* synthetic */ C32786b(ZCloudQuotaUsage zCloudQuotaUsage, int i11, AbstractC19060k abstractC19060k) {
                this((i11 & 1) != 0 ? ZCloudQuotaUsage.Companion.m41262b() : zCloudQuotaUsage);
            }
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        private b() {
            super(2, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$c */
    /* loaded from: classes6.dex */
    public static abstract class c extends AbstractC13923f {

        /* renamed from: com.zing.zalo.ui.zalocloud.home.f$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: b */
            private AbstractC23291c f71773b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC23291c abstractC23291c) {
                super(null);
                AbstractC19074t.m100208f(abstractC23291c, "state");
                this.f71773b = abstractC23291c;
            }

            /* renamed from: b */
            public final AbstractC23291c m77501b() {
                return this.f71773b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC19074t.m100204b(this.f71773b, ((a) obj).f71773b);
            }

            public int hashCode() {
                return this.f71773b.hashCode();
            }

            public String toString() {
                return "ChangePassHeader(state=" + this.f71773b + ")";
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.f$c$b */
        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: b */
            private ZCloudQuotaUsage f71774b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ZCloudQuotaUsage zCloudQuotaUsage) {
                super(null);
                AbstractC19074t.m100208f(zCloudQuotaUsage, "cloudQuotaUsage");
                this.f71774b = zCloudQuotaUsage;
            }

            /* renamed from: b */
            public final ZCloudQuotaUsage m77502b() {
                return this.f71774b;
            }

            /* renamed from: c */
            public final void m77503c(ZCloudQuotaUsage zCloudQuotaUsage) {
                AbstractC19074t.m100208f(zCloudQuotaUsage, "<set-?>");
                this.f71774b = zCloudQuotaUsage;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC19074t.m100204b(this.f71774b, ((b) obj).f71774b);
            }

            public int hashCode() {
                return this.f71774b.hashCode();
            }

            public String toString() {
                return "NormalHeader(cloudQuotaUsage=" + this.f71774b + ")";
            }

            public /* synthetic */ b(ZCloudQuotaUsage zCloudQuotaUsage, int i11, AbstractC19060k abstractC19060k) {
                this((i11 & 1) != 0 ? ZCloudQuotaUsage.Companion.m41262b() : zCloudQuotaUsage);
            }
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        private c() {
            super(1, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC13923f {

        /* renamed from: b */
        private long f71775b;

        public d(long j11) {
            super(5, null);
            this.f71775b = j11;
        }

        /* renamed from: b */
        public final long m77504b() {
            return this.f71775b;
        }

        /* renamed from: c */
        public final void m77505c(long j11) {
            this.f71775b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f71775b == ((d) obj).f71775b;
        }

        public int hashCode() {
            return AbstractC2147g0.m11521a(this.f71775b);
        }

        public String toString() {
            return "CloudManage(totalUsage=" + this.f71775b + ")";
        }

        public /* synthetic */ d(long j11, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? 0L : j11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC13923f {

        /* renamed from: b */
        public static final e f71776b = new e();

        private e() {
            super(9, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC13923f {

        /* renamed from: b */
        public static final f f71777b = new f();

        private f() {
            super(10, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC13923f {

        /* renamed from: b */
        private boolean f71778b;

        public g(boolean z11) {
            super(12, null);
            this.f71778b = z11;
        }

        /* renamed from: b */
        public final boolean m77506b() {
            return this.f71778b;
        }

        /* renamed from: c */
        public final void m77507c(boolean z11) {
            this.f71778b = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f71778b == ((g) obj).f71778b;
        }

        public int hashCode() {
            return AbstractC2144f.m11520a(this.f71778b);
        }

        public String toString() {
            return "RemainingSpace(forceMatchParent=" + this.f71778b + ")";
        }

        public /* synthetic */ g(boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC13923f {

        /* renamed from: b */
        private final String f71779b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(13, null);
            AbstractC19074t.m100208f(str, "text");
            this.f71779b = str;
        }

        /* renamed from: b */
        public final String m77508b() {
            return this.f71779b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && AbstractC19074t.m100204b(this.f71779b, ((h) obj).f71779b);
        }

        public int hashCode() {
            return this.f71779b.hashCode();
        }

        public String toString() {
            return "SectionHeader(text=" + this.f71779b + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$i */
    /* loaded from: classes6.dex */
    public static abstract class i extends AbstractC13923f {

        /* renamed from: com.zing.zalo.ui.zalocloud.home.f$i$a */
        /* loaded from: classes6.dex */
        public static final class a extends i {

            /* renamed from: b */
            public static final a f71780b = new a();

            private a() {
                super(null);
            }
        }

        public /* synthetic */ i(AbstractC19060k abstractC19060k) {
            this();
        }

        private i() {
            super(3, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$j */
    /* loaded from: classes6.dex */
    public static final class j extends AbstractC13923f {

        /* renamed from: b */
        private final C21221b f71781b;

        /* renamed from: c */
        private long f71782c;

        /* renamed from: d */
        private boolean f71783d;

        /* renamed from: e */
        private boolean f71784e;

        /* renamed from: f */
        private boolean f71785f;

        public /* synthetic */ j(C21221b c21221b, long j11, boolean z11, boolean z12, boolean z13, int i11, AbstractC19060k abstractC19060k) {
            this(c21221b, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? true : z13);
        }

        /* renamed from: b */
        public final C21221b m77509b() {
            return this.f71781b;
        }

        /* renamed from: c */
        public final boolean m77510c() {
            return this.f71783d;
        }

        /* renamed from: d */
        public final boolean m77511d() {
            return this.f71785f;
        }

        /* renamed from: e */
        public final long m77512e() {
            return this.f71782c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return AbstractC19074t.m100204b(this.f71781b, jVar.f71781b) && this.f71782c == jVar.f71782c && this.f71783d == jVar.f71783d && this.f71784e == jVar.f71784e && this.f71785f == jVar.f71785f;
        }

        /* renamed from: f */
        public final boolean m77513f() {
            return this.f71784e;
        }

        /* renamed from: g */
        public final void m77514g(boolean z11) {
            this.f71783d = z11;
        }

        /* renamed from: h */
        public final void m77515h(long j11) {
            this.f71782c = j11;
        }

        public int hashCode() {
            return (((((((this.f71781b.hashCode() * 31) + AbstractC2147g0.m11521a(this.f71782c)) * 31) + AbstractC2144f.m11520a(this.f71783d)) * 31) + AbstractC2144f.m11520a(this.f71784e)) * 31) + AbstractC2144f.m11520a(this.f71785f);
        }

        public String toString() {
            return "ZCloudConnectFeature(connectItem=" + this.f71781b + ", usage=" + this.f71782c + ", disable=" + this.f71783d + ", isInPeriodDownload=" + this.f71784e + ", showDivider=" + this.f71785f + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C21221b c21221b, long j11, boolean z11, boolean z12, boolean z13) {
            super(14, null);
            AbstractC19074t.m100208f(c21221b, "connectItem");
            this.f71781b = c21221b;
            this.f71782c = j11;
            this.f71783d = z11;
            this.f71784e = z12;
            this.f71785f = z13;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$k */
    /* loaded from: classes6.dex */
    public static final class k extends AbstractC13923f {

        /* renamed from: b */
        private ZaloCloudRecoverCloudMediaWorker.AbstractC16884f f71786b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f) {
            super(18, null);
            AbstractC19074t.m100208f(abstractC16884f, "state");
            this.f71786b = abstractC16884f;
        }

        /* renamed from: b */
        public final ZaloCloudRecoverCloudMediaWorker.AbstractC16884f m77516b() {
            return this.f71786b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && AbstractC19074t.m100204b(this.f71786b, ((k) obj).f71786b);
        }

        public int hashCode() {
            return this.f71786b.hashCode();
        }

        public String toString() {
            return "ZCloudGracePeriodBannerItem(state=" + this.f71786b + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$l */
    /* loaded from: classes6.dex */
    public static final class l extends AbstractC13923f {
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$m */
    /* loaded from: classes6.dex */
    public static final class m extends AbstractC13923f {

        /* renamed from: b */
        private final AbstractC28981d f71787b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(AbstractC28981d abstractC28981d) {
            super(15, null);
            AbstractC19074t.m100208f(abstractC28981d, "state");
            this.f71787b = abstractC28981d;
        }

        /* renamed from: b */
        public final AbstractC28981d m77517b() {
            return this.f71787b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && AbstractC19074t.m100204b(this.f71787b, ((m) obj).f71787b);
        }

        public int hashCode() {
            return this.f71787b.hashCode();
        }

        public String toString() {
            return "ZCloudMigrateChart(state=" + this.f71787b + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.f$n */
    /* loaded from: classes6.dex */
    public static final class n extends AbstractC13923f {

        /* renamed from: b */
        private final EnumC24251b f71788b;

        /* renamed from: c */
        private final float f71789c;

        /* renamed from: d */
        private final EnumC2746k f71790d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(EnumC24251b enumC24251b, float f11, EnumC2746k enumC2746k) {
            super(16, null);
            AbstractC19074t.m100208f(enumC24251b, "feature");
            AbstractC19074t.m100208f(enumC2746k, "errorType");
            this.f71788b = enumC24251b;
            this.f71789c = f11;
            this.f71790d = enumC2746k;
        }

        /* renamed from: b */
        public final EnumC2746k m77518b() {
            return this.f71790d;
        }

        /* renamed from: c */
        public final EnumC24251b m77519c() {
            return this.f71788b;
        }

        /* renamed from: d */
        public final float m77520d() {
            return this.f71789c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f71788b == nVar.f71788b && Float.compare(this.f71789c, nVar.f71789c) == 0 && this.f71790d == nVar.f71790d;
        }

        public int hashCode() {
            return (((this.f71788b.hashCode() * 31) + Float.floatToIntBits(this.f71789c)) * 31) + this.f71790d.hashCode();
        }

        public String toString() {
            return "ZCloudMigrateItem(feature=" + this.f71788b + ", progress=" + this.f71789c + ", errorType=" + this.f71790d + ")";
        }
    }

    public /* synthetic */ AbstractC13923f(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m77497a() {
        return this.f71768a;
    }

    private AbstractC13923f(int i11) {
        this.f71768a = i11;
    }
}
