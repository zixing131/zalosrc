package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class ExtInfo$$serializer implements InterfaceC26842x {
    public static final ExtInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ExtInfo$$serializer extInfo$$serializer = new ExtInfo$$serializer();
        INSTANCE = extInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.ExtInfo", extInfo$$serializer, 1);
        pluginGeneratedSerialDescriptor.m114047n("orgMsgs", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ExtInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = ExtInfo.f43075b;
        return new KSerializer[]{kSerializerArr[0]};
    }

    @Override // qn0.InterfaceC25386a
    public ExtInfo deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = ExtInfo.f43075b;
        int i11 = 1;
        if (mo113968b.mo114015q()) {
            list = (List) mo113968b.mo114012l(descriptor2, 0, kSerializerArr[0], null);
        } else {
            List list2 = null;
            int i12 = 0;
            while (i11 != 0) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    i11 = 0;
                } else {
                    if (mo114037p != 0) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    list2 = (List) mo113968b.mo114012l(descriptor2, 0, kSerializerArr[0], list2);
                    i12 |= 1;
                }
            }
            list = list2;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new ExtInfo(i11, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ExtInfo extInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(extInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        mo113984b.mo114029i(descriptor2, 0, ExtInfo.f43075b[0], extInfo.f43076a);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
