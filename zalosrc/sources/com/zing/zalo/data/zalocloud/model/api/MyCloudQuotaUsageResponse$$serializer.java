package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import rn0.AbstractC25935a;
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class MyCloudQuotaUsageResponse$$serializer implements InterfaceC26842x {
    public static final MyCloudQuotaUsageResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MyCloudQuotaUsageResponse$$serializer myCloudQuotaUsageResponse$$serializer = new MyCloudQuotaUsageResponse$$serializer();
        INSTANCE = myCloudQuotaUsageResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.MyCloudQuotaUsageResponse", myCloudQuotaUsageResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("plan", true);
        pluginGeneratedSerialDescriptor.m114047n("quota", false);
        pluginGeneratedSerialDescriptor.m114047n("usage", false);
        pluginGeneratedSerialDescriptor.m114047n("abuse_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MyCloudQuotaUsageResponse$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        return new KSerializer[]{C26783d0.f126989a, c26810m0, c26810m0, AbstractC25935a.m133630u(AbuseInfo$$serializer.INSTANCE)};
    }

    @Override // qn0.InterfaceC25386a
    public MyCloudQuotaUsageResponse deserialize(Decoder decoder) {
        int i11;
        int i12;
        long j11;
        AbuseInfo abuseInfo;
        long j12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            long mo114010f = mo113968b.mo114010f(descriptor2, 1);
            long mo114010f2 = mo113968b.mo114010f(descriptor2, 2);
            i11 = mo114011i;
            abuseInfo = (AbuseInfo) mo113968b.mo114018x(descriptor2, 3, AbuseInfo$$serializer.INSTANCE, null);
            j11 = mo114010f;
            j12 = mo114010f2;
            i12 = 15;
        } else {
            long j13 = 0;
            AbuseInfo abuseInfo2 = null;
            long j14 = 0;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i13 = mo113968b.mo114011i(descriptor2, 0);
                    i14 |= 1;
                } else if (mo114037p == 1) {
                    j13 = mo113968b.mo114010f(descriptor2, 1);
                    i14 |= 2;
                } else if (mo114037p == 2) {
                    j14 = mo113968b.mo114010f(descriptor2, 2);
                    i14 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    abuseInfo2 = (AbuseInfo) mo113968b.mo114018x(descriptor2, 3, AbuseInfo$$serializer.INSTANCE, abuseInfo2);
                    i14 |= 8;
                }
            }
            i11 = i13;
            i12 = i14;
            j11 = j13;
            abuseInfo = abuseInfo2;
            j12 = j14;
        }
        mo113968b.mo114009c(descriptor2);
        return new MyCloudQuotaUsageResponse(i12, i11, j11, j12, abuseInfo, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, MyCloudQuotaUsageResponse myCloudQuotaUsageResponse) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(myCloudQuotaUsageResponse, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        MyCloudQuotaUsageResponse.m41371e(myCloudQuotaUsageResponse, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
