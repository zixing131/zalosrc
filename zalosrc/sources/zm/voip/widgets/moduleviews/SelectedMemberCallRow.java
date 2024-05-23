package zm.voip.widgets.moduleviews;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import kd0.C21693c;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;

/* loaded from: classes7.dex */
public class SelectedMemberCallRow extends ModulesView {

    /* renamed from: K */
    public C22129e f150197K;

    /* renamed from: L */
    public C21693c f150198L;

    /* renamed from: M */
    public C16716d f150199M;

    /* renamed from: N */
    public C21693c f150200N;

    public SelectedMemberCallRow(Context context) {
        super(context);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(AbstractC23222t7.f112536O, AbstractC23222t7.f112533L);
        layoutParams.setMargins(0, 0, AbstractC23222t7.f112576o, 0);
        setLayoutParams(layoutParams);
        C16716d c16716d = new C16716d(context);
        this.f150199M = c16716d;
        C16718f m89106L = c16716d.m89106L();
        int i11 = AbstractC23222t7.f112532K;
        C16718f m89028L = m89106L.m89028L(i11, i11);
        Boolean bool = Boolean.TRUE;
        m89028L.m89072y(bool);
        C22129e c22129e = new C22129e(context, AbstractC23222t7.f112532K);
        this.f150197K = c22129e;
        c22129e.m115441y1(C23212s8.m119609q(context, AbstractC16781w.default_avatar));
        C21693c c21693c = new C21693c(context);
        this.f150200N = c21693c;
        C16718f m89106L2 = c21693c.m89106L();
        int i12 = AbstractC23222t7.f112566j;
        m89106L2.m89028L(i12, i12).m89019C(this.f150197K).m89067t(this.f150197K).m89029M(10);
        this.f150200N.m89087B0(AbstractC16803z.online_status_green_ic_with_stroke_one);
        C21693c c21693c2 = new C21693c(context);
        this.f150198L = c21693c2;
        C16718f m89018B = c21693c2.m89106L().m89017A(bool).m89018B(bool);
        int i13 = AbstractC23222t7.f112586t;
        m89018B.m89028L(i13, i13).m89029M(6);
        this.f150198L.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.ic_remove_selected_mem));
        this.f150199M.m89001g1(this.f150197K);
        this.f150199M.m89001g1(this.f150200N);
        mo69681L(this.f150199M);
        mo69681L(this.f150198L);
    }

    /* renamed from: V */
    public void m157451V(ContactProfile contactProfile, boolean z11) {
        if (contactProfile != null) {
            if (contactProfile.f42430p1) {
                this.f150200N.mo44614b1(0);
            } else {
                this.f150200N.mo44614b1(8);
            }
            C22129e c22129e = this.f150197K;
            c22129e.f108931U0 = z11;
            c22129e.m115433q1(contactProfile);
        }
    }
}
