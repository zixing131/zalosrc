package p716zh;

import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p055ce.C3433b;
import p111du.AbstractC18069a;
import p304ks.AbstractC21935u;

/* renamed from: zh.l8 */
/* loaded from: classes3.dex */
public class C32006l8 {

    /* renamed from: a */
    public String f147274a;

    /* renamed from: b */
    public String f147275b;

    /* renamed from: c */
    public String f147276c;

    /* renamed from: d */
    public String f147277d;

    /* renamed from: e */
    public String f147278e;

    /* renamed from: f */
    public long f147279f;

    /* renamed from: g */
    public long f147280g;

    /* renamed from: h */
    public ArrayList f147281h;

    /* renamed from: i */
    public int f147282i;

    /* renamed from: j */
    public String f147283j;

    /* renamed from: k */
    public String f147284k;

    /* renamed from: l */
    public String f147285l;

    /* renamed from: m */
    public int f147286m;

    /* renamed from: n */
    public int f147287n;

    /* renamed from: o */
    public int f147288o;

    /* renamed from: p */
    public int f147289p;

    /* renamed from: q */
    public int f147290q;

    /* renamed from: r */
    public String f147291r;

    /* renamed from: s */
    public String f147292s;

    /* renamed from: t */
    public int f147293t;

    /* renamed from: u */
    public int f147294u;

    /* renamed from: v */
    public int f147295v;

    /* renamed from: w */
    public String f147296w;

    /* renamed from: x */
    public boolean f147297x;

    /* renamed from: y */
    public int f147298y;

    /* renamed from: z */
    C3433b f147299z;

    public C32006l8(String str) {
        this.f147282i = 0;
        this.f147286m = 1;
        this.f147287n = -1;
        this.f147288o = 1;
        this.f147289p = 1;
        this.f147290q = -1;
        this.f147293t = 0;
        this.f147294u = -1;
        this.f147295v = 0;
        this.f147296w = "";
        this.f147297x = false;
        this.f147298y = -1;
        this.f147299z = null;
        this.f147278e = str;
    }

    /* renamed from: a */
    public ContactProfile m154300a() {
        ContactProfile contactProfile = new ContactProfile(this.f147278e);
        contactProfile.f42434r = this.f147278e;
        contactProfile.f42446v = this.f147276c;
        contactProfile.f42455y = this.f147275b;
        contactProfile.f42373R0 = this.f147287n;
        contactProfile.f42437s = this.f147274a;
        contactProfile.f42352K0 = this.f147282i;
        contactProfile.m40401d1(this.f147291r);
        contactProfile.f42361N0 = this.f147295v;
        contactProfile.f42364O0 = this.f147296w;
        return contactProfile;
    }

    /* renamed from: b */
    public C3433b m154301b() {
        if (this.f147299z == null && !TextUtils.isEmpty(this.f147296w)) {
            try {
                this.f147299z = new C3433b(new JSONObject(this.f147296w));
            } catch (Exception unused) {
            }
        }
        return this.f147299z;
    }

    /* renamed from: c */
    public String m154302c(boolean z11, boolean z12) {
        return m154303d(z11, z12, true);
    }

    /* renamed from: d */
    public String m154303d(boolean z11, boolean z12, boolean z13) {
        if (!z13 && !z11) {
            return AbstractC21935u.m114541h(this.f147275b, this.f147274a, z12);
        }
        return AbstractC21935u.m114540g(this.f147275b, this.f147278e, this.f147274a, z13);
    }

    public C32006l8(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
        String str8 = ZMediaPlayer.OnNativeInvokeListener.ARG_URL;
        String str9 = "thumbnail";
        String str10 = "ownerId";
        String str11 = "albumId";
        this.f147282i = 0;
        this.f147286m = 1;
        String str12 = "photoId";
        this.f147287n = -1;
        this.f147288o = 1;
        this.f147289p = 1;
        this.f147290q = -1;
        this.f147293t = 0;
        this.f147294u = -1;
        this.f147295v = 0;
        this.f147296w = "";
        this.f147297x = false;
        this.f147298y = -1;
        this.f147299z = null;
        try {
            if (jSONObject.has("profile")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("profile");
                this.f147274a = jSONObject2.has("displayName") ? AbstractC18069a.m96089h(jSONObject2, "displayName") : "";
                this.f147275b = jSONObject2.has("phoneNum") ? AbstractC18069a.m96089h(jSONObject2, "phoneNum") : "";
                this.f147276c = jSONObject2.has("avatar") ? AbstractC18069a.m96089h(jSONObject2, "avatar") : "";
                this.f147277d = jSONObject2.has("cover") ? AbstractC18069a.m96089h(jSONObject2, "cover") : "";
                this.f147284k = jSONObject2.has("status") ? AbstractC18069a.m96089h(jSONObject2, "status") : "";
                this.f147282i = jSONObject2.has("profileType") ? AbstractC18069a.m96085d(jSONObject2, "profileType") : 0;
                this.f147283j = jSONObject2.has("username") ? AbstractC18069a.m96089h(jSONObject2, "username") : "";
                this.f147286m = jSONObject2.has("srcType") ? AbstractC18069a.m96085d(jSONObject2, "srcType") : 1;
                this.f147287n = jSONObject2.has("reqSrc") ? AbstractC18069a.m96085d(jSONObject2, "reqSrc") : -1;
                this.f147288o = jSONObject2.has("visibleActionMain") ? AbstractC18069a.m96085d(jSONObject2, "visibleActionMain") : 1;
                this.f147289p = jSONObject2.has("visibleActionRemove") ? AbstractC18069a.m96085d(jSONObject2, "visibleActionRemove") : 1;
                this.f147291r = jSONObject2.has("msg") ? AbstractC18069a.m96089h(jSONObject2, "msg") : "";
                this.f147294u = jSONObject2.has("gender") ? AbstractC18069a.m96085d(jSONObject2, "gender") : -1;
                this.f147285l = jSONObject2.has("description") ? AbstractC18069a.m96089h(jSONObject2, "description") : "";
                this.f147292s = jSONObject2.has("customText") ? AbstractC18069a.m96089h(jSONObject2, "customText") : "";
                this.f147278e = jSONObject2.has("userId") ? String.valueOf(AbstractC18069a.m96085d(jSONObject2, "userId")) : "";
                this.f147295v = jSONObject2.optInt("account_type", 0);
                this.f147296w = jSONObject2.optString("business_account", "");
            }
            if (jSONObject.has("totalPhotos")) {
                this.f147293t = jSONObject.optInt("totalPhotos");
            }
            if (jSONObject.has("photos")) {
                JSONArray jSONArray = jSONObject.getJSONArray("photos");
                this.f147281h = new ArrayList();
                if (jSONArray == null || jSONArray.length() <= 0) {
                    return;
                }
                int i11 = 0;
                while (i11 < jSONArray.length()) {
                    try {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                        ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                        str6 = str12;
                        try {
                            itemAlbumMobile.f42595r = jSONObject3.has(str6) ? AbstractC18069a.m96089h(jSONObject3, str6) : "";
                            str5 = str11;
                            try {
                                itemAlbumMobile.f42597s = jSONObject3.has(str5) ? AbstractC18069a.m96089h(jSONObject3, str5) : "";
                                str4 = str10;
                                try {
                                    itemAlbumMobile.f42593q = jSONObject3.has(str4) ? AbstractC18069a.m96089h(jSONObject3, str4) : "";
                                    str3 = str9;
                                    try {
                                        itemAlbumMobile.f42548C = jSONObject3.has(str3) ? AbstractC18069a.m96089h(jSONObject3, str3) : "";
                                        str2 = str8;
                                        try {
                                            itemAlbumMobile.f42607x = jSONObject3.has(str2) ? AbstractC18069a.m96089h(jSONObject3, str2) : "";
                                            str = str7;
                                        } catch (Exception e11) {
                                            e = e11;
                                            str = str7;
                                        }
                                        try {
                                            itemAlbumMobile.f42591p = jSONObject3.has(str) ? AbstractC18069a.m96085d(jSONObject3, str) : 1;
                                            this.f147281h.add(itemAlbumMobile);
                                        } catch (Exception e12) {
                                            e = e12;
                                            e.printStackTrace();
                                            i11++;
                                            str12 = str6;
                                            str11 = str5;
                                            str10 = str4;
                                            str9 = str3;
                                            str8 = str2;
                                            str7 = str;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        str = str7;
                                        str2 = str8;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    str = str7;
                                    str2 = str8;
                                    str3 = str9;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                str = str7;
                                str2 = str8;
                                str3 = str9;
                                str4 = str10;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            str = str7;
                            str2 = str8;
                            str3 = str9;
                            str4 = str10;
                            str5 = str11;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        str = str7;
                        str2 = str8;
                        str3 = str9;
                        str4 = str10;
                        str5 = str11;
                        str6 = str12;
                    }
                    i11++;
                    str12 = str6;
                    str11 = str5;
                    str10 = str4;
                    str9 = str3;
                    str8 = str2;
                    str7 = str;
                }
            }
        } catch (Exception e18) {
            e18.printStackTrace();
        }
    }
}
