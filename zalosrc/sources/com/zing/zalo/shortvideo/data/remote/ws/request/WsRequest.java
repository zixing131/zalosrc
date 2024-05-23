package com.zing.zalo.shortvideo.data.remote.ws.request;

import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import o10.EnumC23978a;
import p133ek.AbstractC18458a;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26814n1;
import tn0.C26848z;
import un0.AbstractC27323a;
import v00.C27417l;

@InterfaceC25392g
/* loaded from: classes5.dex */
public class WsRequest {
    public static final Companion Companion = new Companion(null);

    /* renamed from: i */
    private static final KSerializer[] f50237i;

    /* renamed from: a */
    private final EnumC23978a f50238a;

    /* renamed from: b */
    private final int f50239b;

    /* renamed from: c */
    private final boolean f50240c;

    /* renamed from: d */
    private final HashMap f50241d;

    /* renamed from: e */
    private final HashMap f50242e;

    /* renamed from: f */
    private final long f50243f;

    /* renamed from: g */
    private final boolean f50244g;

    /* renamed from: h */
    private final boolean f50245h;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return WsRequest$$serializer.INSTANCE;
        }
    }

    static {
        C26814n1 c26814n1 = C26814n1.f127034a;
        f50237i = new KSerializer[]{new C26848z(c26814n1, c26814n1), new C26848z(c26814n1, c26814n1)};
    }

    public /* synthetic */ WsRequest(int i11, HashMap hashMap, HashMap hashMap2, AbstractC26805k1 abstractC26805k1) {
        this.f50238a = EnumC23978a.f116051x;
        this.f50239b = 0;
        this.f50240c = false;
        this.f50241d = (i11 & 1) == 0 ? new HashMap() : hashMap;
        if ((i11 & 2) == 0) {
            this.f50242e = new HashMap();
        } else {
            this.f50242e = hashMap2;
        }
        this.f50243f = 10000L;
        this.f50244g = false;
        this.f50245h = false;
        HashMap hashMap3 = this.f50241d;
        String str = AbstractC18458a.f93019a;
        AbstractC19074t.m100207e(str, "defaultLanguage");
        hashMap3.put("language", str);
        HashMap hashMap4 = this.f50241d;
        C27417l c27417l = C27417l.f129055a;
        hashMap4.put("deviceId", c27417l.m140383g());
        this.f50241d.put("model", c27417l.m140385i());
        this.f50241d.put("versionCode", String.valueOf(CoreUtility.f89236l));
        HashMap hashMap5 = this.f50241d;
        String str2 = CoreUtility.f89234j;
        AbstractC19074t.m100207e(str2, "versionName");
        hashMap5.put("appVersion", str2);
        this.f50241d.put("featureVersion", "240401");
        this.f50241d.put("cTime", String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: i */
    public static final /* synthetic */ void m51614i(WsRequest wsRequest, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50237i;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(wsRequest.f50241d, new HashMap())) {
            interfaceC21886d.mo114029i(serialDescriptor, 0, kSerializerArr[0], wsRequest.f50241d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(wsRequest.f50242e, new HashMap())) {
            interfaceC21886d.mo114029i(serialDescriptor, 1, kSerializerArr[1], wsRequest.f50242e);
        }
    }

    /* renamed from: c */
    public final boolean m51615c() {
        return this.f50245h;
    }

    /* renamed from: d */
    public EnumC23978a m51616d() {
        return this.f50238a;
    }

    /* renamed from: e */
    public final boolean m51617e() {
        return this.f50244g;
    }

    /* renamed from: f */
    public final int m51618f() {
        return this.f50239b;
    }

    /* renamed from: g */
    public final long m51619g() {
        return this.f50243f;
    }

    /* renamed from: h */
    public final String m51620h() {
        AbstractC27323a m140384h = C27417l.f129055a.m140384h();
        m140384h.mo131586a();
        return m140384h.mo131597b(Companion.serializer(), this);
    }

    public WsRequest(EnumC23978a enumC23978a, int i11, boolean z11, HashMap hashMap, HashMap hashMap2, long j11, boolean z12, boolean z13) {
        AbstractC19074t.m100208f(enumC23978a, "cmd");
        AbstractC19074t.m100208f(hashMap, "header");
        AbstractC19074t.m100208f(hashMap2, "data");
        this.f50238a = enumC23978a;
        this.f50239b = i11;
        this.f50240c = z11;
        this.f50241d = hashMap;
        this.f50242e = hashMap2;
        this.f50243f = j11;
        this.f50244g = z12;
        this.f50245h = z13;
        String str = AbstractC18458a.f93019a;
        AbstractC19074t.m100207e(str, "defaultLanguage");
        hashMap.put("language", str);
        C27417l c27417l = C27417l.f129055a;
        hashMap.put("deviceId", c27417l.m140383g());
        hashMap.put("model", c27417l.m140385i());
        hashMap.put("versionCode", String.valueOf(CoreUtility.f89236l));
        String str2 = CoreUtility.f89234j;
        AbstractC19074t.m100207e(str2, "versionName");
        hashMap.put("appVersion", str2);
        hashMap.put("featureVersion", "240401");
        hashMap.put("cTime", String.valueOf(System.currentTimeMillis()));
    }

    public /* synthetic */ WsRequest(EnumC23978a enumC23978a, int i11, boolean z11, HashMap hashMap, HashMap hashMap2, long j11, boolean z12, boolean z13, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? EnumC23978a.f116051x : enumC23978a, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? new HashMap() : hashMap, (i12 & 16) != 0 ? new HashMap() : hashMap2, (i12 & 32) != 0 ? 10000L : j11, (i12 & 64) != 0 ? false : z12, (i12 & 128) == 0 ? z13 : false);
    }
}
