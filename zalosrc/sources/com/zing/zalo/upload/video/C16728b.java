package com.zing.zalo.upload.video;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.zing.zalo.upload.video.b */
/* loaded from: classes4.dex */
public class C16728b {

    /* renamed from: a */
    public String f84829a;

    /* renamed from: b */
    private final HashMap f84830b;

    /* renamed from: c */
    private final HashMap f84831c;

    /* renamed from: d */
    private final HashMap f84832d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C16728b(String str, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        this.f84830b = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f84831c = hashMap2;
        HashMap hashMap3 = new HashMap();
        this.f84832d = hashMap3;
        this.f84829a = str;
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("thumbInfo");
            if (optJSONObject != null) {
                m89201h(hashMap, optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("mediaInfo");
            if (optJSONObject2 != null) {
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("2");
                if (optJSONObject3 != null) {
                    m89201h(hashMap2, optJSONObject3);
                }
                JSONObject optJSONObject4 = optJSONObject2.optJSONObject("8");
                if (optJSONObject3 != null) {
                    m89201h(hashMap3, optJSONObject4);
                }
            }
        }
    }

    /* renamed from: b */
    private VideoMediaInfo m89196b() {
        return m89197c("480");
    }

    /* renamed from: c */
    private VideoMediaInfo m89197c(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = (String) this.f84830b.get(str);
            String str3 = (String) this.f84831c.get(str);
            String str4 = (String) this.f84832d.get(str);
            if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
                return new VideoMediaInfo(this.f84829a, str, str2, str3, str4);
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    private List m89198d() {
        return m89199e("all");
    }

    /* renamed from: e */
    private List m89199e(String str) {
        HashMap hashMap = new HashMap();
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 50:
                if (str.equals("2")) {
                    c11 = 0;
                    break;
                }
                break;
            case 56:
                if (str.equals("8")) {
                    c11 = 1;
                    break;
                }
                break;
            case 96673:
                if (str.equals("all")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                m89200f("2", this.f84831c, hashMap);
                break;
            case 1:
                m89200f("8", this.f84832d, hashMap);
                break;
            case 2:
                m89200f("2", this.f84831c, hashMap);
                m89200f("8", this.f84832d, hashMap);
                break;
        }
        return new ArrayList(hashMap.values());
    }

    /* renamed from: f */
    private void m89200f(String str, Map map, Map map2) {
        if (map2 == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String str4 = (String) this.f84830b.get(str2);
            VideoMediaInfo videoMediaInfo = (VideoMediaInfo) map2.get(str2);
            if (videoMediaInfo == null) {
                videoMediaInfo = new VideoMediaInfo();
            }
            videoMediaInfo.f84814p = this.f84829a;
            videoMediaInfo.f84815q = str2;
            videoMediaInfo.f84816r = str4;
            str.hashCode();
            if (!str.equals("2")) {
                if (str.equals("8")) {
                    videoMediaInfo.f84818t = str3;
                    map2.put(str2, videoMediaInfo);
                }
            } else {
                videoMediaInfo.f84817s = str3;
                map2.put(str2, videoMediaInfo);
            }
        }
    }

    /* renamed from: h */
    private void m89201h(HashMap hashMap, JSONObject jSONObject) {
        if (hashMap != null && jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    hashMap.put(next, optString);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public VideoMediaInfo m89202a() {
        VideoMediaInfo m89196b = m89196b();
        if (m89196b == null) {
            List<VideoMediaInfo> m89198d = m89198d();
            if (!m89198d.isEmpty()) {
                for (VideoMediaInfo videoMediaInfo : m89198d) {
                    if (!TextUtils.isEmpty(videoMediaInfo.f84817s)) {
                        return videoMediaInfo;
                    }
                }
                return m89196b;
            }
            return m89196b;
        }
        return m89196b;
    }

    /* renamed from: g */
    public boolean m89203g() {
        if (this.f84831c.isEmpty() && this.f84832d.isEmpty()) {
            return true;
        }
        return false;
    }
}
