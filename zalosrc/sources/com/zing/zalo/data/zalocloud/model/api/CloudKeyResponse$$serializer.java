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
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class CloudKeyResponse$$serializer implements InterfaceC26842x {
    public static final CloudKeyResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CloudKeyResponse$$serializer cloudKeyResponse$$serializer = new CloudKeyResponse$$serializer();
        INSTANCE = cloudKeyResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.CloudKeyResponse", cloudKeyResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.m114047n("key_version", false);
        pluginGeneratedSerialDescriptor.m114047n("public_key", false);
        pluginGeneratedSerialDescriptor.m114047n("encrypted_private_key", false);
        pluginGeneratedSerialDescriptor.m114047n("encrypt_type", false);
        pluginGeneratedSerialDescriptor.m114047n("error_code", true);
        pluginGeneratedSerialDescriptor.m114047n("max_attempts", true);
        pluginGeneratedSerialDescriptor.m114047n("attempt_left", true);
        pluginGeneratedSerialDescriptor.m114047n("unlock_ts", true);
        pluginGeneratedSerialDescriptor.m114047n("last_submit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CloudKeyResponse$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26810m0 c26810m0 = C26810m0.f127024a;
        return new KSerializer[]{c26783d0, c26814n1, c26814n1, c26783d0, c26783d0, c26783d0, c26783d0, c26810m0, c26810m0};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0075. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public CloudKeyResponse deserialize(Decoder decoder) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        String str2;
        long j11;
        long j12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            String mo114014o = mo113968b.mo114014o(descriptor2, 1);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 2);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 3);
            int mo114011i3 = mo113968b.mo114011i(descriptor2, 4);
            int mo114011i4 = mo113968b.mo114011i(descriptor2, 5);
            i11 = mo114011i;
            i13 = mo113968b.mo114011i(descriptor2, 6);
            i14 = mo114011i4;
            i15 = mo114011i2;
            i16 = mo114011i3;
            str = mo114014o2;
            str2 = mo114014o;
            j11 = mo113968b.mo114010f(descriptor2, 7);
            j12 = mo113968b.mo114010f(descriptor2, 8);
            i12 = 511;
        } else {
            String str3 = null;
            String str4 = null;
            long j13 = 0;
            long j14 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z11 = false;
                    case 0:
                        i17 = mo113968b.mo114011i(descriptor2, 0);
                        i18 |= 1;
                    case 1:
                        str4 = mo113968b.mo114014o(descriptor2, 1);
                        i18 |= 2;
                    case 2:
                        str3 = mo113968b.mo114014o(descriptor2, 2);
                        i18 |= 4;
                    case 3:
                        i22 = mo113968b.mo114011i(descriptor2, 3);
                        i18 |= 8;
                    case 4:
                        i23 = mo113968b.mo114011i(descriptor2, 4);
                        i18 |= 16;
                    case 5:
                        i21 = mo113968b.mo114011i(descriptor2, 5);
                        i18 |= 32;
                    case 6:
                        i19 = mo113968b.mo114011i(descriptor2, 6);
                        i18 |= 64;
                    case 7:
                        j13 = mo113968b.mo114010f(descriptor2, 7);
                        i18 |= 128;
                    case 8:
                        j14 = mo113968b.mo114010f(descriptor2, 8);
                        i18 |= 256;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i17;
            i12 = i18;
            i13 = i19;
            i14 = i21;
            i15 = i22;
            i16 = i23;
            str = str3;
            str2 = str4;
            j11 = j13;
            j12 = j14;
        }
        mo113968b.mo114009c(descriptor2);
        return new CloudKeyResponse(i12, i11, str2, str, i15, i16, i14, i13, j11, j12, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, CloudKeyResponse cloudKeyResponse) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(cloudKeyResponse, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        CloudKeyResponse.m41277n(cloudKeyResponse, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
