package me0;

import ag0.AbstractC0837p0;
import android.content.Context;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import java.util.Hashtable;
import java.util.Map;
import me0.AbstractC23044d5;

/* renamed from: me0.d5 */
/* loaded from: classes.dex */
public abstract class AbstractC23044d5 {

    /* renamed from: a */
    private static final Map f112048a = new Hashtable();

    /* renamed from: me0.d5$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void m118233a();

        void onFailed();
    }

    /* renamed from: b */
    public static boolean m118229b(EnumC16739a enumC16739a) {
        Map map = f112048a;
        if (!map.containsKey(enumC16739a) || ((Integer) map.get(enumC16739a)).intValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static /* synthetic */ void m118230c(Context context, EnumC16739a enumC16739a, a aVar) {
        try {
            NativeLoader.m89238q(context, enumC16739a);
            f112048a.put(enumC16739a, 1);
            aVar.m118233a();
        } catch (Throwable th2) {
            th2.printStackTrace();
            f112048a.put(enumC16739a, -1);
            aVar.onFailed();
        }
    }

    /* renamed from: d */
    public static int m118231d(Context context, EnumC16739a enumC16739a) {
        Map map = f112048a;
        if (map.containsKey(enumC16739a) && ((Integer) map.get(enumC16739a)).intValue() == 1) {
            return 2;
        }
        try {
            NativeLoader.m89238q(context, enumC16739a);
            map.put(enumC16739a, 1);
            return 1;
        } catch (Throwable th2) {
            th2.printStackTrace();
            f112048a.put(enumC16739a, -1);
            return -1;
        }
    }

    /* renamed from: e */
    public static void m118232e(Context context, EnumC16739a enumC16739a, a aVar) {
        Map map = f112048a;
        if (map.containsKey(enumC16739a) && ((Integer) map.get(enumC16739a)).intValue() == 1) {
            aVar.m118233a();
        } else {
            AbstractC0837p0.m2225f().mo2040a(new Runnable(context, enumC16739a, aVar) { // from class: me0.c5

                /* renamed from: p */
                public final /* synthetic */ Context f112022p;

                /* renamed from: q */
                public final /* synthetic */ EnumC16739a f112023q;

                public /* synthetic */ RunnableC23033c5(Context context2, EnumC16739a enumC16739a2, AbstractC23044d5.a aVar2) {
                    this.f112022p = context2;
                    this.f112023q = enumC16739a2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23044d5.m118230c(this.f112022p, this.f112023q, null);
                }
            });
        }
    }
}
