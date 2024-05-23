package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.r4 */
/* loaded from: classes2.dex */
final class C4933r4 {

    /* renamed from: a */
    private final C4970s4 f27069a = new C4970s4();

    /* renamed from: b */
    private final x02 f27070b = new x02(new byte[65025], 0);

    /* renamed from: c */
    private int f27071c = -1;

    /* renamed from: d */
    private int f27072d;

    /* renamed from: e */
    private boolean f27073e;

    /* renamed from: f */
    private final int m25949f(int i11) {
        int i12;
        int i13 = 0;
        this.f27072d = 0;
        do {
            int i14 = this.f27072d;
            int i15 = i11 + i14;
            C4970s4 c4970s4 = this.f27069a;
            if (i15 >= c4970s4.f27522c) {
                break;
            }
            int[] iArr = c4970s4.f27525f;
            this.f27072d = i14 + 1;
            i12 = iArr[i15];
            i13 += i12;
        } while (i12 == 255);
        return i13;
    }

    /* renamed from: a */
    public final x02 m25950a() {
        return this.f27070b;
    }

    /* renamed from: b */
    public final C4970s4 m25951b() {
        return this.f27069a;
    }

    /* renamed from: c */
    public final void m25952c() {
        this.f27069a.m26244a();
        this.f27070b.m27772c(0);
        this.f27071c = -1;
        this.f27073e = false;
    }

    /* renamed from: d */
    public final void m25953d() {
        x02 x02Var = this.f27070b;
        if (x02Var.m27777h().length == 65025) {
            return;
        }
        x02Var.m27773d(Arrays.copyOf(x02Var.m27777h(), Math.max(65025, x02Var.m27781l())), this.f27070b.m27781l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:            return false;     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m25954e(km4 km4Var) {
        if (this.f27073e) {
            this.f27073e = false;
            this.f27070b.m27772c(0);
        }
        while (true) {
            boolean z11 = true;
            if (this.f27073e) {
                return true;
            }
            int i11 = this.f27071c;
            if (i11 < 0) {
                if (!this.f27069a.m26246c(km4Var, -1L) || !this.f27069a.m26245b(km4Var, true)) {
                    break;
                }
                C4970s4 c4970s4 = this.f27069a;
                int i12 = c4970s4.f27523d;
                if ((c4970s4.f27520a & 1) == 1 && this.f27070b.m27781l() == 0) {
                    i12 += m25949f(0);
                    i11 = this.f27072d;
                } else {
                    i11 = 0;
                }
                if (!nm4.m24967e(km4Var, i12)) {
                    return false;
                }
                this.f27071c = i11;
            }
            int m25949f = m25949f(i11);
            int i13 = this.f27071c + this.f27072d;
            if (m25949f > 0) {
                x02 x02Var = this.f27070b;
                x02Var.m27769H(x02Var.m27781l() + m25949f);
                x02 x02Var2 = this.f27070b;
                if (!nm4.m24966d(km4Var, x02Var2.m27777h(), x02Var2.m27781l(), m25949f)) {
                    return false;
                }
                x02 x02Var3 = this.f27070b;
                x02Var3.m27774e(x02Var3.m27781l() + m25949f);
                if (this.f27069a.f27525f[i13 - 1] == 255) {
                    z11 = false;
                }
                this.f27073e = z11;
            }
            if (i13 == this.f27069a.f27522c) {
                i13 = -1;
            }
            this.f27071c = i13;
        }
    }
}
