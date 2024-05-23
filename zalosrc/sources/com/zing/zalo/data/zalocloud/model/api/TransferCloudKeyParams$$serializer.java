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
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class TransferCloudKeyParams$$serializer implements InterfaceC26842x {
    public static final TransferCloudKeyParams$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TransferCloudKeyParams$$serializer transferCloudKeyParams$$serializer = new TransferCloudKeyParams$$serializer();
        INSTANCE = transferCloudKeyParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.TransferCloudKeyParams", transferCloudKeyParams$$serializer, 6);
        pluginGeneratedSerialDescriptor.m114047n("session_id", false);
        pluginGeneratedSerialDescriptor.m114047n("device_name", false);
        pluginGeneratedSerialDescriptor.m114047n("user_action", false);
        pluginGeneratedSerialDescriptor.m114047n("key_version", false);
        pluginGeneratedSerialDescriptor.m114047n("public_key", false);
        pluginGeneratedSerialDescriptor.m114047n("encrypted_private_key", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TransferCloudKeyParams$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26814n1, c26814n1, c26783d0, c26783d0, c26814n1, c26814n1};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0052. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public TransferCloudKeyParams deserialize(Decoder decoder) {
        String str;
        String str2;
        int i11;
        String str3;
        int i12;
        String str4;
        int i13;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 1);
            int mo114011i = mo113968b.mo114011i(descriptor2, 2);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 3);
            String mo114014o3 = mo113968b.mo114014o(descriptor2, 4);
            str = mo114014o;
            str2 = mo113968b.mo114014o(descriptor2, 5);
            i11 = mo114011i2;
            str3 = mo114014o3;
            i12 = mo114011i;
            str4 = mo114014o2;
            i13 = 63;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z11 = false;
                    case 0:
                        str5 = mo113968b.mo114014o(descriptor2, 0);
                        i16 |= 1;
                    case 1:
                        str8 = mo113968b.mo114014o(descriptor2, 1);
                        i16 |= 2;
                    case 2:
                        i15 = mo113968b.mo114011i(descriptor2, 2);
                        i16 |= 4;
                    case 3:
                        i14 = mo113968b.mo114011i(descriptor2, 3);
                        i16 |= 8;
                    case 4:
                        str7 = mo113968b.mo114014o(descriptor2, 4);
                        i16 |= 16;
                    case 5:
                        str6 = mo113968b.mo114014o(descriptor2, 5);
                        i16 |= 32;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            str = str5;
            str2 = str6;
            i11 = i14;
            str3 = str7;
            i12 = i15;
            str4 = str8;
            i13 = i16;
        }
        mo113968b.mo114009c(descriptor2);
        return new TransferCloudKeyParams(i13, str, str4, i12, i11, str3, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, TransferCloudKeyParams transferCloudKeyParams) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(transferCloudKeyParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        TransferCloudKeyParams.m41389a(transferCloudKeyParams, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
