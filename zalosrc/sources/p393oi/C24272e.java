package p393oi;

import com.zing.zalo.p062db.C7959d;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Map;
import p423pi.C24764f;

/* renamed from: oi.e */
/* loaded from: classes3.dex */
public final class C24272e implements InterfaceC24271d {

    /* renamed from: a */
    private final C7959d f117223a;

    public C24272e(C7959d c7959d) {
        AbstractC19074t.m100208f(c7959d, "dataBase");
        this.f117223a = c7959d;
    }

    @Override // p393oi.InterfaceC24271d
    /* renamed from: a */
    public void mo126735a(String str, int i11, String str2) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(str2, "date");
        this.f117223a.m41720K2(str, i11, str2);
    }

    @Override // p393oi.InterfaceC24271d
    /* renamed from: b */
    public void mo126736b(int i11, String str, HashMap hashMap) {
        AbstractC19074t.m100208f(str, "date");
        AbstractC19074t.m100208f(hashMap, "threadInfoLog");
        this.f117223a.m41790h3(i11, str, hashMap);
    }

    @Override // p393oi.InterfaceC24271d
    /* renamed from: c */
    public void mo126737c(int i11, String str, String str2, C24764f c24764f) {
        AbstractC19074t.m100208f(str, "date");
        AbstractC19074t.m100208f(str2, "threadId");
        AbstractC19074t.m100208f(c24764f, "threadInfoLog");
        this.f117223a.m41765Y1(i11, str, str2, c24764f);
    }

    @Override // p393oi.InterfaceC24271d
    /* renamed from: d */
    public void mo126738d(int i11, String str, Map map) {
        AbstractC19074t.m100208f(str, "date");
        AbstractC19074t.m100208f(map, "threadInfoLogs");
        this.f117223a.m41739Q1(i11, str, map);
    }

    @Override // p393oi.InterfaceC24271d
    /* renamed from: e */
    public Map mo126739e(String str, int i11, String str2) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(str2, "date");
        return this.f117223a.m41718K0(str, i11, str2);
    }

    @Override // p393oi.InterfaceC24271d
    /* renamed from: f */
    public void mo126740f(int i11, String str, Map map) {
        AbstractC19074t.m100208f(str, "date");
        AbstractC19074t.m100208f(map, "threadInfoLogs");
        this.f117223a.m41749S2(i11, str, map);
    }
}
