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
public final class EncryptionInfo$$serializer implements InterfaceC26842x {
    public static final EncryptionInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EncryptionInfo$$serializer encryptionInfo$$serializer = new EncryptionInfo$$serializer();
        INSTANCE = encryptionInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.EncryptionInfo", encryptionInfo$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("public_key", false);
        pluginGeneratedSerialDescriptor.m114047n("encrypt_type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EncryptionInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26814n1.f127034a, C26783d0.f126989a};
    }

    @Override // qn0.InterfaceC25386a
    public EncryptionInfo deserialize(Decoder decoder) {
        String str;
        int i11;
        int i12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            str = mo113968b.mo114014o(descriptor2, 0);
            i11 = mo113968b.mo114011i(descriptor2, 1);
            i12 = 3;
        } else {
            str = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str = mo113968b.mo114014o(descriptor2, 0);
                    i14 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    i13 = mo113968b.mo114011i(descriptor2, 1);
                    i14 |= 2;
                }
            }
            i11 = i13;
            i12 = i14;
        }
        mo113968b.mo114009c(descriptor2);
        return new EncryptionInfo(i12, str, i11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, EncryptionInfo encryptionInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(encryptionInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        EncryptionInfo.m41340c(encryptionInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
