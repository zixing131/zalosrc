package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes2.dex */
public final class s90 extends u90 {

    /* renamed from: p */
    private static final tb0 f27594p = new tb0();

    @Override // com.google.android.gms.internal.ads.v90
    /* renamed from: c */
    public final boolean mo26263c(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, s90.class.getClassLoader()));
        } catch (Throwable unused) {
            yk0.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.v90
    /* renamed from: o */
    public final boolean mo26264o(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, s90.class.getClassLoader()));
        } catch (Throwable unused) {
            yk0.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.v90
    /* renamed from: t */
    public final pb0 mo26265t(String str) {
        return new ac0((RtbAdapter) Class.forName(str, false, tb0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.v90
    public final y90 zzb(String str) {
        ua0 ua0Var;
        try {
            try {
                Class<?> cls = Class.forName(str, false, s90.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new ua0((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new ua0((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                yk0.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th2) {
                yk0.zzk("Could not instantiate mediation adapter: " + str + ". ", th2);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            yk0.zze("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                ua0Var = new ua0(new AdMobAdapter());
            } else {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    ua0Var = new ua0(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            return ua0Var;
        }
    }
}
