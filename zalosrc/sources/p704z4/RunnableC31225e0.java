package p704z4;

import com.google.android.gms.signin.internal.zak;

/* renamed from: z4.e0 */
/* loaded from: classes2.dex */
final class RunnableC31225e0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zak f144247p;

    /* renamed from: q */
    final /* synthetic */ BinderC31229g0 f144248q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC31225e0(BinderC31229g0 binderC31229g0, zak zakVar) {
        this.f144248q = binderC31229g0;
        this.f144247p = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC31229g0.m152107Y4(this.f144248q, this.f144247p);
    }
}
