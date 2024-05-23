package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.util.ArrayList;
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

/* loaded from: classes5.dex */
public final class BreakSlot$$serializer implements InterfaceC26842x {
    public static final BreakSlot$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BreakSlot$$serializer breakSlot$$serializer = new BreakSlot$$serializer();
        INSTANCE = breakSlot$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.BreakSlot", breakSlot$$serializer, 11);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, false);
        pluginGeneratedSerialDescriptor.m114047n("templateId", false);
        pluginGeneratedSerialDescriptor.m114047n("index", false);
        pluginGeneratedSerialDescriptor.m114047n("videoId", false);
        pluginGeneratedSerialDescriptor.m114047n("thumb", true);
        pluginGeneratedSerialDescriptor.m114047n("title", true);
        pluginGeneratedSerialDescriptor.m114047n("message", true);
        pluginGeneratedSerialDescriptor.m114047n("options", true);
        pluginGeneratedSerialDescriptor.m114047n("channels", true);
        pluginGeneratedSerialDescriptor.m114047n("slotSpacing", true);
        pluginGeneratedSerialDescriptor.m114047n("autoScrollDelay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BreakSlot$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = BreakSlot.f49714A;
        C26783d0 c26783d0 = C26783d0.f126989a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{c26783d0, AbstractC25935a.m133630u(c26814n1), c26783d0, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(kSerializerArr[7]), AbstractC25935a.m133630u(kSerializerArr[8]), c26783d0, C26810m0.f127024a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x009d. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public BreakSlot deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i12;
        int i13;
        int i14;
        long j11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = BreakSlot.f49714A;
        int i15 = 10;
        int i16 = 9;
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str6 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 2);
            String str7 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            String str8 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            String str9 = (String) mo113968b.mo114018x(descriptor2, 5, c26814n1, null);
            String str10 = (String) mo113968b.mo114018x(descriptor2, 6, c26814n1, null);
            ArrayList arrayList3 = (ArrayList) mo113968b.mo114018x(descriptor2, 7, kSerializerArr[7], null);
            arrayList = (ArrayList) mo113968b.mo114018x(descriptor2, 8, kSerializerArr[8], null);
            i11 = mo114011i;
            i13 = mo113968b.mo114011i(descriptor2, 9);
            str2 = str10;
            str = str9;
            str4 = str7;
            str3 = str8;
            i14 = mo114011i2;
            arrayList2 = arrayList3;
            str5 = str6;
            j11 = mo113968b.mo114010f(descriptor2, 10);
            i12 = 2047;
        } else {
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            long j12 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i15 = 10;
                        z11 = false;
                    case 0:
                        i17 = mo113968b.mo114011i(descriptor2, 0);
                        i18 |= 1;
                        i15 = 10;
                        i16 = 9;
                    case 1:
                        str15 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str15);
                        i18 |= 2;
                        i15 = 10;
                        i16 = 9;
                    case 2:
                        i21 = mo113968b.mo114011i(descriptor2, 2);
                        i18 |= 4;
                        i15 = 10;
                        i16 = 9;
                    case 3:
                        str14 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str14);
                        i18 |= 8;
                        i15 = 10;
                        i16 = 9;
                    case 4:
                        str13 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str13);
                        i18 |= 16;
                        i15 = 10;
                        i16 = 9;
                    case 5:
                        str11 = (String) mo113968b.mo114018x(descriptor2, 5, C26814n1.f127034a, str11);
                        i18 |= 32;
                        i15 = 10;
                        i16 = 9;
                    case 6:
                        str12 = (String) mo113968b.mo114018x(descriptor2, 6, C26814n1.f127034a, str12);
                        i18 |= 64;
                        i15 = 10;
                        i16 = 9;
                    case 7:
                        arrayList5 = (ArrayList) mo113968b.mo114018x(descriptor2, 7, kSerializerArr[7], arrayList5);
                        i18 |= 128;
                        i15 = 10;
                    case 8:
                        arrayList4 = (ArrayList) mo113968b.mo114018x(descriptor2, 8, kSerializerArr[8], arrayList4);
                        i18 |= 256;
                    case 9:
                        i19 = mo113968b.mo114011i(descriptor2, i16);
                        i18 |= 512;
                    case 10:
                        j12 = mo113968b.mo114010f(descriptor2, i15);
                        i18 |= 1024;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i17;
            arrayList = arrayList4;
            arrayList2 = arrayList5;
            str = str11;
            str2 = str12;
            str3 = str13;
            str4 = str14;
            str5 = str15;
            i12 = i18;
            i13 = i19;
            i14 = i21;
            j11 = j12;
        }
        mo113968b.mo114009c(descriptor2);
        return new BreakSlot(i12, i11, str5, i14, str4, str3, str, str2, arrayList2, arrayList, i13, j11, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, BreakSlot breakSlot) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(breakSlot, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        BreakSlot.m50680w(breakSlot, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
