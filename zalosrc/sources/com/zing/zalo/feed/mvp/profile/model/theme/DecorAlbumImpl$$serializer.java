package com.zing.zalo.feed.mvp.profile.model.theme;

import fn0.AbstractC19074t;
import java.util.List;
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
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class DecorAlbumImpl$$serializer implements InterfaceC26842x {
    public static final DecorAlbumImpl$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DecorAlbumImpl$$serializer decorAlbumImpl$$serializer = new DecorAlbumImpl$$serializer();
        INSTANCE = decorAlbumImpl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.mvp.profile.model.theme.DecorAlbumImpl", decorAlbumImpl$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("bg_color", true);
        pluginGeneratedSerialDescriptor.m114047n("images", true);
        pluginGeneratedSerialDescriptor.m114047n("top_gradient", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DecorAlbumImpl$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = DecorAlbumImpl.$childSerializers;
        return new KSerializer[]{C26783d0.f126989a, kSerializerArr[1], TopGradientImpl$$serializer.INSTANCE};
    }

    @Override // qn0.InterfaceC25386a
    public DecorAlbumImpl deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        int i12;
        List list;
        TopGradientImpl topGradientImpl;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = DecorAlbumImpl.$childSerializers;
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            list = (List) mo113968b.mo114012l(descriptor2, 1, kSerializerArr[1], null);
            i11 = mo114011i;
            topGradientImpl = (TopGradientImpl) mo113968b.mo114012l(descriptor2, 2, TopGradientImpl$$serializer.INSTANCE, null);
            i12 = 7;
        } else {
            List list2 = null;
            TopGradientImpl topGradientImpl2 = null;
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
                    list2 = (List) mo113968b.mo114012l(descriptor2, 1, kSerializerArr[1], list2);
                    i14 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    topGradientImpl2 = (TopGradientImpl) mo113968b.mo114012l(descriptor2, 2, TopGradientImpl$$serializer.INSTANCE, topGradientImpl2);
                    i14 |= 4;
                }
            }
            i11 = i13;
            i12 = i14;
            list = list2;
            topGradientImpl = topGradientImpl2;
        }
        mo113968b.mo114009c(descriptor2);
        return new DecorAlbumImpl(i12, i11, list, topGradientImpl, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, DecorAlbumImpl decorAlbumImpl) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(decorAlbumImpl, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        DecorAlbumImpl.write$Self$app_release(decorAlbumImpl, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
