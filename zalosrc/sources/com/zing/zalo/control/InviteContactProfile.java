package com.zing.zalo.control;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import au.C2343e;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.uicontrol.C16640q2;
import me0.AbstractC23028c0;
import me0.C23278z2;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.C23302b;
import p354n3.C23528a;

/* loaded from: classes3.dex */
public class InviteContactProfile extends ContactProfile implements Comparable<InviteContactProfile> {
    public static final Parcelable.Creator<InviteContactProfile> CREATOR = new C7880a();

    /* renamed from: b2 */
    public boolean f42538b2;

    /* renamed from: c2 */
    public String f42539c2;

    /* renamed from: d2 */
    public InviteContactMask f42540d2;

    /* renamed from: e2 */
    public String f42541e2;

    /* renamed from: f2 */
    public boolean f42542f2;

    /* renamed from: g2 */
    public boolean f42543g2;

    /* renamed from: com.zing.zalo.control.InviteContactProfile$a */
    /* loaded from: classes3.dex */
    class C7880a implements Parcelable.Creator {
        C7880a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public InviteContactProfile createFromParcel(Parcel parcel) {
            return new InviteContactProfile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public InviteContactProfile[] newArray(int i11) {
            return new InviteContactProfile[i11];
        }
    }

    public InviteContactProfile() {
        this.f42538b2 = false;
        this.f42539c2 = "";
        this.f42542f2 = false;
        this.f42543g2 = false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InviteContactProfile)) {
            return false;
        }
        if (TextUtils.isEmpty(this.f42434r)) {
            return this.f42455y.equals(((InviteContactProfile) obj).f42455y);
        }
        return this.f42434r.equals(((InviteContactProfile) obj).f42434r);
    }

    @Override // java.lang.Comparable
    /* renamed from: t1 */
    public int compareTo(InviteContactProfile inviteContactProfile) {
        if (m40383Q(true, false) == null) {
            return 0;
        }
        return m40383Q(true, false).compareTo(inviteContactProfile.m40383Q(true, false));
    }

    /* renamed from: u1 */
    public String m40485u1() {
        return m40383Q(true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:2:0x0000, B:4:0x0011, B:7:0x002e, B:9:0x0038, B:10:0x0045, B:12:0x004f, B:15:0x005a, B:19:0x003b, B:21:0x0043, B:22:0x001e, B:24:0x0026, B:26:0x0072, B:28:0x007a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:2:0x0000, B:4:0x0011, B:7:0x002e, B:9:0x0038, B:10:0x0045, B:12:0x004f, B:15:0x005a, B:19:0x003b, B:21:0x0043, B:22:0x001e, B:24:0x0026, B:26:0x0072, B:28:0x007a), top: B:1:0x0000 }] */
    /* renamed from: v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m40486v1(RecyclingImageView recyclingImageView) {
        boolean z11;
        try {
            C23528a c23528a = new C23528a(recyclingImageView.getContext());
            if (!TextUtils.isEmpty(this.f42446v)) {
                if (!C23302b.f113247a.m120523d(this.f42446v)) {
                }
                String str = "";
                if (TextUtils.isEmpty(this.f42434r)) {
                    str = this.f42434r;
                } else if (!TextUtils.isEmpty(this.f42455y)) {
                    str = this.f42455y;
                }
                if (!TextUtils.isEmpty(this.f42434r) && !TextUtils.isEmpty(this.f42455y)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int m12307a = C2343e.m12307a(str, z11);
                recyclingImageView.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m40383Q(true, false)), m12307a));
            }
            if (!TextUtils.isEmpty(this.f42434r) || TextUtils.isEmpty(this.f42455y)) {
                if (!TextUtils.isEmpty(this.f42446v)) {
                    ((C23528a) c23528a.m123612r(recyclingImageView)).m123618x(this.f42446v, C23278z2.m120154t());
                    return;
                }
                return;
            }
            String str2 = "";
            if (TextUtils.isEmpty(this.f42434r)) {
            }
            if (!TextUtils.isEmpty(this.f42434r)) {
            }
            z11 = false;
            int m12307a2 = C2343e.m12307a(str2, z11);
            recyclingImageView.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m40383Q(true, false)), m12307a2));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w1 */
    public JSONObject m40487w1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("avt", this.f42446v);
            jSONObject.put("id", this.f42434r);
            jSONObject.put("dpn", this.f42437s);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.zing.zalo.control.ContactProfile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeParcelable(this.f42540d2, i11);
    }

    /* renamed from: x1 */
    public JSONObject m40488x1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("avatar", this.f42446v);
            jSONObject.put("id", this.f42434r);
            jSONObject.put("dName", this.f42437s);
            jSONObject.put("typeContact", this.f42352K0);
            jSONObject.put("phone", this.f42455y);
            jSONObject.put("number_international", this.f42539c2);
            jSONObject.put("sourceContact", this.f42541e2);
            jSONObject.put("reqSrc", this.f42373R0);
            InviteContactMask inviteContactMask = this.f42540d2;
            if (inviteContactMask != null) {
                jSONObject.put("inviteCtMask", inviteContactMask.m40481a());
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: y1 */
    public JSONObject m40489y1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("avt", this.f42446v);
            jSONObject.put("uid", this.f42434r);
            jSONObject.put("dpn", this.f42437s);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public InviteContactProfile(String str, String str2, String str3) {
        this.f42538b2 = false;
        this.f42539c2 = "";
        this.f42542f2 = false;
        this.f42543g2 = false;
        this.f42434r = str;
        this.f42446v = str2;
        this.f42437s = str3;
    }

    public InviteContactProfile(Parcel parcel) {
        super(parcel);
        this.f42538b2 = false;
        this.f42539c2 = "";
        this.f42542f2 = false;
        this.f42543g2 = false;
        this.f42540d2 = (InviteContactMask) parcel.readParcelable(InviteContactMask.class.getClassLoader());
    }

    public InviteContactProfile(ContactProfile contactProfile) {
        this.f42538b2 = false;
        this.f42539c2 = "";
        this.f42542f2 = false;
        this.f42543g2 = false;
        this.f42434r = contactProfile.f42434r;
        this.f42443u = contactProfile.f42443u;
        this.f42437s = contactProfile.f42437s;
        this.f42440t = contactProfile.f42440t;
        this.f42446v = contactProfile.f42446v;
        this.f42455y = contactProfile.f42455y;
        this.f42458z = contactProfile.f42458z;
        this.f42321A = contactProfile.f42321A;
        this.f42539c2 = contactProfile.f42455y;
        this.f42382U0 = contactProfile.f42382U0;
        this.f42449w = contactProfile.f42449w;
        this.f42460z1 = contactProfile.f42460z1;
        m40409i1(contactProfile.m40392W());
        this.f42436r1 = contactProfile.f42436r1;
        this.f42373R0 = contactProfile.f42373R0;
        this.f42352K0 = contactProfile.f42352K0;
    }

    public InviteContactProfile(JSONObject jSONObject) {
        this.f42538b2 = false;
        this.f42539c2 = "";
        this.f42542f2 = false;
        this.f42543g2 = false;
        try {
            this.f42446v = jSONObject.getString("avatar");
            this.f42434r = jSONObject.getString("id");
            this.f42437s = jSONObject.getString("dName");
            if (jSONObject.has("typeContact")) {
                this.f42352K0 = jSONObject.optInt("typeContact", 0);
            }
            if (jSONObject.has("phone")) {
                this.f42455y = jSONObject.getString("phone");
            }
            if (jSONObject.has("number_international")) {
                this.f42539c2 = jSONObject.getString("number_international");
            }
            this.f42541e2 = jSONObject.optString("sourceContact");
            this.f42373R0 = jSONObject.optInt("reqSrc", -1);
            if (jSONObject.has("inviteCtMask")) {
                this.f42540d2 = new InviteContactMask(jSONObject.optJSONObject("inviteCtMask"));
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
