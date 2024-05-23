package com.google.firebase.crashlytics.ndk;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.ndk.k */
/* loaded from: classes.dex */
abstract class AbstractC6574k {
    /* renamed from: a */
    private static String m33587a(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m33588b(String str, String str2, long j11) {
        HashMap hashMap = new HashMap();
        hashMap.put("session_id", str);
        hashMap.put("generator", str2);
        hashMap.put("started_at_seconds", Long.valueOf(j11));
        return new JSONObject(hashMap).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m33589c(String str, String str2, String str3, String str4, int i11, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_identifier", str);
        hashMap.put("version_code", str2);
        hashMap.put("version_name", str3);
        hashMap.put("install_uuid", str4);
        hashMap.put("delivery_mechanism", Integer.valueOf(i11));
        hashMap.put("development_platform", m33587a(str5));
        hashMap.put("development_platform_version", m33587a(str6));
        return new JSONObject(hashMap).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m33590d(int i11, String str, int i12, long j11, long j12, boolean z11, int i13, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("arch", Integer.valueOf(i11));
        hashMap.put("build_model", str);
        hashMap.put("available_processors", Integer.valueOf(i12));
        hashMap.put("total_ram", Long.valueOf(j11));
        hashMap.put("disk_space", Long.valueOf(j12));
        hashMap.put("is_emulator", Boolean.valueOf(z11));
        hashMap.put("state", Integer.valueOf(i13));
        hashMap.put("build_manufacturer", str2);
        hashMap.put("build_product", str3);
        return new JSONObject(hashMap).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m33591e(String str, String str2, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put("version", str);
        hashMap.put("build_version", str2);
        hashMap.put("is_rooted", Boolean.valueOf(z11));
        return new JSONObject(hashMap).toString();
    }
}
