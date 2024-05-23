package com.zing.zalo.p077ui.call.settingringtone.presenter.data;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26794h;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class RingtoneData$$serializer implements InterfaceC26842x {
    public static final RingtoneData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RingtoneData$$serializer ringtoneData$$serializer = new RingtoneData$$serializer();
        INSTANCE = ringtoneData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.ui.call.settingringtone.presenter.data.RingtoneData", ringtoneData$$serializer, 9);
        pluginGeneratedSerialDescriptor.m114047n("id", false);
        pluginGeneratedSerialDescriptor.m114047n("thumbURL", true);
        pluginGeneratedSerialDescriptor.m114047n("name", true);
        pluginGeneratedSerialDescriptor.m114047n("desc", true);
        pluginGeneratedSerialDescriptor.m114047n("isPlaying", true);
        pluginGeneratedSerialDescriptor.m114047n("progress", true);
        pluginGeneratedSerialDescriptor.m114047n("isLoading", true);
        pluginGeneratedSerialDescriptor.m114047n("isSelecting", true);
        pluginGeneratedSerialDescriptor.m114047n("isSelected", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RingtoneData$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26794h c26794h = C26794h.f127000a;
        return new KSerializer[]{c26814n1, c26814n1, c26814n1, c26814n1, c26794h, C26783d0.f126989a, c26794h, c26794h, c26794h};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0070. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public RingtoneData deserialize(Decoder decoder) {
        String str;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        String str2;
        boolean z13;
        boolean z14;
        String str3;
        String str4;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i13 = 0;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 1);
            String mo114014o3 = mo113968b.mo114014o(descriptor2, 2);
            String mo114014o4 = mo113968b.mo114014o(descriptor2, 3);
            boolean mo114004D = mo113968b.mo114004D(descriptor2, 4);
            int mo114011i = mo113968b.mo114011i(descriptor2, 5);
            boolean mo114004D2 = mo113968b.mo114004D(descriptor2, 6);
            str = mo114014o;
            z11 = mo113968b.mo114004D(descriptor2, 7);
            z12 = mo114004D2;
            i12 = mo114011i;
            str2 = mo114014o4;
            z13 = mo113968b.mo114004D(descriptor2, 8);
            z14 = mo114004D;
            str3 = mo114014o3;
            str4 = mo114014o2;
            i11 = 511;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z15 = false;
            boolean z16 = false;
            int i14 = 0;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = true;
            while (z19) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z19 = false;
                    case 0:
                        i13 |= 1;
                        str5 = mo113968b.mo114014o(descriptor2, 0);
                    case 1:
                        str8 = mo113968b.mo114014o(descriptor2, 1);
                        i13 |= 2;
                    case 2:
                        str7 = mo113968b.mo114014o(descriptor2, 2);
                        i13 |= 4;
                    case 3:
                        str6 = mo113968b.mo114014o(descriptor2, 3);
                        i13 |= 8;
                    case 4:
                        z18 = mo113968b.mo114004D(descriptor2, 4);
                        i13 |= 16;
                    case 5:
                        i14 = mo113968b.mo114011i(descriptor2, 5);
                        i13 |= 32;
                    case 6:
                        z16 = mo113968b.mo114004D(descriptor2, 6);
                        i13 |= 64;
                    case 7:
                        z15 = mo113968b.mo114004D(descriptor2, 7);
                        i13 |= 128;
                    case 8:
                        z17 = mo113968b.mo114004D(descriptor2, 8);
                        i13 |= 256;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            str = str5;
            i11 = i13;
            z11 = z15;
            z12 = z16;
            i12 = i14;
            str2 = str6;
            z13 = z17;
            z14 = z18;
            str3 = str7;
            str4 = str8;
        }
        mo113968b.mo114009c(descriptor2);
        return new RingtoneData(i11, str, str4, str3, str2, z14, i12, z12, z11, z13, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, RingtoneData ringtoneData) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(ringtoneData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        RingtoneData.m58729m(ringtoneData, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
