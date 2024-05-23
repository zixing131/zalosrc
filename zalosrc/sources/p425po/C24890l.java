package p425po;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p425po.AbstractC24884f;
import p425po.AbstractC24888j;

/* renamed from: po.l */
/* loaded from: classes4.dex */
public final class C24890l extends AbstractC24884f {

    /* renamed from: j */
    private final String f119423j;

    /* renamed from: k */
    private final String f119424k;

    /* renamed from: l */
    private AbstractC24884f.c f119425l;

    /* renamed from: m */
    private final String f119426m;

    public /* synthetic */ C24890l(String str, String str2, AbstractC24884f.c cVar, String str3, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? AbstractC24884f.c.f119395p : cVar, (i11 & 8) != 0 ? "" : str3);
    }

    @Override // p425po.AbstractC24884f, p425po.AbstractC24888j
    /* renamed from: c */
    public String mo129392c() {
        return this.f119426m;
    }

    @Override // p425po.AbstractC24888j
    /* renamed from: d */
    public String mo129410d() {
        return this.f119423j;
    }

    @Override // p425po.AbstractC24884f
    /* renamed from: e */
    public AbstractC24884f.c mo129393e() {
        return this.f119425l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24890l)) {
            return false;
        }
        C24890l c24890l = (C24890l) obj;
        return AbstractC19074t.m100204b(this.f119423j, c24890l.f119423j) && AbstractC19074t.m100204b(this.f119424k, c24890l.f119424k) && this.f119425l == c24890l.f119425l && AbstractC19074t.m100204b(this.f119426m, c24890l.f119426m);
    }

    @Override // p425po.AbstractC24884f
    /* renamed from: f */
    public String mo129394f() {
        return this.f119424k;
    }

    @Override // p425po.AbstractC24884f
    /* renamed from: g */
    public void mo129395g(AbstractC24884f.c cVar) {
        AbstractC19074t.m100208f(cVar, "<set-?>");
        this.f119425l = cVar;
    }

    public int hashCode() {
        return (((((this.f119423j.hashCode() * 31) + this.f119424k.hashCode()) * 31) + this.f119425l.hashCode()) * 31) + this.f119426m.hashCode();
    }

    public String toString() {
        return "MoveTabSectionRowCategory(title=" + this.f119423j + ", subtitle=" + this.f119424k + ", expandableState=" + this.f119425l + ", tag=" + this.f119426m + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24890l(String str, String str2, AbstractC24884f.c cVar, String str3) {
        super(str, str2, AbstractC24888j.a.f119418p, cVar, str3);
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
        AbstractC19074t.m100208f(cVar, "expandableState");
        AbstractC19074t.m100208f(str3, "tag");
        this.f119423j = str;
        this.f119424k = str2;
        this.f119425l = cVar;
        this.f119426m = str3;
    }
}
