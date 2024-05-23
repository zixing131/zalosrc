package com.zing.zalo.location;

import ag0.AbstractC0837p0;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import me0.AbstractC23138m0;
import org.json.JSONArray;
import p087d0.C17686c;
import p348mi.AbstractC23309i;

/* renamed from: com.zing.zalo.location.z */
/* loaded from: classes4.dex */
public abstract class AbstractC8998z {

    /* renamed from: a */
    private static long f48159a;

    /* renamed from: b */
    private static volatile Set f48160b;

    /* renamed from: a */
    private static void m48094a() {
        if (f48160b != null) {
            return;
        }
        try {
            synchronized (AbstractC8998z.class) {
                try {
                    if (f48160b != null) {
                        return;
                    }
                    f48160b = new HashSet();
                    String m122493v5 = AbstractC23309i.m122493v5();
                    AbstractC20110a.m104535d("init mWifiConfiguredNetworksSet %s", m122493v5);
                    if (TextUtils.isEmpty(m122493v5)) {
                        WifiManager wifiManager = (WifiManager) CoreUtility.getAppContext().getApplicationContext().getSystemService("wifi");
                        if (wifiManager == null) {
                            return;
                        }
                        if (!C8937j0.m47663l("wifi_get_saved_networks_on_connectivity_change")) {
                            return;
                        }
                        List<WifiConfiguration> m93677d = new C17686c(wifiManager, new SensitiveData("wifi_get_saved_networks_on_connectivity_change", "join_wifi")).m93677d();
                        if (m93677d != null && m93677d.size() != 0) {
                            for (WifiConfiguration wifiConfiguration : m93677d) {
                                if (!TextUtils.isEmpty(wifiConfiguration.SSID)) {
                                    f48160b.add(wifiConfiguration.SSID);
                                }
                            }
                            AbstractC0837p0.m2225f().mo2040a(new RunnableC8997y());
                        }
                        return;
                    }
                    JSONArray jSONArray = new JSONArray(m122493v5);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        String string = jSONArray.getString(i11);
                        if (!TextUtils.isEmpty(string)) {
                            f48160b.add(string);
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public static void m48095b() {
        WifiInfo m93678e;
        WifiManager wifiManager = (WifiManager) CoreUtility.getAppContext().getApplicationContext().getSystemService("wifi");
        if (wifiManager != null && C8937j0.m47663l("wifi_get_connection_info_on_connectivity_change") && (m93678e = new C17686c(wifiManager, new SensitiveData("wifi_get_connection_info_on_connectivity_change", "join_wifi")).m93678e()) != null && !TextUtils.isEmpty(m93678e.getSSID()) && !TextUtils.isEmpty(m93678e.getBSSID())) {
            m48094a();
            if (!f48160b.contains(m93678e.getSSID())) {
                f48160b.add(m93678e.getSSID());
                AbstractC0837p0.m2225f().mo2040a(new RunnableC8997y());
                AbstractC20110a.m104535d("checkJoinNewWifiNetwork: force submit - %s - %s", m93678e.getSSID(), m93678e.getBSSID());
                f48159a = System.currentTimeMillis();
                AbstractC23309i.m121214Mx(EnumC8996x.JOIN_NEW_WIFI);
                AbstractC23309i.m121393Rr(0L);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* renamed from: c */
    public static void m48096c() {
        boolean z11;
        ?? r32;
        AbstractC20110a.m104535d("checkSubmitEventAirplaneMode", new Object[0]);
        try {
            if (!AbstractC23138m0.m118770b()) {
                return;
            }
            if (AbstractC23309i.m120927F5() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (Settings.System.getInt(CoreUtility.getAppContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
                r32 = 1;
            } else {
                r32 = 0;
            }
            if (z11 != r32) {
                AbstractC23309i.m121801cq(r32);
                if (Math.abs(System.currentTimeMillis() - f48159a) < 300000) {
                    return;
                }
                AbstractC20110a.m104535d("AirplaneMode change %b -> %b", Boolean.valueOf(z11), Boolean.valueOf((boolean) r32));
                f48159a = System.currentTimeMillis();
                AbstractC23309i.m121214Mx(EnumC8996x.AIRPLANE_MODE);
                AbstractC23309i.m121393Rr(0L);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m48097d() {
        try {
            synchronized (AbstractC8998z.class) {
                try {
                    if (f48160b == null) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (String str : f48160b) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(str);
                        }
                    }
                    AbstractC20110a.m104535d("save mWifiConfiguredNetworksSet %s", jSONArray.toString());
                    AbstractC23309i.m121428Sp(jSONArray.toString());
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
