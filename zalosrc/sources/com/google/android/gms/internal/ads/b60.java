package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b60 implements InterfaceC4566h8 {

    /* renamed from: a */
    private volatile q50 f17622a;

    /* renamed from: b */
    private final Context f17623b;

    public b60(Context context) {
        this.f17623b = context;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m20406b(b60 b60Var) {
        if (b60Var.f17622a == null) {
            return;
        }
        b60Var.f17622a.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4566h8
    public final C4639j8 zza(AbstractC4788n8 abstractC4788n8) {
        Parcelable.Creator<zzbrd> creator = zzbrd.CREATOR;
        Map zzl = abstractC4788n8.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i11 = 0;
        int i12 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i12] = (String) entry.getKey();
            strArr2[i12] = (String) entry.getValue();
            i12++;
        }
        zzbrd zzbrdVar = new zzbrd(abstractC4788n8.zzk(), strArr, strArr2);
        long mo105914b = zzt.zzB().mo105914b();
        try {
            pl0 pl0Var = new pl0();
            this.f17622a = new q50(this.f17623b, zzt.zzt().zzb(), new z50(this, pl0Var), new a60(this, pl0Var));
            this.f17622a.checkAvailabilityAndConnect();
            x50 x50Var = new x50(this, zzbrdVar);
            uc3 uc3Var = kl0.f23363a;
            tc3 m23883o = kc3.m23883o(kc3.m23882n(pl0Var, x50Var, uc3Var), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20975E3)).intValue(), TimeUnit.MILLISECONDS, kl0.f23366d);
            m23883o.zzc(new y50(this), uc3Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) m23883o.get();
            zze.zza("Http assets remote cache took " + (zzt.zzB().mo105914b() - mo105914b) + "ms");
            zzbrf zzbrfVar = (zzbrf) new zzcba(parcelFileDescriptor).m28717t(zzbrf.CREATOR);
            if (zzbrfVar == null) {
                return null;
            }
            if (!zzbrfVar.f31907p) {
                if (zzbrfVar.f31911t.length != zzbrfVar.f31912u.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbrfVar.f31911t;
                    if (i11 < strArr3.length) {
                        hashMap.put(strArr3[i11], zzbrfVar.f31912u[i11]);
                        i11++;
                    } else {
                        return new C4639j8(zzbrfVar.f31909r, zzbrfVar.f31910s, hashMap, zzbrfVar.f31913v, zzbrfVar.f31914w);
                    }
                }
            } else {
                throw new zzakm(zzbrfVar.f31908q);
            }
        } catch (InterruptedException | ExecutionException unused) {
            zze.zza("Http assets remote cache took " + (zzt.zzB().mo105914b() - mo105914b) + "ms");
            return null;
        } catch (Throwable th2) {
            zze.zza("Http assets remote cache took " + (zzt.zzB().mo105914b() - mo105914b) + "ms");
            throw th2;
        }
    }
}
