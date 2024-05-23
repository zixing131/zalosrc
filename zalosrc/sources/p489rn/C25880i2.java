package p489rn;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bo.AbstractC3012n2;
import bo.C2982h2;
import bo.C3007m2;
import bo.C3022p2;
import bo.InterfaceC3045u2;
import com.zing.zalo.feed.components.EmptyContentView;
import com.zing.zalo.feed.components.MusicRowCategoryItemView;
import com.zing.zalo.feed.components.MusicRowSongItemView;
import com.zing.zalo.feed.mvp.profile.ProfileSkeletonView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: rn.i2 */
/* loaded from: classes4.dex */
public final class C25880i2 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private Context f123420r;

    /* renamed from: s */
    private List f123421s;

    /* renamed from: t */
    private a f123422t;

    /* renamed from: rn.i2$a */
    /* loaded from: classes4.dex */
    public interface a extends InterfaceC3045u2, EmptyContentView.InterfaceC8078a {
    }

    /* renamed from: rn.i2$b */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private EmptyContentView f123423I;

        /* renamed from: J */
        private MusicRowSongItemView f123424J;

        /* renamed from: K */
        private MusicRowCategoryItemView f123425K;

        /* renamed from: L */
        private ProfileSkeletonView f123426L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            m133525m0(view, i11);
        }

        /* renamed from: i0 */
        public final MusicRowCategoryItemView m133521i0() {
            return this.f123425K;
        }

        /* renamed from: j0 */
        public final EmptyContentView m133522j0() {
            return this.f123423I;
        }

        /* renamed from: k0 */
        public final ProfileSkeletonView m133523k0() {
            return this.f123426L;
        }

        /* renamed from: l0 */
        public final MusicRowSongItemView m133524l0() {
            return this.f123424J;
        }

        /* renamed from: m0 */
        public final void m133525m0(View view, int i11) {
            AbstractC19074t.m100208f(view, "convertView");
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            this.f123425K = (MusicRowCategoryItemView) view;
                            return;
                        }
                        return;
                    }
                    this.f123423I = (EmptyContentView) view;
                    return;
                }
                this.f123426L = (ProfileSkeletonView) view;
                return;
            }
            this.f123424J = (MusicRowSongItemView) view;
        }
    }

    public C25880i2(Context context) {
        List m131502j;
        AbstractC19074t.m100208f(context, "context");
        this.f123420r = context;
        m131502j = AbstractC25368s.m131502j();
        this.f123421s = m131502j;
    }

    /* renamed from: L */
    public final AbstractC3012n2 m133515L(int i11) {
        return (AbstractC3012n2) this.f123421s.get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        MusicRowCategoryItemView m133521i0;
        AbstractC19074t.m100208f(bVar, "holder");
        try {
            int mo10005m = mo10005m(i11);
            AbstractC3012n2 abstractC3012n2 = (AbstractC3012n2) this.f123421s.get(i11);
            if (mo10005m != 0) {
                if (mo10005m != 1) {
                    if (mo10005m != 2) {
                        if (mo10005m == 3 && (m133521i0 = bVar.m133521i0()) != null) {
                            AbstractC19074t.m100206d(abstractC3012n2, "null cannot be cast to non-null type com.zing.zalo.feed.models.MusicCategoryRow");
                            m133521i0.m44450b(((C2982h2) abstractC3012n2).m14140b());
                            m133521i0.setListener(this.f123422t);
                        }
                    } else {
                        EmptyContentView m133522j0 = bVar.m133522j0();
                        if (m133522j0 != null) {
                            AbstractC19074t.m100206d(abstractC3012n2, "null cannot be cast to non-null type com.zing.zalo.feed.models.MusicEmptyRow");
                            m133522j0.m43610e(((C3007m2) abstractC3012n2).m14418b());
                            m133522j0.setEmptyContentListener(this.f123422t);
                        }
                    }
                } else {
                    ProfileSkeletonView m133523k0 = bVar.m133523k0();
                    if (m133523k0 != null) {
                        m133523k0.setSkeletonLayoutType(6);
                    }
                }
            } else {
                MusicRowSongItemView m133524l0 = bVar.m133524l0();
                if (m133524l0 != null) {
                    AbstractC19074t.m100206d(abstractC3012n2, "null cannot be cast to non-null type com.zing.zalo.feed.models.MusicSongRow");
                    m133524l0.m44458Y(((C3022p2) abstractC3012n2).m14543b());
                    m133524l0.setListener(this.f123422t);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View musicRowSongItemView;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        musicRowSongItemView = new View(this.f123420r);
                    } else {
                        musicRowSongItemView = new MusicRowCategoryItemView(this.f123420r);
                    }
                } else {
                    musicRowSongItemView = new EmptyContentView(this.f123420r);
                }
            } else {
                musicRowSongItemView = new ProfileSkeletonView(this.f123420r);
                musicRowSongItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            }
        } else {
            musicRowSongItemView = new MusicRowSongItemView(this.f123420r);
        }
        return new b(musicRowSongItemView, i11);
    }

    /* renamed from: O */
    public final void m133518O(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f123421s = list;
    }

    /* renamed from: P */
    public final void m133519P(a aVar) {
        this.f123422t = aVar;
    }

    /* renamed from: Q */
    public final void m133520Q(C3022p2 c3022p2) {
        int m131511r;
        AbstractC19074t.m100208f(c3022p2, "musicRow");
        Iterator it = this.f123421s.iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (it.hasNext()) {
                AbstractC3012n2 abstractC3012n2 = (AbstractC3012n2) it.next();
                if ((abstractC3012n2 instanceof C3022p2) && AbstractC19074t.m100204b(((C3022p2) abstractC3012n2).m14543b(), c3022p2.m14543b())) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        List list = this.f123421s;
        m131511r = AbstractC25370t.m131511r(list, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (Object obj : list) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            AbstractC3012n2 abstractC3012n22 = (AbstractC3012n2) obj;
            if (i11 == i12) {
                abstractC3012n22 = c3022p2;
            }
            arrayList.add(abstractC3012n22);
            i11 = i13;
        }
        this.f123421s = arrayList;
        m10010r(i12, c3022p2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f123421s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return m133515L(i11).m14429a();
    }
}
