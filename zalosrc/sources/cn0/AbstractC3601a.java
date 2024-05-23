package cn0;

import pm0.AbstractC24845f;

/* renamed from: cn0.a */
/* loaded from: classes.dex */
public abstract class AbstractC3601a {
    /* renamed from: a */
    public static final void m18219a(AutoCloseable autoCloseable, Throwable th2) {
        if (autoCloseable != null) {
            if (th2 == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th3) {
                AbstractC24845f.m129182a(th2, th3);
            }
        }
    }
}
