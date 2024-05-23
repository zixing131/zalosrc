package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.model.Notification;
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
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class Notification$$serializer implements InterfaceC26842x {
    public static final Notification$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Notification$$serializer notification$$serializer = new Notification$$serializer();
        INSTANCE = notification$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Notification", notification$$serializer, 8);
        pluginGeneratedSerialDescriptor.m114047n("id", false);
        pluginGeneratedSerialDescriptor.m114047n("content", false);
        pluginGeneratedSerialDescriptor.m114047n("subContent", true);
        pluginGeneratedSerialDescriptor.m114047n("notiType", false);
        pluginGeneratedSerialDescriptor.m114047n("createdTime", false);
        pluginGeneratedSerialDescriptor.m114047n("from", false);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.TARGET_VIEWPORT, false);
        pluginGeneratedSerialDescriptor.m114047n("attributes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Notification$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26783d0 c26783d0 = C26783d0.f126989a;
        Notification$Target$$serializer notification$Target$$serializer = Notification$Target$$serializer.INSTANCE;
        return new KSerializer[]{c26814n1, Content$$serializer.INSTANCE, c26814n1, c26783d0, C26810m0.f127024a, notification$Target$$serializer, notification$Target$$serializer, AbstractC25935a.m133630u(c26783d0)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0076. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public Notification deserialize(Decoder decoder) {
        int i11;
        Integer num;
        Notification.Target target;
        int i12;
        String str;
        Content content;
        String str2;
        Notification.Target target2;
        long j11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i13 = 7;
        int i14 = 6;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            Content content2 = (Content) mo113968b.mo114012l(descriptor2, 1, Content$$serializer.INSTANCE, null);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 2);
            int mo114011i = mo113968b.mo114011i(descriptor2, 3);
            long mo114010f = mo113968b.mo114010f(descriptor2, 4);
            Notification$Target$$serializer notification$Target$$serializer = Notification$Target$$serializer.INSTANCE;
            Notification.Target target3 = (Notification.Target) mo113968b.mo114012l(descriptor2, 5, notification$Target$$serializer, null);
            Notification.Target target4 = (Notification.Target) mo113968b.mo114012l(descriptor2, 6, notification$Target$$serializer, null);
            str = mo114014o;
            num = (Integer) mo113968b.mo114018x(descriptor2, 7, C26783d0.f126989a, null);
            target = target4;
            target2 = target3;
            i11 = mo114011i;
            str2 = mo114014o2;
            content = content2;
            j11 = mo114010f;
            i12 = 255;
        } else {
            Integer num2 = null;
            Notification.Target target5 = null;
            String str3 = null;
            Notification.Target target6 = null;
            long j12 = 0;
            int i15 = 0;
            boolean z11 = true;
            String str4 = null;
            Content content3 = null;
            int i16 = 0;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i13 = 7;
                        z11 = false;
                    case 0:
                        str4 = mo113968b.mo114014o(descriptor2, 0);
                        i16 |= 1;
                        i13 = 7;
                        i14 = 6;
                    case 1:
                        content3 = (Content) mo113968b.mo114012l(descriptor2, 1, Content$$serializer.INSTANCE, content3);
                        i16 |= 2;
                        i13 = 7;
                        i14 = 6;
                    case 2:
                        str3 = mo113968b.mo114014o(descriptor2, 2);
                        i16 |= 4;
                    case 3:
                        i15 = mo113968b.mo114011i(descriptor2, 3);
                        i16 |= 8;
                    case 4:
                        j12 = mo113968b.mo114010f(descriptor2, 4);
                        i16 |= 16;
                    case 5:
                        target6 = (Notification.Target) mo113968b.mo114012l(descriptor2, 5, Notification$Target$$serializer.INSTANCE, target6);
                        i16 |= 32;
                    case 6:
                        target5 = (Notification.Target) mo113968b.mo114012l(descriptor2, i14, Notification$Target$$serializer.INSTANCE, target5);
                        i16 |= 64;
                    case 7:
                        num2 = (Integer) mo113968b.mo114018x(descriptor2, i13, C26783d0.f126989a, num2);
                        i16 |= 128;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i15;
            num = num2;
            target = target5;
            i12 = i16;
            str = str4;
            content = content3;
            str2 = str3;
            target2 = target6;
            j11 = j12;
        }
        mo113968b.mo114009c(descriptor2);
        return new Notification(i12, str, content, str2, i11, j11, target2, target, num, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Notification notification) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(notification, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Notification.m51048q(notification, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
