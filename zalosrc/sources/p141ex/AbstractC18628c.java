package p141ex;

import com.zing.zalocore.CoreUtility;
import java.lang.reflect.Proxy;
import p660xw.InterfaceC30214a;

/* renamed from: ex.c */
/* loaded from: classes4.dex */
public abstract class AbstractC18628c {

    /* renamed from: a */
    private static ClassLoader f93731a;

    /* renamed from: a */
    public static Object m98437a(Object obj, Exception exc, String str) {
        try {
            if (f93731a == null) {
                f93731a = CoreUtility.getAppContext().getClassLoader();
            }
            return Proxy.newProxyInstance(f93731a, new Class[]{InterfaceC30214a.class}, new C18627b(obj, exc, str));
        } catch (Exception unused) {
            return obj;
        }
    }
}
