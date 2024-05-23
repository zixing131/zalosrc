package ly;

import ae.C0766k;
import am.C0943w;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ap0.C2279a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.GroupLobbyView;
import com.zing.zalo.p077ui.zviews.StickerDetailsView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.io.Serializable;
import java.util.Map;
import java.util.UUID;
import jf0.C21242e;
import me0.AbstractC23059e9;
import me0.AbstractC23152n3;
import me0.C23055e5;
import my.AbstractC23490m;
import on0.AbstractC24340u;
import org.json.JSONObject;
import p00.C24594a;
import p111du.AbstractC18069a;
import p140ev.C18613b;
import p140ev.C18620i;
import p142ey.C18644n;
import p189gv.C19609h;
import p207he.C20024r;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p716zh.C31944h6;
import p716zh.C31973j5;
import p716zh.C31991k8;
import p716zh.C32002l4;
import p716zh.C32076q5;
import pm0.C24848g0;
import qe0.AbstractC25251g;
import sy.AbstractC26412d;
import v50.C27870vb;
import xh0.C29667y;

/* renamed from: ly.w */
/* loaded from: classes4.dex */
public final class C22688w implements InterfaceC22667b {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final String f111163c;

    /* renamed from: a */
    private InterfaceC22668c f111164a;

    /* renamed from: b */
    private UUID f111165b;

    /* renamed from: ly.w$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m117352a(int i11) {
            if (i11 == 30) {
                return 6;
            }
            if (i11 == 31) {
                return 7;
            }
            if (i11 == 33) {
                return 8;
            }
            switch (i11) {
                case 10:
                case 11:
                case 12:
                case 13:
                    return 9;
                default:
                    return 0;
            }
        }
    }

    /* renamed from: ly.w$b */
    /* loaded from: classes4.dex */
    public static abstract class b extends AbstractC22687v {

        /* renamed from: c */
        private final BaseZaloView f111166c;

        /* renamed from: d */
        private final InterfaceC27218a f111167d;

        /* renamed from: e */
        private final boolean f111168e;

        public b(BaseZaloView baseZaloView, InterfaceC27218a interfaceC27218a, boolean z11) {
            this.f111166c = baseZaloView;
            this.f111167d = interfaceC27218a;
            this.f111168e = z11;
        }

        @Override // ly.AbstractC22687v
        /* renamed from: R */
        public InterfaceC27218a mo49367R() {
            return this.f111167d;
        }

        @Override // ly.AbstractC22687v
        /* renamed from: U */
        public BaseZaloView mo49369U() {
            return this.f111166c;
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: b */
        public void mo49371b() {
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: e */
        public void mo49372e(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: h */
        public boolean mo49375h() {
            return this.f111168e;
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: i */
        public void mo49376i(int i11) {
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: q */
        public void mo49385q(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
        }
    }

    /* renamed from: ly.w$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ AbstractC23490m f111170b;

        /* renamed from: c */
        final /* synthetic */ int f111171c;

        public c(AbstractC23490m abstractC23490m, int i11) {
            this.f111170b = abstractC23490m;
            this.f111171c = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        /* JADX WARN: Removed duplicated region for block: B:267:0x0652  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x0655  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x065f A[Catch: Exception -> 0x005b, TryCatch #4 {Exception -> 0x005b, blocks: (B:12:0x0033, B:14:0x0056, B:15:0x005f, B:16:0x0068, B:17:0x006b, B:19:0x0073, B:307:0x00b3, B:23:0x00b7, B:33:0x00c7, B:34:0x00ca, B:35:0x00ed, B:37:0x00f5, B:40:0x00cd, B:41:0x00d0, B:42:0x00d3, B:43:0x00d6, B:44:0x00d9, B:45:0x00dc, B:46:0x00df, B:47:0x00e2, B:48:0x00e5, B:49:0x00e8, B:50:0x00eb, B:330:0x016a, B:51:0x016e, B:53:0x0182, B:56:0x018f, B:58:0x0199, B:60:0x019f, B:62:0x01a5, B:64:0x01ab, B:65:0x01b4, B:77:0x01f5, B:79:0x01fb, B:83:0x020c, B:85:0x0229, B:86:0x025c, B:92:0x01ef, B:94:0x022f, B:96:0x0235, B:97:0x023b, B:104:0x0259, B:105:0x0260, B:107:0x026a, B:109:0x0270, B:111:0x0276, B:113:0x027c, B:114:0x0284, B:126:0x02b8, B:128:0x02be, B:129:0x02ef, B:132:0x02b3, B:133:0x02c7, B:135:0x02cd, B:136:0x02d3, B:138:0x02e1, B:139:0x02f3, B:141:0x0310, B:142:0x031b, B:144:0x032e, B:147:0x0337, B:149:0x0347, B:151:0x034f, B:153:0x0369, B:155:0x03bd, B:156:0x03c4, B:158:0x03c8, B:160:0x03d0, B:161:0x03d5, B:163:0x03f5, B:165:0x03fd, B:166:0x041a, B:168:0x0408, B:170:0x0410, B:171:0x041e, B:173:0x0426, B:174:0x042b, B:176:0x0439, B:178:0x0441, B:180:0x0447, B:182:0x044f, B:184:0x0471, B:185:0x0492, B:187:0x0479, B:189:0x047f, B:191:0x0485, B:192:0x0496, B:194:0x049e, B:195:0x04a3, B:197:0x04af, B:199:0x04c1, B:200:0x04c8, B:202:0x04cc, B:204:0x04d4, B:205:0x04d9, B:207:0x04eb, B:209:0x052f, B:210:0x0536, B:212:0x053a, B:214:0x054a, B:215:0x054f, B:218:0x0566, B:220:0x056e, B:223:0x057b, B:225:0x0583, B:228:0x058e, B:233:0x05ab, B:235:0x05b3, B:236:0x05b9, B:238:0x05bf, B:239:0x05e5, B:241:0x0603, B:242:0x06a8, B:244:0x05e0, B:245:0x060c, B:247:0x061b, B:248:0x0672, B:250:0x067e, B:251:0x0684, B:253:0x0688, B:255:0x0693, B:257:0x069b, B:258:0x06a5, B:259:0x062c, B:265:0x064a, B:268:0x0657, B:271:0x065f, B:272:0x0661, B:275:0x066f, B:277:0x0635, B:279:0x063b, B:282:0x059d, B:285:0x06ab, B:287:0x06b3, B:290:0x06b9, B:292:0x06c1, B:298:0x06dc, B:301:0x06d9, B:310:0x00ae, B:334:0x0167, B:70:0x01d3, B:72:0x01db, B:74:0x01e3, B:303:0x007a, B:305:0x009a, B:294:0x06c6, B:296:0x06ce, B:99:0x0243, B:101:0x0249, B:312:0x0104, B:314:0x010c, B:315:0x013c, B:321:0x0154, B:322:0x0155, B:324:0x015d, B:328:0x0165, B:329:0x0166, B:118:0x0295, B:120:0x029d, B:122:0x02a5), top: B:11:0x0033, inners: #1, #3, #5, #6, #7, #9 }] */
        /* JADX WARN: Removed duplicated region for block: B:274:0x066c  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x066d  */
        /* JADX WARN: Removed duplicated region for block: B:342:0x06ea A[Catch: Exception -> 0x06f2, TryCatch #8 {Exception -> 0x06f2, blocks: (B:340:0x06e2, B:342:0x06ea, B:343:0x06f4, B:345:0x06fc, B:346:0x0701, B:348:0x0709), top: B:339:0x06e2 }] */
        /* JADX WARN: Removed duplicated region for block: B:345:0x06fc A[Catch: Exception -> 0x06f2, TryCatch #8 {Exception -> 0x06f2, blocks: (B:340:0x06e2, B:342:0x06ea, B:343:0x06f4, B:345:0x06fc, B:346:0x0701, B:348:0x0709), top: B:339:0x06e2 }] */
        /* JADX WARN: Removed duplicated region for block: B:348:0x0709 A[Catch: Exception -> 0x06f2, TRY_LEAVE, TryCatch #8 {Exception -> 0x06f2, blocks: (B:340:0x06e2, B:342:0x06ea, B:343:0x06f4, B:345:0x06fc, B:346:0x0701, B:348:0x0709), top: B:339:0x06e2 }] */
        /* JADX WARN: Removed duplicated region for block: B:351:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0229 A[Catch: Exception -> 0x005b, TryCatch #4 {Exception -> 0x005b, blocks: (B:12:0x0033, B:14:0x0056, B:15:0x005f, B:16:0x0068, B:17:0x006b, B:19:0x0073, B:307:0x00b3, B:23:0x00b7, B:33:0x00c7, B:34:0x00ca, B:35:0x00ed, B:37:0x00f5, B:40:0x00cd, B:41:0x00d0, B:42:0x00d3, B:43:0x00d6, B:44:0x00d9, B:45:0x00dc, B:46:0x00df, B:47:0x00e2, B:48:0x00e5, B:49:0x00e8, B:50:0x00eb, B:330:0x016a, B:51:0x016e, B:53:0x0182, B:56:0x018f, B:58:0x0199, B:60:0x019f, B:62:0x01a5, B:64:0x01ab, B:65:0x01b4, B:77:0x01f5, B:79:0x01fb, B:83:0x020c, B:85:0x0229, B:86:0x025c, B:92:0x01ef, B:94:0x022f, B:96:0x0235, B:97:0x023b, B:104:0x0259, B:105:0x0260, B:107:0x026a, B:109:0x0270, B:111:0x0276, B:113:0x027c, B:114:0x0284, B:126:0x02b8, B:128:0x02be, B:129:0x02ef, B:132:0x02b3, B:133:0x02c7, B:135:0x02cd, B:136:0x02d3, B:138:0x02e1, B:139:0x02f3, B:141:0x0310, B:142:0x031b, B:144:0x032e, B:147:0x0337, B:149:0x0347, B:151:0x034f, B:153:0x0369, B:155:0x03bd, B:156:0x03c4, B:158:0x03c8, B:160:0x03d0, B:161:0x03d5, B:163:0x03f5, B:165:0x03fd, B:166:0x041a, B:168:0x0408, B:170:0x0410, B:171:0x041e, B:173:0x0426, B:174:0x042b, B:176:0x0439, B:178:0x0441, B:180:0x0447, B:182:0x044f, B:184:0x0471, B:185:0x0492, B:187:0x0479, B:189:0x047f, B:191:0x0485, B:192:0x0496, B:194:0x049e, B:195:0x04a3, B:197:0x04af, B:199:0x04c1, B:200:0x04c8, B:202:0x04cc, B:204:0x04d4, B:205:0x04d9, B:207:0x04eb, B:209:0x052f, B:210:0x0536, B:212:0x053a, B:214:0x054a, B:215:0x054f, B:218:0x0566, B:220:0x056e, B:223:0x057b, B:225:0x0583, B:228:0x058e, B:233:0x05ab, B:235:0x05b3, B:236:0x05b9, B:238:0x05bf, B:239:0x05e5, B:241:0x0603, B:242:0x06a8, B:244:0x05e0, B:245:0x060c, B:247:0x061b, B:248:0x0672, B:250:0x067e, B:251:0x0684, B:253:0x0688, B:255:0x0693, B:257:0x069b, B:258:0x06a5, B:259:0x062c, B:265:0x064a, B:268:0x0657, B:271:0x065f, B:272:0x0661, B:275:0x066f, B:277:0x0635, B:279:0x063b, B:282:0x059d, B:285:0x06ab, B:287:0x06b3, B:290:0x06b9, B:292:0x06c1, B:298:0x06dc, B:301:0x06d9, B:310:0x00ae, B:334:0x0167, B:70:0x01d3, B:72:0x01db, B:74:0x01e3, B:303:0x007a, B:305:0x009a, B:294:0x06c6, B:296:0x06ce, B:99:0x0243, B:101:0x0249, B:312:0x0104, B:314:0x010c, B:315:0x013c, B:321:0x0154, B:322:0x0155, B:324:0x015d, B:328:0x0165, B:329:0x0166, B:118:0x0295, B:120:0x029d, B:122:0x02a5), top: B:11:0x0033, inners: #1, #3, #5, #6, #7, #9 }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            InterfaceC22668c m117347e;
            InterfaceC22668c m117347e2;
            InterfaceC22668c m117347e3;
            Integer m127107m;
            int i11;
            boolean z11;
            boolean z12;
            Intent m118998H;
            int i12;
            InterfaceC22668c m117347e4;
            ContactProfile contactProfile;
            InterfaceC22668c m117347e5;
            JSONObject optJSONObject;
            boolean z13;
            String str;
            int i13;
            InterfaceC22668c m117347e6;
            JSONObject optJSONObject2;
            C18620i c18620i;
            InterfaceC22668c m117347e7 = C22688w.this.m117347e();
            if (m117347e7 != null && !m117347e7.mo49377j(this.f111170b)) {
                try {
                    String unused = C22688w.f111163c;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("checkQRCodeLink Success:");
                    sb2.append(obj);
                    InterfaceC22668c m117347e8 = C22688w.this.m117347e();
                    if (m117347e8 != null) {
                        m117347e8.mo117297c();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                try {
                    try {
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                        AbstractC19074t.m100207e(jSONObject, "getJSONObject(...)");
                        String string = jSONObject.getString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        m127107m = AbstractC24340u.m127107m(string);
                        if (m127107m != null) {
                            i11 = m127107m.intValue();
                        } else {
                            i11 = -1;
                        }
                        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
                        Serializable serializable = null;
                        String str2 = null;
                        boolean z14 = false;
                        switch (i11) {
                            case -1:
                                InterfaceC22668c m117347e9 = C22688w.this.m117347e();
                                if (m117347e9 != null) {
                                    m117347e9.mo49376i(-1);
                                    C24848g0 c24848g02 = C24848g0.f119245a;
                                }
                                try {
                                    InterfaceC22668c m117347e10 = C22688w.this.m117347e();
                                    if (m117347e10 != null) {
                                        m117347e10.mo49382n(this.f111170b, this.f111171c);
                                        C24848g0 c24848g03 = C24848g0.f119245a;
                                    }
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                C24848g0 c24848g04 = C24848g0.f119245a;
                                return;
                            case 0:
                                InterfaceC22668c m117347e11 = C22688w.this.m117347e();
                                if (m117347e11 != null) {
                                    m117347e11.mo117298d();
                                    C24848g0 c24848g05 = C24848g0.f119245a;
                                    return;
                                }
                                return;
                            case 1:
                                C32002l4 m154287a = C32002l4.Companion.m154287a(42);
                                InterfaceC22668c m117347e12 = C22688w.this.m117347e();
                                if (m117347e12 != null) {
                                    m117347e12.mo117300s(0);
                                    C24848g0 c24848g06 = C24848g0.f119245a;
                                }
                                String string2 = jSONObject2.getString("userId");
                                int optInt = jSONObject2.optInt("typeContact");
                                if (jSONObject2.optInt("check_open_gallery_profile") == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (jSONObject2.optInt("check_friend_open_chat") == 1 && C18644n.m98531l().m98558u(string2)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (jSONObject2.optInt("check_follow_open_chat") == 1 && C21927m.m114302u().m114322U(string2)) {
                                    z12 = true;
                                }
                                int optInt2 = jSONObject2.optInt("source", -1);
                                if (optInt2 == 91 || optInt2 == 92) {
                                    C21927m.m114302u().m114330e0(string2, new TrackingSource(optInt2));
                                }
                                if (z12) {
                                    JSONObject optJSONObject3 = jSONObject.optJSONObject("profile");
                                    if (optJSONObject3 != null) {
                                        str2 = optJSONObject3.optString("uid");
                                    }
                                    if (!TextUtils.isEmpty(str2)) {
                                        AbstractC19074t.m100205c(str2);
                                        contactProfile = new ContactProfile(str2);
                                        contactProfile.f42437s = optJSONObject3.optString("disp");
                                        contactProfile.f42446v = optJSONObject3.optString("avt");
                                        contactProfile.f42458z = optJSONObject3.optString("status");
                                    } else {
                                        contactProfile = new ContactProfile(string2);
                                    }
                                    String mo2478b = contactProfile.mo2478b();
                                    AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                                    Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140776b();
                                    InterfaceC22668c m117347e13 = C22688w.this.m117347e();
                                    if (m117347e13 != null) {
                                        m117347e13.mo49386u(ChatView.class, m140776b, -1);
                                        C24848g0 c24848g07 = C24848g0.f119245a;
                                    }
                                } else {
                                    AbstractC23647d.m123907q("5410", "");
                                    if (AbstractC19074t.m100204b(CoreUtility.f89233i, string2)) {
                                        C31991k8 c31991k8 = new C31991k8(string2);
                                        c31991k8.f147216l = m154287a;
                                        m118998H = AbstractC23152n3.m118998H(c31991k8);
                                        AbstractC19074t.m100207e(m118998H, "makeIntentProfile(...)");
                                    } else {
                                        C31991k8 c31991k82 = new C31991k8(string2, false, m154287a);
                                        if (optInt <= 0) {
                                            if (AbstractC21935u.m114518H(string2) && !AbstractC25495a.m132086k(string2)) {
                                            }
                                            int i14 = 47;
                                            if (optInt2 != 91 && optInt2 != 92) {
                                                C21927m m114302u = C21927m.m114302u();
                                                if (!z14) {
                                                    i12 = 299;
                                                } else {
                                                    i12 = 47;
                                                }
                                                m114302u.m114330e0(string2, new TrackingSource(i12));
                                            }
                                            if (z11) {
                                                c31991k82.f147209e = true;
                                            }
                                            m118998H = AbstractC23152n3.m118998H(c31991k82);
                                            AbstractC19074t.m100207e(m118998H, "makeIntentProfile(...)");
                                            if (z14) {
                                                i14 = 299;
                                            }
                                            AbstractC23059e9.m118318G(i14);
                                        }
                                        z14 = true;
                                        int i142 = 47;
                                        if (optInt2 != 91) {
                                            C21927m m114302u2 = C21927m.m114302u();
                                            if (!z14) {
                                            }
                                            m114302u2.m114330e0(string2, new TrackingSource(i12));
                                        }
                                        if (z11) {
                                        }
                                        m118998H = AbstractC23152n3.m118998H(c31991k82);
                                        AbstractC19074t.m100207e(m118998H, "makeIntentProfile(...)");
                                        if (z14) {
                                        }
                                        AbstractC23059e9.m118318G(i142);
                                    }
                                    Bundle bundleExtra = m118998H.getBundleExtra("zalo_view_bundle");
                                    Bundle extras = m118998H.getExtras();
                                    if (extras != null) {
                                        serializable = extras.getSerializable("zalo_view_class");
                                    }
                                    if ((serializable instanceof Class) && ZaloView.class.isAssignableFrom((Class) serializable) && (m117347e4 = C22688w.this.m117347e()) != null) {
                                        AbstractC19074t.m100205c(bundleExtra);
                                        m117347e4.mo49386u((Class) serializable, bundleExtra, -1);
                                        C24848g0 c24848g08 = C24848g0.f119245a;
                                    }
                                    AbstractC23647d.m123893c();
                                }
                                C24848g0 c24848g09 = C24848g0.f119245a;
                                return;
                            case 2:
                                InterfaceC22668c m117347e14 = C22688w.this.m117347e();
                                if (m117347e14 != null) {
                                    m117347e14.mo117300s(0);
                                    C24848g0 c24848g010 = C24848g0.f119245a;
                                }
                                JSONObject jSONObject3 = jSONObject.getJSONObject("profile");
                                String optString = jSONObject3.optString("uid");
                                if (!TextUtils.isEmpty(optString)) {
                                    ContactProfile contactProfile2 = new ContactProfile(optString);
                                    contactProfile2.f42437s = jSONObject3.optString("disp");
                                    contactProfile2.f42446v = jSONObject3.optString("avt");
                                    contactProfile2.f42458z = jSONObject3.optString("status");
                                    AbstractC19074t.m100205c(optString);
                                    Bundle m140776b2 = new C27870vb(optString).m140780g(contactProfile2).m140776b();
                                    m140776b2.putString("EXTRA_CSC_OPENING_SOURCE", C31944h6.m153555v(this.f111170b.m123294b()));
                                    InterfaceC22668c m117347e15 = C22688w.this.m117347e();
                                    if (m117347e15 != null) {
                                        m117347e15.mo49386u(ChatView.class, m140776b2, -1);
                                        C24848g0 c24848g011 = C24848g0.f119245a;
                                    }
                                }
                                C24848g0 c24848g012 = C24848g0.f119245a;
                                return;
                            case 3:
                                InterfaceC22668c m117347e16 = C22688w.this.m117347e();
                                if (m117347e16 != null) {
                                    m117347e16.mo117300s(0);
                                    C24848g0 c24848g013 = C24848g0.f119245a;
                                }
                                String optString2 = jSONObject2.optString("feedId");
                                if (!TextUtils.isEmpty(optString2)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("fid", optString2);
                                    InterfaceC22668c m117347e17 = C22688w.this.m117347e();
                                    if (m117347e17 != null) {
                                        m117347e17.mo49386u(FeedDetailsView.class, bundle, -1);
                                        C24848g0 c24848g014 = C24848g0.f119245a;
                                    }
                                }
                                C24848g0 c24848g015 = C24848g0.f119245a;
                                return;
                            case 4:
                                C22688w c22688w = C22688w.this;
                                InterfaceC22668c m117347e18 = c22688w.m117347e();
                                if (m117347e18 != null) {
                                    m117347e18.mo117300s(0);
                                    C24848g0 c24848g016 = C24848g0.f119245a;
                                }
                                String optString3 = jSONObject2.optString("link");
                                if (jSONObject2.has("isFeature") && jSONObject2.getInt("isFeature") == 1 && !TextUtils.isEmpty(optString3) && jSONObject2.has("featureId")) {
                                    C18613b c18613b = new C18613b(jSONObject2.optInt("featureId", 8));
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putSerializable("EXTRA_FEATURE_ID", c18613b);
                                    bundle2.putString("EXTRA_WEB_URL", optString3);
                                    InterfaceC22668c m117347e19 = c22688w.m117347e();
                                    if (m117347e19 != null) {
                                        m117347e19.mo49386u(ZaloWebView.class, bundle2, -1);
                                        C24848g0 c24848g017 = C24848g0.f119245a;
                                    }
                                } else if (!TextUtils.isEmpty(optString3) && (m117347e5 = c22688w.m117347e()) != null) {
                                    m117347e5.mo49386u(ZaloWebView.class, ZaloWebView.Companion.m87179u(optString3), -1);
                                    C24848g0 c24848g018 = C24848g0.f119245a;
                                }
                                C24848g0 c24848g019 = C24848g0.f119245a;
                                return;
                            case 5:
                                InterfaceC22668c m117347e20 = C22688w.this.m117347e();
                                if (m117347e20 != null) {
                                    m117347e20.mo117300s(0);
                                    C24848g0 c24848g020 = C24848g0.f119245a;
                                }
                                int optInt3 = jSONObject2.optInt("cateId");
                                boolean m110048i = C21242e.m110039d().m110048i(C18613b.f93601t);
                                Bundle m119055m = AbstractC23152n3.m119055m(m110048i, optInt3, "", "", 47, "", 7);
                                if (m110048i) {
                                    InterfaceC22668c m117347e21 = C22688w.this.m117347e();
                                    if (m117347e21 != null) {
                                        AbstractC19074t.m100205c(m119055m);
                                        m117347e21.mo49386u(ZaloWebView.class, m119055m, -1);
                                        C24848g0 c24848g021 = C24848g0.f119245a;
                                    }
                                } else {
                                    InterfaceC22668c m117347e22 = C22688w.this.m117347e();
                                    if (m117347e22 != null) {
                                        AbstractC19074t.m100205c(m119055m);
                                        m117347e22.mo49386u(StickerDetailsView.class, m119055m, -1);
                                        C24848g0 c24848g022 = C24848g0.f119245a;
                                    }
                                }
                                C24848g0 c24848g023 = C24848g0.f119245a;
                                return;
                            case 6:
                            case 10:
                            default:
                                InterfaceC22668c m117347e23 = C22688w.this.m117347e();
                                if (m117347e23 != null) {
                                    m117347e23.mo117301t();
                                    C24848g0 c24848g024 = C24848g0.f119245a;
                                    return;
                                }
                                return;
                            case 7:
                                C31973j5 m4472f = C0943w.m4462l().m4472f(jSONObject2.optString("gid"));
                                if (m4472f == null && jSONObject2.optJSONObject("ginfo") != null) {
                                    Pair m102835R = C19637j.f97466a.m102835R(jSONObject);
                                    m4472f = (C31973j5) m102835R.first;
                                    C32076q5 c32076q5 = (C32076q5) m102835R.second;
                                    C0943w m4462l = C0943w.m4462l();
                                    AbstractC19074t.m100205c(c32076q5);
                                    m4462l.m4477n(m4472f, c32076q5);
                                }
                                if (m4472f != null) {
                                    ContactProfile contactProfile3 = new ContactProfile(1, m4472f.m153781r());
                                    contactProfile3.f42437s = m4472f.m153793y();
                                    contactProfile3.f42446v = m4472f.m153756e();
                                    String mo2478b2 = contactProfile3.mo2478b();
                                    AbstractC19074t.m100207e(mo2478b2, "getUid(...)");
                                    Bundle m140776b3 = new C27870vb(mo2478b2).m140780g(contactProfile3).m140776b();
                                    m140776b3.putString("groupId", m4472f.m153781r());
                                    m140776b3.putString("groupName", m4472f.m153793y());
                                    m140776b3.putString("EXTRA_CSC_OPENING_SOURCE", C31944h6.m153555v(this.f111170b.m123294b()));
                                    InterfaceC22668c m117347e24 = C22688w.this.m117347e();
                                    if (m117347e24 != null) {
                                        m117347e24.mo49386u(ChatView.class, m140776b3, 0);
                                        C24848g0 c24848g025 = C24848g0.f119245a;
                                    }
                                }
                                C24848g0 c24848g026 = C24848g0.f119245a;
                                return;
                            case 8:
                                String optString4 = jSONObject2.optString("gid");
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("extra_group_id", optString4);
                                bundle3.putBoolean("BOL_EXTRA_NEED_REQUEST_DATA", true);
                                if (jSONObject2.has("joinSrc")) {
                                    bundle3.putInt("INT_EXTRA_JOIN_SOURCE", jSONObject2.optInt("joinSrc"));
                                }
                                bundle3.putString("EXTRA_GROUP_LINK", this.f111170b.m123294b());
                                InterfaceC22668c m117347e25 = C22688w.this.m117347e();
                                if (m117347e25 != null) {
                                    m117347e25.mo49386u(GroupLobbyView.class, bundle3, 0);
                                    C24848g0 c24848g027 = C24848g0.f119245a;
                                    return;
                                }
                                return;
                            case 9:
                                C22688w c22688w2 = C22688w.this;
                                if (jSONObject2.optInt("error_code", -1) == 0) {
                                    if (C23055e5.m118272g(true)) {
                                        if (C20024r.m103941j()) {
                                            InterfaceC22668c m117347e26 = c22688w2.m117347e();
                                            if (m117347e26 != null) {
                                                m117347e26.mo49374g(AbstractC8020f0.str_warning_make_newcall_while_calling);
                                                C24848g0 c24848g028 = C24848g0.f119245a;
                                            }
                                        } else {
                                            int optInt4 = jSONObject2.optInt("userId", 0);
                                            String str3 = "";
                                            if (jSONObject2.optInt("callType") == 1) {
                                                z14 = true;
                                            }
                                            try {
                                                if (jSONObject2.has("info") && (optJSONObject = jSONObject2.optJSONObject("info")) != null) {
                                                    String string3 = optJSONObject.getString("name");
                                                    AbstractC19074t.m100207e(string3, "getString(...)");
                                                    str3 = string3;
                                                }
                                            } catch (Exception e13) {
                                                e13.printStackTrace();
                                            }
                                            if (optInt4 != 0) {
                                                InterfaceC22668c m117347e27 = c22688w2.m117347e();
                                                if (m117347e27 != null) {
                                                    AbstractC19074t.m100205c(jSONObject2);
                                                    m117347e27.mo117299r(z14, jSONObject2, str3);
                                                    C24848g0 c24848g029 = C24848g0.f119245a;
                                                }
                                            }
                                        }
                                    }
                                    InterfaceC22668c m117347e28 = c22688w2.m117347e();
                                    if (m117347e28 != null) {
                                        m117347e28.mo49370a(-1);
                                        C24848g0 c24848g030 = C24848g0.f119245a;
                                    }
                                } else {
                                    String optString5 = jSONObject2.optString("error_message", "");
                                    InterfaceC22668c m117347e29 = c22688w2.m117347e();
                                    if (m117347e29 != null) {
                                        String m123294b = this.f111170b.m123294b();
                                        AbstractC19074t.m100205c(optString5);
                                        m117347e29.mo117302v(m123294b, optString5);
                                        C24848g0 c24848g031 = C24848g0.f119245a;
                                    }
                                }
                                C24848g0 c24848g032 = C24848g0.f119245a;
                                return;
                            case 11:
                                C22688w c22688w3 = C22688w.this;
                                if (jSONObject2.optInt("error_code", -1) == 0) {
                                    if (C23055e5.m118272g(true)) {
                                        if (C20024r.m103941j()) {
                                            InterfaceC22668c m117347e30 = c22688w3.m117347e();
                                            if (m117347e30 != null) {
                                                m117347e30.mo49374g(AbstractC8020f0.str_warning_make_newcall_while_calling);
                                                C24848g0 c24848g033 = C24848g0.f119245a;
                                            }
                                        } else {
                                            int optInt5 = jSONObject2.optInt("userId", 0);
                                            String optString6 = jSONObject2.optString("userAvatar");
                                            String optString7 = jSONObject2.optString("userName");
                                            if (jSONObject2.optInt("callType") == 1) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            try {
                                            } catch (Exception e14) {
                                                e14.printStackTrace();
                                            }
                                            if (jSONObject2.has("info") && (optJSONObject2 = jSONObject2.optJSONObject("info")) != null) {
                                                String jSONObject4 = optJSONObject2.toString();
                                                AbstractC19074t.m100207e(jSONObject4, "toString(...)");
                                                str = jSONObject4;
                                                if (optInt5 != 0 && !TextUtils.isEmpty(optString6) && !TextUtils.isEmpty(optString7)) {
                                                    if (!z13) {
                                                        i13 = 56;
                                                    } else {
                                                        i13 = 55;
                                                    }
                                                    C2279a m120722w0 = AbstractC23306f.m120722w0();
                                                    String valueOf = String.valueOf(optInt5);
                                                    AbstractC19074t.m100205c(optString7);
                                                    AbstractC19074t.m100205c(optString6);
                                                    m120722w0.m101508a(new C2279a.a(valueOf, optString7, optString6, z13, i13, str));
                                                    m117347e6 = c22688w3.m117347e();
                                                    if (m117347e6 != null) {
                                                        m117347e6.mo49370a(0);
                                                        C24848g0 c24848g034 = C24848g0.f119245a;
                                                    }
                                                    C24848g0 c24848g035 = C24848g0.f119245a;
                                                    return;
                                                }
                                            }
                                            str = "";
                                            if (optInt5 != 0) {
                                                if (!z13) {
                                                }
                                                C2279a m120722w02 = AbstractC23306f.m120722w0();
                                                String valueOf2 = String.valueOf(optInt5);
                                                AbstractC19074t.m100205c(optString7);
                                                AbstractC19074t.m100205c(optString6);
                                                m120722w02.m101508a(new C2279a.a(valueOf2, optString7, optString6, z13, i13, str));
                                                m117347e6 = c22688w3.m117347e();
                                                if (m117347e6 != null) {
                                                }
                                                C24848g0 c24848g0352 = C24848g0.f119245a;
                                                return;
                                            }
                                        }
                                    }
                                    InterfaceC22668c m117347e31 = c22688w3.m117347e();
                                    if (m117347e31 != null) {
                                        m117347e31.mo49370a(-1);
                                        C24848g0 c24848g036 = C24848g0.f119245a;
                                    }
                                    C24848g0 c24848g03522 = C24848g0.f119245a;
                                    return;
                                }
                                String optString8 = jSONObject2.optString("error_message", "");
                                try {
                                    InterfaceC22668c m117347e32 = c22688w3.m117347e();
                                    if (m117347e32 != null) {
                                        String m123294b2 = this.f111170b.m123294b();
                                        AbstractC19074t.m100205c(optString8);
                                        m117347e32.mo117302v(m123294b2, optString8);
                                        C24848g0 c24848g037 = C24848g0.f119245a;
                                    }
                                } catch (Exception e15) {
                                    e15.printStackTrace();
                                }
                                C24848g0 c24848g035222 = C24848g0.f119245a;
                                return;
                            case 12:
                                String optString9 = jSONObject2.optString("action");
                                String optString10 = jSONObject2.optString("data");
                                InterfaceC22668c m117347e33 = C22688w.this.m117347e();
                                if (m117347e33 != null) {
                                    AbstractC19074t.m100205c(optString9);
                                    AbstractC19074t.m100205c(optString10);
                                    m117347e33.mo49384p(optString9, 0, optString10, null);
                                    C24848g0 c24848g038 = C24848g0.f119245a;
                                    return;
                                }
                                return;
                            case 13:
                                try {
                                    JSONObject optJSONObject4 = jSONObject.optJSONObject("item");
                                    if (optJSONObject4 != null) {
                                        ContactProfile contactProfile4 = new ContactProfile(optJSONObject4);
                                        String mo2478b3 = contactProfile4.mo2478b();
                                        AbstractC19074t.m100207e(mo2478b3, "getUid(...)");
                                        Bundle m140776b4 = new C27870vb(mo2478b3).m140780g(contactProfile4).m140776b();
                                        m140776b4.putBoolean("extra_chat_open_call_oa_dialog", true);
                                        m140776b4.putString("extra_oa_center_from_qr", optJSONObject4.toString());
                                        Map map = AbstractC23304d.f113417o;
                                        AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                        synchronized (map) {
                                            try {
                                                if (!map.containsKey(contactProfile4.f42434r)) {
                                                    AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                                    String str4 = contactProfile4.f42434r;
                                                    map.put(str4, str4);
                                                }
                                                C24848g0 c24848g039 = C24848g0.f119245a;
                                            } finally {
                                            }
                                        }
                                        InterfaceC22668c m117347e34 = C22688w.this.m117347e();
                                        if (m117347e34 != null) {
                                            m117347e34.mo49386u(ChatView.class, m140776b4, -1);
                                        }
                                    }
                                } catch (Exception e16) {
                                    e16.printStackTrace();
                                }
                                C24848g0 c24848g040 = C24848g0.f119245a;
                                return;
                            case 14:
                                int i15 = this.f111171c;
                                if (i15 != 1) {
                                    if (i15 != 2) {
                                        if (i15 != 3) {
                                            if (i15 != 4) {
                                                if (i15 != 5) {
                                                    switch (i15) {
                                                        case 10:
                                                            c18620i = C18620i.f93670M;
                                                            break;
                                                        case 11:
                                                            c18620i = C18620i.f93671N;
                                                            break;
                                                        case 12:
                                                            c18620i = C18620i.f93678U;
                                                            break;
                                                        case 13:
                                                            c18620i = C18620i.f93679V;
                                                            break;
                                                        case 14:
                                                            c18620i = C18620i.f93680W;
                                                            break;
                                                        case 15:
                                                            c18620i = C18620i.f93682Y;
                                                            break;
                                                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                                            c18620i = C18620i.f93684a0;
                                                            break;
                                                        default:
                                                            c18620i = C18620i.f93694q;
                                                            break;
                                                    }
                                                }
                                            } else {
                                                c18620i = C18620i.f93695r;
                                            }
                                        }
                                        c18620i = C18620i.f93665H;
                                    } else {
                                        c18620i = C18620i.f93667J;
                                    }
                                } else {
                                    c18620i = C18620i.f93666I;
                                }
                                InterfaceC22668c m117347e35 = C22688w.this.m117347e();
                                if (m117347e35 != null) {
                                    AbstractC19074t.m100205c(jSONObject2);
                                    m117347e35.mo49373f(new C19609h(jSONObject2), c18620i);
                                    C24848g0 c24848g041 = C24848g0.f119245a;
                                    return;
                                }
                                return;
                            case 15:
                                try {
                                    String optString11 = jSONObject2.optString("title", "");
                                    String optString12 = jSONObject2.optString("domain", "");
                                    String optString13 = jSONObject2.optString("thumb", "");
                                    InterfaceC22668c m117347e36 = C22688w.this.m117347e();
                                    if (m117347e36 != null) {
                                        AbstractC23490m abstractC23490m = this.f111170b;
                                        AbstractC19074t.m100205c(optString11);
                                        AbstractC19074t.m100205c(optString12);
                                        AbstractC19074t.m100205c(optString13);
                                        m117347e36.mo49379l(abstractC23490m, optString11, optString12, optString13, this.f111171c);
                                        C24848g0 c24848g042 = C24848g0.f119245a;
                                    }
                                } catch (Exception e17) {
                                    AbstractC20110a.f98889a.mo104552e(e17);
                                }
                                C24848g0 c24848g043 = C24848g0.f119245a;
                                return;
                        }
                    } catch (Exception e18) {
                        e18.printStackTrace();
                        m117347e = C22688w.this.m117347e();
                        if (m117347e != null) {
                        }
                        m117347e2 = C22688w.this.m117347e();
                        if (m117347e2 != null) {
                        }
                        m117347e3 = C22688w.this.m117347e();
                        if (m117347e3 == null) {
                        }
                    }
                    m117347e = C22688w.this.m117347e();
                    if (m117347e != null) {
                        m117347e.mo49374g(AbstractC8020f0.unknown_error);
                        C24848g0 c24848g044 = C24848g0.f119245a;
                    }
                    m117347e2 = C22688w.this.m117347e();
                    if (m117347e2 != null) {
                        m117347e2.mo117300s(-1);
                        C24848g0 c24848g045 = C24848g0.f119245a;
                    }
                    m117347e3 = C22688w.this.m117347e();
                    if (m117347e3 == null) {
                        m117347e3.mo49376i(-1);
                        C24848g0 c24848g046 = C24848g0.f119245a;
                        return;
                    }
                    return;
                } catch (Exception e19) {
                    e19.printStackTrace();
                    return;
                }
                e18.printStackTrace();
            }
        }
    }

    /* renamed from: ly.w$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ AbstractC23490m f111173b;

        /* renamed from: c */
        final /* synthetic */ int f111174c;

        public d(AbstractC23490m abstractC23490m, int i11) {
            this.f111173b = abstractC23490m;
            this.f111174c = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InterfaceC22668c m117347e = C22688w.this.m117347e();
            if (m117347e != null && !m117347e.mo49377j(this.f111173b) && c20096c != null) {
                try {
                    String unused = C22688w.f111163c;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("checkQRCodeLink error:");
                    sb2.append(c20096c);
                    InterfaceC22668c m117347e2 = C22688w.this.m117347e();
                    if (m117347e2 != null) {
                        m117347e2.mo117297c();
                    }
                    InterfaceC22668c m117347e3 = C22688w.this.m117347e();
                    if (m117347e3 != null) {
                        m117347e3.mo49372e(c20096c);
                    }
                    InterfaceC22668c m117347e4 = C22688w.this.m117347e();
                    if (m117347e4 != null) {
                        m117347e4.mo49378k(this.f111173b, c20096c, this.f111174c);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* renamed from: ly.w$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ AbstractC23490m.b f111176b;

        /* renamed from: c */
        final /* synthetic */ int f111177c;

        e(AbstractC23490m.b bVar, int i11) {
            this.f111176b = bVar;
            this.f111177c = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC22668c m117347e = C22688w.this.m117347e();
            if (m117347e != null) {
                m117347e.mo117297c();
            }
            InterfaceC22668c m117347e2 = C22688w.this.m117347e();
            if (m117347e2 != null) {
                m117347e2.mo49381m(c20096c, this.f111176b, this.f111177c);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            Exception exc;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            String str6;
            JSONObject jSONObject;
            InterfaceC22668c m117347e;
            InterfaceC22668c m117347e2;
            JSONObject jSONObject2;
            String m96089h;
            boolean z15;
            AbstractC19074t.m100208f(obj, "entity");
            String str7 = "";
            try {
                jSONObject2 = ((JSONObject) obj).getJSONObject("data");
                m96089h = AbstractC18069a.m96089h(jSONObject2, "computer_name");
                AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                try {
                    str = AbstractC18069a.m96089h(jSONObject2, "confirm_msg");
                    AbstractC19074t.m100207e(str, "getJSONValue(...)");
                    try {
                        str2 = AbstractC18069a.m96089h(jSONObject2, "confirm_msg_html");
                        AbstractC19074t.m100207e(str2, "getJSONValue(...)");
                    } catch (Exception e11) {
                        e = e11;
                        str2 = "";
                        str3 = str2;
                        str4 = str3;
                        str5 = str4;
                        str7 = m96089h;
                        z12 = false;
                        exc = e;
                        z11 = false;
                        exc.printStackTrace();
                        z13 = z11;
                        z14 = z12;
                        str6 = str7;
                        jSONObject = null;
                        String str8 = str;
                        String str9 = str2;
                        String str10 = str3;
                        String str11 = str4;
                        String str12 = str5;
                        m117347e = C22688w.this.m117347e();
                        if (m117347e != null) {
                        }
                        C29667y.m147442J();
                        m117347e2 = C22688w.this.m117347e();
                        if (m117347e2 != null) {
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    str = "";
                    str2 = str;
                }
            } catch (Exception e13) {
                exc = e13;
                str = "";
                str2 = str;
                str3 = str2;
                str4 = str3;
                str5 = str4;
                z11 = false;
                z12 = false;
            }
            try {
                str3 = AbstractC18069a.m96089h(jSONObject2, "confirm_button_text");
                AbstractC19074t.m100207e(str3, "getJSONValue(...)");
                try {
                    str4 = AbstractC18069a.m96089h(jSONObject2, "confirm_image");
                    AbstractC19074t.m100207e(str4, "getJSONValue(...)");
                    try {
                        str5 = AbstractC18069a.m96089h(jSONObject2, "close_button_text");
                        AbstractC19074t.m100207e(str5, "getJSONValue(...)");
                        try {
                            z15 = true;
                            if (jSONObject2.optInt("enable2fa", 0) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            str7 = m96089h;
                            z12 = false;
                            exc = e;
                            z11 = false;
                            exc.printStackTrace();
                            z13 = z11;
                            z14 = z12;
                            str6 = str7;
                            jSONObject = null;
                            String str82 = str;
                            String str92 = str2;
                            String str102 = str3;
                            String str112 = str4;
                            String str122 = str5;
                            m117347e = C22688w.this.m117347e();
                            if (m117347e != null) {
                            }
                            C29667y.m147442J();
                            m117347e2 = C22688w.this.m117347e();
                            if (m117347e2 != null) {
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                        str5 = "";
                    }
                } catch (Exception e16) {
                    e = e16;
                    str4 = "";
                    str5 = str4;
                    str7 = m96089h;
                    z12 = false;
                    exc = e;
                    z11 = false;
                    exc.printStackTrace();
                    z13 = z11;
                    z14 = z12;
                    str6 = str7;
                    jSONObject = null;
                    String str822 = str;
                    String str922 = str2;
                    String str1022 = str3;
                    String str1122 = str4;
                    String str1222 = str5;
                    m117347e = C22688w.this.m117347e();
                    if (m117347e != null) {
                    }
                    C29667y.m147442J();
                    m117347e2 = C22688w.this.m117347e();
                    if (m117347e2 != null) {
                    }
                }
            } catch (Exception e17) {
                e = e17;
                str3 = "";
                str4 = str3;
                str5 = str4;
                str7 = m96089h;
                z12 = false;
                exc = e;
                z11 = false;
                exc.printStackTrace();
                z13 = z11;
                z14 = z12;
                str6 = str7;
                jSONObject = null;
                String str8222 = str;
                String str9222 = str2;
                String str10222 = str3;
                String str11222 = str4;
                String str12222 = str5;
                m117347e = C22688w.this.m117347e();
                if (m117347e != null) {
                }
                C29667y.m147442J();
                m117347e2 = C22688w.this.m117347e();
                if (m117347e2 != null) {
                }
            }
            try {
                if (jSONObject2.optInt("use_zinstant", 0) != 1) {
                    z15 = false;
                }
                try {
                    jSONObject = jSONObject2.optJSONObject("zinstant_socket_data");
                    z14 = z12;
                    z13 = z15;
                    str6 = m96089h;
                } catch (Exception e18) {
                    exc = e18;
                    z11 = z15;
                    str7 = m96089h;
                    exc.printStackTrace();
                    z13 = z11;
                    z14 = z12;
                    str6 = str7;
                    jSONObject = null;
                    String str82222 = str;
                    String str92222 = str2;
                    String str102222 = str3;
                    String str112222 = str4;
                    String str122222 = str5;
                    m117347e = C22688w.this.m117347e();
                    if (m117347e != null) {
                    }
                    C29667y.m147442J();
                    m117347e2 = C22688w.this.m117347e();
                    if (m117347e2 != null) {
                    }
                }
            } catch (Exception e19) {
                e = e19;
                str7 = m96089h;
                exc = e;
                z11 = false;
                exc.printStackTrace();
                z13 = z11;
                z14 = z12;
                str6 = str7;
                jSONObject = null;
                String str822222 = str;
                String str922222 = str2;
                String str1022222 = str3;
                String str1122222 = str4;
                String str1222222 = str5;
                m117347e = C22688w.this.m117347e();
                if (m117347e != null) {
                }
                C29667y.m147442J();
                m117347e2 = C22688w.this.m117347e();
                if (m117347e2 != null) {
                }
            }
            String str8222222 = str;
            String str9222222 = str2;
            String str10222222 = str3;
            String str11222222 = str4;
            String str12222222 = str5;
            m117347e = C22688w.this.m117347e();
            if (m117347e != null) {
                m117347e.mo117300s(0);
            }
            C29667y.m147442J();
            m117347e2 = C22688w.this.m117347e();
            if (m117347e2 != null) {
                m117347e2.mo49383o(str6, str8222222, this.f111176b.m123297e(), str9222222, str10222222, str11222222, str12222222, z14, z13, jSONObject);
            }
        }
    }

    static {
        String simpleName = C22688w.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f111163c = simpleName;
    }

    /* renamed from: d */
    private final void m117345d(AbstractC23490m abstractC23490m, int i11) {
        InterfaceC22668c m117347e = m117347e();
        if (m117347e != null && !m117347e.mo49377j(abstractC23490m)) {
            InterfaceC22668c m117347e2 = m117347e();
            if (m117347e2 != null) {
                m117347e2.mo117303w();
            }
            C0766k c0766k = new C0766k();
            AbstractC25251g.m130681a(c0766k, new d(abstractC23490m, i11));
            AbstractC25251g.m130681a(c0766k, new c(abstractC23490m, i11));
            AbstractC26412d.Companion.m136236e();
            c0766k.mo1593a4(abstractC23490m.m123294b(), i11);
        }
    }

    /* renamed from: j */
    private final void m117346j(AbstractC23490m.b bVar, int i11) {
        try {
            InterfaceC22668c m117347e = m117347e();
            if (m117347e != null) {
                m117347e.mo117303w();
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new e(bVar, i11));
            String m123297e = bVar.m123297e();
            int m128080a = C24594a.m128080a();
            String m123295c = bVar.m123295c();
            if (m123295c == null) {
                m123295c = "";
            }
            c0766k.mo1788z3(m123297e, m128080a, i11, m123295c, bVar.m123296d());
        } catch (Exception e11) {
            e11.printStackTrace();
            InterfaceC22668c m117347e2 = m117347e();
            if (m117347e2 != null) {
                m117347e2.mo117300s(-1);
            }
        }
    }

    @Override // ly.InterfaceC22667b
    /* renamed from: a */
    public void mo117295a(InterfaceC22668c interfaceC22668c) {
        this.f111164a = interfaceC22668c;
    }

    @Override // ly.InterfaceC22667b
    /* renamed from: b */
    public void mo117296b(AbstractC23490m abstractC23490m, int i11) {
        InterfaceC22668c m117347e;
        try {
            if (abstractC23490m != null) {
                if ((abstractC23490m instanceof AbstractC23490m.b) && ((m117347e = m117347e()) == null || m117347e.mo49375h())) {
                    m117346j((AbstractC23490m.b) abstractC23490m, i11);
                    return;
                }
                m117345d(abstractC23490m, i11);
                return;
            }
            InterfaceC22668c m117347e2 = m117347e();
            if (m117347e2 != null) {
                m117347e2.mo117300s(-1);
            }
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
            InterfaceC22668c m117347e3 = m117347e();
            if (m117347e3 != null) {
                m117347e3.mo117300s(-1);
            }
        }
    }

    /* renamed from: e */
    public InterfaceC22668c m117347e() {
        return this.f111164a;
    }

    /* renamed from: f */
    public final boolean m117348f(UUID uuid) {
        UUID uuid2 = this.f111165b;
        if (uuid2 == null) {
            return false;
        }
        return AbstractC19074t.m100204b(uuid2, uuid);
    }

    /* renamed from: g */
    public final void m117349g() {
        try {
            InterfaceC22668c m117347e = m117347e();
            if (m117347e != null) {
                m117347e.mo117297c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m117350h(String str, int i11) {
        try {
            AbstractC26412d.a aVar = AbstractC26412d.Companion;
            if (str == null) {
                str = "";
            }
            mo117296b(aVar.m136249x(str), i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public final void m117351i(UUID uuid) {
        this.f111165b = uuid;
    }
}
