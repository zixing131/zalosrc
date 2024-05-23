package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class SearchSuggest implements Parcelable {

    /* renamed from: p */
    private final String f49961p;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SearchSuggest> CREATOR = new C9423a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return SearchSuggest$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.SearchSuggest$a */
    /* loaded from: classes5.dex */
    public static final class C9423a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SearchSuggest createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new SearchSuggest(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SearchSuggest[] newArray(int i11) {
            return new SearchSuggest[i11];
        }
    }

    public /* synthetic */ SearchSuggest(int i11, String str, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, SearchSuggest$$serializer.INSTANCE.getDescriptor());
        }
        this.f49961p = str;
    }

    /* renamed from: a */
    public final String m51152a() {
        return this.f49961p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSuggest) && AbstractC19074t.m100204b(this.f49961p, ((SearchSuggest) obj).f49961p);
    }

    public int hashCode() {
        return this.f49961p.hashCode();
    }

    public String toString() {
        return "SearchSuggest(suggest=" + this.f49961p + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49961p);
    }

    public SearchSuggest(String str) {
        AbstractC19074t.m100208f(str, "suggest");
        this.f49961p = str;
    }
}
