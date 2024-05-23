package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.AbstractC1388a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.t0 */
/* loaded from: classes.dex */
class C6645t0 {

    /* renamed from: a */
    final SharedPreferences f36700a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.t0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        private static final long f36701d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f36702a;

        /* renamed from: b */
        final String f36703b;

        /* renamed from: c */
        final long f36704c;

        private a(String str, String str2, long j11) {
            this.f36702a = str;
            this.f36703b = str2;
            this.f36704c = j11;
        }

        /* renamed from: a */
        static String m33954a(String str, String str2, long j11) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j11);
                return jSONObject.toString();
            } catch (JSONException e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to encode token: ");
                sb2.append(e11);
                return null;
            }
        }

        /* renamed from: c */
        static a m33955c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to parse token: ");
                    sb2.append(e11);
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m33956b(String str) {
            if (System.currentTimeMillis() <= this.f36704c + f36701d && str.equals(this.f36703b)) {
                return false;
            }
            return true;
        }
    }

    public C6645t0(Context context) {
        this.f36700a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m33947a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m33947a(Context context, String str) {
        File file = new File(AbstractC1388a.m6968j(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !m33952f()) {
                m33949c();
            }
        } catch (IOException e11) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error creating file in no backup dir: ");
                sb2.append(e11.getMessage());
            }
        }
    }

    /* renamed from: b */
    private String m33948b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* renamed from: c */
    public synchronized void m33949c() {
        this.f36700a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void m33950d(String str, String str2) {
        String m33948b = m33948b(str, str2);
        SharedPreferences.Editor edit = this.f36700a.edit();
        edit.remove(m33948b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized a m33951e(String str, String str2) {
        return a.m33955c(this.f36700a.getString(m33948b(str, str2), null));
    }

    /* renamed from: f */
    public synchronized boolean m33952f() {
        return this.f36700a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void m33953g(String str, String str2, String str3, String str4) {
        String m33954a = a.m33954a(str3, str4, System.currentTimeMillis());
        if (m33954a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f36700a.edit();
        edit.putString(m33948b(str, str2), m33954a);
        edit.commit();
    }
}
