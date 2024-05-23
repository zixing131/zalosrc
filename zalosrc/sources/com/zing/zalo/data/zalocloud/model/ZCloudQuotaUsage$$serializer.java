package com.zing.zalo.data.zalocloud.model;

import am.C0927o;
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
import p227i3.C20218v;
import rn0.AbstractC25935a;
import tn0.AbstractC26805k1;
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class ZCloudQuotaUsage$$serializer implements InterfaceC26842x {
    public static final ZCloudQuotaUsage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ZCloudQuotaUsage$$serializer zCloudQuotaUsage$$serializer = new ZCloudQuotaUsage$$serializer();
        INSTANCE = zCloudQuotaUsage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage", zCloudQuotaUsage$$serializer, 8);
        pluginGeneratedSerialDescriptor.m114047n("tq", false);
        pluginGeneratedSerialDescriptor.m114047n("uq", true);
        pluginGeneratedSerialDescriptor.m114047n("su", true);
        pluginGeneratedSerialDescriptor.m114047n("p", true);
        pluginGeneratedSerialDescriptor.m114047n(C20218v.f100059b, true);
        pluginGeneratedSerialDescriptor.m114047n("f", true);
        pluginGeneratedSerialDescriptor.m114047n(C0927o.f3427r, true);
        pluginGeneratedSerialDescriptor.m114047n("abs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ZCloudQuotaUsage$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        return new KSerializer[]{c26810m0, c26810m0, ZCloudQuotaUsage$ServiceUsage$$serializer.INSTANCE, c26810m0, c26810m0, c26810m0, c26810m0, AbstractC25935a.m133630u(ZCloudQuotaUsage$AbuseInfo$$serializer.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0071. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public ZCloudQuotaUsage deserialize(Decoder decoder) {
        int i11;
        ZCloudQuotaUsage.ServiceUsage serviceUsage;
        ZCloudQuotaUsage.AbuseInfo abuseInfo;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i12 = 7;
        ZCloudQuotaUsage.AbuseInfo abuseInfo2 = null;
        if (mo113968b.mo114015q()) {
            long mo114010f = mo113968b.mo114010f(descriptor2, 0);
            long mo114010f2 = mo113968b.mo114010f(descriptor2, 1);
            ZCloudQuotaUsage.ServiceUsage serviceUsage2 = (ZCloudQuotaUsage.ServiceUsage) mo113968b.mo114012l(descriptor2, 2, ZCloudQuotaUsage$ServiceUsage$$serializer.INSTANCE, null);
            long mo114010f3 = mo113968b.mo114010f(descriptor2, 3);
            long mo114010f4 = mo113968b.mo114010f(descriptor2, 4);
            long mo114010f5 = mo113968b.mo114010f(descriptor2, 5);
            long mo114010f6 = mo113968b.mo114010f(descriptor2, 6);
            serviceUsage = serviceUsage2;
            abuseInfo = (ZCloudQuotaUsage.AbuseInfo) mo113968b.mo114018x(descriptor2, 7, ZCloudQuotaUsage$AbuseInfo$$serializer.INSTANCE, null);
            j11 = mo114010f6;
            j12 = mo114010f4;
            j13 = mo114010f2;
            j14 = mo114010f;
            j15 = mo114010f3;
            j16 = mo114010f5;
            i11 = 255;
        } else {
            long j17 = 0;
            ZCloudQuotaUsage.ServiceUsage serviceUsage3 = null;
            long j18 = 0;
            long j19 = 0;
            long j21 = 0;
            long j22 = 0;
            long j23 = 0;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i12 = 7;
                        z11 = false;
                    case 0:
                        j21 = mo113968b.mo114010f(descriptor2, 0);
                        i13 |= 1;
                        i12 = 7;
                    case 1:
                        j19 = mo113968b.mo114010f(descriptor2, 1);
                        i13 |= 2;
                    case 2:
                        serviceUsage3 = (ZCloudQuotaUsage.ServiceUsage) mo113968b.mo114012l(descriptor2, 2, ZCloudQuotaUsage$ServiceUsage$$serializer.INSTANCE, serviceUsage3);
                        i13 |= 4;
                    case 3:
                        j22 = mo113968b.mo114010f(descriptor2, 3);
                        i13 |= 8;
                    case 4:
                        j18 = mo113968b.mo114010f(descriptor2, 4);
                        i13 |= 16;
                    case 5:
                        j23 = mo113968b.mo114010f(descriptor2, 5);
                        i13 |= 32;
                    case 6:
                        j17 = mo113968b.mo114010f(descriptor2, 6);
                        i13 |= 64;
                    case 7:
                        abuseInfo2 = (ZCloudQuotaUsage.AbuseInfo) mo113968b.mo114018x(descriptor2, i12, ZCloudQuotaUsage$AbuseInfo$$serializer.INSTANCE, abuseInfo2);
                        i13 |= 128;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i13;
            serviceUsage = serviceUsage3;
            abuseInfo = abuseInfo2;
            j11 = j17;
            j12 = j18;
            j13 = j19;
            j14 = j21;
            j15 = j22;
            j16 = j23;
        }
        mo113968b.mo114009c(descriptor2);
        return new ZCloudQuotaUsage(i11, j14, j13, serviceUsage, j15, j12, j16, j11, abuseInfo, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ZCloudQuotaUsage zCloudQuotaUsage) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(zCloudQuotaUsage, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        ZCloudQuotaUsage.m41244r(zCloudQuotaUsage, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
