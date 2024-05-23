package p418p8;

import org.json.JSONObject;
import p232i8.InterfaceC20415r;
import p418p8.C24668d;

/* renamed from: p8.b */
/* loaded from: classes.dex */
class C24666b implements InterfaceC24672h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C24668d m128200b(InterfaceC20415r interfaceC20415r) {
        return new C24668d(interfaceC20415r.mo106354a() + 3600000, new C24668d.b(8, 4), new C24668d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // p418p8.InterfaceC24672h
    /* renamed from: a */
    public C24668d mo128201a(InterfaceC20415r interfaceC20415r, JSONObject jSONObject) {
        return m128200b(interfaceC20415r);
    }
}
