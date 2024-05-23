package c90;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.mycloud.base.AbstractC12521a;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import p365nk.C23805a;
import u80.InterfaceC27130h2;

/* renamed from: c90.g */
/* loaded from: classes6.dex */
public class C3379g extends AbstractC12521a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3379g(InterfaceC27130h2 interfaceC27130h2) {
        super(interfaceC27130h2);
        AbstractC19074t.m100208f(interfaceC27130h2, "mvpView");
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a, u80.InterfaceC27126g2
    /* renamed from: gb */
    public void mo16979gb(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        try {
            int m9817A0 = recyclerView.m9817A0(view);
            int mo70365qe = ((InterfaceC27130h2) m103742Dp()).mo70365qe();
            int i11 = AbstractC23222t7.f112566j;
            if (m9817A0 >= 0 && m9817A0 < mo70365qe) {
                int itemViewType = ((InterfaceC27130h2) m103742Dp()).getItemViewType(m9817A0);
                if (m9817A0 == m70505mq() && itemViewType != 12 && itemViewType != 13) {
                    rect.top = i11;
                }
                if (itemViewType != 2 && itemViewType != 1 && itemViewType != 12 && itemViewType != 13) {
                    rect.bottom = i11;
                }
                if (itemViewType != 2 && itemViewType != 7) {
                    rect.left = 0;
                    rect.right = 0;
                } else {
                    int i12 = AbstractC23222t7.f112586t;
                    rect.left = i12;
                    rect.right = i12;
                }
                m70510rq(m9817A0, rect, itemViewType, view);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
    /* renamed from: zq */
    public C23805a.d mo946zq() {
        return C23805a.d.f115058r;
    }
}
