package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26799i1;
import tn0.C26814n1;
import tn0.C26839w;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Content implements Parcelable {

    /* renamed from: p */
    private final String f49824p;

    /* renamed from: q */
    private final Highlight[] f49825q;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Content> CREATOR = new C9392a();

    /* renamed from: r */
    private static final KSerializer[] f49823r = {null, new C26799i1(AbstractC19061k0.m100169b(Highlight.class), Content$Highlight$$serializer.INSTANCE)};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Content$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class Highlight implements Parcelable {

        /* renamed from: p */
        private final Integer f49826p;

        /* renamed from: q */
        private final Integer f49827q;

        /* renamed from: r */
        private final String f49828r;

        /* renamed from: s */
        private final Float f49829s;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Highlight> CREATOR = new C9391a();

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return Content$Highlight$$serializer.INSTANCE;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.model.Content$Highlight$a */
        /* loaded from: classes5.dex */
        public static final class C9391a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Highlight createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new Highlight(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Highlight[] newArray(int i11) {
                return new Highlight[i11];
            }
        }

        public /* synthetic */ Highlight(int i11, Integer num, Integer num2, String str, Float f11, AbstractC26805k1 abstractC26805k1) {
            if ((i11 & 1) == 0) {
                this.f49826p = null;
            } else {
                this.f49826p = num;
            }
            if ((i11 & 2) == 0) {
                this.f49827q = null;
            } else {
                this.f49827q = num2;
            }
            if ((i11 & 4) == 0) {
                this.f49828r = null;
            } else {
                this.f49828r = str;
            }
            if ((i11 & 8) == 0) {
                this.f49829s = null;
            } else {
                this.f49829s = f11;
            }
        }

        /* renamed from: e */
        public static final /* synthetic */ void m50897e(Highlight highlight, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || highlight.f49826p != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, highlight.f49826p);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || highlight.f49827q != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 1, C26783d0.f126989a, highlight.f49827q);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || highlight.f49828r != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, highlight.f49828r);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 3) || highlight.f49829s != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 3, C26839w.f127098a, highlight.f49829s);
            }
        }

        /* renamed from: a */
        public final Float m50898a() {
            return this.f49829s;
        }

        /* renamed from: b */
        public final String m50899b() {
            return this.f49828r;
        }

        /* renamed from: c */
        public final Integer m50900c() {
            return this.f49827q;
        }

        /* renamed from: d */
        public final Integer m50901d() {
            return this.f49826p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            Integer num = this.f49826p;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.f49827q;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeString(this.f49828r);
            Float f11 = this.f49829s;
            if (f11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeFloat(f11.floatValue());
            }
        }

        public Highlight(Integer num, Integer num2, String str, Float f11) {
            this.f49826p = num;
            this.f49827q = num2;
            this.f49828r = str;
            this.f49829s = f11;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Content$a */
    /* loaded from: classes5.dex */
    public static final class C9392a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Content createFromParcel(Parcel parcel) {
            Highlight[] highlightArr;
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                highlightArr = null;
            } else {
                int readInt = parcel.readInt();
                Highlight[] highlightArr2 = new Highlight[readInt];
                for (int i11 = 0; i11 != readInt; i11++) {
                    highlightArr2[i11] = Highlight.CREATOR.createFromParcel(parcel);
                }
                highlightArr = highlightArr2;
            }
            return new Content(readString, highlightArr);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final Content[] newArray(int i11) {
            return new Content[i11];
        }
    }

    public /* synthetic */ Content(int i11, String str, Highlight[] highlightArr, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, Content$$serializer.INSTANCE.getDescriptor());
        }
        this.f49824p = str;
        if ((i11 & 2) == 0) {
            this.f49825q = null;
        } else {
            this.f49825q = highlightArr;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m50894d(Content content, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f49823r;
        interfaceC21886d.mo114035z(serialDescriptor, 0, content.f49824p);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || content.f49825q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, kSerializerArr[1], content.f49825q);
        }
    }

    /* renamed from: b */
    public final Highlight[] m50895b() {
        return this.f49825q;
    }

    /* renamed from: c */
    public final String m50896c() {
        return this.f49824p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49824p);
        Highlight[] highlightArr = this.f49825q;
        if (highlightArr == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        int length = highlightArr.length;
        parcel.writeInt(length);
        for (int i12 = 0; i12 != length; i12++) {
            highlightArr[i12].writeToParcel(parcel, i11);
        }
    }

    public Content(String str, Highlight[] highlightArr) {
        AbstractC19074t.m100208f(str, "msg");
        this.f49824p = str;
        this.f49825q = highlightArr;
    }
}
