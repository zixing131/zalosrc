package com.zing.zalo.data.zalocloud.model;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class ZCloudQuotaUsage {
    public static final Companion Companion = new Companion(null);

    /* renamed from: i */
    private static final ZCloudQuotaUsage f43005i = new ZCloudQuotaUsage(0, 0, (ServiceUsage) null, 0, 0, 0, 0, (AbuseInfo) null, 254, (AbstractC19060k) null);

    /* renamed from: j */
    private static final ZCloudQuotaUsage f43006j = new ZCloudQuotaUsage(-1, 0, (ServiceUsage) null, 0, 0, 0, 0, (AbuseInfo) null, 254, (AbstractC19060k) null);

    /* renamed from: a */
    private final long f43007a;

    /* renamed from: b */
    private final long f43008b;

    /* renamed from: c */
    private final ServiceUsage f43009c;

    /* renamed from: d */
    private final long f43010d;

    /* renamed from: e */
    private final long f43011e;

    /* renamed from: f */
    private final long f43012f;

    /* renamed from: g */
    private final long f43013g;

    /* renamed from: h */
    private final AbuseInfo f43014h;

    @InterfaceC25392g
    /* loaded from: classes3.dex */
    public static final class AbuseInfo {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final long f43015a;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return ZCloudQuotaUsage$AbuseInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AbuseInfo(int i11, long j11, AbstractC26805k1 abstractC26805k1) {
            if (1 != (i11 & 1)) {
                AbstractC26774a1.m137800b(i11, 1, ZCloudQuotaUsage$AbuseInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.f43015a = j11;
        }

        /* renamed from: a */
        public final long m41260a() {
            return this.f43015a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AbuseInfo) && this.f43015a == ((AbuseInfo) obj).f43015a;
        }

        public int hashCode() {
            return AbstractC2147g0.m11521a(this.f43015a);
        }

        public String toString() {
            return "AbuseInfo(removeTs=" + this.f43015a + ")";
        }

        public AbuseInfo(long j11) {
            this.f43015a = j11;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ServiceUsage m41261a(ServiceUsage serviceUsage) {
            AbstractC19074t.m100208f(serviceUsage, "serviceUsage");
            return new ServiceUsage(serviceUsage.m41265a(), serviceUsage.m41267c(), serviceUsage.m41266b());
        }

        /* renamed from: b */
        public final ZCloudQuotaUsage m41262b() {
            return ZCloudQuotaUsage.f43005i;
        }

        /* renamed from: c */
        public final ServiceUsage m41263c(com.zing.zalo.data.zalocloud.model.api.ServiceUsage serviceUsage) {
            AbstractC19074t.m100208f(serviceUsage, "response");
            return new ServiceUsage(serviceUsage.m41378a(), serviceUsage.m41380c(), serviceUsage.m41379b());
        }

        public final KSerializer serializer() {
            return ZCloudQuotaUsage$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes3.dex */
    public static final class ServiceUsage {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final long f43016a;

        /* renamed from: b */
        private final long f43017b;

        /* renamed from: c */
        private final long f43018c;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return ZCloudQuotaUsage$ServiceUsage$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ServiceUsage(int i11, long j11, long j12, long j13, AbstractC26805k1 abstractC26805k1) {
            if ((i11 & 1) == 0) {
                this.f43016a = 0L;
            } else {
                this.f43016a = j11;
            }
            if ((i11 & 2) == 0) {
                this.f43017b = 0L;
            } else {
                this.f43017b = j12;
            }
            if ((i11 & 4) == 0) {
                this.f43018c = 0L;
            } else {
                this.f43018c = j13;
            }
        }

        /* renamed from: d */
        public static final /* synthetic */ void m41264d(ServiceUsage serviceUsage, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || serviceUsage.f43016a != 0) {
                interfaceC21886d.mo114022E(serialDescriptor, 0, serviceUsage.f43016a);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || serviceUsage.f43017b != 0) {
                interfaceC21886d.mo114022E(serialDescriptor, 1, serviceUsage.f43017b);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || serviceUsage.f43018c != 0) {
                interfaceC21886d.mo114022E(serialDescriptor, 2, serviceUsage.f43018c);
            }
        }

        /* renamed from: a */
        public final long m41265a() {
            return this.f43016a;
        }

        /* renamed from: b */
        public final long m41266b() {
            return this.f43018c;
        }

        /* renamed from: c */
        public final long m41267c() {
            return this.f43017b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceUsage)) {
                return false;
            }
            ServiceUsage serviceUsage = (ServiceUsage) obj;
            return this.f43016a == serviceUsage.f43016a && this.f43017b == serviceUsage.f43017b && this.f43018c == serviceUsage.f43018c;
        }

        public int hashCode() {
            return (((AbstractC2147g0.m11521a(this.f43016a) * 31) + AbstractC2147g0.m11521a(this.f43017b)) * 31) + AbstractC2147g0.m11521a(this.f43018c);
        }

        public String toString() {
            return "ServiceUsage(cloudMedia=" + this.f43016a + ", myCloud=" + this.f43017b + ", messageBackup=" + this.f43018c + ")";
        }

        public ServiceUsage(long j11, long j12, long j13) {
            this.f43016a = j11;
            this.f43017b = j12;
            this.f43018c = j13;
        }

        public /* synthetic */ ServiceUsage(long j11, long j12, long j13, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 0L : j12, (i11 & 4) != 0 ? 0L : j13);
        }
    }

    public /* synthetic */ ZCloudQuotaUsage(int i11, long j11, long j12, ServiceUsage serviceUsage, long j13, long j14, long j15, long j16, AbuseInfo abuseInfo, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, ZCloudQuotaUsage$$serializer.INSTANCE.getDescriptor());
        }
        this.f43007a = j11;
        if ((i11 & 2) == 0) {
            this.f43008b = 0L;
        } else {
            this.f43008b = j12;
        }
        this.f43009c = (i11 & 4) == 0 ? new ServiceUsage(0L, 0L, 0L, 7, (AbstractC19060k) null) : serviceUsage;
        if ((i11 & 8) == 0) {
            this.f43010d = 0L;
        } else {
            this.f43010d = j13;
        }
        if ((i11 & 16) == 0) {
            this.f43011e = 0L;
        } else {
            this.f43011e = j14;
        }
        if ((i11 & 32) == 0) {
            this.f43012f = 0L;
        } else {
            this.f43012f = j15;
        }
        if ((i11 & 64) == 0) {
            this.f43013g = 0L;
        } else {
            this.f43013g = j16;
        }
        this.f43014h = (i11 & 128) == 0 ? null : abuseInfo;
    }

    /* renamed from: p */
    private final boolean m41243p(ZCloudQuotaUsage zCloudQuotaUsage) {
        if (this.f43007a == zCloudQuotaUsage.f43007a && this.f43008b == zCloudQuotaUsage.f43008b && this.f43010d == zCloudQuotaUsage.f43010d && this.f43011e == zCloudQuotaUsage.f43011e && this.f43012f == zCloudQuotaUsage.f43012f && this.f43013g == zCloudQuotaUsage.f43013g && this.f43009c.m41265a() == zCloudQuotaUsage.f43009c.m41265a() && this.f43009c.m41267c() == zCloudQuotaUsage.f43009c.m41267c() && this.f43009c.m41266b() == zCloudQuotaUsage.f43009c.m41266b()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static final /* synthetic */ void m41244r(ZCloudQuotaUsage zCloudQuotaUsage, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114022E(serialDescriptor, 0, zCloudQuotaUsage.f43007a);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || zCloudQuotaUsage.f43008b != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 1, zCloudQuotaUsage.f43008b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(zCloudQuotaUsage.f43009c, new ServiceUsage(0L, 0L, 0L, 7, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 2, ZCloudQuotaUsage$ServiceUsage$$serializer.INSTANCE, zCloudQuotaUsage.f43009c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || zCloudQuotaUsage.f43010d != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 3, zCloudQuotaUsage.f43010d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || zCloudQuotaUsage.f43011e != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 4, zCloudQuotaUsage.f43011e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || zCloudQuotaUsage.f43012f != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 5, zCloudQuotaUsage.f43012f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || zCloudQuotaUsage.f43013g != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 6, zCloudQuotaUsage.f43013g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || zCloudQuotaUsage.f43014h != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, ZCloudQuotaUsage$AbuseInfo$$serializer.INSTANCE, zCloudQuotaUsage.f43014h);
        }
    }

    /* renamed from: b */
    public final CloudQuotaUsage m41245b() {
        CloudQuotaUsage.AbuseInfo abuseInfo;
        long j11 = this.f43007a;
        long j12 = this.f43008b;
        long j13 = this.f43010d;
        long j14 = this.f43011e;
        long j15 = this.f43012f;
        long j16 = this.f43013g;
        AbuseInfo abuseInfo2 = this.f43014h;
        if (abuseInfo2 != null) {
            abuseInfo = new CloudQuotaUsage.AbuseInfo(abuseInfo2.m41260a());
        } else {
            abuseInfo = null;
        }
        return new CloudQuotaUsage(j11, j12, j13, j14, j15, j16, abuseInfo);
    }

    /* renamed from: c */
    public final ZCloudQuotaUsage m41246c(long j11, long j12, ServiceUsage serviceUsage, long j13, long j14, long j15, long j16, AbuseInfo abuseInfo) {
        AbstractC19074t.m100208f(serviceUsage, "serviceUsage");
        return new ZCloudQuotaUsage(j11, j12, serviceUsage, j13, j14, j15, j16, abuseInfo);
    }

    /* renamed from: e */
    public final AbuseInfo m41247e() {
        return this.f43014h;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof ZCloudQuotaUsage) || !m41243p((ZCloudQuotaUsage) obj))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final long m41248f() {
        return this.f43012f;
    }

    /* renamed from: g */
    public final long m41249g() {
        return this.f43013g;
    }

    /* renamed from: h */
    public final long m41250h() {
        return this.f43010d;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final ServiceUsage m41251i() {
        return this.f43009c;
    }

    /* renamed from: j */
    public final long m41252j() {
        return this.f43007a;
    }

    /* renamed from: k */
    public final long m41253k() {
        return this.f43008b;
    }

    /* renamed from: l */
    public final long m41254l() {
        return this.f43011e;
    }

    /* renamed from: m */
    public final boolean m41255m() {
        return this.f43007a == -1;
    }

    /* renamed from: n */
    public final boolean m41256n() {
        return this.f43008b >= this.f43007a;
    }

    /* renamed from: o */
    public final boolean m41257o() {
        return this.f43007a > 0;
    }

    /* renamed from: q */
    public final long m41258q() {
        return this.f43009c.m41267c() + this.f43009c.m41265a() + this.f43009c.m41266b();
    }

    public String toString() {
        return "ZCloudQuotaUsage(total=" + this.f43007a + ", used=" + this.f43008b + ", serviceUsage=" + this.f43009c + ", photo=" + this.f43010d + ", video=" + this.f43011e + ", file=" + this.f43012f + ", others=" + this.f43013g + ", abuseInfo=" + this.f43014h + ")";
    }

    public ZCloudQuotaUsage(long j11, long j12, ServiceUsage serviceUsage, long j13, long j14, long j15, long j16, AbuseInfo abuseInfo) {
        AbstractC19074t.m100208f(serviceUsage, "serviceUsage");
        this.f43007a = j11;
        this.f43008b = j12;
        this.f43009c = serviceUsage;
        this.f43010d = j13;
        this.f43011e = j14;
        this.f43012f = j15;
        this.f43013g = j16;
        this.f43014h = abuseInfo;
    }

    public /* synthetic */ ZCloudQuotaUsage(long j11, long j12, ServiceUsage serviceUsage, long j13, long j14, long j15, long j16, AbuseInfo abuseInfo, int i11, AbstractC19060k abstractC19060k) {
        this(j11, (i11 & 2) != 0 ? 0L : j12, (i11 & 4) != 0 ? new ServiceUsage(0L, 0L, 0L, 7, (AbstractC19060k) null) : serviceUsage, (i11 & 8) != 0 ? 0L : j13, (i11 & 16) != 0 ? 0L : j14, (i11 & 32) != 0 ? 0L : j15, (i11 & 64) != 0 ? 0L : j16, (i11 & 128) != 0 ? null : abuseInfo);
    }
}
