package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.n8 */
/* loaded from: classes2.dex */
public abstract class AbstractC4788n8 implements Comparable {
    private final C5011t8 zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final InterfaceC4862p8 zzf;
    private Integer zzg;
    private C4825o8 zzh;
    private boolean zzi;
    private C5196y7 zzj;
    private InterfaceC4750m8 zzk;
    private final C4381c8 zzl;

    public AbstractC4788n8(int i11, String str, InterfaceC4862p8 interfaceC4862p8) {
        C5011t8 c5011t8;
        Uri parse;
        String host;
        if (C5011t8.f28254c) {
            c5011t8 = new C5011t8();
        } else {
            c5011t8 = null;
        }
        this.zza = c5011t8;
        this.zze = new Object();
        int i12 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i11;
        this.zzc = str;
        this.zzf = interfaceC4862p8;
        this.zzl = new C4381c8();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i12 = host.hashCode();
        }
        this.zzd = i12;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((AbstractC4788n8) obj).zzg.intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.zzd);
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(String.valueOf(hexString)) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.m20818b();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final C5196y7 zzd() {
        return this.zzj;
    }

    public final AbstractC4788n8 zze(C5196y7 c5196y7) {
        this.zzj = c5196y7;
        return this;
    }

    public final AbstractC4788n8 zzf(C4825o8 c4825o8) {
        this.zzh = c4825o8;
        return this;
    }

    public final AbstractC4788n8 zzg(int i11) {
        this.zzg = Integer.valueOf(i11);
        return this;
    }

    public abstract C4937r8 zzh(C4639j8 c4639j8);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb != 0) {
            return Integer.toString(1) + "-" + str;
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzajl {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (C5011t8.f28254c) {
            this.zza.m26586a(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzakm zzakmVar) {
        InterfaceC4862p8 interfaceC4862p8;
        synchronized (this.zze) {
            interfaceC4862p8 = this.zzf;
        }
        if (interfaceC4862p8 != null) {
            interfaceC4862p8.zza(zzakmVar);
        }
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        C4825o8 c4825o8 = this.zzh;
        if (c4825o8 != null) {
            c4825o8.m25098b(this);
        }
        if (C5011t8.f28254c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC4713l8(this, str, id2));
            } else {
                this.zza.m26586a(str, id2);
                this.zza.m26587b(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        InterfaceC4750m8 interfaceC4750m8;
        synchronized (this.zze) {
            interfaceC4750m8 = this.zzk;
        }
        if (interfaceC4750m8 != null) {
            interfaceC4750m8.zza(this);
        }
    }

    public final void zzs(C4937r8 c4937r8) {
        InterfaceC4750m8 interfaceC4750m8;
        synchronized (this.zze) {
            interfaceC4750m8 = this.zzk;
        }
        if (interfaceC4750m8 != null) {
            interfaceC4750m8.mo24490a(this, c4937r8);
        }
    }

    public final void zzt(int i11) {
        C4825o8 c4825o8 = this.zzh;
        if (c4825o8 != null) {
            c4825o8.m25099c(this, i11);
        }
    }

    public final void zzu(InterfaceC4750m8 interfaceC4750m8) {
        synchronized (this.zze) {
            this.zzk = interfaceC4750m8;
        }
    }

    public final boolean zzv() {
        boolean z11;
        synchronized (this.zze) {
            z11 = this.zzi;
        }
        return z11;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzajl {
        return null;
    }

    public final C4381c8 zzy() {
        return this.zzl;
    }
}
