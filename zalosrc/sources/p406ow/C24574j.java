package p406ow;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;

/* renamed from: ow.j */
/* loaded from: classes.dex */
public class C24574j implements InterfaceC24567c {

    /* renamed from: e */
    private static volatile C24574j f118293e;

    /* renamed from: a */
    private final C24570f f118294a;

    /* renamed from: b */
    private final C24568d f118295b;

    /* renamed from: c */
    private Context f118296c;

    /* renamed from: d */
    private final ArrayList f118297d = new ArrayList();

    private C24574j() {
        C24570f m127979c = C24570f.m127979c();
        this.f118294a = m127979c;
        this.f118295b = C24568d.m127974a();
        m127979c.m127984f(this);
    }

    /* renamed from: c */
    public static C24574j m127992c() {
        if (f118293e == null) {
            synchronized (C24574j.class) {
                try {
                    if (f118293e == null) {
                        f118293e = new C24574j();
                    }
                } finally {
                }
            }
        }
        return f118293e;
    }

    /* renamed from: d */
    private boolean m127993d(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m127994e(int i11, int i12) {
        if (i11 == 1) {
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        switch (i12) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            default:
                return false;
        }
    }

    @Override // p406ow.InterfaceC24567c
    /* renamed from: a */
    public void mo47667a(EnumC24566b enumC24566b) {
        int size = this.f118297d.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((InterfaceC24567c) this.f118297d.get(i11)).mo47667a(enumC24566b);
        }
    }

    /* renamed from: b */
    public EnumC24566b m127995b() {
        Context context;
        EnumC24566b m127983b = this.f118294a.m127983b();
        if (m127983b.equals(EnumC24566b.UNKNOWN) && (context = this.f118296c) != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (m127993d(activeNetworkInfo)) {
                if (m127994e(activeNetworkInfo.getType(), activeNetworkInfo.getSubtype())) {
                    return EnumC24566b.GOOD;
                }
                return EnumC24566b.POOR;
            }
            return m127983b;
        }
        return m127983b;
    }

    /* renamed from: f */
    public EnumC24566b m127996f(InterfaceC24567c interfaceC24567c) {
        if (interfaceC24567c != null) {
            this.f118297d.add(interfaceC24567c);
        }
        return m127995b();
    }

    /* renamed from: g */
    public void m127997g() {
        this.f118294a.m127985g();
    }

    /* renamed from: h */
    public void m127998h(Context context) {
        this.f118296c = context;
    }

    /* renamed from: i */
    public void m127999i() {
        this.f118295b.m127975b();
    }

    /* renamed from: j */
    public void m128000j() {
        this.f118295b.m127976c();
    }
}
