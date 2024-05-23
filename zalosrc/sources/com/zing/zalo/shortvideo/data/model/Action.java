package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Action implements Parcelable {

    /* renamed from: p */
    private final String f49712p;

    /* renamed from: q */
    private final Integer f49713q;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Action> CREATOR = new C9375a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Action$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Action$a */
    /* loaded from: classes5.dex */
    public static final class C9375a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Action createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Action(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Action[] newArray(int i11) {
            return new Action[i11];
        }
    }

    public /* synthetic */ Action(int i11, String str, Integer num, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49712p = null;
        } else {
            this.f49712p = str;
        }
        if ((i11 & 2) == 0) {
            this.f49713q = null;
        } else {
            this.f49713q = num;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m50675b(Action action, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || action.f49712p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, action.f49712p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || action.f49713q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26783d0.f126989a, action.f49713q);
        }
    }

    /* renamed from: a */
    public final String m50676a() {
        return this.f49712p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return AbstractC19074t.m100204b(this.f49712p, action.f49712p) && AbstractC19074t.m100204b(this.f49713q, action.f49713q);
    }

    public int hashCode() {
        String str = this.f49712p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f49713q;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final boolean isValid() {
        return (this.f49713q == null || this.f49712p == null) ? false : true;
    }

    public String toString() {
        return "Action(title=" + this.f49712p + ", type=" + this.f49713q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int intValue;
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49712p);
        Integer num = this.f49713q;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public Action(String str, Integer num) {
        this.f49712p = str;
        this.f49713q = num;
    }
}
