package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.yk0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ResponseInfo {
    private final zzdh zza;
    private final List zzb = new ArrayList();
    private AdapterResponseInfo zzc;

    private ResponseInfo(zzdh zzdhVar) {
        this.zza = zzdhVar;
        if (zzdhVar != null) {
            try {
                List zzj = zzdhVar.zzj();
                if (zzj != null) {
                    Iterator it = zzj.iterator();
                    while (it.hasNext()) {
                        AdapterResponseInfo zza = AdapterResponseInfo.zza((zzu) it.next());
                        if (zza != null) {
                            this.zzb.add(zza);
                        }
                    }
                }
            } catch (RemoteException e11) {
                yk0.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e11);
            }
        }
        zzdh zzdhVar2 = this.zza;
        if (zzdhVar2 != null) {
            try {
                zzu zzf = zzdhVar2.zzf();
                if (zzf != null) {
                    this.zzc = AdapterResponseInfo.zza(zzf);
                }
            } catch (RemoteException e12) {
                yk0.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e12);
            }
        }
    }

    public static ResponseInfo zza(zzdh zzdhVar) {
        if (zzdhVar != null) {
            return new ResponseInfo(zzdhVar);
        }
        return null;
    }

    public static ResponseInfo zzb(zzdh zzdhVar) {
        return new ResponseInfo(zzdhVar);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    public String getMediationAdapterClassName() {
        try {
            zzdh zzdhVar = this.zza;
            if (zzdhVar != null) {
                return zzdhVar.zzg();
            }
            return null;
        } catch (RemoteException e11) {
            yk0.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e11);
            return null;
        }
    }

    public Bundle getResponseExtras() {
        try {
            zzdh zzdhVar = this.zza;
            if (zzdhVar != null) {
                return zzdhVar.zze();
            }
        } catch (RemoteException e11) {
            yk0.zzh("Could not forward getResponseExtras to ResponseInfo.", e11);
        }
        return new Bundle();
    }

    public String getResponseId() {
        try {
            zzdh zzdhVar = this.zza;
            if (zzdhVar != null) {
                return zzdhVar.zzi();
            }
            return null;
        } catch (RemoteException e11) {
            yk0.zzh("Could not forward getResponseId to ResponseInfo.", e11);
            return null;
        }
    }

    public String toString() {
        try {
            return zzd().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final zzdh zzc() {
        return this.zza;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            jSONArray.put(((AdapterResponseInfo) it.next()).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.zzc;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzaw.zzb().m26119j(responseExtras));
        }
        return jSONObject;
    }
}
