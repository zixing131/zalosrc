package u80;

import android.view.View;
import b90.C2665b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.model.MyCloudItem;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import dj.C17945a0;
import p205hc.InterfaceC19967f;
import q90.C25199b;
import q90.C25201d;

/* renamed from: u80.h2 */
/* loaded from: classes6.dex */
public interface InterfaceC27130h2 extends InterfaceC19967f {

    /* renamed from: u80.h2$a */
    /* loaded from: classes6.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m139238a(InterfaceC27130h2 interfaceC27130h2, boolean z11, boolean z12, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    z11 = true;
                }
                if ((i11 & 2) != 0) {
                    z12 = true;
                }
                interfaceC27130h2.mo70359nC(z11, z12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMultiSelectState");
        }

        /* renamed from: b */
        public static /* synthetic */ void m139239b(InterfaceC27130h2 interfaceC27130h2, Runnable runnable, long j11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    j11 = 0;
                }
                interfaceC27130h2.mo70348Zl(runnable, j11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postHandlerWithDelay");
        }
    }

    /* renamed from: Ag */
    void mo70319Ag(C2665b c2665b);

    /* renamed from: Da */
    void mo70322Da(MessageId messageId);

    /* renamed from: Dv */
    int mo70323Dv(MyCloudItem myCloudItem);

    /* renamed from: FH */
    View mo70325FH(int i11);

    /* renamed from: Hn */
    void mo70328Hn(float f11, boolean z11);

    /* renamed from: IF */
    void mo70329IF(C17945a0 c17945a0);

    /* renamed from: IH */
    void mo70330IH(C17945a0 c17945a0);

    /* renamed from: JC */
    int mo70332JC();

    /* renamed from: JF */
    void mo70333JF(MessageId messageId);

    /* renamed from: K1 */
    void mo70335K1(boolean z11);

    /* renamed from: ME */
    void mo70338ME(int i11, int i12);

    /* renamed from: Nu */
    int mo70339Nu();

    /* renamed from: OH */
    void mo70340OH(C2665b c2665b);

    /* renamed from: Or */
    int mo70341Or();

    /* renamed from: Se */
    MyCloudItem mo70342Se(int i11);

    /* renamed from: Vm */
    void mo70343Vm(MyCloudMessageItem myCloudMessageItem, boolean z11);

    /* renamed from: XE */
    void mo70344XE(boolean z11);

    /* renamed from: Xg */
    int mo70345Xg();

    /* renamed from: YA */
    void mo70346YA(float f11, float f12);

    /* renamed from: Zi */
    int mo70347Zi();

    /* renamed from: Zl */
    void mo70348Zl(Runnable runnable, long j11);

    /* renamed from: bk */
    void mo70349bk(boolean z11);

    /* renamed from: dd */
    void mo70350dd();

    /* renamed from: do */
    void mo70351do(String str);

    /* renamed from: e1 */
    C25201d.a mo70352e1();

    int getItemViewType(int i11);

    /* renamed from: hD */
    int mo70353hD();

    /* renamed from: hx */
    void mo70354hx();

    /* renamed from: l1 */
    void mo70356l1(int i11);

    /* renamed from: nC */
    void mo70359nC(boolean z11, boolean z12);

    /* renamed from: p9 */
    C25199b.a mo70362p9();

    /* renamed from: qe */
    int mo70365qe();

    /* renamed from: r8 */
    void mo70366r8();

    /* renamed from: s2 */
    void mo70368s2(int i11);

    /* renamed from: sp */
    void mo70370sp();

    /* renamed from: tr */
    void mo70372tr();

    /* renamed from: yw */
    void mo70376yw(boolean z11);

    /* renamed from: zn */
    boolean mo70378zn(int i11, boolean z11, boolean z12);
}
