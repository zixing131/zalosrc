package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5327cd;

/* renamed from: com.google.android.gms.measurement.internal.o3 */
/* loaded from: classes.dex */
public final class C6082o3 extends AbstractC6062m5 {

    /* renamed from: c */
    private char f34254c;

    /* renamed from: d */
    private long f34255d;

    /* renamed from: e */
    private String f34256e;

    /* renamed from: f */
    private final C6060m3 f34257f;

    /* renamed from: g */
    private final C6060m3 f34258g;

    /* renamed from: h */
    private final C6060m3 f34259h;

    /* renamed from: i */
    private final C6060m3 f34260i;

    /* renamed from: j */
    private final C6060m3 f34261j;

    /* renamed from: k */
    private final C6060m3 f34262k;

    /* renamed from: l */
    private final C6060m3 f34263l;

    /* renamed from: m */
    private final C6060m3 f34264m;

    /* renamed from: n */
    private final C6060m3 f34265n;

    public C6082o3(C6127s4 c6127s4) {
        super(c6127s4);
        this.f34254c = (char) 0;
        this.f34255d = -1L;
        this.f34257f = new C6060m3(this, 6, false, false);
        this.f34258g = new C6060m3(this, 6, true, false);
        this.f34259h = new C6060m3(this, 6, false, true);
        this.f34260i = new C6060m3(this, 5, false, false);
        this.f34261j = new C6060m3(this, 5, true, false);
        this.f34262k = new C6060m3(this, 5, false, true);
        this.f34263l = new C6060m3(this, 4, false, false);
        this.f34264m = new C6060m3(this, 3, false, false);
        this.f34265n = new C6060m3(this, 2, false, false);
    }

    /* renamed from: A */
    public static String m31186A(boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String m31187B = m31187B(z11, obj);
        String m31187B2 = m31187B(z11, obj2);
        String m31187B3 = m31187B(z11, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m31187B)) {
            sb2.append(str2);
            sb2.append(m31187B);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(m31187B2)) {
            sb2.append(str2);
            sb2.append(m31187B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(m31187B3)) {
            sb2.append(str3);
            sb2.append(m31187B3);
        }
        return sb2.toString();
    }

    /* renamed from: B */
    static String m31187B(boolean z11, Object obj) {
        String str;
        String th2;
        String className;
        String str2 = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i11 = 0;
        if (obj instanceof Long) {
            if (!z11) {
                return obj.toString();
            }
            Long l11 = (Long) obj;
            if (Math.abs(l11.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l11.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder();
            if (charAt == '-') {
                str2 = "-";
            }
            sb2.append(str2);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str2);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th3 = (Throwable) obj;
            if (z11) {
                th2 = th3.getClass().getName();
            } else {
                th2 = th3.toString();
            }
            StringBuilder sb3 = new StringBuilder(th2);
            String m31188C = m31188C(C6127s4.class.getCanonicalName());
            StackTraceElement[] stackTrace = th3.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i11];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m31188C(className).equals(m31188C)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
                i11++;
            }
            return sb3.toString();
        }
        if (obj instanceof C6071n3) {
            str = ((C6071n3) obj).f34231a;
            return str;
        }
        if (z11) {
            return "-";
        }
        return obj.toString();
    }

    /* renamed from: C */
    static String m31188C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            C5327cd.m29029b();
            if (((Boolean) AbstractC5972e3.f33873A0.m30827a(null)).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: z */
    public static Object m31193z(String str) {
        if (str == null) {
            return null;
        }
        return new C6071n3(str);
    }

    /* renamed from: D */
    public final String m31194D() {
        String str;
        synchronized (this) {
            try {
                if (this.f34256e == null) {
                    if (this.f34158a.m31384Q() != null) {
                        this.f34256e = this.f34158a.m31384Q();
                    } else {
                        this.f34256e = this.f34158a.m31401z().m30932w();
                    }
                }
                AbstractC4205o.m19722k(this.f34256e);
                str = this.f34256e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: G */
    public final void m31195G(int i11, boolean z11, boolean z12, String str, Object obj, Object obj2, Object obj3) {
        int i12;
        if (!z11 && Log.isLoggable(m31194D(), i11)) {
            Log.println(i11, m31194D(), m31186A(false, str, obj, obj2, obj3));
        }
        if (!z12 && i11 >= 5) {
            AbstractC4205o.m19722k(str);
            C6105q4 m31375G = this.f34158a.m31375G();
            if (m31375G == null) {
                Log.println(6, m31194D(), "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!m31375G.m31143m()) {
                Log.println(6, m31194D(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i11 >= 9) {
                i12 = 8;
            } else {
                i12 = i11;
            }
            m31375G.m31296z(new RunnableC6049l3(this, i12, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6062m5
    /* renamed from: i */
    protected final boolean mo30816i() {
        return false;
    }

    /* renamed from: p */
    public final C6060m3 m31196p() {
        return this.f34264m;
    }

    /* renamed from: q */
    public final C6060m3 m31197q() {
        return this.f34257f;
    }

    /* renamed from: r */
    public final C6060m3 m31198r() {
        return this.f34259h;
    }

    /* renamed from: s */
    public final C6060m3 m31199s() {
        return this.f34258g;
    }

    /* renamed from: t */
    public final C6060m3 m31200t() {
        return this.f34263l;
    }

    /* renamed from: u */
    public final C6060m3 m31201u() {
        return this.f34265n;
    }

    /* renamed from: w */
    public final C6060m3 m31202w() {
        return this.f34260i;
    }

    /* renamed from: x */
    public final C6060m3 m31203x() {
        return this.f34262k;
    }

    /* renamed from: y */
    public final C6060m3 m31204y() {
        return this.f34261j;
    }
}
