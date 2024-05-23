package com.zing.zalo.shortvideo.data.model.config;

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
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class BottomSheetItem$$serializer implements InterfaceC26842x {
    public static final BottomSheetItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BottomSheetItem$$serializer bottomSheetItem$$serializer = new BottomSheetItem$$serializer();
        INSTANCE = bottomSheetItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.config.BottomSheetItem", bottomSheetItem$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, true);
        pluginGeneratedSerialDescriptor.m114047n("title", true);
        pluginGeneratedSerialDescriptor.m114047n("icon", true);
        pluginGeneratedSerialDescriptor.m114047n("value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BottomSheetItem$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(C26783d0.f126989a), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1)};
    }

    @Override // qn0.InterfaceC25386a
    public BottomSheetItem deserialize(Decoder decoder) {
        int i11;
        Integer num;
        String str;
        String str2;
        String str3;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        Integer num2 = null;
        if (mo113968b.mo114015q()) {
            Integer num3 = (Integer) mo113968b.mo114018x(descriptor2, 0, C26783d0.f126989a, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str4 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            String str5 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            num = num3;
            str3 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            str2 = str5;
            str = str4;
            i11 = 15;
        } else {
            String str6 = null;
            String str7 = null;
            String str8 = null;
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
                    str6 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str6);
                    i12 |= 2;
                } else if (mo114037p == 2) {
                    str7 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str7);
                    i12 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str8 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str8);
                    i12 |= 8;
                }
            }
            i11 = i12;
            num = num2;
            str = str6;
            str2 = str7;
            str3 = str8;
        }
        mo113968b.mo114009c(descriptor2);
        return new BottomSheetItem(i11, num, str, str2, str3, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(bottomSheetItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        BottomSheetItem.m51410f(bottomSheetItem, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
