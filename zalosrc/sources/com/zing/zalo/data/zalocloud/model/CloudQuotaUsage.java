package com.zing.zalo.data.zalocloud.model;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class CloudQuotaUsage {
    public static final Companion Companion = new Companion(null);

    /* renamed from: h */
    private static final CloudQuotaUsage f42995h = new CloudQuotaUsage(0, 0, 0, 0, 0, 0, (AbuseInfo) null, 126, (AbstractC19060k) null);

    /* renamed from: i */
    private static final CloudQuotaUsage f42996i = new CloudQuotaUsage(-1, 0, 0, 0, 0, 0, (AbuseInfo) null, 126, (AbstractC19060k) null);

    /* renamed from: a */
    private final long f42997a;

    /* renamed from: b */
    private final long f42998b;

    /* renamed from: c */
    private final long f42999c;

    /* renamed from: d */
    private final long f43000d;

    /* renamed from: e */
    private final long f43001e;

    /* renamed from: f */
    private final long f43002f;

    /* renamed from: g */
    private final AbuseInfo f43003g;

    @InterfaceC25392g
    /* loaded from: classes3.dex */
    public static final class AbuseInfo {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final long f43004a;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return CloudQuotaUsage$AbuseInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AbuseInfo(int i11, long j11, AbstractC26805k1 abstractC26805k1) {
            if (1 != (i11 & 1)) {
                AbstractC26774a1.m137800b(i11, 1, CloudQuotaUsage$AbuseInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.f43004a = j11;
        }

        /* renamed from: a */
        public final long m41238a() {
            return this.f43004a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AbuseInfo) && this.f43004a == ((AbuseInfo) obj).f43004a;
        }

        public int hashCode() {
            return AbstractC2147g0.m11521a(this.f43004a);
        }

        public String toString() {
            return "AbuseInfo(removeTs=" + this.f43004a + ")";
        }

        public AbuseInfo(long j11) {
            this.f43004a = j11;
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
        public final CloudQuotaUsage m41239a() {
            return CloudQuotaUsage.f42996i;
        }

        /* renamed from: b */
        public final CloudQuotaUsage m41240b() {
            return CloudQuotaUsage.f42995h;
        }

        public final KSerializer serializer() {
            return CloudQuotaUsage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloudQuotaUsage(int i11, long j11, long j12, long j13, long j14, long j15, long j16, AbuseInfo abuseInfo, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, CloudQuotaUsage$$serializer.INSTANCE.getDescriptor());
        }
        this.f42997a = j11;
        if ((i11 & 2) == 0) {
            this.f42998b = 0L;
        } else {
            this.f42998b = j12;
        }
        if ((i11 & 4) == 0) {
            this.f42999c = 0L;
        } else {
            this.f42999c = j13;
        }
        if ((i11 & 8) == 0) {
            this.f43000d = 0L;
        } else {
            this.f43000d = j14;
        }
        if ((i11 & 16) == 0) {
            this.f43001e = 0L;
        } else {
            this.f43001e = j15;
        }
        if ((i11 & 32) == 0) {
            this.f43002f = 0L;
        } else {
            this.f43002f = j16;
        }
        this.f43003g = (i11 & 64) == 0 ? null : abuseInfo;
    }

    /* renamed from: m */
    private final boolean m41224m() {
        long j11 = this.f42999c + this.f43000d + this.f43001e + this.f43002f;
        long j12 = this.f42998b;
        double d11 = j11;
        return ((double) j12) * 0.95d <= d11 && d11 <= ((double) j12) * 1.05d;
    }

    /* renamed from: n */
    private final boolean m41225n(CloudQuotaUsage cloudQuotaUsage) {
        if (this.f42997a == cloudQuotaUsage.f42997a && this.f42998b == cloudQuotaUsage.f42998b && this.f42999c == cloudQuotaUsage.f42999c && this.f43000d == cloudQuotaUsage.f43000d && this.f43001e == cloudQuotaUsage.f43001e && this.f43002f == cloudQuotaUsage.f43002f) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final /* synthetic */ void m41226o(CloudQuotaUsage cloudQuotaUsage, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114022E(serialDescriptor, 0, cloudQuotaUsage.f42997a);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || cloudQuotaUsage.f42998b != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 1, cloudQuotaUsage.f42998b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || cloudQuotaUsage.f42999c != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 2, cloudQuotaUsage.f42999c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || cloudQuotaUsage.f43000d != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 3, cloudQuotaUsage.f43000d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || cloudQuotaUsage.f43001e != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 4, cloudQuotaUsage.f43001e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || cloudQuotaUsage.f43002f != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 5, cloudQuotaUsage.f43002f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || cloudQuotaUsage.f43003g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, CloudQuotaUsage$AbuseInfo$$serializer.INSTANCE, cloudQuotaUsage.f43003g);
        }
    }

    /* renamed from: c */
    public final AbuseInfo m41227c() {
        return this.f43003g;
    }

    /* renamed from: d */
    public final long m41228d() {
        return this.f43001e;
    }

    /* renamed from: e */
    public final long m41229e() {
        return this.f43002f;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof CloudQuotaUsage) || !m41225n((CloudQuotaUsage) obj))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final long m41230f() {
        return this.f42999c;
    }

    /* renamed from: g */
    public final long m41231g() {
        return this.f42997a;
    }

    /* renamed from: h */
    public final long m41232h() {
        return this.f42998b;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final long m41233i() {
        return this.f43000d;
    }

    /* renamed from: j */
    public final boolean m41234j() {
        return this.f42997a == -1;
    }

    /* renamed from: k */
    public final boolean m41235k() {
        return this.f42998b >= this.f42997a;
    }

    /* renamed from: l */
    public final boolean m41236l() {
        if (this.f42997a > 0 && m41224m()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "CloudQuotaUsage(total=" + this.f42997a + ", used=" + this.f42998b + ", photo=" + this.f42999c + ", video=" + this.f43000d + ", file=" + this.f43001e + ", others=" + this.f43002f + ", abuseInfo=" + this.f43003g + ")";
    }

    public CloudQuotaUsage(long j11, long j12, long j13, long j14, long j15, long j16, AbuseInfo abuseInfo) {
        this.f42997a = j11;
        this.f42998b = j12;
        this.f42999c = j13;
        this.f43000d = j14;
        this.f43001e = j15;
        this.f43002f = j16;
        this.f43003g = abuseInfo;
    }

    public /* synthetic */ CloudQuotaUsage(long j11, long j12, long j13, long j14, long j15, long j16, AbuseInfo abuseInfo, int i11, AbstractC19060k abstractC19060k) {
        this(j11, (i11 & 2) != 0 ? 0L : j12, (i11 & 4) != 0 ? 0L : j13, (i11 & 8) != 0 ? 0L : j14, (i11 & 16) != 0 ? 0L : j15, (i11 & 32) != 0 ? 0L : j16, (i11 & 64) != 0 ? null : abuseInfo);
    }
}
