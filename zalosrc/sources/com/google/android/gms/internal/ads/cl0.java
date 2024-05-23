package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import com.google.android.gms.ads.internal.client.zzaw;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p229i5.AbstractC20284e;

/* loaded from: classes2.dex */
public class cl0 implements qk0 {

    /* renamed from: a */
    private final String f18475a;

    public cl0(String str) {
        this.f18475a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    @Override // com.google.android.gms.internal.ads.qk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean zza(String str) {
        HttpURLConnection httpURLConnection;
        boolean z11 = false;
        try {
            try {
                if (AbstractC20284e.m105912a()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                yk0.zze("Pinging URL: " + str);
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (IOException e11) {
                e = e11;
                yk0.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
                if (AbstractC20284e.m105912a()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            } catch (IndexOutOfBoundsException e12) {
                yk0.zzj("Error while parsing ping URL: " + str + ". " + e12.getMessage());
                if (AbstractC20284e.m105912a()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            } catch (RuntimeException e13) {
                e = e13;
                yk0.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
                if (AbstractC20284e.m105912a()) {
                }
            }
            try {
                zzaw.zzb();
                String str2 = this.f18475a;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                xk0 xk0Var = new xk0(null);
                xk0Var.m27911c(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                xk0Var.m27913e(httpURLConnection, responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    z11 = true;
                    if (AbstractC20284e.m105912a()) {
                        TrafficStats.clearThreadStatsTag();
                        return z11;
                    }
                    return z11;
                }
                yk0.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                if (AbstractC20284e.m105912a()) {
                }
                return z11;
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th2) {
            if (AbstractC20284e.m105912a()) {
                TrafficStats.clearThreadStatsTag();
            }
            throw th2;
        }
    }
}
