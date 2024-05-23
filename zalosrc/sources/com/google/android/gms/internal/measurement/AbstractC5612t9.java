package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.t9 */
/* loaded from: classes.dex */
public abstract class AbstractC5612t9 extends AbstractC5407h8 {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected C5495mb zzc = C5495mb.m29441c();

    /* renamed from: g */
    private final int m29635g(InterfaceC5393gb interfaceC5393gb) {
        if (interfaceC5393gb == null) {
            return C5342db.m29065a().m29066b(getClass()).zza(this);
        }
        return interfaceC5393gb.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static AbstractC5612t9 m29636j(Class cls) {
        Map map = zza;
        AbstractC5612t9 abstractC5612t9 = (AbstractC5612t9) map.get(cls);
        if (abstractC5612t9 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC5612t9 = (AbstractC5612t9) map.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (abstractC5612t9 == null) {
            abstractC5612t9 = (AbstractC5612t9) ((AbstractC5612t9) AbstractC5648vb.m29790j(cls)).mo28921z(6, null, null);
            if (abstractC5612t9 != null) {
                map.put(cls, abstractC5612t9);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC5612t9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static InterfaceC5680x9 m29637l() {
        return C5629u9.m29681g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static InterfaceC5697y9 m29638m() {
        return C5460ka.m29363e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static InterfaceC5697y9 m29639n(InterfaceC5697y9 interfaceC5697y9) {
        int i11;
        int size = interfaceC5697y9.size();
        if (size == 0) {
            i11 = 10;
        } else {
            i11 = size + size;
        }
        return interfaceC5697y9.mo28992c(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static InterfaceC5714z9 m29640o() {
        return C5359eb.m29093e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public static InterfaceC5714z9 m29641p(InterfaceC5714z9 interfaceC5714z9) {
        int i11;
        int size = interfaceC5714z9.size();
        if (size == 0) {
            i11 = 10;
        } else {
            i11 = size + size;
        }
        return interfaceC5714z9.mo28992c(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static Object m29642q(Method method, Object obj, Object... objArr) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public static Object m29643r(InterfaceC5647va interfaceC5647va, String str, Object[] objArr) {
        return new C5376fb(interfaceC5647va, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public static void m29644v(Class cls, AbstractC5612t9 abstractC5612t9) {
        abstractC5612t9.m29652u();
        zza.put(cls, abstractC5612t9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5647va
    /* renamed from: a */
    public final int mo29645a() {
        int i11;
        if (m29654x()) {
            i11 = m29635g(null);
            if (i11 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i11);
            }
        } else {
            i11 = this.zzd & Integer.MAX_VALUE;
            if (i11 == Integer.MAX_VALUE) {
                i11 = m29635g(null);
                if (i11 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i11;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i11);
                }
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5647va
    /* renamed from: b */
    public final void mo29646b(AbstractC5357e9 abstractC5357e9) {
        C5342db.m29065a().m29066b(getClass()).mo29159e(this, C5374f9.m29139J(abstractC5357e9));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5664wa
    /* renamed from: c */
    public final /* synthetic */ InterfaceC5647va mo29647c() {
        return (AbstractC5612t9) mo28921z(6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5407h8
    /* renamed from: d */
    public final int mo29187d(InterfaceC5393gb interfaceC5393gb) {
        if (m29654x()) {
            int m29635g = m29635g(interfaceC5393gb);
            if (m29635g >= 0) {
                return m29635g;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + m29635g);
        }
        int i11 = this.zzd & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int m29635g2 = m29635g(interfaceC5393gb);
        if (m29635g2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | m29635g2;
            return m29635g2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m29635g2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C5342db.m29065a().m29066b(getClass()).mo29157c(this, (AbstractC5612t9) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final AbstractC5561q9 m29648h() {
        return (AbstractC5561q9) mo28921z(5, null, null);
    }

    public final int hashCode() {
        if (!m29654x()) {
            int i11 = this.zzb;
            if (i11 == 0) {
                int m29655y = m29655y();
                this.zzb = m29655y;
                return m29655y;
            }
            return i11;
        }
        return m29655y();
    }

    /* renamed from: i */
    public final AbstractC5561q9 m29649i() {
        AbstractC5561q9 abstractC5561q9 = (AbstractC5561q9) mo28921z(5, null, null);
        abstractC5561q9.m29555i(this);
        return abstractC5561q9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final AbstractC5612t9 m29650k() {
        return (AbstractC5612t9) mo28921z(4, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m29651s() {
        C5342db.m29065a().m29066b(getClass()).mo29155a(this);
        m29652u();
    }

    public final String toString() {
        return AbstractC5681xa.m30024a(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final void m29652u() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final void m29653w(int i11) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean m29654x() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: y */
    final int m29655y() {
        return C5342db.m29065a().m29066b(getClass()).zzb(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public abstract Object mo28921z(int i11, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.InterfaceC5647va
    public final /* synthetic */ InterfaceC5630ua zzbJ() {
        return (AbstractC5561q9) mo28921z(5, null, null);
    }
}
