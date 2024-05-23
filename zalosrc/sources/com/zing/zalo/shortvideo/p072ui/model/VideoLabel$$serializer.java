package com.zing.zalo.shortvideo.p072ui.model;

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
public final class VideoLabel$$serializer implements InterfaceC26842x {
    public static final VideoLabel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VideoLabel$$serializer videoLabel$$serializer = new VideoLabel$$serializer();
        INSTANCE = videoLabel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.ui.model.VideoLabel", videoLabel$$serializer, 7);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, true);
        pluginGeneratedSerialDescriptor.m114047n("icon", true);
        pluginGeneratedSerialDescriptor.m114047n("title", true);
        pluginGeneratedSerialDescriptor.m114047n("value", true);
        pluginGeneratedSerialDescriptor.m114047n("src", true);
        pluginGeneratedSerialDescriptor.m114047n("textColor", true);
        pluginGeneratedSerialDescriptor.m114047n("backgroundColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VideoLabel$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26783d0)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x006e. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public VideoLabel deserialize(Decoder decoder) {
        int i11;
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num3;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i12 = 6;
        Integer num4 = null;
        if (mo113968b.mo114015q()) {
            C26783d0 c26783d0 = C26783d0.f126989a;
            Integer num5 = (Integer) mo113968b.mo114018x(descriptor2, 0, c26783d0, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str5 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            String str6 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            String str7 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            String str8 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            Integer num6 = (Integer) mo113968b.mo114018x(descriptor2, 5, c26783d0, null);
            num = (Integer) mo113968b.mo114018x(descriptor2, 6, c26783d0, null);
            num3 = num6;
            str3 = str7;
            str4 = str8;
            str2 = str6;
            str = str5;
            num2 = num5;
            i11 = 127;
        } else {
            Integer num7 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            Integer num8 = null;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i12 = 6;
                        z11 = false;
                    case 0:
                        num4 = (Integer) mo113968b.mo114018x(descriptor2, 0, C26783d0.f126989a, num4);
                        i13 |= 1;
                        i12 = 6;
                    case 1:
                        str9 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str9);
                        i13 |= 2;
                        i12 = 6;
                    case 2:
                        str10 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str10);
                        i13 |= 4;
                    case 3:
                        str11 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str11);
                        i13 |= 8;
                    case 4:
                        str12 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str12);
                        i13 |= 16;
                    case 5:
                        num8 = (Integer) mo113968b.mo114018x(descriptor2, 5, C26783d0.f126989a, num8);
                        i13 |= 32;
                    case 6:
                        num7 = (Integer) mo113968b.mo114018x(descriptor2, i12, C26783d0.f126989a, num7);
                        i13 |= 64;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i13;
            num = num7;
            num2 = num4;
            str = str9;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            num3 = num8;
        }
        mo113968b.mo114009c(descriptor2);
        return new VideoLabel(i11, num2, str, str2, str3, str4, num3, num, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, VideoLabel videoLabel) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(videoLabel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        VideoLabel.m52941i(videoLabel, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
