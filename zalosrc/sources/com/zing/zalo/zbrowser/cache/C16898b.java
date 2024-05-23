package com.zing.zalo.zbrowser.cache;

import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.zing.zalo.zbrowser.cache.b */
/* loaded from: classes7.dex */
public class C16898b {

    /* renamed from: D */
    public static final C16898b f86045D = new C16898b(3600, 1800, 7200, 1, false, new LinkedList(), new LinkedList(), new LinkedList(), new LinkedList(), false, 524288, 524288, 5242880, 5242880, -1, 10485760, 32768, ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE, 86400, -1, false, "", 5242880, 524288, 7200, new LinkedList(), 5242880, 7889400, new LinkedList());

    /* renamed from: A */
    public int f86046A;

    /* renamed from: B */
    public final boolean f86047B;

    /* renamed from: C */
    public final String f86048C;

    /* renamed from: a */
    public final int f86049a;

    /* renamed from: b */
    public final int f86050b;

    /* renamed from: c */
    public final int f86051c;

    /* renamed from: d */
    public final int f86052d;

    /* renamed from: e */
    public final boolean f86053e;

    /* renamed from: f */
    public final List f86054f;

    /* renamed from: g */
    public final List f86055g;

    /* renamed from: h */
    public final List f86056h;

    /* renamed from: i */
    public final List f86057i;

    /* renamed from: j */
    public final boolean f86058j;

    /* renamed from: k */
    public final int f86059k;

    /* renamed from: l */
    public final int f86060l;

    /* renamed from: m */
    public final int f86061m;

    /* renamed from: n */
    public final int f86062n;

    /* renamed from: o */
    public final int f86063o;

    /* renamed from: p */
    public final int f86064p;

    /* renamed from: q */
    public final int f86065q;

    /* renamed from: r */
    public final int f86066r;

    /* renamed from: s */
    public final int f86067s;

    /* renamed from: t */
    public final List f86068t;

    /* renamed from: u */
    public final int f86069u;

    /* renamed from: v */
    public final int f86070v;

    /* renamed from: w */
    public final int f86071w;

    /* renamed from: x */
    public final long f86072x;

    /* renamed from: y */
    public final long f86073y;

    /* renamed from: z */
    public final List f86074z;

    private C16898b(int i11, int i12, int i13, int i14, boolean z11, List list, List list2, List list3, List list4, boolean z12, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, boolean z13, String str, int i26, int i27, int i28, List list5, long j11, long j12, List list6) {
        this.f86049a = i11;
        this.f86050b = i12;
        this.f86051c = i13;
        this.f86052d = i14;
        this.f86053e = z11;
        this.f86054f = list;
        this.f86055g = list2;
        this.f86056h = list3;
        this.f86057i = list4;
        this.f86058j = z12;
        this.f86059k = i15;
        this.f86060l = i16;
        this.f86061m = i17;
        this.f86062n = i18;
        this.f86063o = i19;
        this.f86064p = i21;
        this.f86069u = i22;
        this.f86070v = i23;
        this.f86071w = i24;
        this.f86066r = i26;
        this.f86065q = i27;
        this.f86067s = i28;
        this.f86068t = list5;
        this.f86072x = j11;
        this.f86073y = j12;
        this.f86074z = list6;
        this.f86046A = i25 < 0 ? 0 : i25;
        this.f86047B = z13;
        this.f86048C = str;
    }

    /* renamed from: b */
    public static boolean m90362b(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list != null || list2 == null) {
            if ((list != null && list2 == null) || list.size() != list2.size()) {
                return false;
            }
            Collections.sort(list);
            Collections.sort(list2);
            return list.equals(list2);
        }
        return false;
    }

    /* renamed from: c */
    public static C16898b m90363c(String str) {
        if (str == null) {
            return f86045D;
        }
        try {
            return m90364d(new JSONObject(str));
        } catch (JSONException unused) {
            return f86045D;
        }
    }

    /* renamed from: d */
    public static C16898b m90364d(JSONObject jSONObject) {
        try {
            C16898b c16898b = f86045D;
            int m90365e = m90365e(jSONObject, "expire_time", c16898b.f86049a);
            int m90365e2 = m90365e(jSONObject, "html_expire_time", c16898b.f86050b);
            int m90365e3 = m90365e(jSONObject, "static_expire_time", c16898b.f86051c);
            int m90365e4 = m90365e(jSONObject, "max_download_connection", c16898b.f86052d);
            boolean optBoolean = jSONObject.optBoolean("preload_cover_image");
            List m90366f = m90366f(jSONObject, "preload_domains", c16898b.f86054f);
            List m90366f2 = m90366f(jSONObject, "preload_files", c16898b.f86054f);
            List m90366f3 = m90366f(jSONObject, "cache_domains", c16898b.f86056h);
            List m90366f4 = m90366f(jSONObject, "cache_domains_photo", c16898b.f86057i);
            boolean z11 = !"all".equalsIgnoreCase(jSONObject.optString("preload_network"));
            int optInt = jSONObject.optInt("html_mem_size", 524288);
            int optInt2 = jSONObject.optInt("html_disk_size", 5242880);
            return new C16898b(m90365e, m90365e2, m90365e3, m90365e4, optBoolean, m90366f, m90366f2, m90366f3, m90366f4, z11, optInt, jSONObject.optInt("static_mem_size", 524288), optInt2, jSONObject.optInt("static_disk_size", 5242880), jSONObject.optInt("photo_mem_size", -1), jSONObject.optInt("photo_disk_size", 10485760), jSONObject.optInt("jump_mem_size", 32768), jSONObject.optInt("jump_disk_size", ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE), jSONObject.optInt("jump_expire", c16898b.f86071w), jSONObject.optInt("version", 0), jSONObject.optBoolean("debug", false), jSONObject.optString("script_url", ""), jSONObject.optInt("h5_static_disk_size", 5242880), jSONObject.optInt("h5_static_mem_size", 524288), jSONObject.optInt("h5_static_expire_time", c16898b.f86051c), m90366f(jSONObject, "h5_cache_domains", c16898b.f86068t), jSONObject.optInt("h5_storage_size", 524288), jSONObject.optInt("h5_storage_expire_time", 5242880), m90366f(jSONObject, "ignore_params_cache_domains", c16898b.f86068t));
        } catch (Exception unused) {
            return f86045D;
        }
    }

    /* renamed from: e */
    private static int m90365e(JSONObject jSONObject, String str, int i11) {
        try {
            return Integer.parseInt(jSONObject.get(str).toString());
        } catch (Exception unused) {
            return i11;
        }
    }

    /* renamed from: f */
    private static List m90366f(JSONObject jSONObject, String str, List list) {
        try {
            JSONArray jSONArray = (JSONArray) jSONObject.get(str);
            LinkedList linkedList = new LinkedList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                linkedList.add(jSONArray.get(i11).toString());
            }
            return linkedList;
        } catch (Exception unused) {
            return list;
        }
    }

    /* renamed from: a */
    public boolean m90367a(String str) {
        try {
            List list = this.f86074z;
            if (list != null && list.size() > 0) {
                String host = new URI(str).getHost();
                if (TextUtils.isEmpty(host)) {
                    return false;
                }
                for (String str2 : this.f86074z) {
                    int length = str2.length();
                    if (host.length() >= length && host.substring(host.length() - length).equalsIgnoreCase(str2)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C16898b)) {
            return false;
        }
        C16898b c16898b = (C16898b) obj;
        if (this.f86049a != c16898b.f86049a || this.f86050b != c16898b.f86050b || this.f86051c != c16898b.f86051c || this.f86052d != c16898b.f86052d || this.f86053e != c16898b.f86053e || this.f86058j != c16898b.f86058j || this.f86059k != c16898b.f86059k || this.f86060l != c16898b.f86060l || this.f86061m != c16898b.f86061m || this.f86062n != c16898b.f86062n || this.f86063o != c16898b.f86063o || this.f86064p != c16898b.f86064p || this.f86069u != c16898b.f86069u || this.f86070v != c16898b.f86070v || this.f86071w != c16898b.f86071w || this.f86066r != c16898b.f86066r || this.f86065q != c16898b.f86065q || this.f86067s != c16898b.f86067s || this.f86073y != c16898b.f86073y || this.f86072x != c16898b.f86072x || !m90362b(c16898b.f86068t, this.f86068t) || !m90362b(c16898b.f86054f, this.f86054f) || !m90362b(c16898b.f86055g, this.f86055g) || !m90362b(c16898b.f86056h, this.f86056h) || !m90362b(c16898b.f86057i, this.f86057i) || !m90362b(c16898b.f86074z, this.f86074z)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean m90368g(String str) {
        List list;
        try {
            String host = new URI(str).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            List list2 = this.f86054f;
            if ((list2 == null || !list2.contains(host)) && ((list = this.f86056h) == null || !list.contains(host))) {
                List list3 = this.f86057i;
                if (list3 == null) {
                    return false;
                }
                if (!list3.contains(host)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: h */
    public boolean m90369h(String str) {
        try {
            List list = this.f86054f;
            if (list != null && list.size() > 0) {
                String host = new URI(str).getHost();
                if (TextUtils.isEmpty(host)) {
                    return false;
                }
                for (String str2 : this.f86054f) {
                    int length = str2.length();
                    if (host.length() >= length && host.substring(host.length() - length).equalsIgnoreCase(str2)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i11 = 31 + this.f86049a;
        int i12 = ((i11 << 5) - i11) + this.f86050b;
        int i13 = ((i12 << 5) - i12) + this.f86051c;
        int i14 = ((i13 << 5) - i13) + this.f86052d;
        int i15 = ((i14 << 5) - i14) + (this.f86053e ? 1 : 0);
        int i16 = ((i15 << 5) - i15) + (this.f86058j ? 1 : 0);
        int i17 = ((i16 << 5) - i16) + this.f86059k;
        int i18 = ((i17 << 5) - i17) + this.f86060l;
        int i19 = ((i18 << 5) - i18) + this.f86061m;
        int i21 = ((i19 << 5) - i19) + this.f86062n;
        int i22 = ((i21 << 5) - i21) + this.f86063o;
        int i23 = ((i22 << 5) - i22) + this.f86064p;
        int i24 = ((i23 << 5) - i23) + this.f86069u;
        int i25 = ((i24 << 5) - i24) + this.f86070v;
        int i26 = ((i25 << 5) - i25) + this.f86071w;
        int i27 = ((i26 << 5) - i26) + this.f86066r;
        int i28 = ((i27 << 5) - i27) + this.f86065q;
        int i29 = ((i28 << 5) - i28) + this.f86067s;
        int i31 = (int) (((i29 << 5) - i29) + this.f86072x);
        int i32 = (int) (((i31 << 5) - i31) + this.f86073y);
        Iterator it = this.f86068t.iterator();
        while (true) {
            int i33 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            int i34 = (i32 << 5) - i32;
            if (str != null) {
                i33 = str.hashCode();
            }
            i32 = i34 + i33;
        }
        for (String str2 : this.f86054f) {
            int i35 = (i32 << 5) - i32;
            if (str2 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str2.hashCode();
            }
            i32 = hashCode5 + i35;
        }
        for (String str3 : this.f86055g) {
            int i36 = (i32 << 5) - i32;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            i32 = hashCode4 + i36;
        }
        for (String str4 : this.f86056h) {
            int i37 = (i32 << 5) - i32;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            i32 = hashCode3 + i37;
        }
        for (String str5 : this.f86057i) {
            int i38 = (i32 << 5) - i32;
            if (str5 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str5.hashCode();
            }
            i32 = hashCode2 + i38;
        }
        for (String str6 : this.f86074z) {
            int i39 = (i32 << 5) - i32;
            if (str6 == null) {
                hashCode = 0;
            } else {
                hashCode = str6.hashCode();
            }
            i32 = hashCode + i39;
        }
        return i32;
    }
}
