package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p667y2.C30268e;

/* renamed from: com.google.android.gms.internal.ads.lx */
/* loaded from: classes2.dex */
public final class C4738lx {

    /* renamed from: d */
    String f24268d;

    /* renamed from: e */
    Context f24269e;

    /* renamed from: f */
    String f24270f;

    /* renamed from: h */
    private AtomicBoolean f24272h;

    /* renamed from: i */
    private File f24273i;

    /* renamed from: a */
    final BlockingQueue f24265a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    final LinkedHashMap f24266b = new LinkedHashMap();

    /* renamed from: c */
    final Map f24267c = new HashMap();

    /* renamed from: g */
    private final HashSet f24271g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    /* renamed from: c */
    public static /* synthetic */ void m24393c(C4738lx c4738lx) {
        while (true) {
            try {
                C5110vx c5110vx = (C5110vx) c4738lx.f24265a.take();
                C5073ux m27423a = c5110vx.m27423a();
                if (!TextUtils.isEmpty(m27423a.m27083b())) {
                    c4738lx.m24394g(c4738lx.m24396b(c4738lx.f24266b, c5110vx.m27424b()), m27423a);
                }
            } catch (InterruptedException e11) {
                yk0.zzk("CsiReporter:reporter interrupted", e11);
                return;
            }
        }
    }

    /* renamed from: g */
    private final void m24394g(Map map, C5073ux c5073ux) {
        Uri.Builder buildUpon = Uri.parse(this.f24268d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (c5073ux != null) {
            StringBuilder sb2 = new StringBuilder(uri);
            if (!TextUtils.isEmpty(c5073ux.m27083b())) {
                sb2.append("&it=");
                sb2.append(c5073ux.m27083b());
            }
            if (!TextUtils.isEmpty(c5073ux.m27082a())) {
                sb2.append("&blat=");
                sb2.append(c5073ux.m27082a());
            }
            uri = sb2.toString();
        }
        if (this.f24272h.get()) {
            File file = this.f24273i;
            if (file != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                        try {
                            fileOutputStream2.write(uri.getBytes());
                            fileOutputStream2.write(10);
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e11) {
                                yk0.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                            }
                        } catch (IOException e12) {
                            e = e12;
                            fileOutputStream = fileOutputStream2;
                            yk0.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e13) {
                                    yk0.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e14) {
                                    yk0.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e14);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e15) {
                    e = e15;
                }
            } else {
                yk0.zzj("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            }
        } else {
            zzt.zzp();
            zzs.zzH(this.f24269e, this.f24270f, uri);
        }
    }

    /* renamed from: a */
    public final AbstractC4962rx m24395a(String str) {
        AbstractC4962rx abstractC4962rx = (AbstractC4962rx) this.f24267c.get(str);
        if (abstractC4962rx != null) {
            return abstractC4962rx;
        }
        return AbstractC4962rx.f27398a;
    }

    /* renamed from: b */
    final Map m24396b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, m24395a(str).mo25351a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public final void m24397d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f24269e = context;
        this.f24270f = str;
        this.f24268d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f24272h = atomicBoolean;
        atomicBoolean.set(((Boolean) AbstractC5037ty.f28653c.m24091e()).booleanValue());
        if (this.f24272h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f24273i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f24266b.put((String) entry.getKey(), (String) entry.getValue());
        }
        kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kx
            public /* synthetic */ RunnableC4701kx() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C4738lx.m24393c(C4738lx.this);
            }
        });
        Map map2 = this.f24267c;
        AbstractC4962rx abstractC4962rx = AbstractC4962rx.f27399b;
        map2.put("action", abstractC4962rx);
        this.f24267c.put("ad_format", abstractC4962rx);
        this.f24267c.put(C30268e.f140632a, AbstractC4962rx.f27400c);
    }

    /* renamed from: e */
    public final void m24398e(String str) {
        if (this.f24271g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f24270f);
        linkedHashMap.put("ue", str);
        m24394g(m24396b(this.f24266b, linkedHashMap), null);
    }

    /* renamed from: f */
    public final boolean m24399f(C5110vx c5110vx) {
        return this.f24265a.offer(c5110vx);
    }
}
