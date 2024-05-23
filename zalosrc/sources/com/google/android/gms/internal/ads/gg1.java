package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* loaded from: classes2.dex */
public final class gg1 extends kd1 {

    /* renamed from: q */
    private boolean f20578q;

    /* JADX INFO: Access modifiers changed from: protected */
    public gg1(Set set) {
        super(set);
    }

    public final void zza() {
        m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.bg1
            @Override // com.google.android.gms.internal.ads.jd1
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.eg1
            @Override // com.google.android.gms.internal.ads.jd1
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.f20578q) {
                m23892x0(dg1.f19211a);
                this.f20578q = true;
            }
            m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.fg1
                @Override // com.google.android.gms.internal.ads.jd1
                public final void zza(Object obj) {
                    ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzd() {
        m23892x0(dg1.f19211a);
        this.f20578q = true;
    }
}
