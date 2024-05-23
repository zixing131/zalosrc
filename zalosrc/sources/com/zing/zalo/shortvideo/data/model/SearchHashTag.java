package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class SearchHashTag implements Parcelable {

    /* renamed from: p */
    private final String f49958p;

    /* renamed from: q */
    private final long f49959q;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SearchHashTag> CREATOR = new C9421a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return SearchHashTag$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.SearchHashTag$a */
    /* loaded from: classes5.dex */
    public static final class C9421a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final SearchHashTag createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new SearchHashTag(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final SearchHashTag[] newArray(int i11) {
            return new SearchHashTag[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.SearchHashTag$b */
    /* loaded from: classes5.dex */
    public static final class C9422b implements KSerializer {

        /* renamed from: a */
        private final SerialDescriptor f49960a = SearchHashTag.Companion.serializer().getDescriptor();

        @Override // qn0.InterfaceC25386a
        /* renamed from: a */
        public SearchHashTag deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                JsonObject m139916m = AbstractC27331i.m139916m(interfaceC27329g.mo139898g());
                return new SearchHashTag(AbstractC9465b.m51742w(m139916m, new String[]{"hashtag"}, null, 2, null), AbstractC9465b.m51736q(m139916m, new String[]{"views"}, 0L, 2, null));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b */
        public void serialize(Encoder encoder, SearchHashTag searchHashTag) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(searchHashTag, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49960a;
        }
    }

    public /* synthetic */ SearchHashTag(int i11, String str, long j11, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, SearchHashTag$$serializer.INSTANCE.getDescriptor());
        }
        this.f49958p = str;
        this.f49959q = j11;
    }

    /* renamed from: b */
    public static /* synthetic */ SearchHashTag m51142b(SearchHashTag searchHashTag, String str, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchHashTag.f49958p;
        }
        if ((i11 & 2) != 0) {
            j11 = searchHashTag.f49959q;
        }
        return searchHashTag.m51144a(str, j11);
    }

    /* renamed from: e */
    public static final /* synthetic */ void m51143e(SearchHashTag searchHashTag, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, searchHashTag.f49958p);
        interfaceC21886d.mo114022E(serialDescriptor, 1, searchHashTag.f49959q);
    }

    /* renamed from: a */
    public final SearchHashTag m51144a(String str, long j11) {
        AbstractC19074t.m100208f(str, "hashtag");
        return new SearchHashTag(str, j11);
    }

    /* renamed from: c */
    public final String m51145c() {
        return this.f49958p;
    }

    /* renamed from: d */
    public final long m51146d() {
        return this.f49959q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHashTag)) {
            return false;
        }
        SearchHashTag searchHashTag = (SearchHashTag) obj;
        return AbstractC19074t.m100204b(this.f49958p, searchHashTag.f49958p) && this.f49959q == searchHashTag.f49959q;
    }

    public int hashCode() {
        return (this.f49958p.hashCode() * 31) + AbstractC2147g0.m11521a(this.f49959q);
    }

    public String toString() {
        return "SearchHashTag(hashtag=" + this.f49958p + ", viewCount=" + this.f49959q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49958p);
        parcel.writeLong(this.f49959q);
    }

    public SearchHashTag(String str, long j11) {
        AbstractC19074t.m100208f(str, "hashtag");
        this.f49958p = str;
        this.f49959q = j11;
    }
}
