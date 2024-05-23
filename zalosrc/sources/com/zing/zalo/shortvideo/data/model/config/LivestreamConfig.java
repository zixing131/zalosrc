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
public final class LivestreamConfig implements Parcelable {

    /* renamed from: p */
    private final String f50145p;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LivestreamConfig> CREATOR = new C9443a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final LivestreamConfig m51474a(JsonObject jsonObject) {
            String str;
            if (jsonObject != null) {
                str = AbstractC9465b.m51743x(jsonObject, "domain");
            } else {
                str = null;
            }
            return new LivestreamConfig(str);
        }

        public final KSerializer serializer() {
            return LivestreamConfig$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.config.LivestreamConfig$a */
    /* loaded from: classes5.dex */
    public static final class C9443a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LivestreamConfig createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new LivestreamConfig(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LivestreamConfig[] newArray(int i11) {
            return new LivestreamConfig[i11];
        }
    }

    public /* synthetic */ LivestreamConfig(int i11, String str, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50145p = null;
        } else {
            this.f50145p = str;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m51472b(LivestreamConfig livestreamConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || livestreamConfig.f50145p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, livestreamConfig.f50145p);
        }
    }

    /* renamed from: a */
    public final String m51473a() {
        return this.f50145p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f50145p);
    }

    public LivestreamConfig(String str) {
        this.f50145p = str;
    }
}
