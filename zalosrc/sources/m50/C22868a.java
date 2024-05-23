package m50;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.feed.mvp.profile.ProfileSkeletonView;
import com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.RingtoneCategoryViewCell;
import com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.RingtoneEmptyContentViewCell;
import com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.RingtoneViewCell;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n50.AbstractC23574h;
import n50.C23569c;
import n50.C23570d;
import n50.C23572f;
import n50.InterfaceC23568b;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: m50.a */
/* loaded from: classes5.dex */
public final class C22868a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private Context f111477r;

    /* renamed from: s */
    private List f111478s;

    /* renamed from: t */
    private a f111479t;

    /* renamed from: m50.a$a */
    /* loaded from: classes5.dex */
    public interface a extends InterfaceC23568b, RingtoneEmptyContentViewCell.InterfaceC11246a {
    }

    /* renamed from: m50.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private RingtoneEmptyContentViewCell f111480I;

        /* renamed from: J */
        private RingtoneViewCell f111481J;

        /* renamed from: K */
        private RingtoneCategoryViewCell f111482K;

        /* renamed from: L */
        private ProfileSkeletonView f111483L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            m117551m0(view, i11);
        }

        /* renamed from: i0 */
        public final RingtoneCategoryViewCell m117547i0() {
            return this.f111482K;
        }

        /* renamed from: j0 */
        public final RingtoneEmptyContentViewCell m117548j0() {
            return this.f111480I;
        }

        /* renamed from: k0 */
        public final RingtoneViewCell m117549k0() {
            return this.f111481J;
        }

        /* renamed from: l0 */
        public final ProfileSkeletonView m117550l0() {
            return this.f111483L;
        }

        /* renamed from: m0 */
        public final void m117551m0(View view, int i11) {
            AbstractC19074t.m100208f(view, "convertView");
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            this.f111482K = (RingtoneCategoryViewCell) view;
                            return;
                        }
                        return;
                    }
                    this.f111480I = (RingtoneEmptyContentViewCell) view;
                    return;
                }
                this.f111483L = (ProfileSkeletonView) view;
                return;
            }
            this.f111481J = (RingtoneViewCell) view;
        }
    }

    public C22868a(Context context) {
        List m131502j;
        AbstractC19074t.m100208f(context, "context");
        this.f111477r = context;
        m131502j = AbstractC25368s.m131502j();
        this.f111478s = m131502j;
    }

    /* renamed from: L */
    public final AbstractC23574h m117541L(int i11) {
        return (AbstractC23574h) this.f111478s.get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        RingtoneCategoryViewCell m117547i0;
        AbstractC19074t.m100208f(bVar, "holder");
        try {
            int mo10005m = mo10005m(i11);
            AbstractC23574h abstractC23574h = (AbstractC23574h) this.f111478s.get(i11);
            if (mo10005m != 0) {
                if (mo10005m != 1) {
                    if (mo10005m != 2) {
                        if (mo10005m == 3 && (m117547i0 = bVar.m117547i0()) != null) {
                            AbstractC19074t.m100206d(abstractC23574h, "null cannot be cast to non-null type com.zing.zalo.ui.call.settingringtone.presenter.data.RingtoneCategoryRow");
                            m117547i0.m58983b(((C23569c) abstractC23574h).m123633b());
                            m117547i0.setListener(this.f111479t);
                        }
                    } else {
                        RingtoneEmptyContentViewCell m117548j0 = bVar.m117548j0();
                        if (m117548j0 != null) {
                            AbstractC19074t.m100206d(abstractC23574h, "null cannot be cast to non-null type com.zing.zalo.ui.call.settingringtone.presenter.data.RingtoneEmptyRow");
                            m117548j0.m58994e(((C23572f) abstractC23574h).m123672b());
                            m117548j0.setEmptyContentListener(this.f111479t);
                        }
                    }
                } else {
                    ProfileSkeletonView m117550l0 = bVar.m117550l0();
                    if (m117550l0 != null) {
                        m117550l0.setSkeletonLayoutType(6);
                    }
                }
            } else {
                RingtoneViewCell m117549k0 = bVar.m117549k0();
                if (m117549k0 != null) {
                    AbstractC19074t.m100206d(abstractC23574h, "null cannot be cast to non-null type com.zing.zalo.ui.call.settingringtone.presenter.data.RingtoneDataRow");
                    RingtoneViewCell.m59001c0(m117549k0, ((C23570d) abstractC23574h).m123635c(), false, 2, null);
                    m117549k0.setListener(this.f111479t);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View ringtoneViewCell;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        ringtoneViewCell = new View(this.f111477r);
                    } else {
                        ringtoneViewCell = new RingtoneCategoryViewCell(this.f111477r);
                    }
                } else {
                    ringtoneViewCell = new RingtoneEmptyContentViewCell(this.f111477r);
                }
            } else {
                ringtoneViewCell = new ProfileSkeletonView(this.f111477r);
                ringtoneViewCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            }
        } else {
            ringtoneViewCell = new RingtoneViewCell(this.f111477r);
        }
        return new b(ringtoneViewCell, i11);
    }

    /* renamed from: O */
    public final void m117544O(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f111478s = list;
    }

    /* renamed from: P */
    public final void m117545P(a aVar) {
        this.f111479t = aVar;
    }

    /* renamed from: Q */
    public final void m117546Q(C23570d c23570d) {
        int m131511r;
        AbstractC19074t.m100208f(c23570d, "ringtoneDataRow");
        Iterator it = this.f111478s.iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (it.hasNext()) {
                AbstractC23574h abstractC23574h = (AbstractC23574h) it.next();
                if ((abstractC23574h instanceof C23570d) && AbstractC19074t.m100204b(((C23570d) abstractC23574h).m123635c(), c23570d.m123635c())) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        List list = this.f111478s;
        m131511r = AbstractC25370t.m131511r(list, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (Object obj : list) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            AbstractC23574h abstractC23574h2 = (AbstractC23574h) obj;
            if (i11 == i12) {
                abstractC23574h2 = c23570d;
            }
            arrayList.add(abstractC23574h2);
            i11 = i13;
        }
        this.f111478s = arrayList;
        m10010r(i12, c23570d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f111478s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return m117541L(i11).m123677a();
    }
}
