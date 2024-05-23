package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Stats implements Parcelable {

    /* renamed from: p */
    private final String f49983p;

    /* renamed from: q */
    private final String f49984q;

    /* renamed from: r */
    private final Integer f49985r;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Stats> CREATOR = new C9430a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Stats m51217a(JsonObject jsonObject) {
            AbstractC19074t.m100208f(jsonObject, "json");
            return new Stats(AbstractC9465b.m51743x(jsonObject, "name"), AbstractC9465b.m51743x(jsonObject, "value"), AbstractC9465b.m51729j(jsonObject, ZinstantMetaConstant.IMPRESSION_META_TYPE));
        }

        public final KSerializer serializer() {
            return Stats$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Stats$a */
    /* loaded from: classes5.dex */
    public static final class C9430a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Stats createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Stats(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Stats[] newArray(int i11) {
            return new Stats[i11];
        }
    }

    public /* synthetic */ Stats(int i11, String str, String str2, Integer num, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49983p = null;
        } else {
            this.f49983p = str;
        }
        if ((i11 & 2) == 0) {
            this.f49984q = null;
        } else {
            this.f49984q = str2;
        }
        if ((i11 & 4) == 0) {
            this.f49985r = null;
        } else {
            this.f49985r = num;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51213d(Stats stats, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || stats.f49983p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, stats.f49983p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || stats.f49984q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, stats.f49984q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || stats.f49985r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26783d0.f126989a, stats.f49985r);
        }
    }

    /* renamed from: a */
    public final String m51214a() {
        return this.f49983p;
    }

    /* renamed from: b */
    public final Integer m51215b() {
        return this.f49985r;
    }

    /* renamed from: c */
    public final String m51216c() {
        return this.f49984q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stats)) {
            return false;
        }
        Stats stats = (Stats) obj;
        return AbstractC19074t.m100204b(this.f49983p, stats.f49983p) && AbstractC19074t.m100204b(this.f49984q, stats.f49984q) && AbstractC19074t.m100204b(this.f49985r, stats.f49985r);
    }

    public int hashCode() {
        String str = this.f49983p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f49984q;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f49985r;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Stats(name=" + this.f49983p + ", value=" + this.f49984q + ", type=" + this.f49985r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int intValue;
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49983p);
        parcel.writeString(this.f49984q);
        Integer num = this.f49985r;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public Stats(String str, String str2, Integer num) {
        this.f49983p = str;
        this.f49984q = str2;
        this.f49985r = num;
    }
}
