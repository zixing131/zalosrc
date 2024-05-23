package com.zing.zalo.feed.mvp.profile.model;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import org.json.JSONObject;
import pm0.C24848g0;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class SmartCropInfo implements Parcelable {
    private final int height;
    private final int width;

    /* renamed from: x */
    private final int f46709x;

    /* renamed from: y */
    private final int f46710y;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SmartCropInfo> CREATOR = new C8673a();

    /* loaded from: classes4.dex */
    public static final class Companion {

        /* renamed from: com.zing.zalo.feed.mvp.profile.model.SmartCropInfo$Companion$a */
        /* loaded from: classes4.dex */
        public static final class C8672a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C8672a f46711q = new C8672a();

            C8672a() {
                super(1);
            }

            /* renamed from: a */
            public final void m46325a(C27326d c27326d) {
                AbstractC19074t.m100208f(c27326d, "$this$Json");
                c27326d.m139881f(true);
                c27326d.m139878c(true);
                c27326d.m139882g(true);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m46325a((C27326d) obj);
                return C24848g0.f119245a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final SmartCropInfo m46324a(String str) {
            AbstractC19074t.m100208f(str, "data");
            try {
                AbstractC27323a m139941b = AbstractC27336n.m139941b(null, C8672a.f46711q, 1, null);
                m139941b.mo131586a();
                return (SmartCropInfo) m139941b.m139867d(SmartCropInfo.Companion.serializer(), str);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return new SmartCropInfo(0, 0, 0, 0, 15, (AbstractC19060k) null);
            }
        }

        public final KSerializer serializer() {
            return SmartCropInfo$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.SmartCropInfo$a */
    /* loaded from: classes4.dex */
    public static final class C8673a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final SmartCropInfo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new SmartCropInfo(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final SmartCropInfo[] newArray(int i11) {
            return new SmartCropInfo[i11];
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.SmartCropInfo$b */
    /* loaded from: classes4.dex */
    static final class C8674b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C8674b f46712q = new C8674b();

        C8674b() {
            super(1);
        }

        /* renamed from: a */
        public final void m46328a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46328a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.SmartCropInfo$c */
    /* loaded from: classes4.dex */
    static final class C8675c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C8675c f46713q = new C8675c();

        C8675c() {
            super(1);
        }

        /* renamed from: a */
        public final void m46329a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46329a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    public SmartCropInfo() {
        this(0, 0, 0, 0, 15, (AbstractC19060k) null);
    }

    public static /* synthetic */ SmartCropInfo copy$default(SmartCropInfo smartCropInfo, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = smartCropInfo.f46709x;
        }
        if ((i15 & 2) != 0) {
            i12 = smartCropInfo.f46710y;
        }
        if ((i15 & 4) != 0) {
            i13 = smartCropInfo.width;
        }
        if ((i15 & 8) != 0) {
            i14 = smartCropInfo.height;
        }
        return smartCropInfo.copy(i11, i12, i13, i14);
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    public static final SmartCropInfo parseFromJson(String str) {
        return Companion.m46324a(str);
    }

    public static final /* synthetic */ void write$Self$app_release(SmartCropInfo smartCropInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || smartCropInfo.f46709x != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, smartCropInfo.f46709x);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || smartCropInfo.f46710y != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, smartCropInfo.f46710y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || smartCropInfo.width != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 2, smartCropInfo.width);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || smartCropInfo.height != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 3, smartCropInfo.height);
        }
    }

    public final int component1() {
        return this.f46709x;
    }

    public final int component2() {
        return this.f46710y;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final SmartCropInfo copy(int i11, int i12, int i13, int i14) {
        return new SmartCropInfo(i11, i12, i13, i14);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartCropInfo)) {
            return false;
        }
        SmartCropInfo smartCropInfo = (SmartCropInfo) obj;
        return this.f46709x == smartCropInfo.f46709x && this.f46710y == smartCropInfo.f46710y && this.width == smartCropInfo.width && this.height == smartCropInfo.height;
    }

    public final Rect getCropRect() {
        int i11 = this.f46709x;
        int i12 = this.f46710y;
        return new Rect(i11, i12, this.width + i11, this.height + i12);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.f46709x;
    }

    public final int getY() {
        return this.f46710y;
    }

    public int hashCode() {
        return (((((this.f46709x * 31) + this.f46710y) * 31) + this.width) * 31) + this.height;
    }

    public final boolean isValidData() {
        return this.f46709x >= 0 && this.f46710y >= 0 && this.width > 0 && this.height > 0;
    }

    public final JSONObject toJsonObject() {
        AbstractC27323a m139941b = AbstractC27336n.m139941b(null, C8674b.f46712q, 1, null);
        m139941b.mo131586a();
        return new JSONObject(m139941b.mo131597b(Companion.serializer(), this));
    }

    public final String toJsonString() {
        AbstractC27323a m139941b = AbstractC27336n.m139941b(null, C8675c.f46713q, 1, null);
        m139941b.mo131586a();
        return m139941b.mo131597b(Companion.serializer(), this);
    }

    public String toString() {
        return "SmartCropInfo(x=" + this.f46709x + ", y=" + this.f46710y + ", width=" + this.width + ", height=" + this.height + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f46709x);
        parcel.writeInt(this.f46710y);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public SmartCropInfo(int i11, int i12, int i13, int i14) {
        this.f46709x = i11;
        this.f46710y = i12;
        this.width = i13;
        this.height = i14;
    }

    public /* synthetic */ SmartCropInfo(int i11, int i12, int i13, int i14, int i15, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f46709x = 0;
        } else {
            this.f46709x = i12;
        }
        if ((i11 & 2) == 0) {
            this.f46710y = 0;
        } else {
            this.f46710y = i13;
        }
        if ((i11 & 4) == 0) {
            this.width = 0;
        } else {
            this.width = i14;
        }
        if ((i11 & 8) == 0) {
            this.height = 0;
        } else {
            this.height = i15;
        }
    }

    public /* synthetic */ SmartCropInfo(int i11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
    }
}
