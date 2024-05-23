package com.zing.zalo.feed.formpostfeed.data;

import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.NumberTheme$$serializer;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26783d0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class PromotePostItem$$serializer implements InterfaceC26842x {
    public static final PromotePostItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PromotePostItem$$serializer promotePostItem$$serializer = new PromotePostItem$$serializer();
        INSTANCE = promotePostItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.formpostfeed.data.PromotePostItem", promotePostItem$$serializer, 9);
        pluginGeneratedSerialDescriptor.m114047n("id", true);
        pluginGeneratedSerialDescriptor.m114047n("caption", true);
        pluginGeneratedSerialDescriptor.m114047n("bgColor", true);
        pluginGeneratedSerialDescriptor.m114047n("icon", true);
        pluginGeneratedSerialDescriptor.m114047n("iconUrl", true);
        pluginGeneratedSerialDescriptor.m114047n("tipCat", true);
        pluginGeneratedSerialDescriptor.m114047n("actionType", true);
        pluginGeneratedSerialDescriptor.m114047n("actionData", true);
        pluginGeneratedSerialDescriptor.m114047n("srcTracking", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PromotePostItem$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{C26783d0.f126989a, MessagePost$$serializer.INSTANCE, NumberTheme$$serializer.INSTANCE, Display$$serializer.INSTANCE, c26814n1, c26814n1, c26814n1, c26814n1, c26814n1};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x007f. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public PromotePostItem deserialize(Decoder decoder) {
        int i11;
        int i12;
        MessagePost messagePost;
        NumberTheme numberTheme;
        Display display;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            MessagePost messagePost2 = (MessagePost) mo113968b.mo114012l(descriptor2, 1, MessagePost$$serializer.INSTANCE, null);
            NumberTheme numberTheme2 = (NumberTheme) mo113968b.mo114012l(descriptor2, 2, NumberTheme$$serializer.INSTANCE, null);
            Display display2 = (Display) mo113968b.mo114012l(descriptor2, 3, Display$$serializer.INSTANCE, null);
            String mo114014o = mo113968b.mo114014o(descriptor2, 4);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 5);
            String mo114014o3 = mo113968b.mo114014o(descriptor2, 6);
            i11 = mo114011i;
            str4 = mo113968b.mo114014o(descriptor2, 7);
            str3 = mo114014o3;
            str2 = mo114014o2;
            display = display2;
            str5 = mo113968b.mo114014o(descriptor2, 8);
            str = mo114014o;
            numberTheme = numberTheme2;
            messagePost = messagePost2;
            i12 = 511;
        } else {
            MessagePost messagePost3 = null;
            NumberTheme numberTheme3 = null;
            Display display3 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
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
                        messagePost3 = (MessagePost) mo113968b.mo114012l(descriptor2, 1, MessagePost$$serializer.INSTANCE, messagePost3);
                        i14 |= 2;
                    case 2:
                        numberTheme3 = (NumberTheme) mo113968b.mo114012l(descriptor2, 2, NumberTheme$$serializer.INSTANCE, numberTheme3);
                        i14 |= 4;
                    case 3:
                        display3 = (Display) mo113968b.mo114012l(descriptor2, 3, Display$$serializer.INSTANCE, display3);
                        i14 |= 8;
                    case 4:
                        str6 = mo113968b.mo114014o(descriptor2, 4);
                        i14 |= 16;
                    case 5:
                        str7 = mo113968b.mo114014o(descriptor2, 5);
                        i14 |= 32;
                    case 6:
                        str8 = mo113968b.mo114014o(descriptor2, 6);
                        i14 |= 64;
                    case 7:
                        str9 = mo113968b.mo114014o(descriptor2, 7);
                        i14 |= 128;
                    case 8:
                        str10 = mo113968b.mo114014o(descriptor2, 8);
                        i14 |= 256;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i13;
            i12 = i14;
            messagePost = messagePost3;
            numberTheme = numberTheme3;
            display = display3;
            str = str6;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        mo113968b.mo114009c(descriptor2);
        return new PromotePostItem(i12, i11, messagePost, numberTheme, display, str, str2, str3, str4, str5, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, PromotePostItem promotePostItem) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(promotePostItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        PromotePostItem.write$Self$app_release(promotePostItem, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
