package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class af2 implements sh2 {

    /* renamed from: a */
    private final uc3 f17015a;

    /* renamed from: b */
    private final ViewGroup f17016b;

    /* renamed from: c */
    private final Context f17017c;

    /* renamed from: d */
    private final Set f17018d;

    public af2(uc3 uc3Var, ViewGroup viewGroup, Context context, Set set) {
        this.f17015a = uc3Var;
        this.f17018d = set;
        this.f17016b = viewGroup;
        this.f17017c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bf2 m20103a() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21164X4)).booleanValue() && this.f17016b != null && this.f17018d.contains("banner")) {
            return new bf2(Boolean.valueOf(this.f17016b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21173Y4)).booleanValue() && this.f17018d.contains("native")) {
            Context context = this.f17017c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window != null && (window.getAttributes().flags & 16777216) != 0) {
                    bool = Boolean.TRUE;
                } else {
                    try {
                        boolean z11 = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z11 = true;
                        }
                        bool = Boolean.valueOf(z11);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return new bf2(bool);
            }
        }
        return new bf2(null);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f17015a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.ze2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return af2.this.m20103a();
            }
        });
    }
}
