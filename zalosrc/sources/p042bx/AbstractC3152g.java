package p042bx;

import android.os.Handler;
import android.os.HandlerThread;
import com.zing.zalo.zmedia.player.ZMediaPlayer;

/* renamed from: bx.g */
/* loaded from: classes4.dex */
public abstract class AbstractC3152g {

    /* renamed from: a */
    private static final a f13315a = new a(ZMediaPlayer.OPTION_PLAYER_KEY_NUMBER_OF_LOOP);

    /* renamed from: b */
    private static final a f13316b = new a("loopAnr");

    /* renamed from: c */
    private static final a f13317c = new a("writer");

    /* renamed from: d */
    private static final a f13318d = new a("worker-ping");

    /* renamed from: bx.g$a */
    /* loaded from: classes4.dex */
    private static class a {

        /* renamed from: a */
        private final Handler f13319a;

        public a(String str) {
            HandlerThread handlerThread = new HandlerThread("Z:BlockCanary-" + str);
            handlerThread.start();
            this.f13319a = new Handler(handlerThread.getLooper());
        }

        /* renamed from: a */
        public Handler m15872a() {
            return this.f13319a;
        }
    }

    /* renamed from: a */
    public static Handler m15868a() {
        return f13318d.m15872a();
    }

    /* renamed from: b */
    public static Handler m15869b() {
        return f13315a.m15872a();
    }

    /* renamed from: c */
    public static Handler m15870c() {
        return f13316b.m15872a();
    }

    /* renamed from: d */
    public static Handler m15871d() {
        return f13317c.m15872a();
    }
}
