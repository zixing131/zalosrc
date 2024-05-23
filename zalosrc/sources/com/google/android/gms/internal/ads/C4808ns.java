package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ns */
/* loaded from: classes2.dex */
public final class C4808ns {

    /* renamed from: a */
    private final C5031ts f25314a;

    /* renamed from: b */
    private final C4514fu f25315b;

    /* renamed from: c */
    private final boolean f25316c;

    private C4808ns() {
        this.f25315b = C4551gu.m22524H();
        this.f25316c = false;
        this.f25314a = new C5031ts();
    }

    /* renamed from: a */
    public static C4808ns m24989a() {
        return new C4808ns();
    }

    /* renamed from: d */
    private final synchronized String m24990d(int i11) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f25315b.m22171B(), Long.valueOf(zzt.zzB().mo105914b()), Integer.valueOf(i11 - 1), Base64.encodeToString(((C4551gu) this.f25315b.m25898n()).mo27346a(), 3));
    }

    /* renamed from: e */
    private final synchronized void m24991e(int i11) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(m24990d(i11).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                    throw th2;
                }
            } catch (IOException unused3) {
                zze.zza("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused5) {
            zze.zza("Could not find file for Clearcut");
        }
    }

    /* renamed from: f */
    private final synchronized void m24992f(int i11) {
        C4514fu c4514fu = this.f25315b;
        c4514fu.m22175u();
        List m22621b = AbstractC4554gx.m22621b();
        ArrayList arrayList = new ArrayList();
        Iterator it = m22621b.iterator();
        while (it.hasNext()) {
            for (String str : ((String) it.next()).split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        c4514fu.m22174s(arrayList);
        C4994ss c4994ss = new C4994ss(this.f25314a, ((C4551gu) this.f25315b.m25898n()).mo27346a(), null);
        int i12 = i11 - 1;
        c4994ss.m26394a(i12);
        c4994ss.m26395c();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i12, 10))));
    }

    /* renamed from: b */
    public final synchronized void m24993b(InterfaceC4771ms interfaceC4771ms) {
        if (this.f25316c) {
            try {
                interfaceC4771ms.mo20788a(this.f25315b);
            } catch (NullPointerException e11) {
                zzt.zzo().m22945t(e11, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m24994c(int i11) {
        if (!this.f25316c) {
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21201b4)).booleanValue()) {
            m24991e(i11);
        } else {
            m24992f(i11);
        }
    }

    public C4808ns(C5031ts c5031ts) {
        this.f25315b = C4551gu.m22524H();
        this.f25314a = c5031ts;
        this.f25316c = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21191a4)).booleanValue();
    }
}
