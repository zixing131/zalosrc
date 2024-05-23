package p589vx;

import com.zing.zalo.productcatalog.model.Product;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: vx.o */
/* loaded from: classes4.dex */
public abstract class AbstractC28670o {

    /* renamed from: a */
    private final Product f133078a;

    /* renamed from: b */
    private final String f133079b;

    /* renamed from: vx.o$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC28670o {

        /* renamed from: c */
        private final JSONObject f133080c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Product product, String str, JSONObject jSONObject) {
            super(product, str, null);
            AbstractC19074t.m100208f(product, "product");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(jSONObject, "linkDataJSON");
            this.f133080c = jSONObject;
        }

        /* renamed from: b */
        public final JSONObject m143578b() {
            return this.f133080c;
        }
    }

    /* renamed from: vx.o$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC28670o {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Product product, String str) {
            super(product, str, null);
            AbstractC19074t.m100208f(product, "product");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        }
    }

    public /* synthetic */ AbstractC28670o(Product product, String str, AbstractC19060k abstractC19060k) {
        this(product, str);
    }

    /* renamed from: a */
    public final String m143577a() {
        return this.f133079b;
    }

    private AbstractC28670o(Product product, String str) {
        this.f133078a = product;
        this.f133079b = str;
    }
}
