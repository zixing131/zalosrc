package com.zing.zalo.p077ui.widget.reaction;

import ac.C0732w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.reaction.ZDSReactionDetailItemView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import lb0.C22423y;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p392oh.C24265l;
import p588vw.C28652r;
import ph.C24753f;
import ui0.C27280g;
import vg.C28203u6;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class ZDSReactionDetailItemView extends ListItem {

    /* renamed from: G */
    private final InterfaceC13749a f71188G;

    /* renamed from: H */
    private final int f71189H;

    /* renamed from: I */
    private C24753f f71190I;

    /* renamed from: com.zing.zalo.ui.widget.reaction.ZDSReactionDetailItemView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13749a {
        /* renamed from: a */
        void mo60328a(C24753f c24753f, boolean z11);

        /* renamed from: b */
        void mo60329b(ContactProfile contactProfile);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZDSReactionDetailItemView(Context context, int i11, InterfaceC13749a interfaceC13749a) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f71188G = interfaceC13749a;
        this.f71189H = i11;
        setSubtitleDisableScaleText(true);
        m90587c(new Avatar(context));
        Button button = new Button(context);
        button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_undo_reaction));
        button.m90539c(AbstractC2814h.ButtonSmall_SecondaryNeutral);
        setTrailingGravity(EnumC16952b0.CENTER);
        m90589e(button);
        setBackground(C27280g.m139658a(context, AbstractC16803z.bg_transparent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m76824r(ZDSReactionDetailItemView zDSReactionDetailItemView, View view) {
        InterfaceC13749a interfaceC13749a;
        boolean z11;
        AbstractC19074t.m100208f(zDSReactionDetailItemView, "this$0");
        C24753f c24753f = zDSReactionDetailItemView.f71190I;
        if (c24753f != null && (interfaceC13749a = zDSReactionDetailItemView.f71188G) != null) {
            if (zDSReactionDetailItemView.f71189H == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC13749a.mo60328a(c24753f, z11);
            if (zDSReactionDetailItemView.f71189H == 0) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "reaction_remove_all", "detail_reaction_sheet", null, null, 12, null);
            } else {
                C0732w.m1177r(C0732w.Companion.m1189a(), "reaction_remove_by_type", "", C22423y.m115856i(c24753f.m128595h()), null, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m76825s(ZDSReactionDetailItemView zDSReactionDetailItemView, ContactProfile contactProfile, View view) {
        AbstractC19074t.m100208f(zDSReactionDetailItemView, "this$0");
        AbstractC19074t.m100208f(contactProfile, "$contactProfile");
        InterfaceC13749a interfaceC13749a = zDSReactionDetailItemView.f71188G;
        if (interfaceC13749a != null) {
            interfaceC13749a.mo60329b(contactProfile);
        }
    }

    /* renamed from: q */
    public final void m76826q(C24753f c24753f, int i11) {
        boolean z11;
        Avatar avatar;
        AbstractC19074t.m100208f(c24753f, "reactionMsgType");
        int i12 = 0;
        if (this.f71189H == 0 && i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f71190I = c24753f;
        Button button = null;
        final ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, String.valueOf(c24753f.m128601n()), null, 2, null);
        if (m141798e != null) {
            setOnClickListener(new View.OnClickListener() { // from class: lb0.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZDSReactionDetailItemView.m76825s(ZDSReactionDetailItemView.this, m141798e, view);
                }
            });
            String m40383Q = m141798e.m40383Q(true, true);
            if (m40383Q == null) {
                m40383Q = "";
            } else {
                AbstractC19074t.m100205c(m40383Q);
            }
            setTitle(m40383Q);
            View leadingItem = getLeadingItem();
            if (leadingItem instanceof Avatar) {
                avatar = (Avatar) leadingItem;
            } else {
                avatar = null;
            }
            if (avatar != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.valueOf(c24753f.m128601n()));
                avatar.m90480p(arrayList);
                if (z11) {
                    setBackgroundColor(Color.parseColor("#1af5a623"));
                    Context context = getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    C16974f c16974f = new C16974f(context);
                    c16974f.m90967q(AbstractC1388a.m6964f(c16974f.m90953c(), AbstractC16803z.icn_csc_reaction_top));
                    avatar.setOnlineStatusBadge(c16974f);
                } else {
                    setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.transparent));
                    avatar.setOnlineStatusBadge(null);
                }
            }
        }
        CharSequence m143358I = C28652r.m143349v().m143358I(c24753f.m128596i() + " " + c24753f.m128594g(), AbstractC23222t7.f112576o);
        AbstractC19074t.m100207e(m143358I, "getTextEmoticonParsed(...)");
        setSubtitle(m143358I);
        View trailingItem = getTrailingItem();
        if (trailingItem instanceof Button) {
            button = (Button) trailingItem;
        }
        if (button != null) {
            if (AbstractC19074t.m100204b(String.valueOf(c24753f.m128601n()), CoreUtility.f89233i)) {
                button.setOnClickListener(new View.OnClickListener() { // from class: lb0.e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ZDSReactionDetailItemView.m76824r(ZDSReactionDetailItemView.this, view);
                    }
                });
                if (this.f71189H != 0 ? !C24265l.Companion.m126709b().m126699o().m128548f() : !C24265l.Companion.m126709b().m126699o().m128547e()) {
                    i12 = 8;
                }
                button.setVisibility(i12);
                return;
            }
            button.setVisibility(8);
        }
    }
}
