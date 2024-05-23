package com.zing.zalo.data.zalocloud.model;

import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
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
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class ZCloudQuotaUsage$ServiceUsage$$serializer implements InterfaceC26842x {
    public static final ZCloudQuotaUsage$ServiceUsage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ZCloudQuotaUsage$ServiceUsage$$serializer zCloudQuotaUsage$ServiceUsage$$serializer = new ZCloudQuotaUsage$ServiceUsage$$serializer();
        INSTANCE = zCloudQuotaUsage$ServiceUsage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage.ServiceUsage", zCloudQuotaUsage$ServiceUsage$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("cm", true);
        pluginGeneratedSerialDescriptor.m114047n("mc", true);
        pluginGeneratedSerialDescriptor.m114047n("mb", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ZCloudQuotaUsage$ServiceUsage$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        return new KSerializer[]{c26810m0, c26810m0, c26810m0};
    }

    @Override // qn0.InterfaceC25386a
    public ZCloudQuotaUsage.ServiceUsage deserialize(Decoder decoder) {
        int i11;
        long j11;
        long j12;
        long j13;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            long mo114010f = mo113968b.mo114010f(descriptor2, 0);
            long mo114010f2 = mo113968b.mo114010f(descriptor2, 1);
            j11 = mo113968b.mo114010f(descriptor2, 2);
            j12 = mo114010f;
            j13 = mo114010f2;
            i11 = 7;
        } else {
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    j15 = mo113968b.mo114010f(descriptor2, 0);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    j16 = mo113968b.mo114010f(descriptor2, 1);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    j14 = mo113968b.mo114010f(descriptor2, 2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            j11 = j14;
            j12 = j15;
            j13 = j16;
        }
        mo113968b.mo114009c(descriptor2);
        return new ZCloudQuotaUsage.ServiceUsage(i11, j12, j13, j11, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ZCloudQuotaUsage.ServiceUsage serviceUsage) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(serviceUsage, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        ZCloudQuotaUsage.ServiceUsage.m41264d(serviceUsage, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
