package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031b5.AbstractC2552a;
import p229i5.C20288i;
import p229i5.InterfaceC20285f;
import p517t4.C26476b;

/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: A */
    private String f16035A;

    /* renamed from: B */
    private Set f16036B = new HashSet();

    /* renamed from: p */
    final int f16037p;

    /* renamed from: q */
    private String f16038q;

    /* renamed from: r */
    private String f16039r;

    /* renamed from: s */
    private String f16040s;

    /* renamed from: t */
    private String f16041t;

    /* renamed from: u */
    private Uri f16042u;

    /* renamed from: v */
    private String f16043v;

    /* renamed from: w */
    private long f16044w;

    /* renamed from: x */
    private String f16045x;

    /* renamed from: y */
    List f16046y;

    /* renamed from: z */
    private String f16047z;
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C4041c();

    /* renamed from: C */
    public static InterfaceC20285f f16034C = C20288i.m105926d();

    public GoogleSignInAccount(int i11, String str, String str2, String str3, String str4, Uri uri, String str5, long j11, String str6, List list, String str7, String str8) {
        this.f16037p = i11;
        this.f16038q = str;
        this.f16039r = str2;
        this.f16040s = str3;
        this.f16041t = str4;
        this.f16042u = uri;
        this.f16043v = str5;
        this.f16044w = j11;
        this.f16045x = str6;
        this.f16046y = list;
        this.f16047z = str7;
        this.f16035A = str8;
    }

    /* renamed from: D0 */
    public static GoogleSignInAccount m19091D0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l11, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l11.longValue(), AbstractC4205o.m19718g(str7), new ArrayList((Collection) AbstractC4205o.m19722k(set)), str5, str6);
    }

    /* renamed from: E0 */
    public static GoogleSignInAccount m19092E0(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            hashSet.add(new Scope(jSONArray.getString(i11)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount m19091D0 = m19091D0(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        m19091D0.f16043v = str7;
        return m19091D0;
    }

    /* renamed from: F */
    public String m19093F() {
        return this.f16040s;
    }

    /* renamed from: F0 */
    public final String m19094F0() {
        return this.f16045x;
    }

    /* renamed from: G0 */
    public final String m19095G0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m19098M() != null) {
                jSONObject.put("id", m19098M());
            }
            if (m19099Q() != null) {
                jSONObject.put("tokenId", m19099Q());
            }
            if (m19093F() != null) {
                jSONObject.put("email", m19093F());
            }
            if (m19103t() != null) {
                jSONObject.put("displayName", m19103t());
            }
            if (m19097K() != null) {
                jSONObject.put("givenName", m19097K());
            }
            if (m19096J() != null) {
                jSONObject.put("familyName", m19096J());
            }
            Uri m19100Z = m19100Z();
            if (m19100Z != null) {
                jSONObject.put("photoUrl", m19100Z.toString());
            }
            if (m19102o0() != null) {
                jSONObject.put("serverAuthCode", m19102o0());
            }
            jSONObject.put("expirationTime", this.f16044w);
            jSONObject.put("obfuscatedIdentifier", this.f16045x);
            JSONArray jSONArray = new JSONArray();
            List list = this.f16046y;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C26476b.f125715p);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m19219t());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* renamed from: J */
    public String m19096J() {
        return this.f16035A;
    }

    /* renamed from: K */
    public String m19097K() {
        return this.f16047z;
    }

    /* renamed from: M */
    public String m19098M() {
        return this.f16038q;
    }

    /* renamed from: Q */
    public String m19099Q() {
        return this.f16039r;
    }

    /* renamed from: Z */
    public Uri m19100Z() {
        return this.f16042u;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f16045x.equals(this.f16045x) || !googleSignInAccount.m19101i0().equals(m19101i0())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f16045x.hashCode() + 527) * 31) + m19101i0().hashCode();
    }

    /* renamed from: i0 */
    public Set m19101i0() {
        HashSet hashSet = new HashSet(this.f16046y);
        hashSet.addAll(this.f16036B);
        return hashSet;
    }

    /* renamed from: o0 */
    public String m19102o0() {
        return this.f16043v;
    }

    /* renamed from: t */
    public String m19103t() {
        return this.f16041t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16037p);
        AbstractC2552a.m12934w(parcel, 2, m19098M(), false);
        AbstractC2552a.m12934w(parcel, 3, m19099Q(), false);
        AbstractC2552a.m12934w(parcel, 4, m19093F(), false);
        AbstractC2552a.m12934w(parcel, 5, m19103t(), false);
        AbstractC2552a.m12932u(parcel, 6, m19100Z(), i11, false);
        AbstractC2552a.m12934w(parcel, 7, m19102o0(), false);
        AbstractC2552a.m12929r(parcel, 8, this.f16044w);
        AbstractC2552a.m12934w(parcel, 9, this.f16045x, false);
        AbstractC2552a.m12907A(parcel, 10, this.f16046y, false);
        AbstractC2552a.m12934w(parcel, 11, m19097K(), false);
        AbstractC2552a.m12934w(parcel, 12, m19096J(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
