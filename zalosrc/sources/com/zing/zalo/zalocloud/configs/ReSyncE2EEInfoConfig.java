package com.zing.zalo.zalocloud.configs;

import androidx.work.AbstractC2147g0;
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
public final class ReSyncE2EEInfoConfig {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f85333a;

    /* renamed from: b */
    private final long f85334b;

    /* renamed from: c */
    private final int f85335c;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ReSyncE2EEInfoConfig m89775a(String str) {
            AbstractC19074t.m100208f(str, "json");
            if (str.length() == 0) {
                C26676b.m136958h("Parse ReSync E2EE config: Empty json", null, 2, null);
                return new ReSyncE2EEInfoConfig(0, 0L, 0, 7, (AbstractC19060k) null);
            }
            try {
                AbstractC27323a m145315b = C29085a.f134890a.m145315b();
                m145315b.mo131586a();
                return (ReSyncE2EEInfoConfig) m145315b.m139867d(ReSyncE2EEInfoConfig.Companion.serializer(), str);
            } catch (Exception e11) {
                C26676b.m136953c(e11);
                return new ReSyncE2EEInfoConfig(0, 0L, 0, 7, (AbstractC19060k) null);
            }
        }

        public final KSerializer serializer() {
            return ReSyncE2EEInfoConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReSyncE2EEInfoConfig(int i11, int i12, long j11, int i13, AbstractC26805k1 abstractC26805k1) {
        this.f85333a = (i11 & 1) == 0 ? 1 : i12;
        if ((i11 & 2) == 0) {
            this.f85334b = 300000L;
        } else {
            this.f85334b = j11;
        }
        if ((i11 & 4) == 0) {
            this.f85335c = 10;
        } else {
            this.f85335c = i13;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m89771d(ReSyncE2EEInfoConfig reSyncE2EEInfoConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || reSyncE2EEInfoConfig.f85333a != 1) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, reSyncE2EEInfoConfig.f85333a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || reSyncE2EEInfoConfig.f85334b != 300000) {
            interfaceC21886d.mo114022E(serialDescriptor, 1, reSyncE2EEInfoConfig.f85334b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || reSyncE2EEInfoConfig.f85335c != 10) {
            interfaceC21886d.mo114033x(serialDescriptor, 2, reSyncE2EEInfoConfig.f85335c);
        }
    }

    /* renamed from: a */
    public final int m89772a() {
        return this.f85335c;
    }

    /* renamed from: b */
    public final int m89773b() {
        return this.f85333a;
    }

    /* renamed from: c */
    public final long m89774c() {
        return this.f85334b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReSyncE2EEInfoConfig)) {
            return false;
        }
        ReSyncE2EEInfoConfig reSyncE2EEInfoConfig = (ReSyncE2EEInfoConfig) obj;
        return this.f85333a == reSyncE2EEInfoConfig.f85333a && this.f85334b == reSyncE2EEInfoConfig.f85334b && this.f85335c == reSyncE2EEInfoConfig.f85335c;
    }

    public int hashCode() {
        return (((this.f85333a * 31) + AbstractC2147g0.m11521a(this.f85334b)) * 31) + this.f85335c;
    }

    public String toString() {
        return "ReSyncE2EEInfoConfig(enable=" + this.f85333a + ", timeThreshold=" + this.f85334b + ", batchSize=" + this.f85335c + ")";
    }

    public ReSyncE2EEInfoConfig(int i11, long j11, int i12) {
        this.f85333a = i11;
        this.f85334b = j11;
        this.f85335c = i12;
    }

    public /* synthetic */ ReSyncE2EEInfoConfig(int i11, long j11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 1 : i11, (i13 & 2) != 0 ? 300000L : j11, (i13 & 4) != 0 ? 10 : i12);
    }
}
