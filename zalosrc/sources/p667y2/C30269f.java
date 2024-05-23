package p667y2;

import android.content.Context;
import android.content.SharedPreferences;
import com.adtima.Adtima;
import java.util.HashSet;
import java.util.Set;
import p047c3.C3228a;
import p178g3.AbstractC19207b;

/* renamed from: y2.f */
/* loaded from: classes2.dex */
public class C30269f {

    /* renamed from: c */
    private static final String f140634c = "f";

    /* renamed from: d */
    private static final String f140635d;

    /* renamed from: e */
    private static final String f140636e;

    /* renamed from: f */
    private static C30269f f140637f;

    /* renamed from: a */
    private Context f140638a = Adtima.SharedContext;

    /* renamed from: b */
    private SharedPreferences f140639b;

    static {
        String simpleName = C30269f.class.getSimpleName();
        f140635d = simpleName + "-CONTENT";
        f140636e = simpleName + "-TIME";
        f140637f = null;
    }

    private C30269f() {
    }

    /* renamed from: a */
    private Set m149374a(C3228a c3228a) {
        HashSet hashSet = new HashSet();
        if (c3228a != null) {
            try {
                if (this.f140638a != null) {
                    String str = c3228a.m16367a() + "," + c3228a.m16385s() + "," + c3228a.m16371e() + "," + c3228a.m16383q() + "," + AbstractC19207b.m100799e(this.f140638a) + "," + (c3228a.m16380n() ? 1 : 0) + "," + c3228a.m16374h() + "," + c3228a.m16381o() + "," + c3228a.m16377k();
                    Adtima.m18328e(f140634c, "ADTIMA - Add Value: " + str);
                    Set m149380g = m149380g();
                    if (m149380g != null) {
                        hashSet.addAll(m149380g);
                    }
                    hashSet.add(str);
                }
            } catch (Exception e11) {
                Adtima.m18328e(f140634c, e11.toString());
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public static C30269f m149375b() {
        if (f140637f == null) {
            f140637f = new C30269f();
        }
        return f140637f;
    }

    /* renamed from: c */
    public boolean m149376c(long j11) {
        try {
            Context context = this.f140638a;
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(getClass().getName(), 0);
                this.f140639b = sharedPreferences;
                sharedPreferences.edit().putLong(f140636e, j11);
                return true;
            }
            return false;
        } catch (Exception e11) {
            Adtima.m18328e(f140634c, e11.toString());
            return false;
        }
    }

    /* renamed from: d */
    public boolean m149377d(Set set) {
        if (set != null) {
            try {
                Context context = this.f140638a;
                if (context != null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(getClass().getName(), 0);
                    this.f140639b = sharedPreferences;
                    sharedPreferences.edit().putStringSet(f140635d, set).apply();
                    return true;
                }
                return false;
            } catch (Exception e11) {
                Adtima.m18328e(f140634c, e11.toString());
                return false;
            }
        }
        return false;
    }

    /* renamed from: e */
    public long m149378e() {
        try {
            Context context = this.f140638a;
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(getClass().getName(), 0);
                this.f140639b = sharedPreferences;
                return sharedPreferences.getLong(f140636e, 0L);
            }
            return 0L;
        } catch (Exception e11) {
            Adtima.m18328e(f140634c, e11.toString());
            return 0L;
        }
    }

    /* renamed from: f */
    public boolean m149379f(C3228a c3228a) {
        if (c3228a != null) {
            try {
                Context context = this.f140638a;
                if (context != null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(getClass().getName(), 0);
                    this.f140639b = sharedPreferences;
                    sharedPreferences.edit().putStringSet(f140635d, m149374a(c3228a)).apply();
                    return true;
                }
                return false;
            } catch (Exception e11) {
                Adtima.m18328e(f140634c, e11.toString());
                return false;
            }
        }
        return false;
    }

    /* renamed from: g */
    public Set m149380g() {
        try {
            Context context = this.f140638a;
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(getClass().getName(), 0);
                this.f140639b = sharedPreferences;
                return sharedPreferences.getStringSet(f140635d, null);
            }
            return null;
        } catch (Exception e11) {
            Adtima.m18328e(f140634c, e11.toString());
            return null;
        }
    }

    /* renamed from: h */
    public int m149381h() {
        try {
            Set m149380g = m149380g();
            if (m149380g != null) {
                return m149380g.size();
            }
        } catch (Exception unused) {
        }
        return 0;
    }
}
