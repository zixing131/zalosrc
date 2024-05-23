package com.zing.zalo.shortvideo.data.model;

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
import rn0.AbstractC25935a;
import tn0.C26783d0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class SectionBoxData$$serializer implements InterfaceC26842x {
    public static final SectionBoxData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SectionBoxData$$serializer sectionBoxData$$serializer = new SectionBoxData$$serializer();
        INSTANCE = sectionBoxData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.SectionBoxData", sectionBoxData$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("boxId", false);
        pluginGeneratedSerialDescriptor.m114047n("objectType", false);
        pluginGeneratedSerialDescriptor.m114047n("position", true);
        pluginGeneratedSerialDescriptor.m114047n("items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SectionBoxData$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = SectionBoxData.f49971t;
        return new KSerializer[]{C26814n1.f127034a, C26783d0.f126989a, AbstractC25935a.m133630u(kSerializerArr[2]), AbstractC25935a.m133630u(kSerializerArr[3])};
    }

    @Override // qn0.InterfaceC25386a
    public SectionBoxData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        int i12;
        String str;
        List list;
        List list2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = SectionBoxData.f49971t;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            int mo114011i = mo113968b.mo114011i(descriptor2, 1);
            List list3 = (List) mo113968b.mo114018x(descriptor2, 2, kSerializerArr[2], null);
            list2 = (List) mo113968b.mo114018x(descriptor2, 3, kSerializerArr[3], null);
            str = mo114014o;
            list = list3;
            i12 = mo114011i;
            i11 = 15;
        } else {
            String str2 = null;
            List list4 = null;
            List list5 = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str2 = mo113968b.mo114014o(descriptor2, 0);
                    i13 |= 1;
                } else if (mo114037p == 1) {
                    i14 = mo113968b.mo114011i(descriptor2, 1);
                    i13 |= 2;
                } else if (mo114037p == 2) {
                    list4 = (List) mo113968b.mo114018x(descriptor2, 2, kSerializerArr[2], list4);
                    i13 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    list5 = (List) mo113968b.mo114018x(descriptor2, 3, kSerializerArr[3], list5);
                    i13 |= 8;
                }
            }
            i11 = i13;
            i12 = i14;
            str = str2;
            list = list4;
            list2 = list5;
        }
        mo113968b.mo114009c(descriptor2);
        return new SectionBoxData(i11, str, i12, list, list2, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, SectionBoxData sectionBoxData) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(sectionBoxData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        SectionBoxData.m51184e(sectionBoxData, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
