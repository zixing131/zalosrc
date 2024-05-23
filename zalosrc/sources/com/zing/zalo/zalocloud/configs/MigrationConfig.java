package com.zing.zalo.zalocloud.configs;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import p613wl.C29085a;
import qn0.InterfaceC25392g;
import tg0.C26676b;
import tn0.AbstractC26805k1;
import un0.AbstractC27323a;

@InterfaceC25392g
/* loaded from: classes7.dex */
public final class MigrationConfig {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f85327a;

    /* renamed from: b */
    private final int f85328b;

    /* renamed from: c */
    private final int f85329c;

    /* renamed from: d */
    private final int f85330d;

    /* renamed from: e */
    private final int f85331e;

    /* renamed from: f */
    private final int f85332f;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final MigrationConfig m89770a(String str) {
            AbstractC19074t.m100208f(str, "json");
            if (str.length() == 0) {
                C26676b.m136958h("Parse Migration config: Empty json", null, 2, null);
                return new MigrationConfig(0, 0, 0, 0, 0, 0, 63, (AbstractC19060k) null);
            }
            try {
                AbstractC27323a m145315b = C29085a.f134890a.m145315b();
                m145315b.mo131586a();
                return (MigrationConfig) m145315b.m139867d(MigrationConfig.Companion.serializer(), str);
            } catch (Exception e11) {
                C26676b.m136953c(e11);
                return new MigrationConfig(0, 0, 0, 0, 0, 0, 63, (AbstractC19060k) null);
            }
        }

        public final KSerializer serializer() {
            return MigrationConfig$$serializer.INSTANCE;
        }
    }

    public MigrationConfig(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f85327a = i11;
        this.f85328b = i12;
        this.f85329c = i13;
        this.f85330d = i14;
        this.f85331e = i15;
        this.f85332f = i16;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m89764f(MigrationConfig migrationConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || migrationConfig.f85327a != 1) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, migrationConfig.f85327a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || migrationConfig.f85328b != 14) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, migrationConfig.f85328b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || migrationConfig.f85329c != 15) {
            interfaceC21886d.mo114033x(serialDescriptor, 2, migrationConfig.f85329c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || migrationConfig.f85330d != 7) {
            interfaceC21886d.mo114033x(serialDescriptor, 3, migrationConfig.f85330d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || migrationConfig.f85331e != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 4, migrationConfig.f85331e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || migrationConfig.f85332f != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 5, migrationConfig.f85332f);
        }
    }

    /* renamed from: a */
    public final int m89765a() {
        return this.f85330d;
    }

    /* renamed from: b */
    public final int m89766b() {
        return this.f85327a;
    }

    /* renamed from: c */
    public final int m89767c() {
        return this.f85331e;
    }

    /* renamed from: d */
    public final int m89768d() {
        return this.f85332f;
    }

    /* renamed from: e */
    public final int m89769e() {
        return this.f85328b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MigrationConfig)) {
            return false;
        }
        MigrationConfig migrationConfig = (MigrationConfig) obj;
        return this.f85327a == migrationConfig.f85327a && this.f85328b == migrationConfig.f85328b && this.f85329c == migrationConfig.f85329c && this.f85330d == migrationConfig.f85330d && this.f85331e == migrationConfig.f85331e && this.f85332f == migrationConfig.f85332f;
    }

    public int hashCode() {
        return (((((((((this.f85327a * 31) + this.f85328b) * 31) + this.f85329c) * 31) + this.f85330d) * 31) + this.f85331e) * 31) + this.f85332f;
    }

    public String toString() {
        return "MigrationConfig(enable=" + this.f85327a + ", serverMigrateDayThreshold=" + this.f85328b + ", lowBatteryThreshold=" + this.f85329c + ", autoSkipGGDriveDays=" + this.f85330d + ", enableBannerTabMsg=" + this.f85331e + ", enableNotification=" + this.f85332f + ")";
    }

    public /* synthetic */ MigrationConfig(int i11, int i12, int i13, int i14, int i15, int i16, int i17, AbstractC26805k1 abstractC26805k1) {
        this.f85327a = (i11 & 1) == 0 ? 1 : i12;
        if ((i11 & 2) == 0) {
            this.f85328b = 14;
        } else {
            this.f85328b = i13;
        }
        if ((i11 & 4) == 0) {
            this.f85329c = 15;
        } else {
            this.f85329c = i14;
        }
        if ((i11 & 8) == 0) {
            this.f85330d = 7;
        } else {
            this.f85330d = i15;
        }
        if ((i11 & 16) == 0) {
            this.f85331e = 0;
        } else {
            this.f85331e = i16;
        }
        if ((i11 & 32) == 0) {
            this.f85332f = 0;
        } else {
            this.f85332f = i17;
        }
    }

    public /* synthetic */ MigrationConfig(int i11, int i12, int i13, int i14, int i15, int i16, int i17, AbstractC19060k abstractC19060k) {
        this((i17 & 1) != 0 ? 1 : i11, (i17 & 2) != 0 ? 14 : i12, (i17 & 4) != 0 ? 15 : i13, (i17 & 8) != 0 ? 7 : i14, (i17 & 16) != 0 ? 0 : i15, (i17 & 32) != 0 ? 0 : i16);
    }
}
