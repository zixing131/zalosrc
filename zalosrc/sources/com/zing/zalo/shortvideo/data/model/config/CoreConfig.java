package com.zing.zalo.shortvideo.data.model.config;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import pm0.C24860q;
import pm0.C24865v;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26788f;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;
import un0.AbstractC27331i;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class CoreConfig {
    public static final Companion Companion = new Companion(null);

    /* renamed from: x */
    private static final KSerializer[] f50115x;

    /* renamed from: a */
    private final Long f50116a;

    /* renamed from: b */
    private final String f50117b;

    /* renamed from: c */
    private final List f50118c;

    /* renamed from: d */
    private final Boolean f50119d;

    /* renamed from: e */
    private final Boolean f50120e;

    /* renamed from: f */
    private final Integer f50121f;

    /* renamed from: g */
    private final Long f50122g;

    /* renamed from: h */
    private final Long f50123h;

    /* renamed from: i */
    private final Integer f50124i;

    /* renamed from: j */
    private final Long f50125j;

    /* renamed from: k */
    private final Long f50126k;

    /* renamed from: l */
    private final Integer f50127l;

    /* renamed from: m */
    private final Integer f50128m;

    /* renamed from: n */
    private final Long f50129n;

    /* renamed from: o */
    private final List f50130o;

    /* renamed from: p */
    private final List f50131p;

    /* renamed from: q */
    private final ShareSuggestionConfig f50132q;

    /* renamed from: r */
    private final LikeSuggestionConfig f50133r;

    /* renamed from: s */
    private final Long f50134s;

    /* renamed from: t */
    private final Integer f50135t;

    /* renamed from: u */
    private final String f50136u;

    /* renamed from: v */
    private final Long f50137v;

    /* renamed from: w */
    private final Integer f50138w;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(29:5|6|7|(3:9|(3:12|(1:16)(1:18)|10)|21)(1:86)|22|23|24|(5:26|(2:29|27)|30|31|32)|83|34|(5:35|36|(5:38|(2:41|39)|42|43|44)|80|46)|47|48|49|50|51|52|(11:75|56|(8:72|60|61|62|63|64|65|66)|59|60|61|62|63|64|65|66)|55|56|(1:58)(9:70|72|60|61|62|63|64|65|66)|59|60|61|62|63|64|65|66) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:            if ((!r10.isEmpty()) != false) goto L33;     */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00f8, code lost:            if ((!r10.isEmpty()) != false) goto L46;     */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01dc, code lost:            r35 = null;     */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CoreConfig m51462a(JsonObject jsonObject) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            C24860q c24860q;
            ShareSuggestionConfig shareSuggestionConfig;
            JsonObject m51732m;
            Integer m51729j;
            Long m51737r;
            Integer m51729j2;
            boolean z11;
            Integer m51729j3;
            boolean z12;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            String m51743x;
            if (jsonObject == null) {
                return null;
            }
            try {
                JsonArray m51731l = AbstractC9465b.m51731l(jsonObject, "contentFeedbacks");
                if (m51731l != null) {
                    arrayList6 = new ArrayList();
                    Iterator<JsonElement> it = m51731l.iterator();
                    while (it.hasNext()) {
                        JsonObject m139916m = AbstractC27331i.m139916m(it.next());
                        int m51728i = AbstractC9465b.m51728i(m139916m, new String[]{"id"}, 0, 2, null);
                        String m51743x2 = AbstractC9465b.m51743x(m139916m, "vi");
                        if (m51743x2 == null || (m51743x = AbstractC9465b.m51743x(m139916m, "en")) == null) {
                            return null;
                        }
                        arrayList6.add(new ContentFeedback(Integer.valueOf(m51728i), m51743x2, m51743x));
                    }
                } else {
                    arrayList6 = null;
                }
                arrayList = arrayList6;
            } catch (Exception unused) {
                arrayList = null;
            }
            try {
                JsonArray m51731l2 = AbstractC9465b.m51731l(jsonObject, "userNotiCategories");
                if (m51731l2 != null) {
                    arrayList5 = new ArrayList();
                    Iterator<JsonElement> it2 = m51731l2.iterator();
                    while (it2.hasNext()) {
                        JsonObject m139916m2 = AbstractC27331i.m139916m(it2.next());
                        arrayList5.add(new NotiCategories(AbstractC9465b.m51740u(m139916m2, "id"), AbstractC9465b.m51740u(m139916m2, "msg")));
                    }
                }
                arrayList5 = null;
                arrayList2 = arrayList5;
            } catch (Exception unused2) {
                arrayList2 = null;
            }
            try {
                JsonArray m51731l3 = AbstractC9465b.m51731l(jsonObject, "channelNotiCategories");
                if (m51731l3 != null) {
                    arrayList4 = new ArrayList();
                    Iterator<JsonElement> it3 = m51731l3.iterator();
                    while (it3.hasNext()) {
                        JsonObject m139916m3 = AbstractC27331i.m139916m(it3.next());
                        arrayList4.add(new NotiCategories(AbstractC9465b.m51740u(m139916m3, "id"), AbstractC9465b.m51740u(m139916m3, "msg")));
                    }
                }
                arrayList4 = null;
                arrayList3 = arrayList4;
            } catch (Exception unused3) {
                arrayList3 = null;
            }
            try {
                JsonObject m51732m2 = AbstractC9465b.m51732m(jsonObject, "followSuggestion");
                c24860q = new C24860q(Long.valueOf(AbstractC9465b.m51735p(m51732m2, new String[]{"delayHighlightMillis"}, 15000L)), new C24865v(Integer.valueOf(AbstractC9465b.m51727h(m51732m2, new String[]{"channelCapacity"}, 100)), Integer.valueOf(AbstractC9465b.m51727h(m51732m2, new String[]{"videoPerChannel"}, 10)), Long.valueOf(AbstractC9465b.m51735p(m51732m2, new String[]{"watchTimeMillis"}, 120000L))));
            } catch (Exception unused4) {
                c24860q = new C24860q(null, new C24865v(null, null, null));
            }
            C24860q c24860q2 = c24860q;
            try {
                m51732m = AbstractC9465b.m51732m(jsonObject, "shareSuggestion");
                m51729j = AbstractC9465b.m51729j(m51732m, "repeatAfter");
                m51737r = AbstractC9465b.m51737r(m51732m, "watchTimeMillis");
                m51729j2 = AbstractC9465b.m51729j(m51732m, "message");
            } catch (Exception unused5) {
                shareSuggestionConfig = null;
            }
            if (m51729j2 != null && m51729j2.intValue() == 1) {
                z11 = true;
                Boolean valueOf = Boolean.valueOf(z11);
                m51729j3 = AbstractC9465b.m51729j(m51732m, "timeline");
                if (m51729j3 != null && m51729j3.intValue() == 1) {
                    z12 = true;
                    shareSuggestionConfig = new ShareSuggestionConfig(m51729j, m51737r, valueOf, Boolean.valueOf(z12));
                    JsonObject m51732m3 = AbstractC9465b.m51732m(jsonObject, "likeSuggestion");
                    LikeSuggestionConfig likeSuggestionConfig = new LikeSuggestionConfig(AbstractC9465b.m51729j(m51732m3, "repeatAfter"), AbstractC9465b.m51737r(m51732m3, "watchTimeMillis"));
                    return new CoreConfig(Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delaySearchMillis"}, 0L, 2, null)), AbstractC9465b.m51743x(jsonObject, "verifyEKYC"), arrayList, Boolean.valueOf(AbstractC9465b.m51723d(jsonObject, new String[]{"isShowBookmarkBtn"}, false, 2, null)), Boolean.valueOf(AbstractC9465b.m51723d(jsonObject, new String[]{"isShowDislikeBtn"}, false, 2, null)), Integer.valueOf(AbstractC9465b.m51727h(jsonObject, new String[]{"numOfNoneSwipeSession"}, 5)), Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delayUserGuideMillis"}, 0L, 2, null)), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"delayDismissUserGuideMillis"}, 5000L)), Integer.valueOf(AbstractC9465b.m51727h(jsonObject, new String[]{"maxPrevPage"}, 10)), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"prevPageTimeoutMillis"}, 30000L)), (Long) c24860q2.m129215c(), (Integer) ((C24865v) c24860q2.m129216d()).m129232d(), (Integer) ((C24865v) c24860q2.m129216d()).m129233e(), (Long) ((C24865v) c24860q2.m129216d()).m129234f(), arrayList2, arrayList3, shareSuggestionConfig, likeSuggestionConfig, Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delaySearchInChannelMillis"}, 0L, 2, null)), AbstractC9465b.m51729j(jsonObject, "dailyToastQuota"), AbstractC9465b.m51743x(jsonObject, "dailyToastMsg"), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"dataUsageWarningIntervalMillis"}, TimeUnit.MINUTES.toMillis(5L))), Integer.valueOf(AbstractC9465b.m51728i(jsonObject, new String[]{"adVersion"}, 0, 2, null)));
                }
                z12 = false;
                shareSuggestionConfig = new ShareSuggestionConfig(m51729j, m51737r, valueOf, Boolean.valueOf(z12));
                JsonObject m51732m32 = AbstractC9465b.m51732m(jsonObject, "likeSuggestion");
                LikeSuggestionConfig likeSuggestionConfig2 = new LikeSuggestionConfig(AbstractC9465b.m51729j(m51732m32, "repeatAfter"), AbstractC9465b.m51737r(m51732m32, "watchTimeMillis"));
                return new CoreConfig(Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delaySearchMillis"}, 0L, 2, null)), AbstractC9465b.m51743x(jsonObject, "verifyEKYC"), arrayList, Boolean.valueOf(AbstractC9465b.m51723d(jsonObject, new String[]{"isShowBookmarkBtn"}, false, 2, null)), Boolean.valueOf(AbstractC9465b.m51723d(jsonObject, new String[]{"isShowDislikeBtn"}, false, 2, null)), Integer.valueOf(AbstractC9465b.m51727h(jsonObject, new String[]{"numOfNoneSwipeSession"}, 5)), Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delayUserGuideMillis"}, 0L, 2, null)), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"delayDismissUserGuideMillis"}, 5000L)), Integer.valueOf(AbstractC9465b.m51727h(jsonObject, new String[]{"maxPrevPage"}, 10)), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"prevPageTimeoutMillis"}, 30000L)), (Long) c24860q2.m129215c(), (Integer) ((C24865v) c24860q2.m129216d()).m129232d(), (Integer) ((C24865v) c24860q2.m129216d()).m129233e(), (Long) ((C24865v) c24860q2.m129216d()).m129234f(), arrayList2, arrayList3, shareSuggestionConfig, likeSuggestionConfig2, Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delaySearchInChannelMillis"}, 0L, 2, null)), AbstractC9465b.m51729j(jsonObject, "dailyToastQuota"), AbstractC9465b.m51743x(jsonObject, "dailyToastMsg"), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"dataUsageWarningIntervalMillis"}, TimeUnit.MINUTES.toMillis(5L))), Integer.valueOf(AbstractC9465b.m51728i(jsonObject, new String[]{"adVersion"}, 0, 2, null)));
            }
            z11 = false;
            Boolean valueOf2 = Boolean.valueOf(z11);
            m51729j3 = AbstractC9465b.m51729j(m51732m, "timeline");
            if (m51729j3 != null) {
                z12 = true;
                shareSuggestionConfig = new ShareSuggestionConfig(m51729j, m51737r, valueOf2, Boolean.valueOf(z12));
                JsonObject m51732m322 = AbstractC9465b.m51732m(jsonObject, "likeSuggestion");
                LikeSuggestionConfig likeSuggestionConfig22 = new LikeSuggestionConfig(AbstractC9465b.m51729j(m51732m322, "repeatAfter"), AbstractC9465b.m51737r(m51732m322, "watchTimeMillis"));
                return new CoreConfig(Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delaySearchMillis"}, 0L, 2, null)), AbstractC9465b.m51743x(jsonObject, "verifyEKYC"), arrayList, Boolean.valueOf(AbstractC9465b.m51723d(jsonObject, new String[]{"isShowBookmarkBtn"}, false, 2, null)), Boolean.valueOf(AbstractC9465b.m51723d(jsonObject, new String[]{"isShowDislikeBtn"}, false, 2, null)), Integer.valueOf(AbstractC9465b.m51727h(jsonObject, new String[]{"numOfNoneSwipeSession"}, 5)), Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delayUserGuideMillis"}, 0L, 2, null)), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"delayDismissUserGuideMillis"}, 5000L)), Integer.valueOf(AbstractC9465b.m51727h(jsonObject, new String[]{"maxPrevPage"}, 10)), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"prevPageTimeoutMillis"}, 30000L)), (Long) c24860q2.m129215c(), (Integer) ((C24865v) c24860q2.m129216d()).m129232d(), (Integer) ((C24865v) c24860q2.m129216d()).m129233e(), (Long) ((C24865v) c24860q2.m129216d()).m129234f(), arrayList2, arrayList3, shareSuggestionConfig, likeSuggestionConfig22, Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delaySearchInChannelMillis"}, 0L, 2, null)), AbstractC9465b.m51729j(jsonObject, "dailyToastQuota"), AbstractC9465b.m51743x(jsonObject, "dailyToastMsg"), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"dataUsageWarningIntervalMillis"}, TimeUnit.MINUTES.toMillis(5L))), Integer.valueOf(AbstractC9465b.m51728i(jsonObject, new String[]{"adVersion"}, 0, 2, null)));
            }
            z12 = false;
            shareSuggestionConfig = new ShareSuggestionConfig(m51729j, m51737r, valueOf2, Boolean.valueOf(z12));
            JsonObject m51732m3222 = AbstractC9465b.m51732m(jsonObject, "likeSuggestion");
            LikeSuggestionConfig likeSuggestionConfig222 = new LikeSuggestionConfig(AbstractC9465b.m51729j(m51732m3222, "repeatAfter"), AbstractC9465b.m51737r(m51732m3222, "watchTimeMillis"));
            return new CoreConfig(Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delaySearchMillis"}, 0L, 2, null)), AbstractC9465b.m51743x(jsonObject, "verifyEKYC"), arrayList, Boolean.valueOf(AbstractC9465b.m51723d(jsonObject, new String[]{"isShowBookmarkBtn"}, false, 2, null)), Boolean.valueOf(AbstractC9465b.m51723d(jsonObject, new String[]{"isShowDislikeBtn"}, false, 2, null)), Integer.valueOf(AbstractC9465b.m51727h(jsonObject, new String[]{"numOfNoneSwipeSession"}, 5)), Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delayUserGuideMillis"}, 0L, 2, null)), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"delayDismissUserGuideMillis"}, 5000L)), Integer.valueOf(AbstractC9465b.m51727h(jsonObject, new String[]{"maxPrevPage"}, 10)), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"prevPageTimeoutMillis"}, 30000L)), (Long) c24860q2.m129215c(), (Integer) ((C24865v) c24860q2.m129216d()).m129232d(), (Integer) ((C24865v) c24860q2.m129216d()).m129233e(), (Long) ((C24865v) c24860q2.m129216d()).m129234f(), arrayList2, arrayList3, shareSuggestionConfig, likeSuggestionConfig222, Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"delaySearchInChannelMillis"}, 0L, 2, null)), AbstractC9465b.m51729j(jsonObject, "dailyToastQuota"), AbstractC9465b.m51743x(jsonObject, "dailyToastMsg"), Long.valueOf(AbstractC9465b.m51735p(jsonObject, new String[]{"dataUsageWarningIntervalMillis"}, TimeUnit.MINUTES.toMillis(5L))), Integer.valueOf(AbstractC9465b.m51728i(jsonObject, new String[]{"adVersion"}, 0, 2, null)));
        }

        public final KSerializer serializer() {
            return CoreConfig$$serializer.INSTANCE;
        }
    }

    static {
        NotiCategories$$serializer notiCategories$$serializer = NotiCategories$$serializer.INSTANCE;
        f50115x = new KSerializer[]{null, null, new C26788f(ContentFeedback$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, new C26788f(notiCategories$$serializer), new C26788f(notiCategories$$serializer), null, null, null, null, null, null, null};
    }

    public /* synthetic */ CoreConfig(int i11, Long l11, String str, List list, Boolean bool, Boolean bool2, Integer num, Long l12, Long l13, Integer num2, Long l14, Long l15, Integer num3, Integer num4, Long l16, List list2, List list3, ShareSuggestionConfig shareSuggestionConfig, LikeSuggestionConfig likeSuggestionConfig, Long l17, Integer num5, String str2, Long l18, Integer num6, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50116a = null;
        } else {
            this.f50116a = l11;
        }
        if ((i11 & 2) == 0) {
            this.f50117b = null;
        } else {
            this.f50117b = str;
        }
        if ((i11 & 4) == 0) {
            this.f50118c = null;
        } else {
            this.f50118c = list;
        }
        if ((i11 & 8) == 0) {
            this.f50119d = null;
        } else {
            this.f50119d = bool;
        }
        if ((i11 & 16) == 0) {
            this.f50120e = null;
        } else {
            this.f50120e = bool2;
        }
        if ((i11 & 32) == 0) {
            this.f50121f = null;
        } else {
            this.f50121f = num;
        }
        if ((i11 & 64) == 0) {
            this.f50122g = null;
        } else {
            this.f50122g = l12;
        }
        if ((i11 & 128) == 0) {
            this.f50123h = null;
        } else {
            this.f50123h = l13;
        }
        if ((i11 & 256) == 0) {
            this.f50124i = null;
        } else {
            this.f50124i = num2;
        }
        if ((i11 & 512) == 0) {
            this.f50125j = null;
        } else {
            this.f50125j = l14;
        }
        if ((i11 & 1024) == 0) {
            this.f50126k = null;
        } else {
            this.f50126k = l15;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f50127l = null;
        } else {
            this.f50127l = num3;
        }
        if ((i11 & 4096) == 0) {
            this.f50128m = null;
        } else {
            this.f50128m = num4;
        }
        if ((i11 & 8192) == 0) {
            this.f50129n = null;
        } else {
            this.f50129n = l16;
        }
        if ((i11 & 16384) == 0) {
            this.f50130o = null;
        } else {
            this.f50130o = list2;
        }
        if ((32768 & i11) == 0) {
            this.f50131p = null;
        } else {
            this.f50131p = list3;
        }
        if ((65536 & i11) == 0) {
            this.f50132q = null;
        } else {
            this.f50132q = shareSuggestionConfig;
        }
        if ((131072 & i11) == 0) {
            this.f50133r = null;
        } else {
            this.f50133r = likeSuggestionConfig;
        }
        if ((262144 & i11) == 0) {
            this.f50134s = null;
        } else {
            this.f50134s = l17;
        }
        if ((524288 & i11) == 0) {
            this.f50135t = null;
        } else {
            this.f50135t = num5;
        }
        if ((1048576 & i11) == 0) {
            this.f50136u = null;
        } else {
            this.f50136u = str2;
        }
        if ((2097152 & i11) == 0) {
            this.f50137v = null;
        } else {
            this.f50137v = l18;
        }
        if ((i11 & 4194304) == 0) {
            this.f50138w = null;
        } else {
            this.f50138w = num6;
        }
    }

    /* renamed from: y */
    public static final /* synthetic */ void m51438y(CoreConfig coreConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50115x;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || coreConfig.f50116a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, coreConfig.f50116a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || coreConfig.f50117b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, coreConfig.f50117b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || coreConfig.f50118c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, kSerializerArr[2], coreConfig.f50118c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || coreConfig.f50119d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26794h.f127000a, coreConfig.f50119d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || coreConfig.f50120e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26794h.f127000a, coreConfig.f50120e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || coreConfig.f50121f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26783d0.f126989a, coreConfig.f50121f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || coreConfig.f50122g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26810m0.f127024a, coreConfig.f50122g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || coreConfig.f50123h != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26810m0.f127024a, coreConfig.f50123h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || coreConfig.f50124i != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26783d0.f126989a, coreConfig.f50124i);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || coreConfig.f50125j != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, C26810m0.f127024a, coreConfig.f50125j);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || coreConfig.f50126k != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 10, C26810m0.f127024a, coreConfig.f50126k);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || coreConfig.f50127l != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 11, C26783d0.f126989a, coreConfig.f50127l);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || coreConfig.f50128m != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 12, C26783d0.f126989a, coreConfig.f50128m);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 13) || coreConfig.f50129n != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 13, C26810m0.f127024a, coreConfig.f50129n);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 14) || coreConfig.f50130o != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 14, kSerializerArr[14], coreConfig.f50130o);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 15) || coreConfig.f50131p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 15, kSerializerArr[15], coreConfig.f50131p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 16) || coreConfig.f50132q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 16, ShareSuggestionConfig$$serializer.INSTANCE, coreConfig.f50132q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 17) || coreConfig.f50133r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 17, LikeSuggestionConfig$$serializer.INSTANCE, coreConfig.f50133r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 18) || coreConfig.f50134s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 18, C26810m0.f127024a, coreConfig.f50134s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 19) || coreConfig.f50135t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 19, C26783d0.f126989a, coreConfig.f50135t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 20) || coreConfig.f50136u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 20, C26814n1.f127034a, coreConfig.f50136u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 21) || coreConfig.f50137v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 21, C26810m0.f127024a, coreConfig.f50137v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 22) || coreConfig.f50138w != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 22, C26783d0.f126989a, coreConfig.f50138w);
        }
    }

    /* renamed from: b */
    public final Integer m51439b() {
        return this.f50138w;
    }

    /* renamed from: c */
    public final List m51440c() {
        return this.f50131p;
    }

    /* renamed from: d */
    public final List m51441d() {
        return this.f50118c;
    }

    /* renamed from: e */
    public final String m51442e() {
        return this.f50136u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreConfig)) {
            return false;
        }
        CoreConfig coreConfig = (CoreConfig) obj;
        return AbstractC19074t.m100204b(this.f50116a, coreConfig.f50116a) && AbstractC19074t.m100204b(this.f50117b, coreConfig.f50117b) && AbstractC19074t.m100204b(this.f50118c, coreConfig.f50118c) && AbstractC19074t.m100204b(this.f50119d, coreConfig.f50119d) && AbstractC19074t.m100204b(this.f50120e, coreConfig.f50120e) && AbstractC19074t.m100204b(this.f50121f, coreConfig.f50121f) && AbstractC19074t.m100204b(this.f50122g, coreConfig.f50122g) && AbstractC19074t.m100204b(this.f50123h, coreConfig.f50123h) && AbstractC19074t.m100204b(this.f50124i, coreConfig.f50124i) && AbstractC19074t.m100204b(this.f50125j, coreConfig.f50125j) && AbstractC19074t.m100204b(this.f50126k, coreConfig.f50126k) && AbstractC19074t.m100204b(this.f50127l, coreConfig.f50127l) && AbstractC19074t.m100204b(this.f50128m, coreConfig.f50128m) && AbstractC19074t.m100204b(this.f50129n, coreConfig.f50129n) && AbstractC19074t.m100204b(this.f50130o, coreConfig.f50130o) && AbstractC19074t.m100204b(this.f50131p, coreConfig.f50131p) && AbstractC19074t.m100204b(this.f50132q, coreConfig.f50132q) && AbstractC19074t.m100204b(this.f50133r, coreConfig.f50133r) && AbstractC19074t.m100204b(this.f50134s, coreConfig.f50134s) && AbstractC19074t.m100204b(this.f50135t, coreConfig.f50135t) && AbstractC19074t.m100204b(this.f50136u, coreConfig.f50136u) && AbstractC19074t.m100204b(this.f50137v, coreConfig.f50137v) && AbstractC19074t.m100204b(this.f50138w, coreConfig.f50138w);
    }

    /* renamed from: f */
    public final Integer m51443f() {
        return this.f50135t;
    }

    /* renamed from: g */
    public final Long m51444g() {
        return this.f50137v;
    }

    /* renamed from: h */
    public final Long m51445h() {
        return this.f50123h;
    }

    public int hashCode() {
        Long l11 = this.f50116a;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.f50117b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f50118c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f50119d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f50120e;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f50121f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l12 = this.f50122g;
        int hashCode7 = (hashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f50123h;
        int hashCode8 = (hashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num2 = this.f50124i;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l14 = this.f50125j;
        int hashCode10 = (hashCode9 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f50126k;
        int hashCode11 = (hashCode10 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num3 = this.f50127l;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f50128m;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l16 = this.f50129n;
        int hashCode14 = (hashCode13 + (l16 == null ? 0 : l16.hashCode())) * 31;
        List list2 = this.f50130o;
        int hashCode15 = (hashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f50131p;
        int hashCode16 = (hashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ShareSuggestionConfig shareSuggestionConfig = this.f50132q;
        int hashCode17 = (hashCode16 + (shareSuggestionConfig == null ? 0 : shareSuggestionConfig.hashCode())) * 31;
        LikeSuggestionConfig likeSuggestionConfig = this.f50133r;
        int hashCode18 = (hashCode17 + (likeSuggestionConfig == null ? 0 : likeSuggestionConfig.hashCode())) * 31;
        Long l17 = this.f50134s;
        int hashCode19 = (hashCode18 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Integer num5 = this.f50135t;
        int hashCode20 = (hashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.f50136u;
        int hashCode21 = (hashCode20 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l18 = this.f50137v;
        int hashCode22 = (hashCode21 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Integer num6 = this.f50138w;
        return hashCode22 + (num6 != null ? num6.hashCode() : 0);
    }

    /* renamed from: i */
    public final Long m51446i() {
        return this.f50126k;
    }

    /* renamed from: j */
    public final Long m51447j() {
        return this.f50134s;
    }

    /* renamed from: k */
    public final Long m51448k() {
        return this.f50116a;
    }

    /* renamed from: l */
    public final Long m51449l() {
        return this.f50122g;
    }

    /* renamed from: m */
    public final Integer m51450m() {
        return this.f50127l;
    }

    /* renamed from: n */
    public final Integer m51451n() {
        return this.f50128m;
    }

    /* renamed from: o */
    public final Long m51452o() {
        return this.f50129n;
    }

    /* renamed from: p */
    public final LikeSuggestionConfig m51453p() {
        return this.f50133r;
    }

    /* renamed from: q */
    public final Integer m51454q() {
        return this.f50121f;
    }

    /* renamed from: r */
    public final Integer m51455r() {
        return this.f50124i;
    }

    /* renamed from: s */
    public final ShareSuggestionConfig m51456s() {
        return this.f50132q;
    }

    /* renamed from: t */
    public final Long m51457t() {
        return this.f50125j;
    }

    public String toString() {
        return "CoreConfig(delaySearchMillis=" + this.f50116a + ", verifyEKycUrl=" + this.f50117b + ", contentFeedbacks=" + this.f50118c + ", isShowBookmarkBtn=" + this.f50119d + ", isShowDislikeBtn=" + this.f50120e + ", maxNoneSwipeSession=" + this.f50121f + ", delayUserGuideMillis=" + this.f50122g + ", delayDismissUserGuideMillis=" + this.f50123h + ", maxPageFindJustWatchedVideo=" + this.f50124i + ", timeoutFindJustWatchedMillis=" + this.f50125j + ", delayHighlightFollowMillis=" + this.f50126k + ", followSuggestChannelCapacity=" + this.f50127l + ", followSuggestVideoPerChannel=" + this.f50128m + ", followSuggestWatchTimeMillis=" + this.f50129n + ", userNotiCategories=" + this.f50130o + ", channelNotiCategories=" + this.f50131p + ", shareSuggestion=" + this.f50132q + ", likeSuggestion=" + this.f50133r + ", delaySearchInChannelMillis=" + this.f50134s + ", dailyToastQuota=" + this.f50135t + ", dailyToastMsg=" + this.f50136u + ", dataUsageWarningInterval=" + this.f50137v + ", adVersion=" + this.f50138w + ")";
    }

    /* renamed from: u */
    public final List m51458u() {
        return this.f50130o;
    }

    /* renamed from: v */
    public final String m51459v() {
        return this.f50117b;
    }

    /* renamed from: w */
    public final Boolean m51460w() {
        return this.f50119d;
    }

    /* renamed from: x */
    public final Boolean m51461x() {
        return this.f50120e;
    }

    public CoreConfig(Long l11, String str, List list, Boolean bool, Boolean bool2, Integer num, Long l12, Long l13, Integer num2, Long l14, Long l15, Integer num3, Integer num4, Long l16, List list2, List list3, ShareSuggestionConfig shareSuggestionConfig, LikeSuggestionConfig likeSuggestionConfig, Long l17, Integer num5, String str2, Long l18, Integer num6) {
        this.f50116a = l11;
        this.f50117b = str;
        this.f50118c = list;
        this.f50119d = bool;
        this.f50120e = bool2;
        this.f50121f = num;
        this.f50122g = l12;
        this.f50123h = l13;
        this.f50124i = num2;
        this.f50125j = l14;
        this.f50126k = l15;
        this.f50127l = num3;
        this.f50128m = num4;
        this.f50129n = l16;
        this.f50130o = list2;
        this.f50131p = list3;
        this.f50132q = shareSuggestionConfig;
        this.f50133r = likeSuggestionConfig;
        this.f50134s = l17;
        this.f50135t = num5;
        this.f50136u = str2;
        this.f50137v = l18;
        this.f50138w = num6;
    }
}
