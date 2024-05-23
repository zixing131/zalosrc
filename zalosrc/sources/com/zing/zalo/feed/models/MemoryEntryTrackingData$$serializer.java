package com.zing.zalo.feed.models;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class MemoryEntryTrackingData$$serializer implements InterfaceC26842x {
    public static final MemoryEntryTrackingData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MemoryEntryTrackingData$$serializer memoryEntryTrackingData$$serializer = new MemoryEntryTrackingData$$serializer();
        INSTANCE = memoryEntryTrackingData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.models.MemoryEntryTrackingData", memoryEntryTrackingData$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("memoryEntryId", false);
        pluginGeneratedSerialDescriptor.m114047n("refreshCount", true);
        pluginGeneratedSerialDescriptor.m114047n("isClicked", true);
        pluginGeneratedSerialDescriptor.m114047n("timeVisible", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MemoryEntryTrackingData$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26814n1.f127034a, C26783d0.f126989a, C26794h.f127000a, C26810m0.f127024a};
    }

    @Override // qn0.InterfaceC25386a
    public MemoryEntryTrackingData deserialize(Decoder decoder) {
        String str;
        int i11;
        boolean z11;
        int i12;
        long j11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            int mo114011i = mo113968b.mo114011i(descriptor2, 1);
            str = mo114014o;
            z11 = mo113968b.mo114004D(descriptor2, 2);
            i12 = mo114011i;
            j11 = mo113968b.mo114010f(descriptor2, 3);
            i11 = 15;
        } else {
            String str2 = null;
            long j12 = 0;
            int i13 = 0;
            boolean z12 = false;
            int i14 = 0;
            boolean z13 = true;
            while (z13) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z13 = false;
                } else if (mo114037p == 0) {
                    str2 = mo113968b.mo114014o(descriptor2, 0);
                    i13 |= 1;
                } else if (mo114037p == 1) {
                    i14 = mo113968b.mo114011i(descriptor2, 1);
                    i13 |= 2;
                } else if (mo114037p == 2) {
                    z12 = mo113968b.mo114004D(descriptor2, 2);
                    i13 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    j12 = mo113968b.mo114010f(descriptor2, 3);
                    i13 |= 8;
                }
            }
            str = str2;
            i11 = i13;
            z11 = z12;
            i12 = i14;
            j11 = j12;
        }
        mo113968b.mo114009c(descriptor2);
        return new MemoryEntryTrackingData(i11, str, i12, z11, j11, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, MemoryEntryTrackingData memoryEntryTrackingData) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(memoryEntryTrackingData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        MemoryEntryTrackingData.m45093g(memoryEntryTrackingData, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
