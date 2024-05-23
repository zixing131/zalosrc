package com.zing.zalo.zalocloud.backupkey;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes7.dex */
public final class DriveKeyPayload$$serializer implements InterfaceC26842x {
    public static final DriveKeyPayload$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DriveKeyPayload$$serializer driveKeyPayload$$serializer = new DriveKeyPayload$$serializer();
        INSTANCE = driveKeyPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.zalocloud.backupkey.DriveKeyPayload", driveKeyPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("user_id", false);
        pluginGeneratedSerialDescriptor.m114047n("key", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DriveKeyPayload$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26814n1.f127034a, SecureOption$$serializer.INSTANCE};
    }

    @Override // qn0.InterfaceC25386a
    public DriveKeyPayload deserialize(Decoder decoder) {
        String str;
        SecureOption secureOption;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            str = mo113968b.mo114014o(descriptor2, 0);
            secureOption = (SecureOption) mo113968b.mo114012l(descriptor2, 1, SecureOption$$serializer.INSTANCE, null);
            i11 = 3;
        } else {
            str = null;
            SecureOption secureOption2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str = mo113968b.mo114014o(descriptor2, 0);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    secureOption2 = (SecureOption) mo113968b.mo114012l(descriptor2, 1, SecureOption$$serializer.INSTANCE, secureOption2);
                    i12 |= 2;
                }
            }
            secureOption = secureOption2;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new DriveKeyPayload(i11, str, secureOption, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, DriveKeyPayload driveKeyPayload) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(driveKeyPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        DriveKeyPayload.m89736c(driveKeyPayload, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
