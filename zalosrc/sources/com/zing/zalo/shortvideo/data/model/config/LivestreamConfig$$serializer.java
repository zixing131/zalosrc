package com.zing.zalo.shortvideo.data.model.config;

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
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class LivestreamConfig$$serializer implements InterfaceC26842x {
    public static final LivestreamConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LivestreamConfig$$serializer livestreamConfig$$serializer = new LivestreamConfig$$serializer();
        INSTANCE = livestreamConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.config.LivestreamConfig", livestreamConfig$$serializer, 1);
        pluginGeneratedSerialDescriptor.m114047n("domain", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LivestreamConfig$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC25935a.m133630u(C26814n1.f127034a)};
    }

    @Override // qn0.InterfaceC25386a
    public LivestreamConfig deserialize(Decoder decoder) {
        String str;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i11 = 1;
        if (mo113968b.mo114015q()) {
            str = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, null);
        } else {
            str = null;
            int i12 = 0;
            while (i11 != 0) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    i11 = 0;
                } else {
                    if (mo114037p != 0) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, str);
                    i12 |= 1;
                }
            }
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new LivestreamConfig(i11, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, LivestreamConfig livestreamConfig) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(livestreamConfig, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        LivestreamConfig.m51472b(livestreamConfig, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
