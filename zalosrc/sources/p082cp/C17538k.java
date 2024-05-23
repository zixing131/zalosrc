package p082cp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bo.InterfaceC3045u2;
import com.zing.zalo.feed.components.LoadingLayoutWithIndeterminateProgressBar;
import com.zing.zalo.feed.mvp.feed.view.MoveTabUserDescriptionView;
import com.zing.zalo.feed.mvp.feed.view.MoveTabUserInfoView;
import com.zing.zalo.feed.mvp.feed.view.MoveTabUserRowView;
import com.zing.zalo.feed.mvp.feed.view.MoveTabUserSectionView;
import com.zing.zalo.feed.mvp.feed.view.component.TimelineEmptyContentView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.C23212s8;
import p425po.AbstractC24887i;
import p425po.AbstractC24888j;
import p425po.C24882d;
import p425po.C24883e;
import p425po.C24885g;
import p425po.C24886h;
import p425po.C24892n;

/* renamed from: cp.k */
/* loaded from: classes4.dex */
public final class C17538k extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private Context f89417r;

    /* renamed from: s */
    private List f89418s;

    /* renamed from: t */
    private a f89419t;

    /* renamed from: cp.k$a */
    /* loaded from: classes4.dex */
    public interface a extends InterfaceC3045u2, TimelineEmptyContentView.InterfaceC8571a {
    }

    /* renamed from: cp.k$b */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private TimelineEmptyContentView f89420I;

        /* renamed from: J */
        private MoveTabUserRowView f89421J;

        /* renamed from: K */
        private LoadingLayoutWithIndeterminateProgressBar f89422K;

        /* renamed from: L */
        private MoveTabUserSectionView f89423L;

        /* renamed from: M */
        private FrameLayout f89424M;

        /* renamed from: N */
        private MoveTabUserDescriptionView f89425N;

        /* renamed from: O */
        private MoveTabUserInfoView f89426O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            m93469o0(view, i11);
        }

        /* renamed from: i0 */
        public final MoveTabUserDescriptionView m93463i0() {
            return this.f89425N;
        }

        /* renamed from: j0 */
        public final TimelineEmptyContentView m93464j0() {
            return this.f89420I;
        }

        /* renamed from: k0 */
        public final MoveTabUserInfoView m93465k0() {
            return this.f89426O;
        }

        /* renamed from: l0 */
        public final MoveTabUserRowView m93466l0() {
            return this.f89421J;
        }

        /* renamed from: m0 */
        public final MoveTabUserSectionView m93467m0() {
            return this.f89423L;
        }

        /* renamed from: n0 */
        public final FrameLayout m93468n0() {
            return this.f89424M;
        }

        /* renamed from: o0 */
        public final void m93469o0(View view, int i11) {
            AbstractC19074t.m100208f(view, "convertView");
            switch (i11) {
                case 0:
                    this.f89421J = (MoveTabUserRowView) view;
                    return;
                case 1:
                    this.f89422K = (LoadingLayoutWithIndeterminateProgressBar) view;
                    return;
                case 2:
                    this.f89420I = (TimelineEmptyContentView) view;
                    return;
                case 3:
                    this.f89423L = (MoveTabUserSectionView) view;
                    return;
                case 4:
                    this.f89424M = (FrameLayout) view;
                    return;
                case 5:
                    this.f89425N = (MoveTabUserDescriptionView) view;
                    return;
                case 6:
                    this.f89426O = (MoveTabUserInfoView) view;
                    return;
                default:
                    return;
            }
        }
    }

    public C17538k(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f89417r = context;
        this.f89418s = new ArrayList();
    }

    /* renamed from: L */
    public final int m93455L(AbstractC24888j abstractC24888j, int i11, List list) {
        AbstractC19074t.m100208f(abstractC24888j, "sectionRowData");
        AbstractC19074t.m100208f(list, "childProfileRows");
        try {
            AbstractC24887i abstractC24887i = (AbstractC24887i) this.f89418s.get(i11);
            if ((abstractC24887i instanceof AbstractC24888j) && AbstractC19074t.m100204b(((AbstractC24888j) abstractC24887i).mo129392c(), abstractC24888j.mo129392c())) {
                this.f89418s.set(i11, abstractC24887i);
                if (!list.isEmpty()) {
                    this.f89418s.addAll(i11 + 1, list);
                    return list.size();
                }
                return -1;
            }
            return -1;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1;
        }
    }

    /* renamed from: M */
    public final AbstractC24887i m93456M(int i11) {
        return (AbstractC24887i) this.f89418s.get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        MoveTabUserInfoView m93465k0;
        AbstractC19074t.m100208f(bVar, "holder");
        try {
            int mo10005m = mo10005m(i11);
            AbstractC24887i abstractC24887i = (AbstractC24887i) this.f89418s.get(i11);
            if (mo10005m != 0) {
                if (mo10005m != 2) {
                    if (mo10005m != 3) {
                        if (mo10005m != 4) {
                            if (mo10005m != 5) {
                                if (mo10005m == 6 && (m93465k0 = bVar.m93465k0()) != null) {
                                    AbstractC19074t.m100206d(abstractC24887i, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.data.model.MoveTabInfoRow");
                                    m93465k0.m45607a((C24885g) abstractC24887i);
                                }
                            } else {
                                MoveTabUserDescriptionView m93463i0 = bVar.m93463i0();
                                if (m93463i0 != null) {
                                    AbstractC19074t.m100206d(abstractC24887i, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.data.model.MoveTabDescriptionRow");
                                    m93463i0.m45605a((C24882d) abstractC24887i);
                                }
                            }
                        } else {
                            FrameLayout m93468n0 = bVar.m93468n0();
                            if (m93468n0 != null) {
                                AbstractC19074t.m100206d(abstractC24887i, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.data.model.MoveTabSpaceDividerRow");
                                C24892n c24892n = (C24892n) abstractC24887i;
                                m93468n0.setLayoutParams(new ViewGroup.LayoutParams(-1, c24892n.m129413c()));
                                m93468n0.setBackgroundColor(c24892n.m129412b());
                            }
                        }
                    } else {
                        MoveTabUserSectionView m93467m0 = bVar.m93467m0();
                        if (m93467m0 != null) {
                            AbstractC19074t.m100206d(abstractC24887i, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.data.model.MoveTabSectionRow");
                            m93467m0.m45665c((AbstractC24888j) abstractC24887i);
                            m93467m0.setListener(this.f89419t);
                        }
                    }
                } else {
                    TimelineEmptyContentView m93464j0 = bVar.m93464j0();
                    if (m93464j0 != null) {
                        AbstractC19074t.m100206d(abstractC24887i, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.data.model.MoveTabEmptyRow");
                        m93464j0.m45691b(((C24883e) abstractC24887i).m129390b());
                        m93464j0.setEmptyContentListener(this.f89419t);
                        m93464j0.setBackgroundColor(C23212s8.m119607o(m93464j0.getContext(), AbstractC2807a.ui_background));
                    }
                }
            } else {
                MoveTabUserRowView m93466l0 = bVar.m93466l0();
                if (m93466l0 != null) {
                    AbstractC19074t.m100206d(abstractC24887i, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.data.model.MoveTabProfileRow");
                    m93466l0.m45657d((C24886h) abstractC24887i);
                    m93466l0.setListener(this.f89419t);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View moveTabUserRowView;
        View moveTabUserSectionView;
        AbstractC19074t.m100208f(viewGroup, "parent");
        switch (i11) {
            case 0:
                moveTabUserRowView = new MoveTabUserRowView(this.f89417r);
                break;
            case 1:
                moveTabUserRowView = new LoadingLayoutWithIndeterminateProgressBar(this.f89417r);
                moveTabUserRowView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                break;
            case 2:
                moveTabUserRowView = new TimelineEmptyContentView(this.f89417r);
                break;
            case 3:
                moveTabUserSectionView = new MoveTabUserSectionView(this.f89417r);
                moveTabUserSectionView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                moveTabUserRowView = moveTabUserSectionView;
                break;
            case 4:
                moveTabUserRowView = new FrameLayout(this.f89417r);
                break;
            case 5:
                moveTabUserRowView = new MoveTabUserDescriptionView(this.f89417r);
                break;
            case 6:
                moveTabUserSectionView = new MoveTabUserInfoView(this.f89417r);
                moveTabUserSectionView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                moveTabUserRowView = moveTabUserSectionView;
                break;
            default:
                moveTabUserRowView = new View(this.f89417r);
                break;
        }
        return new b(moveTabUserRowView, i11);
    }

    /* renamed from: P */
    public final int m93459P(AbstractC24888j abstractC24888j, int i11) {
        AbstractC19074t.m100208f(abstractC24888j, "sectionRowData");
        try {
            AbstractC24887i abstractC24887i = (AbstractC24887i) this.f89418s.get(i11);
            if ((abstractC24887i instanceof AbstractC24888j) && AbstractC19074t.m100204b(((AbstractC24888j) abstractC24887i).mo129392c(), abstractC24888j.mo129392c())) {
                ArrayList arrayList = new ArrayList();
                this.f89418s.set(i11, abstractC24887i);
                int size = this.f89418s.size();
                for (int i12 = i11 + 1; i12 < size; i12++) {
                    AbstractC24887i abstractC24887i2 = (AbstractC24887i) this.f89418s.get(i12);
                    if ((abstractC24887i2 instanceof C24886h) && AbstractC19074t.m100204b(((C24886h) abstractC24887i2).m129402d(), abstractC24888j.mo129392c())) {
                        arrayList.add(abstractC24887i2);
                    }
                }
                int size2 = arrayList.size();
                if (size2 > 0) {
                    this.f89418s.removeAll(arrayList);
                    return size2;
                }
                return -1;
            }
            return -1;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1;
        }
    }

    /* renamed from: Q */
    public final void m93460Q(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f89418s = list;
    }

    /* renamed from: R */
    public final void m93461R(a aVar) {
        this.f89419t = aVar;
    }

    /* renamed from: S */
    public final boolean m93462S(int i11, C24886h c24886h) {
        AbstractC19074t.m100208f(c24886h, "rowData");
        try {
            AbstractC24887i abstractC24887i = (AbstractC24887i) this.f89418s.get(i11);
            if ((abstractC24887i instanceof C24886h) && AbstractC19074t.m100204b(((C24886h) abstractC24887i).m129403e(), c24886h.m129403e())) {
                this.f89418s.set(i11, c24886h);
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f89418s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return m93456M(i11).m129409a();
    }
}
