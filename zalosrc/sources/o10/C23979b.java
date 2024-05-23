package o10;

import com.zing.zalo.shortvideo.data.remote.ws.request.WsRequest;
import fn0.AbstractC19074t;
import java.util.HashMap;
import qn0.AbstractC25394i;
import v00.C27417l;

/* renamed from: o10.b */
/* loaded from: classes5.dex */
public final class C23979b {

    /* renamed from: a */
    public static final C23979b f116055a = new C23979b();

    private C23979b() {
    }

    /* renamed from: a */
    public final WsRequest m125478a(String str) {
        HashMap hashMap;
        AbstractC19074t.m100208f(str, "liveId");
        WsRequest wsRequest = new WsRequest(EnumC23978a.f116050w, 0, false, null, null, 5000L, false, false, 222, null);
        hashMap = wsRequest.f50242e;
        hashMap.put("liveId", str);
        return wsRequest;
    }

    /* renamed from: b */
    public final WsRequest m125479b(String str, int i11, long j11, int i12) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        HashMap hashMap6;
        HashMap hashMap7;
        AbstractC19074t.m100208f(str, "liveId");
        WsRequest wsRequest = new WsRequest(EnumC23978a.f116048u, 0, false, null, null, 0L, false, false, 254, null);
        hashMap = wsRequest.f50242e;
        hashMap.put("liveId", str);
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf instanceof String) {
            hashMap7 = wsRequest.f50242e;
            hashMap7.put("count", valueOf);
        } else {
            C27417l c27417l = C27417l.f129055a;
            String mo131597b = c27417l.m140384h().mo131597b(AbstractC25394i.m131587a(c27417l.m140384h().mo131586a(), Integer.class), valueOf);
            hashMap2 = wsRequest.f50242e;
            hashMap2.put("count", mo131597b);
        }
        Long valueOf2 = Long.valueOf(j11);
        if (valueOf2 instanceof String) {
            hashMap6 = wsRequest.f50242e;
            hashMap6.put("lastId", valueOf2);
        } else {
            C27417l c27417l2 = C27417l.f129055a;
            String mo131597b2 = c27417l2.m140384h().mo131597b(AbstractC25394i.m131587a(c27417l2.m140384h().mo131586a(), Long.class), valueOf2);
            hashMap3 = wsRequest.f50242e;
            hashMap3.put("lastId", mo131597b2);
        }
        Integer valueOf3 = Integer.valueOf(i12);
        if (valueOf3 instanceof String) {
            hashMap5 = wsRequest.f50242e;
            hashMap5.put("lastIndex", valueOf3);
        } else {
            C27417l c27417l3 = C27417l.f129055a;
            String mo131597b3 = c27417l3.m140384h().mo131597b(AbstractC25394i.m131587a(c27417l3.m140384h().mo131586a(), Integer.class), valueOf3);
            hashMap4 = wsRequest.f50242e;
            hashMap4.put("lastIndex", mo131597b3);
        }
        return wsRequest;
    }

    /* renamed from: c */
    public final WsRequest m125480c(String str) {
        HashMap hashMap;
        AbstractC19074t.m100208f(str, "liveId");
        WsRequest wsRequest = new WsRequest(EnumC23978a.f116044q, 0, false, null, null, 6000L, true, true, 30, null);
        hashMap = wsRequest.f50242e;
        hashMap.put("liveId", str);
        return wsRequest;
    }

    /* renamed from: d */
    public final WsRequest m125481d(String str, long j11) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        AbstractC19074t.m100208f(str, "liveId");
        WsRequest wsRequest = new WsRequest(EnumC23978a.f116045r, 0, false, null, null, 2000L, false, false, 222, null);
        hashMap = wsRequest.f50242e;
        hashMap.put("liveId", str);
        Long valueOf = Long.valueOf(j11);
        if (valueOf instanceof String) {
            hashMap3 = wsRequest.f50242e;
            hashMap3.put("duration", valueOf);
        } else {
            C27417l c27417l = C27417l.f129055a;
            String mo131597b = c27417l.m140384h().mo131597b(AbstractC25394i.m131587a(c27417l.m140384h().mo131586a(), Long.class), valueOf);
            hashMap2 = wsRequest.f50242e;
            hashMap2.put("duration", mo131597b);
        }
        return wsRequest;
    }

    /* renamed from: e */
    public final WsRequest m125482e(String str, String str2, int i11, long j11) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        HashMap hashMap6;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "content");
        WsRequest wsRequest = new WsRequest(EnumC23978a.f116049v, 0, false, null, null, 0L, false, false, 254, null);
        hashMap = wsRequest.f50242e;
        hashMap.put("liveId", str);
        hashMap2 = wsRequest.f50242e;
        hashMap2.put("content", str2);
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf instanceof String) {
            hashMap6 = wsRequest.f50242e;
            hashMap6.put("ownerType", valueOf);
        } else {
            C27417l c27417l = C27417l.f129055a;
            String mo131597b = c27417l.m140384h().mo131597b(AbstractC25394i.m131587a(c27417l.m140384h().mo131586a(), Integer.class), valueOf);
            hashMap3 = wsRequest.f50242e;
            hashMap3.put("ownerType", mo131597b);
        }
        Long valueOf2 = Long.valueOf(j11);
        if (valueOf2 instanceof String) {
            hashMap5 = wsRequest.f50242e;
            hashMap5.put("ownerId", valueOf2);
        } else {
            C27417l c27417l2 = C27417l.f129055a;
            String mo131597b2 = c27417l2.m140384h().mo131597b(AbstractC25394i.m131587a(c27417l2.m140384h().mo131586a(), Long.class), valueOf2);
            hashMap4 = wsRequest.f50242e;
            hashMap4.put("ownerId", mo131597b2);
        }
        return wsRequest;
    }

    /* renamed from: f */
    public final WsRequest m125483f(String str, int i11, int i12) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        AbstractC19074t.m100208f(str, "liveId");
        WsRequest wsRequest = new WsRequest(EnumC23978a.f116047t, 0, false, null, null, 0L, false, false, 254, null);
        hashMap = wsRequest.f50242e;
        hashMap.put("liveId", str);
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf instanceof String) {
            hashMap5 = wsRequest.f50242e;
            hashMap5.put("reactType", valueOf);
        } else {
            C27417l c27417l = C27417l.f129055a;
            String mo131597b = c27417l.m140384h().mo131597b(AbstractC25394i.m131587a(c27417l.m140384h().mo131586a(), Integer.class), valueOf);
            hashMap2 = wsRequest.f50242e;
            hashMap2.put("reactType", mo131597b);
        }
        Integer valueOf2 = Integer.valueOf(i12);
        if (valueOf2 instanceof String) {
            hashMap4 = wsRequest.f50242e;
            hashMap4.put("count", valueOf2);
        } else {
            C27417l c27417l2 = C27417l.f129055a;
            String mo131597b2 = c27417l2.m140384h().mo131597b(AbstractC25394i.m131587a(c27417l2.m140384h().mo131586a(), Integer.class), valueOf2);
            hashMap3 = wsRequest.f50242e;
            hashMap3.put("count", mo131597b2);
        }
        return wsRequest;
    }

    /* renamed from: g */
    public final WsRequest m125484g(String str) {
        HashMap hashMap;
        AbstractC19074t.m100208f(str, "liveId");
        WsRequest wsRequest = new WsRequest(EnumC23978a.f116046s, 0, false, null, null, 0L, false, false, 254, null);
        hashMap = wsRequest.f50242e;
        hashMap.put("liveId", str);
        return wsRequest;
    }
}
