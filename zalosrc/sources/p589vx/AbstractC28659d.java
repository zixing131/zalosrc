package p589vx;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p624wx.C29259b;

/* renamed from: vx.d */
/* loaded from: classes4.dex */
public abstract class AbstractC28659d {

    /* renamed from: a */
    private final C29259b f132885a;

    /* renamed from: b */
    private final String f132886b;

    /* renamed from: vx.d$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC28659d {

        /* renamed from: c */
        private final JSONObject f132887c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C29259b c29259b, String str, JSONObject jSONObject) {
            super(c29259b, str, null);
            AbstractC19074t.m100208f(c29259b, "catalog");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(jSONObject, "linkDataJSON");
            this.f132887c = jSONObject;
        }

        /* renamed from: b */
        public final JSONObject m143404b() {
            return this.f132887c;
        }
    }

    /* renamed from: vx.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC28659d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C29259b c29259b, String str) {
            super(c29259b, str, null);
            AbstractC19074t.m100208f(c29259b, "catalog");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        }
    }

    public /* synthetic */ AbstractC28659d(C29259b c29259b, String str, AbstractC19060k abstractC19060k) {
        this(c29259b, str);
    }

    /* renamed from: a */
    public final String m143403a() {
        return this.f132886b;
    }

    private AbstractC28659d(C29259b c29259b, String str) {
        this.f132885a = c29259b;
        this.f132886b = str;
    }
}
