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
public final class Action$$serializer implements InterfaceC26842x {
    public static final Action$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Action$$serializer action$$serializer = new Action$$serializer();
        INSTANCE = action$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Action", action$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("title", true);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Action$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC25935a.m133630u(C26814n1.f127034a), AbstractC25935a.m133630u(C26783d0.f126989a)};
    }

    @Override // qn0.InterfaceC25386a
    public Action deserialize(Decoder decoder) {
        String str;
        Integer num;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            str = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, null);
            num = (Integer) mo113968b.mo114018x(descriptor2, 1, C26783d0.f126989a, null);
            i11 = 3;
        } else {
            str = null;
            Integer num2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, str);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    num2 = (Integer) mo113968b.mo114018x(descriptor2, 1, C26783d0.f126989a, num2);
                    i12 |= 2;
                }
            }
            num = num2;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new Action(i11, str, num, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Action action) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(action, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Action.m50675b(action, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
