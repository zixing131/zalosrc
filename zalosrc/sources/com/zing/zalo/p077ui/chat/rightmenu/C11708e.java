package com.zing.zalo.p077ui.chat.rightmenu;

import android.text.TextUtils;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p056cj.C3535c;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C32058p1;

/* renamed from: com.zing.zalo.ui.chat.rightmenu.e */
/* loaded from: classes5.dex */
public final class C11708e extends AbstractC11704a {

    /* renamed from: G */
    private String f60876G;

    /* renamed from: H */
    private C31973j5 f60877H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11708e(InterfaceC11707d interfaceC11707d) {
        super(interfaceC11707d);
        AbstractC19074t.m100208f(interfaceC11707d, "mvpView");
        this.f60876G = "";
        m65231dq(false);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: Pp */
    protected List mo65220Pp() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ChatInfoAdapter.C11692g(2, AbstractC16803z.ic_trash, AbstractC8020f0.str_msg_info_group_deleted_action_delete_thread, false, true));
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: Ql */
    public void mo65253Ql(boolean z11) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:            if (r2.m153747Y() == true) goto L10;     */
    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: aq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo65230aq() {
        boolean z11;
        if (this.f60877H != null) {
            InterfaceC11707d interfaceC11707d = (InterfaceC11707d) m103742Dp();
            C31973j5 c31973j5 = this.f60877H;
            AbstractC19074t.m100205c(c31973j5);
            interfaceC11707d.mo65176Xt(c31973j5, "");
            InterfaceC11707d interfaceC11707d2 = (InterfaceC11707d) m103742Dp();
            C31973j5 c31973j52 = this.f60877H;
            AbstractC19074t.m100205c(c31973j52);
            String m153793y = c31973j52.m153793y();
            C31973j5 c31973j53 = this.f60877H;
            if (c31973j53 != null) {
                z11 = true;
            }
            z11 = false;
            interfaceC11707d2.mo65187hf(m153793y, z11);
            ((InterfaceC11707d) m103742Dp()).mo65156Bk(false);
            ((InterfaceC11707d) m103742Dp()).mo65199vb(false);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: lk */
    public void mo65254lk() {
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: o4 */
    public void mo65244o4(C3535c c3535c) {
        AbstractC19074t.m100208f(c3535c, "chat");
        super.mo65244o4(c3535c);
        String m132088m = AbstractC25495a.m132088m(c3535c.m17944I0());
        this.f60876G = m132088m;
        if (!TextUtils.isEmpty(m132088m)) {
            C32058p1 m132048j = C25489b.f122105a.m132048j("group_" + this.f60876G);
            if (m132048j != null) {
                this.f60877H = m132048j.m154671e();
            }
        }
    }
}
