package com.zing.zalo.shortvideo.data.model.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Messages implements Parcelable {

    /* renamed from: p */
    private final String f50146p;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Messages> CREATOR = new C9444a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Messages m51479a(JsonObject jsonObject) {
            String str;
            if (jsonObject != null) {
                str = AbstractC9465b.m51743x(jsonObject, "footerThreadComment");
            } else {
                str = null;
            }
            return new Messages(str);
        }

        public final KSerializer serializer() {
            return Messages$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.config.Messages$a */
    /* loaded from: classes5.dex */
    public static final class C9444a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Messages createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Messages(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Messages[] newArray(int i11) {
            return new Messages[i11];
        }
    }

    public /* synthetic */ Messages(int i11, String str, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50146p = null;
        } else {
            this.f50146p = str;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m51477b(Messages messages, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || messages.f50146p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, messages.f50146p);
        }
    }

    /* renamed from: a */
    public final String m51478a() {
        return this.f50146p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Messages) && AbstractC19074t.m100204b(this.f50146p, ((Messages) obj).f50146p);
    }

    public int hashCode() {
        String str = this.f50146p;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "Messages(footerThreadComment=" + this.f50146p + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f50146p);
    }

    public Messages(String str) {
        this.f50146p = str;
    }
}
