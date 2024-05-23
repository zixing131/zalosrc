package com.zing.zalo.shortvideo.data.utils;

import com.zing.zalo.shortvideo.data.utils.ZInstantPayload;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26794h;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class ZInstantPayload$Entry$$serializer implements InterfaceC26842x {
    public static final ZInstantPayload$Entry$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ZInstantPayload$Entry$$serializer zInstantPayload$Entry$$serializer = new ZInstantPayload$Entry$$serializer();
        INSTANCE = zInstantPayload$Entry$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.utils.ZInstantPayload.Entry", zInstantPayload$Entry$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("video_id", false);
        pluginGeneratedSerialDescriptor.m114047n("seen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ZInstantPayload$Entry$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26814n1.f127034a, C26794h.f127000a};
    }

    @Override // qn0.InterfaceC25386a
    public ZInstantPayload.Entry deserialize(Decoder decoder) {
        String str;
        boolean z11;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            str = mo113968b.mo114014o(descriptor2, 0);
            z11 = mo113968b.mo114004D(descriptor2, 1);
            i11 = 3;
        } else {
            str = null;
            boolean z12 = false;
            int i12 = 0;
            boolean z13 = true;
            while (z13) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z13 = false;
                } else if (mo114037p == 0) {
                    str = mo113968b.mo114014o(descriptor2, 0);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    z12 = mo113968b.mo114004D(descriptor2, 1);
                    i12 |= 2;
                }
            }
            z11 = z12;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new ZInstantPayload.Entry(i11, str, z11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ZInstantPayload.Entry entry) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(entry, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        ZInstantPayload.Entry.m51715c(entry, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
