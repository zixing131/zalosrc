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
import tn0.C26794h;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class CursorLoadMoreInfo$$serializer implements InterfaceC26842x {
    public static final CursorLoadMoreInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CursorLoadMoreInfo$$serializer cursorLoadMoreInfo$$serializer = new CursorLoadMoreInfo$$serializer();
        INSTANCE = cursorLoadMoreInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.CursorLoadMoreInfo", cursorLoadMoreInfo$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("hasMore", true);
        pluginGeneratedSerialDescriptor.m114047n("cursor", true);
        pluginGeneratedSerialDescriptor.m114047n("path", true);
        pluginGeneratedSerialDescriptor.m114047n("pagingExt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CursorLoadMoreInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{C26794h.f127000a, c26814n1, c26814n1, c26814n1};
    }

    @Override // qn0.InterfaceC25386a
    public CursorLoadMoreInfo deserialize(Decoder decoder) {
        boolean z11;
        String str;
        String str2;
        String str3;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            boolean mo114004D = mo113968b.mo114004D(descriptor2, 0);
            String mo114014o = mo113968b.mo114014o(descriptor2, 1);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 2);
            z11 = mo114004D;
            str = mo113968b.mo114014o(descriptor2, 3);
            str2 = mo114014o2;
            str3 = mo114014o;
            i11 = 15;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z12 = false;
            int i12 = 0;
            boolean z13 = true;
            while (z13) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z13 = false;
                } else if (mo114037p == 0) {
                    z12 = mo113968b.mo114004D(descriptor2, 0);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    str6 = mo113968b.mo114014o(descriptor2, 1);
                    i12 |= 2;
                } else if (mo114037p == 2) {
                    str5 = mo113968b.mo114014o(descriptor2, 2);
                    i12 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str4 = mo113968b.mo114014o(descriptor2, 3);
                    i12 |= 8;
                }
            }
            z11 = z12;
            str = str4;
            str2 = str5;
            str3 = str6;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new CursorLoadMoreInfo(i11, z11, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, CursorLoadMoreInfo cursorLoadMoreInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(cursorLoadMoreInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        CursorLoadMoreInfo.m50913d(cursorLoadMoreInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
