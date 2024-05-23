package com.zing.zalo.feed.formpostfeed.data;

import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.NumberTheme$$serializer;
import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.feed.data.TextLocalization$$serializer;
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
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class MessagePost$$serializer implements InterfaceC26842x {
    public static final MessagePost$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessagePost$$serializer messagePost$$serializer = new MessagePost$$serializer();
        INSTANCE = messagePost$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.formpostfeed.data.MessagePost", messagePost$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("text", true);
        pluginGeneratedSerialDescriptor.m114047n("color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessagePost$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{TextLocalization$$serializer.INSTANCE, NumberTheme$$serializer.INSTANCE};
    }

    @Override // qn0.InterfaceC25386a
    public MessagePost deserialize(Decoder decoder) {
        TextLocalization textLocalization;
        NumberTheme numberTheme;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        AbstractC26805k1 abstractC26805k1 = null;
        if (mo113968b.mo114015q()) {
            textLocalization = (TextLocalization) mo113968b.mo114012l(descriptor2, 0, TextLocalization$$serializer.INSTANCE, null);
            numberTheme = (NumberTheme) mo113968b.mo114012l(descriptor2, 1, NumberTheme$$serializer.INSTANCE, null);
            i11 = 3;
        } else {
            textLocalization = null;
            NumberTheme numberTheme2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    textLocalization = (TextLocalization) mo113968b.mo114012l(descriptor2, 0, TextLocalization$$serializer.INSTANCE, textLocalization);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    numberTheme2 = (NumberTheme) mo113968b.mo114012l(descriptor2, 1, NumberTheme$$serializer.INSTANCE, numberTheme2);
                    i12 |= 2;
                }
            }
            numberTheme = numberTheme2;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new MessagePost(i11, textLocalization, numberTheme, abstractC26805k1);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, MessagePost messagePost) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(messagePost, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        MessagePost.write$Self$app_release(messagePost, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
