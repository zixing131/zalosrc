package p258j7;

/* renamed from: j7.w0 */
/* loaded from: classes3.dex */
final class RunnableC20983w0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AbstractC20944d f102898p;

    /* renamed from: q */
    final /* synthetic */ int f102899q;

    /* renamed from: r */
    final /* synthetic */ int f102900r;

    /* renamed from: s */
    final /* synthetic */ C20985x0 f102901s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC20983w0(C20985x0 c20985x0, AbstractC20944d abstractC20944d, int i11, int i12) {
        this.f102901s = c20985x0;
        this.f102898p = abstractC20944d;
        this.f102899q = i11;
        this.f102900r = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C20985x0 c20985x0 = this.f102901s;
        AbstractC20944d abstractC20944d = this.f102898p;
        c20985x0.m109541i(new C20948f(abstractC20944d.mo109485h(), this.f102899q, this.f102900r, abstractC20944d.mo109479a(), abstractC20944d.mo109487j(), abstractC20944d.mo109489l(), abstractC20944d.mo109488k(), abstractC20944d.mo109484g(), abstractC20944d.mo109490m()));
    }
}
