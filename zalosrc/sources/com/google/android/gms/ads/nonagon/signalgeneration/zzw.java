package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC4963ry;
import com.google.android.gms.internal.ads.gc3;
import com.google.android.gms.internal.ads.it1;
import com.google.android.gms.internal.ads.kw2;
import com.google.android.gms.internal.ads.nj0;
import com.google.android.gms.internal.ads.tc3;
import com.google.android.gms.internal.ads.vw2;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.ys1;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcgv;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzw implements gc3 {
    final /* synthetic */ tc3 zza;
    final /* synthetic */ zzcfk zzb;
    final /* synthetic */ nj0 zzc;
    final /* synthetic */ kw2 zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzaa zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(zzaa zzaaVar, tc3 tc3Var, zzcfk zzcfkVar, nj0 nj0Var, kw2 kw2Var, long j11) {
        this.zzf = zzaaVar;
        this.zza = tc3Var;
        this.zzb = zzcfkVar;
        this.zzc = nj0Var;
        this.zzd = kw2Var;
        this.zze = j11;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        it1 it1Var;
        ys1 ys1Var;
        long mo105913a = com.google.android.gms.ads.internal.zzt.zzB().mo105913a();
        long j11 = this.zze;
        String message = th2.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().m22945t(th2, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.zzf;
        it1Var = zzaaVar.zzr;
        ys1Var = zzaaVar.zzj;
        zzf.zzc(it1Var, ys1Var, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(mo105913a - j11)));
        vw2 zzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) AbstractC4963ry.f27410e.m24091e()).booleanValue() && zzr != null) {
            kw2 kw2Var = this.zzd;
            kw2Var.mo23067q(false);
            zzr.m27360a(kw2Var);
            zzr.m27366g();
        }
        try {
            this.zzc.zzb("Internal error. " + message);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        it1 it1Var;
        ys1 ys1Var;
        ys1 ys1Var2;
        boolean z11;
        boolean z12;
        it1 it1Var2;
        ys1 ys1Var3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzcgv zzcgvVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        it1 it1Var3;
        ys1 ys1Var4;
        it1 it1Var4;
        ys1 ys1Var5;
        zzam zzamVar = (zzam) obj;
        vw2 zzr = zzaa.zzr(this.zza, this.zzb);
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20988F6)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e11) {
                yk0.zzg("QueryInfo generation has been disabled.".concat(e11.toString()));
            }
            if (((Boolean) AbstractC4963ry.f27410e.m24091e()).booleanValue() && zzr != null) {
                kw2 kw2Var = this.zzd;
                kw2Var.mo23067q(false);
                zzr.m27360a(kw2Var);
                zzr.m27366g();
                return;
            }
            return;
        }
        long mo105913a = com.google.android.gms.ads.internal.zzt.zzB().mo105913a() - this.zze;
        try {
            try {
                if (zzamVar == null) {
                    this.zzc.mo21700x0(null, null, null);
                    zzaa zzaaVar = this.zzf;
                    it1Var4 = zzaaVar.zzr;
                    ys1Var5 = zzaaVar.zzj;
                    zzf.zzc(it1Var4, ys1Var5, "sgs", new Pair("rid", "-1"));
                    this.zzd.mo23067q(true);
                    if (((Boolean) AbstractC4963ry.f27410e.m24091e()).booleanValue() && zzr != null) {
                        zzr.m27360a(this.zzd);
                        zzr.m27366g();
                        return;
                    }
                    return;
                }
                try {
                    String optString = new JSONObject(zzamVar.zzb).optString("request_id", "");
                    if (TextUtils.isEmpty(optString)) {
                        yk0.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzaa zzaaVar2 = this.zzf;
                        it1Var3 = zzaaVar2.zzr;
                        ys1Var4 = zzaaVar2.zzj;
                        zzf.zzc(it1Var3, ys1Var4, "sgf", new Pair("sgf_reason", "rid_missing"));
                        this.zzd.mo23067q(false);
                        if (((Boolean) AbstractC4963ry.f27410e.m24091e()).booleanValue() && zzr != null) {
                            zzr.m27360a(this.zzd);
                            zzr.m27366g();
                            return;
                        }
                        return;
                    }
                    zzaa zzaaVar3 = this.zzf;
                    String str7 = zzamVar.zzb;
                    ys1Var2 = zzaaVar3.zzj;
                    zzaa.zzG(zzaaVar3, optString, str7, ys1Var2);
                    Bundle bundle = zzamVar.zzc;
                    zzaa zzaaVar4 = this.zzf;
                    z11 = zzaaVar4.zzw;
                    if (z11 && bundle != null) {
                        str5 = zzaaVar4.zzy;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzaa zzaaVar5 = this.zzf;
                            str6 = zzaaVar5.zzy;
                            atomicInteger = zzaaVar5.zzz;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzaa zzaaVar6 = this.zzf;
                    z12 = zzaaVar6.zzv;
                    if (z12 && bundle != null) {
                        str = zzaaVar6.zzx;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zzf.zzB;
                            if (TextUtils.isEmpty(str2)) {
                                zzaa zzaaVar7 = this.zzf;
                                com.google.android.gms.ads.internal.util.zzs zzp = com.google.android.gms.ads.internal.zzt.zzp();
                                zzaa zzaaVar8 = this.zzf;
                                context = zzaaVar8.zzg;
                                zzcgvVar = zzaaVar8.zzA;
                                zzaaVar7.zzB = zzp.zzc(context, zzcgvVar.f32030p);
                            }
                            zzaa zzaaVar9 = this.zzf;
                            str3 = zzaaVar9.zzx;
                            str4 = zzaaVar9.zzB;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.mo21700x0(zzamVar.zza, zzamVar.zzb, bundle);
                    zzaa zzaaVar10 = this.zzf;
                    it1Var2 = zzaaVar10.zzr;
                    ys1Var3 = zzaaVar10.zzj;
                    zzf.zzc(it1Var2, ys1Var3, "sgs", new Pair("tqgt", String.valueOf(mo105913a)));
                    this.zzd.mo23067q(true);
                    if (((Boolean) AbstractC4963ry.f27410e.m24091e()).booleanValue() && zzr != null) {
                        zzr.m27360a(this.zzd);
                        zzr.m27366g();
                    }
                } catch (JSONException e12) {
                    yk0.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e12.toString());
                    zzaa zzaaVar11 = this.zzf;
                    it1Var = zzaaVar11.zzr;
                    ys1Var = zzaaVar11.zzj;
                    zzf.zzc(it1Var, ys1Var, "sgf", new Pair("sgf_reason", "request_invalid"));
                    this.zzd.mo23067q(false);
                    if (((Boolean) AbstractC4963ry.f27410e.m24091e()).booleanValue() && zzr != null) {
                        zzr.m27360a(this.zzd);
                        zzr.m27366g();
                    }
                }
            } catch (RemoteException e13) {
                this.zzd.mo23067q(false);
                yk0.zzh("", e13);
                if (((Boolean) AbstractC4963ry.f27410e.m24091e()).booleanValue() && zzr != null) {
                    zzr.m27360a(this.zzd);
                    zzr.m27366g();
                }
            }
        } catch (Throwable th2) {
            if (((Boolean) AbstractC4963ry.f27410e.m24091e()).booleanValue() && zzr != null) {
                zzr.m27360a(this.zzd);
                zzr.m27366g();
            }
            throw th2;
        }
    }
}
