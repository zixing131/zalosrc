package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u53 implements Iterable {

    /* renamed from: p */
    final /* synthetic */ CharSequence f28758p;

    /* renamed from: q */
    final /* synthetic */ x53 f28759q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u53(x53 x53Var, CharSequence charSequence) {
        this.f28759q = x53Var;
        this.f28758p = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator m27832g;
        m27832g = this.f28759q.m27832g(this.f28758p);
        return m27832g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb2.append(z43.m28433a(it.next(), ", "));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    sb2.append(z43.m28433a(it.next(), ", "));
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}
