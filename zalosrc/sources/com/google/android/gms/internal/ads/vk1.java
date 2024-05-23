package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class vk1 implements InterfaceC5187xz {

    /* renamed from: a */
    final /* synthetic */ sl1 f29381a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f29382b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vk1(sl1 sl1Var, ViewGroup viewGroup) {
        this.f29381a = sl1Var;
        this.f29382b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5187xz
    /* renamed from: a */
    public final void mo20977a(MotionEvent motionEvent) {
        this.f29381a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5187xz
    public final JSONObject zza() {
        return this.f29381a.zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5187xz
    public final JSONObject zzb() {
        return this.f29381a.zzp();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5187xz
    public final void zzc() {
        sl1 sl1Var = this.f29381a;
        c83 c83Var = sk1.f27755C;
        Map zzm = sl1Var.zzm();
        if (zzm != null) {
            int size = c83Var.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                if (zzm.get((String) c83Var.get(i11)) == null) {
                    i11 = i12;
                } else {
                    this.f29381a.onClick(this.f29382b);
                    return;
                }
            }
        }
    }
}
