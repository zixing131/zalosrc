package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p229i5.AbstractC20291l;

/* loaded from: classes2.dex */
public final class l02 implements ju2 {

    /* renamed from: a */
    protected final Context f23665a;

    /* renamed from: b */
    protected final String f23666b;

    /* renamed from: c */
    protected final yf0 f23667c;

    public l02(Context context, String str, yf0 yf0Var, int i11, byte[] bArr) {
        this.f23665a = context;
        this.f23666b = str;
        this.f23667c = yf0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fd, code lost:            com.google.android.gms.internal.ads.yk0.zzj("Received error HTTP response code: " + r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0223, code lost:            throw new com.google.android.gms.internal.ads.zzebh(1, "Received error HTTP response code: " + r6);     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x023c A[Catch: all -> 0x009f, TryCatch #12 {all -> 0x009f, blocks: (B:16:0x0099, B:19:0x022a, B:21:0x023c, B:25:0x024a, B:31:0x00b0, B:33:0x00b8, B:34:0x00bd, B:36:0x00c1, B:41:0x00d3, B:45:0x00db, B:46:0x00de, B:50:0x00df, B:51:0x00f7, B:53:0x00fd, B:60:0x0115, B:56:0x011f, B:63:0x0129, B:66:0x012e, B:79:0x0167, B:81:0x0175, B:84:0x0188, B:85:0x018e, B:86:0x0192, B:90:0x01a7, B:91:0x01aa, B:99:0x01b2, B:101:0x01be, B:110:0x01e3, B:111:0x01ef, B:113:0x01f0, B:114:0x01fc, B:116:0x01fd, B:117:0x0223), top: B:15:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x024a A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #12 {all -> 0x009f, blocks: (B:16:0x0099, B:19:0x022a, B:21:0x023c, B:25:0x024a, B:31:0x00b0, B:33:0x00b8, B:34:0x00bd, B:36:0x00c1, B:41:0x00d3, B:45:0x00db, B:46:0x00de, B:50:0x00df, B:51:0x00f7, B:53:0x00fd, B:60:0x0115, B:56:0x011f, B:63:0x0129, B:66:0x012e, B:79:0x0167, B:81:0x0175, B:84:0x0188, B:85:0x018e, B:86:0x0192, B:90:0x01a7, B:91:0x01aa, B:99:0x01b2, B:101:0x01be, B:110:0x01e3, B:111:0x01ef, B:113:0x01f0, B:114:0x01fc, B:116:0x01fd, B:117:0x0223), top: B:15:0x0099 }] */
    @Override // com.google.android.gms.internal.ads.ju2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k02 zza(j02 j02Var) {
        int i11;
        k02 k02Var;
        xk0 xk0Var;
        int responseCode;
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        l02 l02Var = this;
        String str = j02Var.f22584a;
        int i12 = j02Var.f22585b;
        Map map = j02Var.f22586c;
        byte[] bArr = j02Var.f22587d;
        String str2 = j02Var.f22588e;
        long mo105914b = zzt.zzB().mo105914b();
        try {
            k02 k02Var2 = new k02();
            yk0.zzi("SDK version: " + l02Var.f23666b);
            yk0.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            int i13 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    zzs zzp = zzt.zzp();
                    Context context = l02Var.f23665a;
                    String str3 = l02Var.f23666b;
                    HttpURLConnection httpURLConnection2 = httpURLConnection;
                    k02 k02Var3 = k02Var2;
                    i11 = 1;
                    try {
                        zzp.zze(context, str3, false, httpURLConnection2, false, i12);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection = httpURLConnection2;
                            try {
                                try {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    httpURLConnection2 = httpURLConnection;
                                } catch (Throwable th2) {
                                    th = th2;
                                    httpURLConnection.disconnect();
                                    throw th;
                                }
                            } catch (zzebh e11) {
                                e = e11;
                                k02Var = k02Var3;
                                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21254g7)).booleanValue()) {
                                    k02Var.f23047d = zzt.zzB().mo105914b() - mo105914b;
                                    httpURLConnection.disconnect();
                                    return k02Var;
                                }
                                throw e;
                            }
                        }
                        httpURLConnection = httpURLConnection2;
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        int length = bArr.length;
                        BufferedOutputStream bufferedOutputStream2 = null;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            try {
                                bufferedOutputStream.write(bArr);
                                AbstractC20291l.m105939a(bufferedOutputStream);
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream2 = bufferedOutputStream;
                                AbstractC20291l.m105939a(bufferedOutputStream2);
                                throw th;
                            }
                        }
                        xk0Var = new xk0(null);
                        xk0Var.m27911c(httpURLConnection, bArr);
                        responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (hashMap.containsKey(key)) {
                                ((List) hashMap.get(key)).addAll(value);
                            } else {
                                hashMap.put(key, new ArrayList(value));
                            }
                        }
                        xk0Var.m27913e(httpURLConnection, responseCode);
                        k02Var = k02Var3;
                    } catch (zzebh e12) {
                        e = e12;
                        httpURLConnection = httpURLConnection2;
                    } catch (Throwable th5) {
                        th = th5;
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (zzebh e13) {
                    e = e13;
                    k02Var = k02Var2;
                } catch (Throwable th6) {
                    th = th6;
                }
                try {
                    k02Var.f23044a = responseCode;
                    k02Var.f23045b = hashMap;
                    k02Var.f23046c = "";
                    if (responseCode >= 200 && responseCode < 300) {
                        try {
                            inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                        } catch (Throwable th7) {
                            th = th7;
                            inputStreamReader = null;
                        }
                        try {
                            zzt.zzp();
                            StringBuilder sb2 = new StringBuilder(8192);
                            char[] cArr = new char[ZVideoUtilMetadata.FF_PROFILE_H264_INTRA];
                            while (true) {
                                int read = inputStreamReader.read(cArr);
                                if (read == -1) {
                                    break;
                                }
                                sb2.append(cArr, 0, read);
                            }
                            String sb3 = sb2.toString();
                            AbstractC20291l.m105939a(inputStreamReader);
                            xk0Var.m27915g(sb3);
                            k02Var.f23046c = sb3;
                            if (TextUtils.isEmpty(sb3)) {
                                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20956C4)).booleanValue()) {
                                    throw new zzebh(3);
                                }
                            }
                            k02Var.f23047d = zzt.zzB().mo105914b() - mo105914b;
                        } catch (Throwable th8) {
                            th = th8;
                            AbstractC20291l.m105939a(inputStreamReader);
                            throw th;
                        }
                    } else {
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            URL url2 = new URL(headerField);
                            int i14 = i13 + 1;
                            if (i14 <= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21241f4)).intValue()) {
                                try {
                                    httpURLConnection.disconnect();
                                    l02Var = this;
                                    i13 = i14;
                                    k02Var2 = k02Var;
                                    url = url2;
                                } catch (IOException e14) {
                                    e = e14;
                                    String concat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                    yk0.zzj(concat);
                                    throw new zzebh(i11, concat, e);
                                }
                            } else {
                                yk0.zzj("Too many redirects.");
                                throw new zzebh(1, "Too many redirects");
                            }
                        } else {
                            yk0.zzj("No location header to follow redirect.");
                            throw new zzebh(1, "No location header to follow redirect");
                        }
                    }
                } catch (zzebh e15) {
                    e = e15;
                    if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21254g7)).booleanValue()) {
                    }
                }
            }
        } catch (IOException e16) {
            e = e16;
            i11 = 1;
        }
    }
}
