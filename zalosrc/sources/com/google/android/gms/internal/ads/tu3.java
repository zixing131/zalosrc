package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class tu3 extends vs3 {
    private static final Map zzb = new ConcurrentHashMap();
    protected yw3 zzc = yw3.m28369c();
    protected int zzd = -1;

    /* renamed from: A */
    public static void m26755A(Class cls, tu3 tu3Var) {
        zzb.put(cls, tu3Var);
    }

    /* renamed from: E */
    private static tu3 m26756E(tu3 tu3Var, byte[] bArr, int i11, int i12, gu3 gu3Var) {
        tu3 tu3Var2 = (tu3) tu3Var.mo20044D(4, null, null);
        try {
            tw3 m23057b = hw3.m23056a().m23057b(tu3Var2.getClass());
            m23057b.mo21232g(tu3Var2, bArr, 0, i12, new ys3(gu3Var));
            m23057b.mo21226a(tu3Var2);
            if (tu3Var2.zza == 0) {
                return tu3Var2;
            }
            throw new RuntimeException();
        } catch (zzgrq e11) {
            e = e11;
            if (e.m28828l()) {
                e = new zzgrq(e);
            }
            e.m28826h(tu3Var2);
            throw e;
        } catch (zzgtx e12) {
            zzgrq m28829a = e12.m28829a();
            m28829a.m28826h(tu3Var2);
            throw m28829a;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzgrq) {
                throw ((zzgrq) e13.getCause());
            }
            zzgrq zzgrqVar = new zzgrq(e13);
            zzgrqVar.m28826h(tu3Var2);
            throw zzgrqVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgrq m28825j = zzgrq.m28825j();
            m28825j.m28826h(tu3Var2);
            throw m28825j;
        }
    }

    /* renamed from: l */
    private static tu3 m26757l(tu3 tu3Var) {
        if (tu3Var != null && !tu3Var.m26771B()) {
            zzgrq m28829a = new zzgtx(tu3Var).m28829a();
            m28829a.m28826h(tu3Var);
            throw m28829a;
        }
        return tu3Var;
    }

    /* renamed from: n */
    public static tu3 m26758n(Class cls) {
        Map map = zzb;
        tu3 tu3Var = (tu3) map.get(cls);
        if (tu3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                tu3Var = (tu3) map.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (tu3Var == null) {
            tu3Var = (tu3) ((tu3) ix3.m23453o(cls)).mo20044D(6, null, null);
            if (tu3Var != null) {
                map.put(cls, tu3Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return tu3Var;
    }

    /* renamed from: o */
    public static tu3 m26759o(tu3 tu3Var, mt3 mt3Var) {
        gu3 m22615a = gu3.m22615a();
        vt3 mo23398x = mt3Var.mo23398x();
        tu3 tu3Var2 = (tu3) tu3Var.mo20044D(4, null, null);
        try {
            tw3 m23057b = hw3.m23056a().m23057b(tu3Var2.getClass());
            m23057b.mo21230e(tu3Var2, wt3.m27718B(mo23398x), m22615a);
            m23057b.mo21226a(tu3Var2);
            try {
                mo23398x.mo25260B(0);
                m26757l(tu3Var2);
                m26757l(tu3Var2);
                return tu3Var2;
            } catch (zzgrq e11) {
                e11.m28826h(tu3Var2);
                throw e11;
            }
        } catch (zzgrq e12) {
            e = e12;
            if (e.m28828l()) {
                e = new zzgrq(e);
            }
            e.m28826h(tu3Var2);
            throw e;
        } catch (zzgtx e13) {
            zzgrq m28829a = e13.m28829a();
            m28829a.m28826h(tu3Var2);
            throw m28829a;
        } catch (IOException e14) {
            if (e14.getCause() instanceof zzgrq) {
                throw ((zzgrq) e14.getCause());
            }
            zzgrq zzgrqVar = new zzgrq(e14);
            zzgrqVar.m28826h(tu3Var2);
            throw zzgrqVar;
        } catch (RuntimeException e15) {
            if (e15.getCause() instanceof zzgrq) {
                throw ((zzgrq) e15.getCause());
            }
            throw e15;
        }
    }

    /* renamed from: p */
    public static tu3 m26760p(tu3 tu3Var, byte[] bArr) {
        tu3 m26756E = m26756E(tu3Var, bArr, 0, bArr.length, gu3.m22615a());
        m26757l(m26756E);
        return m26756E;
    }

    /* renamed from: q */
    public static tu3 m26761q(tu3 tu3Var, mt3 mt3Var, gu3 gu3Var) {
        vt3 mo23398x = mt3Var.mo23398x();
        tu3 tu3Var2 = (tu3) tu3Var.mo20044D(4, null, null);
        try {
            tw3 m23057b = hw3.m23056a().m23057b(tu3Var2.getClass());
            m23057b.mo21230e(tu3Var2, wt3.m27718B(mo23398x), gu3Var);
            m23057b.mo21226a(tu3Var2);
            try {
                mo23398x.mo25260B(0);
                m26757l(tu3Var2);
                return tu3Var2;
            } catch (zzgrq e11) {
                e11.m28826h(tu3Var2);
                throw e11;
            }
        } catch (zzgrq e12) {
            e = e12;
            if (e.m28828l()) {
                e = new zzgrq(e);
            }
            e.m28826h(tu3Var2);
            throw e;
        } catch (zzgtx e13) {
            zzgrq m28829a = e13.m28829a();
            m28829a.m28826h(tu3Var2);
            throw m28829a;
        } catch (IOException e14) {
            if (e14.getCause() instanceof zzgrq) {
                throw ((zzgrq) e14.getCause());
            }
            zzgrq zzgrqVar = new zzgrq(e14);
            zzgrqVar.m28826h(tu3Var2);
            throw zzgrqVar;
        } catch (RuntimeException e15) {
            if (e15.getCause() instanceof zzgrq) {
                throw ((zzgrq) e15.getCause());
            }
            throw e15;
        }
    }

    /* renamed from: r */
    public static tu3 m26762r(tu3 tu3Var, InputStream inputStream, gu3 gu3Var) {
        vt3 m27354g = vt3.m27354g(inputStream, 4096);
        tu3 tu3Var2 = (tu3) tu3Var.mo20044D(4, null, null);
        try {
            tw3 m23057b = hw3.m23056a().m23057b(tu3Var2.getClass());
            m23057b.mo21230e(tu3Var2, wt3.m27718B(m27354g), gu3Var);
            m23057b.mo21226a(tu3Var2);
            m26757l(tu3Var2);
            return tu3Var2;
        } catch (zzgrq e11) {
            e = e11;
            if (e.m28828l()) {
                e = new zzgrq(e);
            }
            e.m28826h(tu3Var2);
            throw e;
        } catch (zzgtx e12) {
            zzgrq m28829a = e12.m28829a();
            m28829a.m28826h(tu3Var2);
            throw m28829a;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzgrq) {
                throw ((zzgrq) e13.getCause());
            }
            zzgrq zzgrqVar = new zzgrq(e13);
            zzgrqVar.m28826h(tu3Var2);
            throw zzgrqVar;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzgrq) {
                throw ((zzgrq) e14.getCause());
            }
            throw e14;
        }
    }

    /* renamed from: s */
    public static tu3 m26763s(tu3 tu3Var, byte[] bArr, gu3 gu3Var) {
        tu3 m26756E = m26756E(tu3Var, bArr, 0, bArr.length, gu3Var);
        m26757l(m26756E);
        return m26756E;
    }

    /* renamed from: t */
    public static yu3 m26764t() {
        return uu3.m27063g();
    }

    /* renamed from: u */
    public static yu3 m26765u(yu3 yu3Var) {
        int i11;
        int size = yu3Var.size();
        if (size == 0) {
            i11 = 10;
        } else {
            i11 = size + size;
        }
        return yu3Var.mo21159c(i11);
    }

    /* renamed from: v */
    public static bv3 m26766v() {
        return pv3.m25555g();
    }

    /* renamed from: w */
    public static cv3 m26767w() {
        return iw3.m23427e();
    }

    /* renamed from: x */
    public static cv3 m26768x(cv3 cv3Var) {
        int i11;
        int size = cv3Var.size();
        if (size == 0) {
            i11 = 10;
        } else {
            i11 = size + size;
        }
        return cv3Var.mo21159c(i11);
    }

    /* renamed from: y */
    public static Object m26769y(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: z */
    public static Object m26770z(zv3 zv3Var, String str, Object[] objArr) {
        return new jw3(zv3Var, str, objArr);
    }

    /* renamed from: B */
    public final boolean m26771B() {
        tu3 tu3Var;
        byte byteValue = ((Byte) mo20044D(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo21229d = hw3.m23056a().m23057b(getClass()).mo21229d(this);
        if (true != mo21229d) {
            tu3Var = null;
        } else {
            tu3Var = this;
        }
        mo20044D(2, tu3Var, null);
        return mo21229d;
    }

    /* renamed from: C */
    public final qu3 m26772C() {
        return (qu3) mo20044D(5, null, null);
    }

    /* renamed from: D */
    public abstract Object mo20044D(int i11, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.aw3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20309b() {
        return (tu3) mo20044D(6, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zv3
    /* renamed from: c */
    public final void mo26773c(bu3 bu3Var) {
        hw3.m23056a().m23057b(getClass()).mo21231f(this, cu3.m21066l(bu3Var));
    }

    @Override // com.google.android.gms.internal.ads.vs3
    /* renamed from: d */
    public final int mo26774d() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zv3
    /* renamed from: e */
    public final /* synthetic */ yv3 mo26775e() {
        qu3 qu3Var = (qu3) mo20044D(5, null, null);
        qu3Var.m25896l(this);
        return qu3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return hw3.m23056a().m23057b(getClass()).mo21228c(this, (tu3) obj);
    }

    @Override // com.google.android.gms.internal.ads.zv3
    /* renamed from: f */
    public final int mo26776f() {
        int i11 = this.zzd;
        if (i11 == -1) {
            int zza = hw3.m23056a().m23057b(getClass()).zza(this);
            this.zzd = zza;
            return zza;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zv3
    /* renamed from: g */
    public final /* synthetic */ yv3 mo26777g() {
        return (qu3) mo20044D(5, null, null);
    }

    public final int hashCode() {
        int i11 = this.zza;
        if (i11 != 0) {
            return i11;
        }
        int zzb2 = hw3.m23056a().m23057b(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.vs3
    /* renamed from: j */
    public final void mo26778j(int i11) {
        this.zzd = i11;
    }

    /* renamed from: m */
    public final qu3 m26779m() {
        qu3 qu3Var = (qu3) mo20044D(5, null, null);
        qu3Var.m25896l(this);
        return qu3Var;
    }

    public final String toString() {
        return bw3.m20763a(this, super.toString());
    }
}
