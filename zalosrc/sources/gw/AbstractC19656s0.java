package gw;

import ae.C0766k;
import ag0.C0814e0;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.dialog.ChatDialogView;
import com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17525d;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17955d1;
import dj.C17958e1;
import dj.C17961f1;
import dj.C17969i0;
import dj.C17978l0;
import dj.C17997r1;
import dj.C18002t0;
import dj.C18009w0;
import dj.C18013y0;
import eg0.AbstractC18428c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gm0.AbstractC19509c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23008a2;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mg.C23288a;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p056cj.C3535c;
import p056cj.C3538f;
import p164fn.EnumC19038l;
import p185gc.AbstractC19378b;
import p212hj.AbstractC20071b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p471r3.C25630b;
import p542ub.InterfaceC27218a;
import p560uw.EnumC27374a;
import p716zh.C31868c5;
import sm0.AbstractC26328d;
import vg.C28023b6;
import xd0.C29593i;

/* renamed from: gw.s0 */
/* loaded from: classes4.dex */
public abstract class AbstractC19656s0 {

    /* renamed from: a */
    private static boolean f97529a;

    /* renamed from: gw.s0$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC19656s0.f97529a = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            AbstractC19656s0.f97529a = false;
        }
    }

    /* renamed from: A */
    public static final boolean m103052A(boolean z11) {
        boolean m122413t;
        if (!AbstractC23304d.f113358a0) {
            if (z11) {
                m122413t = AbstractC23309i.m122450u();
            } else {
                m122413t = AbstractC23309i.m122413t();
            }
            if (m122413t) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public static final boolean m103053B(int i11) {
        return i11 == 3 || i11 == 4 || i11 == 19 || i11 == 22;
    }

    /* renamed from: C */
    public static final String m103054C(String str, JSONObject jSONObject, String str2, int i11, String str3) {
        String str4;
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(jSONObject, "jsonMsg");
        AbstractC19074t.m100208f(str2, "rawType");
        if (i11 == 1) {
            String optString = jSONObject.optString("to");
            AbstractC19074t.m100205c(optString);
            if (optString.length() == 0 && AbstractC20071b.Companion.m104322a(str2)) {
                optString = jSONObject.optString("groupId");
            }
            return "group_" + optString;
        }
        if (str3 == null || str3.length() == 0) {
            str3 = jSONObject.optString("fromU");
        }
        if (AbstractC19074t.m100204b(str3, str)) {
            str4 = jSONObject.optString("to");
        } else {
            str4 = str3;
        }
        AbstractC19074t.m100205c(str4);
        return str4;
    }

    /* renamed from: D */
    public static /* synthetic */ String m103055D(String str, JSONObject jSONObject, String str2, int i11, String str3, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        if ((i12 & 16) != 0) {
            str3 = null;
        }
        return m103054C(str, jSONObject, str2, i11, str3);
    }

    /* renamed from: E */
    public static final void m103056E(MessageId messageId, boolean z11) {
        AbstractC19074t.m100208f(messageId, "messageId");
        if (!messageId.m41059z()) {
            return;
        }
        try {
            for (C17945a0 c17945a0 : C7956b.Companion.m41573b().m41565x(messageId)) {
                C17997r1 m95275v4 = c17945a0.m95275v4();
                if (m95275v4 != null && AbstractC19074t.m100204b(messageId, m95275v4.m95689f())) {
                    int i11 = 45;
                    if (m95275v4.m95687d() != 45 && m95275v4.m95687d() != -1) {
                        if (z11) {
                            i11 = -1;
                        }
                        m95275v4.m95700q(i11);
                        C7956b.Companion.m41573b().m41511I0(c17945a0);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: F */
    public static final void m103057F(MessageId messageId, boolean z11) {
        C3535c m2634q;
        List<C17945a0> m17941F0;
        MessageId messageId2;
        int i11;
        AbstractC19074t.m100208f(messageId, "messageId");
        if (messageId.m41059z() && (m2634q = AbstractC23306f.m120584H0().m2634q(messageId.m41048l())) != null && (m17941F0 = m2634q.m17941F0()) != null) {
            for (C17945a0 c17945a0 : m17941F0) {
                C17997r1 m95275v4 = c17945a0.m95275v4();
                if (m95275v4 != null) {
                    messageId2 = m95275v4.m95689f();
                } else {
                    messageId2 = null;
                }
                if (AbstractC19074t.m100204b(messageId2, messageId)) {
                    C17997r1 m95275v42 = c17945a0.m95275v4();
                    if (z11) {
                        i11 = -1;
                    } else {
                        i11 = 45;
                    }
                    m95275v42.m95700q(i11);
                }
            }
        }
    }

    /* renamed from: e */
    public static final C17958e1 m103062e(C17945a0 c17945a0, String str, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "msgToUndo");
        AbstractC19074t.m100208f(str, "customMsgJson");
        if (c17945a0.m94969O6()) {
            if (c17945a0.m94871D7()) {
                C17969i0 m94929K2 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentPhoto");
                C17958e1 c17958e1 = new C17958e1((C18009w0) m94929K2);
                c17958e1.m95432v(str);
                c17958e1.m95433w(z11);
                c17958e1.m95418A();
                return c17958e1;
            }
            if (c17945a0.m95306y8()) {
                C17969i0 m94929K22 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVideo");
                C17958e1 c17958e12 = new C17958e1((C17961f1) m94929K22);
                c17958e12.m95432v(str);
                c17958e12.m95433w(z11);
                c17958e12.m95418A();
                return c17958e12;
            }
            return null;
        }
        if (c17945a0.m95110d8()) {
            C17969i0 m94929K23 = c17945a0.m94929K2();
            AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentSticker");
            C17949b1 c17949b1 = (C17949b1) m94929K23;
            if (!C25630b.f122553O.m132451c(c17949b1.m95397g())) {
                C17958e1 m95437a = C17958e1.Companion.m95437a(c17949b1.m95398h());
                m95437a.m95432v(str);
                m95437a.m95433w(z11);
                m95437a.m95418A();
                return m95437a;
            }
            return null;
        }
        if (str.length() > 0) {
            C17958e1 c17958e13 = new C17958e1(c17945a0.m95041W4(), false, 0L, 0, 0, 30, (AbstractC19060k) null);
            c17958e13.m95432v(str);
            c17958e13.m95433w(z11);
            c17958e13.m95418A();
            return c17958e13;
        }
        return null;
    }

    /* renamed from: f */
    public static final boolean m103063f(String str, JSONObject jSONObject, boolean z11) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(jSONObject, "jsonMsg");
        if (!AbstractC19074t.m100204b(str, "webchat") || !jSONObject.has("mcrypt") || !AbstractC19074t.m100204b(jSONObject.getString("mcrypt"), "1")) {
            return true;
        }
        try {
            jSONObject.put("msg", AbstractC17525d.m93354b(AbstractC19509c.m101978a(jSONObject.getString("iv")), AbstractC23309i.m121551W0(), jSONObject.getString("msg")));
            return true;
        } catch (Exception e11) {
            if (z11) {
                m103065h();
            }
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m103064g(String str, JSONObject jSONObject, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return m103063f(str, jSONObject, z11);
    }

    /* renamed from: h */
    private static final void m103065h() {
        if (f97529a) {
            return;
        }
        f97529a = true;
        AbstractC23309i.m121946gj("");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a());
        c0766k.mo1746ta();
    }

    /* renamed from: i */
    public static final void m103066i(C17945a0 c17945a0, ZaloView zaloView) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(zaloView, "fragment");
        if (c17945a0.m94935L0()) {
            m103067j(c17945a0, zaloView);
        } else {
            m103068k(c17945a0, zaloView);
        }
    }

    /* renamed from: j */
    public static final void m103067j(C17945a0 c17945a0, ZaloView zaloView) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(zaloView, "fragment");
        Context context = zaloView.getContext();
        if (context == null) {
            context = MainApplication.Companion.m35500c();
        }
        AbstractC19074t.m100205c(context);
        String m94983Q3 = c17945a0.m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        String m103079v = m103079v(c17945a0);
        int m65322a = ChatAttachmentContainer.C11728c.m65322a(c17945a0);
        if (m103079v != null && m103079v.length() != 0) {
            Bundle bundle = new Bundle();
            bundle.putString("photo_path", m94983Q3);
            bundle.putString("photo_caption", m103079v);
            bundle.putInt("photo_type", m65322a);
            ChatDialogView.m62825BM(context, bundle).mo13822K();
            return;
        }
        ClipboardManagerOnPrimaryClipChangedListenerC23245w.f112633a.m119775b(context, m94983Q3, m65322a);
    }

    /* renamed from: k */
    public static final void m103068k(C17945a0 c17945a0, ZaloView zaloView) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(zaloView, "fragment");
        try {
            Context context = zaloView.getContext();
            if (context == null) {
                return;
            }
            String str = "";
            if (!c17945a0.m95276v6() && !c17945a0.m95120e6() && !c17945a0.m94871D7() && !c17945a0.m95316z8()) {
                if (c17945a0.m94949M6()) {
                    str = c17945a0.m94983Q3();
                    AbstractC19074t.m100207e(str, "getLocalpath(...)");
                    if (TextUtils.isEmpty(str)) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_must_download_file));
                        return;
                    }
                    if (c17945a0.m94929K2() instanceof C18002t0) {
                        C17969i0 m94929K2 = c17945a0.m94929K2();
                        AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentLocation");
                        if (((C18002t0) m94929K2).f91181B != null) {
                            C17969i0 m94929K22 = c17945a0.m94929K2();
                            AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentLocation");
                            C31868c5 c31868c5 = ((C18002t0) m94929K22).f91181B;
                            Uri.Builder builder = new Uri.Builder();
                            builder.encodedPath(str);
                            builder.appendQueryParameter("latitude", String.valueOf(c31868c5.m153169a()));
                            builder.appendQueryParameter("longitude", String.valueOf(c31868c5.m153170b()));
                            if (!TextUtils.isEmpty(c17945a0.m94929K2().f91011p)) {
                                builder.appendQueryParameter("title", c17945a0.m94929K2().f91011p);
                            }
                            str = builder.build().toString();
                            AbstractC19074t.m100207e(str, "toString(...)");
                        }
                    }
                } else if (c17945a0.m94977P7()) {
                    if (c17945a0.m94929K2() != null && c17945a0.m94929K2().f91016u != null) {
                        String str2 = c17945a0.m94929K2().f91016u;
                        if (AbstractC19074t.m100204b(str2, "recommened.link")) {
                            if (!TextUtils.isEmpty(c17945a0.m94929K2().f91011p)) {
                                if (!c17945a0.f90740s2 && !TextUtils.isEmpty(c17945a0.m94929K2().f91014s)) {
                                    if (zaloView instanceof ChatView) {
                                        ((ChatView) zaloView).mo60056iu(304, new String[]{c17945a0.m94929K2().f91011p, c17945a0.m94929K2().f91014s});
                                    } else {
                                        KeyEventCallbackC17462c m62943sM = ChatDialogView.m62943sM(new String[]{c17945a0.m94929K2().f91011p, c17945a0.m94929K2().f91014s}, context);
                                        if (m62943sM != null) {
                                            m62943sM.mo13822K();
                                        }
                                    }
                                } else {
                                    str = c17945a0.m94929K2().f91011p;
                                }
                            } else if (!TextUtils.isEmpty(c17945a0.m94929K2().f91014s)) {
                                str = c17945a0.m94929K2().f91014s;
                            }
                        } else if (AbstractC19074t.m100204b(str2, "recommened.user")) {
                            C17969i0 m94929K23 = c17945a0.m94929K2();
                            AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentRecommend");
                            C17978l0 c17978l0 = ((C18013y0) m94929K23).f91253D;
                            if (c17978l0 != null) {
                                if (!TextUtils.isEmpty(c17978l0.f91053a)) {
                                    str = c17978l0.f91053a;
                                    AbstractC19074t.m100207e(str, "phoneNumber");
                                } else if (!TextUtils.isEmpty(c17978l0.f91054b)) {
                                    str = c17978l0.f91054b;
                                    AbstractC19074t.m100207e(str, "caption");
                                }
                            } else {
                                str = c17945a0.m95019U3();
                                AbstractC19074t.m100207e(str, "getMessage(...)");
                            }
                        }
                    }
                } else {
                    str = c17945a0.m95019U3();
                    AbstractC19074t.m100207e(str, "getMessage(...)");
                }
                ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(context, str, new SensitiveData("clipboard_access_text_csc", "comm_csc", null, 4, null));
            }
            String m94983Q3 = c17945a0.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            if (TextUtils.isEmpty(m94983Q3)) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_must_download_file));
                return;
            }
            if (c17945a0.m94929K2() != null && !TextUtils.isEmpty(c17945a0.m94929K2().f91011p) && (c17945a0.m95120e6() || c17945a0.m94871D7())) {
                Uri.Builder builder2 = new Uri.Builder();
                builder2.encodedPath(m94983Q3);
                builder2.appendQueryParameter("title", c17945a0.m94929K2().f91011p);
                String uri = builder2.build().toString();
                AbstractC19074t.m100207e(uri, "toString(...)");
                str = uri;
            } else {
                str = m94983Q3;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("test uri build:");
            sb2.append(str);
            ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(context, str, new SensitiveData("clipboard_access_text_csc", "comm_csc", null, 4, null));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public static final EnumC27374a m103069l(List list) {
        AbstractC19074t.m100208f(list, "messageIds");
        Comparable comparable = EnumC27374a.f128964q;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r((MessageId) it.next());
            if (m2635r != null) {
                EnumC27374a m95097c4 = m2635r.m95097c4();
                AbstractC19074t.m100207e(m95097c4, "getMsgWarningTypeLink(...)");
                comparable = AbstractC26328d.m135482f(comparable, m95097c4);
            }
        }
        return (EnumC27374a) comparable;
    }

    /* renamed from: m */
    public static final void m103070m(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        try {
            c17945a0.m95068Z0();
            c17945a0.m94891Fa(false);
            c17945a0.m95165ic(2, true);
            c17945a0.m95245rc(EnumC19038l.f94903p);
            C23744a.Companion.m124119a().m124116d(6, c17945a0.m95029V3(), c17945a0.mo95039W2());
            C28023b6.m141250h0().m141301M(c17945a0.m95029V3().m41044h());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: n */
    public static final int m103071n(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (!c17945a0.m95032V6() || c17945a0.m95219o8() || c17945a0.m95091b6()) {
            return 0;
        }
        if (!c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95316z8()) {
            return 0;
        }
        if (c17945a0.m95180k8()) {
            if (c17945a0.m95107d3() != 5) {
                return 0;
            }
            byte m95089b4 = (byte) c17945a0.m95089b4();
            if (m95089b4 != 2 && m95089b4 != 3 && m95089b4 != 4) {
                return 0;
            }
        } else {
            byte m95089b42 = (byte) c17945a0.m95089b4();
            if (m95089b42 == 1) {
                if (!C0814e0.m2059e(c17945a0.m95029V3())) {
                    return 0;
                }
            } else if (m95089b42 != 2 && m95089b42 != 3 && m95089b42 != 4) {
                return 0;
            }
        }
        return 9;
    }

    /* renamed from: o */
    public static final void m103072o(InterfaceC27218a interfaceC27218a, Bundle bundle, int i11) {
        ArrayList parcelableArrayList;
        int i12;
        MessageId messageId;
        Object parcelable;
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        AbstractC19074t.m100208f(bundle, "bundle");
        ArrayList arrayList = new ArrayList();
        if (bundle.containsKey("forwardMessageId")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = bundle.getParcelable("forwardMessageId", MessageId.class);
                messageId = (MessageId) parcelable;
            } else {
                messageId = (MessageId) bundle.getParcelable("forwardMessageId");
            }
            if (messageId != null) {
                arrayList.add(messageId);
            }
        } else if (bundle.containsKey("EXTRA_LIST_MESSAGE_ID_FORWARDING")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableArrayList = bundle.getParcelableArrayList("EXTRA_LIST_MESSAGE_ID_FORWARDING", MessageId.class);
            } else {
                parcelableArrayList = bundle.getParcelableArrayList("EXTRA_LIST_MESSAGE_ID_FORWARDING");
            }
            if (parcelableArrayList != null) {
                arrayList.addAll(parcelableArrayList);
            }
        }
        EnumC27374a m103069l = m103069l(arrayList);
        EnumC27374a enumC27374a = EnumC27374a.f128968u;
        if (m103069l != enumC27374a && m103069l != EnumC27374a.f128967t) {
            interfaceC27218a.mo35579p().m93066i2(ShareView.class, bundle, i11, 1, true);
            return;
        }
        Context context = interfaceC27218a.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16972e0.a aVar = new C16972e0.a(context);
        if (m103069l == enumC27374a) {
            i12 = AbstractC7409c0.warning_popup_top_view_red;
        } else {
            i12 = AbstractC7409c0.warning_popup_top_view_yellow;
        }
        View inflate = LayoutInflater.from(interfaceC27218a.getContext()).inflate(i12, (ViewGroup) null);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.unsafe_link_share_subtitle_dialog);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        aVar.m90949z(m118743r0);
        aVar.m90920D(inflate);
        aVar.m90942s(AbstractC8020f0.share, new InterfaceC17463d.d() { // from class: gw.p0

            /* renamed from: q */
            public final /* synthetic */ Bundle f97521q;

            /* renamed from: r */
            public final /* synthetic */ int f97522r;

            public /* synthetic */ C19650p0(Bundle bundle2, int i112) {
                r2 = bundle2;
                r3 = i112;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                AbstractC19656s0.m103073p(InterfaceC27218a.this, r2, r3, interfaceC17463d, i13);
            }
        });
        aVar.m90933j(AbstractC8020f0.cancel, new InterfaceC17463d.d() { // from class: gw.q0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                AbstractC19656s0.m103074q(interfaceC17463d, i13);
            }
        });
        aVar.m90923G();
    }

    /* renamed from: p */
    public static final void m103073p(InterfaceC27218a interfaceC27218a, Bundle bundle, int i11, InterfaceC17463d interfaceC17463d, int i12) {
        AbstractC19074t.m100208f(interfaceC27218a, "$activity");
        AbstractC19074t.m100208f(bundle, "$bundle");
        interfaceC17463d.dismiss();
        interfaceC27218a.mo35579p().m93066i2(ShareView.class, bundle, i11, 1, true);
    }

    /* renamed from: q */
    public static final void m103074q(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: r */
    public static final C17955d1 m103075r(C3538f c3538f) {
        AbstractC19074t.m100208f(c3538f, "chatThemeInfo");
        C17955d1 c17955d1 = new C17955d1("", 0, "", "", "", "", "");
        c17955d1.f90888B = c3538f.f14925a;
        c17955d1.f90889C = c3538f.f14926b;
        c17955d1.f90890D = c3538f.f14930f;
        c17955d1.f90891E = c3538f.f14927c;
        String m95415h = c17955d1.m95415h();
        AbstractC19074t.m100207e(m95415h, "getJsonParams(...)");
        c17955d1.f91017v = m95415h;
        return c17955d1;
    }

    /* renamed from: s */
    public static final void m103076s(String str, C3538f c3538f) {
        AbstractC19074t.m100208f(str, "uidTo");
        AbstractC19074t.m100208f(c3538f, "chatThemeInfo");
        AbstractC18428c.m97659b(C23288a.f113033a, str, 0, new Runnable() { // from class: gw.r0

            /* renamed from: q */
            public final /* synthetic */ String f97526q;

            public /* synthetic */ RunnableC19654r0(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19656s0.m103077t(C3538f.this, r2);
            }
        }, 2, null);
    }

    /* renamed from: t */
    public static final void m103077t(C3538f c3538f, String str) {
        AbstractC19074t.m100208f(c3538f, "$chatThemeInfo");
        AbstractC19074t.m100208f(str, "$uidTo");
        if (!TextUtils.isEmpty(c3538f.f14927c) && !AbstractC23041d2.m118194A(c3538f.f14931g)) {
            ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.error_file_notexist));
            return;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.chat_theme_changed_by_me);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        MessageId.C7932a c7932a = MessageId.Companion;
        String m103086b = AbstractC23306f.m120599M0().m103086b();
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        C17945a0 m95365a = new C17945a0.w(c7932a.m41064b(m103086b, "", str, str2), 29).m95387w(0).m95382r(m118743r0).m95368d(m103075r(c3538f)).m95365a();
        AbstractC19074t.m100207e(m95365a, "build(...)");
        m95365a.m94951M9();
        C29593i m120681k0 = AbstractC23306f.m120681k0();
        AbstractC19074t.m100207e(m120681k0, "provideInsertMessageUseCase(...)");
        AbstractC19378b.m101499c(m120681k0, new C29593i.a(str, m95365a, null, null, false, 28, null), null, 2, null);
        AbstractC23306f.m120724x().m99492f(m95365a);
    }

    /* renamed from: u */
    public static final String m103078u(String str, JSONObject jSONObject, String str2, boolean z11) {
        JSONObject m117932a;
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(jSONObject, "msgJson");
        AbstractC19074t.m100208f(str2, "rawType");
        String optString = jSONObject.optString("fromU");
        AbstractC19074t.m100205c(optString);
        if (optString.length() == 0 && AbstractC20071b.Companion.m104322a(str2)) {
            optString = jSONObject.optString("senderId");
        }
        String str3 = str + jSONObject.optString("cliMsgId") + optString;
        if (z11 && (m117932a = AbstractC23008a2.m117932a(jSONObject.optString("e2ee"), true)) != null && m117932a.optInt("retry") > 0) {
            return ((Object) str3) + "_re-e2ee";
        }
        return str3;
    }

    /* renamed from: v */
    public static final String m103079v(C17945a0 c17945a0) {
        C17969i0 m94929K2;
        if (c17945a0 == null) {
            return null;
        }
        if (c17945a0.m95208n8()) {
            return c17945a0.m95019U3();
        }
        if ((!c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95306y8() && !c17945a0.m94960N7()) || (m94929K2 = c17945a0.m94929K2()) == null) {
            return null;
        }
        return m94929K2.f91011p;
    }

    /* renamed from: w */
    public static final String m103080w(String str, int i11) {
        AbstractC19074t.m100208f(str, "text");
        if (str.length() <= i11) {
            return str;
        }
        int i12 = i11;
        while (i12 > 0 && !AbstractC19074t.m100204b(String.valueOf(str.charAt(i12)), " ")) {
            i12--;
        }
        if (i12 == 0) {
            String substring = str.substring(0, i11);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring + "…";
        }
        String substring2 = str.substring(0, i12);
        AbstractC19074t.m100207e(substring2, "substring(...)");
        return substring2 + "…";
    }

    /* renamed from: x */
    public static final boolean m103081x(List list) {
        AbstractC19074t.m100208f(list, "chatContents");
        if (list.isEmpty()) {
            return false;
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!((C17945a0) it.next()).m95032V6()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: y */
    public static final boolean m103082y(List list) {
        AbstractC19074t.m100208f(list, "chatContents");
        if (list.isEmpty()) {
            return false;
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!((C17945a0) it.next()).m95099c7()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: z */
    public static final boolean m103083z(C17945a0 c17945a0) {
        boolean z11;
        String m103079v = m103079v(c17945a0);
        if (m103079v != null && m103079v.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }
}
