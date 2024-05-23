package com.zing.zalo.control.group;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23160o0;
import nh0.C23793c;
import org.json.JSONObject;
import p656xs.AbstractC30200a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes3.dex */
public final class GroupInvitationInfo implements Parcelable {

    /* renamed from: A */
    private int f42811A;

    /* renamed from: B */
    private final InterfaceC24854k f42812B;

    /* renamed from: p */
    private String f42813p;

    /* renamed from: q */
    private int f42814q;

    /* renamed from: r */
    private long f42815r;

    /* renamed from: s */
    private String f42816s;

    /* renamed from: t */
    private String f42817t;

    /* renamed from: u */
    private long f42818u;

    /* renamed from: v */
    private int f42819v;

    /* renamed from: w */
    private String f42820w;

    /* renamed from: x */
    private int f42821x;

    /* renamed from: y */
    private int f42822y;

    /* renamed from: z */
    private int f42823z;
    public static final C7911b Companion = new C7911b(null);
    public static final Parcelable.Creator<GroupInvitationInfo> CREATOR = new C7910a();

    /* renamed from: com.zing.zalo.control.group.GroupInvitationInfo$a */
    /* loaded from: classes3.dex */
    public static final class C7910a implements Parcelable.Creator {
        C7910a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GroupInvitationInfo createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new GroupInvitationInfo(parcel);
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GroupInvitationInfo[] newArray(int i11) {
            return new GroupInvitationInfo[i11];
        }
    }

    /* renamed from: com.zing.zalo.control.group.GroupInvitationInfo$b */
    /* loaded from: classes3.dex */
    public static final class C7911b {
        private C7911b() {
        }

        public /* synthetic */ C7911b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.control.group.GroupInvitationInfo$c */
    /* loaded from: classes3.dex */
    static final class C7912c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C7912c f42824q = new C7912c();

        C7912c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ContactProfile mo12V4() {
            return new ContactProfile();
        }
    }

    public GroupInvitationInfo() {
        InterfaceC24854k m129210a;
        this.f42813p = "";
        this.f42814q = 1;
        this.f42816s = "";
        this.f42817t = "";
        this.f42820w = "";
        this.f42822y = 1;
        m129210a = AbstractC24856m.m129210a(C7912c.f42824q);
        this.f42812B = m129210a;
    }

    /* renamed from: u */
    private final void m40879u() {
        if (this.f42820w.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(this.f42820w);
                ContactProfile m40892j = m40892j();
                m40892j.f42434r = jSONObject.optString("uid");
                m40892j.f42437s = jSONObject.optString("dpn");
                m40892j.f42446v = jSONObject.optString("avt");
                m40892j.f42352K0 = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                this.f42818u = jSONObject.optLong("ts");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: B */
    public final void m40880B(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42820w = str;
    }

    /* renamed from: C */
    public final void m40881C(int i11) {
        this.f42819v = i11;
    }

    /* renamed from: D */
    public final void m40882D(int i11) {
        this.f42814q = i11;
    }

    /* renamed from: a */
    public final String m40883a() {
        return this.f42817t;
    }

    /* renamed from: b */
    public final long m40884b() {
        return this.f42815r;
    }

    /* renamed from: c */
    public final String m40885c() {
        String m119198I0 = AbstractC23160o0.m119198I0(C23793c.Companion.m124321a().mo124314i(), this.f42815r);
        AbstractC19074t.m100207e(m119198I0, "getTimeDistance(...)");
        return m119198I0;
    }

    /* renamed from: d */
    public final String m40886d() {
        return this.f42813p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m40887e() {
        return this.f42816s;
    }

    /* renamed from: f */
    public final int m40888f() {
        return this.f42811A;
    }

    /* renamed from: g */
    public final int m40889g() {
        return this.f42823z;
    }

    /* renamed from: h */
    public final int m40890h() {
        return this.f42822y;
    }

    /* renamed from: i */
    public final long m40891i() {
        return this.f42818u;
    }

    /* renamed from: j */
    public final ContactProfile m40892j() {
        return (ContactProfile) this.f42812B.getValue();
    }

    /* renamed from: k */
    public final String m40893k() {
        return this.f42820w;
    }

    /* renamed from: l */
    public final ContactProfile m40894l() {
        return m40892j();
    }

    /* renamed from: m */
    public final int m40895m() {
        return this.f42819v;
    }

    /* renamed from: n */
    public final int m40896n() {
        return this.f42814q;
    }

    /* renamed from: o */
    public final boolean m40897o() {
        return this.f42822y == 2;
    }

    /* renamed from: p */
    public final boolean m40898p() {
        if (m40897o() && AbstractC30200a.m148947f()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final int m40899q() {
        return this.f42821x;
    }

    /* renamed from: t */
    public final boolean m40900t() {
        return this.f42821x == 1;
    }

    /* renamed from: w */
    public final void m40901w(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42817t = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "p0");
        parcel.writeString(this.f42813p);
        parcel.writeLong(this.f42815r);
        parcel.writeString(this.f42816s);
        parcel.writeString(this.f42817t);
        parcel.writeString(this.f42820w);
        parcel.writeInt(this.f42819v);
        parcel.writeInt(this.f42821x);
        parcel.writeInt(this.f42822y);
        parcel.writeInt(this.f42823z);
        parcel.writeInt(this.f42811A);
    }

    /* renamed from: x */
    public final void m40902x(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42813p = str;
    }

    /* renamed from: y */
    public final void m40903y(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42816s = str;
    }

    /* renamed from: z */
    public final void m40904z(int i11) {
        this.f42811A = i11;
        m40879u();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupInvitationInfo(Cursor cursor) {
        this();
        AbstractC19074t.m100208f(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndex("groupId"));
        AbstractC19074t.m100207e(string, "getString(...)");
        this.f42813p = string;
        this.f42815r = cursor.getLong(cursor.getColumnIndex("expiredTime"));
        String string2 = cursor.getString(cursor.getColumnIndex("groupName"));
        AbstractC19074t.m100207e(string2, "getString(...)");
        this.f42816s = string2;
        String string3 = cursor.getString(cursor.getColumnIndex("groupAvtUrl"));
        AbstractC19074t.m100207e(string3, "getString(...)");
        this.f42817t = string3;
        this.f42819v = cursor.getInt(cursor.getColumnIndex("state"));
        String string4 = cursor.getString(cursor.getColumnIndex("invitorInfo"));
        AbstractC19074t.m100207e(string4, "getString(...)");
        this.f42820w = string4;
        this.f42821x = cursor.getInt(cursor.getColumnIndex("isE2EE"));
        this.f42822y = cursor.getInt(cursor.getColumnIndex("groupType"));
        this.f42823z = cursor.getInt(cursor.getColumnIndex("groupOwnerType"));
        m40904z(cursor.getInt(cursor.getColumnIndex("groupOwnerId")));
        m40879u();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupInvitationInfo(JSONObject jSONObject) {
        this();
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        String optString = jSONObject.optString("groupId");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f42813p = optString;
        String optString2 = jSONObject.optString("name");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f42816s = optString2;
        String optString3 = jSONObject.optString("avt");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        this.f42817t = optString3;
        String optString4 = jSONObject.optString("inviteInfo");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        this.f42820w = optString4;
        this.f42815r = jSONObject.optLong("endTime");
        this.f42819v = jSONObject.optInt("state");
        this.f42821x = jSONObject.optInt("isE2ee");
        this.f42822y = jSONObject.optInt("groupType");
        this.f42823z = jSONObject.optInt("ownerType");
        m40904z(jSONObject.optInt("creatorId"));
        m40879u();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupInvitationInfo(Parcel parcel) {
        this();
        AbstractC19074t.m100208f(parcel, "parcel");
        this.f42813p = String.valueOf(parcel.readString());
        this.f42815r = parcel.readLong();
        this.f42816s = String.valueOf(parcel.readString());
        this.f42817t = String.valueOf(parcel.readString());
        this.f42820w = String.valueOf(parcel.readString());
        this.f42819v = parcel.readInt();
        this.f42821x = parcel.readInt();
        this.f42822y = parcel.readInt();
        this.f42823z = parcel.readInt();
        m40904z(parcel.readInt());
    }
}
