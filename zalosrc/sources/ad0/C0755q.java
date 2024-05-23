package ad0;

import fg0.ThreadFactoryC18928a;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: ad0.q */
/* loaded from: classes4.dex */
public final class C0755q extends ScheduledThreadPoolExecutor {

    /* renamed from: p */
    public static final C0755q f2526p = new C0755q();

    private C0755q() {
        super(3, new ThreadFactoryC18928a("RenderStickerWorker"));
    }
}
