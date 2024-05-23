package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class ik0 {

    /* renamed from: g */
    final String f22200g;

    /* renamed from: h */
    private final zzg f22201h;

    /* renamed from: a */
    long f22194a = -1;

    /* renamed from: b */
    long f22195b = -1;

    /* renamed from: c */
    int f22196c = -1;

    /* renamed from: d */
    int f22197d = -1;

    /* renamed from: e */
    long f22198e = 0;

    /* renamed from: f */
    private final Object f22199f = new Object();

    /* renamed from: i */
    int f22202i = 0;

    /* renamed from: j */
    int f22203j = 0;

    public ik0(String str, zzg zzgVar) {
        this.f22200g = str;
        this.f22201h = zzgVar;
    }

    /* renamed from: g */
    private final void m23278g() {
        if (((Boolean) AbstractC4482ez.f19860a.m24091e()).booleanValue()) {
            synchronized (this.f22199f) {
                this.f22196c--;
                this.f22197d--;
            }
        }
    }

    /* renamed from: a */
    public final Bundle m23279a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f22199f) {
            try {
                bundle = new Bundle();
                if (!this.f22201h.zzP()) {
                    bundle.putString("session_id", this.f22200g);
                }
                bundle.putLong("basets", this.f22195b);
                bundle.putLong("currts", this.f22194a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f22196c);
                bundle.putInt("preqs_in_session", this.f22197d);
                bundle.putLong("time_in_session", this.f22198e);
                bundle.putInt("pclick", this.f22202i);
                bundle.putInt("pimp", this.f22203j);
                Context m20113a = ag0.m20113a(context);
                int identifier = m20113a.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z11 = false;
                if (identifier == 0) {
                    yk0.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == m20113a.getPackageManager().getActivityInfo(new ComponentName(m20113a.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z11 = true;
                        } else {
                            yk0.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        yk0.zzj("Fail to fetch AdActivity theme");
                        yk0.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public final void m23280b() {
        synchronized (this.f22199f) {
            this.f22202i++;
        }
    }

    /* renamed from: c */
    public final void m23281c() {
        synchronized (this.f22199f) {
            this.f22203j++;
        }
    }

    /* renamed from: d */
    public final void m23282d() {
        m23278g();
    }

    /* renamed from: e */
    public final void m23283e() {
        m23278g();
    }

    /* renamed from: f */
    public final void m23284f(zzl zzlVar, long j11) {
        synchronized (this.f22199f) {
            try {
                long zzd = this.f22201h.zzd();
                long mo105913a = zzt.zzB().mo105913a();
                if (this.f22195b == -1) {
                    if (mo105913a - zzd > ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21062N0)).longValue()) {
                        this.f22197d = -1;
                    } else {
                        this.f22197d = this.f22201h.zzc();
                    }
                    this.f22195b = j11;
                    this.f22194a = j11;
                } else {
                    this.f22194a = j11;
                }
                Bundle bundle = zzlVar.zzc;
                if (bundle != null && bundle.getInt("gw", 2) == 1) {
                    return;
                }
                this.f22196c++;
                int i11 = this.f22197d + 1;
                this.f22197d = i11;
                if (i11 == 0) {
                    this.f22198e = 0L;
                    this.f22201h.zzD(mo105913a);
                } else {
                    this.f22198e = mo105913a - this.f22201h.zze();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
