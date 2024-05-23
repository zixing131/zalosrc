package me0;

import android.text.TextUtils;
import dk.C18017a;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.AbstractC23309i;

/* renamed from: me0.q6 */
/* loaded from: classes.dex */
public abstract class AbstractC23188q6 {

    /* renamed from: a */
    public static String f112416a;

    /* renamed from: b */
    public static String f112417b;

    /* renamed from: c */
    public static ArrayList f112418c;

    /* renamed from: d */
    private static String[] f112419d;

    /* renamed from: e */
    private static final int[] f112420e = {-11943101, -1409457, -13978963, -2403703, -10130989, -2914547};

    /* renamed from: f */
    private static final int[] f112421f = {-5965920, -546168, -11742772, -1538387, -6512668, -1781625};

    /* renamed from: g */
    private static int[] f112422g;

    /* renamed from: h */
    private static int[] f112423h;

    /* renamed from: i */
    public static ArrayList f112424i;

    /* renamed from: j */
    private static C18017a[] f112425j;

    /* renamed from: k */
    private static HashMap f112426k;

    /* renamed from: a */
    public static ArrayList m119483a() {
        if (f112418c == null) {
            String m122529w4 = AbstractC23309i.m122529w4();
            if (!TextUtils.isEmpty(m122529w4)) {
                f112418c = new ArrayList();
                try {
                    JSONArray optJSONArray = new JSONObject(m122529w4).optJSONArray("avt_template");
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            f112418c.add(optJSONArray.getString(i11));
                        }
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
        }
        return f112418c;
    }

    /* renamed from: b */
    public static ArrayList m119484b() {
        JSONArray jSONArray;
        try {
            if (f112424i == null) {
                String m122529w4 = AbstractC23309i.m122529w4();
                if (!TextUtils.isEmpty(m122529w4)) {
                    jSONArray = new JSONObject(m122529w4).optJSONArray("calendar_cover");
                } else {
                    jSONArray = null;
                }
                if (jSONArray == null) {
                    jSONArray = new JSONArray("[\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_1_1526358787567.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_2_1526358792840.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_3_1526358798405.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_4_1526358805561.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_5_1526358814346.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_6_1526358818789.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_7_1526358825969.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_8_1526358833099.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_9_1526358840570.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_10_1526358845271.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_11_1526358852496.png\",\"https:\\/\\/res-zalo.zadn.vn\\/upload\\/media\\/2018\\/5\\/15\\/calendar_banner_12_1526358856827.png\"]");
                }
                f112424i = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    f112424i.add(jSONArray.getString(i11));
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return f112424i;
    }

    /* renamed from: c */
    public static C18017a[] m119485c(boolean z11) {
        try {
            if (f112425j == null || z11) {
                String m122529w4 = AbstractC23309i.m122529w4();
                if (!TextUtils.isEmpty(m122529w4)) {
                    JSONArray optJSONArray = new JSONObject(m122529w4).optJSONArray("discover_category");
                    f112426k = new HashMap();
                    if (optJSONArray != null) {
                        f112425j = new C18017a[optJSONArray.length()];
                        int i11 = 0;
                        while (true) {
                            C18017a[] c18017aArr = f112425j;
                            if (i11 >= c18017aArr.length) {
                                break;
                            }
                            c18017aArr[i11] = new C18017a(optJSONArray.getJSONObject(i11));
                            f112426k.put(Integer.valueOf(f112425j[i11].f91259c), f112425j[i11].f91258b);
                            i11++;
                        }
                    }
                }
                if (f112425j == null) {
                    f112425j = new C18017a[0];
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return f112425j;
    }

    /* renamed from: d */
    public static int[] m119486d() {
        int[] iArr;
        JSONArray optJSONArray;
        if (C23212s8.m119603k()) {
            iArr = f112420e;
        } else {
            iArr = f112421f;
        }
        try {
            int i11 = 0;
            if (f112422g == null) {
                String m122529w4 = AbstractC23309i.m122529w4();
                if (!TextUtils.isEmpty(m122529w4) && (optJSONArray = new JSONObject(m122529w4).optJSONArray("group_name_color")) != null) {
                    f112422g = new int[optJSONArray.length()];
                    for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                        f112422g[i12] = optJSONArray.getInt(i12);
                    }
                }
                int[] iArr2 = f112422g;
                if (iArr2 == null || iArr2.length == 0) {
                    f112422g = f112420e;
                    f112423h = f112421f;
                }
            }
            if (C23212s8.m119602i()) {
                if (f112423h == null) {
                    f112423h = new int[f112422g.length];
                    while (true) {
                        int[] iArr3 = f112423h;
                        if (i11 >= iArr3.length) {
                            break;
                        }
                        iArr3[i11] = AbstractC23265y.m120015b(f112422g[i11], 1.3f);
                        i11++;
                    }
                }
                return f112423h;
            }
            return f112422g;
        } catch (Exception e11) {
            e11.printStackTrace();
            return iArr;
        }
    }

    /* renamed from: e */
    public static String[] m119487e() {
        JSONArray jSONArray;
        try {
            if (f112419d == null) {
                String m122529w4 = AbstractC23309i.m122529w4();
                if (!TextUtils.isEmpty(m122529w4)) {
                    jSONArray = new JSONObject(m122529w4).optJSONArray("topic_emoji");
                } else {
                    jSONArray = null;
                }
                if (jSONArray == null) {
                    jSONArray = new JSONArray("[\"📢\", \"🚩\",\"❗️\", \"❓\", \"❤️\", \"🎉\", \"🍺\", \"⚽️\", \"🎮\", \"🎧\", \"📚\", \"🎁\", \"🎓\", \"🌼\", \"✈️\", \"🔔\"]");
                }
                f112419d = new String[jSONArray.length()];
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    f112419d[i11] = jSONArray.getString(i11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return f112419d;
    }

    /* renamed from: f */
    public static void m119488f() {
        String m121034I1 = AbstractC23309i.m121034I1();
        if (!TextUtils.isEmpty(m121034I1)) {
            try {
                JSONObject jSONObject = new JSONObject(m121034I1);
                f112416a = AbstractC18069a.m96089h(jSONObject, "empty_timeline_big");
                f112417b = AbstractC18069a.m96089h(jSONObject, "empty_tab_zalopage_big");
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }
}
