package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
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
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class Stats$$serializer implements InterfaceC26842x {
    public static final Stats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Stats$$serializer stats$$serializer = new Stats$$serializer();
        INSTANCE = stats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Stats", stats$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("name", true);
        pluginGeneratedSerialDescriptor.m114047n("value", true);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Stats$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(C26783d0.f126989a)};
    }

    @Override // qn0.InterfaceC25386a
    public Stats deserialize(Decoder decoder) {
        int i11;
        String str;
        String str2;
        Integer num;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        String str3 = null;
        if (mo113968b.mo114015q()) {
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str4 = (String) mo113968b.mo114018x(descriptor2, 0, c26814n1, null);
            str2 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            num = (Integer) mo113968b.mo114018x(descriptor2, 2, C26783d0.f126989a, null);
            str = str4;
            i11 = 7;
        } else {
            String str5 = null;
            Integer num2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str3 = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, str3);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    str5 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str5);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    num2 = (Integer) mo113968b.mo114018x(descriptor2, 2, C26783d0.f126989a, num2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            str = str3;
            str2 = str5;
            num = num2;
        }
        mo113968b.mo114009c(descriptor2);
        return new Stats(i11, str, str2, num, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Stats stats) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(stats, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Stats.m51213d(stats, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
