package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.model.BreakSlot;
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
public final class BreakSlot$Option$$serializer implements InterfaceC26842x {
    public static final BreakSlot$Option$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BreakSlot$Option$$serializer breakSlot$Option$$serializer = new BreakSlot$Option$$serializer();
        INSTANCE = breakSlot$Option$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.BreakSlot.Option", breakSlot$Option$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("id", false);
        pluginGeneratedSerialDescriptor.m114047n("name", false);
        pluginGeneratedSerialDescriptor.m114047n("isPicked", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BreakSlot$Option$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{c26814n1, c26814n1, C26794h.f127000a};
    }

    @Override // qn0.InterfaceC25386a
    public BreakSlot.Option deserialize(Decoder decoder) {
        String str;
        boolean z11;
        String str2;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 1);
            str = mo114014o;
            z11 = mo113968b.mo114004D(descriptor2, 2);
            str2 = mo114014o2;
            i11 = 7;
        } else {
            String str3 = null;
            String str4 = null;
            boolean z12 = false;
            int i12 = 0;
            boolean z13 = true;
            while (z13) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z13 = false;
                } else if (mo114037p == 0) {
                    str3 = mo113968b.mo114014o(descriptor2, 0);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    str4 = mo113968b.mo114014o(descriptor2, 1);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    z12 = mo113968b.mo114004D(descriptor2, 2);
                    i12 |= 4;
                }
            }
            str = str3;
            z11 = z12;
            str2 = str4;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new BreakSlot.Option(i11, str, str2, z11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, BreakSlot.Option option) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(option, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        BreakSlot.Option.m50699e(option, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
