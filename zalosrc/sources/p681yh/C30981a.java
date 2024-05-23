package p681yh;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.provider.Settings;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import mm0.AbstractC23351f;
import p363nh.C23744a;
import p609wh.AbstractC28998a;
import p645xh.C29628e;
import vg.C28023b6;

/* renamed from: yh.a */
/* loaded from: classes.dex */
public class C30981a {

    /* renamed from: d */
    public static EnumC30982b f142932d;

    /* renamed from: e */
    public static long f142933e;

    /* renamed from: f */
    private static volatile C30981a f142934f;

    /* renamed from: a */
    private EnumC30982b f142935a = EnumC30982b.CONNECTING;

    /* renamed from: b */
    private long f142936b = 0;

    /* renamed from: c */
    private boolean f142937c = m150600h(MainApplication.getAppContext());

    private C30981a() {
    }

    /* renamed from: f */
    public static synchronized C30981a m150598f() {
        C30981a c30981a;
        synchronized (C30981a.class) {
            try {
                if (f142934f == null) {
                    f142934f = new C30981a();
                }
                c30981a = f142934f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c30981a;
    }

    /* renamed from: g */
    public static boolean m150599g(Context context) {
        ConnectivityManager connectivityManager;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m150600h(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            if (activeNetworkInfo.getType() != 0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: j */
    private void m150601j(EnumC30982b enumC30982b) {
        try {
            EnumC30982b enumC30982b2 = this.f142935a;
            if (enumC30982b2 == enumC30982b && this.f142936b != 0) {
                return;
            }
            AbstractC20110a.m104535d("change connection-state: %s -> %s", enumC30982b2, enumC30982b);
            AbstractC23351f.m122784a(String.format("change connection-state: %s -> %s", this.f142935a, enumC30982b), true);
            this.f142935a = enumC30982b;
            this.f142936b = System.currentTimeMillis();
            C23744a.m124114c().m124116d(73, enumC30982b);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m150602a() {
        try {
            EnumC30982b enumC30982b = this.f142935a;
            EnumC30982b enumC30982b2 = EnumC30982b.CONNECT_LIMITED;
            if (enumC30982b == enumC30982b2) {
                return;
            }
            String m144872a = AbstractC28998a.m144872a();
            if (m144872a != null) {
                m150601j(enumC30982b2);
                C28023b6.m141250h0().m141355k1(m144872a);
            } else {
                C28023b6.m141250h0().m141391w();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m150603b(String str) {
        try {
            EnumC30982b enumC30982b = this.f142935a;
            EnumC30982b enumC30982b2 = EnumC30982b.CONNECT_LIMITED;
            if (enumC30982b == enumC30982b2) {
                return;
            }
            if (str != null) {
                m150601j(enumC30982b2);
                C28023b6.m141250h0().m141355k1(str);
            } else {
                C28023b6.m141250h0().m141391w();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:17:0x0048). Please report as a decompilation issue!!! */
    /* renamed from: c */
    public void m150604c() {
        try {
            if (C29628e.m147249E0().m93432x()) {
                return;
            }
            if (!m150599g(CoreUtility.getAppContext())) {
                AbstractC20110a.m104535d("update network signal", new Object[0]);
                try {
                    if (Settings.System.getInt(CoreUtility.getAppContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
                        m150601j(EnumC30982b.AIRPLANE);
                    } else {
                        m150601j(EnumC30982b.NO_NETWORK);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    m150601j(EnumC30982b.NO_NETWORK);
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: d */
    public EnumC30982b m150605d() {
        return this.f142935a;
    }

    /* renamed from: e */
    public C30983c m150606e() {
        return new C30983c(this.f142935a, this.f142936b);
    }

    /* renamed from: i */
    public boolean m150607i() {
        return this.f142937c;
    }

    /* renamed from: k */
    public void m150608k() {
        this.f142937c = m150600h(MainApplication.getAppContext());
        m150601j(EnumC30982b.CONNECTED);
        C28023b6.m141250h0().m141391w();
    }

    /* renamed from: l */
    public void m150609l() {
        if (this.f142935a == EnumC30982b.CONNECT_LIMITED) {
            return;
        }
        this.f142937c = m150600h(MainApplication.getAppContext());
        m150601j(EnumC30982b.CONNECTING);
    }
}
