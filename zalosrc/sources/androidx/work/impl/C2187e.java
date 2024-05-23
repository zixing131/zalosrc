package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.AbstractC1442h;
import androidx.work.InterfaceC2141d0;

/* renamed from: androidx.work.impl.e */
/* loaded from: classes.dex */
public class C2187e implements InterfaceC2141d0 {

    /* renamed from: a */
    private final Handler f9248a = AbstractC1442h.m7349a(Looper.getMainLooper());

    @Override // androidx.work.InterfaceC2141d0
    /* renamed from: a */
    public void mo11502a(Runnable runnable) {
        this.f9248a.removeCallbacks(runnable);
    }

    @Override // androidx.work.InterfaceC2141d0
    /* renamed from: b */
    public void mo11503b(long j11, Runnable runnable) {
        this.f9248a.postDelayed(runnable, j11);
    }
}
