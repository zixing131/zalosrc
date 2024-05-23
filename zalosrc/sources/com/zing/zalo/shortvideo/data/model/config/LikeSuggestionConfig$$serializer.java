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
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class LikeSuggestionConfig$$serializer implements InterfaceC26842x {
    public static final LikeSuggestionConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LikeSuggestionConfig$$serializer likeSuggestionConfig$$serializer = new LikeSuggestionConfig$$serializer();
        INSTANCE = likeSuggestionConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.config.LikeSuggestionConfig", likeSuggestionConfig$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("repeatAfter", true);
        pluginGeneratedSerialDescriptor.m114047n("watchTimeMillis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LikeSuggestionConfig$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC25935a.m133630u(C26783d0.f126989a), AbstractC25935a.m133630u(C26810m0.f127024a)};
    }

    @Override // qn0.InterfaceC25386a
    public LikeSuggestionConfig deserialize(Decoder decoder) {
        Integer num;
        Long l11;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            num = (Integer) mo113968b.mo114018x(descriptor2, 0, C26783d0.f126989a, null);
            l11 = (Long) mo113968b.mo114018x(descriptor2, 1, C26810m0.f127024a, null);
            i11 = 3;
        } else {
            num = null;
            Long l12 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    num = (Integer) mo113968b.mo114018x(descriptor2, 0, C26783d0.f126989a, num);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    l12 = (Long) mo113968b.mo114018x(descriptor2, 1, C26810m0.f127024a, l12);
                    i12 |= 2;
                }
            }
            l11 = l12;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new LikeSuggestionConfig(i11, num, l11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, LikeSuggestionConfig likeSuggestionConfig) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(likeSuggestionConfig, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        LikeSuggestionConfig.m51469c(likeSuggestionConfig, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
