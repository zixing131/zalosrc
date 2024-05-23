package r90;

import ag0.C0815e1;
import b90.C2665b;
import b90.C2666c;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.model.MyCloudItem;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p361nb.C23648e;
import q90.C25201d;
import u80.InterfaceC27130h2;
import y80.C30843m;

/* renamed from: r90.a */
/* loaded from: classes6.dex */
public final class C25707a extends C30843m {

    /* renamed from: Y */
    private long f122730Y;

    /* renamed from: Z */
    private boolean f122731Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25707a(InterfaceC27130h2 interfaceC27130h2) {
        super(interfaceC27130h2);
        AbstractC19074t.m100208f(interfaceC27130h2, "mvpView");
    }

    /* renamed from: fr */
    private final void m132625fr(boolean z11, int i11, long j11) {
        C0815e1.m2075D().m2100V(new C23648e(1, "csc_attach", 1, "chat_send_mycloud_files", "4", C0815e1.m2075D().m2119t("4", "204278670", z11, i11, j11)), false);
    }

    /* renamed from: gr */
    private final boolean m132626gr(List list, MessageId messageId) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (AbstractC19074t.m100204b(messageId, ((SelectedItemData) it.next()).m72576a().m95029V3())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a, p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        if (this.f122730Y != 0) {
            m132625fr(true, 1, 0L);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
    /* renamed from: Jq */
    public boolean mo70467Jq() {
        Iterator it = m70508oq().m13088g().values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C2666c) it.next()).m13098c().iterator();
            while (it2.hasNext()) {
                if (((MyCloudMessageItem) it2.next()).m71022f()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
    /* renamed from: Nq */
    public boolean mo70470Nq() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
    /* renamed from: Pq */
    public void mo70475Pq(SelectedItemData selectedItemData, boolean z11) {
        AbstractC19074t.m100208f(selectedItemData, "item");
        C25201d.a mo70352e1 = ((InterfaceC27130h2) m103742Dp()).mo70352e1();
        if (mo70352e1 != null) {
            mo70352e1.mo72549v1(selectedItemData, z11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a, u80.InterfaceC27126g2
    /* renamed from: Y2 */
    public void mo70489Y2() {
        if (this.f122730Y != 0) {
            this.f122730Y = 0L;
            m132625fr(true, 2, 0L);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
    /* renamed from: Zq */
    public void mo70491Zq(Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
    /* renamed from: bq */
    public boolean mo70493bq(SelectedItemData selectedItemData, boolean z11) {
        C25201d.a mo70352e1 = ((InterfaceC27130h2) m103742Dp()).mo70352e1();
        if (mo70352e1 != null) {
            return mo70352e1.mo72544O1(selectedItemData, z11);
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a, u80.InterfaceC27126g2
    /* renamed from: cd */
    public void mo70494cd(C2665b c2665b) {
        AbstractC19074t.m100208f(c2665b, "data");
        if (this.f122730Y != 0) {
            if ((!c2665b.m13088g().isEmpty()) || !m70468Kq()) {
                m132625fr(c2665b.m13088g().isEmpty(), 0, System.currentTimeMillis() - this.f122730Y);
                this.f122730Y = 0L;
                this.f122731Z = true;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
    /* renamed from: dq */
    public void mo70497dq(boolean z11) {
        super.mo70497dq(z11);
        if (!this.f122731Z) {
            this.f122731Z = true;
            this.f122730Y = System.currentTimeMillis();
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.AbstractC12521a, u80.InterfaceC27126g2
    /* renamed from: sf */
    public void mo70511sf(boolean z11) {
        List arrayList;
        boolean z12;
        C25201d.a mo70352e1 = ((InterfaceC27130h2) m103742Dp()).mo70352e1();
        if (mo70352e1 == null || (arrayList = mo70352e1.mo72548v()) == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            for (C2666c c2666c : m70507nq().m13088g().values()) {
                for (MyCloudMessageItem myCloudMessageItem : c2666c.m13098c()) {
                    myCloudMessageItem.m71025i(m132626gr(arrayList, myCloudMessageItem.m71033m().m95029V3()));
                }
                MyCloudItem m13099d = c2666c.m13099d();
                List m13098c = c2666c.m13098c();
                if (!(m13098c instanceof Collection) || !m13098c.isEmpty()) {
                    Iterator it = m13098c.iterator();
                    while (it.hasNext()) {
                        if (!((MyCloudMessageItem) it.next()).m71022f()) {
                            z12 = false;
                            break;
                        }
                    }
                }
                z12 = true;
                m13099d.m71025i(z12);
            }
        }
    }
}
