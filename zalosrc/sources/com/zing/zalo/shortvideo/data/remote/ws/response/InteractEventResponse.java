package com.zing.zalo.shortvideo.data.remote.ws.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.Content;
import com.zing.zalo.shortvideo.data.model.Content$$serializer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26788f;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class InteractEventResponse implements Parcelable {

    /* renamed from: p */
    private final List f50292p;

    /* renamed from: q */
    private final Long f50293q;

    /* renamed from: r */
    private final Boolean f50294r;

    /* renamed from: s */
    private final Long f50295s;

    /* renamed from: t */
    private final Integer f50296t;

    /* renamed from: u */
    private final Long f50297u;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InteractEventResponse> CREATOR = new C9454a();

    /* renamed from: v */
    private static final KSerializer[] f50291v = {new C26788f(InteractEventResponse$InteractItem$$serializer.INSTANCE), null, null, null, null, null};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return InteractEventResponse$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class InteractItem implements Parcelable {

        /* renamed from: p */
        private final Long f50298p;

        /* renamed from: q */
        private final String f50299q;

        /* renamed from: r */
        private final Content f50300r;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<InteractItem> CREATOR = new C9453a();

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return InteractEventResponse$InteractItem$$serializer.INSTANCE;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse$InteractItem$a */
        /* loaded from: classes5.dex */
        public static final class C9453a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InteractItem createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new InteractItem(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Content.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InteractItem[] newArray(int i11) {
                return new InteractItem[i11];
            }
        }

        public /* synthetic */ InteractItem(int i11, Long l11, String str, Content content, AbstractC26805k1 abstractC26805k1) {
            if ((i11 & 1) == 0) {
                this.f50298p = null;
            } else {
                this.f50298p = l11;
            }
            if ((i11 & 2) == 0) {
                this.f50299q = null;
            } else {
                this.f50299q = str;
            }
            if ((i11 & 4) == 0) {
                this.f50300r = null;
            } else {
                this.f50300r = content;
            }
        }

        /* renamed from: d */
        public static final /* synthetic */ void m51666d(InteractItem interactItem, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || interactItem.f50298p != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, interactItem.f50298p);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || interactItem.f50299q != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, interactItem.f50299q);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || interactItem.f50300r != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 2, Content$$serializer.INSTANCE, interactItem.f50300r);
            }
        }

        /* renamed from: a */
        public final Content m51667a() {
            return this.f50300r;
        }

        /* renamed from: b */
        public final String m51668b() {
            return this.f50299q;
        }

        /* renamed from: c */
        public final Long m51669c() {
            return this.f50298p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InteractItem)) {
                return false;
            }
            InteractItem interactItem = (InteractItem) obj;
            return AbstractC19074t.m100204b(this.f50298p, interactItem.f50298p) && AbstractC19074t.m100204b(this.f50299q, interactItem.f50299q) && AbstractC19074t.m100204b(this.f50300r, interactItem.f50300r);
        }

        public int hashCode() {
            Long l11 = this.f50298p;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            String str = this.f50299q;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Content content = this.f50300r;
            return hashCode2 + (content != null ? content.hashCode() : 0);
        }

        public String toString() {
            return "InteractItem(id=" + this.f50298p + ", icon=" + this.f50299q + ", content=" + this.f50300r + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            Long l11 = this.f50298p;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            parcel.writeString(this.f50299q);
            Content content = this.f50300r;
            if (content == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                content.writeToParcel(parcel, i11);
            }
        }

        public InteractItem(Long l11, String str, Content content) {
            this.f50298p = l11;
            this.f50299q = str;
            this.f50300r = content;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse$a */
    /* loaded from: classes5.dex */
    public static final class C9454a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InteractEventResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC19074t.m100208f(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList2.add(InteractItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new InteractEventResponse(arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InteractEventResponse[] newArray(int i11) {
            return new InteractEventResponse[i11];
        }
    }

    public /* synthetic */ InteractEventResponse(int i11, List list, Long l11, Boolean bool, Long l12, Integer num, Long l13, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50292p = null;
        } else {
            this.f50292p = list;
        }
        if ((i11 & 2) == 0) {
            this.f50293q = null;
        } else {
            this.f50293q = l11;
        }
        if ((i11 & 4) == 0) {
            this.f50294r = null;
        } else {
            this.f50294r = bool;
        }
        if ((i11 & 8) == 0) {
            this.f50295s = null;
        } else {
            this.f50295s = l12;
        }
        if ((i11 & 16) == 0) {
            this.f50296t = null;
        } else {
            this.f50296t = num;
        }
        if ((i11 & 32) == 0) {
            this.f50297u = null;
        } else {
            this.f50297u = l13;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51663d(InteractEventResponse interactEventResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50291v;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || interactEventResponse.f50292p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, kSerializerArr[0], interactEventResponse.f50292p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || interactEventResponse.f50293q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, interactEventResponse.f50293q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || interactEventResponse.f50294r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26794h.f127000a, interactEventResponse.f50294r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || interactEventResponse.f50295s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26810m0.f127024a, interactEventResponse.f50295s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || interactEventResponse.f50296t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26783d0.f126989a, interactEventResponse.f50296t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || interactEventResponse.f50297u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26810m0.f127024a, interactEventResponse.f50297u);
        }
    }

    /* renamed from: b */
    public final List m51664b() {
        return this.f50292p;
    }

    /* renamed from: c */
    public final Long m51665c() {
        return this.f50297u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractEventResponse)) {
            return false;
        }
        InteractEventResponse interactEventResponse = (InteractEventResponse) obj;
        return AbstractC19074t.m100204b(this.f50292p, interactEventResponse.f50292p) && AbstractC19074t.m100204b(this.f50293q, interactEventResponse.f50293q) && AbstractC19074t.m100204b(this.f50294r, interactEventResponse.f50294r) && AbstractC19074t.m100204b(this.f50295s, interactEventResponse.f50295s) && AbstractC19074t.m100204b(this.f50296t, interactEventResponse.f50296t) && AbstractC19074t.m100204b(this.f50297u, interactEventResponse.f50297u);
    }

    public int hashCode() {
        List list = this.f50292p;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l11 = this.f50293q;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.f50294r;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l12 = this.f50295s;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num = this.f50296t;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l13 = this.f50297u;
        return hashCode5 + (l13 != null ? l13.hashCode() : 0);
    }

    public String toString() {
        return "InteractEventResponse(item=" + this.f50292p + ", total=" + this.f50293q + ", hasMore=" + this.f50294r + ", lastId=" + this.f50295s + ", lastIndex=" + this.f50296t + ", liveId=" + this.f50297u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        List list = this.f50292p;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InteractItem) it.next()).writeToParcel(parcel, i11);
            }
        }
        Long l11 = this.f50293q;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Boolean bool = this.f50294r;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l12 = this.f50295s;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l12.longValue());
        }
        Integer num = this.f50296t;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l13 = this.f50297u;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l13.longValue());
        }
    }

    public InteractEventResponse(List list, Long l11, Boolean bool, Long l12, Integer num, Long l13) {
        this.f50292p = list;
        this.f50293q = l11;
        this.f50294r = bool;
        this.f50295s = l12;
        this.f50296t = num;
        this.f50297u = l13;
    }
}
