package com.zing.zalo.shortvideo.data.remote.common;

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
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class SimpleRestResponse$$serializer implements InterfaceC26842x {
    public static final SimpleRestResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SimpleRestResponse$$serializer simpleRestResponse$$serializer = new SimpleRestResponse$$serializer();
        INSTANCE = simpleRestResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.common.SimpleRestResponse", simpleRestResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("err", false);
        pluginGeneratedSerialDescriptor.m114047n("msg", false);
        pluginGeneratedSerialDescriptor.m114047n("sTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SimpleRestResponse$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26783d0.f126989a, C26814n1.f127034a, C26810m0.f127024a};
    }

    @Override // qn0.InterfaceC25386a
    public SimpleRestResponse deserialize(Decoder decoder) {
        int i11;
        int i12;
        String str;
        long j11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            i11 = mo113968b.mo114011i(descriptor2, 0);
            str = mo113968b.mo114014o(descriptor2, 1);
            j11 = mo113968b.mo114010f(descriptor2, 2);
            i12 = 7;
        } else {
            long j12 = 0;
            int i13 = 0;
            boolean z11 = true;
            String str2 = null;
            int i14 = 0;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i14 = mo113968b.mo114011i(descriptor2, 0);
                    i13 |= 1;
                } else if (mo114037p == 1) {
                    str2 = mo113968b.mo114014o(descriptor2, 1);
                    i13 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    j12 = mo113968b.mo114010f(descriptor2, 2);
                    i13 |= 4;
                }
            }
            i11 = i14;
            i12 = i13;
            str = str2;
            j11 = j12;
        }
        mo113968b.mo114009c(descriptor2);
        return new SimpleRestResponse(i12, i11, str, j11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, SimpleRestResponse simpleRestResponse) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(simpleRestResponse, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        SimpleRestResponse.m51535d(simpleRestResponse, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
