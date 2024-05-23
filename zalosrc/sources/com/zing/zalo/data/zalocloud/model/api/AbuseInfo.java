package com.zing.zalo.data.zalocloud.model.api;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class AbuseInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final long f43019a;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return AbuseInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AbuseInfo(int i11, long j11, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, AbuseInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f43019a = j11;
    }

    /* renamed from: a */
    public final long m41269a() {
        return this.f43019a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbuseInfo) && this.f43019a == ((AbuseInfo) obj).f43019a;
    }

    public int hashCode() {
        return AbstractC2147g0.m11521a(this.f43019a);
    }

    public String toString() {
        return "AbuseInfo(removeTs=" + this.f43019a + ")";
    }
}
