package com.zing.zalo.shortvideo.data.model.config;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
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
public final class UpdateInfoConfig$$serializer implements InterfaceC26842x {
    public static final UpdateInfoConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UpdateInfoConfig$$serializer updateInfoConfig$$serializer = new UpdateInfoConfig$$serializer();
        INSTANCE = updateInfoConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.config.UpdateInfoConfig", updateInfoConfig$$serializer, 7);
        pluginGeneratedSerialDescriptor.m114047n("version", true);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, true);
        pluginGeneratedSerialDescriptor.m114047n("title", true);
        pluginGeneratedSerialDescriptor.m114047n("msg", true);
        pluginGeneratedSerialDescriptor.m114047n(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, true);
        pluginGeneratedSerialDescriptor.m114047n("btnYes", true);
        pluginGeneratedSerialDescriptor.m114047n("btnCancel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UpdateInfoConfig$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x006e. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public UpdateInfoConfig deserialize(Decoder decoder) {
        int i11;
        String str;
        Integer num;
        Integer num2;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i12 = 6;
        Integer num3 = null;
        if (mo113968b.mo114015q()) {
            C26783d0 c26783d0 = C26783d0.f126989a;
            Integer num4 = (Integer) mo113968b.mo114018x(descriptor2, 0, c26783d0, null);
            Integer num5 = (Integer) mo113968b.mo114018x(descriptor2, 1, c26783d0, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str6 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            String str7 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            String str8 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            String str9 = (String) mo113968b.mo114018x(descriptor2, 5, c26814n1, null);
            num2 = num5;
            str = (String) mo113968b.mo114018x(descriptor2, 6, c26814n1, null);
            str5 = str9;
            str3 = str7;
            str4 = str8;
            str2 = str6;
            num = num4;
            i11 = 127;
        } else {
            String str10 = null;
            Integer num6 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i12 = 6;
                        z11 = false;
                    case 0:
                        num3 = (Integer) mo113968b.mo114018x(descriptor2, 0, C26783d0.f126989a, num3);
                        i13 |= 1;
                        i12 = 6;
                    case 1:
                        num6 = (Integer) mo113968b.mo114018x(descriptor2, 1, C26783d0.f126989a, num6);
                        i13 |= 2;
                        i12 = 6;
                    case 2:
                        str11 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str11);
                        i13 |= 4;
                    case 3:
                        str12 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str12);
                        i13 |= 8;
                    case 4:
                        str13 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str13);
                        i13 |= 16;
                    case 5:
                        str14 = (String) mo113968b.mo114018x(descriptor2, 5, C26814n1.f127034a, str14);
                        i13 |= 32;
                    case 6:
                        str10 = (String) mo113968b.mo114018x(descriptor2, i12, C26814n1.f127034a, str10);
                        i13 |= 64;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i13;
            str = str10;
            num = num3;
            num2 = num6;
            str2 = str11;
            str3 = str12;
            str4 = str13;
            str5 = str14;
        }
        mo113968b.mo114009c(descriptor2);
        return new UpdateInfoConfig(i11, num, num2, str2, str3, str4, str5, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, UpdateInfoConfig updateInfoConfig) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(updateInfoConfig, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        UpdateInfoConfig.m51490h(updateInfoConfig, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
