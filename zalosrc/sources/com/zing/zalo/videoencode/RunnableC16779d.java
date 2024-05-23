package com.zing.zalo.videoencode;

/* renamed from: com.zing.zalo.videoencode.d */
/* loaded from: classes5.dex */
public class RunnableC16779d implements Runnable {

    /* renamed from: p */
    private Throwable f85130p;

    /* renamed from: q */
    private final AbstractC16778c f85131q;

    private RunnableC16779d(AbstractC16778c abstractC16778c) {
        this.f85131q = abstractC16778c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m89572a(AbstractC16778c abstractC16778c) {
        RunnableC16779d runnableC16779d = new RunnableC16779d(abstractC16778c);
        Thread thread = new Thread(runnableC16779d, "Z:VideoEncoder");
        thread.start();
        thread.join();
        Throwable th2 = runnableC16779d.f85130p;
        if (th2 == null) {
        } else {
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f85131q.mo89541d();
        } catch (Throwable th2) {
            this.f85130p = th2;
        }
    }
}
