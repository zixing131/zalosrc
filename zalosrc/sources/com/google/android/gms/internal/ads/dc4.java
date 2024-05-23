package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class dc4 {

    /* renamed from: a */
    public final int f19175a;

    /* renamed from: b */
    public final gf4 f19176b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f19177c;

    private dc4(CopyOnWriteArrayList copyOnWriteArrayList, int i11, gf4 gf4Var) {
        this.f19177c = copyOnWriteArrayList;
        this.f19175a = i11;
        this.f19176b = gf4Var;
    }

    /* renamed from: a */
    public final dc4 m21345a(int i11, gf4 gf4Var) {
        return new dc4(this.f19177c, i11, gf4Var);
    }

    /* renamed from: b */
    public final void m21346b(Handler handler, ec4 ec4Var) {
        ec4Var.getClass();
        this.f19177c.add(new cc4(handler, ec4Var));
    }

    /* renamed from: c */
    public final void m21347c(ec4 ec4Var) {
        Iterator it = this.f19177c.iterator();
        while (it.hasNext()) {
            cc4 cc4Var = (cc4) it.next();
            if (cc4Var.f18181b == ec4Var) {
                this.f19177c.remove(cc4Var);
            }
        }
    }

    public dc4() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
