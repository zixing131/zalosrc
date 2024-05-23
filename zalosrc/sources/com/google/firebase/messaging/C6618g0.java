package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.g0 */
/* loaded from: classes3.dex */
public class C6618g0 {

    /* renamed from: a */
    private final Bundle f36651a;

    public C6618g0(Bundle bundle) {
        if (bundle != null) {
            this.f36651a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: d */
    private static int m33856d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m33857s(String str) {
        if (!str.startsWith("google.c.a.") && !str.equals("from")) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m33858t(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString(m33860v("gcm.n.e")))) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private static boolean m33859u(String str) {
        if (!str.startsWith("google.c.") && !str.startsWith("gcm.n.") && !str.startsWith("gcm.notification.")) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private static String m33860v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m33861w(String str) {
        if (!this.f36651a.containsKey(str) && str.startsWith("gcm.n.")) {
            String m33860v = m33860v(str);
            if (this.f36651a.containsKey(m33860v)) {
                return m33860v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m33862z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: a */
    public boolean m33863a(String str) {
        String m33877p = m33877p(str);
        if (!"1".equals(m33877p) && !Boolean.parseBoolean(m33877p)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Integer m33864b(String str) {
        String m33877p = m33877p(str);
        if (!TextUtils.isEmpty(m33877p)) {
            try {
                return Integer.valueOf(Integer.parseInt(m33877p));
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't parse value of ");
                sb2.append(m33862z(str));
                sb2.append("(");
                sb2.append(m33877p);
                sb2.append(") into an int");
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public JSONArray m33865c(String str) {
        String m33877p = m33877p(str);
        if (!TextUtils.isEmpty(m33877p)) {
            try {
                return new JSONArray(m33877p);
            } catch (JSONException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Malformed JSON for key ");
                sb2.append(m33862z(str));
                sb2.append(": ");
                sb2.append(m33877p);
                sb2.append(", falling back to default");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m33866e() {
        JSONArray m33865c = m33865c("gcm.n.light_settings");
        if (m33865c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m33865c.length() == 3) {
                iArr[0] = m33856d(m33865c.optString(0));
                iArr[1] = m33865c.optInt(1);
                iArr[2] = m33865c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LightSettings is invalid: ");
            sb2.append(m33865c);
            sb2.append(". ");
            sb2.append(e11.getMessage());
            sb2.append(". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("LightSettings is invalid: ");
            sb3.append(m33865c);
            sb3.append(". Skipping setting LightSettings");
            return null;
        }
    }

    /* renamed from: f */
    public Uri m33867f() {
        String m33877p = m33877p("gcm.n.link_android");
        if (TextUtils.isEmpty(m33877p)) {
            m33877p = m33877p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(m33877p)) {
            return Uri.parse(m33877p);
        }
        return null;
    }

    /* renamed from: g */
    public Object[] m33868g(String str) {
        JSONArray m33865c = m33865c(str + "_loc_args");
        if (m33865c == null) {
            return null;
        }
        int length = m33865c.length();
        String[] strArr = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            strArr[i11] = m33865c.optString(i11);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m33869h(String str) {
        return m33877p(str + "_loc_key");
    }

    /* renamed from: i */
    public String m33870i(Resources resources, String str, String str2) {
        String m33869h = m33869h(str2);
        if (TextUtils.isEmpty(m33869h)) {
            return null;
        }
        int identifier = resources.getIdentifier(m33869h, "string", str);
        if (identifier == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m33862z(str2 + "_loc_key"));
            sb2.append(" resource not found: ");
            sb2.append(str2);
            sb2.append(" Default value will be used.");
            return null;
        }
        Object[] m33868g = m33868g(str2);
        if (m33868g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m33868g);
        } catch (MissingFormatArgumentException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing format argument for ");
            sb3.append(m33862z(str2));
            sb3.append(": ");
            sb3.append(Arrays.toString(m33868g));
            sb3.append(" Default value will be used.");
            return null;
        }
    }

    /* renamed from: j */
    public Long m33871j(String str) {
        String m33877p = m33877p(str);
        if (!TextUtils.isEmpty(m33877p)) {
            try {
                return Long.valueOf(Long.parseLong(m33877p));
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't parse value of ");
                sb2.append(m33862z(str));
                sb2.append("(");
                sb2.append(m33877p);
                sb2.append(") into a long");
                return null;
            }
        }
        return null;
    }

    /* renamed from: k */
    public String m33872k() {
        return m33877p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Integer m33873l() {
        Integer m33864b = m33864b("gcm.n.notification_count");
        if (m33864b == null) {
            return null;
        }
        if (m33864b.intValue() < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("notificationCount is invalid: ");
            sb2.append(m33864b);
            sb2.append(". Skipping setting notificationCount.");
            return null;
        }
        return m33864b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Integer m33874m() {
        Integer m33864b = m33864b("gcm.n.notification_priority");
        if (m33864b == null) {
            return null;
        }
        if (m33864b.intValue() >= -2 && m33864b.intValue() <= 2) {
            return m33864b;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("notificationPriority is invalid ");
        sb2.append(m33864b);
        sb2.append(". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String m33875n(Resources resources, String str, String str2) {
        String m33877p = m33877p(str2);
        if (!TextUtils.isEmpty(m33877p)) {
            return m33877p;
        }
        return m33870i(resources, str, str2);
    }

    /* renamed from: o */
    public String m33876o() {
        String m33877p = m33877p("gcm.n.sound2");
        if (TextUtils.isEmpty(m33877p)) {
            return m33877p("gcm.n.sound");
        }
        return m33877p;
    }

    /* renamed from: p */
    public String m33877p(String str) {
        return this.f36651a.getString(m33861w(str));
    }

    /* renamed from: q */
    public long[] m33878q() {
        JSONArray m33865c = m33865c("gcm.n.vibrate_timings");
        if (m33865c == null) {
            return null;
        }
        try {
            if (m33865c.length() > 1) {
                int length = m33865c.length();
                long[] jArr = new long[length];
                for (int i11 = 0; i11 < length; i11++) {
                    jArr[i11] = m33865c.optLong(i11);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("User defined vibrateTimings is invalid: ");
            sb2.append(m33865c);
            sb2.append(". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer m33879r() {
        Integer m33864b = m33864b("gcm.n.visibility");
        if (m33864b == null) {
            return null;
        }
        if (m33864b.intValue() >= -1 && m33864b.intValue() <= 1) {
            return m33864b;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("visibility is invalid: ");
        sb2.append(m33864b);
        sb2.append(". Skipping setting visibility.");
        return null;
    }

    /* renamed from: x */
    public Bundle m33880x() {
        Bundle bundle = new Bundle(this.f36651a);
        for (String str : this.f36651a.keySet()) {
            if (!m33857s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m33881y() {
        Bundle bundle = new Bundle(this.f36651a);
        for (String str : this.f36651a.keySet()) {
            if (m33859u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
