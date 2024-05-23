package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.AbstractC4181g;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.IOException;
import p092d5.C17737a;
import p632x4.ServiceConnectionC29315a;

/* renamed from: com.google.android.gms.auth.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4052e {

    /* renamed from: a */
    private static final String[] f16098a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b */
    public static final String f16099b = "callerUid";

    /* renamed from: c */
    public static final String f16100c = "androidPackageName";

    /* renamed from: d */
    private static final ComponentName f16101d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: e */
    private static final C17737a f16102e = new C17737a("Auth", "GoogleAuthUtil");

    /* renamed from: a */
    public static void m19142a(Context context, String str) {
        AbstractC4205o.m19721j("Calling this from your main thread can lead to deadlock");
        m19143b(context, 8400000);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        String str3 = f16100c;
        if (!bundle.containsKey(str3)) {
            bundle.putString(str3, str2);
        }
        m19149h(context, f16101d, new C4054g(str, bundle));
    }

    /* renamed from: b */
    private static void m19143b(Context context, int i11) {
        try {
            AbstractC4150d.m19578b(context.getApplicationContext(), i11);
        } catch (GooglePlayServicesNotAvailableException e11) {
            throw new GoogleAuthException(e11.getMessage());
        } catch (GooglePlayServicesRepairableException e12) {
            throw new GooglePlayServicesAvailabilityException(e12.m19192b(), e12.getMessage(), e12.m19195a());
        }
    }

    /* renamed from: c */
    public static String m19144c(Context context, Account account, String str) {
        return m19145d(context, account, str, new Bundle());
    }

    /* renamed from: d */
    public static String m19145d(Context context, Account account, String str, Bundle bundle) {
        m19153l(account);
        return m19151j(context, account, str, bundle).m19025F();
    }

    /* renamed from: e */
    public static String m19146e(Context context, String str, String str2) {
        return m19144c(context, new Account(str, "com.google"), str2);
    }

    /* renamed from: f */
    public static void m19147f(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    /* renamed from: h */
    private static Object m19149h(Context context, ComponentName componentName, InterfaceC4055h interfaceC4055h) {
        ServiceConnectionC29315a serviceConnectionC29315a = new ServiceConnectionC29315a();
        AbstractC4181g m19678c = AbstractC4181g.m19678c(context);
        try {
            if (m19678c.m19680a(componentName, serviceConnectionC29315a, "GoogleAuthUtil")) {
                try {
                    return interfaceC4055h.mo19154a(serviceConnectionC29315a.m146462a());
                } catch (RemoteException | InterruptedException e11) {
                    f16102e.m93901d("GoogleAuthUtil", "Error on service connection.", e11);
                    throw new IOException("Error on service connection.", e11);
                }
            }
            throw new IOException("Could not bind to service.");
        } finally {
            m19678c.m19681e(componentName, serviceConnectionC29315a, "GoogleAuthUtil");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static Object m19150i(Object obj) {
        if (obj != null) {
            return obj;
        }
        f16102e.m93903f("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }

    /* renamed from: j */
    public static TokenData m19151j(Context context, Account account, String str, Bundle bundle) {
        Bundle bundle2;
        AbstractC4205o.m19721j("Calling this from your main thread can lead to deadlock");
        AbstractC4205o.m19719h(str, "Scope cannot be empty or null.");
        m19153l(account);
        m19143b(context, 8400000);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        String str3 = f16100c;
        if (TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) m19149h(context, f16101d, new C4053f(account, str, bundle2));
    }

    /* renamed from: l */
    private static void m19153l(Account account) {
        if (account != null) {
            if (!TextUtils.isEmpty(account.name)) {
                for (String str : f16098a) {
                    if (str.equals(account.type)) {
                        return;
                    }
                }
                throw new IllegalArgumentException("Account type not supported");
            }
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        throw new IllegalArgumentException("Account cannot be null");
    }
}
