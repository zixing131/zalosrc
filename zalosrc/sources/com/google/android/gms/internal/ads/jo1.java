package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class jo1 {

    /* renamed from: a */
    private final w81 f22896a;

    /* renamed from: b */
    private final di1 f22897b;

    /* renamed from: c */
    private final hm1 f22898c;

    /* renamed from: d */
    private final CopyOnWriteArraySet f22899d;

    /* renamed from: e */
    private final ArrayDeque f22900e;

    /* renamed from: f */
    private final ArrayDeque f22901f;

    /* renamed from: g */
    private boolean f22902g;

    public jo1(Looper looper, w81 w81Var, hm1 hm1Var) {
        this(new CopyOnWriteArraySet(), looper, w81Var, hm1Var);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m23688g(jo1 jo1Var, Message message) {
        Iterator it = jo1Var.f22899d.iterator();
        while (it.hasNext()) {
            ((in1) it.next()).m23307b(jo1Var.f22898c);
            if (jo1Var.f22897b.zzf(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final jo1 m23689a(Looper looper, hm1 hm1Var) {
        return new jo1(this.f22899d, looper, this.f22896a, hm1Var);
    }

    /* renamed from: b */
    public final void m23690b(Object obj) {
        if (this.f22902g) {
            return;
        }
        this.f22899d.add(new in1(obj));
    }

    /* renamed from: c */
    public final void m23691c() {
        if (this.f22901f.isEmpty()) {
            return;
        }
        if (!this.f22897b.zzf(0)) {
            di1 di1Var = this.f22897b;
            di1Var.mo20004d(di1Var.mo20001a(0));
        }
        boolean isEmpty = this.f22900e.isEmpty();
        this.f22900e.addAll(this.f22901f);
        this.f22901f.clear();
        if (!(!isEmpty)) {
            while (!this.f22900e.isEmpty()) {
                ((Runnable) this.f22900e.peekFirst()).run();
                this.f22900e.removeFirst();
            }
        }
    }

    /* renamed from: d */
    public final void m23692d(final int i11, final gl1 gl1Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f22899d);
        this.f22901f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.fk1
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i12 = i11;
                gl1 gl1Var2 = gl1Var;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((in1) it.next()).m23306a(i12, gl1Var2);
                }
            }
        });
    }

    /* renamed from: e */
    public final void m23693e() {
        Iterator it = this.f22899d.iterator();
        while (it.hasNext()) {
            ((in1) it.next()).m23308c(this.f22898c);
        }
        this.f22899d.clear();
        this.f22902g = true;
    }

    /* renamed from: f */
    public final void m23694f(Object obj) {
        Iterator it = this.f22899d.iterator();
        while (it.hasNext()) {
            in1 in1Var = (in1) it.next();
            if (in1Var.f22234a.equals(obj)) {
                in1Var.m23308c(this.f22898c);
                this.f22899d.remove(in1Var);
            }
        }
    }

    private jo1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, w81 w81Var, hm1 hm1Var) {
        this.f22896a = w81Var;
        this.f22899d = copyOnWriteArraySet;
        this.f22898c = hm1Var;
        this.f22900e = new ArrayDeque();
        this.f22901f = new ArrayDeque();
        this.f22897b = w81Var.mo27578a(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.ej1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                jo1.m23688g(jo1.this, message);
                return true;
            }
        });
    }
}
