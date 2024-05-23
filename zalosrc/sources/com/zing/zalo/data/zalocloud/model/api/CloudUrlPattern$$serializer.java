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
public final class CloudUrlPattern$$serializer implements InterfaceC26842x {
    public static final CloudUrlPattern$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CloudUrlPattern$$serializer cloudUrlPattern$$serializer = new CloudUrlPattern$$serializer();
        INSTANCE = cloudUrlPattern$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.CloudUrlPattern", cloudUrlPattern$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("photo", false);
        pluginGeneratedSerialDescriptor.m114047n("file", false);
        pluginGeneratedSerialDescriptor.m114047n("voice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CloudUrlPattern$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = CloudUrlPattern.f43063d;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // qn0.InterfaceC25386a
    public CloudUrlPattern deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        List list;
        List list2;
        List list3;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = CloudUrlPattern.f43063d;
        List list4 = null;
        if (mo113968b.mo114015q()) {
            List list5 = (List) mo113968b.mo114012l(descriptor2, 0, kSerializerArr[0], null);
            List list6 = (List) mo113968b.mo114012l(descriptor2, 1, kSerializerArr[1], null);
            list3 = (List) mo113968b.mo114012l(descriptor2, 2, kSerializerArr[2], null);
            list = list5;
            list2 = list6;
            i11 = 7;
        } else {
            List list7 = null;
            List list8 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    list4 = (List) mo113968b.mo114012l(descriptor2, 0, kSerializerArr[0], list4);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    list7 = (List) mo113968b.mo114012l(descriptor2, 1, kSerializerArr[1], list7);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    list8 = (List) mo113968b.mo114012l(descriptor2, 2, kSerializerArr[2], list8);
                    i12 |= 4;
                }
            }
            i11 = i12;
            list = list4;
            list2 = list7;
            list3 = list8;
        }
        mo113968b.mo114009c(descriptor2);
        return new CloudUrlPattern(i11, list, list2, list3, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, CloudUrlPattern cloudUrlPattern) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(cloudUrlPattern, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        CloudUrlPattern.m41325f(cloudUrlPattern, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
