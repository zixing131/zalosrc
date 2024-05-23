package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ku1 extends h50 {

    /* renamed from: p */
    private final nu1 f23594p;

    /* renamed from: q */
    private final iu1 f23595q;

    /* renamed from: r */
    private final Map f23596r = new HashMap();

    public ku1(nu1 nu1Var, iu1 iu1Var) {
        this.f23594p = nu1Var;
        this.f23595q = iu1Var;
    }

    /* renamed from: Q */
    private static zzl m24046Q(Map map) {
        char c11;
        zzm zzmVar = new zzm();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zzmVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c11 = 3;
                            break;
                        }
                        break;
                }
                c11 = 65535;
                switch (c11) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zzmVar.zzb(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zzmVar.zze(arrayList);
                        break;
                    case 2:
                        zzmVar.zzd(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (jsonReader.nextBoolean()) {
                            zzmVar.zzg(1);
                            break;
                        } else {
                            zzmVar.zzg(0);
                            break;
                        }
                    case 4:
                        if (jsonReader.nextBoolean()) {
                            zzmVar.zzh(1);
                            break;
                        } else {
                            zzmVar.zzh(0);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(nextString)) {
                            break;
                        } else {
                            zzmVar.zzf(nextString);
                            break;
                        }
                    case 6:
                        zzmVar.zzc(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            yk0.zze("Ad Request json was malformed, parsing ended early.");
        }
        zzl zza = zzmVar.zza();
        Bundle bundle2 = zza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zza.zzc;
            zza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new zzl(zza.zza, zza.zzb, bundle2, zza.zzd, zza.zze, zza.zzf, zza.zzg, zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, zza.zzm, zza.zzn, zza.zzo, zza.zzp, zza.zzq, zza.zzr, zza.zzs, zza.zzt, zza.zzu, zza.zzv, zza.zzw, zza.zzx);
    }

    @Override // com.google.android.gms.internal.ads.i50
    /* renamed from: j */
    public final void mo22283j(String str) {
        char c11;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21245f8)).booleanValue()) {
            return;
        }
        zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        zzt.zzp();
        Map zzL = zzs.zzL(parse);
        String str2 = (String) zzL.get("action");
        if (TextUtils.isEmpty(str2)) {
            yk0.zze("H5 gmsg did not contain an action");
            return;
        }
        int hashCode = str2.hashCode();
        char c12 = 65535;
        if (hashCode != 579053441) {
            if (hashCode == 871091088 && str2.equals("initialize")) {
                c11 = 0;
            }
            c11 = 65535;
        } else {
            if (str2.equals("dispose_all")) {
                c11 = 1;
            }
            c11 = 65535;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                String str3 = (String) zzL.get("obj_id");
                try {
                    str3.getClass();
                    long parseLong = Long.parseLong(str3);
                    switch (str2.hashCode()) {
                        case -1790951212:
                            if (str2.equals("show_interstitial_ad")) {
                                c12 = 2;
                                break;
                            }
                            break;
                        case -1266374734:
                            if (str2.equals("show_rewarded_ad")) {
                                c12 = 5;
                                break;
                            }
                            break;
                        case -257098725:
                            if (str2.equals("load_rewarded_ad")) {
                                c12 = 4;
                                break;
                            }
                            break;
                        case 393881811:
                            if (str2.equals("create_interstitial_ad")) {
                                c12 = 0;
                                break;
                            }
                            break;
                        case 585513149:
                            if (str2.equals("load_interstitial_ad")) {
                                c12 = 1;
                                break;
                            }
                            break;
                        case 1671767583:
                            if (str2.equals("dispose")) {
                                c12 = 6;
                                break;
                            }
                            break;
                        case 2109237041:
                            if (str2.equals("create_rewarded_ad")) {
                                c12 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c12) {
                        case 0:
                            if (this.f23596r.size() >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21255g8)).intValue()) {
                                yk0.zzj("Could not create H5 ad, too many existing objects");
                                this.f23595q.m23413i(parseLong);
                                return;
                            }
                            Map map = this.f23596r;
                            Long valueOf = Long.valueOf(parseLong);
                            if (map.containsKey(valueOf)) {
                                yk0.zze("Could not create H5 ad, object ID already exists");
                                this.f23595q.m23413i(parseLong);
                                return;
                            }
                            String str4 = (String) zzL.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                yk0.zzj("Could not create H5 ad, missing ad unit id");
                                this.f23595q.m23413i(parseLong);
                                return;
                            }
                            eu1 zzb = this.f23594p.zzb();
                            zzb.mo21811a(parseLong);
                            zzb.zza(str4);
                            this.f23596r.put(valueOf, zzb.zzc().zza());
                            this.f23595q.m23412h(parseLong);
                            zze.zza("Created H5 interstitial #" + parseLong + " with ad unit " + str4);
                            return;
                        case 1:
                            du1 du1Var = (du1) this.f23596r.get(Long.valueOf(parseLong));
                            if (du1Var == null) {
                                yk0.zze("Could not load H5 ad, object ID does not exist");
                                this.f23595q.m23410f(parseLong);
                                return;
                            } else {
                                du1Var.mo21544a(m24046Q(zzL));
                                return;
                            }
                        case 2:
                            du1 du1Var2 = (du1) this.f23596r.get(Long.valueOf(parseLong));
                            if (du1Var2 == null) {
                                yk0.zze("Could not show H5 ad, object ID does not exist");
                                this.f23595q.m23410f(parseLong);
                                return;
                            } else {
                                du1Var2.zzc();
                                return;
                            }
                        case 3:
                            if (this.f23596r.size() >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21255g8)).intValue()) {
                                yk0.zzj("Could not create H5 ad, too many existing objects");
                                this.f23595q.m23413i(parseLong);
                                return;
                            }
                            Map map2 = this.f23596r;
                            Long valueOf2 = Long.valueOf(parseLong);
                            if (map2.containsKey(valueOf2)) {
                                yk0.zze("Could not create H5 ad, object ID already exists");
                                this.f23595q.m23413i(parseLong);
                                return;
                            }
                            String str5 = (String) zzL.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                yk0.zzj("Could not create H5 ad, missing ad unit id");
                                this.f23595q.m23413i(parseLong);
                                return;
                            }
                            eu1 zzb2 = this.f23594p.zzb();
                            zzb2.mo21811a(parseLong);
                            zzb2.zza(str5);
                            this.f23596r.put(valueOf2, zzb2.zzc().zzb());
                            this.f23595q.m23412h(parseLong);
                            zze.zza("Created H5 rewarded #" + parseLong + " with ad unit " + str5);
                            return;
                        case 4:
                            du1 du1Var3 = (du1) this.f23596r.get(Long.valueOf(parseLong));
                            if (du1Var3 == null) {
                                yk0.zze("Could not load H5 ad, object ID does not exist");
                                this.f23595q.m23421q(parseLong);
                                return;
                            } else {
                                du1Var3.mo21544a(m24046Q(zzL));
                                return;
                            }
                        case 5:
                            du1 du1Var4 = (du1) this.f23596r.get(Long.valueOf(parseLong));
                            if (du1Var4 == null) {
                                yk0.zze("Could not show H5 ad, object ID does not exist");
                                this.f23595q.m23421q(parseLong);
                                return;
                            } else {
                                du1Var4.zzc();
                                return;
                            }
                        case 6:
                            Map map3 = this.f23596r;
                            Long valueOf3 = Long.valueOf(parseLong);
                            du1 du1Var5 = (du1) map3.get(valueOf3);
                            if (du1Var5 == null) {
                                yk0.zze("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            du1Var5.zza();
                            this.f23596r.remove(valueOf3);
                            zze.zza("Disposed H5 ad #" + parseLong);
                            return;
                        default:
                            yk0.zze("H5 gmsg contained invalid action: ".concat(str2));
                            return;
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                    yk0.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
                    return;
                }
            }
            Iterator it = this.f23596r.values().iterator();
            while (it.hasNext()) {
                ((du1) it.next()).zza();
            }
            this.f23596r.clear();
            return;
        }
        this.f23596r.clear();
        this.f23595q.m23405a();
    }

    @Override // com.google.android.gms.internal.ads.i50
    public final void zze() {
        this.f23596r.clear();
    }
}
