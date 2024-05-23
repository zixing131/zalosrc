package me0;

import ag0.C0856z;
import am.C0943w;
import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import p227i3.C20217u;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;
import p716zh.C31931g8;
import p716zh.C31973j5;
import vg.C28203u6;

/* renamed from: me0.h6 */
/* loaded from: classes4.dex */
public abstract class AbstractC23089h6 {
    /* renamed from: a */
    public static KeyEventCallbackC17462c m118433a(C7904b c7904b, String str, Context context, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2) {
        if (c7904b == null) {
            return null;
        }
        return m118434b(m118441i(c7904b), m118440h(c7904b, str), context, dVar, dVar2);
    }

    /* renamed from: b */
    public static KeyEventCallbackC17462c m118434b(String str, String str2, Context context, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2) {
        return new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(str).m90949z(str2).m90921E(true).m90943t(AbstractC23136l9.m118743r0(AbstractC8020f0.str_unpin), dVar2).m90934k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), dVar).m90927d();
    }

    /* renamed from: c */
    public static ContactProfile m118435c(C31931g8 c31931g8) {
        String m118439g = m118439g(c31931g8);
        if (AbstractC25495a.m132079d(m118439g)) {
            C31973j5 m4472f = C0943w.m4462l().m4472f(m118439g);
            if (m4472f != null) {
                ContactProfile contactProfile = new ContactProfile(m118439g);
                contactProfile.f42437s = m4472f.m153793y();
                return contactProfile;
            }
            return null;
        }
        return C28203u6.f131407a.m141809c(m118439g);
    }

    /* renamed from: d */
    public static String m118436d(C7904b c7904b) {
        int i11 = c7904b.f42729a;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return "pinboard_unpin_event";
                    }
                    if (i11 != 5) {
                        return "";
                    }
                    return "pinboard_unpin_album";
                }
                return "pinboard_unpin_poll";
            }
            return "pinboard_unpin_msg";
        }
        if (c7904b.f42732d > 0) {
            return "pinboard_unpin_event";
        }
        return "pinboard_unpin_note";
    }

    /* renamed from: e */
    public static String m118437e(String str) {
        Conversation m103202S = AbstractC23306f.m120572D0().m103202S(str);
        if (m103202S != null) {
            return m103202S.m40999b(true, false);
        }
        return "";
    }

    /* renamed from: f */
    public static int m118438f(C31931g8 c31931g8) {
        String m153434e = c31931g8.m153434e();
        if (m153434e.equals(C20217u.f99970o)) {
            return 1;
        }
        if (m153434e.equals(C7962g.f43287r)) {
            return 2;
        }
        return 3;
    }

    /* renamed from: g */
    public static String m118439g(C31931g8 c31931g8) {
        if (c31931g8 == null) {
            return "";
        }
        if (c31931g8.m153434e().equals("m")) {
            return "-8";
        }
        return c31931g8.m153439k();
    }

    /* renamed from: h */
    public static String m118440h(C7904b c7904b, String str) {
        int i11;
        if (AbstractC25495a.m132079d(str)) {
            int i12 = c7904b.f42729a;
            if (i12 != 0 && i12 != 1 && i12 != 2 && i12 != 3) {
                return null;
            }
            C31973j5 m4472f = C0943w.m4462l().m4472f(str);
            if (m4472f != null && m4472f.m153747Y()) {
                i11 = AbstractC8020f0.str_community_pinboard_unpin_topic_subtitle;
            } else {
                i11 = AbstractC8020f0.str_pinboard_unpin_topic_subtitle;
            }
            return AbstractC23136l9.m118743r0(i11);
        }
        return "";
    }

    /* renamed from: i */
    public static String m118441i(C7904b c7904b) {
        int i11 = c7904b.f42729a;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_unpin_unknown_title), c7904b.f42754z);
                        }
                        return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_unpin_album_title), c7904b.f42754z);
                    }
                    return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_unpin_reminder_title), c7904b.f42754z);
                }
                return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_unpin_poll_title), c7904b.f42754z);
            }
            return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_unpin_message_title), c7904b.m40773k());
        }
        if (c7904b.f42732d > 0) {
            return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_unpin_reminder_title), c7904b.f42754z);
        }
        return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_unpin_note_title), c7904b.f42754z);
    }

    /* renamed from: j */
    public static boolean m118442j(String str) {
        if (!TextUtils.isEmpty(str) && C0856z.m2393m().m2400j(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static String m118443k(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (AbstractC25495a.m132081f(str)) {
                return "m1";
            }
            return str;
        }
        return "";
    }
}
