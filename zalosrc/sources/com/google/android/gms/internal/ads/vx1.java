package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class vx1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ wy1 f29603a;

    public /* synthetic */ vx1(wy1 wy1Var, sw1 sw1Var) {
        this.f29603a = wy1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i11 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i11 = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i11 = type != 9 ? 8 : 7;
                                }
                                i11 = 5;
                            }
                        }
                        i11 = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i11 = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i11 = 4;
                            break;
                        case 13:
                            i11 = 5;
                            break;
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        case 19:
                        default:
                            i11 = 6;
                            break;
                        case 18:
                            i11 = 2;
                            break;
                        case 20:
                            if (g92.f20474a >= 29) {
                                i11 = 9;
                                break;
                            }
                            break;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (g92.f20474a >= 31 && i11 == 5) {
            wy1 wy1Var = this.f29603a;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                rv1 rv1Var = new rv1(wy1Var);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, rv1Var);
                telephonyManager.unregisterTelephonyCallback(rv1Var);
                return;
            } catch (RuntimeException unused2) {
                wy1.m27735c(wy1Var, 5);
                return;
            }
        }
        wy1.m27735c(this.f29603a, i11);
    }
}
