package com.zing.zalo.feed.models;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import nh0.C23793c;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes4.dex */
public final class MemoryEntryTrackingData {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f45954a;

    /* renamed from: b */
    private int f45955b;

    /* renamed from: c */
    private boolean f45956c;

    /* renamed from: d */
    private long f45957d;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return MemoryEntryTrackingData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemoryEntryTrackingData(int i11, String str, int i12, boolean z11, long j11, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, MemoryEntryTrackingData$$serializer.INSTANCE.getDescriptor());
        }
        this.f45954a = str;
        if ((i11 & 2) == 0) {
            this.f45955b = 0;
        } else {
            this.f45955b = i12;
        }
        if ((i11 & 4) == 0) {
            this.f45956c = false;
        } else {
            this.f45956c = z11;
        }
        if ((i11 & 8) == 0) {
            this.f45957d = C23793c.Companion.m124321a().mo124314i();
        } else {
            this.f45957d = j11;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m45093g(MemoryEntryTrackingData memoryEntryTrackingData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, memoryEntryTrackingData.f45954a);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || memoryEntryTrackingData.f45955b != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, memoryEntryTrackingData.f45955b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || memoryEntryTrackingData.f45956c) {
            interfaceC21886d.mo114034y(serialDescriptor, 2, memoryEntryTrackingData.f45956c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || memoryEntryTrackingData.f45957d != C23793c.Companion.m124321a().mo124314i()) {
            interfaceC21886d.mo114022E(serialDescriptor, 3, memoryEntryTrackingData.f45957d);
        }
    }

    /* renamed from: a */
    public final String m45094a() {
        return this.f45954a;
    }

    /* renamed from: b */
    public final int m45095b() {
        return this.f45955b;
    }

    /* renamed from: c */
    public final long m45096c() {
        return this.f45957d;
    }

    /* renamed from: d */
    public final boolean m45097d() {
        return this.f45956c;
    }

    /* renamed from: e */
    public final void m45098e(boolean z11) {
        this.f45956c = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryEntryTrackingData)) {
            return false;
        }
        MemoryEntryTrackingData memoryEntryTrackingData = (MemoryEntryTrackingData) obj;
        return AbstractC19074t.m100204b(this.f45954a, memoryEntryTrackingData.f45954a) && this.f45955b == memoryEntryTrackingData.f45955b && this.f45956c == memoryEntryTrackingData.f45956c && this.f45957d == memoryEntryTrackingData.f45957d;
    }

    /* renamed from: f */
    public final void m45099f(int i11) {
        this.f45955b = i11;
    }

    public int hashCode() {
        return (((((this.f45954a.hashCode() * 31) + this.f45955b) * 31) + AbstractC2144f.m11520a(this.f45956c)) * 31) + AbstractC2147g0.m11521a(this.f45957d);
    }

    public String toString() {
        return "MemoryEntryTrackingData(memoryEntryId=" + this.f45954a + ", refreshCount=" + this.f45955b + ", isClicked=" + this.f45956c + ", timeVisible=" + this.f45957d + ")";
    }

    public MemoryEntryTrackingData(String str, int i11, boolean z11, long j11) {
        AbstractC19074t.m100208f(str, "memoryEntryId");
        this.f45954a = str;
        this.f45955b = i11;
        this.f45956c = z11;
        this.f45957d = j11;
    }

    public /* synthetic */ MemoryEntryTrackingData(String str, int i11, boolean z11, long j11, int i12, AbstractC19060k abstractC19060k) {
        this(str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? C23793c.Companion.m124321a().mo124314i() : j11);
    }
}
