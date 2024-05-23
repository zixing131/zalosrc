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
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class MsgInfo$$serializer implements InterfaceC26842x {
    public static final MsgInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MsgInfo$$serializer msgInfo$$serializer = new MsgInfo$$serializer();
        INSTANCE = msgInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.MsgInfo", msgInfo$$serializer, 9);
        pluginGeneratedSerialDescriptor.m114047n("cliMsgId", false);
        pluginGeneratedSerialDescriptor.m114047n("glbMsgId", false);
        pluginGeneratedSerialDescriptor.m114047n("msgType", false);
        pluginGeneratedSerialDescriptor.m114047n("srcId", false);
        pluginGeneratedSerialDescriptor.m114047n("destId", false);
        pluginGeneratedSerialDescriptor.m114047n("destType", false);
        pluginGeneratedSerialDescriptor.m114047n("ts", false);
        pluginGeneratedSerialDescriptor.m114047n("isE2EE", true);
        pluginGeneratedSerialDescriptor.m114047n("extInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MsgInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26810m0, c26810m0, C26814n1.f127034a, c26810m0, c26810m0, c26783d0, c26810m0, c26783d0, AbstractC25935a.m133630u(ExtInfo$$serializer.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x007a. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public MsgInfo deserialize(Decoder decoder) {
        int i11;
        ExtInfo extInfo;
        int i12;
        int i13;
        long j11;
        long j12;
        String str;
        long j13;
        long j14;
        long j15;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i14 = 7;
        if (mo113968b.mo114015q()) {
            long mo114010f = mo113968b.mo114010f(descriptor2, 0);
            long mo114010f2 = mo113968b.mo114010f(descriptor2, 1);
            String mo114014o = mo113968b.mo114014o(descriptor2, 2);
            long mo114010f3 = mo113968b.mo114010f(descriptor2, 3);
            long mo114010f4 = mo113968b.mo114010f(descriptor2, 4);
            int mo114011i = mo113968b.mo114011i(descriptor2, 5);
            long mo114010f5 = mo113968b.mo114010f(descriptor2, 6);
            str = mo114014o;
            i11 = mo113968b.mo114011i(descriptor2, 7);
            extInfo = (ExtInfo) mo113968b.mo114018x(descriptor2, 8, ExtInfo$$serializer.INSTANCE, null);
            i12 = mo114011i;
            j11 = mo114010f4;
            j12 = mo114010f2;
            j13 = mo114010f;
            j14 = mo114010f3;
            j15 = mo114010f5;
            i13 = 511;
        } else {
            ExtInfo extInfo2 = null;
            String str2 = null;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            long j19 = 0;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = true;
            long j21 = 0;
            int i17 = 0;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i14 = 7;
                        z11 = false;
                    case 0:
                        j17 = mo113968b.mo114010f(descriptor2, 0);
                        i17 |= 1;
                        i14 = 7;
                    case 1:
                        j16 = mo113968b.mo114010f(descriptor2, 1);
                        i17 |= 2;
                    case 2:
                        str2 = mo113968b.mo114014o(descriptor2, 2);
                        i17 |= 4;
                    case 3:
                        j18 = mo113968b.mo114010f(descriptor2, 3);
                        i17 |= 8;
                    case 4:
                        j21 = mo113968b.mo114010f(descriptor2, 4);
                        i17 |= 16;
                    case 5:
                        i16 = mo113968b.mo114011i(descriptor2, 5);
                        i17 |= 32;
                    case 6:
                        j19 = mo113968b.mo114010f(descriptor2, 6);
                        i17 |= 64;
                    case 7:
                        i15 = mo113968b.mo114011i(descriptor2, i14);
                        i17 |= 128;
                    case 8:
                        extInfo2 = (ExtInfo) mo113968b.mo114018x(descriptor2, 8, ExtInfo$$serializer.INSTANCE, extInfo2);
                        i17 |= 256;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i15;
            extInfo = extInfo2;
            i12 = i16;
            i13 = i17;
            j11 = j21;
            j12 = j16;
            str = str2;
            j13 = j17;
            j14 = j18;
            j15 = j19;
        }
        mo113968b.mo114009c(descriptor2);
        return new MsgInfo(i13, j13, j12, str, j14, j11, i12, j15, i11, extInfo, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, MsgInfo msgInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(msgInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        MsgInfo.m41360k(msgInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
