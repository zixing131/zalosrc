package com.zing.zalo.p077ui.mycloud.gridtab;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import dj.C17945a0;
import dj.C17969i0;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import ti0.C26705d;
import ti0.C26707f;
import u80.InterfaceC27158o2;

/* loaded from: classes6.dex */
public final class ContactGridChatItemView extends GridChatItemViewBase {

    /* renamed from: A0 */
    private C16716d f65615A0;

    /* renamed from: B0 */
    private C16971e f65616B0;

    /* renamed from: C0 */
    private C22126c0 f65617C0;

    /* renamed from: D0 */
    private C22126c0 f65618D0;

    /* renamed from: E0 */
    private String f65619E0;

    public ContactGridChatItemView(Context context) {
        super(context);
        this.f65619E0 = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public static final void m70811Y0(ContactGridChatItemView contactGridChatItemView, C16719g c16719g) {
        C17945a0 m71033m;
        BaseMyCloudTabView.AbstractC12510b delegate;
        AbstractC19074t.m100208f(contactGridChatItemView, "this$0");
        MyCloudMessageItem data = contactGridChatItemView.getData();
        if (data != null && (m71033m = data.m71033m()) != null && (delegate = contactGridChatItemView.getDelegate()) != null) {
            delegate.mo70403v(m71033m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public static final void m70812Z0(ContactGridChatItemView contactGridChatItemView, C16719g c16719g) {
        InterfaceC27158o2 selectEventListener;
        AbstractC19074t.m100208f(contactGridChatItemView, "this$0");
        MyCloudMessageItem data = contactGridChatItemView.getData();
        if (data != null && (selectEventListener = contactGridChatItemView.getSelectEventListener()) != null) {
            InterfaceC27158o2.a.m139263a(selectEventListener, data, contactGridChatItemView.getPosition(), null, 4, null);
        }
    }

    private final void getUIData() {
        String str;
        C17945a0 m71033m;
        C17969i0 m94929K2;
        MyCloudMessageItem data = getData();
        if (data == null || (m71033m = data.m71033m()) == null || (m94929K2 = m71033m.m94929K2()) == null || (str = m94929K2.f91013r) == null) {
            str = "";
        }
        this.f65619E0 = str;
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: C0 */
    public C16719g mo70813C0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-2, -1).m89041Y(AbstractC23222t7.f112576o);
        c16716d.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.a
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ContactGridChatItemView.m70811Y0(ContactGridChatItemView.this, c16719g);
            }
        });
        c16716d.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.mycloud.gridtab.b
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                ContactGridChatItemView.m70812Z0(ContactGridChatItemView.this, c16719g);
            }
        });
        this.f65615A0 = c16716d;
        int i11 = AbstractC23222t7.f112539R;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16971e c16971e = new C16971e(context, EnumC16949e.SIZE_48);
        c16971e.m89106L().m89028L(i11, i11);
        this.f65616B0 = c16971e;
        C16716d c16716d2 = this.f65615A0;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d2 = null;
        }
        C16971e c16971e2 = this.f65616B0;
        if (c16971e2 == null) {
            AbstractC19074t.m100223u("avatarModule");
            c16971e2 = null;
        }
        c16716d2.m89001g1(c16971e2);
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89028L(-2, -2).m89072y(Boolean.TRUE).m89033Q(AbstractC23222t7.f112556e);
        Context context2 = c22126c0.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_xxsmall));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_02));
        this.f65618D0 = c22126c0;
        C16716d c16716d3 = this.f65615A0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d3 = null;
        }
        C22126c0 c22126c02 = this.f65618D0;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("phoneNumModule");
            c22126c02 = null;
        }
        c16716d3.m89001g1(c22126c02);
        C22126c0 c22126c03 = new C22126c0(getContext());
        C16718f m89028L = c22126c03.m89106L().m89028L(-2, -2);
        C22126c0 c22126c04 = this.f65618D0;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("phoneNumModule");
            c22126c04 = null;
        }
        m89028L.m89066s(c22126c04).m89033Q(AbstractC23222t7.f112556e);
        Context context3 = c22126c03.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26707f(c22126c03).m137318a(C26705d.m137293a(context3, AbstractC2814h.t_normal_m));
        c22126c03.m111962J1(C23212s8.m119607o(c22126c03.getContext(), AbstractC2807a.text_01));
        c22126c03.m111980v1(TextUtils.TruncateAt.END);
        this.f65617C0 = c22126c03;
        C16716d c16716d4 = this.f65615A0;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d4 = null;
        }
        C22126c0 c22126c05 = this.f65617C0;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("nameModule");
            c22126c05 = null;
        }
        c16716d4.m89001g1(c22126c05);
        C16716d c16716d5 = this.f65615A0;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("containerModule");
            return null;
        }
        return c16716d5;
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: Q0 */
    public void mo70814Q0() {
        super.mo70814Q0();
        this.f65619E0 = "";
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: w0 */
    public void mo70815w0() {
        int i11;
        SpannableString spannableString;
        getUIData();
        C16971e c16971e = this.f65616B0;
        SpannableString spannableString2 = null;
        if (c16971e == null) {
            AbstractC19074t.m100223u("avatarModule");
            c16971e = null;
        }
        c16971e.m90886N1(this.f65619E0);
        C22126c0 c22126c0 = this.f65617C0;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("nameModule");
            c22126c0 = null;
        }
        if (getViewOriginalMsgVisible()) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        c22126c0.m111953A1(i11);
        C22126c0 c22126c02 = this.f65617C0;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("nameModule");
            c22126c02 = null;
        }
        MyCloudMessageItem data = getData();
        if (data != null) {
            spannableString = data.m71040w();
        } else {
            spannableString = null;
        }
        c22126c02.m111959G1(spannableString);
        C22126c0 c22126c03 = this.f65618D0;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("phoneNumModule");
            c22126c03 = null;
        }
        MyCloudMessageItem data2 = getData();
        if (data2 != null) {
            spannableString2 = data2.m71039u();
        }
        c22126c03.m111959G1(spannableString2);
    }
}
