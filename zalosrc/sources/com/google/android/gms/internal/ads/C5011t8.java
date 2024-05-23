package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.t8 */
/* loaded from: classes2.dex */
public final class C5011t8 {

    /* renamed from: c */
    public static final boolean f28254c = AbstractC5048u8.f28785a;

    /* renamed from: a */
    private final List f28255a = new ArrayList();

    /* renamed from: b */
    private boolean f28256b = false;

    /* renamed from: a */
    public final synchronized void m26586a(String str, long j11) {
        if (!this.f28256b) {
            this.f28255a.add(new C4974s8(str, j11, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    /* renamed from: b */
    public final synchronized void m26587b(String str) {
        long j11;
        this.f28256b = true;
        if (this.f28255a.size() == 0) {
            j11 = 0;
        } else {
            j11 = ((C4974s8) this.f28255a.get(r1.size() - 1)).f27589c - ((C4974s8) this.f28255a.get(0)).f27589c;
        }
        if (j11 <= 0) {
            return;
        }
        long j12 = ((C4974s8) this.f28255a.get(0)).f27589c;
        AbstractC5048u8.m26866a("(%-4d ms) %s", Long.valueOf(j11), str);
        for (C4974s8 c4974s8 : this.f28255a) {
            long j13 = c4974s8.f27589c;
            AbstractC5048u8.m26866a("(+%-4d) [%2d] %s", Long.valueOf(j13 - j12), Long.valueOf(c4974s8.f27588b), c4974s8.f27587a);
            j12 = j13;
        }
    }

    protected final void finalize() {
        if (!this.f28256b) {
            m26587b("Request on the loose");
            AbstractC5048u8.m26867b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
