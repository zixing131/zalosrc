package com.zing.zalo.shortvideo.data.utils;

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

/* loaded from: classes5.dex */
public final class ZInstantPayload$$serializer implements InterfaceC26842x {
    public static final ZInstantPayload$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ZInstantPayload$$serializer zInstantPayload$$serializer = new ZInstantPayload$$serializer();
        INSTANCE = zInstantPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.utils.ZInstantPayload", zInstantPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.m114047n("data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ZInstantPayload$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = ZInstantPayload.f50354b;
        return new KSerializer[]{kSerializerArr[0]};
    }

    @Override // qn0.InterfaceC25386a
    public ZInstantPayload deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = ZInstantPayload.f50354b;
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
        return new ZInstantPayload(i11, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ZInstantPayload zInstantPayload) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(zInstantPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        mo113984b.mo114029i(descriptor2, 0, ZInstantPayload.f50354b[0], zInstantPayload.f50355a);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
