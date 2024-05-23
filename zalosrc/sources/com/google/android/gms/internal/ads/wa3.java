package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma3;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import p148f3.C18710b;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class wa3 extends na3 {

    /* renamed from: a */
    static final Unsafe f29863a;

    /* renamed from: b */
    static final long f29864b;

    /* renamed from: c */
    static final long f29865c;

    /* renamed from: d */
    static final long f29866d;

    /* renamed from: e */
    static final long f29867e;

    /* renamed from: f */
    static final long f29868f;

    /* renamed from: com.google.android.gms.internal.ads.wa3$a */
    /* loaded from: classes2.dex */
    class C5125a implements PrivilegedExceptionAction {
        C5125a() {
        }

        /* renamed from: a */
        public static final Unsafe m27584a() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Object run() {
            return m27584a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C5125a());
            }
            try {
                f29865c = unsafe.objectFieldOffset(ma3.class.getDeclaredField("r"));
                f29864b = unsafe.objectFieldOffset(ma3.class.getDeclaredField("q"));
                f29866d = unsafe.objectFieldOffset(ma3.class.getDeclaredField("p"));
                f29867e = unsafe.objectFieldOffset(xa3.class.getDeclaredField("a"));
                f29868f = unsafe.objectFieldOffset(xa3.class.getDeclaredField(C18710b.f94009e));
                f29863a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            } catch (RuntimeException e12) {
                throw e12;
            }
        } catch (PrivilegedActionException e13) {
            throw new RuntimeException("Could not initialize intrinsics", e13.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ wa3(ma3.C4753a c4753a) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: a */
    public final qa3 mo24875a(ma3 ma3Var, qa3 qa3Var) {
        qa3 qa3Var2;
        do {
            qa3Var2 = ma3Var.f24456q;
            if (qa3Var == qa3Var2) {
                return qa3Var2;
            }
        } while (!mo24879e(ma3Var, qa3Var2, qa3Var));
        return qa3Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: b */
    public final xa3 mo24876b(ma3 ma3Var, xa3 xa3Var) {
        xa3 xa3Var2;
        do {
            xa3Var2 = ma3Var.f24457r;
            if (xa3Var == xa3Var2) {
                return xa3Var2;
            }
        } while (!mo24881g(ma3Var, xa3Var2, xa3Var));
        return xa3Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: c */
    public final void mo24877c(xa3 xa3Var, xa3 xa3Var2) {
        f29863a.putObject(xa3Var, f29868f, xa3Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: d */
    public final void mo24878d(xa3 xa3Var, Thread thread) {
        f29863a.putObject(xa3Var, f29867e, thread);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: e */
    public final boolean mo24879e(ma3 ma3Var, qa3 qa3Var, qa3 qa3Var2) {
        return bb3.m20470a(f29863a, ma3Var, f29864b, qa3Var, qa3Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: f */
    public final boolean mo24880f(ma3 ma3Var, Object obj, Object obj2) {
        return bb3.m20470a(f29863a, ma3Var, f29866d, obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: g */
    public final boolean mo24881g(ma3 ma3Var, xa3 xa3Var, xa3 xa3Var2) {
        return bb3.m20470a(f29863a, ma3Var, f29865c, xa3Var, xa3Var2);
    }
}
