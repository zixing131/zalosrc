package i60;

import android.content.Intent;
import java.util.List;

/* renamed from: i60.t */
/* loaded from: classes5.dex */
public class C20354t {

    /* renamed from: a */
    public List f100361a;

    /* renamed from: b */
    public boolean f100362b;

    private C20354t(List list, boolean z11) {
        this.f100361a = list;
        this.f100362b = z11;
    }

    /* renamed from: a */
    public static C20354t m106099a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return new C20354t(intent.getParcelableArrayListExtra("extra_selected_profiles"), intent.getBooleanExtra("extra_share_phone_number", false));
    }
}
