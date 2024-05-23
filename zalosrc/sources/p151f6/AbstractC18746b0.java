package p151f6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.AbstractC4149c;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p123e6.AbstractC18254d;

/* renamed from: f6.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC18746b0 {

    /* renamed from: a */
    private static Context f94063a;

    /* renamed from: b */
    private static InterfaceC18752e0 f94064b;

    /* renamed from: a */
    public static InterfaceC18752e0 m98753a(Context context, AbstractC18254d.a aVar) {
        AbstractC4205o.m19722k(context);
        "preferredRenderer: ".concat(String.valueOf(aVar));
        InterfaceC18752e0 interfaceC18752e0 = f94064b;
        if (interfaceC18752e0 == null) {
            int m19576h = AbstractC4149c.m19576h(context, 13400000);
            if (m19576h == 0) {
                InterfaceC18752e0 m98756d = m98756d(context, aVar);
                f94064b = m98756d;
                try {
                    if (m98756d.zzd() == 2) {
                        try {
                            f94064b.zzm(BinderC4273d.m19913I3(m98755c(context, aVar)));
                        } catch (RemoteException e11) {
                            throw new RuntimeRemoteException(e11);
                        } catch (UnsatisfiedLinkError unused) {
                            f94063a = null;
                            f94064b = m98756d(context, AbstractC18254d.a.LEGACY);
                        }
                    }
                    try {
                        InterfaceC18752e0 interfaceC18752e02 = f94064b;
                        Context m98755c = m98755c(context, aVar);
                        m98755c.getClass();
                        interfaceC18752e02.mo98761H(BinderC4273d.m19913I3(m98755c.getResources()), 18020000);
                        return f94064b;
                    } catch (RemoteException e12) {
                        throw new RuntimeRemoteException(e12);
                    }
                } catch (RemoteException e13) {
                    throw new RuntimeRemoteException(e13);
                }
            }
            throw new GooglePlayServicesNotAvailableException(m19576h);
        }
        return interfaceC18752e0;
    }

    /* renamed from: b */
    private static Context m98754b(Exception exc, Context context) {
        return AbstractC4149c.m19574e(context);
    }

    /* renamed from: c */
    private static Context m98755c(Context context, AbstractC18254d.a aVar) {
        String str;
        Context m98754b;
        Context context2 = f94063a;
        if (context2 == null) {
            if (aVar == AbstractC18254d.a.LEGACY) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else {
                str = "com.google.android.gms.maps_core_dynamite";
            }
            try {
                m98754b = DynamiteModule.m19920e(context, DynamiteModule.f16815b, str).m19928b();
            } catch (Exception e11) {
                if (!str.equals("com.google.android.gms.maps_dynamite")) {
                    try {
                        m98754b = DynamiteModule.m19920e(context, DynamiteModule.f16815b, "com.google.android.gms.maps_dynamite").m19928b();
                    } catch (Exception e12) {
                        m98754b = m98754b(e12, context);
                    }
                } else {
                    m98754b = m98754b(e11, context);
                }
            }
            f94063a = m98754b;
            return m98754b;
        }
        return context2;
    }

    /* renamed from: d */
    private static InterfaceC18752e0 m98756d(Context context, AbstractC18254d.a aVar) {
        try {
            IBinder iBinder = (IBinder) m98757e(((ClassLoader) AbstractC4205o.m19722k(m98755c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            if (queryLocalInterface instanceof InterfaceC18752e0) {
                return (InterfaceC18752e0) queryLocalInterface;
            }
            return new C18750d0(iBinder);
        } catch (ClassNotFoundException e11) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e11);
        }
    }

    /* renamed from: e */
    private static Object m98757e(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e11) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e11);
        } catch (InstantiationException e12) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e12);
        }
    }
}
