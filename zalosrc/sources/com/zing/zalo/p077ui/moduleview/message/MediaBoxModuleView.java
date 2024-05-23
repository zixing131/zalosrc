package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.C16977g;
import com.zing.zalo.zdesign.component.EnumC16991i;
import fn0.AbstractC19074t;
import gw.C19669z;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import p132ej.C18446h;
import p132ej.C18447i;
import p132ej.C18451m;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class MediaBoxModuleView extends TabMsgCommonItemModuleView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBoxModuleView(Context context, C12260j c12260j) {
        super(context, c12260j);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: e0 */
    public void mo69764e0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69764e0(c18451m, i11);
        getMAvatar().m90889U1(AbstractC16803z.ava_oa_news);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: j0 */
    public void mo69767j0(C18451m c18451m, boolean z11) {
        CharSequence charSequence;
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69767j0(c18451m, z11);
        C18447i c18447i = (C18447i) c18451m;
        C18446h m41003g = c18447i.m97764o().m41003g();
        if (m41003g == null || (charSequence = m41003g.m97750j()) == null) {
            charSequence = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = c18447i.m97764o().f42894r;
        C18446h m41003g2 = c18447i.m97764o().m41003g();
        if (m41003g2 != null && m41003g2.m97758w()) {
            C18446h m41003g3 = c18447i.m97764o().m41003g();
            if (m41003g3 != null && m41003g3.m97757v()) {
                spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(AbstractC8020f0.cm_draft_vipmsg));
            } else if (charSequence.length() > 0) {
                spannableStringBuilder.append((CharSequence) str).append((CharSequence) ": ").append(charSequence);
            } else {
                spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118746s0(AbstractC8020f0.cm_send_vipmsg, str));
            }
        } else if (charSequence.length() > 0) {
            String m119762z = AbstractC23244v8.m119762z(str);
            AbstractC19074t.m100207e(m119762z, "trimDisplayNameRulePreviewLastMsg(...)");
            spannableStringBuilder.append((CharSequence) m119762z).append((CharSequence) ": ").append(charSequence);
        } else {
            spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118746s0(AbstractC8020f0.cm_vipmsg, str));
        }
        getMListItemModule().m90800B1(spannableStringBuilder);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: k0 */
    public void mo69768k0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "item");
        super.mo69768k0(c18451m, z11);
        C16959c0 mListItemModule = getMListItemModule();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.oa_msg_thread_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        mListItemModule.m90805G1(m118743r0);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: l0 */
    public void mo69781l0(C18451m c18451m, boolean z11, int i11) {
        AbstractC19074t.m100208f(c18451m, "item");
        super.mo69781l0(c18451m, z11, i11);
        C16977g mUnreadBadge = getMUnreadBadge();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16974f c16974f = new C16974f(context);
        c16974f.m90974x(EnumC16991i.CHAT_DOT);
        c16974f.m90975y(true);
        mUnreadBadge.m90983u1(c16974f);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: q0 */
    public int mo69782q0(C18451m c18451m) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        return C19669z.f97580b0;
    }
}
