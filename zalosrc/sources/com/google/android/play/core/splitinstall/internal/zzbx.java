package com.google.android.play.core.splitinstall.internal;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzbx extends RuntimeException {
    private zzbx(Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    /* renamed from: c */
    public static Object m33402c(Callable callable) {
        callable.getClass();
        try {
            return callable.call();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new zzbx(e12);
        }
    }

    @Override // java.lang.Throwable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    /* renamed from: b */
    public final Exception m33404b(Class cls) {
        int indexOf;
        String str;
        int i11 = 0;
        Class[] clsArr = {cls};
        for (int i12 = 0; i12 <= 0; i12++) {
            Class cls2 = clsArr[i12];
            if (!(!RuntimeException.class.isAssignableFrom(cls2))) {
                Object[] objArr = new Object[2];
                objArr[0] = "getCause";
                objArr[1] = cls2;
                for (int i13 = 0; i13 < 2; i13++) {
                    Object obj = objArr[i13];
                    if (obj == null) {
                        str = "null";
                    } else {
                        try {
                            str = obj.toString();
                        } catch (Exception e11) {
                            String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e11);
                            str = "<" + str2 + " threw " + e11.getClass().getName() + ">";
                        }
                    }
                    objArr[i13] = str;
                }
                StringBuilder sb2 = new StringBuilder(118);
                int i14 = 0;
                while (i11 < 2 && (indexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i14)) != -1) {
                    sb2.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i14, indexOf);
                    sb2.append(objArr[i11]);
                    i14 = indexOf + 2;
                    i11++;
                }
                sb2.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i14, 86);
                if (i11 < 2) {
                    sb2.append(" [");
                    sb2.append(objArr[i11]);
                    for (int i15 = i11 + 1; i15 < 2; i15++) {
                        sb2.append(", ");
                        sb2.append(objArr[i15]);
                    }
                    sb2.append(']');
                }
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        if (cls.isInstance(getCause())) {
            return (Exception) cls.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException(String.format("getCause(%s) doesn't match underlying exception", cls));
        classCastException.initCause(cause);
        throw classCastException;
    }
}
