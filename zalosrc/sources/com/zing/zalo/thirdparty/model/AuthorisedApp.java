package com.zing.zalo.thirdparty.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AuthorisedApp implements Parcelable {

    /* renamed from: A */
    private static final String[] f55152A = {"access_profile", "send_msg", "access_friends_list", "push_feed"};
    public static final Parcelable.Creator<AuthorisedApp> CREATOR = new C10921a();

    /* renamed from: p */
    private long f55153p;

    /* renamed from: q */
    private String f55154q;

    /* renamed from: r */
    private String f55155r;

    /* renamed from: s */
    private String f55156s;

    /* renamed from: t */
    private String f55157t;

    /* renamed from: u */
    private int f55158u;

    /* renamed from: v */
    private boolean f55159v;

    /* renamed from: w */
    private int f55160w;

    /* renamed from: x */
    private boolean f55161x;

    /* renamed from: y */
    private int f55162y;

    /* renamed from: z */
    private boolean f55163z;

    /* renamed from: com.zing.zalo.thirdparty.model.AuthorisedApp$a */
    /* loaded from: classes5.dex */
    class C10921a implements Parcelable.Creator {
        C10921a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthorisedApp createFromParcel(Parcel parcel) {
            return new AuthorisedApp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthorisedApp[] newArray(int i11) {
            return new AuthorisedApp[i11];
        }
    }

    public AuthorisedApp(JSONObject jSONObject) {
        this.f55158u = 1;
        this.f55159v = false;
        this.f55160w = 0;
        this.f55161x = false;
        this.f55162y = 0;
        this.f55163z = false;
        this.f55153p = jSONObject.getLong("app_id");
        this.f55154q = jSONObject.getString("name");
        this.f55155r = jSONObject.getString("desc");
        this.f55157t = jSONObject.getString("icon");
        this.f55156s = jSONObject.getString("company");
        m56640x(jSONObject.getJSONObject("userPermission"));
        m56641y(jSONObject.getJSONObject("userPermissionReq"));
        this.f55163z = jSONObject.optBoolean("user_consent", true);
        this.f55159v = jSONObject.optBoolean("force_set_pwd");
        this.f55158u = jSONObject.optInt("form_type", 1);
    }

    /* renamed from: B */
    public void m56619B(boolean z11) {
        if (z11) {
            this.f55162y |= 2;
        } else {
            this.f55162y &= -3;
        }
    }

    /* renamed from: a */
    public long m56620a() {
        return this.f55153p;
    }

    /* renamed from: b */
    public String m56621b() {
        return this.f55156s;
    }

    /* renamed from: c */
    public String m56622c() {
        return this.f55157t;
    }

    /* renamed from: d */
    public String m56623d() {
        return this.f55154q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m56624e() {
        return this.f55160w;
    }

    /* renamed from: f */
    public boolean m56625f() {
        return (this.f55162y & 4) == 4;
    }

    /* renamed from: g */
    public boolean m56626g() {
        return (this.f55162y & 1) == 1;
    }

    /* renamed from: h */
    public boolean m56627h() {
        return (this.f55160w & 4) == 4;
    }

    /* renamed from: i */
    public boolean m56628i() {
        return (this.f55160w & 1) == 1;
    }

    /* renamed from: j */
    public boolean m56629j() {
        return (this.f55160w & 8) == 8;
    }

    /* renamed from: k */
    public boolean m56630k() {
        return (this.f55160w & 2) == 2;
    }

    /* renamed from: l */
    public boolean m56631l() {
        return (this.f55162y & 8) == 8;
    }

    /* renamed from: m */
    public boolean m56632m() {
        return (this.f55162y & 2) == 2;
    }

    /* renamed from: n */
    public boolean m56633n() {
        return this.f55161x;
    }

    /* renamed from: o */
    public void m56634o(boolean z11) {
        if (z11) {
            this.f55162y |= 4;
        } else {
            this.f55162y &= -5;
        }
    }

    /* renamed from: p */
    public void m56635p(boolean z11) {
        if (z11) {
            this.f55162y |= 1;
        } else {
            this.f55162y &= -2;
        }
    }

    /* renamed from: q */
    public void m56636q(boolean z11) {
        if (z11) {
            this.f55160w |= 4;
        } else {
            this.f55160w &= -5;
        }
    }

    /* renamed from: t */
    public void m56637t(boolean z11) {
        if (z11) {
            this.f55160w |= 1;
        } else {
            this.f55160w &= -2;
        }
    }

    /* renamed from: u */
    public void m56638u(boolean z11) {
        if (z11) {
            this.f55160w |= 8;
        } else {
            this.f55160w &= -9;
        }
    }

    /* renamed from: w */
    public void m56639w(boolean z11) {
        if (z11) {
            this.f55160w |= 2;
        } else {
            this.f55160w &= -3;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f55153p);
        parcel.writeString(this.f55154q);
        parcel.writeString(this.f55155r);
        parcel.writeString(this.f55156s);
        parcel.writeString(this.f55157t);
        parcel.writeInt(this.f55160w);
        parcel.writeInt(this.f55161x ? 1 : 0);
        parcel.writeInt(this.f55162y);
        parcel.writeInt(this.f55163z ? 1 : 0);
        parcel.writeInt(this.f55159v ? 1 : 0);
        parcel.writeInt(this.f55158u);
    }

    /* renamed from: x */
    public void m56640x(JSONObject jSONObject) {
        String[] strArr = f55152A;
        m56637t(jSONObject.optBoolean(strArr[0]));
        m56639w(jSONObject.optBoolean(strArr[1]));
        m56636q(jSONObject.optBoolean(strArr[2]));
        m56638u(jSONObject.optBoolean(strArr[3]));
    }

    /* renamed from: y */
    public void m56641y(JSONObject jSONObject) {
        String[] strArr = f55152A;
        m56635p(jSONObject.optBoolean(strArr[0]));
        m56619B(jSONObject.optBoolean(strArr[1]));
        m56634o(jSONObject.optBoolean(strArr[2]));
        m56642z(jSONObject.optBoolean(strArr[3]));
    }

    /* renamed from: z */
    public void m56642z(boolean z11) {
        if (z11) {
            this.f55162y |= 8;
        } else {
            this.f55162y &= -9;
        }
    }

    public AuthorisedApp(Parcel parcel) {
        this.f55158u = 1;
        this.f55159v = false;
        this.f55160w = 0;
        this.f55161x = false;
        this.f55162y = 0;
        this.f55163z = false;
        this.f55153p = parcel.readLong();
        this.f55154q = parcel.readString();
        this.f55155r = parcel.readString();
        this.f55156s = parcel.readString();
        this.f55157t = parcel.readString();
        this.f55160w = parcel.readInt();
        this.f55161x = parcel.readInt() != 0;
        this.f55162y = parcel.readInt();
        this.f55163z = parcel.readInt() != 0;
        this.f55159v = parcel.readInt() != 0;
        this.f55158u = parcel.readInt();
    }
}
