package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.play_billing.i1 */
/* loaded from: classes2.dex */
public abstract class AbstractC5774i1 extends AbstractC5868y {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C5871y2 zzc = C5871y2.m30568c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static AbstractC5774i1 m30275f(Class cls) {
        Map map = zzb;
        AbstractC5774i1 abstractC5774i1 = (AbstractC5774i1) map.get(cls);
        if (abstractC5774i1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC5774i1 = (AbstractC5774i1) map.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (abstractC5774i1 == null) {
            abstractC5774i1 = (AbstractC5774i1) ((AbstractC5774i1) AbstractC5770h3.m30257j(cls)).mo30165q(6, null, null);
            if (abstractC5774i1 != null) {
                map.put(cls, abstractC5774i1);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC5774i1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public static AbstractC5774i1 m30276h(AbstractC5774i1 abstractC5774i1, byte[] bArr, C5869y0 c5869y0) {
        AbstractC5774i1 m30281s = m30281s(abstractC5774i1, bArr, 0, bArr.length, c5869y0);
        if (m30281s != null && !m30281s.m30290o()) {
            zzff m30590a = new zzhc(m30281s).m30590a();
            m30590a.m30589f(m30281s);
            throw m30590a;
        }
        return m30281s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Object m30277i(Method method, Object obj, Object... objArr) {
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
    /* renamed from: j */
    public static Object m30278j(InterfaceC5775i2 interfaceC5775i2, String str, Object[] objArr) {
        return new C5829r2(interfaceC5775i2, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static void m30279m(Class cls, AbstractC5774i1 abstractC5774i1) {
        abstractC5774i1.m30288l();
        zzb.put(cls, abstractC5774i1);
    }

    /* renamed from: r */
    private final int m30280r(InterfaceC5835s2 interfaceC5835s2) {
        return C5823q2.m30431a().m30432b(getClass()).zza(this);
    }

    /* renamed from: s */
    private static AbstractC5774i1 m30281s(AbstractC5774i1 abstractC5774i1, byte[] bArr, int i11, int i12, C5869y0 c5869y0) {
        AbstractC5774i1 m30286g = abstractC5774i1.m30286g();
        try {
            InterfaceC5835s2 m30432b = C5823q2.m30431a().m30432b(m30286g.getClass());
            m30432b.mo30357f(m30286g, bArr, 0, i12, new C5729b0(c5869y0));
            m30432b.mo30352a(m30286g);
            return m30286g;
        } catch (zzff e11) {
            e11.m30589f(m30286g);
            throw e11;
        } catch (zzhc e12) {
            zzff m30590a = e12.m30590a();
            m30590a.m30589f(m30286g);
            throw m30590a;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzff) {
                throw ((zzff) e13.getCause());
            }
            zzff zzffVar = new zzff(e13);
            zzffVar.m30589f(m30286g);
            throw zzffVar;
        } catch (IndexOutOfBoundsException unused) {
            zzff m30588g = zzff.m30588g();
            m30588g.m30589f(m30286g);
            throw m30588g;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5775i2
    /* renamed from: a */
    public final void mo30282a(AbstractC5845u0 abstractC5845u0) {
        C5823q2.m30431a().m30432b(getClass()).mo30356e(this, C5851v0.m30528J(abstractC5845u0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5868y
    /* renamed from: b */
    public final int mo30283b(InterfaceC5835s2 interfaceC5835s2) {
        if (m30291p()) {
            int zza = interfaceC5835s2.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i11 = this.zzd & Integer.MAX_VALUE;
        if (i11 == Integer.MAX_VALUE) {
            int zza2 = interfaceC5835s2.zza(this);
            if (zza2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
                return zza2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
        }
        return i11;
    }

    /* renamed from: d */
    final int m30284d() {
        return C5823q2.m30431a().m30432b(getClass()).zzb(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final AbstractC5762g1 m30285e() {
        return (AbstractC5762g1) mo30165q(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C5823q2.m30431a().m30432b(getClass()).mo30354c(this, (AbstractC5774i1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final AbstractC5774i1 m30286g() {
        return (AbstractC5774i1) mo30165q(4, null, null);
    }

    public final int hashCode() {
        if (!m30291p()) {
            int i11 = this.zza;
            if (i11 == 0) {
                int m30284d = m30284d();
                this.zza = m30284d;
                return m30284d;
            }
            return i11;
        }
        return m30284d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final void m30287k() {
        C5823q2.m30431a().m30432b(getClass()).mo30352a(this);
        m30288l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final void m30288l() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m30289n(int i11) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: o */
    public final boolean m30290o() {
        AbstractC5774i1 abstractC5774i1;
        byte byteValue = ((Byte) mo30165q(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo30355d = C5823q2.m30431a().m30432b(getClass()).mo30355d(this);
        if (true != mo30355d) {
            abstractC5774i1 = null;
        } else {
            abstractC5774i1 = this;
        }
        mo30165q(2, abstractC5774i1, null);
        return mo30355d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean m30291p() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public abstract Object mo30165q(int i11, Object obj, Object obj2);

    public final String toString() {
        return AbstractC5787k2.m30313a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5775i2
    public final int zze() {
        int i11;
        if (m30291p()) {
            i11 = m30280r(null);
            if (i11 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i11);
            }
        } else {
            i11 = this.zzd & Integer.MAX_VALUE;
            if (i11 == Integer.MAX_VALUE) {
                i11 = m30280r(null);
                if (i11 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i11;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i11);
                }
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5781j2
    public final /* synthetic */ InterfaceC5775i2 zzf() {
        return (AbstractC5774i1) mo30165q(6, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5775i2
    public final /* synthetic */ InterfaceC5769h2 zzk() {
        return (AbstractC5762g1) mo30165q(5, null, null);
    }
}
