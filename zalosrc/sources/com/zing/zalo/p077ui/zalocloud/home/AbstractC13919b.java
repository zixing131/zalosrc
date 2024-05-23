package com.zing.zalo.p077ui.zalocloud.home;

import androidx.work.AbstractC2147g0;
import bc0.EnumC2746k;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import wg0.AbstractC28981d;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.zalocloud.home.b */
/* loaded from: classes6.dex */
public abstract class AbstractC13919b {

    /* renamed from: a */
    private final int f71702a;

    /* renamed from: com.zing.zalo.ui.zalocloud.home.b$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC13919b {

        /* renamed from: b */
        public static final a f71703b = new a();

        private a() {
            super(9, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.b$b */
    /* loaded from: classes6.dex */
    public static abstract class b extends AbstractC13919b {

        /* renamed from: com.zing.zalo.ui.zalocloud.home.b$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: b */
            private ZCloudQuotaUsage f71704b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ZCloudQuotaUsage zCloudQuotaUsage) {
                super(null);
                AbstractC19074t.m100208f(zCloudQuotaUsage, "cloudQuotaUsage");
                this.f71704b = zCloudQuotaUsage;
            }

            /* renamed from: b */
            public final ZCloudQuotaUsage m77435b() {
                return this.f71704b;
            }

            /* renamed from: c */
            public final void m77436c(ZCloudQuotaUsage zCloudQuotaUsage) {
                AbstractC19074t.m100208f(zCloudQuotaUsage, "<set-?>");
                this.f71704b = zCloudQuotaUsage;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC19074t.m100204b(this.f71704b, ((a) obj).f71704b);
            }

            public int hashCode() {
                return this.f71704b.hashCode();
            }

            public String toString() {
                return "NormalChart(cloudQuotaUsage=" + this.f71704b + ")";
            }

            public /* synthetic */ a(ZCloudQuotaUsage zCloudQuotaUsage, int i11, AbstractC19060k abstractC19060k) {
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

    /* renamed from: com.zing.zalo.ui.zalocloud.home.b$c */
    /* loaded from: classes6.dex */
    public static abstract class c extends AbstractC13919b {

        /* renamed from: com.zing.zalo.ui.zalocloud.home.b$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: b */
            private ZCloudQuotaUsage f71705b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ZCloudQuotaUsage zCloudQuotaUsage) {
                super(null);
                AbstractC19074t.m100208f(zCloudQuotaUsage, "cloudQuotaUsage");
                this.f71705b = zCloudQuotaUsage;
            }

            /* renamed from: b */
            public final ZCloudQuotaUsage m77437b() {
                return this.f71705b;
            }

            /* renamed from: c */
            public final void m77438c(ZCloudQuotaUsage zCloudQuotaUsage) {
                AbstractC19074t.m100208f(zCloudQuotaUsage, "<set-?>");
                this.f71705b = zCloudQuotaUsage;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC19074t.m100204b(this.f71705b, ((a) obj).f71705b);
            }

            public int hashCode() {
                return this.f71705b.hashCode();
            }

            public String toString() {
                return "NormalHeader(cloudQuotaUsage=" + this.f71705b + ")";
            }

            public /* synthetic */ a(ZCloudQuotaUsage zCloudQuotaUsage, int i11, AbstractC19060k abstractC19060k) {
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

    /* renamed from: com.zing.zalo.ui.zalocloud.home.b$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC13919b {

        /* renamed from: b */
        private final a f71706b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.zing.zalo.ui.zalocloud.home.b$d$a */
        /* loaded from: classes6.dex */
        public static final class a {

            /* renamed from: p */
            public static final a f71707p = new a("ALL_TYPE", 0);

            /* renamed from: q */
            public static final a f71708q = new a("THREAD", 1);

            /* renamed from: r */
            private static final /* synthetic */ a[] f71709r;

            /* renamed from: s */
            private static final /* synthetic */ InterfaceC30165a f71710s;

            static {
                a[] m77440b = m77440b();
                f71709r = m77440b;
                f71710s = AbstractC30166b.m148796a(m77440b);
            }

            private a(String str, int i11) {
            }

            /* renamed from: b */
            private static final /* synthetic */ a[] m77440b() {
                return new a[]{f71707p, f71708q};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f71709r.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar) {
            super(8, null);
            AbstractC19074t.m100208f(aVar, "cleanType");
            this.f71706b = aVar;
        }

        /* renamed from: b */
        public final a m77439b() {
            return this.f71706b;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.b$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC13919b {

        /* renamed from: b */
        public static final e f71711b = new e();

        private e() {
            super(4, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.b$f */
    /* loaded from: classes6.dex */
    public static abstract class f extends AbstractC13919b {

        /* renamed from: b */
        private final a f71712b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.zing.zalo.ui.zalocloud.home.b$f$a */
        /* loaded from: classes6.dex */
        public static final class a {

            /* renamed from: p */
            public static final a f71713p = new a("SINGLE", 0);

            /* renamed from: q */
            public static final a f71714q = new a("THREAD", 1);

            /* renamed from: r */
            private static final /* synthetic */ a[] f71715r;

            /* renamed from: s */
            private static final /* synthetic */ InterfaceC30165a f71716s;

            static {
                a[] m77441b = m77441b();
                f71715r = m77441b;
                f71716s = AbstractC30166b.m148796a(m77441b);
            }

            private a(String str, int i11) {
            }

            /* renamed from: b */
            private static final /* synthetic */ a[] m77441b() {
                return new a[]{f71713p, f71714q};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f71715r.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.zing.zalo.ui.zalocloud.home.b$f$b */
        /* loaded from: classes6.dex */
        public static final class b {

            /* renamed from: p */
            public static final b f71717p = new b("PHOTO", 0);

            /* renamed from: q */
            public static final b f71718q = new b("VIDEO", 1);

            /* renamed from: r */
            public static final b f71719r = new b("FILE", 2);

            /* renamed from: s */
            public static final b f71720s = new b("OTHER", 3);

            /* renamed from: t */
            private static final /* synthetic */ b[] f71721t;

            /* renamed from: u */
            private static final /* synthetic */ InterfaceC30165a f71722u;

            static {
                b[] m77442b = m77442b();
                f71721t = m77442b;
                f71722u = AbstractC30166b.m148796a(m77442b);
            }

            private b(String str, int i11) {
            }

            /* renamed from: b */
            private static final /* synthetic */ b[] m77442b() {
                return new b[]{f71717p, f71718q, f71719r, f71720s};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f71721t.clone();
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.b$f$c */
        /* loaded from: classes6.dex */
        public static final class c extends f {

            /* renamed from: c */
            private final b f71723c;

            /* renamed from: d */
            private long f71724d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, long j11) {
                super(a.f71713p, null);
                AbstractC19074t.m100208f(bVar, "mediaType");
                this.f71723c = bVar;
                this.f71724d = j11;
            }

            /* renamed from: b */
            public final b m77443b() {
                return this.f71723c;
            }

            /* renamed from: c */
            public final long m77444c() {
                return this.f71724d;
            }

            /* renamed from: d */
            public final void m77445d(long j11) {
                this.f71724d = j11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f71723c == cVar.f71723c && this.f71724d == cVar.f71724d;
            }

            public int hashCode() {
                return (this.f71723c.hashCode() * 31) + AbstractC2147g0.m11521a(this.f71724d);
            }

            public String toString() {
                return "SingleTypeInfo(mediaType=" + this.f71723c + ", size=" + this.f71724d + ")";
            }

            public /* synthetic */ c(b bVar, long j11, int i11, AbstractC19060k abstractC19060k) {
                this(bVar, (i11 & 2) != 0 ? 0L : j11);
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.b$f$d */
        /* loaded from: classes6.dex */
        public static final class d extends f {

            /* renamed from: c */
            private int f71725c;

            /* renamed from: d */
            private int f71726d;

            public d(int i11, int i12) {
                super(a.f71714q, null);
                this.f71725c = i11;
                this.f71726d = i12;
            }

            /* renamed from: b */
            public final int m77446b() {
                return this.f71725c;
            }

            /* renamed from: c */
            public final int m77447c() {
                return this.f71726d;
            }

            /* renamed from: d */
            public final void m77448d(int i11) {
                this.f71725c = i11;
            }

            /* renamed from: e */
            public final void m77449e(int i11) {
                this.f71726d = i11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f71725c == dVar.f71725c && this.f71726d == dVar.f71726d;
            }

            public int hashCode() {
                return (this.f71725c * 31) + this.f71726d;
            }

            public String toString() {
                return "ThreadTypeInfo(totalThread=" + this.f71725c + ", totalThreadOverSize=" + this.f71726d + ")";
            }

            public /* synthetic */ d(int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
                this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
            }
        }

        public /* synthetic */ f(a aVar, AbstractC19060k abstractC19060k) {
            this(aVar);
        }

        private f(a aVar) {
            super(7, null);
            this.f71712b = aVar;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.b$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC13919b {

        /* renamed from: b */
        public static final g f71727b = new g();

        private g() {
            super(5, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.b$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC13919b {

        /* renamed from: b */
        private final String f71728b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(6, null);
            AbstractC19074t.m100208f(str, "text");
            this.f71728b = str;
        }

        /* renamed from: b */
        public final String m77450b() {
            return this.f71728b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && AbstractC19074t.m100204b(this.f71728b, ((h) obj).f71728b);
        }

        public int hashCode() {
            return this.f71728b.hashCode();
        }

        public String toString() {
            return "SectionHeader(text=" + this.f71728b + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.b$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC13919b {

        /* renamed from: b */
        private final AbstractC28981d f71729b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC28981d abstractC28981d) {
            super(10, null);
            AbstractC19074t.m100208f(abstractC28981d, "state");
            this.f71729b = abstractC28981d;
        }

        /* renamed from: b */
        public final AbstractC28981d m77451b() {
            return this.f71729b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && AbstractC19074t.m100204b(this.f71729b, ((i) obj).f71729b);
        }

        public int hashCode() {
            return this.f71729b.hashCode();
        }

        public String toString() {
            return "ZCloudMigrateChart(state=" + this.f71729b + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.b$j */
    /* loaded from: classes6.dex */
    public static final class j extends AbstractC13919b {

        /* renamed from: b */
        private final float f71730b;

        /* renamed from: c */
        private final EnumC2746k f71731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f11, EnumC2746k enumC2746k) {
            super(11, null);
            AbstractC19074t.m100208f(enumC2746k, "errorType");
            this.f71730b = f11;
            this.f71731c = enumC2746k;
        }

        /* renamed from: b */
        public final EnumC2746k m77452b() {
            return this.f71731c;
        }

        /* renamed from: c */
        public final float m77453c() {
            return this.f71730b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f71730b, jVar.f71730b) == 0 && this.f71731c == jVar.f71731c;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f71730b) * 31) + this.f71731c.hashCode();
        }

        public String toString() {
            return "ZCloudMigrateItem(progress=" + this.f71730b + ", errorType=" + this.f71731c + ")";
        }
    }

    public /* synthetic */ AbstractC13919b(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m77434a() {
        return this.f71702a;
    }

    private AbstractC13919b(int i11) {
        this.f71702a = i11;
    }
}
