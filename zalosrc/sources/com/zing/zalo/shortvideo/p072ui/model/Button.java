package com.zing.zalo.shortvideo.p072ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Button implements Parcelable {

    /* renamed from: p */
    private final String f51329p;

    /* renamed from: q */
    private final String f51330q;

    /* renamed from: r */
    private final Integer f51331r;

    /* renamed from: s */
    private final Integer f51332s;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Button> CREATOR = new C9772a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Button$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.Button$a */
    /* loaded from: classes5.dex */
    public static final class C9772a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Button createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Button(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Button[] newArray(int i11) {
            return new Button[i11];
        }
    }

    public /* synthetic */ Button(int i11, String str, String str2, Integer num, Integer num2, AbstractC26805k1 abstractC26805k1) {
        if (15 != (i11 & 15)) {
            AbstractC26774a1.m137800b(i11, 15, Button$$serializer.INSTANCE.getDescriptor());
        }
        this.f51329p = str;
        this.f51330q = str2;
        this.f51331r = num;
        this.f51332s = num2;
    }

    /* renamed from: e */
    public static final /* synthetic */ void m52783e(Button button, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        C26814n1 c26814n1 = C26814n1.f127034a;
        interfaceC21886d.mo114028h(serialDescriptor, 0, c26814n1, button.f51329p);
        interfaceC21886d.mo114028h(serialDescriptor, 1, c26814n1, button.f51330q);
        C26783d0 c26783d0 = C26783d0.f126989a;
        interfaceC21886d.mo114028h(serialDescriptor, 2, c26783d0, button.f51331r);
        interfaceC21886d.mo114028h(serialDescriptor, 3, c26783d0, button.f51332s);
    }

    /* renamed from: a */
    public final String m52784a() {
        return this.f51329p;
    }

    /* renamed from: b */
    public final Integer m52785b() {
        return this.f51332s;
    }

    /* renamed from: c */
    public final String m52786c() {
        return this.f51330q;
    }

    /* renamed from: d */
    public final Integer m52787d() {
        return this.f51331r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return AbstractC19074t.m100204b(this.f51329p, button.f51329p) && AbstractC19074t.m100204b(this.f51330q, button.f51330q) && AbstractC19074t.m100204b(this.f51331r, button.f51331r) && AbstractC19074t.m100204b(this.f51332s, button.f51332s);
    }

    public int hashCode() {
        String str = this.f51329p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f51330q;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f51331r;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f51332s;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Button(actionLink=" + this.f51329p + ", text=" + this.f51330q + ", textColor=" + this.f51331r + ", bgColor=" + this.f51332s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f51329p);
        parcel.writeString(this.f51330q);
        Integer num = this.f51331r;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f51332s;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public Button(String str, String str2, Integer num, Integer num2) {
        this.f51329p = str;
        this.f51330q = str2;
        this.f51331r = num;
        this.f51332s = num2;
    }
}
