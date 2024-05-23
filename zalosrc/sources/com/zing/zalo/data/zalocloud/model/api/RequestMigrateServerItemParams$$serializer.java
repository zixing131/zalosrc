package com.zing.zalo.data.zalocloud.model.api;

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
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class RequestMigrateServerItemParams$$serializer implements InterfaceC26842x {
    public static final RequestMigrateServerItemParams$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RequestMigrateServerItemParams$$serializer requestMigrateServerItemParams$$serializer = new RequestMigrateServerItemParams$$serializer();
        INSTANCE = requestMigrateServerItemParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.RequestMigrateServerItemParams", requestMigrateServerItemParams$$serializer, 7);
        pluginGeneratedSerialDescriptor.m114047n("msgInfo", false);
        pluginGeneratedSerialDescriptor.m114047n(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, false);
        pluginGeneratedSerialDescriptor.m114047n("thumbUrl", false);
        pluginGeneratedSerialDescriptor.m114047n("encInfo", false);
        pluginGeneratedSerialDescriptor.m114047n("mdckOrig", false);
        pluginGeneratedSerialDescriptor.m114047n("mediaExtInfo", false);
        pluginGeneratedSerialDescriptor.m114047n("mediaExtEncInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RequestMigrateServerItemParams$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{MsgInfo$$serializer.INSTANCE, c26814n1, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x006c. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public RequestMigrateServerItemParams deserialize(Decoder decoder) {
        int i11;
        String str;
        MsgInfo msgInfo;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i12 = 6;
        int i13 = 5;
        MsgInfo msgInfo2 = null;
        if (mo113968b.mo114015q()) {
            MsgInfo msgInfo3 = (MsgInfo) mo113968b.mo114012l(descriptor2, 0, MsgInfo$$serializer.INSTANCE, null);
            String mo114014o = mo113968b.mo114014o(descriptor2, 1);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str7 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            String str8 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            String str9 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            String str10 = (String) mo113968b.mo114018x(descriptor2, 5, c26814n1, null);
            msgInfo = msgInfo3;
            str = (String) mo113968b.mo114018x(descriptor2, 6, c26814n1, null);
            str6 = str10;
            str4 = str8;
            str5 = str9;
            str3 = str7;
            str2 = mo114014o;
            i11 = 127;
        } else {
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i13 = 5;
                        z11 = false;
                    case 0:
                        msgInfo2 = (MsgInfo) mo113968b.mo114012l(descriptor2, 0, MsgInfo$$serializer.INSTANCE, msgInfo2);
                        i14 |= 1;
                        i12 = 6;
                        i13 = 5;
                    case 1:
                        str12 = mo113968b.mo114014o(descriptor2, 1);
                        i14 |= 2;
                    case 2:
                        str13 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str13);
                        i14 |= 4;
                    case 3:
                        str14 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str14);
                        i14 |= 8;
                    case 4:
                        str15 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str15);
                        i14 |= 16;
                    case 5:
                        str16 = (String) mo113968b.mo114018x(descriptor2, i13, C26814n1.f127034a, str16);
                        i14 |= 32;
                    case 6:
                        str11 = (String) mo113968b.mo114018x(descriptor2, i12, C26814n1.f127034a, str11);
                        i14 |= 64;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i14;
            str = str11;
            msgInfo = msgInfo2;
            str2 = str12;
            str3 = str13;
            str4 = str14;
            str5 = str15;
            str6 = str16;
        }
        mo113968b.mo114009c(descriptor2);
        return new RequestMigrateServerItemParams(i11, msgInfo, str2, str3, str4, str5, str6, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, RequestMigrateServerItemParams requestMigrateServerItemParams) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(requestMigrateServerItemParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        RequestMigrateServerItemParams.m41376a(requestMigrateServerItemParams, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
