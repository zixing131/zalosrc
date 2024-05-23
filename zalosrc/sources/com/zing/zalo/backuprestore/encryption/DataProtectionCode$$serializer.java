package com.zing.zalo.backuprestore.encryption;

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
import tn0.C26783d0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class DataProtectionCode$$serializer implements InterfaceC26842x {
    public static final DataProtectionCode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DataProtectionCode$$serializer dataProtectionCode$$serializer = new DataProtectionCode$$serializer();
        INSTANCE = dataProtectionCode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.backuprestore.encryption.DataProtectionCode", dataProtectionCode$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, false);
        pluginGeneratedSerialDescriptor.m114047n("code", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DataProtectionCode$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26783d0.f126989a, C26814n1.f127034a};
    }

    @Override // qn0.InterfaceC25386a
    public DataProtectionCode deserialize(Decoder decoder) {
        int i11;
        String str;
        int i12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            i11 = mo113968b.mo114011i(descriptor2, 0);
            str = mo113968b.mo114014o(descriptor2, 1);
            i12 = 3;
        } else {
            String str2 = null;
            i11 = 0;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i11 = mo113968b.mo114011i(descriptor2, 0);
                    i13 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str2 = mo113968b.mo114014o(descriptor2, 1);
                    i13 |= 2;
                }
            }
            str = str2;
            i12 = i13;
        }
        mo113968b.mo114009c(descriptor2);
        return new DataProtectionCode(i12, i11, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, DataProtectionCode dataProtectionCode) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(dataProtectionCode, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        DataProtectionCode.m37260e(dataProtectionCode, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
