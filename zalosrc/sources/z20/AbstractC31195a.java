package z20;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: z20.a */
/* loaded from: classes5.dex */
public abstract class AbstractC31195a {
    /* renamed from: a */
    public static float m151996a(double d11, double d12, double d13, double d14) {
        float[] fArr = new float[3];
        Location.distanceBetween(d11, d12, d13, d14, fArr);
        return fArr[0];
    }

    /* renamed from: b */
    public static String m151997b(Context context, double d11, double d12) {
        try {
            List m151998c = m151998c(context, d11, d12, 2);
            if (m151998c != null) {
                Iterator it = m151998c.iterator();
                while (it.hasNext()) {
                    String m152002g = m152002g((Address) it.next());
                    if (!TextUtils.isEmpty(m152002g)) {
                        return m152002g;
                    }
                }
                return "";
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static List m151998c(Context context, double d11, double d12, int i11) {
        try {
            return new Geocoder(context, Locale.getDefault()).getFromLocation(d12, d11, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static JSONObject m151999d(Address address) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (address == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e11) {
            e = e11;
        }
        try {
            if (address.getMaxAddressLineIndex() >= 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 <= address.getMaxAddressLineIndex(); i11++) {
                    jSONArray.put(address.getAddressLine(i11));
                }
                jSONObject.put("addressLines", jSONArray);
            }
            if (!TextUtils.isEmpty(address.getFeatureName())) {
                jSONObject.put("feature", address.getFeatureName());
            }
            if (!TextUtils.isEmpty(address.getAdminArea())) {
                jSONObject.put("admin", address.getAdminArea());
            }
            if (!TextUtils.isEmpty(address.getSubAdminArea())) {
                jSONObject.put("subAdmin", address.getSubAdminArea());
            }
            if (!TextUtils.isEmpty(address.getLocality())) {
                jSONObject.put("locality", address.getLocality());
            }
            if (!TextUtils.isEmpty(address.getThoroughfare())) {
                jSONObject.put("thoroughfare", address.getThoroughfare());
            }
            if (!TextUtils.isEmpty(address.getPostalCode())) {
                jSONObject.put("postalCode", address.getPostalCode());
            }
            if (!TextUtils.isEmpty(address.getCountryCode())) {
                jSONObject.put("countryCode", address.getCountryCode());
            }
            if (!TextUtils.isEmpty(address.getCountryName())) {
                jSONObject.put("countryName", address.getCountryName());
            }
            if (address.hasLatitude()) {
                jSONObject.put("latitude", address.getLatitude());
            }
            if (address.hasLongitude()) {
                jSONObject.put("longitude", address.getLongitude());
            }
            if (!TextUtils.isEmpty(address.getPhone())) {
                jSONObject.put("phone", address.getPhone());
            }
            if (!TextUtils.isEmpty(address.getUrl())) {
                jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, address.getUrl());
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException e12) {
            e = e12;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    /* renamed from: e */
    public static JSONObject m152000e(double d11, double d12, List list) {
        if (list != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lat", d11);
                jSONObject.put("lon", d12);
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    JSONObject m151999d = m151999d((Address) it.next());
                    if (m151999d != null) {
                        jSONArray.put(m151999d);
                    }
                }
                jSONObject.put("data", jSONArray);
                return jSONObject;
            } catch (JSONException e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m152001f(double d11, double d12) {
        return d11 >= -90.0d && d11 <= 90.0d && d12 >= -180.0d && d12 <= 180.0d;
    }

    /* renamed from: g */
    private static String m152002g(Address address) {
        String addressLine;
        if (address == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 5 && (addressLine = address.getAddressLine(i11)) != null; i11++) {
            sb2.append(addressLine);
            sb2.append(", ");
        }
        int length = sb2.length();
        if (length == 0) {
            return "";
        }
        sb2.delete(length - 2, length - 1);
        return sb2.toString();
    }
}
