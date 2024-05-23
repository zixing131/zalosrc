package com.zing.zalo.shortvideo.data.model.config;

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
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class EditProfileConfig$$serializer implements InterfaceC26842x {
    public static final EditProfileConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EditProfileConfig$$serializer editProfileConfig$$serializer = new EditProfileConfig$$serializer();
        INSTANCE = editProfileConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.config.EditProfileConfig", editProfileConfig$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("domain", true);
        pluginGeneratedSerialDescriptor.m114047n("editAvatarInSecs", true);
        pluginGeneratedSerialDescriptor.m114047n("editBioInSecs", true);
        pluginGeneratedSerialDescriptor.m114047n("editNameInSecs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EditProfileConfig$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        return new KSerializer[]{AbstractC25935a.m133630u(C26814n1.f127034a), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0)};
    }

    @Override // qn0.InterfaceC25386a
    public EditProfileConfig deserialize(Decoder decoder) {
        int i11;
        String str;
        Long l11;
        Long l12;
        Long l13;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        String str2 = null;
        if (mo113968b.mo114015q()) {
            String str3 = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, null);
            C26810m0 c26810m0 = C26810m0.f127024a;
            Long l14 = (Long) mo113968b.mo114018x(descriptor2, 1, c26810m0, null);
            Long l15 = (Long) mo113968b.mo114018x(descriptor2, 2, c26810m0, null);
            str = str3;
            l13 = (Long) mo113968b.mo114018x(descriptor2, 3, c26810m0, null);
            l12 = l15;
            l11 = l14;
            i11 = 15;
        } else {
            Long l16 = null;
            Long l17 = null;
            Long l18 = null;
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
                    l16 = (Long) mo113968b.mo114018x(descriptor2, 1, C26810m0.f127024a, l16);
                    i12 |= 2;
                } else if (mo114037p == 2) {
                    l17 = (Long) mo113968b.mo114018x(descriptor2, 2, C26810m0.f127024a, l17);
                    i12 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    l18 = (Long) mo113968b.mo114018x(descriptor2, 3, C26810m0.f127024a, l18);
                    i12 |= 8;
                }
            }
            i11 = i12;
            str = str2;
            l11 = l16;
            l12 = l17;
            l13 = l18;
        }
        mo113968b.mo114009c(descriptor2);
        return new EditProfileConfig(i11, str, l11, l12, l13, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, EditProfileConfig editProfileConfig) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(editProfileConfig, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        EditProfileConfig.m51463e(editProfileConfig, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
