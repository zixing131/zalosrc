package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem$$serializer;
import com.zing.zalo.shortvideo.data.remote.common.UnsupportedFormatException;
import com.zing.zalo.shortvideo.data.utils.AbstractC9464a;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qm0.AbstractC25332a0;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26788f;
import tn0.C26794h;
import tn0.C26814n1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public class User implements Parcelable {

    /* renamed from: A */
    private boolean f49987A;

    /* renamed from: B */
    private boolean f49988B;

    /* renamed from: C */
    private boolean f49989C;

    /* renamed from: D */
    private boolean f49990D;

    /* renamed from: E */
    private String f49991E;

    /* renamed from: F */
    private Boolean f49992F;

    /* renamed from: G */
    private List f49993G;

    /* renamed from: H */
    private Integer f49994H;

    /* renamed from: p */
    private final String f49995p;

    /* renamed from: q */
    private final String f49996q;

    /* renamed from: r */
    private final String f49997r;

    /* renamed from: s */
    private final String f49998s;

    /* renamed from: t */
    private final String f49999t;

    /* renamed from: u */
    private final String f50000u;

    /* renamed from: v */
    private final String f50001v;

    /* renamed from: w */
    private boolean f50002w;

    /* renamed from: x */
    private boolean f50003x;

    /* renamed from: y */
    private boolean f50004y;

    /* renamed from: z */
    private boolean f50005z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<User> CREATOR = new C9431a();

    /* renamed from: I */
    private static final KSerializer[] f49986I = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C26788f(BottomSheetItem$$serializer.INSTANCE), null};

    /* loaded from: classes5.dex */
    public static final class Anonymous extends User {

        /* renamed from: J */
        public static final Anonymous f50006J = new Anonymous();

        private Anonymous() {
            super("-1", "null", "Anonymous", "", "", (String) null, (String) null, false, false, false, false, false, false, false, false, (String) null, (Boolean) null, (List) null, (Integer) null, 524256, (AbstractC19060k) null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return User$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.User$a */
    /* loaded from: classes5.dex */
    public static final class C9431a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final User createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z11;
            ArrayList arrayList;
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            boolean z19 = parcel.readInt() != 0;
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                z11 = z17;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                z11 = z17;
                int i11 = 0;
                while (i11 != readInt) {
                    arrayList2.add(BottomSheetItem.CREATOR.createFromParcel(parcel));
                    i11++;
                    readInt = readInt;
                }
                arrayList = arrayList2;
            }
            return new User(readString, readString2, readString3, readString4, readString5, readString6, readString7, z12, z13, z14, z15, z16, z11, z18, z19, readString8, valueOf, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final User[] newArray(int i11) {
            return new User[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.User$b */
    /* loaded from: classes5.dex */
    public static final class C9432b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final SerialDescriptor f50007a = User.Companion.serializer().getDescriptor();

        /* renamed from: com.zing.zalo.shortvideo.data.model.User$b$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final User m51255a(JsonObject jsonObject) {
                List m131185M0;
                AbstractC19074t.m100208f(jsonObject, "json");
                User user = new User(AbstractC9465b.m51740u(jsonObject, "userId", "id"), AbstractC9465b.m51742w(jsonObject, new String[]{"encodeId"}, null, 2, null), AbstractC9465b.m51740u(jsonObject, "displayName", "name"), AbstractC9465b.m51742w(jsonObject, new String[]{"avatar"}, null, 2, null), AbstractC9465b.m51743x(jsonObject, "registerURL"), AbstractC9465b.m51743x(jsonObject, "termURL"), AbstractC9465b.m51743x(jsonObject, "settingURL"), false, false, false, false, false, false, false, false, AbstractC9465b.m51742w(jsonObject, new String[]{"segment"}, null, 2, null), Boolean.valueOf(AbstractC9465b.m51723d(jsonObject, new String[]{"isEKYC"}, false, 2, null)), (List) null, AbstractC9465b.m51729j(jsonObject, "descriptionAction"), 163712, (AbstractC19060k) null);
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    String key = entry.getKey();
                    JsonElement value = entry.getValue();
                    int hashCode = key.hashCode();
                    if (hashCode != 181879853) {
                        if (hashCode != 405645655) {
                            if (hashCode == 1486805943 && key.equals("personalAttributes")) {
                                user.m51228J(AbstractC9464a.m51718a(AbstractC9465b.m51726g(value), 1));
                            }
                        } else if (key.equals("attributes")) {
                            int m51726g = AbstractC9465b.m51726g(value);
                            user.m51223C(!AbstractC9464a.m51718a(m51726g, 2));
                            user.m51225F(!AbstractC9464a.m51718a(m51726g, 4));
                            user.m51222B(!AbstractC9464a.m51718a(m51726g, 8));
                            user.m51224D(!AbstractC9464a.m51718a(m51726g, 16));
                            user.m51250z(!AbstractC9464a.m51718a(m51726g, 32));
                            user.m51249y(!AbstractC9464a.m51718a(m51726g, 64));
                            user.m51227I(AbstractC9464a.m51718a(m51726g, 4096));
                        }
                    } else if (key.equals("btSheet")) {
                        JsonArray m139915l = AbstractC27331i.m139915l(value);
                        ArrayList arrayList = new ArrayList();
                        Iterator<JsonElement> it = m139915l.iterator();
                        while (it.hasNext()) {
                            BottomSheetItem m51416a = BottomSheetItem.Companion.m51416a(AbstractC27331i.m139916m(it.next()));
                            if (m51416a == null || !m51416a.isValid()) {
                                m51416a = null;
                            }
                            if (m51416a != null) {
                                arrayList.add(m51416a);
                            }
                        }
                        m131185M0 = AbstractC25332a0.m131185M0(arrayList);
                        user.m51226H(m131185M0);
                    }
                }
                return user;
            }
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a */
        public User deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m51255a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new UnsupportedFormatException();
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b */
        public void serialize(Encoder encoder, User user) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(user, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f50007a;
        }
    }

    public /* synthetic */ User(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str8, Boolean bool, List list, Integer num, AbstractC26805k1 abstractC26805k1) {
        if (15 != (i11 & 15)) {
            AbstractC26774a1.m137800b(i11, 15, User$$serializer.INSTANCE.getDescriptor());
        }
        this.f49995p = str;
        this.f49996q = str2;
        this.f49997r = str3;
        this.f49998s = str4;
        if ((i11 & 16) == 0) {
            this.f49999t = null;
        } else {
            this.f49999t = str5;
        }
        if ((i11 & 32) == 0) {
            this.f50000u = null;
        } else {
            this.f50000u = str6;
        }
        if ((i11 & 64) == 0) {
            this.f50001v = null;
        } else {
            this.f50001v = str7;
        }
        if ((i11 & 128) == 0) {
            this.f50002w = false;
        } else {
            this.f50002w = z11;
        }
        if ((i11 & 256) == 0) {
            this.f50003x = false;
        } else {
            this.f50003x = z12;
        }
        if ((i11 & 512) == 0) {
            this.f50004y = false;
        } else {
            this.f50004y = z13;
        }
        if ((i11 & 1024) == 0) {
            this.f50005z = false;
        } else {
            this.f50005z = z14;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f49987A = false;
        } else {
            this.f49987A = z15;
        }
        if ((i11 & 4096) == 0) {
            this.f49988B = false;
        } else {
            this.f49988B = z16;
        }
        if ((i11 & 8192) == 0) {
            this.f49989C = false;
        } else {
            this.f49989C = z17;
        }
        if ((i11 & 16384) == 0) {
            this.f49990D = false;
        } else {
            this.f49990D = z18;
        }
        if ((32768 & i11) == 0) {
            this.f49991E = null;
        } else {
            this.f49991E = str8;
        }
        if ((65536 & i11) == 0) {
            this.f49992F = null;
        } else {
            this.f49992F = bool;
        }
        if ((131072 & i11) == 0) {
            this.f49993G = null;
        } else {
            this.f49993G = list;
        }
        if ((i11 & 262144) == 0) {
            this.f49994H = null;
        } else {
            this.f49994H = num;
        }
    }

    /* renamed from: K */
    public static final /* synthetic */ void m51220K(User user, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f49986I;
        interfaceC21886d.mo114035z(serialDescriptor, 0, user.f49995p);
        interfaceC21886d.mo114035z(serialDescriptor, 1, user.f49996q);
        interfaceC21886d.mo114035z(serialDescriptor, 2, user.f49997r);
        interfaceC21886d.mo114035z(serialDescriptor, 3, user.f49998s);
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || user.f49999t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, user.f49999t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || user.f50000u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, user.f50000u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || user.f50001v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, user.f50001v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || user.f50002w) {
            interfaceC21886d.mo114034y(serialDescriptor, 7, user.f50002w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || user.f50003x) {
            interfaceC21886d.mo114034y(serialDescriptor, 8, user.f50003x);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || user.f50004y) {
            interfaceC21886d.mo114034y(serialDescriptor, 9, user.f50004y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || user.f50005z) {
            interfaceC21886d.mo114034y(serialDescriptor, 10, user.f50005z);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || user.f49987A) {
            interfaceC21886d.mo114034y(serialDescriptor, 11, user.f49987A);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || user.f49988B) {
            interfaceC21886d.mo114034y(serialDescriptor, 12, user.f49988B);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 13) || user.f49989C) {
            interfaceC21886d.mo114034y(serialDescriptor, 13, user.f49989C);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 14) || user.f49990D) {
            interfaceC21886d.mo114034y(serialDescriptor, 14, user.f49990D);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 15) || user.f49991E != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 15, C26814n1.f127034a, user.f49991E);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 16) || user.f49992F != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 16, C26794h.f127000a, user.f49992F);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 17) || user.f49993G != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 17, kSerializerArr[17], user.f49993G);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 18) || user.f49994H != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 18, C26783d0.f126989a, user.f49994H);
        }
    }

    /* renamed from: B */
    public final void m51222B(boolean z11) {
        this.f50005z = z11;
    }

    /* renamed from: C */
    public final void m51223C(boolean z11) {
        this.f50003x = z11;
    }

    /* renamed from: D */
    public final void m51224D(boolean z11) {
        this.f49987A = z11;
    }

    /* renamed from: F */
    public final void m51225F(boolean z11) {
        this.f50004y = z11;
    }

    /* renamed from: H */
    public final void m51226H(List list) {
        this.f49993G = list;
    }

    /* renamed from: I */
    public final void m51227I(boolean z11) {
        this.f49990D = z11;
    }

    /* renamed from: J */
    public final void m51228J(boolean z11) {
        this.f50002w = z11;
    }

    /* renamed from: b */
    public final Comment.Identity m51229b() {
        return new Comment.Identity(this.f49995p, 1, this.f49997r, this.f49998s, (String) null, (String) null, (String) null, (String) null, false, 496, (AbstractC19060k) null);
    }

    /* renamed from: c */
    public final String m51230c() {
        return this.f49998s;
    }

    /* renamed from: d */
    public final List m51231d() {
        return this.f49993G;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Integer m51232e() {
        return this.f49994H;
    }

    /* renamed from: f */
    public final boolean m51233f() {
        return this.f49990D;
    }

    /* renamed from: g */
    public final String m51234g() {
        return this.f49995p;
    }

    /* renamed from: h */
    public final String m51235h() {
        return this.f49997r;
    }

    /* renamed from: i */
    public final String m51236i() {
        return this.f50001v;
    }

    /* renamed from: j */
    public final String m51237j() {
        return this.f49999t;
    }

    /* renamed from: k */
    public final String m51238k() {
        return this.f49991E;
    }

    /* renamed from: l */
    public final boolean m51239l() {
        return this.f50002w;
    }

    /* renamed from: m */
    public final String m51240m() {
        return this.f50000u;
    }

    /* renamed from: n */
    public final boolean m51241n() {
        return this.f49989C;
    }

    /* renamed from: o */
    public final boolean m51242o() {
        return this.f49988B;
    }

    /* renamed from: p */
    public final boolean m51243p() {
        return this.f50003x || this.f50004y || this.f50005z || this.f49987A;
    }

    /* renamed from: q */
    public final boolean m51244q() {
        return this.f50005z;
    }

    /* renamed from: t */
    public final boolean m51245t() {
        return this.f50003x;
    }

    /* renamed from: u */
    public final boolean m51246u() {
        return this.f49987A;
    }

    /* renamed from: w */
    public final boolean m51247w() {
        return this.f50004y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49995p);
        parcel.writeString(this.f49996q);
        parcel.writeString(this.f49997r);
        parcel.writeString(this.f49998s);
        parcel.writeString(this.f49999t);
        parcel.writeString(this.f50000u);
        parcel.writeString(this.f50001v);
        parcel.writeInt(this.f50002w ? 1 : 0);
        parcel.writeInt(this.f50003x ? 1 : 0);
        parcel.writeInt(this.f50004y ? 1 : 0);
        parcel.writeInt(this.f50005z ? 1 : 0);
        parcel.writeInt(this.f49987A ? 1 : 0);
        parcel.writeInt(this.f49988B ? 1 : 0);
        parcel.writeInt(this.f49989C ? 1 : 0);
        parcel.writeInt(this.f49990D ? 1 : 0);
        parcel.writeString(this.f49991E);
        Boolean bool = this.f49992F;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List list = this.f49993G;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((BottomSheetItem) it.next()).writeToParcel(parcel, i11);
            }
        }
        Integer num = this.f49994H;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    /* renamed from: x */
    public final Boolean m51248x() {
        return this.f49992F;
    }

    /* renamed from: y */
    public final void m51249y(boolean z11) {
        this.f49989C = z11;
    }

    /* renamed from: z */
    public final void m51250z(boolean z11) {
        this.f49988B = z11;
    }

    public User(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str8, Boolean bool, List list, Integer num) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "encodedId");
        AbstractC19074t.m100208f(str3, "name");
        AbstractC19074t.m100208f(str4, "avatar");
        this.f49995p = str;
        this.f49996q = str2;
        this.f49997r = str3;
        this.f49998s = str4;
        this.f49999t = str5;
        this.f50000u = str6;
        this.f50001v = str7;
        this.f50002w = z11;
        this.f50003x = z12;
        this.f50004y = z13;
        this.f50005z = z14;
        this.f49987A = z15;
        this.f49988B = z16;
        this.f49989C = z17;
        this.f49990D = z18;
        this.f49991E = str8;
        this.f49992F = bool;
        this.f49993G = list;
        this.f49994H = num;
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str8, Boolean bool, List list, Integer num, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? false : z12, (i11 & 512) != 0 ? false : z13, (i11 & 1024) != 0 ? false : z14, (i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? false : z15, (i11 & 4096) != 0 ? false : z16, (i11 & 8192) != 0 ? false : z17, (i11 & 16384) != 0 ? false : z18, (32768 & i11) != 0 ? null : str8, (65536 & i11) != 0 ? null : bool, (131072 & i11) != 0 ? null : list, (i11 & 262144) != 0 ? null : num);
    }
}
