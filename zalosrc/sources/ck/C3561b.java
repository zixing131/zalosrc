package ck;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONObject;

/* renamed from: ck.b */
/* loaded from: classes3.dex */
public class C3561b {

    /* renamed from: a */
    public String f15079a;

    /* renamed from: b */
    public String f15080b;

    /* renamed from: c */
    public String f15081c;

    /* renamed from: d */
    public int f15082d;

    /* renamed from: e */
    public String f15083e;

    /* renamed from: f */
    public String f15084f;

    /* renamed from: g */
    public int f15085g;

    /* renamed from: h */
    public int f15086h;

    /* renamed from: i */
    public String f15087i;

    public C3561b(JSONObject jSONObject) {
        try {
            this.f15080b = jSONObject.optString("actionType");
            this.f15081c = jSONObject.optString("title");
            this.f15082d = jSONObject.optInt("imgType", 0);
            this.f15083e = jSONObject.optString("gifUrl");
            this.f15084f = jSONObject.optString("imgUrl");
            this.f15085g = jSONObject.optInt("width");
            this.f15086h = jSONObject.optInt("height");
            this.f15087i = jSONObject.optString("data");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static String m18093b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "action_";
        }
        return "action_" + m18094c(str);
    }

    /* renamed from: c */
    private static String m18094c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                StringBuilder sb3 = new StringBuilder(Integer.toHexString(b11 & 255));
                while (sb3.length() < 2) {
                    sb3.insert(0, "0");
                }
                sb2.append((CharSequence) sb3);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public String m18095a() {
        if (TextUtils.isEmpty(this.f15079a)) {
            return "action_";
        }
        return "action_" + m18094c(this.f15079a);
    }
}
