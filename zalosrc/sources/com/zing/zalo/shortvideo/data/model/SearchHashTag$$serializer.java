package com.zing.zalo.shortvideo.data.model;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class SearchHashTag$$serializer implements InterfaceC26842x {
    public static final SearchHashTag$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SearchHashTag$$serializer searchHashTag$$serializer = new SearchHashTag$$serializer();
        INSTANCE = searchHashTag$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.SearchHashTag", searchHashTag$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("hashtag", false);
        pluginGeneratedSerialDescriptor.m114047n("viewCount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SearchHashTag$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26814n1.f127034a, C26810m0.f127024a};
    }

    @Override // qn0.InterfaceC25386a
    public SearchHashTag deserialize(Decoder decoder) {
        String str;
        long j11;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            str = mo113968b.mo114014o(descriptor2, 0);
            j11 = mo113968b.mo114010f(descriptor2, 1);
            i11 = 3;
        } else {
            String str2 = null;
            long j12 = 0;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str2 = mo113968b.mo114014o(descriptor2, 0);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    j12 = mo113968b.mo114010f(descriptor2, 1);
                    i12 |= 2;
                }
            }
            str = str2;
            j11 = j12;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new SearchHashTag(i11, str, j11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, SearchHashTag searchHashTag) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(searchHashTag, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        SearchHashTag.m51143e(searchHashTag, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
