package p212hj;

import b40.AbstractC2521a0;
import b40.C2544s;
import b40.EnumC2527d0;
import b40.EnumC2529e0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import dj.C17997r1;
import dj.C18005u0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.AbstractC19656s0;
import gw.C19639k;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import mm0.AbstractC23350e;
import nh0.InterfaceC23792b;
import on0.AbstractC24342w;
import on0.AbstractC24344y;
import org.json.JSONObject;
import p019aj.C0876j;
import p056cj.C3533a;
import p056cj.C3543k;
import p056cj.EnumC3539g;
import p111du.AbstractC18069a;
import p133ek.AbstractC18458a;
import p186gj.C19457a;
import p241ij.C20568e;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p405ov.C24559a;
import p645xh.C29628e;
import p716zh.C31961i8;
import p716zh.C31986k3;
import tj.C26710b;
import vg.C28176r6;
import vg.C28203u6;

/* renamed from: hj.d */
/* loaded from: classes3.dex */
public final class C20073d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0876j f98690a;

    /* renamed from: b */
    private final InterfaceC23792b f98691b;

    /* renamed from: c */
    private int f98692c;

    /* renamed from: d */
    private int f98693d;

    /* renamed from: hj.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C20073d(C0876j c0876j, InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f98690a = c0876j;
        this.f98691b = interfaceC23792b;
        this.f98692c = -1;
        this.f98693d = -1;
    }

    /* renamed from: a */
    private final C17945a0 m104340a(C17945a0 c17945a0) {
        String str;
        String str2;
        MessageId.C7932a c7932a = MessageId.Companion;
        String m41044h = c17945a0.m95029V3().m41044h();
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        String m94862C4 = c17945a0.m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        MessageId m41066e = c7932a.m41066e(m41044h, "", mo95039W2, m94862C4);
        C17945a0 m2635r = this.f98690a.m2635r(m41066e);
        if (m2635r != null) {
            boolean m95101c9 = true ^ m2635r.m95101c9(c17945a0, true);
            if (c17945a0.m95178k6()) {
                str = "FAIL";
            } else {
                str = "SUCCESS";
            }
            if (m95101c9) {
                str2 = "| SKIPPED";
            } else {
                str2 = " | HANDLED (" + m41066e + ")";
            }
            C24559a.m127933c("[E2EE]", "Received msg E2EE again: Decrypted " + str + str2);
            if (!m95101c9) {
                return m2635r;
            }
        } else {
            C24559a.m127933c("[E2EE]", "Received msg E2EE again: old msg not found! (" + m41066e + ")");
        }
        return null;
    }

    /* renamed from: c */
    private final C17945a0 m104341c(String str, C3543k c3543k, C17945a0 c17945a0, boolean z11) {
        C17945a0 m104342d;
        boolean z12;
        if (c17945a0.m95218o7() || this.f98690a.m2624g(c17945a0) || (m104342d = m104342d(c17945a0)) == null) {
            return null;
        }
        if (!m104342d.m95219o8() && !m104342d.m95091b6()) {
            if (m104342d.m95170j6() && (m104342d = m104343e(c17945a0, c3543k.m18009b(), c3543k.m18008a(), c3543k.m18010c())) == null) {
                return null;
            }
            if (z11 && !m104342d.m95178k6()) {
                z12 = true;
            } else {
                z12 = false;
            }
            m104346h(m104342d, z12);
            if (m104342d.m94899G7()) {
                m104344f(str, c3543k.m18009b(), m104342d);
            }
            C17997r1 m95275v4 = m104342d.m95275v4();
            if (m95275v4 != null) {
                m104345g(m95275v4);
            }
            m104342d.m94951M9();
        }
        return m104342d;
    }

    /* renamed from: d */
    private final C17945a0 m104342d(C17945a0 c17945a0) {
        int i11;
        C0876j c0876j = this.f98690a;
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        C20568e m2625h = c0876j.m2625h(m95029V3);
        if (m2625h != null) {
            if (m2625h.m107022f()) {
                c17945a0.m95191la(AbstractC19656s0.m103062e(c17945a0, m2625h.m107017a(), m2625h.m107021e()));
                if (m2625h.m107023g()) {
                    i11 = 36;
                } else {
                    i11 = 33;
                }
                c17945a0.m94851Ab(i11);
                c17945a0.m94911I1();
                return c17945a0;
            }
            return null;
        }
        return c17945a0;
    }

    /* renamed from: e */
    private final C17945a0 m104343e(C17945a0 c17945a0, JSONObject jSONObject, C3533a c3533a, String str) {
        C17945a0 c17945a02;
        String str2;
        String str3;
        String m17910e;
        long j11;
        boolean z11;
        AbstractC2521a0 abstractC2521a0;
        AbstractC2521a0 abstractC2521a02;
        String str4;
        boolean z12;
        AbstractC2521a0.e eVar;
        EnumC2529e0 enumC2529e0;
        EnumC2527d0 enumC2527d0;
        int m95149h3 = c17945a0.m95149h3();
        int m95168j3 = c17945a0.m95168j3();
        boolean m94933K7 = c17945a0.m94933K7();
        if (m94933K7) {
            c17945a02 = m104340a(c17945a0);
        } else {
            c17945a02 = c17945a0;
        }
        if (c17945a02 == null && m95168j3 == 0) {
            m95168j3 = -5;
            m95149h3 = 404;
        }
        int i11 = 0;
        String str5 = null;
        if (c3533a != null) {
            c3533a.m17927v(m95168j3);
            c3533a.m17925t(m95149h3);
            if (c17945a0.m94847A6() && m95168j3 == -4) {
                c3533a.m17927v(-6);
            }
            if (c17945a0.m94933K7()) {
                c3533a.m17924s();
            }
            if (m95168j3 != 0) {
                int m153265f = c17945a0.m95184l3().m153265f();
                if (m153265f == 0) {
                    c3533a.m17923r(EnumC3539g.f14933q);
                } else if (m153265f == C29628e.m147249E0().m93424r()) {
                    c3533a.m17923r(EnumC3539g.f14934r);
                } else {
                    c3533a.m17923r(EnumC3539g.f14935s);
                }
            }
            long mo124314i = this.f98691b.mo124314i();
            if (c17945a02 != null) {
                j11 = c17945a02.m94974P4();
            } else {
                j11 = 0;
            }
            if (mo124314i - j11 < 1209600000) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c17945a02 != null && !c17945a02.m94847A6() && c17945a02.m95187l6() && (m95168j3 == -4 || ((m95168j3 == -1 || m95168j3 == -6) && z11))) {
                if (m95168j3 == -4) {
                    String m94919J0 = c17945a02.m94919J0();
                    AbstractC19074t.m100207e(m94919J0, "buildE2eeRequestRetry(...)");
                    c3533a.m17928w(m94919J0);
                }
                if (z11) {
                    c3533a.m17926u(C31986k3.f147083a.m154124d1(jSONObject, str, c17945a02.m95196m4()));
                }
                if (c3533a.m17910e().length() == 0) {
                    if (z11) {
                        enumC2529e0 = EnumC2529e0.f10286r;
                    } else {
                        enumC2529e0 = EnumC2529e0.f10285q;
                    }
                    if (c3533a.m17916k().length() == 0) {
                        c17945a02.m95291wc();
                        if (m95168j3 == -4) {
                            C31986k3 c31986k3 = C31986k3.f147083a;
                            String m94862C4 = c17945a0.m94862C4();
                            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
                            if (c31986k3.m154119Z1(m94862C4, c17945a0.m95196m4(), c17945a0.m94974P4())) {
                                enumC2527d0 = EnumC2527d0.f10277q;
                            } else {
                                enumC2527d0 = EnumC2527d0.f10278r;
                            }
                            abstractC2521a0 = new AbstractC2521a0.f(enumC2529e0, enumC2527d0);
                        } else {
                            abstractC2521a0 = new AbstractC2521a0.g(enumC2529e0);
                        }
                    } else {
                        abstractC2521a0 = new AbstractC2521a0.g(enumC2529e0);
                    }
                } else {
                    if (c3533a.m17916k().length() == 0) {
                        C31986k3 c31986k32 = C31986k3.f147083a;
                        String m94862C42 = c17945a0.m94862C4();
                        AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
                        if (c31986k32.m154119Z1(m94862C42, c17945a0.m95196m4(), c17945a0.m94974P4())) {
                            eVar = new AbstractC2521a0.e(EnumC2527d0.f10277q);
                        } else {
                            eVar = new AbstractC2521a0.e(EnumC2527d0.f10278r);
                        }
                        abstractC2521a0 = eVar;
                    }
                    abstractC2521a02 = null;
                }
                abstractC2521a02 = abstractC2521a0;
            } else {
                if (m95168j3 != 0) {
                    if (!m94933K7 && (c17945a02 == null || !c17945a02.m95198m6())) {
                        if (c17945a02 != null && c17945a02.m94847A6()) {
                            abstractC2521a0 = AbstractC2521a0.d.f10244b;
                        } else if (m95168j3 == -2) {
                            abstractC2521a0 = AbstractC2521a0.b.f10242b;
                        } else if (m95168j3 != -4 && m95168j3 != -1 && m95168j3 != -6) {
                            abstractC2521a0 = AbstractC2521a0.a.f10241b;
                        } else if (!z11) {
                            abstractC2521a0 = new AbstractC2521a0.g(EnumC2529e0.f10285q);
                        }
                    } else {
                        abstractC2521a0 = AbstractC2521a0.c.f10243b;
                    }
                    abstractC2521a02 = abstractC2521a0;
                }
                abstractC2521a02 = null;
            }
            if (abstractC2521a02 != null && !m94933K7) {
                if (c17945a0.m94847A6()) {
                    str4 = "2";
                } else {
                    str4 = "1";
                }
                String str6 = str4;
                if (c3533a.m17916k().length() > 0 || c3533a.m17910e().length() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C2544s.m12799n(c3533a.m17915j(), String.valueOf(c3533a.m17917l()), c17945a0.m95196m4(), str6, c17945a0.m95029V3().m41045i(), c3533a.m17912g(), z12, abstractC2521a02);
            }
            if (c17945a02 != null && c17945a02.m94847A6() && c17945a02.m95178k6() && !c3533a.m17920o()) {
                C31986k3 c31986k33 = C31986k3.f147083a;
                if (c31986k33.m154117Y1()) {
                    MessageId m95029V3 = c17945a02.m95029V3();
                    AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                    c31986k33.m154125e0(jSONObject, str, c3533a, m95029V3);
                    C24559a.m127933c("[E2EE]", "Hold failed group message to decrypt later | " + c17945a02.m95029V3());
                    c17945a02 = null;
                }
            }
        } else if ((c17945a02 != null && c17945a02.m95187l6()) || (c17945a02 != null && c17945a02.m95178k6() && c17945a02.m94847A6())) {
            C24559a.m127933c("[E2EE]", "Received msg E2EE failed waiting & can not ACK: SKIPPED THIS MSG");
            c17945a02 = null;
        }
        if (c17945a02 == null || c17945a02.m95178k6()) {
            int m95041W4 = c17945a0.m95041W4();
            if (c3533a == null) {
                str2 = "ACK SKIPPED | ";
            } else if (c3533a.m17920o()) {
                str2 = "DECRYPT LATER | ";
            } else {
                str2 = "";
            }
            String mo95039W2 = c17945a0.mo95039W2();
            String m94862C43 = c17945a0.m94862C4();
            int m95196m4 = c17945a0.m95196m4();
            MessageId m95029V32 = c17945a0.m95029V3();
            int m95149h32 = c17945a0.m95149h3();
            if (c3533a != null) {
                i11 = c3533a.m17911f();
            }
            if (c3533a != null) {
                str5 = c3533a.m17916k();
            }
            String str7 = "empty";
            if (str5 == null || str5.length() == 0) {
                str3 = "empty";
            } else {
                str3 = "encrypted";
            }
            if (c3533a != null && (m17910e = c3533a.m17910e()) != null && m17910e.length() > 0) {
                str7 = AbstractC24344y.m127213l1(c3533a.m17910e(), 4);
            }
            C24559a.m127933c("[E2EE]", "Received msg e2ee FAILED [" + m95041W4 + "]: " + str2 + "from: (" + mo95039W2 + "_" + m94862C43 + "_" + m95196m4 + ") | id= " + m95029V32 + " | decryptedCode: " + m95149h32 + " | ackCode: " + i11 + " | request_retry: " + str3 + " | retry_key : " + str7);
        }
        return c17945a02;
    }

    /* renamed from: f */
    private final void m104344f(String str, JSONObject jSONObject, C17945a0 c17945a0) {
        String m119453k;
        int m127178g0;
        int m127173b0;
        String optString;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("attach");
            if (optJSONObject == null) {
                return;
            }
            String optString2 = optJSONObject.optString("action");
            JSONObject jSONObject2 = new JSONObject(optJSONObject.optString("params"));
            C31961i8 c31961i8 = new C31961i8();
            c31961i8.f146880a = jSONObject2.optString("pollId");
            c31961i8.f146881b = jSONObject2.optString("question");
            c31961i8.f146883d = jSONObject2.optString("groupId");
            c31961i8.f146895p = jSONObject2.optLong("pollVer");
            String optString3 = jSONObject2.optString("uid");
            String optString4 = jSONObject2.optString("dName");
            if (AbstractC19074t.m100204b(optString3, str)) {
                m119453k = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne);
            } else {
                AbstractC19074t.m100205c(optString3);
                ContactProfile contactProfile = null;
                if (optString3.length() > 0) {
                    contactProfile = C28203u6.m141798e(C28203u6.f131407a, optString3, null, 2, null);
                }
                if (contactProfile != null) {
                    optString4 = AbstractC21935u.m114542i(contactProfile.f42434r, contactProfile.m40383Q(true, false));
                }
                m119453k = AbstractC23184q2.m119453k(optString3, optString4, c31961i8.f146883d);
            }
            C7907e c7907e = new C7907e();
            String m153669g = c31961i8.m153669g();
            String str2 = "";
            JSONObject m96091j = AbstractC18069a.m96091j(jSONObject2, "msg");
            if (m96091j != null) {
                String str3 = AbstractC18458a.f93019a;
                if (AbstractC19074t.m100204b(str3, "vi")) {
                    optString = m96091j.optString("vi");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                } else if (AbstractC19074t.m100204b(str3, "my")) {
                    optString = m96091j.optString("my");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                } else {
                    optString = m96091j.optString("en");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                }
                str2 = optString;
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(str2, Arrays.copyOf(new Object[]{m119453k, m153669g}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC19074t.m100205c(m119453k);
            if (m119453k.length() > 0 && !AbstractC19074t.m100204b(str, optString3)) {
                AbstractC19074t.m100205c(optString3);
                long parseLong = Long.parseLong(optString3);
                AbstractC19074t.m100205c(m119453k);
                m127173b0 = AbstractC24342w.m127173b0(format, m119453k, 0, false, 6, null);
                c7907e.m40852b(new C7907e.a(parseLong, m127173b0, m119453k.length()));
            }
            AbstractC19074t.m100205c(m153669g);
            m127178g0 = AbstractC24342w.m127178g0(format, m153669g, 0, false, 6, null);
            c7907e.m40852b(new C7907e.a(m127178g0, m153669g.length()));
            C18005u0.a m95729k = new C18005u0.a().m95727i(9).m95725g(c7907e).m95719a("action.groupchat.open.polldetail", C31961i8.m153663d(c31961i8.f146880a), AbstractC23136l9.m118743r0(AbstractC8020f0.str_view)).m95729k(c31961i8.f146880a, c31961i8.f146895p);
            c17945a0.m94961Na(format);
            c17945a0.m95191la(m95729k.m95722d(optString2));
            C28176r6.m141702d().m141711l(c31961i8);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MessagePreProcessor", e11);
        }
    }

    /* renamed from: g */
    private final void m104345g(C17997r1 c17997r1) {
        C0876j c0876j = this.f98690a;
        MessageId m95689f = c17997r1.m95689f();
        AbstractC19074t.m100207e(m95689f, "getMessageId(...)");
        C17945a0 m2636s = c0876j.m2636s(m95689f);
        int i11 = -1;
        if (m2636s != null) {
            if (m2636s.m95219o8()) {
                i11 = 45;
            } else if (!m2636s.m95091b6()) {
                i11 = c17997r1.m95687d();
            }
            c17997r1.m95700q(i11);
            return;
        }
        C0876j c0876j2 = this.f98690a;
        MessageId m95689f2 = c17997r1.m95689f();
        AbstractC19074t.m100207e(m95689f2, "getMessageId(...)");
        C20568e m2625h = c0876j2.m2625h(m95689f2);
        if (m2625h != null) {
            if (m2625h.m107023g()) {
                i11 = 45;
            }
            c17997r1.m95700q(i11);
        }
    }

    /* renamed from: h */
    private final void m104346h(C17945a0 c17945a0, boolean z11) {
        int i11;
        if (!c17945a0.m95180k8()) {
            c17945a0.m95155ha(!z11);
        }
        if (c17945a0.m95180k8()) {
            i11 = 2;
        } else if (z11) {
            i11 = 4;
        } else {
            i11 = 3;
        }
        c17945a0.m95016Ta(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ff, code lost:            r13 = r9.m137326a();     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109 A[Catch: Exception -> 0x0091, TryCatch #0 {Exception -> 0x0091, blocks: (B:10:0x002c, B:11:0x003a, B:13:0x0040, B:16:0x0073, B:18:0x0087, B:19:0x0094, B:21:0x00b5, B:22:0x00be, B:24:0x00cd, B:25:0x00d0, B:27:0x00d6, B:32:0x00de, B:38:0x00f4, B:42:0x0103, B:44:0x0109, B:45:0x010c, B:50:0x011b, B:52:0x0133, B:56:0x00ff), top: B:9:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b A[Catch: Exception -> 0x0091, TRY_ENTER, TryCatch #0 {Exception -> 0x0091, blocks: (B:10:0x002c, B:11:0x003a, B:13:0x0040, B:16:0x0073, B:18:0x0087, B:19:0x0094, B:21:0x00b5, B:22:0x00be, B:24:0x00cd, B:25:0x00d0, B:27:0x00d6, B:32:0x00de, B:38:0x00f4, B:42:0x0103, B:44:0x0109, B:45:0x010c, B:50:0x011b, B:52:0x0133, B:56:0x00ff), top: B:9:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133 A[Catch: Exception -> 0x0091, TRY_LEAVE, TryCatch #0 {Exception -> 0x0091, blocks: (B:10:0x002c, B:11:0x003a, B:13:0x0040, B:16:0x0073, B:18:0x0087, B:19:0x0094, B:21:0x00b5, B:22:0x00be, B:24:0x00cd, B:25:0x00d0, B:27:0x00d6, B:32:0x00de, B:38:0x00f4, B:42:0x0103, B:44:0x0109, B:45:0x010c, B:50:0x011b, B:52:0x0133, B:56:0x00ff), top: B:9:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C19457a m104347b(String str, String str2, List list, boolean z11, boolean z12, int i11) {
        C3533a m18008a;
        String str3;
        String m137326a;
        String str4;
        String str5 = str;
        AbstractC19074t.m100208f(str5, "currentUserUid");
        AbstractC19074t.m100208f(str2, "threadId");
        AbstractC19074t.m100208f(list, "msgPackets");
        C19457a c19457a = new C19457a(str2);
        if (str.length() == 0) {
            return c19457a;
        }
        if (list.isEmpty()) {
            return c19457a;
        }
        try {
            c19457a.m101758f(z12);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3543k c3543k = (C3543k) it.next();
                JSONObject m18009b = c3543k.m18009b();
                int m104324c = AbstractC20071b.Companion.m104324c(c3543k.m18010c(), m18009b);
                String m103078u = AbstractC19656s0.m103078u(str5, c3543k.m18009b(), c3543k.m18010c(), z11);
                C26710b m2641y = this.f98690a.m2641y(m103078u);
                C26710b c26710b = (C26710b) linkedHashMap.get(m103078u);
                String str6 = null;
                if (m2641y == null && c26710b == null) {
                    C17945a0 c17945a0 = new C17945a0(m18009b, m104324c, c3543k.m18010c(), i11, z11);
                    if (AbstractC23304d.m120544o()) {
                        C19639k.f97504a.m102874b(c17945a0, this.f98692c, this.f98693d);
                    }
                    C17945a0 m104341c = m104341c(str5, c3543k, c17945a0, c19457a.m101757e());
                    long m41047k = c17945a0.m95029V3().m41047k();
                    String mo95039W2 = c17945a0.mo95039W2();
                    AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                    C3533a m18008a2 = c3543k.m18008a();
                    if (m18008a2 != null) {
                        str4 = m18008a2.m17907b();
                    } else {
                        str4 = null;
                    }
                    C26710b c26710b2 = new C26710b(m103078u, m41047k, mo95039W2, str4);
                    linkedHashMap.put(m103078u, c26710b2);
                    if (m104341c != null) {
                        c19457a.m101753a(m104341c, c26710b2);
                    }
                    if (c17945a0.m94933K7() && (c3543k.m18008a() != null || m104341c != null)) {
                        this.f98690a.m2611M(m103078u, c26710b2.m137327b(), c26710b2.m137329d(), c26710b2.m137326a());
                    }
                } else {
                    if (m2641y != null && (m137326a = m2641y.m137326a()) != null) {
                        str6 = m137326a;
                        m18008a = c3543k.m18008a();
                        if (m18008a != null) {
                            m18008a.m17921p(str6);
                        }
                        if (c3543k.m18008a() != null) {
                            str3 = " | ACK null";
                        } else {
                            str3 = "";
                        }
                        if (c26710b == null) {
                            C24559a.m127933c("MessagePreProcessor", "Duplicated msg in current batch: " + m103078u + str3);
                        } else {
                            C24559a.m127933c("MessagePreProcessor", "Duplicated msg: " + m103078u + str3);
                        }
                    }
                    m18008a = c3543k.m18008a();
                    if (m18008a != null) {
                    }
                    if (c3543k.m18008a() != null) {
                    }
                    if (c26710b == null) {
                    }
                }
                str5 = str;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return c19457a;
    }

    /* renamed from: i */
    public final void m104348i(int i11) {
        this.f98692c = i11;
    }

    /* renamed from: j */
    public final void m104349j(int i11) {
        this.f98693d = i11;
    }
}
