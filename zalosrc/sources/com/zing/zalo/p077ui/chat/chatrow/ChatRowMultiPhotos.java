package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC8020f0;
import dj.C17945a0;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import p361nb.AbstractC23647d;
import p716zh.C32091r6;
import vg.C28227x3;
import w50.C28769a;
import w50.C28771c;

/* loaded from: classes5.dex */
public class ChatRowMultiPhotos extends ChatRowMultiItems<C11489j2> {

    /* renamed from: p7 */
    public static final int f58221p7 = C32091r6.m154832b().f147869a;

    /* renamed from: o7 */
    private boolean f58222o7;

    public ChatRowMultiPhotos(Context context) {
        super(context);
    }

    /* renamed from: v4 */
    private void m61500v4(C17945a0 c17945a0) {
        if (c17945a0 != null) {
            try {
                AbstractC23647d.m123907q("917720", ChatRow.f57200K6);
                getDelegate().mo62088i4(this, AbstractC19646n0.m102936U0(c17945a0));
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        List list;
        if (this.f58204X6 != null && (list = this.f58202V6) != null) {
            if (!this.f57298G4 || list.size() < 3) {
                i12 = getPhotoWidth();
            }
            c28227x3.f131648a = i12;
            c28227x3.f131649b = ((C11489j2) this.f58208b7.get(0)).mo61918k();
        }
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        this.f58222o7 = this.f57257A.m143965y();
        super.mo60953C3(c17945a0, c28769a, z11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: V3 */
    protected boolean mo61479V3() {
        C28771c c28771c = this.f57257A;
        if (c28771c != null && (c28771c.m143958r() == 3 || this.f57257A.m143958r() == 0)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: X3 */
    public boolean mo61481X3() {
        if (super.mo61481X3() && !m61503t4()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y */
    public boolean mo61034Y(boolean z11, int i11) {
        List m143955o = this.f57257A.m143955o();
        List m143950j = this.f57257A.m143950j();
        if (m143955o.size() > 0) {
            if (this.f57257A.m143958r() == 2) {
                m143950j = m143955o;
            }
            int size = m143950j.size();
            for (int i12 = 0; i12 < size; i12++) {
                C17945a0 c17945a0 = (C17945a0) m143950j.get(i12);
                if ((z11 && c17945a0.m95315z7()) || (!z11 && c17945a0.m95305y7())) {
                    if (z11) {
                        ((C17945a0) m143955o.get(m143955o.size() - 1)).m95035Va(true);
                    } else {
                        ((C17945a0) m143955o.get(m143955o.size() - 1)).m95024Ua(true);
                    }
                    return true;
                }
            }
        }
        return super.mo61034Y(z11, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        int size = this.f58204X6.size();
        for (int i11 = 0; i11 < size; i11++) {
            C17945a0 c17945a02 = (C17945a0) this.f58204X6.get(i11);
            if (!this.f57281E) {
                if (getDelegate().mo62096o4()) {
                    c17945a02.m95035Va(false);
                } else {
                    c17945a02.m95024Ua(false);
                }
            }
            ((C11489j2) this.f58208b7.get(i11)).m61982c0();
            if (c17945a02 != this.f57263B && getDelegate().mo62089j3()) {
                c17945a02.m94884F1();
                c17945a02.m95310z1();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        if (super.mo61046c0(c17945a0, c28769a)) {
            return true;
        }
        List m143955o = this.f57257A.m143955o();
        if (this.f58202V6 == null || m143955o.size() != this.f58202V6.size() || this.f58222o7 != this.f57257A.m143965y()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: e0 */
    protected boolean mo61053e0() {
        if (this.f57257A.m143948h() && m61503t4()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: e3 */
    protected void mo61056e3() {
        getDelegate().mo62091k4(this);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMarginBottom() {
        int i11 = this.f58209c7;
        if (i11 != 0 && i11 != 1 && i11 != 4) {
            return super.getBubbleMarginBottom();
        }
        return f58221p7 / 2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMarginTop() {
        int i11 = this.f58209c7;
        if (i11 != 1 && i11 != 4 && i11 != 2) {
            return super.getBubbleMarginTop();
        }
        return f58221p7 / 2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        return AbstractC11531v0.m62210V2(getContext());
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingLeft() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingRight() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingBottom() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    protected List<C17945a0> getGroupMsgToCheckSelection() {
        return this.f58202V6;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    public int getItemMargin() {
        return f58221p7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_photo);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        try {
            int i11 = this.f58219m7;
            if (i11 >= 0) {
                if (i11 >= this.f58204X6.size()) {
                }
                return ((C11489j2) this.f58208b7.get(this.f58219m7)).m61975N();
            }
            this.f58219m7 = 0;
            return ((C11489j2) this.f58208b7.get(this.f58219m7)).m61975N();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public int getPhotoWidth() {
        ArrayList arrayList = this.f58204X6;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        int size = this.f58204X6.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((C11489j2) this.f58208b7.get(i12)).mo61923q();
            if (i12 != size - 1) {
                i11 += f58221p7;
            }
        }
        return i11;
    }

    public List<C17945a0> getRolledMessagesInGroup() {
        ArrayList arrayList = new ArrayList();
        for (C17945a0 c17945a0 : this.f58202V6) {
            if (c17945a0.m95022U7()) {
                arrayList.add(c17945a0);
            }
        }
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getSelectionCheckBoxTop() {
        int i11;
        int top = getTop();
        if (this.f57447g1) {
            i11 = this.f57441f1;
        } else {
            i11 = this.f57524t0;
        }
        return top + i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C3979l getThumbImageInfo() {
        try {
            int i11 = this.f58219m7;
            if (i11 >= 0) {
                if (i11 >= this.f58204X6.size()) {
                }
                return ((C11489j2) this.f58208b7.get(this.f58219m7)).m61977Q();
            }
            this.f58219m7 = 0;
            return ((C11489j2) this.f58208b7.get(this.f58219m7)).m61977Q();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: i4 */
    protected void mo61492i4(ViewGroup viewGroup) {
        long mo95204n = this.f57263B.mo95204n();
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof ChatRowMultiPhotos) && ((ChatRowMultiPhotos) childAt).getMessage().mo95204n() == mo95204n) {
                childAt.invalidate();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: q1 */
    protected boolean mo61104q1() {
        List list = this.f58202V6;
        if (list != null && list.size() >= 3) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: r4 */
    public C11489j2 mo61483Z3() {
        return new C11489j2(this);
    }

    /* renamed from: s4 */
    public Rect m61502s4(int i11) {
        try {
            C11489j2 c11489j2 = (C11489j2) this.f58208b7.get(i11);
            if (c11489j2 != null) {
                return c11489j2.m61975N();
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public void setRetryVisible(boolean z11) {
        boolean z12;
        C28771c c28771c;
        if (z11 && (c28771c = this.f57257A) != null && c28771c.m143947g()) {
            z12 = true;
        } else {
            z12 = false;
        }
        super.setRetryVisible(z12);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t1 */
    protected boolean mo61112t1() {
        return this.f57319K1;
    }

    /* renamed from: t4 */
    public boolean m61503t4() {
        Iterator it = this.f58202V6.iterator();
        while (it.hasNext()) {
            if (!((C17945a0) it.next()).m95022U7()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: u4 */
    public void mo61497o4(C11489j2 c11489j2, C17945a0 c17945a0) {
        if (c11489j2 != null) {
            if (c11489j2.m61979V()) {
                getDelegate().mo62034C4(this);
            } else if (c17945a0.m94871D7()) {
                getDelegate().mo62074a4(this);
            } else if (c17945a0.m95306y8()) {
                m61500v4(c17945a0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0060, code lost:            if (r11 == r3) goto L68;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: w4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo61498p4(C11489j2 c11489j2, C17945a0 c17945a0, int i11) {
        int i12;
        int m143958r = this.f57257A.m143958r();
        int size = this.f58202V6.size() % 3;
        int size2 = this.f58204X6.size() - 1;
        if (this.f58202V6.size() == 1) {
            i12 = 15;
        } else {
            i12 = 8;
            if (m143958r == 3) {
                if (i11 == 0) {
                    if (!m61013R1()) {
                        i12 = 9;
                    }
                } else {
                    i12 = 0;
                }
                if (i11 == size2) {
                    if (!m61013R1()) {
                        i12 |= 6;
                    }
                    i12 |= 4;
                }
            } else if (m143958r == 0) {
                if (i11 == 0 && !m61013R1()) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                if (i11 == size2 && !m61013R1()) {
                    i12 |= 2;
                }
            } else if (m143958r == 2) {
                if (i11 != 0) {
                    i12 = 0;
                }
            } else {
                i12 = 0;
            }
        }
        if ((m143958r == 4 || (m143958r == 0 && this.f58202V6.size() / 3 == 1)) && !this.f58222o7 && size > 0) {
            if (c17945a0.m95032V6()) {
                if (i11 == 0) {
                    i12 |= 8;
                }
            } else if (i11 == size2) {
                i12 |= 4;
            }
        }
        c11489j2.m61983d0(c17945a0, this.f58222o7, i12, getDelegate().mo62101s4());
        c11489j2.m61987n0();
        c11489j2.m61986k0();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: x4 */
    public void mo61499q4(C11489j2 c11489j2, C17945a0 c17945a0, int i11, int i12) {
        c11489j2.m61984g0(c17945a0, i12, i12 / 1000.0f);
    }
}
