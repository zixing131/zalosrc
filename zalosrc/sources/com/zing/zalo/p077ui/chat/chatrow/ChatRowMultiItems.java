package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2;
import com.zing.zalo.p077ui.widget.C13804v0;
import com.zing.zalo.utils.ToastUtils;
import dj.C17945a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lb0.C22405g;
import me0.AbstractC23136l9;
import me0.C23055e5;
import p348mi.AbstractC23309i;
import p409oz.C24585b;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;
import w50.C28771c;

/* loaded from: classes5.dex */
public abstract class ChatRowMultiItems<T extends AbstractC11473f2> extends ChatRow {

    /* renamed from: V6 */
    protected List f58202V6;

    /* renamed from: W6 */
    protected List f58203W6;

    /* renamed from: X6 */
    protected ArrayList f58204X6;

    /* renamed from: Y6 */
    protected List f58205Y6;

    /* renamed from: Z6 */
    protected int f58206Z6;

    /* renamed from: a7 */
    protected int f58207a7;

    /* renamed from: b7 */
    List f58208b7;

    /* renamed from: c7 */
    protected int f58209c7;

    /* renamed from: d7 */
    protected boolean f58210d7;

    /* renamed from: e7 */
    protected int f58211e7;

    /* renamed from: f7 */
    protected int f58212f7;

    /* renamed from: g7 */
    protected C13804v0 f58213g7;

    /* renamed from: h7 */
    protected boolean f58214h7;

    /* renamed from: i7 */
    protected int f58215i7;

    /* renamed from: j7 */
    protected int f58216j7;

    /* renamed from: k7 */
    protected boolean f58217k7;

    /* renamed from: l7 */
    protected boolean f58218l7;

    /* renamed from: m7 */
    protected int f58219m7;

    /* renamed from: n7 */
    protected AbstractC11473f2 f58220n7;

    public ChatRowMultiItems(Context context) {
        super(context);
        this.f58208b7 = new ArrayList();
        int m61495m4 = m61495m4();
        for (int i11 = 0; i11 < m61495m4; i11++) {
            this.f58208b7.add(mo61483Z3());
        }
    }

    /* renamed from: j4 */
    private boolean m61477j4(List list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!getDelegate().mo62079c4(((C17945a0) it.next()).m95029V3()).f133329y) {
                return false;
            }
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A1 */
    protected boolean mo60946A1() {
        List list = this.f58203W6;
        if (list != null && !list.isEmpty()) {
            for (C17945a0 c17945a0 : this.f58203W6) {
                if (c17945a0 != null && !c17945a0.m95219o8()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f58217k7 = false;
        this.f58218l7 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: B2 */
    public C28227x3 mo60949B2(boolean z11, int i11, C28227x3 c28227x3) {
        C28227x3 mo60949B2 = super.mo60949B2(z11, i11, c28227x3);
        if (this.f58210d7) {
            int i12 = mo60949B2.f131648a;
            int intrinsicWidth = AbstractC11531v0.m62295n2().getIntrinsicWidth();
            int i13 = ChatRow.f57203M5;
            mo60949B2.f131648a = Math.max(i12, intrinsicWidth + i13);
            mo60949B2.f131649b += AbstractC11531v0.m62295n2().getIntrinsicHeight() + i13;
        }
        return mo60949B2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        this.f58204X6 = new ArrayList(this.f57257A.m143950j());
        this.f58202V6 = this.f57257A.m143955o();
        this.f58203W6 = this.f57257A.m143956p();
        this.f58205Y6 = this.f57257A.m143957q();
        this.f58209c7 = this.f57257A.m143958r();
        this.f58214h7 = this.f57257A.m143943c();
        super.mo60953C3(c17945a0, c28769a, z11);
        this.f58210d7 = mo61482Y3();
        setRetryVisible(m61489f4());
        this.f57271C1 = mo61481X3();
        for (int i11 = 0; i11 < this.f58204X6.size(); i11++) {
            AbstractC11473f2 abstractC11473f2 = (AbstractC11473f2) this.f58208b7.get(i11);
            abstractC11473f2.m61927v(getDelegate());
            mo61498p4(abstractC11473f2, (C17945a0) this.f58204X6.get(i11), i11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: E */
    public void mo60957E(C22405g c22405g, C17945a0 c17945a0) {
        c22405g.m115821F(getCurrentListMessageBusiness());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        for (int i12 = 0; i12 < this.f58204X6.size(); i12++) {
            AbstractC11473f2 abstractC11473f2 = (AbstractC11473f2) this.f58208b7.get(i12);
            abstractC11473f2.m61927v(getDelegate());
            mo61499q4(abstractC11473f2, (C17945a0) this.f58204X6.get(i12), i12, i11);
        }
        if (this.f58213g7 == null) {
            this.f58213g7 = new C13804v0(this);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: P */
    public boolean mo61002P() {
        if (super.mo61002P() && mo61479V3()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: S3 */
    public void mo61020S3(C17945a0 c17945a0, boolean z11) {
        C17945a0 m61488e4;
        try {
            ArrayList arrayList = this.f58204X6;
            if (arrayList != null && !arrayList.isEmpty() && c17945a0.m95032V6() && mo61480W3(this.f58209c7) && (m61488e4 = m61488e4(getCurrentListMessageBusiness())) != null) {
                this.f57402Y2 = m61488e4.m95089b4();
                this.f57407Z2 = m61488e4.m95107d3();
                super.mo61020S3(m61488e4, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: T0 */
    public int mo61022T0(int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        if (this.f58209c7 == 3) {
            return ((i11 + i12) - i13) / 2;
        }
        if (this.f57257A.m143946f() && (this.f57257A.m143944d() || this.f57257A.m143947g() || this.f57257A.m143945e() || this.f57257A.m143948h())) {
            return ((i11 + i12) - i13) / 2;
        }
        if (this.f58210d7) {
            return 0;
        }
        return i12 - i13;
    }

    /* renamed from: U3 */
    public boolean mo61478U3() {
        return true;
    }

    /* renamed from: V3 */
    protected abstract boolean mo61479V3();

    /* renamed from: W3 */
    public boolean mo61480W3(int i11) {
        return i11 == 2 || i11 == 3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: X */
    public void mo61031X(C17945a0 c17945a0) {
        int size = this.f57257A.m143950j().size();
        for (int i11 = 0; i11 < size; i11++) {
            ((AbstractC11473f2) this.f58208b7.get(i11)).m61912d();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: X2 */
    public void mo61033X2(float f11, float f12) {
        boolean z11;
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && this.f57257A != null && c17945a0.m94990R0() && m61004P1(this.f57263B)) {
            long currentTimeMillis = System.currentTimeMillis();
            List<C17945a0> m61487d4 = m61487d4(f11, f12);
            if (m61487d4 != null && m61487d4.size() > 0) {
                if (m61487d4.size() == getGroupMsgToCheckSelection().size()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z12 = !m61477j4(m61487d4);
                Iterator it = m61487d4.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    i11 += !getDelegate().mo62079c4(((C17945a0) it.next()).m95029V3()).f133329y ? 1 : 0;
                }
                if (z12 && !getDelegate().mo62045J0() && getDelegate().mo62078c3() < i11) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_select_max_messages_prompt, Integer.valueOf(AbstractC23309i.m120819C8())));
                    return;
                }
                if (z12 && getDelegate().mo62045J0() && getDelegate().mo62035D1() < i11) {
                    getDelegate().mo62060Q1(AbstractC23136l9.m118746s0(AbstractC8020f0.str_report_attachment_msg_reach_limit, Integer.valueOf(C24585b.m128025m().m128037o())));
                    return;
                }
                for (C17945a0 c17945a02 : m61487d4) {
                    if (getDelegate().mo62079c4(c17945a02.m95029V3()).f133329y != z12) {
                        if (z12) {
                            getDelegate().mo62099r3(c17945a02);
                        } else {
                            getDelegate().mo62050K3(c17945a02);
                        }
                        getDelegate().mo62079c4(c17945a02.m95029V3()).f133330z = currentTimeMillis;
                        if (z11) {
                            getDelegate().mo62079c4(c17945a02.m95029V3()).f133303A = currentTimeMillis;
                        }
                    }
                }
                invalidate();
                if (getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    viewGroup.invalidate();
                    if (z11) {
                        mo61492i4(viewGroup);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X3 */
    public boolean mo61481X3() {
        List<C17945a0> currentListMessageBusiness = getCurrentListMessageBusiness();
        boolean m61493k4 = m61493k4();
        if (this.f57257A.m143944d() && !m61493k4 && mo60993N() && currentListMessageBusiness != null && !currentListMessageBusiness.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: Y3 */
    public boolean mo61482Y3() {
        List list;
        if (this.f57257A.m143946f() && (list = this.f58202V6) != null && list.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: Z3 */
    public abstract AbstractC11473f2 mo61483Z3();

    /* renamed from: a4 */
    protected void m61484a4(Canvas canvas) {
        C13804v0 c13804v0;
        if (getDelegate().mo62086i0() || getDelegate().mo62101s4() == 3) {
            return;
        }
        if (this.f58214h7 && (c13804v0 = this.f58213g7) != null) {
            c13804v0.m77062a(canvas);
        } else if (this.f58217k7) {
            AbstractC28236y3.m142204o(AbstractC11531v0.m62301o3(), this.f58211e7, this.f58212f7);
            AbstractC11531v0.m62301o3().draw(canvas);
        } else {
            AbstractC28236y3.m142204o(AbstractC11531v0.m62295n2(), this.f58211e7, this.f58212f7);
            AbstractC11531v0.m62295n2().draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: b3 */
    public void mo61044b3(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61044b3(c17945a0, c28769a);
        Iterator it = this.f58208b7.iterator();
        while (it.hasNext()) {
            ((AbstractC11473f2) it.next()).m61926u(this.f57263B);
        }
    }

    /* renamed from: b4 */
    protected C17945a0 m61485b4(int i11) {
        ArrayList arrayList = this.f58204X6;
        if (arrayList != null && !arrayList.isEmpty() && i11 >= 0 && i11 < this.f58204X6.size()) {
            return (C17945a0) this.f58204X6.get(i11);
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        boolean z11;
        C17945a0 m61488e4;
        if (super.mo61046c0(c17945a0, c28769a)) {
            return true;
        }
        boolean m143943c = this.f57257A.m143943c();
        if (this.f58214h7 != m143943c) {
            this.f58214h7 = m143943c;
            return true;
        }
        if (this.f58209c7 != this.f57257A.m143958r()) {
            return true;
        }
        List m143950j = this.f57257A.m143950j();
        if (this.f58204X6 == null || m143950j.size() != this.f58204X6.size()) {
            return true;
        }
        int size = m143950j.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((AbstractC11473f2) this.f58208b7.get(i11)).m61911b((C17945a0) m143950j.get(i11))) {
                return true;
            }
        }
        List mo61486c4 = mo61486c4(this.f57257A);
        if (c17945a0.m95032V6() && mo61480W3(this.f58209c7) && mo61486c4 != this.f58204X6 && (m61488e4 = m61488e4(mo61486c4)) != null && (this.f57402Y2 != m61488e4.m95089b4() || m61488e4.m95107d3() != this.f57407Z2)) {
            return true;
        }
        if (this.f57257A.m143947g() && !this.f57271C1) {
            if (this.f57259A1 != m61489f4()) {
                return true;
            }
        }
        if (this.f57257A.m143944d()) {
            if (mo61486c4 != null && !mo61486c4.isEmpty()) {
                if (!this.f57271C1) {
                    if (mo60993N() && !m61493k4()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f57271C1 != z11) {
                        return true;
                    }
                    return false;
                }
            } else {
                return this.f57271C1;
            }
        }
        return false;
    }

    /* renamed from: c4 */
    public List mo61486c4(C28771c c28771c) {
        return c28771c.m143956p();
    }

    /* renamed from: d4 */
    protected List m61487d4(float f11, float f12) {
        int i11;
        ArrayList arrayList = this.f58204X6;
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            AbstractC11473f2 abstractC11473f2 = (AbstractC11473f2) this.f58208b7.get(i12);
            if (abstractC11473f2.m61925s(f11, f12)) {
                return Collections.singletonList(abstractC11473f2.f59122r);
            }
        }
        return getGroupMsgToCheckSelection();
    }

    /* renamed from: e4 */
    public C17945a0 m61488e4(List list) {
        C17945a0 c17945a0 = null;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C17945a0 c17945a02 = (C17945a0) it.next();
                if (!c17945a02.m95219o8() && (c17945a0 == null || c17945a0.m95089b4() > c17945a02.m95089b4())) {
                    c17945a0 = c17945a02;
                }
            }
        }
        return c17945a0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: f2 */
    public int mo61058f2(int i11, int i12, int i13, int i14, boolean z11) {
        int intrinsicWidth;
        int m77064c;
        int mo61058f2 = super.mo61058f2(i11, i12, i13, i14, z11);
        if (this.f58210d7) {
            int i15 = ChatRow.f57203M5 / 2;
            if (z11) {
                intrinsicWidth = i15 + i11;
            } else {
                intrinsicWidth = (i13 - i15) - AbstractC11531v0.m62295n2().getIntrinsicWidth();
            }
            this.f58211e7 = intrinsicWidth;
            int i16 = ChatRow.f57203M5;
            this.f58212f7 = (i16 / 2) + mo61058f2;
            if (this.f58214h7) {
                if (z11) {
                    m77064c = i11 + (i16 / 2);
                } else {
                    m77064c = (i13 - (i16 / 2)) - this.f58213g7.m77064c();
                }
                this.f58215i7 = m77064c;
                int i17 = (i16 / 2) + mo61058f2;
                this.f58216j7 = i17;
                C13804v0 c13804v0 = this.f58213g7;
                if (c13804v0 != null) {
                    c13804v0.m77067f(m77064c, i17);
                    C13804v0 c13804v02 = this.f58213g7;
                    c13804v02.m77066e(c13804v02.m77064c(), this.f58213g7.m77064c());
                }
            }
            return mo61058f2 + AbstractC11531v0.m62295n2().getIntrinsicHeight() + i16;
        }
        return mo61058f2;
    }

    /* renamed from: f4 */
    public boolean m61489f4() {
        List<C17945a0> currentListMessageBusiness = getCurrentListMessageBusiness();
        if (currentListMessageBusiness != null && !currentListMessageBusiness.isEmpty()) {
            Iterator<C17945a0> it = currentListMessageBusiness.iterator();
            while (it.hasNext()) {
                if (it.next().m95089b4() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    public void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        ArrayList arrayList = this.f58204X6;
        if (arrayList == null) {
            return;
        }
        if (z11) {
            for (int i15 = 0; i15 < this.f58204X6.size(); i15++) {
                AbstractC11473f2 abstractC11473f2 = (AbstractC11473f2) this.f58208b7.get(i15);
                abstractC11473f2.mo61928w(i11, i12);
                i11 += abstractC11473f2.mo61923q() + getItemMargin();
            }
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC11473f2 abstractC11473f22 = (AbstractC11473f2) this.f58208b7.get(size);
            int mo61923q = i13 - abstractC11473f22.mo61923q();
            abstractC11473f22.mo61928w(mo61923q, i12);
            i13 = mo61923q - getItemMargin();
        }
    }

    /* renamed from: g4 */
    public int m61490g4(float f11, float f12) {
        if (this.f58204X6 != null) {
            for (int i11 = 0; i11 < this.f58204X6.size(); i11++) {
                AbstractC11473f2 abstractC11473f2 = (AbstractC11473f2) this.f58208b7.get(i11);
                if (f11 >= abstractC11473f2.mo61919l() && f11 <= abstractC11473f2.mo61919l() + abstractC11473f2.mo61923q() && f12 >= abstractC11473f2.mo61922o() && f12 <= abstractC11473f2.mo61922o() + abstractC11473f2.mo61918k()) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public List<C17945a0> getCurrentListMessageBusiness() {
        return this.f58203W6;
    }

    protected abstract List<C17945a0> getGroupMsgToCheckSelection();

    public int getItemMargin() {
        return AbstractC23136l9.m118742r(2.0f);
    }

    public List<C17945a0> getListMsgNotUndoInGroup() {
        return this.f58203W6;
    }

    public List<C17945a0> getListMsgNotUndoInRow() {
        return this.f58205Y6;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C17945a0 getMessage() {
        ArrayList arrayList = this.f58204X6;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i11 = this.f58219m7;
            if (i11 < 0 || i11 >= this.f58204X6.size()) {
                this.f58219m7 = 0;
            }
            return (C17945a0) this.f58204X6.get(this.f58219m7);
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C17945a0 getMessageForReply() {
        List<C17945a0> currentListMessageBusiness = getCurrentListMessageBusiness();
        if (currentListMessageBusiness != null && currentListMessageBusiness.size() > 0) {
            return currentListMessageBusiness.get(0);
        }
        return null;
    }

    public C17945a0 getMsgShowTipNonCloud() {
        AbstractC11473f2 abstractC11473f2 = this.f58220n7;
        if (abstractC11473f2 != null) {
            return abstractC11473f2.f59122r;
        }
        return null;
    }

    public Rect getOutCloudBubbleRect() {
        if (this.f58220n7 == null) {
            Iterator it = this.f58208b7.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC11473f2 abstractC11473f2 = (AbstractC11473f2) it.next();
                C17945a0 c17945a0 = abstractC11473f2.f59122r;
                if (c17945a0 != null && c17945a0.m95278v8()) {
                    this.f58220n7 = abstractC11473f2;
                    break;
                }
            }
        }
        if (this.f58220n7 != null) {
            return new Rect(this.f58220n7.mo61919l(), this.f58220n7.mo61922o(), this.f58220n7.mo61919l() + this.f58220n7.mo61923q(), this.f58220n7.mo61922o() + this.f58220n7.mo61918k());
        }
        return new Rect();
    }

    public int getSelectedItemIndex() {
        return this.f58219m7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public abstract int getSelectionCheckBoxTop();

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public long getSelectionCheckedChangeAnimTime() {
        return getDelegate().mo62079c4(this.f57263B.m95029V3()).f133303A;
    }

    /* renamed from: h4 */
    protected boolean m61491h4(float f11, float f12) {
        try {
            if (f11 < this.f58211e7 || f11 > r1 + AbstractC11531v0.m62295n2().getIntrinsicWidth()) {
                return false;
            }
            if (f12 < this.f58212f7) {
                return false;
            }
            if (f12 > r4 + AbstractC11531v0.m62295n2().getIntrinsicHeight()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: i4 */
    protected abstract void mo61492i4(ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:            if (r2 == false) goto L19;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        if (i11 != 0) {
            if (i11 == 1 && this.f58218l7) {
                int m61490g4 = m61490g4(f11, f12);
                int i12 = this.f58219m7;
                if (m61490g4 == i12) {
                    C17945a0 m61485b4 = m61485b4(i12);
                    if (m61485b4 != null) {
                        mo61497o4((AbstractC11473f2) this.f58208b7.get(this.f58219m7), m61485b4);
                    }
                }
            }
            if (!super.mo61075j3(motionEvent, i11, f11, f12)) {
                return false;
            }
        } else {
            int m61490g42 = m61490g4(f11, f12);
            this.f58219m7 = m61490g42;
            if (m61490g42 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f58218l7 = z11;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: k3 */
    public boolean mo61079k3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        if (i11 != 0) {
            if (i11 != 1 || !this.f58217k7 || !m61491h4(f11, f12)) {
                z11 = false;
            } else {
                mo61496n4();
                z11 = true;
            }
        } else {
            if (this.f58210d7 && m61491h4(f11, f12) && !this.f58214h7) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f58217k7 = z11;
        }
        invalidate();
        if (z11 || super.mo61079k3(motionEvent, i11, f11, f12)) {
            return true;
        }
        return false;
    }

    /* renamed from: k4 */
    public boolean m61493k4() {
        List<C17945a0> currentListMessageBusiness = getCurrentListMessageBusiness();
        if (currentListMessageBusiness != null && !currentListMessageBusiness.isEmpty()) {
            for (C17945a0 c17945a0 : currentListMessageBusiness) {
                if (c17945a0.m95032V6()) {
                    if (!c17945a0.m95180k8()) {
                        if (c17945a0.m95089b4() == 1) {
                            return true;
                        }
                    } else if (c17945a0.m95107d3() == 4) {
                        return true;
                    }
                } else if (c17945a0.m95107d3() == 4 && C23055e5.m118271f()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l4 */
    public boolean m61494l4() {
        boolean z11;
        boolean z12 = false;
        for (AbstractC11473f2 abstractC11473f2 : this.f58208b7) {
            C17945a0 c17945a0 = abstractC11473f2.f59122r;
            if (c17945a0 != null && c17945a0.m95278v8()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f58220n7 = abstractC11473f2;
                return z11;
            }
            z12 = z11;
        }
        return z12;
    }

    /* renamed from: m4 */
    protected int m61495m4() {
        return 3;
    }

    /* renamed from: n4 */
    protected void mo61496n4() {
        getDelegate().mo62041H3(this);
    }

    /* renamed from: o4 */
    protected void mo61497o4(AbstractC11473f2 abstractC11473f2, C17945a0 c17945a0) {
    }

    /* renamed from: p4 */
    protected abstract void mo61498p4(AbstractC11473f2 abstractC11473f2, C17945a0 c17945a0, int i11);

    /* renamed from: q4 */
    protected abstract void mo61499q4(AbstractC11473f2 abstractC11473f2, C17945a0 c17945a0, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: s0 */
    public void mo61109s0(Canvas canvas) {
        super.mo61109s0(canvas);
        if (this.f58210d7) {
            m61484a4(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        for (int i11 = 0; i11 < this.f58204X6.size(); i11++) {
            ((AbstractC11473f2) this.f58208b7.get(i11)).m61914f(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58219m7 = -1;
        this.f58206Z6 = 0;
        this.f58207a7 = 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: z1 */
    public boolean mo61129z1() {
        List<C17945a0> groupMsgToCheckSelection = getGroupMsgToCheckSelection();
        if (groupMsgToCheckSelection == null || groupMsgToCheckSelection.size() <= 0) {
            return false;
        }
        Iterator<C17945a0> it = groupMsgToCheckSelection.iterator();
        while (it.hasNext()) {
            if (!getDelegate().mo62079c4(it.next().m95029V3()).f133329y) {
                return false;
            }
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: z3 */
    public void mo61131z3() {
        getDelegate().mo62079c4(this.f57263B.m95029V3()).f133303A = 0L;
    }
}
