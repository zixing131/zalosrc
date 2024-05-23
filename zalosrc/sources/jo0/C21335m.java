package jo0;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.control.ContactProfile;
import java.util.ArrayList;
import java.util.List;
import zm.voip.widgets.moduleviews.SelectedMemberCallRow;

/* renamed from: jo0.m */
/* loaded from: classes7.dex */
public class C21335m extends RecyclerView.AbstractC1880g {

    /* renamed from: s */
    private RecyclerView f103913s;

    /* renamed from: t */
    private final Context f103914t;

    /* renamed from: r */
    private List f103912r = new ArrayList();

    /* renamed from: u */
    private boolean f103915u = false;

    /* renamed from: jo0.m$a */
    /* loaded from: classes7.dex */
    public class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public SelectedMemberCallRow f103916I;

        a(SelectedMemberCallRow selectedMemberCallRow) {
            super(selectedMemberCallRow);
            this.f103916I = selectedMemberCallRow;
        }

        /* renamed from: i0 */
        public void m110507i0(int i11) {
            try {
                this.f103916I.m157451V(C21335m.this.m110504M(i11), C21335m.this.f103915u);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C21335m(Context context) {
        this.f103914t = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        if (abstractC1876c0 instanceof a) {
            ((a) abstractC1876c0).m110507i0(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        return new a(new SelectedMemberCallRow(this.f103914t));
    }

    /* renamed from: M */
    public ContactProfile m110504M(int i11) {
        if (i11 >= 0 && i11 < this.f103912r.size()) {
            return (ContactProfile) this.f103912r.get(i11);
        }
        return null;
    }

    /* renamed from: N */
    public void m110505N(boolean z11) {
        this.f103915u = z11;
    }

    /* renamed from: O */
    public void m110506O(List list) {
        this.f103912r = new ArrayList(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f103912r;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: z */
    public void mo10018z(RecyclerView recyclerView) {
        super.mo10018z(recyclerView);
        this.f103913s = recyclerView;
    }
}
