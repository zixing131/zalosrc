package com.zing.zalo.shortvideo.data.model;

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
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class InAppNotification$$serializer implements InterfaceC26842x {
    public static final InAppNotification$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        InAppNotification$$serializer inAppNotification$$serializer = new InAppNotification$$serializer();
        INSTANCE = inAppNotification$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.InAppNotification", inAppNotification$$serializer, 6);
        pluginGeneratedSerialDescriptor.m114047n("popupType", false);
        pluginGeneratedSerialDescriptor.m114047n("timeoutMillis", false);
        pluginGeneratedSerialDescriptor.m114047n("icon", false);
        pluginGeneratedSerialDescriptor.m114047n("title", false);
        pluginGeneratedSerialDescriptor.m114047n("link", true);
        pluginGeneratedSerialDescriptor.m114047n("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InAppNotification$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{C26783d0.f126989a, C26810m0.f127024a, c26814n1, c26814n1, AbstractC25935a.m133630u(c26814n1), Content$$serializer.INSTANCE};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005e. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public InAppNotification deserialize(Decoder decoder) {
        int i11;
        int i12;
        long j11;
        String str;
        String str2;
        String str3;
        Content content;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            long mo114010f = mo113968b.mo114010f(descriptor2, 1);
            String mo114014o = mo113968b.mo114014o(descriptor2, 2);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 3);
            String str4 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, null);
            i11 = mo114011i;
            content = (Content) mo113968b.mo114012l(descriptor2, 5, Content$$serializer.INSTANCE, null);
            str2 = mo114014o2;
            str3 = str4;
            str = mo114014o;
            j11 = mo114010f;
            i12 = 63;
        } else {
            long j12 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Content content2 = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z11 = false;
                    case 0:
                        i13 = mo113968b.mo114011i(descriptor2, 0);
                        i14 |= 1;
                    case 1:
                        j12 = mo113968b.mo114010f(descriptor2, 1);
                        i14 |= 2;
                    case 2:
                        str5 = mo113968b.mo114014o(descriptor2, 2);
                        i14 |= 4;
                    case 3:
                        str6 = mo113968b.mo114014o(descriptor2, 3);
                        i14 |= 8;
                    case 4:
                        str7 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str7);
                        i14 |= 16;
                    case 5:
                        content2 = (Content) mo113968b.mo114012l(descriptor2, 5, Content$$serializer.INSTANCE, content2);
                        i14 |= 32;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i13;
            i12 = i14;
            j11 = j12;
            str = str5;
            str2 = str6;
            str3 = str7;
            content = content2;
        }
        mo113968b.mo114009c(descriptor2);
        return new InAppNotification(i12, i11, j11, str, str2, str3, content, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, InAppNotification inAppNotification) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(inAppNotification, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        InAppNotification.m50966g(inAppNotification, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
