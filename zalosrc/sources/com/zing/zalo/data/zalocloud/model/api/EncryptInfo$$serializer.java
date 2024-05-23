package com.zing.zalo.data.zalocloud.model.api;

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

/* loaded from: classes3.dex */
public final class EncryptInfo$$serializer implements InterfaceC26842x {
    public static final EncryptInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EncryptInfo$$serializer encryptInfo$$serializer = new EncryptInfo$$serializer();
        INSTANCE = encryptInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.EncryptInfo", encryptInfo$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("encryptKey", true);
        pluginGeneratedSerialDescriptor.m114047n("keyVersion", true);
        pluginGeneratedSerialDescriptor.m114047n("algoVersion", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EncryptInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{AbstractC25935a.m133630u(C26814n1.f127034a), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26783d0)};
    }

    @Override // qn0.InterfaceC25386a
    public EncryptInfo deserialize(Decoder decoder) {
        int i11;
        String str;
        Integer num;
        Integer num2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        String str2 = null;
        if (mo113968b.mo114015q()) {
            String str3 = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, null);
            C26783d0 c26783d0 = C26783d0.f126989a;
            Integer num3 = (Integer) mo113968b.mo114018x(descriptor2, 1, c26783d0, null);
            str = str3;
            num2 = (Integer) mo113968b.mo114018x(descriptor2, 2, c26783d0, null);
            num = num3;
            i11 = 7;
        } else {
            Integer num4 = null;
            Integer num5 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str2 = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, str2);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    num4 = (Integer) mo113968b.mo114018x(descriptor2, 1, C26783d0.f126989a, num4);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    num5 = (Integer) mo113968b.mo114018x(descriptor2, 2, C26783d0.f126989a, num5);
                    i12 |= 4;
                }
            }
            i11 = i12;
            str = str2;
            num = num4;
            num2 = num5;
        }
        mo113968b.mo114009c(descriptor2);
        return new EncryptInfo(i11, str, num, num2, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, EncryptInfo encryptInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(encryptInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        EncryptInfo.m41336d(encryptInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
