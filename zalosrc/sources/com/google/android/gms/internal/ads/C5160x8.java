package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.ads.x8 */
/* loaded from: classes2.dex */
public class C5160x8 implements InterfaceC4566h8 {
    protected final C5234z8 zza;

    @Deprecated
    protected final AbstractC5122w8 zzb;
    private final AbstractC5122w8 zzc;

    public C5160x8(AbstractC5122w8 abstractC5122w8) {
        C5234z8 c5234z8 = new C5234z8(4096);
        this.zzc = abstractC5122w8;
        this.zzb = abstractC5122w8;
        this.zza = c5234z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x02c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02df  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4566h8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4639j8 zza(AbstractC4788n8 abstractC4788n8) {
        C4567h9 c4567h9;
        byte[] bArr;
        C4751m9 c4751m9;
        C4751m9 c4751m92;
        int zzb;
        String str;
        zzakm zzakmVar;
        String str2;
        Map map;
        byte[] bArr2;
        Object obj;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z11 = true;
            try {
                C5196y7 zzd = abstractC4788n8.zzd();
                if (zzd == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = zzd.f30821b;
                    if (str3 != null) {
                        hashMap.put("If-None-Match", str3);
                    }
                    long j11 = zzd.f30823d;
                    if (j11 > 0) {
                        hashMap.put("If-Modified-Since", AbstractC4530g9.m22304c(j11));
                    }
                    map = hashMap;
                }
                String zzk = abstractC4788n8.zzk();
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(map);
                hashMap2.putAll(abstractC4788n8.zzl());
                URL url = new URL(zzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int zzb2 = abstractC4788n8.zzb();
                httpURLConnection.setConnectTimeout(zzb2);
                httpURLConnection.setReadTimeout(zzb2);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str4 : hashMap2.keySet()) {
                        httpURLConnection.setRequestProperty(str4, (String) hashMap2.get(str4));
                    }
                    if (abstractC4788n8.zza() != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] zzx = abstractC4788n8.zzx();
                        if (zzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(zzx);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != -1) {
                        abstractC4788n8.zza();
                        if ((responseCode < 100 || responseCode >= 200) && responseCode != 204 && responseCode != 304) {
                            try {
                                c4567h9 = new C4567h9(responseCode, C4677k9.m23857a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C4604i9(httpURLConnection));
                            } catch (Throwable th2) {
                                th = th2;
                                if (!z11) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (IOException e11) {
                                        e = e11;
                                        c4567h9 = null;
                                        bArr = null;
                                        if (e instanceof SocketTimeoutException) {
                                        }
                                        c4751m92 = c4751m9;
                                        C4381c8 zzy = abstractC4788n8.zzy();
                                        zzb = abstractC4788n8.zzb();
                                        try {
                                            zzakmVar = c4751m92.f24432b;
                                            zzy.m20819c(zzakmVar);
                                            str2 = c4751m92.f24431a;
                                            abstractC4788n8.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                                        } catch (zzakm e12) {
                                            str = c4751m92.f24431a;
                                            abstractC4788n8.zzm(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzb)));
                                            throw e12;
                                        }
                                    }
                                }
                                throw th;
                                break;
                            }
                        } else {
                            c4567h9 = new C4567h9(responseCode, C4677k9.m23857a(httpURLConnection.getHeaderFields()), -1, null);
                            httpURLConnection.disconnect();
                        }
                        try {
                            int m22742b = c4567h9.m22742b();
                            List m22744d = c4567h9.m22744d();
                            if (m22742b == 304) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                C5196y7 zzd2 = abstractC4788n8.zzd();
                                if (zzd2 == null) {
                                    return new C4639j8(304, (byte[]) null, true, elapsedRealtime2, m22744d);
                                }
                                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                                if (!m22744d.isEmpty()) {
                                    Iterator it = m22744d.iterator();
                                    while (it.hasNext()) {
                                        treeSet.add(((C4529g8) it.next()).m22291a());
                                    }
                                }
                                ArrayList arrayList = new ArrayList(m22744d);
                                List list = zzd2.f30827h;
                                if (list != null) {
                                    if (!list.isEmpty()) {
                                        for (C4529g8 c4529g8 : zzd2.f30827h) {
                                            if (!treeSet.contains(c4529g8.m22291a())) {
                                                arrayList.add(c4529g8);
                                            }
                                        }
                                    }
                                } else if (!zzd2.f30826g.isEmpty()) {
                                    for (Map.Entry entry : zzd2.f30826g.entrySet()) {
                                        if (!treeSet.contains(entry.getKey())) {
                                            arrayList.add(new C4529g8((String) entry.getKey(), (String) entry.getValue()));
                                        }
                                    }
                                }
                                return new C4639j8(304, zzd2.f30820a, true, elapsedRealtime2, (List) arrayList);
                            }
                            InputStream m22743c = c4567h9.m22743c();
                            if (m22743c != null) {
                                int m22741a = c4567h9.m22741a();
                                try {
                                    C5234z8 c5234z8 = this.zza;
                                    C4789n9 c4789n9 = new C4789n9(c5234z8, m22741a);
                                    try {
                                        bArr3 = c5234z8.m28458b(1024);
                                        while (true) {
                                            try {
                                                int read = m22743c.read(bArr3);
                                                if (read == -1) {
                                                    break;
                                                }
                                                c4789n9.write(bArr3, 0, read);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    m22743c.close();
                                                } catch (IOException unused) {
                                                    AbstractC5048u8.m26869d("Error occurred when closing InputStream", new Object[0]);
                                                }
                                                c5234z8.m28457a(bArr3);
                                                c4789n9.close();
                                                throw th;
                                                break;
                                            }
                                        }
                                        bArr2 = c4789n9.toByteArray();
                                        try {
                                            m22743c.close();
                                        } catch (IOException unused2) {
                                            AbstractC5048u8.m26869d("Error occurred when closing InputStream", new Object[0]);
                                        }
                                        c5234z8.m28457a(bArr3);
                                        c4789n9.close();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bArr3 = null;
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                    }
                                    c4751m92 = c4751m9;
                                    C4381c8 zzy2 = abstractC4788n8.zzy();
                                    zzb = abstractC4788n8.zzb();
                                    zzakmVar = c4751m92.f24432b;
                                    zzy2.m20819c(zzakmVar);
                                    str2 = c4751m92.f24431a;
                                    abstractC4788n8.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                                }
                            } else {
                                bArr2 = new byte[0];
                            }
                            try {
                                long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                if (!AbstractC5048u8.f28785a) {
                                    if (elapsedRealtime3 > 3000) {
                                    }
                                    if (m22742b < 200 && m22742b <= 299) {
                                        return new C4639j8(m22742b, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, m22744d);
                                    }
                                    throw new IOException();
                                }
                                Object[] objArr = new Object[5];
                                objArr[0] = abstractC4788n8;
                                objArr[1] = Long.valueOf(elapsedRealtime3);
                                if (bArr2 != null) {
                                    obj = Integer.valueOf(bArr2.length);
                                } else {
                                    obj = "null";
                                }
                                objArr[2] = obj;
                                objArr[3] = Integer.valueOf(m22742b);
                                objArr[4] = Integer.valueOf(abstractC4788n8.zzy().m20817a());
                                AbstractC5048u8.m26866a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                                if (m22742b < 200) {
                                }
                                throw new IOException();
                            } catch (IOException e14) {
                                e = e14;
                                bArr = bArr2;
                                if (e instanceof SocketTimeoutException) {
                                    c4751m9 = new C4751m9("socket", new zzakl(), null);
                                } else if (!(e instanceof MalformedURLException)) {
                                    if (c4567h9 != null) {
                                        int m22742b2 = c4567h9.m22742b();
                                        AbstractC5048u8.m26867b("Unexpected response code %d for %s", Integer.valueOf(m22742b2), abstractC4788n8.zzk());
                                        if (bArr != null) {
                                            C4639j8 c4639j8 = new C4639j8(m22742b2, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, c4567h9.m22744d());
                                            if (m22742b2 != 401 && m22742b2 != 403) {
                                                if (m22742b2 >= 400 && m22742b2 <= 499) {
                                                    throw new zzajq(c4639j8);
                                                }
                                                throw new zzakk(c4639j8);
                                            }
                                            c4751m9 = new C4751m9("auth", new zzajl(c4639j8), null);
                                        } else {
                                            c4751m9 = new C4751m9("network", new zzajy(), null);
                                        }
                                    } else {
                                        throw new zzaka(e);
                                    }
                                } else {
                                    throw new RuntimeException("Bad URL ".concat(String.valueOf(abstractC4788n8.zzk())), e);
                                }
                                c4751m92 = c4751m9;
                                C4381c8 zzy22 = abstractC4788n8.zzy();
                                zzb = abstractC4788n8.zzb();
                                zzakmVar = c4751m92.f24432b;
                                zzy22.m20819c(zzakmVar);
                                str2 = c4751m92.f24431a;
                                abstractC4788n8.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                            }
                        } catch (IOException e15) {
                            e = e15;
                        }
                    } else {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                            break;
                        } catch (Throwable th5) {
                            th = th5;
                            z11 = false;
                            if (!z11) {
                            }
                            throw th;
                            break;
                            break;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (IOException e16) {
                e = e16;
            }
            str2 = c4751m92.f24431a;
            abstractC4788n8.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
        }
    }
}
