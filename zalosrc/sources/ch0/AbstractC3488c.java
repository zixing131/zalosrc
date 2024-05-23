package ch0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.zalocloud.model.api.CloudMediaItemResponse;
import com.zing.zalo.data.zalocloud.model.api.EncryptInfo;
import com.zing.zalo.data.zalocloud.model.api.MsgInfo;
import com.zing.zalo.zalocloud.exception.ZaloCloudItemException;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zalocloud.utils.MediaExtInfo;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import fn0.AbstractC19074t;
import p212hj.AbstractC20071b;
import p348mi.AbstractC23306f;
import p487rl.C25821b;
import pm0.C24848g0;
import pm0.C24860q;
import qg0.AbstractC25270e;
import qg0.C25271f;
import sg0.AbstractC26246b;
import sg0.C26247c;
import tg0.C26676b;
import un0.AbstractC27323a;

/* renamed from: ch0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC3488c {
    /* renamed from: a */
    private static final C25821b.a m17478a(CloudMediaItemResponse cloudMediaItemResponse) {
        AbstractC25270e m17490m = m17490m(m17484g(cloudMediaItemResponse.m41296d()));
        if (m17490m == null) {
            return null;
        }
        return new C25821b.a(m17490m.m130789d(), 1, m17490m.m130786a());
    }

    /* renamed from: b */
    public static final C24860q m17479b(String str) {
        AbstractC19074t.m100208f(str, "mediaExtInfo");
        return C26247c.f124659a.m134973g(1, str);
    }

    /* renamed from: c */
    public static final C25821b.a m17480c(CloudMediaItemResponse cloudMediaItemResponse) {
        AbstractC19074t.m100208f(cloudMediaItemResponse, "<this>");
        if (cloudMediaItemResponse.m41294b() != null) {
            return m17491n(cloudMediaItemResponse.m41294b());
        }
        if (m17486i(cloudMediaItemResponse.m41296d())) {
            return m17478a(cloudMediaItemResponse);
        }
        return null;
    }

    /* renamed from: d */
    private static final C25821b.b m17481d(CloudMediaItemResponse cloudMediaItemResponse) {
        String str;
        if (cloudMediaItemResponse.m41295c().m41354b() != null) {
            str = m17489l(cloudMediaItemResponse.m41295c().m41354b());
        } else if (m17486i(cloudMediaItemResponse.m41296d())) {
            str = m17482e(m17484g(cloudMediaItemResponse.m41296d()));
        } else {
            str = null;
        }
        long m41355c = cloudMediaItemResponse.m41295c().m41355c();
        String m41353a = cloudMediaItemResponse.m41295c().m41353a();
        C26676b.m136959i("CloudMediaItem: extInfo=" + str + ", isE2EE=" + m17486i(cloudMediaItemResponse.m41296d()) + ", msgType=" + cloudMediaItemResponse.m41296d().m41366f());
        C24848g0 c24848g0 = C24848g0.f119245a;
        return new C25821b.b(m41355c, m41353a, str);
    }

    /* renamed from: e */
    public static final String m17482e(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "<this>");
        C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
        if (m2635r == null) {
            C26676b.m136958h("Msg not ready! Could not parse Media Ext Info (MsgId=" + messageId + ")", null, 2, null);
            return null;
        }
        return m17483f(m2635r);
    }

    /* renamed from: f */
    public static final String m17483f(C17945a0 c17945a0) {
        MediaExtInfo m90336m;
        AbstractC19074t.m100208f(c17945a0, "<this>");
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 != null && (m90336m = AbstractC16893a.m90336m(m94929K2)) != null) {
            return m90336m.m90306a();
        }
        return null;
    }

    /* renamed from: g */
    public static final MessageId m17484g(MsgInfo msgInfo) {
        AbstractC19074t.m100208f(msgInfo, "<this>");
        return MessageId.Companion.m41063a(msgInfo.m41361a(), msgInfo.m41365e(), m17485h(msgInfo), String.valueOf(msgInfo.m41367g()));
    }

    /* renamed from: h */
    public static final String m17485h(MsgInfo msgInfo) {
        AbstractC19074t.m100208f(msgInfo, "<this>");
        if (AbstractC19074t.m100204b(String.valueOf(msgInfo.m41362b()), "204278670")) {
            return "204278670";
        }
        if (msgInfo.m41363c() == 6) {
            return "group_" + msgInfo.m41362b();
        }
        if (AbstractC19074t.m100204b(String.valueOf(msgInfo.m41367g()), CoreUtility.f89233i)) {
            return String.valueOf(msgInfo.m41362b());
        }
        return String.valueOf(msgInfo.m41367g());
    }

    /* renamed from: i */
    public static final boolean m17486i(MsgInfo msgInfo) {
        AbstractC19074t.m100208f(msgInfo, "<this>");
        if (msgInfo.m41369i() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m17487j(com.zing.zalo.data.zalocloud.model.api.MediaExtInfo mediaExtInfo) {
        AbstractC19074t.m100208f(mediaExtInfo, "<this>");
        if (mediaExtInfo.m41351b().m41348b() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m17488k(CloudMediaItemResponse cloudMediaItemResponse) {
        AbstractC19074t.m100208f(cloudMediaItemResponse, "<this>");
        if (m17486i(cloudMediaItemResponse.m41296d()) && cloudMediaItemResponse.m41294b() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final String m17489l(com.zing.zalo.data.zalocloud.model.api.MediaExtInfo mediaExtInfo) {
        String str;
        AbstractC19074t.m100208f(mediaExtInfo, "<this>");
        if (m17487j(mediaExtInfo)) {
            try {
                str = C26247c.f124659a.m134970d(C25271f.f121221a.m130797e(mediaExtInfo.m41351b().m41347a(), 1), AbstractC26246b.m134964c(mediaExtInfo.m41350a()));
            } catch (Exception e11) {
                C26676b.m136953c(e11);
                str = null;
            }
        } else {
            str = mediaExtInfo.m41350a();
        }
        if (str == null) {
            AbstractC27323a.a aVar = AbstractC27323a.f128573d;
            aVar.mo131586a();
            return aVar.mo131597b(com.zing.zalo.data.zalocloud.model.api.MediaExtInfo.Companion.serializer(), mediaExtInfo);
        }
        return str;
    }

    /* renamed from: m */
    public static final AbstractC25270e m17490m(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "<this>");
        C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
        if (m2635r == null) {
            C26676b.m136958h("Msg not ready! Could not parse E2EE Key (MsgId=" + messageId + ")", null, 2, null);
            return null;
        }
        String m95090b5 = m2635r.m95090b5();
        AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
        if (m95090b5.length() == 0) {
            C26676b.m136953c(new ZaloCloudItemException("URL is empty! Could not parse E2EE Key (MsgId=" + messageId + ")"));
            return null;
        }
        C24860q m17516x = AbstractC3489d.m17516x(m95090b5);
        return C25271f.f121221a.m130795b((String) m17516x.m129213a(), 1, ((Number) m17516x.m129214b()).intValue());
    }

    /* renamed from: n */
    public static final C25821b.a m17491n(EncryptInfo encryptInfo) {
        AbstractC19074t.m100208f(encryptInfo, "<this>");
        if (encryptInfo.m41338b() != null && encryptInfo.m41339c() != null && encryptInfo.m41337a() != null) {
            return new C25821b.a(C25271f.f121221a.m130798f(encryptInfo.m41338b(), encryptInfo.m41339c().intValue(), encryptInfo.m41337a().intValue()).m130789d(), encryptInfo.m41339c().intValue(), encryptInfo.m41337a().intValue());
        }
        C26676b.m136953c(new ZaloCloudItemException("Server response of EncryptInfo is INVALID. (encryptKey=" + encryptInfo.m41338b() + ", keyVersion=" + encryptInfo.m41339c() + ", algoVersion=" + encryptInfo.m41337a() + ")"));
        return null;
    }

    /* renamed from: o */
    public static final C25821b m17492o(CloudMediaItemResponse cloudMediaItemResponse) {
        C25821b.a aVar;
        String str;
        AbstractC19074t.m100208f(cloudMediaItemResponse, "<this>");
        try {
            aVar = m17480c(cloudMediaItemResponse);
        } catch (Exception e11) {
            C26676b.m136953c(e11);
            aVar = null;
        }
        if (cloudMediaItemResponse.m41294b() != null) {
            str = AbstractC27323a.f128573d.mo131597b(EncryptInfo.Companion.serializer(), cloudMediaItemResponse.m41294b());
        } else {
            str = null;
        }
        C25821b c25821b = new C25821b(cloudMediaItemResponse.m41297e(), AbstractC20071b.a.m104319d(AbstractC20071b.Companion, cloudMediaItemResponse.m41296d().m41366f(), null, 2, null), m17484g(cloudMediaItemResponse.m41296d()), cloudMediaItemResponse.m41296d().m41368h(), cloudMediaItemResponse.m41298f(), m17486i(cloudMediaItemResponse.m41296d()), m17481d(cloudMediaItemResponse), aVar, str);
        c25821b.m133159v(m17488k(cloudMediaItemResponse));
        return c25821b;
    }
}
