package wf0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: wf0.i */
/* loaded from: classes5.dex */
public final class C28964i {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static C28964i f134066b;

    /* renamed from: a */
    private final Set f134067a = new LinkedHashSet();

    /* renamed from: wf0.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28964i m144662a() {
            if (C28964i.f134066b == null) {
                C28964i.f134066b = new C28964i();
            }
            C28964i c28964i = C28964i.f134066b;
            AbstractC19074t.m100205c(c28964i);
            return c28964i;
        }
    }

    /* renamed from: c */
    public final boolean m144658c(String str) {
        boolean z11;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        synchronized (this.f134067a) {
            if (this.f134067a.contains(str)) {
                z11 = true;
            } else {
                this.f134067a.add(str);
                z11 = false;
            }
        }
        return z11;
    }

    /* renamed from: d */
    public final boolean m144659d(String str) {
        boolean contains;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        synchronized (this.f134067a) {
            contains = this.f134067a.contains(str);
        }
        return contains;
    }

    /* renamed from: e */
    public final void m144660e(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        synchronized (this.f134067a) {
            this.f134067a.add(str);
        }
    }

    /* renamed from: f */
    public final void m144661f(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        synchronized (this.f134067a) {
            this.f134067a.remove(str);
        }
    }
}
