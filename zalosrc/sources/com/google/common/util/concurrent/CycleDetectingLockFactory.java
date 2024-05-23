package com.google.common.util.concurrent;

import com.google.common.collect.AbstractC6521e;

/* loaded from: classes3.dex */
public abstract class CycleDetectingLockFactory {

    /* loaded from: classes3.dex */
    public static final class PotentialDeadlockException extends C6532a {

        /* renamed from: r */
        private final C6532a f36374r;

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb2 = new StringBuilder(super.getMessage());
            for (Throwable th2 = this.f36374r; th2 != null; th2 = th2.getCause()) {
                sb2.append(", ");
                sb2.append(th2.getMessage());
            }
            return sb2.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    /* loaded from: classes3.dex */
    private static class C6532a extends IllegalStateException {

        /* renamed from: p */
        static final StackTraceElement[] f36375p = new StackTraceElement[0];

        /* renamed from: q */
        static final AbstractC6521e f36376q = AbstractC6521e.m33428u(CycleDetectingLockFactory.class.getName(), C6532a.class.getName(), C6533b.class.getName());
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    /* loaded from: classes3.dex */
    private static class C6533b {
    }
}
