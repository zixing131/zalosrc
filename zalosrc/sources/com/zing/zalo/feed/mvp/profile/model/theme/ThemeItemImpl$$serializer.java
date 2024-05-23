package com.zing.zalo.feed.mvp.profile.model.theme;

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
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class ThemeItemImpl$$serializer implements InterfaceC26842x {
    public static final ThemeItemImpl$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ThemeItemImpl$$serializer themeItemImpl$$serializer = new ThemeItemImpl$$serializer();
        INSTANCE = themeItemImpl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl", themeItemImpl$$serializer, 7);
        pluginGeneratedSerialDescriptor.m114047n("id", true);
        pluginGeneratedSerialDescriptor.m114047n("decor_item", true);
        pluginGeneratedSerialDescriptor.m114047n("decor_item_dm", true);
        pluginGeneratedSerialDescriptor.m114047n("decor_album", true);
        pluginGeneratedSerialDescriptor.m114047n("decor_album_dm", true);
        pluginGeneratedSerialDescriptor.m114047n("content", true);
        pluginGeneratedSerialDescriptor.m114047n("content_dm", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ThemeItemImpl$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        DecorItemImpl$$serializer decorItemImpl$$serializer = DecorItemImpl$$serializer.INSTANCE;
        DecorAlbumImpl$$serializer decorAlbumImpl$$serializer = DecorAlbumImpl$$serializer.INSTANCE;
        ContentImpl$$serializer contentImpl$$serializer = ContentImpl$$serializer.INSTANCE;
        return new KSerializer[]{C26783d0.f126989a, decorItemImpl$$serializer, AbstractC25935a.m133630u(decorItemImpl$$serializer), decorAlbumImpl$$serializer, AbstractC25935a.m133630u(decorAlbumImpl$$serializer), contentImpl$$serializer, AbstractC25935a.m133630u(contentImpl$$serializer)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x006f. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public ThemeItemImpl deserialize(Decoder decoder) {
        int i11;
        ContentImpl contentImpl;
        int i12;
        DecorItemImpl decorItemImpl;
        DecorItemImpl decorItemImpl2;
        DecorAlbumImpl decorAlbumImpl;
        DecorAlbumImpl decorAlbumImpl2;
        ContentImpl contentImpl2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i13 = 6;
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            DecorItemImpl$$serializer decorItemImpl$$serializer = DecorItemImpl$$serializer.INSTANCE;
            DecorItemImpl decorItemImpl3 = (DecorItemImpl) mo113968b.mo114012l(descriptor2, 1, decorItemImpl$$serializer, null);
            DecorItemImpl decorItemImpl4 = (DecorItemImpl) mo113968b.mo114018x(descriptor2, 2, decorItemImpl$$serializer, null);
            DecorAlbumImpl$$serializer decorAlbumImpl$$serializer = DecorAlbumImpl$$serializer.INSTANCE;
            DecorAlbumImpl decorAlbumImpl3 = (DecorAlbumImpl) mo113968b.mo114012l(descriptor2, 3, decorAlbumImpl$$serializer, null);
            DecorAlbumImpl decorAlbumImpl4 = (DecorAlbumImpl) mo113968b.mo114018x(descriptor2, 4, decorAlbumImpl$$serializer, null);
            ContentImpl$$serializer contentImpl$$serializer = ContentImpl$$serializer.INSTANCE;
            ContentImpl contentImpl3 = (ContentImpl) mo113968b.mo114012l(descriptor2, 5, contentImpl$$serializer, null);
            i11 = mo114011i;
            contentImpl = (ContentImpl) mo113968b.mo114018x(descriptor2, 6, contentImpl$$serializer, null);
            contentImpl2 = contentImpl3;
            decorAlbumImpl = decorAlbumImpl3;
            decorAlbumImpl2 = decorAlbumImpl4;
            decorItemImpl2 = decorItemImpl4;
            decorItemImpl = decorItemImpl3;
            i12 = 127;
        } else {
            ContentImpl contentImpl4 = null;
            DecorItemImpl decorItemImpl5 = null;
            DecorItemImpl decorItemImpl6 = null;
            DecorAlbumImpl decorAlbumImpl5 = null;
            DecorAlbumImpl decorAlbumImpl6 = null;
            ContentImpl contentImpl5 = null;
            int i14 = 0;
            int i15 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z11 = false;
                    case 0:
                        i14 = mo113968b.mo114011i(descriptor2, 0);
                        i15 |= 1;
                        i13 = 6;
                    case 1:
                        decorItemImpl5 = (DecorItemImpl) mo113968b.mo114012l(descriptor2, 1, DecorItemImpl$$serializer.INSTANCE, decorItemImpl5);
                        i15 |= 2;
                        i13 = 6;
                    case 2:
                        decorItemImpl6 = (DecorItemImpl) mo113968b.mo114018x(descriptor2, 2, DecorItemImpl$$serializer.INSTANCE, decorItemImpl6);
                        i15 |= 4;
                    case 3:
                        decorAlbumImpl5 = (DecorAlbumImpl) mo113968b.mo114012l(descriptor2, 3, DecorAlbumImpl$$serializer.INSTANCE, decorAlbumImpl5);
                        i15 |= 8;
                    case 4:
                        decorAlbumImpl6 = (DecorAlbumImpl) mo113968b.mo114018x(descriptor2, 4, DecorAlbumImpl$$serializer.INSTANCE, decorAlbumImpl6);
                        i15 |= 16;
                    case 5:
                        contentImpl5 = (ContentImpl) mo113968b.mo114012l(descriptor2, 5, ContentImpl$$serializer.INSTANCE, contentImpl5);
                        i15 |= 32;
                    case 6:
                        contentImpl4 = (ContentImpl) mo113968b.mo114018x(descriptor2, i13, ContentImpl$$serializer.INSTANCE, contentImpl4);
                        i15 |= 64;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i14;
            contentImpl = contentImpl4;
            i12 = i15;
            decorItemImpl = decorItemImpl5;
            decorItemImpl2 = decorItemImpl6;
            decorAlbumImpl = decorAlbumImpl5;
            decorAlbumImpl2 = decorAlbumImpl6;
            contentImpl2 = contentImpl5;
        }
        mo113968b.mo114009c(descriptor2);
        return new ThemeItemImpl(i12, i11, decorItemImpl, decorItemImpl2, decorAlbumImpl, decorAlbumImpl2, contentImpl2, contentImpl, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ThemeItemImpl themeItemImpl) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(themeItemImpl, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        ThemeItemImpl.write$Self$app_release(themeItemImpl, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
