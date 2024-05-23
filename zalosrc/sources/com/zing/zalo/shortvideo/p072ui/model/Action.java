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

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Action implements Parcelable {

    /* renamed from: p */
    private final int f51324p;

    /* renamed from: q */
    private final Banner f51325q;

    /* renamed from: r */
    private final Button f51326r;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Action> CREATOR = new C9770a();

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

    /* renamed from: com.zing.zalo.shortvideo.ui.model.Action$a */
    /* loaded from: classes5.dex */
    public static final class C9770a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Action createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Action(parcel.readInt(), parcel.readInt() == 0 ? null : Banner.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Action[] newArray(int i11) {
            return new Action[i11];
        }
    }

    public /* synthetic */ Action(int i11, int i12, Banner banner, Button button, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, Action$$serializer.INSTANCE.getDescriptor());
        }
        this.f51324p = i12;
        this.f51325q = banner;
        this.f51326r = button;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m52773c(Action action, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, action.f51324p);
        interfaceC21886d.mo114028h(serialDescriptor, 1, Banner$$serializer.INSTANCE, action.f51325q);
        interfaceC21886d.mo114028h(serialDescriptor, 2, Button$$serializer.INSTANCE, action.f51326r);
    }

    /* renamed from: a */
    public final Banner m52774a() {
        return this.f51325q;
    }

    /* renamed from: b */
    public final Button m52775b() {
        return this.f51326r;
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
        return this.f51324p == action.f51324p && AbstractC19074t.m100204b(this.f51325q, action.f51325q) && AbstractC19074t.m100204b(this.f51326r, action.f51326r);
    }

    public int hashCode() {
        int i11 = this.f51324p * 31;
        Banner banner = this.f51325q;
        int hashCode = (i11 + (banner == null ? 0 : banner.hashCode())) * 31;
        Button button = this.f51326r;
        return hashCode + (button != null ? button.hashCode() : 0);
    }

    public String toString() {
        return "Action(type=" + this.f51324p + ", banner=" + this.f51325q + ", button=" + this.f51326r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f51324p);
        Banner banner = this.f51325q;
        if (banner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            banner.writeToParcel(parcel, i11);
        }
        Button button = this.f51326r;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i11);
        }
    }

    public Action(int i11, Banner banner, Button button) {
        this.f51324p = i11;
        this.f51325q = banner;
        this.f51326r = button;
    }
}
