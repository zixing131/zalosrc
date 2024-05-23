package p231i7;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i7.t */
/* loaded from: classes3.dex */
public final class RunnableC20376t implements Runnable {

    /* renamed from: p */
    final /* synthetic */ Set f100398p;

    /* renamed from: q */
    final /* synthetic */ C20358b f100399q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC20376t(C20358b c20358b, Set set) {
        this.f100399q = c20358b;
        this.f100398p = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f100399q.m106116h(this.f100398p);
        } catch (Exception unused) {
        }
    }
}
