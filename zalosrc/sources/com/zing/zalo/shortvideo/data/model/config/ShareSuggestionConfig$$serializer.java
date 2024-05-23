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
import tn0.C26794h;
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class ShareSuggestionConfig$$serializer implements InterfaceC26842x {
    public static final ShareSuggestionConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ShareSuggestionConfig$$serializer shareSuggestionConfig$$serializer = new ShareSuggestionConfig$$serializer();
        INSTANCE = shareSuggestionConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.config.ShareSuggestionConfig", shareSuggestionConfig$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("repeatAfter", true);
        pluginGeneratedSerialDescriptor.m114047n("watchTimeMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("allowSuggestMessage", true);
        pluginGeneratedSerialDescriptor.m114047n("allowSuggestTimeLine", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ShareSuggestionConfig$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26794h c26794h = C26794h.f127000a;
        return new KSerializer[]{AbstractC25935a.m133630u(C26783d0.f126989a), AbstractC25935a.m133630u(C26810m0.f127024a), AbstractC25935a.m133630u(c26794h), AbstractC25935a.m133630u(c26794h)};
    }

    @Override // qn0.InterfaceC25386a
    public ShareSuggestionConfig deserialize(Decoder decoder) {
        int i11;
        Integer num;
        Long l11;
        Boolean bool;
        Boolean bool2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        Integer num2 = null;
        if (mo113968b.mo114015q()) {
            Integer num3 = (Integer) mo113968b.mo114018x(descriptor2, 0, C26783d0.f126989a, null);
            Long l12 = (Long) mo113968b.mo114018x(descriptor2, 1, C26810m0.f127024a, null);
            C26794h c26794h = C26794h.f127000a;
            Boolean bool3 = (Boolean) mo113968b.mo114018x(descriptor2, 2, c26794h, null);
            num = num3;
            bool2 = (Boolean) mo113968b.mo114018x(descriptor2, 3, c26794h, null);
            bool = bool3;
            l11 = l12;
            i11 = 15;
        } else {
            Long l13 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    num2 = (Integer) mo113968b.mo114018x(descriptor2, 0, C26783d0.f126989a, num2);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    l13 = (Long) mo113968b.mo114018x(descriptor2, 1, C26810m0.f127024a, l13);
                    i12 |= 2;
                } else if (mo114037p == 2) {
                    bool4 = (Boolean) mo113968b.mo114018x(descriptor2, 2, C26794h.f127000a, bool4);
                    i12 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    bool5 = (Boolean) mo113968b.mo114018x(descriptor2, 3, C26794h.f127000a, bool5);
                    i12 |= 8;
                }
            }
            i11 = i12;
            num = num2;
            l11 = l13;
            bool = bool4;
            bool2 = bool5;
        }
        mo113968b.mo114009c(descriptor2);
        return new ShareSuggestionConfig(i11, num, l11, bool, bool2, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ShareSuggestionConfig shareSuggestionConfig) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(shareSuggestionConfig, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        ShareSuggestionConfig.m51485e(shareSuggestionConfig, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
