package p716zh;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: zh.x6 */
/* loaded from: classes3.dex */
public final class C32175x6 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f148367a;

    /* renamed from: b */
    private final String f148368b;

    /* renamed from: c */
    private int f148369c;

    /* renamed from: zh.x6$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C32175x6(int i11, String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f148367a = i11;
        this.f148368b = str;
    }

    /* renamed from: a */
    public final int m155166a() {
        return this.f148367a;
    }

    /* renamed from: b */
    public final int m155167b() {
        return this.f148369c;
    }

    /* renamed from: c */
    public final String m155168c() {
        return this.f148368b;
    }

    /* renamed from: d */
    public final void m155169d(int i11) {
        this.f148369c = i11;
    }
}
