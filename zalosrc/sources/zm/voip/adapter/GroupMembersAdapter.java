package zm.voip.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import java.util.ArrayList;
import java.util.HashSet;
import ko0.C21789d;
import l80.C22126c0;
import ld0.C22448a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import zm.voip.widgets.moduleviews.GroupMemberCallRow;
import zm.voip.widgets.moduleviews.MemberHeaderFuncRow;

/* loaded from: classes7.dex */
public class GroupMembersAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private ArrayList f148668r;

    /* renamed from: s */
    public Context f148669s;

    /* renamed from: t */
    public LayoutInflater f148670t;

    /* renamed from: u */
    public HashSet f148671u;

    /* renamed from: v */
    public int f148672v;

    /* renamed from: w */
    private boolean f148673w = false;

    /* loaded from: classes7.dex */
    public static class LabelItemModule extends ModulesView {

        /* renamed from: K */
        public C16719g f148674K;

        /* renamed from: L */
        public C22126c0 f148675L;

        public LabelItemModule(Context context) {
            super(context);
            C16719g c16719g = new C16719g(context);
            this.f148674K = c16719g;
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            this.f148674K.m89106L().m89028L(-1, AbstractC23136l9.m118742r(0.5f));
            C22126c0 c22126c0 = new C22126c0(context, AbstractC23136l9.m118742r(13.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor2), false);
            this.f148675L = c22126c0;
            c22126c0.m89106L().m89028L(-1, -2).m89023G(this.f148674K).m89042Z(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
            mo69681L(this.f148674K);
            mo69681L(this.f148675L);
        }

        /* renamed from: V */
        public void m155486V(C21789d c21789d) {
            int i11;
            if (c21789d == null) {
                return;
            }
            try {
                this.f148675L.m111959G1(c21789d.f105761f);
                C16719g c16719g = this.f148674K;
                if (c21789d.f105760e) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                c16719g.mo44614b1(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class SubLabelItemModule extends ModulesView {

        /* renamed from: K */
        public C22126c0 f148676K;

        public SubLabelItemModule(Context context) {
            super(context);
            m88987U(-1, -2);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f148676K = c22126c0;
            C16718f m89106L = c22126c0.m89106L();
            Boolean bool = Boolean.TRUE;
            m89106L.m89073z(bool).m89018B(bool).m89042Z(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
            this.f148676K.mo111965M1(0);
            this.f148676K.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
            this.f148676K.mo111964L1(AbstractC23222t7.f112582r);
            mo69681L(this.f148676K);
        }

        /* renamed from: V */
        public void m155487V(C21789d c21789d) {
            if (c21789d == null) {
                return;
            }
            if (c21789d.m112452a() == 1 && c21789d.f105763h.length() != 0) {
                this.f148676K.mo44614b1(0);
                this.f148676K.m111959G1(c21789d.f105763h);
                this.f148676K.m111961I1(Layout.Alignment.ALIGN_NORMAL);
                this.f148676K.m111955C1(new C22448a());
                return;
            }
            this.f148676K.mo44614b1(8);
        }
    }

    /* renamed from: zm.voip.adapter.GroupMembersAdapter$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC32237a extends RecyclerView.AbstractC1876c0 {
        AbstractC32237a(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public abstract void mo155488i0(int i11);
    }

    /* renamed from: zm.voip.adapter.GroupMembersAdapter$b */
    /* loaded from: classes7.dex */
    public static class C32238b extends AbstractC32237a {

        /* renamed from: I */
        LinearLayout f148677I;

        /* renamed from: J */
        LinearLayout f148678J;

        C32238b(View view) {
            super(view);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterError);
            this.f148677I = linearLayout;
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
            this.f148678J = linearLayout2;
            linearLayout2.setVisibility(0);
        }

        @Override // zm.voip.adapter.GroupMembersAdapter.AbstractC32237a
        /* renamed from: i0 */
        public void mo155488i0(int i11) {
        }
    }

    /* renamed from: zm.voip.adapter.GroupMembersAdapter$c */
    /* loaded from: classes7.dex */
    public class C32239c extends AbstractC32237a {

        /* renamed from: I */
        private LabelItemModule f148679I;

        /* renamed from: J */
        private SubLabelItemModule f148680J;

        /* renamed from: K */
        private MemberHeaderFuncRow f148681K;

        /* renamed from: L */
        private GroupMemberCallRow f148682L;

        /* renamed from: M */
        private final int f148683M;

        C32239c(ModulesView modulesView, int i11) {
            super(modulesView);
            try {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 5) {
                            this.f148682L = (GroupMemberCallRow) modulesView;
                        } else {
                            this.f148679I = (LabelItemModule) modulesView;
                        }
                    } else {
                        this.f148681K = (MemberHeaderFuncRow) modulesView;
                    }
                } else {
                    this.f148680J = (SubLabelItemModule) modulesView;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f148683M = i11;
        }

        @Override // zm.voip.adapter.GroupMembersAdapter.AbstractC32237a
        /* renamed from: i0 */
        public void mo155488i0(int i11) {
            try {
                int i12 = this.f148683M;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 5) {
                            GroupMemberCallRow groupMemberCallRow = this.f148682L;
                            if (groupMemberCallRow != null) {
                                groupMemberCallRow.m157444V(GroupMembersAdapter.this.m155481M(i11), GroupMembersAdapter.this.f148673w);
                            }
                        } else {
                            LabelItemModule labelItemModule = this.f148679I;
                            if (labelItemModule != null) {
                                labelItemModule.m155486V(GroupMembersAdapter.this.m155481M(i11));
                            }
                        }
                    } else {
                        MemberHeaderFuncRow memberHeaderFuncRow = this.f148681K;
                        if (memberHeaderFuncRow != null) {
                            memberHeaderFuncRow.m157450V(GroupMembersAdapter.this.m155481M(i11));
                        }
                    }
                } else {
                    SubLabelItemModule subLabelItemModule = this.f148680J;
                    if (subLabelItemModule != null) {
                        subLabelItemModule.m155487V(GroupMembersAdapter.this.m155481M(i11));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public GroupMembersAdapter(Context context, ArrayList arrayList, HashSet hashSet) {
        this.f148669s = context;
        this.f148668r = new ArrayList(arrayList);
        this.f148670t = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f148671u = hashSet;
    }

    /* renamed from: M */
    public C21789d m155481M(int i11) {
        ArrayList arrayList = this.f148668r;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C21789d) this.f148668r.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public void mo9990A(AbstractC32237a abstractC32237a, int i11) {
        abstractC32237a.mo155488i0(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O */
    public AbstractC32237a mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return new C32239c(new GroupMemberCallRow(this.f148669s, this), i11);
                    }
                    return new C32239c(new LabelItemModule(this.f148669s), i11);
                }
                return new C32238b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.group_rada_footer, viewGroup, false));
            }
            return new C32239c(new MemberHeaderFuncRow(this.f148669s), i11);
        }
        return new C32239c(new SubLabelItemModule(this.f148669s), i11);
    }

    /* renamed from: P */
    public void m155484P(boolean z11) {
        this.f148673w = z11;
    }

    /* renamed from: Q */
    public void m155485Q(ArrayList arrayList) {
        try {
            this.f148668r = new ArrayList(arrayList);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        ArrayList arrayList = this.f148668r;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C21789d) this.f148668r.get(i11)).m112452a();
    }
}
