package p186gj;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7956b;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17999s0;
import eg0.AbstractC18428c;
import fj.C18961d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23185q3;
import mg.C23288a;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p019aj.C0876j;
import p348mi.AbstractC23304d;
import p363nh.C23744a;
import vg.C28023b6;
import vg.C28203u6;

/* renamed from: gj.d */
/* loaded from: classes3.dex */
public final class C19460d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0876j f96583a;

    /* renamed from: b */
    private final C28203u6 f96584b;

    /* renamed from: gj.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C19460d(C0876j c0876j, C28203u6 c28203u6) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c28203u6, "profileManager");
        this.f96583a = c0876j;
        this.f96584b = c28203u6;
    }

    /* renamed from: b */
    private final void m101766b(C17945a0 c17945a0) {
        try {
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            if (C28023b6.m141250h0().m141291I0(mo95039W2, c17945a0.m95029V3())) {
                ContactProfile m141801m = C28203u6.m141801m(this.f96584b, mo95039W2, false, 2, null);
                if (m141801m != null) {
                    C18961d.m99483e(C18961d.Companion.m99497a(), c17945a0, m141801m, 0, 4, null);
                } else {
                    C28023b6.m141250h0().m141293J(mo95039W2);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SpecialMessageProcessor", e11);
        }
    }

    /* renamed from: d */
    private final void m101767d(C17945a0 c17945a0) {
        String str = c17945a0.m94929K2().f91017v;
        if (str.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("globalMsgId");
        String optString2 = jSONObject.optString("cliMsgId");
        long optLong = jSONObject.optLong("live_location_id");
        long optLong2 = jSONObject.optLong("liveVer");
        double optDouble = jSONObject.optDouble("lat", 0.0d);
        double optDouble2 = jSONObject.optDouble("long", 0.0d);
        C8967m m47867E = C8967m.m47867E();
        String mo95039W2 = c17945a0.mo95039W2();
        MessageId.C7932a c7932a = MessageId.Companion;
        String mo95039W22 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
        String m94862C4 = c17945a0.m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        m47867E.m47918h0(optLong, mo95039W2, c7932a.m41066e(optString2, optString, mo95039W22, m94862C4), optLong2, optDouble, optDouble2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m101768f(C19460d c19460d, MessageId messageId, String str) {
        AbstractC19074t.m100208f(c19460d, "this$0");
        AbstractC19074t.m100208f(str, "$ownerId");
        try {
            C17945a0 m2635r = c19460d.f96583a.m2635r(messageId);
            if (m2635r != null && (m2635r.m94929K2() instanceof C17999s0)) {
                C17969i0 m94929K2 = m2635r.m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentLiveStream");
                if (!((C17999s0) m94929K2).f91168B) {
                    C17969i0 m94929K22 = m2635r.m94929K2();
                    AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentLiveStream");
                    ((C17999s0) m94929K22).m95712i(true);
                }
                C7956b.Companion.m41573b().m41513J0(m2635r, m2635r.m94929K2());
                c19460d.m101766b(m2635r);
                C23744a.Companion.m124119a().m124116d(4, m2635r.mo95039W2());
                AbstractC23185q3.m119470b(m2635r.mo95039W2(), m2635r.m95029V3());
                return;
            }
            C17945a0 c17945a0 = (C17945a0) AbstractC23304d.f113448v2.get(str);
            if (c17945a0 != null && c17945a0.m95135f9(messageId)) {
                AbstractC23185q3.m119469a(str);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SpecialMessageProcessor", e11);
        }
    }

    /* renamed from: c */
    public final void m101769c(JSONObject jSONObject, String str, int i11) {
        AbstractC19074t.m100208f(jSONObject, "data");
        AbstractC19074t.m100208f(str, "rawType");
        C17945a0 c17945a0 = new C17945a0(jSONObject, 44, str, i11, false);
        if (c17945a0.m94929K2() == null) {
            return;
        }
        try {
            String str2 = c17945a0.m94929K2().f91016u;
            if (AbstractC19074t.m100204b(str2, "live.stream.end")) {
                m101770e(c17945a0);
            } else if (AbstractC19074t.m100204b(str2, "live.location.end")) {
                m101767d(c17945a0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SpecialMessageProcessor", e11);
        }
    }

    /* renamed from: e */
    public final void m101770e(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        String str = c17945a0.m94929K2().f91017v;
        if (str.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("globalMsgId");
        String optString2 = jSONObject.optString("cliMsgId");
        final String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        MessageId.C7932a c7932a = MessageId.Companion;
        String m94862C4 = c17945a0.m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        final MessageId m41066e = c7932a.m41066e(optString2, optString, mo95039W2, m94862C4);
        AbstractC18428c.m97659b(C23288a.f113033a, mo95039W2, 0, new Runnable() { // from class: gj.c
            @Override // java.lang.Runnable
            public final void run() {
                C19460d.m101768f(C19460d.this, m41066e, mo95039W2);
            }
        }, 2, null);
    }
}
