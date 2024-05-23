package s90;

import b90.C2665b;
import b90.C2666c;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.gridtab.C12587a0;
import com.zing.zalo.p077ui.mycloud.model.MyCloudItem;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import q90.C25201d;
import u80.InterfaceC27130h2;

/* renamed from: s90.a */
/* loaded from: classes6.dex */
public final class C26198a extends C12587a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26198a(InterfaceC27130h2 interfaceC27130h2) {
        super(interfaceC27130h2);
        AbstractC19074t.m100208f(interfaceC27130h2, "mvpView");
    }

    /* renamed from: or */
    private final boolean m134764or(List list, MessageId messageId) {
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
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.C12587a0, com.zing.zalo.p077ui.mycloud.base.AbstractC12521a
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
                    myCloudMessageItem.m71025i(m134764or(arrayList, myCloudMessageItem.m71033m().m95029V3()));
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
