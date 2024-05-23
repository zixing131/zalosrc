package m50;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.AbstractC11208a;
import com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.RingtoneErrorViewCell;
import com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.SystemRingtoneViewCell;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m50.C22868a;
import qm0.AbstractC25368s;

/* renamed from: m50.b */
/* loaded from: classes5.dex */
public final class C22869b extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f111484r;

    /* renamed from: s */
    private C22868a.a f111485s;

    /* renamed from: m50.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private SystemRingtoneViewCell f111486I;

        /* renamed from: J */
        private RingtoneErrorViewCell f111487J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            if (view instanceof SystemRingtoneViewCell) {
                this.f111486I = (SystemRingtoneViewCell) view;
            } else if (view instanceof RingtoneErrorViewCell) {
                this.f111487J = (RingtoneErrorViewCell) view;
            }
        }

        /* renamed from: i0 */
        public final void m117558i0(AbstractC11208a abstractC11208a, C22868a.a aVar) {
            RingtoneErrorViewCell ringtoneErrorViewCell;
            AbstractC19074t.m100208f(abstractC11208a, "data");
            if (abstractC11208a instanceof AbstractC11208a.b) {
                SystemRingtoneViewCell systemRingtoneViewCell = this.f111486I;
                if (systemRingtoneViewCell != null) {
                    systemRingtoneViewCell.m59013X((AbstractC11208a.b) abstractC11208a);
                }
                SystemRingtoneViewCell systemRingtoneViewCell2 = this.f111486I;
                if (systemRingtoneViewCell2 != null) {
                    systemRingtoneViewCell2.setListener(aVar);
                    return;
                }
                return;
            }
            if ((abstractC11208a instanceof AbstractC11208a.c) && (ringtoneErrorViewCell = this.f111487J) != null) {
                ringtoneErrorViewCell.setListener(aVar);
            }
        }
    }

    public C22869b() {
        List m131502j;
        m131502j = AbstractC25368s.m131502j();
        this.f111484r = m131502j;
    }

    /* renamed from: L */
    public final AbstractC11208a m117552L(int i11) {
        return (AbstractC11208a) this.f111484r.get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        aVar.m117558i0(m117552L(i11), this.f111485s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 2) {
            if (i11 != 3) {
                return new a(new View(viewGroup.getContext()));
            }
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new a(new RingtoneErrorViewCell(context, null, 0, 6, null));
        }
        Context context2 = viewGroup.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        return new a(new SystemRingtoneViewCell(context2, null, 0, 6, null));
    }

    /* renamed from: O */
    public final void m117555O(C22868a.a aVar) {
        this.f111485s = aVar;
    }

    /* renamed from: P */
    public final void m117556P(List list) {
        AbstractC19074t.m100208f(list, "items");
        this.f111484r = list;
        m10008p();
    }

    /* renamed from: Q */
    public final void m117557Q(AbstractC11208a.b bVar) {
        AbstractC19074t.m100208f(bVar, "item");
        int indexOf = this.f111484r.indexOf(bVar);
        if (indexOf >= 0) {
            m10009q(indexOf);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f111484r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        AbstractC11208a m117552L = m117552L(i11);
        if (m117552L instanceof AbstractC11208a.b) {
            return 2;
        }
        if (m117552L instanceof AbstractC11208a.c) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
