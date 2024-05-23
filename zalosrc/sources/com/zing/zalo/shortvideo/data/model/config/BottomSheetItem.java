package com.zing.zalo.shortvideo.data.model.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import d10.AbstractC17708a;
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
public final class BottomSheetItem implements Parcelable {

    /* renamed from: p */
    private final Integer f50098p;

    /* renamed from: q */
    private final String f50099q;

    /* renamed from: r */
    private final String f50100r;

    /* renamed from: s */
    private final String f50101s;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BottomSheetItem> CREATOR = new C9441a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final BottomSheetItem m51416a(JsonObject jsonObject) {
            if (jsonObject == null) {
                return null;
            }
            return new BottomSheetItem(AbstractC9465b.m51729j(jsonObject, ZinstantMetaConstant.IMPRESSION_META_TYPE), AbstractC9465b.m51743x(jsonObject, "title"), AbstractC9465b.m51743x(jsonObject, "icon"), AbstractC9465b.m51743x(jsonObject, "value"));
        }

        public final KSerializer serializer() {
            return BottomSheetItem$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.config.BottomSheetItem$a */
    /* loaded from: classes5.dex */
    public static final class C9441a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BottomSheetItem createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new BottomSheetItem(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BottomSheetItem[] newArray(int i11) {
            return new BottomSheetItem[i11];
        }
    }

    public /* synthetic */ BottomSheetItem(int i11, Integer num, String str, String str2, String str3, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50098p = null;
        } else {
            this.f50098p = num;
        }
        if ((i11 & 2) == 0) {
            this.f50099q = null;
        } else {
            this.f50099q = str;
        }
        if ((i11 & 4) == 0) {
            this.f50100r = null;
        } else {
            this.f50100r = str2;
        }
        if ((i11 & 8) == 0) {
            this.f50101s = null;
        } else {
            this.f50101s = str3;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m51410f(BottomSheetItem bottomSheetItem, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || bottomSheetItem.f50098p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, bottomSheetItem.f50098p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || bottomSheetItem.f50099q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, bottomSheetItem.f50099q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || bottomSheetItem.f50100r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, bottomSheetItem.f50100r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || bottomSheetItem.f50101s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, bottomSheetItem.f50101s);
        }
    }

    /* renamed from: a */
    public final String m51411a() {
        return this.f50100r;
    }

    /* renamed from: b */
    public final String m51412b() {
        return this.f50099q;
    }

    /* renamed from: c */
    public final Integer m51413c() {
        return this.f50098p;
    }

    /* renamed from: d */
    public final String m51414d() {
        return this.f50101s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m51415e() {
        int i11;
        i11 = AbstractC17708a.f89792a;
        Integer num = this.f50098p;
        if (num != null && i11 == num.intValue()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetItem)) {
            return false;
        }
        BottomSheetItem bottomSheetItem = (BottomSheetItem) obj;
        return AbstractC19074t.m100204b(this.f50098p, bottomSheetItem.f50098p) && AbstractC19074t.m100204b(this.f50099q, bottomSheetItem.f50099q) && AbstractC19074t.m100204b(this.f50100r, bottomSheetItem.f50100r) && AbstractC19074t.m100204b(this.f50101s, bottomSheetItem.f50101s);
    }

    public int hashCode() {
        Integer num = this.f50098p;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f50099q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50100r;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50101s;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isValid() {
        return this.f50098p != null;
    }

    public String toString() {
        return "BottomSheetItem(type=" + this.f50098p + ", title=" + this.f50099q + ", icon=" + this.f50100r + ", value=" + this.f50101s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int intValue;
        AbstractC19074t.m100208f(parcel, "out");
        Integer num = this.f50098p;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.f50099q);
        parcel.writeString(this.f50100r);
        parcel.writeString(this.f50101s);
    }

    public BottomSheetItem(Integer num, String str, String str2, String str3) {
        this.f50098p = num;
        this.f50099q = str;
        this.f50100r = str2;
        this.f50101s = str3;
    }

    public /* synthetic */ BottomSheetItem(Integer num, String str, String str2, String str3, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
    }
}
