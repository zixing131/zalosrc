package me0;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: me0.j1 */
/* loaded from: classes4.dex */
public abstract class AbstractC23106j1 {
    /* renamed from: a */
    public static JSONObject m118481a() {
        String[] strArr;
        String[] strArr2;
        int[] iArr;
        int[] iArr2;
        try {
            PackageManager packageManager = CoreUtility.getAppContext().getPackageManager();
            ApplicationInfo applicationInfo = CoreUtility.getAppContext().getApplicationInfo();
            PackageInfo packageInfo = packageManager.getPackageInfo(applicationInfo.packageName, 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", packageManager.getApplicationLabel(applicationInfo));
            jSONObject.put("pkg", applicationInfo.packageName);
            if (Build.VERSION.SDK_INT >= 26) {
                strArr = applicationInfo.splitNames;
                if (strArr != null) {
                    strArr2 = applicationInfo.splitNames;
                    jSONObject.put("splitNames", new JSONArray(strArr2));
                    iArr = packageInfo.splitRevisionCodes;
                    if (iArr != null) {
                        iArr2 = packageInfo.splitRevisionCodes;
                        jSONObject.put("splitRevisionCodes", new JSONArray(iArr2));
                    }
                }
            }
            jSONObject.put("verC", packageInfo.versionCode);
            jSONObject.put("verN", packageInfo.versionName);
            jSONObject.put("install", packageInfo.firstInstallTime);
            jSONObject.put("update", packageInfo.lastUpdateTime);
            jSONObject.put("installLocation", packageInfo.installLocation);
            jSONObject.put("sharedUserId", packageInfo.sharedUserId);
            return jSONObject;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m118482b(Cursor cursor) {
        String str;
        String[] columnNames = cursor.getColumnNames();
        JSONObject jSONObject = new JSONObject();
        int length = columnNames.length;
        for (int i11 = 0; i11 < length; i11++) {
            try {
                str = cursor.getString(i11);
            } catch (SQLiteException unused) {
                str = "<unprintable>";
            }
            try {
                jSONObject.put(columnNames[i11], str);
            } catch (JSONException unused2) {
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static JSONArray m118483c(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                jSONArray.put(m118482b(cursor));
            }
            cursor.moveToPosition(position);
        }
        return jSONArray;
    }

    /* renamed from: d */
    public static JSONObject m118484d() {
        List notificationChannels;
        String id2;
        CharSequence name;
        boolean canBypassDnd;
        boolean canShowBadge;
        int importance;
        int lightColor;
        int lockscreenVisibility;
        Uri sound;
        long[] vibrationPattern;
        JSONArray jSONArray;
        boolean shouldShowLights;
        boolean shouldVibrate;
        long[] vibrationPattern2;
        boolean areNotificationsEnabled;
        int importance2;
        int currentInterruptionFilter;
        try {
            AudioManager audioManager = (AudioManager) CoreUtility.getAppContext().getSystemService("audio");
            NotificationManager notificationManager = (NotificationManager) CoreUtility.getAppContext().getSystemService("notification");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ringerMode", audioManager.getRingerMode());
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23) {
                currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                jSONObject.put("interruptionFilter", currentInterruptionFilter);
            }
            if (i11 >= 24) {
                areNotificationsEnabled = notificationManager.areNotificationsEnabled();
                jSONObject.put("areNotificationsEnabled", areNotificationsEnabled);
                importance2 = notificationManager.getImportance();
                jSONObject.put("notificationImportance", importance2);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("voice_call", audioManager.getStreamVolume(0));
            jSONObject2.put("system", audioManager.getStreamVolume(1));
            jSONObject2.put("ring", audioManager.getStreamVolume(2));
            jSONObject2.put("music", audioManager.getStreamVolume(3));
            jSONObject2.put("alarm", audioManager.getStreamVolume(4));
            jSONObject2.put("notification", audioManager.getStreamVolume(5));
            if (i11 >= 26) {
                jSONObject2.put("accessibility", audioManager.getStreamVolume(10));
            }
            jSONObject.put("volume", jSONObject2);
            if (i11 >= 26) {
                JSONArray jSONArray2 = new JSONArray();
                notificationChannels = notificationManager.getNotificationChannels();
                Iterator it = notificationChannels.iterator();
                while (it.hasNext()) {
                    NotificationChannel m118474a = AbstractC23095i1.m118474a(it.next());
                    JSONObject jSONObject3 = new JSONObject();
                    id2 = m118474a.getId();
                    jSONObject3.put("id", id2);
                    name = m118474a.getName();
                    jSONObject3.put("name", name);
                    canBypassDnd = m118474a.canBypassDnd();
                    jSONObject3.put("canBypassDnd", canBypassDnd);
                    canShowBadge = m118474a.canShowBadge();
                    jSONObject3.put("canShowBadge", canShowBadge);
                    importance = m118474a.getImportance();
                    jSONObject3.put("importance", importance);
                    lightColor = m118474a.getLightColor();
                    jSONObject3.put("lightColor", lightColor);
                    lockscreenVisibility = m118474a.getLockscreenVisibility();
                    jSONObject3.put("lockscreenVisibility", lockscreenVisibility);
                    sound = m118474a.getSound();
                    if (sound != null && "content".equals(sound.getScheme())) {
                        jSONObject3.put("sound_info", m118485e(sound));
                    } else {
                        jSONObject3.put("sound", sound + "");
                    }
                    vibrationPattern = m118474a.getVibrationPattern();
                    if (vibrationPattern != null) {
                        vibrationPattern2 = m118474a.getVibrationPattern();
                        jSONArray = new JSONArray((Collection) Collections.singletonList(vibrationPattern2));
                    } else {
                        jSONArray = null;
                    }
                    jSONObject3.put("vibrationPattern", jSONArray);
                    shouldShowLights = m118474a.shouldShowLights();
                    jSONObject3.put("shouldShowLights", shouldShowLights);
                    shouldVibrate = m118474a.shouldVibrate();
                    jSONObject3.put("shouldVibrate", shouldVibrate);
                    jSONArray2.put(jSONObject3);
                }
                jSONObject.put("channels", jSONArray2);
            }
            return jSONObject;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: e */
    public static JSONObject m118485e(Uri uri) {
        try {
            return m118486f(uri, 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static JSONObject m118486f(Uri uri, int i11) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uri", uri + "");
        Cursor query = CoreUtility.getAppContext().getContentResolver().query(uri, null, null, null, null);
        JSONArray m118483c = m118483c(query);
        if (query != null) {
            query.close();
        }
        jSONObject.put("data", m118483c);
        if (i11 > 3) {
            return jSONObject;
        }
        if (m118483c != null && m118483c.length() > 0) {
            for (int i12 = 0; i12 < m118483c.length(); i12++) {
                JSONObject optJSONObject = m118483c.optJSONObject(i12);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("value");
                    if (TextUtils.isEmpty(optString)) {
                        optString = optJSONObject.optString("_data");
                    }
                    if (!TextUtils.isEmpty(optString)) {
                        if (optString.startsWith("content:")) {
                            try {
                                optJSONObject.put("child", m118486f(Uri.parse(optString), i11 + 1));
                            } catch (JSONException unused) {
                            }
                        } else if (optString.startsWith("file:") || optString.startsWith("/")) {
                            optJSONObject.put("file_exist", new File(optString).exists());
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
