package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5471l4;
import com.google.android.gms.internal.measurement.C5658w4;
import java.util.ArrayList;
import java.util.List;
import p230i6.AbstractC20334z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j9 */
/* loaded from: classes.dex */
public final class C6033j9 {

    /* renamed from: a */
    C5658w4 f34116a;

    /* renamed from: b */
    List f34117b;

    /* renamed from: c */
    List f34118c;

    /* renamed from: d */
    long f34119d;

    /* renamed from: e */
    final /* synthetic */ C6055l9 f34120e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C6033j9(C6055l9 c6055l9, AbstractC20334z abstractC20334z) {
        this.f34120e = c6055l9;
    }

    /* renamed from: b */
    private static final long m30968b(C5471l4 c5471l4) {
        return ((c5471l4.m29396D() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m30969a(long j11, C5471l4 c5471l4) {
        AbstractC4205o.m19722k(c5471l4);
        if (this.f34118c == null) {
            this.f34118c = new ArrayList();
        }
        if (this.f34117b == null) {
            this.f34117b = new ArrayList();
        }
        if (!this.f34118c.isEmpty() && m30968b((C5471l4) this.f34118c.get(0)) != m30968b(c5471l4)) {
            return false;
        }
        long mo29645a = this.f34119d + c5471l4.mo29645a();
        this.f34120e.m31072U();
        if (mo29645a >= Math.max(0, ((Integer) AbstractC5972e3.f33927k.m30827a(null)).intValue())) {
            return false;
        }
        this.f34119d = mo29645a;
        this.f34118c.add(c5471l4);
        this.f34117b.add(Long.valueOf(j11));
        int size = this.f34118c.size();
        this.f34120e.m31072U();
        if (size >= Math.max(1, ((Integer) AbstractC5972e3.f33929l.m30827a(null)).intValue())) {
            return false;
        }
        return true;
    }
}
