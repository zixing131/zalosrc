package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class x53 {

    /* renamed from: a */
    private final v43 f30343a;

    /* renamed from: b */
    private final w53 f30344b;

    private x53(w53 w53Var) {
        u43 u43Var = u43.f28754q;
        this.f30344b = w53Var;
        this.f30343a = u43Var;
    }

    /* renamed from: b */
    public static x53 m27829b(int i11) {
        return new x53(new t53(4000));
    }

    /* renamed from: c */
    public static x53 m27830c(v43 v43Var) {
        return new x53(new r53(v43Var));
    }

    /* renamed from: g */
    public final Iterator m27832g(CharSequence charSequence) {
        return this.f30344b.mo25983a(this, charSequence);
    }

    /* renamed from: d */
    public final Iterable m27833d(CharSequence charSequence) {
        charSequence.getClass();
        return new u53(this, charSequence);
    }

    /* renamed from: f */
    public final List m27834f(CharSequence charSequence) {
        Iterator m27832g = m27832g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m27832g.hasNext()) {
            arrayList.add((String) m27832g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
