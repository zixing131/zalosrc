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
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class CloudSubscriptionInfo$$serializer implements InterfaceC26842x {
    public static final CloudSubscriptionInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CloudSubscriptionInfo$$serializer cloudSubscriptionInfo$$serializer = new CloudSubscriptionInfo$$serializer();
        INSTANCE = cloudSubscriptionInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.CloudSubscriptionInfo", cloudSubscriptionInfo$$serializer, 10);
        pluginGeneratedSerialDescriptor.m114047n("auto_renew_product_id", false);
        pluginGeneratedSerialDescriptor.m114047n("product_id", false);
        pluginGeneratedSerialDescriptor.m114047n("subscription_time", false);
        pluginGeneratedSerialDescriptor.m114047n("origin_trans_id", false);
        pluginGeneratedSerialDescriptor.m114047n("expire_time", false);
        pluginGeneratedSerialDescriptor.m114047n("subscription_gw", false);
        pluginGeneratedSerialDescriptor.m114047n("status", false);
        pluginGeneratedSerialDescriptor.m114047n("total_cloud", false);
        pluginGeneratedSerialDescriptor.m114047n("duration_months", false);
        pluginGeneratedSerialDescriptor.m114047n("price", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CloudSubscriptionInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26810m0 c26810m0 = C26810m0.f127024a;
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26814n1, c26814n1, c26810m0, c26814n1, c26810m0, c26783d0, c26783d0, c26810m0, c26783d0, c26814n1};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x007e. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public CloudSubscriptionInfo deserialize(Decoder decoder) {
        String str;
        int i11;
        String str2;
        int i12;
        int i13;
        int i14;
        String str3;
        long j11;
        String str4;
        long j12;
        long j13;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i15 = 0;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 1);
            long mo114010f = mo113968b.mo114010f(descriptor2, 2);
            String mo114014o3 = mo113968b.mo114014o(descriptor2, 3);
            long mo114010f2 = mo113968b.mo114010f(descriptor2, 4);
            int mo114011i = mo113968b.mo114011i(descriptor2, 5);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 6);
            long mo114010f3 = mo113968b.mo114010f(descriptor2, 7);
            int mo114011i3 = mo113968b.mo114011i(descriptor2, 8);
            str = mo114014o;
            str2 = mo113968b.mo114014o(descriptor2, 9);
            i12 = mo114011i3;
            i13 = mo114011i2;
            i14 = mo114011i;
            str3 = mo114014o3;
            j11 = mo114010f2;
            str4 = mo114014o2;
            j12 = mo114010f;
            j13 = mo114010f3;
            i11 = 1023;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            String str8 = null;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z11 = false;
                    case 0:
                        i15 |= 1;
                        str5 = mo113968b.mo114014o(descriptor2, 0);
                    case 1:
                        str7 = mo113968b.mo114014o(descriptor2, 1);
                        i15 |= 2;
                    case 2:
                        j15 = mo113968b.mo114010f(descriptor2, 2);
                        i15 |= 4;
                    case 3:
                        str6 = mo113968b.mo114014o(descriptor2, 3);
                        i15 |= 8;
                    case 4:
                        j14 = mo113968b.mo114010f(descriptor2, 4);
                        i15 |= 16;
                    case 5:
                        i18 = mo113968b.mo114011i(descriptor2, 5);
                        i15 |= 32;
                    case 6:
                        i17 = mo113968b.mo114011i(descriptor2, 6);
                        i15 |= 64;
                    case 7:
                        j16 = mo113968b.mo114010f(descriptor2, 7);
                        i15 |= 128;
                    case 8:
                        i16 = mo113968b.mo114011i(descriptor2, 8);
                        i15 |= 256;
                    case 9:
                        str8 = mo113968b.mo114014o(descriptor2, 9);
                        i15 |= 512;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            str = str5;
            i11 = i15;
            str2 = str8;
            i12 = i16;
            i13 = i17;
            i14 = i18;
            str3 = str6;
            j11 = j14;
            str4 = str7;
            j12 = j15;
            j13 = j16;
        }
        mo113968b.mo114009c(descriptor2);
        return new CloudSubscriptionInfo(i11, str, str4, j12, str3, j11, i14, i13, j13, i12, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, CloudSubscriptionInfo cloudSubscriptionInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(cloudSubscriptionInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        CloudSubscriptionInfo.m41316g(cloudSubscriptionInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
