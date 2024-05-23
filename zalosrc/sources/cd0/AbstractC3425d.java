package cd0;

import android.view.View;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import kd0.C21693c;
import l30.AbstractC22055v0;
import me0.AbstractC23222t7;

/* renamed from: cd0.d */
/* loaded from: classes4.dex */
public abstract class AbstractC3425d implements AbstractC22055v0.j {

    /* renamed from: p */
    public C16716d f14383p;

    /* renamed from: q */
    C3977j f14384q;

    /* renamed from: r */
    C21693c f14385r;

    /* renamed from: s */
    C21693c f14386s;

    /* renamed from: t */
    C21693c f14387t;

    /* renamed from: u */
    public AbstractC22055v0.k f14388u;

    /* renamed from: v */
    public int f14389v = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m17194a(C16716d c16716d) {
        this.f14383p = c16716d;
        this.f14384q = new C3977j(c16716d.getContext());
        C21693c c21693c = new C21693c(c16716d.getContext());
        this.f14385r = c21693c;
        c21693c.mo111926w1(AbstractC16803z.default_avatar);
        this.f14385r.m111929z1(5);
        this.f14385r.m89106L().m89028L(-1, -1);
        C21693c c21693c2 = new C21693c(c16716d.getContext());
        this.f14386s = c21693c2;
        c21693c2.mo111926w1(AbstractC16803z.icn_play_android);
        this.f14386s.m111929z1(5);
        C16718f m89106L = this.f14386s.m89106L();
        int i11 = AbstractC23222t7.f112582r;
        m89106L.m89028L(i11, i11).m89071x(this.f14385r).m89067t(this.f14385r);
        C21693c c21693c3 = new C21693c(c16716d.getContext());
        this.f14387t = c21693c3;
        c21693c3.mo111926w1(AbstractC16803z.icon_story_feed_warning2);
        this.f14387t.m111929z1(5);
        C16718f m89106L2 = this.f14387t.m89106L();
        int i12 = AbstractC23222t7.f112514B;
        m89106L2.m89028L(i12, i12).m89071x(this.f14385r).m89067t(this.f14385r);
        this.f14387t.mo44614b1(8);
        this.f14383p.m89001g1(this.f14385r);
        this.f14383p.m89001g1(this.f14386s);
        this.f14383p.m89001g1(this.f14387t);
    }

    /* renamed from: b */
    public void m17195b(int i11) {
        int i12;
        this.f14389v = i11;
        AbstractC22055v0.k m115152l = AbstractC22055v0.m115152l(i11);
        this.f14388u = m115152l;
        if (m115152l != null) {
            C21693c c21693c = this.f14385r;
            if (c21693c != null) {
                c21693c.mo111927x1(m115152l.f108647f);
                this.f14385r.m89106L().m89060k0(this.f14388u.f108642a).m89030N(this.f14388u.f108643b);
                int i13 = this.f14388u.f108647f;
            }
            C21693c c21693c2 = this.f14386s;
            if (c21693c2 != null) {
                if (this.f14388u.f108646e) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                c21693c2.mo44614b1(i12);
                this.f14386s.m89106L().m89060k0(this.f14388u.f108644c).m89030N(this.f14388u.f108644c).m89034R(this.f14388u.f108645d).m89033Q(this.f14388u.f108645d);
            }
        }
    }

    @Override // l30.AbstractC22055v0.j
    public int getPopulatePosition() {
        return this.f14389v;
    }

    @Override // l30.AbstractC22055v0.j
    public C16719g getThumbModule() {
        return null;
    }

    @Override // l30.AbstractC22055v0.j
    public int getThumbRoundCorner() {
        AbstractC22055v0.k kVar = this.f14388u;
        if (kVar != null) {
            return kVar.f108647f;
        }
        return 0;
    }

    @Override // l30.AbstractC22055v0.j
    public View getThumbView() {
        return null;
    }
}
