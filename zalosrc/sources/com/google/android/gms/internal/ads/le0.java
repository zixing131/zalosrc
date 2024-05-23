package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class le0 {

    /* renamed from: a */
    private final View f23882a;

    /* renamed from: b */
    private final Map f23883b;

    /* renamed from: c */
    private final qj0 f23884c;

    public le0(ke0 ke0Var) {
        View view;
        Map map;
        View view2;
        view = ke0Var.f23290a;
        this.f23882a = view;
        map = ke0Var.f23291b;
        this.f23883b = map;
        view2 = ke0Var.f23290a;
        qj0 m21992a = fe0.m21992a(view2.getContext());
        this.f23884c = m21992a;
        if (m21992a != null && !map.isEmpty()) {
            try {
                m21992a.zzf(new zzcaa(BinderC4273d.m19913I3(view).asBinder(), BinderC4273d.m19913I3(map).asBinder()));
            } catch (RemoteException unused) {
                yk0.zzg("Failed to call remote method.");
            }
        }
    }

    /* renamed from: a */
    public final void m24257a(List list) {
        if (list != null && !list.isEmpty()) {
            if (this.f23884c == null) {
                yk0.zzj("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                this.f23884c.zzg(list, BinderC4273d.m19913I3(this.f23882a), new je0(this, list));
                return;
            } catch (RemoteException e11) {
                yk0.zzg("RemoteException recording click: ".concat(e11.toString()));
                return;
            }
        }
        yk0.zzj("No click urls were passed to recordClick");
    }

    /* renamed from: b */
    public final void m24258b(List list) {
        if (list != null && !list.isEmpty()) {
            qj0 qj0Var = this.f23884c;
            if (qj0Var != null) {
                try {
                    qj0Var.zzh(list, BinderC4273d.m19913I3(this.f23882a), new ie0(this, list));
                    return;
                } catch (RemoteException e11) {
                    yk0.zzg("RemoteException recording impression urls: ".concat(e11.toString()));
                    return;
                }
            }
            yk0.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        yk0.zzj("No impression urls were passed to recordImpression");
    }

    /* renamed from: c */
    public final void m24259c(MotionEvent motionEvent) {
        qj0 qj0Var = this.f23884c;
        if (qj0Var != null) {
            try {
                qj0Var.zzj(BinderC4273d.m19913I3(motionEvent));
                return;
            } catch (RemoteException unused) {
                yk0.zzg("Failed to call remote method.");
                return;
            }
        }
        yk0.zze("Failed to get internal reporting info generator.");
    }

    /* renamed from: d */
    public final void m24260d(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.f23884c == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f23884c.zzk(new ArrayList(Arrays.asList(uri)), BinderC4273d.m19913I3(this.f23882a), new he0(this, updateClickUrlCallback));
        } catch (RemoteException e11) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e11.toString()));
        }
    }

    /* renamed from: e */
    public final void m24261e(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.f23884c == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f23884c.zzl(list, BinderC4273d.m19913I3(this.f23882a), new ge0(this, updateImpressionUrlsCallback));
        } catch (RemoteException e11) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e11.toString()));
        }
    }
}
