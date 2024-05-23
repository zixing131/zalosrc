package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private od0 zza;

    private final void zza() {
        od0 od0Var = this.zza;
        if (od0Var != null) {
            try {
                od0Var.zzv();
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i11, int i12, Intent intent) {
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                od0Var.zzg(i11, i12, intent);
            }
        } catch (Exception e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                if (!od0Var.zzE()) {
                    return;
                }
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        super.onBackPressed();
        try {
            od0 od0Var2 = this.zza;
            if (od0Var2 != null) {
                od0Var2.zzh();
            }
        } catch (RemoteException e12) {
            yk0.zzl("#007 Could not call remote method.", e12);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                od0Var.zzj(BinderC4273d.m19913I3(configuration));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        od0 zzn = zzaw.zza().zzn(this);
        this.zza = zzn;
        if (zzn != null) {
            try {
                zzn.zzk(bundle);
                return;
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
                finish();
                return;
            }
        }
        yk0.zzl("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                od0Var.zzl();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                od0Var.zzn();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                od0Var.zzo();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                od0Var.zzp();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                od0Var.zzq(bundle);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                od0Var.zzr();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                od0Var.zzs();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            od0 od0Var = this.zza;
            if (od0Var != null) {
                od0Var.zzt();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i11) {
        super.setContentView(i11);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
