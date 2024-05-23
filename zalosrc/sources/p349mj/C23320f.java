package p349mj;

import ag0.AbstractC0837p0;
import android.content.Intent;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ContentMessagePopup;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.MessageHintSuggestActivity;
import com.zing.zalo.p077ui.MessagePopupActivity;
import com.zing.zalo.p077ui.RetryMsgPopupActivity;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import dj.C17945a0;
import dj.C17952c1;
import eg0.AbstractC18428c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import km.C21765a;
import me0.AbstractC23165o5;
import mg.C23288a;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p185gc.AbstractC19378b;
import p269jj.C21275a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p405ov.AbstractC24560b;
import p405ov.C24561c;
import p405ov.C24564f;
import p523tb.C26614a;
import si.C26263i;
import vg.C28203u6;
import xd0.C29593i;

/* renamed from: mj.f */
/* loaded from: classes3.dex */
public final class C23320f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C21275a f113513a;

    /* renamed from: b */
    private final C28203u6 f113514b;

    /* renamed from: mj.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C23320f(C21275a c21275a, C28203u6 c28203u6) {
        AbstractC19074t.m100208f(c21275a, "commonRepo");
        AbstractC19074t.m100208f(c28203u6, "profileManager");
        this.f113513a = c21275a;
        this.f113514b = c28203u6;
    }

    /* renamed from: e */
    private final void m122703e(final JSONObject jSONObject) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: mj.d
            @Override // java.lang.Runnable
            public final void run() {
                C23320f.m122704f(jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m122704f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "$data");
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        int i11 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        if (optJSONObject != null) {
            i11 = optJSONObject.optInt("max_thread_count", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        }
        C21765a.m112261e(i11);
    }

    /* renamed from: h */
    private final void m122705h() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: mj.e
            @Override // java.lang.Runnable
            public final void run() {
                C23320f.m122706i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m122706i() {
        C21765a.m112263g();
    }

    /* renamed from: k */
    private final void m122707k() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: mj.c
            @Override // java.lang.Runnable
            public final void run() {
                C23320f.m122708l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m122708l() {
        C21765a.m112265i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m122709n(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "$msg");
        try {
            C29593i m120681k0 = AbstractC23306f.m120681k0();
            AbstractC19074t.m100207e(m120681k0, "provideInsertMessageUseCase(...)");
            AbstractC19074t.m100205c(str);
            AbstractC19378b.m101499c(m120681k0, new C29593i.a(str, c17945a0, null, null, false, 28, null), null, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonPacketHandler", e11);
        }
    }

    /* renamed from: g */
    public final void m122710g() {
        C24561c.m127942b("CommonPacketHandler", "Handle CMD push feedback QoS log");
        AbstractC24560b.m127938c();
        AbstractC24560b.m127940e();
        AbstractC24560b.m127936a();
        C24564f.m127957m();
        C26614a.m136643c(MainApplication.Companion.m35500c()).m136645b();
    }

    /* renamed from: j */
    public final void m122711j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        C24561c.m127942b("CommonPacketHandler", "Handle CMD push storage log: " + jSONObject);
        if (C26263i.m135055u().m135070K()) {
            C24561c.m127942b("CommonPacketHandler", "RESTORING msg -> Skip");
            return;
        }
        try {
            String optString = jSONObject.optString("log_type");
            if (optString != null) {
                int hashCode = optString.hashCode();
                if (hashCode != -824107743) {
                    if (hashCode != 897134578) {
                        if (hashCode == 930663503 && optString.equals("other_account_info")) {
                            m122705h();
                            return;
                        }
                    } else if (optString.equals("storage_info")) {
                        m122707k();
                        return;
                    }
                } else if (optString.equals("big_small_thread")) {
                    m122703e(jSONObject);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid log type " + optString);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonPacketHandler", e11);
        }
    }

    /* renamed from: m */
    public final void m122712m(JSONObject jSONObject) {
        ContactProfile contactProfile;
        String optString;
        AbstractC19074t.m100208f(jSONObject, "jsonData");
        try {
            if (jSONObject.has("showMessageEmpty") && jSONObject.getInt("showMessageEmpty") == 1) {
                final String optString2 = jSONObject.optString("uid");
                String optString3 = jSONObject.optString("avt");
                String optString4 = jSONObject.optString("cover");
                String optString5 = jSONObject.optString("dpn");
                String optString6 = jSONObject.optString("uname");
                String optString7 = jSONObject.optString("phone");
                String optString8 = jSONObject.optString("desc");
                C17952c1 m95408g = C17952c1.m95408g(jSONObject);
                MessageId.C7932a c7932a = MessageId.Companion;
                String m103086b = AbstractC23306f.m120599M0().m103086b();
                AbstractC19074t.m100205c(optString2);
                C17945a0.w m95388x = new C17945a0.w(c7932a.m41064b(m103086b, "", optString2, optString2), 35).m95382r(optString8).m95387w(0).m95361M(jSONObject.getLong("ttl")).m95368d(m95408g).m95388x(jSONObject.optLong("notifyTTL", 0L));
                if (AbstractC23309i.m122564x2() == 1) {
                    m95388x.m95370f(jSONObject.optInt("countUnread", 1));
                }
                final C17945a0 m95365a = m95388x.m95365a();
                AbstractC19074t.m100207e(m95365a, "build(...)");
                m95365a.m94951M9();
                if (optString2.length() > 0) {
                    try {
                        ContactProfile m141798e = C28203u6.m141798e(this.f113514b, optString2, null, 2, null);
                        if (m141798e != null) {
                            AbstractC19074t.m100205c(optString7);
                            if (optString7.length() > 0) {
                                String str = m141798e.f42455y;
                                AbstractC19074t.m100207e(str, "phone");
                                if (str.length() == 0) {
                                    m141798e.f42455y = optString7;
                                }
                            }
                        }
                        if (m141798e == null) {
                            m141798e = new ContactProfile(optString2);
                            m141798e.f42437s = optString5;
                            m141798e.f42446v = optString3;
                            m141798e.f42324B = optString4;
                            m141798e.f42460z1 = optString6;
                            m141798e.f42455y = optString7;
                        }
                        contactProfile = m141798e;
                        C7960e.m41971c6().m42221O7(contactProfile, false);
                    } catch (Exception e11) {
                        e = e11;
                        AbstractC23350e.m122776f("CommonPacketHandler", e);
                        return;
                    }
                } else {
                    contactProfile = null;
                }
                AbstractC20110a.f98889a.mo104556o(8, "handleCmdSuggestFriendEmptyLayout() - uid=" + optString2, new Object[0]);
                StringBuilder sb2 = new StringBuilder();
                if (m95408g.f90882P >= 0 && m95408g.f90883Q > 0) {
                    AbstractC19074t.m100205c(optString7);
                    if (optString7.length() > 0) {
                        String str2 = m95408g.f90873G;
                        AbstractC19074t.m100207e(str2, "description");
                        if (str2.length() > 0) {
                            sb2 = new StringBuilder(m95408g.f90873G);
                            int i11 = m95408g.f90882P;
                            int i12 = i11 + m95408g.f90883Q;
                            if (contactProfile != null) {
                                optString5 = contactProfile.m40383Q(true, false);
                            }
                            sb2.replace(i11, i12, optString5);
                            m95365a.m94961Na(sb2.toString());
                        }
                    }
                }
                AbstractC18428c.m97658a(C23288a.f113033a, optString2, 5, new Runnable() { // from class: mj.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23320f.m122709n(optString2, m95365a);
                    }
                });
                if (jSONObject.has("showQuickReply") && jSONObject.getInt("showQuickReply") == 1 && !AbstractC23165o5.m119333b() && AbstractC23349d.m122763a() < 2) {
                    if (RetryMsgPopupActivity.m56950X3() != null) {
                        RetryMsgPopupActivity.m56954u4(false);
                        RetryMsgPopupActivity.m56950X3().finish();
                    }
                    if (MessagePopupActivity.m56886u4() != null) {
                        MessagePopupActivity.m56884o5(false);
                        MessagePopupActivity.m56886u4().finish();
                    }
                    if (sb2.length() > 0) {
                        optString = sb2.toString();
                    } else {
                        optString = jSONObject.optString("desc");
                    }
                    ContentMessagePopup contentMessagePopup = new ContentMessagePopup(jSONObject.optString("uid"), jSONObject.optString("dpn"), optString, 0, jSONObject.optString("avt"), 0L, "", false);
                    contentMessagePopup.f42526x = jSONObject.optString("phone");
                    contentMessagePopup.f42527y = jSONObject.optString("suggestStickerKeyword");
                    contentMessagePopup.f42528z = true;
                    MessageHintSuggestActivity.m56852z4().add(contentMessagePopup);
                    if (MessageHintSuggestActivity.m56837V4()) {
                        Intent intent = new Intent();
                        intent.setAction("com.zing.zalo.ui.MessageHintSuggestActivityIntent");
                        MainApplication.Companion.m35500c().sendBroadcast(intent);
                    } else {
                        MainApplication.C6895a c6895a = MainApplication.Companion;
                        Intent intent2 = new Intent(c6895a.m35500c(), (Class<?>) MessageHintSuggestActivity.class);
                        intent2.addFlags(67108864);
                        intent2.addFlags(268435456);
                        c6895a.m35500c().startActivity(intent2);
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }
}
