package p489rn;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bo.C2974g;
import bo.C2989j;
import bo.C2999l;
import bo.C3004m;
import bo.C3009n;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.components.AlbumItemSquareView;
import com.zing.zalo.feed.components.AlbumRowCreateAlbumView;
import com.zing.zalo.feed.components.AlbumRowDividerTitle;
import com.zing.zalo.feed.components.AlbumRowInputDescView;
import com.zing.zalo.feed.components.AlbumRowInputTitleView;
import com.zing.zalo.feed.components.AlbumRowPreviewAlbumView;
import com.zing.zalo.feed.components.AlbumRowPreviewGridView;
import com.zing.zalo.feed.components.AlbumRowPreviewThemeView;
import com.zing.zalo.feed.components.AlbumRowSelectInfoView;
import com.zing.zalo.feed.components.EmptyContentView;
import com.zing.zalo.feed.components.ProfileAlbumItemCreateSquareView;
import com.zing.zalo.feed.components.ProfileAlbumItemSeeMoreView;
import com.zing.zalo.feed.mvp.profile.ProfileSkeletonView;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.zview.animation.AnimationTarget;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p227i3.C20215s;
import qm0.AbstractC25368s;

/* renamed from: rn.a */
/* loaded from: classes4.dex */
public final class C25845a extends RecyclerView.AbstractC1880g {
    public static final b Companion = new b(null);

    /* renamed from: r */
    private Context f123266r;

    /* renamed from: s */
    private List f123267s;

    /* renamed from: t */
    private a f123268t;

    /* renamed from: rn.a$a */
    /* loaded from: classes4.dex */
    public interface a extends EmptyContentView.InterfaceC8078a, AlbumRowInputTitleView.InterfaceC8064a, AlbumRowInputDescView.InterfaceC8062a, AlbumRowSelectInfoView.InterfaceC8070a, AlbumRowPreviewGridView.InterfaceC8067a, AlbumRowPreviewAlbumView.InterfaceC8066a, AlbumRowCreateAlbumView.InterfaceC8061a, AlbumRowPreviewThemeView.InterfaceC8069a, AlbumItemSquareView.InterfaceC8052a, ProfileAlbumItemSeeMoreView.InterfaceC8215a, ProfileAlbumItemCreateSquareView.InterfaceC8214a {

        /* renamed from: rn.a$a$a */
        /* loaded from: classes4.dex */
        public static final class C32968a {
            /* renamed from: a */
            public static void m133299a(a aVar, C2989j c2989j) {
                AbstractC19074t.m100208f(c2989j, "albumRowPreviewAlbumData");
                AlbumRowPreviewAlbumView.InterfaceC8066a.a.m43471a(aVar, c2989j);
            }

            /* renamed from: b */
            public static void m133300b(a aVar, C2999l c2999l) {
                AbstractC19074t.m100208f(c2999l, "albumRowPreviewThemeData");
                AlbumRowPreviewThemeView.InterfaceC8069a.a.m43499a(aVar, c2999l);
            }

            /* renamed from: c */
            public static void m133301c(a aVar, C3004m c3004m) {
                AbstractC19074t.m100208f(c3004m, "albumRowSelectInfo");
                AlbumRowSelectInfoView.InterfaceC8070a.a.m43508a(aVar, c3004m);
            }

            /* renamed from: d */
            public static void m133302d(a aVar) {
                AlbumRowCreateAlbumView.InterfaceC8061a.a.m43438a(aVar);
            }

            /* renamed from: e */
            public static void m133303e(a aVar) {
                ProfileAlbumItemCreateSquareView.InterfaceC8214a.a.m44467a(aVar);
            }

            /* renamed from: f */
            public static void m133304f(a aVar) {
                AlbumRowPreviewGridView.InterfaceC8067a.a.m43483a(aVar);
            }

            /* renamed from: g */
            public static void m133305g(a aVar) {
                ProfileAlbumItemSeeMoreView.InterfaceC8215a.a.m44472a(aVar);
            }

            /* renamed from: h */
            public static void m133306h(a aVar, ProfilePreviewAlbumItem profilePreviewAlbumItem) {
                AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
                AlbumItemSquareView.InterfaceC8052a.a.m43408a(aVar, profilePreviewAlbumItem);
            }

            /* renamed from: i */
            public static void m133307i(a aVar, String str) {
                AbstractC19074t.m100208f(str, C20215s.f99966b);
                AlbumRowInputDescView.InterfaceC8062a.a.m43449a(aVar, str);
            }

            /* renamed from: j */
            public static void m133308j(a aVar, String str) {
                AbstractC19074t.m100208f(str, C20215s.f99966b);
                AlbumRowInputTitleView.InterfaceC8064a.a.m43460a(aVar, str);
            }

            /* renamed from: k */
            public static void m133309k(a aVar, AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
                AlbumRowPreviewGridView.InterfaceC8067a.a.m43484b(aVar, animationTarget, itemAlbumMobile, i11);
            }

            /* renamed from: l */
            public static void m133310l(a aVar) {
                AlbumRowPreviewGridView.InterfaceC8067a.a.m43485c(aVar);
            }

            /* renamed from: m */
            public static void m133311m(a aVar, ProfilePreviewAlbumItem profilePreviewAlbumItem) {
                AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
                AlbumItemSquareView.InterfaceC8052a.a.m43409b(aVar, profilePreviewAlbumItem);
            }

            /* renamed from: n */
            public static void m133312n(a aVar, int i11) {
                AlbumRowPreviewGridView.InterfaceC8067a.a.m43486d(aVar, i11);
            }

            /* renamed from: o */
            public static void m133313o(a aVar) {
                AlbumRowPreviewGridView.InterfaceC8067a.a.m43487e(aVar);
            }
        }
    }

    /* renamed from: rn.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: rn.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private EmptyContentView f123269I;

        /* renamed from: J */
        private AlbumRowInputTitleView f123270J;

        /* renamed from: K */
        private AlbumRowInputDescView f123271K;

        /* renamed from: L */
        private AlbumRowSelectInfoView f123272L;

        /* renamed from: M */
        private AlbumRowDividerTitle f123273M;

        /* renamed from: N */
        private AlbumRowPreviewGridView f123274N;

        /* renamed from: O */
        private AlbumRowPreviewAlbumView f123275O;

        /* renamed from: P */
        private AlbumRowCreateAlbumView f123276P;

        /* renamed from: Q */
        private AlbumRowPreviewThemeView f123277Q;

        /* renamed from: R */
        private AlbumItemSquareView f123278R;

        /* renamed from: S */
        private ProfileAlbumItemSeeMoreView f123279S;

        /* renamed from: T */
        private ProfileAlbumItemCreateSquareView f123280T;

        /* renamed from: U */
        private ProfileSkeletonView f123281U;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            m133327v0(view, i11);
        }

        /* renamed from: i0 */
        public final AlbumRowCreateAlbumView m133314i0() {
            return this.f123276P;
        }

        /* renamed from: j0 */
        public final AlbumRowDividerTitle m133315j0() {
            return this.f123273M;
        }

        /* renamed from: k0 */
        public final AlbumRowInputDescView m133316k0() {
            return this.f123271K;
        }

        /* renamed from: l0 */
        public final AlbumRowInputTitleView m133317l0() {
            return this.f123270J;
        }

        /* renamed from: m0 */
        public final AlbumRowPreviewAlbumView m133318m0() {
            return this.f123275O;
        }

        /* renamed from: n0 */
        public final AlbumRowPreviewGridView m133319n0() {
            return this.f123274N;
        }

        /* renamed from: o0 */
        public final AlbumRowPreviewThemeView m133320o0() {
            return this.f123277Q;
        }

        /* renamed from: p0 */
        public final AlbumRowSelectInfoView m133321p0() {
            return this.f123272L;
        }

        /* renamed from: q0 */
        public final ProfileSkeletonView m133322q0() {
            return this.f123281U;
        }

        /* renamed from: r0 */
        public final AlbumItemSquareView m133323r0() {
            return this.f123278R;
        }

        /* renamed from: s0 */
        public final EmptyContentView m133324s0() {
            return this.f123269I;
        }

        /* renamed from: t0 */
        public final ProfileAlbumItemCreateSquareView m133325t0() {
            return this.f123280T;
        }

        /* renamed from: u0 */
        public final ProfileAlbumItemSeeMoreView m133326u0() {
            return this.f123279S;
        }

        /* renamed from: v0 */
        public final void m133327v0(View view, int i11) {
            AbstractC19074t.m100208f(view, "convertView");
            switch (i11) {
                case 0:
                    this.f123269I = (EmptyContentView) view;
                    return;
                case 1:
                    this.f123270J = (AlbumRowInputTitleView) view;
                    return;
                case 2:
                    this.f123271K = (AlbumRowInputDescView) view;
                    return;
                case 3:
                default:
                    return;
                case 4:
                    this.f123272L = (AlbumRowSelectInfoView) view;
                    return;
                case 5:
                    this.f123273M = (AlbumRowDividerTitle) view;
                    return;
                case 6:
                    this.f123274N = (AlbumRowPreviewGridView) view;
                    return;
                case 7:
                    this.f123275O = (AlbumRowPreviewAlbumView) view;
                    return;
                case 8:
                    this.f123276P = (AlbumRowCreateAlbumView) view;
                    return;
                case 9:
                    this.f123277Q = (AlbumRowPreviewThemeView) view;
                    return;
                case 10:
                    this.f123278R = (AlbumItemSquareView) view;
                    return;
                case 11:
                    this.f123279S = (ProfileAlbumItemSeeMoreView) view;
                    return;
                case 12:
                    this.f123280T = (ProfileAlbumItemCreateSquareView) view;
                    return;
                case 13:
                    this.f123281U = (ProfileSkeletonView) view;
                    return;
            }
        }
    }

    public C25845a(Context context) {
        List m131502j;
        AbstractC19074t.m100208f(context, "context");
        this.f123266r = context;
        m131502j = AbstractC25368s.m131502j();
        this.f123267s = m131502j;
    }

    /* renamed from: L */
    public final C2974g m133294L(int i11) {
        return (C2974g) this.f123267s.get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M */
    public void mo9990A(c cVar, int i11) {
        int i12;
        AbstractC19074t.m100208f(cVar, "holder");
        try {
            int mo10005m = mo10005m(i11);
            C2974g c2974g = (C2974g) this.f123267s.get(i11);
            switch (mo10005m) {
                case 0:
                    EmptyContentView m133324s0 = cVar.m133324s0();
                    if (m133324s0 != null) {
                        m133324s0.m43610e(c2974g.m14084h());
                        m133324s0.setEmptyContentListener(this.f123268t);
                        return;
                    }
                    return;
                case 1:
                    AlbumRowInputTitleView m133317l0 = cVar.m133317l0();
                    if (m133317l0 != null) {
                        m133317l0.m43458c(c2974g.m14078b());
                        m133317l0.setAlbumRowInputTitleListener(this.f123268t);
                        return;
                    }
                    return;
                case 2:
                    AlbumRowInputDescView m133316k0 = cVar.m133316k0();
                    if (m133316k0 != null) {
                        m133316k0.m43447c(c2974g.m14078b());
                        m133316k0.setAlbumRowInputDescListener(this.f123268t);
                        return;
                    }
                    return;
                case 3:
                default:
                    return;
                case 4:
                    AlbumRowSelectInfoView m133321p0 = cVar.m133321p0();
                    if (m133321p0 != null) {
                        m133321p0.m43506b(c2974g.m14082f());
                        m133321p0.setAlbumRowSelectInfoListener(this.f123268t);
                        return;
                    }
                    return;
                case 5:
                    AlbumRowDividerTitle m133315j0 = cVar.m133315j0();
                    if (m133315j0 != null) {
                        m133315j0.m43440a(c2974g.m14086j());
                        return;
                    }
                    return;
                case 6:
                    AlbumRowPreviewGridView m133319n0 = cVar.m133319n0();
                    if (m133319n0 != null) {
                        m133319n0.m43481d(c2974g.m14085i());
                        m133319n0.setAlbumRowPreviewGridListener(this.f123268t);
                        return;
                    }
                    return;
                case 7:
                    AlbumRowPreviewAlbumView m133318m0 = cVar.m133318m0();
                    if (m133318m0 != null) {
                        m133318m0.m43469b(c2974g.m14079c());
                        m133318m0.setAlbumRowPreviewAlbumItemListener(this.f123268t);
                        return;
                    }
                    return;
                case 8:
                    AlbumRowCreateAlbumView m133314i0 = cVar.m133314i0();
                    if (m133314i0 != null) {
                        m133314i0.setAlbumRowCreateAlbumListener(this.f123268t);
                        return;
                    }
                    return;
                case 9:
                    AlbumRowPreviewThemeView m133320o0 = cVar.m133320o0();
                    if (m133320o0 != null) {
                        m133320o0.m43497b(c2974g.m14081e());
                        m133320o0.setAlbumRowPreviewThemeItemListener(this.f123268t);
                        return;
                    }
                    return;
                case 10:
                    AlbumItemSquareView m133323r0 = cVar.m133323r0();
                    if (m133323r0 != null) {
                        m133323r0.m43404c(c2974g.m14080d());
                        m133323r0.setSuggestAlbumItemViewListener(this.f123268t);
                        return;
                    }
                    return;
                case 11:
                    ProfileAlbumItemSeeMoreView m133326u0 = cVar.m133326u0();
                    if (m133326u0 != null) {
                        m133326u0.m44470b();
                        m133326u0.setProfileAlbumItemSeeMoreViewListener(this.f123268t);
                        return;
                    }
                    return;
                case 12:
                    ProfileAlbumItemCreateSquareView m133325t0 = cVar.m133325t0();
                    if (m133325t0 != null) {
                        m133325t0.m44465b(c2974g.m14077a());
                        m133325t0.setProfileAlbumItemCreateSquareViewListener(this.f123268t);
                        return;
                    }
                    return;
                case 13:
                    ProfileSkeletonView m133322q0 = cVar.m133322q0();
                    if (m133322q0 != null) {
                        C3009n m14083g = c2974g.m14083g();
                        if (m14083g != null) {
                            i12 = m14083g.m14425a();
                        } else {
                            i12 = 6;
                        }
                        m133322q0.setSkeletonLayoutType(i12);
                        return;
                    }
                    return;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        View emptyContentView;
        View view;
        AbstractC19074t.m100208f(viewGroup, "parent");
        switch (i11) {
            case 0:
                emptyContentView = new EmptyContentView(this.f123266r);
                break;
            case 1:
                emptyContentView = new AlbumRowInputTitleView(this.f123266r);
                break;
            case 2:
                emptyContentView = new AlbumRowInputDescView(this.f123266r);
                break;
            case 3:
                view = new View(this.f123266r);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23222t7.f112566j));
                view.setBackground(C23212s8.m119609q(view.getContext(), AbstractC16781w.SecondaryBackgroundColor));
                emptyContentView = view;
                break;
            case 4:
                emptyContentView = new AlbumRowSelectInfoView(this.f123266r);
                break;
            case 5:
                emptyContentView = new AlbumRowDividerTitle(this.f123266r);
                break;
            case 6:
                emptyContentView = new AlbumRowPreviewGridView(this.f123266r);
                break;
            case 7:
                emptyContentView = new AlbumRowPreviewAlbumView(this.f123266r);
                break;
            case 8:
                emptyContentView = new AlbumRowCreateAlbumView(this.f123266r);
                break;
            case 9:
                emptyContentView = new AlbumRowPreviewThemeView(this.f123266r);
                break;
            case 10:
                emptyContentView = new AlbumItemSquareView(this.f123266r);
                break;
            case 11:
                emptyContentView = new ProfileAlbumItemSeeMoreView(this.f123266r);
                break;
            case 12:
                emptyContentView = new ProfileAlbumItemCreateSquareView(this.f123266r);
                break;
            case 13:
                view = new ProfileSkeletonView(this.f123266r);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                emptyContentView = view;
                break;
            default:
                emptyContentView = new View(this.f123266r);
                break;
        }
        return new c(emptyContentView, i11);
    }

    /* renamed from: O */
    public final void m133297O(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f123267s = list;
    }

    /* renamed from: P */
    public final void m133298P(a aVar) {
        this.f123268t = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f123267s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return m133294L(i11).m14087k();
    }
}
