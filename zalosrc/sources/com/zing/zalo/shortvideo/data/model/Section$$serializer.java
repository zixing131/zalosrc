package com.zing.zalo.shortvideo.data.model;

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
import rn0.AbstractC25935a;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class Section$$serializer<T> implements InterfaceC26842x {
    private final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;
    private final /* synthetic */ KSerializer typeSerial0;

    private Section$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Section", this, 3);
        pluginGeneratedSerialDescriptor.m114047n("items", true);
        pluginGeneratedSerialDescriptor.m114047n("total", true);
        pluginGeneratedSerialDescriptor.m114047n("loadMoreInfo", true);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    private final KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Section.f49962s;
        return new KSerializer[]{new C26788f(this.typeSerial0), C26810m0.f127024a, AbstractC25935a.m133630u(kSerializerArr[2])};
    }

    @Override // qn0.InterfaceC25386a
    public Section<T> deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        List list;
        long j11;
        LoadMoreInfo loadMoreInfo;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor);
        kSerializerArr = Section.f49962s;
        List list2 = null;
        if (mo113968b.mo114015q()) {
            List list3 = (List) mo113968b.mo114012l(descriptor, 0, new C26788f(this.typeSerial0), null);
            long mo114010f = mo113968b.mo114010f(descriptor, 1);
            loadMoreInfo = (LoadMoreInfo) mo113968b.mo114018x(descriptor, 2, kSerializerArr[2], null);
            list = list3;
            j11 = mo114010f;
            i11 = 7;
        } else {
            long j12 = 0;
            LoadMoreInfo loadMoreInfo2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    list2 = (List) mo113968b.mo114012l(descriptor, 0, new C26788f(this.typeSerial0), list2);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    j12 = mo113968b.mo114010f(descriptor, 1);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    loadMoreInfo2 = (LoadMoreInfo) mo113968b.mo114018x(descriptor, 2, kSerializerArr[2], loadMoreInfo2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            list = list2;
            j11 = j12;
            loadMoreInfo = loadMoreInfo2;
        }
        mo113968b.mo114009c(descriptor);
        return new Section<>(i11, list, j11, loadMoreInfo, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Section<T> section) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(section, "value");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor);
        Section.m51161x(section, mo113984b, descriptor, this.typeSerial0);
        mo113984b.mo114026c(descriptor);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Section$$serializer(KSerializer kSerializer) {
        this();
        AbstractC19074t.m100208f(kSerializer, "typeSerial0");
        this.typeSerial0 = kSerializer;
    }
}
