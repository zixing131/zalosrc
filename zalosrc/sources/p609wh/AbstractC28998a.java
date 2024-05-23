package p609wh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import th.AbstractC26684e;

/* renamed from: wh.a */
/* loaded from: classes3.dex */
public abstract class AbstractC28998a {
    /* renamed from: a */
    public static String m144872a() {
        String str;
        if (TextUtils.isEmpty(AbstractC26684e.f126411d)) {
            str = "http://connectivitycheck.gstatic.com/generate_204";
        } else {
            str = AbstractC26684e.f126411d;
        }
        return m144873b(str);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x009a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:155), block:B:43:0x009a */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #2 {all -> 0x0099, blocks: (B:6:0x0022, B:9:0x0034, B:12:0x0044, B:17:0x0065, B:21:0x0075, B:23:0x007d, B:26:0x009e, B:33:0x00b6, B:35:0x00c7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m144873b(String str) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        long j11;
        URL url;
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Checking ");
        sb2.append(str);
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                url = new URL(str);
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                z11 = false;
            } catch (IOException e11) {
                e = e11;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection3 != null) {
                }
                throw th;
            }
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setConnectTimeout(750);
                httpURLConnection.setReadTimeout(750);
                httpURLConnection.setUseCaches(false);
                j11 = SystemClock.elapsedRealtime();
                try {
                    httpURLConnection.getInputStream();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 204) {
                        z11 = true;
                    }
                    m144878g(true, z11, j11, elapsedRealtime);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("isCaptivePortal: ret=");
                    sb3.append(z11);
                    sb3.append(" rspCode=");
                    sb3.append(responseCode);
                    if (!z11) {
                        httpURLConnection.disconnect();
                        return null;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        httpURLConnection.disconnect();
                        return str;
                    }
                    if (headerField.startsWith("/")) {
                        String str2 = "http://" + url.getHost() + headerField;
                        httpURLConnection.disconnect();
                        return str2;
                    }
                    if (headerField.startsWith("http")) {
                        httpURLConnection.disconnect();
                        return headerField;
                    }
                    httpURLConnection.disconnect();
                    return str;
                } catch (IOException e12) {
                    e = e12;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Probably not a portal: exception ");
                    sb4.append(e);
                    if (j11 != -1) {
                    }
                    if (httpURLConnection != null) {
                    }
                    return null;
                }
            } catch (IOException e13) {
                e = e13;
                j11 = -1;
                StringBuilder sb42 = new StringBuilder();
                sb42.append("Probably not a portal: exception ");
                sb42.append(e);
                if (j11 != -1) {
                    m144877f(j11);
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection3 = httpURLConnection2;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m144874c(String str) {
        IOException e11;
        HttpURLConnection httpURLConnection;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Checking ");
        sb2.append(str);
        HttpURLConnection httpURLConnection2 = null;
        boolean z11 = true;
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        } catch (IOException e12) {
            e11 = e12;
            httpURLConnection = null;
        } catch (Throwable unused) {
            if (httpURLConnection2 != null) {
            }
            return true;
        }
        try {
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setConnectTimeout(750);
                httpURLConnection.setReadTimeout(750);
                httpURLConnection.setUseCaches(false);
                SystemClock.elapsedRealtime();
                httpURLConnection.getInputStream();
                SystemClock.elapsedRealtime();
                if (httpURLConnection.getResponseCode() != 204) {
                    z11 = false;
                }
                httpURLConnection.disconnect();
                return z11;
            } catch (Throwable unused2) {
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return true;
            }
        } catch (IOException e13) {
            e11 = e13;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Probably not a portal: exception ");
            sb3.append(e11);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m144875d() {
        String str;
        if (TextUtils.isEmpty(AbstractC26684e.f126411d)) {
            str = "http://connectivitycheck.gstatic.com/generate_204";
        } else {
            str = AbstractC26684e.f126411d;
        }
        return m144874c(str);
    }

    /* renamed from: e */
    public static void m144876e(Context context) {
        String str;
        try {
            if (TextUtils.isEmpty(AbstractC26684e.f126411d)) {
                str = "http://connectivitycheck.gstatic.com/generate_204";
            } else {
                str = AbstractC26684e.f126411d;
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f */
    private static void m144877f(long j11) {
        m144878g(false, false, j11, 0L);
    }

    /* renamed from: g */
    private static void m144878g(boolean z11, boolean z12, long j11, long j12) {
    }
}
