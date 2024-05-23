package p418p8;

import org.json.JSONObject;
import p153f8.C18821f;
import p232i8.InterfaceC20415r;

/* renamed from: p8.g */
/* loaded from: classes.dex */
public class C24671g {

    /* renamed from: a */
    private final InterfaceC20415r f118612a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24671g(InterfaceC20415r interfaceC20415r) {
        this.f118612a = interfaceC20415r;
    }

    /* renamed from: a */
    private static InterfaceC24672h m128230a(int i11) {
        if (i11 != 3) {
            C18821f.m98795f().m98798d("Could not determine SettingsJsonTransform for settings version " + i11 + ". Using default settings values.");
            return new C24666b();
        }
        return new C24676l();
    }

    /* renamed from: b */
    public C24668d m128231b(JSONObject jSONObject) {
        return m128230a(jSONObject.getInt("settings_version")).mo128201a(this.f118612a, jSONObject);
    }
}
