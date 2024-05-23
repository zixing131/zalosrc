package jo0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.uidrawing.ModulesView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ko0.C21790e;
import zm.voip.p721ui.incall.GroupCallActivity;
import zm.voip.widgets.moduleviews.InviteMemberCallRow;
import zm.voip.widgets.moduleviews.LabelCallRow;

/* renamed from: jo0.k */
/* loaded from: classes7.dex */
public class C21333k extends RecyclerView.AbstractC1880g {

    /* renamed from: u */
    public Context f103891u;

    /* renamed from: v */
    public GroupCallActivity f103892v;

    /* renamed from: w */
    public LayoutInflater f103893w;

    /* renamed from: s */
    private HashSet f103889s = new HashSet();

    /* renamed from: t */
    private final HashMap f103890t = new HashMap();

    /* renamed from: x */
    private boolean f103894x = false;

    /* renamed from: r */
    private ArrayList f103888r = new ArrayList();

    /* renamed from: jo0.k$a */
    /* loaded from: classes7.dex */
    public static abstract class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        protected int f103895I;

        a(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public abstract void mo110471i0(int i11);
    }

    /* renamed from: jo0.k$b */
    /* loaded from: classes7.dex */
    public class b extends a {

        /* renamed from: J */
        private LabelCallRow f103896J;

        /* renamed from: K */
        private InviteMemberCallRow f103897K;

        b(ModulesView modulesView, int i11) {
            super(modulesView);
            this.f103895I = i11;
            try {
                if (i11 != 1 && i11 != 4) {
                    this.f103897K = (InviteMemberCallRow) modulesView;
                } else {
                    this.f103896J = (LabelCallRow) modulesView;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // jo0.C21333k.a
        /* renamed from: i0 */
        public void mo110471i0(int i11) {
            try {
                int i12 = this.f103895I;
                if (i12 != 1 && i12 != 4) {
                    InviteMemberCallRow inviteMemberCallRow = this.f103897K;
                    if (inviteMemberCallRow != null) {
                        inviteMemberCallRow.m157447W(C21333k.this.m110462M(i11), C21333k.this.f103894x);
                    }
                } else {
                    LabelCallRow labelCallRow = this.f103896J;
                    if (labelCallRow != null) {
                        labelCallRow.m157448V(C21333k.this.m110462M(i11));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C21333k(GroupCallActivity groupCallActivity) {
        this.f103892v = groupCallActivity;
        this.f103891u = groupCallActivity.getContext();
        this.f103893w = (LayoutInflater) this.f103891u.getSystemService("layout_inflater");
    }

    /* renamed from: M */
    public C21790e m110462M(int i11) {
        ArrayList arrayList = this.f103888r;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C21790e) this.f103888r.get(i11);
        }
        return null;
    }

    /* renamed from: N */
    public HashSet m110463N() {
        return this.f103889s;
    }

    /* renamed from: O */
    public HashMap m110464O() {
        return this.f103890t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P */
    public void mo9990A(a aVar, int i11) {
        aVar.mo110471i0(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 != 1 && i11 != 4) {
            return new b(new InviteMemberCallRow(this.f103891u, this), i11);
        }
        return new b(new LabelCallRow(this.f103891u), i11);
    }

    /* renamed from: R */
    public void m110467R(boolean z11) {
        this.f103894x = z11;
    }

    /* renamed from: S */
    public void m110468S(ArrayList arrayList) {
        try {
            this.f103888r = new ArrayList(arrayList);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: T */
    public void m110469T(HashSet hashSet) {
        try {
            this.f103889s = hashSet;
            m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U */
    public void m110470U(String str) {
        this.f103892v.m156626Yd(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        ArrayList arrayList = this.f103888r;
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
        return ((C21790e) this.f103888r.get(i11)).m112454b();
    }
}
