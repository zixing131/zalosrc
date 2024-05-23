package wa0;

import android.content.Context;
import android.graphics.Canvas;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19060k;
import mm0.AbstractC23350e;

/* renamed from: wa0.z */
/* loaded from: classes6.dex */
public final class C28900z extends C16719g {
    public static final a Companion = new a(null);

    /* renamed from: D0 */
    private C28899y f133793D0;

    /* renamed from: wa0.z$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C28900z(Context context) {
        super(context);
        this.f133793D0 = new C28899y(this);
    }

    /* renamed from: g1 */
    public final void m144356g1() {
        this.f133793D0.m144354e();
    }

    /* renamed from: h1 */
    public final void m144357h1() {
        this.f133793D0.m144355g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        try {
            this.f133793D0.m144353c(canvas);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLToolStorageVoiceView", e11);
        }
    }
}
