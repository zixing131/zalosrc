package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p227i3.C20219w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class ob3 extends va3 {

    /* renamed from: y */
    private static final lb3 f25531y;

    /* renamed from: z */
    private static final Logger f25532z = Logger.getLogger(ob3.class.getName());

    /* renamed from: w */
    private volatile Set f25533w = null;

    /* renamed from: x */
    private volatile int f25534x;

    static {
        lb3 nb3Var;
        Throwable th2;
        try {
            nb3Var = new mb3(AtomicReferenceFieldUpdater.newUpdater(ob3.class, Set.class, C20219w.f100062c), AtomicIntegerFieldUpdater.newUpdater(ob3.class, "x"));
            th2 = null;
        } catch (Error | RuntimeException e11) {
            nb3Var = new nb3(null);
            th2 = e11;
        }
        f25531y = nb3Var;
        if (th2 != null) {
            f25532z.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public ob3(int i11) {
        this.f25534x = i11;
    }

    /* renamed from: D */
    public static /* synthetic */ int m25113D(ob3 ob3Var) {
        int i11 = ob3Var.f25534x - 1;
        ob3Var.f25534x = i11;
        return i11;
    }

    /* renamed from: E */
    public final int m25116E() {
        return f25531y.mo24190a(this);
    }

    /* renamed from: H */
    public final Set m25117H() {
        Set set = this.f25533w;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            mo23587J(newSetFromMap);
            f25531y.mo24191b(this, null, newSetFromMap);
            Set set2 = this.f25533w;
            set2.getClass();
            return set2;
        }
        return set;
    }

    /* renamed from: I */
    public final void m25118I() {
        this.f25533w = null;
    }

    /* renamed from: J */
    abstract void mo23587J(Set set);
}
