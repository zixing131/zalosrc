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
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class Data$$serializer implements InterfaceC26842x {
    public static final Data$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Data$$serializer data$$serializer = new Data$$serializer();
        INSTANCE = data$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.Data", data$$serializer, 1);
        pluginGeneratedSerialDescriptor.m114047n("last_submit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Data$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC25935a.m133630u(C26810m0.f127024a)};
    }

    @Override // qn0.InterfaceC25386a
    public Data deserialize(Decoder decoder) {
        Long l11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i11 = 1;
        if (mo113968b.mo114015q()) {
            l11 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, null);
        } else {
            l11 = null;
            int i12 = 0;
            while (i11 != 0) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    i11 = 0;
                } else {
                    if (mo114037p != 0) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    l11 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, l11);
                    i12 |= 1;
                }
            }
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new Data(i11, l11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Data data) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(data, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Data.m41331b(data, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
