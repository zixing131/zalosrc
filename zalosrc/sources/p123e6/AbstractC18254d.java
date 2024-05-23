package p123e6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p151f6.AbstractC18746b0;
import p151f6.InterfaceC18752e0;
import p181g6.AbstractC19237c;

/* renamed from: e6.d */
/* loaded from: classes2.dex */
public abstract class AbstractC18254d {

    /* renamed from: a */
    private static boolean f92464a = false;

    /* renamed from: b */
    private static a f92465b = a.LEGACY;

    /* renamed from: e6.d$a */
    /* loaded from: classes2.dex */
    public enum a {
        LEGACY,
        LATEST
    }

    /* renamed from: a */
    public static synchronized int m97043a(Context context) {
        int m97044b;
        synchronized (AbstractC18254d.class) {
            m97044b = m97044b(context, null, null);
        }
        return m97044b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|16|17|(10:19|(1:(1:22))|23|24|(1:26)|27|28|(1:30)|31|32)|35|23|24|(0)|27|28|(0)|31|32) */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[Catch: all -> 0x001e, RemoteException -> 0x0056, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x0018, B:12:0x0022, B:15:0x0026, B:17:0x0035, B:19:0x003a, B:24:0x0045, B:26:0x004b, B:27:0x004f, B:28:0x0056, B:30:0x0063, B:38:0x006b, B:39:0x0070, B:41:0x0072), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x0018, B:12:0x0022, B:15:0x0026, B:17:0x0035, B:19:0x003a, B:24:0x0045, B:26:0x004b, B:27:0x004f, B:28:0x0056, B:30:0x0063, B:38:0x006b, B:39:0x0070, B:41:0x0072), top: B:3:0x0003, inners: #0, #1 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized int m97044b(Context context, a aVar, InterfaceC18256f interfaceC18256f) {
        synchronized (AbstractC18254d.class) {
            AbstractC4205o.m19723l(context, "Context is null");
            "preferredRenderer: ".concat(String.valueOf(aVar));
            if (f92464a) {
                if (interfaceC18256f != null) {
                    interfaceC18256f.m97045a(f92465b);
                }
                return 0;
            }
            try {
                InterfaceC18752e0 m98753a = AbstractC18746b0.m98753a(context, aVar);
                try {
                    AbstractC18252b.m97019e(m98753a.zze());
                    AbstractC19237c.m100921c(m98753a.zzj());
                    int i11 = 1;
                    f92464a = true;
                    if (aVar != null) {
                        int ordinal = aVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                i11 = 2;
                            }
                        }
                        if (m98753a.zzd() == 2) {
                            f92465b = a.LATEST;
                        }
                        m98753a.mo98762d3(BinderC4273d.m19913I3(context), i11);
                        "loadedRenderer: ".concat(String.valueOf(f92465b));
                        if (interfaceC18256f != null) {
                            interfaceC18256f.m97045a(f92465b);
                        }
                        return 0;
                    }
                    i11 = 0;
                    if (m98753a.zzd() == 2) {
                    }
                    m98753a.mo98762d3(BinderC4273d.m19913I3(context), i11);
                    "loadedRenderer: ".concat(String.valueOf(f92465b));
                    if (interfaceC18256f != null) {
                    }
                    return 0;
                } catch (RemoteException e11) {
                    throw new RuntimeRemoteException(e11);
                }
            } catch (GooglePlayServicesNotAvailableException e12) {
                return e12.f16148p;
            }
        }
    }
}
