package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19071q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import tn0.C26814n1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class BreakSlot implements Parcelable {

    /* renamed from: p */
    private final int f49715p;

    /* renamed from: q */
    private final String f49716q;

    /* renamed from: r */
    private final int f49717r;

    /* renamed from: s */
    private final String f49718s;

    /* renamed from: t */
    private String f49719t;

    /* renamed from: u */
    private String f49720u;

    /* renamed from: v */
    private String f49721v;

    /* renamed from: w */
    private ArrayList f49722w;

    /* renamed from: x */
    private ArrayList f49723x;

    /* renamed from: y */
    private int f49724y;

    /* renamed from: z */
    private long f49725z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BreakSlot> CREATOR = new C9378a();

    /* renamed from: A */
    private static final KSerializer[] f49714A = {null, null, null, null, null, null, null, new C26788f(BreakSlot$Option$$serializer.INSTANCE), new C26788f(Channel$$serializer.INSTANCE), null, null};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return BreakSlot$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class Option implements Parcelable {

        /* renamed from: p */
        private final String f49726p;

        /* renamed from: q */
        private final String f49727q;

        /* renamed from: r */
        private boolean f49728r;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Option> CREATOR = new C9376a();

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return BreakSlot$Option$$serializer.INSTANCE;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.model.BreakSlot$Option$a */
        /* loaded from: classes5.dex */
        public static final class C9376a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Option createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new Option(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Option[] newArray(int i11) {
                return new Option[i11];
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.model.BreakSlot$Option$b */
        /* loaded from: classes5.dex */
        public static final class C9377b implements KSerializer {
            public static final a Companion = new a(null);

            /* renamed from: com.zing.zalo.shortvideo.data.model.BreakSlot$Option$b$a */
            /* loaded from: classes5.dex */
            public static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                    this();
                }

                /* renamed from: a */
                public final Option m50706a(JsonObject jsonObject) {
                    AbstractC19074t.m100208f(jsonObject, "json");
                    return new Option(AbstractC9465b.m51740u(jsonObject, "id"), AbstractC9465b.m51740u(jsonObject, "name"), AbstractC9465b.m51723d(jsonObject, new String[]{"isPicked"}, false, 2, null));
                }
            }
        }

        public /* synthetic */ Option(int i11, String str, String str2, boolean z11, AbstractC26805k1 abstractC26805k1) {
            if (7 != (i11 & 7)) {
                AbstractC26774a1.m137800b(i11, 7, BreakSlot$Option$$serializer.INSTANCE.getDescriptor());
            }
            this.f49726p = str;
            this.f49727q = str2;
            this.f49728r = z11;
        }

        /* renamed from: e */
        public static final /* synthetic */ void m50699e(Option option, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            interfaceC21886d.mo114035z(serialDescriptor, 0, option.f49726p);
            interfaceC21886d.mo114035z(serialDescriptor, 1, option.f49727q);
            interfaceC21886d.mo114034y(serialDescriptor, 2, option.f49728r);
        }

        /* renamed from: a */
        public final String m50700a() {
            return this.f49726p;
        }

        /* renamed from: b */
        public final String m50701b() {
            return this.f49727q;
        }

        /* renamed from: c */
        public final boolean m50702c() {
            return this.f49728r;
        }

        /* renamed from: d */
        public final void m50703d(boolean z11) {
            this.f49728r = z11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return AbstractC19074t.m100204b(this.f49726p, option.f49726p) && AbstractC19074t.m100204b(this.f49727q, option.f49727q) && this.f49728r == option.f49728r;
        }

        public int hashCode() {
            return (((this.f49726p.hashCode() * 31) + this.f49727q.hashCode()) * 31) + AbstractC2144f.m11520a(this.f49728r);
        }

        public String toString() {
            return "Option(id=" + this.f49726p + ", name=" + this.f49727q + ", isPicked=" + this.f49728r + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeString(this.f49726p);
            parcel.writeString(this.f49727q);
            parcel.writeInt(this.f49728r ? 1 : 0);
        }

        public Option(String str, String str2, boolean z11) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "name");
            this.f49726p = str;
            this.f49727q = str2;
            this.f49728r = z11;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.BreakSlot$a */
    /* loaded from: classes5.dex */
    public static final class C9378a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BreakSlot createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC19074t.m100208f(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                for (int i11 = 0; i11 != readInt3; i11++) {
                    arrayList.add(Option.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                for (int i12 = 0; i12 != readInt4; i12++) {
                    arrayList2.add(parcel.readParcelable(BreakSlot.class.getClassLoader()));
                }
            }
            return new BreakSlot(readInt, readString, readInt2, readString2, readString3, readString4, readString5, arrayList, arrayList2, parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BreakSlot[] newArray(int i11) {
            return new BreakSlot[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.BreakSlot$b */
    /* loaded from: classes5.dex */
    public static final class C9379b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final SerialDescriptor f49729a = BreakSlot.Companion.serializer().getDescriptor();

        /* renamed from: com.zing.zalo.shortvideo.data.model.BreakSlot$b$a */
        /* loaded from: classes5.dex */
        public static final class a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.data.model.BreakSlot$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C32716a extends C19071q implements InterfaceC18505l {
                C32716a(Object obj) {
                    super(1, obj, Option.C9377b.a.class, "deserialize", "deserialize(Lkotlinx/serialization/json/JsonObject;)Lcom/zing/zalo/shortvideo/data/model/BreakSlot$Option;", 0);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public final Option mo205i9(JsonObject jsonObject) {
                    AbstractC19074t.m100208f(jsonObject, "p0");
                    return ((Option.C9377b.a) this.f94922q).m50706a(jsonObject);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.data.model.BreakSlot$b$a$b */
            /* loaded from: classes5.dex */
            public /* synthetic */ class b extends C19071q implements InterfaceC18505l {
                b(Object obj) {
                    super(1, obj, Channel.C9382b.a.class, "deserialize", "deserialize(Lkotlinx/serialization/json/JsonObject;)Lcom/zing/zalo/shortvideo/data/model/Channel;", 0);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public final Channel mo205i9(JsonObject jsonObject) {
                    AbstractC19074t.m100208f(jsonObject, "p0");
                    return ((Channel.C9382b.a) this.f94922q).m50798a(jsonObject);
                }
            }

            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final BreakSlot m50711a(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "json");
                BreakSlot breakSlot = new BreakSlot(AbstractC9465b.m51728i(jsonObject, new String[]{ZinstantMetaConstant.IMPRESSION_META_TYPE}, 0, 2, null), AbstractC9465b.m51743x(jsonObject, "templateId"), AbstractC9465b.m51727h(jsonObject, new String[]{"index"}, -1), AbstractC9465b.m51743x(jsonObject, "videoId"), (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, 0, 0L, 2032, (AbstractC19060k) null);
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    String key = entry.getKey();
                    JsonElement value = entry.getValue();
                    switch (key.hashCode()) {
                        case -1542400339:
                            if (key.equals("autoScrollDelayMillis")) {
                                breakSlot.m50692m(AbstractC9465b.m51734o(value));
                                break;
                            } else {
                                break;
                            }
                        case -1249474914:
                            if (key.equals("options")) {
                                breakSlot.m50695p(AbstractC9465b.m51720a(value, new C32716a(Option.C9377b.Companion)));
                                break;
                            } else {
                                break;
                            }
                        case 108417:
                            if (key.equals("msg")) {
                                breakSlot.m50694o(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 110342614:
                            if (key.equals("thumb")) {
                                breakSlot.m50697t(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 110371416:
                            if (key.equals("title")) {
                                breakSlot.m50698u(AbstractC9465b.m51739t(value));
                                break;
                            } else {
                                break;
                            }
                        case 951449701:
                            if (key.equals("slotSpacing")) {
                                breakSlot.m50696q(AbstractC9465b.m51726g(value));
                                break;
                            } else {
                                break;
                            }
                        case 1432626128:
                            if (key.equals("channels")) {
                                breakSlot.m50693n(AbstractC9465b.m51720a(value, new b(Channel.C9382b.Companion)));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return breakSlot;
            }
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BreakSlot deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m50711a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, BreakSlot breakSlot) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(breakSlot, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49729a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.BreakSlot$c */
    /* loaded from: classes5.dex */
    public static final class C9380c {

        /* renamed from: a */
        public static final C9380c f49730a = new C9380c();

        private C9380c() {
        }

        /* renamed from: a */
        public final boolean m50714a(int i11) {
            return i11 == 1 || i11 == 2 || i11 == 3;
        }
    }

    public /* synthetic */ BreakSlot(int i11, int i12, String str, int i13, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, int i14, long j11, AbstractC26805k1 abstractC26805k1) {
        if (15 != (i11 & 15)) {
            AbstractC26774a1.m137800b(i11, 15, BreakSlot$$serializer.INSTANCE.getDescriptor());
        }
        this.f49715p = i12;
        this.f49716q = str;
        this.f49717r = i13;
        this.f49718s = str2;
        if ((i11 & 16) == 0) {
            this.f49719t = null;
        } else {
            this.f49719t = str3;
        }
        if ((i11 & 32) == 0) {
            this.f49720u = null;
        } else {
            this.f49720u = str4;
        }
        if ((i11 & 64) == 0) {
            this.f49721v = null;
        } else {
            this.f49721v = str5;
        }
        if ((i11 & 128) == 0) {
            this.f49722w = null;
        } else {
            this.f49722w = arrayList;
        }
        if ((i11 & 256) == 0) {
            this.f49723x = null;
        } else {
            this.f49723x = arrayList2;
        }
        if ((i11 & 512) == 0) {
            this.f49724y = 0;
        } else {
            this.f49724y = i14;
        }
        if ((i11 & 1024) == 0) {
            this.f49725z = 0L;
        } else {
            this.f49725z = j11;
        }
    }

    /* renamed from: w */
    public static final /* synthetic */ void m50680w(BreakSlot breakSlot, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f49714A;
        interfaceC21886d.mo114033x(serialDescriptor, 0, breakSlot.f49715p);
        C26814n1 c26814n1 = C26814n1.f127034a;
        interfaceC21886d.mo114028h(serialDescriptor, 1, c26814n1, breakSlot.f49716q);
        interfaceC21886d.mo114033x(serialDescriptor, 2, breakSlot.f49717r);
        interfaceC21886d.mo114028h(serialDescriptor, 3, c26814n1, breakSlot.f49718s);
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || breakSlot.f49719t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, c26814n1, breakSlot.f49719t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || breakSlot.f49720u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, c26814n1, breakSlot.f49720u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || breakSlot.f49721v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, c26814n1, breakSlot.f49721v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || breakSlot.f49722w != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, kSerializerArr[7], breakSlot.f49722w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || breakSlot.f49723x != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, kSerializerArr[8], breakSlot.f49723x);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || breakSlot.f49724y != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 9, breakSlot.f49724y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || breakSlot.f49725z != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 10, breakSlot.f49725z);
        }
    }

    /* renamed from: b */
    public final long m50681b() {
        return this.f49725z;
    }

    /* renamed from: c */
    public final ArrayList m50682c() {
        return this.f49723x;
    }

    /* renamed from: d */
    public final int m50683d() {
        return this.f49717r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m50684e() {
        return this.f49721v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BreakSlot)) {
            return false;
        }
        BreakSlot breakSlot = (BreakSlot) obj;
        return this.f49715p == breakSlot.f49715p && AbstractC19074t.m100204b(this.f49716q, breakSlot.f49716q) && this.f49717r == breakSlot.f49717r && AbstractC19074t.m100204b(this.f49718s, breakSlot.f49718s) && AbstractC19074t.m100204b(this.f49719t, breakSlot.f49719t) && AbstractC19074t.m100204b(this.f49720u, breakSlot.f49720u) && AbstractC19074t.m100204b(this.f49721v, breakSlot.f49721v) && AbstractC19074t.m100204b(this.f49722w, breakSlot.f49722w) && AbstractC19074t.m100204b(this.f49723x, breakSlot.f49723x) && this.f49724y == breakSlot.f49724y && this.f49725z == breakSlot.f49725z;
    }

    /* renamed from: f */
    public final ArrayList m50685f() {
        return this.f49722w;
    }

    /* renamed from: g */
    public final int m50686g() {
        return this.f49724y;
    }

    /* renamed from: h */
    public final String m50687h() {
        return this.f49716q;
    }

    public int hashCode() {
        int i11 = this.f49715p * 31;
        String str = this.f49716q;
        int hashCode = (((i11 + (str == null ? 0 : str.hashCode())) * 31) + this.f49717r) * 31;
        String str2 = this.f49718s;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49719t;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f49720u;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f49721v;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ArrayList arrayList = this.f49722w;
        int hashCode6 = (hashCode5 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f49723x;
        return ((((hashCode6 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31) + this.f49724y) * 31) + AbstractC2147g0.m11521a(this.f49725z);
    }

    /* renamed from: i */
    public final String m50688i() {
        return this.f49719t;
    }

    /* renamed from: j */
    public final String m50689j() {
        return this.f49720u;
    }

    /* renamed from: k */
    public final int m50690k() {
        return this.f49715p;
    }

    /* renamed from: l */
    public final String m50691l() {
        return this.f49718s;
    }

    /* renamed from: m */
    public final void m50692m(long j11) {
        this.f49725z = j11;
    }

    /* renamed from: n */
    public final void m50693n(ArrayList arrayList) {
        this.f49723x = arrayList;
    }

    /* renamed from: o */
    public final void m50694o(String str) {
        this.f49721v = str;
    }

    /* renamed from: p */
    public final void m50695p(ArrayList arrayList) {
        this.f49722w = arrayList;
    }

    /* renamed from: q */
    public final void m50696q(int i11) {
        this.f49724y = i11;
    }

    /* renamed from: t */
    public final void m50697t(String str) {
        this.f49719t = str;
    }

    public String toString() {
        return "BreakSlot(type=" + this.f49715p + ", templateId=" + this.f49716q + ", index=" + this.f49717r + ", videoId=" + this.f49718s + ", thumb=" + this.f49719t + ", title=" + this.f49720u + ", message=" + this.f49721v + ", options=" + this.f49722w + ", channels=" + this.f49723x + ", slotSpacing=" + this.f49724y + ", autoScrollDelay=" + this.f49725z + ")";
    }

    /* renamed from: u */
    public final void m50698u(String str) {
        this.f49720u = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f49715p);
        parcel.writeString(this.f49716q);
        parcel.writeInt(this.f49717r);
        parcel.writeString(this.f49718s);
        parcel.writeString(this.f49719t);
        parcel.writeString(this.f49720u);
        parcel.writeString(this.f49721v);
        ArrayList arrayList = this.f49722w;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Option) it.next()).writeToParcel(parcel, i11);
            }
        }
        ArrayList arrayList2 = this.f49723x;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable((Parcelable) it2.next(), i11);
            }
        }
        parcel.writeInt(this.f49724y);
        parcel.writeLong(this.f49725z);
    }

    public BreakSlot(int i11, String str, int i12, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, int i13, long j11) {
        this.f49715p = i11;
        this.f49716q = str;
        this.f49717r = i12;
        this.f49718s = str2;
        this.f49719t = str3;
        this.f49720u = str4;
        this.f49721v = str5;
        this.f49722w = arrayList;
        this.f49723x = arrayList2;
        this.f49724y = i13;
        this.f49725z = j11;
    }

    public /* synthetic */ BreakSlot(int i11, String str, int i12, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, int i13, long j11, int i14, AbstractC19060k abstractC19060k) {
        this(i11, str, i12, str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : arrayList, (i14 & 256) != 0 ? null : arrayList2, (i14 & 512) != 0 ? 0 : i13, (i14 & 1024) != 0 ? 0L : j11);
    }
}
