package v50;

import android.os.Bundle;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.transfer.ChatWindowReference;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import p205hc.InterfaceC19969h;

/* renamed from: v50.ub */
/* loaded from: classes5.dex */
public final class C27856ub implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: A */
    public boolean f130043A;

    /* renamed from: E */
    public boolean f130047E;

    /* renamed from: F */
    public boolean f130048F;

    /* renamed from: G */
    public boolean f130049G;

    /* renamed from: K */
    public ChatWindowReference f130053K;

    /* renamed from: L */
    public int f130054L;

    /* renamed from: a */
    public String f130056a;

    /* renamed from: b */
    public String f130057b;

    /* renamed from: c */
    public String f130058c;

    /* renamed from: d */
    public int f130059d;

    /* renamed from: e */
    public long f130060e;

    /* renamed from: g */
    public boolean f130062g;

    /* renamed from: h */
    public String f130063h;

    /* renamed from: i */
    public List f130064i;

    /* renamed from: j */
    public boolean f130065j;

    /* renamed from: k */
    public boolean f130066k;

    /* renamed from: l */
    public boolean f130067l;

    /* renamed from: m */
    public MessageId f130068m;

    /* renamed from: n */
    public String f130069n;

    /* renamed from: o */
    public int f130070o;

    /* renamed from: r */
    public boolean f130073r;

    /* renamed from: s */
    public boolean f130074s;

    /* renamed from: t */
    public boolean f130075t;

    /* renamed from: u */
    public boolean f130076u;

    /* renamed from: f */
    public String f130061f = "";

    /* renamed from: p */
    public String f130071p = "";

    /* renamed from: q */
    public String f130072q = "";

    /* renamed from: v */
    public String f130077v = "";

    /* renamed from: w */
    public String f130078w = "";

    /* renamed from: x */
    public String f130079x = "";

    /* renamed from: y */
    public String f130080y = "";

    /* renamed from: z */
    public String f130081z = "";

    /* renamed from: B */
    public String f130044B = "";

    /* renamed from: C */
    public String f130045C = "";

    /* renamed from: D */
    public String f130046D = "";

    /* renamed from: H */
    public String f130050H = "";

    /* renamed from: I */
    public int f130051I = Integer.MIN_VALUE;

    /* renamed from: J */
    public String f130052J = "";

    /* renamed from: M */
    public String f130055M = "";

    /* renamed from: v50.ub$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        private final void m140772b(Bundle bundle) {
            bundle.remove("search_message");
            bundle.remove("extra_oa_center_from_qr");
            bundle.remove("extra_chat_open_call_oa_dialog");
        }

        /* renamed from: a */
        public final C27856ub m140773a(Bundle bundle) {
            if (bundle == null) {
                return new C27856ub();
            }
            C27856ub c27856ub = new C27856ub();
            c27856ub.f130056a = bundle.getString("extra_chat_profile_uid");
            c27856ub.f130057b = bundle.getString("extra_chat_profile_dpn");
            c27856ub.f130058c = bundle.getString("extra_chat_profile_avt");
            c27856ub.f130059d = bundle.getInt("extra_chat_profile_type_contact", 0);
            c27856ub.f130060e = bundle.getLong("extra_chat_profile_last_action", 0L);
            String string = bundle.getString("search_message", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            c27856ub.f130061f = string;
            c27856ub.f130062g = bundle.getBoolean("from_report_message", false);
            c27856ub.f130063h = bundle.getString("report_session_id");
            c27856ub.f130064i = bundle.getParcelableArrayList("report_list_msg_id_attached");
            c27856ub.f130065j = bundle.getBoolean("extra_dismiss_show_code", false);
            c27856ub.f130066k = !bundle.containsKey("extra_dismiss_show_code");
            c27856ub.f130068m = (MessageId) bundle.getParcelable("STR_EXTRA_JUMP_TO_MESSAGE_ID");
            c27856ub.f130067l = bundle.getBoolean("EXTRA_OPEN_KEYBOARD", false);
            c27856ub.f130069n = bundle.getString("STR_EXTRA_NOTI_TYPE");
            c27856ub.f130070o = bundle.getInt("INT_EXTRA_NOTI_ACTION_TYPE", 0);
            String string2 = bundle.getString("str_extra_prefill_text", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            c27856ub.f130071p = string2;
            String string3 = bundle.getString("str_extra_prefill_link_attachment", "");
            AbstractC19074t.m100207e(string3, "getString(...)");
            c27856ub.f130072q = string3;
            c27856ub.f130073r = bundle.getBoolean("fromMissedCallNotification", false);
            c27856ub.f130074s = bundle.getBoolean("fromVideoNotif", false);
            c27856ub.f130075t = bundle.getBoolean("cancelVideoCompress", false);
            c27856ub.f130076u = bundle.getBoolean("fromNotification", false);
            String string4 = bundle.getString("uidNotif", "");
            AbstractC19074t.m100207e(string4, "getString(...)");
            c27856ub.f130077v = string4;
            String string5 = bundle.getString("dpnNotif", "");
            AbstractC19074t.m100207e(string5, "getString(...)");
            c27856ub.f130078w = string5;
            String string6 = bundle.getString("avtNotif", "");
            AbstractC19074t.m100207e(string6, "getString(...)");
            c27856ub.f130079x = string6;
            String string7 = bundle.getString("groupId", "");
            AbstractC19074t.m100207e(string7, "getString(...)");
            c27856ub.f130080y = string7;
            String string8 = bundle.getString("groupName", "");
            AbstractC19074t.m100207e(string8, "getString(...)");
            c27856ub.f130081z = string8;
            c27856ub.f130048F = bundle.getBoolean("alreadyCreateGroup", false);
            c27856ub.f130043A = bundle.getBoolean("fromPopupSmsWarning", false);
            String string9 = bundle.getString("roomId", "");
            AbstractC19074t.m100207e(string9, "getString(...)");
            c27856ub.f130044B = string9;
            String string10 = bundle.getString("roomDesc", "");
            AbstractC19074t.m100207e(string10, "getString(...)");
            c27856ub.f130045C = string10;
            String string11 = bundle.getString("msgToCreateGroup", "");
            AbstractC19074t.m100207e(string11, "getString(...)");
            c27856ub.f130046D = string11;
            c27856ub.f130047E = bundle.getBoolean("extra_open_from_search", false);
            c27856ub.f130051I = bundle.getInt("INT_EXTRA_ATTACHMENT_ID_HIGHLIGHT", Integer.MIN_VALUE);
            String string12 = bundle.getString("STR_SOURCE_START_VIEW", "");
            AbstractC19074t.m100207e(string12, "getString(...)");
            c27856ub.f130052J = string12;
            c27856ub.f130049G = bundle.getBoolean("extra_chat_open_call_oa_dialog", false);
            String string13 = bundle.getString("extra_oa_center_from_qr", "");
            AbstractC19074t.m100207e(string13, "getString(...)");
            c27856ub.f130050H = string13;
            c27856ub.f130053K = (ChatWindowReference) bundle.getParcelable("extra_chat_last_chat_window_reference");
            c27856ub.f130054L = bundle.getInt("extra_global_search_click_count", 0);
            String string14 = bundle.getString("EXTRA_CSC_OPENING_SOURCE", "");
            AbstractC19074t.m100207e(string14, "getString(...)");
            c27856ub.f130055M = string14;
            C27856ub.Companion.m140772b(bundle);
            return c27856ub;
        }
    }

    /* renamed from: a */
    public static final C27856ub m140771a(Bundle bundle) {
        return Companion.m140773a(bundle);
    }

    public String toString() {
        return "ChatViewArgs(uid=" + this.f130056a + ", keySearch=" + this.f130061f + ", jumpMessageId=" + this.f130068m + ", fromNotification=" + this.f130076u + ")";
    }
}
