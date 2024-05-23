package com.zing.zalo.data.zalocloud.model;

import am.C0927o;
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
import p227i3.C20218v;
import rn0.AbstractC25935a;
import tn0.AbstractC26805k1;
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class CloudQuotaUsage$$serializer implements InterfaceC26842x {
    public static final CloudQuotaUsage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CloudQuotaUsage$$serializer cloudQuotaUsage$$serializer = new CloudQuotaUsage$$serializer();
        INSTANCE = cloudQuotaUsage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.CloudQuotaUsage", cloudQuotaUsage$$serializer, 7);
        pluginGeneratedSerialDescriptor.m114047n("tq", false);
        pluginGeneratedSerialDescriptor.m114047n("uq", true);
        pluginGeneratedSerialDescriptor.m114047n("p", true);
        pluginGeneratedSerialDescriptor.m114047n(C20218v.f100059b, true);
        pluginGeneratedSerialDescriptor.m114047n("f", true);
        pluginGeneratedSerialDescriptor.m114047n(C0927o.f3427r, true);
        pluginGeneratedSerialDescriptor.m114047n("abs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CloudQuotaUsage$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        return new KSerializer[]{c26810m0, c26810m0, c26810m0, c26810m0, c26810m0, c26810m0, AbstractC25935a.m133630u(CloudQuotaUsage$AbuseInfo$$serializer.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0064. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public CloudQuotaUsage deserialize(Decoder decoder) {
        int i11;
        CloudQuotaUsage.AbuseInfo abuseInfo;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        CloudQuotaUsage.AbuseInfo abuseInfo2 = null;
        if (mo113968b.mo114015q()) {
            long mo114010f = mo113968b.mo114010f(descriptor2, 0);
            long mo114010f2 = mo113968b.mo114010f(descriptor2, 1);
            long mo114010f3 = mo113968b.mo114010f(descriptor2, 2);
            long mo114010f4 = mo113968b.mo114010f(descriptor2, 3);
            long mo114010f5 = mo113968b.mo114010f(descriptor2, 4);
            long mo114010f6 = mo113968b.mo114010f(descriptor2, 5);
            abuseInfo = (CloudQuotaUsage.AbuseInfo) mo113968b.mo114018x(descriptor2, 6, CloudQuotaUsage$AbuseInfo$$serializer.INSTANCE, null);
            j11 = mo114010f5;
            j12 = mo114010f2;
            j13 = mo114010f;
            j14 = mo114010f3;
            j15 = mo114010f4;
            j16 = mo114010f6;
            i11 = 127;
        } else {
            long j17 = 0;
            long j18 = 0;
            long j19 = 0;
            long j21 = 0;
            long j22 = 0;
            long j23 = 0;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z11 = false;
                    case 0:
                        j19 = mo113968b.mo114010f(descriptor2, 0);
                        i12 |= 1;
                    case 1:
                        j18 = mo113968b.mo114010f(descriptor2, 1);
                        i12 |= 2;
                    case 2:
                        j21 = mo113968b.mo114010f(descriptor2, 2);
                        i12 |= 4;
                    case 3:
                        j22 = mo113968b.mo114010f(descriptor2, 3);
                        i12 |= 8;
                    case 4:
                        j17 = mo113968b.mo114010f(descriptor2, 4);
                        i12 |= 16;
                    case 5:
                        j23 = mo113968b.mo114010f(descriptor2, 5);
                        i12 |= 32;
                    case 6:
                        abuseInfo2 = (CloudQuotaUsage.AbuseInfo) mo113968b.mo114018x(descriptor2, 6, CloudQuotaUsage$AbuseInfo$$serializer.INSTANCE, abuseInfo2);
                        i12 |= 64;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i12;
            abuseInfo = abuseInfo2;
            j11 = j17;
            j12 = j18;
            j13 = j19;
            j14 = j21;
            j15 = j22;
            j16 = j23;
        }
        mo113968b.mo114009c(descriptor2);
        return new CloudQuotaUsage(i11, j13, j12, j14, j15, j11, j16, abuseInfo, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, CloudQuotaUsage cloudQuotaUsage) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(cloudQuotaUsage, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        CloudQuotaUsage.m41226o(cloudQuotaUsage, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
