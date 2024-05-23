package com.zing.zalo.p077ui.moduleview.message;

import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.zviews.ke0;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.util.List;
import on0.AbstractC24341v;
import p348mi.C23302b;
import p716zh.C31973j5;

/* renamed from: com.zing.zalo.ui.moduleview.message.l */
/* loaded from: classes6.dex */
public abstract class AbstractC12441l {
    /* renamed from: a */
    public static final void m69869a(C16971e c16971e, ContactProfile contactProfile) {
        AbstractC19074t.m100208f(c16971e, "<this>");
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        if (contactProfile.m40374K0()) {
            m69871c(c16971e, contactProfile.m40388T(false));
            return;
        }
        String str = contactProfile.f42446v;
        AbstractC19074t.m100207e(str, "avt");
        c16971e.m90886N1(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:            if (r1 != false) goto L13;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m69870b(C16971e c16971e, Conversation conversation) {
        boolean m127120J;
        AbstractC19074t.m100208f(c16971e, "<this>");
        AbstractC19074t.m100208f(conversation, "conversation");
        if (conversation.m41013q()) {
            m69871c(c16971e, conversation.m41001e(false));
            return;
        }
        if (C23302b.f113247a.m120523d(conversation.f42895s) && !AbstractC19074t.m100204b(CoreUtility.f89233i, conversation.f42893q)) {
            String str = conversation.f42893q;
            if (!TextUtils.isEmpty(str)) {
                m127120J = AbstractC24341v.m127120J(str, "/", false, 2, null);
            }
            str = ke0.m87327a(conversation.m40998a().f42455y);
            AbstractC19074t.m100207e(str, "createShortPhoneToGenColor(...)");
            c16971e.m90903i2(str);
            String m40418n0 = conversation.m40998a().m40418n0();
            AbstractC19074t.m100207e(m40418n0, "getShortDpnAvt(...)");
            c16971e.m90899e2(m40418n0);
        }
        c16971e.m90886N1(conversation.f42895s);
    }

    /* renamed from: c */
    public static final void m69871c(C16971e c16971e, C31973j5 c31973j5) {
        List m153762h;
        AbstractC19074t.m100208f(c16971e, "<this>");
        if (c31973j5 != null && c31973j5.m153786t0()) {
            String m153756e = c31973j5.m153756e();
            AbstractC19074t.m100205c(m153756e);
            c16971e.m90886N1(m153756e);
        } else if (c31973j5 != null && (m153762h = c31973j5.m153762h()) != null && (!m153762h.isEmpty())) {
            c16971e.mo90887O1(c31973j5.m153762h());
        } else {
            c16971e.m90886N1("");
        }
    }
}
