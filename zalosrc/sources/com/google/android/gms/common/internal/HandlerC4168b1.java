package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4172d;
import p538u5.HandlerC27038e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.b1 */
/* loaded from: classes2.dex */
public final class HandlerC4168b1 extends HandlerC27038e {

    /* renamed from: a */
    final /* synthetic */ AbstractC4172d f16570a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4168b1(AbstractC4172d abstractC4172d, Looper looper) {
        super(looper);
        this.f16570a = abstractC4172d;
    }

    /* renamed from: a */
    private static final void m19631a(Message message) {
        AbstractC4171c1 abstractC4171c1 = (AbstractC4171c1) message.obj;
        abstractC4171c1.mo19638b();
        abstractC4171c1.m19641e();
    }

    /* renamed from: b */
    private static final boolean m19632b(Message message) {
        int i11 = message.what;
        if (i11 == 2 || i11 == 1 || i11 == 7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC4172d.a aVar;
        AbstractC4172d.a aVar2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4;
        boolean z11;
        if (this.f16570a.zzd.get() != message.arg1) {
            if (m19632b(message)) {
                m19631a(message);
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 != 1 && i11 != 7 && ((i11 != 4 || this.f16570a.enableLocalFallback()) && message.what != 5)) || this.f16570a.isConnecting()) {
            int i12 = message.what;
            PendingIntent pendingIntent = null;
            if (i12 == 4) {
                this.f16570a.zzB = new ConnectionResult(message.arg2);
                if (AbstractC4172d.zzo(this.f16570a)) {
                    AbstractC4172d abstractC4172d = this.f16570a;
                    z11 = abstractC4172d.zzC;
                    if (!z11) {
                        abstractC4172d.m19642f(3, null);
                        return;
                    }
                }
                AbstractC4172d abstractC4172d2 = this.f16570a;
                connectionResult3 = abstractC4172d2.zzB;
                if (connectionResult3 != null) {
                    connectionResult4 = abstractC4172d2.zzB;
                } else {
                    connectionResult4 = new ConnectionResult(8);
                }
                this.f16570a.zzc.mo19548a(connectionResult4);
                this.f16570a.onConnectionFailed(connectionResult4);
                return;
            }
            if (i12 == 5) {
                AbstractC4172d abstractC4172d3 = this.f16570a;
                connectionResult = abstractC4172d3.zzB;
                if (connectionResult != null) {
                    connectionResult2 = abstractC4172d3.zzB;
                } else {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.f16570a.zzc.mo19548a(connectionResult2);
                this.f16570a.onConnectionFailed(connectionResult2);
                return;
            }
            if (i12 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, pendingIntent);
                this.f16570a.zzc.mo19548a(connectionResult5);
                this.f16570a.onConnectionFailed(connectionResult5);
                return;
            }
            if (i12 == 6) {
                this.f16570a.m19642f(5, null);
                AbstractC4172d abstractC4172d4 = this.f16570a;
                aVar = abstractC4172d4.zzw;
                if (aVar != null) {
                    aVar2 = abstractC4172d4.zzw;
                    aVar2.mo19636N(message.arg2);
                }
                this.f16570a.onConnectionSuspended(message.arg2);
                AbstractC4172d.zzn(this.f16570a, 5, 1, null);
                return;
            }
            if (i12 == 2 && !this.f16570a.isConnected()) {
                m19631a(message);
                return;
            }
            if (m19632b(message)) {
                ((AbstractC4171c1) message.obj).m19639c();
                return;
            }
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        m19631a(message);
    }
}
