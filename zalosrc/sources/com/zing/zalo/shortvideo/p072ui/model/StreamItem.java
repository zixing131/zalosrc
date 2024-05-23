package com.zing.zalo.shortvideo.p072ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.remote.ws.response.LiveChannel;
import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData;
import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData$$serializer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class StreamItem implements Parcelable {

    /* renamed from: p */
    private final StreamData f51356p;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StreamItem> CREATOR = new C9776a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return StreamItem$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.StreamItem$a */
    /* loaded from: classes5.dex */
    public static final class C9776a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StreamItem createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new StreamItem(StreamData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StreamItem[] newArray(int i11) {
            return new StreamItem[i11];
        }
    }

    public /* synthetic */ StreamItem(int i11, StreamData streamData, AbstractC26805k1 abstractC26805k1) {
        this.f51356p = (i11 & 1) == 0 ? new StreamData((Long) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (LiveChannel) null, (StreamData.Stat) null, 0.0f, 0.0f, (String) null, 0L, (Long) null, 8388607, (AbstractC19060k) null) : streamData;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m52823a(StreamItem streamItem, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (!interfaceC21886d.mo114019A(serialDescriptor, 0)) {
            if (AbstractC19074t.m100204b(streamItem.f51356p, new StreamData((Long) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (Integer) (0 == true ? 1 : 0), (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (LiveChannel) null, (StreamData.Stat) null, 0.0f, 0.0f, (String) null, 0L, (Long) null, 8388607, (AbstractC19060k) null))) {
                return;
            }
        }
        interfaceC21886d.mo114029i(serialDescriptor, 0, StreamData$$serializer.INSTANCE, streamItem.f51356p);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreamItem) && AbstractC19074t.m100204b(this.f51356p, ((StreamItem) obj).f51356p);
    }

    public int hashCode() {
        return this.f51356p.hashCode();
    }

    public String toString() {
        return "StreamItem(stream=" + this.f51356p + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        this.f51356p.writeToParcel(parcel, i11);
    }

    public StreamItem(StreamData streamData) {
        AbstractC19074t.m100208f(streamData, "stream");
        this.f51356p = streamData;
    }
}
