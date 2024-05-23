package com.zing.zalo.data.zalocloud.model;

import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class CloudQuotaUsage$AbuseInfo$$serializer implements InterfaceC26842x {
    public static final CloudQuotaUsage$AbuseInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CloudQuotaUsage$AbuseInfo$$serializer cloudQuotaUsage$AbuseInfo$$serializer = new CloudQuotaUsage$AbuseInfo$$serializer();
        INSTANCE = cloudQuotaUsage$AbuseInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.CloudQuotaUsage.AbuseInfo", cloudQuotaUsage$AbuseInfo$$serializer, 1);
        pluginGeneratedSerialDescriptor.m114047n("rmts", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CloudQuotaUsage$AbuseInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26810m0.f127024a};
    }

    @Override // qn0.InterfaceC25386a
    public CloudQuotaUsage.AbuseInfo deserialize(Decoder decoder) {
        long j11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i11 = 1;
        if (mo113968b.mo114015q()) {
            j11 = mo113968b.mo114010f(descriptor2, 0);
        } else {
            long j12 = 0;
            int i12 = 0;
            while (i11 != 0) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    i11 = 0;
                } else {
                    if (mo114037p != 0) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    j12 = mo113968b.mo114010f(descriptor2, 0);
                    i12 |= 1;
                }
            }
            i11 = i12;
            j11 = j12;
        }
        mo113968b.mo114009c(descriptor2);
        return new CloudQuotaUsage.AbuseInfo(i11, j11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, CloudQuotaUsage.AbuseInfo abuseInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(abuseInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        mo113984b.mo114022E(descriptor2, 0, abuseInfo.f43004a);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
