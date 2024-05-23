package q20;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.data.remote.common.RestException;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import on0.AbstractC24341v;
import p594w1.C28685a;
import q20.C25097t;
import v00.AbstractC27413h;

/* renamed from: q20.t */
/* loaded from: classes5.dex */
public final class C25097t {

    /* renamed from: b */
    private static String f120557b;

    /* renamed from: d */
    private static String f120559d;

    /* renamed from: e */
    private static int f120560e;

    /* renamed from: g */
    private static long f120562g;

    /* renamed from: a */
    public static final C25097t f120556a = new C25097t();

    /* renamed from: c */
    private static long f120558c = -1;

    /* renamed from: f */
    private static long f120561f = -1;

    /* renamed from: h */
    private static final List f120563h = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q20.t$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static final C32943a Companion = new C32943a(null);

        /* renamed from: h */
        private static final Runnable f120564h = new Runnable() { // from class: q20.s
            @Override // java.lang.Runnable
            public final void run() {
                C25097t.a.m130162e();
            }
        };

        /* renamed from: a */
        private final Context f120565a;

        /* renamed from: b */
        private final String f120566b;

        /* renamed from: c */
        private final int f120567c;

        /* renamed from: d */
        private final int f120568d;

        /* renamed from: e */
        private final int f120569e;

        /* renamed from: f */
        private final int f120570f;

        /* renamed from: g */
        private Handler f120571g;

        /* renamed from: q20.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32943a {
            private C32943a() {
            }

            public /* synthetic */ C32943a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: b */
            public final void m130165b(long j11) {
                C25097t.f120562g = j11;
                C25097t.f120560e = 0;
                C25097t.f120563h.clear();
            }
        }

        public a(Context context, String str, int i11, int i12, int i13, int i14) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(str, "text");
            this.f120565a = context;
            this.f120566b = str;
            this.f120567c = i11;
            this.f120568d = i12;
            this.f120569e = i13;
            this.f120570f = i14;
            this.f120571g = new Handler(Looper.getMainLooper());
        }

        /* renamed from: b */
        private final void m130159b(long j11) {
            C25097t.f120560e++;
            C25097t.f120563h.add(this);
            if (C25097t.f120560e == 2) {
                Handler handler = this.f120571g;
                Runnable runnable = f120564h;
                handler.removeCallbacks(runnable);
                this.f120571g.postDelayed(runnable, j11);
            }
        }

        /* renamed from: c */
        private final boolean m130160c(long j11) {
            long j12;
            String str = C25097t.f120557b;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f120566b) || !AbstractC19074t.m100204b(str, this.f120566b) || C25097t.f120561f == -1 || C25097t.f120561f + C25097t.f120558c <= j11) {
                C25097t.f120557b = this.f120566b;
                C25097t.f120561f = j11;
                if (this.f120567c == 1) {
                    j12 = 5000;
                } else {
                    j12 = 2000;
                }
                C25097t.f120558c = j12;
                return false;
            }
            return true;
        }

        /* renamed from: d */
        private final void m130161d() {
            long j11;
            C28685a m143693b = C28685a.m143693b(this.f120565a);
            Intent intent = new Intent("com.zing.zalo.zchannel.toast");
            intent.putExtra("msg", this.f120566b);
            intent.putExtra("gravity", this.f120568d);
            intent.putExtra("xOffset", this.f120569e);
            intent.putExtra("yOffset", this.f120570f);
            if (this.f120567c == 1) {
                j11 = 5000;
            } else {
                j11 = 2000;
            }
            intent.putExtra("duration", j11);
            m143693b.m143696d(intent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m130162e() {
            if (C25097t.f120560e >= 5) {
                if (C25097t.f120563h.size() > 0 && !TextUtils.isEmpty(C25097t.f120559d) && !AbstractC19074t.m100204b(C25097t.f120559d, ((a) C25097t.f120563h.get(C25097t.f120563h.size() - 1)).f120566b)) {
                    ((a) C25097t.f120563h.get(C25097t.f120563h.size() - 1)).m130161d();
                }
            } else {
                Iterator it = C25097t.f120563h.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).m130161d();
                }
            }
            Companion.m130165b(System.currentTimeMillis());
        }

        /* renamed from: f */
        public final void m130163f() {
            long currentTimeMillis = System.currentTimeMillis();
            if (m130160c(currentTimeMillis)) {
                return;
            }
            long j11 = currentTimeMillis - C25097t.f120562g;
            if (j11 >= 1000 || j11 < 0) {
                Companion.m130165b(currentTimeMillis);
            }
            if (C25097t.f120560e == 0) {
                m130161d();
                C25097t.f120560e++;
                C25097t.f120559d = this.f120566b;
            } else if (j11 < 1000) {
                m130159b(1000 - j11);
            }
        }
    }

    private C25097t() {
    }

    /* renamed from: p */
    private final void m130149p(Context context, String str, int i11) {
        m130150q(context, str, i11, 17, 0, 0);
    }

    /* renamed from: q */
    private final void m130150q(Context context, String str, int i11, int i12, int i13, int i14) {
        boolean m127128x;
        if (context != null && str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                new a(context, str, i11, i12, i13, i14).m130163f();
            }
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m130151u(C25097t c25097t, Context context, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        c25097t.m130156s(context, i11, i12, i13);
    }

    /* renamed from: v */
    public static /* synthetic */ void m130152v(C25097t c25097t, Context context, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        c25097t.m130157t(context, str, i11, i12);
    }

    /* renamed from: n */
    public final void m130153n(Context context, int i11) {
        String str;
        if (context != null) {
            str = context.getString(i11);
        } else {
            str = null;
        }
        m130149p(context, str, 0);
    }

    /* renamed from: o */
    public final void m130154o(Context context, String str) {
        m130150q(context, str, 0, 17, 0, 0);
    }

    /* renamed from: r */
    public final void m130155r(Context context, Throwable th2) {
        String str;
        AbstractC19074t.m100208f(th2, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        if (th2 instanceof NetworkException) {
            m130153n(context, AbstractC27413h.zch_error_no_connection);
            return;
        }
        if (th2 instanceof RestException) {
            if (context != null) {
                str = context.getString(AbstractC27413h.zch_error_unknown_with_code, Integer.valueOf(((RestException) th2).m51529a()));
            } else {
                str = null;
            }
            m130154o(context, str);
            return;
        }
        m130153n(context, AbstractC27413h.zch_error_unknown);
    }

    /* renamed from: s */
    public final void m130156s(Context context, int i11, int i12, int i13) {
        String str;
        if (context != null) {
            str = context.getString(i11);
        } else {
            str = null;
        }
        m130157t(context, str, i12, i13);
    }

    /* renamed from: t */
    public final void m130157t(Context context, String str, int i11, int i12) {
        m130150q(context, str, 0, 48, i11, i12);
    }
}
