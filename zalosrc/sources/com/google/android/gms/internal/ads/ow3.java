package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ow3 {

    /* renamed from: a */
    private final ArrayDeque f25983a = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ow3(nw3 nw3Var) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ mt3 m25348a(ow3 ow3Var, mt3 mt3Var, mt3 mt3Var2) {
        ow3Var.m25349b(mt3Var);
        ow3Var.m25349b(mt3Var2);
        mt3 mt3Var3 = (mt3) ow3Var.f25983a.pop();
        while (!ow3Var.f25983a.isEmpty()) {
            mt3Var3 = new sw3((mt3) ow3Var.f25983a.pop(), mt3Var3);
        }
        return mt3Var3;
    }

    /* renamed from: b */
    private final void m25349b(mt3 mt3Var) {
        rw3 rw3Var;
        if (mt3Var.mo23015t()) {
            int m25350c = m25350c(mt3Var.mo22168p());
            int m26447U = sw3.m26447U(m25350c + 1);
            if (!this.f25983a.isEmpty() && ((mt3) this.f25983a.peek()).mo22168p() < m26447U) {
                int m26447U2 = sw3.m26447U(m25350c);
                mt3 mt3Var2 = (mt3) this.f25983a.pop();
                while (true) {
                    rw3Var = null;
                    if (this.f25983a.isEmpty() || ((mt3) this.f25983a.peek()).mo22168p() >= m26447U2) {
                        break;
                    } else {
                        mt3Var2 = new sw3((mt3) this.f25983a.pop(), mt3Var2);
                    }
                }
                sw3 sw3Var = new sw3(mt3Var2, mt3Var);
                while (!this.f25983a.isEmpty()) {
                    if (((mt3) this.f25983a.peek()).mo22168p() >= sw3.m26447U(m25350c(sw3Var.mo22168p()) + 1)) {
                        break;
                    } else {
                        sw3Var = new sw3((mt3) this.f25983a.pop(), sw3Var);
                    }
                }
                this.f25983a.push(sw3Var);
                return;
            }
            this.f25983a.push(mt3Var);
            return;
        }
        if (mt3Var instanceof sw3) {
            sw3 sw3Var2 = (sw3) mt3Var;
            m25349b(sw3.m26448V(sw3Var2));
            m25349b(sw3.m26444P(sw3Var2));
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(mt3Var.getClass())));
    }

    /* renamed from: c */
    private static final int m25350c(int i11) {
        int binarySearch = Arrays.binarySearch(sw3.f28045y, i11);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }
}
