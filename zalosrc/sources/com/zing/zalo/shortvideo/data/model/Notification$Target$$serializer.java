package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.model.Notification;
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
public final class Notification$Target$$serializer implements InterfaceC26842x {
    public static final Notification$Target$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Notification$Target$$serializer notification$Target$$serializer = new Notification$Target$$serializer();
        INSTANCE = notification$Target$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Notification.Target", notification$Target$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("actionType", false);
        pluginGeneratedSerialDescriptor.m114047n("thumb", true);
        pluginGeneratedSerialDescriptor.m114047n("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Notification$Target$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Notification.Target.f49924s;
        return new KSerializer[]{C26783d0.f126989a, AbstractC25935a.m133630u(C26814n1.f127034a), AbstractC25935a.m133630u(kSerializerArr[2])};
    }

    @Override // qn0.InterfaceC25386a
    public Notification.Target deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        int i12;
        String str;
        Notification.Payload payload;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = Notification.Target.f49924s;
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            String str2 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, null);
            payload = (Notification.Payload) mo113968b.mo114018x(descriptor2, 2, kSerializerArr[2], null);
            i11 = mo114011i;
            str = str2;
            i12 = 7;
        } else {
            String str3 = null;
            Notification.Payload payload2 = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i13 = mo113968b.mo114011i(descriptor2, 0);
                    i14 |= 1;
                } else if (mo114037p == 1) {
                    str3 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str3);
                    i14 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    payload2 = (Notification.Payload) mo113968b.mo114018x(descriptor2, 2, kSerializerArr[2], payload2);
                    i14 |= 4;
                }
            }
            i11 = i13;
            i12 = i14;
            str = str3;
            payload = payload2;
        }
        mo113968b.mo114009c(descriptor2);
        return new Notification.Target(i12, i11, str, payload, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Notification.Target target) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(target, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Notification.Target.m51083e(target, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
